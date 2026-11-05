/*
 * Decompiled with CFR 0.152.
 */
public class vt
extends wx
implements vn,
wz {
    private float[] bp = new float[2];
    private float[] bq = new float[2];
    private float[] br = new float[2];
    private float[] bs = new float[2];
    private int[] bt = new int[2];
    private int[] bu = new int[2];
    private int bv;
    private static final ra bw = new vu();

    public vt(afs afs2) {
        super(afs2);
        this.g(this.aX());
        this.a(0.9f, 4.0f);
        this.ae = true;
        this.m().e(true);
        this.c.a(0, new sw(this));
        this.c.a(2, new tu(this, 1.0, 40, 20.0f));
        this.c.a(5, new tt(this, 1.0));
        this.c.a(6, new te(this, xq.class, 8.0f));
        this.c.a(7, new ts(this));
        this.d.a(1, new ue(this, false));
        this.d.a(2, new uf(this, rn.class, 0, false, false, bw));
        this.b = 50;
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(17, new Integer(0));
        this.af.a(18, new Integer(0));
        this.af.a(19, new Integer(0));
        this.af.a(20, new Integer(0));
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Invul", this.ca());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.s(dg2.f("Invul"));
    }

    @Override
    public float X() {
        return this.N / 8.0f;
    }

    @Override
    protected String t() {
        return "mob.wither.idle";
    }

    @Override
    protected String aS() {
        return "mob.wither.hurt";
    }

    @Override
    protected String aT() {
        return "mob.wither.death";
    }

    @Override
    public void e() {
        int n2;
        int n3;
        double d2;
        double d3;
        double d4;
        qr qr2;
        this.w *= (double)0.6f;
        if (!this.o.E && this.t(0) > 0 && (qr2 = this.o.a(this.t(0))) != null) {
            double d5;
            if (this.t < qr2.t || !this.cb() && this.t < qr2.t + 5.0) {
                if (this.w < 0.0) {
                    this.w = 0.0;
                }
                this.w += (0.5 - this.w) * (double)0.6f;
            }
            if ((d4 = (d5 = qr2.s - this.s) * d5 + (d3 = qr2.u - this.u) * d3) > 9.0) {
                d2 = oy.a(d4);
                this.v += (d5 / d2 * 0.5 - this.v) * (double)0.6f;
                this.x += (d3 / d2 * 0.5 - this.x) * (double)0.6f;
            }
        }
        if (this.v * this.v + this.x * this.x > (double)0.05f) {
            this.y = (float)Math.atan2(this.x, this.v) * 57.295776f - 90.0f;
        }
        super.e();
        for (n3 = 0; n3 < 2; ++n3) {
            this.bs[n3] = this.bq[n3];
            this.br[n3] = this.bp[n3];
        }
        for (n3 = 0; n3 < 2; ++n3) {
            int n4 = this.t(n3 + 1);
            qr qr3 = null;
            if (n4 > 0) {
                qr3 = this.o.a(n4);
            }
            if (qr3 != null) {
                d3 = this.u(n3 + 1);
                d4 = this.v(n3 + 1);
                d2 = this.w(n3 + 1);
                double d6 = qr3.s - d3;
                double d7 = qr3.t + (double)qr3.g() - d4;
                double d8 = qr3.u - d2;
                double d9 = oy.a(d6 * d6 + d8 * d8);
                float f2 = (float)(Math.atan2(d8, d6) * 180.0 / 3.1415927410125732) - 90.0f;
                float f3 = (float)(-(Math.atan2(d7, d9) * 180.0 / 3.1415927410125732));
                this.bp[n3] = this.b(this.bp[n3], f3, 40.0f);
                this.bq[n3] = this.b(this.bq[n3], f2, 10.0f);
                continue;
            }
            this.bq[n3] = this.b(this.bq[n3], this.aM, 10.0f);
        }
        n3 = this.cb() ? 1 : 0;
        for (n2 = 0; n2 < 3; ++n2) {
            double d10 = this.u(n2);
            double d11 = this.v(n2);
            double d12 = this.w(n2);
            this.o.a("smoke", d10 + this.Z.nextGaussian() * (double)0.3f, d11 + this.Z.nextGaussian() * (double)0.3f, d12 + this.Z.nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0);
            if (n3 == 0 || this.o.s.nextInt(4) != 0) continue;
            this.o.a("mobSpell", d10 + this.Z.nextGaussian() * (double)0.3f, d11 + this.Z.nextGaussian() * (double)0.3f, d12 + this.Z.nextGaussian() * (double)0.3f, (double)0.7f, (double)0.7f, 0.5);
        }
        if (this.ca() > 0) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.o.a("mobSpell", this.s + this.Z.nextGaussian() * 1.0, this.t + (double)(this.Z.nextFloat() * 3.3f), this.u + this.Z.nextGaussian() * 1.0, (double)0.7f, (double)0.7f, 0.9f);
            }
        }
    }

    @Override
    protected void bm() {
        int n2;
        int n3;
        if (this.ca() > 0) {
            int n4 = this.ca() - 1;
            if (n4 <= 0) {
                this.o.a((qr)this, this.s, this.t + (double)this.g(), this.u, 7.0f, false, this.o.O().b("mobGriefing"));
                this.o.b(1013, (int)this.s, (int)this.t, (int)this.u, 0);
            }
            this.s(n4);
            if (this.aa % 10 == 0) {
                this.f(10.0f);
            }
            return;
        }
        super.bm();
        block0: for (n3 = 1; n3 < 3; ++n3) {
            Object object;
            if (this.aa < this.bt[n3 - 1]) continue;
            this.bt[n3 - 1] = this.aa + 10 + this.Z.nextInt(10);
            if (this.o.r == pu.c || this.o.r == pu.d) {
                int n5 = n3 - 1;
                int n6 = this.bu[n5];
                this.bu[n5] = n6 + 1;
                if (n6 > 15) {
                    float f2 = 10.0f;
                    float f3 = 5.0f;
                    double d2 = oy.a(this.Z, this.s - (double)f2, this.s + (double)f2);
                    double d3 = oy.a(this.Z, this.t - (double)f3, this.t + (double)f3);
                    double d4 = oy.a(this.Z, this.u - (double)f2, this.u + (double)f2);
                    this.a(n3 + 1, d2, d3, d4, true);
                    this.bu[n3 - 1] = 0;
                }
            }
            if ((n2 = this.t(n3)) > 0) {
                object = this.o.a(n2);
                if (object == null || !((qr)object).Y() || this.f((qr)object) > 900.0 || !this.p((qr)object)) {
                    this.b(n3, 0);
                    continue;
                }
                this.a(n3 + 1, (rm)object);
                this.bt[n3 - 1] = this.aa + 40 + this.Z.nextInt(20);
                this.bu[n3 - 1] = 0;
                continue;
            }
            object = this.o.a(rm.class, this.C.b(20.0, 8.0, 20.0), bw);
            for (int i2 = 0; i2 < 10 && !object.isEmpty(); ++i2) {
                rm rm2 = (rm)object.get(this.Z.nextInt(object.size()));
                if (rm2 != this && rm2.Y() && this.p(rm2)) {
                    if (rm2 instanceof xq) {
                        if (((xq)rm2).bE.a) continue block0;
                        this.b(n3, rm2.x());
                        continue block0;
                    }
                    this.b(n3, rm2.x());
                    continue block0;
                }
                object.remove(rm2);
            }
        }
        if (this.o() != null) {
            this.b(0, this.o().x());
        } else {
            this.b(0, 0);
        }
        if (this.bv > 0) {
            --this.bv;
            if (this.bv == 0 && this.o.O().b("mobGriefing")) {
                n3 = oy.c(this.t);
                n2 = oy.c(this.s);
                int n7 = oy.c(this.u);
                boolean bl2 = false;
                for (int i3 = -1; i3 <= 1; ++i3) {
                    for (int i4 = -1; i4 <= 1; ++i4) {
                        for (int i5 = 0; i5 <= 3; ++i5) {
                            int n8 = n2 + i3;
                            int n9 = n3 + i5;
                            int n10 = n7 + i4;
                            ahz ahz2 = this.o.a(n8, n9, n10);
                            if (ahz2.o() == avk.a || ahz2 == aie.h || ahz2 == aie.bq || ahz2 == aie.br || ahz2 == aie.bI) continue;
                            bl2 = this.o.a(n8, n9, n10, true) || bl2;
                        }
                    }
                }
                if (bl2) {
                    this.o.a(null, 1012, (int)this.s, (int)this.t, (int)this.u, 0);
                }
            }
        }
        if (this.aa % 20 == 0) {
            this.f(1.0f);
        }
    }

    public void bZ() {
        this.s(220);
        this.g(this.aX() / 3.0f);
    }

    @Override
    public void ar() {
    }

    @Override
    public int aU() {
        return 4;
    }

    private double u(int n2) {
        if (n2 <= 0) {
            return this.s;
        }
        float f2 = (this.aM + (float)(180 * (n2 - 1))) / 180.0f * (float)Math.PI;
        float f3 = oy.b(f2);
        return this.s + (double)f3 * 1.3;
    }

    private double v(int n2) {
        if (n2 <= 0) {
            return this.t + 3.0;
        }
        return this.t + 2.2;
    }

    private double w(int n2) {
        if (n2 <= 0) {
            return this.u;
        }
        float f2 = (this.aM + (float)(180 * (n2 - 1))) / 180.0f * (float)Math.PI;
        float f3 = oy.a(f2);
        return this.u + (double)f3 * 1.3;
    }

    private float b(float f2, float f3, float f4) {
        float f5 = oy.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    private void a(int n2, rm rm2) {
        this.a(n2, rm2.s, rm2.t + (double)rm2.g() * 0.5, rm2.u, n2 == 0 && this.Z.nextFloat() < 0.001f);
    }

    private void a(int n2, double d2, double d3, double d4, boolean bl2) {
        this.o.a(null, 1014, (int)this.s, (int)this.t, (int)this.u, 0);
        double d5 = this.u(n2);
        double d6 = this.v(n2);
        double d7 = this.w(n2);
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        yg yg2 = new yg(this.o, this, d8, d9, d10);
        if (bl2) {
            yg2.a(true);
        }
        yg2.t = d6;
        yg2.s = d5;
        yg2.u = d7;
        this.o.d(yg2);
    }

    @Override
    public void a(rm rm2, float f2) {
        this.a(0, rm2);
    }

    @Override
    public boolean a(qf qf2, float f2) {
        qr qr2;
        if (this.av()) {
            return false;
        }
        if (qf2 == qf.e) {
            return false;
        }
        if (this.ca() > 0) {
            return false;
        }
        if (this.cb() && (qr2 = qf2.i()) instanceof xt) {
            return false;
        }
        qr2 = qf2.j();
        if (qr2 != null && !(qr2 instanceof xq) && qr2 instanceof rm && ((rm)qr2).bc() == this.bc()) {
            return false;
        }
        if (this.bv <= 0) {
            this.bv = 20;
        }
        int n2 = 0;
        while (n2 < this.bu.length) {
            int n3 = n2++;
            this.bu[n3] = this.bu[n3] + 3;
        }
        return super.a(qf2, f2);
    }

    @Override
    protected void b(boolean bl2, int n2) {
        this.a(abv.bN, 1);
        if (!this.o.E) {
            for (xq xq2 : this.o.a(xq.class, this.C.b(50.0, 100.0, 50.0))) {
                xq2.a(nt.J);
            }
        }
    }

    @Override
    protected void w() {
        this.aU = 0;
    }

    @Override
    public int c(float f2) {
        return 0xF000F0;
    }

    @Override
    protected void b(float f2) {
    }

    @Override
    public void c(qn qn2) {
    }

    @Override
    protected boolean bj() {
        return true;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(300.0);
        this.a(xa.d).a(0.6f);
        this.a(xa.b).a(40.0);
    }

    public float a(int n2) {
        return this.bq[n2];
    }

    public float c(int n2) {
        return this.bp[n2];
    }

    public int ca() {
        return this.af.c(20);
    }

    public void s(int n2) {
        this.af.b(20, n2);
    }

    public int t(int n2) {
        return this.af.c(17 + n2);
    }

    public void b(int n2, int n3) {
        this.af.b(17 + n2, n3);
    }

    public boolean cb() {
        return this.aR() <= this.aX() / 2.0f;
    }

    @Override
    public rq bc() {
        return rq.b;
    }

    @Override
    public void a(qr qr2) {
        this.m = null;
    }
}

