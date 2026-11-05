/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.local.LocalAddress
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mv {
    private static final Logger b = LogManager.getLogger();
    private static final NioEventLoopGroup c = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty IO #%d").setDaemon(true).build());
    private final MinecraftServer d;
    public volatile boolean a;
    private final List e = Collections.synchronizedList(new ArrayList());
    private final List f = Collections.synchronizedList(new ArrayList());

    public mv(MinecraftServer minecraftServer) {
        this.d = minecraftServer;
        this.a = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(InetAddress inetAddress, int n2) {
        List list = this.e;
        synchronized (list) {
            this.e.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(NioServerSocketChannel.class)).childHandler((ChannelHandler)new mw(this)).group((EventLoopGroup)c).localAddress(inetAddress, n2)).bind().syncUninterruptibly());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress a() {
        ChannelFuture channelFuture;
        List list = this.e;
        synchronized (list) {
            channelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler((ChannelHandler)new mx(this)).group((EventLoopGroup)c).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.e.add(channelFuture);
        }
        return channelFuture.channel().localAddress();
    }

    public void b() {
        this.a = false;
        for (ChannelFuture channelFuture : this.e) {
            channelFuture.channel().close().syncUninterruptibly();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        List list = this.f;
        synchronized (list) {
            Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ef ef2 = (ef)((Object)iterator.next());
                if (!ef2.d()) {
                    iterator.remove();
                    if (ef2.f() != null) {
                        ef2.e().a(ef2.f());
                        continue;
                    }
                    if (ef2.e() == null) continue;
                    ef2.e().a(new fh("Disconnected"));
                    continue;
                }
                try {
                    ef2.a();
                }
                catch (Exception exception) {
                    Object object;
                    if (ef2.c()) {
                        object = b.a(exception, "Ticking memory connection");
                        k k2 = ((b)object).a("Ticking connection");
                        k2.a("Connection", new my(this, ef2));
                        throw new s((b)object);
                    }
                    b.warn("Failed to handle packet for " + ef2.b(), (Throwable)exception);
                    object = new fh("Internal server error");
                    ef2.a(new gj((fa)object), new mz(this, ef2, (fh)object));
                    ef2.g();
                }
            }
        }
    }

    public MinecraftServer d() {
        return this.d;
    }

    static /* synthetic */ List a(mv mv2) {
        return mv2.f;
    }

    static /* synthetic */ MinecraftServer b(mv mv2) {
        return mv2.d;
    }
}

