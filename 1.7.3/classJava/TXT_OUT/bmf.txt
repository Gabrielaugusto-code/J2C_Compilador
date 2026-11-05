/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bmf {
    public agc a;
    private pw d;
    private boolean e;
    private boolean f;
    private boolean g;
    public static boolean b = true;
    public boolean c = true;
    private boolean h = false;
    private double i;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private boolean o;
    private boolean p;
    private final azi q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private float y;
    private float z;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private float aq;
    private float ar;
    private float as;
    private float at;
    private float au;
    private float av;
    private float aw;
    private float ax;
    private float ay;
    private float az;
    private float aA;
    private float aB;

    public bmf(agc agc2) {
        this.a = agc2;
        this.f = false;
        this.e = false;
        this.q = azi.B();
    }

    public bmf() {
        this.q = azi.B();
    }

    public void a(pw pw2) {
        this.d = pw2;
    }

    public void a() {
        this.d = null;
    }

    public boolean b() {
        return this.d != null;
    }

    public void a(boolean bl2) {
        this.h = bl2;
    }

    public void b(boolean bl2) {
        this.g = bl2;
    }

    public void a(double d2, double d3, double d4, double d5, double d6, double d7) {
        if (!this.o) {
            this.i = d2;
            this.j = d5;
            this.k = d3;
            this.l = d6;
            this.m = d4;
            this.n = d7;
            this.p = this.q.u.j >= 2 && (this.i > 0.0 || this.j < 1.0 || this.k > 0.0 || this.l < 1.0 || this.m > 0.0 || this.n < 1.0);
        }
    }

    public void a(ahz ahz2) {
        if (!this.o) {
            this.i = ahz2.x();
            this.j = ahz2.y();
            this.k = ahz2.z();
            this.l = ahz2.A();
            this.m = ahz2.B();
            this.n = ahz2.C();
            this.p = this.q.u.j >= 2 && (this.i > 0.0 || this.j < 1.0 || this.k > 0.0 || this.l < 1.0 || this.m > 0.0 || this.n < 1.0);
        }
    }

    public void b(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.i = d2;
        this.j = d5;
        this.k = d3;
        this.l = d6;
        this.m = d4;
        this.n = d7;
        this.o = true;
        this.p = this.q.u.j >= 2 && (this.i > 0.0 || this.j < 1.0 || this.k > 0.0 || this.l < 1.0 || this.m > 0.0 || this.n < 1.0);
    }

    public void c() {
        this.o = false;
    }

    public void a(ahz ahz2, int n2, int n3, int n4, pw pw2) {
        this.a(pw2);
        this.b(ahz2, n2, n3, n4);
        this.a();
    }

    public void a(ahz ahz2, int n2, int n3, int n4) {
        this.g = true;
        this.b(ahz2, n2, n3, n4);
        this.g = false;
    }

    public boolean b(ahz ahz2, int n2, int n3, int n4) {
        int n5 = ahz2.b();
        if (n5 == -1) {
            return false;
        }
        ahz2.a(this.a, n2, n3, n4);
        this.a(ahz2);
        if (n5 == 0) {
            return this.q(ahz2, n2, n3, n4);
        }
        if (n5 == 4) {
            return this.p(ahz2, n2, n3, n4);
        }
        if (n5 == 31) {
            return this.r(ahz2, n2, n3, n4);
        }
        if (n5 == 1) {
            return this.l(ahz2, n2, n3, n4);
        }
        if (n5 == 40) {
            return this.a((ajf)ahz2, n2, n3, n4);
        }
        if (n5 == 2) {
            return this.c(ahz2, n2, n3, n4);
        }
        if (n5 == 20) {
            return this.j(ahz2, n2, n3, n4);
        }
        if (n5 == 11) {
            return this.a((ajq)ahz2, n2, n3, n4);
        }
        if (n5 == 39) {
            return this.s(ahz2, n2, n3, n4);
        }
        if (n5 == 5) {
            return this.h(ahz2, n2, n3, n4);
        }
        if (n5 == 13) {
            return this.t(ahz2, n2, n3, n4);
        }
        if (n5 == 9) {
            return this.a((ahv)ahz2, n2, n3, n4);
        }
        if (n5 == 19) {
            return this.m(ahz2, n2, n3, n4);
        }
        if (n5 == 23) {
            return this.o(ahz2, n2, n3, n4);
        }
        if (n5 == 6) {
            return this.n(ahz2, n2, n3, n4);
        }
        if (n5 == 3) {
            return this.a((ajs)ahz2, n2, n3, n4);
        }
        if (n5 == 8) {
            return this.i(ahz2, n2, n3, n4);
        }
        if (n5 == 7) {
            return this.u(ahz2, n2, n3, n4);
        }
        if (n5 == 10) {
            return this.a((amj)ahz2, n2, n3, n4);
        }
        if (n5 == 27) {
            return this.a((ajg)ahz2, n2, n3, n4);
        }
        if (n5 == 32) {
            return this.a((amz)ahz2, n2, n3, n4);
        }
        if (n5 == 12) {
            return this.e(ahz2, n2, n3, n4);
        }
        if (n5 == 29) {
            return this.f(ahz2, n2, n3, n4);
        }
        if (n5 == 30) {
            return this.g(ahz2, n2, n3, n4);
        }
        if (n5 == 14) {
            return this.v(ahz2, n2, n3, n4);
        }
        if (n5 == 15) {
            return this.a((alw)ahz2, n2, n3, n4);
        }
        if (n5 == 36) {
            return this.a((aja)ahz2, n2, n3, n4);
        }
        if (n5 == 37) {
            return this.a((ait)ahz2, n2, n3, n4);
        }
        if (n5 == 16) {
            return this.b(ahz2, n2, n3, n4, false);
        }
        if (n5 == 17) {
            return this.c(ahz2, n2, n3, n4, true);
        }
        if (n5 == 18) {
            return this.a((amr)ahz2, n2, n3, n4);
        }
        if (n5 == 41) {
            return this.k(ahz2, n2, n3, n4);
        }
        if (n5 == 21) {
            return this.a((ajr)ahz2, n2, n3, n4);
        }
        if (n5 == 24) {
            return this.a((ain)ahz2, n2, n3, n4);
        }
        if (n5 == 33) {
            return this.a((aju)ahz2, n2, n3, n4);
        }
        if (n5 == 35) {
            return this.a((ahs)ahz2, n2, n3, n4);
        }
        if (n5 == 25) {
            return this.a((aih)ahz2, n2, n3, n4);
        }
        if (n5 == 26) {
            return this.a((ajl)ahz2, n2, n3, n4);
        }
        if (n5 == 28) {
            return this.a((aiq)ahz2, n2, n3, n4);
        }
        if (n5 == 34) {
            return this.a((ahx)ahz2, n2, n3, n4);
        }
        if (n5 == 38) {
            return this.a((ake)ahz2, n2, n3, n4);
        }
        return false;
    }

    private boolean a(ajl ajl2, int n2, int n3, int n4) {
        int n5 = this.a.e(n2, n3, n4);
        int n6 = n5 & 3;
        if (n6 == 0) {
            this.v = 3;
        } else if (n6 == 3) {
            this.v = 1;
        } else if (n6 == 1) {
            this.v = 2;
        }
        if (!ajl.b(n5)) {
            this.a(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
            this.q(ajl2, n2, n3, n4);
            this.v = 0;
            return true;
        }
        this.g = true;
        this.a(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
        this.q(ajl2, n2, n3, n4);
        this.a(ajl2.e());
        this.a(0.25, 0.8125, 0.25, 0.75, 1.0, 0.75);
        this.q(ajl2, n2, n3, n4);
        this.g = false;
        this.a();
        this.v = 0;
        return true;
    }

    private boolean v(ahz ahz2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        int n5 = this.a.e(n2, n3, n4);
        int n6 = ahy.l(n5);
        boolean bl2 = ahy.b(n5);
        float f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.8f;
        float f5 = 0.6f;
        float f6 = f3;
        float f7 = f3;
        float f8 = f3;
        float f9 = f2;
        float f10 = f4;
        float f11 = f5;
        float f12 = f2;
        float f13 = f4;
        float f14 = f5;
        float f15 = f2;
        float f16 = f4;
        float f17 = f5;
        int n7 = ahz2.c(this.a, n2, n3, n4);
        bna2.b(n7);
        bna2.b(f9, f12, f15);
        pw pw2 = this.a(ahz2, this.a, n2, n3, n4, 0);
        double d2 = pw2.c();
        double d3 = pw2.d();
        double d4 = pw2.e();
        double d5 = pw2.f();
        double d6 = (double)n2 + this.i;
        double d7 = (double)n2 + this.j;
        double d8 = (double)n3 + this.k + 0.1875;
        double d9 = (double)n4 + this.m;
        double d10 = (double)n4 + this.n;
        bna2.a(d6, d8, d10, d2, d5);
        bna2.a(d6, d8, d9, d2, d4);
        bna2.a(d7, d8, d9, d3, d4);
        bna2.a(d7, d8, d10, d3, d5);
        bna2.b(ahz2.c(this.a, n2, n3 + 1, n4));
        bna2.b(f6, f7, f8);
        pw2 = this.a(ahz2, this.a, n2, n3, n4, 1);
        d2 = pw2.c();
        d3 = pw2.d();
        d4 = pw2.e();
        d5 = pw2.f();
        d6 = d2;
        d7 = d3;
        d8 = d4;
        d9 = d4;
        d10 = d2;
        double d11 = d3;
        double d12 = d5;
        double d13 = d5;
        if (n6 == 0) {
            d7 = d2;
            d8 = d5;
            d10 = d3;
            d13 = d4;
        } else if (n6 == 2) {
            d6 = d3;
            d9 = d5;
            d11 = d2;
            d12 = d4;
        } else if (n6 == 3) {
            d6 = d3;
            d9 = d5;
            d11 = d2;
            d12 = d4;
            d7 = d2;
            d8 = d5;
            d10 = d3;
            d13 = d4;
        }
        double d14 = (double)n2 + this.i;
        double d15 = (double)n2 + this.j;
        double d16 = (double)n3 + this.l;
        double d17 = (double)n4 + this.m;
        double d18 = (double)n4 + this.n;
        bna2.a(d15, d16, d18, d10, d12);
        bna2.a(d15, d16, d17, d6, d8);
        bna2.a(d14, d16, d17, d7, d9);
        bna2.a(d14, d16, d18, d11, d13);
        int n8 = p.d[n6];
        if (bl2) {
            n8 = p.d[p.f[n6]];
        }
        int n9 = 4;
        switch (n6) {
            case 2: {
                break;
            }
            case 0: {
                n9 = 5;
                break;
            }
            case 3: {
                n9 = 2;
                break;
            }
            case 1: {
                n9 = 3;
            }
        }
        if (n8 != 2 && (this.g || ahz2.a(this.a, n2, n3, n4 - 1, 2))) {
            bna2.b(this.m > 0.0 ? n7 : ahz2.c(this.a, n2, n3, n4 - 1));
            bna2.b(f10, f13, f16);
            this.e = n9 == 2;
            this.c(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 2));
        }
        if (n8 != 3 && (this.g || ahz2.a(this.a, n2, n3, n4 + 1, 3))) {
            bna2.b(this.n < 1.0 ? n7 : ahz2.c(this.a, n2, n3, n4 + 1));
            bna2.b(f10, f13, f16);
            this.e = n9 == 3;
            this.d(ahz2, n2, n3, n4, this.a(ahz2, this.a, n2, n3, n4, 3));
        }
        if (n8 != 4 && (this.g || ahz2.a(this.a, n2 - 1, n3, n4, 4))) {
            bna2.b(this.m > 0.0 ? n7 : ahz2.c(this.a, n2 - 1, n3, n4));
            bna2.b(f11, f14, f17);
            this.e = n9 == 4;
            this.e(ahz2, n2, n3, n4, this.a(ahz2, this.a, n2, n3, n4, 4));
        }
        if (n8 != 5 && (this.g || ahz2.a(this.a, n2 + 1, n3, n4, 5))) {
            bna2.b(this.n < 1.0 ? n7 : ahz2.c(this.a, n2 + 1, n3, n4));
            bna2.b(f11, f14, f17);
            this.e = n9 == 5;
            this.f(ahz2, n2, n3, n4, this.a(ahz2, this.a, n2, n3, n4, 5));
        }
        this.e = false;
        return true;
    }

    private boolean a(aih aih2, int n2, int n3, int n4) {
        this.a(0.4375, 0.0, 0.4375, 0.5625, 0.875, 0.5625);
        this.q(aih2, n2, n3, n4);
        this.a(aih2.e());
        this.g = true;
        this.a(0.5625, 0.0, 0.3125, 0.9375, 0.125, 0.6875);
        this.q(aih2, n2, n3, n4);
        this.a(0.125, 0.0, 0.0625, 0.5, 0.125, 0.4375);
        this.q(aih2, n2, n3, n4);
        this.a(0.125, 0.0, 0.5625, 0.5, 0.125, 0.9375);
        this.q(aih2, n2, n3, n4);
        this.g = false;
        this.a();
        bna bna2 = bna.a;
        bna2.b(aih2.c(this.a, n2, n3, n4));
        int n5 = aih2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        pw pw2 = this.a((ahz)aih2, 0, 0);
        if (this.b()) {
            pw2 = this.d;
        }
        double d2 = pw2.e();
        double d3 = pw2.f();
        int n6 = this.a.e(n2, n3, n4);
        for (int i2 = 0; i2 < 3; ++i2) {
            double d4 = (double)i2 * Math.PI * 2.0 / 3.0 + 1.5707963267948966;
            double d5 = pw2.a(8.0);
            double d6 = pw2.d();
            if ((n6 & 1 << i2) != 0) {
                d6 = pw2.c();
            }
            double d7 = (double)n2 + 0.5;
            double d8 = (double)n2 + 0.5 + Math.sin(d4) * 8.0 / 16.0;
            double d9 = (double)n4 + 0.5;
            double d10 = (double)n4 + 0.5 + Math.cos(d4) * 8.0 / 16.0;
            bna2.a(d7, n3 + 1, d9, d5, d2);
            bna2.a(d7, n3 + 0, d9, d5, d3);
            bna2.a(d8, n3 + 0, d10, d6, d3);
            bna2.a(d8, n3 + 1, d10, d6, d2);
            bna2.a(d8, n3 + 1, d10, d6, d2);
            bna2.a(d8, n3 + 0, d10, d6, d3);
            bna2.a(d7, n3 + 0, d9, d5, d3);
            bna2.a(d7, n3 + 1, d9, d5, d2);
        }
        aih2.g();
        return true;
    }

    private boolean a(ain ain2, int n2, int n3, int n4) {
        float f2;
        this.q(ain2, n2, n3, n4);
        bna bna2 = bna.a;
        bna2.b(ain2.c(this.a, n2, n3, n4));
        int n5 = ain2.d(this.a, n2, n3, n4);
        float f3 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f6 = (f3 * 30.0f + f4 * 59.0f + f5 * 11.0f) / 100.0f;
            f2 = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
            float f7 = (f3 * 30.0f + f5 * 70.0f) / 100.0f;
            f3 = f6;
            f4 = f2;
            f5 = f7;
        }
        bna2.b(f3, f4, f5);
        pw pw2 = ain2.h(2);
        f2 = 0.125f;
        this.f(ain2, (float)n2 - 1.0f + f2, n3, n4, pw2);
        this.e(ain2, (float)n2 + 1.0f - f2, n3, n4, pw2);
        this.d(ain2, n2, n3, (float)n4 - 1.0f + f2, pw2);
        this.c((ahz)ain2, (double)n2, (double)n3, (float)n4 + 1.0f - f2, pw2);
        pw pw3 = ain.e("inner");
        this.b((ahz)ain2, (double)n2, (float)n3 - 1.0f + 0.25f, (double)n4, pw3);
        this.a((ahz)ain2, (double)n2, (double)((float)n3 + 1.0f - 0.75f), (double)n4, pw3);
        int n6 = this.a.e(n2, n3, n4);
        if (n6 > 0) {
            pw pw4 = akn.e("water_still");
            this.b((ahz)ain2, (double)n2, (float)n3 - 1.0f + ain.c(n6), (double)n4, pw4);
        }
        return true;
    }

    private boolean a(aju aju2, int n2, int n3, int n4) {
        float f2;
        this.q(aju2, n2, n3, n4);
        bna bna2 = bna.a;
        bna2.b(aju2.c(this.a, n2, n3, n4));
        int n5 = aju2.d(this.a, n2, n3, n4);
        pw pw2 = this.a(aju2, 0);
        float f3 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            f2 = (f3 * 30.0f + f4 * 59.0f + f5 * 11.0f) / 100.0f;
            float f6 = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
            float f7 = (f3 * 30.0f + f5 * 70.0f) / 100.0f;
            f3 = f2;
            f4 = f6;
            f5 = f7;
        }
        bna2.b(f3, f4, f5);
        f2 = 0.1865f;
        this.f(aju2, (float)n2 - 0.5f + f2, n3, n4, pw2);
        this.e(aju2, (float)n2 + 0.5f - f2, n3, n4, pw2);
        this.d(aju2, n2, n3, (float)n4 - 0.5f + f2, pw2);
        this.c((ahz)aju2, (double)n2, (double)n3, (float)n4 + 0.5f - f2, pw2);
        this.b((ahz)aju2, (double)n2, (float)n3 - 0.5f + f2 + 0.1875f, (double)n4, this.b(aie.d));
        ani ani2 = this.a.o(n2, n3, n4);
        if (ani2 != null && ani2 instanceof anw) {
            abs abs2 = ((anw)ani2).a();
            int n6 = ((anw)ani2).b();
            if (abs2 instanceof zy) {
                ahz ahz2 = ahz.a(abs2);
                int n7 = ahz2.b();
                float f8 = 0.0f;
                float f9 = 4.0f;
                float f10 = 0.0f;
                bna2.d(f8 / 16.0f, f9 / 16.0f, f10 / 16.0f);
                n5 = ahz2.d(this.a, n2, n3, n4);
                if (n5 != 0xFFFFFF) {
                    f3 = (float)(n5 >> 16 & 0xFF) / 255.0f;
                    f4 = (float)(n5 >> 8 & 0xFF) / 255.0f;
                    f5 = (float)(n5 & 0xFF) / 255.0f;
                    bna2.b(f3, f4, f5);
                }
                if (n7 == 1) {
                    this.a(this.a(ahz2, 0, n6), (double)n2, (double)n3, (double)n4, 0.75f);
                } else if (n7 == 13) {
                    this.g = true;
                    float f11 = 0.125f;
                    this.a(0.5f - f11, 0.0, (double)(0.5f - f11), (double)(0.5f + f11), 0.25, (double)(0.5f + f11));
                    this.q(ahz2, n2, n3, n4);
                    this.a(0.5f - f11, 0.25, (double)(0.5f - f11), (double)(0.5f + f11), 0.5, (double)(0.5f + f11));
                    this.q(ahz2, n2, n3, n4);
                    this.a(0.5f - f11, 0.5, (double)(0.5f - f11), (double)(0.5f + f11), 0.75, (double)(0.5f + f11));
                    this.q(ahz2, n2, n3, n4);
                    this.g = false;
                    this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                }
                bna2.d(-f8 / 16.0f, -f9 / 16.0f, -f10 / 16.0f);
            }
        }
        return true;
    }

    private boolean a(ahs ahs2, int n2, int n3, int n4) {
        return this.a(ahs2, n2, n3, n4, this.a.e(n2, n3, n4));
    }

    public boolean a(ahs ahs2, int n2, int n3, int n4, int n5) {
        bna bna2 = bna.a;
        bna2.b(ahs2.c(this.a, n2, n3, n4));
        int n6 = ahs2.d(this.a, n2, n3, n4);
        float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n6 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        return this.a(ahs2, n2, n3, n4, n5, false);
    }

    private boolean a(ahs ahs2, int n2, int n3, int n4, int n5, boolean bl2) {
        int n6 = bl2 ? 0 : n5 & 3;
        boolean bl3 = false;
        float f2 = 0.0f;
        switch (n6) {
            case 2: {
                this.t = 1;
                this.u = 2;
                break;
            }
            case 0: {
                this.t = 2;
                this.u = 1;
                this.v = 3;
                this.w = 3;
                break;
            }
            case 1: {
                this.r = 1;
                this.s = 2;
                this.v = 2;
                this.w = 1;
                bl3 = true;
                break;
            }
            case 3: {
                this.r = 2;
                this.s = 1;
                this.v = 1;
                this.w = 2;
                bl3 = true;
            }
        }
        f2 = this.a(ahs2, n2, n3, n4, 0, f2, 0.75f, 0.25f, 0.75f, bl3, bl2, n5);
        f2 = this.a(ahs2, n2, n3, n4, 1, f2, 0.5f, 0.0625f, 0.625f, bl3, bl2, n5);
        f2 = this.a(ahs2, n2, n3, n4, 2, f2, 0.25f, 0.3125f, 0.5f, bl3, bl2, n5);
        f2 = this.a(ahs2, n2, n3, n4, 3, f2, 0.625f, 0.375f, 1.0f, bl3, bl2, n5);
        this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        return true;
    }

    private float a(ahs ahs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5, boolean bl2, boolean bl3, int n6) {
        if (bl2) {
            float f6 = f3;
            f3 = f5;
            f5 = f6;
        }
        ahs2.b = n5;
        this.a(0.5f - (f3 /= 2.0f), f2, (double)(0.5f - (f5 /= 2.0f)), (double)(0.5f + f3), (double)(f2 + f4), (double)(0.5f + f5));
        if (bl3) {
            bna bna2 = bna.a;
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            this.a((ahz)ahs2, 0.0, 0.0, 0.0, this.a((ahz)ahs2, 0, n6));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 1.0f, 0.0f);
            this.b((ahz)ahs2, 0.0, 0.0, 0.0, this.a((ahz)ahs2, 1, n6));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, -1.0f);
            this.c((ahz)ahs2, 0.0, 0.0, 0.0, this.a((ahz)ahs2, 2, n6));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, 1.0f);
            this.d(ahs2, 0.0, 0.0, 0.0, this.a((ahz)ahs2, 3, n6));
            bna2.a();
            bna2.b();
            bna2.c(-1.0f, 0.0f, 0.0f);
            this.e(ahs2, 0.0, 0.0, 0.0, this.a((ahz)ahs2, 4, n6));
            bna2.a();
            bna2.b();
            bna2.c(1.0f, 0.0f, 0.0f);
            this.f(ahs2, 0.0, 0.0, 0.0, this.a((ahz)ahs2, 5, n6));
            bna2.a();
        } else {
            this.q(ahs2, n2, n3, n4);
        }
        return f2 + f4;
    }

    public boolean c(ahz ahz2, int n2, int n3, int n4) {
        int n5 = this.a.e(n2, n3, n4);
        bna bna2 = bna.a;
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        double d2 = 0.4f;
        double d3 = 0.5 - d2;
        double d4 = 0.2f;
        if (n5 == 1) {
            this.a(ahz2, (double)n2 - d3, (double)n3 + d4, (double)n4, -d2, 0.0, 0);
        } else if (n5 == 2) {
            this.a(ahz2, (double)n2 + d3, (double)n3 + d4, (double)n4, d2, 0.0, 0);
        } else if (n5 == 3) {
            this.a(ahz2, (double)n2, (double)n3 + d4, (double)n4 - d3, 0.0, -d2, 0);
        } else if (n5 == 4) {
            this.a(ahz2, (double)n2, (double)n3 + d4, (double)n4 + d3, 0.0, d2, 0);
        } else {
            this.a(ahz2, (double)n2, (double)n3, (double)n4, 0.0, 0.0, 0);
        }
        return true;
    }

    private boolean a(alw alw2, int n2, int n3, int n4) {
        int n5 = this.a.e(n2, n3, n4);
        int n6 = n5 & 3;
        int n7 = (n5 & 0xC) >> 2;
        bna bna2 = bna.a;
        bna2.b(alw2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        double d2 = -0.1875;
        boolean bl2 = alw2.g(this.a, n2, n3, n4, n5);
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        double d6 = 0.0;
        switch (n6) {
            case 0: {
                d6 = -0.3125;
                d4 = alw.b[n7];
                break;
            }
            case 2: {
                d6 = 0.3125;
                d4 = -alw.b[n7];
                break;
            }
            case 3: {
                d5 = -0.3125;
                d3 = alw.b[n7];
                break;
            }
            case 1: {
                d5 = 0.3125;
                d3 = -alw.b[n7];
            }
        }
        if (!bl2) {
            this.a((ahz)alw2, (double)n2 + d3, (double)n3 + d2, (double)n4 + d4, 0.0, 0.0, 0);
        } else {
            pw pw2 = this.b(aie.h);
            this.a(pw2);
            float f2 = 2.0f;
            float f3 = 14.0f;
            float f4 = 7.0f;
            float f5 = 9.0f;
            switch (n6) {
                case 0: 
                case 2: {
                    break;
                }
                case 1: 
                case 3: {
                    f2 = 7.0f;
                    f3 = 9.0f;
                    f4 = 2.0f;
                    f5 = 14.0f;
                }
            }
            this.a(f2 / 16.0f + (float)d3, 0.125, (double)(f4 / 16.0f + (float)d4), (double)(f3 / 16.0f + (float)d3), 0.25, (double)(f5 / 16.0f + (float)d4));
            double d7 = pw2.a(f2);
            double d8 = pw2.b(f4);
            double d9 = pw2.a(f3);
            double d10 = pw2.b(f5);
            bna2.a((double)((float)n2 + f2 / 16.0f) + d3, (float)n3 + 0.25f, (double)((float)n4 + f4 / 16.0f) + d4, d7, d8);
            bna2.a((double)((float)n2 + f2 / 16.0f) + d3, (float)n3 + 0.25f, (double)((float)n4 + f5 / 16.0f) + d4, d7, d10);
            bna2.a((double)((float)n2 + f3 / 16.0f) + d3, (float)n3 + 0.25f, (double)((float)n4 + f5 / 16.0f) + d4, d9, d10);
            bna2.a((double)((float)n2 + f3 / 16.0f) + d3, (float)n3 + 0.25f, (double)((float)n4 + f4 / 16.0f) + d4, d9, d8);
            this.q(alw2, n2, n3, n4);
            this.a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
            this.a();
        }
        bna2.b(alw2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        this.a((ahz)alw2, (double)n2 + d5, (double)n3 + d2, (double)n4 + d6, 0.0, 0.0, 0);
        this.a((aja)alw2, n2, n3, n4);
        return true;
    }

    private boolean a(ait ait2, int n2, int n3, int n4) {
        pw pw2;
        bna bna2 = bna.a;
        bna2.b(ait2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        int n5 = this.a.e(n2, n3, n4);
        int n6 = n5 & 3;
        double d2 = 0.0;
        double d3 = -0.1875;
        double d4 = 0.0;
        double d5 = 0.0;
        double d6 = 0.0;
        if (ait2.d(n5)) {
            pw2 = aie.aA.h(0);
        } else {
            d3 -= 0.1875;
            pw2 = aie.az.h(0);
        }
        switch (n6) {
            case 0: {
                d4 = -0.3125;
                d6 = 1.0;
                break;
            }
            case 2: {
                d4 = 0.3125;
                d6 = -1.0;
                break;
            }
            case 3: {
                d2 = -0.3125;
                d5 = 1.0;
                break;
            }
            case 1: {
                d2 = 0.3125;
                d5 = -1.0;
            }
        }
        this.a((ahz)ait2, (double)n2 + 0.25 * d5 + 0.1875 * d6, (float)n3 - 0.1875f, (double)n4 + 0.25 * d6 + 0.1875 * d5, 0.0, 0.0, n5);
        this.a((ahz)ait2, (double)n2 + 0.25 * d5 + -0.1875 * d6, (float)n3 - 0.1875f, (double)n4 + 0.25 * d6 + -0.1875 * d5, 0.0, 0.0, n5);
        this.a(pw2);
        this.a((ahz)ait2, (double)n2 + d2, (double)n3 + d3, (double)n4 + d4, 0.0, 0.0, n5);
        this.a();
        this.a(ait2, n2, n3, n4, n6);
        return true;
    }

    private boolean a(aja aja2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        this.a(aja2, n2, n3, n4, this.a.e(n2, n3, n4) & 3);
        return true;
    }

    private void a(aja aja2, int n2, int n3, int n4, int n5) {
        this.q(aja2, n2, n3, n4);
        bna bna2 = bna.a;
        bna2.b(aja2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        int n6 = this.a.e(n2, n3, n4);
        pw pw2 = this.a((ahz)aja2, 1, n6);
        double d2 = pw2.c();
        double d3 = pw2.d();
        double d4 = pw2.e();
        double d5 = pw2.f();
        double d6 = 0.125;
        double d7 = n2 + 1;
        double d8 = n2 + 1;
        double d9 = n2 + 0;
        double d10 = n2 + 0;
        double d11 = n4 + 0;
        double d12 = n4 + 1;
        double d13 = n4 + 1;
        double d14 = n4 + 0;
        double d15 = (double)n3 + d6;
        if (n5 == 2) {
            d7 = d8 = (double)(n2 + 0);
            d9 = d10 = (double)(n2 + 1);
            d11 = d14 = (double)(n4 + 1);
            d12 = d13 = (double)(n4 + 0);
        } else if (n5 == 3) {
            d7 = d10 = (double)(n2 + 0);
            d8 = d9 = (double)(n2 + 1);
            d11 = d12 = (double)(n4 + 0);
            d13 = d14 = (double)(n4 + 1);
        } else if (n5 == 1) {
            d7 = d10 = (double)(n2 + 1);
            d8 = d9 = (double)(n2 + 0);
            d11 = d12 = (double)(n4 + 1);
            d13 = d14 = (double)(n4 + 0);
        }
        bna2.a(d10, d15, d14, d2, d4);
        bna2.a(d9, d15, d13, d2, d5);
        bna2.a(d8, d15, d12, d3, d5);
        bna2.a(d7, d15, d11, d3, d4);
    }

    public void d(ahz ahz2, int n2, int n3, int n4) {
        this.g = true;
        this.b(ahz2, n2, n3, n4, true);
        this.g = false;
    }

    private boolean b(ahz ahz2, int n2, int n3, int n4, boolean bl2) {
        int n5 = this.a.e(n2, n3, n4);
        boolean bl3 = bl2 || (n5 & 8) != 0;
        int n6 = aog.b(n5);
        float f2 = 0.25f;
        if (bl3) {
            switch (n6) {
                case 0: {
                    this.r = 3;
                    this.s = 3;
                    this.t = 3;
                    this.u = 3;
                    this.a(0.0, 0.25, 0.0, 1.0, 1.0, 1.0);
                    break;
                }
                case 1: {
                    this.a(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
                    break;
                }
                case 2: {
                    this.t = 1;
                    this.u = 2;
                    this.a(0.0, 0.0, 0.25, 1.0, 1.0, 1.0);
                    break;
                }
                case 3: {
                    this.t = 2;
                    this.u = 1;
                    this.v = 3;
                    this.w = 3;
                    this.a(0.0, 0.0, 0.0, 1.0, 1.0, 0.75);
                    break;
                }
                case 4: {
                    this.r = 1;
                    this.s = 2;
                    this.v = 2;
                    this.w = 1;
                    this.a(0.25, 0.0, 0.0, 1.0, 1.0, 1.0);
                    break;
                }
                case 5: {
                    this.r = 2;
                    this.s = 1;
                    this.v = 1;
                    this.w = 2;
                    this.a(0.0, 0.0, 0.0, 0.75, 1.0, 1.0);
                }
            }
            ((aog)ahz2).b((float)this.i, (float)this.k, (float)this.m, (float)this.j, (float)this.l, (float)this.n);
            this.q(ahz2, n2, n3, n4);
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = 0;
            this.w = 0;
            this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            ((aog)ahz2).b((float)this.i, (float)this.k, (float)this.m, (float)this.j, (float)this.l, (float)this.n);
        } else {
            switch (n6) {
                case 0: {
                    this.r = 3;
                    this.s = 3;
                    this.t = 3;
                    this.u = 3;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    this.t = 1;
                    this.u = 2;
                    break;
                }
                case 3: {
                    this.t = 2;
                    this.u = 1;
                    this.v = 3;
                    this.w = 3;
                    break;
                }
                case 4: {
                    this.r = 1;
                    this.s = 2;
                    this.v = 2;
                    this.w = 1;
                    break;
                }
                case 5: {
                    this.r = 2;
                    this.s = 1;
                    this.v = 1;
                    this.w = 2;
                }
            }
            this.q(ahz2, n2, n3, n4);
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = 0;
            this.w = 0;
        }
        return true;
    }

    private void a(double d2, double d3, double d4, double d5, double d6, double d7, float f2, double d8) {
        pw pw2 = aog.e("piston_side");
        if (this.b()) {
            pw2 = this.d;
        }
        bna bna2 = bna.a;
        double d9 = pw2.c();
        double d10 = pw2.e();
        double d11 = pw2.a(d8);
        double d12 = pw2.b(4.0);
        bna2.b(f2, f2, f2);
        bna2.a(d2, d5, d6, d11, d10);
        bna2.a(d2, d4, d6, d9, d10);
        bna2.a(d3, d4, d7, d9, d12);
        bna2.a(d3, d5, d7, d11, d12);
    }

    private void b(double d2, double d3, double d4, double d5, double d6, double d7, float f2, double d8) {
        pw pw2 = aog.e("piston_side");
        if (this.b()) {
            pw2 = this.d;
        }
        bna bna2 = bna.a;
        double d9 = pw2.c();
        double d10 = pw2.e();
        double d11 = pw2.a(d8);
        double d12 = pw2.b(4.0);
        bna2.b(f2, f2, f2);
        bna2.a(d2, d4, d7, d11, d10);
        bna2.a(d2, d4, d6, d9, d10);
        bna2.a(d3, d5, d6, d9, d12);
        bna2.a(d3, d5, d7, d11, d12);
    }

    private void c(double d2, double d3, double d4, double d5, double d6, double d7, float f2, double d8) {
        pw pw2 = aog.e("piston_side");
        if (this.b()) {
            pw2 = this.d;
        }
        bna bna2 = bna.a;
        double d9 = pw2.c();
        double d10 = pw2.e();
        double d11 = pw2.a(d8);
        double d12 = pw2.b(4.0);
        bna2.b(f2, f2, f2);
        bna2.a(d3, d4, d6, d11, d10);
        bna2.a(d2, d4, d6, d9, d10);
        bna2.a(d2, d5, d7, d9, d12);
        bna2.a(d3, d5, d7, d11, d12);
    }

    public void a(ahz ahz2, int n2, int n3, int n4, boolean bl2) {
        this.g = true;
        this.c(ahz2, n2, n3, n4, bl2);
        this.g = false;
    }

    private boolean c(ahz ahz2, int n2, int n3, int n4, boolean bl2) {
        int n5 = this.a.e(n2, n3, n4);
        int n6 = aoh.b(n5);
        float f2 = 0.25f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        float f5 = bl2 ? 1.0f : 0.5f;
        double d2 = bl2 ? 16.0 : 8.0;
        switch (n6) {
            case 0: {
                this.r = 3;
                this.s = 3;
                this.t = 3;
                this.u = 3;
                this.a(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
                this.q(ahz2, n2, n3, n4);
                this.a((float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.25f, (float)n3 + 0.25f + f5, (double)((float)n4 + 0.625f), (double)((float)n4 + 0.625f), 0.8f, d2);
                this.a((float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.25f, (float)n3 + 0.25f + f5, (double)((float)n4 + 0.375f), (double)((float)n4 + 0.375f), 0.8f, d2);
                this.a((float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.25f, (float)n3 + 0.25f + f5, (double)((float)n4 + 0.375f), (double)((float)n4 + 0.625f), 0.6f, d2);
                this.a((float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.25f, (float)n3 + 0.25f + f5, (double)((float)n4 + 0.625f), (double)((float)n4 + 0.375f), 0.6f, d2);
                break;
            }
            case 1: {
                this.a(0.0, 0.75, 0.0, 1.0, 1.0, 1.0);
                this.q(ahz2, n2, n3, n4);
                this.a((float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 - 0.25f + 1.0f - f5, (float)n3 - 0.25f + 1.0f, (double)((float)n4 + 0.625f), (double)((float)n4 + 0.625f), 0.8f, d2);
                this.a((float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 - 0.25f + 1.0f - f5, (float)n3 - 0.25f + 1.0f, (double)((float)n4 + 0.375f), (double)((float)n4 + 0.375f), 0.8f, d2);
                this.a((float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 - 0.25f + 1.0f - f5, (float)n3 - 0.25f + 1.0f, (double)((float)n4 + 0.375f), (double)((float)n4 + 0.625f), 0.6f, d2);
                this.a((float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 - 0.25f + 1.0f - f5, (float)n3 - 0.25f + 1.0f, (double)((float)n4 + 0.625f), (double)((float)n4 + 0.375f), 0.6f, d2);
                break;
            }
            case 2: {
                this.t = 1;
                this.u = 2;
                this.a(0.0, 0.0, 0.0, 1.0, 1.0, 0.25);
                this.q(ahz2, n2, n3, n4);
                this.b((float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.375f, (float)n4 + 0.25f, (float)n4 + 0.25f + f5, 0.6f, d2);
                this.b((float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.625f, (float)n4 + 0.25f, (float)n4 + 0.25f + f5, 0.6f, d2);
                this.b((float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.375f, (float)n4 + 0.25f, (float)n4 + 0.25f + f5, 0.5f, d2);
                this.b((float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.625f, (float)n4 + 0.25f, (float)n4 + 0.25f + f5, 1.0f, d2);
                break;
            }
            case 3: {
                this.t = 2;
                this.u = 1;
                this.v = 3;
                this.w = 3;
                this.a(0.0, 0.0, 0.75, 1.0, 1.0, 1.0);
                this.q(ahz2, n2, n3, n4);
                this.b((float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.375f, (float)n4 - 0.25f + 1.0f - f5, (float)n4 - 0.25f + 1.0f, 0.6f, d2);
                this.b((float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.625f, (float)n4 - 0.25f + 1.0f - f5, (float)n4 - 0.25f + 1.0f, 0.6f, d2);
                this.b((float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.375f, (float)n4 - 0.25f + 1.0f - f5, (float)n4 - 0.25f + 1.0f, 0.5f, d2);
                this.b((float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.625f, (float)n4 - 0.25f + 1.0f - f5, (float)n4 - 0.25f + 1.0f, 1.0f, d2);
                break;
            }
            case 4: {
                this.r = 1;
                this.s = 2;
                this.v = 2;
                this.w = 1;
                this.a(0.0, 0.0, 0.0, 0.25, 1.0, 1.0);
                this.q(ahz2, n2, n3, n4);
                this.c((float)n2 + 0.25f, (float)n2 + 0.25f + f5, (float)n3 + 0.375f, (float)n3 + 0.375f, (float)n4 + 0.625f, (float)n4 + 0.375f, 0.5f, d2);
                this.c((float)n2 + 0.25f, (float)n2 + 0.25f + f5, (float)n3 + 0.625f, (float)n3 + 0.625f, (float)n4 + 0.375f, (float)n4 + 0.625f, 1.0f, d2);
                this.c((float)n2 + 0.25f, (float)n2 + 0.25f + f5, (float)n3 + 0.375f, (float)n3 + 0.625f, (float)n4 + 0.375f, (float)n4 + 0.375f, 0.6f, d2);
                this.c((float)n2 + 0.25f, (float)n2 + 0.25f + f5, (float)n3 + 0.625f, (float)n3 + 0.375f, (float)n4 + 0.625f, (float)n4 + 0.625f, 0.6f, d2);
                break;
            }
            case 5: {
                this.r = 2;
                this.s = 1;
                this.v = 1;
                this.w = 2;
                this.a(0.75, 0.0, 0.0, 1.0, 1.0, 1.0);
                this.q(ahz2, n2, n3, n4);
                this.c((float)n2 - 0.25f + 1.0f - f5, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.375f, (float)n3 + 0.375f, (float)n4 + 0.625f, (float)n4 + 0.375f, 0.5f, d2);
                this.c((float)n2 - 0.25f + 1.0f - f5, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.625f, (float)n3 + 0.625f, (float)n4 + 0.375f, (float)n4 + 0.625f, 1.0f, d2);
                this.c((float)n2 - 0.25f + 1.0f - f5, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.375f, (float)n3 + 0.625f, (float)n4 + 0.375f, (float)n4 + 0.375f, 0.6f, d2);
                this.c((float)n2 - 0.25f + 1.0f - f5, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.625f, (float)n3 + 0.375f, (float)n4 + 0.625f, (float)n4 + 0.625f, 0.6f, d2);
            }
        }
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return true;
    }

    public boolean e(ahz ahz2, int n2, int n3, int n4) {
        int n5 = this.a.e(n2, n3, n4);
        int n6 = n5 & 7;
        boolean bl2 = (n5 & 8) > 0;
        bna bna2 = bna.a;
        boolean bl3 = this.b();
        if (!bl3) {
            this.a(this.b(aie.e));
        }
        float f2 = 0.25f;
        float f3 = 0.1875f;
        float f4 = 0.1875f;
        if (n6 == 5) {
            this.a(0.5f - f3, 0.0, (double)(0.5f - f2), (double)(0.5f + f3), (double)f4, (double)(0.5f + f2));
        } else if (n6 == 6) {
            this.a(0.5f - f2, 0.0, (double)(0.5f - f3), (double)(0.5f + f2), (double)f4, (double)(0.5f + f3));
        } else if (n6 == 4) {
            this.a(0.5f - f3, 0.5f - f2, (double)(1.0f - f4), (double)(0.5f + f3), (double)(0.5f + f2), 1.0);
        } else if (n6 == 3) {
            this.a(0.5f - f3, 0.5f - f2, 0.0, (double)(0.5f + f3), (double)(0.5f + f2), (double)f4);
        } else if (n6 == 2) {
            this.a(1.0f - f4, 0.5f - f2, (double)(0.5f - f3), 1.0, (double)(0.5f + f2), (double)(0.5f + f3));
        } else if (n6 == 1) {
            this.a(0.0, 0.5f - f2, (double)(0.5f - f3), (double)f4, (double)(0.5f + f2), (double)(0.5f + f3));
        } else if (n6 == 0) {
            this.a(0.5f - f2, 1.0f - f4, (double)(0.5f - f3), (double)(0.5f + f2), 1.0, (double)(0.5f + f3));
        } else if (n6 == 7) {
            this.a(0.5f - f3, 1.0f - f4, (double)(0.5f - f2), (double)(0.5f + f3), 1.0, (double)(0.5f + f2));
        }
        this.q(ahz2, n2, n3, n4);
        if (!bl3) {
            this.a();
        }
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        pw pw2 = this.a(ahz2, 0);
        if (this.b()) {
            pw2 = this.d;
        }
        double d2 = pw2.c();
        double d3 = pw2.e();
        double d4 = pw2.d();
        double d5 = pw2.f();
        ayp[] aypArray = new ayp[8];
        float f5 = 0.0625f;
        float f6 = 0.0625f;
        float f7 = 0.625f;
        aypArray[0] = this.a.V().a(-f5, 0.0, -f6);
        aypArray[1] = this.a.V().a(f5, 0.0, -f6);
        aypArray[2] = this.a.V().a(f5, 0.0, f6);
        aypArray[3] = this.a.V().a(-f5, 0.0, f6);
        aypArray[4] = this.a.V().a(-f5, f7, -f6);
        aypArray[5] = this.a.V().a(f5, f7, -f6);
        aypArray[6] = this.a.V().a(f5, f7, f6);
        aypArray[7] = this.a.V().a(-f5, f7, f6);
        for (int i2 = 0; i2 < 8; ++i2) {
            if (bl2) {
                aypArray[i2].e -= 0.0625;
                aypArray[i2].a(0.69813174f);
            } else {
                aypArray[i2].e += 0.0625;
                aypArray[i2].a(-0.69813174f);
            }
            if (n6 == 0 || n6 == 7) {
                aypArray[i2].c((float)Math.PI);
            }
            if (n6 == 6 || n6 == 0) {
                aypArray[i2].b(1.5707964f);
            }
            if (n6 > 0 && n6 < 5) {
                aypArray[i2].d -= 0.375;
                aypArray[i2].a(1.5707964f);
                if (n6 == 4) {
                    aypArray[i2].b(0.0f);
                }
                if (n6 == 3) {
                    aypArray[i2].b((float)Math.PI);
                }
                if (n6 == 2) {
                    aypArray[i2].b(1.5707964f);
                }
                if (n6 == 1) {
                    aypArray[i2].b(-1.5707964f);
                }
                aypArray[i2].c += (double)n2 + 0.5;
                aypArray[i2].d += (double)((float)n3 + 0.5f);
                aypArray[i2].e += (double)n4 + 0.5;
                continue;
            }
            if (n6 == 0 || n6 == 7) {
                aypArray[i2].c += (double)n2 + 0.5;
                aypArray[i2].d += (double)((float)n3 + 0.875f);
                aypArray[i2].e += (double)n4 + 0.5;
                continue;
            }
            aypArray[i2].c += (double)n2 + 0.5;
            aypArray[i2].d += (double)((float)n3 + 0.125f);
            aypArray[i2].e += (double)n4 + 0.5;
        }
        ayp ayp2 = null;
        ayp ayp3 = null;
        ayp ayp4 = null;
        ayp ayp5 = null;
        for (int i3 = 0; i3 < 6; ++i3) {
            if (i3 == 0) {
                d2 = pw2.a(7.0);
                d3 = pw2.b(6.0);
                d4 = pw2.a(9.0);
                d5 = pw2.b(8.0);
            } else if (i3 == 2) {
                d2 = pw2.a(7.0);
                d3 = pw2.b(6.0);
                d4 = pw2.a(9.0);
                d5 = pw2.f();
            }
            if (i3 == 0) {
                ayp2 = aypArray[0];
                ayp3 = aypArray[1];
                ayp4 = aypArray[2];
                ayp5 = aypArray[3];
            } else if (i3 == 1) {
                ayp2 = aypArray[7];
                ayp3 = aypArray[6];
                ayp4 = aypArray[5];
                ayp5 = aypArray[4];
            } else if (i3 == 2) {
                ayp2 = aypArray[1];
                ayp3 = aypArray[0];
                ayp4 = aypArray[4];
                ayp5 = aypArray[5];
            } else if (i3 == 3) {
                ayp2 = aypArray[2];
                ayp3 = aypArray[1];
                ayp4 = aypArray[5];
                ayp5 = aypArray[6];
            } else if (i3 == 4) {
                ayp2 = aypArray[3];
                ayp3 = aypArray[2];
                ayp4 = aypArray[6];
                ayp5 = aypArray[7];
            } else if (i3 == 5) {
                ayp2 = aypArray[0];
                ayp3 = aypArray[3];
                ayp4 = aypArray[7];
                ayp5 = aypArray[4];
            }
            bna2.a(ayp2.c, ayp2.d, ayp2.e, d2, d5);
            bna2.a(ayp3.c, ayp3.d, ayp3.e, d4, d5);
            bna2.a(ayp4.c, ayp4.d, ayp4.e, d4, d3);
            bna2.a(ayp5.c, ayp5.d, ayp5.e, d2, d3);
        }
        return true;
    }

    public boolean f(ahz ahz2, int n2, int n3, int n4) {
        int n5;
        bna bna2 = bna.a;
        int n6 = this.a.e(n2, n3, n4);
        int n7 = n6 & 3;
        boolean bl2 = (n6 & 4) == 4;
        boolean bl3 = (n6 & 8) == 8;
        boolean bl4 = !afs.a(this.a, n2, n3 - 1, n4);
        boolean bl5 = this.b();
        if (!bl5) {
            this.a(this.b(aie.f));
        }
        float f2 = 0.25f;
        float f3 = 0.125f;
        float f4 = 0.125f;
        float f5 = 0.3f - f2;
        float f6 = 0.3f + f2;
        if (n7 == 2) {
            this.a(0.5f - f3, f5, (double)(1.0f - f4), (double)(0.5f + f3), (double)f6, 1.0);
        } else if (n7 == 0) {
            this.a(0.5f - f3, f5, 0.0, (double)(0.5f + f3), (double)f6, (double)f4);
        } else if (n7 == 1) {
            this.a(1.0f - f4, f5, (double)(0.5f - f3), 1.0, (double)f6, (double)(0.5f + f3));
        } else if (n7 == 3) {
            this.a(0.0, f5, (double)(0.5f - f3), (double)f4, (double)f6, (double)(0.5f + f3));
        }
        this.q(ahz2, n2, n3, n4);
        if (!bl5) {
            this.a();
        }
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        pw pw2 = this.a(ahz2, 0);
        if (this.b()) {
            pw2 = this.d;
        }
        double d2 = pw2.c();
        double d3 = pw2.e();
        double d4 = pw2.d();
        double d5 = pw2.f();
        ayp[] aypArray = new ayp[8];
        float f7 = 0.046875f;
        float f8 = 0.046875f;
        float f9 = 0.3125f;
        aypArray[0] = this.a.V().a(-f7, 0.0, -f8);
        aypArray[1] = this.a.V().a(f7, 0.0, -f8);
        aypArray[2] = this.a.V().a(f7, 0.0, f8);
        aypArray[3] = this.a.V().a(-f7, 0.0, f8);
        aypArray[4] = this.a.V().a(-f7, f9, -f8);
        aypArray[5] = this.a.V().a(f7, f9, -f8);
        aypArray[6] = this.a.V().a(f7, f9, f8);
        aypArray[7] = this.a.V().a(-f7, f9, f8);
        for (int i2 = 0; i2 < 8; ++i2) {
            aypArray[i2].e += 0.0625;
            if (bl3) {
                aypArray[i2].a(0.5235988f);
                aypArray[i2].d -= 0.4375;
            } else if (bl2) {
                aypArray[i2].a(0.08726647f);
                aypArray[i2].d -= 0.4375;
            } else {
                aypArray[i2].a(-0.69813174f);
                aypArray[i2].d -= 0.375;
            }
            aypArray[i2].a(1.5707964f);
            if (n7 == 2) {
                aypArray[i2].b(0.0f);
            }
            if (n7 == 0) {
                aypArray[i2].b((float)Math.PI);
            }
            if (n7 == 1) {
                aypArray[i2].b(1.5707964f);
            }
            if (n7 == 3) {
                aypArray[i2].b(-1.5707964f);
            }
            aypArray[i2].c += (double)n2 + 0.5;
            aypArray[i2].d += (double)((float)n3 + 0.3125f);
            aypArray[i2].e += (double)n4 + 0.5;
        }
        ayp ayp2 = null;
        ayp ayp3 = null;
        ayp ayp4 = null;
        ayp ayp5 = null;
        int n8 = 7;
        int n9 = 9;
        int n10 = 9;
        int n11 = 16;
        for (int i3 = 0; i3 < 6; ++i3) {
            if (i3 == 0) {
                ayp2 = aypArray[0];
                ayp3 = aypArray[1];
                ayp4 = aypArray[2];
                ayp5 = aypArray[3];
                d2 = pw2.a(n8);
                d3 = pw2.b(n10);
                d4 = pw2.a(n9);
                d5 = pw2.b(n10 + 2);
            } else if (i3 == 1) {
                ayp2 = aypArray[7];
                ayp3 = aypArray[6];
                ayp4 = aypArray[5];
                ayp5 = aypArray[4];
            } else if (i3 == 2) {
                ayp2 = aypArray[1];
                ayp3 = aypArray[0];
                ayp4 = aypArray[4];
                ayp5 = aypArray[5];
                d2 = pw2.a(n8);
                d3 = pw2.b(n10);
                d4 = pw2.a(n9);
                d5 = pw2.b(n11);
            } else if (i3 == 3) {
                ayp2 = aypArray[2];
                ayp3 = aypArray[1];
                ayp4 = aypArray[5];
                ayp5 = aypArray[6];
            } else if (i3 == 4) {
                ayp2 = aypArray[3];
                ayp3 = aypArray[2];
                ayp4 = aypArray[6];
                ayp5 = aypArray[7];
            } else if (i3 == 5) {
                ayp2 = aypArray[0];
                ayp3 = aypArray[3];
                ayp4 = aypArray[7];
                ayp5 = aypArray[4];
            }
            bna2.a(ayp2.c, ayp2.d, ayp2.e, d2, d5);
            bna2.a(ayp3.c, ayp3.d, ayp3.e, d4, d5);
            bna2.a(ayp4.c, ayp4.d, ayp4.e, d4, d3);
            bna2.a(ayp5.c, ayp5.d, ayp5.e, d2, d3);
        }
        float f10 = 0.09375f;
        float f11 = 0.09375f;
        float f12 = 0.03125f;
        aypArray[0] = this.a.V().a(-f10, 0.0, -f11);
        aypArray[1] = this.a.V().a(f10, 0.0, -f11);
        aypArray[2] = this.a.V().a(f10, 0.0, f11);
        aypArray[3] = this.a.V().a(-f10, 0.0, f11);
        aypArray[4] = this.a.V().a(-f10, f12, -f11);
        aypArray[5] = this.a.V().a(f10, f12, -f11);
        aypArray[6] = this.a.V().a(f10, f12, f11);
        aypArray[7] = this.a.V().a(-f10, f12, f11);
        for (n5 = 0; n5 < 8; ++n5) {
            aypArray[n5].e += 0.21875;
            if (bl3) {
                aypArray[n5].d -= 0.09375;
                aypArray[n5].e -= 0.1625;
                aypArray[n5].a(0.0f);
            } else if (bl2) {
                aypArray[n5].d += 0.015625;
                aypArray[n5].e -= 0.171875;
                aypArray[n5].a(0.17453294f);
            } else {
                aypArray[n5].a(0.87266463f);
            }
            if (n7 == 2) {
                aypArray[n5].b(0.0f);
            }
            if (n7 == 0) {
                aypArray[n5].b((float)Math.PI);
            }
            if (n7 == 1) {
                aypArray[n5].b(1.5707964f);
            }
            if (n7 == 3) {
                aypArray[n5].b(-1.5707964f);
            }
            aypArray[n5].c += (double)n2 + 0.5;
            aypArray[n5].d += (double)((float)n3 + 0.3125f);
            aypArray[n5].e += (double)n4 + 0.5;
        }
        n5 = 5;
        int n12 = 11;
        int n13 = 3;
        int n14 = 9;
        for (int i4 = 0; i4 < 6; ++i4) {
            if (i4 == 0) {
                ayp2 = aypArray[0];
                ayp3 = aypArray[1];
                ayp4 = aypArray[2];
                ayp5 = aypArray[3];
                d2 = pw2.a(n5);
                d3 = pw2.b(n13);
                d4 = pw2.a(n12);
                d5 = pw2.b(n14);
            } else if (i4 == 1) {
                ayp2 = aypArray[7];
                ayp3 = aypArray[6];
                ayp4 = aypArray[5];
                ayp5 = aypArray[4];
            } else if (i4 == 2) {
                ayp2 = aypArray[1];
                ayp3 = aypArray[0];
                ayp4 = aypArray[4];
                ayp5 = aypArray[5];
                d2 = pw2.a(n5);
                d3 = pw2.b(n13);
                d4 = pw2.a(n12);
                d5 = pw2.b(n13 + 2);
            } else if (i4 == 3) {
                ayp2 = aypArray[2];
                ayp3 = aypArray[1];
                ayp4 = aypArray[5];
                ayp5 = aypArray[6];
            } else if (i4 == 4) {
                ayp2 = aypArray[3];
                ayp3 = aypArray[2];
                ayp4 = aypArray[6];
                ayp5 = aypArray[7];
            } else if (i4 == 5) {
                ayp2 = aypArray[0];
                ayp3 = aypArray[3];
                ayp4 = aypArray[7];
                ayp5 = aypArray[4];
            }
            bna2.a(ayp2.c, ayp2.d, ayp2.e, d2, d5);
            bna2.a(ayp3.c, ayp3.d, ayp3.e, d4, d5);
            bna2.a(ayp4.c, ayp4.d, ayp4.e, d4, d3);
            bna2.a(ayp5.c, ayp5.d, ayp5.e, d2, d3);
        }
        if (bl2) {
            double d6 = aypArray[0].d;
            float f13 = 0.03125f;
            float f14 = 0.5f - f13 / 2.0f;
            float f15 = f14 + f13;
            double d7 = pw2.c();
            double d8 = pw2.b(bl2 ? 2.0 : 0.0);
            double d9 = pw2.d();
            double d10 = pw2.b(bl2 ? 4.0 : 2.0);
            double d11 = (double)(bl4 ? 3.5f : 1.5f) / 16.0;
            bna2.b(0.75f, 0.75f, 0.75f);
            if (n7 == 2) {
                bna2.a((float)n2 + f14, (double)n3 + d11, (double)n4 + 0.25, d7, d8);
                bna2.a((float)n2 + f15, (double)n3 + d11, (double)n4 + 0.25, d7, d10);
                bna2.a((float)n2 + f15, (double)n3 + d11, n4, d9, d10);
                bna2.a((float)n2 + f14, (double)n3 + d11, n4, d9, d8);
                bna2.a((float)n2 + f14, d6, (double)n4 + 0.5, d7, d8);
                bna2.a((float)n2 + f15, d6, (double)n4 + 0.5, d7, d10);
                bna2.a((float)n2 + f15, (double)n3 + d11, (double)n4 + 0.25, d9, d10);
                bna2.a((float)n2 + f14, (double)n3 + d11, (double)n4 + 0.25, d9, d8);
            } else if (n7 == 0) {
                bna2.a((float)n2 + f14, (double)n3 + d11, (double)n4 + 0.75, d7, d8);
                bna2.a((float)n2 + f15, (double)n3 + d11, (double)n4 + 0.75, d7, d10);
                bna2.a((float)n2 + f15, d6, (double)n4 + 0.5, d9, d10);
                bna2.a((float)n2 + f14, d6, (double)n4 + 0.5, d9, d8);
                bna2.a((float)n2 + f14, (double)n3 + d11, n4 + 1, d7, d8);
                bna2.a((float)n2 + f15, (double)n3 + d11, n4 + 1, d7, d10);
                bna2.a((float)n2 + f15, (double)n3 + d11, (double)n4 + 0.75, d9, d10);
                bna2.a((float)n2 + f14, (double)n3 + d11, (double)n4 + 0.75, d9, d8);
            } else if (n7 == 1) {
                bna2.a(n2, (double)n3 + d11, (float)n4 + f15, d7, d10);
                bna2.a((double)n2 + 0.25, (double)n3 + d11, (float)n4 + f15, d9, d10);
                bna2.a((double)n2 + 0.25, (double)n3 + d11, (float)n4 + f14, d9, d8);
                bna2.a(n2, (double)n3 + d11, (float)n4 + f14, d7, d8);
                bna2.a((double)n2 + 0.25, (double)n3 + d11, (float)n4 + f15, d7, d10);
                bna2.a((double)n2 + 0.5, d6, (float)n4 + f15, d9, d10);
                bna2.a((double)n2 + 0.5, d6, (float)n4 + f14, d9, d8);
                bna2.a((double)n2 + 0.25, (double)n3 + d11, (float)n4 + f14, d7, d8);
            } else {
                bna2.a((double)n2 + 0.5, d6, (float)n4 + f15, d7, d10);
                bna2.a((double)n2 + 0.75, (double)n3 + d11, (float)n4 + f15, d9, d10);
                bna2.a((double)n2 + 0.75, (double)n3 + d11, (float)n4 + f14, d9, d8);
                bna2.a((double)n2 + 0.5, d6, (float)n4 + f14, d7, d8);
                bna2.a((double)n2 + 0.75, (double)n3 + d11, (float)n4 + f15, d7, d10);
                bna2.a(n2 + 1, (double)n3 + d11, (float)n4 + f15, d9, d10);
                bna2.a(n2 + 1, (double)n3 + d11, (float)n4 + f14, d9, d8);
                bna2.a((double)n2 + 0.75, (double)n3 + d11, (float)n4 + f14, d7, d8);
            }
        }
        return true;
    }

    public boolean g(ahz ahz2, int n2, int n3, int n4) {
        boolean bl2;
        bna bna2 = bna.a;
        pw pw2 = this.a(ahz2, 0);
        int n5 = this.a.e(n2, n3, n4);
        boolean bl3 = (n5 & 4) == 4;
        boolean bl4 = bl2 = (n5 & 2) == 2;
        if (this.b()) {
            pw2 = this.d;
        }
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        double d2 = pw2.c();
        double d3 = pw2.b(bl3 ? 2.0 : 0.0);
        double d4 = pw2.d();
        double d5 = pw2.b(bl3 ? 4.0 : 2.0);
        double d6 = (double)(bl2 ? 3.5f : 1.5f) / 16.0;
        boolean bl5 = amw.a(this.a, n2, n3, n4, n5, 1);
        boolean bl6 = amw.a(this.a, n2, n3, n4, n5, 3);
        boolean bl7 = amw.a(this.a, n2, n3, n4, n5, 2);
        boolean bl8 = amw.a(this.a, n2, n3, n4, n5, 0);
        float f2 = 0.03125f;
        float f3 = 0.5f - f2 / 2.0f;
        float f4 = f3 + f2;
        if (!(bl7 || bl6 || bl8 || bl5)) {
            bl7 = true;
            bl8 = true;
        }
        if (bl7) {
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.25, d2, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.25, d2, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, n4, d4, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, n4, d4, d3);
            bna2.a((float)n2 + f3, (double)n3 + d6, n4, d4, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, n4, d4, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.25, d2, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.25, d2, d3);
        }
        if (bl7 || bl8 && !bl6 && !bl5) {
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.5, d2, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.5, d2, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.25, d4, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.25, d4, d3);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.25, d4, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.25, d4, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.5, d2, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.5, d2, d3);
        }
        if (bl8 || bl7 && !bl6 && !bl5) {
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.75, d2, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.75, d2, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.5, d4, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.5, d4, d3);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.5, d4, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.5, d4, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.75, d2, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.75, d2, d3);
        }
        if (bl8) {
            bna2.a((float)n2 + f3, (double)n3 + d6, n4 + 1, d2, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, n4 + 1, d2, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.75, d4, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.75, d4, d3);
            bna2.a((float)n2 + f3, (double)n3 + d6, (double)n4 + 0.75, d4, d3);
            bna2.a((float)n2 + f4, (double)n3 + d6, (double)n4 + 0.75, d4, d5);
            bna2.a((float)n2 + f4, (double)n3 + d6, n4 + 1, d2, d5);
            bna2.a((float)n2 + f3, (double)n3 + d6, n4 + 1, d2, d3);
        }
        if (bl5) {
            bna2.a(n2, (double)n3 + d6, (float)n4 + f4, d2, d5);
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a(n2, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a(n2, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a(n2, (double)n3 + d6, (float)n4 + f4, d2, d5);
        }
        if (bl5 || bl6 && !bl7 && !bl8) {
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f4, d2, d5);
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a((double)n2 + 0.25, (double)n3 + d6, (float)n4 + f4, d2, d5);
        }
        if (bl6 || bl5 && !bl7 && !bl8) {
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f4, d2, d5);
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a((double)n2 + 0.5, (double)n3 + d6, (float)n4 + f4, d2, d5);
        }
        if (bl6) {
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f4, d2, d5);
            bna2.a(n2 + 1, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a(n2 + 1, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f3, d2, d3);
            bna2.a(n2 + 1, (double)n3 + d6, (float)n4 + f3, d4, d3);
            bna2.a(n2 + 1, (double)n3 + d6, (float)n4 + f4, d4, d5);
            bna2.a((double)n2 + 0.75, (double)n3 + d6, (float)n4 + f4, d2, d5);
        }
        return true;
    }

    public boolean a(ajs ajs2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        pw pw2 = ajs2.c(0);
        pw pw3 = ajs2.c(1);
        pw pw4 = pw2;
        if (this.b()) {
            pw4 = this.d;
        }
        bna2.b(1.0f, 1.0f, 1.0f);
        bna2.b(ajs2.c(this.a, n2, n3, n4));
        double d2 = pw4.c();
        double d3 = pw4.e();
        double d4 = pw4.d();
        double d5 = pw4.f();
        float f2 = 1.4f;
        if (afs.a(this.a, n2, n3 - 1, n4) || aie.ab.e(this.a, n2, n3 - 1, n4)) {
            double d6 = (double)n2 + 0.5 + 0.2;
            double d7 = (double)n2 + 0.5 - 0.2;
            double d8 = (double)n4 + 0.5 + 0.2;
            double d9 = (double)n4 + 0.5 - 0.2;
            double d10 = (double)n2 + 0.5 - 0.3;
            double d11 = (double)n2 + 0.5 + 0.3;
            double d12 = (double)n4 + 0.5 - 0.3;
            double d13 = (double)n4 + 0.5 + 0.3;
            bna2.a(d10, (float)n3 + f2, n4 + 1, d4, d3);
            bna2.a(d6, n3 + 0, n4 + 1, d4, d5);
            bna2.a(d6, n3 + 0, n4 + 0, d2, d5);
            bna2.a(d10, (float)n3 + f2, n4 + 0, d2, d3);
            bna2.a(d11, (float)n3 + f2, n4 + 0, d4, d3);
            bna2.a(d7, n3 + 0, n4 + 0, d4, d5);
            bna2.a(d7, n3 + 0, n4 + 1, d2, d5);
            bna2.a(d11, (float)n3 + f2, n4 + 1, d2, d3);
            pw4 = pw3;
            d2 = pw4.c();
            d3 = pw4.e();
            d4 = pw4.d();
            d5 = pw4.f();
            bna2.a(n2 + 1, (float)n3 + f2, d13, d4, d3);
            bna2.a(n2 + 1, n3 + 0, d9, d4, d5);
            bna2.a(n2 + 0, n3 + 0, d9, d2, d5);
            bna2.a(n2 + 0, (float)n3 + f2, d13, d2, d3);
            bna2.a(n2 + 0, (float)n3 + f2, d12, d4, d3);
            bna2.a(n2 + 0, n3 + 0, d8, d4, d5);
            bna2.a(n2 + 1, n3 + 0, d8, d2, d5);
            bna2.a(n2 + 1, (float)n3 + f2, d12, d2, d3);
            d6 = (double)n2 + 0.5 - 0.5;
            d7 = (double)n2 + 0.5 + 0.5;
            d8 = (double)n4 + 0.5 - 0.5;
            d9 = (double)n4 + 0.5 + 0.5;
            d10 = (double)n2 + 0.5 - 0.4;
            d11 = (double)n2 + 0.5 + 0.4;
            d12 = (double)n4 + 0.5 - 0.4;
            d13 = (double)n4 + 0.5 + 0.4;
            bna2.a(d10, (float)n3 + f2, n4 + 0, d2, d3);
            bna2.a(d6, n3 + 0, n4 + 0, d2, d5);
            bna2.a(d6, n3 + 0, n4 + 1, d4, d5);
            bna2.a(d10, (float)n3 + f2, n4 + 1, d4, d3);
            bna2.a(d11, (float)n3 + f2, n4 + 1, d2, d3);
            bna2.a(d7, n3 + 0, n4 + 1, d2, d5);
            bna2.a(d7, n3 + 0, n4 + 0, d4, d5);
            bna2.a(d11, (float)n3 + f2, n4 + 0, d4, d3);
            pw4 = pw2;
            d2 = pw4.c();
            d3 = pw4.e();
            d4 = pw4.d();
            d5 = pw4.f();
            bna2.a(n2 + 0, (float)n3 + f2, d13, d2, d3);
            bna2.a(n2 + 0, n3 + 0, d9, d2, d5);
            bna2.a(n2 + 1, n3 + 0, d9, d4, d5);
            bna2.a(n2 + 1, (float)n3 + f2, d13, d4, d3);
            bna2.a(n2 + 1, (float)n3 + f2, d12, d2, d3);
            bna2.a(n2 + 1, n3 + 0, d8, d2, d5);
            bna2.a(n2 + 0, n3 + 0, d8, d4, d5);
            bna2.a(n2 + 0, (float)n3 + f2, d12, d4, d3);
        } else {
            double d14;
            float f3 = 0.2f;
            float f4 = 0.0625f;
            if ((n2 + n3 + n4 & 1) == 1) {
                pw4 = pw3;
                d2 = pw4.c();
                d3 = pw4.e();
                d4 = pw4.d();
                d5 = pw4.f();
            }
            if ((n2 / 2 + n3 / 2 + n4 / 2 & 1) == 1) {
                d14 = d4;
                d4 = d2;
                d2 = d14;
            }
            if (aie.ab.e(this.a, n2 - 1, n3, n4)) {
                bna2.a((float)n2 + f3, (float)n3 + f2 + f4, n4 + 1, d4, d3);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 1, d4, d5);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 0, d2, d5);
                bna2.a((float)n2 + f3, (float)n3 + f2 + f4, n4 + 0, d2, d3);
                bna2.a((float)n2 + f3, (float)n3 + f2 + f4, n4 + 0, d2, d3);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 0, d2, d5);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 1, d4, d5);
                bna2.a((float)n2 + f3, (float)n3 + f2 + f4, n4 + 1, d4, d3);
            }
            if (aie.ab.e(this.a, n2 + 1, n3, n4)) {
                bna2.a((float)(n2 + 1) - f3, (float)n3 + f2 + f4, n4 + 0, d2, d3);
                bna2.a(n2 + 1 - 0, (float)(n3 + 0) + f4, n4 + 0, d2, d5);
                bna2.a(n2 + 1 - 0, (float)(n3 + 0) + f4, n4 + 1, d4, d5);
                bna2.a((float)(n2 + 1) - f3, (float)n3 + f2 + f4, n4 + 1, d4, d3);
                bna2.a((float)(n2 + 1) - f3, (float)n3 + f2 + f4, n4 + 1, d4, d3);
                bna2.a(n2 + 1 - 0, (float)(n3 + 0) + f4, n4 + 1, d4, d5);
                bna2.a(n2 + 1 - 0, (float)(n3 + 0) + f4, n4 + 0, d2, d5);
                bna2.a((float)(n2 + 1) - f3, (float)n3 + f2 + f4, n4 + 0, d2, d3);
            }
            if (aie.ab.e(this.a, n2, n3, n4 - 1)) {
                bna2.a(n2 + 0, (float)n3 + f2 + f4, (float)n4 + f3, d4, d3);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 0, d4, d5);
                bna2.a(n2 + 1, (float)(n3 + 0) + f4, n4 + 0, d2, d5);
                bna2.a(n2 + 1, (float)n3 + f2 + f4, (float)n4 + f3, d2, d3);
                bna2.a(n2 + 1, (float)n3 + f2 + f4, (float)n4 + f3, d2, d3);
                bna2.a(n2 + 1, (float)(n3 + 0) + f4, n4 + 0, d2, d5);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 0, d4, d5);
                bna2.a(n2 + 0, (float)n3 + f2 + f4, (float)n4 + f3, d4, d3);
            }
            if (aie.ab.e(this.a, n2, n3, n4 + 1)) {
                bna2.a(n2 + 1, (float)n3 + f2 + f4, (float)(n4 + 1) - f3, d2, d3);
                bna2.a(n2 + 1, (float)(n3 + 0) + f4, n4 + 1 - 0, d2, d5);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 1 - 0, d4, d5);
                bna2.a(n2 + 0, (float)n3 + f2 + f4, (float)(n4 + 1) - f3, d4, d3);
                bna2.a(n2 + 0, (float)n3 + f2 + f4, (float)(n4 + 1) - f3, d4, d3);
                bna2.a(n2 + 0, (float)(n3 + 0) + f4, n4 + 1 - 0, d4, d5);
                bna2.a(n2 + 1, (float)(n3 + 0) + f4, n4 + 1 - 0, d2, d5);
                bna2.a(n2 + 1, (float)n3 + f2 + f4, (float)(n4 + 1) - f3, d2, d3);
            }
            if (aie.ab.e(this.a, n2, n3 + 1, n4)) {
                d14 = (double)n2 + 0.5 + 0.5;
                double d15 = (double)n2 + 0.5 - 0.5;
                double d16 = (double)n4 + 0.5 + 0.5;
                double d17 = (double)n4 + 0.5 - 0.5;
                double d18 = (double)n2 + 0.5 - 0.5;
                double d19 = (double)n2 + 0.5 + 0.5;
                double d20 = (double)n4 + 0.5 - 0.5;
                double d21 = (double)n4 + 0.5 + 0.5;
                pw4 = pw2;
                d2 = pw4.c();
                d3 = pw4.e();
                d4 = pw4.d();
                d5 = pw4.f();
                f2 = -0.2f;
                if ((n2 + ++n3 + n4 & 1) == 0) {
                    bna2.a(d18, (float)n3 + f2, n4 + 0, d4, d3);
                    bna2.a(d14, n3 + 0, n4 + 0, d4, d5);
                    bna2.a(d14, n3 + 0, n4 + 1, d2, d5);
                    bna2.a(d18, (float)n3 + f2, n4 + 1, d2, d3);
                    pw4 = pw3;
                    d2 = pw4.c();
                    d3 = pw4.e();
                    d4 = pw4.d();
                    d5 = pw4.f();
                    bna2.a(d19, (float)n3 + f2, n4 + 1, d4, d3);
                    bna2.a(d15, n3 + 0, n4 + 1, d4, d5);
                    bna2.a(d15, n3 + 0, n4 + 0, d2, d5);
                    bna2.a(d19, (float)n3 + f2, n4 + 0, d2, d3);
                } else {
                    bna2.a(n2 + 0, (float)n3 + f2, d21, d4, d3);
                    bna2.a(n2 + 0, n3 + 0, d17, d4, d5);
                    bna2.a(n2 + 1, n3 + 0, d17, d2, d5);
                    bna2.a(n2 + 1, (float)n3 + f2, d21, d2, d3);
                    pw4 = pw3;
                    d2 = pw4.c();
                    d3 = pw4.e();
                    d4 = pw4.d();
                    d5 = pw4.f();
                    bna2.a(n2 + 1, (float)n3 + f2, d20, d4, d3);
                    bna2.a(n2 + 1, n3 + 0, d16, d4, d5);
                    bna2.a(n2 + 0, n3 + 0, d16, d2, d5);
                    bna2.a(n2 + 0, (float)n3 + f2, d20, d2, d3);
                }
            }
        }
        return true;
    }

    public boolean h(ahz ahz2, int n2, int n3, int n4) {
        boolean bl2;
        bna bna2 = bna.a;
        int n5 = this.a.e(n2, n3, n4);
        pw pw2 = alr.e("cross");
        pw pw3 = alr.e("line");
        pw pw4 = alr.e("cross_overlay");
        pw pw5 = alr.e("line_overlay");
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        float f2 = (float)n5 / 15.0f;
        float f3 = f2 * 0.6f + 0.4f;
        if (n5 == 0) {
            f3 = 0.3f;
        }
        float f4 = f2 * f2 * 0.7f - 0.5f;
        float f5 = f2 * f2 * 0.6f - 0.7f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        bna2.b(f3, f4, f5);
        double d2 = 0.015625;
        double d3 = 0.015625;
        boolean bl3 = alr.f(this.a, n2 - 1, n3, n4, 1) || !this.a.a(n2 - 1, n3, n4).q() && alr.f(this.a, n2 - 1, n3 - 1, n4, -1);
        boolean bl4 = alr.f(this.a, n2 + 1, n3, n4, 3) || !this.a.a(n2 + 1, n3, n4).q() && alr.f(this.a, n2 + 1, n3 - 1, n4, -1);
        boolean bl5 = alr.f(this.a, n2, n3, n4 - 1, 2) || !this.a.a(n2, n3, n4 - 1).q() && alr.f(this.a, n2, n3 - 1, n4 - 1, -1);
        boolean bl6 = bl2 = alr.f(this.a, n2, n3, n4 + 1, 0) || !this.a.a(n2, n3, n4 + 1).q() && alr.f(this.a, n2, n3 - 1, n4 + 1, -1);
        if (!this.a.a(n2, n3 + 1, n4).q()) {
            if (this.a.a(n2 - 1, n3, n4).q() && alr.f(this.a, n2 - 1, n3 + 1, n4, -1)) {
                bl3 = true;
            }
            if (this.a.a(n2 + 1, n3, n4).q() && alr.f(this.a, n2 + 1, n3 + 1, n4, -1)) {
                bl4 = true;
            }
            if (this.a.a(n2, n3, n4 - 1).q() && alr.f(this.a, n2, n3 + 1, n4 - 1, -1)) {
                bl5 = true;
            }
            if (this.a.a(n2, n3, n4 + 1).q() && alr.f(this.a, n2, n3 + 1, n4 + 1, -1)) {
                bl2 = true;
            }
        }
        float f6 = n2 + 0;
        float f7 = n2 + 1;
        float f8 = n4 + 0;
        float f9 = n4 + 1;
        int n6 = 0;
        if ((bl3 || bl4) && !bl5 && !bl2) {
            n6 = 1;
        }
        if ((bl5 || bl2) && !bl4 && !bl3) {
            n6 = 2;
        }
        if (n6 == 0) {
            int n7 = 0;
            int n8 = 0;
            int n9 = 16;
            int n10 = 16;
            int n11 = 5;
            if (!bl3) {
                f6 += 0.3125f;
            }
            if (!bl3) {
                n7 += 5;
            }
            if (!bl4) {
                f7 -= 0.3125f;
            }
            if (!bl4) {
                n9 -= 5;
            }
            if (!bl5) {
                f8 += 0.3125f;
            }
            if (!bl5) {
                n8 += 5;
            }
            if (!bl2) {
                f9 -= 0.3125f;
            }
            if (!bl2) {
                n10 -= 5;
            }
            bna2.a(f7, (double)n3 + 0.015625, f9, pw2.a(n9), pw2.b(n10));
            bna2.a(f7, (double)n3 + 0.015625, f8, pw2.a(n9), pw2.b(n8));
            bna2.a(f6, (double)n3 + 0.015625, f8, pw2.a(n7), pw2.b(n8));
            bna2.a(f6, (double)n3 + 0.015625, f9, pw2.a(n7), pw2.b(n10));
            bna2.b(1.0f, 1.0f, 1.0f);
            bna2.a(f7, (double)n3 + 0.015625, f9, pw4.a(n9), pw4.b(n10));
            bna2.a(f7, (double)n3 + 0.015625, f8, pw4.a(n9), pw4.b(n8));
            bna2.a(f6, (double)n3 + 0.015625, f8, pw4.a(n7), pw4.b(n8));
            bna2.a(f6, (double)n3 + 0.015625, f9, pw4.a(n7), pw4.b(n10));
        } else if (n6 == 1) {
            bna2.a(f7, (double)n3 + 0.015625, f9, pw3.d(), pw3.f());
            bna2.a(f7, (double)n3 + 0.015625, f8, pw3.d(), pw3.e());
            bna2.a(f6, (double)n3 + 0.015625, f8, pw3.c(), pw3.e());
            bna2.a(f6, (double)n3 + 0.015625, f9, pw3.c(), pw3.f());
            bna2.b(1.0f, 1.0f, 1.0f);
            bna2.a(f7, (double)n3 + 0.015625, f9, pw5.d(), pw5.f());
            bna2.a(f7, (double)n3 + 0.015625, f8, pw5.d(), pw5.e());
            bna2.a(f6, (double)n3 + 0.015625, f8, pw5.c(), pw5.e());
            bna2.a(f6, (double)n3 + 0.015625, f9, pw5.c(), pw5.f());
        } else {
            bna2.a(f7, (double)n3 + 0.015625, f9, pw3.d(), pw3.f());
            bna2.a(f7, (double)n3 + 0.015625, f8, pw3.c(), pw3.f());
            bna2.a(f6, (double)n3 + 0.015625, f8, pw3.c(), pw3.e());
            bna2.a(f6, (double)n3 + 0.015625, f9, pw3.d(), pw3.e());
            bna2.b(1.0f, 1.0f, 1.0f);
            bna2.a(f7, (double)n3 + 0.015625, f9, pw5.d(), pw5.f());
            bna2.a(f7, (double)n3 + 0.015625, f8, pw5.c(), pw5.f());
            bna2.a(f6, (double)n3 + 0.015625, f8, pw5.c(), pw5.e());
            bna2.a(f6, (double)n3 + 0.015625, f9, pw5.d(), pw5.e());
        }
        if (!this.a.a(n2, n3 + 1, n4).q()) {
            float f10 = 0.021875f;
            if (this.a.a(n2 - 1, n3, n4).q() && this.a.a(n2 - 1, n3 + 1, n4) == aie.af) {
                bna2.b(f3, f4, f5);
                bna2.a((double)n2 + 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 1, pw3.d(), pw3.e());
                bna2.a((double)n2 + 0.015625, n3 + 0, n4 + 1, pw3.c(), pw3.e());
                bna2.a((double)n2 + 0.015625, n3 + 0, n4 + 0, pw3.c(), pw3.f());
                bna2.a((double)n2 + 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 0, pw3.d(), pw3.f());
                bna2.b(1.0f, 1.0f, 1.0f);
                bna2.a((double)n2 + 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 1, pw5.d(), pw5.e());
                bna2.a((double)n2 + 0.015625, n3 + 0, n4 + 1, pw5.c(), pw5.e());
                bna2.a((double)n2 + 0.015625, n3 + 0, n4 + 0, pw5.c(), pw5.f());
                bna2.a((double)n2 + 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 0, pw5.d(), pw5.f());
            }
            if (this.a.a(n2 + 1, n3, n4).q() && this.a.a(n2 + 1, n3 + 1, n4) == aie.af) {
                bna2.b(f3, f4, f5);
                bna2.a((double)(n2 + 1) - 0.015625, n3 + 0, n4 + 1, pw3.c(), pw3.f());
                bna2.a((double)(n2 + 1) - 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 1, pw3.d(), pw3.f());
                bna2.a((double)(n2 + 1) - 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 0, pw3.d(), pw3.e());
                bna2.a((double)(n2 + 1) - 0.015625, n3 + 0, n4 + 0, pw3.c(), pw3.e());
                bna2.b(1.0f, 1.0f, 1.0f);
                bna2.a((double)(n2 + 1) - 0.015625, n3 + 0, n4 + 1, pw5.c(), pw5.f());
                bna2.a((double)(n2 + 1) - 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 1, pw5.d(), pw5.f());
                bna2.a((double)(n2 + 1) - 0.015625, (float)(n3 + 1) + 0.021875f, n4 + 0, pw5.d(), pw5.e());
                bna2.a((double)(n2 + 1) - 0.015625, n3 + 0, n4 + 0, pw5.c(), pw5.e());
            }
            if (this.a.a(n2, n3, n4 - 1).q() && this.a.a(n2, n3 + 1, n4 - 1) == aie.af) {
                bna2.b(f3, f4, f5);
                bna2.a(n2 + 1, n3 + 0, (double)n4 + 0.015625, pw3.c(), pw3.f());
                bna2.a(n2 + 1, (float)(n3 + 1) + 0.021875f, (double)n4 + 0.015625, pw3.d(), pw3.f());
                bna2.a(n2 + 0, (float)(n3 + 1) + 0.021875f, (double)n4 + 0.015625, pw3.d(), pw3.e());
                bna2.a(n2 + 0, n3 + 0, (double)n4 + 0.015625, pw3.c(), pw3.e());
                bna2.b(1.0f, 1.0f, 1.0f);
                bna2.a(n2 + 1, n3 + 0, (double)n4 + 0.015625, pw5.c(), pw5.f());
                bna2.a(n2 + 1, (float)(n3 + 1) + 0.021875f, (double)n4 + 0.015625, pw5.d(), pw5.f());
                bna2.a(n2 + 0, (float)(n3 + 1) + 0.021875f, (double)n4 + 0.015625, pw5.d(), pw5.e());
                bna2.a(n2 + 0, n3 + 0, (double)n4 + 0.015625, pw5.c(), pw5.e());
            }
            if (this.a.a(n2, n3, n4 + 1).q() && this.a.a(n2, n3 + 1, n4 + 1) == aie.af) {
                bna2.b(f3, f4, f5);
                bna2.a(n2 + 1, (float)(n3 + 1) + 0.021875f, (double)(n4 + 1) - 0.015625, pw3.d(), pw3.e());
                bna2.a(n2 + 1, n3 + 0, (double)(n4 + 1) - 0.015625, pw3.c(), pw3.e());
                bna2.a(n2 + 0, n3 + 0, (double)(n4 + 1) - 0.015625, pw3.c(), pw3.f());
                bna2.a(n2 + 0, (float)(n3 + 1) + 0.021875f, (double)(n4 + 1) - 0.015625, pw3.d(), pw3.f());
                bna2.b(1.0f, 1.0f, 1.0f);
                bna2.a(n2 + 1, (float)(n3 + 1) + 0.021875f, (double)(n4 + 1) - 0.015625, pw5.d(), pw5.e());
                bna2.a(n2 + 1, n3 + 0, (double)(n4 + 1) - 0.015625, pw5.c(), pw5.e());
                bna2.a(n2 + 0, n3 + 0, (double)(n4 + 1) - 0.015625, pw5.c(), pw5.f());
                bna2.a(n2 + 0, (float)(n3 + 1) + 0.021875f, (double)(n4 + 1) - 0.015625, pw5.d(), pw5.f());
            }
        }
        return true;
    }

    public boolean a(ahv ahv2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        int n5 = this.a.e(n2, n3, n4);
        pw pw2 = this.a((ahz)ahv2, 0, n5);
        if (this.b()) {
            pw2 = this.d;
        }
        if (ahv2.e()) {
            n5 &= 7;
        }
        bna2.b(ahv2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        double d2 = pw2.c();
        double d3 = pw2.e();
        double d4 = pw2.d();
        double d5 = pw2.f();
        double d6 = 0.0625;
        double d7 = n2 + 1;
        double d8 = n2 + 1;
        double d9 = n2 + 0;
        double d10 = n2 + 0;
        double d11 = n4 + 0;
        double d12 = n4 + 1;
        double d13 = n4 + 1;
        double d14 = n4 + 0;
        double d15 = (double)n3 + d6;
        double d16 = (double)n3 + d6;
        double d17 = (double)n3 + d6;
        double d18 = (double)n3 + d6;
        if (n5 == 1 || n5 == 2 || n5 == 3 || n5 == 7) {
            d7 = d10 = (double)(n2 + 1);
            d8 = d9 = (double)(n2 + 0);
            d11 = d12 = (double)(n4 + 1);
            d13 = d14 = (double)(n4 + 0);
        } else if (n5 == 8) {
            d7 = d8 = (double)(n2 + 0);
            d9 = d10 = (double)(n2 + 1);
            d11 = d14 = (double)(n4 + 1);
            d12 = d13 = (double)(n4 + 0);
        } else if (n5 == 9) {
            d7 = d10 = (double)(n2 + 0);
            d8 = d9 = (double)(n2 + 1);
            d11 = d12 = (double)(n4 + 0);
            d13 = d14 = (double)(n4 + 1);
        }
        if (n5 == 2 || n5 == 4) {
            d15 += 1.0;
            d18 += 1.0;
        } else if (n5 == 3 || n5 == 5) {
            d16 += 1.0;
            d17 += 1.0;
        }
        bna2.a(d7, d15, d11, d4, d3);
        bna2.a(d8, d16, d12, d4, d5);
        bna2.a(d9, d17, d13, d2, d5);
        bna2.a(d10, d18, d14, d2, d3);
        bna2.a(d10, d18, d14, d2, d3);
        bna2.a(d9, d17, d13, d2, d5);
        bna2.a(d8, d16, d12, d4, d5);
        bna2.a(d7, d15, d11, d4, d3);
        return true;
    }

    public boolean i(ahz ahz2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        pw pw2 = this.a(ahz2, 0);
        if (this.b()) {
            pw2 = this.d;
        }
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        double d2 = pw2.c();
        double d3 = pw2.e();
        double d4 = pw2.d();
        double d5 = pw2.f();
        int n5 = this.a.e(n2, n3, n4);
        double d6 = 0.0;
        double d7 = 0.05f;
        if (n5 == 5) {
            bna2.a((double)n2 + d7, (double)(n3 + 1) + d6, (double)(n4 + 1) + d6, d2, d3);
            bna2.a((double)n2 + d7, (double)(n3 + 0) - d6, (double)(n4 + 1) + d6, d2, d5);
            bna2.a((double)n2 + d7, (double)(n3 + 0) - d6, (double)(n4 + 0) - d6, d4, d5);
            bna2.a((double)n2 + d7, (double)(n3 + 1) + d6, (double)(n4 + 0) - d6, d4, d3);
        }
        if (n5 == 4) {
            bna2.a((double)(n2 + 1) - d7, (double)(n3 + 0) - d6, (double)(n4 + 1) + d6, d4, d5);
            bna2.a((double)(n2 + 1) - d7, (double)(n3 + 1) + d6, (double)(n4 + 1) + d6, d4, d3);
            bna2.a((double)(n2 + 1) - d7, (double)(n3 + 1) + d6, (double)(n4 + 0) - d6, d2, d3);
            bna2.a((double)(n2 + 1) - d7, (double)(n3 + 0) - d6, (double)(n4 + 0) - d6, d2, d5);
        }
        if (n5 == 3) {
            bna2.a((double)(n2 + 1) + d6, (double)(n3 + 0) - d6, (double)n4 + d7, d4, d5);
            bna2.a((double)(n2 + 1) + d6, (double)(n3 + 1) + d6, (double)n4 + d7, d4, d3);
            bna2.a((double)(n2 + 0) - d6, (double)(n3 + 1) + d6, (double)n4 + d7, d2, d3);
            bna2.a((double)(n2 + 0) - d6, (double)(n3 + 0) - d6, (double)n4 + d7, d2, d5);
        }
        if (n5 == 2) {
            bna2.a((double)(n2 + 1) + d6, (double)(n3 + 1) + d6, (double)(n4 + 1) - d7, d2, d3);
            bna2.a((double)(n2 + 1) + d6, (double)(n3 + 0) - d6, (double)(n4 + 1) - d7, d2, d5);
            bna2.a((double)(n2 + 0) - d6, (double)(n3 + 0) - d6, (double)(n4 + 1) - d7, d4, d5);
            bna2.a((double)(n2 + 0) - d6, (double)(n3 + 1) + d6, (double)(n4 + 1) - d7, d4, d3);
        }
        return true;
    }

    public boolean j(ahz ahz2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        pw pw2 = this.a(ahz2, 0);
        if (this.b()) {
            pw2 = this.d;
        }
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        int n5 = ahz2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        bna2.b(f2, f3, f4);
        double d2 = pw2.c();
        double d3 = pw2.e();
        double d4 = pw2.d();
        double d5 = pw2.f();
        double d6 = 0.05f;
        int n6 = this.a.e(n2, n3, n4);
        if ((n6 & 2) != 0) {
            bna2.a((double)n2 + d6, n3 + 1, n4 + 1, d2, d3);
            bna2.a((double)n2 + d6, n3 + 0, n4 + 1, d2, d5);
            bna2.a((double)n2 + d6, n3 + 0, n4 + 0, d4, d5);
            bna2.a((double)n2 + d6, n3 + 1, n4 + 0, d4, d3);
            bna2.a((double)n2 + d6, n3 + 1, n4 + 0, d4, d3);
            bna2.a((double)n2 + d6, n3 + 0, n4 + 0, d4, d5);
            bna2.a((double)n2 + d6, n3 + 0, n4 + 1, d2, d5);
            bna2.a((double)n2 + d6, n3 + 1, n4 + 1, d2, d3);
        }
        if ((n6 & 8) != 0) {
            bna2.a((double)(n2 + 1) - d6, n3 + 0, n4 + 1, d4, d5);
            bna2.a((double)(n2 + 1) - d6, n3 + 1, n4 + 1, d4, d3);
            bna2.a((double)(n2 + 1) - d6, n3 + 1, n4 + 0, d2, d3);
            bna2.a((double)(n2 + 1) - d6, n3 + 0, n4 + 0, d2, d5);
            bna2.a((double)(n2 + 1) - d6, n3 + 0, n4 + 0, d2, d5);
            bna2.a((double)(n2 + 1) - d6, n3 + 1, n4 + 0, d2, d3);
            bna2.a((double)(n2 + 1) - d6, n3 + 1, n4 + 1, d4, d3);
            bna2.a((double)(n2 + 1) - d6, n3 + 0, n4 + 1, d4, d5);
        }
        if ((n6 & 4) != 0) {
            bna2.a(n2 + 1, n3 + 0, (double)n4 + d6, d4, d5);
            bna2.a(n2 + 1, n3 + 1, (double)n4 + d6, d4, d3);
            bna2.a(n2 + 0, n3 + 1, (double)n4 + d6, d2, d3);
            bna2.a(n2 + 0, n3 + 0, (double)n4 + d6, d2, d5);
            bna2.a(n2 + 0, n3 + 0, (double)n4 + d6, d2, d5);
            bna2.a(n2 + 0, n3 + 1, (double)n4 + d6, d2, d3);
            bna2.a(n2 + 1, n3 + 1, (double)n4 + d6, d4, d3);
            bna2.a(n2 + 1, n3 + 0, (double)n4 + d6, d4, d5);
        }
        if ((n6 & 1) != 0) {
            bna2.a(n2 + 1, n3 + 1, (double)(n4 + 1) - d6, d2, d3);
            bna2.a(n2 + 1, n3 + 0, (double)(n4 + 1) - d6, d2, d5);
            bna2.a(n2 + 0, n3 + 0, (double)(n4 + 1) - d6, d4, d5);
            bna2.a(n2 + 0, n3 + 1, (double)(n4 + 1) - d6, d4, d3);
            bna2.a(n2 + 0, n3 + 1, (double)(n4 + 1) - d6, d4, d3);
            bna2.a(n2 + 0, n3 + 0, (double)(n4 + 1) - d6, d4, d5);
            bna2.a(n2 + 1, n3 + 0, (double)(n4 + 1) - d6, d2, d5);
            bna2.a(n2 + 1, n3 + 1, (double)(n4 + 1) - d6, d2, d3);
        }
        if (this.a.a(n2, n3 + 1, n4).q()) {
            bna2.a(n2 + 1, (double)(n3 + 1) - d6, n4 + 0, d2, d3);
            bna2.a(n2 + 1, (double)(n3 + 1) - d6, n4 + 1, d2, d5);
            bna2.a(n2 + 0, (double)(n3 + 1) - d6, n4 + 1, d4, d5);
            bna2.a(n2 + 0, (double)(n3 + 1) - d6, n4 + 0, d4, d3);
        }
        return true;
    }

    public boolean k(ahz ahz2, int n2, int n3, int n4) {
        boolean bl2;
        pw pw2;
        pw pw3;
        int n5 = this.a.R();
        bna bna2 = bna.a;
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        int n6 = ahz2.d(this.a, n2, n3, n4);
        float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n6 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        boolean bl3 = ahz2 instanceof ami;
        if (this.b()) {
            pw3 = this.d;
            pw2 = this.d;
        } else {
            int n7 = this.a.e(n2, n3, n4);
            pw3 = this.a(ahz2, 0, n7);
            pw2 = bl3 ? ((ami)ahz2).b(n7) : ((amr)ahz2).e();
        }
        double d2 = pw3.c();
        double d3 = pw3.a(7.0);
        double d4 = pw3.a(9.0);
        double d5 = pw3.d();
        double d6 = pw3.e();
        double d7 = pw3.f();
        double d8 = pw2.a(7.0);
        double d9 = pw2.a(9.0);
        double d10 = pw2.e();
        double d11 = pw2.f();
        double d12 = pw2.b(7.0);
        double d13 = pw2.b(9.0);
        double d14 = n2;
        double d15 = n2 + 1;
        double d16 = n4;
        double d17 = n4 + 1;
        double d18 = (double)n2 + 0.5 - 0.0625;
        double d19 = (double)n2 + 0.5 + 0.0625;
        double d20 = (double)n4 + 0.5 - 0.0625;
        double d21 = (double)n4 + 0.5 + 0.0625;
        boolean bl4 = bl3 ? ((ami)ahz2).a(this.a.a(n2, n3, n4 - 1)) : ((amr)ahz2).a(this.a.a(n2, n3, n4 - 1));
        boolean bl5 = bl3 ? ((ami)ahz2).a(this.a.a(n2, n3, n4 + 1)) : ((amr)ahz2).a(this.a.a(n2, n3, n4 + 1));
        boolean bl6 = bl3 ? ((ami)ahz2).a(this.a.a(n2 - 1, n3, n4)) : ((amr)ahz2).a(this.a.a(n2 - 1, n3, n4));
        boolean bl7 = bl3 ? ((ami)ahz2).a(this.a.a(n2 + 1, n3, n4)) : ((amr)ahz2).a(this.a.a(n2 + 1, n3, n4));
        double d22 = 0.001;
        double d23 = 0.999;
        double d24 = 0.001;
        boolean bl8 = bl2 = !bl4 && !bl5 && !bl6 && !bl7;
        if (bl6 || bl2) {
            if (bl6 && bl7) {
                if (!bl4) {
                    bna2.a(d15, (double)n3 + 0.999, d20, d5, d6);
                    bna2.a(d15, (double)n3 + 0.001, d20, d5, d7);
                    bna2.a(d14, (double)n3 + 0.001, d20, d2, d7);
                    bna2.a(d14, (double)n3 + 0.999, d20, d2, d6);
                } else {
                    bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
                    bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
                    bna2.a(d14, (double)n3 + 0.001, d20, d2, d7);
                    bna2.a(d14, (double)n3 + 0.999, d20, d2, d6);
                    bna2.a(d15, (double)n3 + 0.999, d20, d5, d6);
                    bna2.a(d15, (double)n3 + 0.001, d20, d5, d7);
                    bna2.a(d19, (double)n3 + 0.001, d20, d4, d7);
                    bna2.a(d19, (double)n3 + 0.999, d20, d4, d6);
                }
                if (!bl5) {
                    bna2.a(d14, (double)n3 + 0.999, d21, d2, d6);
                    bna2.a(d14, (double)n3 + 0.001, d21, d2, d7);
                    bna2.a(d15, (double)n3 + 0.001, d21, d5, d7);
                    bna2.a(d15, (double)n3 + 0.999, d21, d5, d6);
                } else {
                    bna2.a(d14, (double)n3 + 0.999, d21, d2, d6);
                    bna2.a(d14, (double)n3 + 0.001, d21, d2, d7);
                    bna2.a(d18, (double)n3 + 0.001, d21, d3, d7);
                    bna2.a(d18, (double)n3 + 0.999, d21, d3, d6);
                    bna2.a(d19, (double)n3 + 0.999, d21, d4, d6);
                    bna2.a(d19, (double)n3 + 0.001, d21, d4, d7);
                    bna2.a(d15, (double)n3 + 0.001, d21, d5, d7);
                    bna2.a(d15, (double)n3 + 0.999, d21, d5, d6);
                }
                bna2.a(d14, (double)n3 + 0.999, d21, d9, d10);
                bna2.a(d15, (double)n3 + 0.999, d21, d9, d11);
                bna2.a(d15, (double)n3 + 0.999, d20, d8, d11);
                bna2.a(d14, (double)n3 + 0.999, d20, d8, d10);
                bna2.a(d15, (double)n3 + 0.001, d21, d8, d11);
                bna2.a(d14, (double)n3 + 0.001, d21, d8, d10);
                bna2.a(d14, (double)n3 + 0.001, d20, d9, d10);
                bna2.a(d15, (double)n3 + 0.001, d20, d9, d11);
            } else {
                if (!bl4 && !bl2) {
                    bna2.a(d19, (double)n3 + 0.999, d20, d4, d6);
                    bna2.a(d19, (double)n3 + 0.001, d20, d4, d7);
                    bna2.a(d14, (double)n3 + 0.001, d20, d2, d7);
                    bna2.a(d14, (double)n3 + 0.999, d20, d2, d6);
                } else {
                    bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
                    bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
                    bna2.a(d14, (double)n3 + 0.001, d20, d2, d7);
                    bna2.a(d14, (double)n3 + 0.999, d20, d2, d6);
                }
                if (!bl5 && !bl2) {
                    bna2.a(d14, (double)n3 + 0.999, d21, d2, d6);
                    bna2.a(d14, (double)n3 + 0.001, d21, d2, d7);
                    bna2.a(d19, (double)n3 + 0.001, d21, d4, d7);
                    bna2.a(d19, (double)n3 + 0.999, d21, d4, d6);
                } else {
                    bna2.a(d14, (double)n3 + 0.999, d21, d2, d6);
                    bna2.a(d14, (double)n3 + 0.001, d21, d2, d7);
                    bna2.a(d18, (double)n3 + 0.001, d21, d3, d7);
                    bna2.a(d18, (double)n3 + 0.999, d21, d3, d6);
                }
                bna2.a(d14, (double)n3 + 0.999, d21, d9, d10);
                bna2.a(d18, (double)n3 + 0.999, d21, d9, d12);
                bna2.a(d18, (double)n3 + 0.999, d20, d8, d12);
                bna2.a(d14, (double)n3 + 0.999, d20, d8, d10);
                bna2.a(d18, (double)n3 + 0.001, d21, d8, d12);
                bna2.a(d14, (double)n3 + 0.001, d21, d8, d10);
                bna2.a(d14, (double)n3 + 0.001, d20, d9, d10);
                bna2.a(d18, (double)n3 + 0.001, d20, d9, d12);
            }
        } else if (!bl4 && !bl5) {
            bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
            bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
            bna2.a(d18, (double)n3 + 0.001, d21, d4, d7);
            bna2.a(d18, (double)n3 + 0.999, d21, d4, d6);
        }
        if ((bl7 || bl2) && !bl6) {
            if (!bl5 && !bl2) {
                bna2.a(d18, (double)n3 + 0.999, d21, d3, d6);
                bna2.a(d18, (double)n3 + 0.001, d21, d3, d7);
                bna2.a(d15, (double)n3 + 0.001, d21, d5, d7);
                bna2.a(d15, (double)n3 + 0.999, d21, d5, d6);
            } else {
                bna2.a(d19, (double)n3 + 0.999, d21, d4, d6);
                bna2.a(d19, (double)n3 + 0.001, d21, d4, d7);
                bna2.a(d15, (double)n3 + 0.001, d21, d5, d7);
                bna2.a(d15, (double)n3 + 0.999, d21, d5, d6);
            }
            if (!bl4 && !bl2) {
                bna2.a(d15, (double)n3 + 0.999, d20, d5, d6);
                bna2.a(d15, (double)n3 + 0.001, d20, d5, d7);
                bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
                bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
            } else {
                bna2.a(d15, (double)n3 + 0.999, d20, d5, d6);
                bna2.a(d15, (double)n3 + 0.001, d20, d5, d7);
                bna2.a(d19, (double)n3 + 0.001, d20, d4, d7);
                bna2.a(d19, (double)n3 + 0.999, d20, d4, d6);
            }
            bna2.a(d19, (double)n3 + 0.999, d21, d9, d13);
            bna2.a(d15, (double)n3 + 0.999, d21, d9, d10);
            bna2.a(d15, (double)n3 + 0.999, d20, d8, d10);
            bna2.a(d19, (double)n3 + 0.999, d20, d8, d13);
            bna2.a(d15, (double)n3 + 0.001, d21, d8, d11);
            bna2.a(d19, (double)n3 + 0.001, d21, d8, d13);
            bna2.a(d19, (double)n3 + 0.001, d20, d9, d13);
            bna2.a(d15, (double)n3 + 0.001, d20, d9, d11);
        } else if (!(bl7 || bl4 || bl5)) {
            bna2.a(d19, (double)n3 + 0.999, d21, d3, d6);
            bna2.a(d19, (double)n3 + 0.001, d21, d3, d7);
            bna2.a(d19, (double)n3 + 0.001, d20, d4, d7);
            bna2.a(d19, (double)n3 + 0.999, d20, d4, d6);
        }
        if (bl4 || bl2) {
            if (bl4 && bl5) {
                if (!bl6) {
                    bna2.a(d18, (double)n3 + 0.999, d16, d2, d6);
                    bna2.a(d18, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d18, (double)n3 + 0.001, d17, d5, d7);
                    bna2.a(d18, (double)n3 + 0.999, d17, d5, d6);
                } else {
                    bna2.a(d18, (double)n3 + 0.999, d16, d2, d6);
                    bna2.a(d18, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
                    bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
                    bna2.a(d18, (double)n3 + 0.999, d21, d4, d6);
                    bna2.a(d18, (double)n3 + 0.001, d21, d4, d7);
                    bna2.a(d18, (double)n3 + 0.001, d17, d5, d7);
                    bna2.a(d18, (double)n3 + 0.999, d17, d5, d6);
                }
                if (!bl7) {
                    bna2.a(d19, (double)n3 + 0.999, d17, d5, d6);
                    bna2.a(d19, (double)n3 + 0.001, d17, d5, d7);
                    bna2.a(d19, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d19, (double)n3 + 0.999, d16, d2, d6);
                } else {
                    bna2.a(d19, (double)n3 + 0.999, d20, d3, d6);
                    bna2.a(d19, (double)n3 + 0.001, d20, d3, d7);
                    bna2.a(d19, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d19, (double)n3 + 0.999, d16, d2, d6);
                    bna2.a(d19, (double)n3 + 0.999, d17, d5, d6);
                    bna2.a(d19, (double)n3 + 0.001, d17, d5, d7);
                    bna2.a(d19, (double)n3 + 0.001, d21, d4, d7);
                    bna2.a(d19, (double)n3 + 0.999, d21, d4, d6);
                }
                bna2.a(d19, (double)n3 + 0.999, d16, d9, d10);
                bna2.a(d18, (double)n3 + 0.999, d16, d8, d10);
                bna2.a(d18, (double)n3 + 0.999, d17, d8, d11);
                bna2.a(d19, (double)n3 + 0.999, d17, d9, d11);
                bna2.a(d18, (double)n3 + 0.001, d16, d8, d10);
                bna2.a(d19, (double)n3 + 0.001, d16, d9, d10);
                bna2.a(d19, (double)n3 + 0.001, d17, d9, d11);
                bna2.a(d18, (double)n3 + 0.001, d17, d8, d11);
            } else {
                if (!bl6 && !bl2) {
                    bna2.a(d18, (double)n3 + 0.999, d16, d2, d6);
                    bna2.a(d18, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d18, (double)n3 + 0.001, d21, d4, d7);
                    bna2.a(d18, (double)n3 + 0.999, d21, d4, d6);
                } else {
                    bna2.a(d18, (double)n3 + 0.999, d16, d2, d6);
                    bna2.a(d18, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
                    bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
                }
                if (!bl7 && !bl2) {
                    bna2.a(d19, (double)n3 + 0.999, d21, d4, d6);
                    bna2.a(d19, (double)n3 + 0.001, d21, d4, d7);
                    bna2.a(d19, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d19, (double)n3 + 0.999, d16, d2, d6);
                } else {
                    bna2.a(d19, (double)n3 + 0.999, d20, d3, d6);
                    bna2.a(d19, (double)n3 + 0.001, d20, d3, d7);
                    bna2.a(d19, (double)n3 + 0.001, d16, d2, d7);
                    bna2.a(d19, (double)n3 + 0.999, d16, d2, d6);
                }
                bna2.a(d19, (double)n3 + 0.999, d16, d9, d10);
                bna2.a(d18, (double)n3 + 0.999, d16, d8, d10);
                bna2.a(d18, (double)n3 + 0.999, d20, d8, d12);
                bna2.a(d19, (double)n3 + 0.999, d20, d9, d12);
                bna2.a(d18, (double)n3 + 0.001, d16, d8, d10);
                bna2.a(d19, (double)n3 + 0.001, d16, d9, d10);
                bna2.a(d19, (double)n3 + 0.001, d20, d9, d12);
                bna2.a(d18, (double)n3 + 0.001, d20, d8, d12);
            }
        } else if (!bl7 && !bl6) {
            bna2.a(d19, (double)n3 + 0.999, d20, d4, d6);
            bna2.a(d19, (double)n3 + 0.001, d20, d4, d7);
            bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
            bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
        }
        if ((bl5 || bl2) && !bl4) {
            if (!bl6 && !bl2) {
                bna2.a(d18, (double)n3 + 0.999, d20, d3, d6);
                bna2.a(d18, (double)n3 + 0.001, d20, d3, d7);
                bna2.a(d18, (double)n3 + 0.001, d17, d5, d7);
                bna2.a(d18, (double)n3 + 0.999, d17, d5, d6);
            } else {
                bna2.a(d18, (double)n3 + 0.999, d21, d4, d6);
                bna2.a(d18, (double)n3 + 0.001, d21, d4, d7);
                bna2.a(d18, (double)n3 + 0.001, d17, d5, d7);
                bna2.a(d18, (double)n3 + 0.999, d17, d5, d6);
            }
            if (!bl7 && !bl2) {
                bna2.a(d19, (double)n3 + 0.999, d17, d5, d6);
                bna2.a(d19, (double)n3 + 0.001, d17, d5, d7);
                bna2.a(d19, (double)n3 + 0.001, d20, d3, d7);
                bna2.a(d19, (double)n3 + 0.999, d20, d3, d6);
            } else {
                bna2.a(d19, (double)n3 + 0.999, d17, d5, d6);
                bna2.a(d19, (double)n3 + 0.001, d17, d5, d7);
                bna2.a(d19, (double)n3 + 0.001, d21, d4, d7);
                bna2.a(d19, (double)n3 + 0.999, d21, d4, d6);
            }
            bna2.a(d19, (double)n3 + 0.999, d21, d9, d13);
            bna2.a(d18, (double)n3 + 0.999, d21, d8, d13);
            bna2.a(d18, (double)n3 + 0.999, d17, d8, d11);
            bna2.a(d19, (double)n3 + 0.999, d17, d9, d11);
            bna2.a(d18, (double)n3 + 0.001, d21, d8, d13);
            bna2.a(d19, (double)n3 + 0.001, d21, d9, d13);
            bna2.a(d19, (double)n3 + 0.001, d17, d9, d11);
            bna2.a(d18, (double)n3 + 0.001, d17, d8, d11);
        } else if (!(bl5 || bl7 || bl6)) {
            bna2.a(d18, (double)n3 + 0.999, d21, d3, d6);
            bna2.a(d18, (double)n3 + 0.001, d21, d3, d7);
            bna2.a(d19, (double)n3 + 0.001, d21, d4, d7);
            bna2.a(d19, (double)n3 + 0.999, d21, d4, d6);
        }
        bna2.a(d19, (double)n3 + 0.999, d20, d9, d12);
        bna2.a(d18, (double)n3 + 0.999, d20, d8, d12);
        bna2.a(d18, (double)n3 + 0.999, d21, d8, d13);
        bna2.a(d19, (double)n3 + 0.999, d21, d9, d13);
        bna2.a(d18, (double)n3 + 0.001, d20, d8, d12);
        bna2.a(d19, (double)n3 + 0.001, d20, d9, d12);
        bna2.a(d19, (double)n3 + 0.001, d21, d9, d13);
        bna2.a(d18, (double)n3 + 0.001, d21, d8, d13);
        if (bl2) {
            bna2.a(d14, (double)n3 + 0.999, d20, d3, d6);
            bna2.a(d14, (double)n3 + 0.001, d20, d3, d7);
            bna2.a(d14, (double)n3 + 0.001, d21, d4, d7);
            bna2.a(d14, (double)n3 + 0.999, d21, d4, d6);
            bna2.a(d15, (double)n3 + 0.999, d21, d3, d6);
            bna2.a(d15, (double)n3 + 0.001, d21, d3, d7);
            bna2.a(d15, (double)n3 + 0.001, d20, d4, d7);
            bna2.a(d15, (double)n3 + 0.999, d20, d4, d6);
            bna2.a(d19, (double)n3 + 0.999, d16, d4, d6);
            bna2.a(d19, (double)n3 + 0.001, d16, d4, d7);
            bna2.a(d18, (double)n3 + 0.001, d16, d3, d7);
            bna2.a(d18, (double)n3 + 0.999, d16, d3, d6);
            bna2.a(d18, (double)n3 + 0.999, d17, d3, d6);
            bna2.a(d18, (double)n3 + 0.001, d17, d3, d7);
            bna2.a(d19, (double)n3 + 0.001, d17, d4, d7);
            bna2.a(d19, (double)n3 + 0.999, d17, d4, d6);
        }
        return true;
    }

    public boolean a(amr amr2, int n2, int n3, int n4) {
        pw pw2;
        pw pw3;
        int n5 = this.a.R();
        bna bna2 = bna.a;
        bna2.b(amr2.c(this.a, n2, n3, n4));
        int n6 = amr2.d(this.a, n2, n3, n4);
        float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n6 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        if (this.b()) {
            pw3 = this.d;
            pw2 = this.d;
        } else {
            int n7 = this.a.e(n2, n3, n4);
            pw3 = this.a((ahz)amr2, 0, n7);
            pw2 = amr2.e();
        }
        double d2 = pw3.c();
        double d3 = pw3.a(8.0);
        double d4 = pw3.d();
        double d5 = pw3.e();
        double d6 = pw3.f();
        double d7 = pw2.a(7.0);
        double d8 = pw2.a(9.0);
        double d9 = pw2.e();
        double d10 = pw2.b(8.0);
        double d11 = pw2.f();
        double d12 = n2;
        double d13 = (double)n2 + 0.5;
        double d14 = n2 + 1;
        double d15 = n4;
        double d16 = (double)n4 + 0.5;
        double d17 = n4 + 1;
        double d18 = (double)n2 + 0.5 - 0.0625;
        double d19 = (double)n2 + 0.5 + 0.0625;
        double d20 = (double)n4 + 0.5 - 0.0625;
        double d21 = (double)n4 + 0.5 + 0.0625;
        boolean bl2 = amr2.a(this.a.a(n2, n3, n4 - 1));
        boolean bl3 = amr2.a(this.a.a(n2, n3, n4 + 1));
        boolean bl4 = amr2.a(this.a.a(n2 - 1, n3, n4));
        boolean bl5 = amr2.a(this.a.a(n2 + 1, n3, n4));
        boolean bl6 = amr2.a(this.a, n2, n3 + 1, n4, 1);
        boolean bl7 = amr2.a(this.a, n2, n3 - 1, n4, 0);
        double d22 = 0.01;
        double d23 = 0.005;
        if (bl4 && bl5 || !bl4 && !bl5 && !bl2 && !bl3) {
            bna2.a(d12, n3 + 1, d16, d2, d5);
            bna2.a(d12, n3 + 0, d16, d2, d6);
            bna2.a(d14, n3 + 0, d16, d4, d6);
            bna2.a(d14, n3 + 1, d16, d4, d5);
            bna2.a(d14, n3 + 1, d16, d2, d5);
            bna2.a(d14, n3 + 0, d16, d2, d6);
            bna2.a(d12, n3 + 0, d16, d4, d6);
            bna2.a(d12, n3 + 1, d16, d4, d5);
            if (bl6) {
                bna2.a(d12, (double)(n3 + 1) + 0.01, d21, d8, d11);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d21, d8, d9);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d20, d7, d9);
                bna2.a(d12, (double)(n3 + 1) + 0.01, d20, d7, d11);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d21, d8, d11);
                bna2.a(d12, (double)(n3 + 1) + 0.01, d21, d8, d9);
                bna2.a(d12, (double)(n3 + 1) + 0.01, d20, d7, d9);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d20, d7, d11);
            } else {
                if (n3 < n5 - 1 && this.a.c(n2 - 1, n3 + 1, n4)) {
                    bna2.a(d12, (double)(n3 + 1) + 0.01, d21, d8, d10);
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d11);
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d11);
                    bna2.a(d12, (double)(n3 + 1) + 0.01, d20, d7, d10);
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d10);
                    bna2.a(d12, (double)(n3 + 1) + 0.01, d21, d8, d11);
                    bna2.a(d12, (double)(n3 + 1) + 0.01, d20, d7, d11);
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d10);
                }
                if (n3 < n5 - 1 && this.a.c(n2 + 1, n3 + 1, n4)) {
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d9);
                    bna2.a(d14, (double)(n3 + 1) + 0.01, d21, d8, d10);
                    bna2.a(d14, (double)(n3 + 1) + 0.01, d20, d7, d10);
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d9);
                    bna2.a(d14, (double)(n3 + 1) + 0.01, d21, d8, d9);
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d10);
                    bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d10);
                    bna2.a(d14, (double)(n3 + 1) + 0.01, d20, d7, d9);
                }
            }
            if (bl7) {
                bna2.a(d12, (double)n3 - 0.01, d21, d8, d11);
                bna2.a(d14, (double)n3 - 0.01, d21, d8, d9);
                bna2.a(d14, (double)n3 - 0.01, d20, d7, d9);
                bna2.a(d12, (double)n3 - 0.01, d20, d7, d11);
                bna2.a(d14, (double)n3 - 0.01, d21, d8, d11);
                bna2.a(d12, (double)n3 - 0.01, d21, d8, d9);
                bna2.a(d12, (double)n3 - 0.01, d20, d7, d9);
                bna2.a(d14, (double)n3 - 0.01, d20, d7, d11);
            } else {
                if (n3 > 1 && this.a.c(n2 - 1, n3 - 1, n4)) {
                    bna2.a(d12, (double)n3 - 0.01, d21, d8, d10);
                    bna2.a(d13, (double)n3 - 0.01, d21, d8, d11);
                    bna2.a(d13, (double)n3 - 0.01, d20, d7, d11);
                    bna2.a(d12, (double)n3 - 0.01, d20, d7, d10);
                    bna2.a(d13, (double)n3 - 0.01, d21, d8, d10);
                    bna2.a(d12, (double)n3 - 0.01, d21, d8, d11);
                    bna2.a(d12, (double)n3 - 0.01, d20, d7, d11);
                    bna2.a(d13, (double)n3 - 0.01, d20, d7, d10);
                }
                if (n3 > 1 && this.a.c(n2 + 1, n3 - 1, n4)) {
                    bna2.a(d13, (double)n3 - 0.01, d21, d8, d9);
                    bna2.a(d14, (double)n3 - 0.01, d21, d8, d10);
                    bna2.a(d14, (double)n3 - 0.01, d20, d7, d10);
                    bna2.a(d13, (double)n3 - 0.01, d20, d7, d9);
                    bna2.a(d14, (double)n3 - 0.01, d21, d8, d9);
                    bna2.a(d13, (double)n3 - 0.01, d21, d8, d10);
                    bna2.a(d13, (double)n3 - 0.01, d20, d7, d10);
                    bna2.a(d14, (double)n3 - 0.01, d20, d7, d9);
                }
            }
        } else if (bl4 && !bl5) {
            bna2.a(d12, n3 + 1, d16, d2, d5);
            bna2.a(d12, n3 + 0, d16, d2, d6);
            bna2.a(d13, n3 + 0, d16, d3, d6);
            bna2.a(d13, n3 + 1, d16, d3, d5);
            bna2.a(d13, n3 + 1, d16, d2, d5);
            bna2.a(d13, n3 + 0, d16, d2, d6);
            bna2.a(d12, n3 + 0, d16, d3, d6);
            bna2.a(d12, n3 + 1, d16, d3, d5);
            if (!bl3 && !bl2) {
                bna2.a(d13, n3 + 1, d21, d7, d9);
                bna2.a(d13, n3 + 0, d21, d7, d11);
                bna2.a(d13, n3 + 0, d20, d8, d11);
                bna2.a(d13, n3 + 1, d20, d8, d9);
                bna2.a(d13, n3 + 1, d20, d7, d9);
                bna2.a(d13, n3 + 0, d20, d7, d11);
                bna2.a(d13, n3 + 0, d21, d8, d11);
                bna2.a(d13, n3 + 1, d21, d8, d9);
            }
            if (bl6 || n3 < n5 - 1 && this.a.c(n2 - 1, n3 + 1, n4)) {
                bna2.a(d12, (double)(n3 + 1) + 0.01, d21, d8, d10);
                bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d11);
                bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d11);
                bna2.a(d12, (double)(n3 + 1) + 0.01, d20, d7, d10);
                bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d10);
                bna2.a(d12, (double)(n3 + 1) + 0.01, d21, d8, d11);
                bna2.a(d12, (double)(n3 + 1) + 0.01, d20, d7, d11);
                bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d10);
            }
            if (bl7 || n3 > 1 && this.a.c(n2 - 1, n3 - 1, n4)) {
                bna2.a(d12, (double)n3 - 0.01, d21, d8, d10);
                bna2.a(d13, (double)n3 - 0.01, d21, d8, d11);
                bna2.a(d13, (double)n3 - 0.01, d20, d7, d11);
                bna2.a(d12, (double)n3 - 0.01, d20, d7, d10);
                bna2.a(d13, (double)n3 - 0.01, d21, d8, d10);
                bna2.a(d12, (double)n3 - 0.01, d21, d8, d11);
                bna2.a(d12, (double)n3 - 0.01, d20, d7, d11);
                bna2.a(d13, (double)n3 - 0.01, d20, d7, d10);
            }
        } else if (!bl4 && bl5) {
            bna2.a(d13, n3 + 1, d16, d3, d5);
            bna2.a(d13, n3 + 0, d16, d3, d6);
            bna2.a(d14, n3 + 0, d16, d4, d6);
            bna2.a(d14, n3 + 1, d16, d4, d5);
            bna2.a(d14, n3 + 1, d16, d3, d5);
            bna2.a(d14, n3 + 0, d16, d3, d6);
            bna2.a(d13, n3 + 0, d16, d4, d6);
            bna2.a(d13, n3 + 1, d16, d4, d5);
            if (!bl3 && !bl2) {
                bna2.a(d13, n3 + 1, d20, d7, d9);
                bna2.a(d13, n3 + 0, d20, d7, d11);
                bna2.a(d13, n3 + 0, d21, d8, d11);
                bna2.a(d13, n3 + 1, d21, d8, d9);
                bna2.a(d13, n3 + 1, d21, d7, d9);
                bna2.a(d13, n3 + 0, d21, d7, d11);
                bna2.a(d13, n3 + 0, d20, d8, d11);
                bna2.a(d13, n3 + 1, d20, d8, d9);
            }
            if (bl6 || n3 < n5 - 1 && this.a.c(n2 + 1, n3 + 1, n4)) {
                bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d9);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d21, d8, d10);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d20, d7, d10);
                bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d9);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d21, d8, d9);
                bna2.a(d13, (double)(n3 + 1) + 0.01, d21, d8, d10);
                bna2.a(d13, (double)(n3 + 1) + 0.01, d20, d7, d10);
                bna2.a(d14, (double)(n3 + 1) + 0.01, d20, d7, d9);
            }
            if (bl7 || n3 > 1 && this.a.c(n2 + 1, n3 - 1, n4)) {
                bna2.a(d13, (double)n3 - 0.01, d21, d8, d9);
                bna2.a(d14, (double)n3 - 0.01, d21, d8, d10);
                bna2.a(d14, (double)n3 - 0.01, d20, d7, d10);
                bna2.a(d13, (double)n3 - 0.01, d20, d7, d9);
                bna2.a(d14, (double)n3 - 0.01, d21, d8, d9);
                bna2.a(d13, (double)n3 - 0.01, d21, d8, d10);
                bna2.a(d13, (double)n3 - 0.01, d20, d7, d10);
                bna2.a(d14, (double)n3 - 0.01, d20, d7, d9);
            }
        }
        if (bl2 && bl3 || !bl4 && !bl5 && !bl2 && !bl3) {
            bna2.a(d13, n3 + 1, d17, d2, d5);
            bna2.a(d13, n3 + 0, d17, d2, d6);
            bna2.a(d13, n3 + 0, d15, d4, d6);
            bna2.a(d13, n3 + 1, d15, d4, d5);
            bna2.a(d13, n3 + 1, d15, d2, d5);
            bna2.a(d13, n3 + 0, d15, d2, d6);
            bna2.a(d13, n3 + 0, d17, d4, d6);
            bna2.a(d13, n3 + 1, d17, d4, d5);
            if (bl6) {
                bna2.a(d19, (double)(n3 + 1) + 0.005, d17, d8, d11);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d15, d8, d9);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d15, d7, d9);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d17, d7, d11);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d15, d8, d11);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d17, d8, d9);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d17, d7, d9);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d15, d7, d11);
            } else {
                if (n3 < n5 - 1 && this.a.c(n2, n3 + 1, n4 - 1)) {
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d15, d8, d9);
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d8, d10);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d7, d10);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d15, d7, d9);
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d8, d9);
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d15, d8, d10);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d15, d7, d10);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d7, d9);
                }
                if (n3 < n5 - 1 && this.a.c(n2, n3 + 1, n4 + 1)) {
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d7, d10);
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d17, d7, d11);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d17, d8, d11);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d8, d10);
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d17, d7, d10);
                    bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d7, d11);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d8, d11);
                    bna2.a(d19, (double)(n3 + 1) + 0.005, d17, d8, d10);
                }
            }
            if (bl7) {
                bna2.a(d19, (double)n3 - 0.005, d17, d8, d11);
                bna2.a(d19, (double)n3 - 0.005, d15, d8, d9);
                bna2.a(d18, (double)n3 - 0.005, d15, d7, d9);
                bna2.a(d18, (double)n3 - 0.005, d17, d7, d11);
                bna2.a(d19, (double)n3 - 0.005, d15, d8, d11);
                bna2.a(d19, (double)n3 - 0.005, d17, d8, d9);
                bna2.a(d18, (double)n3 - 0.005, d17, d7, d9);
                bna2.a(d18, (double)n3 - 0.005, d15, d7, d11);
            } else {
                if (n3 > 1 && this.a.c(n2, n3 - 1, n4 - 1)) {
                    bna2.a(d18, (double)n3 - 0.005, d15, d8, d9);
                    bna2.a(d18, (double)n3 - 0.005, d16, d8, d10);
                    bna2.a(d19, (double)n3 - 0.005, d16, d7, d10);
                    bna2.a(d19, (double)n3 - 0.005, d15, d7, d9);
                    bna2.a(d18, (double)n3 - 0.005, d16, d8, d9);
                    bna2.a(d18, (double)n3 - 0.005, d15, d8, d10);
                    bna2.a(d19, (double)n3 - 0.005, d15, d7, d10);
                    bna2.a(d19, (double)n3 - 0.005, d16, d7, d9);
                }
                if (n3 > 1 && this.a.c(n2, n3 - 1, n4 + 1)) {
                    bna2.a(d18, (double)n3 - 0.005, d16, d7, d10);
                    bna2.a(d18, (double)n3 - 0.005, d17, d7, d11);
                    bna2.a(d19, (double)n3 - 0.005, d17, d8, d11);
                    bna2.a(d19, (double)n3 - 0.005, d16, d8, d10);
                    bna2.a(d18, (double)n3 - 0.005, d17, d7, d10);
                    bna2.a(d18, (double)n3 - 0.005, d16, d7, d11);
                    bna2.a(d19, (double)n3 - 0.005, d16, d8, d11);
                    bna2.a(d19, (double)n3 - 0.005, d17, d8, d10);
                }
            }
        } else if (bl2 && !bl3) {
            bna2.a(d13, n3 + 1, d15, d2, d5);
            bna2.a(d13, n3 + 0, d15, d2, d6);
            bna2.a(d13, n3 + 0, d16, d3, d6);
            bna2.a(d13, n3 + 1, d16, d3, d5);
            bna2.a(d13, n3 + 1, d16, d2, d5);
            bna2.a(d13, n3 + 0, d16, d2, d6);
            bna2.a(d13, n3 + 0, d15, d3, d6);
            bna2.a(d13, n3 + 1, d15, d3, d5);
            if (!bl5 && !bl4) {
                bna2.a(d18, n3 + 1, d16, d7, d9);
                bna2.a(d18, n3 + 0, d16, d7, d11);
                bna2.a(d19, n3 + 0, d16, d8, d11);
                bna2.a(d19, n3 + 1, d16, d8, d9);
                bna2.a(d19, n3 + 1, d16, d7, d9);
                bna2.a(d19, n3 + 0, d16, d7, d11);
                bna2.a(d18, n3 + 0, d16, d8, d11);
                bna2.a(d18, n3 + 1, d16, d8, d9);
            }
            if (bl6 || n3 < n5 - 1 && this.a.c(n2, n3 + 1, n4 - 1)) {
                bna2.a(d18, (double)(n3 + 1) + 0.005, d15, d8, d9);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d8, d10);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d7, d10);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d15, d7, d9);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d8, d9);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d15, d8, d10);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d15, d7, d10);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d7, d9);
            }
            if (bl7 || n3 > 1 && this.a.c(n2, n3 - 1, n4 - 1)) {
                bna2.a(d18, (double)n3 - 0.005, d15, d8, d9);
                bna2.a(d18, (double)n3 - 0.005, d16, d8, d10);
                bna2.a(d19, (double)n3 - 0.005, d16, d7, d10);
                bna2.a(d19, (double)n3 - 0.005, d15, d7, d9);
                bna2.a(d18, (double)n3 - 0.005, d16, d8, d9);
                bna2.a(d18, (double)n3 - 0.005, d15, d8, d10);
                bna2.a(d19, (double)n3 - 0.005, d15, d7, d10);
                bna2.a(d19, (double)n3 - 0.005, d16, d7, d9);
            }
        } else if (!bl2 && bl3) {
            bna2.a(d13, n3 + 1, d16, d3, d5);
            bna2.a(d13, n3 + 0, d16, d3, d6);
            bna2.a(d13, n3 + 0, d17, d4, d6);
            bna2.a(d13, n3 + 1, d17, d4, d5);
            bna2.a(d13, n3 + 1, d17, d3, d5);
            bna2.a(d13, n3 + 0, d17, d3, d6);
            bna2.a(d13, n3 + 0, d16, d4, d6);
            bna2.a(d13, n3 + 1, d16, d4, d5);
            if (!bl5 && !bl4) {
                bna2.a(d19, n3 + 1, d16, d7, d9);
                bna2.a(d19, n3 + 0, d16, d7, d11);
                bna2.a(d18, n3 + 0, d16, d8, d11);
                bna2.a(d18, n3 + 1, d16, d8, d9);
                bna2.a(d18, n3 + 1, d16, d7, d9);
                bna2.a(d18, n3 + 0, d16, d7, d11);
                bna2.a(d19, n3 + 0, d16, d8, d11);
                bna2.a(d19, n3 + 1, d16, d8, d9);
            }
            if (bl6 || n3 < n5 - 1 && this.a.c(n2, n3 + 1, n4 + 1)) {
                bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d7, d10);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d17, d7, d11);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d17, d8, d11);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d8, d10);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d17, d7, d10);
                bna2.a(d18, (double)(n3 + 1) + 0.005, d16, d7, d11);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d16, d8, d11);
                bna2.a(d19, (double)(n3 + 1) + 0.005, d17, d8, d10);
            }
            if (bl7 || n3 > 1 && this.a.c(n2, n3 - 1, n4 + 1)) {
                bna2.a(d18, (double)n3 - 0.005, d16, d7, d10);
                bna2.a(d18, (double)n3 - 0.005, d17, d7, d11);
                bna2.a(d19, (double)n3 - 0.005, d17, d8, d11);
                bna2.a(d19, (double)n3 - 0.005, d16, d8, d10);
                bna2.a(d18, (double)n3 - 0.005, d17, d7, d10);
                bna2.a(d18, (double)n3 - 0.005, d16, d7, d11);
                bna2.a(d19, (double)n3 - 0.005, d16, d8, d11);
                bna2.a(d19, (double)n3 - 0.005, d17, d8, d10);
            }
        }
        return true;
    }

    public boolean l(ahz ahz2, int n2, int n3, int n4) {
        long l2;
        bna bna2 = bna.a;
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        int n5 = ahz2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        double d2 = n2;
        double d3 = n3;
        double d4 = n4;
        if (ahz2 == aie.H) {
            l2 = (long)(n2 * 3129871) ^ (long)n4 * 116129781L ^ (long)n3;
            l2 = l2 * l2 * 42317861L + l2 * 11L;
            d2 += ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d3 += ((double)((float)(l2 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            d4 += ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        } else if (ahz2 == aie.O || ahz2 == aie.N) {
            l2 = (long)(n2 * 3129871) ^ (long)n4 * 116129781L ^ (long)n3;
            l2 = l2 * l2 * 42317861L + l2 * 11L;
            d2 += ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.3;
            d4 += ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.3;
        }
        pw pw2 = this.a(ahz2, 0, this.a.e(n2, n3, n4));
        this.a(pw2, d2, d3, d4, 1.0f);
        return true;
    }

    public boolean a(ajf ajf2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        bna2.b(ajf2.c(this.a, n2, n3, n4));
        int n5 = ajf2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        long l2 = (long)(n2 * 3129871) ^ (long)n4 * 116129781L;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        double d2 = n2;
        double d3 = n3;
        double d4 = n4;
        d2 += ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.3;
        d4 += ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.3;
        int n6 = this.a.e(n2, n3, n4);
        int n7 = 0;
        boolean bl2 = ajf.c(n6);
        if (bl2) {
            if (this.a.a(n2, n3 - 1, n4) != ajf2) {
                return false;
            }
            n7 = ajf.d(this.a.e(n2, n3 - 1, n4));
        } else {
            n7 = ajf.d(n6);
        }
        pw pw2 = ajf2.a(bl2, n7);
        this.a(pw2, d2, d3, d4, 1.0f);
        if (bl2 && n7 == 0) {
            pw pw3 = ajf2.b[0];
            double d5 = Math.cos((double)l2 * 0.8) * Math.PI * 0.1;
            double d6 = Math.cos(d5);
            double d7 = Math.sin(d5);
            double d8 = pw3.c();
            double d9 = pw3.e();
            double d10 = pw3.d();
            double d11 = pw3.f();
            double d12 = 0.3;
            double d13 = -0.05;
            double d14 = 0.5 + 0.3 * d6 - 0.5 * d7;
            double d15 = 0.5 + 0.5 * d6 + 0.3 * d7;
            double d16 = 0.5 + 0.3 * d6 + 0.5 * d7;
            double d17 = 0.5 + -0.5 * d6 + 0.3 * d7;
            double d18 = 0.5 + -0.05 * d6 + 0.5 * d7;
            double d19 = 0.5 + -0.5 * d6 + -0.05 * d7;
            double d20 = 0.5 + -0.05 * d6 - 0.5 * d7;
            double d21 = 0.5 + 0.5 * d6 + -0.05 * d7;
            bna2.a(d2 + d18, d3 + 1.0, d4 + d19, d8, d11);
            bna2.a(d2 + d20, d3 + 1.0, d4 + d21, d10, d11);
            bna2.a(d2 + d14, d3 + 0.0, d4 + d15, d10, d9);
            bna2.a(d2 + d16, d3 + 0.0, d4 + d17, d8, d9);
            pw pw4 = ajf2.b[1];
            d8 = pw4.c();
            d9 = pw4.e();
            d10 = pw4.d();
            d11 = pw4.f();
            bna2.a(d2 + d20, d3 + 1.0, d4 + d21, d8, d11);
            bna2.a(d2 + d18, d3 + 1.0, d4 + d19, d10, d11);
            bna2.a(d2 + d16, d3 + 0.0, d4 + d17, d10, d9);
            bna2.a(d2 + d14, d3 + 0.0, d4 + d15, d8, d9);
        }
        return true;
    }

    public boolean m(ahz ahz2, int n2, int n3, int n4) {
        aml aml2 = (aml)ahz2;
        bna bna2 = bna.a;
        bna2.b(aml2.c(this.a, n2, n3, n4));
        int n5 = aml2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        aml2.a(this.a, n2, n3, n4);
        int n6 = aml2.e(this.a, n2, n3, n4);
        if (n6 < 0) {
            this.a((ahz)aml2, this.a.e(n2, n3, n4), this.l, (double)n2, (double)((float)n3 - 0.0625f), (double)n4);
        } else {
            this.a((ahz)aml2, this.a.e(n2, n3, n4), 0.5, (double)n2, (double)((float)n3 - 0.0625f), (double)n4);
            this.a(aml2, this.a.e(n2, n3, n4), n6, this.l, (double)n2, (double)((float)n3 - 0.0625f), (double)n4);
        }
        return true;
    }

    public boolean n(ahz ahz2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        this.a(ahz2, this.a.e(n2, n3, n4), (double)n2, (double)((float)n3 - 0.0625f), (double)n4);
        return true;
    }

    public void a(ahz ahz2, double d2, double d3, double d4, double d5, double d6, int n2) {
        bna bna2 = bna.a;
        pw pw2 = this.a(ahz2, 0, n2);
        if (this.b()) {
            pw2 = this.d;
        }
        double d7 = pw2.c();
        double d8 = pw2.e();
        double d9 = pw2.d();
        double d10 = pw2.f();
        double d11 = pw2.a(7.0);
        double d12 = pw2.b(6.0);
        double d13 = pw2.a(9.0);
        double d14 = pw2.b(8.0);
        double d15 = pw2.a(7.0);
        double d16 = pw2.b(13.0);
        double d17 = pw2.a(9.0);
        double d18 = pw2.b(15.0);
        double d19 = (d2 += 0.5) - 0.5;
        double d20 = d2 + 0.5;
        double d21 = (d4 += 0.5) - 0.5;
        double d22 = d4 + 0.5;
        double d23 = 0.0625;
        double d24 = 0.625;
        bna2.a(d2 + d5 * (1.0 - d24) - d23, d3 + d24, d4 + d6 * (1.0 - d24) - d23, d11, d12);
        bna2.a(d2 + d5 * (1.0 - d24) - d23, d3 + d24, d4 + d6 * (1.0 - d24) + d23, d11, d14);
        bna2.a(d2 + d5 * (1.0 - d24) + d23, d3 + d24, d4 + d6 * (1.0 - d24) + d23, d13, d14);
        bna2.a(d2 + d5 * (1.0 - d24) + d23, d3 + d24, d4 + d6 * (1.0 - d24) - d23, d13, d12);
        bna2.a(d2 + d23 + d5, d3, d4 - d23 + d6, d17, d16);
        bna2.a(d2 + d23 + d5, d3, d4 + d23 + d6, d17, d18);
        bna2.a(d2 - d23 + d5, d3, d4 + d23 + d6, d15, d18);
        bna2.a(d2 - d23 + d5, d3, d4 - d23 + d6, d15, d16);
        bna2.a(d2 - d23, d3 + 1.0, d21, d7, d8);
        bna2.a(d2 - d23 + d5, d3 + 0.0, d21 + d6, d7, d10);
        bna2.a(d2 - d23 + d5, d3 + 0.0, d22 + d6, d9, d10);
        bna2.a(d2 - d23, d3 + 1.0, d22, d9, d8);
        bna2.a(d2 + d23, d3 + 1.0, d22, d7, d8);
        bna2.a(d2 + d5 + d23, d3 + 0.0, d22 + d6, d7, d10);
        bna2.a(d2 + d5 + d23, d3 + 0.0, d21 + d6, d9, d10);
        bna2.a(d2 + d23, d3 + 1.0, d21, d9, d8);
        bna2.a(d19, d3 + 1.0, d4 + d23, d7, d8);
        bna2.a(d19 + d5, d3 + 0.0, d4 + d23 + d6, d7, d10);
        bna2.a(d20 + d5, d3 + 0.0, d4 + d23 + d6, d9, d10);
        bna2.a(d20, d3 + 1.0, d4 + d23, d9, d8);
        bna2.a(d20, d3 + 1.0, d4 - d23, d7, d8);
        bna2.a(d20 + d5, d3 + 0.0, d4 - d23 + d6, d7, d10);
        bna2.a(d19 + d5, d3 + 0.0, d4 - d23 + d6, d9, d10);
        bna2.a(d19, d3 + 1.0, d4 - d23, d9, d8);
    }

    public void a(pw pw2, double d2, double d3, double d4, float f2) {
        bna bna2 = bna.a;
        if (this.b()) {
            pw2 = this.d;
        }
        double d5 = pw2.c();
        double d6 = pw2.e();
        double d7 = pw2.d();
        double d8 = pw2.f();
        double d9 = 0.45 * (double)f2;
        double d10 = d2 + 0.5 - d9;
        double d11 = d2 + 0.5 + d9;
        double d12 = d4 + 0.5 - d9;
        double d13 = d4 + 0.5 + d9;
        bna2.a(d10, d3 + (double)f2, d12, d5, d6);
        bna2.a(d10, d3 + 0.0, d12, d5, d8);
        bna2.a(d11, d3 + 0.0, d13, d7, d8);
        bna2.a(d11, d3 + (double)f2, d13, d7, d6);
        bna2.a(d11, d3 + (double)f2, d13, d5, d6);
        bna2.a(d11, d3 + 0.0, d13, d5, d8);
        bna2.a(d10, d3 + 0.0, d12, d7, d8);
        bna2.a(d10, d3 + (double)f2, d12, d7, d6);
        bna2.a(d10, d3 + (double)f2, d13, d5, d6);
        bna2.a(d10, d3 + 0.0, d13, d5, d8);
        bna2.a(d11, d3 + 0.0, d12, d7, d8);
        bna2.a(d11, d3 + (double)f2, d12, d7, d6);
        bna2.a(d11, d3 + (double)f2, d12, d5, d6);
        bna2.a(d11, d3 + 0.0, d12, d5, d8);
        bna2.a(d10, d3 + 0.0, d13, d7, d8);
        bna2.a(d10, d3 + (double)f2, d13, d7, d6);
    }

    public void a(ahz ahz2, int n2, double d2, double d3, double d4, double d5) {
        bna bna2 = bna.a;
        pw pw2 = this.a(ahz2, 0, n2);
        if (this.b()) {
            pw2 = this.d;
        }
        double d6 = pw2.c();
        double d7 = pw2.e();
        double d8 = pw2.d();
        double d9 = pw2.b(d2 * 16.0);
        double d10 = d3 + 0.5 - (double)0.45f;
        double d11 = d3 + 0.5 + (double)0.45f;
        double d12 = d5 + 0.5 - (double)0.45f;
        double d13 = d5 + 0.5 + (double)0.45f;
        bna2.a(d10, d4 + d2, d12, d6, d7);
        bna2.a(d10, d4 + 0.0, d12, d6, d9);
        bna2.a(d11, d4 + 0.0, d13, d8, d9);
        bna2.a(d11, d4 + d2, d13, d8, d7);
        bna2.a(d11, d4 + d2, d13, d8, d7);
        bna2.a(d11, d4 + 0.0, d13, d8, d9);
        bna2.a(d10, d4 + 0.0, d12, d6, d9);
        bna2.a(d10, d4 + d2, d12, d6, d7);
        bna2.a(d10, d4 + d2, d13, d6, d7);
        bna2.a(d10, d4 + 0.0, d13, d6, d9);
        bna2.a(d11, d4 + 0.0, d12, d8, d9);
        bna2.a(d11, d4 + d2, d12, d8, d7);
        bna2.a(d11, d4 + d2, d12, d8, d7);
        bna2.a(d11, d4 + 0.0, d12, d8, d9);
        bna2.a(d10, d4 + 0.0, d13, d6, d9);
        bna2.a(d10, d4 + d2, d13, d6, d7);
    }

    public boolean o(ahz ahz2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        pw pw2 = this.a(ahz2, 1);
        if (this.b()) {
            pw2 = this.d;
        }
        float f2 = 0.015625f;
        double d2 = pw2.c();
        double d3 = pw2.e();
        double d4 = pw2.d();
        double d5 = pw2.f();
        long l2 = (long)(n2 * 3129871) ^ (long)n4 * 116129781L ^ (long)n3;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        int n5 = (int)(l2 >> 16 & 3L);
        bna2.b(ahz2.c(this.a, n2, n3, n4));
        float f3 = (float)n2 + 0.5f;
        float f4 = (float)n4 + 0.5f;
        float f5 = (float)(n5 & 1) * 0.5f * (float)(1 - n5 / 2 % 2 * 2);
        float f6 = (float)(n5 + 1 & 1) * 0.5f * (float)(1 - (n5 + 1) / 2 % 2 * 2);
        bna2.c(ahz2.D());
        bna2.a(f3 + f5 - f6, (float)n3 + f2, f4 + f5 + f6, d2, d3);
        bna2.a(f3 + f5 + f6, (float)n3 + f2, f4 - f5 + f6, d4, d3);
        bna2.a(f3 - f5 + f6, (float)n3 + f2, f4 - f5 - f6, d4, d5);
        bna2.a(f3 - f5 - f6, (float)n3 + f2, f4 + f5 - f6, d2, d5);
        bna2.c((ahz2.D() & 0xFEFEFE) >> 1);
        bna2.a(f3 - f5 - f6, (float)n3 + f2, f4 + f5 - f6, d2, d5);
        bna2.a(f3 - f5 + f6, (float)n3 + f2, f4 - f5 - f6, d4, d5);
        bna2.a(f3 + f5 + f6, (float)n3 + f2, f4 - f5 + f6, d4, d3);
        bna2.a(f3 + f5 - f6, (float)n3 + f2, f4 + f5 + f6, d2, d3);
        return true;
    }

    public void a(aml aml2, int n2, int n3, double d2, double d3, double d4, double d5) {
        bna bna2 = bna.a;
        pw pw2 = aml2.i();
        if (this.b()) {
            pw2 = this.d;
        }
        double d6 = pw2.c();
        double d7 = pw2.e();
        double d8 = pw2.d();
        double d9 = pw2.f();
        double d10 = d3 + 0.5 - 0.5;
        double d11 = d3 + 0.5 + 0.5;
        double d12 = d5 + 0.5 - 0.5;
        double d13 = d5 + 0.5 + 0.5;
        double d14 = d3 + 0.5;
        double d15 = d5 + 0.5;
        if ((n3 + 1) / 2 % 2 == 1) {
            double d16 = d8;
            d8 = d6;
            d6 = d16;
        }
        if (n3 < 2) {
            bna2.a(d10, d4 + d2, d15, d6, d7);
            bna2.a(d10, d4 + 0.0, d15, d6, d9);
            bna2.a(d11, d4 + 0.0, d15, d8, d9);
            bna2.a(d11, d4 + d2, d15, d8, d7);
            bna2.a(d11, d4 + d2, d15, d8, d7);
            bna2.a(d11, d4 + 0.0, d15, d8, d9);
            bna2.a(d10, d4 + 0.0, d15, d6, d9);
            bna2.a(d10, d4 + d2, d15, d6, d7);
        } else {
            bna2.a(d14, d4 + d2, d13, d6, d7);
            bna2.a(d14, d4 + 0.0, d13, d6, d9);
            bna2.a(d14, d4 + 0.0, d12, d8, d9);
            bna2.a(d14, d4 + d2, d12, d8, d7);
            bna2.a(d14, d4 + d2, d12, d8, d7);
            bna2.a(d14, d4 + 0.0, d12, d8, d9);
            bna2.a(d14, d4 + 0.0, d13, d6, d9);
            bna2.a(d14, d4 + d2, d13, d6, d7);
        }
    }

    public void a(ahz ahz2, int n2, double d2, double d3, double d4) {
        bna bna2 = bna.a;
        pw pw2 = this.a(ahz2, 0, n2);
        if (this.b()) {
            pw2 = this.d;
        }
        double d5 = pw2.c();
        double d6 = pw2.e();
        double d7 = pw2.d();
        double d8 = pw2.f();
        double d9 = d2 + 0.5 - 0.25;
        double d10 = d2 + 0.5 + 0.25;
        double d11 = d4 + 0.5 - 0.5;
        double d12 = d4 + 0.5 + 0.5;
        bna2.a(d9, d3 + 1.0, d11, d5, d6);
        bna2.a(d9, d3 + 0.0, d11, d5, d8);
        bna2.a(d9, d3 + 0.0, d12, d7, d8);
        bna2.a(d9, d3 + 1.0, d12, d7, d6);
        bna2.a(d9, d3 + 1.0, d12, d5, d6);
        bna2.a(d9, d3 + 0.0, d12, d5, d8);
        bna2.a(d9, d3 + 0.0, d11, d7, d8);
        bna2.a(d9, d3 + 1.0, d11, d7, d6);
        bna2.a(d10, d3 + 1.0, d12, d5, d6);
        bna2.a(d10, d3 + 0.0, d12, d5, d8);
        bna2.a(d10, d3 + 0.0, d11, d7, d8);
        bna2.a(d10, d3 + 1.0, d11, d7, d6);
        bna2.a(d10, d3 + 1.0, d11, d5, d6);
        bna2.a(d10, d3 + 0.0, d11, d5, d8);
        bna2.a(d10, d3 + 0.0, d12, d7, d8);
        bna2.a(d10, d3 + 1.0, d12, d7, d6);
        d9 = d2 + 0.5 - 0.5;
        d10 = d2 + 0.5 + 0.5;
        d11 = d4 + 0.5 - 0.25;
        d12 = d4 + 0.5 + 0.25;
        bna2.a(d9, d3 + 1.0, d11, d5, d6);
        bna2.a(d9, d3 + 0.0, d11, d5, d8);
        bna2.a(d10, d3 + 0.0, d11, d7, d8);
        bna2.a(d10, d3 + 1.0, d11, d7, d6);
        bna2.a(d10, d3 + 1.0, d11, d5, d6);
        bna2.a(d10, d3 + 0.0, d11, d5, d8);
        bna2.a(d9, d3 + 0.0, d11, d7, d8);
        bna2.a(d9, d3 + 1.0, d11, d7, d6);
        bna2.a(d10, d3 + 1.0, d12, d5, d6);
        bna2.a(d10, d3 + 0.0, d12, d5, d8);
        bna2.a(d9, d3 + 0.0, d12, d7, d8);
        bna2.a(d9, d3 + 1.0, d12, d7, d6);
        bna2.a(d9, d3 + 1.0, d12, d5, d6);
        bna2.a(d9, d3 + 0.0, d12, d5, d8);
        bna2.a(d10, d3 + 0.0, d12, d7, d8);
        bna2.a(d10, d3 + 1.0, d12, d7, d6);
    }

    public boolean p(ahz ahz2, int n2, int n3, int n4) {
        float f2;
        float f3;
        float f4;
        bna bna2 = bna.a;
        int n5 = ahz2.d(this.a, n2, n3, n4);
        float f5 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n5 & 0xFF) / 255.0f;
        boolean bl2 = ahz2.a(this.a, n2, n3 + 1, n4, 1);
        boolean bl3 = ahz2.a(this.a, n2, n3 - 1, n4, 0);
        boolean[] blArray = new boolean[]{ahz2.a(this.a, n2, n3, n4 - 1, 2), ahz2.a(this.a, n2, n3, n4 + 1, 3), ahz2.a(this.a, n2 - 1, n3, n4, 4), ahz2.a(this.a, n2 + 1, n3, n4, 5)};
        if (!(bl2 || bl3 || blArray[0] || blArray[1] || blArray[2] || blArray[3])) {
            return false;
        }
        boolean bl4 = false;
        float f8 = 0.5f;
        float f9 = 1.0f;
        float f10 = 0.8f;
        float f11 = 0.6f;
        double d2 = 0.0;
        double d3 = 1.0;
        avk avk2 = ahz2.o();
        int n6 = this.a.e(n2, n3, n4);
        double d4 = this.a(n2, n3, n4, avk2);
        double d5 = this.a(n2, n3, n4 + 1, avk2);
        double d6 = this.a(n2 + 1, n3, n4 + 1, avk2);
        double d7 = this.a(n2 + 1, n3, n4, avk2);
        double d8 = 0.001f;
        if (this.g || bl2) {
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            double d15;
            double d16;
            bl4 = true;
            pw pw2 = this.a(ahz2, 1, n6);
            float f12 = (float)akn.a(this.a, n2, n3, n4, avk2);
            if (f12 > -999.0f) {
                pw2 = this.a(ahz2, 2, n6);
            }
            d4 -= d8;
            d5 -= d8;
            d6 -= d8;
            d7 -= d8;
            if (f12 < -999.0f) {
                d16 = pw2.a(0.0);
                d15 = pw2.b(0.0);
                d14 = d16;
                d13 = pw2.b(16.0);
                d12 = pw2.a(16.0);
                d11 = d13;
                d10 = d12;
                d9 = d15;
            } else {
                f4 = oy.a(f12) * 0.25f;
                f3 = oy.b(f12) * 0.25f;
                f2 = 8.0f;
                d16 = pw2.a(8.0f + (-f3 - f4) * 16.0f);
                d15 = pw2.b(8.0f + (-f3 + f4) * 16.0f);
                d14 = pw2.a(8.0f + (-f3 + f4) * 16.0f);
                d13 = pw2.b(8.0f + (f3 + f4) * 16.0f);
                d12 = pw2.a(8.0f + (f3 + f4) * 16.0f);
                d11 = pw2.b(8.0f + (f3 - f4) * 16.0f);
                d10 = pw2.a(8.0f + (f3 - f4) * 16.0f);
                d9 = pw2.b(8.0f + (-f3 - f4) * 16.0f);
            }
            bna2.b(ahz2.c(this.a, n2, n3, n4));
            bna2.b(f9 * f5, f9 * f6, f9 * f7);
            bna2.a(n2 + 0, (double)n3 + d4, n4 + 0, d16, d15);
            bna2.a(n2 + 0, (double)n3 + d5, n4 + 1, d14, d13);
            bna2.a(n2 + 1, (double)n3 + d6, n4 + 1, d12, d11);
            bna2.a(n2 + 1, (double)n3 + d7, n4 + 0, d10, d9);
            bna2.a(n2 + 0, (double)n3 + d4, n4 + 0, d16, d15);
            bna2.a(n2 + 1, (double)n3 + d7, n4 + 0, d10, d9);
            bna2.a(n2 + 1, (double)n3 + d6, n4 + 1, d12, d11);
            bna2.a(n2 + 0, (double)n3 + d5, n4 + 1, d14, d13);
        }
        if (this.g || bl3) {
            bna2.b(ahz2.c(this.a, n2, n3 - 1, n4));
            bna2.b(f8, f8, f8);
            this.a(ahz2, (double)n2, (double)n3 + d8, (double)n4, this.a(ahz2, 0));
            bl4 = true;
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            double d17;
            double d18;
            double d19;
            double d20;
            double d21;
            double d22;
            int n7 = n2;
            int n8 = n3;
            int n9 = n4;
            if (i2 == 0) {
                --n9;
            }
            if (i2 == 1) {
                ++n9;
            }
            if (i2 == 2) {
                --n7;
            }
            if (i2 == 3) {
                ++n7;
            }
            pw pw3 = this.a(ahz2, i2 + 2, n6);
            if (!this.g && !blArray[i2]) continue;
            if (i2 == 0) {
                d22 = d4;
                d21 = d7;
                d20 = n2;
                d19 = n2 + 1;
                d18 = (double)n4 + d8;
                d17 = (double)n4 + d8;
            } else if (i2 == 1) {
                d22 = d6;
                d21 = d5;
                d20 = n2 + 1;
                d19 = n2;
                d18 = (double)(n4 + 1) - d8;
                d17 = (double)(n4 + 1) - d8;
            } else if (i2 == 2) {
                d22 = d5;
                d21 = d4;
                d20 = (double)n2 + d8;
                d19 = (double)n2 + d8;
                d18 = n4 + 1;
                d17 = n4;
            } else {
                d22 = d7;
                d21 = d6;
                d20 = (double)(n2 + 1) - d8;
                d19 = (double)(n2 + 1) - d8;
                d18 = n4;
                d17 = n4 + 1;
            }
            bl4 = true;
            float f13 = pw3.a(0.0);
            f4 = pw3.a(8.0);
            f3 = pw3.b((1.0 - d22) * 16.0 * 0.5);
            f2 = pw3.b((1.0 - d21) * 16.0 * 0.5);
            float f14 = pw3.b(8.0);
            bna2.b(ahz2.c(this.a, n7, n8, n9));
            float f15 = 1.0f;
            bna2.b(f9 * (f15 *= i2 < 2 ? f10 : f11) * f5, f9 * f15 * f6, f9 * f15 * f7);
            bna2.a(d20, (double)n3 + d22, d18, f13, f3);
            bna2.a(d19, (double)n3 + d21, d17, f4, f2);
            bna2.a(d19, n3 + 0, d17, f4, f14);
            bna2.a(d20, n3 + 0, d18, f13, f14);
            bna2.a(d20, n3 + 0, d18, f13, f14);
            bna2.a(d19, n3 + 0, d17, f4, f14);
            bna2.a(d19, (double)n3 + d21, d17, f4, f2);
            bna2.a(d20, (double)n3 + d22, d18, f13, f3);
        }
        this.k = d2;
        this.l = d3;
        return bl4;
    }

    private float a(int n2, int n3, int n4, avk avk2) {
        int n5 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n6 = n2 - (i2 & 1);
            int n7 = n3;
            int n8 = n4 - (i2 >> 1 & 1);
            if (this.a.a(n6, n7 + 1, n8).o() == avk2) {
                return 1.0f;
            }
            avk avk3 = this.a.a(n6, n7, n8).o();
            if (avk3 == avk2) {
                int n9 = this.a.e(n6, n7, n8);
                if (n9 >= 8 || n9 == 0) {
                    f2 += akn.b(n9) * 10.0f;
                    n5 += 10;
                }
                f2 += akn.b(n9);
                ++n5;
                continue;
            }
            if (avk3.a()) continue;
            f2 += 1.0f;
            ++n5;
        }
        return 1.0f - f2 / (float)n5;
    }

    public void a(ahz ahz2, afs afs2, int n2, int n3, int n4, int n5) {
        float f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.8f;
        float f5 = 0.6f;
        bna bna2 = bna.a;
        bna2.b();
        bna2.b(ahz2.c((agc)afs2, n2, n3, n4));
        bna2.b(f2, f2, f2);
        this.a(ahz2, -0.5, -0.5, -0.5, this.a(ahz2, 0, n5));
        bna2.b(f3, f3, f3);
        this.b(ahz2, -0.5, -0.5, -0.5, this.a(ahz2, 1, n5));
        bna2.b(f4, f4, f4);
        this.c(ahz2, -0.5, -0.5, -0.5, this.a(ahz2, 2, n5));
        bna2.b(f4, f4, f4);
        this.d(ahz2, -0.5, -0.5, -0.5, this.a(ahz2, 3, n5));
        bna2.b(f5, f5, f5);
        this.e(ahz2, -0.5, -0.5, -0.5, this.a(ahz2, 4, n5));
        bna2.b(f5, f5, f5);
        this.f(ahz2, -0.5, -0.5, -0.5, this.a(ahz2, 5, n5));
        bna2.a();
    }

    public boolean q(ahz ahz2, int n2, int n3, int n4) {
        int n5 = ahz2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        if (azi.y() && ahz2.m() == 0) {
            if (this.p) {
                return this.b(ahz2, n2, n3, n4, f2, f3, f4);
            }
            return this.a(ahz2, n2, n3, n4, f2, f3, f4);
        }
        return this.d(ahz2, n2, n3, n4, f2, f3, f4);
    }

    public boolean r(ahz ahz2, int n2, int n3, int n4) {
        int n5 = this.a.e(n2, n3, n4);
        int n6 = n5 & 0xC;
        if (n6 == 4) {
            this.r = 1;
            this.s = 1;
            this.v = 1;
            this.w = 1;
        } else if (n6 == 8) {
            this.t = 1;
            this.u = 1;
        }
        boolean bl2 = this.q(ahz2, n2, n3, n4);
        this.t = 0;
        this.r = 0;
        this.s = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        return bl2;
    }

    public boolean s(ahz ahz2, int n2, int n3, int n4) {
        int n5 = this.a.e(n2, n3, n4);
        if (n5 == 3) {
            this.r = 1;
            this.s = 1;
            this.v = 1;
            this.w = 1;
        } else if (n5 == 4) {
            this.t = 1;
            this.u = 1;
        }
        boolean bl2 = this.q(ahz2, n2, n3, n4);
        this.t = 0;
        this.r = 0;
        this.s = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        return bl2;
    }

    public boolean a(ahz ahz2, int n2, int n3, int n4, float f2, float f3, float f4) {
        pw pw2;
        float f5;
        int n5;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        this.x = true;
        boolean bl6 = false;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        boolean bl7 = true;
        int n6 = ahz2.c(this.a, n2, n3, n4);
        bna bna2 = bna.a;
        bna2.b(983055);
        if (this.b(ahz2).g().equals("grass_top")) {
            bl7 = false;
        } else if (this.b()) {
            bl7 = false;
        }
        if (this.g || ahz2.a(this.a, n2, n3 - 1, n4, 0)) {
            if (this.k <= 0.0) {
                --n3;
            }
            this.T = ahz2.c(this.a, n2 - 1, n3, n4);
            this.V = ahz2.c(this.a, n2, n3, n4 - 1);
            this.W = ahz2.c(this.a, n2, n3, n4 + 1);
            this.Y = ahz2.c(this.a, n2 + 1, n3, n4);
            this.z = this.a.a(n2 - 1, n3, n4).I();
            this.B = this.a.a(n2, n3, n4 - 1).I();
            this.C = this.a.a(n2, n3, n4 + 1).I();
            this.E = this.a.a(n2 + 1, n3, n4).I();
            bl5 = this.a.a(n2 + 1, n3 - 1, n4).l();
            bl4 = this.a.a(n2 - 1, n3 - 1, n4).l();
            bl3 = this.a.a(n2, n3 - 1, n4 + 1).l();
            bl2 = this.a.a(n2, n3 - 1, n4 - 1).l();
            if (bl2 || bl4) {
                this.y = this.a.a(n2 - 1, n3, n4 - 1).I();
                this.S = ahz2.c(this.a, n2 - 1, n3, n4 - 1);
            } else {
                this.y = this.z;
                this.S = this.T;
            }
            if (bl3 || bl4) {
                this.A = this.a.a(n2 - 1, n3, n4 + 1).I();
                this.U = ahz2.c(this.a, n2 - 1, n3, n4 + 1);
            } else {
                this.A = this.z;
                this.U = this.T;
            }
            if (bl2 || bl5) {
                this.D = this.a.a(n2 + 1, n3, n4 - 1).I();
                this.X = ahz2.c(this.a, n2 + 1, n3, n4 - 1);
            } else {
                this.D = this.E;
                this.X = this.Y;
            }
            if (bl3 || bl5) {
                this.F = this.a.a(n2 + 1, n3, n4 + 1).I();
                this.Z = ahz2.c(this.a, n2 + 1, n3, n4 + 1);
            } else {
                this.F = this.E;
                this.Z = this.Y;
            }
            if (this.k <= 0.0) {
                ++n3;
            }
            n5 = n6;
            if (this.k <= 0.0 || !this.a.a(n2, n3 - 1, n4).c()) {
                n5 = ahz2.c(this.a, n2, n3 - 1, n4);
            }
            f5 = this.a.a(n2, n3 - 1, n4).I();
            f6 = (this.A + this.z + this.C + f5) / 4.0f;
            f9 = (this.C + f5 + this.F + this.E) / 4.0f;
            f8 = (f5 + this.B + this.E + this.D) / 4.0f;
            f7 = (this.z + this.y + f5 + this.B) / 4.0f;
            this.am = this.a(this.U, this.T, this.W, n5);
            this.ap = this.a(this.W, this.Z, this.Y, n5);
            this.ao = this.a(this.V, this.Y, this.X, n5);
            this.an = this.a(this.T, this.S, this.V, n5);
            if (bl7) {
                this.as = this.at = f2 * 0.5f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.5f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.5f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.5f;
                this.as = 0.5f;
                this.ar = 0.5f;
                this.aq = 0.5f;
                this.ax = 0.5f;
                this.aw = 0.5f;
                this.av = 0.5f;
                this.au = 0.5f;
                this.aB = 0.5f;
                this.aA = 0.5f;
                this.az = 0.5f;
                this.ay = 0.5f;
            }
            this.aq *= f6;
            this.au *= f6;
            this.ay *= f6;
            this.ar *= f7;
            this.av *= f7;
            this.az *= f7;
            this.as *= f8;
            this.aw *= f8;
            this.aA *= f8;
            this.at *= f9;
            this.ax *= f9;
            this.aB *= f9;
            this.a(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 0));
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3 + 1, n4, 1)) {
            if (this.l >= 1.0) {
                ++n3;
            }
            this.ab = ahz2.c(this.a, n2 - 1, n3, n4);
            this.af = ahz2.c(this.a, n2 + 1, n3, n4);
            this.ad = ahz2.c(this.a, n2, n3, n4 - 1);
            this.ag = ahz2.c(this.a, n2, n3, n4 + 1);
            this.H = this.a.a(n2 - 1, n3, n4).I();
            this.L = this.a.a(n2 + 1, n3, n4).I();
            this.J = this.a.a(n2, n3, n4 - 1).I();
            this.M = this.a.a(n2, n3, n4 + 1).I();
            bl5 = this.a.a(n2 + 1, n3 + 1, n4).l();
            bl4 = this.a.a(n2 - 1, n3 + 1, n4).l();
            bl3 = this.a.a(n2, n3 + 1, n4 + 1).l();
            bl2 = this.a.a(n2, n3 + 1, n4 - 1).l();
            if (bl2 || bl4) {
                this.G = this.a.a(n2 - 1, n3, n4 - 1).I();
                this.aa = ahz2.c(this.a, n2 - 1, n3, n4 - 1);
            } else {
                this.G = this.H;
                this.aa = this.ab;
            }
            if (bl2 || bl5) {
                this.K = this.a.a(n2 + 1, n3, n4 - 1).I();
                this.ae = ahz2.c(this.a, n2 + 1, n3, n4 - 1);
            } else {
                this.K = this.L;
                this.ae = this.af;
            }
            if (bl3 || bl4) {
                this.I = this.a.a(n2 - 1, n3, n4 + 1).I();
                this.ac = ahz2.c(this.a, n2 - 1, n3, n4 + 1);
            } else {
                this.I = this.H;
                this.ac = this.ab;
            }
            if (bl3 || bl5) {
                this.N = this.a.a(n2 + 1, n3, n4 + 1).I();
                this.ah = ahz2.c(this.a, n2 + 1, n3, n4 + 1);
            } else {
                this.N = this.L;
                this.ah = this.af;
            }
            if (this.l >= 1.0) {
                --n3;
            }
            n5 = n6;
            if (this.l >= 1.0 || !this.a.a(n2, n3 + 1, n4).c()) {
                n5 = ahz2.c(this.a, n2, n3 + 1, n4);
            }
            f5 = this.a.a(n2, n3 + 1, n4).I();
            f9 = (this.I + this.H + this.M + f5) / 4.0f;
            f6 = (this.M + f5 + this.N + this.L) / 4.0f;
            f7 = (f5 + this.J + this.L + this.K) / 4.0f;
            f8 = (this.H + this.G + f5 + this.J) / 4.0f;
            this.ap = this.a(this.ac, this.ab, this.ag, n5);
            this.am = this.a(this.ag, this.ah, this.af, n5);
            this.an = this.a(this.ad, this.af, this.ae, n5);
            this.ao = this.a(this.ab, this.aa, this.ad, n5);
            this.as = this.at = f2;
            this.ar = this.at;
            this.aq = this.at;
            this.aw = this.ax = f3;
            this.av = this.ax;
            this.au = this.ax;
            this.aA = this.aB = f4;
            this.az = this.aB;
            this.ay = this.aB;
            this.aq *= f6;
            this.au *= f6;
            this.ay *= f6;
            this.ar *= f7;
            this.av *= f7;
            this.az *= f7;
            this.as *= f8;
            this.aw *= f8;
            this.aA *= f8;
            this.at *= f9;
            this.ax *= f9;
            this.aB *= f9;
            this.b(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 1));
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3, n4 - 1, 2)) {
            if (this.m <= 0.0) {
                --n4;
            }
            this.O = this.a.a(n2 - 1, n3, n4).I();
            this.B = this.a.a(n2, n3 - 1, n4).I();
            this.J = this.a.a(n2, n3 + 1, n4).I();
            this.P = this.a.a(n2 + 1, n3, n4).I();
            this.ai = ahz2.c(this.a, n2 - 1, n3, n4);
            this.V = ahz2.c(this.a, n2, n3 - 1, n4);
            this.ad = ahz2.c(this.a, n2, n3 + 1, n4);
            this.aj = ahz2.c(this.a, n2 + 1, n3, n4);
            bl5 = this.a.a(n2 + 1, n3, n4 - 1).l();
            bl4 = this.a.a(n2 - 1, n3, n4 - 1).l();
            bl3 = this.a.a(n2, n3 + 1, n4 - 1).l();
            bl2 = this.a.a(n2, n3 - 1, n4 - 1).l();
            if (bl4 || bl2) {
                this.y = this.a.a(n2 - 1, n3 - 1, n4).I();
                this.S = ahz2.c(this.a, n2 - 1, n3 - 1, n4);
            } else {
                this.y = this.O;
                this.S = this.ai;
            }
            if (bl4 || bl3) {
                this.G = this.a.a(n2 - 1, n3 + 1, n4).I();
                this.aa = ahz2.c(this.a, n2 - 1, n3 + 1, n4);
            } else {
                this.G = this.O;
                this.aa = this.ai;
            }
            if (bl5 || bl2) {
                this.D = this.a.a(n2 + 1, n3 - 1, n4).I();
                this.X = ahz2.c(this.a, n2 + 1, n3 - 1, n4);
            } else {
                this.D = this.P;
                this.X = this.aj;
            }
            if (bl5 || bl3) {
                this.K = this.a.a(n2 + 1, n3 + 1, n4).I();
                this.ae = ahz2.c(this.a, n2 + 1, n3 + 1, n4);
            } else {
                this.K = this.P;
                this.ae = this.aj;
            }
            if (this.m <= 0.0) {
                ++n4;
            }
            n5 = n6;
            if (this.m <= 0.0 || !this.a.a(n2, n3, n4 - 1).c()) {
                n5 = ahz2.c(this.a, n2, n3, n4 - 1);
            }
            f5 = this.a.a(n2, n3, n4 - 1).I();
            f6 = (this.O + this.G + f5 + this.J) / 4.0f;
            f7 = (f5 + this.J + this.P + this.K) / 4.0f;
            f8 = (this.B + f5 + this.D + this.P) / 4.0f;
            f9 = (this.y + this.O + this.B + f5) / 4.0f;
            this.am = this.a(this.ai, this.aa, this.ad, n5);
            this.an = this.a(this.ad, this.aj, this.ae, n5);
            this.ao = this.a(this.V, this.X, this.aj, n5);
            this.ap = this.a(this.S, this.ai, this.V, n5);
            if (bl7) {
                this.as = this.at = f2 * 0.8f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.8f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.8f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.8f;
                this.as = 0.8f;
                this.ar = 0.8f;
                this.aq = 0.8f;
                this.ax = 0.8f;
                this.aw = 0.8f;
                this.av = 0.8f;
                this.au = 0.8f;
                this.aB = 0.8f;
                this.aA = 0.8f;
                this.az = 0.8f;
                this.ay = 0.8f;
            }
            this.aq *= f6;
            this.au *= f6;
            this.ay *= f6;
            this.ar *= f7;
            this.av *= f7;
            this.az *= f7;
            this.as *= f8;
            this.aw *= f8;
            this.aA *= f8;
            this.at *= f9;
            this.ax *= f9;
            this.aB *= f9;
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 2);
            this.c(ahz2, (double)n2, (double)n3, (double)n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.c(ahz2, (double)n2, (double)n3, (double)n4, ajy.e());
            }
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3, n4 + 1, 3)) {
            if (this.n >= 1.0) {
                ++n4;
            }
            this.Q = this.a.a(n2 - 1, n3, n4).I();
            this.R = this.a.a(n2 + 1, n3, n4).I();
            this.C = this.a.a(n2, n3 - 1, n4).I();
            this.M = this.a.a(n2, n3 + 1, n4).I();
            this.ak = ahz2.c(this.a, n2 - 1, n3, n4);
            this.al = ahz2.c(this.a, n2 + 1, n3, n4);
            this.W = ahz2.c(this.a, n2, n3 - 1, n4);
            this.ag = ahz2.c(this.a, n2, n3 + 1, n4);
            bl5 = this.a.a(n2 + 1, n3, n4 + 1).l();
            bl4 = this.a.a(n2 - 1, n3, n4 + 1).l();
            bl3 = this.a.a(n2, n3 + 1, n4 + 1).l();
            bl2 = this.a.a(n2, n3 - 1, n4 + 1).l();
            if (bl4 || bl2) {
                this.A = this.a.a(n2 - 1, n3 - 1, n4).I();
                this.U = ahz2.c(this.a, n2 - 1, n3 - 1, n4);
            } else {
                this.A = this.Q;
                this.U = this.ak;
            }
            if (bl4 || bl3) {
                this.I = this.a.a(n2 - 1, n3 + 1, n4).I();
                this.ac = ahz2.c(this.a, n2 - 1, n3 + 1, n4);
            } else {
                this.I = this.Q;
                this.ac = this.ak;
            }
            if (bl5 || bl2) {
                this.F = this.a.a(n2 + 1, n3 - 1, n4).I();
                this.Z = ahz2.c(this.a, n2 + 1, n3 - 1, n4);
            } else {
                this.F = this.R;
                this.Z = this.al;
            }
            if (bl5 || bl3) {
                this.N = this.a.a(n2 + 1, n3 + 1, n4).I();
                this.ah = ahz2.c(this.a, n2 + 1, n3 + 1, n4);
            } else {
                this.N = this.R;
                this.ah = this.al;
            }
            if (this.n >= 1.0) {
                --n4;
            }
            n5 = n6;
            if (this.n >= 1.0 || !this.a.a(n2, n3, n4 + 1).c()) {
                n5 = ahz2.c(this.a, n2, n3, n4 + 1);
            }
            f5 = this.a.a(n2, n3, n4 + 1).I();
            f6 = (this.Q + this.I + f5 + this.M) / 4.0f;
            f9 = (f5 + this.M + this.R + this.N) / 4.0f;
            f8 = (this.C + f5 + this.F + this.R) / 4.0f;
            f7 = (this.A + this.Q + this.C + f5) / 4.0f;
            this.am = this.a(this.ak, this.ac, this.ag, n5);
            this.ap = this.a(this.ag, this.al, this.ah, n5);
            this.ao = this.a(this.W, this.Z, this.al, n5);
            this.an = this.a(this.U, this.ak, this.W, n5);
            if (bl7) {
                this.as = this.at = f2 * 0.8f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.8f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.8f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.8f;
                this.as = 0.8f;
                this.ar = 0.8f;
                this.aq = 0.8f;
                this.ax = 0.8f;
                this.aw = 0.8f;
                this.av = 0.8f;
                this.au = 0.8f;
                this.aB = 0.8f;
                this.aA = 0.8f;
                this.az = 0.8f;
                this.ay = 0.8f;
            }
            this.aq *= f6;
            this.au *= f6;
            this.ay *= f6;
            this.ar *= f7;
            this.av *= f7;
            this.az *= f7;
            this.as *= f8;
            this.aw *= f8;
            this.aA *= f8;
            this.at *= f9;
            this.ax *= f9;
            this.aB *= f9;
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 3);
            this.d(ahz2, n2, n3, n4, this.a(ahz2, this.a, n2, n3, n4, 3));
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.d(ahz2, n2, n3, n4, ajy.e());
            }
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2 - 1, n3, n4, 4)) {
            if (this.i <= 0.0) {
                --n2;
            }
            this.z = this.a.a(n2, n3 - 1, n4).I();
            this.O = this.a.a(n2, n3, n4 - 1).I();
            this.Q = this.a.a(n2, n3, n4 + 1).I();
            this.H = this.a.a(n2, n3 + 1, n4).I();
            this.T = ahz2.c(this.a, n2, n3 - 1, n4);
            this.ai = ahz2.c(this.a, n2, n3, n4 - 1);
            this.ak = ahz2.c(this.a, n2, n3, n4 + 1);
            this.ab = ahz2.c(this.a, n2, n3 + 1, n4);
            bl5 = this.a.a(n2 - 1, n3 + 1, n4).l();
            bl4 = this.a.a(n2 - 1, n3 - 1, n4).l();
            bl3 = this.a.a(n2 - 1, n3, n4 - 1).l();
            bl2 = this.a.a(n2 - 1, n3, n4 + 1).l();
            if (bl3 || bl4) {
                this.y = this.a.a(n2, n3 - 1, n4 - 1).I();
                this.S = ahz2.c(this.a, n2, n3 - 1, n4 - 1);
            } else {
                this.y = this.O;
                this.S = this.ai;
            }
            if (bl2 || bl4) {
                this.A = this.a.a(n2, n3 - 1, n4 + 1).I();
                this.U = ahz2.c(this.a, n2, n3 - 1, n4 + 1);
            } else {
                this.A = this.Q;
                this.U = this.ak;
            }
            if (bl3 || bl5) {
                this.G = this.a.a(n2, n3 + 1, n4 - 1).I();
                this.aa = ahz2.c(this.a, n2, n3 + 1, n4 - 1);
            } else {
                this.G = this.O;
                this.aa = this.ai;
            }
            if (bl2 || bl5) {
                this.I = this.a.a(n2, n3 + 1, n4 + 1).I();
                this.ac = ahz2.c(this.a, n2, n3 + 1, n4 + 1);
            } else {
                this.I = this.Q;
                this.ac = this.ak;
            }
            if (this.i <= 0.0) {
                ++n2;
            }
            n5 = n6;
            if (this.i <= 0.0 || !this.a.a(n2 - 1, n3, n4).c()) {
                n5 = ahz2.c(this.a, n2 - 1, n3, n4);
            }
            f5 = this.a.a(n2 - 1, n3, n4).I();
            f9 = (this.z + this.A + f5 + this.Q) / 4.0f;
            f6 = (f5 + this.Q + this.H + this.I) / 4.0f;
            f7 = (this.O + f5 + this.G + this.H) / 4.0f;
            f8 = (this.y + this.z + this.O + f5) / 4.0f;
            this.ap = this.a(this.T, this.U, this.ak, n5);
            this.am = this.a(this.ak, this.ab, this.ac, n5);
            this.an = this.a(this.ai, this.aa, this.ab, n5);
            this.ao = this.a(this.S, this.T, this.ai, n5);
            if (bl7) {
                this.as = this.at = f2 * 0.6f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.6f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.6f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.6f;
                this.as = 0.6f;
                this.ar = 0.6f;
                this.aq = 0.6f;
                this.ax = 0.6f;
                this.aw = 0.6f;
                this.av = 0.6f;
                this.au = 0.6f;
                this.aB = 0.6f;
                this.aA = 0.6f;
                this.az = 0.6f;
                this.ay = 0.6f;
            }
            this.aq *= f6;
            this.au *= f6;
            this.ay *= f6;
            this.ar *= f7;
            this.av *= f7;
            this.az *= f7;
            this.as *= f8;
            this.aw *= f8;
            this.aA *= f8;
            this.at *= f9;
            this.ax *= f9;
            this.aB *= f9;
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 4);
            this.e(ahz2, n2, n3, n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.e(ahz2, n2, n3, n4, ajy.e());
            }
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2 + 1, n3, n4, 5)) {
            if (this.j >= 1.0) {
                ++n2;
            }
            this.E = this.a.a(n2, n3 - 1, n4).I();
            this.P = this.a.a(n2, n3, n4 - 1).I();
            this.R = this.a.a(n2, n3, n4 + 1).I();
            this.L = this.a.a(n2, n3 + 1, n4).I();
            this.Y = ahz2.c(this.a, n2, n3 - 1, n4);
            this.aj = ahz2.c(this.a, n2, n3, n4 - 1);
            this.al = ahz2.c(this.a, n2, n3, n4 + 1);
            this.af = ahz2.c(this.a, n2, n3 + 1, n4);
            bl5 = this.a.a(n2 + 1, n3 + 1, n4).l();
            bl4 = this.a.a(n2 + 1, n3 - 1, n4).l();
            bl3 = this.a.a(n2 + 1, n3, n4 + 1).l();
            bl2 = this.a.a(n2 + 1, n3, n4 - 1).l();
            if (bl4 || bl2) {
                this.D = this.a.a(n2, n3 - 1, n4 - 1).I();
                this.X = ahz2.c(this.a, n2, n3 - 1, n4 - 1);
            } else {
                this.D = this.P;
                this.X = this.aj;
            }
            if (bl4 || bl3) {
                this.F = this.a.a(n2, n3 - 1, n4 + 1).I();
                this.Z = ahz2.c(this.a, n2, n3 - 1, n4 + 1);
            } else {
                this.F = this.R;
                this.Z = this.al;
            }
            if (bl5 || bl2) {
                this.K = this.a.a(n2, n3 + 1, n4 - 1).I();
                this.ae = ahz2.c(this.a, n2, n3 + 1, n4 - 1);
            } else {
                this.K = this.P;
                this.ae = this.aj;
            }
            if (bl5 || bl3) {
                this.N = this.a.a(n2, n3 + 1, n4 + 1).I();
                this.ah = ahz2.c(this.a, n2, n3 + 1, n4 + 1);
            } else {
                this.N = this.R;
                this.ah = this.al;
            }
            if (this.j >= 1.0) {
                --n2;
            }
            n5 = n6;
            if (this.j >= 1.0 || !this.a.a(n2 + 1, n3, n4).c()) {
                n5 = ahz2.c(this.a, n2 + 1, n3, n4);
            }
            f5 = this.a.a(n2 + 1, n3, n4).I();
            f6 = (this.E + this.F + f5 + this.R) / 4.0f;
            f7 = (this.D + this.E + this.P + f5) / 4.0f;
            f8 = (this.P + f5 + this.K + this.L) / 4.0f;
            f9 = (f5 + this.R + this.L + this.N) / 4.0f;
            this.am = this.a(this.Y, this.Z, this.al, n5);
            this.ap = this.a(this.al, this.af, this.ah, n5);
            this.ao = this.a(this.aj, this.ae, this.af, n5);
            this.an = this.a(this.X, this.Y, this.aj, n5);
            if (bl7) {
                this.as = this.at = f2 * 0.6f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.6f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.6f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.6f;
                this.as = 0.6f;
                this.ar = 0.6f;
                this.aq = 0.6f;
                this.ax = 0.6f;
                this.aw = 0.6f;
                this.av = 0.6f;
                this.au = 0.6f;
                this.aB = 0.6f;
                this.aA = 0.6f;
                this.az = 0.6f;
                this.ay = 0.6f;
            }
            this.aq *= f6;
            this.au *= f6;
            this.ay *= f6;
            this.ar *= f7;
            this.av *= f7;
            this.az *= f7;
            this.as *= f8;
            this.aw *= f8;
            this.aA *= f8;
            this.at *= f9;
            this.ax *= f9;
            this.aB *= f9;
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 5);
            this.f(ahz2, n2, n3, n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.f(ahz2, n2, n3, n4, ajy.e());
            }
            bl6 = true;
        }
        this.x = false;
        return bl6;
    }

    public boolean b(ahz ahz2, int n2, int n3, int n4, float f2, float f3, float f4) {
        pw pw2;
        int n5;
        int n6;
        int n7;
        int n8;
        float f5;
        float f6;
        float f7;
        float f8;
        int n9;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        this.x = true;
        boolean bl6 = false;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean bl7 = true;
        int n10 = ahz2.c(this.a, n2, n3, n4);
        bna bna2 = bna.a;
        bna2.b(983055);
        if (this.b(ahz2).g().equals("grass_top")) {
            bl7 = false;
        } else if (this.b()) {
            bl7 = false;
        }
        if (this.g || ahz2.a(this.a, n2, n3 - 1, n4, 0)) {
            if (this.k <= 0.0) {
                --n3;
            }
            this.T = ahz2.c(this.a, n2 - 1, n3, n4);
            this.V = ahz2.c(this.a, n2, n3, n4 - 1);
            this.W = ahz2.c(this.a, n2, n3, n4 + 1);
            this.Y = ahz2.c(this.a, n2 + 1, n3, n4);
            this.z = this.a.a(n2 - 1, n3, n4).I();
            this.B = this.a.a(n2, n3, n4 - 1).I();
            this.C = this.a.a(n2, n3, n4 + 1).I();
            this.E = this.a.a(n2 + 1, n3, n4).I();
            bl5 = this.a.a(n2 + 1, n3 - 1, n4).l();
            bl4 = this.a.a(n2 - 1, n3 - 1, n4).l();
            bl3 = this.a.a(n2, n3 - 1, n4 + 1).l();
            bl2 = this.a.a(n2, n3 - 1, n4 - 1).l();
            if (bl2 || bl4) {
                this.y = this.a.a(n2 - 1, n3, n4 - 1).I();
                this.S = ahz2.c(this.a, n2 - 1, n3, n4 - 1);
            } else {
                this.y = this.z;
                this.S = this.T;
            }
            if (bl3 || bl4) {
                this.A = this.a.a(n2 - 1, n3, n4 + 1).I();
                this.U = ahz2.c(this.a, n2 - 1, n3, n4 + 1);
            } else {
                this.A = this.z;
                this.U = this.T;
            }
            if (bl2 || bl5) {
                this.D = this.a.a(n2 + 1, n3, n4 - 1).I();
                this.X = ahz2.c(this.a, n2 + 1, n3, n4 - 1);
            } else {
                this.D = this.E;
                this.X = this.Y;
            }
            if (bl3 || bl5) {
                this.F = this.a.a(n2 + 1, n3, n4 + 1).I();
                this.Z = ahz2.c(this.a, n2 + 1, n3, n4 + 1);
            } else {
                this.F = this.E;
                this.Z = this.Y;
            }
            if (this.k <= 0.0) {
                ++n3;
            }
            n9 = n10;
            if (this.k <= 0.0 || !this.a.a(n2, n3 - 1, n4).c()) {
                n9 = ahz2.c(this.a, n2, n3 - 1, n4);
            }
            f8 = this.a.a(n2, n3 - 1, n4).I();
            f9 = (this.A + this.z + this.C + f8) / 4.0f;
            f12 = (this.C + f8 + this.F + this.E) / 4.0f;
            f11 = (f8 + this.B + this.E + this.D) / 4.0f;
            f10 = (this.z + this.y + f8 + this.B) / 4.0f;
            this.am = this.a(this.U, this.T, this.W, n9);
            this.ap = this.a(this.W, this.Z, this.Y, n9);
            this.ao = this.a(this.V, this.Y, this.X, n9);
            this.an = this.a(this.T, this.S, this.V, n9);
            if (bl7) {
                this.as = this.at = f2 * 0.5f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.5f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.5f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.5f;
                this.as = 0.5f;
                this.ar = 0.5f;
                this.aq = 0.5f;
                this.ax = 0.5f;
                this.aw = 0.5f;
                this.av = 0.5f;
                this.au = 0.5f;
                this.aB = 0.5f;
                this.aA = 0.5f;
                this.az = 0.5f;
                this.ay = 0.5f;
            }
            this.aq *= f9;
            this.au *= f9;
            this.ay *= f9;
            this.ar *= f10;
            this.av *= f10;
            this.az *= f10;
            this.as *= f11;
            this.aw *= f11;
            this.aA *= f11;
            this.at *= f12;
            this.ax *= f12;
            this.aB *= f12;
            this.a(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 0));
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3 + 1, n4, 1)) {
            if (this.l >= 1.0) {
                ++n3;
            }
            this.ab = ahz2.c(this.a, n2 - 1, n3, n4);
            this.af = ahz2.c(this.a, n2 + 1, n3, n4);
            this.ad = ahz2.c(this.a, n2, n3, n4 - 1);
            this.ag = ahz2.c(this.a, n2, n3, n4 + 1);
            this.H = this.a.a(n2 - 1, n3, n4).I();
            this.L = this.a.a(n2 + 1, n3, n4).I();
            this.J = this.a.a(n2, n3, n4 - 1).I();
            this.M = this.a.a(n2, n3, n4 + 1).I();
            bl5 = this.a.a(n2 + 1, n3 + 1, n4).l();
            bl4 = this.a.a(n2 - 1, n3 + 1, n4).l();
            bl3 = this.a.a(n2, n3 + 1, n4 + 1).l();
            bl2 = this.a.a(n2, n3 + 1, n4 - 1).l();
            if (bl2 || bl4) {
                this.G = this.a.a(n2 - 1, n3, n4 - 1).I();
                this.aa = ahz2.c(this.a, n2 - 1, n3, n4 - 1);
            } else {
                this.G = this.H;
                this.aa = this.ab;
            }
            if (bl2 || bl5) {
                this.K = this.a.a(n2 + 1, n3, n4 - 1).I();
                this.ae = ahz2.c(this.a, n2 + 1, n3, n4 - 1);
            } else {
                this.K = this.L;
                this.ae = this.af;
            }
            if (bl3 || bl4) {
                this.I = this.a.a(n2 - 1, n3, n4 + 1).I();
                this.ac = ahz2.c(this.a, n2 - 1, n3, n4 + 1);
            } else {
                this.I = this.H;
                this.ac = this.ab;
            }
            if (bl3 || bl5) {
                this.N = this.a.a(n2 + 1, n3, n4 + 1).I();
                this.ah = ahz2.c(this.a, n2 + 1, n3, n4 + 1);
            } else {
                this.N = this.L;
                this.ah = this.af;
            }
            if (this.l >= 1.0) {
                --n3;
            }
            n9 = n10;
            if (this.l >= 1.0 || !this.a.a(n2, n3 + 1, n4).c()) {
                n9 = ahz2.c(this.a, n2, n3 + 1, n4);
            }
            f8 = this.a.a(n2, n3 + 1, n4).I();
            f12 = (this.I + this.H + this.M + f8) / 4.0f;
            f9 = (this.M + f8 + this.N + this.L) / 4.0f;
            f10 = (f8 + this.J + this.L + this.K) / 4.0f;
            f11 = (this.H + this.G + f8 + this.J) / 4.0f;
            this.ap = this.a(this.ac, this.ab, this.ag, n9);
            this.am = this.a(this.ag, this.ah, this.af, n9);
            this.an = this.a(this.ad, this.af, this.ae, n9);
            this.ao = this.a(this.ab, this.aa, this.ad, n9);
            this.as = this.at = f2;
            this.ar = this.at;
            this.aq = this.at;
            this.aw = this.ax = f3;
            this.av = this.ax;
            this.au = this.ax;
            this.aA = this.aB = f4;
            this.az = this.aB;
            this.ay = this.aB;
            this.aq *= f9;
            this.au *= f9;
            this.ay *= f9;
            this.ar *= f10;
            this.av *= f10;
            this.az *= f10;
            this.as *= f11;
            this.aw *= f11;
            this.aA *= f11;
            this.at *= f12;
            this.ax *= f12;
            this.aB *= f12;
            this.b(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 1));
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3, n4 - 1, 2)) {
            if (this.m <= 0.0) {
                --n4;
            }
            this.O = this.a.a(n2 - 1, n3, n4).I();
            this.B = this.a.a(n2, n3 - 1, n4).I();
            this.J = this.a.a(n2, n3 + 1, n4).I();
            this.P = this.a.a(n2 + 1, n3, n4).I();
            this.ai = ahz2.c(this.a, n2 - 1, n3, n4);
            this.V = ahz2.c(this.a, n2, n3 - 1, n4);
            this.ad = ahz2.c(this.a, n2, n3 + 1, n4);
            this.aj = ahz2.c(this.a, n2 + 1, n3, n4);
            bl5 = this.a.a(n2 + 1, n3, n4 - 1).l();
            bl4 = this.a.a(n2 - 1, n3, n4 - 1).l();
            bl3 = this.a.a(n2, n3 + 1, n4 - 1).l();
            bl2 = this.a.a(n2, n3 - 1, n4 - 1).l();
            if (bl4 || bl2) {
                this.y = this.a.a(n2 - 1, n3 - 1, n4).I();
                this.S = ahz2.c(this.a, n2 - 1, n3 - 1, n4);
            } else {
                this.y = this.O;
                this.S = this.ai;
            }
            if (bl4 || bl3) {
                this.G = this.a.a(n2 - 1, n3 + 1, n4).I();
                this.aa = ahz2.c(this.a, n2 - 1, n3 + 1, n4);
            } else {
                this.G = this.O;
                this.aa = this.ai;
            }
            if (bl5 || bl2) {
                this.D = this.a.a(n2 + 1, n3 - 1, n4).I();
                this.X = ahz2.c(this.a, n2 + 1, n3 - 1, n4);
            } else {
                this.D = this.P;
                this.X = this.aj;
            }
            if (bl5 || bl3) {
                this.K = this.a.a(n2 + 1, n3 + 1, n4).I();
                this.ae = ahz2.c(this.a, n2 + 1, n3 + 1, n4);
            } else {
                this.K = this.P;
                this.ae = this.aj;
            }
            if (this.m <= 0.0) {
                ++n4;
            }
            n9 = n10;
            if (this.m <= 0.0 || !this.a.a(n2, n3, n4 - 1).c()) {
                n9 = ahz2.c(this.a, n2, n3, n4 - 1);
            }
            f8 = this.a.a(n2, n3, n4 - 1).I();
            float f13 = (this.O + this.G + f8 + this.J) / 4.0f;
            f7 = (f8 + this.J + this.P + this.K) / 4.0f;
            f6 = (this.B + f8 + this.D + this.P) / 4.0f;
            f5 = (this.y + this.O + this.B + f8) / 4.0f;
            f9 = (float)((double)f13 * this.l * (1.0 - this.i) + (double)f7 * this.l * this.i + (double)f6 * (1.0 - this.l) * this.i + (double)f5 * (1.0 - this.l) * (1.0 - this.i));
            f10 = (float)((double)f13 * this.l * (1.0 - this.j) + (double)f7 * this.l * this.j + (double)f6 * (1.0 - this.l) * this.j + (double)f5 * (1.0 - this.l) * (1.0 - this.j));
            f11 = (float)((double)f13 * this.k * (1.0 - this.j) + (double)f7 * this.k * this.j + (double)f6 * (1.0 - this.k) * this.j + (double)f5 * (1.0 - this.k) * (1.0 - this.j));
            f12 = (float)((double)f13 * this.k * (1.0 - this.i) + (double)f7 * this.k * this.i + (double)f6 * (1.0 - this.k) * this.i + (double)f5 * (1.0 - this.k) * (1.0 - this.i));
            n8 = this.a(this.ai, this.aa, this.ad, n9);
            n7 = this.a(this.ad, this.aj, this.ae, n9);
            n6 = this.a(this.V, this.X, this.aj, n9);
            n5 = this.a(this.S, this.ai, this.V, n9);
            this.am = this.a(n8, n7, n6, n5, this.l * (1.0 - this.i), this.l * this.i, (1.0 - this.l) * this.i, (1.0 - this.l) * (1.0 - this.i));
            this.an = this.a(n8, n7, n6, n5, this.l * (1.0 - this.j), this.l * this.j, (1.0 - this.l) * this.j, (1.0 - this.l) * (1.0 - this.j));
            this.ao = this.a(n8, n7, n6, n5, this.k * (1.0 - this.j), this.k * this.j, (1.0 - this.k) * this.j, (1.0 - this.k) * (1.0 - this.j));
            this.ap = this.a(n8, n7, n6, n5, this.k * (1.0 - this.i), this.k * this.i, (1.0 - this.k) * this.i, (1.0 - this.k) * (1.0 - this.i));
            if (bl7) {
                this.as = this.at = f2 * 0.8f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.8f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.8f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.8f;
                this.as = 0.8f;
                this.ar = 0.8f;
                this.aq = 0.8f;
                this.ax = 0.8f;
                this.aw = 0.8f;
                this.av = 0.8f;
                this.au = 0.8f;
                this.aB = 0.8f;
                this.aA = 0.8f;
                this.az = 0.8f;
                this.ay = 0.8f;
            }
            this.aq *= f9;
            this.au *= f9;
            this.ay *= f9;
            this.ar *= f10;
            this.av *= f10;
            this.az *= f10;
            this.as *= f11;
            this.aw *= f11;
            this.aA *= f11;
            this.at *= f12;
            this.ax *= f12;
            this.aB *= f12;
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 2);
            this.c(ahz2, (double)n2, (double)n3, (double)n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.c(ahz2, (double)n2, (double)n3, (double)n4, ajy.e());
            }
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3, n4 + 1, 3)) {
            if (this.n >= 1.0) {
                ++n4;
            }
            this.Q = this.a.a(n2 - 1, n3, n4).I();
            this.R = this.a.a(n2 + 1, n3, n4).I();
            this.C = this.a.a(n2, n3 - 1, n4).I();
            this.M = this.a.a(n2, n3 + 1, n4).I();
            this.ak = ahz2.c(this.a, n2 - 1, n3, n4);
            this.al = ahz2.c(this.a, n2 + 1, n3, n4);
            this.W = ahz2.c(this.a, n2, n3 - 1, n4);
            this.ag = ahz2.c(this.a, n2, n3 + 1, n4);
            bl5 = this.a.a(n2 + 1, n3, n4 + 1).l();
            bl4 = this.a.a(n2 - 1, n3, n4 + 1).l();
            bl3 = this.a.a(n2, n3 + 1, n4 + 1).l();
            bl2 = this.a.a(n2, n3 - 1, n4 + 1).l();
            if (bl4 || bl2) {
                this.A = this.a.a(n2 - 1, n3 - 1, n4).I();
                this.U = ahz2.c(this.a, n2 - 1, n3 - 1, n4);
            } else {
                this.A = this.Q;
                this.U = this.ak;
            }
            if (bl4 || bl3) {
                this.I = this.a.a(n2 - 1, n3 + 1, n4).I();
                this.ac = ahz2.c(this.a, n2 - 1, n3 + 1, n4);
            } else {
                this.I = this.Q;
                this.ac = this.ak;
            }
            if (bl5 || bl2) {
                this.F = this.a.a(n2 + 1, n3 - 1, n4).I();
                this.Z = ahz2.c(this.a, n2 + 1, n3 - 1, n4);
            } else {
                this.F = this.R;
                this.Z = this.al;
            }
            if (bl5 || bl3) {
                this.N = this.a.a(n2 + 1, n3 + 1, n4).I();
                this.ah = ahz2.c(this.a, n2 + 1, n3 + 1, n4);
            } else {
                this.N = this.R;
                this.ah = this.al;
            }
            if (this.n >= 1.0) {
                --n4;
            }
            n9 = n10;
            if (this.n >= 1.0 || !this.a.a(n2, n3, n4 + 1).c()) {
                n9 = ahz2.c(this.a, n2, n3, n4 + 1);
            }
            f8 = this.a.a(n2, n3, n4 + 1).I();
            float f14 = (this.Q + this.I + f8 + this.M) / 4.0f;
            f7 = (f8 + this.M + this.R + this.N) / 4.0f;
            f6 = (this.C + f8 + this.F + this.R) / 4.0f;
            f5 = (this.A + this.Q + this.C + f8) / 4.0f;
            f9 = (float)((double)f14 * this.l * (1.0 - this.i) + (double)f7 * this.l * this.i + (double)f6 * (1.0 - this.l) * this.i + (double)f5 * (1.0 - this.l) * (1.0 - this.i));
            f10 = (float)((double)f14 * this.k * (1.0 - this.i) + (double)f7 * this.k * this.i + (double)f6 * (1.0 - this.k) * this.i + (double)f5 * (1.0 - this.k) * (1.0 - this.i));
            f11 = (float)((double)f14 * this.k * (1.0 - this.j) + (double)f7 * this.k * this.j + (double)f6 * (1.0 - this.k) * this.j + (double)f5 * (1.0 - this.k) * (1.0 - this.j));
            f12 = (float)((double)f14 * this.l * (1.0 - this.j) + (double)f7 * this.l * this.j + (double)f6 * (1.0 - this.l) * this.j + (double)f5 * (1.0 - this.l) * (1.0 - this.j));
            n8 = this.a(this.ak, this.ac, this.ag, n9);
            n7 = this.a(this.ag, this.al, this.ah, n9);
            n6 = this.a(this.W, this.Z, this.al, n9);
            n5 = this.a(this.U, this.ak, this.W, n9);
            this.am = this.a(n8, n5, n6, n7, this.l * (1.0 - this.i), (1.0 - this.l) * (1.0 - this.i), (1.0 - this.l) * this.i, this.l * this.i);
            this.an = this.a(n8, n5, n6, n7, this.k * (1.0 - this.i), (1.0 - this.k) * (1.0 - this.i), (1.0 - this.k) * this.i, this.k * this.i);
            this.ao = this.a(n8, n5, n6, n7, this.k * (1.0 - this.j), (1.0 - this.k) * (1.0 - this.j), (1.0 - this.k) * this.j, this.k * this.j);
            this.ap = this.a(n8, n5, n6, n7, this.l * (1.0 - this.j), (1.0 - this.l) * (1.0 - this.j), (1.0 - this.l) * this.j, this.l * this.j);
            if (bl7) {
                this.as = this.at = f2 * 0.8f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.8f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.8f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.8f;
                this.as = 0.8f;
                this.ar = 0.8f;
                this.aq = 0.8f;
                this.ax = 0.8f;
                this.aw = 0.8f;
                this.av = 0.8f;
                this.au = 0.8f;
                this.aB = 0.8f;
                this.aA = 0.8f;
                this.az = 0.8f;
                this.ay = 0.8f;
            }
            this.aq *= f9;
            this.au *= f9;
            this.ay *= f9;
            this.ar *= f10;
            this.av *= f10;
            this.az *= f10;
            this.as *= f11;
            this.aw *= f11;
            this.aA *= f11;
            this.at *= f12;
            this.ax *= f12;
            this.aB *= f12;
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 3);
            this.d(ahz2, n2, n3, n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.d(ahz2, n2, n3, n4, ajy.e());
            }
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2 - 1, n3, n4, 4)) {
            if (this.i <= 0.0) {
                --n2;
            }
            this.z = this.a.a(n2, n3 - 1, n4).I();
            this.O = this.a.a(n2, n3, n4 - 1).I();
            this.Q = this.a.a(n2, n3, n4 + 1).I();
            this.H = this.a.a(n2, n3 + 1, n4).I();
            this.T = ahz2.c(this.a, n2, n3 - 1, n4);
            this.ai = ahz2.c(this.a, n2, n3, n4 - 1);
            this.ak = ahz2.c(this.a, n2, n3, n4 + 1);
            this.ab = ahz2.c(this.a, n2, n3 + 1, n4);
            bl5 = this.a.a(n2 - 1, n3 + 1, n4).l();
            bl4 = this.a.a(n2 - 1, n3 - 1, n4).l();
            bl3 = this.a.a(n2 - 1, n3, n4 - 1).l();
            bl2 = this.a.a(n2 - 1, n3, n4 + 1).l();
            if (bl3 || bl4) {
                this.y = this.a.a(n2, n3 - 1, n4 - 1).I();
                this.S = ahz2.c(this.a, n2, n3 - 1, n4 - 1);
            } else {
                this.y = this.O;
                this.S = this.ai;
            }
            if (bl2 || bl4) {
                this.A = this.a.a(n2, n3 - 1, n4 + 1).I();
                this.U = ahz2.c(this.a, n2, n3 - 1, n4 + 1);
            } else {
                this.A = this.Q;
                this.U = this.ak;
            }
            if (bl3 || bl5) {
                this.G = this.a.a(n2, n3 + 1, n4 - 1).I();
                this.aa = ahz2.c(this.a, n2, n3 + 1, n4 - 1);
            } else {
                this.G = this.O;
                this.aa = this.ai;
            }
            if (bl2 || bl5) {
                this.I = this.a.a(n2, n3 + 1, n4 + 1).I();
                this.ac = ahz2.c(this.a, n2, n3 + 1, n4 + 1);
            } else {
                this.I = this.Q;
                this.ac = this.ak;
            }
            if (this.i <= 0.0) {
                ++n2;
            }
            n9 = n10;
            if (this.i <= 0.0 || !this.a.a(n2 - 1, n3, n4).c()) {
                n9 = ahz2.c(this.a, n2 - 1, n3, n4);
            }
            f8 = this.a.a(n2 - 1, n3, n4).I();
            float f15 = (this.z + this.A + f8 + this.Q) / 4.0f;
            f7 = (f8 + this.Q + this.H + this.I) / 4.0f;
            f6 = (this.O + f8 + this.G + this.H) / 4.0f;
            f5 = (this.y + this.z + this.O + f8) / 4.0f;
            f9 = (float)((double)f7 * this.l * this.n + (double)f6 * this.l * (1.0 - this.n) + (double)f5 * (1.0 - this.l) * (1.0 - this.n) + (double)f15 * (1.0 - this.l) * this.n);
            f10 = (float)((double)f7 * this.l * this.m + (double)f6 * this.l * (1.0 - this.m) + (double)f5 * (1.0 - this.l) * (1.0 - this.m) + (double)f15 * (1.0 - this.l) * this.m);
            f11 = (float)((double)f7 * this.k * this.m + (double)f6 * this.k * (1.0 - this.m) + (double)f5 * (1.0 - this.k) * (1.0 - this.m) + (double)f15 * (1.0 - this.k) * this.m);
            f12 = (float)((double)f7 * this.k * this.n + (double)f6 * this.k * (1.0 - this.n) + (double)f5 * (1.0 - this.k) * (1.0 - this.n) + (double)f15 * (1.0 - this.k) * this.n);
            n8 = this.a(this.T, this.U, this.ak, n9);
            n7 = this.a(this.ak, this.ab, this.ac, n9);
            n6 = this.a(this.ai, this.aa, this.ab, n9);
            n5 = this.a(this.S, this.T, this.ai, n9);
            this.am = this.a(n7, n6, n5, n8, this.l * this.n, this.l * (1.0 - this.n), (1.0 - this.l) * (1.0 - this.n), (1.0 - this.l) * this.n);
            this.an = this.a(n7, n6, n5, n8, this.l * this.m, this.l * (1.0 - this.m), (1.0 - this.l) * (1.0 - this.m), (1.0 - this.l) * this.m);
            this.ao = this.a(n7, n6, n5, n8, this.k * this.m, this.k * (1.0 - this.m), (1.0 - this.k) * (1.0 - this.m), (1.0 - this.k) * this.m);
            this.ap = this.a(n7, n6, n5, n8, this.k * this.n, this.k * (1.0 - this.n), (1.0 - this.k) * (1.0 - this.n), (1.0 - this.k) * this.n);
            if (bl7) {
                this.as = this.at = f2 * 0.6f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.6f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.6f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.6f;
                this.as = 0.6f;
                this.ar = 0.6f;
                this.aq = 0.6f;
                this.ax = 0.6f;
                this.aw = 0.6f;
                this.av = 0.6f;
                this.au = 0.6f;
                this.aB = 0.6f;
                this.aA = 0.6f;
                this.az = 0.6f;
                this.ay = 0.6f;
            }
            this.aq *= f9;
            this.au *= f9;
            this.ay *= f9;
            this.ar *= f10;
            this.av *= f10;
            this.az *= f10;
            this.as *= f11;
            this.aw *= f11;
            this.aA *= f11;
            this.at *= f12;
            this.ax *= f12;
            this.aB *= f12;
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 4);
            this.e(ahz2, n2, n3, n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.e(ahz2, n2, n3, n4, ajy.e());
            }
            bl6 = true;
        }
        if (this.g || ahz2.a(this.a, n2 + 1, n3, n4, 5)) {
            if (this.j >= 1.0) {
                ++n2;
            }
            this.E = this.a.a(n2, n3 - 1, n4).I();
            this.P = this.a.a(n2, n3, n4 - 1).I();
            this.R = this.a.a(n2, n3, n4 + 1).I();
            this.L = this.a.a(n2, n3 + 1, n4).I();
            this.Y = ahz2.c(this.a, n2, n3 - 1, n4);
            this.aj = ahz2.c(this.a, n2, n3, n4 - 1);
            this.al = ahz2.c(this.a, n2, n3, n4 + 1);
            this.af = ahz2.c(this.a, n2, n3 + 1, n4);
            bl5 = this.a.a(n2 + 1, n3 + 1, n4).l();
            bl4 = this.a.a(n2 + 1, n3 - 1, n4).l();
            bl3 = this.a.a(n2 + 1, n3, n4 + 1).l();
            bl2 = this.a.a(n2 + 1, n3, n4 - 1).l();
            if (bl4 || bl2) {
                this.D = this.a.a(n2, n3 - 1, n4 - 1).I();
                this.X = ahz2.c(this.a, n2, n3 - 1, n4 - 1);
            } else {
                this.D = this.P;
                this.X = this.aj;
            }
            if (bl4 || bl3) {
                this.F = this.a.a(n2, n3 - 1, n4 + 1).I();
                this.Z = ahz2.c(this.a, n2, n3 - 1, n4 + 1);
            } else {
                this.F = this.R;
                this.Z = this.al;
            }
            if (bl5 || bl2) {
                this.K = this.a.a(n2, n3 + 1, n4 - 1).I();
                this.ae = ahz2.c(this.a, n2, n3 + 1, n4 - 1);
            } else {
                this.K = this.P;
                this.ae = this.aj;
            }
            if (bl5 || bl3) {
                this.N = this.a.a(n2, n3 + 1, n4 + 1).I();
                this.ah = ahz2.c(this.a, n2, n3 + 1, n4 + 1);
            } else {
                this.N = this.R;
                this.ah = this.al;
            }
            if (this.j >= 1.0) {
                --n2;
            }
            n9 = n10;
            if (this.j >= 1.0 || !this.a.a(n2 + 1, n3, n4).c()) {
                n9 = ahz2.c(this.a, n2 + 1, n3, n4);
            }
            f8 = this.a.a(n2 + 1, n3, n4).I();
            float f16 = (this.E + this.F + f8 + this.R) / 4.0f;
            f7 = (this.D + this.E + this.P + f8) / 4.0f;
            f6 = (this.P + f8 + this.K + this.L) / 4.0f;
            f5 = (f8 + this.R + this.L + this.N) / 4.0f;
            f9 = (float)((double)f16 * (1.0 - this.k) * this.n + (double)f7 * (1.0 - this.k) * (1.0 - this.n) + (double)f6 * this.k * (1.0 - this.n) + (double)f5 * this.k * this.n);
            f10 = (float)((double)f16 * (1.0 - this.k) * this.m + (double)f7 * (1.0 - this.k) * (1.0 - this.m) + (double)f6 * this.k * (1.0 - this.m) + (double)f5 * this.k * this.m);
            f11 = (float)((double)f16 * (1.0 - this.l) * this.m + (double)f7 * (1.0 - this.l) * (1.0 - this.m) + (double)f6 * this.l * (1.0 - this.m) + (double)f5 * this.l * this.m);
            f12 = (float)((double)f16 * (1.0 - this.l) * this.n + (double)f7 * (1.0 - this.l) * (1.0 - this.n) + (double)f6 * this.l * (1.0 - this.n) + (double)f5 * this.l * this.n);
            n8 = this.a(this.Y, this.Z, this.al, n9);
            n7 = this.a(this.al, this.af, this.ah, n9);
            n6 = this.a(this.aj, this.ae, this.af, n9);
            n5 = this.a(this.X, this.Y, this.aj, n9);
            this.am = this.a(n8, n5, n6, n7, (1.0 - this.k) * this.n, (1.0 - this.k) * (1.0 - this.n), this.k * (1.0 - this.n), this.k * this.n);
            this.an = this.a(n8, n5, n6, n7, (1.0 - this.k) * this.m, (1.0 - this.k) * (1.0 - this.m), this.k * (1.0 - this.m), this.k * this.m);
            this.ao = this.a(n8, n5, n6, n7, (1.0 - this.l) * this.m, (1.0 - this.l) * (1.0 - this.m), this.l * (1.0 - this.m), this.l * this.m);
            this.ap = this.a(n8, n5, n6, n7, (1.0 - this.l) * this.n, (1.0 - this.l) * (1.0 - this.n), this.l * (1.0 - this.n), this.l * this.n);
            if (bl7) {
                this.as = this.at = f2 * 0.6f;
                this.ar = this.at;
                this.aq = this.at;
                this.aw = this.ax = f3 * 0.6f;
                this.av = this.ax;
                this.au = this.ax;
                this.aA = this.aB = f4 * 0.6f;
                this.az = this.aB;
                this.ay = this.aB;
            } else {
                this.at = 0.6f;
                this.as = 0.6f;
                this.ar = 0.6f;
                this.aq = 0.6f;
                this.ax = 0.6f;
                this.aw = 0.6f;
                this.av = 0.6f;
                this.au = 0.6f;
                this.aB = 0.6f;
                this.aA = 0.6f;
                this.az = 0.6f;
                this.ay = 0.6f;
            }
            this.aq *= f9;
            this.au *= f9;
            this.ay *= f9;
            this.ar *= f10;
            this.av *= f10;
            this.az *= f10;
            this.as *= f11;
            this.aw *= f11;
            this.aA *= f11;
            this.at *= f12;
            this.ax *= f12;
            this.aB *= f12;
            pw pw3 = this.a(ahz2, this.a, n2, n3, n4, 5);
            this.f(ahz2, n2, n3, n4, pw3);
            if (b && pw3.g().equals("grass_side") && !this.b()) {
                this.aq *= f2;
                this.ar *= f2;
                this.as *= f2;
                this.at *= f2;
                this.au *= f3;
                this.av *= f3;
                this.aw *= f3;
                this.ax *= f3;
                this.ay *= f4;
                this.az *= f4;
                this.aA *= f4;
                this.aB *= f4;
                this.f(ahz2, n2, n3, n4, ajy.e());
            }
            bl6 = true;
        }
        this.x = false;
        return bl6;
    }

    private int a(int n2, int n3, int n4, int n5) {
        if (n2 == 0) {
            n2 = n5;
        }
        if (n3 == 0) {
            n3 = n5;
        }
        if (n4 == 0) {
            n4 = n5;
        }
        return n2 + n3 + n4 + n5 >> 2 & 0xFF00FF;
    }

    private int a(int n2, int n3, int n4, int n5, double d2, double d3, double d4, double d5) {
        int n6 = (int)((double)(n2 >> 16 & 0xFF) * d2 + (double)(n3 >> 16 & 0xFF) * d3 + (double)(n4 >> 16 & 0xFF) * d4 + (double)(n5 >> 16 & 0xFF) * d5) & 0xFF;
        int n7 = (int)((double)(n2 & 0xFF) * d2 + (double)(n3 & 0xFF) * d3 + (double)(n4 & 0xFF) * d4 + (double)(n5 & 0xFF) * d5) & 0xFF;
        return n6 << 16 | n7;
    }

    public boolean d(ahz ahz2, int n2, int n3, int n4, float f2, float f3, float f4) {
        pw pw2;
        this.x = false;
        bna bna2 = bna.a;
        boolean bl2 = false;
        float f5 = 0.5f;
        float f6 = 1.0f;
        float f7 = 0.8f;
        float f8 = 0.6f;
        float f9 = f6 * f2;
        float f10 = f6 * f3;
        float f11 = f6 * f4;
        float f12 = f5;
        float f13 = f7;
        float f14 = f8;
        float f15 = f5;
        float f16 = f7;
        float f17 = f8;
        float f18 = f5;
        float f19 = f7;
        float f20 = f8;
        if (ahz2 != aie.c) {
            f12 *= f2;
            f13 *= f2;
            f14 *= f2;
            f15 *= f3;
            f16 *= f3;
            f17 *= f3;
            f18 *= f4;
            f19 *= f4;
            f20 *= f4;
        }
        int n5 = ahz2.c(this.a, n2, n3, n4);
        if (this.g || ahz2.a(this.a, n2, n3 - 1, n4, 0)) {
            bna2.b(this.k > 0.0 ? n5 : ahz2.c(this.a, n2, n3 - 1, n4));
            bna2.b(f12, f15, f18);
            this.a(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 0));
            bl2 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3 + 1, n4, 1)) {
            bna2.b(this.l < 1.0 ? n5 : ahz2.c(this.a, n2, n3 + 1, n4));
            bna2.b(f9, f10, f11);
            this.b(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 1));
            bl2 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3, n4 - 1, 2)) {
            bna2.b(this.m > 0.0 ? n5 : ahz2.c(this.a, n2, n3, n4 - 1));
            bna2.b(f13, f16, f19);
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 2);
            this.c(ahz2, (double)n2, (double)n3, (double)n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                bna2.b(f13 * f2, f16 * f3, f19 * f4);
                this.c(ahz2, (double)n2, (double)n3, (double)n4, ajy.e());
            }
            bl2 = true;
        }
        if (this.g || ahz2.a(this.a, n2, n3, n4 + 1, 3)) {
            bna2.b(this.n < 1.0 ? n5 : ahz2.c(this.a, n2, n3, n4 + 1));
            bna2.b(f13, f16, f19);
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 3);
            this.d(ahz2, n2, n3, n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                bna2.b(f13 * f2, f16 * f3, f19 * f4);
                this.d(ahz2, n2, n3, n4, ajy.e());
            }
            bl2 = true;
        }
        if (this.g || ahz2.a(this.a, n2 - 1, n3, n4, 4)) {
            bna2.b(this.i > 0.0 ? n5 : ahz2.c(this.a, n2 - 1, n3, n4));
            bna2.b(f14, f17, f20);
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 4);
            this.e(ahz2, n2, n3, n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                bna2.b(f14 * f2, f17 * f3, f20 * f4);
                this.e(ahz2, n2, n3, n4, ajy.e());
            }
            bl2 = true;
        }
        if (this.g || ahz2.a(this.a, n2 + 1, n3, n4, 5)) {
            bna2.b(this.j < 1.0 ? n5 : ahz2.c(this.a, n2 + 1, n3, n4));
            bna2.b(f14, f17, f20);
            pw2 = this.a(ahz2, this.a, n2, n3, n4, 5);
            this.f(ahz2, n2, n3, n4, pw2);
            if (b && pw2.g().equals("grass_side") && !this.b()) {
                bna2.b(f14 * f2, f17 * f3, f20 * f4);
                this.f(ahz2, n2, n3, n4, ajy.e());
            }
            bl2 = true;
        }
        return bl2;
    }

    private boolean a(aiq aiq2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        bna2.b(aiq2.c(this.a, n2, n3, n4));
        bna2.b(1.0f, 1.0f, 1.0f);
        int n5 = this.a.e(n2, n3, n4);
        int n6 = ajb.l(n5);
        int n7 = aiq.c(n5);
        pw pw2 = aiq2.b(n7);
        int n8 = 4 + n7 * 2;
        int n9 = 5 + n7 * 2;
        double d2 = 15.0 - (double)n8;
        double d3 = 15.0;
        double d4 = 4.0;
        double d5 = 4.0 + (double)n9;
        double d6 = pw2.a(d2);
        double d7 = pw2.a(d3);
        double d8 = pw2.b(d4);
        double d9 = pw2.b(d5);
        double d10 = 0.0;
        double d11 = 0.0;
        switch (n6) {
            case 2: {
                d10 = 8.0 - (double)(n8 / 2);
                d11 = 1.0;
                break;
            }
            case 0: {
                d10 = 8.0 - (double)(n8 / 2);
                d11 = 15.0 - (double)n8;
                break;
            }
            case 3: {
                d10 = 15.0 - (double)n8;
                d11 = 8.0 - (double)(n8 / 2);
                break;
            }
            case 1: {
                d10 = 1.0;
                d11 = 8.0 - (double)(n8 / 2);
            }
        }
        double d12 = (double)n2 + d10 / 16.0;
        double d13 = (double)n2 + (d10 + (double)n8) / 16.0;
        double d14 = (double)n3 + (12.0 - (double)n9) / 16.0;
        double d15 = (double)n3 + 0.75;
        double d16 = (double)n4 + d11 / 16.0;
        double d17 = (double)n4 + (d11 + (double)n8) / 16.0;
        bna2.a(d12, d14, d16, d6, d9);
        bna2.a(d12, d14, d17, d7, d9);
        bna2.a(d12, d15, d17, d7, d8);
        bna2.a(d12, d15, d16, d6, d8);
        bna2.a(d13, d14, d17, d6, d9);
        bna2.a(d13, d14, d16, d7, d9);
        bna2.a(d13, d15, d16, d7, d8);
        bna2.a(d13, d15, d17, d6, d8);
        bna2.a(d13, d14, d16, d6, d9);
        bna2.a(d12, d14, d16, d7, d9);
        bna2.a(d12, d15, d16, d7, d8);
        bna2.a(d13, d15, d16, d6, d8);
        bna2.a(d12, d14, d17, d6, d9);
        bna2.a(d13, d14, d17, d7, d9);
        bna2.a(d13, d15, d17, d7, d8);
        bna2.a(d12, d15, d17, d6, d8);
        int n10 = n8;
        if (n7 >= 2) {
            --n10;
        }
        d6 = pw2.c();
        d7 = pw2.a(n10);
        d8 = pw2.e();
        d9 = pw2.b(n10);
        bna2.a(d12, d15, d17, d6, d9);
        bna2.a(d13, d15, d17, d7, d9);
        bna2.a(d13, d15, d16, d7, d8);
        bna2.a(d12, d15, d16, d6, d8);
        bna2.a(d12, d14, d16, d6, d8);
        bna2.a(d13, d14, d16, d7, d8);
        bna2.a(d13, d14, d17, d7, d9);
        bna2.a(d12, d14, d17, d6, d9);
        d6 = pw2.a(12.0);
        d7 = pw2.d();
        d8 = pw2.e();
        d9 = pw2.b(4.0);
        d10 = 8.0;
        d11 = 0.0;
        switch (n6) {
            case 2: {
                d10 = 8.0;
                d11 = 0.0;
                break;
            }
            case 0: {
                d10 = 8.0;
                d11 = 12.0;
                double d18 = d6;
                d6 = d7;
                d7 = d18;
                break;
            }
            case 3: {
                d10 = 12.0;
                d11 = 8.0;
                double d19 = d6;
                d6 = d7;
                d7 = d19;
                break;
            }
            case 1: {
                d10 = 0.0;
                d11 = 8.0;
            }
        }
        d12 = (double)n2 + d10 / 16.0;
        d13 = (double)n2 + (d10 + 4.0) / 16.0;
        d14 = (double)n3 + 0.75;
        d15 = (double)n3 + 1.0;
        d16 = (double)n4 + d11 / 16.0;
        d17 = (double)n4 + (d11 + 4.0) / 16.0;
        if (n6 == 2 || n6 == 0) {
            bna2.a(d12, d14, d16, d7, d9);
            bna2.a(d12, d14, d17, d6, d9);
            bna2.a(d12, d15, d17, d6, d8);
            bna2.a(d12, d15, d16, d7, d8);
            bna2.a(d12, d14, d17, d6, d9);
            bna2.a(d12, d14, d16, d7, d9);
            bna2.a(d12, d15, d16, d7, d8);
            bna2.a(d12, d15, d17, d6, d8);
        } else if (n6 == 1 || n6 == 3) {
            bna2.a(d13, d14, d16, d6, d9);
            bna2.a(d12, d14, d16, d7, d9);
            bna2.a(d12, d15, d16, d7, d8);
            bna2.a(d13, d15, d16, d6, d8);
            bna2.a(d12, d14, d16, d7, d9);
            bna2.a(d13, d14, d16, d6, d9);
            bna2.a(d13, d15, d16, d6, d8);
            bna2.a(d12, d15, d16, d7, d8);
        }
        return true;
    }

    private boolean a(ahx ahx2, int n2, int n3, int n4) {
        float f2 = 0.1875f;
        this.a(this.b(aie.w));
        this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        this.q(ahx2, n2, n3, n4);
        this.g = true;
        this.a(this.b(aie.Z));
        this.a(0.125, 0.00625f, 0.125, 0.875, (double)f2, 0.875);
        this.q(ahx2, n2, n3, n4);
        this.a(this.b(aie.bJ));
        this.a(0.1875, f2, 0.1875, 0.8125, 0.875, 0.8125);
        this.q(ahx2, n2, n3, n4);
        this.g = false;
        this.a();
        return true;
    }

    public boolean t(ahz ahz2, int n2, int n3, int n4) {
        int n5 = ahz2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        return this.e(ahz2, n2, n3, n4, f2, f3, f4);
    }

    public boolean e(ahz ahz2, int n2, int n3, int n4, float f2, float f3, float f4) {
        bna bna2 = bna.a;
        boolean bl2 = false;
        float f5 = 0.5f;
        float f6 = 1.0f;
        float f7 = 0.8f;
        float f8 = 0.6f;
        float f9 = f5 * f2;
        float f10 = f6 * f2;
        float f11 = f7 * f2;
        float f12 = f8 * f2;
        float f13 = f5 * f3;
        float f14 = f6 * f3;
        float f15 = f7 * f3;
        float f16 = f8 * f3;
        float f17 = f5 * f4;
        float f18 = f6 * f4;
        float f19 = f7 * f4;
        float f20 = f8 * f4;
        float f21 = 0.0625f;
        int n5 = ahz2.c(this.a, n2, n3, n4);
        if (this.g || ahz2.a(this.a, n2, n3 - 1, n4, 0)) {
            bna2.b(this.k > 0.0 ? n5 : ahz2.c(this.a, n2, n3 - 1, n4));
            bna2.b(f9, f13, f17);
            this.a(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 0));
        }
        if (this.g || ahz2.a(this.a, n2, n3 + 1, n4, 1)) {
            bna2.b(this.l < 1.0 ? n5 : ahz2.c(this.a, n2, n3 + 1, n4));
            bna2.b(f10, f14, f18);
            this.b(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 1));
        }
        bna2.b(n5);
        bna2.b(f11, f15, f19);
        bna2.d(0.0f, 0.0f, f21);
        this.c(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 2));
        bna2.d(0.0f, 0.0f, -f21);
        bna2.d(0.0f, 0.0f, -f21);
        this.d(ahz2, n2, n3, n4, this.a(ahz2, this.a, n2, n3, n4, 3));
        bna2.d(0.0f, 0.0f, f21);
        bna2.b(f12, f16, f20);
        bna2.d(f21, 0.0f, 0.0f);
        this.e(ahz2, n2, n3, n4, this.a(ahz2, this.a, n2, n3, n4, 4));
        bna2.d(-f21, 0.0f, 0.0f);
        bna2.d(-f21, 0.0f, 0.0f);
        this.f(ahz2, n2, n3, n4, this.a(ahz2, this.a, n2, n3, n4, 5));
        bna2.d(f21, 0.0f, 0.0f);
        return true;
    }

    public boolean a(ajq ajq2, int n2, int n3, int n4) {
        boolean bl2 = false;
        float f2 = 0.375f;
        float f3 = 0.625f;
        this.a(f2, 0.0, (double)f2, (double)f3, 1.0, (double)f3);
        this.q(ajq2, n2, n3, n4);
        bl2 = true;
        boolean bl3 = false;
        boolean bl4 = false;
        if (ajq2.e(this.a, n2 - 1, n3, n4) || ajq2.e(this.a, n2 + 1, n3, n4)) {
            bl3 = true;
        }
        if (ajq2.e(this.a, n2, n3, n4 - 1) || ajq2.e(this.a, n2, n3, n4 + 1)) {
            bl4 = true;
        }
        boolean bl5 = ajq2.e(this.a, n2 - 1, n3, n4);
        boolean bl6 = ajq2.e(this.a, n2 + 1, n3, n4);
        boolean bl7 = ajq2.e(this.a, n2, n3, n4 - 1);
        boolean bl8 = ajq2.e(this.a, n2, n3, n4 + 1);
        if (!bl3 && !bl4) {
            bl3 = true;
        }
        f2 = 0.4375f;
        f3 = 0.5625f;
        float f4 = 0.75f;
        float f5 = 0.9375f;
        float f6 = bl5 ? 0.0f : f2;
        float f7 = bl6 ? 1.0f : f3;
        float f8 = bl7 ? 0.0f : f2;
        float f9 = bl8 ? 1.0f : f3;
        this.f = true;
        if (bl3) {
            this.a(f6, f4, (double)f2, (double)f7, (double)f5, (double)f3);
            this.q(ajq2, n2, n3, n4);
            bl2 = true;
        }
        if (bl4) {
            this.a(f2, f4, (double)f8, (double)f3, (double)f5, (double)f9);
            this.q(ajq2, n2, n3, n4);
            bl2 = true;
        }
        f4 = 0.375f;
        f5 = 0.5625f;
        if (bl3) {
            this.a(f6, f4, (double)f2, (double)f7, (double)f5, (double)f3);
            this.q(ajq2, n2, n3, n4);
            bl2 = true;
        }
        if (bl4) {
            this.a(f2, f4, (double)f8, (double)f3, (double)f5, (double)f9);
            this.q(ajq2, n2, n3, n4);
            bl2 = true;
        }
        this.f = false;
        ajq2.a(this.a, n2, n3, n4);
        return bl2;
    }

    public boolean a(amz amz2, int n2, int n3, int n4) {
        boolean bl2 = amz2.e(this.a, n2 - 1, n3, n4);
        boolean bl3 = amz2.e(this.a, n2 + 1, n3, n4);
        boolean bl4 = amz2.e(this.a, n2, n3, n4 - 1);
        boolean bl5 = amz2.e(this.a, n2, n3, n4 + 1);
        boolean bl6 = bl4 && bl5 && !bl2 && !bl3;
        boolean bl7 = !bl4 && !bl5 && bl2 && bl3;
        boolean bl8 = this.a.c(n2, n3 + 1, n4);
        if (!bl6 && !bl7 || !bl8) {
            this.a(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
            this.q(amz2, n2, n3, n4);
            if (bl2) {
                this.a(0.0, 0.0, 0.3125, 0.25, 0.8125, 0.6875);
                this.q(amz2, n2, n3, n4);
            }
            if (bl3) {
                this.a(0.75, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                this.q(amz2, n2, n3, n4);
            }
            if (bl4) {
                this.a(0.3125, 0.0, 0.0, 0.6875, 0.8125, 0.25);
                this.q(amz2, n2, n3, n4);
            }
            if (bl5) {
                this.a(0.3125, 0.0, 0.75, 0.6875, 0.8125, 1.0);
                this.q(amz2, n2, n3, n4);
            }
        } else if (bl6) {
            this.a(0.3125, 0.0, 0.0, 0.6875, 0.8125, 1.0);
            this.q(amz2, n2, n3, n4);
        } else {
            this.a(0.0, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
            this.q(amz2, n2, n3, n4);
        }
        amz2.a(this.a, n2, n3, n4);
        return true;
    }

    public boolean a(ajg ajg2, int n2, int n3, int n4) {
        boolean bl2 = false;
        int n5 = 0;
        for (int i2 = 0; i2 < 8; ++i2) {
            int n6 = 0;
            int n7 = 1;
            if (i2 == 0) {
                n6 = 2;
            }
            if (i2 == 1) {
                n6 = 3;
            }
            if (i2 == 2) {
                n6 = 4;
            }
            if (i2 == 3) {
                n6 = 5;
                n7 = 2;
            }
            if (i2 == 4) {
                n6 = 6;
                n7 = 3;
            }
            if (i2 == 5) {
                n6 = 7;
                n7 = 5;
            }
            if (i2 == 6) {
                n6 = 6;
                n7 = 2;
            }
            if (i2 == 7) {
                n6 = 3;
            }
            float f2 = (float)n6 / 16.0f;
            float f3 = 1.0f - (float)n5 / 16.0f;
            float f4 = 1.0f - (float)(n5 + n7) / 16.0f;
            n5 += n7;
            this.a(0.5f - f2, f4, (double)(0.5f - f2), (double)(0.5f + f2), (double)f3, (double)(0.5f + f2));
            this.q(ajg2, n2, n3, n4);
        }
        bl2 = true;
        this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return bl2;
    }

    public boolean a(ajr ajr2, int n2, int n3, int n4) {
        float f2;
        float f3;
        float f4;
        float f5;
        boolean bl2 = true;
        int n5 = this.a.e(n2, n3, n4);
        boolean bl3 = ajr.b(n5);
        int n6 = ajb.l(n5);
        float f6 = 0.375f;
        float f7 = 0.5625f;
        float f8 = 0.75f;
        float f9 = 0.9375f;
        float f10 = 0.3125f;
        float f11 = 1.0f;
        if ((n6 == 2 || n6 == 0) && this.a.a(n2 - 1, n3, n4) == aie.bK && this.a.a(n2 + 1, n3, n4) == aie.bK || (n6 == 3 || n6 == 1) && this.a.a(n2, n3, n4 - 1) == aie.bK && this.a.a(n2, n3, n4 + 1) == aie.bK) {
            f6 -= 0.1875f;
            f7 -= 0.1875f;
            f8 -= 0.1875f;
            f9 -= 0.1875f;
            f10 -= 0.1875f;
            f11 -= 0.1875f;
        }
        this.g = true;
        if (n6 == 3 || n6 == 1) {
            this.v = 1;
            f5 = 0.4375f;
            f4 = 0.5625f;
            f3 = 0.0f;
            f2 = 0.125f;
            this.a(f5, f10, (double)f3, (double)f4, (double)f11, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f3 = 0.875f;
            f2 = 1.0f;
            this.a(f5, f10, (double)f3, (double)f4, (double)f11, (double)f2);
            this.q(ajr2, n2, n3, n4);
            this.v = 0;
        } else {
            f5 = 0.0f;
            f4 = 0.125f;
            f3 = 0.4375f;
            f2 = 0.5625f;
            this.a(f5, f10, (double)f3, (double)f4, (double)f11, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f5 = 0.875f;
            f4 = 1.0f;
            this.a(f5, f10, (double)f3, (double)f4, (double)f11, (double)f2);
            this.q(ajr2, n2, n3, n4);
        }
        if (bl3) {
            if (n6 == 2 || n6 == 0) {
                this.v = 1;
            }
            if (n6 == 3) {
                f5 = 0.0f;
                f4 = 0.125f;
                f3 = 0.875f;
                f2 = 1.0f;
                float f12 = 0.5625f;
                float f13 = 0.8125f;
                float f14 = 0.9375f;
                this.a(0.8125, f6, 0.0, 0.9375, (double)f9, 0.125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.8125, f6, 0.875, 0.9375, (double)f9, 1.0);
                this.q(ajr2, n2, n3, n4);
                this.a(0.5625, f6, 0.0, 0.8125, (double)f7, 0.125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.5625, f6, 0.875, 0.8125, (double)f7, 1.0);
                this.q(ajr2, n2, n3, n4);
                this.a(0.5625, f8, 0.0, 0.8125, (double)f9, 0.125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.5625, f8, 0.875, 0.8125, (double)f9, 1.0);
                this.q(ajr2, n2, n3, n4);
            } else if (n6 == 1) {
                f5 = 0.0f;
                f4 = 0.125f;
                f3 = 0.875f;
                f2 = 1.0f;
                float f15 = 0.0625f;
                float f16 = 0.1875f;
                float f17 = 0.4375f;
                this.a(0.0625, f6, 0.0, 0.1875, (double)f9, 0.125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.0625, f6, 0.875, 0.1875, (double)f9, 1.0);
                this.q(ajr2, n2, n3, n4);
                this.a(0.1875, f6, 0.0, 0.4375, (double)f7, 0.125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.1875, f6, 0.875, 0.4375, (double)f7, 1.0);
                this.q(ajr2, n2, n3, n4);
                this.a(0.1875, f8, 0.0, 0.4375, (double)f9, 0.125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.1875, f8, 0.875, 0.4375, (double)f9, 1.0);
                this.q(ajr2, n2, n3, n4);
            } else if (n6 == 0) {
                f5 = 0.0f;
                f4 = 0.125f;
                f3 = 0.875f;
                f2 = 1.0f;
                float f18 = 0.5625f;
                float f19 = 0.8125f;
                float f20 = 0.9375f;
                this.a(0.0, f6, 0.8125, 0.125, (double)f9, 0.9375);
                this.q(ajr2, n2, n3, n4);
                this.a(0.875, f6, 0.8125, 1.0, (double)f9, 0.9375);
                this.q(ajr2, n2, n3, n4);
                this.a(0.0, f6, 0.5625, 0.125, (double)f7, 0.8125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.875, f6, 0.5625, 1.0, (double)f7, 0.8125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.0, f8, 0.5625, 0.125, (double)f9, 0.8125);
                this.q(ajr2, n2, n3, n4);
                this.a(0.875, f8, 0.5625, 1.0, (double)f9, 0.8125);
                this.q(ajr2, n2, n3, n4);
            } else if (n6 == 2) {
                f5 = 0.0f;
                f4 = 0.125f;
                f3 = 0.875f;
                f2 = 1.0f;
                float f21 = 0.0625f;
                float f22 = 0.1875f;
                float f23 = 0.4375f;
                this.a(0.0, f6, 0.0625, 0.125, (double)f9, 0.1875);
                this.q(ajr2, n2, n3, n4);
                this.a(0.875, f6, 0.0625, 1.0, (double)f9, 0.1875);
                this.q(ajr2, n2, n3, n4);
                this.a(0.0, f6, 0.1875, 0.125, (double)f7, 0.4375);
                this.q(ajr2, n2, n3, n4);
                this.a(0.875, f6, 0.1875, 1.0, (double)f7, 0.4375);
                this.q(ajr2, n2, n3, n4);
                this.a(0.0, f8, 0.1875, 0.125, (double)f9, 0.4375);
                this.q(ajr2, n2, n3, n4);
                this.a(0.875, f8, 0.1875, 1.0, (double)f9, 0.4375);
                this.q(ajr2, n2, n3, n4);
            }
        } else if (n6 == 3 || n6 == 1) {
            this.v = 1;
            f5 = 0.4375f;
            f4 = 0.5625f;
            f3 = 0.375f;
            f2 = 0.5f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f3 = 0.5f;
            f2 = 0.625f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f3 = 0.625f;
            f2 = 0.875f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f7, (double)f2);
            this.q(ajr2, n2, n3, n4);
            this.a(f5, f8, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f3 = 0.125f;
            f2 = 0.375f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f7, (double)f2);
            this.q(ajr2, n2, n3, n4);
            this.a(f5, f8, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
        } else {
            f5 = 0.375f;
            f4 = 0.5f;
            f3 = 0.4375f;
            f2 = 0.5625f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f5 = 0.5f;
            f4 = 0.625f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f5 = 0.625f;
            f4 = 0.875f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f7, (double)f2);
            this.q(ajr2, n2, n3, n4);
            this.a(f5, f8, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
            f5 = 0.125f;
            f4 = 0.375f;
            this.a(f5, f6, (double)f3, (double)f4, (double)f7, (double)f2);
            this.q(ajr2, n2, n3, n4);
            this.a(f5, f8, (double)f3, (double)f4, (double)f9, (double)f2);
            this.q(ajr2, n2, n3, n4);
        }
        this.g = false;
        this.v = 0;
        this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return bl2;
    }

    private boolean a(ake ake2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        bna2.b(ake2.c(this.a, n2, n3, n4));
        int n5 = ake2.d(this.a, n2, n3, n4);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (bmm.a) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        bna2.b(f2, f3, f4);
        return this.a(ake2, n2, n3, n4, this.a.e(n2, n3, n4), false);
    }

    private boolean a(ake ake2, int n2, int n3, int n4, int n5, boolean bl2) {
        float f2;
        bna bna2 = bna.a;
        int n6 = ake.b(n5);
        double d2 = 0.625;
        this.a(0.0, d2, 0.0, 1.0, 1.0, 1.0);
        if (bl2) {
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            this.a((ahz)ake2, 0.0, 0.0, 0.0, this.a((ahz)ake2, 0, n5));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 1.0f, 0.0f);
            this.b((ahz)ake2, 0.0, 0.0, 0.0, this.a((ahz)ake2, 1, n5));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, -1.0f);
            this.c((ahz)ake2, 0.0, 0.0, 0.0, this.a((ahz)ake2, 2, n5));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, 1.0f);
            this.d(ake2, 0.0, 0.0, 0.0, this.a((ahz)ake2, 3, n5));
            bna2.a();
            bna2.b();
            bna2.c(-1.0f, 0.0f, 0.0f);
            this.e(ake2, 0.0, 0.0, 0.0, this.a((ahz)ake2, 4, n5));
            bna2.a();
            bna2.b();
            bna2.c(1.0f, 0.0f, 0.0f);
            this.f(ake2, 0.0, 0.0, 0.0, this.a((ahz)ake2, 5, n5));
            bna2.a();
        } else {
            this.q(ake2, n2, n3, n4);
        }
        if (!bl2) {
            bna2.b(ake2.c(this.a, n2, n3, n4));
            int n7 = ake2.d(this.a, n2, n3, n4);
            float f3 = (float)(n7 >> 16 & 0xFF) / 255.0f;
            f2 = (float)(n7 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n7 & 0xFF) / 255.0f;
            if (bmm.a) {
                float f5 = (f3 * 30.0f + f2 * 59.0f + f4 * 11.0f) / 100.0f;
                float f6 = (f3 * 30.0f + f2 * 70.0f) / 100.0f;
                float f7 = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
                f3 = f5;
                f2 = f6;
                f4 = f7;
            }
            bna2.b(f3, f2, f4);
        }
        pw pw2 = ake.e("hopper_outside");
        pw pw3 = ake.e("hopper_inside");
        f2 = 0.125f;
        if (bl2) {
            bna2.b();
            bna2.c(1.0f, 0.0f, 0.0f);
            this.f(ake2, -1.0f + f2, 0.0, 0.0, pw2);
            bna2.a();
            bna2.b();
            bna2.c(-1.0f, 0.0f, 0.0f);
            this.e(ake2, 1.0f - f2, 0.0, 0.0, pw2);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, 1.0f);
            this.d(ake2, 0.0, 0.0, -1.0f + f2, pw2);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, -1.0f);
            this.c((ahz)ake2, 0.0, 0.0, 1.0f - f2, pw2);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 1.0f, 0.0f);
            this.b((ahz)ake2, 0.0, -1.0 + d2, 0.0, pw3);
            bna2.a();
        } else {
            this.f(ake2, (float)n2 - 1.0f + f2, n3, n4, pw2);
            this.e(ake2, (float)n2 + 1.0f - f2, n3, n4, pw2);
            this.d(ake2, n2, n3, (float)n4 - 1.0f + f2, pw2);
            this.c((ahz)ake2, (double)n2, (double)n3, (float)n4 + 1.0f - f2, pw2);
            this.b((ahz)ake2, (double)n2, (double)((float)n3 - 1.0f) + d2, (double)n4, pw3);
        }
        this.a(pw2);
        double d3 = 0.25;
        double d4 = 0.25;
        double d5 = d2;
        this.a(d3, d4, d3, 1.0 - d3, d5 - 0.002, 1.0 - d3);
        if (bl2) {
            bna2.b();
            bna2.c(1.0f, 0.0f, 0.0f);
            this.f(ake2, 0.0, 0.0, 0.0, pw2);
            bna2.a();
            bna2.b();
            bna2.c(-1.0f, 0.0f, 0.0f);
            this.e(ake2, 0.0, 0.0, 0.0, pw2);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, 1.0f);
            this.d(ake2, 0.0, 0.0, 0.0, pw2);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, -1.0f);
            this.c((ahz)ake2, 0.0, 0.0, 0.0, pw2);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 1.0f, 0.0f);
            this.b((ahz)ake2, 0.0, 0.0, 0.0, pw2);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            this.a((ahz)ake2, 0.0, 0.0, 0.0, pw2);
            bna2.a();
        } else {
            this.q(ake2, n2, n3, n4);
        }
        if (!bl2) {
            double d6 = 0.375;
            double d7 = 0.25;
            this.a(pw2);
            if (n6 == 0) {
                this.a(d6, 0.0, d6, 1.0 - d6, 0.25, 1.0 - d6);
                this.q(ake2, n2, n3, n4);
            }
            if (n6 == 2) {
                this.a(d6, d4, 0.0, 1.0 - d6, d4 + d7, d3);
                this.q(ake2, n2, n3, n4);
            }
            if (n6 == 3) {
                this.a(d6, d4, 1.0 - d3, 1.0 - d6, d4 + d7, 1.0);
                this.q(ake2, n2, n3, n4);
            }
            if (n6 == 4) {
                this.a(0.0, d4, d6, d3, d4 + d7, 1.0 - d6);
                this.q(ake2, n2, n3, n4);
            }
            if (n6 == 5) {
                this.a(1.0 - d3, d4, d6, 1.0, d4 + d7, 1.0 - d6);
                this.q(ake2, n2, n3, n4);
            }
        }
        this.a();
        return true;
    }

    public boolean a(amj amj2, int n2, int n3, int n4) {
        amj2.e(this.a, n2, n3, n4);
        this.a(amj2);
        this.q(amj2, n2, n3, n4);
        this.f = true;
        boolean bl2 = amj2.f(this.a, n2, n3, n4);
        this.a(amj2);
        this.q(amj2, n2, n3, n4);
        if (bl2 && amj2.g(this.a, n2, n3, n4)) {
            this.a(amj2);
            this.q(amj2, n2, n3, n4);
        }
        this.f = false;
        return true;
    }

    public boolean u(ahz ahz2, int n2, int n3, int n4) {
        bna bna2 = bna.a;
        int n5 = this.a.e(n2, n3, n4);
        if ((n5 & 8) != 0 ? this.a.a(n2, n3 - 1, n4) != ahz2 : this.a.a(n2, n3 + 1, n4) != ahz2) {
            return false;
        }
        boolean bl2 = false;
        float f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.8f;
        float f5 = 0.6f;
        int n6 = ahz2.c(this.a, n2, n3, n4);
        bna2.b(this.k > 0.0 ? n6 : ahz2.c(this.a, n2, n3 - 1, n4));
        bna2.b(f2, f2, f2);
        this.a(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 0));
        bl2 = true;
        bna2.b(this.l < 1.0 ? n6 : ahz2.c(this.a, n2, n3 + 1, n4));
        bna2.b(f3, f3, f3);
        this.b(ahz2, (double)n2, (double)n3, (double)n4, this.a(ahz2, this.a, n2, n3, n4, 1));
        bl2 = true;
        bna2.b(this.m > 0.0 ? n6 : ahz2.c(this.a, n2, n3, n4 - 1));
        bna2.b(f4, f4, f4);
        pw pw2 = this.a(ahz2, this.a, n2, n3, n4, 2);
        this.c(ahz2, (double)n2, (double)n3, (double)n4, pw2);
        bl2 = true;
        this.e = false;
        bna2.b(this.n < 1.0 ? n6 : ahz2.c(this.a, n2, n3, n4 + 1));
        bna2.b(f4, f4, f4);
        pw2 = this.a(ahz2, this.a, n2, n3, n4, 3);
        this.d(ahz2, n2, n3, n4, pw2);
        bl2 = true;
        this.e = false;
        bna2.b(this.i > 0.0 ? n6 : ahz2.c(this.a, n2 - 1, n3, n4));
        bna2.b(f5, f5, f5);
        pw2 = this.a(ahz2, this.a, n2, n3, n4, 4);
        this.e(ahz2, n2, n3, n4, pw2);
        bl2 = true;
        this.e = false;
        bna2.b(this.j < 1.0 ? n6 : ahz2.c(this.a, n2 + 1, n3, n4));
        bna2.b(f5, f5, f5);
        pw2 = this.a(ahz2, this.a, n2, n3, n4, 5);
        this.f(ahz2, n2, n3, n4, pw2);
        bl2 = true;
        this.e = false;
        return bl2;
    }

    public void a(ahz ahz2, double d2, double d3, double d4, pw pw2) {
        bna bna2 = bna.a;
        if (this.b()) {
            pw2 = this.d;
        }
        double d5 = pw2.a(this.i * 16.0);
        double d6 = pw2.a(this.j * 16.0);
        double d7 = pw2.b(this.m * 16.0);
        double d8 = pw2.b(this.n * 16.0);
        if (this.i < 0.0 || this.j > 1.0) {
            d5 = pw2.c();
            d6 = pw2.d();
        }
        if (this.m < 0.0 || this.n > 1.0) {
            d7 = pw2.e();
            d8 = pw2.f();
        }
        double d9 = d6;
        double d10 = d5;
        double d11 = d7;
        double d12 = d8;
        if (this.w == 2) {
            d5 = pw2.a(this.m * 16.0);
            d7 = pw2.b(16.0 - this.j * 16.0);
            d6 = pw2.a(this.n * 16.0);
            d8 = pw2.b(16.0 - this.i * 16.0);
            d9 = d6;
            d10 = d5;
            d11 = d7;
            d12 = d8;
            d9 = d5;
            d10 = d6;
            d7 = d8;
            d8 = d11;
        } else if (this.w == 1) {
            d5 = pw2.a(16.0 - this.n * 16.0);
            d7 = pw2.b(this.i * 16.0);
            d6 = pw2.a(16.0 - this.m * 16.0);
            d8 = pw2.b(this.j * 16.0);
            d9 = d6;
            d10 = d5;
            d11 = d7;
            d12 = d8;
            d5 = d9;
            d6 = d10;
            d11 = d8;
            d12 = d7;
        } else if (this.w == 3) {
            d5 = pw2.a(16.0 - this.i * 16.0);
            d6 = pw2.a(16.0 - this.j * 16.0);
            d7 = pw2.b(16.0 - this.m * 16.0);
            d8 = pw2.b(16.0 - this.n * 16.0);
            d9 = d6;
            d10 = d5;
            d11 = d7;
            d12 = d8;
        }
        double d13 = d2 + this.i;
        double d14 = d2 + this.j;
        double d15 = d3 + this.k;
        double d16 = d4 + this.m;
        double d17 = d4 + this.n;
        if (this.h) {
            d13 = d2 + this.j;
            d14 = d2 + this.i;
        }
        if (this.x) {
            bna2.b(this.aq, this.au, this.ay);
            bna2.b(this.am);
            bna2.a(d13, d15, d17, d10, d12);
            bna2.b(this.ar, this.av, this.az);
            bna2.b(this.an);
            bna2.a(d13, d15, d16, d5, d7);
            bna2.b(this.as, this.aw, this.aA);
            bna2.b(this.ao);
            bna2.a(d14, d15, d16, d9, d11);
            bna2.b(this.at, this.ax, this.aB);
            bna2.b(this.ap);
            bna2.a(d14, d15, d17, d6, d8);
        } else {
            bna2.a(d13, d15, d17, d10, d12);
            bna2.a(d13, d15, d16, d5, d7);
            bna2.a(d14, d15, d16, d9, d11);
            bna2.a(d14, d15, d17, d6, d8);
        }
    }

    public void b(ahz ahz2, double d2, double d3, double d4, pw pw2) {
        bna bna2 = bna.a;
        if (this.b()) {
            pw2 = this.d;
        }
        double d5 = pw2.a(this.i * 16.0);
        double d6 = pw2.a(this.j * 16.0);
        double d7 = pw2.b(this.m * 16.0);
        double d8 = pw2.b(this.n * 16.0);
        if (this.i < 0.0 || this.j > 1.0) {
            d5 = pw2.c();
            d6 = pw2.d();
        }
        if (this.m < 0.0 || this.n > 1.0) {
            d7 = pw2.e();
            d8 = pw2.f();
        }
        double d9 = d6;
        double d10 = d5;
        double d11 = d7;
        double d12 = d8;
        if (this.v == 1) {
            d5 = pw2.a(this.m * 16.0);
            d7 = pw2.b(16.0 - this.j * 16.0);
            d6 = pw2.a(this.n * 16.0);
            d8 = pw2.b(16.0 - this.i * 16.0);
            d9 = d6;
            d10 = d5;
            d11 = d7;
            d12 = d8;
            d9 = d5;
            d10 = d6;
            d7 = d8;
            d8 = d11;
        } else if (this.v == 2) {
            d5 = pw2.a(16.0 - this.n * 16.0);
            d7 = pw2.b(this.i * 16.0);
            d6 = pw2.a(16.0 - this.m * 16.0);
            d8 = pw2.b(this.j * 16.0);
            d9 = d6;
            d10 = d5;
            d11 = d7;
            d12 = d8;
            d5 = d9;
            d6 = d10;
            d11 = d8;
            d12 = d7;
        } else if (this.v == 3) {
            d5 = pw2.a(16.0 - this.i * 16.0);
            d6 = pw2.a(16.0 - this.j * 16.0);
            d7 = pw2.b(16.0 - this.m * 16.0);
            d8 = pw2.b(16.0 - this.n * 16.0);
            d9 = d6;
            d10 = d5;
            d11 = d7;
            d12 = d8;
        }
        double d13 = d2 + this.i;
        double d14 = d2 + this.j;
        double d15 = d3 + this.l;
        double d16 = d4 + this.m;
        double d17 = d4 + this.n;
        if (this.h) {
            d13 = d2 + this.j;
            d14 = d2 + this.i;
        }
        if (this.x) {
            bna2.b(this.aq, this.au, this.ay);
            bna2.b(this.am);
            bna2.a(d14, d15, d17, d6, d8);
            bna2.b(this.ar, this.av, this.az);
            bna2.b(this.an);
            bna2.a(d14, d15, d16, d9, d11);
            bna2.b(this.as, this.aw, this.aA);
            bna2.b(this.ao);
            bna2.a(d13, d15, d16, d5, d7);
            bna2.b(this.at, this.ax, this.aB);
            bna2.b(this.ap);
            bna2.a(d13, d15, d17, d10, d12);
        } else {
            bna2.a(d14, d15, d17, d6, d8);
            bna2.a(d14, d15, d16, d9, d11);
            bna2.a(d13, d15, d16, d5, d7);
            bna2.a(d13, d15, d17, d10, d12);
        }
    }

    public void c(ahz ahz2, double d2, double d3, double d4, pw pw2) {
        double d5;
        bna bna2 = bna.a;
        if (this.b()) {
            pw2 = this.d;
        }
        double d6 = pw2.a(this.i * 16.0);
        double d7 = pw2.a(this.j * 16.0);
        if (this.f) {
            d7 = pw2.a((1.0 - this.i) * 16.0);
            d6 = pw2.a((1.0 - this.j) * 16.0);
        }
        double d8 = pw2.b(16.0 - this.l * 16.0);
        double d9 = pw2.b(16.0 - this.k * 16.0);
        if (this.e) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.i < 0.0 || this.j > 1.0) {
            d6 = pw2.c();
            d7 = pw2.d();
        }
        if (this.k < 0.0 || this.l > 1.0) {
            d8 = pw2.e();
            d9 = pw2.f();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.r == 2) {
            d6 = pw2.a(this.k * 16.0);
            d7 = pw2.a(this.l * 16.0);
            d8 = pw2.b(16.0 - this.i * 16.0);
            d9 = pw2.b(16.0 - this.j * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.r == 1) {
            d6 = pw2.a(16.0 - this.l * 16.0);
            d7 = pw2.a(16.0 - this.k * 16.0);
            d8 = pw2.b(this.j * 16.0);
            d9 = pw2.b(this.i * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d6 = d5;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.r == 3) {
            d6 = pw2.a(16.0 - this.i * 16.0);
            d7 = pw2.a(16.0 - this.j * 16.0);
            d8 = pw2.b(this.l * 16.0);
            d9 = pw2.b(this.k * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        double d13 = d2 + this.i;
        double d14 = d2 + this.j;
        double d15 = d3 + this.k;
        double d16 = d3 + this.l;
        double d17 = d4 + this.m;
        if (this.h) {
            d13 = d2 + this.j;
            d14 = d2 + this.i;
        }
        if (this.x) {
            bna2.b(this.aq, this.au, this.ay);
            bna2.b(this.am);
            bna2.a(d13, d16, d17, d5, d11);
            bna2.b(this.ar, this.av, this.az);
            bna2.b(this.an);
            bna2.a(d14, d16, d17, d6, d8);
            bna2.b(this.as, this.aw, this.aA);
            bna2.b(this.ao);
            bna2.a(d14, d15, d17, d10, d12);
            bna2.b(this.at, this.ax, this.aB);
            bna2.b(this.ap);
            bna2.a(d13, d15, d17, d7, d9);
        } else {
            bna2.a(d13, d16, d17, d5, d11);
            bna2.a(d14, d16, d17, d6, d8);
            bna2.a(d14, d15, d17, d10, d12);
            bna2.a(d13, d15, d17, d7, d9);
        }
    }

    public void d(ahz ahz2, double d2, double d3, double d4, pw pw2) {
        double d5;
        bna bna2 = bna.a;
        if (this.b()) {
            pw2 = this.d;
        }
        double d6 = pw2.a(this.i * 16.0);
        double d7 = pw2.a(this.j * 16.0);
        double d8 = pw2.b(16.0 - this.l * 16.0);
        double d9 = pw2.b(16.0 - this.k * 16.0);
        if (this.e) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.i < 0.0 || this.j > 1.0) {
            d6 = pw2.c();
            d7 = pw2.d();
        }
        if (this.k < 0.0 || this.l > 1.0) {
            d8 = pw2.e();
            d9 = pw2.f();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.s == 1) {
            d6 = pw2.a(this.k * 16.0);
            d9 = pw2.b(16.0 - this.i * 16.0);
            d7 = pw2.a(this.l * 16.0);
            d8 = pw2.b(16.0 - this.j * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.s == 2) {
            d6 = pw2.a(16.0 - this.l * 16.0);
            d8 = pw2.b(this.i * 16.0);
            d7 = pw2.a(16.0 - this.k * 16.0);
            d9 = pw2.b(this.j * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d6 = d5;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.s == 3) {
            d6 = pw2.a(16.0 - this.i * 16.0);
            d7 = pw2.a(16.0 - this.j * 16.0);
            d8 = pw2.b(this.l * 16.0);
            d9 = pw2.b(this.k * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        double d13 = d2 + this.i;
        double d14 = d2 + this.j;
        double d15 = d3 + this.k;
        double d16 = d3 + this.l;
        double d17 = d4 + this.n;
        if (this.h) {
            d13 = d2 + this.j;
            d14 = d2 + this.i;
        }
        if (this.x) {
            bna2.b(this.aq, this.au, this.ay);
            bna2.b(this.am);
            bna2.a(d13, d16, d17, d6, d8);
            bna2.b(this.ar, this.av, this.az);
            bna2.b(this.an);
            bna2.a(d13, d15, d17, d10, d12);
            bna2.b(this.as, this.aw, this.aA);
            bna2.b(this.ao);
            bna2.a(d14, d15, d17, d7, d9);
            bna2.b(this.at, this.ax, this.aB);
            bna2.b(this.ap);
            bna2.a(d14, d16, d17, d5, d11);
        } else {
            bna2.a(d13, d16, d17, d6, d8);
            bna2.a(d13, d15, d17, d10, d12);
            bna2.a(d14, d15, d17, d7, d9);
            bna2.a(d14, d16, d17, d5, d11);
        }
    }

    public void e(ahz ahz2, double d2, double d3, double d4, pw pw2) {
        double d5;
        bna bna2 = bna.a;
        if (this.b()) {
            pw2 = this.d;
        }
        double d6 = pw2.a(this.m * 16.0);
        double d7 = pw2.a(this.n * 16.0);
        double d8 = pw2.b(16.0 - this.l * 16.0);
        double d9 = pw2.b(16.0 - this.k * 16.0);
        if (this.e) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.m < 0.0 || this.n > 1.0) {
            d6 = pw2.c();
            d7 = pw2.d();
        }
        if (this.k < 0.0 || this.l > 1.0) {
            d8 = pw2.e();
            d9 = pw2.f();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.u == 1) {
            d6 = pw2.a(this.k * 16.0);
            d8 = pw2.b(16.0 - this.n * 16.0);
            d7 = pw2.a(this.l * 16.0);
            d9 = pw2.b(16.0 - this.m * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.u == 2) {
            d6 = pw2.a(16.0 - this.l * 16.0);
            d8 = pw2.b(this.m * 16.0);
            d7 = pw2.a(16.0 - this.k * 16.0);
            d9 = pw2.b(this.n * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d6 = d5;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.u == 3) {
            d6 = pw2.a(16.0 - this.m * 16.0);
            d7 = pw2.a(16.0 - this.n * 16.0);
            d8 = pw2.b(this.l * 16.0);
            d9 = pw2.b(this.k * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        double d13 = d2 + this.i;
        double d14 = d3 + this.k;
        double d15 = d3 + this.l;
        double d16 = d4 + this.m;
        double d17 = d4 + this.n;
        if (this.h) {
            d16 = d4 + this.n;
            d17 = d4 + this.m;
        }
        if (this.x) {
            bna2.b(this.aq, this.au, this.ay);
            bna2.b(this.am);
            bna2.a(d13, d15, d17, d5, d11);
            bna2.b(this.ar, this.av, this.az);
            bna2.b(this.an);
            bna2.a(d13, d15, d16, d6, d8);
            bna2.b(this.as, this.aw, this.aA);
            bna2.b(this.ao);
            bna2.a(d13, d14, d16, d10, d12);
            bna2.b(this.at, this.ax, this.aB);
            bna2.b(this.ap);
            bna2.a(d13, d14, d17, d7, d9);
        } else {
            bna2.a(d13, d15, d17, d5, d11);
            bna2.a(d13, d15, d16, d6, d8);
            bna2.a(d13, d14, d16, d10, d12);
            bna2.a(d13, d14, d17, d7, d9);
        }
    }

    public void f(ahz ahz2, double d2, double d3, double d4, pw pw2) {
        double d5;
        bna bna2 = bna.a;
        if (this.b()) {
            pw2 = this.d;
        }
        double d6 = pw2.a(this.m * 16.0);
        double d7 = pw2.a(this.n * 16.0);
        if (this.f) {
            d7 = pw2.a((1.0 - this.m) * 16.0);
            d6 = pw2.a((1.0 - this.n) * 16.0);
        }
        double d8 = pw2.b(16.0 - this.l * 16.0);
        double d9 = pw2.b(16.0 - this.k * 16.0);
        if (this.e) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.m < 0.0 || this.n > 1.0) {
            d6 = pw2.c();
            d7 = pw2.d();
        }
        if (this.k < 0.0 || this.l > 1.0) {
            d8 = pw2.e();
            d9 = pw2.f();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.t == 2) {
            d6 = pw2.a(this.k * 16.0);
            d8 = pw2.b(16.0 - this.m * 16.0);
            d7 = pw2.a(this.l * 16.0);
            d9 = pw2.b(16.0 - this.n * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.t == 1) {
            d6 = pw2.a(16.0 - this.l * 16.0);
            d8 = pw2.b(this.n * 16.0);
            d7 = pw2.a(16.0 - this.k * 16.0);
            d9 = pw2.b(this.m * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
            d6 = d5;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.t == 3) {
            d6 = pw2.a(16.0 - this.m * 16.0);
            d7 = pw2.a(16.0 - this.n * 16.0);
            d8 = pw2.b(this.l * 16.0);
            d9 = pw2.b(this.k * 16.0);
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        double d13 = d2 + this.j;
        double d14 = d3 + this.k;
        double d15 = d3 + this.l;
        double d16 = d4 + this.m;
        double d17 = d4 + this.n;
        if (this.h) {
            d16 = d4 + this.n;
            d17 = d4 + this.m;
        }
        if (this.x) {
            bna2.b(this.aq, this.au, this.ay);
            bna2.b(this.am);
            bna2.a(d13, d14, d17, d10, d12);
            bna2.b(this.ar, this.av, this.az);
            bna2.b(this.an);
            bna2.a(d13, d14, d16, d7, d9);
            bna2.b(this.as, this.aw, this.aA);
            bna2.b(this.ao);
            bna2.a(d13, d15, d16, d5, d11);
            bna2.b(this.at, this.ax, this.aB);
            bna2.b(this.ap);
            bna2.a(d13, d15, d17, d6, d8);
        } else {
            bna2.a(d13, d14, d17, d10, d12);
            bna2.a(d13, d14, d16, d7, d9);
            bna2.a(d13, d15, d16, d5, d11);
            bna2.a(d13, d15, d17, d6, d8);
        }
    }

    public void a(ahz ahz2, int n2, float f2) {
        float f3;
        float f4;
        float f5;
        int n3;
        boolean bl2;
        bna bna2 = bna.a;
        boolean bl3 = bl2 = ahz2 == aie.c;
        if (ahz2 == aie.z || ahz2 == aie.cd || ahz2 == aie.al) {
            n2 = 3;
        }
        if (this.c) {
            n3 = ahz2.i(n2);
            if (bl2) {
                n3 = 0xFFFFFF;
            }
            f5 = (float)(n3 >> 16 & 0xFF) / 255.0f;
            f4 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            f3 = (float)(n3 & 0xFF) / 255.0f;
            GL11.glColor4f((float)(f5 * f2), (float)(f4 * f2), (float)(f3 * f2), (float)1.0f);
        }
        n3 = ahz2.b();
        this.a(ahz2);
        if (n3 == 0 || n3 == 31 || n3 == 39 || n3 == 16 || n3 == 26) {
            if (n3 == 16) {
                n2 = 1;
            }
            ahz2.g();
            this.a(ahz2);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0, n2));
            bna2.a();
            if (bl2 && this.c) {
                int n4 = ahz2.i(n2);
                f4 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                float f6 = (float)(n4 & 0xFF) / 255.0f;
                GL11.glColor4f((float)(f4 * f2), (float)(f3 * f2), (float)(f6 * f2), (float)1.0f);
            }
            bna2.b();
            bna2.c(0.0f, 1.0f, 0.0f);
            this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1, n2));
            bna2.a();
            if (bl2 && this.c) {
                GL11.glColor4f((float)f2, (float)f2, (float)f2, (float)1.0f);
            }
            bna2.b();
            bna2.c(0.0f, 0.0f, -1.0f);
            this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2, n2));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, 1.0f);
            this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3, n2));
            bna2.a();
            bna2.b();
            bna2.c(-1.0f, 0.0f, 0.0f);
            this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4, n2));
            bna2.a();
            bna2.b();
            bna2.c(1.0f, 0.0f, 0.0f);
            this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5, n2));
            bna2.a();
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        } else if (n3 == 1) {
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            pw pw2 = this.a(ahz2, 0, n2);
            this.a(pw2, -0.5, -0.5, -0.5, 1.0f);
            bna2.a();
        } else if (n3 == 19) {
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            ahz2.g();
            this.a(ahz2, n2, this.l, -0.5, -0.5, -0.5);
            bna2.a();
        } else if (n3 == 23) {
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            ahz2.g();
            bna2.a();
        } else if (n3 == 13) {
            ahz2.g();
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            f5 = 0.0625f;
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 1.0f, 0.0f);
            this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1));
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, -1.0f);
            bna2.d(0.0f, 0.0f, f5);
            this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2));
            bna2.d(0.0f, 0.0f, -f5);
            bna2.a();
            bna2.b();
            bna2.c(0.0f, 0.0f, 1.0f);
            bna2.d(0.0f, 0.0f, -f5);
            this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3));
            bna2.d(0.0f, 0.0f, f5);
            bna2.a();
            bna2.b();
            bna2.c(-1.0f, 0.0f, 0.0f);
            bna2.d(f5, 0.0f, 0.0f);
            this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4));
            bna2.d(-f5, 0.0f, 0.0f);
            bna2.a();
            bna2.b();
            bna2.c(1.0f, 0.0f, 0.0f);
            bna2.d(-f5, 0.0f, 0.0f);
            this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5));
            bna2.d(f5, 0.0f, 0.0f);
            bna2.a();
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        } else if (n3 == 22) {
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            bml.a.a(ahz2, n2, f2);
            GL11.glEnable((int)32826);
        } else if (n3 == 6) {
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            this.a(ahz2, n2, -0.5, -0.5, -0.5);
            bna2.a();
        } else if (n3 == 2) {
            bna2.b();
            bna2.c(0.0f, -1.0f, 0.0f);
            this.a(ahz2, -0.5, -0.5, -0.5, 0.0, 0.0, 0);
            bna2.a();
        } else if (n3 == 10) {
            for (int i2 = 0; i2 < 2; ++i2) {
                if (i2 == 0) {
                    this.a(0.0, 0.0, 0.0, 1.0, 1.0, 0.5);
                }
                if (i2 == 1) {
                    this.a(0.0, 0.0, 0.5, 1.0, 0.5, 1.0);
                }
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                bna2.b();
                bna2.c(0.0f, -1.0f, 0.0f);
                this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 1.0f, 0.0f);
                this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, -1.0f);
                this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, 1.0f);
                this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3));
                bna2.a();
                bna2.b();
                bna2.c(-1.0f, 0.0f, 0.0f);
                this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4));
                bna2.a();
                bna2.b();
                bna2.c(1.0f, 0.0f, 0.0f);
                this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5));
                bna2.a();
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            }
        } else if (n3 == 27) {
            int n5 = 0;
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            bna2.b();
            for (int i3 = 0; i3 < 8; ++i3) {
                int n6 = 0;
                int n7 = 1;
                if (i3 == 0) {
                    n6 = 2;
                }
                if (i3 == 1) {
                    n6 = 3;
                }
                if (i3 == 2) {
                    n6 = 4;
                }
                if (i3 == 3) {
                    n6 = 5;
                    n7 = 2;
                }
                if (i3 == 4) {
                    n6 = 6;
                    n7 = 3;
                }
                if (i3 == 5) {
                    n6 = 7;
                    n7 = 5;
                }
                if (i3 == 6) {
                    n6 = 6;
                    n7 = 2;
                }
                if (i3 == 7) {
                    n6 = 3;
                }
                float f7 = (float)n6 / 16.0f;
                float f8 = 1.0f - (float)n5 / 16.0f;
                float f9 = 1.0f - (float)(n5 + n7) / 16.0f;
                n5 += n7;
                this.a(0.5f - f7, f9, (double)(0.5f - f7), (double)(0.5f + f7), (double)f8, (double)(0.5f + f7));
                bna2.c(0.0f, -1.0f, 0.0f);
                this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0));
                bna2.c(0.0f, 1.0f, 0.0f);
                this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1));
                bna2.c(0.0f, 0.0f, -1.0f);
                this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2));
                bna2.c(0.0f, 0.0f, 1.0f);
                this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3));
                bna2.c(-1.0f, 0.0f, 0.0f);
                this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4));
                bna2.c(1.0f, 0.0f, 0.0f);
                this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5));
            }
            bna2.a();
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        } else if (n3 == 11) {
            for (int i4 = 0; i4 < 4; ++i4) {
                f4 = 0.125f;
                if (i4 == 0) {
                    this.a(0.5f - f4, 0.0, 0.0, (double)(0.5f + f4), 1.0, (double)(f4 * 2.0f));
                }
                if (i4 == 1) {
                    this.a(0.5f - f4, 0.0, (double)(1.0f - f4 * 2.0f), (double)(0.5f + f4), 1.0, 1.0);
                }
                f4 = 0.0625f;
                if (i4 == 2) {
                    this.a(0.5f - f4, 1.0f - f4 * 3.0f, (double)(-f4 * 2.0f), (double)(0.5f + f4), (double)(1.0f - f4), (double)(1.0f + f4 * 2.0f));
                }
                if (i4 == 3) {
                    this.a(0.5f - f4, 0.5f - f4 * 3.0f, (double)(-f4 * 2.0f), (double)(0.5f + f4), (double)(0.5f - f4), (double)(1.0f + f4 * 2.0f));
                }
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                bna2.b();
                bna2.c(0.0f, -1.0f, 0.0f);
                this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 1.0f, 0.0f);
                this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, -1.0f);
                this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, 1.0f);
                this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3));
                bna2.a();
                bna2.b();
                bna2.c(-1.0f, 0.0f, 0.0f);
                this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4));
                bna2.a();
                bna2.b();
                bna2.c(1.0f, 0.0f, 0.0f);
                this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5));
                bna2.a();
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            }
            this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        } else if (n3 == 21) {
            for (int i5 = 0; i5 < 3; ++i5) {
                f4 = 0.0625f;
                if (i5 == 0) {
                    this.a(0.5f - f4, 0.3f, 0.0, (double)(0.5f + f4), 1.0, (double)(f4 * 2.0f));
                }
                if (i5 == 1) {
                    this.a(0.5f - f4, 0.3f, (double)(1.0f - f4 * 2.0f), (double)(0.5f + f4), 1.0, 1.0);
                }
                f4 = 0.0625f;
                if (i5 == 2) {
                    this.a(0.5f - f4, 0.5, 0.0, (double)(0.5f + f4), (double)(1.0f - f4), 1.0);
                }
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                bna2.b();
                bna2.c(0.0f, -1.0f, 0.0f);
                this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 1.0f, 0.0f);
                this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, -1.0f);
                this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, 1.0f);
                this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3));
                bna2.a();
                bna2.b();
                bna2.c(-1.0f, 0.0f, 0.0f);
                this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4));
                bna2.a();
                bna2.b();
                bna2.c(1.0f, 0.0f, 0.0f);
                this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5));
                bna2.a();
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            }
        } else if (n3 == 32) {
            for (int i6 = 0; i6 < 2; ++i6) {
                if (i6 == 0) {
                    this.a(0.0, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                }
                if (i6 == 1) {
                    this.a(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
                }
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                bna2.b();
                bna2.c(0.0f, -1.0f, 0.0f);
                this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0, n2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 1.0f, 0.0f);
                this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1, n2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, -1.0f);
                this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2, n2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, 1.0f);
                this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3, n2));
                bna2.a();
                bna2.b();
                bna2.c(-1.0f, 0.0f, 0.0f);
                this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4, n2));
                bna2.a();
                bna2.b();
                bna2.c(1.0f, 0.0f, 0.0f);
                this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5, n2));
                bna2.a();
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            }
            this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        } else if (n3 == 35) {
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            this.a((ahs)ahz2, 0, 0, 0, n2 << 2, true);
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        } else if (n3 == 34) {
            for (int i7 = 0; i7 < 3; ++i7) {
                if (i7 == 0) {
                    this.a(0.125, 0.0, 0.125, 0.875, 0.1875, 0.875);
                    this.a(this.b(aie.Z));
                } else if (i7 == 1) {
                    this.a(0.1875, 0.1875, 0.1875, 0.8125, 0.875, 0.8125);
                    this.a(this.b(aie.bJ));
                } else if (i7 == 2) {
                    this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                    this.a(this.b(aie.w));
                }
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                bna2.b();
                bna2.c(0.0f, -1.0f, 0.0f);
                this.a(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 0, n2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 1.0f, 0.0f);
                this.b(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 1, n2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, -1.0f);
                this.c(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 2, n2));
                bna2.a();
                bna2.b();
                bna2.c(0.0f, 0.0f, 1.0f);
                this.d(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 3, n2));
                bna2.a();
                bna2.b();
                bna2.c(-1.0f, 0.0f, 0.0f);
                this.e(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 4, n2));
                bna2.a();
                bna2.b();
                bna2.c(1.0f, 0.0f, 0.0f);
                this.f(ahz2, 0.0, 0.0, 0.0, this.a(ahz2, 5, n2));
                bna2.a();
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            }
            this.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            this.a();
        } else if (n3 == 38) {
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            this.a((ake)ahz2, 0, 0, 0, 0, true);
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        }
    }

    public static boolean a(int n2) {
        if (n2 == 0) {
            return true;
        }
        if (n2 == 31) {
            return true;
        }
        if (n2 == 39) {
            return true;
        }
        if (n2 == 13) {
            return true;
        }
        if (n2 == 10) {
            return true;
        }
        if (n2 == 11) {
            return true;
        }
        if (n2 == 27) {
            return true;
        }
        if (n2 == 22) {
            return true;
        }
        if (n2 == 21) {
            return true;
        }
        if (n2 == 16) {
            return true;
        }
        if (n2 == 26) {
            return true;
        }
        if (n2 == 32) {
            return true;
        }
        if (n2 == 34) {
            return true;
        }
        if (n2 == 35) {
            return true;
        }
        if (n2 == -1) {
            return false;
        }
        return false;
    }

    public pw a(ahz ahz2, agc agc2, int n2, int n3, int n4, int n5) {
        return this.b(ahz2.e(agc2, n2, n3, n4, n5));
    }

    public pw a(ahz ahz2, int n2, int n3) {
        return this.b(ahz2.a(n2, n3));
    }

    public pw a(ahz ahz2, int n2) {
        return this.b(ahz2.h(n2));
    }

    public pw b(ahz ahz2) {
        return this.b(ahz2.h(1));
    }

    public pw b(pw pw2) {
        if (pw2 == null) {
            pw2 = ((bqs)azi.B().P().b(bqs.b)).b("missingno");
        }
        return pw2;
    }
}

