/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.UUID;

public class xg
extends wx
implements wz {
    private static final UUID bp = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
    private static final sa bq = new sa(bp, "Drinking speed penalty", -0.25, 0).a(false);
    private static final abs[] br = new abs[]{abv.aO, abv.aT, abv.ax, abv.bp, abv.bo, abv.H, abv.y, abv.y};
    private int bs;

    public xg(afs afs2) {
        super(afs2);
        this.c.a(1, new sw(this));
        this.c.a(2, new tu(this, 1.0, 60, 10.0f));
        this.c.a(2, new tt(this, 1.0));
        this.c.a(3, new te(this, xq.class, 8.0f));
        this.c.a(3, new ts(this));
        this.d.a(1, new ue(this, false));
        this.d.a(2, new uf(this, xq.class, 0, true));
    }

    @Override
    protected void c() {
        super.c();
        this.y().a(21, (Object)0);
    }

    @Override
    protected String t() {
        return "mob.witch.idle";
    }

    @Override
    protected String aS() {
        return "mob.witch.hurt";
    }

    @Override
    protected String aT() {
        return "mob.witch.death";
    }

    public void a(boolean bl2) {
        this.y().b(21, bl2 ? (byte)1 : 0);
    }

    public boolean bZ() {
        return this.y().a(21) == 1;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(26.0);
        this.a(xa.d).a(0.25);
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    public void e() {
        if (!this.o.E) {
            if (this.bZ()) {
                if (this.bs-- <= 0) {
                    List list;
                    this.a(false);
                    abu abu2 = this.bd();
                    this.c(0, null);
                    if (abu2 != null && abu2.b() == abv.bn && (list = abv.bn.g(abu2)) != null) {
                        for (qn qn2 : list) {
                            this.c(new qn(qn2));
                        }
                    }
                    this.a(xa.d).b(bq);
                }
            } else {
                int n2 = -1;
                if (this.Z.nextFloat() < 0.15f && this.a(avk.h) && !this.a(qm.o)) {
                    n2 = 8237;
                } else if (this.Z.nextFloat() < 0.15f && this.ak() && !this.a(qm.n)) {
                    n2 = 16307;
                } else if (this.Z.nextFloat() < 0.05f && this.aR() < this.aX()) {
                    n2 = 16341;
                } else if (this.Z.nextFloat() < 0.25f && this.o() != null && !this.a(qm.c) && this.o().f(this) > 121.0) {
                    n2 = 16274;
                } else if (this.Z.nextFloat() < 0.25f && this.o() != null && !this.a(qm.c) && this.o().f(this) > 121.0) {
                    n2 = 16274;
                }
                if (n2 > -1) {
                    this.c(0, new abu(abv.bn, 1, n2));
                    this.bs = this.bd().n();
                    this.a(true);
                    rz rz2 = this.a(xa.d);
                    rz2.b(bq);
                    rz2.a(bq);
                }
            }
            if (this.Z.nextFloat() < 7.5E-4f) {
                this.o.a((qr)this, (byte)15);
            }
        }
        super.e();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 15) {
            for (int i2 = 0; i2 < this.Z.nextInt(35) + 10; ++i2) {
                this.o.a("witchMagic", this.s + this.Z.nextGaussian() * (double)0.13f, this.C.e + 0.5 + this.Z.nextGaussian() * (double)0.13f, this.u + this.Z.nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0);
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    protected float c(qf qf2, float f2) {
        f2 = super.c(qf2, f2);
        if (qf2.j() == this) {
            f2 = 0.0f;
        }
        if (qf2.s()) {
            f2 = (float)((double)f2 * 0.15);
        }
        return f2;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3 = this.Z.nextInt(3) + 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = this.Z.nextInt(3);
            abs abs2 = br[this.Z.nextInt(br.length)];
            if (n2 > 0) {
                n4 += this.Z.nextInt(n2 + 1);
            }
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a(abs2, 1);
            }
        }
    }

    @Override
    public void a(rm rm2, float f2) {
        if (this.bZ()) {
            return;
        }
        yf yf2 = new yf(this.o, (rm)this, 32732);
        yf2.z -= -20.0f;
        double d2 = rm2.s + rm2.v - this.s;
        double d3 = rm2.t + (double)rm2.g() - (double)1.1f - this.t;
        double d4 = rm2.u + rm2.x - this.u;
        float f3 = oy.a(d2 * d2 + d4 * d4);
        if (f3 >= 8.0f && !rm2.a(qm.d)) {
            yf2.a(32698);
        } else if (rm2.aR() >= 8.0f && !rm2.a(qm.u)) {
            yf2.a(32660);
        } else if (f3 <= 3.0f && !rm2.a(qm.t) && this.Z.nextFloat() < 0.25f) {
            yf2.a(32696);
        }
        yf2.c(d2, d3 + (double)(f3 * 0.2f), d4, 0.75f, 8.0f);
        this.o.d(yf2);
    }
}

