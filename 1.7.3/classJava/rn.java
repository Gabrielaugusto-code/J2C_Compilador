/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.UUID;

public abstract class rn
extends rm {
    public int a_;
    protected int b;
    private sl h;
    private sm i;
    private sk bm;
    private si bn;
    private um bo;
    protected final ta c;
    protected final ta d;
    private rm bp;
    private un bq;
    private abu[] br = new abu[5];
    protected float[] e = new float[5];
    private boolean bs;
    private boolean bt;
    protected float f;
    private qr bu;
    protected int g;
    private boolean bv;
    private qr bw;
    private dg bx;

    public rn(afs afs2) {
        super(afs2);
        this.c = new ta(afs2 == null || afs2.C == null ? null : afs2.C);
        this.d = new ta(afs2 == null || afs2.C == null ? null : afs2.C);
        this.h = new sl(this);
        this.i = new sm(this);
        this.bm = new sk(this);
        this.bn = new si(this);
        this.bo = new um(this, afs2);
        this.bq = new un(this);
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            this.e[i2] = 0.085f;
        }
    }

    @Override
    protected void aC() {
        super.aC();
        this.bb().b(xa.b).a(16.0);
    }

    public sl j() {
        return this.h;
    }

    public sm k() {
        return this.i;
    }

    public sk l() {
        return this.bm;
    }

    public um m() {
        return this.bo;
    }

    public un n() {
        return this.bq;
    }

    public rm o() {
        return this.bp;
    }

    public void d(rm rm2) {
        this.bp = rm2;
    }

    public boolean a(Class clazz) {
        return wq.class != clazz && wu.class != clazz;
    }

    public void p() {
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(11, (Object)0);
        this.af.a(10, "");
    }

    public int q() {
        return 80;
    }

    public void r() {
        String string = this.t();
        if (string != null) {
            this.a(string, this.be(), this.bf());
        }
    }

    @Override
    public void B() {
        super.B();
        this.o.C.a("mobBaseTick");
        if (this.Y() && this.Z.nextInt(1000) < this.a_++) {
            this.a_ = -this.q();
            this.r();
        }
        this.o.C.b();
    }

    @Override
    protected int e(xq xq2) {
        if (this.b > 0) {
            int n2 = this.b;
            abu[] abuArray = this.aj();
            for (int i2 = 0; i2 < abuArray.length; ++i2) {
                if (abuArray[i2] == null || !(this.e[i2] <= 1.0f)) continue;
                n2 += 1 + this.Z.nextInt(3);
            }
            return n2;
        }
        return this.b;
    }

    public void s() {
        for (int i2 = 0; i2 < 20; ++i2) {
            double d2 = this.Z.nextGaussian() * 0.02;
            double d3 = this.Z.nextGaussian() * 0.02;
            double d4 = this.Z.nextGaussian() * 0.02;
            double d5 = 10.0;
            this.o.a("explode", this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M - d2 * d5, this.t + (double)(this.Z.nextFloat() * this.N) - d3 * d5, this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M - d4 * d5, d2, d3, d4);
        }
    }

    @Override
    public void h() {
        super.h();
        if (!this.o.E) {
            this.bL();
        }
    }

    @Override
    protected float f(float f2, float f3) {
        if (this.bj()) {
            this.bn.a();
            return f3;
        }
        return super.f(f2, f3);
    }

    protected String t() {
        return null;
    }

    protected abs u() {
        return abs.d(0);
    }

    @Override
    protected void b(boolean bl2, int n2) {
        abs abs2 = this.u();
        if (abs2 != null) {
            int n3 = this.Z.nextInt(3);
            if (n2 > 0) {
                n3 += this.Z.nextInt(n2 + 1);
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(abs2, 1);
            }
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("CanPickUpLoot", this.bJ());
        dg2.a("PersistenceRequired", this.bt);
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.br.length; ++i2) {
            dg dg3 = new dg();
            if (this.br[i2] != null) {
                this.br[i2].b(dg3);
            }
            dp2.a(dg3);
        }
        dg2.a("Equipment", dp2);
        dp dp3 = new dp();
        for (int i3 = 0; i3 < this.e.length; ++i3) {
            dp3.a(new dl(this.e[i3]));
        }
        dg2.a("DropChances", dp3);
        dg2.a("CustomName", this.bG());
        dg2.a("CustomNameVisible", this.bI());
        dg2.a("Leashed", this.bv);
        if (this.bw != null) {
            dg dg4 = new dg();
            if (this.bw instanceof rm) {
                dg4.a("UUIDMost", this.bw.aA().getMostSignificantBits());
                dg4.a("UUIDLeast", this.bw.aA().getLeastSignificantBits());
            } else if (this.bw instanceof rj) {
                rj rj2 = (rj)this.bw;
                dg4.a("X", rj2.b);
                dg4.a("Y", rj2.c);
                dg4.a("Z", rj2.d);
            }
            dg2.a("Leash", dg4);
        }
    }

    @Override
    public void a(dg dg2) {
        int n2;
        dp dp2;
        super.a(dg2);
        this.h(dg2.n("CanPickUpLoot"));
        this.bt = dg2.n("PersistenceRequired");
        if (dg2.b("CustomName", 8) && dg2.j("CustomName").length() > 0) {
            this.a(dg2.j("CustomName"));
        }
        this.g(dg2.n("CustomNameVisible"));
        if (dg2.b("Equipment", 9)) {
            dp2 = dg2.c("Equipment", 10);
            for (n2 = 0; n2 < this.br.length; ++n2) {
                this.br[n2] = abu.a(dp2.b(n2));
            }
        }
        if (dg2.b("DropChances", 9)) {
            dp2 = dg2.c("DropChances", 5);
            for (n2 = 0; n2 < dp2.c(); ++n2) {
                this.e[n2] = dp2.e(n2);
            }
        }
        this.bv = dg2.n("Leashed");
        if (this.bv && dg2.b("Leash", 10)) {
            this.bx = dg2.m("Leash");
        }
    }

    public void n(float f2) {
        this.be = f2;
    }

    @Override
    public void i(float f2) {
        super.i(f2);
        this.n(f2);
    }

    @Override
    public void e() {
        super.e();
        this.o.C.a("looting");
        if (!this.o.E && this.bJ() && !this.aT && this.o.O().b("mobGriefing")) {
            List list = this.o.a(wb.class, this.C.b(1.0, 0.0, 1.0));
            for (wb wb2 : list) {
                Object object;
                abu abu2;
                int n2;
                if (wb2.K || wb2.f() == null || (n2 = rn.b(abu2 = wb2.f())) <= -1) continue;
                boolean bl2 = true;
                abu abu3 = this.q(n2);
                if (abu3 != null) {
                    abs abs2;
                    if (n2 == 0) {
                        if (abu2.b() instanceof acy && !(abu3.b() instanceof acy)) {
                            bl2 = true;
                        } else if (abu2.b() instanceof acy && abu3.b() instanceof acy) {
                            object = (acy)abu2.b();
                            abs2 = (acy)abu3.b();
                            bl2 = ((acy)object).i() == ((acy)abs2).i() ? abu2.k() > abu3.k() || abu2.p() && !abu3.p() : ((acy)object).i() > ((acy)abs2).i();
                        } else {
                            bl2 = false;
                        }
                    } else if (abu2.b() instanceof zs && !(abu3.b() instanceof zs)) {
                        bl2 = true;
                    } else if (abu2.b() instanceof zs && abu3.b() instanceof zs) {
                        object = (zs)abu2.b();
                        abs2 = (zs)abu3.b();
                        bl2 = ((zs)object).c == ((zs)abs2).c ? abu2.k() > abu3.k() || abu2.p() && !abu3.p() : ((zs)object).c > ((zs)abs2).c;
                    } else {
                        bl2 = false;
                    }
                }
                if (!bl2) continue;
                if (abu3 != null && this.Z.nextFloat() - 0.1f < this.e[n2]) {
                    this.a(abu3, 0.0f);
                }
                if (abu2.b() == abv.i && wb2.j() != null && (object = this.o.a(wb2.j())) != null) {
                    ((xq)object).a(nt.x);
                }
                this.c(n2, abu2);
                this.e[n2] = 2.0f;
                this.bt = true;
                this.a((qr)wb2, 1);
                wb2.A();
            }
        }
        this.o.C.b();
    }

    @Override
    protected boolean bj() {
        return false;
    }

    protected boolean v() {
        return true;
    }

    protected void w() {
        if (this.bt) {
            this.aU = 0;
            return;
        }
        xq xq2 = this.o.a((qr)this, -1.0);
        if (xq2 != null) {
            double d2 = xq2.s - this.s;
            double d3 = xq2.t - this.t;
            double d4 = xq2.u - this.u;
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            if (this.v() && d5 > 16384.0) {
                this.A();
            }
            if (this.aU > 600 && this.Z.nextInt(800) == 0 && d5 > 1024.0 && this.v()) {
                this.A();
            } else if (d5 < 1024.0) {
                this.aU = 0;
            }
        }
    }

    @Override
    protected void bm() {
        ++this.aU;
        this.o.C.a("checkDespawn");
        this.w();
        this.o.C.b();
        this.o.C.a("sensing");
        this.bq.a();
        this.o.C.b();
        this.o.C.a("targetSelector");
        this.d.a();
        this.o.C.b();
        this.o.C.a("goalSelector");
        this.c.a();
        this.o.C.b();
        this.o.C.a("navigation");
        this.bo.f();
        this.o.C.b();
        this.o.C.a("mob tick");
        this.bo();
        this.o.C.b();
        this.o.C.a("controls");
        this.o.C.a("move");
        this.i.c();
        this.o.C.c("look");
        this.h.a();
        this.o.C.c("jump");
        this.bm.b();
        this.o.C.b();
        this.o.C.b();
    }

    @Override
    protected void bp() {
        super.bp();
        this.bd = 0.0f;
        this.be = 0.0f;
        this.w();
        float f2 = 8.0f;
        if (this.Z.nextFloat() < 0.02f) {
            xq xq2 = this.o.a((qr)this, (double)f2);
            if (xq2 != null) {
                this.bu = xq2;
                this.g = 10 + this.Z.nextInt(20);
            } else {
                this.bf = (this.Z.nextFloat() - 0.5f) * 20.0f;
            }
        }
        if (this.bu != null) {
            this.a(this.bu, 10.0f, (float)this.bv());
            if (this.g-- <= 0 || this.bu.K || this.bu.f(this) > (double)(f2 * f2)) {
                this.bu = null;
            }
        } else {
            if (this.Z.nextFloat() < 0.05f) {
                this.bf = (this.Z.nextFloat() - 0.5f) * 20.0f;
            }
            this.y += this.bf;
            this.z = this.f;
        }
        boolean bl2 = this.L();
        boolean bl3 = this.O();
        if (bl2 || bl3) {
            this.bc = this.Z.nextFloat() < 0.8f;
        }
    }

    public int bv() {
        return 40;
    }

    public void a(qr qr2, float f2, float f3) {
        double d2;
        double d3 = qr2.s - this.s;
        double d4 = qr2.u - this.u;
        if (qr2 instanceof rm) {
            rm rm2 = (rm)qr2;
            d2 = rm2.t + (double)rm2.g() - (this.t + (double)this.g());
        } else {
            d2 = (qr2.C.b + qr2.C.e) / 2.0 - (this.t + (double)this.g());
        }
        double d5 = oy.a(d3 * d3 + d4 * d4);
        float f4 = (float)(Math.atan2(d4, d3) * 180.0 / 3.1415927410125732) - 90.0f;
        float f5 = (float)(-(Math.atan2(d2, d5) * 180.0 / 3.1415927410125732));
        this.z = this.b(this.z, f5, f3);
        this.y = this.b(this.y, f4, f2);
    }

    private float b(float f2, float f3, float f4) {
        float f5 = oy.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    public boolean by() {
        return this.o.b(this.C) && this.o.a((qr)this, this.C).isEmpty() && !this.o.d(this.C);
    }

    public float bz() {
        return 1.0f;
    }

    public int bB() {
        return 4;
    }

    @Override
    public int aw() {
        if (this.o() == null) {
            return 3;
        }
        int n2 = (int)(this.aR() - this.aX() * 0.33f);
        if ((n2 -= (3 - this.o.r.a()) * 4) < 0) {
            n2 = 0;
        }
        return n2 + 3;
    }

    @Override
    public abu bd() {
        return this.br[0];
    }

    @Override
    public abu q(int n2) {
        return this.br[n2];
    }

    public abu r(int n2) {
        return this.br[n2 + 1];
    }

    @Override
    public void c(int n2, abu abu2) {
        this.br[n2] = abu2;
    }

    @Override
    public abu[] aj() {
        return this.br;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        for (int i2 = 0; i2 < this.aj().length; ++i2) {
            boolean bl3;
            abu abu2 = this.q(i2);
            boolean bl4 = bl3 = this.e[i2] > 1.0f;
            if (abu2 == null || !bl2 && !bl3 || !(this.Z.nextFloat() - (float)n2 * 0.01f < this.e[i2])) continue;
            if (!bl3 && abu2.g()) {
                int n3 = Math.max(abu2.l() - 25, 1);
                int n4 = abu2.l() - this.Z.nextInt(this.Z.nextInt(n3) + 1);
                if (n4 > n3) {
                    n4 = n3;
                }
                if (n4 < 1) {
                    n4 = 1;
                }
                abu2.b(n4);
            }
            this.a(abu2, 0.0f);
        }
    }

    protected void bC() {
        if (this.Z.nextFloat() < 0.15f * this.o.b(this.s, this.t, this.u)) {
            float f2;
            int n2 = this.Z.nextInt(2);
            float f3 = f2 = this.o.r == pu.d ? 0.1f : 0.25f;
            if (this.Z.nextFloat() < 0.095f) {
                ++n2;
            }
            if (this.Z.nextFloat() < 0.095f) {
                ++n2;
            }
            if (this.Z.nextFloat() < 0.095f) {
                ++n2;
            }
            for (int i2 = 3; i2 >= 0; --i2) {
                abs abs2;
                abu abu2 = this.r(i2);
                if (i2 < 3 && this.Z.nextFloat() < f2) break;
                if (abu2 != null || (abs2 = rn.a(i2 + 1, n2)) == null) continue;
                this.c(i2 + 1, new abu(abs2));
            }
        }
    }

    public static int b(abu abu2) {
        if (abu2.b() == abs.a(aie.aK) || abu2.b() == abv.bL) {
            return 4;
        }
        if (abu2.b() instanceof zs) {
            switch (((zs)abu2.b()).b) {
                case 3: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                case 1: {
                    return 3;
                }
                case 0: {
                    return 4;
                }
            }
        }
        return 0;
    }

    public static abs a(int n2, int n3) {
        switch (n2) {
            case 4: {
                if (n3 == 0) {
                    return abv.Q;
                }
                if (n3 == 1) {
                    return abv.ag;
                }
                if (n3 == 2) {
                    return abv.U;
                }
                if (n3 == 3) {
                    return abv.Y;
                }
                if (n3 == 4) {
                    return abv.ac;
                }
            }
            case 3: {
                if (n3 == 0) {
                    return abv.R;
                }
                if (n3 == 1) {
                    return abv.ah;
                }
                if (n3 == 2) {
                    return abv.V;
                }
                if (n3 == 3) {
                    return abv.Z;
                }
                if (n3 == 4) {
                    return abv.ad;
                }
            }
            case 2: {
                if (n3 == 0) {
                    return abv.S;
                }
                if (n3 == 1) {
                    return abv.ai;
                }
                if (n3 == 2) {
                    return abv.W;
                }
                if (n3 == 3) {
                    return abv.aa;
                }
                if (n3 == 4) {
                    return abv.ae;
                }
            }
            case 1: {
                if (n3 == 0) {
                    return abv.T;
                }
                if (n3 == 1) {
                    return abv.aj;
                }
                if (n3 == 2) {
                    return abv.X;
                }
                if (n3 == 3) {
                    return abv.ab;
                }
                if (n3 != 4) break;
                return abv.af;
            }
        }
        return null;
    }

    protected void bD() {
        float f2 = this.o.b(this.s, this.t, this.u);
        if (this.bd() != null && this.Z.nextFloat() < 0.25f * f2) {
            aem.a(this.Z, this.bd(), (int)(5.0f + f2 * (float)this.Z.nextInt(18)));
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            abu abu2 = this.r(i2);
            if (abu2 == null || !(this.Z.nextFloat() < 0.5f * f2)) continue;
            aem.a(this.Z, abu2, (int)(5.0f + f2 * (float)this.Z.nextInt(18)));
        }
    }

    public rp a(rp rp2) {
        this.a(xa.b).a(new sa("Random spawn bonus", this.Z.nextGaussian() * 0.05, 1));
        return rp2;
    }

    public boolean bE() {
        return false;
    }

    @Override
    public String b_() {
        if (this.bH()) {
            return this.bG();
        }
        return super.b_();
    }

    public void bF() {
        this.bt = true;
    }

    public void a(String string) {
        this.af.b(10, string);
    }

    public String bG() {
        return this.af.e(10);
    }

    public boolean bH() {
        return this.af.e(10).length() > 0;
    }

    public void g(boolean bl2) {
        this.af.b(11, bl2 ? (byte)1 : 0);
    }

    public boolean bI() {
        return this.af.a(11) == 1;
    }

    @Override
    public boolean bh() {
        return this.bI();
    }

    public void a(int n2, float f2) {
        this.e[n2] = f2;
    }

    public boolean bJ() {
        return this.bs;
    }

    public void h(boolean bl2) {
        this.bs = bl2;
    }

    public boolean bK() {
        return this.bt;
    }

    @Override
    public final boolean c(xq xq2) {
        if (this.bN() && this.bO() == xq2) {
            this.a(true, !xq2.bE.d);
            return true;
        }
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.ca && this.bM()) {
            if (this instanceof rx && ((rx)this).bZ()) {
                if (xq2.b_().equalsIgnoreCase(((rx)this).b())) {
                    this.b((qr)xq2, true);
                    --abu2.b;
                    return true;
                }
            } else {
                this.b((qr)xq2, true);
                --abu2.b;
                return true;
            }
        }
        if (this.a(xq2)) {
            return true;
        }
        return super.c(xq2);
    }

    protected boolean a(xq xq2) {
        return false;
    }

    protected void bL() {
        if (this.bx != null) {
            this.bP();
        }
        if (!this.bv) {
            return;
        }
        if (this.bw == null || this.bw.K) {
            this.a(true, true);
            return;
        }
    }

    public void a(boolean bl2, boolean bl3) {
        if (this.bv) {
            this.bv = false;
            this.bw = null;
            if (!this.o.E && bl3) {
                this.a(abv.ca, 1);
            }
            if (!this.o.E && bl2 && this.o instanceof mm) {
                ((mm)this.o).r().a(this, new ho(1, this, null));
            }
        }
    }

    public boolean bM() {
        return !this.bN() && !(this instanceof ws);
    }

    public boolean bN() {
        return this.bv;
    }

    public qr bO() {
        return this.bw;
    }

    public void b(qr qr2, boolean bl2) {
        this.bv = true;
        this.bw = qr2;
        if (!this.o.E && bl2 && this.o instanceof mm) {
            ((mm)this.o).r().a(this, new ho(1, this, this.bw));
        }
    }

    private void bP() {
        if (this.bv && this.bx != null) {
            if (this.bx.b("UUIDMost", 4) && this.bx.b("UUIDLeast", 4)) {
                UUID uUID = new UUID(this.bx.g("UUIDMost"), this.bx.g("UUIDLeast"));
                List list = this.o.a(rm.class, this.C.b(10.0, 10.0, 10.0));
                for (rm rm2 : list) {
                    if (!rm2.aA().equals(uUID)) continue;
                    this.bw = rm2;
                    break;
                }
            } else if (this.bx.b("X", 99) && this.bx.b("Y", 99) && this.bx.b("Z", 99)) {
                int n2;
                int n3;
                int n4 = this.bx.f("X");
                rl rl2 = rl.b(this.o, n4, n3 = this.bx.f("Y"), n2 = this.bx.f("Z"));
                if (rl2 == null) {
                    rl2 = rl.a(this.o, n4, n3, n2);
                }
                this.bw = rl2;
            } else {
                this.a(false, true);
            }
        }
        this.bx = null;
    }
}

