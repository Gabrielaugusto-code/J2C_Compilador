/*
 * Decompiled with CFR 0.152.
 */
public class zg
extends yj {
    public yv a = new yv(this, 2, 2);
    public ps f = new zn();
    public boolean g;
    private final xq h;

    public zg(xo xo2, boolean bl2, xq xq2) {
        int n2;
        int n3;
        this.g = bl2;
        this.h = xq2;
        this.a(new zo(xo2.d, this.a, this.f, 0, 144, 36));
        for (n3 = 0; n3 < 2; ++n3) {
            for (n2 = 0; n2 < 2; ++n2) {
                this.a(new zp(this.a, n2 + n3 * 2, 88 + n2 * 18, 26 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 4; ++n3) {
            n2 = n3;
            this.a(new zh(this, xo2, xo2.a() - 1 - n3, 8, 8 + n3 * 18, n2));
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new zp(xo2, n2 + (n3 + 1) * 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.a(new zp(xo2, n3, 8 + n3 * 18, 142));
        }
        this.a(this.a);
    }

    @Override
    public void a(ps ps2) {
        this.f.a(0, adv.a().a(this.a, this.h.o));
    }

    @Override
    public void b(xq xq2) {
        super.b(xq2);
        for (int i2 = 0; i2 < 4; ++i2) {
            abu abu2 = this.a.a_(i2);
            if (abu2 == null) continue;
            xq2.a(abu2, false);
        }
        this.f.a(0, null);
    }

    @Override
    public boolean a(xq xq2) {
        return true;
    }

    @Override
    public abu b(xq xq2, int n2) {
        abu abu2 = null;
        zp zp2 = (zp)this.c.get(n2);
        if (zp2 != null && zp2.e()) {
            int n3;
            abu abu3 = zp2.d();
            abu2 = abu3.m();
            if (n2 == 0) {
                if (!this.a(abu3, 9, 45, true)) {
                    return null;
                }
                zp2.a(abu3, abu2);
            } else if (n2 >= 1 && n2 < 5 ? !this.a(abu3, 9, 45, false) : (n2 >= 5 && n2 < 9 ? !this.a(abu3, 9, 45, false) : (abu2.b() instanceof zs && !((zp)this.c.get(5 + ((zs)abu2.b()).b)).e() ? !this.a(abu3, n3 = 5 + ((zs)abu2.b()).b, n3 + 1, false) : (n2 >= 9 && n2 < 36 ? !this.a(abu3, 36, 45, false) : (n2 >= 36 && n2 < 45 ? !this.a(abu3, 9, 36, false) : !this.a(abu3, 9, 45, false)))))) {
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

