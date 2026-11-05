/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class uz
extends uw
implements pt {
    private static final ra bu = new va();
    private static final ry bv = new sf("horse.jumpStrength", 0.7, 0.0, 2.0).a("Jump Strength").a(true);
    private static final String[] bw = new String[]{null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png"};
    private static final String[] bx = new String[]{"", "meo", "goo", "dio"};
    private static final int[] by = new int[]{0, 5, 7, 11};
    private static final String[] bz = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
    private static final String[] bA = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
    private static final String[] bB = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
    private static final String[] bC = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
    private int bD;
    private int bE;
    private int bF;
    public int bp;
    public int bq;
    protected boolean br;
    private yk bG;
    private boolean bH;
    protected int bs;
    protected float bt;
    private boolean bI;
    private float bJ;
    private float bK;
    private float bL;
    private float bM;
    private float bN;
    private float bO;
    private int bP;
    private String bQ;
    private String[] bR = new String[3];

    public uz(afs afs2) {
        super(afs2);
        this.a(1.4f, 1.6f);
        this.ae = false;
        this.l(false);
        this.m().a(true);
        this.c.a(0, new sw(this));
        this.c.a(1, new tq(this, 1.2));
        this.c.a(1, new tx(this, 1.2));
        this.c.a(2, new sr(this, 1.0));
        this.c.a(4, new sy(this, 1.0));
        this.c.a(6, new tt(this, 0.7));
        this.c.a(7, new te(this, xq.class, 6.0f));
        this.c.a(8, new ts(this));
        this.cN();
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)0);
        this.af.a(19, (Object)0);
        this.af.a(20, (Object)0);
        this.af.a(21, String.valueOf(""));
        this.af.a(22, (Object)0);
    }

    public void s(int n2) {
        this.af.b(19, (byte)n2);
        this.cP();
    }

    public int bZ() {
        return this.af.a(19);
    }

    public void t(int n2) {
        this.af.b(20, n2);
        this.cP();
    }

    public int ca() {
        return this.af.c(20);
    }

    @Override
    public String b_() {
        if (this.bH()) {
            return this.bG();
        }
        int n2 = this.bZ();
        switch (n2) {
            default: {
                return dc.a("entity.horse.name");
            }
            case 1: {
                return dc.a("entity.donkey.name");
            }
            case 2: {
                return dc.a("entity.mule.name");
            }
            case 4: {
                return dc.a("entity.skeletonhorse.name");
            }
            case 3: 
        }
        return dc.a("entity.zombiehorse.name");
    }

    private boolean x(int n2) {
        return (this.af.c(16) & n2) != 0;
    }

    private void b(int n2, boolean bl2) {
        int n3 = this.af.c(16);
        if (bl2) {
            this.af.b(16, n3 | n2);
        } else {
            this.af.b(16, n3 & ~n2);
        }
    }

    public boolean cb() {
        return !this.f();
    }

    public boolean cc() {
        return this.x(2);
    }

    public boolean cg() {
        return this.cb();
    }

    public String ch() {
        return this.af.e(21);
    }

    public void b(String string) {
        this.af.b(21, string);
    }

    public float ci() {
        int n2 = this.d();
        if (n2 >= 0) {
            return 1.0f;
        }
        return 0.5f + (float)(-24000 - n2) / -24000.0f * 0.5f;
    }

    @Override
    public void a(boolean bl2) {
        if (bl2) {
            this.a(this.ci());
        } else {
            this.a(1.0f);
        }
    }

    public boolean cj() {
        return this.br;
    }

    public void i(boolean bl2) {
        this.b(2, bl2);
    }

    public void j(boolean bl2) {
        this.br = bl2;
    }

    @Override
    public boolean bM() {
        return !this.cE() && super.bM();
    }

    @Override
    protected void o(float f2) {
        if (f2 > 6.0f && this.cm()) {
            this.o(false);
        }
    }

    public boolean ck() {
        return this.x(8);
    }

    public int cl() {
        return this.af.c(22);
    }

    private int e(abu abu2) {
        if (abu2 == null) {
            return 0;
        }
        abs abs2 = abu2.b();
        if (abs2 == abv.bX) {
            return 1;
        }
        if (abs2 == abv.bY) {
            return 2;
        }
        if (abs2 == abv.bZ) {
            return 3;
        }
        return 0;
    }

    public boolean cm() {
        return this.x(32);
    }

    public boolean cn() {
        return this.x(64);
    }

    public boolean co() {
        return this.x(16);
    }

    public boolean cp() {
        return this.bH;
    }

    public void d(abu abu2) {
        this.af.b(22, this.e(abu2));
        this.cP();
    }

    public void k(boolean bl2) {
        this.b(16, bl2);
    }

    public void l(boolean bl2) {
        this.b(8, bl2);
    }

    public void m(boolean bl2) {
        this.bH = bl2;
    }

    public void n(boolean bl2) {
        this.b(4, bl2);
    }

    public int cq() {
        return this.bs;
    }

    public void u(int n2) {
        this.bs = n2;
    }

    public int v(int n2) {
        int n3 = oy.a(this.cq() + n2, 0, this.cw());
        this.u(n3);
        return n3;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        qr qr2 = qf2.j();
        if (this.l != null && this.l.equals(qr2)) {
            return false;
        }
        return super.a(qf2, f2);
    }

    @Override
    public int aU() {
        return by[this.cl()];
    }

    @Override
    public boolean R() {
        return this.l == null;
    }

    public boolean cr() {
        int n2 = oy.c(this.s);
        int n3 = oy.c(this.u);
        this.o.a(n2, n3);
        return true;
    }

    public void cs() {
        if (this.o.E || !this.ck()) {
            return;
        }
        this.a(abs.a(aie.ae), 1);
        this.l(false);
    }

    private void cL() {
        this.cS();
        this.o.a(this, "eating", 1.0f, 1.0f + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f);
    }

    @Override
    protected void b(float f2) {
        ahz ahz2;
        int n2;
        if (f2 > 1.0f) {
            this.a("mob.horse.land", 0.4f, 1.0f);
        }
        if ((n2 = oy.f(f2 * 0.5f - 3.0f)) <= 0) {
            return;
        }
        this.a(qf.h, (float)n2);
        if (this.l != null) {
            this.l.a(qf.h, (float)n2);
        }
        if ((ahz2 = this.o.a(oy.c(this.s), oy.c(this.t - 0.2 - (double)this.A), oy.c(this.u))).o() != avk.a) {
            aid aid2 = ahz2.H;
            this.o.a(this, aid2.e(), aid2.c() * 0.5f, aid2.d() * 0.75f);
        }
    }

    private int cM() {
        int n2 = this.bZ();
        if (this.ck() && (n2 == 1 || n2 == 2)) {
            return 17;
        }
        return 2;
    }

    private void cN() {
        yk yk2 = this.bG;
        this.bG = new yk("HorseChest", this.cM());
        this.bG.a(this.b_());
        if (yk2 != null) {
            yk2.b(this);
            int n2 = Math.min(yk2.a(), this.bG.a());
            for (int i2 = 0; i2 < n2; ++i2) {
                abu abu2 = yk2.a(i2);
                if (abu2 == null) continue;
                this.bG.a(i2, abu2.m());
            }
            yk2 = null;
        }
        this.bG.a(this);
        this.cO();
    }

    private void cO() {
        if (!this.o.E) {
            this.n(this.bG.a(0) != null);
            if (this.cB()) {
                this.d(this.bG.a(1));
            }
        }
    }

    @Override
    public void a(py py2) {
        int n2 = this.cl();
        boolean bl2 = this.cu();
        this.cO();
        if (this.aa > 20) {
            if (n2 == 0 && n2 != this.cl()) {
                this.a("mob.horse.armor", 0.5f, 1.0f);
            } else if (n2 != this.cl()) {
                this.a("mob.horse.armor", 0.5f, 1.0f);
            }
            if (!bl2 && this.cu()) {
                this.a("mob.horse.leather", 0.5f, 1.0f);
            }
        }
    }

    @Override
    public boolean by() {
        this.cr();
        return super.by();
    }

    protected uz a(qr qr2, double d2) {
        double d3 = Double.MAX_VALUE;
        qr qr3 = null;
        List list = this.o.a(qr2, qr2.C.a(d2, d2, d2), bu);
        for (qr qr4 : list) {
            double d4 = qr4.e(qr2.s, qr2.t, qr2.u);
            if (!(d4 < d3)) continue;
            qr3 = qr4;
            d3 = d4;
        }
        return (uz)qr3;
    }

    public double ct() {
        return this.a(bv).e();
    }

    @Override
    protected String aT() {
        this.cS();
        int n2 = this.bZ();
        if (n2 == 3) {
            return "mob.horse.zombie.death";
        }
        if (n2 == 4) {
            return "mob.horse.skeleton.death";
        }
        if (n2 == 1 || n2 == 2) {
            return "mob.horse.donkey.death";
        }
        return "mob.horse.death";
    }

    @Override
    protected abs u() {
        boolean bl2 = this.Z.nextInt(4) == 0;
        int n2 = this.bZ();
        if (n2 == 4) {
            return abv.aS;
        }
        if (n2 == 3) {
            if (bl2) {
                return abs.d(0);
            }
            return abv.bh;
        }
        return abv.aA;
    }

    @Override
    protected String aS() {
        int n2;
        this.cS();
        if (this.Z.nextInt(3) == 0) {
            this.cU();
        }
        if ((n2 = this.bZ()) == 3) {
            return "mob.horse.zombie.hit";
        }
        if (n2 == 4) {
            return "mob.horse.skeleton.hit";
        }
        if (n2 == 1 || n2 == 2) {
            return "mob.horse.donkey.hit";
        }
        return "mob.horse.hit";
    }

    public boolean cu() {
        return this.x(4);
    }

    @Override
    protected String t() {
        int n2;
        this.cS();
        if (this.Z.nextInt(10) == 0 && !this.bg()) {
            this.cU();
        }
        if ((n2 = this.bZ()) == 3) {
            return "mob.horse.zombie.idle";
        }
        if (n2 == 4) {
            return "mob.horse.skeleton.idle";
        }
        if (n2 == 1 || n2 == 2) {
            return "mob.horse.donkey.idle";
        }
        return "mob.horse.idle";
    }

    protected String cv() {
        this.cS();
        this.cU();
        int n2 = this.bZ();
        if (n2 == 3 || n2 == 4) {
            return null;
        }
        if (n2 == 1 || n2 == 2) {
            return "mob.horse.donkey.angry";
        }
        return "mob.horse.angry";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        aid aid2 = ahz2.H;
        if (this.o.a(n2, n3 + 1, n4) == aie.aC) {
            aid2 = aie.aC.H;
        }
        if (!ahz2.o().d()) {
            int n5 = this.bZ();
            if (this.l != null && n5 != 1 && n5 != 2) {
                ++this.bP;
                if (this.bP > 5 && this.bP % 3 == 0) {
                    this.a("mob.horse.gallop", aid2.c() * 0.15f, aid2.d());
                    if (n5 == 0 && this.Z.nextInt(10) == 0) {
                        this.a("mob.horse.breathe", aid2.c() * 0.6f, aid2.d());
                    }
                } else if (this.bP <= 5) {
                    this.a("mob.horse.wood", aid2.c() * 0.15f, aid2.d());
                }
            } else if (aid2 == ahz.f) {
                this.a("mob.horse.wood", aid2.c() * 0.15f, aid2.d());
            } else {
                this.a("mob.horse.soft", aid2.c() * 0.15f, aid2.d());
            }
        }
    }

    @Override
    protected void aC() {
        super.aC();
        this.bb().b(bv);
        this.a(xa.a).a(53.0);
        this.a(xa.d).a(0.225f);
    }

    @Override
    public int bB() {
        return 6;
    }

    public int cw() {
        return 100;
    }

    @Override
    protected float be() {
        return 0.8f;
    }

    @Override
    public int q() {
        return 400;
    }

    public boolean cx() {
        return this.bZ() == 0 || this.cl() > 0;
    }

    private void cP() {
        this.bQ = null;
    }

    private void cQ() {
        int n2;
        this.bQ = "horse/";
        this.bR[0] = null;
        this.bR[1] = null;
        this.bR[2] = null;
        int n3 = this.bZ();
        int n4 = this.ca();
        if (n3 == 0) {
            n2 = n4 & 0xFF;
            int n5 = (n4 & 0xFF00) >> 8;
            this.bR[0] = bz[n2];
            this.bQ = this.bQ + bA[n2];
            this.bR[1] = bB[n5];
            this.bQ = this.bQ + bC[n5];
        } else {
            this.bR[0] = "";
            this.bQ = this.bQ + "_" + n3 + "_";
        }
        n2 = this.cl();
        this.bR[2] = bw[n2];
        this.bQ = this.bQ + bx[n2];
    }

    public String cy() {
        if (this.bQ == null) {
            this.cQ();
        }
        return this.bQ;
    }

    public String[] cz() {
        if (this.bQ == null) {
            this.cQ();
        }
        return this.bR;
    }

    public void g(xq xq2) {
        if (!this.o.E && (this.l == null || this.l == xq2) && this.cc()) {
            this.bG.a(this.b_());
            xq2.a(this, this.bG);
        }
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.bx) {
            return super.a(xq2);
        }
        if (!this.cc() && this.cE()) {
            return false;
        }
        if (this.cc() && this.cb() && xq2.am()) {
            this.g(xq2);
            return true;
        }
        if (this.cg() && this.l != null) {
            return super.a(xq2);
        }
        if (abu2 != null) {
            boolean bl2 = false;
            if (this.cB()) {
                int n2 = -1;
                if (abu2.b() == abv.bX) {
                    n2 = 1;
                } else if (abu2.b() == abv.bY) {
                    n2 = 2;
                } else if (abu2.b() == abv.bZ) {
                    n2 = 3;
                }
                if (n2 >= 0) {
                    if (!this.cc()) {
                        this.cJ();
                        return true;
                    }
                    this.g(xq2);
                    return true;
                }
            }
            if (!bl2 && !this.cE()) {
                float f2 = 0.0f;
                int n3 = 0;
                int n4 = 0;
                if (abu2.b() == abv.O) {
                    f2 = 2.0f;
                    n3 = 60;
                    n4 = 3;
                } else if (abu2.b() == abv.aT) {
                    f2 = 1.0f;
                    n3 = 30;
                    n4 = 3;
                } else if (abu2.b() == abv.P) {
                    f2 = 7.0f;
                    n3 = 180;
                    n4 = 3;
                } else if (ahz.a(abu2.b()) == aie.cf) {
                    f2 = 20.0f;
                    n3 = 180;
                } else if (abu2.b() == abv.e) {
                    f2 = 3.0f;
                    n3 = 60;
                    n4 = 3;
                } else if (abu2.b() == abv.bK) {
                    f2 = 4.0f;
                    n3 = 60;
                    n4 = 5;
                    if (this.cc() && this.d() == 0) {
                        bl2 = true;
                        this.f(xq2);
                    }
                } else if (abu2.b() == abv.ao) {
                    f2 = 10.0f;
                    n3 = 240;
                    n4 = 10;
                    if (this.cc() && this.d() == 0) {
                        bl2 = true;
                        this.f(xq2);
                    }
                }
                if (this.aR() < this.aX() && f2 > 0.0f) {
                    this.f(f2);
                    bl2 = true;
                }
                if (!this.cb() && n3 > 0) {
                    this.a(n3);
                    bl2 = true;
                }
                if (n4 > 0 && (bl2 || !this.cc()) && n4 < this.cw()) {
                    bl2 = true;
                    this.v(n4);
                }
                if (bl2) {
                    this.cL();
                }
            }
            if (!this.cc() && !bl2) {
                if (abu2 != null && abu2.a(xq2, (rm)this)) {
                    return true;
                }
                this.cJ();
                return true;
            }
            if (!bl2 && this.cC() && !this.ck() && abu2.b() == abs.a(aie.ae)) {
                this.l(true);
                this.a("mob.chickenplop", 1.0f, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f);
                bl2 = true;
                this.cN();
            }
            if (!bl2 && this.cg() && !this.cu() && abu2.b() == abv.av) {
                this.g(xq2);
                return true;
            }
            if (bl2) {
                if (!xq2.bE.d && --abu2.b == 0) {
                    xq2.bm.a(xq2.bm.c, null);
                }
                return true;
            }
        }
        if (this.cg() && this.l == null) {
            if (abu2 != null && abu2.a(xq2, (rm)this)) {
                return true;
            }
            this.i(xq2);
            return true;
        }
        return super.a(xq2);
    }

    private void i(xq xq2) {
        xq2.y = this.y;
        xq2.z = this.z;
        this.o(false);
        this.p(false);
        if (!this.o.E) {
            xq2.a((qr)this);
        }
    }

    public boolean cB() {
        return this.bZ() == 0;
    }

    public boolean cC() {
        int n2 = this.bZ();
        return n2 == 2 || n2 == 1;
    }

    @Override
    protected boolean bg() {
        if (this.l != null && this.cu()) {
            return true;
        }
        return this.cm() || this.cn();
    }

    public boolean cE() {
        int n2 = this.bZ();
        return n2 == 3 || n2 == 4;
    }

    public boolean cF() {
        return this.cE() || this.bZ() == 2;
    }

    @Override
    public boolean c(abu abu2) {
        return false;
    }

    private void cR() {
        this.bp = 1;
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        if (!this.o.E) {
            this.cK();
        }
    }

    @Override
    public void e() {
        if (this.Z.nextInt(200) == 0) {
            this.cR();
        }
        super.e();
        if (!this.o.E) {
            uz uz2;
            if (this.Z.nextInt(900) == 0 && this.aA == 0) {
                this.f(1.0f);
            }
            if (!this.cm() && this.l == null && this.Z.nextInt(300) == 0 && this.o.a(oy.c(this.s), oy.c(this.t) - 1, oy.c(this.u)) == aie.c) {
                this.o(true);
            }
            if (this.cm() && ++this.bD > 50) {
                this.bD = 0;
                this.o(false);
            }
            if (this.co() && !this.cb() && !this.cm() && (uz2 = this.a((qr)this, 16.0)) != null && this.f(uz2) > 4.0) {
                aww aww2 = this.o.a((qr)this, uz2, 16.0f, true, false, false, true);
                this.a(aww2);
            }
        }
    }

    @Override
    public void h() {
        super.h();
        if (this.o.E && this.af.a()) {
            this.af.e();
            this.cP();
        }
        if (this.bE > 0 && ++this.bE > 30) {
            this.bE = 0;
            this.b(128, false);
        }
        if (!this.o.E && this.bF > 0 && ++this.bF > 20) {
            this.bF = 0;
            this.p(false);
        }
        if (this.bp > 0 && ++this.bp > 8) {
            this.bp = 0;
        }
        if (this.bq > 0) {
            ++this.bq;
            if (this.bq > 300) {
                this.bq = 0;
            }
        }
        this.bK = this.bJ;
        if (this.cm()) {
            this.bJ += (1.0f - this.bJ) * 0.4f + 0.05f;
            if (this.bJ > 1.0f) {
                this.bJ = 1.0f;
            }
        } else {
            this.bJ += (0.0f - this.bJ) * 0.4f - 0.05f;
            if (this.bJ < 0.0f) {
                this.bJ = 0.0f;
            }
        }
        this.bM = this.bL;
        if (this.cn()) {
            this.bJ = 0.0f;
            this.bK = 0.0f;
            this.bL += (1.0f - this.bL) * 0.4f + 0.05f;
            if (this.bL > 1.0f) {
                this.bL = 1.0f;
            }
        } else {
            this.bI = false;
            this.bL += (0.8f * this.bL * this.bL * this.bL - this.bL) * 0.6f - 0.05f;
            if (this.bL < 0.0f) {
                this.bL = 0.0f;
            }
        }
        this.bO = this.bN;
        if (this.x(128)) {
            this.bN += (1.0f - this.bN) * 0.7f + 0.05f;
            if (this.bN > 1.0f) {
                this.bN = 1.0f;
            }
        } else {
            this.bN += (0.0f - this.bN) * 0.7f - 0.05f;
            if (this.bN < 0.0f) {
                this.bN = 0.0f;
            }
        }
    }

    private void cS() {
        if (!this.o.E) {
            this.bE = 1;
            this.b(128, true);
        }
    }

    private boolean cT() {
        return this.l == null && this.m == null && this.cc() && this.cb() && !this.cF() && this.aR() >= this.aX();
    }

    @Override
    public void e(boolean bl2) {
        this.b(32, bl2);
    }

    public void o(boolean bl2) {
        this.e(bl2);
    }

    public void p(boolean bl2) {
        if (bl2) {
            this.o(false);
        }
        this.b(64, bl2);
    }

    private void cU() {
        if (!this.o.E) {
            this.bF = 1;
            this.p(true);
        }
    }

    public void cJ() {
        this.cU();
        String string = this.cv();
        if (string != null) {
            this.a(string, this.be(), this.bf());
        }
    }

    public void cK() {
        this.a((qr)this, this.bG);
        this.cs();
    }

    private void a(qr qr2, yk yk2) {
        if (yk2 == null || this.o.E) {
            return;
        }
        for (int i2 = 0; i2 < yk2.a(); ++i2) {
            abu abu2 = yk2.a(i2);
            if (abu2 == null) continue;
            this.a(abu2, 0.0f);
        }
    }

    public boolean h(xq xq2) {
        this.b(xq2.b_());
        this.i(true);
        return true;
    }

    @Override
    public void e(float f2, float f3) {
        if (this.l == null || !this.cu()) {
            this.W = 0.5f;
            this.aQ = 0.02f;
            super.e(f2, f3);
            return;
        }
        this.A = this.y = this.l.y;
        this.z = this.l.z * 0.5f;
        this.b(this.y, this.z);
        this.aO = this.aM = this.y;
        f2 = ((rm)this.l).bd * 0.5f;
        f3 = ((rm)this.l).be;
        if (f3 <= 0.0f) {
            f3 *= 0.25f;
            this.bP = 0;
        }
        if (this.D && this.bt == 0.0f && this.cn() && !this.bI) {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (this.bt > 0.0f && !this.cj() && this.D) {
            this.w = this.ct() * (double)this.bt;
            if (this.a(qm.j)) {
                this.w += (double)((float)(this.b(qm.j).c() + 1) * 0.1f);
            }
            this.j(true);
            this.al = true;
            if (f3 > 0.0f) {
                float f4 = oy.a(this.y * (float)Math.PI / 180.0f);
                float f5 = oy.b(this.y * (float)Math.PI / 180.0f);
                this.v += (double)(-0.4f * f4 * this.bt);
                this.x += (double)(0.4f * f5 * this.bt);
                this.a("mob.horse.jump", 0.4f, 1.0f);
            }
            this.bt = 0.0f;
        }
        this.W = 1.0f;
        this.aQ = this.bk() * 0.1f;
        if (!this.o.E) {
            this.i((float)this.a(xa.d).e());
            super.e(f2, f3);
        }
        if (this.D) {
            this.bt = 0.0f;
            this.j(false);
        }
        this.aE = this.aF;
        double d2 = this.s - this.p;
        double d3 = this.u - this.r;
        float f6 = oy.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        this.aF += (f6 - this.aF) * 0.4f;
        this.aG += this.aF;
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("EatingHaystack", this.cm());
        dg2.a("ChestedHorse", this.ck());
        dg2.a("HasReproduced", this.cp());
        dg2.a("Bred", this.co());
        dg2.a("Type", this.bZ());
        dg2.a("Variant", this.ca());
        dg2.a("Temper", this.cq());
        dg2.a("Tame", this.cc());
        dg2.a("OwnerName", this.ch());
        if (this.ck()) {
            dp dp2 = new dp();
            for (int i2 = 2; i2 < this.bG.a(); ++i2) {
                abu abu2 = this.bG.a(i2);
                if (abu2 == null) continue;
                dg dg3 = new dg();
                dg3.a("Slot", (byte)i2);
                abu2.b(dg3);
                dp2.a(dg3);
            }
            dg2.a("Items", dp2);
        }
        if (this.bG.a(1) != null) {
            dg2.a("ArmorItem", this.bG.a(1).b(new dg()));
        }
        if (this.bG.a(0) != null) {
            dg2.a("SaddleItem", this.bG.a(0).b(new dg()));
        }
    }

    @Override
    public void a(dg dg2) {
        Object object;
        rz rz2;
        super.a(dg2);
        this.o(dg2.n("EatingHaystack"));
        this.k(dg2.n("Bred"));
        this.l(dg2.n("ChestedHorse"));
        this.m(dg2.n("HasReproduced"));
        this.s(dg2.f("Type"));
        this.t(dg2.f("Variant"));
        this.u(dg2.f("Temper"));
        this.i(dg2.n("Tame"));
        if (dg2.b("OwnerName", 8)) {
            this.b(dg2.j("OwnerName"));
        }
        if ((rz2 = this.bb().a("Speed")) != null) {
            this.a(xa.d).a(rz2.b() * 0.25);
        }
        if (this.ck()) {
            object = dg2.c("Items", 10);
            this.cN();
            for (int i2 = 0; i2 < ((dp)object).c(); ++i2) {
                dg dg3 = ((dp)object).b(i2);
                int n2 = dg3.d("Slot") & 0xFF;
                if (n2 < 2 || n2 >= this.bG.a()) continue;
                this.bG.a(n2, abu.a(dg3));
            }
        }
        if (dg2.b("ArmorItem", 10) && (object = abu.a(dg2.m("ArmorItem"))) != null && uz.a(((abu)object).b())) {
            this.bG.a(1, (abu)object);
        }
        if (dg2.b("SaddleItem", 10)) {
            object = abu.a(dg2.m("SaddleItem"));
            if (object != null && ((abu)object).b() == abv.av) {
                this.bG.a(0, (abu)object);
            }
        } else if (dg2.n("Saddle")) {
            this.bG.a(0, new abu(abv.av));
        }
        this.cO();
    }

    @Override
    public boolean a(uw uw2) {
        int n2;
        if (uw2 == this) {
            return false;
        }
        if (uw2.getClass() != this.getClass()) {
            return false;
        }
        uz uz2 = (uz)uw2;
        if (!this.cT() || !uz2.cT()) {
            return false;
        }
        int n3 = this.bZ();
        return n3 == (n2 = uz2.bZ()) || n3 == 0 && n2 == 1 || n3 == 1 && n2 == 0;
    }

    @Override
    public qo a(qo qo2) {
        uz uz2 = (uz)qo2;
        uz uz3 = new uz(this.o);
        int n2 = this.bZ();
        int n3 = uz2.bZ();
        int n4 = 0;
        if (n2 == n3) {
            n4 = n2;
        } else if (n2 == 0 && n3 == 1 || n2 == 1 && n3 == 0) {
            n4 = 2;
        }
        if (n4 == 0) {
            int n5 = this.Z.nextInt(9);
            int n6 = n5 < 4 ? this.ca() & 0xFF : (n5 < 8 ? uz2.ca() & 0xFF : this.Z.nextInt(7));
            int n7 = this.Z.nextInt(5);
            n6 = n7 < 2 ? (n6 |= this.ca() & 0xFF00) : (n7 < 4 ? (n6 |= uz2.ca() & 0xFF00) : (n6 |= this.Z.nextInt(5) << 8 & 0xFF00));
            uz3.t(n6);
        }
        uz3.s(n4);
        double d2 = this.a(xa.a).b() + qo2.a(xa.a).b() + (double)this.cV();
        uz3.a(xa.a).a(d2 / 3.0);
        double d3 = this.a(bv).b() + qo2.a(bv).b() + this.cW();
        uz3.a(bv).a(d3 / 3.0);
        double d4 = this.a(xa.d).b() + qo2.a(xa.d).b() + this.cX();
        uz3.a(xa.d).a(d4 / 3.0);
        return uz3;
    }

    @Override
    public rp a(rp rp2) {
        rp2 = super.a(rp2);
        int n2 = 0;
        int n3 = 0;
        if (rp2 instanceof vb) {
            n2 = ((vb)rp2).a;
            n3 = ((vb)rp2).b & 0xFF | this.Z.nextInt(5) << 8;
        } else {
            if (this.Z.nextInt(10) == 0) {
                n2 = 1;
            } else {
                int n4 = this.Z.nextInt(7);
                int n5 = this.Z.nextInt(5);
                n2 = 0;
                n3 = n4 | n5 << 8;
            }
            rp2 = new vb(n2, n3);
        }
        this.s(n2);
        this.t(n3);
        if (this.Z.nextInt(5) == 0) {
            this.c(-24000);
        }
        if (n2 == 4 || n2 == 3) {
            this.a(xa.a).a(15.0);
            this.a(xa.d).a(0.2f);
        } else {
            this.a(xa.a).a(this.cV());
            if (n2 == 0) {
                this.a(xa.d).a(this.cX());
            } else {
                this.a(xa.d).a(0.175f);
            }
        }
        if (n2 == 2 || n2 == 1) {
            this.a(bv).a(0.5);
        } else {
            this.a(bv).a(this.cW());
        }
        this.g(this.aX());
        return rp2;
    }

    public float p(float f2) {
        return this.bK + (this.bJ - this.bK) * f2;
    }

    public float q(float f2) {
        return this.bM + (this.bL - this.bM) * f2;
    }

    public float r(float f2) {
        return this.bO + (this.bN - this.bO) * f2;
    }

    @Override
    protected boolean bj() {
        return true;
    }

    public void w(int n2) {
        if (this.cu()) {
            if (n2 < 0) {
                n2 = 0;
            } else {
                this.bI = true;
                this.cU();
            }
            this.bt = n2 >= 90 ? 1.0f : 0.4f + 0.4f * (float)n2 / 90.0f;
        }
    }

    protected void q(boolean bl2) {
        String string = bl2 ? "heart" : "smoke";
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.Z.nextGaussian() * 0.02;
            double d3 = this.Z.nextGaussian() * 0.02;
            double d4 = this.Z.nextGaussian() * 0.02;
            this.o.a(string, this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + 0.5 + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, d2, d3, d4);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.q(true);
        } else if (by2 == 6) {
            this.q(false);
        } else {
            super.a(by2);
        }
    }

    @Override
    public void ab() {
        super.ab();
        if (this.bM > 0.0f) {
            float f2 = oy.a(this.aM * (float)Math.PI / 180.0f);
            float f3 = oy.b(this.aM * (float)Math.PI / 180.0f);
            float f4 = 0.7f * this.bM;
            float f5 = 0.15f * this.bM;
            this.l.b(this.s + (double)(f4 * f2), this.t + this.ad() + this.l.ac() + (double)f5, this.u - (double)(f4 * f3));
            if (this.l instanceof rm) {
                ((rm)this.l).aM = this.aM;
            }
        }
    }

    private float cV() {
        return 15.0f + (float)this.Z.nextInt(8) + (float)this.Z.nextInt(9);
    }

    private double cW() {
        return (double)0.4f + this.Z.nextDouble() * 0.2 + this.Z.nextDouble() * 0.2 + this.Z.nextDouble() * 0.2;
    }

    private double cX() {
        return ((double)0.45f + this.Z.nextDouble() * 0.3 + this.Z.nextDouble() * 0.3 + this.Z.nextDouble() * 0.3) * 0.25;
    }

    public static boolean a(abs abs2) {
        return abs2 == abv.bX || abs2 == abv.bY || abs2 == abv.bZ;
    }

    @Override
    public boolean h_() {
        return false;
    }
}

