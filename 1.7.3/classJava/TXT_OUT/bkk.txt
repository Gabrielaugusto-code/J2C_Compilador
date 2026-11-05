/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Splitter;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bkk {
    private static final Splitter a = Splitter.on((char)'\u0000').limit(6);
    private static final Logger b = LogManager.getLogger();
    private final List c = Collections.synchronizedList(new ArrayList());

    public void a(bki bki2) {
        bkh bkh2 = bkh.a(bki2.b);
        ef ef2 = ef.a(InetAddress.getByName(bkh2.a()), bkh2.b());
        this.c.add(ef2);
        bki2.d = "Pinging...";
        bki2.e = -1L;
        bki2.i = null;
        ef2.a(new bkl(this, bki2, ef2));
        try {
            ef2.a(new jg(4, bkh2.a(), bkh2.b(), ek.c), new GenericFutureListener[0]);
            ef2.a(new ka(), new GenericFutureListener[0]);
        }
        catch (Throwable throwable) {
            b.error((Object)throwable);
        }
    }

    private void b(bki bki2) {
        bkh bkh2 = bkh.a(bki2.b);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)ef.f)).handler((ChannelHandler)new bkm(this, bkh2, bki2))).channel(NioSocketChannel.class)).connect(bkh2.a(), bkh2.b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        List list = this.c;
        synchronized (list) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ef ef2 = (ef)((Object)iterator.next());
                if (ef2.d()) {
                    ef2.a();
                    continue;
                }
                iterator.remove();
                if (ef2.f() == null) continue;
                ef2.e().a(ef2.f());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        List list = this.c;
        synchronized (list) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ef ef2 = (ef)((Object)iterator.next());
                if (!ef2.d()) continue;
                iterator.remove();
                ef2.a(new fh("Cancelled"));
            }
        }
    }

    static /* synthetic */ Logger c() {
        return b;
    }

    static /* synthetic */ void a(bkk bkk2, bki bki2) {
        bkk2.b(bki2);
    }

    static /* synthetic */ Splitter d() {
        return a;
    }
}

