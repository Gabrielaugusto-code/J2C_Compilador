/*
 * Decompiled with CFR 0.152.
 */
public class ve
extends rx {
    private ub bq;

    public ve(afs afs2) {
        super(afs2);
        this.a(0.6f, 0.8f);
        this.m().a(true);
        this.c.a(1, new sw(this));
        this.c.a(2, this.bp);
        this.bq = new ub(this, 0.6, abv.aP, true);
        this.c.a(3, this.bq);
        this.c.a(4, new sn(this, xq.class, 16.0f, 0.8, 1.33));
        this.c.a(5, new sx(this, 1.0, 10.0f, 5.0f));
        this.c.a(6, new tn(this, 1.33));
        this.c.a(7, new td(this, 0.3f));
        this.c.a(8, new tm(this));
        this.c.a(9, new sr(this, 0.8));
        this.c.a(10, new tt(this, 0.8));
        this.c.a(11, new te(this, xq.class, 10.0f));
        this.d.a(1, new ui(this, ux.class, 750, false));
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(18, (Object)0);
    }

    @Override
    public void bo() {
        if (this.k().a()) {
            double d2 = this.k().b();
            if (d2 == 0.6) {
                this.b(true);
                this.c(false);
            } else if (d2 == 1.33) {
                this.b(false);
                this.c(true);
            } else {
                this.b(false);
                this.c(false);
            }
        } else {
            this.b(false);
            this.c(false);
        }
    }

    @Override
    protected boolean v() {
        return !this.bZ() && this.aa > 2400;
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(10.0);
        this.a(xa.d).a(0.3f);
    }

    @Override
    protected void b(float f2) {
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("CatType", this.cg());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.s(dg2.f("CatType"));
    }

    @Override
    protected String t() {
        if (this.bZ()) {
            if (this.ce()) {
                return "mob.cat.purr";
            }
            if (this.Z.nextInt(4) == 0) {
                return "mob.cat.purreow";
            }
            return "mob.cat.meow";
        }
        return "";
    }

    @Override
    protected String aS() {
        return "mob.cat.hitt";
    }

    @Override
    protected String aT() {
        return "mob.cat.hitt";
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
    public boolean n(qr qr2) {
        return qr2.a(qf.a(this), 3.0f);
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        this.bp.a(false);
        return super.a(qf2, f2);
    }

    @Override
    protected void b(boolean bl2, int n2) {
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (this.bZ()) {
            if (xq2.b_().equalsIgnoreCase(this.b()) && !this.o.E && !this.c(abu2)) {
                this.bp.a(!this.ca());
            }
        } else if (this.bq.f() && abu2 != null && abu2.b() == abv.aP && xq2.f(this) < 9.0) {
            if (!xq2.bE.d) {
                --abu2.b;
            }
            if (abu2.b <= 0) {
                xq2.bm.a(xq2.bm.c, null);
            }
            if (!this.o.E) {
                if (this.Z.nextInt(3) == 0) {
                    this.j(true);
                    this.s(1 + this.o.s.nextInt(3));
                    this.b(xq2.b_());
                    this.i(true);
                    this.bp.a(true);
                    this.o.a((qr)this, (byte)7);
                } else {
                    this.i(false);
                    this.o.a((qr)this, (byte)6);
                }
            }
            return true;
        }
        return super.a(xq2);
    }

    public ve b(qo qo2) {
        ve ve2 = new ve(this.o);
        if (this.bZ()) {
            ve2.b(this.b());
            ve2.j(true);
            ve2.s(this.cg());
        }
        return ve2;
    }

    @Override
    public boolean c(abu abu2) {
        return abu2 != null && abu2.b() == abv.aP;
    }

    @Override
    public boolean a(uw uw2) {
        if (uw2 == this) {
            return false;
        }
        if (!this.bZ()) {
            return false;
        }
        if (!(uw2 instanceof ve)) {
            return false;
        }
        ve ve2 = (ve)uw2;
        if (!ve2.bZ()) {
            return false;
        }
        return this.ce() && ve2.ce();
    }

    public int cg() {
        return this.af.a(18);
    }

    public void s(int n2) {
        this.af.b(18, (byte)n2);
    }

    @Override
    public boolean by() {
        if (this.o.s.nextInt(3) == 0) {
            return false;
        }
        if (this.o.b(this.C) && this.o.a((qr)this, this.C).isEmpty() && !this.o.d(this.C)) {
            int n2 = oy.c(this.s);
            int n3 = oy.c(this.C.b);
            int n4 = oy.c(this.u);
            if (n3 < 63) {
                return false;
            }
            ahz ahz2 = this.o.a(n2, n3 - 1, n4);
            if (ahz2 == aie.c || ahz2.o() == avk.j) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String b_() {
        if (this.bH()) {
            return this.bG();
        }
        if (this.bZ()) {
            return dc.a("entity.Cat.name");
        }
        return super.b_();
    }

    @Override
    public rp a(rp rp2) {
        rp2 = super.a(rp2);
        if (this.o.s.nextInt(7) == 0) {
            for (int i2 = 0; i2 < 2; ++i2) {
                ve ve2 = new ve(this.o);
                ve2.b(this.s, this.t, this.u, this.y, 0.0f);
                ve2.c(-24000);
                this.o.d(ve2);
            }
        }
        return rp2;
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.b(qo2);
    }
}

