/*
 * Decompiled with CFR 0.152.
 */
public class bkf
extends bmd {
    public final bjw a;
    private final oh bO;
    private double bP;
    private double bQ;
    private double bR;
    private double bS;
    private float bT;
    private float bU;
    private boolean bV;
    private boolean bW;
    private boolean bX;
    private int bY;
    private boolean cd;
    private String ce;

    public bkf(azi azi2, afs afs2, bal bal2, bjw bjw2, oh oh2) {
        super(azi2, afs2, bal2, 0);
        this.a = bjw2;
        this.bO = oh2;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        return false;
    }

    @Override
    public void f(float f2) {
    }

    @Override
    public void a(qr qr2) {
        super.a(qr2);
        if (qr2 instanceof wc) {
            this.d.X().a(new bta(this, (wc)qr2));
        }
    }

    @Override
    public void h() {
        if (!this.o.d(oy.c(this.s), 0, oy.c(this.u))) {
            return;
        }
        super.h();
        if (this.al()) {
            this.a.a(new ix(this.y, this.z, this.D));
            this.a.a(new jb(this.bd, this.be, this.c.c, this.c.d));
        } else {
            this.a();
        }
    }

    public void a() {
        boolean bl2;
        boolean bl3;
        boolean bl4 = this.an();
        if (bl4 != this.bX) {
            if (bl4) {
                this.a.a(new ja(this, 4));
            } else {
                this.a.a(new ja(this, 5));
            }
            this.bX = bl4;
        }
        if ((bl3 = this.am()) != this.bW) {
            if (bl3) {
                this.a.a(new ja(this, 1));
            } else {
                this.a.a(new ja(this, 2));
            }
            this.bW = bl3;
        }
        double d2 = this.s - this.bP;
        double d3 = this.C.b - this.bQ;
        double d4 = this.u - this.bS;
        double d5 = this.y - this.bT;
        double d6 = this.z - this.bU;
        boolean bl5 = d2 * d2 + d3 * d3 + d4 * d4 > 9.0E-4 || this.bY >= 20;
        boolean bl6 = bl2 = d5 != 0.0 || d6 != 0.0;
        if (this.m != null) {
            this.a.a(new iw(this.v, -999.0, -999.0, this.x, this.y, this.z, this.D));
            bl5 = false;
        } else if (bl5 && bl2) {
            this.a.a(new iw(this.s, this.C.b, this.t, this.u, this.y, this.z, this.D));
        } else if (bl5) {
            this.a.a(new iv(this.s, this.C.b, this.t, this.u, this.D));
        } else if (bl2) {
            this.a.a(new ix(this.y, this.z, this.D));
        } else {
            this.a.a(new iu(this.D));
        }
        ++this.bY;
        this.bV = this.D;
        if (bl5) {
            this.bP = this.s;
            this.bQ = this.C.b;
            this.bR = this.t;
            this.bS = this.u;
            this.bY = 0;
        }
        if (bl2) {
            this.bT = this.y;
            this.bU = this.z;
        }
    }

    @Override
    public wb a(boolean bl2) {
        int n2 = bl2 ? 3 : 4;
        this.a.a(new iz(n2, 0, 0, 0, 0));
        return null;
    }

    @Override
    protected void a(wb wb2) {
    }

    public void a(String string) {
        this.a.a(new ii(string));
    }

    @Override
    public void aZ() {
        super.aZ();
        this.a.a(new ig(this, 1));
    }

    @Override
    public void bG() {
        this.a.a(new ij(ik.a));
    }

    @Override
    protected void d(qf qf2, float f2) {
        if (this.av()) {
            return;
        }
        this.g(this.aR() - f2);
    }

    @Override
    public void k() {
        this.a.a(new ip(this.bo.d));
        this.b();
    }

    public void b() {
        this.bm.b((abu)null);
        super.k();
    }

    @Override
    public void n(float f2) {
        if (this.cd) {
            super.n(f2);
        } else {
            this.g(f2);
            this.cd = true;
        }
    }

    @Override
    public void a(ny ny2, int n2) {
        if (ny2 == null) {
            return;
        }
        if (ny2.f) {
            super.a(ny2, n2);
        }
    }

    @Override
    public void q() {
        this.a.a(new iy(this.bE));
    }

    @Override
    protected void i() {
        this.a.a(new ja(this, 6, (int)(this.bU() * 100.0f)));
    }

    public void j() {
        this.a.a(new ja(this, 7));
    }

    public void b(String string) {
        this.ce = string;
    }

    public String l() {
        return this.ce;
    }

    public oh m() {
        return this.bO;
    }
}

