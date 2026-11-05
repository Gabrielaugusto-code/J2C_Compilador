/*
 * Decompiled with CFR 0.152.
 */
public class wu
extends ri
implements ws {
    public int h;
    public double i;
    public double bm;
    public double bn;
    private qr bq;
    private int br;
    public int bo;
    public int bp;
    private int bs = 1;

    public wu(afs afs2) {
        super(afs2);
        this.a(4.0f, 4.0f);
        this.ae = true;
        this.b = 5;
    }

    public boolean bP() {
        return this.af.a(16) != 0;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        if ("fireball".equals(qf2.p()) && qf2.j() instanceof xq) {
            super.a(qf2, 1000.0f);
            ((xq)qf2.j()).a(nt.z);
            return true;
        }
        return super.a(qf2, f2);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)0);
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(10.0);
    }

    @Override
    protected void bp() {
        byte by2;
        byte by3;
        if (!this.o.E && this.o.r == pu.a) {
            this.A();
        }
        this.w();
        this.bo = this.bp;
        double d2 = this.i - this.s;
        double d3 = this.bm - this.t;
        double d4 = this.bn - this.u;
        double d5 = d2 * d2 + d3 * d3 + d4 * d4;
        if (d5 < 1.0 || d5 > 3600.0) {
            this.i = this.s + (double)((this.Z.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.bm = this.t + (double)((this.Z.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.bn = this.u + (double)((this.Z.nextFloat() * 2.0f - 1.0f) * 16.0f);
        }
        if (this.h-- <= 0) {
            this.h += this.Z.nextInt(5) + 2;
            if (this.a(this.i, this.bm, this.bn, d5 = (double)oy.a(d5))) {
                this.v += d2 / d5 * 0.1;
                this.w += d3 / d5 * 0.1;
                this.x += d4 / d5 * 0.1;
            } else {
                this.i = this.s;
                this.bm = this.t;
                this.bn = this.u;
            }
        }
        if (this.bq != null && this.bq.K) {
            this.bq = null;
        }
        if (this.bq == null || this.br-- <= 0) {
            this.bq = this.o.b((qr)this, 100.0);
            if (this.bq != null) {
                this.br = 20;
            }
        }
        double d6 = 64.0;
        if (this.bq != null && this.bq.f(this) < d6 * d6) {
            double d7 = this.bq.s - this.s;
            double d8 = this.bq.C.b + (double)(this.bq.N / 2.0f) - (this.t + (double)(this.N / 2.0f));
            double d9 = this.bq.u - this.u;
            this.aM = this.y = -((float)Math.atan2(d7, d9)) * 180.0f / (float)Math.PI;
            if (this.p(this.bq)) {
                if (this.bp == 10) {
                    this.o.a(null, 1007, (int)this.s, (int)this.t, (int)this.u, 0);
                }
                ++this.bp;
                if (this.bp == 20) {
                    this.o.a(null, 1008, (int)this.s, (int)this.t, (int)this.u, 0);
                    xx xx2 = new xx(this.o, this, d7, d8, d9);
                    xx2.e = this.bs;
                    double d10 = 4.0;
                    ayp ayp2 = this.j(1.0f);
                    xx2.s = this.s + ayp2.c * d10;
                    xx2.t = this.t + (double)(this.N / 2.0f) + 0.5;
                    xx2.u = this.u + ayp2.e * d10;
                    this.o.d(xx2);
                    this.bp = -40;
                }
            } else if (this.bp > 0) {
                --this.bp;
            }
        } else {
            this.aM = this.y = -((float)Math.atan2(this.v, this.x)) * 180.0f / (float)Math.PI;
            if (this.bp > 0) {
                --this.bp;
            }
        }
        if (!this.o.E && (by3 = this.af.a(16)) != (by2 = (byte)(this.bp > 10 ? 1 : 0))) {
            this.af.b(16, by2);
        }
    }

    private boolean a(double d2, double d3, double d4, double d5) {
        double d6 = (this.i - this.s) / d5;
        double d7 = (this.bm - this.t) / d5;
        double d8 = (this.bn - this.u) / d5;
        ayk ayk2 = this.C.c();
        int n2 = 1;
        while ((double)n2 < d5) {
            ayk2.d(d6, d7, d8);
            if (!this.o.a((qr)this, ayk2).isEmpty()) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    @Override
    protected String t() {
        return "mob.ghast.moan";
    }

    @Override
    protected String aS() {
        return "mob.ghast.scream";
    }

    @Override
    protected String aT() {
        return "mob.ghast.death";
    }

    @Override
    protected abs u() {
        return abv.H;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3;
        int n4 = this.Z.nextInt(2) + this.Z.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(abv.bk, 1);
        }
        n4 = this.Z.nextInt(3) + this.Z.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(abv.H, 1);
        }
    }

    @Override
    protected float be() {
        return 10.0f;
    }

    @Override
    public boolean by() {
        return this.Z.nextInt(20) == 0 && super.by() && this.o.r != pu.a;
    }

    @Override
    public int bB() {
        return 1;
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("ExplosionPower", this.bs);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        if (dg2.b("ExplosionPower", 99)) {
            this.bs = dg2.f("ExplosionPower");
        }
    }
}

