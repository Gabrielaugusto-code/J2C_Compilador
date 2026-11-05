/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.AttributeKey
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ef
extends SimpleChannelInboundHandler {
    private static final Logger g = LogManager.getLogger();
    public static final Marker a = MarkerManager.getMarker((String)"NETWORK");
    public static final Marker b = MarkerManager.getMarker((String)"NETWORK_PACKETS", (Marker)a);
    public static final AttributeKey c = new AttributeKey("protocol");
    public static final AttributeKey d = new AttributeKey("receivable_packets");
    public static final AttributeKey e = new AttributeKey("sendable_packets");
    public static final NioEventLoopGroup f = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
    private final boolean h;
    private final Queue i = Queues.newConcurrentLinkedQueue();
    private final Queue j = Queues.newConcurrentLinkedQueue();
    private Channel k;
    private SocketAddress l;
    private es m;
    private ek n;
    private fa o;

    public ef(boolean bl2) {
        this.h = bl2;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        super.channelActive(channelHandlerContext);
        this.k = channelHandlerContext.channel();
        this.l = this.k.remoteAddress();
        this.a(ek.a);
    }

    public void a(ek ek2) {
        this.n = (ek)((Object)this.k.attr(c).getAndSet((Object)ek2));
        this.k.attr(d).set((Object)ek2.a(this.h));
        this.k.attr(e).set((Object)ek2.b(this.h));
        this.k.config().setAutoRead(true);
        g.debug("Enabled auto read");
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        this.a(new fi("disconnect.endOfStream", new Object[0]));
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        this.a(new fi("disconnect.genericReason", "Internal Exception: " + throwable));
    }

    protected void a(ChannelHandlerContext channelHandlerContext, fk fk2) {
        if (this.k.isOpen()) {
            if (fk2.a()) {
                fk2.a(this.m);
            } else {
                this.i.add(fk2);
            }
        }
    }

    public void a(es es2) {
        Validate.notNull((Object)es2, (String)"packetListener", (Object[])new Object[0]);
        g.debug("Set listener of {} to {}", new Object[]{this, es2});
        this.m = es2;
    }

    public void a(fk fk2, GenericFutureListener ... genericFutureListenerArray) {
        if (this.k != null && this.k.isOpen()) {
            this.h();
            this.b(fk2, genericFutureListenerArray);
        } else {
            this.j.add(new ej(fk2, genericFutureListenerArray));
        }
    }

    private void b(fk fk2, GenericFutureListener[] genericFutureListenerArray) {
        ek ek2 = ek.a(fk2);
        ek ek3 = (ek)((Object)this.k.attr(c).get());
        if (ek3 != ek2) {
            g.debug("Disabled auto read");
            this.k.config().setAutoRead(false);
        }
        if (this.k.eventLoop().inEventLoop()) {
            if (ek2 != ek3) {
                this.a(ek2);
            }
            this.k.writeAndFlush((Object)fk2).addListeners(genericFutureListenerArray).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            this.k.eventLoop().execute((Runnable)new eg(this, ek2, ek3, fk2, genericFutureListenerArray));
        }
    }

    private void h() {
        if (this.k == null || !this.k.isOpen()) {
            return;
        }
        while (!this.j.isEmpty()) {
            ej ej2 = (ej)this.j.poll();
            this.b(ej.a(ej2), ej.b(ej2));
        }
    }

    public void a() {
        this.h();
        ek ek2 = (ek)((Object)this.k.attr(c).get());
        if (this.n != ek2) {
            if (this.n != null) {
                this.m.a(this.n, ek2);
            }
            this.n = ek2;
        }
        if (this.m != null) {
            for (int i2 = 1000; !this.i.isEmpty() && i2 >= 0; --i2) {
                fk fk2 = (fk)this.i.poll();
                fk2.a(this.m);
            }
            this.m.a();
        }
        this.k.flush();
    }

    public SocketAddress b() {
        return this.l;
    }

    public void a(fa fa2) {
        if (this.k.isOpen()) {
            this.k.close();
            this.o = fa2;
        }
    }

    public boolean c() {
        return this.k instanceof LocalChannel || this.k instanceof LocalServerChannel;
    }

    public static ef a(InetAddress inetAddress, int n2) {
        ef ef2 = new ef(true);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)f)).handler((ChannelHandler)new eh(ef2))).channel(NioSocketChannel.class)).connect(inetAddress, n2).syncUninterruptibly();
        return ef2;
    }

    public static ef a(SocketAddress socketAddress) {
        ef ef2 = new ef(true);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)f)).handler((ChannelHandler)new ei(ef2))).channel(LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
        return ef2;
    }

    public void a(SecretKey secretKey) {
        this.k.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new ed(ok.a(2, secretKey)));
        this.k.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new ee(ok.a(1, secretKey)));
    }

    public boolean d() {
        return this.k != null && this.k.isOpen();
    }

    public es e() {
        return this.m;
    }

    public fa f() {
        return this.o;
    }

    public void g() {
        this.k.config().setAutoRead(false);
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (fk)object);
    }

    static /* synthetic */ Channel a(ef ef2) {
        return ef2.k;
    }
}

