/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbm
extends bcl {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final Logger f = LogManager.getLogger();
    private ef g;
    private boolean h;
    private final bcl i;

    public bbm(bcl bcl2, azi azi2, bki bki2) {
        this.k = azi2;
        this.i = bcl2;
        bkh bkh2 = bkh.a(bki2.b);
        azi2.a((bka)null);
        azi2.a(bki2);
        this.a(bkh2.a(), bkh2.b());
    }

    public bbm(bcl bcl2, azi azi2, String string, int n2) {
        this.k = azi2;
        this.i = bcl2;
        azi2.a((bka)null);
        this.a(string, n2);
    }

    private void a(String string, int n2) {
        f.info("Connecting to " + string + ", " + n2);
        new bbn(this, "Server Connector #" + a.incrementAndGet(), string, n2).start();
    }

    @Override
    public void c() {
        if (this.g != null) {
            if (this.g.d()) {
                this.g.a();
            } else if (this.g.f() != null) {
                this.g.e().a(this.g.f());
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void r_() {
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 120 + 12, bsc.a("gui.cancel", new Object[0])));
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 0) {
            this.h = true;
            if (this.g != null) {
                this.g.a(new fh("Aborted"));
            }
            this.k.a(this.i);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        if (this.g == null) {
            this.a(this.q, bsc.a("connect.connecting", new Object[0]), this.l / 2, this.m / 2 - 50, 0xFFFFFF);
        } else {
            this.a(this.q, bsc.a("connect.authorizing", new Object[0]), this.l / 2, this.m / 2 - 50, 0xFFFFFF);
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ boolean a(bbm bbm2) {
        return bbm2.h;
    }

    static /* synthetic */ ef a(bbm bbm2, ef ef2) {
        bbm2.g = ef2;
        return bbm2.g;
    }

    static /* synthetic */ ef b(bbm bbm2) {
        return bbm2.g;
    }

    static /* synthetic */ bcl c(bbm bbm2) {
        return bbm2.i;
    }

    static /* synthetic */ Logger e() {
        return f;
    }
}

