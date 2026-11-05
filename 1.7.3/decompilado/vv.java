/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public class vv
extends qr {
    private static final List d = Arrays.asList(new vw(new abu(abv.T), 10).a(0.9f), new vw(new abu(abv.aA), 10), new vw(new abu(abv.aS), 10), new vw(new abu(abv.bn), 10), new vw(new abu(abv.F), 5), new vw(new abu(abv.aM), 2).a(0.9f), new vw(new abu(abv.z), 10), new vw(new abu(abv.y), 5), new vw(new abu(abv.aR, 10, 0), 1), new vw(new abu(aie.bC), 10), new vw(new abu(abv.bh), 10));
    private static final List e = Arrays.asList(new vw(new abu(aie.bi), 1), new vw(new abu(abv.cb), 1), new vw(new abu(abv.av), 1), new vw(new abu(abv.f), 1).a(0.25f).a(), new vw(new abu(abv.aM), 1).a(0.25f).a(), new vw(new abu(abv.aG), 1).a());
    private static final List f = Arrays.asList(new vw(new abu(abv.aP, 1, abl.a.a()), 60), new vw(new abu(abv.aP, 1, abl.b.a()), 25), new vw(new abu(abv.aP, 1, abl.c.a()), 2), new vw(new abu(abv.aP, 1, abl.d.a()), 13));
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private ahz at;
    private boolean au;
    public int a;
    public xq b;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    private float aA;
    public qr c;
    private int aB;
    private double aC;
    private double aD;
    private double aE;
    private double aF;
    private double aG;
    private double aH;
    private double aI;
    private double aJ;

    public vv(afs afs2) {
        super(afs2);
        this.a(0.25f, 0.25f);
        this.ak = true;
    }

    public vv(afs afs2, double d2, double d3, double d4, xq xq2) {
        this(afs2);
        this.b(d2, d3, d4);
        this.ak = true;
        this.b = xq2;
        xq2.bK = this;
    }

    public vv(afs afs2, xq xq2) {
        super(afs2);
        this.ak = true;
        this.b = xq2;
        this.b.bK = this;
        this.a(0.25f, 0.25f);
        this.b(xq2.s, xq2.t + 1.62 - (double)xq2.L, xq2.u, xq2.y, xq2.z);
        this.s -= (double)(oy.b(this.y / 180.0f * (float)Math.PI) * 0.16f);
        this.t -= (double)0.1f;
        this.u -= (double)(oy.a(this.y / 180.0f * (float)Math.PI) * 0.16f);
        this.b(this.s, this.t, this.u);
        this.L = 0.0f;
        float f2 = 0.4f;
        this.v = -oy.a(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI) * f2;
        this.x = oy.b(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI) * f2;
        this.w = -oy.a(this.z / 180.0f * (float)Math.PI) * f2;
        this.c(this.v, this.w, this.x, 1.5f, 1.0f);
    }

    @Override
    protected void c() {
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.C.b() * 4.0;
        return d2 < (d3 *= 64.0) * d3;
    }

    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = oy.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.Z.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.Z.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.Z.nextGaussian() * (double)0.0075f * (double)f3;
        this.v = d2 *= (double)f2;
        this.w = d3 *= (double)f2;
        this.x = d4 *= (double)f2;
        float f5 = oy.a(d2 * d2 + d4 * d4);
        this.A = this.y = (float)(Math.atan2(d2, d4) * 180.0 / 3.1415927410125732);
        this.B = this.z = (float)(Math.atan2(d3, f5) * 180.0 / 3.1415927410125732);
        this.av = 0;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2) {
        this.aC = d2;
        this.aD = d3;
        this.aE = d4;
        this.aF = f2;
        this.aG = f3;
        this.aB = n2;
        this.v = this.aH;
        this.w = this.aI;
        this.x = this.aJ;
    }

    @Override
    public void i(double d2, double d3, double d4) {
        this.aH = this.v = d2;
        this.aI = this.w = d3;
        this.aJ = this.x = d4;
    }

    @Override
    public void h() {
        Object object;
        super.h();
        if (this.aB > 0) {
            double d2 = this.s + (this.aC - this.s) / (double)this.aB;
            double d3 = this.t + (this.aD - this.t) / (double)this.aB;
            double d4 = this.u + (this.aE - this.u) / (double)this.aB;
            double d5 = oy.g(this.aF - (double)this.y);
            this.y = (float)((double)this.y + d5 / (double)this.aB);
            this.z = (float)((double)this.z + (this.aG - (double)this.z) / (double)this.aB);
            --this.aB;
            this.b(d2, d3, d4);
            this.b(this.y, this.z);
            return;
        }
        if (!this.o.E) {
            object = this.b.bE();
            if (this.b.K || !this.b.Y() || object == null || ((abu)object).b() != abv.aM || this.f(this.b) > 1024.0) {
                this.A();
                this.b.bK = null;
                return;
            }
            if (this.c != null) {
                if (this.c.K) {
                    this.c = null;
                } else {
                    this.s = this.c.s;
                    this.t = this.c.C.b + (double)this.c.N * 0.8;
                    this.u = this.c.u;
                    return;
                }
            }
        }
        if (this.a > 0) {
            --this.a;
        }
        if (this.au) {
            if (this.o.a(this.g, this.h, this.i) == this.at) {
                ++this.av;
                if (this.av == 1200) {
                    this.A();
                }
                return;
            }
            this.au = false;
            this.v *= (double)(this.Z.nextFloat() * 0.2f);
            this.w *= (double)(this.Z.nextFloat() * 0.2f);
            this.x *= (double)(this.Z.nextFloat() * 0.2f);
            this.av = 0;
            this.aw = 0;
        } else {
            ++this.aw;
        }
        object = this.o.V().a(this.s, this.t, this.u);
        ayp ayp2 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        ayn ayn2 = this.o.a((ayp)object, ayp2);
        object = this.o.V().a(this.s, this.t, this.u);
        ayp2 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        if (ayn2 != null) {
            ayp2 = this.o.V().a(ayn2.f.c, ayn2.f.d, ayn2.f.e);
        }
        qr qr2 = null;
        List list = this.o.b((qr)this, this.C.a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
        double d6 = 0.0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d7;
            float f2;
            ayk ayk2;
            ayn ayn3;
            qr qr3 = (qr)list.get(i2);
            if (!qr3.Q() || qr3 == this.b && this.aw < 5 || (ayn3 = (ayk2 = qr3.C.b(f2 = 0.3f, f2, f2)).a((ayp)object, ayp2)) == null || !((d7 = ((ayp)object).d(ayn3.f)) < d6) && d6 != 0.0) continue;
            qr2 = qr3;
            d6 = d7;
        }
        if (qr2 != null) {
            ayn2 = new ayn(qr2);
        }
        if (ayn2 != null) {
            if (ayn2.g != null) {
                if (ayn2.g.a(qf.a(this, (qr)this.b), 0.0f)) {
                    this.c = ayn2.g;
                }
            } else {
                this.au = true;
            }
        }
        if (this.au) {
            return;
        }
        this.d(this.v, this.w, this.x);
        float f3 = oy.a(this.v * this.v + this.x * this.x);
        this.y = (float)(Math.atan2(this.v, this.x) * 180.0 / 3.1415927410125732);
        this.z = (float)(Math.atan2(this.w, f3) * 180.0 / 3.1415927410125732);
        while (this.z - this.B < -180.0f) {
            this.B -= 360.0f;
        }
        while (this.z - this.B >= 180.0f) {
            this.B += 360.0f;
        }
        while (this.y - this.A < -180.0f) {
            this.A -= 360.0f;
        }
        while (this.y - this.A >= 180.0f) {
            this.A += 360.0f;
        }
        this.z = this.B + (this.z - this.B) * 0.2f;
        this.y = this.A + (this.y - this.A) * 0.2f;
        float f4 = 0.92f;
        if (this.D || this.E) {
            f4 = 0.5f;
        }
        int n2 = 5;
        double d8 = 0.0;
        for (int i3 = 0; i3 < n2; ++i3) {
            double d9 = this.C.b + (this.C.e - this.C.b) * (double)(i3 + 0) / (double)n2 - 0.125 + 0.125;
            double d10 = this.C.b + (this.C.e - this.C.b) * (double)(i3 + 1) / (double)n2 - 0.125 + 0.125;
            ayk ayk3 = ayk.a().a(this.C.a, d9, this.C.c, this.C.d, d10, this.C.f);
            if (!this.o.b(ayk3, avk.h)) continue;
            d8 += 1.0 / (double)n2;
        }
        if (!this.o.E && d8 > 0.0) {
            mm mm2 = (mm)this.o;
            int n3 = 1;
            if (this.Z.nextFloat() < 0.25f && this.o.y(oy.c(this.s), oy.c(this.t) + 1, oy.c(this.u))) {
                n3 = 2;
            }
            if (this.Z.nextFloat() < 0.5f && !this.o.i(oy.c(this.s), oy.c(this.t) + 1, oy.c(this.u))) {
                --n3;
            }
            if (this.ax > 0) {
                --this.ax;
                if (this.ax <= 0) {
                    this.ay = 0;
                    this.az = 0;
                }
            } else if (this.az > 0) {
                this.az -= n3;
                if (this.az <= 0) {
                    this.w -= (double)0.2f;
                    this.a("random.splash", 0.25f, 1.0f + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4f);
                    float f5 = oy.c(this.C.b);
                    mm2.a("bubble", this.s, f5 + 1.0f, this.u, (int)(1.0f + this.M * 20.0f), this.M, 0.0, this.M, 0.2f);
                    mm2.a("wake", this.s, f5 + 1.0f, this.u, (int)(1.0f + this.M * 20.0f), this.M, 0.0, this.M, 0.2f);
                    this.ax = oy.a(this.Z, 10, 30);
                } else {
                    this.aA = (float)((double)this.aA + this.Z.nextGaussian() * 4.0);
                    float f6 = this.aA * ((float)Math.PI / 180);
                    float f7 = oy.a(f6);
                    float f8 = oy.b(f6);
                    double d11 = this.s + (double)(f7 * (float)this.az * 0.1f);
                    double d12 = (float)oy.c(this.C.b) + 1.0f;
                    double d13 = this.u + (double)(f8 * (float)this.az * 0.1f);
                    if (this.Z.nextFloat() < 0.15f) {
                        mm2.a("bubble", d11, d12 - (double)0.1f, d13, 1, f7, 0.1, f8, 0.0);
                    }
                    float f9 = f7 * 0.04f;
                    float f10 = f8 * 0.04f;
                    mm2.a("wake", d11, d12, d13, 0, f10, 0.01, -f9, 1.0);
                    mm2.a("wake", d11, d12, d13, 0, -f10, 0.01, f9, 1.0);
                }
            } else if (this.ay > 0) {
                this.ay -= n3;
                float f11 = 0.15f;
                if (this.ay < 20) {
                    f11 = (float)((double)f11 + (double)(20 - this.ay) * 0.05);
                } else if (this.ay < 40) {
                    f11 = (float)((double)f11 + (double)(40 - this.ay) * 0.02);
                } else if (this.ay < 60) {
                    f11 = (float)((double)f11 + (double)(60 - this.ay) * 0.01);
                }
                if (this.Z.nextFloat() < f11) {
                    float f12 = oy.a(this.Z, 0.0f, 360.0f) * ((float)Math.PI / 180);
                    float f13 = oy.a(this.Z, 25.0f, 60.0f);
                    double d14 = this.s + (double)(oy.a(f12) * f13 * 0.1f);
                    double d15 = (float)oy.c(this.C.b) + 1.0f;
                    double d16 = this.u + (double)(oy.b(f12) * f13 * 0.1f);
                    mm2.a("splash", d14, d15, d16, 2 + this.Z.nextInt(2), 0.1f, 0.0, 0.1f, 0.0);
                }
                if (this.ay <= 0) {
                    this.aA = oy.a(this.Z, 0.0f, 360.0f);
                    this.az = oy.a(this.Z, 20, 80);
                }
            } else {
                this.ay = oy.a(this.Z, 100, 900);
                this.ay -= aem.h(this.b) * 20 * 5;
            }
            if (this.ax > 0) {
                this.w -= (double)(this.Z.nextFloat() * this.Z.nextFloat() * this.Z.nextFloat()) * 0.2;
            }
        }
        double d17 = d8 * 2.0 - 1.0;
        this.w += (double)0.04f * d17;
        if (d8 > 0.0) {
            f4 = (float)((double)f4 * 0.9);
            this.w *= 0.8;
        }
        this.v *= (double)f4;
        this.w *= (double)f4;
        this.x *= (double)f4;
        this.b(this.s, this.t, this.u);
    }

    @Override
    public void b(dg dg2) {
        dg2.a("xTile", (short)this.g);
        dg2.a("yTile", (short)this.h);
        dg2.a("zTile", (short)this.i);
        dg2.a("inTile", (byte)ahz.b(this.at));
        dg2.a("shake", (byte)this.a);
        dg2.a("inGround", (byte)(this.au ? 1 : 0));
    }

    @Override
    public void a(dg dg2) {
        this.g = dg2.e("xTile");
        this.h = dg2.e("yTile");
        this.i = dg2.e("zTile");
        this.at = ahz.e(dg2.d("inTile") & 0xFF);
        this.a = dg2.d("shake") & 0xFF;
        this.au = dg2.d("inGround") == 1;
    }

    @Override
    public float X() {
        return 0.0f;
    }

    public int e() {
        if (this.o.E) {
            return 0;
        }
        int n2 = 0;
        if (this.c != null) {
            double d2 = this.b.s - this.s;
            double d3 = this.b.t - this.t;
            double d4 = this.b.u - this.u;
            double d5 = oy.a(d2 * d2 + d3 * d3 + d4 * d4);
            double d6 = 0.1;
            this.c.v += d2 * d6;
            this.c.w += d3 * d6 + (double)oy.a(d5) * 0.08;
            this.c.x += d4 * d6;
            n2 = 3;
        } else if (this.ax > 0) {
            wb wb2 = new wb(this.o, this.s, this.t, this.u, this.f());
            double d7 = this.b.s - this.s;
            double d8 = this.b.t - this.t;
            double d9 = this.b.u - this.u;
            double d10 = oy.a(d7 * d7 + d8 * d8 + d9 * d9);
            double d11 = 0.1;
            wb2.v = d7 * d11;
            wb2.w = d8 * d11 + (double)oy.a(d10) * 0.08;
            wb2.x = d9 * d11;
            this.o.d(wb2);
            this.b.o.d(new rh(this.b.o, this.b.s, this.b.t + 0.5, this.b.u + 0.5, this.Z.nextInt(6) + 1));
            n2 = 1;
        }
        if (this.au) {
            n2 = 2;
        }
        this.A();
        this.b.bK = null;
        return n2;
    }

    private abu f() {
        float f2 = this.o.s.nextFloat();
        int n2 = aem.g(this.b);
        int n3 = aem.h(this.b);
        float f3 = 0.1f - (float)n2 * 0.025f - (float)n3 * 0.01f;
        float f4 = 0.05f + (float)n2 * 0.01f - (float)n3 * 0.01f;
        f3 = oy.a(f3, 0.0f, 1.0f);
        f4 = oy.a(f4, 0.0f, 1.0f);
        if (f2 < f3) {
            this.b.a(og.A, 1);
            return ((vw)pm.a(this.Z, d)).a(this.Z);
        }
        if ((f2 -= f3) < f4) {
            this.b.a(og.B, 1);
            return ((vw)pm.a(this.Z, e)).a(this.Z);
        }
        f2 -= f4;
        this.b.a(og.z, 1);
        return ((vw)pm.a(this.Z, f)).a(this.Z);
    }

    @Override
    public void A() {
        super.A();
        if (this.b != null) {
            this.b.bK = null;
        }
    }
}

