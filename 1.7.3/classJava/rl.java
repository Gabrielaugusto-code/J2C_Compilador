/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class rl
extends rj {
    public rl(afs afs2) {
        super(afs2);
    }

    public rl(afs afs2, int n2, int n3, int n4) {
        super(afs2, n2, n3, n4, 0);
        this.b((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5);
    }

    @Override
    protected void c() {
        super.c();
    }

    @Override
    public void a(int n2) {
    }

    @Override
    public int f() {
        return 9;
    }

    @Override
    public int i() {
        return 9;
    }

    @Override
    public boolean a(double d2) {
        return d2 < 1024.0;
    }

    @Override
    public void b(qr qr2) {
    }

    @Override
    public boolean d(dg dg2) {
        return false;
    }

    @Override
    public void b(dg dg2) {
    }

    @Override
    public void a(dg dg2) {
    }

    @Override
    public boolean c(xq xq2) {
        List list;
        double d2;
        abu abu2 = xq2.bd();
        boolean bl2 = false;
        if (abu2 != null && abu2.b() == abv.ca && !this.o.E) {
            d2 = 7.0;
            list = this.o.a(rn.class, ayk.a().a(this.s - d2, this.t - d2, this.u - d2, this.s + d2, this.t + d2, this.u + d2));
            if (list != null) {
                for (rn rn2 : list) {
                    if (!rn2.bN() || rn2.bO() != xq2) continue;
                    rn2.b((qr)this, true);
                    bl2 = true;
                }
            }
        }
        if (!this.o.E && !bl2) {
            this.A();
            if (xq2.bE.d) {
                d2 = 7.0;
                list = this.o.a(rn.class, ayk.a().a(this.s - d2, this.t - d2, this.u - d2, this.s + d2, this.t + d2, this.u + d2));
                if (list != null) {
                    for (rn rn2 : list) {
                        if (!rn2.bN() || rn2.bO() != this) continue;
                        rn2.a(true, false);
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean e() {
        return this.o.a(this.b, this.c, this.d).b() == 11;
    }

    public static rl a(afs afs2, int n2, int n3, int n4) {
        rl rl2 = new rl(afs2, n2, n3, n4);
        rl2.n = true;
        afs2.d(rl2);
        return rl2;
    }

    public static rl b(afs afs2, int n2, int n3, int n4) {
        List list = afs2.a(rl.class, ayk.a().a((double)n2 - 1.0, (double)n3 - 1.0, (double)n4 - 1.0, (double)n2 + 1.0, (double)n3 + 1.0, (double)n4 + 1.0));
        if (list != null) {
            for (rl rl2 : list) {
                if (rl2.b != n2 || rl2.c != n3 || rl2.d != n4) continue;
                return rl2;
            }
        }
        return null;
    }
}

