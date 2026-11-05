/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public class wr
extends wx {
    private static final UUID bp = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final sa bq = new sa(bp, "Attacking speed boost", 6.2f, 0).a(false);
    private static boolean[] br = new boolean[256];
    private int bs;
    private int bt;
    private qr bu;
    private boolean bv;

    public wr(afs afs2) {
        super(afs2);
        this.a(0.6f, 2.9f);
        this.W = 1.0f;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(40.0);
        this.a(xa.d).a(0.3f);
        this.a(xa.e).a(7.0);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, new Byte(0));
        this.af.a(17, new Byte(0));
        this.af.a(18, new Byte(0));
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("carried", (short)ahz.b(this.cb()));
        dg2.a("carriedData", (short)this.cc());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.a(ahz.e(dg2.e("carried")));
        this.a(dg2.e("carriedData"));
    }

    @Override
    protected qr bR() {
        xq xq2 = this.o.b((qr)this, 64.0);
        if (xq2 != null) {
            if (this.f(xq2)) {
                this.bv = true;
                if (this.bt == 0) {
                    this.o.a(xq2.s, xq2.t, xq2.u, "mob.endermen.stare", 1.0f, 1.0f);
                }
                if (this.bt++ == 5) {
                    this.bt = 0;
                    this.a(true);
                    return xq2;
                }
            } else {
                this.bt = 0;
            }
        }
        return null;
    }

    private boolean f(xq xq2) {
        abu abu2 = xq2.bm.b[3];
        if (abu2 != null && abu2.b() == abs.a(aie.aK)) {
            return false;
        }
        ayp ayp2 = xq2.j(1.0f).a();
        ayp ayp3 = this.o.V().a(this.s - xq2.s, this.C.b + (double)(this.N / 2.0f) - (xq2.t + (double)xq2.g()), this.u - xq2.u);
        double d2 = ayp3.b();
        double d3 = ayp2.b(ayp3 = ayp3.a());
        if (d3 > 1.0 - 0.025 / d2) {
            return xq2.p(this);
        }
        return false;
    }

    @Override
    public void e() {
        float f2;
        if (this.K()) {
            this.a(qf.e, 1.0f);
        }
        if (this.bu != this.bm) {
            rz rz2 = this.a(xa.d);
            rz2.b(bq);
            if (this.bm != null) {
                rz2.a(bq);
            }
        }
        this.bu = this.bm;
        if (!this.o.E && this.o.O().b("mobGriefing")) {
            int n2;
            int n3;
            ahz ahz2;
            if (this.cb().o() == avk.a) {
                int n4;
                if (this.Z.nextInt(20) == 0 && br[ahz.b(ahz2 = this.o.a(n4 = oy.c(this.s - 2.0 + this.Z.nextDouble() * 4.0), n3 = oy.c(this.t + this.Z.nextDouble() * 3.0), n2 = oy.c(this.u - 2.0 + this.Z.nextDouble() * 4.0)))]) {
                    this.a(ahz2);
                    this.a(this.o.e(n4, n3, n2));
                    this.o.b(n4, n3, n2, aie.a);
                }
            } else if (this.Z.nextInt(2000) == 0) {
                int n5 = oy.c(this.s - 1.0 + this.Z.nextDouble() * 2.0);
                n3 = oy.c(this.t + this.Z.nextDouble() * 2.0);
                n2 = oy.c(this.u - 1.0 + this.Z.nextDouble() * 2.0);
                ahz2 = this.o.a(n5, n3, n2);
                ahz ahz3 = this.o.a(n5, n3 - 1, n2);
                if (ahz2.o() == avk.a && ahz3.o() != avk.a && ahz3.d()) {
                    this.o.d(n5, n3, n2, this.cb(), this.cc(), 3);
                    this.a(aie.a);
                }
            }
        }
        for (int i2 = 0; i2 < 2; ++i2) {
            this.o.a("portal", this.s + (this.Z.nextDouble() - 0.5) * (double)this.M, this.t + this.Z.nextDouble() * (double)this.N - 0.25, this.u + (this.Z.nextDouble() - 0.5) * (double)this.M, (this.Z.nextDouble() - 0.5) * 2.0, -this.Z.nextDouble(), (this.Z.nextDouble() - 0.5) * 2.0);
        }
        if (this.o.w() && !this.o.E && (f2 = this.d(1.0f)) > 0.5f && this.o.i(oy.c(this.s), oy.c(this.t), oy.c(this.u)) && this.Z.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f) {
            this.bm = null;
            this.a(false);
            this.bv = false;
            this.bZ();
        }
        if (this.K() || this.ak()) {
            this.bm = null;
            this.a(false);
            this.bv = false;
            this.bZ();
        }
        if (this.cd() && !this.bv && this.Z.nextInt(100) == 0) {
            this.a(false);
        }
        this.bc = false;
        if (this.bm != null) {
            this.a(this.bm, 100.0f, 100.0f);
        }
        if (!this.o.E && this.Y()) {
            if (this.bm != null) {
                if (this.bm instanceof xq && this.f((xq)this.bm)) {
                    if (this.bm.f(this) < 16.0) {
                        this.bZ();
                    }
                    this.bs = 0;
                } else if (this.bm.f(this) > 256.0 && this.bs++ >= 30 && this.c(this.bm)) {
                    this.bs = 0;
                }
            } else {
                this.a(false);
                this.bs = 0;
            }
        }
        super.e();
    }

    protected boolean bZ() {
        double d2 = this.s + (this.Z.nextDouble() - 0.5) * 64.0;
        double d3 = this.t + (double)(this.Z.nextInt(64) - 32);
        double d4 = this.u + (this.Z.nextDouble() - 0.5) * 64.0;
        return this.k(d2, d3, d4);
    }

    protected boolean c(qr qr2) {
        ayp ayp2 = this.o.V().a(this.s - qr2.s, this.C.b + (double)(this.N / 2.0f) - qr2.t + (double)qr2.g(), this.u - qr2.u);
        ayp2 = ayp2.a();
        double d2 = 16.0;
        double d3 = this.s + (this.Z.nextDouble() - 0.5) * 8.0 - ayp2.c * d2;
        double d4 = this.t + (double)(this.Z.nextInt(16) - 8) - ayp2.d * d2;
        double d5 = this.u + (this.Z.nextDouble() - 0.5) * 8.0 - ayp2.e * d2;
        return this.k(d3, d4, d5);
    }

    protected boolean k(double d2, double d3, double d4) {
        int n2;
        int n3;
        int n4;
        double d5 = this.s;
        double d6 = this.t;
        double d7 = this.u;
        this.s = d2;
        this.t = d3;
        this.u = d4;
        boolean bl2 = false;
        int n5 = oy.c(this.s);
        if (this.o.d(n5, n4 = oy.c(this.t), n3 = oy.c(this.u))) {
            n2 = 0;
            while (n2 == 0 && n4 > 0) {
                ahz ahz2 = this.o.a(n5, n4 - 1, n3);
                if (ahz2.o().c()) {
                    n2 = 1;
                    continue;
                }
                this.t -= 1.0;
                --n4;
            }
            if (n2 != 0) {
                this.b(this.s, this.t, this.u);
                if (this.o.a((qr)this, this.C).isEmpty() && !this.o.d(this.C)) {
                    bl2 = true;
                }
            }
        }
        if (bl2) {
            n2 = 128;
            for (int i2 = 0; i2 < n2; ++i2) {
                double d8 = (double)i2 / ((double)n2 - 1.0);
                float f2 = (this.Z.nextFloat() - 0.5f) * 0.2f;
                float f3 = (this.Z.nextFloat() - 0.5f) * 0.2f;
                float f4 = (this.Z.nextFloat() - 0.5f) * 0.2f;
                double d9 = d5 + (this.s - d5) * d8 + (this.Z.nextDouble() - 0.5) * (double)this.M * 2.0;
                double d10 = d6 + (this.t - d6) * d8 + this.Z.nextDouble() * (double)this.N;
                double d11 = d7 + (this.u - d7) * d8 + (this.Z.nextDouble() - 0.5) * (double)this.M * 2.0;
                this.o.a("portal", d9, d10, d11, (double)f2, (double)f3, f4);
            }
            this.o.a(d5, d6, d7, "mob.endermen.portal", 1.0f, 1.0f);
            this.a("mob.endermen.portal", 1.0f, 1.0f);
            return true;
        }
        this.b(d5, d6, d7);
        return false;
    }

    @Override
    protected String t() {
        return this.cd() ? "mob.endermen.scream" : "mob.endermen.idle";
    }

    @Override
    protected String aS() {
        return "mob.endermen.hit";
    }

    @Override
    protected String aT() {
        return "mob.endermen.death";
    }

    @Override
    protected abs u() {
        return abv.bi;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        abs abs2 = this.u();
        if (abs2 != null) {
            int n3 = this.Z.nextInt(2 + n2);
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(abs2, 1);
            }
        }
    }

    public void a(ahz ahz2) {
        this.af.b(16, (byte)(ahz.b(ahz2) & 0xFF));
    }

    public ahz cb() {
        return ahz.e(this.af.a(16));
    }

    public void a(int n2) {
        this.af.b(17, (byte)(n2 & 0xFF));
    }

    public int cc() {
        return this.af.a(17);
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        this.a(true);
        if (qf2 instanceof qg && qf2.j() instanceof xq) {
            this.bv = true;
        }
        if (qf2 instanceof qh) {
            this.bv = false;
            for (int i2 = 0; i2 < 64; ++i2) {
                if (!this.bZ()) continue;
                return true;
            }
            return false;
        }
        return super.a(qf2, f2);
    }

    public boolean cd() {
        return this.af.a(18) > 0;
    }

    public void a(boolean bl2) {
        this.af.b(18, (byte)(bl2 ? 1 : 0));
    }

    static {
        wr.br[ahz.b((ahz)aie.c)] = true;
        wr.br[ahz.b((ahz)aie.d)] = true;
        wr.br[ahz.b((ahz)aie.m)] = true;
        wr.br[ahz.b((ahz)aie.n)] = true;
        wr.br[ahz.b((ahz)aie.N)] = true;
        wr.br[ahz.b((ahz)aie.O)] = true;
        wr.br[ahz.b((ahz)aie.P)] = true;
        wr.br[ahz.b((ahz)aie.Q)] = true;
        wr.br[ahz.b((ahz)aie.W)] = true;
        wr.br[ahz.b((ahz)aie.aF)] = true;
        wr.br[ahz.b((ahz)aie.aG)] = true;
        wr.br[ahz.b((ahz)aie.aK)] = true;
        wr.br[ahz.b((ahz)aie.ba)] = true;
        wr.br[ahz.b((ahz)aie.bh)] = true;
    }
}

