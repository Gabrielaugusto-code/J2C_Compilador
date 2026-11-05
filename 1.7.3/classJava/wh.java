/*
 * Decompiled with CFR 0.152.
 */
public class wh
extends wc {
    private int c;
    public double a;
    public double b;

    public wh(afs afs2) {
        super(afs2);
    }

    public wh(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    public int m() {
        return 2;
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, new Byte(0));
    }

    @Override
    public void h() {
        super.h();
        if (this.c > 0) {
            --this.c;
        }
        if (this.c <= 0) {
            this.b = 0.0;
            this.a = 0.0;
        }
        this.f(this.c > 0);
        if (this.e() && this.Z.nextInt(4) == 0) {
            this.o.a("largesmoke", this.s, this.t + 0.8, this.u, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        if (!qf2.c()) {
            this.a(new abu(aie.al, 1), 0.0f);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4, double d2, double d3, ahz ahz2, int n5) {
        super.a(n2, n3, n4, d2, d3, ahz2, n5);
        double d4 = this.a * this.a + this.b * this.b;
        if (d4 > 1.0E-4 && this.v * this.v + this.x * this.x > 0.001) {
            d4 = oy.a(d4);
            this.a /= d4;
            this.b /= d4;
            if (this.a * this.v + this.b * this.x < 0.0) {
                this.a = 0.0;
                this.b = 0.0;
            } else {
                this.a = this.v;
                this.b = this.x;
            }
        }
    }

    @Override
    protected void i() {
        double d2 = this.a * this.a + this.b * this.b;
        if (d2 > 1.0E-4) {
            d2 = oy.a(d2);
            this.a /= d2;
            this.b /= d2;
            double d3 = 0.05;
            this.v *= (double)0.8f;
            this.w *= 0.0;
            this.x *= (double)0.8f;
            this.v += this.a * d3;
            this.x += this.b * d3;
        } else {
            this.v *= (double)0.98f;
            this.w *= 0.0;
            this.x *= (double)0.98f;
        }
        super.i();
    }

    @Override
    public boolean c(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.h) {
            if (!xq2.bE.d && --abu2.b == 0) {
                xq2.bm.a(xq2.bm.c, null);
            }
            this.c += 3600;
        }
        this.a = this.s - xq2.s;
        this.b = this.u - xq2.u;
        return true;
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        dg2.a("PushX", this.a);
        dg2.a("PushZ", this.b);
        dg2.a("Fuel", (short)this.c);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        this.a = dg2.i("PushX");
        this.b = dg2.i("PushZ");
        this.c = dg2.e("Fuel");
    }

    protected boolean e() {
        return (this.af.a(16) & 1) != 0;
    }

    protected void f(boolean bl2) {
        if (bl2) {
            this.af.b(16, (byte)(this.af.a(16) | 1));
        } else {
            this.af.b(16, (byte)(this.af.a(16) & 0xFFFFFFFE));
        }
    }

    @Override
    public ahz o() {
        return aie.am;
    }

    @Override
    public int q() {
        return 2;
    }
}

