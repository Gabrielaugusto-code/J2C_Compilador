/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class yf
extends yb {
    private abu c;

    public yf(afs afs2) {
        super(afs2);
    }

    public yf(afs afs2, rm rm2, int n2) {
        this(afs2, rm2, new abu(abv.bn, 1, n2));
    }

    public yf(afs afs2, rm rm2, abu abu2) {
        super(afs2, rm2);
        this.c = abu2;
    }

    public yf(afs afs2, double d2, double d3, double d4, int n2) {
        this(afs2, d2, d3, d4, new abu(abv.bn, 1, n2));
    }

    public yf(afs afs2, double d2, double d3, double d4, abu abu2) {
        super(afs2, d2, d3, d4);
        this.c = abu2;
    }

    @Override
    protected float i() {
        return 0.05f;
    }

    @Override
    protected float e() {
        return 0.5f;
    }

    @Override
    protected float f() {
        return -20.0f;
    }

    public void a(int n2) {
        if (this.c == null) {
            this.c = new abu(abv.bn, 1, 0);
        }
        this.c.b(n2);
    }

    public int k() {
        if (this.c == null) {
            this.c = new abu(abv.bn, 1, 0);
        }
        return this.c.k();
    }

    @Override
    protected void a(ayn ayn2) {
        if (!this.o.E) {
            ayk ayk2;
            List list;
            List list2 = abv.bn.g(this.c);
            if (list2 != null && !list2.isEmpty() && (list = this.o.a(rm.class, ayk2 = this.C.b(4.0, 2.0, 4.0))) != null && !list.isEmpty()) {
                for (rm rm2 : list) {
                    double d2 = this.f(rm2);
                    if (!(d2 < 16.0)) continue;
                    double d3 = 1.0 - Math.sqrt(d2) / 4.0;
                    if (rm2 == ayn2.g) {
                        d3 = 1.0;
                    }
                    for (qn qn2 : list2) {
                        int n2 = qn2.a();
                        if (qm.a[n2].b()) {
                            qm.a[n2].a(this.j(), rm2, qn2.c(), d3);
                            continue;
                        }
                        int n3 = (int)(d3 * (double)qn2.b() + 0.5);
                        if (n3 <= 20) continue;
                        rm2.c(new qn(n2, n3, qn2.c()));
                    }
                }
            }
            this.o.c(2002, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), this.k());
            this.A();
        }
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        if (dg2.b("Potion", 10)) {
            this.c = abu.a(dg2.m("Potion"));
        } else {
            this.a(dg2.f("potionValue"));
        }
        if (this.c == null) {
            this.A();
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        if (this.c != null) {
            dg2.a("Potion", this.c.b(new dg()));
        }
    }
}

