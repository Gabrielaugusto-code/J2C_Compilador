/*
 * Decompiled with CFR 0.152.
 */
public class ux
extends uw {
    public float bp;
    public float bq;
    public float br;
    public float bs;
    public float bt = 1.0f;
    public int bu;
    public boolean bv;

    public ux(afs afs2) {
        super(afs2);
        this.a(0.3f, 0.7f);
        this.bu = this.Z.nextInt(6000) + 6000;
        this.c.a(0, new sw(this));
        this.c.a(1, new tq(this, 1.4));
        this.c.a(2, new sr(this, 1.0));
        this.c.a(3, new ub(this, 1.0, abv.N, false));
        this.c.a(4, new sy(this, 1.1));
        this.c.a(5, new tt(this, 1.0));
        this.c.a(6, new te(this, xq.class, 6.0f));
        this.c.a(7, new ts(this));
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(4.0);
        this.a(xa.d).a(0.25);
    }

    @Override
    public void e() {
        super.e();
        this.bs = this.bp;
        this.br = this.bq;
        this.bq = (float)((double)this.bq + (double)(this.D ? -1 : 4) * 0.3);
        if (this.bq < 0.0f) {
            this.bq = 0.0f;
        }
        if (this.bq > 1.0f) {
            this.bq = 1.0f;
        }
        if (!this.D && this.bt < 1.0f) {
            this.bt = 1.0f;
        }
        this.bt = (float)((double)this.bt * 0.9);
        if (!this.D && this.w < 0.0) {
            this.w *= 0.6;
        }
        this.bp += this.bt * 2.0f;
        if (!this.f() && !this.o.E && --this.bu <= 0) {
            this.a("mob.chicken.plop", 1.0f, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f);
            this.a(abv.aK, 1);
            this.bu = this.Z.nextInt(6000) + 6000;
        }
    }

    @Override
    protected void b(float f2) {
    }

    @Override
    protected String t() {
        return "mob.chicken.say";
    }

    @Override
    protected String aS() {
        return "mob.chicken.hurt";
    }

    @Override
    protected String aT() {
        return "mob.chicken.hurt";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.chicken.step", 0.15f, 1.0f);
    }

    @Override
    protected abs u() {
        return abv.G;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3 = this.Z.nextInt(3) + this.Z.nextInt(1 + n2);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a(abv.G, 1);
        }
        if (this.ak()) {
            this.a(abv.bg, 1);
        } else {
            this.a(abv.bf, 1);
        }
    }

    public ux b(qo qo2) {
        return new ux(this.o);
    }

    @Override
    public boolean c(abu abu2) {
        return abu2 != null && abu2.b() instanceof acn;
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        dg2.a("IsChickenJockey", this.bv);
    }

    @Override
    protected int e(xq xq2) {
        if (this.bZ()) {
            return 10;
        }
        return super.e(xq2);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        this.bv = dg2.n("IsChickenJockey");
    }

    @Override
    protected boolean v() {
        return this.bZ() && this.l == null;
    }

    @Override
    public void ab() {
        super.ab();
        float f2 = oy.a(this.aM * (float)Math.PI / 180.0f);
        float f3 = oy.b(this.aM * (float)Math.PI / 180.0f);
        float f4 = 0.1f;
        float f5 = 0.0f;
        this.l.b(this.s + (double)(f4 * f2), this.t + (double)(this.N * 0.5f) + this.l.ac() + (double)f5, this.u - (double)(f4 * f3));
        if (this.l instanceof rm) {
            ((rm)this.l).aM = this.aM;
        }
    }

    public boolean bZ() {
        return this.bv;
    }

    public void i(boolean bl2) {
        this.bv = bl2;
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.b(qo2);
    }
}

