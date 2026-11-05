/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class xq
extends rm
implements ac {
    public xo bm = new xo(this);
    private zm a = new zm();
    public yj bn;
    public yj bo;
    protected yi bp = new yi();
    protected int bq;
    public float br;
    public float bs;
    public int bt;
    public double bu;
    public double bv;
    public double bw;
    public double bx;
    public double by;
    public double bz;
    protected boolean bA;
    public r bB;
    private int b;
    public float bC;
    public float cc;
    public float bD;
    private r c;
    private boolean d;
    private r e;
    public xn bE = new xn();
    public int bF;
    public int bG;
    public float bH;
    private abu f;
    private int g;
    protected float bI = 0.1f;
    protected float bJ = 0.02f;
    private int h;
    private final GameProfile i;
    public vv bK;

    public xq(afs afs2, GameProfile gameProfile) {
        super(afs2);
        this.ar = xq.a(gameProfile);
        this.i = gameProfile;
        this.bo = this.bn = new zg(this.bm, !afs2.E, this);
        this.L = 1.62f;
        r r2 = afs2.K();
        this.b((double)r2.a + 0.5, r2.b + 1, (double)r2.c + 0.5, 0.0f, 0.0f);
        this.aZ = 180.0f;
        this.ab = 20;
    }

    @Override
    protected void aC() {
        super.aC();
        this.bb().b(xa.e).a(1.0);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)0);
        this.af.a(17, Float.valueOf(0.0f));
        this.af.a(18, (Object)0);
    }

    public abu bv() {
        return this.f;
    }

    public int bw() {
        return this.g;
    }

    public boolean bx() {
        return this.f != null;
    }

    public int by() {
        if (this.bx()) {
            return this.f.n() - this.g;
        }
        return 0;
    }

    public void bz() {
        if (this.f != null) {
            this.f.b(this.o, this, this.g);
        }
        this.bA();
    }

    public void bA() {
        this.f = null;
        this.g = 0;
        if (!this.o.E) {
            this.e(false);
        }
    }

    public boolean bB() {
        return this.bx() && this.f.b().d(this.f) == acz.d;
    }

    @Override
    public void h() {
        if (this.f != null) {
            abu abu2 = this.bm.h();
            if (abu2 == this.f) {
                if (this.g <= 25 && this.g % 4 == 0) {
                    this.c(abu2, 5);
                }
                if (--this.g == 0 && !this.o.E) {
                    this.p();
                }
            } else {
                this.bA();
            }
        }
        if (this.bt > 0) {
            --this.bt;
        }
        if (this.bl()) {
            ++this.b;
            if (this.b > 100) {
                this.b = 100;
            }
            if (!this.o.E) {
                if (!this.j()) {
                    this.a(true, true, false);
                } else if (this.o.w()) {
                    this.a(false, true, true);
                }
            }
        } else if (this.b > 0) {
            ++this.b;
            if (this.b >= 110) {
                this.b = 0;
            }
        }
        super.h();
        if (!this.o.E && this.bo != null && !this.bo.a(this)) {
            this.k();
            this.bo = this.bn;
        }
        if (this.ak() && this.bE.a) {
            this.E();
        }
        this.bu = this.bx;
        this.bv = this.by;
        this.bw = this.bz;
        double d2 = this.s - this.bx;
        double d3 = this.t - this.by;
        double d4 = this.u - this.bz;
        double d5 = 10.0;
        if (d2 > d5) {
            this.bu = this.bx = this.s;
        }
        if (d4 > d5) {
            this.bw = this.bz = this.u;
        }
        if (d3 > d5) {
            this.bv = this.by = this.t;
        }
        if (d2 < -d5) {
            this.bu = this.bx = this.s;
        }
        if (d4 < -d5) {
            this.bw = this.bz = this.u;
        }
        if (d3 < -d5) {
            this.bv = this.by = this.t;
        }
        this.bx += d2 * 0.25;
        this.bz += d4 * 0.25;
        this.by += d3 * 0.25;
        if (this.m == null) {
            this.e = null;
        }
        if (!this.o.E) {
            this.bp.a(this);
            this.a(og.g, 1);
        }
    }

    @Override
    public int C() {
        return this.bE.a ? 0 : 80;
    }

    @Override
    protected String G() {
        return "game.player.swim";
    }

    @Override
    protected String N() {
        return "game.player.swim.splash";
    }

    @Override
    public int ah() {
        return 10;
    }

    @Override
    public void a(String string, float f2, float f3) {
        this.o.a(this, string, f2, f3);
    }

    protected void c(abu abu2, int n2) {
        if (abu2.o() == acz.c) {
            this.a("random.drink", 0.5f, this.o.s.nextFloat() * 0.1f + 0.9f);
        }
        if (abu2.o() == acz.b) {
            for (int i2 = 0; i2 < n2; ++i2) {
                ayp ayp2 = this.o.V().a(((double)this.Z.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                ayp2.a(-this.z * (float)Math.PI / 180.0f);
                ayp2.b(-this.y * (float)Math.PI / 180.0f);
                ayp ayp3 = this.o.V().a(((double)this.Z.nextFloat() - 0.5) * 0.3, (double)(-this.Z.nextFloat()) * 0.6 - 0.3, 0.6);
                ayp3.a(-this.z * (float)Math.PI / 180.0f);
                ayp3.b(-this.y * (float)Math.PI / 180.0f);
                ayp3 = ayp3.c(this.s, this.t + (double)this.g(), this.u);
                String string = "iconcrack_" + abs.b(abu2.b());
                if (abu2.h()) {
                    string = string + "_" + abu2.k();
                }
                this.o.a(string, ayp3.c, ayp3.d, ayp3.e, ayp2.c, ayp2.d + 0.05, ayp2.e);
            }
            this.a("random.eat", 0.5f + 0.5f * (float)this.Z.nextInt(2), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f);
        }
    }

    protected void p() {
        if (this.f != null) {
            this.c(this.f, 16);
            int n2 = this.f.b;
            abu abu2 = this.f.b(this.o, this);
            if (abu2 != this.f || abu2 != null && abu2.b != n2) {
                this.bm.a[this.bm.c] = abu2;
                if (abu2.b == 0) {
                    this.bm.a[this.bm.c] = null;
                }
            }
            this.bA();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 9) {
            this.p();
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean bg() {
        return this.aR() <= 0.0f || this.bl();
    }

    protected void k() {
        this.bo = this.bn;
    }

    @Override
    public void a(qr qr2) {
        if (this.m != null && qr2 == null) {
            if (!this.o.E) {
                this.m(this.m);
            }
            if (this.m != null) {
                this.m.l = null;
            }
            this.m = null;
            return;
        }
        super.a(qr2);
    }

    @Override
    public void aa() {
        if (!this.o.E && this.am()) {
            this.a((qr)null);
            this.b(false);
            return;
        }
        double d2 = this.s;
        double d3 = this.t;
        double d4 = this.u;
        float f2 = this.y;
        float f3 = this.z;
        super.aa();
        this.br = this.bs;
        this.bs = 0.0f;
        this.l(this.s - d2, this.t - d3, this.u - d4);
        if (this.m instanceof vf) {
            this.z = f3;
            this.y = f2;
            this.aM = ((vf)this.m).aM;
        }
    }

    @Override
    public void z() {
        this.L = 1.62f;
        this.a(0.6f, 1.8f);
        super.z();
        this.g(this.aX());
        this.aA = 0;
    }

    @Override
    protected void bp() {
        super.bp();
        this.ba();
    }

    @Override
    public void e() {
        if (this.bq > 0) {
            --this.bq;
        }
        if (this.o.r == pu.a && this.aR() < this.aX() && this.o.O().b("naturalRegeneration") && this.aa % 20 * 12 == 0) {
            this.f(1.0f);
        }
        this.bm.k();
        this.br = this.bs;
        super.e();
        rz rz2 = this.a(xa.d);
        if (!this.o.E) {
            rz2.a(this.bE.b());
        }
        this.aQ = this.bJ;
        if (this.an()) {
            this.aQ = (float)((double)this.aQ + (double)this.bJ * 0.3);
        }
        this.i((float)rz2.e());
        float f2 = oy.a(this.v * this.v + this.x * this.x);
        float f3 = (float)Math.atan(-this.w * (double)0.2f) * 15.0f;
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.D || this.aR() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.D || this.aR() <= 0.0f) {
            f3 = 0.0f;
        }
        this.bs += (f2 - this.bs) * 0.4f;
        this.aJ += (f3 - this.aJ) * 0.8f;
        if (this.aR() > 0.0f) {
            ayk ayk2 = null;
            ayk2 = this.m != null && !this.m.K ? this.C.a(this.m.C).b(1.0, 0.0, 1.0) : this.C.b(1.0, 0.5, 1.0);
            List list = this.o.b((qr)this, ayk2);
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    qr qr2 = (qr)list.get(i2);
                    if (qr2.K) continue;
                    this.d(qr2);
                }
            }
        }
    }

    private void d(qr qr2) {
        qr2.b_(this);
    }

    public int bC() {
        return this.af.c(18);
    }

    public void c(int n2) {
        this.af.b(18, n2);
    }

    public void s(int n2) {
        int n3 = this.bC();
        this.af.b(18, n3 + n2);
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        this.a(0.2f, 0.2f);
        this.b(this.s, this.t, this.u);
        this.w = 0.1f;
        if (this.b_().equals("Notch")) {
            this.a(new abu(abv.e, 1), true, false);
        }
        if (!this.o.O().b("keepInventory")) {
            this.bm.m();
        }
        if (qf2 != null) {
            this.v = -oy.b((this.az + this.y) * (float)Math.PI / 180.0f) * 0.1f;
            this.x = -oy.a((this.az + this.y) * (float)Math.PI / 180.0f) * 0.1f;
        } else {
            this.x = 0.0;
            this.v = 0.0;
        }
        this.L = 0.1f;
        this.a(og.v, 1);
    }

    @Override
    protected String aS() {
        return "game.player.hurt";
    }

    @Override
    protected String aT() {
        return "game.player.die";
    }

    @Override
    public void b(qr qr2, int n2) {
        this.s(n2);
        Collection collection = this.bT().a(azb.e);
        if (qr2 instanceof xq) {
            this.a(og.y, 1);
            collection.addAll(this.bT().a(azb.d));
        } else {
            this.a(og.w, 1);
        }
        for (ayr ayr2 : collection) {
            ayt ayt2 = this.bT().a(this.b_(), ayr2);
            ayt2.a();
        }
    }

    public wb a(boolean bl2) {
        return this.a(this.bm.a(this.bm.c, bl2 && this.bm.h() != null ? this.bm.h().b : 1), false, true);
    }

    public wb a(abu abu2, boolean bl2) {
        return this.a(abu2, false, false);
    }

    public wb a(abu abu2, boolean bl2, boolean bl3) {
        if (abu2 == null) {
            return null;
        }
        if (abu2.b == 0) {
            return null;
        }
        wb wb2 = new wb(this.o, this.s, this.t - (double)0.3f + (double)this.g(), this.u, abu2);
        wb2.b = 40;
        if (bl3) {
            wb2.b(this.b_());
        }
        float f2 = 0.1f;
        if (bl2) {
            float f3 = this.Z.nextFloat() * 0.5f;
            float f4 = this.Z.nextFloat() * (float)Math.PI * 2.0f;
            wb2.v = -oy.a(f4) * f3;
            wb2.x = oy.b(f4) * f3;
            wb2.w = 0.2f;
        } else {
            f2 = 0.3f;
            wb2.v = -oy.a(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI) * f2;
            wb2.x = oy.b(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI) * f2;
            wb2.w = -oy.a(this.z / 180.0f * (float)Math.PI) * f2 + 0.1f;
            f2 = 0.02f;
            float f5 = this.Z.nextFloat() * (float)Math.PI * 2.0f;
            wb2.v += Math.cos(f5) * (double)(f2 *= this.Z.nextFloat());
            wb2.w += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.1f);
            wb2.x += Math.sin(f5) * (double)f2;
        }
        this.a(wb2);
        this.a(og.s, 1);
        return wb2;
    }

    protected void a(wb wb2) {
        this.o.d(wb2);
    }

    public float a(ahz ahz2, boolean bl2) {
        float f2 = this.bm.a(ahz2);
        if (f2 > 1.0f) {
            int n2 = aem.c(this);
            abu abu2 = this.bm.h();
            if (n2 > 0 && abu2 != null) {
                float f3 = n2 * n2 + 1;
                f2 = abu2.b(ahz2) || f2 > 1.0f ? (f2 += f3) : (f2 += f3 * 0.08f);
            }
        }
        if (this.a(qm.e)) {
            f2 *= 1.0f + (float)(this.b(qm.e).c() + 1) * 0.2f;
        }
        if (this.a(qm.f)) {
            f2 *= 1.0f - (float)(this.b(qm.f).c() + 1) * 0.2f;
        }
        if (this.a(avk.h) && !aem.j(this)) {
            f2 /= 5.0f;
        }
        if (!this.D) {
            f2 /= 5.0f;
        }
        return f2;
    }

    public boolean a(ahz ahz2) {
        return this.bm.b(ahz2);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.ar = xq.a(this.i);
        dp dp2 = dg2.c("Inventory", 10);
        this.bm.b(dp2);
        this.bm.c = dg2.f("SelectedItemSlot");
        this.bA = dg2.n("Sleeping");
        this.b = dg2.e("SleepTimer");
        this.bH = dg2.h("XpP");
        this.bF = dg2.f("XpLevel");
        this.bG = dg2.f("XpTotal");
        this.c(dg2.f("Score"));
        if (this.bA) {
            this.bB = new r(oy.c(this.s), oy.c(this.t), oy.c(this.u));
            this.a(true, true, false);
        }
        if (dg2.b("SpawnX", 99) && dg2.b("SpawnY", 99) && dg2.b("SpawnZ", 99)) {
            this.c = new r(dg2.f("SpawnX"), dg2.f("SpawnY"), dg2.f("SpawnZ"));
            this.d = dg2.n("SpawnForced");
        }
        this.bp.a(dg2);
        this.bE.b(dg2);
        if (dg2.b("EnderItems", 9)) {
            dp dp3 = dg2.c("EnderItems", 10);
            this.a.a(dp3);
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Inventory", this.bm.a(new dp()));
        dg2.a("SelectedItemSlot", this.bm.c);
        dg2.a("Sleeping", this.bA);
        dg2.a("SleepTimer", (short)this.b);
        dg2.a("XpP", this.bH);
        dg2.a("XpLevel", this.bF);
        dg2.a("XpTotal", this.bG);
        dg2.a("Score", this.bC());
        if (this.c != null) {
            dg2.a("SpawnX", this.c.a);
            dg2.a("SpawnY", this.c.b);
            dg2.a("SpawnZ", this.c.c);
            dg2.a("SpawnForced", this.d);
        }
        this.bp.b(dg2);
        this.bE.a(dg2);
        dg2.a("EnderItems", this.a.h());
    }

    public void a(ps ps2) {
    }

    public void a(anz anz2) {
    }

    public void a(wi wi2) {
    }

    public void a(uz uz2, ps ps2) {
    }

    public void a(int n2, int n3, int n4, String string) {
    }

    public void c(int n2, int n3, int n4) {
    }

    public void b(int n2, int n3, int n4) {
    }

    @Override
    public float g() {
        return 0.12f;
    }

    protected void e_() {
        this.L = 1.62f;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        if (this.bE.a && !qf2.g()) {
            return false;
        }
        this.aU = 0;
        if (this.aR() <= 0.0f) {
            return false;
        }
        if (this.bl() && !this.o.E) {
            this.a(true, true, false);
        }
        if (qf2.r()) {
            if (this.o.r == pu.a) {
                f2 = 0.0f;
            }
            if (this.o.r == pu.b) {
                f2 = f2 / 2.0f + 1.0f;
            }
            if (this.o.r == pu.d) {
                f2 = f2 * 3.0f / 2.0f;
            }
        }
        if (f2 == 0.0f) {
            return false;
        }
        qr qr2 = qf2.j();
        if (qr2 instanceof xt && ((xt)qr2).c != null) {
            qr2 = ((xt)qr2).c;
        }
        this.a(og.u, Math.round(f2 * 10.0f));
        return super.a(qf2, f2);
    }

    public boolean a(xq xq2) {
        ayy ayy2 = this.bs();
        ayy ayy3 = xq2.bs();
        if (ayy2 == null) {
            return true;
        }
        if (!ayy2.a(ayy3)) {
            return true;
        }
        return ayy2.g();
    }

    @Override
    protected void h(float f2) {
        this.bm.a(f2);
    }

    @Override
    public int aU() {
        return this.bm.l();
    }

    public float bD() {
        int n2 = 0;
        for (abu abu2 : this.bm.b) {
            if (abu2 == null) continue;
            ++n2;
        }
        return (float)n2 / (float)this.bm.b.length;
    }

    @Override
    protected void d(qf qf2, float f2) {
        if (this.av()) {
            return;
        }
        if (!qf2.e() && this.bB() && f2 > 0.0f) {
            f2 = (1.0f + f2) * 0.5f;
        }
        f2 = this.b(qf2, f2);
        float f3 = f2 = this.c(qf2, f2);
        f2 = Math.max(f2 - this.br(), 0.0f);
        this.m(this.br() - (f3 - f2));
        if (f2 == 0.0f) {
            return;
        }
        this.a(qf2.f());
        float f4 = this.aR();
        this.g(this.aR() - f2);
        this.aV().a(qf2, f4, f2);
    }

    public void a(anx anx2) {
    }

    public void a(ans ans2) {
    }

    public void a(ani ani2) {
    }

    public void a(afg afg2) {
    }

    public void a(anm anm2) {
    }

    public void a(anh anh2) {
    }

    public void a(afd afd2, String string) {
    }

    public void b(abu abu2) {
    }

    public boolean q(qr qr2) {
        abu abu2;
        abu abu3 = this.bE();
        abu abu4 = abu2 = abu3 != null ? abu3.m() : null;
        if (qr2.c(this)) {
            if (abu3 != null && abu3 == this.bE()) {
                if (abu3.b <= 0 && !this.bE.d) {
                    this.bF();
                } else if (abu3.b < abu2.b && this.bE.d) {
                    abu3.b = abu2.b;
                }
            }
            return true;
        }
        if (abu3 != null && qr2 instanceof rm) {
            if (this.bE.d) {
                abu3 = abu2;
            }
            if (abu3.a(this, (rm)qr2)) {
                if (abu3.b <= 0 && !this.bE.d) {
                    this.bF();
                }
                return true;
            }
        }
        return false;
    }

    public abu bE() {
        return this.bm.h();
    }

    public void bF() {
        this.bm.a(this.bm.c, null);
    }

    @Override
    public double ac() {
        return this.L - 0.5f;
    }

    public void r(qr qr2) {
        if (!qr2.au()) {
            return;
        }
        if (qr2.j(this)) {
            return;
        }
        float f2 = (float)this.a(xa.e).e();
        int n2 = 0;
        float f3 = 0.0f;
        if (qr2 instanceof rm) {
            f3 = aem.a((rm)this, (rm)qr2);
            n2 += aem.b((rm)this, (rm)qr2);
        }
        if (this.an()) {
            ++n2;
        }
        if (f2 > 0.0f || f3 > 0.0f) {
            boolean bl2;
            boolean bl3;
            boolean bl4 = bl3 = this.R > 0.0f && !this.D && !this.h_() && !this.L() && !this.a(qm.q) && this.m == null && qr2 instanceof rm;
            if (bl3 && f2 > 0.0f) {
                f2 *= 1.5f;
            }
            f2 += f3;
            boolean bl5 = false;
            int n3 = aem.a(this);
            if (qr2 instanceof rm && n3 > 0 && !qr2.ak()) {
                bl5 = true;
                qr2.e(1);
            }
            if (bl2 = qr2.a(qf.a(this), f2)) {
                vo vo2;
                if (n2 > 0) {
                    qr2.g(-oy.a(this.y * (float)Math.PI / 180.0f) * (float)n2 * 0.5f, 0.1, oy.b(this.y * (float)Math.PI / 180.0f) * (float)n2 * 0.5f);
                    this.v *= 0.6;
                    this.x *= 0.6;
                    this.c(false);
                }
                if (bl3) {
                    this.b(qr2);
                }
                if (f3 > 0.0f) {
                    this.c(qr2);
                }
                if (f2 >= 18.0f) {
                    this.a(nt.F);
                }
                this.l(qr2);
                if (qr2 instanceof rm) {
                    aem.a((rm)qr2, (qr)this);
                }
                aem.b((rm)this, qr2);
                abu abu2 = this.bE();
                qr qr3 = qr2;
                if (qr2 instanceof vp && (vo2 = ((vp)qr2).a) != null && vo2 instanceof rm) {
                    qr3 = (rm)((Object)vo2);
                }
                if (abu2 != null && qr3 instanceof rm) {
                    abu2.a((rm)qr3, this);
                    if (abu2.b <= 0) {
                        this.bF();
                    }
                }
                if (qr2 instanceof rm) {
                    this.a(og.t, Math.round(f2 * 10.0f));
                    if (n3 > 0) {
                        qr2.e(n3 * 4);
                    }
                }
                this.a(0.3f);
            } else if (bl5) {
                qr2.E();
            }
        }
    }

    public void b(qr qr2) {
    }

    public void c(qr qr2) {
    }

    public void bG() {
    }

    @Override
    public void A() {
        super.A();
        this.bn.b(this);
        if (this.bo != null) {
            this.bo.b(this);
        }
    }

    @Override
    public boolean Z() {
        return !this.bA && super.Z();
    }

    public GameProfile bI() {
        return this.i;
    }

    public xr a(int n2, int n3, int n4) {
        if (!this.o.E) {
            if (this.bl() || !this.Y()) {
                return xr.e;
            }
            if (!this.o.t.d()) {
                return xr.b;
            }
            if (this.o.w()) {
                return xr.c;
            }
            if (Math.abs(this.s - (double)n2) > 3.0 || Math.abs(this.t - (double)n3) > 2.0 || Math.abs(this.u - (double)n4) > 3.0) {
                return xr.d;
            }
            double d2 = 8.0;
            double d3 = 5.0;
            List list = this.o.a(wx.class, ayk.a().a((double)n2 - d2, (double)n3 - d3, (double)n4 - d2, (double)n2 + d2, (double)n3 + d3, (double)n4 + d2));
            if (!list.isEmpty()) {
                return xr.f;
            }
        }
        if (this.al()) {
            this.a((qr)null);
        }
        this.a(0.2f, 0.2f);
        this.L = 0.2f;
        if (this.o.d(n2, n3, n4)) {
            int n5 = this.o.e(n2, n3, n4);
            int n6 = ahy.l(n5);
            float f2 = 0.5f;
            float f3 = 0.5f;
            switch (n6) {
                case 0: {
                    f3 = 0.9f;
                    break;
                }
                case 2: {
                    f3 = 0.1f;
                    break;
                }
                case 1: {
                    f2 = 0.1f;
                    break;
                }
                case 3: {
                    f2 = 0.9f;
                }
            }
            this.w(n6);
            this.b((float)n2 + f2, (float)n3 + 0.9375f, (float)n4 + f3);
        } else {
            this.b((float)n2 + 0.5f, (float)n3 + 0.9375f, (float)n4 + 0.5f);
        }
        this.bA = true;
        this.b = 0;
        this.bB = new r(n2, n3, n4);
        this.w = 0.0;
        this.x = 0.0;
        this.v = 0.0;
        if (!this.o.E) {
            this.o.c();
        }
        return xr.a;
    }

    private void w(int n2) {
        this.bC = 0.0f;
        this.bD = 0.0f;
        switch (n2) {
            case 0: {
                this.bD = -1.8f;
                break;
            }
            case 2: {
                this.bD = 1.8f;
                break;
            }
            case 1: {
                this.bC = 1.8f;
                break;
            }
            case 3: {
                this.bC = -1.8f;
            }
        }
    }

    public void a(boolean bl2, boolean bl3, boolean bl4) {
        this.a(0.6f, 1.8f);
        this.e_();
        r r2 = this.bB;
        r r3 = this.bB;
        if (r2 != null && this.o.a(r2.a, r2.b, r2.c) == aie.C) {
            ahy.a(this.o, r2.a, r2.b, r2.c, false);
            r3 = ahy.a(this.o, r2.a, r2.b, r2.c, 0);
            if (r3 == null) {
                r3 = new r(r2.a, r2.b + 1, r2.c);
            }
            this.b((float)r3.a + 0.5f, (float)r3.b + this.L + 0.1f, (float)r3.c + 0.5f);
        }
        this.bA = false;
        if (!this.o.E && bl3) {
            this.o.c();
        }
        this.b = bl2 ? 0 : 100;
        if (bl4) {
            this.a(this.bB, false);
        }
    }

    private boolean j() {
        return this.o.a(this.bB.a, this.bB.b, this.bB.c) == aie.C;
    }

    public static r a(afs afs2, r r2, boolean bl2) {
        aol aol2 = afs2.L();
        aol2.c(r2.a - 3 >> 4, r2.c - 3 >> 4);
        aol2.c(r2.a + 3 >> 4, r2.c - 3 >> 4);
        aol2.c(r2.a - 3 >> 4, r2.c + 3 >> 4);
        aol2.c(r2.a + 3 >> 4, r2.c + 3 >> 4);
        if (afs2.a(r2.a, r2.b, r2.c) != aie.C) {
            boolean bl3;
            avk avk2 = afs2.a(r2.a, r2.b, r2.c).o();
            avk avk3 = afs2.a(r2.a, r2.b + 1, r2.c).o();
            boolean bl4 = !avk2.a() && !avk2.d();
            boolean bl5 = bl3 = !avk3.a() && !avk3.d();
            if (bl2 && bl4 && bl3) {
                return r2;
            }
            return null;
        }
        r r3 = ahy.a(afs2, r2.a, r2.b, r2.c, 0);
        return r3;
    }

    public float bJ() {
        if (this.bB != null) {
            int n2 = this.o.e(this.bB.a, this.bB.b, this.bB.c);
            int n3 = ahy.l(n2);
            switch (n3) {
                case 0: {
                    return 90.0f;
                }
                case 1: {
                    return 0.0f;
                }
                case 2: {
                    return 270.0f;
                }
                case 3: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    @Override
    public boolean bl() {
        return this.bA;
    }

    public boolean bK() {
        return this.bA && this.b >= 100;
    }

    public int bL() {
        return this.b;
    }

    protected boolean u(int n2) {
        return (this.af.a(16) & 1 << n2) != 0;
    }

    protected void b(int n2, boolean bl2) {
        byte by2 = this.af.a(16);
        if (bl2) {
            this.af.b(16, (byte)(by2 | 1 << n2));
        } else {
            this.af.b(16, (byte)(by2 & ~(1 << n2)));
        }
    }

    public void b(fa fa2) {
    }

    public r bM() {
        return this.c;
    }

    public boolean bN() {
        return this.d;
    }

    public void a(r r2, boolean bl2) {
        if (r2 != null) {
            this.c = new r(r2);
            this.d = bl2;
        } else {
            this.c = null;
            this.d = false;
        }
    }

    public void a(ny ny2) {
        this.a(ny2, 1);
    }

    public void a(ny ny2, int n2) {
    }

    @Override
    public void bi() {
        super.bi();
        this.a(og.r, 1);
        if (this.an()) {
            this.a(0.8f);
        } else {
            this.a(0.2f);
        }
    }

    @Override
    public void e(float f2, float f3) {
        double d2 = this.s;
        double d3 = this.t;
        double d4 = this.u;
        if (this.bE.b && this.m == null) {
            double d5 = this.w;
            float f4 = this.aQ;
            this.aQ = this.bE.a();
            super.e(f2, f3);
            this.w = d5 * 0.6;
            this.aQ = f4;
        } else {
            super.e(f2, f3);
        }
        this.k(this.s - d2, this.t - d3, this.u - d4);
    }

    @Override
    public float bk() {
        return (float)this.a(xa.d).e();
    }

    public void k(double d2, double d3, double d4) {
        if (this.m != null) {
            return;
        }
        if (this.a(avk.h)) {
            int n2 = Math.round(oy.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f);
            if (n2 > 0) {
                this.a(og.m, n2);
                this.a(0.015f * (float)n2 * 0.01f);
            }
        } else if (this.L()) {
            int n3 = Math.round(oy.a(d2 * d2 + d4 * d4) * 100.0f);
            if (n3 > 0) {
                this.a(og.i, n3);
                this.a(0.015f * (float)n3 * 0.01f);
            }
        } else if (this.h_()) {
            if (d3 > 0.0) {
                this.a(og.k, (int)Math.round(d3 * 100.0));
            }
        } else if (this.D) {
            int n4 = Math.round(oy.a(d2 * d2 + d4 * d4) * 100.0f);
            if (n4 > 0) {
                this.a(og.h, n4);
                if (this.an()) {
                    this.a(0.099999994f * (float)n4 * 0.01f);
                } else {
                    this.a(0.01f * (float)n4 * 0.01f);
                }
            }
        } else {
            int n5 = Math.round(oy.a(d2 * d2 + d4 * d4) * 100.0f);
            if (n5 > 25) {
                this.a(og.l, n5);
            }
        }
    }

    private void l(double d2, double d3, double d4) {
        int n2;
        if (this.m != null && (n2 = Math.round(oy.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f)) > 0) {
            if (this.m instanceof wc) {
                this.a(og.n, n2);
                if (this.e == null) {
                    this.e = new r(oy.c(this.s), oy.c(this.t), oy.c(this.u));
                } else if ((double)this.e.e(oy.c(this.s), oy.c(this.t), oy.c(this.u)) >= 1000000.0) {
                    this.a(nt.q, 1);
                }
            } else if (this.m instanceof vz) {
                this.a(og.o, n2);
            } else if (this.m instanceof vf) {
                this.a(og.p, n2);
            } else if (this.m instanceof uz) {
                this.a(og.q, n2);
            }
        }
    }

    @Override
    protected void b(float f2) {
        if (this.bE.c) {
            return;
        }
        if (f2 >= 2.0f) {
            this.a(og.j, (int)Math.round((double)f2 * 100.0));
        }
        super.b(f2);
    }

    @Override
    protected String o(int n2) {
        if (n2 > 4) {
            return "game.player.hurt.fall.big";
        }
        return "game.player.hurt.fall.small";
    }

    @Override
    public void a(rm rm2) {
        int n2;
        qy qy2;
        if (rm2 instanceof ws) {
            this.a(nt.s);
        }
        if ((qy2 = (qy)qx.a.get(n2 = qx.a(rm2))) != null) {
            this.a(qy2.d, 1);
        }
    }

    @Override
    public void ar() {
        if (!this.bE.b) {
            super.ar();
        }
    }

    @Override
    public pw b(abu abu2, int n2) {
        pw pw2 = super.b(abu2, n2);
        if (abu2.b() == abv.aM && this.bK != null) {
            pw2 = abv.aM.i();
        } else {
            if (abu2.b().b()) {
                return abu2.b().a(abu2.k(), n2);
            }
            if (this.f != null && abu2.b() == abv.f) {
                int n3 = abu2.n() - this.g;
                if (n3 >= 18) {
                    return abv.f.c(2);
                }
                if (n3 > 13) {
                    return abv.f.c(1);
                }
                if (n3 > 0) {
                    return abv.f.c(0);
                }
            }
        }
        return pw2;
    }

    public abu r(int n2) {
        return this.bm.d(n2);
    }

    public void v(int n2) {
        this.s(n2);
        int n3 = Integer.MAX_VALUE - this.bG;
        if (n2 > n3) {
            n2 = n3;
        }
        this.bH += (float)n2 / (float)this.bO();
        this.bG += n2;
        while (this.bH >= 1.0f) {
            this.bH = (this.bH - 1.0f) * (float)this.bO();
            this.a(1);
            this.bH /= (float)this.bO();
        }
    }

    public void a(int n2) {
        this.bF += n2;
        if (this.bF < 0) {
            this.bF = 0;
            this.bH = 0.0f;
            this.bG = 0;
        }
        if (n2 > 0 && this.bF % 5 == 0 && (float)this.h < (float)this.aa - 100.0f) {
            float f2 = this.bF > 30 ? 1.0f : (float)this.bF / 30.0f;
            this.o.a((qr)this, "random.levelup", f2 * 0.75f, 1.0f);
            this.h = this.aa;
        }
    }

    public int bO() {
        if (this.bF >= 30) {
            return 62 + (this.bF - 30) * 7;
        }
        if (this.bF >= 15) {
            return 17 + (this.bF - 15) * 3;
        }
        return 17;
    }

    public void a(float f2) {
        if (this.bE.a) {
            return;
        }
        if (!this.o.E) {
            this.bp.a(f2);
        }
    }

    public yi bP() {
        return this.bp;
    }

    public boolean g(boolean bl2) {
        return (bl2 || this.bp.c()) && !this.bE.a;
    }

    public boolean bQ() {
        return this.aR() > 0.0f && this.aR() < this.aX();
    }

    public void a(abu abu2, int n2) {
        if (abu2 == this.f) {
            return;
        }
        this.f = abu2;
        this.g = n2;
        if (!this.o.E) {
            this.e(true);
        }
    }

    public boolean d(int n2, int n3, int n4) {
        if (this.bE.e) {
            return true;
        }
        ahz ahz2 = this.o.a(n2, n3, n4);
        if (ahz2.o() != avk.a) {
            abu abu2;
            if (ahz2.o().q()) {
                return true;
            }
            if (this.bE() != null && ((abu2 = this.bE()).b(ahz2) || abu2.a(ahz2) > 1.0f)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int n2, int n3, int n4, int n5, abu abu2) {
        if (this.bE.e) {
            return true;
        }
        if (abu2 != null) {
            return abu2.z();
        }
        return false;
    }

    @Override
    protected int e(xq xq2) {
        if (this.o.O().b("keepInventory")) {
            return 0;
        }
        int n2 = this.bF * 7;
        if (n2 > 100) {
            return 100;
        }
        return n2;
    }

    @Override
    protected boolean aG() {
        return true;
    }

    @Override
    public boolean bh() {
        return true;
    }

    public void a(xq xq2, boolean bl2) {
        if (bl2) {
            this.bm.b(xq2.bm);
            this.g(xq2.aR());
            this.bp = xq2.bp;
            this.bF = xq2.bF;
            this.bG = xq2.bG;
            this.bH = xq2.bH;
            this.c(xq2.bC());
            this.aq = xq2.aq;
        } else if (this.o.O().b("keepInventory")) {
            this.bm.b(xq2.bm);
            this.bF = xq2.bF;
            this.bG = xq2.bG;
            this.bH = xq2.bH;
            this.c(xq2.bC());
        }
        this.a = xq2.a;
    }

    @Override
    protected boolean g_() {
        return !this.bE.b;
    }

    public void q() {
    }

    public void a(agb agb2) {
    }

    @Override
    public String b_() {
        return this.i.getName();
    }

    @Override
    public afs d() {
        return this.o;
    }

    public zm bR() {
        return this.a;
    }

    @Override
    public abu q(int n2) {
        if (n2 == 0) {
            return this.bm.h();
        }
        return this.bm.b[n2 - 1];
    }

    @Override
    public abu bd() {
        return this.bm.h();
    }

    @Override
    public void c(int n2, abu abu2) {
        this.bm.b[n2] = abu2;
    }

    @Override
    public boolean d(xq xq2) {
        if (!this.ao()) {
            return false;
        }
        ayy ayy2 = this.bs();
        return ayy2 == null || xq2 == null || xq2.bs() != ayy2 || !ayy2.h();
    }

    @Override
    public abu[] aj() {
        return this.bm.b;
    }

    public boolean bS() {
        return this.u(1);
    }

    @Override
    public boolean aB() {
        return !this.bE.b;
    }

    public ayw bT() {
        return this.o.X();
    }

    @Override
    public ayy bs() {
        return this.bT().i(this.b_());
    }

    @Override
    public fa c_() {
        fh fh2 = new fh(ays.a(this.bs(), this.b_()));
        fh2.b().a(new ey(ez.e, "/msg " + this.b_() + " "));
        return fh2;
    }

    @Override
    public void m(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.y().b(17, Float.valueOf(f2));
    }

    @Override
    public float br() {
        return this.y().d(17);
    }

    public static UUID a(GameProfile gameProfile) {
        UUID uUID = u.b(gameProfile.getId());
        if (uUID == null) {
            uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(Charsets.UTF_8));
        }
        return uUID;
    }
}

