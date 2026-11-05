/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class xh
extends wx {
    protected static final ry bp = new sf("zombie.spawnReinforcements", 0.0, 0.0, 1.0).a("Spawn Reinforcements Chance");
    private static final UUID bq = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final sa br = new sa(bq, "Baby speed boost", 0.5, 1);
    private final sq bs = new sq(this);
    private int bt;
    private boolean bu = false;
    private float bv = -1.0f;
    private float bw;

    public xh(afs afs2) {
        super(afs2);
        this.m().b(true);
        this.c.a(0, new sw(this));
        this.c.a(2, new th(this, xq.class, 1.0, false));
        this.c.a(4, new th(this, xm.class, 1.0, true));
        this.c.a(5, new tk(this, 1.0));
        this.c.a(6, new tj(this, 1.0, false));
        this.c.a(7, new tt(this, 1.0));
        this.c.a(8, new te(this, xq.class, 8.0f));
        this.c.a(8, new ts(this));
        this.d.a(1, new ue(this, true));
        this.d.a(2, new uf(this, xq.class, 0, true));
        this.d.a(2, new uf(this, xm.class, 0, false));
        this.a(0.6f, 1.8f);
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.b).a(40.0);
        this.a(xa.d).a(0.23f);
        this.a(xa.e).a(3.0);
        this.bb().b(bp).a(this.Z.nextDouble() * (double)0.1f);
    }

    @Override
    protected void c() {
        super.c();
        this.y().a(12, (Object)0);
        this.y().a(13, (Object)0);
        this.y().a(14, (Object)0);
    }

    @Override
    public int aU() {
        int n2 = super.aU() + 2;
        if (n2 > 20) {
            n2 = 20;
        }
        return n2;
    }

    @Override
    protected boolean bj() {
        return true;
    }

    public boolean bZ() {
        return this.bu;
    }

    public void a(boolean bl2) {
        if (this.bu != bl2) {
            this.bu = bl2;
            if (bl2) {
                this.c.a(1, this.bs);
            } else {
                this.c.a(this.bs);
            }
        }
    }

    @Override
    public boolean f() {
        return this.y().a(12) == 1;
    }

    @Override
    protected int e(xq xq2) {
        if (this.f()) {
            this.b = (int)((float)this.b * 2.5f);
        }
        return super.e(xq2);
    }

    public void i(boolean bl2) {
        this.y().b(12, (byte)(bl2 ? 1 : 0));
        if (this.o != null && !this.o.E) {
            rz rz2 = this.a(xa.d);
            rz2.b(br);
            if (bl2) {
                rz2.a(br);
            }
        }
        this.k(bl2);
    }

    public boolean cb() {
        return this.y().a(13) == 1;
    }

    public void j(boolean bl2) {
        this.y().b(13, (byte)(bl2 ? 1 : 0));
    }

    @Override
    public void e() {
        float f2;
        if (this.o.w() && !this.o.E && !this.f() && (f2 = this.d(1.0f)) > 0.5f && this.Z.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f && this.o.i(oy.c(this.s), oy.c(this.t), oy.c(this.u))) {
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
        if (this.al() && this.o() != null && this.m instanceof ux) {
            ((rn)this.m).m().a(this.m().e(), 1.5);
        }
        super.e();
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (super.a(qf2, f2)) {
            rm rm2 = this.o();
            if (rm2 == null && this.bT() instanceof rm) {
                rm2 = (rm)this.bT();
            }
            if (rm2 == null && qf2.j() instanceof rm) {
                rm2 = (rm)qf2.j();
            }
            if (rm2 != null && this.o.r == pu.d && (double)this.Z.nextFloat() < this.a(bp).e()) {
                int n2 = oy.c(this.s);
                int n3 = oy.c(this.t);
                int n4 = oy.c(this.u);
                xh xh2 = new xh(this.o);
                for (int i2 = 0; i2 < 50; ++i2) {
                    int n5;
                    int n6;
                    int n7 = n2 + oy.a(this.Z, 7, 40) * oy.a(this.Z, -1, 1);
                    if (!afs.a(this.o, n7, (n6 = n3 + oy.a(this.Z, 7, 40) * oy.a(this.Z, -1, 1)) - 1, n5 = n4 + oy.a(this.Z, 7, 40) * oy.a(this.Z, -1, 1)) || this.o.k(n7, n6, n5) >= 10) continue;
                    xh2.b((double)n7, (double)n6, (double)n5);
                    if (!this.o.b(xh2.C) || !this.o.a((qr)xh2, xh2.C).isEmpty() || this.o.d(xh2.C)) continue;
                    this.o.d(xh2);
                    xh2.d(rm2);
                    xh2.a((rp)null);
                    this.a(bp).a(new sa("Zombie reinforcement caller charge", -0.05f, 0));
                    xh2.a(bp).a(new sa("Zombie reinforcement callee charge", -0.05f, 0));
                    break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void h() {
        if (!this.o.E && this.cc()) {
            int n2 = this.ce();
            this.bt -= n2;
            if (this.bt <= 0) {
                this.cd();
            }
        }
        super.h();
    }

    @Override
    public boolean n(qr qr2) {
        boolean bl2 = super.n(qr2);
        if (bl2) {
            int n2 = this.o.r.a();
            if (this.bd() == null && this.ak() && this.Z.nextFloat() < (float)n2 * 0.3f) {
                qr2.e(2 * n2);
            }
        }
        return bl2;
    }

    @Override
    protected String t() {
        return "mob.zombie.say";
    }

    @Override
    protected String aS() {
        return "mob.zombie.hurt";
    }

    @Override
    protected String aT() {
        return "mob.zombie.death";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.zombie.step", 0.15f, 1.0f);
    }

    @Override
    protected abs u() {
        return abv.bh;
    }

    @Override
    public rq bc() {
        return rq.b;
    }

    @Override
    protected void n(int n2) {
        switch (this.Z.nextInt(3)) {
            case 0: {
                this.a(abv.j, 1);
                break;
            }
            case 1: {
                this.a(abv.bF, 1);
                break;
            }
            case 2: {
                this.a(abv.bG, 1);
            }
        }
    }

    @Override
    protected void bC() {
        super.bC();
        float f2 = this.Z.nextFloat();
        float f3 = this.o.r == pu.d ? 0.05f : 0.01f;
        if (f2 < f3) {
            int n2 = this.Z.nextInt(3);
            if (n2 == 0) {
                this.c(0, new abu(abv.l));
            } else {
                this.c(0, new abu(abv.a));
            }
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        if (this.f()) {
            dg2.a("IsBaby", true);
        }
        if (this.cb()) {
            dg2.a("IsVillager", true);
        }
        dg2.a("ConversionTime", this.cc() ? this.bt : -1);
        dg2.a("CanBreakDoors", this.bZ());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        if (dg2.n("IsBaby")) {
            this.i(true);
        }
        if (dg2.n("IsVillager")) {
            this.j(true);
        }
        if (dg2.b("ConversionTime", 99) && dg2.f("ConversionTime") > -1) {
            this.a(dg2.f("ConversionTime"));
        }
        this.a(dg2.n("CanBreakDoors"));
    }

    @Override
    public void a(rm rm2) {
        super.a(rm2);
        if ((this.o.r == pu.c || this.o.r == pu.d) && rm2 instanceof xm) {
            if (this.Z.nextBoolean()) {
                return;
            }
            xh xh2 = new xh(this.o);
            xh2.k(rm2);
            this.o.e(rm2);
            xh2.a((rp)null);
            xh2.j(true);
            if (rm2.f()) {
                xh2.i(true);
            }
            this.o.d(xh2);
            this.o.a(null, 1016, (int)this.s, (int)this.t, (int)this.u, 0);
        }
    }

    @Override
    public rp a(rp rp2) {
        Object object;
        rp2 = super.a(rp2);
        float f2 = this.o.b(this.s, this.t, this.u);
        this.h(this.Z.nextFloat() < 0.55f * f2);
        if (rp2 == null) {
            rp2 = new xj(this, this.o.s.nextFloat() < 0.05f, this.o.s.nextFloat() < 0.05f, null);
        }
        if (rp2 instanceof xj) {
            object = (xj)rp2;
            if (((xj)object).b) {
                this.j(true);
            }
            if (((xj)object).a) {
                this.i(true);
                if ((double)this.o.s.nextFloat() < 0.05) {
                    List list = this.o.a(ux.class, this.C.b(5.0, 3.0, 5.0), ra.b);
                    if (!list.isEmpty()) {
                        ux ux2 = (ux)list.get(0);
                        ux2.i(true);
                        this.a((qr)ux2);
                    }
                } else if ((double)this.o.s.nextFloat() < 0.05) {
                    ux ux3 = new ux(this.o);
                    ux3.b(this.s, this.t, this.u, this.y, 0.0f);
                    ux3.a((rp)null);
                    ux3.i(true);
                    this.o.d(ux3);
                    this.a((qr)ux3);
                }
            }
        }
        this.a(this.Z.nextFloat() < f2 * 0.1f);
        this.bC();
        this.bD();
        if (this.q(4) == null && ((Calendar)(object = this.o.W())).get(2) + 1 == 10 && ((Calendar)object).get(5) == 31 && this.Z.nextFloat() < 0.25f) {
            this.c(4, new abu(this.Z.nextFloat() < 0.1f ? aie.aP : aie.aK));
            this.e[4] = 0.0f;
        }
        this.a(xa.c).a(new sa("Random spawn bonus", this.Z.nextDouble() * (double)0.05f, 0));
        double d2 = this.Z.nextDouble() * 1.5 * (double)this.o.b(this.s, this.t, this.u);
        if (d2 > 1.0) {
            this.a(xa.b).a(new sa("Random zombie-spawn bonus", d2, 2));
        }
        if (this.Z.nextFloat() < f2 * 0.05f) {
            this.a(bp).a(new sa("Leader zombie bonus", this.Z.nextDouble() * 0.25 + 0.5, 0));
            this.a(xa.a).a(new sa("Leader zombie bonus", this.Z.nextDouble() * 3.0 + 1.0, 2));
            this.a(true);
        }
        return rp2;
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bE();
        if (abu2 != null && abu2.b() == abv.ao && abu2.k() == 0 && this.cb() && this.a(qm.t)) {
            if (!xq2.bE.d) {
                --abu2.b;
            }
            if (abu2.b <= 0) {
                xq2.bm.a(xq2.bm.c, null);
            }
            if (!this.o.E) {
                this.a(this.Z.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }

    protected void a(int n2) {
        this.bt = n2;
        this.y().b(14, (byte)1);
        this.m(qm.t.H);
        this.c(new qn(qm.g.H, n2, Math.min(this.o.r.a() - 1, 0)));
        this.o.a((qr)this, (byte)16);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 16) {
            this.o.a(this.s + 0.5, this.t + 0.5, this.u + 0.5, "mob.zombie.remedy", 1.0f + this.Z.nextFloat(), this.Z.nextFloat() * 0.7f + 0.3f, false);
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean v() {
        return !this.cc();
    }

    public boolean cc() {
        return this.y().a(14) == 1;
    }

    protected void cd() {
        xm xm2 = new xm(this.o);
        xm2.k(this);
        xm2.a((rp)null);
        xm2.cd();
        if (this.f()) {
            xm2.c(-24000);
        }
        this.o.e(this);
        this.o.d(xm2);
        xm2.c(new qn(qm.k.H, 200, 0));
        this.o.a(null, 1017, (int)this.s, (int)this.t, (int)this.u, 0);
    }

    protected int ce() {
        int n2 = 1;
        if (this.Z.nextFloat() < 0.01f) {
            int n3 = 0;
            for (int i2 = (int)this.s - 4; i2 < (int)this.s + 4 && n3 < 14; ++i2) {
                for (int i3 = (int)this.t - 4; i3 < (int)this.t + 4 && n3 < 14; ++i3) {
                    for (int i4 = (int)this.u - 4; i4 < (int)this.u + 4 && n3 < 14; ++i4) {
                        ahz ahz2 = this.o.a(i2, i3, i4);
                        if (ahz2 != aie.aY && ahz2 != aie.C) continue;
                        if (this.Z.nextFloat() < 0.3f) {
                            ++n2;
                        }
                        ++n3;
                    }
                }
            }
        }
        return n2;
    }

    public void k(boolean bl2) {
        this.a(bl2 ? 0.5f : 1.0f);
    }

    @Override
    protected final void a(float f2, float f3) {
        boolean bl2 = this.bv > 0.0f && this.bw > 0.0f;
        this.bv = f2;
        this.bw = f3;
        if (!bl2) {
            this.a(1.0f);
        }
    }

    protected final void a(float f2) {
        super.a(this.bv * f2, this.bw * f2);
    }
}

