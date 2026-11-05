/*
 * Decompiled with CFR 0.152.
 */
public class uy
extends uw {
    public uy(afs afs2) {
        super(afs2);
        this.a(0.9f, 1.3f);
        this.m().a(true);
        this.c.a(0, new sw(this));
        this.c.a(1, new tq(this, 2.0));
        this.c.a(2, new sr(this, 1.0));
        this.c.a(3, new ub(this, 1.25, abv.O, false));
        this.c.a(4, new sy(this, 1.25));
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
        this.a(xa.a).a(10.0);
        this.a(xa.d).a(0.2f);
    }

    @Override
    protected String t() {
        return "mob.cow.say";
    }

    @Override
    protected String aS() {
        return "mob.cow.hurt";
    }

    @Override
    protected String aT() {
        return "mob.cow.hurt";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.cow.step", 0.15f, 1.0f);
    }

    @Override
    protected float be() {
        return 0.4f;
    }

    @Override
    protected abs u() {
        return abv.aA;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3;
        int n4 = this.Z.nextInt(3) + this.Z.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(abv.aA, 1);
        }
        n4 = this.Z.nextInt(3) + 1 + this.Z.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            if (this.ak()) {
                this.a(abv.be, 1);
                continue;
            }
            this.a(abv.bd, 1);
        }
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.ar && !xq2.bE.d) {
            if (abu2.b-- == 1) {
                xq2.bm.a(xq2.bm.c, new abu(abv.aB));
            } else if (!xq2.bm.a(new abu(abv.aB))) {
                xq2.a(new abu(abv.aB, 1, 0), false);
            }
            return true;
        }
        return super.a(xq2);
    }

    public uy b(qo qo2) {
        return new uy(this.o);
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.b(qo2);
    }
}

