/*
 * Decompiled with CFR 0.152.
 */
public class vf
extends uw {
    private final ss bp;

    public vf(afs afs2) {
        super(afs2);
        this.a(0.9f, 0.9f);
        this.m().a(true);
        this.c.a(0, new sw(this));
        this.c.a(1, new tq(this, 1.25));
        this.bp = new ss(this, 0.3f);
        this.c.a(2, this.bp);
        this.c.a(3, new sr(this, 1.0));
        this.c.a(4, new ub(this, 1.2, abv.bM, false));
        this.c.a(4, new ub(this, 1.2, abv.bF, false));
        this.c.a(5, new sy(this, 1.1));
        this.c.a(6, new tt(this, 1.0));
        this.c.a(7, new te(this, xq.class, 6.0f));
        this.c.a(8, new ts(this));
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(10.0);
        this.a(xa.d).a(0.25);
    }

    @Override
    protected void bm() {
        super.bm();
    }

    @Override
    public boolean bE() {
        abu abu2 = ((xq)this.l).bd();
        return abu2 != null && abu2.b() == abv.bM;
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)0);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Saddle", this.bZ());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.i(dg2.n("Saddle"));
    }

    @Override
    protected String t() {
        return "mob.pig.say";
    }

    @Override
    protected String aS() {
        return "mob.pig.say";
    }

    @Override
    protected String aT() {
        return "mob.pig.death";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.pig.step", 0.15f, 1.0f);
    }

    @Override
    public boolean a(xq xq2) {
        if (!super.a(xq2)) {
            if (this.bZ() && !this.o.E && (this.l == null || this.l == xq2)) {
                xq2.a((qr)this);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    protected abs u() {
        if (this.ak()) {
            return abv.am;
        }
        return abv.al;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3 = this.Z.nextInt(3) + 1 + this.Z.nextInt(1 + n2);
        for (int i2 = 0; i2 < n3; ++i2) {
            if (this.ak()) {
                this.a(abv.am, 1);
                continue;
            }
            this.a(abv.al, 1);
        }
        if (this.bZ()) {
            this.a(abv.av, 1);
        }
    }

    public boolean bZ() {
        return (this.af.a(16) & 1) != 0;
    }

    public void i(boolean bl2) {
        if (bl2) {
            this.af.b(16, (byte)1);
        } else {
            this.af.b(16, (byte)0);
        }
    }

    @Override
    public void a(vy vy2) {
        if (this.o.E) {
            return;
        }
        wy wy2 = new wy(this.o);
        wy2.c(0, new abu(abv.B));
        wy2.b(this.s, this.t, this.u, this.y, this.z);
        this.o.d(wy2);
        this.A();
    }

    @Override
    protected void b(float f2) {
        super.b(f2);
        if (f2 > 5.0f && this.l instanceof xq) {
            ((xq)this.l).a(nt.u);
        }
    }

    public vf b(qo qo2) {
        return new vf(this.o);
    }

    @Override
    public boolean c(abu abu2) {
        return abu2 != null && abu2.b() == abv.bF;
    }

    public ss ca() {
        return this.bp;
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.b(qo2);
    }
}

