/*
 * Decompiled with CFR 0.152.
 */
public class yo
extends yj {
    private anh a;
    private final yp f;
    private int g;
    private int h;
    private int i;

    public yo(xo xo2, anh anh2) {
        int n2;
        this.a = anh2;
        this.f = new yp(this, anh2, 0, 136, 110);
        this.a(this.f);
        int n3 = 36;
        int n4 = 137;
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new zp(xo2, i2 + n2 * 9 + 9, n3 + i2 * 18, n4 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new zp(xo2, n2, n3 + n2 * 18, 58 + n4));
        }
        this.g = anh2.l();
        this.h = anh2.j();
        this.i = anh2.k();
    }

    @Override
    public void a(yt yt2) {
        super.a(yt2);
        yt2.a((yj)this, 0, this.g);
        yt2.a((yj)this, 1, this.h);
        yt2.a((yj)this, 2, this.i);
    }

    @Override
    public void b(int n2, int n3) {
        if (n2 == 0) {
            this.a.c(n3);
        }
        if (n2 == 1) {
            this.a.d(n3);
        }
        if (n2 == 2) {
            this.a.e(n3);
        }
    }

    public anh e() {
        return this.a;
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
            if (n2 == 0) {
                if (!this.a(abu3, 1, 37, true)) {
                    return null;
                }
                zp2.a(abu3, abu2);
            } else if (!this.f.e() && this.f.a(abu3) && abu3.b == 1 ? !this.a(abu3, 0, 1, false) : (n2 >= 1 && n2 < 28 ? !this.a(abu3, 28, 37, false) : (n2 >= 28 && n2 < 37 ? !this.a(abu3, 1, 28, false) : !this.a(abu3, 1, 37, false)))) {
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

