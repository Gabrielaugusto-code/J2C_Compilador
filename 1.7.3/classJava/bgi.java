/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bgi {
    private static final Logger a = LogManager.getLogger();
    private final List b = Collections.synchronizedList(new ArrayList());

    public void a(bvo bvo2) {
        if (bvo2.g == null) {
            return;
        }
        bkh bkh2 = bkh.a(bvo2.g);
        ef ef2 = ef.a(InetAddress.getByName(bkh2.a()), bkh2.b());
        this.b.add(ef2);
        ef2.a(new bgj(this, bvo2, ef2));
        try {
            ef2.a(new jg(4, bkh2.a(), bkh2.b(), ek.c), new GenericFutureListener[0]);
            ef2.a(new ka(), new GenericFutureListener[0]);
        }
        catch (Throwable throwable) {
            a.error((Object)throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        List list = this.b;
        synchronized (list) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ef ef2 = (ef)((Object)iterator.next());
                if (!ef2.d()) continue;
                iterator.remove();
                ef2.a(new fh("Cancelled"));
            }
        }
    }

    static /* synthetic */ Logger c() {
        return a;
    }
}

