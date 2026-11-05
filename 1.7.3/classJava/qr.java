/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public abstract class qr {
    private static int b;
    private int c = b++;
    public double j = 1.0;
    public boolean k;
    public qr l;
    public qr m;
    public boolean n;
    public afs o;
    public double p;
    public double q;
    public double r;
    public double s;
    public double t;
    public double u;
    public double v;
    public double w;
    public double x;
    public float y;
    public float z;
    public float A;
    public float B;
    public final ayk C = ayk.a(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    protected boolean I;
    public boolean J = true;
    public boolean K;
    public float L;
    public float M = 0.6f;
    public float N = 1.8f;
    public float O;
    public float P;
    public float Q;
    public float R;
    private int d = 1;
    public double S;
    public double T;
    public double U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    protected Random Z = new Random();
    public int aa;
    public int ab = 1;
    private int e;
    protected boolean ac;
    public int ad;
    private boolean f = true;
    protected boolean ae;
    protected rv af;
    private double g;
    private double h;
    public boolean ag;
    public int ah;
    public int ai;
    public int aj;
    public int bZ;
    public int ca;
    public int cb;
    public boolean ak;
    public boolean al;
    public int am;
    protected boolean an;
    protected int ao;
    public int ap;
    protected int aq;
    private boolean i;
    protected UUID ar = UUID.randomUUID();
    public qv as = qv.b;

    public int x() {
        return this.c;
    }

    public void d(int n2) {
        this.c = n2;
    }

    public qr(afs afs2) {
        this.o = afs2;
        this.b(0.0, 0.0, 0.0);
        if (afs2 != null) {
            this.ap = afs2.t.i;
        }
        this.af = new rv(this);
        this.af.a(0, (Object)0);
        this.af.a(1, (Object)300);
        this.c();
    }

    protected abstract void c();

    public rv y() {
        return this.af;
    }

    public boolean equals(Object object) {
        if (object instanceof qr) {
            return ((qr)object).c == this.c;
        }
        return false;
    }

    public int hashCode() {
        return this.c;
    }

    protected void z() {
        if (this.o == null) {
            return;
        }
        while (this.t > 0.0) {
            this.b(this.s, this.t, this.u);
            if (this.o.a(this, this.C).isEmpty()) break;
            this.t += 1.0;
        }
        this.x = 0.0;
        this.w = 0.0;
        this.v = 0.0;
        this.z = 0.0f;
    }

    public void A() {
        this.K = true;
    }

    protected void a(float f2, float f3) {
        float f4;
        if (f2 != this.M || f3 != this.N) {
            f4 = this.M;
            this.M = f2;
            this.N = f3;
            this.C.d = this.C.a + (double)this.M;
            this.C.f = this.C.c + (double)this.M;
            this.C.e = this.C.b + (double)this.N;
            if (this.M > f4 && !this.f && !this.o.E) {
                this.d(f4 - this.M, 0.0, f4 - this.M);
            }
        }
        this.as = (double)(f4 = f2 % 2.0f) < 0.375 ? qv.a : ((double)f4 < 0.75 ? qv.b : ((double)f4 < 1.0 ? qv.c : ((double)f4 < 1.375 ? qv.d : ((double)f4 < 1.75 ? qv.e : qv.f))));
    }

    protected void b(float f2, float f3) {
        this.y = f2 % 360.0f;
        this.z = f3 % 360.0f;
    }

    public void b(double d2, double d3, double d4) {
        this.s = d2;
        this.t = d3;
        this.u = d4;
        float f2 = this.M / 2.0f;
        float f3 = this.N;
        this.C.b(d2 - (double)f2, d3 - (double)this.L + (double)this.V, d4 - (double)f2, d2 + (double)f2, d3 - (double)this.L + (double)this.V + (double)f3, d4 + (double)f2);
    }

    public void c(float f2, float f3) {
        float f4 = this.z;
        float f5 = this.y;
        this.y = (float)((double)this.y + (double)f2 * 0.15);
        this.z = (float)((double)this.z - (double)f3 * 0.15);
        if (this.z < -90.0f) {
            this.z = -90.0f;
        }
        if (this.z > 90.0f) {
            this.z = 90.0f;
        }
        this.B += this.z - f4;
        this.A += this.y - f5;
    }

    public void h() {
        this.B();
    }

    public void B() {
        int n2;
        ahz ahz2;
        int n3;
        int n4;
        this.o.C.a("entityBaseTick");
        if (this.m != null && this.m.K) {
            this.m = null;
        }
        this.O = this.P;
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.B = this.z;
        this.A = this.y;
        if (!this.o.E && this.o instanceof mm) {
            this.o.C.a("portal");
            MinecraftServer minecraftServer = ((mm)this.o).q();
            n4 = this.C();
            if (this.an) {
                if (minecraftServer.v()) {
                    if (this.m == null && this.ao++ >= n4) {
                        this.ao = n4;
                        this.am = this.ah();
                        n3 = this.o.t.i == -1 ? 0 : -1;
                        this.b(n3);
                    }
                    this.an = false;
                }
            } else {
                if (this.ao > 0) {
                    this.ao -= 4;
                }
                if (this.ao < 0) {
                    this.ao = 0;
                }
            }
            if (this.am > 0) {
                --this.am;
            }
            this.o.C.b();
        }
        if (this.an() && !this.L() && (ahz2 = this.o.a(n2 = oy.c(this.s), n4 = oy.c(this.t - (double)0.2f - (double)this.L), n3 = oy.c(this.u))).o() != avk.a) {
            this.o.a("blockcrack_" + ahz.b(ahz2) + "_" + this.o.e(n2, n4, n3), this.s + ((double)this.Z.nextFloat() - 0.5) * (double)this.M, this.C.b + 0.1, this.u + ((double)this.Z.nextFloat() - 0.5) * (double)this.M, -this.v * 4.0, 1.5, -this.x * 4.0);
        }
        this.M();
        if (this.o.E) {
            this.e = 0;
        } else if (this.e > 0) {
            if (this.ae) {
                this.e -= 4;
                if (this.e < 0) {
                    this.e = 0;
                }
            } else {
                if (this.e % 20 == 0) {
                    this.a(qf.b, 1.0f);
                }
                --this.e;
            }
        }
        if (this.O()) {
            this.D();
            this.R *= 0.5f;
        }
        if (this.t < -64.0) {
            this.F();
        }
        if (!this.o.E) {
            this.a(0, this.e > 0);
        }
        this.f = false;
        this.o.C.b();
    }

    public int C() {
        return 0;
    }

    protected void D() {
        if (!this.ae) {
            this.a(qf.c, 4.0f);
            this.e(15);
        }
    }

    public void e(int n2) {
        int n3 = n2 * 20;
        if (this.e < (n3 = aez.a(this, n3))) {
            this.e = n3;
        }
    }

    public void E() {
        this.e = 0;
    }

    protected void F() {
        this.A();
    }

    public boolean c(double d2, double d3, double d4) {
        ayk ayk2 = this.C.c(d2, d3, d4);
        List list = this.o.a(this, ayk2);
        if (!list.isEmpty()) {
            return false;
        }
        return !this.o.d(ayk2);
    }

    public void d(double d2, double d3, double d4) {
        int n2;
        double d5;
        double d6;
        int n3;
        int n4;
        boolean bl2;
        if (this.X) {
            this.C.d(d2, d3, d4);
            this.s = (this.C.a + this.C.d) / 2.0;
            this.t = this.C.b + (double)this.L - (double)this.V;
            this.u = (this.C.c + this.C.f) / 2.0;
            return;
        }
        this.o.C.a("move");
        this.V *= 0.4f;
        double d7 = this.s;
        double d8 = this.t;
        double d9 = this.u;
        if (this.I) {
            this.I = false;
            d2 *= 0.25;
            d3 *= (double)0.05f;
            d4 *= 0.25;
            this.v = 0.0;
            this.w = 0.0;
            this.x = 0.0;
        }
        double d10 = d2;
        double d11 = d3;
        double d12 = d4;
        ayk ayk2 = this.C.c();
        boolean bl3 = bl2 = this.D && this.am() && this instanceof xq;
        if (bl2) {
            double d13 = 0.05;
            while (d2 != 0.0 && this.o.a(this, this.C.c(d2, -1.0, 0.0)).isEmpty()) {
                d2 = d2 < d13 && d2 >= -d13 ? 0.0 : (d2 > 0.0 ? (d2 -= d13) : (d2 += d13));
                d10 = d2;
            }
            while (d4 != 0.0 && this.o.a(this, this.C.c(0.0, -1.0, d4)).isEmpty()) {
                d4 = d4 < d13 && d4 >= -d13 ? 0.0 : (d4 > 0.0 ? (d4 -= d13) : (d4 += d13));
                d12 = d4;
            }
            while (d2 != 0.0 && d4 != 0.0 && this.o.a(this, this.C.c(d2, -1.0, d4)).isEmpty()) {
                d2 = d2 < d13 && d2 >= -d13 ? 0.0 : (d2 > 0.0 ? (d2 -= d13) : (d2 += d13));
                d4 = d4 < d13 && d4 >= -d13 ? 0.0 : (d4 > 0.0 ? (d4 -= d13) : (d4 += d13));
                d10 = d2;
                d12 = d4;
            }
        }
        List list = this.o.a(this, this.C.a(d2, d3, d4));
        for (n4 = 0; n4 < list.size(); ++n4) {
            d3 = ((ayk)list.get(n4)).b(this.C, d3);
        }
        this.C.d(0.0, d3, 0.0);
        if (!this.J && d11 != d3) {
            d4 = 0.0;
            d3 = 0.0;
            d2 = 0.0;
        }
        n4 = this.D || d11 != d3 && d11 < 0.0 ? 1 : 0;
        for (n3 = 0; n3 < list.size(); ++n3) {
            d2 = ((ayk)list.get(n3)).a(this.C, d2);
        }
        this.C.d(d2, 0.0, 0.0);
        if (!this.J && d10 != d2) {
            d4 = 0.0;
            d3 = 0.0;
            d2 = 0.0;
        }
        for (n3 = 0; n3 < list.size(); ++n3) {
            d4 = ((ayk)list.get(n3)).c(this.C, d4);
        }
        this.C.d(0.0, 0.0, d4);
        if (!this.J && d12 != d4) {
            d4 = 0.0;
            d3 = 0.0;
            d2 = 0.0;
        }
        if (this.W > 0.0f && n4 != 0 && (bl2 || this.V < 0.05f) && (d10 != d2 || d12 != d4)) {
            double d14 = d2;
            d6 = d3;
            d5 = d4;
            d2 = d10;
            d3 = this.W;
            d4 = d12;
            ayk ayk3 = this.C.c();
            this.C.d(ayk2);
            list = this.o.a(this, this.C.a(d2, d3, d4));
            for (n2 = 0; n2 < list.size(); ++n2) {
                d3 = ((ayk)list.get(n2)).b(this.C, d3);
            }
            this.C.d(0.0, d3, 0.0);
            if (!this.J && d11 != d3) {
                d4 = 0.0;
                d3 = 0.0;
                d2 = 0.0;
            }
            for (n2 = 0; n2 < list.size(); ++n2) {
                d2 = ((ayk)list.get(n2)).a(this.C, d2);
            }
            this.C.d(d2, 0.0, 0.0);
            if (!this.J && d10 != d2) {
                d4 = 0.0;
                d3 = 0.0;
                d2 = 0.0;
            }
            for (n2 = 0; n2 < list.size(); ++n2) {
                d4 = ((ayk)list.get(n2)).c(this.C, d4);
            }
            this.C.d(0.0, 0.0, d4);
            if (!this.J && d12 != d4) {
                d4 = 0.0;
                d3 = 0.0;
                d2 = 0.0;
            }
            if (!this.J && d11 != d3) {
                d4 = 0.0;
                d3 = 0.0;
                d2 = 0.0;
            } else {
                d3 = -this.W;
                for (n2 = 0; n2 < list.size(); ++n2) {
                    d3 = ((ayk)list.get(n2)).b(this.C, d3);
                }
                this.C.d(0.0, d3, 0.0);
            }
            if (d14 * d14 + d5 * d5 >= d2 * d2 + d4 * d4) {
                d2 = d14;
                d3 = d6;
                d4 = d5;
                this.C.d(ayk3);
            }
        }
        this.o.C.b();
        this.o.C.a("rest");
        this.s = (this.C.a + this.C.d) / 2.0;
        this.t = this.C.b + (double)this.L - (double)this.V;
        this.u = (this.C.c + this.C.f) / 2.0;
        this.E = d10 != d2 || d12 != d4;
        this.F = d11 != d3;
        this.D = d11 != d3 && d11 < 0.0;
        this.G = this.E || this.F;
        this.a(d3, this.D);
        if (d10 != d2) {
            this.v = 0.0;
        }
        if (d11 != d3) {
            this.w = 0.0;
        }
        if (d12 != d4) {
            this.x = 0.0;
        }
        double d15 = this.s - d7;
        d6 = this.t - d8;
        d5 = this.u - d9;
        if (this.g_() && !bl2 && this.m == null) {
            int n5 = oy.c(this.s);
            n2 = oy.c(this.t - (double)0.2f - (double)this.L);
            int n6 = oy.c(this.u);
            ahz ahz2 = this.o.a(n5, n2, n6);
            int n7 = this.o.a(n5, n2 - 1, n6).b();
            if (n7 == 11 || n7 == 32 || n7 == 21) {
                ahz2 = this.o.a(n5, n2 - 1, n6);
            }
            if (ahz2 != aie.ap) {
                d6 = 0.0;
            }
            this.P = (float)((double)this.P + (double)oy.a(d15 * d15 + d5 * d5) * 0.6);
            this.Q = (float)((double)this.Q + (double)oy.a(d15 * d15 + d6 * d6 + d5 * d5) * 0.6);
            if (this.Q > (float)this.d && ahz2.o() != avk.a) {
                this.d = (int)this.Q + 1;
                if (this.L()) {
                    float f2 = oy.a(this.v * this.v * (double)0.2f + this.w * this.w + this.x * this.x * (double)0.2f) * 0.35f;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    this.a(this.G(), f2, 1.0f + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4f);
                }
                this.a(n5, n2, n6, ahz2);
                ahz2.b(this.o, n5, n2, n6, this);
            }
        }
        try {
            this.H();
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Checking entity block collision");
            k k2 = b2.a("Entity being checked for collision");
            this.a(k2);
            throw new s(b2);
        }
        boolean bl4 = this.K();
        if (this.o.e(this.C.e(0.001, 0.001, 0.001))) {
            this.f(1);
            if (!bl4) {
                ++this.e;
                if (this.e == 0) {
                    this.e(8);
                }
            }
        } else if (this.e <= 0) {
            this.e = -this.ab;
        }
        if (bl4 && this.e > 0) {
            this.a("random.fizz", 0.7f, 1.6f + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4f);
            this.e = -this.ab;
        }
        this.o.C.b();
    }

    protected String G() {
        return "game.neutral.swim";
    }

    protected void H() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = oy.c(this.C.a + 0.001);
        if (this.o.b(n7, n6 = oy.c(this.C.b + 0.001), n5 = oy.c(this.C.c + 0.001), n4 = oy.c(this.C.d - 0.001), n3 = oy.c(this.C.e - 0.001), n2 = oy.c(this.C.f - 0.001))) {
            for (int i2 = n7; i2 <= n4; ++i2) {
                for (int i3 = n6; i3 <= n3; ++i3) {
                    for (int i4 = n5; i4 <= n2; ++i4) {
                        ahz ahz2 = this.o.a(i2, i3, i4);
                        try {
                            ahz2.a(this.o, i2, i3, i4, this);
                            continue;
                        }
                        catch (Throwable throwable) {
                            b b2 = b.a(throwable, "Colliding entity with block");
                            k k2 = b2.a("Block being collided with");
                            k.a(k2, i2, i3, i4, ahz2, this.o.e(i2, i3, i4));
                            throw new s(b2);
                        }
                    }
                }
            }
        }
    }

    protected void a(int n2, int n3, int n4, ahz ahz2) {
        aid aid2 = ahz2.H;
        if (this.o.a(n2, n3 + 1, n4) == aie.aC) {
            aid2 = aie.aC.H;
            this.a(aid2.e(), aid2.c() * 0.15f, aid2.d());
        } else if (!ahz2.o().d()) {
            this.a(aid2.e(), aid2.c() * 0.15f, aid2.d());
        }
    }

    public void a(String string, float f2, float f3) {
        this.o.a(this, string, f2, f3);
    }

    protected boolean g_() {
        return true;
    }

    protected void a(double d2, boolean bl2) {
        if (bl2) {
            if (this.R > 0.0f) {
                this.b(this.R);
                this.R = 0.0f;
            }
        } else if (d2 < 0.0) {
            this.R = (float)((double)this.R - d2);
        }
    }

    public ayk I() {
        return null;
    }

    protected void f(int n2) {
        if (!this.ae) {
            this.a(qf.a, (float)n2);
        }
    }

    public final boolean J() {
        return this.ae;
    }

    protected void b(float f2) {
        if (this.l != null) {
            this.l.b(f2);
        }
    }

    public boolean K() {
        return this.ac || this.o.y(oy.c(this.s), oy.c(this.t), oy.c(this.u)) || this.o.y(oy.c(this.s), oy.c(this.t + (double)this.N), oy.c(this.u));
    }

    public boolean L() {
        return this.ac;
    }

    public boolean M() {
        if (this.o.a(this.C.b(0.0, -0.4f, 0.0).e(0.001, 0.001, 0.001), avk.h, this)) {
            if (!this.ac && !this.f) {
                float f2;
                float f3;
                float f4 = oy.a(this.v * this.v * (double)0.2f + this.w * this.w + this.x * this.x * (double)0.2f) * 0.2f;
                if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                this.a(this.N(), f4, 1.0f + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4f);
                float f5 = oy.c(this.C.b);
                int n2 = 0;
                while ((float)n2 < 1.0f + this.M * 20.0f) {
                    f3 = (this.Z.nextFloat() * 2.0f - 1.0f) * this.M;
                    f2 = (this.Z.nextFloat() * 2.0f - 1.0f) * this.M;
                    this.o.a("bubble", this.s + (double)f3, (double)(f5 + 1.0f), this.u + (double)f2, this.v, this.w - (double)(this.Z.nextFloat() * 0.2f), this.x);
                    ++n2;
                }
                n2 = 0;
                while ((float)n2 < 1.0f + this.M * 20.0f) {
                    f3 = (this.Z.nextFloat() * 2.0f - 1.0f) * this.M;
                    f2 = (this.Z.nextFloat() * 2.0f - 1.0f) * this.M;
                    this.o.a("splash", this.s + (double)f3, (double)(f5 + 1.0f), this.u + (double)f2, this.v, this.w, this.x);
                    ++n2;
                }
            }
            this.R = 0.0f;
            this.ac = true;
            this.e = 0;
        } else {
            this.ac = false;
        }
        return this.ac;
    }

    protected String N() {
        return "game.neutral.swim.splash";
    }

    public boolean a(avk avk2) {
        int n2;
        int n3;
        double d2 = this.t + (double)this.g();
        int n4 = oy.c(this.s);
        ahz ahz2 = this.o.a(n4, n3 = oy.d((float)oy.c(d2)), n2 = oy.c(this.u));
        if (ahz2.o() == avk2) {
            float f2 = akn.b(this.o.e(n4, n3, n2)) - 0.11111111f;
            float f3 = (float)(n3 + 1) - f2;
            return d2 < (double)f3;
        }
        return false;
    }

    public float g() {
        return 0.0f;
    }

    public boolean O() {
        return this.o.a(this.C.b(-0.1f, -0.4f, -0.1f), avk.i);
    }

    public void a(float f2, float f3, float f4) {
        float f5 = f2 * f2 + f3 * f3;
        if (f5 < 1.0E-4f) {
            return;
        }
        if ((f5 = oy.c(f5)) < 1.0f) {
            f5 = 1.0f;
        }
        f5 = f4 / f5;
        float f6 = oy.a(this.y * (float)Math.PI / 180.0f);
        float f7 = oy.b(this.y * (float)Math.PI / 180.0f);
        this.v += (double)((f2 *= f5) * f7 - (f3 *= f5) * f6);
        this.x += (double)(f3 * f7 + f2 * f6);
    }

    public int c(float f2) {
        int n2;
        int n3 = oy.c(this.s);
        if (this.o.d(n3, 0, n2 = oy.c(this.u))) {
            double d2 = (this.C.e - this.C.b) * 0.66;
            int n4 = oy.c(this.t - (double)this.L + d2);
            return this.o.c(n3, n4, n2, 0);
        }
        return 0;
    }

    public float d(float f2) {
        int n2;
        int n3 = oy.c(this.s);
        if (this.o.d(n3, 0, n2 = oy.c(this.u))) {
            double d2 = (this.C.e - this.C.b) * 0.66;
            int n4 = oy.c(this.t - (double)this.L + d2);
            return this.o.n(n3, n4, n2);
        }
        return 0.0f;
    }

    public void a(afs afs2) {
        this.o = afs2;
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.p = this.s = d2;
        this.q = this.t = d3;
        this.r = this.u = d4;
        this.A = this.y = f2;
        this.B = this.z = f3;
        this.V = 0.0f;
        double d5 = this.A - f2;
        if (d5 < -180.0) {
            this.A += 360.0f;
        }
        if (d5 >= 180.0) {
            this.A -= 360.0f;
        }
        this.b(this.s, this.t, this.u);
        this.b(f2, f3);
    }

    public void b(double d2, double d3, double d4, float f2, float f3) {
        this.p = this.s = d2;
        this.S = this.s;
        this.q = this.t = d3 + (double)this.L;
        this.T = this.t;
        this.r = this.u = d4;
        this.U = this.u;
        this.y = f2;
        this.z = f3;
        this.b(this.s, this.t, this.u);
    }

    public float e(qr qr2) {
        float f2 = (float)(this.s - qr2.s);
        float f3 = (float)(this.t - qr2.t);
        float f4 = (float)(this.u - qr2.u);
        return oy.c(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public double e(double d2, double d3, double d4) {
        double d5 = this.s - d2;
        double d6 = this.t - d3;
        double d7 = this.u - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double f(double d2, double d3, double d4) {
        double d5 = this.s - d2;
        double d6 = this.t - d3;
        double d7 = this.u - d4;
        return oy.a(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public double f(qr qr2) {
        double d2 = this.s - qr2.s;
        double d3 = this.t - qr2.t;
        double d4 = this.u - qr2.u;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public void b_(xq xq2) {
    }

    public void g(qr qr2) {
        if (qr2.l == this || qr2.m == this) {
            return;
        }
        double d2 = qr2.s - this.s;
        double d3 = qr2.u - this.u;
        double d4 = oy.a(d2, d3);
        if (d4 >= (double)0.01f) {
            d4 = oy.a(d4);
            d2 /= d4;
            d3 /= d4;
            double d5 = 1.0 / d4;
            if (d5 > 1.0) {
                d5 = 1.0;
            }
            d2 *= d5;
            d3 *= d5;
            d2 *= (double)0.05f;
            d3 *= (double)0.05f;
            this.g(-(d2 *= (double)(1.0f - this.Y)), 0.0, -(d3 *= (double)(1.0f - this.Y)));
            qr2.g(d2, 0.0, d3);
        }
    }

    public void g(double d2, double d3, double d4) {
        this.v += d2;
        this.w += d3;
        this.x += d4;
        this.al = true;
    }

    protected void P() {
        this.H = true;
    }

    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        this.P();
        return false;
    }

    public boolean Q() {
        return false;
    }

    public boolean R() {
        return false;
    }

    public void b(qr qr2, int n2) {
    }

    public boolean h(double d2, double d3, double d4) {
        double d5 = this.s - d2;
        double d6 = this.t - d3;
        double d7 = this.u - d4;
        double d8 = d5 * d5 + d6 * d6 + d7 * d7;
        return this.a(d8);
    }

    public boolean a(double d2) {
        double d3 = this.C.b();
        return d2 < (d3 *= 64.0 * this.j) * d3;
    }

    public boolean c(dg dg2) {
        String string = this.V();
        if (this.K || string == null) {
            return false;
        }
        dg2.a("id", string);
        this.e(dg2);
        return true;
    }

    public boolean d(dg dg2) {
        String string = this.V();
        if (this.K || string == null || this.l != null) {
            return false;
        }
        dg2.a("id", string);
        this.e(dg2);
        return true;
    }

    public void e(dg dg2) {
        try {
            dg dg3;
            dg2.a("Pos", this.a(this.s, this.t + (double)this.V, this.u));
            dg2.a("Motion", this.a(this.v, this.w, this.x));
            dg2.a("Rotation", this.a(new float[]{this.y, this.z}));
            dg2.a("FallDistance", this.R);
            dg2.a("Fire", (short)this.e);
            dg2.a("Air", (short)this.aq());
            dg2.a("OnGround", this.D);
            dg2.a("Dimension", this.ap);
            dg2.a("Invulnerable", this.i);
            dg2.a("PortalCooldown", this.am);
            dg2.a("UUIDMost", this.aA().getMostSignificantBits());
            dg2.a("UUIDLeast", this.aA().getLeastSignificantBits());
            this.b(dg2);
            if (this.m != null && this.m.c(dg3 = new dg())) {
                dg2.a("Riding", dg3);
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Saving entity NBT");
            k k2 = b2.a("Entity being saved");
            this.a(k2);
            throw new s(b2);
        }
    }

    public void f(dg dg2) {
        try {
            dp dp2 = dg2.c("Pos", 6);
            dp dp3 = dg2.c("Motion", 6);
            dp dp4 = dg2.c("Rotation", 5);
            this.v = dp3.d(0);
            this.w = dp3.d(1);
            this.x = dp3.d(2);
            if (Math.abs(this.v) > 10.0) {
                this.v = 0.0;
            }
            if (Math.abs(this.w) > 10.0) {
                this.w = 0.0;
            }
            if (Math.abs(this.x) > 10.0) {
                this.x = 0.0;
            }
            this.S = this.s = dp2.d(0);
            this.p = this.s;
            this.T = this.t = dp2.d(1);
            this.q = this.t;
            this.U = this.u = dp2.d(2);
            this.r = this.u;
            this.A = this.y = dp4.e(0);
            this.B = this.z = dp4.e(1);
            this.R = dg2.h("FallDistance");
            this.e = dg2.e("Fire");
            this.h(dg2.e("Air"));
            this.D = dg2.n("OnGround");
            this.ap = dg2.f("Dimension");
            this.i = dg2.n("Invulnerable");
            this.am = dg2.f("PortalCooldown");
            if (dg2.b("UUIDMost", 4) && dg2.b("UUIDLeast", 4)) {
                this.ar = new UUID(dg2.g("UUIDMost"), dg2.g("UUIDLeast"));
            }
            this.b(this.s, this.t, this.u);
            this.b(this.y, this.z);
            this.a(dg2);
            if (this.U()) {
                this.b(this.s, this.t, this.u);
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Loading entity NBT");
            k k2 = b2.a("Entity being loaded");
            this.a(k2);
            throw new s(b2);
        }
    }

    protected boolean U() {
        return true;
    }

    protected final String V() {
        return qx.b(this);
    }

    protected abstract void a(dg var1);

    protected abstract void b(dg var1);

    public void W() {
    }

    protected dp a(double ... dArray) {
        dp dp2 = new dp();
        for (double d2 : dArray) {
            dp2.a(new dj(d2));
        }
        return dp2;
    }

    protected dp a(float ... fArray) {
        dp dp2 = new dp();
        for (float f2 : fArray) {
            dp2.a(new dl(f2));
        }
        return dp2;
    }

    public float X() {
        return this.N / 2.0f;
    }

    public wb a(abs abs2, int n2) {
        return this.a(abs2, n2, 0.0f);
    }

    public wb a(abs abs2, int n2, float f2) {
        return this.a(new abu(abs2, n2, 0), f2);
    }

    public wb a(abu abu2, float f2) {
        if (abu2.b == 0 || abu2.b() == null) {
            return null;
        }
        wb wb2 = new wb(this.o, this.s, this.t + (double)f2, this.u, abu2);
        wb2.b = 10;
        this.o.d(wb2);
        return wb2;
    }

    public boolean Y() {
        return !this.K;
    }

    public boolean Z() {
        for (int i2 = 0; i2 < 8; ++i2) {
            int n2;
            int n3;
            float f2 = ((float)((i2 >> 0) % 2) - 0.5f) * this.M * 0.8f;
            float f3 = ((float)((i2 >> 1) % 2) - 0.5f) * 0.1f;
            float f4 = ((float)((i2 >> 2) % 2) - 0.5f) * this.M * 0.8f;
            int n4 = oy.c(this.s + (double)f2);
            if (!this.o.a(n4, n3 = oy.c(this.t + (double)this.g() + (double)f3), n2 = oy.c(this.u + (double)f4)).r()) continue;
            return true;
        }
        return false;
    }

    public boolean c(xq xq2) {
        return false;
    }

    public ayk h(qr qr2) {
        return null;
    }

    public void aa() {
        if (this.m.K) {
            this.m = null;
            return;
        }
        this.v = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.h();
        if (this.m == null) {
            return;
        }
        this.m.ab();
        this.h += (double)(this.m.y - this.m.A);
        this.g += (double)(this.m.z - this.m.B);
        while (this.h >= 180.0) {
            this.h -= 360.0;
        }
        while (this.h < -180.0) {
            this.h += 360.0;
        }
        while (this.g >= 180.0) {
            this.g -= 360.0;
        }
        while (this.g < -180.0) {
            this.g += 360.0;
        }
        double d2 = this.h * 0.5;
        double d3 = this.g * 0.5;
        float f2 = 10.0f;
        if (d2 > (double)f2) {
            d2 = f2;
        }
        if (d2 < (double)(-f2)) {
            d2 = -f2;
        }
        if (d3 > (double)f2) {
            d3 = f2;
        }
        if (d3 < (double)(-f2)) {
            d3 = -f2;
        }
        this.h -= d2;
        this.g -= d3;
    }

    public void ab() {
        if (this.l == null) {
            return;
        }
        this.l.b(this.s, this.t + this.ad() + this.l.ac(), this.u);
    }

    public double ac() {
        return this.L;
    }

    public double ad() {
        return (double)this.N * 0.75;
    }

    public void a(qr qr2) {
        this.g = 0.0;
        this.h = 0.0;
        if (qr2 == null) {
            if (this.m != null) {
                this.b(this.m.s, this.m.C.b + (double)this.m.N, this.m.u, this.y, this.z);
                this.m.l = null;
            }
            this.m = null;
            return;
        }
        if (this.m != null) {
            this.m.l = null;
        }
        this.m = qr2;
        qr2.l = this;
    }

    public void a(double d2, double d3, double d4, float f2, float f3, int n2) {
        this.b(d2, d3, d4);
        this.b(f2, f3);
        List list = this.o.a(this, this.C.e(0.03125, 0.0, 0.03125));
        if (!list.isEmpty()) {
            double d5 = 0.0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                ayk ayk2 = (ayk)list.get(i2);
                if (!(ayk2.e > d5)) continue;
                d5 = ayk2.e;
            }
            this.b(d2, d3 += d5 - this.C.b, d4);
        }
    }

    public float ae() {
        return 0.1f;
    }

    public ayp af() {
        return null;
    }

    public void ag() {
        if (this.am > 0) {
            this.am = this.ah();
            return;
        }
        double d2 = this.p - this.s;
        double d3 = this.r - this.u;
        if (!this.o.E && !this.an) {
            this.aq = p.a(d2, d3);
        }
        this.an = true;
    }

    public int ah() {
        return 300;
    }

    public void i(double d2, double d3, double d4) {
        this.v = d2;
        this.w = d3;
        this.x = d4;
    }

    public void a(byte by2) {
    }

    public void ai() {
    }

    public abu[] aj() {
        return null;
    }

    public void c(int n2, abu abu2) {
    }

    public boolean ak() {
        boolean bl2 = this.o != null && this.o.E;
        return !this.ae && (this.e > 0 || bl2 && this.g(0));
    }

    public boolean al() {
        return this.m != null;
    }

    public boolean am() {
        return this.g(1);
    }

    public void b(boolean bl2) {
        this.a(1, bl2);
    }

    public boolean an() {
        return this.g(3);
    }

    public void c(boolean bl2) {
        this.a(3, bl2);
    }

    public boolean ao() {
        return this.g(5);
    }

    public boolean d(xq xq2) {
        return this.ao();
    }

    public void d(boolean bl2) {
        this.a(5, bl2);
    }

    public boolean ap() {
        return this.g(4);
    }

    public void e(boolean bl2) {
        this.a(4, bl2);
    }

    protected boolean g(int n2) {
        return (this.af.a(0) & 1 << n2) != 0;
    }

    protected void a(int n2, boolean bl2) {
        byte by2 = this.af.a(0);
        if (bl2) {
            this.af.b(0, (byte)(by2 | 1 << n2));
        } else {
            this.af.b(0, (byte)(by2 & ~(1 << n2)));
        }
    }

    public int aq() {
        return this.af.b(1);
    }

    public void h(int n2) {
        this.af.b(1, (short)n2);
    }

    public void a(vy vy2) {
        this.f(5);
        ++this.e;
        if (this.e == 0) {
            this.e(8);
        }
    }

    public void a(rm rm2) {
    }

    protected boolean j(double d2, double d3, double d4) {
        int n2 = oy.c(d2);
        int n3 = oy.c(d3);
        int n4 = oy.c(d4);
        double d5 = d2 - (double)n2;
        double d6 = d3 - (double)n3;
        double d7 = d4 - (double)n4;
        List list = this.o.a(this.C);
        if (!list.isEmpty() || this.o.q(n2, n3, n4)) {
            boolean bl2 = !this.o.q(n2 - 1, n3, n4);
            boolean bl3 = !this.o.q(n2 + 1, n3, n4);
            boolean bl4 = !this.o.q(n2, n3 - 1, n4);
            boolean bl5 = !this.o.q(n2, n3 + 1, n4);
            boolean bl6 = !this.o.q(n2, n3, n4 - 1);
            boolean bl7 = !this.o.q(n2, n3, n4 + 1);
            int n5 = 3;
            double d8 = 9999.0;
            if (bl2 && d5 < d8) {
                d8 = d5;
                n5 = 0;
            }
            if (bl3 && 1.0 - d5 < d8) {
                d8 = 1.0 - d5;
                n5 = 1;
            }
            if (bl5 && 1.0 - d6 < d8) {
                d8 = 1.0 - d6;
                n5 = 3;
            }
            if (bl6 && d7 < d8) {
                d8 = d7;
                n5 = 4;
            }
            if (bl7 && 1.0 - d7 < d8) {
                d8 = 1.0 - d7;
                n5 = 5;
            }
            float f2 = this.Z.nextFloat() * 0.2f + 0.1f;
            if (n5 == 0) {
                this.v = -f2;
            }
            if (n5 == 1) {
                this.v = f2;
            }
            if (n5 == 2) {
                this.w = -f2;
            }
            if (n5 == 3) {
                this.w = f2;
            }
            if (n5 == 4) {
                this.x = -f2;
            }
            if (n5 == 5) {
                this.x = f2;
            }
            return true;
        }
        return false;
    }

    public void ar() {
        this.I = true;
        this.R = 0.0f;
    }

    public String b_() {
        String string = qx.b(this);
        if (string == null) {
            string = "generic";
        }
        return dc.a("entity." + string + ".name");
    }

    public qr[] as() {
        return null;
    }

    public boolean i(qr qr2) {
        return this == qr2;
    }

    public float at() {
        return 0.0f;
    }

    public void e(float f2) {
    }

    public boolean au() {
        return true;
    }

    public boolean j(qr qr2) {
        return false;
    }

    public String toString() {
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.b_(), this.c, this.o == null ? "~NULL~" : this.o.N().k(), this.s, this.t, this.u);
    }

    public boolean av() {
        return this.i;
    }

    public void k(qr qr2) {
        this.b(qr2.s, qr2.t, qr2.u, qr2.y, qr2.z);
    }

    public void a(qr qr2, boolean bl2) {
        dg dg2 = new dg();
        qr2.e(dg2);
        this.f(dg2);
        this.am = qr2.am;
        this.aq = qr2.aq;
    }

    public void b(int n2) {
        if (this.o.E || this.K) {
            return;
        }
        this.o.C.a("changeDimension");
        MinecraftServer minecraftServer = MinecraftServer.G();
        int n3 = this.ap;
        mm mm2 = minecraftServer.a(n3);
        mm mm3 = minecraftServer.a(n2);
        this.ap = n2;
        if (n3 == 1 && n2 == 1) {
            mm3 = minecraftServer.a(0);
            this.ap = 0;
        }
        this.o.e(this);
        this.K = false;
        this.o.C.a("reposition");
        minecraftServer.af().a(this, n3, mm2, mm3);
        this.o.C.c("reloading");
        qr qr2 = qx.a(qx.b(this), (afs)mm3);
        if (qr2 != null) {
            qr2.a(this, true);
            if (n3 == 1 && n2 == 1) {
                r r2 = mm3.K();
                r2.b = this.o.i(r2.a, r2.c);
                qr2.b(r2.a, r2.b, r2.c, qr2.y, qr2.z);
            }
            mm3.d(qr2);
        }
        this.K = true;
        this.o.C.b();
        mm2.i();
        mm3.i();
        this.o.C.b();
    }

    public float a(afn afn2, afs afs2, int n2, int n3, int n4, ahz ahz2) {
        return ahz2.a(this);
    }

    public boolean a(afn afn2, afs afs2, int n2, int n3, int n4, ahz ahz2, float f2) {
        return true;
    }

    public int aw() {
        return 3;
    }

    public int ax() {
        return this.aq;
    }

    public boolean ay() {
        return false;
    }

    public void a(k k2) {
        k2.a("Entity Type", new qs(this));
        k2.a("Entity ID", this.c);
        k2.a("Entity Name", new qt(this));
        k2.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.s, this.t, this.u));
        k2.a("Entity's Block location", k.a(oy.c(this.s), oy.c(this.t), oy.c(this.u)));
        k2.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.v, this.w, this.x));
    }

    public boolean az() {
        return this.ak();
    }

    public UUID aA() {
        return this.ar;
    }

    public boolean aB() {
        return true;
    }

    public fa c_() {
        return new fh(this.b_());
    }

    public void i(int n2) {
    }
}

