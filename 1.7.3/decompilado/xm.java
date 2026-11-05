/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class xm
extends qo
implements afd,
xl {
    private int bq;
    private boolean br;
    private boolean bs;
    uq bp;
    private xq bt;
    private aff bu;
    private int bv;
    private boolean bw;
    private int bx;
    private String by;
    private boolean bz;
    private float bA;
    private static final Map bB = new HashMap();
    private static final Map bC = new HashMap();

    public xm(afs afs2) {
        this(afs2, 0);
    }

    public xm(afs afs2, int n2) {
        super(afs2);
        this.s(n2);
        this.a(0.6f, 1.8f);
        this.m().b(true);
        this.m().a(true);
        this.c.a(0, new sw(this));
        this.c.a(1, new sn(this, xh.class, 8.0f, 0.6, 0.6));
        this.c.a(1, new uc(this));
        this.c.a(1, new tf(this));
        this.c.a(2, new ti(this));
        this.c.a(3, new tv(this));
        this.c.a(4, new tp(this, true));
        this.c.a(5, new tk(this, 0.6));
        this.c.a(6, new tg(this));
        this.c.a(7, new ua(this));
        this.c.a(8, new tr(this, 0.32));
        this.c.a(9, new tc(this, xq.class, 3.0f, 1.0f));
        this.c.a(9, new tc(this, xm.class, 5.0f, 0.02f));
        this.c.a(9, new tt(this, 0.6));
        this.c.a(10, new te(this, rn.class, 8.0f));
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.d).a(0.5);
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    protected void bo() {
        if (--this.bq <= 0) {
            this.o.A.a(oy.c(this.s), oy.c(this.t), oy.c(this.u));
            this.bq = 70 + this.Z.nextInt(50);
            this.bp = this.o.A.a(oy.c(this.s), oy.c(this.t), oy.c(this.u), 32);
            if (this.bp == null) {
                this.bX();
            } else {
                r r2 = this.bp.a();
                this.a(r2.a, r2.b, r2.c, (int)((float)this.bp.b() * 0.6f));
                if (this.bz) {
                    this.bz = false;
                    this.bp.b(5);
                }
            }
        }
        if (!this.cc() && this.bv > 0) {
            --this.bv;
            if (this.bv <= 0) {
                if (this.bw) {
                    if (this.bu.size() > 1) {
                        for (afe afe2 : this.bu) {
                            if (!afe2.g()) continue;
                            afe2.a(this.Z.nextInt(6) + this.Z.nextInt(6) + 2);
                        }
                    }
                    this.t(1);
                    this.bw = false;
                    if (this.bp != null && this.by != null) {
                        this.o.a((qr)this, (byte)14);
                        this.bp.a(this.by, 1);
                    }
                }
                this.c(new qn(qm.l.H, 200, 0));
            }
        }
        super.bo();
    }

    @Override
    public boolean a(xq xq2) {
        boolean bl2;
        abu abu2 = xq2.bm.h();
        boolean bl3 = bl2 = abu2 != null && abu2.b() == abv.bx;
        if (!bl2 && this.Y() && !this.cc() && !this.f()) {
            if (!this.o.E) {
                this.a_(xq2);
                xq2.a(this, this.bG());
            }
            return true;
        }
        return super.a(xq2);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)0);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Profession", this.bZ());
        dg2.a("Riches", this.bx);
        if (this.bu != null) {
            dg2.a("Offers", this.bu.a());
        }
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.s(dg2.f("Profession"));
        this.bx = dg2.f("Riches");
        if (dg2.b("Offers", 10)) {
            dg dg3 = dg2.m("Offers");
            this.bu = new aff(dg3);
        }
    }

    @Override
    protected boolean v() {
        return false;
    }

    @Override
    protected String t() {
        if (this.cc()) {
            return "mob.villager.haggle";
        }
        return "mob.villager.idle";
    }

    @Override
    protected String aS() {
        return "mob.villager.hit";
    }

    @Override
    protected String aT() {
        return "mob.villager.death";
    }

    public void s(int n2) {
        this.af.b(16, n2);
    }

    public int bZ() {
        return this.af.c(16);
    }

    public boolean ca() {
        return this.br;
    }

    public void i(boolean bl2) {
        this.br = bl2;
    }

    public void j(boolean bl2) {
        this.bs = bl2;
    }

    public boolean cb() {
        return this.bs;
    }

    @Override
    public void b(rm rm2) {
        super.b(rm2);
        if (this.bp != null && rm2 != null) {
            this.bp.a(rm2);
            if (rm2 instanceof xq) {
                int n2 = -1;
                if (this.f()) {
                    n2 = -3;
                }
                this.bp.a(rm2.b_(), n2);
                if (this.Y()) {
                    this.o.a((qr)this, (byte)13);
                }
            }
        }
    }

    @Override
    public void a(qf qf2) {
        if (this.bp != null) {
            xq xq2;
            qr qr2 = qf2.j();
            if (qr2 != null) {
                if (qr2 instanceof xq) {
                    this.bp.a(qr2.b_(), -2);
                } else if (qr2 instanceof ws) {
                    this.bp.h();
                }
            } else if (qr2 == null && (xq2 = this.o.a((qr)this, 16.0)) != null) {
                this.bp.h();
            }
        }
        super.a(qf2);
    }

    @Override
    public void a_(xq xq2) {
        this.bt = xq2;
    }

    @Override
    public xq b() {
        return this.bt;
    }

    public boolean cc() {
        return this.bt != null;
    }

    @Override
    public void a(afe afe2) {
        afe2.f();
        this.a_ = -this.q();
        this.a("mob.villager.yes", this.be(), this.bf());
        if (afe2.a((afe)this.bu.get(this.bu.size() - 1))) {
            this.bv = 40;
            this.bw = true;
            this.by = this.bt != null ? this.bt.b_() : null;
        }
        if (afe2.a().b() == abv.bC) {
            this.bx += afe2.a().b;
        }
    }

    @Override
    public void a_(abu abu2) {
        if (!this.o.E && this.a_ > -this.q() + 20) {
            this.a_ = -this.q();
            if (abu2 != null) {
                this.a("mob.villager.yes", this.be(), this.bf());
            } else {
                this.a("mob.villager.no", this.be(), this.bf());
            }
        }
    }

    @Override
    public aff b(xq xq2) {
        if (this.bu == null) {
            this.t(1);
        }
        return this.bu;
    }

    private float p(float f2) {
        float f3 = f2 + this.bA;
        if (f3 > 0.9f) {
            return 0.9f - (f3 - 0.9f);
        }
        return f3;
    }

    private void t(int n2) {
        this.bA = this.bu != null ? oy.c((float)this.bu.size()) * 0.2f : 0.0f;
        aff aff2 = new aff();
        switch (this.bZ()) {
            case 0: {
                xm.a(aff2, abv.O, this.Z, this.p(0.9f));
                xm.a(aff2, abs.a(aie.L), this.Z, this.p(0.5f));
                xm.a(aff2, abv.bf, this.Z, this.p(0.5f));
                xm.a(aff2, abv.aQ, this.Z, this.p(0.4f));
                xm.b(aff2, abv.P, this.Z, this.p(0.9f));
                xm.b(aff2, abv.ba, this.Z, this.p(0.3f));
                xm.b(aff2, abv.e, this.Z, this.p(0.3f));
                xm.b(aff2, abv.aX, this.Z, this.p(0.3f));
                xm.b(aff2, abv.aZ, this.Z, this.p(0.3f));
                xm.b(aff2, abv.d, this.Z, this.p(0.3f));
                xm.b(aff2, abv.bg, this.Z, this.p(0.3f));
                xm.b(aff2, abv.g, this.Z, this.p(0.5f));
                if (!(this.Z.nextFloat() < this.p(0.5f))) break;
                aff2.add(new afe(new abu(aie.n, 10), new abu(abv.bC), new abu(abv.ak, 4 + this.Z.nextInt(2), 0)));
                break;
            }
            case 4: {
                xm.a(aff2, abv.h, this.Z, this.p(0.7f));
                xm.a(aff2, abv.al, this.Z, this.p(0.5f));
                xm.a(aff2, abv.bd, this.Z, this.p(0.5f));
                xm.b(aff2, abv.av, this.Z, this.p(0.1f));
                xm.b(aff2, abv.R, this.Z, this.p(0.3f));
                xm.b(aff2, abv.T, this.Z, this.p(0.3f));
                xm.b(aff2, abv.Q, this.Z, this.p(0.3f));
                xm.b(aff2, abv.S, this.Z, this.p(0.3f));
                xm.b(aff2, abv.am, this.Z, this.p(0.3f));
                xm.b(aff2, abv.be, this.Z, this.p(0.3f));
                break;
            }
            case 3: {
                xm.a(aff2, abv.h, this.Z, this.p(0.7f));
                xm.a(aff2, abv.j, this.Z, this.p(0.5f));
                xm.a(aff2, abv.k, this.Z, this.p(0.5f));
                xm.a(aff2, abv.i, this.Z, this.p(0.5f));
                xm.b(aff2, abv.l, this.Z, this.p(0.5f));
                xm.b(aff2, abv.u, this.Z, this.p(0.5f));
                xm.b(aff2, abv.c, this.Z, this.p(0.3f));
                xm.b(aff2, abv.x, this.Z, this.p(0.3f));
                xm.b(aff2, abv.b, this.Z, this.p(0.5f));
                xm.b(aff2, abv.w, this.Z, this.p(0.5f));
                xm.b(aff2, abv.a, this.Z, this.p(0.2f));
                xm.b(aff2, abv.v, this.Z, this.p(0.2f));
                xm.b(aff2, abv.K, this.Z, this.p(0.2f));
                xm.b(aff2, abv.L, this.Z, this.p(0.2f));
                xm.b(aff2, abv.ab, this.Z, this.p(0.2f));
                xm.b(aff2, abv.af, this.Z, this.p(0.2f));
                xm.b(aff2, abv.Y, this.Z, this.p(0.2f));
                xm.b(aff2, abv.ac, this.Z, this.p(0.2f));
                xm.b(aff2, abv.Z, this.Z, this.p(0.2f));
                xm.b(aff2, abv.ad, this.Z, this.p(0.2f));
                xm.b(aff2, abv.aa, this.Z, this.p(0.2f));
                xm.b(aff2, abv.ae, this.Z, this.p(0.2f));
                xm.b(aff2, abv.X, this.Z, this.p(0.1f));
                xm.b(aff2, abv.U, this.Z, this.p(0.1f));
                xm.b(aff2, abv.V, this.Z, this.p(0.1f));
                xm.b(aff2, abv.W, this.Z, this.p(0.1f));
                break;
            }
            case 1: {
                xm.a(aff2, abv.aF, this.Z, this.p(0.8f));
                xm.a(aff2, abv.aG, this.Z, this.p(0.8f));
                xm.a(aff2, abv.bB, this.Z, this.p(0.3f));
                xm.b(aff2, abs.a(aie.X), this.Z, this.p(0.8f));
                xm.b(aff2, abs.a(aie.w), this.Z, this.p(0.2f));
                xm.b(aff2, abv.aL, this.Z, this.p(0.2f));
                xm.b(aff2, abv.aN, this.Z, this.p(0.2f));
                if (!(this.Z.nextFloat() < this.p(0.07f))) break;
                Object object = aek.c[this.Z.nextInt(aek.c.length)];
                int n3 = oy.a(this.Z, ((aek)object).d(), ((aek)object).b());
                abu abu2 = abv.bR.a(new aet((aek)object, n3));
                int n4 = 2 + this.Z.nextInt(5 + n3 * 10) + 3 * n3;
                aff2.add(new afe(new abu(abv.aG), new abu(abv.bC, n4), abu2));
                break;
            }
            case 2: {
                xm.b(aff2, abv.bv, this.Z, this.p(0.3f));
                xm.b(aff2, abv.by, this.Z, this.p(0.2f));
                xm.b(aff2, abv.ax, this.Z, this.p(0.4f));
                xm.b(aff2, abs.a(aie.aN), this.Z, this.p(0.3f));
                Object object = new abs[]{abv.l, abv.u, abv.Z, abv.ad, abv.c, abv.x, abv.b, abv.w};
                for (abs abs2 : object) {
                    if (!(this.Z.nextFloat() < this.p(0.05f))) continue;
                    aff2.add(new afe(new abu(abs2, 1, 0), new abu(abv.bC, 2 + this.Z.nextInt(3), 0), aem.a(this.Z, new abu(abs2, 1, 0), 5 + this.Z.nextInt(15))));
                }
                break;
            }
        }
        if (aff2.isEmpty()) {
            xm.a(aff2, abv.k, this.Z, 1.0f);
        }
        Collections.shuffle(aff2);
        if (this.bu == null) {
            this.bu = new aff();
        }
        for (int i2 = 0; i2 < n2 && i2 < aff2.size(); ++i2) {
            this.bu.a((afe)aff2.get(i2));
        }
    }

    @Override
    public void a(aff aff2) {
    }

    private static void a(aff aff2, abs abs2, Random random, float f2) {
        if (random.nextFloat() < f2) {
            aff2.add(new afe(xm.a(abs2, random), abv.bC));
        }
    }

    private static abu a(abs abs2, Random random) {
        return new abu(abs2, xm.b(abs2, random), 0);
    }

    private static int b(abs abs2, Random random) {
        pl pl2 = (pl)bB.get(abs2);
        if (pl2 == null) {
            return 1;
        }
        if ((Integer)pl2.a() >= (Integer)pl2.b()) {
            return (Integer)pl2.a();
        }
        return (Integer)pl2.a() + random.nextInt((Integer)pl2.b() - (Integer)pl2.a());
    }

    private static void b(aff aff2, abs abs2, Random random, float f2) {
        if (random.nextFloat() < f2) {
            abu abu2;
            abu abu3;
            int n2 = xm.c(abs2, random);
            if (n2 < 0) {
                abu3 = new abu(abv.bC, 1, 0);
                abu2 = new abu(abs2, -n2, 0);
            } else {
                abu3 = new abu(abv.bC, n2, 0);
                abu2 = new abu(abs2, 1, 0);
            }
            aff2.add(new afe(abu3, abu2));
        }
    }

    private static int c(abs abs2, Random random) {
        pl pl2 = (pl)bC.get(abs2);
        if (pl2 == null) {
            return 1;
        }
        if ((Integer)pl2.a() >= (Integer)pl2.b()) {
            return (Integer)pl2.a();
        }
        return (Integer)pl2.a() + random.nextInt((Integer)pl2.b() - (Integer)pl2.a());
    }

    @Override
    public void a(byte by2) {
        if (by2 == 12) {
            this.b("heart");
        } else if (by2 == 13) {
            this.b("angryVillager");
        } else if (by2 == 14) {
            this.b("happyVillager");
        } else {
            super.a(by2);
        }
    }

    private void b(String string) {
        for (int i2 = 0; i2 < 5; ++i2) {
            double d2 = this.Z.nextGaussian() * 0.02;
            double d3 = this.Z.nextGaussian() * 0.02;
            double d4 = this.Z.nextGaussian() * 0.02;
            this.o.a(string, this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + 1.0 + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, d2, d3, d4);
        }
    }

    @Override
    public rp a(rp rp2) {
        rp2 = super.a(rp2);
        this.s(this.o.s.nextInt(5));
        return rp2;
    }

    public void cd() {
        this.bz = true;
    }

    public xm b(qo qo2) {
        xm xm2 = new xm(this.o);
        xm2.a((rp)null);
        return xm2;
    }

    @Override
    public boolean bM() {
        return false;
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.b(qo2);
    }

    static {
        bB.put(abv.h, new pl(16, 24));
        bB.put(abv.j, new pl(8, 10));
        bB.put(abv.k, new pl(8, 10));
        bB.put(abv.i, new pl(4, 6));
        bB.put(abv.aF, new pl(24, 36));
        bB.put(abv.aG, new pl(11, 13));
        bB.put(abv.bB, new pl(1, 1));
        bB.put(abv.bi, new pl(3, 4));
        bB.put(abv.bv, new pl(2, 3));
        bB.put(abv.al, new pl(14, 18));
        bB.put(abv.bd, new pl(14, 18));
        bB.put(abv.bf, new pl(14, 18));
        bB.put(abv.aQ, new pl(9, 13));
        bB.put(abv.N, new pl(34, 48));
        bB.put(abv.bc, new pl(30, 38));
        bB.put(abv.bb, new pl(30, 38));
        bB.put(abv.O, new pl(18, 22));
        bB.put(abs.a(aie.L), new pl(14, 22));
        bB.put(abv.bh, new pl(36, 64));
        bC.put(abv.d, new pl(3, 4));
        bC.put(abv.aZ, new pl(3, 4));
        bC.put(abv.l, new pl(7, 11));
        bC.put(abv.u, new pl(12, 14));
        bC.put(abv.c, new pl(6, 8));
        bC.put(abv.x, new pl(9, 12));
        bC.put(abv.b, new pl(7, 9));
        bC.put(abv.w, new pl(10, 12));
        bC.put(abv.a, new pl(4, 6));
        bC.put(abv.v, new pl(7, 8));
        bC.put(abv.K, new pl(4, 6));
        bC.put(abv.L, new pl(7, 8));
        bC.put(abv.ab, new pl(4, 6));
        bC.put(abv.af, new pl(7, 8));
        bC.put(abv.Y, new pl(4, 6));
        bC.put(abv.ac, new pl(7, 8));
        bC.put(abv.Z, new pl(10, 14));
        bC.put(abv.ad, new pl(16, 19));
        bC.put(abv.aa, new pl(8, 10));
        bC.put(abv.ae, new pl(11, 14));
        bC.put(abv.X, new pl(5, 7));
        bC.put(abv.U, new pl(5, 7));
        bC.put(abv.V, new pl(11, 15));
        bC.put(abv.W, new pl(9, 11));
        bC.put(abv.P, new pl(-4, -2));
        bC.put(abv.ba, new pl(-8, -4));
        bC.put(abv.e, new pl(-8, -4));
        bC.put(abv.aX, new pl(-10, -7));
        bC.put(abs.a(aie.w), new pl(-5, -3));
        bC.put(abs.a(aie.X), new pl(3, 4));
        bC.put(abv.R, new pl(4, 5));
        bC.put(abv.T, new pl(2, 4));
        bC.put(abv.Q, new pl(2, 4));
        bC.put(abv.S, new pl(2, 4));
        bC.put(abv.av, new pl(6, 8));
        bC.put(abv.by, new pl(-4, -1));
        bC.put(abv.ax, new pl(-4, -1));
        bC.put(abv.aL, new pl(10, 12));
        bC.put(abv.aN, new pl(10, 12));
        bC.put(abs.a(aie.aN), new pl(-3, -1));
        bC.put(abv.am, new pl(-7, -5));
        bC.put(abv.be, new pl(-7, -5));
        bC.put(abv.bg, new pl(-8, -6));
        bC.put(abv.bv, new pl(7, 11));
        bC.put(abv.g, new pl(-12, -8));
    }
}

