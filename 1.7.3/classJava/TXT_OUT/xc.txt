/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

public class xc
extends wx
implements wz {
    private tu bp = new tu(this, 1.0, 20, 60, 15.0f);
    private th bq = new th(this, xq.class, 1.2, false);

    public xc(afs afs2) {
        super(afs2);
        this.c.a(1, new sw(this));
        this.c.a(2, new tw(this));
        this.c.a(3, new sv(this, 1.0));
        this.c.a(5, new tt(this, 1.0));
        this.c.a(6, new te(this, xq.class, 8.0f));
        this.c.a(6, new ts(this));
        this.d.a(1, new ue(this, false));
        this.d.a(2, new uf(this, xq.class, 0, true));
        if (afs2 != null && !afs2.E) {
            this.bZ();
        }
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.d).a(0.25);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(13, new Byte(0));
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    protected String t() {
        return "mob.skeleton.say";
    }

    @Override
    protected String aS() {
        return "mob.skeleton.hurt";
    }

    @Override
    protected String aT() {
        return "mob.skeleton.death";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.skeleton.step", 0.15f, 1.0f);
    }

    @Override
    public boolean n(qr qr2) {
        if (super.n(qr2)) {
            if (this.cb() == 1 && qr2 instanceof rm) {
                ((rm)qr2).c(new qn(qm.v.H, 200));
            }
            return true;
        }
        return false;
    }

    @Override
    public rq bc() {
        return rq.b;
    }

    @Override
    public void e() {
        float f2;
        if (this.o.w() && !this.o.E && (f2 = this.d(1.0f)) > 0.5f && this.Z.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f && this.o.i(oy.c(this.s), oy.c(this.t), oy.c(this.u))) {
            boolean bl2 = true;
            abu abu2 = this.q(4);
            if (abu2 != null) {
                if (abu2.g()) {
                    abu2.b(abu2.j() + this.Z.nextInt(2));
                    if (abu2.j() >= abu2.l()) {
                        this.a(abu2);
                        this.c(4, null);
                    }
                }
                bl2 = false;
            }
            if (bl2) {
                this.e(8);
            }
        }
        if (this.o.E && this.cb() == 1) {
            this.a(0.72f, 2.34f);
        }
        super.e();
    }

    @Override
    public void aa() {
        super.aa();
        if (this.m instanceof ru) {
            ru ru2 = (ru)this.m;
            this.aM = ru2.aM;
        }
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        if (qf2.i() instanceof xt && qf2.j() instanceof xq) {
            xq xq2 = (xq)qf2.j();
            double d2 = xq2.s - this.s;
            double d3 = xq2.u - this.u;
            if (d2 * d2 + d3 * d3 >= 2500.0) {
                xq2.a(nt.v);
            }
        }
    }

    @Override
    protected abs u() {
        return abv.g;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3;
        int n4;
        if (this.cb() == 1) {
            n4 = this.Z.nextInt(3 + n2) - 1;
            for (n3 = 0; n3 < n4; ++n3) {
                this.a(abv.h, 1);
            }
        } else {
            n4 = this.Z.nextInt(3 + n2);
            for (n3 = 0; n3 < n4; ++n3) {
                this.a(abv.g, 1);
            }
        }
        n4 = this.Z.nextInt(3 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(abv.aS, 1);
        }
    }

    @Override
    protected void n(int n2) {
        if (this.cb() == 1) {
            this.a(new abu(abv.bL, 1, 1), 0.0f);
        }
    }

    @Override
    protected void bC() {
        super.bC();
        this.c(0, new abu(abv.f));
    }

    @Override
    public rp a(rp rp2) {
        Calendar calendar;
        rp2 = super.a(rp2);
        if (this.o.t instanceof apg && this.aH().nextInt(5) > 0) {
            this.c.a(4, this.bq);
            this.a(1);
            this.c(0, new abu(abv.q));
            this.a(xa.e).a(4.0);
        } else {
            this.c.a(4, this.bp);
            this.bC();
            this.bD();
        }
        this.h(this.Z.nextFloat() < 0.55f * this.o.b(this.s, this.t, this.u));
        if (this.q(4) == null && (calendar = this.o.W()).get(2) + 1 == 10 && calendar.get(5) == 31 && this.Z.nextFloat() < 0.25f) {
            this.c(4, new abu(this.Z.nextFloat() < 0.1f ? aie.aP : aie.aK));
            this.e[4] = 0.0f;
        }
        return rp2;
    }

    public void bZ() {
        this.c.a(this.bq);
        this.c.a(this.bp);
        abu abu2 = this.bd();
        if (abu2 != null && abu2.b() == abv.f) {
            this.c.a(4, this.bp);
        } else {
            this.c.a(4, this.bq);
        }
    }

    @Override
    public void a(rm rm2, float f2) {
        xt xt2 = new xt(this.o, this, rm2, 1.6f, 14 - this.o.r.a() * 4);
        int n2 = aem.a(aek.v.B, this.bd());
        int n3 = aem.a(aek.w.B, this.bd());
        xt2.b((double)(f2 * 2.0f) + (this.Z.nextGaussian() * 0.25 + (double)((float)this.o.r.a() * 0.11f)));
        if (n2 > 0) {
            xt2.b(xt2.e() + (double)n2 * 0.5 + 0.5);
        }
        if (n3 > 0) {
            xt2.a(n3);
        }
        if (aem.a(aek.x.B, this.bd()) > 0 || this.cb() == 1) {
            xt2.e(100);
        }
        this.a("random.bow", 1.0f, 1.0f / (this.aH().nextFloat() * 0.4f + 0.8f));
        this.o.d(xt2);
    }

    public int cb() {
        return this.af.a(13);
    }

    public void a(int n2) {
        this.af.b(13, (byte)n2);
        boolean bl2 = this.ae = n2 == 1;
        if (n2 == 1) {
            this.a(0.72f, 2.34f);
        } else {
            this.a(0.6f, 1.8f);
        }
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        if (dg2.b("SkeletonType", 99)) {
            byte by2 = dg2.d("SkeletonType");
            this.a((int)by2);
        }
        this.bZ();
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("SkeletonType", (byte)this.cb());
    }

    @Override
    public void c(int n2, abu abu2) {
        super.c(n2, abu2);
        if (!this.o.E && n2 == 0) {
            this.bZ();
        }
    }

    @Override
    public double ac() {
        return super.ac() - 0.5;
    }
}

