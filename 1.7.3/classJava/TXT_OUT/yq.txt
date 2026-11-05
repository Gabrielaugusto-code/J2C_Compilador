/*
 * Decompiled with CFR 0.152.
 */
public class yq
extends yj {
    private anm a;
    private final zp f;
    private int g;

    public yq(xo xo2, anm anm2) {
        int n2;
        this.a = anm2;
        this.a(new ys(xo2.d, anm2, 0, 56, 46));
        this.a(new ys(xo2.d, anm2, 1, 79, 53));
        this.a(new ys(xo2.d, anm2, 2, 102, 46));
        this.f = this.a(new yr(this, anm2, 3, 79, 17));
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
        yt2.a((yj)this, 0, this.a.i());
    }

    @Override
    public void b() {
        super.b();
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            yt yt2 = (yt)this.e.get(i2);
            if (this.g == this.a.i()) continue;
            yt2.a((yj)this, 0, this.a.i());
        }
        this.g = this.a.i();
    }

    @Override
    public void b(int n2, int n3) {
        if (n2 == 0) {
            this.a.d(n3);
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
            if (n2 >= 0 && n2 <= 2 || n2 == 3) {
                if (!this.a(abu3, 4, 40, true)) {
                    return null;
                }
                zp2.a(abu3, abu2);
            } else if (!this.f.e() && this.f.a(abu3) ? !this.a(abu3, 3, 4, false) : (ys.b_(abu2) ? !this.a(abu3, 0, 3, false) : (n2 >= 4 && n2 < 31 ? !this.a(abu3, 31, 40, false) : (n2 >= 31 && n2 < 40 ? !this.a(abu3, 4, 31, false) : !this.a(abu3, 4, 40, false))))) {
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

