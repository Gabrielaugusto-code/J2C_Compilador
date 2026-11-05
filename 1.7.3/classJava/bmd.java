/*
 * Decompiled with CFR 0.152.
 */
public class bmd
extends bma {
    public bmb c;
    protected azi d;
    protected int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float bL;
    private int a;
    private float bO;
    private pd bS = new pd();
    private pd bT = new pd();
    private pd bU = new pd();
    public float bM;
    public float bN;

    public bmd(azi azi2, afs afs2, bal bal2, int n2) {
        super(afs2, bal2.e());
        this.d = azi2;
        this.ap = n2;
    }

    @Override
    public void bp() {
        super.bp();
        this.bd = this.c.a;
        this.be = this.c.b;
        this.bc = this.c.c;
        this.i = this.g;
        this.bL = this.h;
        this.h = (float)((double)this.h + (double)(this.z - this.h) * 0.5);
        this.g = (float)((double)this.g + (double)(this.y - this.g) * 0.5);
    }

    @Override
    public void e() {
        boolean bl2;
        if (this.f > 0) {
            --this.f;
            if (this.f == 0) {
                this.c(false);
            }
        }
        if (this.e > 0) {
            --this.e;
        }
        if (this.d.c.a()) {
            this.u = 0.5;
            this.s = 0.5;
            this.s = 0.0;
            this.u = 0.0;
            this.y = (float)this.aa / 12.0f;
            this.z = 10.0f;
            this.t = 68.5;
            return;
        }
        this.bN = this.bM;
        if (this.an) {
            if (this.d.n != null) {
                this.d.a((bcl)null);
            }
            if (this.bM == 0.0f) {
                this.d.X().a(btb.a(new brq("portal.trigger"), this.Z.nextFloat() * 0.4f + 0.8f));
            }
            this.bM += 0.0125f;
            if (this.bM >= 1.0f) {
                this.bM = 1.0f;
            }
            this.an = false;
        } else if (this.a(qm.k) && this.b(qm.k).b() > 60) {
            this.bM += 0.006666667f;
            if (this.bM > 1.0f) {
                this.bM = 1.0f;
            }
        } else {
            if (this.bM > 0.0f) {
                this.bM -= 0.05f;
            }
            if (this.bM < 0.0f) {
                this.bM = 0.0f;
            }
        }
        if (this.am > 0) {
            --this.am;
        }
        boolean bl3 = this.c.c;
        float f2 = 0.8f;
        boolean bl4 = this.c.b >= f2;
        this.c.a();
        if (this.bx() && !this.al()) {
            this.c.a *= 0.2f;
            this.c.b *= 0.2f;
            this.e = 0;
        }
        if (this.c.d && this.V < 0.2f) {
            this.V = 0.2f;
        }
        this.j(this.s - (double)this.M * 0.35, this.C.b + 0.5, this.u + (double)this.M * 0.35);
        this.j(this.s - (double)this.M * 0.35, this.C.b + 0.5, this.u - (double)this.M * 0.35);
        this.j(this.s + (double)this.M * 0.35, this.C.b + 0.5, this.u - (double)this.M * 0.35);
        this.j(this.s + (double)this.M * 0.35, this.C.b + 0.5, this.u + (double)this.M * 0.35);
        boolean bl5 = bl2 = (float)this.bP().a() > 6.0f || this.bE.c;
        if (this.D && !bl4 && this.c.b >= f2 && !this.an() && bl2 && !this.bx() && !this.a(qm.q)) {
            if (this.e > 0 || this.d.u.ag.d()) {
                this.c(true);
            } else {
                this.e = 7;
            }
        }
        if (!this.an() && this.c.b >= f2 && bl2 && !this.bx() && !this.a(qm.q) && this.d.u.ag.d()) {
            this.c(true);
        }
        if (this.an() && (this.c.b < f2 || this.E || !bl2)) {
            this.c(false);
        }
        if (this.bE.c && !bl3 && this.c.c) {
            if (this.bq == 0) {
                this.bq = 7;
            } else {
                this.bE.b = !this.bE.b;
                this.q();
                this.bq = 0;
            }
        }
        if (this.bE.b) {
            if (this.c.d) {
                this.w -= 0.15;
            }
            if (this.c.c) {
                this.w += 0.15;
            }
        }
        if (this.w()) {
            if (this.a < 0) {
                ++this.a;
                if (this.a == 0) {
                    this.bO = 0.0f;
                }
            }
            if (bl3 && !this.c.c) {
                this.a = -10;
                this.i();
            } else if (!bl3 && this.c.c) {
                this.a = 0;
                this.bO = 0.0f;
            } else if (bl3) {
                ++this.a;
                this.bO = this.a < 10 ? (float)this.a * 0.1f : 0.8f + 2.0f / (float)(this.a - 9) * 0.1f;
            }
        } else {
            this.bO = 0.0f;
        }
        super.e();
        if (this.D && this.bE.b) {
            this.bE.b = false;
            this.q();
        }
    }

    public float v() {
        float f2 = 1.0f;
        if (this.bE.b) {
            f2 *= 1.1f;
        }
        rz rz2 = this.a(xa.d);
        f2 = (float)((double)f2 * ((rz2.e() / (double)this.bE.b() + 1.0) / 2.0));
        if (this.bE.b() == 0.0f || Float.isNaN(f2) || Float.isInfinite(f2)) {
            f2 = 1.0f;
        }
        if (this.bx() && this.bv().b() == abv.f) {
            int n2 = this.by();
            float f3 = (float)n2 / 20.0f;
            f3 = f3 > 1.0f ? 1.0f : (f3 *= f3);
            f2 *= 1.0f - f3 * 0.15f;
        }
        return f2;
    }

    @Override
    public void k() {
        super.k();
        this.d.a((bcl)null);
    }

    @Override
    public void a(ani ani2) {
        if (ani2 instanceof aod) {
            this.d.a(new ben((aod)ani2));
        } else if (ani2 instanceof ano) {
            this.d.a(new bdx(((ano)ani2).a()));
        }
    }

    @Override
    public void a(afg afg2) {
        this.d.a(new bdx(afg2));
    }

    @Override
    public void b(abu abu2) {
        abs abs2 = abu2.b();
        if (abs2 == abv.bB) {
            this.d.a(new bdu(this, abu2, false));
        } else if (abs2 == abv.bA) {
            this.d.a(new bdu(this, abu2, true));
        }
    }

    @Override
    public void a(ps ps2) {
        this.d.a(new bdy(this.bm, ps2));
    }

    @Override
    public void a(anz anz2) {
        this.d.a(new bei(this.bm, anz2));
    }

    @Override
    public void a(wi wi2) {
        this.d.a(new bei(this.bm, wi2));
    }

    @Override
    public void a(uz uz2, ps ps2) {
        this.d.a(new bej(this.bm, ps2, uz2));
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.d.a(new bdz(this.bm, this.o, n2, n3, n4));
    }

    @Override
    public void a(int n2, int n3, int n4, String string) {
        this.d.a(new beg(this.bm, this.o, n2, n3, n4, string));
    }

    @Override
    public void c(int n2, int n3, int n4) {
        this.d.a(new bdo(this.bm, this.o, n2, n3, n4));
    }

    @Override
    public void a(anx anx2) {
        this.d.a(new beh(this.bm, anx2));
    }

    @Override
    public void a(anm anm2) {
        this.d.a(new bdw(this.bm, anm2));
    }

    @Override
    public void a(anh anh2) {
        this.d.a(new bdp(this.bm, anh2));
    }

    @Override
    public void a(ans ans2) {
        this.d.a(new beo(this.bm, ans2));
    }

    @Override
    public void a(afd afd2, String string) {
        this.d.a(new bel(this.bm, afd2, this.o, string));
    }

    @Override
    public void b(qr qr2) {
        this.d.k.a(new bkq(this.d.f, qr2));
    }

    @Override
    public void c(qr qr2) {
        bkq bkq2 = new bkq(this.d.f, qr2, "magicCrit");
        this.d.k.a(bkq2);
    }

    @Override
    public void a(qr qr2, int n2) {
        this.d.k.a(new blv((afs)this.d.f, qr2, this, -0.5f));
    }

    @Override
    public boolean am() {
        return this.c.d && !this.bA;
    }

    public void n(float f2) {
        float f3 = this.aR() - f2;
        if (f3 <= 0.0f) {
            this.g(f2);
            if (f3 < 0.0f) {
                this.ad = this.aH / 2;
            }
        } else {
            this.bb = f3;
            this.g(this.aR());
            this.ad = this.aH;
            this.d(qf.j, f3);
            this.ay = 10;
            this.ax = 10;
        }
    }

    @Override
    public void b(fa fa2) {
        this.d.r.b().a(fa2);
    }

    private boolean e(int n2, int n3, int n4) {
        return this.o.a(n2, n3, n4).r();
    }

    @Override
    protected boolean j(double d2, double d3, double d4) {
        int n2 = oy.c(d2);
        int n3 = oy.c(d3);
        int n4 = oy.c(d4);
        double d5 = d2 - (double)n2;
        double d6 = d4 - (double)n4;
        if (this.e(n2, n3, n4) || this.e(n2, n3 + 1, n4)) {
            boolean bl2 = !this.e(n2 - 1, n3, n4) && !this.e(n2 - 1, n3 + 1, n4);
            boolean bl3 = !this.e(n2 + 1, n3, n4) && !this.e(n2 + 1, n3 + 1, n4);
            boolean bl4 = !this.e(n2, n3, n4 - 1) && !this.e(n2, n3 + 1, n4 - 1);
            boolean bl5 = !this.e(n2, n3, n4 + 1) && !this.e(n2, n3 + 1, n4 + 1);
            int n5 = -1;
            double d7 = 9999.0;
            if (bl2 && d5 < d7) {
                d7 = d5;
                n5 = 0;
            }
            if (bl3 && 1.0 - d5 < d7) {
                d7 = 1.0 - d5;
                n5 = 1;
            }
            if (bl4 && d6 < d7) {
                d7 = d6;
                n5 = 4;
            }
            if (bl5 && 1.0 - d6 < d7) {
                d7 = 1.0 - d6;
                n5 = 5;
            }
            float f2 = 0.1f;
            if (n5 == 0) {
                this.v = -f2;
            }
            if (n5 == 1) {
                this.v = f2;
            }
            if (n5 == 4) {
                this.x = -f2;
            }
            if (n5 == 5) {
                this.x = f2;
            }
        }
        return false;
    }

    @Override
    public void c(boolean bl2) {
        super.c(bl2);
        this.f = bl2 ? 600 : 0;
    }

    public void a(float f2, int n2, int n3) {
        this.bH = f2;
        this.bG = n2;
        this.bF = n3;
    }

    @Override
    public void a(fa fa2) {
        this.d.r.b().a(fa2);
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= 0;
    }

    @Override
    public r f_() {
        return new r(oy.c(this.s + 0.5), oy.c(this.t + 0.5), oy.c(this.u + 0.5));
    }

    @Override
    public void a(String string, float f2, float f3) {
        this.o.a(this.s, this.t - (double)this.L, this.u, string, f2, f3, false);
    }

    @Override
    public boolean bq() {
        return true;
    }

    public boolean w() {
        return this.m != null && this.m instanceof uz;
    }

    public float bU() {
        return this.bO;
    }

    protected void i() {
    }
}

