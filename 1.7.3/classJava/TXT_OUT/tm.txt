/*
 * Decompiled with CFR 0.152.
 */
public class tm
extends sz {
    afs a;
    rn b;
    rm c;
    int d;

    public tm(rn rn2) {
        this.b = rn2;
        this.a = rn2.o;
        this.a(3);
    }

    @Override
    public boolean a() {
        rm rm2 = this.b.o();
        if (rm2 == null) {
            return false;
        }
        this.c = rm2;
        return true;
    }

    @Override
    public boolean b() {
        if (!this.c.Y()) {
            return false;
        }
        if (this.b.f(this.c) > 225.0) {
            return false;
        }
        return !this.b.m().g() || this.a();
    }

    @Override
    public void d() {
        this.c = null;
        this.b.m().h();
    }

    @Override
    public void e() {
        this.b.j().a(this.c, 30.0f, 30.0f);
        double d2 = this.b.M * 2.0f * (this.b.M * 2.0f);
        double d3 = this.b.e(this.c.s, this.c.C.b, this.c.u);
        double d4 = 0.8;
        if (d3 > d2 && d3 < 16.0) {
            d4 = 1.33;
        } else if (d3 < 225.0) {
            d4 = 0.6;
        }
        this.b.m().a(this.c, d4);
        this.d = Math.max(this.d - 1, 0);
        if (d3 > d2) {
            return;
        }
        if (this.d > 0) {
            return;
        }
        this.d = 20;
        this.b.n(this.c);
    }
}

