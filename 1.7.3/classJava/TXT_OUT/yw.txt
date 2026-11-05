/*
 * Decompiled with CFR 0.152.
 */
public class yw
extends yj {
    public yv a = new yv(this, 3, 3);
    public ps f = new zn();
    private afs g;
    private int h;
    private int i;
    private int j;

    public yw(xo xo2, afs afs2, int n2, int n3, int n4) {
        int n5;
        int n6;
        this.g = afs2;
        this.h = n2;
        this.i = n3;
        this.j = n4;
        this.a(new zo(xo2.d, this.a, this.f, 0, 124, 35));
        for (n6 = 0; n6 < 3; ++n6) {
            for (n5 = 0; n5 < 3; ++n5) {
                this.a(new zp(this.a, n5 + n6 * 3, 30 + n5 * 18, 17 + n6 * 18));
            }
        }
        for (n6 = 0; n6 < 3; ++n6) {
            for (n5 = 0; n5 < 9; ++n5) {
                this.a(new zp(xo2, n5 + n6 * 9 + 9, 8 + n5 * 18, 84 + n6 * 18));
            }
        }
        for (n6 = 0; n6 < 9; ++n6) {
            this.a(new zp(xo2, n6, 8 + n6 * 18, 142));
        }
        this.a(this.a);
    }

    @Override
    public void a(ps ps2) {
        this.f.a(0, adv.a().a(this.a, this.g));
    }

    @Override
    public void b(xq xq2) {
        super.b(xq2);
        if (this.g.E) {
            return;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            abu abu2 = this.a.a_(i2);
            if (abu2 == null) continue;
            xq2.a(abu2, false);
        }
    }

    @Override
    public boolean a(xq xq2) {
        if (this.g.a(this.h, this.i, this.j) != aie.ai) {
            return false;
        }
        return !(xq2.e((double)this.h + 0.5, (double)this.i + 0.5, (double)this.j + 0.5) > 64.0);
    }

    @Override
    public abu b(xq xq2, int n2) {
        abu abu2 = null;
        zp zp2 = (zp)this.c.get(n2);
        if (zp2 != null && zp2.e()) {
            abu abu3 = zp2.d();
            abu2 = abu3.m();
            if (n2 == 0) {
                if (!this.a(abu3, 10, 46, true)) {
                    return null;
                }
                zp2.a(abu3, abu2);
            } else if (n2 >= 10 && n2 < 37 ? !this.a(abu3, 37, 46, false) : (n2 >= 37 && n2 < 46 ? !this.a(abu3, 10, 37, false) : !this.a(abu3, 10, 46, false))) {
                return null;
            }
            if (abu3.b == 0) {
                zp2.c(null);
            } else {
                zp2.f();
            }
            if (abu3.b == abu2.b) {
                return null;
            }
            zp2.a(xq2, abu3);
        }
        return abu2;
    }

    @Override
    public boolean a(abu abu2, zp zp2) {
        return zp2.f != this.f && super.a(abu2, zp2);
    }
}

