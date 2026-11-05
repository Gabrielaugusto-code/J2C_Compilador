/*
 * Decompiled with CFR 0.152.
 */
public class vk
extends vc {
    private int bq;
    uq bp;
    private int br;
    private int bs;

    public vk(afs afs2) {
        super(afs2);
        this.a(1.4f, 2.9f);
        this.m().a(true);
        this.c.a(1, new th(this, 1.0, true));
        this.c.a(2, new tl(this, 0.9, 32.0f));
        this.c.a(3, new tj(this, 0.6, true));
        this.c.a(4, new tk(this, 1.0));
        this.c.a(5, new to(this));
        this.c.a(6, new tt(this, 0.6));
        this.c.a(7, new te(this, xq.class, 6.0f));
        this.c.a(8, new ts(this));
        this.d.a(1, new ud(this));
        this.d.a(2, new ue(this, false));
        this.d.a(3, new uf(this, rn.class, 0, false, true, ws.a));
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)0);
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    protected void bo() {
        if (--this.bq <= 0) {
            this.bq = 70 + this.Z.nextInt(50);
            this.bp = this.o.A.a(oy.c(this.s), oy.c(this.t), oy.c(this.u), 32);
            if (this.bp == null) {
                this.bX();
            } else {
                r r2 = this.bp.a();
                this.a(r2.a, r2.b, r2.c, (int)((float)this.bp.b() * 0.6f));
            }
        }
        super.bo();
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(100.0);
        this.a(xa.d).a(0.25);
    }

    @Override
    protected int j(int n2) {
        return n2;
    }

    @Override
    protected void o(qr qr2) {
        if (qr2 instanceof ws && this.aH().nextInt(20) == 0) {
            this.d((rm)qr2);
        }
        super.o(qr2);
    }

    @Override
    public void e() {
        int n2;
        int n3;
        int n4;
        ahz ahz2;
        super.e();
        if (this.br > 0) {
            --this.br;
        }
        if (this.bs > 0) {
            --this.bs;
        }
        if (this.v * this.v + this.x * this.x > 2.500000277905201E-7 && this.Z.nextInt(5) == 0 && (ahz2 = this.o.a(n4 = oy.c(this.s), n3 = oy.c(this.t - (double)0.2f - (double)this.L), n2 = oy.c(this.u))).o() != avk.a) {
            this.o.a("blockcrack_" + ahz.b(ahz2) + "_" + this.o.e(n4, n3, n2), this.s + ((double)this.Z.nextFloat() - 0.5) * (double)this.M, this.C.b + 0.1, this.u + ((double)this.Z.nextFloat() - 0.5) * (double)this.M, 4.0 * ((double)this.Z.nextFloat() - 0.5), 0.5, ((double)this.Z.nextFloat() - 0.5) * 4.0);
        }
    }

    @Override
    public boolean a(Class clazz) {
        if (this.cc() && xq.class.isAssignableFrom(clazz)) {
            return false;
        }
        return super.a(clazz);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("PlayerCreated", this.cc());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.i(dg2.n("PlayerCreated"));
    }

    @Override
    public boolean n(qr qr2) {
        this.br = 10;
        this.o.a((qr)this, (byte)4);
        boolean bl2 = qr2.a(qf.a(this), (float)(7 + this.Z.nextInt(15)));
        if (bl2) {
            qr2.w += (double)0.4f;
        }
        this.a("mob.irongolem.throw", 1.0f, 1.0f);
        return bl2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 4) {
            this.br = 10;
            this.a("mob.irongolem.throw", 1.0f, 1.0f);
        } else if (by2 == 11) {
            this.bs = 400;
        } else {
            super.a(by2);
        }
    }

    public uq bZ() {
        return this.bp;
    }

    public int ca() {
        return this.br;
    }

    public void a(boolean bl2) {
        this.bs = bl2 ? 400 : 0;
        this.o.a((qr)this, (byte)11);
    }

    @Override
    protected String aS() {
        return "mob.irongolem.hit";
    }

    @Override
    protected String aT() {
        return "mob.irongolem.death";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.irongolem.walk", 1.0f, 1.0f);
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3;
        int n4 = this.Z.nextInt(3);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(abs.a(aie.O), 1, 0.0f);
        }
        n3 = 3 + this.Z.nextInt(3);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a(abv.j, 1);
        }
    }

    public int cb() {
        return this.bs;
    }

    public boolean cc() {
        return (this.af.a(16) & 1) != 0;
    }

    public void i(boolean bl2) {
        byte by2 = this.af.a(16);
        if (bl2) {
            this.af.b(16, (byte)(by2 | 1));
        } else {
            this.af.b(16, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void a(qf qf2) {
        if (!this.cc() && this.aR != null && this.bp != null) {
            this.bp.a(this.aR.b_(), -5);
        }
        super.a(qf2);
    }
}

