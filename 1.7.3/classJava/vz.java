/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class vz
extends qr {
    private boolean a = true;
    private double b = 0.07;
    private int c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double at;
    private double au;

    public vz(afs afs2) {
        super(afs2);
        this.k = true;
        this.a(1.5f, 0.6f);
        this.L = this.N / 2.0f;
    }

    @Override
    protected boolean g_() {
        return false;
    }

    @Override
    protected void c() {
        this.af.a(17, new Integer(0));
        this.af.a(18, new Integer(1));
        this.af.a(19, new Float(0.0f));
    }

    @Override
    public ayk h(qr qr2) {
        return qr2.C;
    }

    @Override
    public ayk I() {
        return this.C;
    }

    @Override
    public boolean R() {
        return true;
    }

    public vz(afs afs2, double d2, double d3, double d4) {
        this(afs2);
        this.b(d2, d3 + (double)this.L, d4);
        this.v = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.p = d2;
        this.q = d3;
        this.r = d4;
    }

    @Override
    public double ad() {
        return (double)this.N * 0.0 - (double)0.3f;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        boolean bl2;
        if (this.av()) {
            return false;
        }
        if (this.o.E || this.K) {
            return true;
        }
        this.c(-this.i());
        this.a(10);
        this.a(this.e() + f2 * 10.0f);
        this.P();
        boolean bl3 = bl2 = qf2.j() instanceof xq && ((xq)qf2.j()).bE.d;
        if (bl2 || this.e() > 40.0f) {
            if (this.l != null) {
                this.l.a(this);
            }
            if (!bl2) {
                this.a(abv.az, 1, 0.0f);
            }
            this.A();
        }
        return true;
    }

    @Override
    public void ai() {
        this.c(-this.i());
        this.a(10);
        this.a(this.e() * 11.0f);
    }

    @Override
    public boolean Q() {
        return !this.K;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2) {
        if (this.a) {
            this.c = n2 + 5;
        } else {
            double d5 = d2 - this.s;
            double d6 = d3 - this.t;
            double d7 = d4 - this.u;
            double d8 = d5 * d5 + d6 * d6 + d7 * d7;
            if (d8 > 1.0) {
                this.c = 3;
            } else {
                return;
            }
        }
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = f2;
        this.h = f3;
        this.v = this.i;
        this.w = this.at;
        this.x = this.au;
    }

    @Override
    public void i(double d2, double d3, double d4) {
        this.i = this.v = d2;
        this.at = this.w = d3;
        this.au = this.x = d4;
    }

    @Override
    public void h() {
        double d2;
        int n2;
        double d3;
        int n3;
        double d4;
        double d5;
        super.h();
        if (this.f() > 0) {
            this.a(this.f() - 1);
        }
        if (this.e() > 0.0f) {
            this.a(this.e() - 1.0f);
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        int n4 = 5;
        double d6 = 0.0;
        for (int i2 = 0; i2 < n4; ++i2) {
            double d7 = this.C.b + (this.C.e - this.C.b) * (double)(i2 + 0) / (double)n4 - 0.125;
            double d8 = this.C.b + (this.C.e - this.C.b) * (double)(i2 + 1) / (double)n4 - 0.125;
            ayk ayk2 = ayk.a().a(this.C.a, d7, this.C.c, this.C.d, d8, this.C.f);
            if (!this.o.b(ayk2, avk.h)) continue;
            d6 += 1.0 / (double)n4;
        }
        double d9 = Math.sqrt(this.v * this.v + this.x * this.x);
        if (d9 > 0.26249999999999996) {
            d5 = Math.cos((double)this.y * Math.PI / 180.0);
            d4 = Math.sin((double)this.y * Math.PI / 180.0);
            n3 = 0;
            while ((double)n3 < 1.0 + d9 * 60.0) {
                double d10;
                double d11;
                double d12 = this.Z.nextFloat() * 2.0f - 1.0f;
                double d13 = (double)(this.Z.nextInt(2) * 2 - 1) * 0.7;
                if (this.Z.nextBoolean()) {
                    d11 = this.s - d5 * d12 * 0.8 + d4 * d13;
                    d10 = this.u - d4 * d12 * 0.8 - d5 * d13;
                    this.o.a("splash", d11, this.t - 0.125, d10, this.v, this.w, this.x);
                } else {
                    d11 = this.s + d5 + d4 * d12 * 0.7;
                    d10 = this.u + d4 - d5 * d12 * 0.7;
                    this.o.a("splash", d11, this.t - 0.125, d10, this.v, this.w, this.x);
                }
                ++n3;
            }
        }
        if (this.o.E && this.a) {
            if (this.c > 0) {
                d5 = this.s + (this.d - this.s) / (double)this.c;
                d4 = this.t + (this.e - this.t) / (double)this.c;
                double d14 = this.u + (this.f - this.u) / (double)this.c;
                double d15 = oy.g(this.g - (double)this.y);
                this.y = (float)((double)this.y + d15 / (double)this.c);
                this.z = (float)((double)this.z + (this.h - (double)this.z) / (double)this.c);
                --this.c;
                this.b(d5, d4, d14);
                this.b(this.y, this.z);
            } else {
                d5 = this.s + this.v;
                d4 = this.t + this.w;
                double d16 = this.u + this.x;
                this.b(d5, d4, d16);
                if (this.D) {
                    this.v *= 0.5;
                    this.w *= 0.5;
                    this.x *= 0.5;
                }
                this.v *= (double)0.99f;
                this.w *= (double)0.95f;
                this.x *= (double)0.99f;
            }
            return;
        }
        if (d6 < 1.0) {
            d5 = d6 * 2.0 - 1.0;
            this.w += (double)0.04f * d5;
        } else {
            if (this.w < 0.0) {
                this.w /= 2.0;
            }
            this.w += (double)0.007f;
        }
        if (this.l != null && this.l instanceof rm) {
            rm rm2 = (rm)this.l;
            float f2 = this.l.y + -rm2.bd * 90.0f;
            this.v += -Math.sin(f2 * (float)Math.PI / 180.0f) * this.b * (double)rm2.be * (double)0.05f;
            this.x += Math.cos(f2 * (float)Math.PI / 180.0f) * this.b * (double)rm2.be * (double)0.05f;
        }
        if ((d3 = Math.sqrt(this.v * this.v + this.x * this.x)) > 0.35) {
            d4 = 0.35 / d3;
            this.v *= d4;
            this.x *= d4;
            d3 = 0.35;
        }
        if (d3 > d9 && this.b < 0.35) {
            this.b += (0.35 - this.b) / 35.0;
            if (this.b > 0.35) {
                this.b = 0.35;
            }
        } else {
            this.b -= (this.b - 0.07) / 35.0;
            if (this.b < 0.07) {
                this.b = 0.07;
            }
        }
        for (n2 = 0; n2 < 4; ++n2) {
            int n5 = oy.c(this.s + ((double)(n2 % 2) - 0.5) * 0.8);
            n3 = oy.c(this.u + ((double)(n2 / 2) - 0.5) * 0.8);
            for (int i3 = 0; i3 < 2; ++i3) {
                int n6 = oy.c(this.t) + i3;
                ahz ahz2 = this.o.a(n5, n6, n3);
                if (ahz2 == aie.aC) {
                    this.o.f(n5, n6, n3);
                    this.E = false;
                    continue;
                }
                if (ahz2 != aie.bi) continue;
                this.o.a(n5, n6, n3, true);
                this.E = false;
            }
        }
        if (this.D) {
            this.v *= 0.5;
            this.w *= 0.5;
            this.x *= 0.5;
        }
        this.d(this.v, this.w, this.x);
        if (this.E && d9 > 0.2) {
            if (!this.o.E && !this.K) {
                this.A();
                for (n2 = 0; n2 < 3; ++n2) {
                    this.a(abs.a(aie.f), 1, 0.0f);
                }
                for (n2 = 0; n2 < 2; ++n2) {
                    this.a(abv.y, 1, 0.0f);
                }
            }
        } else {
            this.v *= (double)0.99f;
            this.w *= (double)0.95f;
            this.x *= (double)0.99f;
        }
        this.z = 0.0f;
        double d17 = this.y;
        double d18 = this.p - this.s;
        double d19 = this.r - this.u;
        if (d18 * d18 + d19 * d19 > 0.001) {
            d17 = (float)(Math.atan2(d19, d18) * 180.0 / Math.PI);
        }
        if ((d2 = oy.g(d17 - (double)this.y)) > 20.0) {
            d2 = 20.0;
        }
        if (d2 < -20.0) {
            d2 = -20.0;
        }
        this.y = (float)((double)this.y + d2);
        this.b(this.y, this.z);
        if (this.o.E) {
            return;
        }
        List list = this.o.b((qr)this, this.C.b(0.2f, 0.0, 0.2f));
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < list.size(); ++i4) {
                qr qr2 = (qr)list.get(i4);
                if (qr2 == this.l || !qr2.R() || !(qr2 instanceof vz)) continue;
                qr2.g(this);
            }
        }
        if (this.l != null && this.l.K) {
            this.l = null;
        }
    }

    @Override
    public void ab() {
        if (this.l == null) {
            return;
        }
        double d2 = Math.cos((double)this.y * Math.PI / 180.0) * 0.4;
        double d3 = Math.sin((double)this.y * Math.PI / 180.0) * 0.4;
        this.l.b(this.s + d2, this.t + this.ad() + this.l.ac(), this.u + d3);
    }

    @Override
    protected void b(dg dg2) {
    }

    @Override
    protected void a(dg dg2) {
    }

    @Override
    public float X() {
        return 0.0f;
    }

    @Override
    public boolean c(xq xq2) {
        if (this.l != null && this.l instanceof xq && this.l != xq2) {
            return true;
        }
        if (!this.o.E) {
            xq2.a(this);
        }
        return true;
    }

    @Override
    protected void a(double d2, boolean bl2) {
        int n2 = oy.c(this.s);
        int n3 = oy.c(this.t);
        int n4 = oy.c(this.u);
        if (bl2) {
            if (this.R > 3.0f) {
                this.b(this.R);
                if (!this.o.E && !this.K) {
                    int n5;
                    this.A();
                    for (n5 = 0; n5 < 3; ++n5) {
                        this.a(abs.a(aie.f), 1, 0.0f);
                    }
                    for (n5 = 0; n5 < 2; ++n5) {
                        this.a(abv.y, 1, 0.0f);
                    }
                }
                this.R = 0.0f;
            }
        } else if (this.o.a(n2, n3 - 1, n4).o() != avk.h && d2 < 0.0) {
            this.R = (float)((double)this.R - d2);
        }
    }

    public void a(float f2) {
        this.af.b(19, Float.valueOf(f2));
    }

    public float e() {
        return this.af.d(19);
    }

    public void a(int n2) {
        this.af.b(17, n2);
    }

    public int f() {
        return this.af.c(17);
    }

    public void c(int n2) {
        this.af.b(18, n2);
    }

    public int i() {
        return this.af.c(18);
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }
}

