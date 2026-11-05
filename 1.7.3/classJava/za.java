/*
 * Decompiled with CFR 0.152.
 */
public class za
extends yj {
    private anx a;
    private int f;
    private int g;
    private int h;

    public za(xo xo2, anx anx2) {
        int n2;
        this.a = anx2;
        this.a(new zp(anx2, 0, 56, 17));
        this.a(new zp(anx2, 1, 56, 53));
        this.a(new zb(xo2.d, anx2, 2, 116, 35));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new zp(xo2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new zp(xo2, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public void a(yt yt2) {
        super.a(yt2);
        yt2.a((yj)this, 0, this.a.j);
        yt2.a((yj)this, 1, this.a.a);
        yt2.a((yj)this, 2, this.a.i);
    }

    @Override
    public void b() {
        super.b();
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            yt yt2 = (yt)this.e.get(i2);
            if (this.f != this.a.j) {
                yt2.a((yj)this, 0, this.a.j);
            }
            if (this.g != this.a.a) {
                yt2.a((yj)this, 1, this.a.a);
            }
            if (this.h == this.a.i) continue;
            yt2.a((yj)this, 2, this.a.i);
        }
        this.f = this.a.j;
        this.g = this.a.a;
        this.h = this.a.i;
    }

    @Override
    public void b(int n2, int n3) {
        if (n2 == 0) {
            this.a.j = n3;
        }
        if (n2 == 1) {
            this.a.a = n3;
        }
        if (n2 == 2) {
            this.a.i = n3;
        }
    }

    @Override
    public boolean a(xq xq2) {
        return this.a.a(xq2);
    }

    @Override
    public abu b(xq xq2, int n2) {
        abu abu2 = null;
        zp zp2 = (zp)this.c.get(n2);
        if (zp2 != null && zp2.e()) {
            abu abu3 = zp2.d();
            abu2 = abu3.m();
            if (n2 == 2) {
                if (!this.a(abu3, 3, 39, true)) {
                    return null;
                }
                zp2.a(abu3, abu2);
            } else if (n2 == 1 || n2 == 0 ? !this.a(abu3, 3, 39, false) : (adr.a().a(abu3) != null ? !this.a(abu3, 0, 1, false) : (anx.b(abu3) ? !this.a(abu3, 1, 2, false) : (n2 >= 3 && n2 < 30 ? !this.a(abu3, 30, 39, false) : n2 >= 30 && n2 < 39 && !this.a(abu3, 3, 30, false))))) {
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
}

