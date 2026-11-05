/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class xt
extends qr
implements xy {
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private ahz g;
    private int h;
    private boolean i;
    public int a;
    public int b;
    public qr c;
    private int at;
    private int au;
    private double av = 2.0;
    private int aw;

    public xt(afs afs2) {
        super(afs2);
        this.j = 10.0;
        this.a(0.5f, 0.5f);
    }

    public xt(afs afs2, double d2, double d3, double d4) {
        super(afs2);
        this.j = 10.0;
        this.a(0.5f, 0.5f);
        this.b(d2, d3, d4);
        this.L = 0.0f;
    }

    public xt(afs afs2, rm rm2, rm rm3, float f2, float f3) {
        super(afs2);
        this.j = 10.0;
        this.c = rm2;
        if (rm2 instanceof xq) {
            this.a = 1;
        }
        this.t = rm2.t + (double)rm2.g() - (double)0.1f;
        double d2 = rm3.s - rm2.s;
        double d3 = rm3.C.b + (double)(rm3.N / 3.0f) - this.t;
        double d4 = rm3.u - rm2.u;
        double d5 = oy.a(d2 * d2 + d4 * d4);
        if (d5 < 1.0E-7) {
            return;
        }
        float f4 = (float)(Math.atan2(d4, d2) * 180.0 / 3.1415927410125732) - 90.0f;
        float f5 = (float)(-(Math.atan2(d3, d5) * 180.0 / 3.1415927410125732));
        double d6 = d2 / d5;
        double d7 = d4 / d5;
        this.b(rm2.s + d6, this.t, rm2.u + d7, f4, f5);
        this.L = 0.0f;
        float f6 = (float)d5 * 0.2f;
        this.c(d2, d3 + (double)f6, d4, f2, f3);
    }

    public xt(afs afs2, rm rm2, float f2) {
        super(afs2);
        this.j = 10.0;
        this.c = rm2;
        if (rm2 instanceof xq) {
            this.a = 1;
        }
        this.a(0.5f, 0.5f);
        this.b(rm2.s, rm2.t + (double)rm2.g(), rm2.u, rm2.y, rm2.z);
        this.s -= (double)(oy.b(this.y / 180.0f * (float)Math.PI) * 0.16f);
        this.t -= (double)0.1f;
        this.u -= (double)(oy.a(this.y / 180.0f * (float)Math.PI) * 0.16f);
        this.b(this.s, this.t, this.u);
        this.L = 0.0f;
        this.v = -oy.a(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI);
        this.x = oy.b(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI);
        this.w = -oy.a(this.z / 180.0f * (float)Math.PI);
        this.c(this.v, this.w, this.x, f2 * 1.5f, 1.0f);
    }

    @Override
    protected void c() {
        this.af.a(16, (Object)0);
    }

    @Override
    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = oy.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.Z.nextGaussian() * (double)(this.Z.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f3;
        d3 += this.Z.nextGaussian() * (double)(this.Z.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f3;
        d4 += this.Z.nextGaussian() * (double)(this.Z.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f3;
        this.v = d2 *= (double)f2;
        this.w = d3 *= (double)f2;
        this.x = d4 *= (double)f2;
        float f5 = oy.a(d2 * d2 + d4 * d4);
        this.A = this.y = (float)(Math.atan2(d2, d4) * 180.0 / 3.1415927410125732);
        this.B = this.z = (float)(Math.atan2(d3, f5) * 180.0 / 3.1415927410125732);
        this.at = 0;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2) {
        this.b(d2, d3, d4);
        this.b(f2, f3);
    }

    @Override
    public void i(double d2, double d3, double d4) {
        this.v = d2;
        this.w = d3;
        this.x = d4;
        if (this.B == 0.0f && this.A == 0.0f) {
            float f2 = oy.a(d2 * d2 + d4 * d4);
            this.A = this.y = (float)(Math.atan2(d2, d4) * 180.0 / 3.1415927410125732);
            this.B = this.z = (float)(Math.atan2(d3, f2) * 180.0 / 3.1415927410125732);
            this.B = this.z;
            this.A = this.y;
            this.b(this.s, this.t, this.u, this.y, this.z);
            this.at = 0;
        }
    }

    @Override
    public void h() {
        Object object;
        int n2;
        Object object2;
        ahz ahz2;
        super.h();
        if (this.B == 0.0f && this.A == 0.0f) {
            float f2 = oy.a(this.v * this.v + this.x * this.x);
            this.A = this.y = (float)(Math.atan2(this.v, this.x) * 180.0 / 3.1415927410125732);
            this.B = this.z = (float)(Math.atan2(this.w, f2) * 180.0 / 3.1415927410125732);
        }
        if ((ahz2 = this.o.a(this.d, this.e, this.f)).o() != avk.a) {
            ahz2.a((agc)this.o, this.d, this.e, this.f);
            object2 = ahz2.a(this.o, this.d, this.e, this.f);
            if (object2 != null && ((ayk)object2).a(this.o.V().a(this.s, this.t, this.u))) {
                this.i = true;
            }
        }
        if (this.b > 0) {
            --this.b;
        }
        if (this.i) {
            int n3 = this.o.e(this.d, this.e, this.f);
            if (ahz2 != this.g || n3 != this.h) {
                this.i = false;
                this.v *= (double)(this.Z.nextFloat() * 0.2f);
                this.w *= (double)(this.Z.nextFloat() * 0.2f);
                this.x *= (double)(this.Z.nextFloat() * 0.2f);
                this.at = 0;
                this.au = 0;
                return;
            }
            ++this.at;
            if (this.at == 1200) {
                this.A();
            }
            return;
        }
        ++this.au;
        object2 = this.o.V().a(this.s, this.t, this.u);
        ayp ayp2 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        ayn ayn2 = this.o.a((ayp)object2, ayp2, false, true, false);
        object2 = this.o.V().a(this.s, this.t, this.u);
        ayp2 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        if (ayn2 != null) {
            ayp2 = this.o.V().a(ayn2.f.c, ayn2.f.d, ayn2.f.e);
        }
        qr qr2 = null;
        List list = this.o.b((qr)this, this.C.a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
        double d2 = 0.0;
        for (n2 = 0; n2 < list.size(); ++n2) {
            double d3;
            float f3;
            ayn ayn3;
            qr qr3 = (qr)list.get(n2);
            if (!qr3.Q() || qr3 == this.c && this.au < 5 || (ayn3 = ((ayk)(object = qr3.C.b(f3 = 0.3f, f3, f3))).a((ayp)object2, ayp2)) == null || !((d3 = ((ayp)object2).d(ayn3.f)) < d2) && d2 != 0.0) continue;
            qr2 = qr3;
            d2 = d3;
        }
        if (qr2 != null) {
            ayn2 = new ayn(qr2);
        }
        if (ayn2 != null && ayn2.g != null && ayn2.g instanceof xq) {
            xq xq2 = (xq)ayn2.g;
            if (xq2.bE.a || this.c instanceof xq && !((xq)this.c).a(xq2)) {
                ayn2 = null;
            }
        }
        if (ayn2 != null) {
            if (ayn2.g != null) {
                float f4 = oy.a(this.v * this.v + this.w * this.w + this.x * this.x);
                int n4 = oy.f((double)f4 * this.av);
                if (this.f()) {
                    n4 += this.Z.nextInt(n4 / 2 + 2);
                }
                qf qf2 = null;
                qf2 = this.c == null ? qf.a(this, (qr)this) : qf.a(this, this.c);
                if (this.ak() && !(ayn2.g instanceof wr)) {
                    ayn2.g.e(5);
                }
                if (ayn2.g.a(qf2, (float)n4)) {
                    if (ayn2.g instanceof rm) {
                        float f5;
                        object = (rm)ayn2.g;
                        if (!this.o.E) {
                            ((rm)object).p(((rm)object).aY() + 1);
                        }
                        if (this.aw > 0 && (f5 = oy.a(this.v * this.v + this.x * this.x)) > 0.0f) {
                            ayn2.g.g(this.v * (double)this.aw * (double)0.6f / (double)f5, 0.1, this.x * (double)this.aw * (double)0.6f / (double)f5);
                        }
                        if (this.c != null && this.c instanceof rm) {
                            aem.a((rm)object, this.c);
                            aem.b((rm)this.c, (qr)object);
                        }
                        if (this.c != null && ayn2.g != this.c && ayn2.g instanceof xq && this.c instanceof mp) {
                            ((mp)this.c).a.a(new gm(6, 0.0f));
                        }
                    }
                    this.a("random.bowhit", 1.0f, 1.2f / (this.Z.nextFloat() * 0.2f + 0.9f));
                    if (!(ayn2.g instanceof wr)) {
                        this.A();
                    }
                } else {
                    this.v *= (double)-0.1f;
                    this.w *= (double)-0.1f;
                    this.x *= (double)-0.1f;
                    this.y += 180.0f;
                    this.A += 180.0f;
                    this.au = 0;
                }
            } else {
                this.d = ayn2.b;
                this.e = ayn2.c;
                this.f = ayn2.d;
                this.g = ahz2;
                this.h = this.o.e(this.d, this.e, this.f);
                this.v = (float)(ayn2.f.c - this.s);
                this.w = (float)(ayn2.f.d - this.t);
                this.x = (float)(ayn2.f.e - this.u);
                float f6 = oy.a(this.v * this.v + this.w * this.w + this.x * this.x);
                this.s -= this.v / (double)f6 * (double)0.05f;
                this.t -= this.w / (double)f6 * (double)0.05f;
                this.u -= this.x / (double)f6 * (double)0.05f;
                this.a("random.bowhit", 1.0f, 1.2f / (this.Z.nextFloat() * 0.2f + 0.9f));
                this.i = true;
                this.b = 7;
                this.a(false);
                if (this.g.o() != avk.a) {
                    this.g.a(this.o, this.d, this.e, this.f, this);
                }
            }
        }
        if (this.f()) {
            for (n2 = 0; n2 < 4; ++n2) {
                this.o.a("crit", this.s + this.v * (double)n2 / 4.0, this.t + this.w * (double)n2 / 4.0, this.u + this.x * (double)n2 / 4.0, -this.v, -this.w + 0.2, -this.x);
            }
        }
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
        float f7 = oy.a(this.v * this.v + this.x * this.x);
        this.y = (float)(Math.atan2(this.v, this.x) * 180.0 / 3.1415927410125732);
        this.z = (float)(Math.atan2(this.w, f7) * 180.0 / 3.1415927410125732);
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
        float f8 = 0.99f;
        float f9 = 0.05f;
        if (this.L()) {
            for (int i2 = 0; i2 < 4; ++i2) {
                float f10 = 0.25f;
                this.o.a("bubble", this.s - this.v * (double)f10, this.t - this.w * (double)f10, this.u - this.x * (double)f10, this.v, this.w, this.x);
            }
            f8 = 0.8f;
        }
        if (this.K()) {
            this.E();
        }
        this.v *= (double)f8;
        this.w *= (double)f8;
        this.x *= (double)f8;
        this.w -= (double)f9;
        this.b(this.s, this.t, this.u);
        this.H();
    }

    @Override
    public void b(dg dg2) {
        dg2.a("xTile", (short)this.d);
        dg2.a("yTile", (short)this.e);
        dg2.a("zTile", (short)this.f);
        dg2.a("life", (short)this.at);
        dg2.a("inTile", (byte)ahz.b(this.g));
        dg2.a("inData", (byte)this.h);
        dg2.a("shake", (byte)this.b);
        dg2.a("inGround", (byte)(this.i ? 1 : 0));
        dg2.a("pickup", (byte)this.a);
        dg2.a("damage", this.av);
    }

    @Override
    public void a(dg dg2) {
        this.d = dg2.e("xTile");
        this.e = dg2.e("yTile");
        this.f = dg2.e("zTile");
        this.at = dg2.e("life");
        this.g = ahz.e(dg2.d("inTile") & 0xFF);
        this.h = dg2.d("inData") & 0xFF;
        this.b = dg2.d("shake") & 0xFF;
        boolean bl2 = this.i = dg2.d("inGround") == 1;
        if (dg2.b("damage", 99)) {
            this.av = dg2.i("damage");
        }
        if (dg2.b("pickup", 99)) {
            this.a = dg2.d("pickup");
        } else if (dg2.b("player", 99)) {
            this.a = dg2.n("player") ? 1 : 0;
        }
    }

    @Override
    public void b_(xq xq2) {
        boolean bl2;
        if (this.o.E || !this.i || this.b > 0) {
            return;
        }
        boolean bl3 = bl2 = this.a == 1 || this.a == 2 && xq2.bE.d;
        if (this.a == 1 && !xq2.bm.a(new abu(abv.g, 1))) {
            bl2 = false;
        }
        if (bl2) {
            this.a("random.pop", 0.2f, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            xq2.a((qr)this, 1);
            this.A();
        }
    }

    @Override
    protected boolean g_() {
        return false;
    }

    @Override
    public float X() {
        return 0.0f;
    }

    public void b(double d2) {
        this.av = d2;
    }

    public double e() {
        return this.av;
    }

    public void a(int n2) {
        this.aw = n2;
    }

    @Override
    public boolean au() {
        return false;
    }

    public void a(boolean bl2) {
        byte by2 = this.af.a(16);
        if (bl2) {
            this.af.b(16, (byte)(by2 | 1));
        } else {
            this.af.b(16, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    public boolean f() {
        byte by2 = this.af.a(16);
        return (by2 & 1) != 0;
    }
}

