/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public abstract class ru
extends rn {
    public static final UUID h = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
    public static final sa i = new sa(h, "Fleeing speed bonus", 2.0, 2).a(false);
    private aww bp;
    protected qr bm;
    protected boolean bn;
    protected int bo;
    private r bq = new r(0, 0, 0);
    private float br = -1.0f;
    private sz bs = new tk(this, 1.0);
    private boolean bt;

    public ru(afs afs2) {
        super(afs2);
    }

    protected boolean bP() {
        return false;
    }

    @Override
    protected void bp() {
        this.o.C.a("ai");
        if (this.bo > 0 && --this.bo == 0) {
            rz rz2 = this.a(xa.d);
            rz2.b(i);
        }
        this.bn = this.bP();
        float f2 = 16.0f;
        if (this.bm == null) {
            this.bm = this.bR();
            if (this.bm != null) {
                this.bp = this.o.a((qr)this, this.bm, f2, true, false, false, true);
            }
        } else if (this.bm.Y()) {
            float f3 = this.bm.e(this);
            if (this.p(this.bm)) {
                this.a(this.bm, f3);
            }
        } else {
            this.bm = null;
        }
        if (this.bm instanceof mp && ((mp)this.bm).c.d()) {
            this.bm = null;
        }
        this.o.C.b();
        if (!(this.bn || this.bm == null || this.bp != null && this.Z.nextInt(20) != 0)) {
            this.bp = this.o.a((qr)this, this.bm, f2, true, false, false, true);
        } else if (!this.bn && (this.bp == null && this.Z.nextInt(180) == 0 || this.Z.nextInt(120) == 0 || this.bo > 0) && this.aU < 100) {
            this.bQ();
        }
        int n2 = oy.c(this.C.b + 0.5);
        boolean bl2 = this.L();
        boolean bl3 = this.O();
        this.z = 0.0f;
        if (this.bp == null || this.Z.nextInt(100) == 0) {
            super.bp();
            this.bp = null;
            return;
        }
        this.o.C.a("followpath");
        ayp ayp2 = this.bp.a(this);
        double d2 = this.M * 2.0f;
        while (ayp2 != null && ayp2.d(this.s, ayp2.d, this.u) < d2 * d2) {
            this.bp.a();
            if (this.bp.b()) {
                ayp2 = null;
                this.bp = null;
                continue;
            }
            ayp2 = this.bp.a(this);
        }
        this.bc = false;
        if (ayp2 != null) {
            double d3 = ayp2.c - this.s;
            double d4 = ayp2.e - this.u;
            double d5 = ayp2.d - (double)n2;
            float f4 = (float)(Math.atan2(d4, d3) * 180.0 / 3.1415927410125732) - 90.0f;
            float f5 = oy.g(f4 - this.y);
            this.be = (float)this.a(xa.d).e();
            if (f5 > 30.0f) {
                f5 = 30.0f;
            }
            if (f5 < -30.0f) {
                f5 = -30.0f;
            }
            this.y += f5;
            if (this.bn && this.bm != null) {
                double d6 = this.bm.s - this.s;
                double d7 = this.bm.u - this.u;
                float f6 = this.y;
                this.y = (float)(Math.atan2(d7, d6) * 180.0 / 3.1415927410125732) - 90.0f;
                f5 = (f6 - this.y + 90.0f) * (float)Math.PI / 180.0f;
                this.bd = -oy.a(f5) * this.be * 1.0f;
                this.be = oy.b(f5) * this.be * 1.0f;
            }
            if (d5 > 0.0) {
                this.bc = true;
            }
        }
        if (this.bm != null) {
            this.a(this.bm, 30.0f, 30.0f);
        }
        if (this.E && !this.bS()) {
            this.bc = true;
        }
        if (this.Z.nextFloat() < 0.8f && (bl2 || bl3)) {
            this.bc = true;
        }
        this.o.C.b();
    }

    protected void bQ() {
        this.o.C.a("stroll");
        boolean bl2 = false;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        float f2 = -99999.0f;
        for (int i2 = 0; i2 < 10; ++i2) {
            int n5;
            int n6;
            int n7 = oy.c(this.s + (double)this.Z.nextInt(13) - 6.0);
            float f3 = this.a(n7, n6 = oy.c(this.t + (double)this.Z.nextInt(7) - 3.0), n5 = oy.c(this.u + (double)this.Z.nextInt(13) - 6.0));
            if (!(f3 > f2)) continue;
            f2 = f3;
            n2 = n7;
            n3 = n6;
            n4 = n5;
            bl2 = true;
        }
        if (bl2) {
            this.bp = this.o.a(this, n2, n3, n4, 10.0f, true, false, false, true);
        }
        this.o.C.b();
    }

    protected void a(qr qr2, float f2) {
    }

    public float a(int n2, int n3, int n4) {
        return 0.0f;
    }

    protected qr bR() {
        return null;
    }

    @Override
    public boolean by() {
        int n2 = oy.c(this.s);
        int n3 = oy.c(this.C.b);
        int n4 = oy.c(this.u);
        return super.by() && this.a(n2, n3, n4) >= 0.0f;
    }

    public boolean bS() {
        return this.bp != null;
    }

    public void a(aww aww2) {
        this.bp = aww2;
    }

    public qr bT() {
        return this.bm;
    }

    public void b(qr qr2) {
        this.bm = qr2;
    }

    public boolean bU() {
        return this.b(oy.c(this.s), oy.c(this.t), oy.c(this.u));
    }

    public boolean b(int n2, int n3, int n4) {
        if (this.br == -1.0f) {
            return true;
        }
        return this.bq.e(n2, n3, n4) < this.br * this.br;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.bq.b(n2, n3, n4);
        this.br = n5;
    }

    public r bV() {
        return this.bq;
    }

    public float bW() {
        return this.br;
    }

    public void bX() {
        this.br = -1.0f;
    }

    public boolean bY() {
        return this.br != -1.0f;
    }

    @Override
    protected void bL() {
        super.bL();
        if (this.bN() && this.bO() != null && this.bO().o == this.o) {
            qr qr2 = this.bO();
            this.a((int)qr2.s, (int)qr2.t, (int)qr2.u, 5);
            float f2 = this.e(qr2);
            if (this instanceof rx && ((rx)this).ca()) {
                if (f2 > 10.0f) {
                    this.a(true, true);
                }
                return;
            }
            if (!this.bt) {
                this.c.a(2, this.bs);
                this.m().a(false);
                this.bt = true;
            }
            this.o(f2);
            if (f2 > 4.0f) {
                this.m().a(qr2, 1.0);
            }
            if (f2 > 6.0f) {
                double d2 = (qr2.s - this.s) / (double)f2;
                double d3 = (qr2.t - this.t) / (double)f2;
                double d4 = (qr2.u - this.u) / (double)f2;
                this.v += d2 * Math.abs(d2) * 0.4;
                this.w += d3 * Math.abs(d3) * 0.4;
                this.x += d4 * Math.abs(d4) * 0.4;
            }
            if (f2 > 10.0f) {
                this.a(true, true);
            }
        } else if (!this.bN() && this.bt) {
            this.bt = false;
            this.c.a(this.bs);
            this.m().a(true);
            this.bX();
        }
    }

    protected void o(float f2) {
    }
}

