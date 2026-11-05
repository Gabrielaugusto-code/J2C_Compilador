/*
 * Decompiled with CFR 0.152.
 */
public class rk
extends rj {
    private float e = 1.0f;

    public rk(afs afs2) {
        super(afs2);
    }

    public rk(afs afs2, int n2, int n3, int n4, int n5) {
        super(afs2, n2, n3, n4, n5);
        this.a(n5);
    }

    @Override
    protected void c() {
        this.y().a(2, 5);
        this.y().a(3, (Object)0);
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        if (this.j() != null) {
            if (!this.o.E) {
                this.b(qf2.j(), false);
                this.a((abu)null);
            }
            return true;
        }
        return super.a(qf2, f2);
    }

    @Override
    public int f() {
        return 9;
    }

    @Override
    public int i() {
        return 9;
    }

    @Override
    public boolean a(double d2) {
        double d3 = 16.0;
        return d2 < (d3 *= 64.0 * this.j) * d3;
    }

    @Override
    public void b(qr qr2) {
        this.b(qr2, true);
    }

    public void b(qr qr2, boolean bl2) {
        abu abu2 = this.j();
        if (qr2 instanceof xq) {
            xq xq2 = (xq)qr2;
            if (xq2.bE.d) {
                this.b(abu2);
                return;
            }
        }
        if (bl2) {
            this.a(new abu(abv.bD), 0.0f);
        }
        if (abu2 != null && this.Z.nextFloat() < this.e) {
            abu2 = abu2.m();
            this.b(abu2);
            this.a(abu2, 0.0f);
        }
    }

    private void b(abu abu2) {
        if (abu2 == null) {
            return;
        }
        if (abu2.b() == abv.aY) {
            awz awz2 = ((aby)abu2.b()).a(abu2, this.o);
            awz2.g.remove("frame-" + this.x());
        }
        abu2.a((rk)null);
    }

    public abu j() {
        return this.y().f(2);
    }

    public void a(abu abu2) {
        if (abu2 != null) {
            abu2 = abu2.m();
            abu2.b = 1;
            abu2.a(this);
        }
        this.y().b(2, abu2);
        this.y().h(2);
    }

    public int k() {
        return this.y().a(3);
    }

    public void c(int n2) {
        this.y().b(3, (byte)(n2 % 4));
    }

    @Override
    public void b(dg dg2) {
        if (this.j() != null) {
            dg2.a("Item", this.j().b(new dg()));
            dg2.a("ItemRotation", (byte)this.k());
            dg2.a("ItemDropChance", this.e);
        }
        super.b(dg2);
    }

    @Override
    public void a(dg dg2) {
        dg dg3 = dg2.m("Item");
        if (dg3 != null && !dg3.d()) {
            this.a(abu.a(dg3));
            this.c(dg2.d("ItemRotation"));
            if (dg2.b("ItemDropChance", 99)) {
                this.e = dg2.h("ItemDropChance");
            }
        }
        super.a(dg2);
    }

    @Override
    public boolean c(xq xq2) {
        if (this.j() == null) {
            abu abu2 = xq2.bd();
            if (abu2 != null && !this.o.E) {
                this.a(abu2);
                if (!xq2.bE.d && --abu2.b <= 0) {
                    xq2.bm.a(xq2.bm.c, null);
                }
            }
        } else if (!this.o.E) {
            this.c(this.k() + 1);
        }
        return true;
    }
}

