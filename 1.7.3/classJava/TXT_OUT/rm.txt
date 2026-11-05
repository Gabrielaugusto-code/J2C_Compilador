/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class rm
extends qr {
    private static final UUID b = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final sa c = new sa(b, "Sprinting speed boost", 0.3f, 2).a(false);
    private sc d;
    private final qe e = new qe(this);
    private final HashMap f = new HashMap();
    private final abu[] g = new abu[5];
    public boolean at;
    public int au;
    public int av;
    public float aw;
    public int ax;
    public int ay;
    public float az;
    public int aA;
    public int aB;
    public float aC;
    public float aD;
    public float aE;
    public float aF;
    public float aG;
    public int aH = 20;
    public float aI;
    public float aJ;
    public float aK;
    public float aL;
    public float aM;
    public float aN;
    public float aO;
    public float aP;
    public float aQ = 0.02f;
    protected xq aR;
    protected int aS;
    protected boolean aT;
    protected int aU;
    protected float aV;
    protected float aW;
    protected float aX;
    protected float aY;
    protected float aZ;
    protected int ba;
    protected float bb;
    protected boolean bc;
    public float bd;
    public float be;
    protected float bf;
    protected int bg;
    protected double bh;
    protected double bi;
    protected double bj;
    protected double bk;
    protected double bl;
    private boolean h = true;
    private rm i;
    private int bm;
    private rm bn;
    private int bo;
    private float bp;
    private int bq;
    private float br;

    public rm(afs afs2) {
        super(afs2);
        this.aC();
        this.g(this.aX());
        this.k = true;
        this.aL = (float)(Math.random() + 1.0) * 0.01f;
        this.b(this.s, this.t, this.u);
        this.aK = (float)Math.random() * 12398.0f;
        this.aO = this.y = (float)(Math.random() * 3.1415927410125732 * 2.0);
        this.W = 0.5f;
    }

    @Override
    protected void c() {
        this.af.a(7, (Object)0);
        this.af.a(8, (Object)0);
        this.af.a(9, (Object)0);
        this.af.a(6, Float.valueOf(1.0f));
    }

    protected void aC() {
        this.bb().b(xa.a);
        this.bb().b(xa.c);
        this.bb().b(xa.d);
        if (!this.bj()) {
            this.a(xa.d).a(0.1f);
        }
    }

    @Override
    protected void a(double d2, boolean bl2) {
        if (!this.L()) {
            this.M();
        }
        if (bl2 && this.R > 0.0f) {
            int n2;
            int n3;
            int n4 = oy.c(this.s);
            ahz ahz2 = this.o.a(n4, n3 = oy.c(this.t - (double)0.2f - (double)this.L), n2 = oy.c(this.u));
            if (ahz2.o() == avk.a) {
                int n5 = this.o.a(n4, n3 - 1, n2).b();
                if (n5 == 11 || n5 == 32 || n5 == 21) {
                    ahz2 = this.o.a(n4, n3 - 1, n2);
                }
            } else if (!this.o.E && this.R > 3.0f) {
                this.o.c(2006, n4, n3, n2, oy.f(this.R - 3.0f));
            }
            ahz2.a(this.o, n4, n3, n2, (qr)this, this.R);
        }
        super.a(d2, bl2);
    }

    public boolean aD() {
        return false;
    }

    @Override
    public void B() {
        boolean bl2;
        this.aC = this.aD;
        super.B();
        this.o.C.a("livingEntityBaseTick");
        if (this.Y() && this.Z()) {
            this.a(qf.d, 1.0f);
        }
        if (this.J() || this.o.E) {
            this.E();
        }
        boolean bl3 = bl2 = this instanceof xq && ((xq)this).bE.a;
        if (this.Y() && this.a(avk.h)) {
            if (!(this.aD() || this.k(qm.o.H) || bl2)) {
                this.h(this.j(this.aq()));
                if (this.aq() == -20) {
                    this.h(0);
                    for (int i2 = 0; i2 < 8; ++i2) {
                        float f2 = this.Z.nextFloat() - this.Z.nextFloat();
                        float f3 = this.Z.nextFloat() - this.Z.nextFloat();
                        float f4 = this.Z.nextFloat() - this.Z.nextFloat();
                        this.o.a("bubble", this.s + (double)f2, this.t + (double)f3, this.u + (double)f4, this.v, this.w, this.x);
                    }
                    this.a(qf.e, 2.0f);
                }
            }
            if (!this.o.E && this.al() && this.m instanceof rm) {
                this.a((qr)null);
            }
        } else {
            this.h(300);
        }
        if (this.Y() && this.K()) {
            this.E();
        }
        this.aI = this.aJ;
        if (this.aB > 0) {
            --this.aB;
        }
        if (this.ax > 0) {
            --this.ax;
        }
        if (this.ad > 0 && !(this instanceof mp)) {
            --this.ad;
        }
        if (this.aR() <= 0.0f) {
            this.aE();
        }
        if (this.aS > 0) {
            --this.aS;
        } else {
            this.aR = null;
        }
        if (this.bn != null && !this.bn.Y()) {
            this.bn = null;
        }
        if (this.i != null) {
            if (!this.i.Y()) {
                this.b((rm)null);
            } else if (this.aa - this.bm > 100) {
                this.b((rm)null);
            }
        }
        this.aN();
        this.aY = this.aX;
        this.aN = this.aM;
        this.aP = this.aO;
        this.A = this.y;
        this.B = this.z;
        this.o.C.b();
    }

    public boolean f() {
        return false;
    }

    protected void aE() {
        ++this.aA;
        if (this.aA == 20) {
            int n2;
            if (!this.o.E && (this.aS > 0 || this.aG()) && this.aF() && this.o.O().b("doMobLoot")) {
                int n3;
                for (n2 = this.e(this.aR); n2 > 0; n2 -= n3) {
                    n3 = rh.a(n2);
                    this.o.d(new rh(this.o, this.s, this.t, this.u, n3));
                }
            }
            this.A();
            for (n2 = 0; n2 < 20; ++n2) {
                double d2 = this.Z.nextGaussian() * 0.02;
                double d3 = this.Z.nextGaussian() * 0.02;
                double d4 = this.Z.nextGaussian() * 0.02;
                this.o.a("explode", this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, d2, d3, d4);
            }
        }
    }

    protected boolean aF() {
        return !this.f();
    }

    protected int j(int n2) {
        int n3 = aem.b(this);
        if (n3 > 0 && this.Z.nextInt(n3 + 1) > 0) {
            return n2;
        }
        return n2 - 1;
    }

    protected int e(xq xq2) {
        return 0;
    }

    protected boolean aG() {
        return false;
    }

    public Random aH() {
        return this.Z;
    }

    public rm aI() {
        return this.i;
    }

    public int aJ() {
        return this.bm;
    }

    public void b(rm rm2) {
        this.i = rm2;
        this.bm = this.aa;
    }

    public rm aK() {
        return this.bn;
    }

    public int aL() {
        return this.bo;
    }

    public void l(qr qr2) {
        this.bn = qr2 instanceof rm ? (rm)qr2 : null;
        this.bo = this.aa;
    }

    public int aM() {
        return this.aU;
    }

    @Override
    public void b(dg dg2) {
        dg2.a("HealF", this.aR());
        dg2.a("Health", (short)Math.ceil(this.aR()));
        dg2.a("HurtTime", (short)this.ax);
        dg2.a("DeathTime", (short)this.aA);
        dg2.a("AttackTime", (short)this.aB);
        dg2.a("AbsorptionAmount", this.br());
        for (abu abu2 : this.aj()) {
            if (abu2 == null) continue;
            this.d.a(abu2.D());
        }
        dg2.a("Attributes", xa.a(this.bb()));
        for (abu abu2 : this.aj()) {
            if (abu2 == null) continue;
            this.d.b(abu2.D());
        }
        if (!this.f.isEmpty()) {
            dp dp2 = new dp();
            for (qn qn2 : this.f.values()) {
                dp2.a(qn2.a(new dg()));
            }
            dg2.a("ActiveEffects", dp2);
        }
    }

    @Override
    public void a(dg dg2) {
        du du2;
        this.m(dg2.h("AbsorptionAmount"));
        if (dg2.b("Attributes", 9) && this.o != null && !this.o.E) {
            xa.a(this.bb(), dg2.c("Attributes", 10));
        }
        if (dg2.b("ActiveEffects", 9)) {
            du2 = dg2.c("ActiveEffects", 10);
            for (int i2 = 0; i2 < ((dp)du2).c(); ++i2) {
                dg dg3 = ((dp)du2).b(i2);
                qn qn2 = qn.b(dg3);
                if (qn2 == null) continue;
                this.f.put(qn2.a(), qn2);
            }
        }
        if (dg2.b("HealF", 99)) {
            this.g(dg2.h("HealF"));
        } else {
            du2 = dg2.a("Health");
            if (du2 == null) {
                this.g(this.aX());
            } else if (du2.a() == 5) {
                this.g(((dl)du2).h());
            } else if (du2.a() == 2) {
                this.g((float)((ds)du2).e());
            }
        }
        this.ax = dg2.e("HurtTime");
        this.aA = dg2.e("DeathTime");
        this.aB = dg2.e("AttackTime");
    }

    protected void aN() {
        boolean bl2;
        Iterator iterator = this.f.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n2 = (Integer)iterator.next();
            qn qn2 = (qn)this.f.get(n2);
            if (!qn2.a(this)) {
                if (this.o.E) continue;
                iterator.remove();
                this.b(qn2);
                continue;
            }
            if (qn2.b() % 600 != 0) continue;
            this.a(qn2, false);
        }
        if (this.h) {
            if (!this.o.E) {
                if (this.f.isEmpty()) {
                    this.af.b(8, (byte)0);
                    this.af.b(7, 0);
                    this.d(false);
                } else {
                    int n3 = ade.a(this.f.values());
                    this.af.b(8, ade.b(this.f.values()) ? (byte)1 : 0);
                    this.af.b(7, n3);
                    this.d(this.k(qm.p.H));
                }
            }
            this.h = false;
        }
        int n4 = this.af.c(7);
        boolean bl3 = bl2 = this.af.a(8) > 0;
        if (n4 > 0) {
            boolean bl4 = false;
            if (!this.ao()) {
                bl4 = this.Z.nextBoolean();
            } else {
                boolean bl5 = bl4 = this.Z.nextInt(15) == 0;
            }
            if (bl2) {
                bl4 &= this.Z.nextInt(5) == 0;
            }
            if (bl4 && n4 > 0) {
                double d2 = (double)(n4 >> 16 & 0xFF) / 255.0;
                double d3 = (double)(n4 >> 8 & 0xFF) / 255.0;
                double d4 = (double)(n4 >> 0 & 0xFF) / 255.0;
                this.o.a(bl2 ? "mobSpellAmbient" : "mobSpell", this.s + (this.Z.nextDouble() - 0.5) * (double)this.M, this.t + this.Z.nextDouble() * (double)this.N - (double)this.L, this.u + (this.Z.nextDouble() - 0.5) * (double)this.M, d2, d3, d4);
            }
        }
    }

    public void aO() {
        Iterator iterator = this.f.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n2 = (Integer)iterator.next();
            qn qn2 = (qn)this.f.get(n2);
            if (this.o.E) continue;
            iterator.remove();
            this.b(qn2);
        }
    }

    public Collection aP() {
        return this.f.values();
    }

    public boolean k(int n2) {
        return this.f.containsKey(n2);
    }

    public boolean a(qm qm2) {
        return this.f.containsKey(qm2.H);
    }

    public qn b(qm qm2) {
        return (qn)this.f.get(qm2.H);
    }

    public void c(qn qn2) {
        if (!this.d(qn2)) {
            return;
        }
        if (this.f.containsKey(qn2.a())) {
            ((qn)this.f.get(qn2.a())).a(qn2);
            this.a((qn)this.f.get(qn2.a()), true);
        } else {
            this.f.put(qn2.a(), qn2);
            this.a(qn2);
        }
    }

    public boolean d(qn qn2) {
        int n2;
        return this.bc() != rq.b || (n2 = qn2.a()) != qm.l.H && n2 != qm.u.H;
    }

    public boolean aQ() {
        return this.bc() == rq.b;
    }

    public void l(int n2) {
        this.f.remove(n2);
    }

    public void m(int n2) {
        qn qn2 = (qn)this.f.remove(n2);
        if (qn2 != null) {
            this.b(qn2);
        }
    }

    protected void a(qn qn2) {
        this.h = true;
        if (!this.o.E) {
            qm.a[qn2.a()].b(this, this.bb(), qn2.c());
        }
    }

    protected void a(qn qn2, boolean bl2) {
        this.h = true;
        if (bl2 && !this.o.E) {
            qm.a[qn2.a()].a(this, this.bb(), qn2.c());
            qm.a[qn2.a()].b(this, this.bb(), qn2.c());
        }
    }

    protected void b(qn qn2) {
        this.h = true;
        if (!this.o.E) {
            qm.a[qn2.a()].a(this, this.bb(), qn2.c());
        }
    }

    public void f(float f2) {
        float f3 = this.aR();
        if (f3 > 0.0f) {
            this.g(f3 + f2);
        }
    }

    public final float aR() {
        return this.af.d(6);
    }

    public void g(float f2) {
        this.af.b(6, Float.valueOf(oy.a(f2, 0.0f, this.aX())));
    }

    @Override
    public boolean a(qf qf2, float f2) {
        Object object;
        if (this.av()) {
            return false;
        }
        if (this.o.E) {
            return false;
        }
        this.aU = 0;
        if (this.aR() <= 0.0f) {
            return false;
        }
        if (qf2.o() && this.a(qm.n)) {
            return false;
        }
        if ((qf2 == qf.m || qf2 == qf.n) && this.q(4) != null) {
            this.q(4).a((int)(f2 * 4.0f + this.Z.nextFloat() * f2 * 2.0f), this);
            f2 *= 0.75f;
        }
        this.aF = 1.5f;
        boolean bl2 = true;
        if ((float)this.ad > (float)this.aH / 2.0f) {
            if (f2 <= this.bb) {
                return false;
            }
            this.d(qf2, f2 - this.bb);
            this.bb = f2;
            bl2 = false;
        } else {
            this.bb = f2;
            this.aw = this.aR();
            this.ad = this.aH;
            this.d(qf2, f2);
            this.ay = 10;
            this.ax = 10;
        }
        this.az = 0.0f;
        qr qr2 = qf2.j();
        if (qr2 != null) {
            if (qr2 instanceof rm) {
                this.b((rm)qr2);
            }
            if (qr2 instanceof xq) {
                this.aS = 100;
                this.aR = (xq)qr2;
            } else if (qr2 instanceof vm && ((rx)(object = (vm)qr2)).bZ()) {
                this.aS = 100;
                this.aR = null;
            }
        }
        if (bl2) {
            this.o.a((qr)this, (byte)2);
            if (qf2 != qf.e) {
                this.P();
            }
            if (qr2 != null) {
                double d2 = qr2.s - this.s;
                double d3 = qr2.u - this.u;
                while (d2 * d2 + d3 * d3 < 1.0E-4) {
                    d2 = (Math.random() - Math.random()) * 0.01;
                    d3 = (Math.random() - Math.random()) * 0.01;
                }
                this.az = (float)(Math.atan2(d3, d2) * 180.0 / 3.1415927410125732) - this.y;
                this.a(qr2, f2, d2, d3);
            } else {
                this.az = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (this.aR() <= 0.0f) {
            object = this.aT();
            if (bl2 && object != null) {
                this.a((String)object, this.be(), this.bf());
            }
            this.a(qf2);
        } else {
            object = this.aS();
            if (bl2 && object != null) {
                this.a((String)object, this.be(), this.bf());
            }
        }
        return true;
    }

    public void a(abu abu2) {
        this.a("random.break", 0.8f, 0.8f + this.o.s.nextFloat() * 0.4f);
        for (int i2 = 0; i2 < 5; ++i2) {
            ayp ayp2 = this.o.V().a(((double)this.Z.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            ayp2.a(-this.z * (float)Math.PI / 180.0f);
            ayp2.b(-this.y * (float)Math.PI / 180.0f);
            ayp ayp3 = this.o.V().a(((double)this.Z.nextFloat() - 0.5) * 0.3, (double)(-this.Z.nextFloat()) * 0.6 - 0.3, 0.6);
            ayp3.a(-this.z * (float)Math.PI / 180.0f);
            ayp3.b(-this.y * (float)Math.PI / 180.0f);
            ayp3 = ayp3.c(this.s, this.t + (double)this.g(), this.u);
            this.o.a("iconcrack_" + abs.b(abu2.b()), ayp3.c, ayp3.d, ayp3.e, ayp2.c, ayp2.d + 0.05, ayp2.e);
        }
    }

    public void a(qf qf2) {
        qr qr2 = qf2.j();
        rm rm2 = this.aW();
        if (this.ba >= 0 && rm2 != null) {
            rm2.b(this, this.ba);
        }
        if (qr2 != null) {
            qr2.a(this);
        }
        this.aT = true;
        this.aV().g();
        if (!this.o.E) {
            int n2 = 0;
            if (qr2 instanceof xq) {
                n2 = aem.i((rm)qr2);
            }
            if (this.aF() && this.o.O().b("doMobLoot")) {
                int n3;
                this.b(this.aS > 0, n2);
                this.a(this.aS > 0, n2);
                if (this.aS > 0 && (n3 = this.Z.nextInt(200) - n2) < 5) {
                    this.n(n3 <= 0 ? 1 : 0);
                }
            }
        }
        this.o.a((qr)this, (byte)3);
    }

    protected void a(boolean bl2, int n2) {
    }

    public void a(qr qr2, float f2, double d2, double d3) {
        if (this.Z.nextDouble() < this.a(xa.c).e()) {
            return;
        }
        this.al = true;
        float f3 = oy.a(d2 * d2 + d3 * d3);
        float f4 = 0.4f;
        this.v /= 2.0;
        this.w /= 2.0;
        this.x /= 2.0;
        this.v -= d2 / (double)f3 * (double)f4;
        this.w += (double)f4;
        this.x -= d3 / (double)f3 * (double)f4;
        if (this.w > (double)0.4f) {
            this.w = 0.4f;
        }
    }

    protected String aS() {
        return "game.neutral.hurt";
    }

    protected String aT() {
        return "game.neutral.die";
    }

    protected void n(int n2) {
    }

    protected void b(boolean bl2, int n2) {
    }

    public boolean h_() {
        int n2;
        int n3;
        int n4 = oy.c(this.s);
        ahz ahz2 = this.o.a(n4, n3 = oy.c(this.C.b), n2 = oy.c(this.u));
        return ahz2 == aie.ap || ahz2 == aie.bd;
    }

    @Override
    public boolean Y() {
        return !this.K && this.aR() > 0.0f;
    }

    @Override
    protected void b(float f2) {
        super.b(f2);
        qn qn2 = this.b(qm.j);
        float f3 = qn2 != null ? (float)(qn2.c() + 1) : 0.0f;
        int n2 = oy.f(f2 - 3.0f - f3);
        if (n2 > 0) {
            this.a(this.o(n2), 1.0f, 1.0f);
            this.a(qf.h, (float)n2);
            int n3 = oy.c(this.s);
            int n4 = oy.c(this.t - (double)0.2f - (double)this.L);
            int n5 = oy.c(this.u);
            ahz ahz2 = this.o.a(n3, n4, n5);
            if (ahz2.o() != avk.a) {
                aid aid2 = ahz2.H;
                this.a(aid2.e(), aid2.c() * 0.5f, aid2.d() * 0.75f);
            }
        }
    }

    protected String o(int n2) {
        if (n2 > 4) {
            return "game.neutral.hurt.fall.big";
        }
        return "game.neutral.hurt.fall.small";
    }

    @Override
    public void ai() {
        this.ay = 10;
        this.ax = 10;
        this.az = 0.0f;
    }

    public int aU() {
        int n2 = 0;
        for (abu abu2 : this.aj()) {
            if (abu2 == null || !(abu2.b() instanceof zs)) continue;
            int n3 = ((zs)abu2.b()).c;
            n2 += n3;
        }
        return n2;
    }

    protected void h(float f2) {
    }

    protected float b(qf qf2, float f2) {
        if (!qf2.e()) {
            int n2 = 25 - this.aU();
            float f3 = f2 * (float)n2;
            this.h(f2);
            f2 = f3 / 25.0f;
        }
        return f2;
    }

    protected float c(qf qf2, float f2) {
        float f3;
        int n2;
        int n3;
        if (qf2.h()) {
            return f2;
        }
        if (this instanceof xh) {
            // empty if block
        }
        if (this.a(qm.m) && qf2 != qf.i) {
            n3 = (this.b(qm.m).c() + 1) * 5;
            n2 = 25 - n3;
            f3 = f2 * (float)n2;
            f2 = f3 / 25.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        n3 = aem.a(this.aj(), qf2);
        if (n3 > 20) {
            n3 = 20;
        }
        if (n3 > 0 && n3 <= 20) {
            n2 = 25 - n3;
            f3 = f2 * (float)n2;
            f2 = f3 / 25.0f;
        }
        return f2;
    }

    protected void d(qf qf2, float f2) {
        if (this.av()) {
            return;
        }
        f2 = this.b(qf2, f2);
        float f3 = f2 = this.c(qf2, f2);
        f2 = Math.max(f2 - this.br(), 0.0f);
        this.m(this.br() - (f3 - f2));
        if (f2 == 0.0f) {
            return;
        }
        float f4 = this.aR();
        this.g(f4 - f2);
        this.aV().a(qf2, f4, f2);
        this.m(this.br() - f2);
    }

    public qe aV() {
        return this.e;
    }

    public rm aW() {
        if (this.e.c() != null) {
            return this.e.c();
        }
        if (this.aR != null) {
            return this.aR;
        }
        if (this.i != null) {
            return this.i;
        }
        return null;
    }

    public final float aX() {
        return (float)this.a(xa.a).e();
    }

    public final int aY() {
        return this.af.a(9);
    }

    public final void p(int n2) {
        this.af.b(9, (byte)n2);
    }

    private int j() {
        if (this.a(qm.e)) {
            return 6 - (1 + this.b(qm.e).c()) * 1;
        }
        if (this.a(qm.f)) {
            return 6 + (1 + this.b(qm.f).c()) * 2;
        }
        return 6;
    }

    public void aZ() {
        if (!this.at || this.au >= this.j() / 2 || this.au < 0) {
            this.au = -1;
            this.at = true;
            if (this.o instanceof mm) {
                ((mm)this.o).r().a(this, new ft(this, 0));
            }
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 2) {
            this.aF = 1.5f;
            this.ad = this.aH;
            this.ay = 10;
            this.ax = 10;
            this.az = 0.0f;
            this.a(this.aS(), this.be(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f);
            this.a(qf.j, 0.0f);
        } else if (by2 == 3) {
            this.a(this.aT(), this.be(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f);
            this.g(0.0f);
            this.a(qf.j);
        } else {
            super.a(by2);
        }
    }

    @Override
    protected void F() {
        this.a(qf.i, 4.0f);
    }

    protected void ba() {
        int n2 = this.j();
        if (this.at) {
            ++this.au;
            if (this.au >= n2) {
                this.au = 0;
                this.at = false;
            }
        } else {
            this.au = 0;
        }
        this.aD = (float)this.au / (float)n2;
    }

    public rz a(ry ry2) {
        return this.bb().a(ry2);
    }

    public sc bb() {
        if (this.d == null) {
            this.d = new sh();
        }
        return this.d;
    }

    public rq bc() {
        return rq.a;
    }

    public abstract abu bd();

    public abstract abu q(int var1);

    @Override
    public abstract void c(int var1, abu var2);

    @Override
    public void c(boolean bl2) {
        super.c(bl2);
        rz rz2 = this.a(xa.d);
        if (rz2.a(b) != null) {
            rz2.b(c);
        }
        if (bl2) {
            rz2.a(c);
        }
    }

    @Override
    public abstract abu[] aj();

    protected float be() {
        return 1.0f;
    }

    protected float bf() {
        if (this.f()) {
            return (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.5f;
        }
        return (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f;
    }

    protected boolean bg() {
        return this.aR() <= 0.0f;
    }

    public void a(double d2, double d3, double d4) {
        this.b(d2, d3, d4, this.y, this.z);
    }

    public void m(qr qr2) {
        double d2 = qr2.s;
        double d3 = qr2.C.b + (double)qr2.N;
        double d4 = qr2.u;
        int n2 = 1;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 < n2; ++i3) {
                if (i2 == 0 && i3 == 0) continue;
                int n3 = (int)(this.s + (double)i2);
                int n4 = (int)(this.u + (double)i3);
                ayk ayk2 = this.C.c(i2, 1.0, i3);
                if (!this.o.a(ayk2).isEmpty()) continue;
                if (afs.a(this.o, n3, (int)this.t, n4)) {
                    this.a(this.s + (double)i2, this.t + 1.0, this.u + (double)i3);
                    return;
                }
                if (!afs.a(this.o, n3, (int)this.t - 1, n4) && this.o.a(n3, (int)this.t - 1, n4).o() != avk.h) continue;
                d2 = this.s + (double)i2;
                d3 = this.t + 1.0;
                d4 = this.u + (double)i3;
            }
        }
        this.a(d2, d3, d4);
    }

    public boolean bh() {
        return false;
    }

    public pw b(abu abu2, int n2) {
        if (abu2.b().b()) {
            return abu2.b().a(abu2.k(), n2);
        }
        return abu2.c();
    }

    protected void bi() {
        this.w = 0.42f;
        if (this.a(qm.j)) {
            this.w += (double)((float)(this.b(qm.j).c() + 1) * 0.1f);
        }
        if (this.an()) {
            float f2 = this.y * ((float)Math.PI / 180);
            this.v -= (double)(oy.a(f2) * 0.2f);
            this.x += (double)(oy.b(f2) * 0.2f);
        }
        this.al = true;
    }

    public void e(float f2, float f3) {
        if (!(!this.L() || this instanceof xq && ((xq)this).bE.b)) {
            double d2 = this.t;
            this.a(f2, f3, this.bj() ? 0.04f : 0.02f);
            this.d(this.v, this.w, this.x);
            this.v *= (double)0.8f;
            this.w *= (double)0.8f;
            this.x *= (double)0.8f;
            this.w -= 0.02;
            if (this.E && this.c(this.v, this.w + (double)0.6f - this.t + d2, this.x)) {
                this.w = 0.3f;
            }
        } else if (!(!this.O() || this instanceof xq && ((xq)this).bE.b)) {
            double d3 = this.t;
            this.a(f2, f3, 0.02f);
            this.d(this.v, this.w, this.x);
            this.v *= 0.5;
            this.w *= 0.5;
            this.x *= 0.5;
            this.w -= 0.02;
            if (this.E && this.c(this.v, this.w + (double)0.6f - this.t + d3, this.x)) {
                this.w = 0.3f;
            }
        } else {
            float f4 = 0.91f;
            if (this.D) {
                f4 = this.o.a((int)oy.c((double)this.s), (int)(oy.c((double)this.C.b) - 1), (int)oy.c((double)this.u)).K * 0.91f;
            }
            float f5 = 0.16277136f / (f4 * f4 * f4);
            float f6 = this.D ? this.bk() * f5 : this.aQ;
            this.a(f2, f3, f6);
            f4 = 0.91f;
            if (this.D) {
                f4 = this.o.a((int)oy.c((double)this.s), (int)(oy.c((double)this.C.b) - 1), (int)oy.c((double)this.u)).K * 0.91f;
            }
            if (this.h_()) {
                boolean bl2;
                float f7 = 0.15f;
                if (this.v < (double)(-f7)) {
                    this.v = -f7;
                }
                if (this.v > (double)f7) {
                    this.v = f7;
                }
                if (this.x < (double)(-f7)) {
                    this.x = -f7;
                }
                if (this.x > (double)f7) {
                    this.x = f7;
                }
                this.R = 0.0f;
                if (this.w < -0.15) {
                    this.w = -0.15;
                }
                boolean bl3 = bl2 = this.am() && this instanceof xq;
                if (bl2 && this.w < 0.0) {
                    this.w = 0.0;
                }
            }
            this.d(this.v, this.w, this.x);
            if (this.E && this.h_()) {
                this.w = 0.2;
            }
            this.w = !this.o.E || this.o.d((int)this.s, 0, (int)this.u) && this.o.d((int)((int)this.s), (int)((int)this.u)).d ? (this.w -= 0.08) : (this.t > 0.0 ? -0.1 : 0.0);
            this.w *= (double)0.98f;
            this.v *= (double)f4;
            this.x *= (double)f4;
        }
        this.aE = this.aF;
        double d4 = this.s - this.p;
        double d5 = this.u - this.r;
        float f8 = oy.a(d4 * d4 + d5 * d5) * 4.0f;
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        this.aF += (f8 - this.aF) * 0.4f;
        this.aG += this.aF;
    }

    protected boolean bj() {
        return false;
    }

    public float bk() {
        if (this.bj()) {
            return this.bp;
        }
        return 0.1f;
    }

    public void i(float f2) {
        this.bp = f2;
    }

    public boolean n(qr qr2) {
        this.l(qr2);
        return false;
    }

    public boolean bl() {
        return false;
    }

    @Override
    public void h() {
        super.h();
        if (!this.o.E) {
            int n2 = this.aY();
            if (n2 > 0) {
                if (this.av <= 0) {
                    this.av = 20 * (30 - n2);
                }
                --this.av;
                if (this.av <= 0) {
                    this.p(n2 - 1);
                }
            }
            for (int i2 = 0; i2 < 5; ++i2) {
                abu abu2 = this.g[i2];
                abu abu3 = this.q(i2);
                if (abu.b(abu3, abu2)) continue;
                ((mm)this.o).r().a(this, new hq(this.x(), i2, abu3));
                if (abu2 != null) {
                    this.d.a(abu2.D());
                }
                if (abu3 != null) {
                    this.d.b(abu3.D());
                }
                this.g[i2] = abu3 == null ? null : abu3.m();
            }
            if (this.aa % 20 == 0) {
                this.aV().g();
            }
        }
        this.e();
        double d2 = this.s - this.p;
        double d3 = this.u - this.r;
        float f2 = (float)(d2 * d2 + d3 * d3);
        float f3 = this.aM;
        float f4 = 0.0f;
        this.aV = this.aW;
        float f5 = 0.0f;
        if (f2 > 0.0025000002f) {
            f5 = 1.0f;
            f4 = (float)Math.sqrt(f2) * 3.0f;
            f3 = (float)Math.atan2(d3, d2) * 180.0f / (float)Math.PI - 90.0f;
        }
        if (this.aD > 0.0f) {
            f3 = this.y;
        }
        if (!this.D) {
            f5 = 0.0f;
        }
        this.aW += (f5 - this.aW) * 0.3f;
        this.o.C.a("headTurn");
        f4 = this.f(f3, f4);
        this.o.C.b();
        this.o.C.a("rangeChecks");
        while (this.y - this.A < -180.0f) {
            this.A -= 360.0f;
        }
        while (this.y - this.A >= 180.0f) {
            this.A += 360.0f;
        }
        while (this.aM - this.aN < -180.0f) {
            this.aN -= 360.0f;
        }
        while (this.aM - this.aN >= 180.0f) {
            this.aN += 360.0f;
        }
        while (this.z - this.B < -180.0f) {
            this.B -= 360.0f;
        }
        while (this.z - this.B >= 180.0f) {
            this.B += 360.0f;
        }
        while (this.aO - this.aP < -180.0f) {
            this.aP -= 360.0f;
        }
        while (this.aO - this.aP >= 180.0f) {
            this.aP += 360.0f;
        }
        this.o.C.b();
        this.aX += f4;
    }

    protected float f(float f2, float f3) {
        boolean bl2;
        float f4 = oy.g(f2 - this.aM);
        this.aM += f4 * 0.3f;
        float f5 = oy.g(this.y - this.aM);
        boolean bl3 = bl2 = f5 < -90.0f || f5 >= 90.0f;
        if (f5 < -75.0f) {
            f5 = -75.0f;
        }
        if (f5 >= 75.0f) {
            f5 = 75.0f;
        }
        this.aM = this.y - f5;
        if (f5 * f5 > 2500.0f) {
            this.aM += f5 * 0.2f;
        }
        if (bl2) {
            f3 *= -1.0f;
        }
        return f3;
    }

    public void e() {
        if (this.bq > 0) {
            --this.bq;
        }
        if (this.bg > 0) {
            double d2 = this.s + (this.bh - this.s) / (double)this.bg;
            double d3 = this.t + (this.bi - this.t) / (double)this.bg;
            double d4 = this.u + (this.bj - this.u) / (double)this.bg;
            double d5 = oy.g(this.bk - (double)this.y);
            this.y = (float)((double)this.y + d5 / (double)this.bg);
            this.z = (float)((double)this.z + (this.bl - (double)this.z) / (double)this.bg);
            --this.bg;
            this.b(d2, d3, d4);
            this.b(this.y, this.z);
        } else if (!this.bq()) {
            this.v *= 0.98;
            this.w *= 0.98;
            this.x *= 0.98;
        }
        if (Math.abs(this.v) < 0.005) {
            this.v = 0.0;
        }
        if (Math.abs(this.w) < 0.005) {
            this.w = 0.0;
        }
        if (Math.abs(this.x) < 0.005) {
            this.x = 0.0;
        }
        this.o.C.a("ai");
        if (this.bg()) {
            this.bc = false;
            this.bd = 0.0f;
            this.be = 0.0f;
            this.bf = 0.0f;
        } else if (this.bq()) {
            if (this.bj()) {
                this.o.C.a("newAi");
                this.bm();
                this.o.C.b();
            } else {
                this.o.C.a("oldAi");
                this.bp();
                this.o.C.b();
                this.aO = this.y;
            }
        }
        this.o.C.b();
        this.o.C.a("jump");
        if (this.bc) {
            if (this.L() || this.O()) {
                this.w += (double)0.04f;
            } else if (this.D && this.bq == 0) {
                this.bi();
                this.bq = 10;
            }
        } else {
            this.bq = 0;
        }
        this.o.C.b();
        this.o.C.a("travel");
        this.bd *= 0.98f;
        this.be *= 0.98f;
        this.bf *= 0.9f;
        this.e(this.bd, this.be);
        this.o.C.b();
        this.o.C.a("push");
        if (!this.o.E) {
            this.bn();
        }
        this.o.C.b();
    }

    protected void bm() {
    }

    protected void bn() {
        List list = this.o.b((qr)this, this.C.b(0.2f, 0.0, 0.2f));
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                qr qr2 = (qr)list.get(i2);
                if (!qr2.R()) continue;
                this.o(qr2);
            }
        }
    }

    protected void o(qr qr2) {
        qr2.g(this);
    }

    @Override
    public void aa() {
        super.aa();
        this.aV = this.aW;
        this.aW = 0.0f;
        this.R = 0.0f;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2) {
        this.L = 0.0f;
        this.bh = d2;
        this.bi = d3;
        this.bj = d4;
        this.bk = f2;
        this.bl = f3;
        this.bg = n2;
    }

    protected void bo() {
    }

    protected void bp() {
        ++this.aU;
    }

    public void f(boolean bl2) {
        this.bc = bl2;
    }

    public void a(qr qr2, int n2) {
        if (!qr2.K && !this.o.E) {
            mg mg2 = ((mm)this.o).r();
            if (qr2 instanceof wb) {
                mg2.a(qr2, new hz(qr2.x(), this.x()));
            }
            if (qr2 instanceof xt) {
                mg2.a(qr2, new hz(qr2.x(), this.x()));
            }
            if (qr2 instanceof rh) {
                mg2.a(qr2, new hz(qr2.x(), this.x()));
            }
        }
    }

    public boolean p(qr qr2) {
        return this.o.a(this.o.V().a(this.s, this.t + (double)this.g(), this.u), this.o.V().a(qr2.s, qr2.t + (double)qr2.g(), qr2.u)) == null;
    }

    @Override
    public ayp af() {
        return this.j(1.0f);
    }

    public ayp j(float f2) {
        if (f2 == 1.0f) {
            float f3 = oy.b(-this.y * ((float)Math.PI / 180) - (float)Math.PI);
            float f4 = oy.a(-this.y * ((float)Math.PI / 180) - (float)Math.PI);
            float f5 = -oy.b(-this.z * ((float)Math.PI / 180));
            float f6 = oy.a(-this.z * ((float)Math.PI / 180));
            return this.o.V().a(f4 * f5, f6, f3 * f5);
        }
        float f7 = this.B + (this.z - this.B) * f2;
        float f8 = this.A + (this.y - this.A) * f2;
        float f9 = oy.b(-f8 * ((float)Math.PI / 180) - (float)Math.PI);
        float f10 = oy.a(-f8 * ((float)Math.PI / 180) - (float)Math.PI);
        float f11 = -oy.b(-f7 * ((float)Math.PI / 180));
        float f12 = oy.a(-f7 * ((float)Math.PI / 180));
        return this.o.V().a(f10 * f11, f12, f9 * f11);
    }

    public float k(float f2) {
        float f3 = this.aD - this.aC;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        return this.aC + f3 * f2;
    }

    public ayp l(float f2) {
        if (f2 == 1.0f) {
            return this.o.V().a(this.s, this.t, this.u);
        }
        double d2 = this.p + (this.s - this.p) * (double)f2;
        double d3 = this.q + (this.t - this.q) * (double)f2;
        double d4 = this.r + (this.u - this.r) * (double)f2;
        return this.o.V().a(d2, d3, d4);
    }

    public ayn a(double d2, float f2) {
        ayp ayp2 = this.l(f2);
        ayp ayp3 = this.j(f2);
        ayp ayp4 = ayp2.c(ayp3.c * d2, ayp3.d * d2, ayp3.e * d2);
        return this.o.a(ayp2, ayp4, false, false, true);
    }

    public boolean bq() {
        return !this.o.E;
    }

    @Override
    public boolean Q() {
        return !this.K;
    }

    @Override
    public boolean R() {
        return !this.K;
    }

    @Override
    public float g() {
        return this.N * 0.85f;
    }

    @Override
    protected void P() {
        this.H = this.Z.nextDouble() >= this.a(xa.c).e();
    }

    @Override
    public float at() {
        return this.aO;
    }

    @Override
    public void e(float f2) {
        this.aO = f2;
    }

    public float br() {
        return this.br;
    }

    public void m(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.br = f2;
    }

    public ayy bs() {
        return null;
    }

    public boolean c(rm rm2) {
        return this.a(rm2.bs());
    }

    public boolean a(ayy ayy2) {
        if (this.bs() != null) {
            return this.bs().a(ayy2);
        }
        return false;
    }

    public void bt() {
    }

    public void bu() {
    }
}

