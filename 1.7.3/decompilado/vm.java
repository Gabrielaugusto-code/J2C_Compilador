/*
 * Decompiled with CFR 0.152.
 */
public class vm
extends rx {
    private float bq;
    private float br;
    private boolean bs;
    private boolean bt;
    private float bu;
    private float bv;

    public vm(afs afs2) {
        super(afs2);
        this.a(0.6f, 0.8f);
        this.m().a(true);
        this.c.a(1, new sw(this));
        this.c.a(2, this.bp);
        this.c.a(3, new td(this, 0.4f));
        this.c.a(4, new th(this, 1.0, true));
        this.c.a(5, new sx(this, 1.0, 10.0f, 2.0f));
        this.c.a(6, new sr(this, 1.0));
        this.c.a(7, new tt(this, 1.0));
        this.c.a(8, new sp(this, 8.0f));
        this.c.a(9, new te(this, xq.class, 8.0f));
        this.c.a(9, new ts(this));
        this.d.a(1, new uj(this));
        this.d.a(2, new uk(this));
        this.d.a(3, new ue(this, true));
        this.d.a(4, new ui(this, vg.class, 200, false));
        this.j(false);
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.d).a(0.3f);
        if (this.bZ()) {
            this.a(xa.a).a(20.0);
        } else {
            this.a(xa.a).a(8.0);
        }
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    public void d(rm rm2) {
        super.d(rm2);
        if (rm2 == null) {
            this.l(false);
        } else if (!this.bZ()) {
            this.l(true);
        }
    }

    @Override
    protected void bo() {
        this.af.b(18, Float.valueOf(this.aR()));
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(18, new Float(this.aR()));
        this.af.a(19, new Byte(0));
        this.af.a(20, new Byte((byte)air.b(1)));
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.wolf.step", 0.15f, 1.0f);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Angry", this.ci());
        dg2.a("CollarColor", (byte)this.cj());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.l(dg2.n("Angry"));
        if (dg2.b("CollarColor", 99)) {
            this.s(dg2.d("CollarColor"));
        }
    }

    @Override
    protected String t() {
        if (this.ci()) {
            return "mob.wolf.growl";
        }
        if (this.Z.nextInt(3) == 0) {
            if (this.bZ() && this.af.d(18) < 10.0f) {
                return "mob.wolf.whine";
            }
            return "mob.wolf.panting";
        }
        return "mob.wolf.bark";
    }

    @Override
    protected String aS() {
        return "mob.wolf.hurt";
    }

    @Override
    protected String aT() {
        return "mob.wolf.death";
    }

    @Override
    protected float be() {
        return 0.4f;
    }

    @Override
    protected abs u() {
        return abs.d(-1);
    }

    @Override
    public void e() {
        super.e();
        if (!this.o.E && this.bs && !this.bt && !this.bS() && this.D) {
            this.bt = true;
            this.bu = 0.0f;
            this.bv = 0.0f;
            this.o.a((qr)this, (byte)8);
        }
    }

    @Override
    public void h() {
        super.h();
        this.br = this.bq;
        this.bq = this.ck() ? (this.bq += (1.0f - this.bq) * 0.4f) : (this.bq += (0.0f - this.bq) * 0.4f);
        if (this.ck()) {
            this.g = 10;
        }
        if (this.K()) {
            this.bs = true;
            this.bt = false;
            this.bu = 0.0f;
            this.bv = 0.0f;
        } else if ((this.bs || this.bt) && this.bt) {
            if (this.bu == 0.0f) {
                this.a("mob.wolf.shake", this.be(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f);
            }
            this.bv = this.bu;
            this.bu += 0.05f;
            if (this.bv >= 2.0f) {
                this.bs = false;
                this.bt = false;
                this.bv = 0.0f;
                this.bu = 0.0f;
            }
            if (this.bu > 0.4f) {
                float f2 = (float)this.C.b;
                int n2 = (int)(oy.a((this.bu - 0.4f) * (float)Math.PI) * 7.0f);
                for (int i2 = 0; i2 < n2; ++i2) {
                    float f3 = (this.Z.nextFloat() * 2.0f - 1.0f) * this.M * 0.5f;
                    float f4 = (this.Z.nextFloat() * 2.0f - 1.0f) * this.M * 0.5f;
                    this.o.a("splash", this.s + (double)f3, (double)(f2 + 0.8f), this.u + (double)f4, this.v, this.w, this.x);
                }
            }
        }
    }

    public boolean cg() {
        return this.bs;
    }

    public float p(float f2) {
        return 0.75f + (this.bv + (this.bu - this.bv) * f2) / 2.0f * 0.25f;
    }

    public float g(float f2, float f3) {
        float f4 = (this.bv + (this.bu - this.bv) * f2 + f3) / 1.8f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        return oy.a(f4 * (float)Math.PI) * oy.a(f4 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    public float q(float f2) {
        return (this.br + (this.bq - this.br) * f2) * 0.15f * (float)Math.PI;
    }

    @Override
    public float g() {
        return this.N * 0.8f;
    }

    @Override
    public int bv() {
        if (this.ca()) {
            return 20;
        }
        return super.bv();
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        qr qr2 = qf2.j();
        this.bp.a(false);
        if (qr2 != null && !(qr2 instanceof xq) && !(qr2 instanceof xt)) {
            f2 = (f2 + 1.0f) / 2.0f;
        }
        return super.a(qf2, f2);
    }

    @Override
    public boolean n(qr qr2) {
        int n2 = this.bZ() ? 4 : 2;
        return qr2.a(qf.a(this), (float)n2);
    }

    @Override
    public void j(boolean bl2) {
        super.j(bl2);
        if (bl2) {
            this.a(xa.a).a(20.0);
        } else {
            this.a(xa.a).a(8.0);
        }
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (this.bZ()) {
            if (abu2 != null) {
                int n2;
                if (abu2.b() instanceof abo) {
                    abo abo2 = (abo)abu2.b();
                    if (abo2.i() && this.af.d(18) < 20.0f) {
                        if (!xq2.bE.d) {
                            --abu2.b;
                        }
                        this.f((float)abo2.g(abu2));
                        if (abu2.b <= 0) {
                            xq2.bm.a(xq2.bm.c, null);
                        }
                        return true;
                    }
                } else if (abu2.b() == abv.aR && (n2 = air.b(abu2.k())) != this.cj()) {
                    this.s(n2);
                    if (!xq2.bE.d && --abu2.b <= 0) {
                        xq2.bm.a(xq2.bm.c, null);
                    }
                    return true;
                }
            }
            if (xq2.b_().equalsIgnoreCase(this.b()) && !this.o.E && !this.c(abu2)) {
                this.bp.a(!this.ca());
                this.bc = false;
                this.a((aww)null);
                this.b((qr)null);
                this.d((rm)null);
            }
        } else if (abu2 != null && abu2.b() == abv.aS && !this.ci()) {
            if (!xq2.bE.d) {
                --abu2.b;
            }
            if (abu2.b <= 0) {
                xq2.bm.a(xq2.bm.c, null);
            }
            if (!this.o.E) {
                if (this.Z.nextInt(3) == 0) {
                    this.j(true);
                    this.a((aww)null);
                    this.d((rm)null);
                    this.bp.a(true);
                    this.g(20.0f);
                    this.b(xq2.b_());
                    this.i(true);
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

    @Override
    public void a(byte by2) {
        if (by2 == 8) {
            this.bt = true;
            this.bu = 0.0f;
            this.bv = 0.0f;
        } else {
            super.a(by2);
        }
    }

    public float ch() {
        if (this.ci()) {
            return 1.5393804f;
        }
        if (this.bZ()) {
            return (0.55f - (20.0f - this.af.d(18)) * 0.02f) * (float)Math.PI;
        }
        return 0.62831855f;
    }

    @Override
    public boolean c(abu abu2) {
        if (abu2 == null) {
            return false;
        }
        if (!(abu2.b() instanceof abo)) {
            return false;
        }
        return ((abo)abu2.b()).i();
    }

    @Override
    public int bB() {
        return 8;
    }

    public boolean ci() {
        return (this.af.a(16) & 2) != 0;
    }

    public void l(boolean bl2) {
        byte by2 = this.af.a(16);
        if (bl2) {
            this.af.b(16, (byte)(by2 | 2));
        } else {
            this.af.b(16, (byte)(by2 & 0xFFFFFFFD));
        }
    }

    public int cj() {
        return this.af.a(20) & 0xF;
    }

    public void s(int n2) {
        this.af.b(20, (byte)(n2 & 0xF));
    }

    public vm b(qo qo2) {
        vm vm2 = new vm(this.o);
        String string = this.b();
        if (string != null && string.trim().length() > 0) {
            vm2.b(string);
            vm2.j(true);
        }
        return vm2;
    }

    public void m(boolean bl2) {
        if (bl2) {
            this.af.b(19, (byte)1);
        } else {
            this.af.b(19, (byte)0);
        }
    }

    @Override
    public boolean a(uw uw2) {
        if (uw2 == this) {
            return false;
        }
        if (!this.bZ()) {
            return false;
        }
        if (!(uw2 instanceof vm)) {
            return false;
        }
        vm vm2 = (vm)uw2;
        if (!vm2.bZ()) {
            return false;
        }
        if (vm2.ca()) {
            return false;
        }
        return this.ce() && vm2.ce();
    }

    public boolean ck() {
        return this.af.a(19) == 1;
    }

    @Override
    protected boolean v() {
        return !this.bZ() && this.aa > 2400;
    }

    @Override
    public boolean a(rm rm2, rm rm3) {
        vm vm2;
        if (rm2 instanceof wq || rm2 instanceof wu) {
            return false;
        }
        if (rm2 instanceof vm && (vm2 = (vm)rm2).bZ() && vm2.cb() == rm3) {
            return false;
        }
        if (rm2 instanceof xq && rm3 instanceof xq && !((xq)rm3).a((xq)rm2)) {
            return false;
        }
        return !(rm2 instanceof uz) || !((uz)rm2).cc();
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.b(qo2);
    }
}

