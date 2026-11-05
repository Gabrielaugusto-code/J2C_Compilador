/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

class bbn
extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ bbm c;

    bbn(bbm bbm2, String string, String string2, int n2) {
        this.c = bbm2;
        this.a = string2;
        this.b = n2;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            if (bbm.a(this.c)) {
                return;
            }
            inetAddress = InetAddress.getByName(this.a);
            bbm.a(this.c, ef.a(inetAddress, this.b));
            bbm.b(this.c).a(new bju(bbm.b(this.c), this.c.k, bbm.c(this.c)));
            bbm.b(this.c).a(new jg(4, this.a, this.b, ek.d), new GenericFutureListener[0]);
            bbm.b(this.c).a(new jn(this.c.k.M().e()), new GenericFutureListener[0]);
        }
        catch (UnknownHostException unknownHostException) {
            if (bbm.a(this.c)) {
                return;
            }
            bbm.e().error("Couldn't connect to server", (Throwable)unknownHostException);
            this.c.k.a(new bbu(bbm.c(this.c), "connect.failed", new fi("disconnect.genericReason", "Unknown host")));
        }
        catch (Exception exception) {
            if (bbm.a(this.c)) {
                return;
            }
            bbm.e().error("Couldn't connect to server", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = inetAddress.toString() + ":" + this.b;
                string = string.replaceAll(string2, "");
            }
            this.c.k.a(new bbu(bbm.c(this.c), "connect.failed", new fi("disconnect.genericReason", string)));
        }
    }
}

