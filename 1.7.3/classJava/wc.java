/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public abstract class wc
extends qr {
    private boolean a;
    private String b;
    private static final int[][][] c = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
    private int d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double at;
    private double au;
    private double av;

    public wc(afs afs2) {
        super(afs2);
        this.k = true;
        this.a(0.98f, 0.7f);
        this.L = this.N / 2.0f;
    }

    public static wc a(afs afs2, double d2, double d3, double d4, int n2) {
        switch (n2) {
            case 1: {
                return new wd(afs2, d2, d3, d4);
            }
            case 2: {
                return new wh(afs2, d2, d3, d4);
            }
            case 3: {
                return new wm(afs2, d2, d3, d4);
            }
            case 4: {
                return new wk(afs2, d2, d3, d4);
            }
            case 5: {
                return new wi(afs2, d2, d3, d4);
            }
            case 6: {
                return new we(afs2, d2, d3, d4);
            }
        }
        return new wj(afs2, d2, d3, d4);
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
        this.af.a(20, new Integer(0));
        this.af.a(21, new Integer(6));
        this.af.a(22, (Object)0);
    }

    @Override
    public ayk h(qr qr2) {
        if (qr2.R()) {
            return qr2.C;
        }
        return null;
    }

    @Override
    public ayk I() {
        return null;
    }

    @Override
    public boolean R() {
        return true;
    }

    public wc(afs afs2, double d2, double d3, double d4) {
        this(afs2);
        this.b(d2, d3, d4);
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
        if (this.o.E || this.K) {
            return true;
        }
        if (this.av()) {
            return false;
        }
        this.j(-this.l());
        this.c(10);
        this.P();
        this.a(this.j() + f2 * 10.0f);
        boolean bl3 = bl2 = qf2.j() instanceof xq && ((xq)qf2.j()).bE.d;
        if (bl2 || this.j() > 40.0f) {
            if (this.l != null) {
                this.l.a(this);
            }
            if (!bl2 || this.k_()) {
                this.a(qf2);
            } else {
                this.A();
            }
        }
        return true;
    }

    public void a(qf qf2) {
        this.A();
        abu abu2 = new abu(abv.au, 1);
        if (this.b != null) {
            abu2.c(this.b);
        }
        this.a(abu2, 0.0f);
    }

    @Override
    public void ai() {
        this.j(-this.l());
        this.c(10);
        this.a(this.j() + this.j() * 10.0f);
    }

    @Override
    public boolean Q() {
        return !this.K;
    }

    @Override
    public void A() {
        super.A();
    }

    @Override
    public void h() {
        double d2;
        int n2;
        int n3;
        if (this.k() > 0) {
            this.c(this.k() - 1);
        }
        if (this.j() > 0.0f) {
            this.a(this.j() - 1.0f);
        }
        if (this.t < -64.0) {
            this.F();
        }
        if (!this.o.E && this.o instanceof mm) {
            this.o.C.a("portal");
            MinecraftServer minecraftServer = ((mm)this.o).q();
            n3 = this.C();
            if (this.an) {
                if (minecraftServer.v()) {
                    if (this.m == null && this.ao++ >= n3) {
                        this.ao = n3;
                        this.am = this.ah();
                        n2 = this.o.t.i == -1 ? 0 : -1;
                        this.b(n2);
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
        if (this.o.E) {
            if (this.d > 0) {
                double d3 = this.s + (this.e - this.s) / (double)this.d;
                double d4 = this.t + (this.f - this.t) / (double)this.d;
                double d5 = this.u + (this.g - this.u) / (double)this.d;
                double d6 = oy.g(this.h - (double)this.y);
                this.y = (float)((double)this.y + d6 / (double)this.d);
                this.z = (float)((double)this.z + (this.i - (double)this.z) / (double)this.d);
                --this.d;
                this.b(d3, d4, d5);
                this.b(this.y, this.z);
            } else {
                this.b(this.s, this.t, this.u);
                this.b(this.y, this.z);
            }
            return;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= (double)0.04f;
        int n4 = oy.c(this.s);
        if (ahv.b_(this.o, n4, (n3 = oy.c(this.t)) - 1, n2 = oy.c(this.u))) {
            --n3;
        }
        double d7 = 0.4;
        double d8 = 0.0078125;
        ahz ahz2 = this.o.a(n4, n3, n2);
        if (ahv.a(ahz2)) {
            int n5 = this.o.e(n4, n3, n2);
            this.a(n4, n3, n2, d7, d8, ahz2, n5);
            if (ahz2 == aie.cc) {
                this.a(n4, n3, n2, (n5 & 8) != 0);
            }
        } else {
            this.b(d7);
        }
        this.H();
        this.z = 0.0f;
        double d9 = this.p - this.s;
        double d10 = this.r - this.u;
        if (d9 * d9 + d10 * d10 > 0.001) {
            this.y = (float)(Math.atan2(d10, d9) * 180.0 / Math.PI);
            if (this.a) {
                this.y += 180.0f;
            }
        }
        if ((d2 = (double)oy.g(this.y - this.A)) < -170.0 || d2 >= 170.0) {
            this.y += 180.0f;
            this.a = !this.a;
        }
        this.b(this.y, this.z);
        List list = this.o.b((qr)this, this.C.b(0.2f, 0.0, 0.2f));
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                qr qr2 = (qr)list.get(i2);
                if (qr2 == this.l || !qr2.R() || !(qr2 instanceof wc)) continue;
                qr2.g(this);
            }
        }
        if (this.l != null && this.l.K) {
            if (this.l.m == this) {
                this.l.m = null;
            }
            this.l = null;
        }
    }

    public void a(int n2, int n3, int n4, boolean bl2) {
    }

    protected void b(double d2) {
        if (this.v < -d2) {
            this.v = -d2;
        }
        if (this.v > d2) {
            this.v = d2;
        }
        if (this.x < -d2) {
            this.x = -d2;
        }
        if (this.x > d2) {
            this.x = d2;
        }
        if (this.D) {
            this.v *= 0.5;
            this.w *= 0.5;
            this.x *= 0.5;
        }
        this.d(this.v, this.w, this.x);
        if (!this.D) {
            this.v *= (double)0.95f;
            this.w *= (double)0.95f;
            this.x *= (double)0.95f;
        }
    }

    protected void a(int n2, int n3, int n4, double d2, double d3, ahz ahz2, int n5) {
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        this.R = 0.0f;
        ayp ayp2 = this.a(this.s, this.t, this.u);
        this.t = n3;
        boolean bl2 = false;
        boolean bl3 = false;
        if (ahz2 == aie.D) {
            bl2 = (n5 & 8) != 0;
            boolean bl4 = bl3 = !bl2;
        }
        if (((ahv)ahz2).e()) {
            n5 &= 7;
        }
        if (n5 >= 2 && n5 <= 5) {
            this.t = n3 + 1;
        }
        if (n5 == 2) {
            this.v -= d3;
        }
        if (n5 == 3) {
            this.v += d3;
        }
        if (n5 == 4) {
            this.x += d3;
        }
        if (n5 == 5) {
            this.x -= d3;
        }
        int[][] nArray = c[n5];
        double d11 = nArray[1][0] - nArray[0][0];
        double d12 = nArray[1][2] - nArray[0][2];
        double d13 = Math.sqrt(d11 * d11 + d12 * d12);
        double d14 = this.v * d11 + this.x * d12;
        if (d14 < 0.0) {
            d11 = -d11;
            d12 = -d12;
        }
        if ((d10 = Math.sqrt(this.v * this.v + this.x * this.x)) > 2.0) {
            d10 = 2.0;
        }
        this.v = d10 * d11 / d13;
        this.x = d10 * d12 / d13;
        if (this.l != null && this.l instanceof rm && (d9 = (double)((rm)this.l).be) > 0.0) {
            d8 = -Math.sin(this.l.y * (float)Math.PI / 180.0f);
            d7 = Math.cos(this.l.y * (float)Math.PI / 180.0f);
            d6 = this.v * this.v + this.x * this.x;
            if (d6 < 0.01) {
                this.v += d8 * 0.1;
                this.x += d7 * 0.1;
                bl3 = false;
            }
        }
        if (bl3) {
            d9 = Math.sqrt(this.v * this.v + this.x * this.x);
            if (d9 < 0.03) {
                this.v *= 0.0;
                this.w *= 0.0;
                this.x *= 0.0;
            } else {
                this.v *= 0.5;
                this.w *= 0.0;
                this.x *= 0.5;
            }
        }
        d9 = 0.0;
        d8 = (double)n2 + 0.5 + (double)nArray[0][0] * 0.5;
        d7 = (double)n4 + 0.5 + (double)nArray[0][2] * 0.5;
        d6 = (double)n2 + 0.5 + (double)nArray[1][0] * 0.5;
        double d15 = (double)n4 + 0.5 + (double)nArray[1][2] * 0.5;
        d11 = d6 - d8;
        d12 = d15 - d7;
        if (d11 == 0.0) {
            this.s = (double)n2 + 0.5;
            d9 = this.u - (double)n4;
        } else if (d12 == 0.0) {
            this.u = (double)n4 + 0.5;
            d9 = this.s - (double)n2;
        } else {
            d5 = this.s - d8;
            d4 = this.u - d7;
            d9 = (d5 * d11 + d4 * d12) * 2.0;
        }
        this.s = d8 + d11 * d9;
        this.u = d7 + d12 * d9;
        this.b(this.s, this.t + (double)this.L, this.u);
        d5 = this.v;
        d4 = this.x;
        if (this.l != null) {
            d5 *= 0.75;
            d4 *= 0.75;
        }
        if (d5 < -d2) {
            d5 = -d2;
        }
        if (d5 > d2) {
            d5 = d2;
        }
        if (d4 < -d2) {
            d4 = -d2;
        }
        if (d4 > d2) {
            d4 = d2;
        }
        this.d(d5, 0.0, d4);
        if (nArray[0][1] != 0 && oy.c(this.s) - n2 == nArray[0][0] && oy.c(this.u) - n4 == nArray[0][2]) {
            this.b(this.s, this.t + (double)nArray[0][1], this.u);
        } else if (nArray[1][1] != 0 && oy.c(this.s) - n2 == nArray[1][0] && oy.c(this.u) - n4 == nArray[1][2]) {
            this.b(this.s, this.t + (double)nArray[1][1], this.u);
        }
        this.i();
        ayp ayp3 = this.a(this.s, this.t, this.u);
        if (ayp3 != null && ayp2 != null) {
            double d16 = (ayp2.d - ayp3.d) * 0.05;
            d10 = Math.sqrt(this.v * this.v + this.x * this.x);
            if (d10 > 0.0) {
                this.v = this.v / d10 * (d10 + d16);
                this.x = this.x / d10 * (d10 + d16);
            }
            this.b(this.s, ayp3.d, this.u);
        }
        int n6 = oy.c(this.s);
        int n7 = oy.c(this.u);
        if (n6 != n2 || n7 != n4) {
            d10 = Math.sqrt(this.v * this.v + this.x * this.x);
            this.v = d10 * (double)(n6 - n2);
            this.x = d10 * (double)(n7 - n4);
        }
        if (bl2) {
            double d17 = Math.sqrt(this.v * this.v + this.x * this.x);
            if (d17 > 0.01) {
                double d18 = 0.06;
                this.v += this.v / d17 * d18;
                this.x += this.x / d17 * d18;
            } else if (n5 == 1) {
                if (this.o.a(n2 - 1, n3, n4).r()) {
                    this.v = 0.02;
                } else if (this.o.a(n2 + 1, n3, n4).r()) {
                    this.v = -0.02;
                }
            } else if (n5 == 0) {
                if (this.o.a(n2, n3, n4 - 1).r()) {
                    this.x = 0.02;
                } else if (this.o.a(n2, n3, n4 + 1).r()) {
                    this.x = -0.02;
                }
            }
        }
    }

    protected void i() {
        if (this.l != null) {
            this.v *= (double)0.997f;
            this.w *= 0.0;
            this.x *= (double)0.997f;
        } else {
            this.v *= (double)0.96f;
            this.w *= 0.0;
            this.x *= (double)0.96f;
        }
    }

    public ayp a(double d2, double d3, double d4, double d5) {
        ahz ahz2;
        int n2;
        int n3;
        int n4 = oy.c(d2);
        if (ahv.b_(this.o, n4, (n3 = oy.c(d3)) - 1, n2 = oy.c(d4))) {
            --n3;
        }
        if (ahv.a(ahz2 = this.o.a(n4, n3, n2))) {
            int n5 = this.o.e(n4, n3, n2);
            if (((ahv)ahz2).e()) {
                n5 &= 7;
            }
            d3 = n3;
            if (n5 >= 2 && n5 <= 5) {
                d3 = n3 + 1;
            }
            int[][] nArray = c[n5];
            double d6 = nArray[1][0] - nArray[0][0];
            double d7 = nArray[1][2] - nArray[0][2];
            double d8 = Math.sqrt(d6 * d6 + d7 * d7);
            if (nArray[0][1] != 0 && oy.c(d2 += (d6 /= d8) * d5) - n4 == nArray[0][0] && oy.c(d4 += (d7 /= d8) * d5) - n2 == nArray[0][2]) {
                d3 += (double)nArray[0][1];
            } else if (nArray[1][1] != 0 && oy.c(d2) - n4 == nArray[1][0] && oy.c(d4) - n2 == nArray[1][2]) {
                d3 += (double)nArray[1][1];
            }
            return this.a(d2, d3, d4);
        }
        return null;
    }

    public ayp a(double d2, double d3, double d4) {
        ahz ahz2;
        int n2;
        int n3;
        int n4 = oy.c(d2);
        if (ahv.b_(this.o, n4, (n3 = oy.c(d3)) - 1, n2 = oy.c(d4))) {
            --n3;
        }
        if (ahv.a(ahz2 = this.o.a(n4, n3, n2))) {
            int n5 = this.o.e(n4, n3, n2);
            d3 = n3;
            if (((ahv)ahz2).e()) {
                n5 &= 7;
            }
            if (n5 >= 2 && n5 <= 5) {
                d3 = n3 + 1;
            }
            int[][] nArray = c[n5];
            double d5 = 0.0;
            double d6 = (double)n4 + 0.5 + (double)nArray[0][0] * 0.5;
            double d7 = (double)n3 + 0.5 + (double)nArray[0][1] * 0.5;
            double d8 = (double)n2 + 0.5 + (double)nArray[0][2] * 0.5;
            double d9 = (double)n4 + 0.5 + (double)nArray[1][0] * 0.5;
            double d10 = (double)n3 + 0.5 + (double)nArray[1][1] * 0.5;
            double d11 = (double)n2 + 0.5 + (double)nArray[1][2] * 0.5;
            double d12 = d9 - d6;
            double d13 = (d10 - d7) * 2.0;
            double d14 = d11 - d8;
            if (d12 == 0.0) {
                d2 = (double)n4 + 0.5;
                d5 = d4 - (double)n2;
            } else if (d14 == 0.0) {
                d4 = (double)n2 + 0.5;
                d5 = d2 - (double)n4;
            } else {
                double d15 = d2 - d6;
                double d16 = d4 - d8;
                d5 = (d15 * d12 + d16 * d14) * 2.0;
            }
            d2 = d6 + d12 * d5;
            d3 = d7 + d13 * d5;
            d4 = d8 + d14 * d5;
            if (d13 < 0.0) {
                d3 += 1.0;
            }
            if (d13 > 0.0) {
                d3 += 0.5;
            }
            return this.o.V().a(d2, d3, d4);
        }
        return null;
    }

    @Override
    protected void a(dg dg2) {
        if (dg2.n("CustomDisplayTile")) {
            this.k(dg2.f("DisplayTile"));
            this.l(dg2.f("DisplayData"));
            this.m(dg2.f("DisplayOffset"));
        }
        if (dg2.b("CustomName", 8) && dg2.j("CustomName").length() > 0) {
            this.b = dg2.j("CustomName");
        }
    }

    @Override
    protected void b(dg dg2) {
        if (this.t()) {
            dg2.a("CustomDisplayTile", true);
            dg2.a("DisplayTile", this.n().o() == avk.a ? 0 : ahz.b(this.n()));
            dg2.a("DisplayData", this.p());
            dg2.a("DisplayOffset", this.r());
        }
        if (this.b != null && this.b.length() > 0) {
            dg2.a("CustomName", this.b);
        }
    }

    @Override
    public float X() {
        return 0.0f;
    }

    @Override
    public void g(qr qr2) {
        double d2;
        double d3;
        double d4;
        if (this.o.E) {
            return;
        }
        if (qr2 == this.l) {
            return;
        }
        if (qr2 instanceof rm && !(qr2 instanceof xq) && !(qr2 instanceof vk) && this.m() == 0 && this.v * this.v + this.x * this.x > 0.01 && this.l == null && qr2.m == null) {
            qr2.a(this);
        }
        if ((d4 = (d3 = qr2.s - this.s) * d3 + (d2 = qr2.u - this.u) * d2) >= (double)1.0E-4f) {
            d4 = oy.a(d4);
            d3 /= d4;
            d2 /= d4;
            double d5 = 1.0 / d4;
            if (d5 > 1.0) {
                d5 = 1.0;
            }
            d3 *= d5;
            d2 *= d5;
            d3 *= (double)0.1f;
            d2 *= (double)0.1f;
            d3 *= (double)(1.0f - this.Y);
            d2 *= (double)(1.0f - this.Y);
            d3 *= 0.5;
            d2 *= 0.5;
            if (qr2 instanceof wc) {
                ayp ayp2;
                double d6 = qr2.s - this.s;
                double d7 = qr2.u - this.u;
                ayp ayp3 = this.o.V().a(d6, 0.0, d7).a();
                double d8 = Math.abs(ayp3.b(ayp2 = this.o.V().a(oy.b(this.y * (float)Math.PI / 180.0f), 0.0, oy.a(this.y * (float)Math.PI / 180.0f)).a()));
                if (d8 < (double)0.8f) {
                    return;
                }
                double d9 = qr2.v + this.v;
                double d10 = qr2.x + this.x;
                if (((wc)qr2).m() == 2 && this.m() != 2) {
                    this.v *= (double)0.2f;
                    this.x *= (double)0.2f;
                    this.g(qr2.v - d3, 0.0, qr2.x - d2);
                    qr2.v *= (double)0.95f;
                    qr2.x *= (double)0.95f;
                } else if (((wc)qr2).m() != 2 && this.m() == 2) {
                    qr2.v *= (double)0.2f;
                    qr2.x *= (double)0.2f;
                    qr2.g(this.v + d3, 0.0, this.x + d2);
                    this.v *= (double)0.95f;
                    this.x *= (double)0.95f;
                } else {
                    this.v *= (double)0.2f;
                    this.x *= (double)0.2f;
                    this.g((d9 /= 2.0) - d3, 0.0, (d10 /= 2.0) - d2);
                    qr2.v *= (double)0.2f;
                    qr2.x *= (double)0.2f;
                    qr2.g(d9 + d3, 0.0, d10 + d2);
                }
            } else {
                this.g(-d3, 0.0, -d2);
                qr2.g(d3 / 4.0, 0.0, d2 / 4.0);
            }
        }
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2) {
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = f2;
        this.i = f3;
        this.d = n2 + 2;
        this.v = this.at;
        this.w = this.au;
        this.x = this.av;
    }

    @Override
    public void i(double d2, double d3, double d4) {
        this.at = this.v = d2;
        this.au = this.w = d3;
        this.av = this.x = d4;
    }

    public void a(float f2) {
        this.af.b(19, Float.valueOf(f2));
    }

    public float j() {
        return this.af.d(19);
    }

    public void c(int n2) {
        this.af.b(17, n2);
    }

    public int k() {
        return this.af.c(17);
    }

    public void j(int n2) {
        this.af.b(18, n2);
    }

    public int l() {
        return this.af.c(18);
    }

    public abstract int m();

    public ahz n() {
        if (!this.t()) {
            return this.o();
        }
        int n2 = this.y().c(20) & 0xFFFF;
        return ahz.e(n2);
    }

    public ahz o() {
        return aie.a;
    }

    public int p() {
        if (!this.t()) {
            return this.q();
        }
        return this.y().c(20) >> 16;
    }

    public int q() {
        return 0;
    }

    public int r() {
        if (!this.t()) {
            return this.s();
        }
        return this.y().c(21);
    }

    public int s() {
        return 6;
    }

    public void k(int n2) {
        this.y().b(20, n2 & 0xFFFF | this.p() << 16);
        this.a(true);
    }

    public void l(int n2) {
        this.y().b(20, ahz.b(this.n()) & 0xFFFF | n2 << 16);
        this.a(true);
    }

    public void m(int n2) {
        this.y().b(21, n2);
        this.a(true);
    }

    public boolean t() {
        return this.y().a(22) == 1;
    }

    public void a(boolean bl2) {
        this.y().b(22, (byte)(bl2 ? 1 : 0));
    }

    public void a(String string) {
        this.b = string;
    }

    @Override
    public String b_() {
        if (this.b != null) {
            return this.b;
        }
        return super.b_();
    }

    public boolean k_() {
        return this.b != null;
    }

    public String u() {
        return this.b;
    }
}

