/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

class bfp
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ bfo c;

    bfp(bfo bfo2, String string, int n2) {
        this.c = bfo2;
        this.a = string;
        this.b = n2;
    }

    @Override
    public void run() {
        try {
            if (this.c.c()) {
                return;
            }
            bfo.a(this.c, ef.a(InetAddress.getByName(this.a), this.b));
            if (this.c.c()) {
                return;
            }
            bfo.a(this.c).a(new bju(bfo.a(this.c), this.c.b(), bfo.b(this.c)));
            if (this.c.c()) {
                return;
            }
            bfo.a(this.c).a(new jg(4, this.a, this.b, ek.d), new GenericFutureListener[0]);
            if (this.c.c()) {
                return;
            }
            bfo.a(this.c).a(new jn(this.c.b().M().e()), new GenericFutureListener[0]);
            this.c.b(bsc.a("mco.connect.authorizing", new Object[0]));
        }
        catch (UnknownHostException unknownHostException) {
            if (this.c.c()) {
                return;
            }
            bfo.e().error("Couldn't connect to world", (Throwable)unknownHostException);
            this.c.b().a(new bfa(bfo.b(this.c), "connect.failed", new fi("disconnect.genericReason", "Unknown host '" + this.a + "'")));
        }
        catch (Exception exception) {
            if (this.c.c()) {
                return;
            }
            bfo.e().error("Couldn't connect to world", (Throwable)exception);
            this.c.b().a(new bfa(bfo.b(this.c), "connect.failed", new fi("disconnect.genericReason", exception.toString())));
        }
    }
}

