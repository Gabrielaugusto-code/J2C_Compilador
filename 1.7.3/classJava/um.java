/*
 * Decompiled with CFR 0.152.
 */
public class um {
    private rn a;
    private afs b;
    private aww c;
    private double d;
    private rz e;
    private boolean f;
    private int g;
    private int h;
    private ayp i = ayp.a(0.0, 0.0, 0.0);
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;

    public um(rn rn2, afs afs2) {
        this.a = rn2;
        this.b = afs2;
        this.e = rn2.a(xa.b);
    }

    public void a(boolean bl2) {
        this.l = bl2;
    }

    public boolean a() {
        return this.l;
    }

    public void b(boolean bl2) {
        this.k = bl2;
    }

    public void c(boolean bl2) {
        this.j = bl2;
    }

    public boolean c() {
        return this.k;
    }

    public void d(boolean bl2) {
        this.f = bl2;
    }

    public void a(double d2) {
        this.d = d2;
    }

    public void e(boolean bl2) {
        this.m = bl2;
    }

    public float d() {
        return (float)this.e.e();
    }

    public aww a(double d2, double d3, double d4) {
        if (!this.l()) {
            return null;
        }
        return this.b.a(this.a, oy.c(d2), (int)d3, oy.c(d4), this.d(), this.j, this.k, this.l, this.m);
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        aww aww2 = this.a(oy.c(d2), (int)d3, oy.c(d4));
        return this.a(aww2, d5);
    }

    public aww a(qr qr2) {
        if (!this.l()) {
            return null;
        }
        return this.b.a((qr)this.a, qr2, this.d(), this.j, this.k, this.l, this.m);
    }

    public boolean a(qr qr2, double d2) {
        aww aww2 = this.a(qr2);
        if (aww2 != null) {
            return this.a(aww2, d2);
        }
        return false;
    }

    public boolean a(aww aww2, double d2) {
        if (aww2 == null) {
            this.c = null;
            return false;
        }
        if (!aww2.a(this.c)) {
            this.c = aww2;
        }
        if (this.f) {
            this.n();
        }
        if (this.c.d() == 0) {
            return false;
        }
        this.d = d2;
        ayp ayp2 = this.j();
        this.h = this.g;
        this.i.c = ayp2.c;
        this.i.d = ayp2.d;
        this.i.e = ayp2.e;
        return true;
    }

    public aww e() {
        return this.c;
    }

    public void f() {
        ++this.g;
        if (this.g()) {
            return;
        }
        if (this.l()) {
            this.i();
        }
        if (this.g()) {
            return;
        }
        ayp ayp2 = this.c.a(this.a);
        if (ayp2 == null) {
            return;
        }
        this.a.k().a(ayp2.c, ayp2.d, ayp2.e, this.d);
    }

    private void i() {
        int n2;
        ayp ayp2 = this.j();
        int n3 = this.c.d();
        for (int i2 = this.c.e(); i2 < this.c.d(); ++i2) {
            if (this.c.a((int)i2).b == (int)ayp2.d) continue;
            n3 = i2;
            break;
        }
        float f2 = this.a.M * this.a.M;
        for (n2 = this.c.e(); n2 < n3; ++n2) {
            if (!(ayp2.e(this.c.a(this.a, n2)) < (double)f2)) continue;
            this.c.c(n2 + 1);
        }
        n2 = oy.f(this.a.M);
        int n4 = (int)this.a.N + 1;
        int n5 = n2;
        for (int i3 = n3 - 1; i3 >= this.c.e(); --i3) {
            if (!this.a(ayp2, this.c.a(this.a, i3), n2, n4, n5)) continue;
            this.c.c(i3);
            break;
        }
        if (this.g - this.h > 100) {
            if (ayp2.e(this.i) < 2.25) {
                this.h();
            }
            this.h = this.g;
            this.i.c = ayp2.c;
            this.i.d = ayp2.d;
            this.i.e = ayp2.e;
        }
    }

    public boolean g() {
        return this.c == null || this.c.b();
    }

    public void h() {
        this.c = null;
    }

    private ayp j() {
        return this.b.V().a(this.a.s, this.k(), this.a.u);
    }

    private int k() {
        if (!this.a.L() || !this.m) {
            return (int)(this.a.C.b + 0.5);
        }
        int n2 = (int)this.a.C.b;
        ahz ahz2 = this.b.a(oy.c(this.a.s), n2, oy.c(this.a.u));
        int n3 = 0;
        while (ahz2 == aie.i || ahz2 == aie.j) {
            ahz2 = this.b.a(oy.c(this.a.s), ++n2, oy.c(this.a.u));
            if (++n3 <= 16) continue;
            return (int)this.a.C.b;
        }
        return n2;
    }

    private boolean l() {
        return this.a.D || this.m && this.m() || this.a.al() && this.a instanceof xh && this.a.m instanceof ux;
    }

    private boolean m() {
        return this.a.L() || this.a.O();
    }

    private void n() {
        if (this.b.i(oy.c(this.a.s), (int)(this.a.C.b + 0.5), oy.c(this.a.u))) {
            return;
        }
        for (int i2 = 0; i2 < this.c.d(); ++i2) {
            awv awv2 = this.c.a(i2);
            if (!this.b.i(awv2.a, awv2.b, awv2.c)) continue;
            this.c.b(i2 - 1);
            return;
        }
    }

    private boolean a(ayp ayp2, ayp ayp3, int n2, int n3, int n4) {
        int n5 = oy.c(ayp2.c);
        int n6 = oy.c(ayp2.e);
        double d2 = ayp3.c - ayp2.c;
        double d3 = ayp3.e - ayp2.e;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 1.0E-8) {
            return false;
        }
        double d5 = 1.0 / Math.sqrt(d4);
        if (!this.a(n5, (int)ayp2.d, n6, n2 += 2, n3, n4 += 2, ayp2, d2 *= d5, d3 *= d5)) {
            return false;
        }
        n2 -= 2;
        n4 -= 2;
        double d6 = 1.0 / Math.abs(d2);
        double d7 = 1.0 / Math.abs(d3);
        double d8 = (double)(n5 * 1) - ayp2.c;
        double d9 = (double)(n6 * 1) - ayp2.e;
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        if (d3 >= 0.0) {
            d9 += 1.0;
        }
        d8 /= d2;
        d9 /= d3;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = d3 < 0.0 ? -1 : 1;
        int n9 = oy.c(ayp3.c);
        int n10 = oy.c(ayp3.e);
        int n11 = n9 - n5;
        int n12 = n10 - n6;
        while (n11 * n7 > 0 || n12 * n8 > 0) {
            if (d8 < d9) {
                d8 += d6;
                n11 = n9 - (n5 += n7);
            } else {
                d9 += d7;
                n12 = n10 - (n6 += n8);
            }
            if (this.a(n5, (int)ayp2.d, n6, n2, n3, n4, ayp2, d2, d3)) continue;
            return false;
        }
        return true;
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, ayp ayp2, double d2, double d3) {
        int n8 = n2 - n5 / 2;
        int n9 = n4 - n7 / 2;
        if (!this.b(n8, n3, n9, n5, n6, n7, ayp2, d2, d3)) {
            return false;
        }
        for (int i2 = n8; i2 < n8 + n5; ++i2) {
            for (int i3 = n9; i3 < n9 + n7; ++i3) {
                double d4 = (double)i2 + 0.5 - ayp2.c;
                double d5 = (double)i3 + 0.5 - ayp2.e;
                if (d4 * d2 + d5 * d3 < 0.0) continue;
                ahz ahz2 = this.b.a(i2, n3 - 1, i3);
                avk avk2 = ahz2.o();
                if (avk2 == avk.a) {
                    return false;
                }
                if (avk2 == avk.h && !this.a.L()) {
                    return false;
                }
                if (avk2 != avk.i) continue;
                return false;
            }
        }
        return true;
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7, ayp ayp2, double d2, double d3) {
        for (int i2 = n2; i2 < n2 + n5; ++i2) {
            for (int i3 = n3; i3 < n3 + n6; ++i3) {
                for (int i4 = n4; i4 < n4 + n7; ++i4) {
                    ahz ahz2;
                    double d4 = (double)i2 + 0.5 - ayp2.c;
                    double d5 = (double)i4 + 0.5 - ayp2.e;
                    if (d4 * d2 + d5 * d3 < 0.0 || (ahz2 = this.b.a(i2, i3, i4)).b((agc)this.b, i2, i3, i4)) continue;
                    return false;
                }
            }
        }
        return true;
    }
}

