/*
 * Decompiled with CFR 0.152.
 */
public class zc
extends yj {
    private final ps a;

    public zc(xo xo2, ps ps2) {
        int n2;
        this.a = ps2;
        ps2.f();
        int n3 = 51;
        for (n2 = 0; n2 < ps2.a(); ++n2) {
            this.a(new zp(ps2, n2, 44 + n2 * 18, 20));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new zp(xo2, i2 + n2 * 9 + 9, 8 + i2 * 18, n2 * 18 + n3));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new zp(xo2, n2, 8 + n2 * 18, 58 + n3));
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
            if (n2 < this.a.a() ? !this.a(abu3, this.a.a(), this.c.size(), true) : !this.a(abu3, 0, this.a.a(), false)) {
                return null;
            }
            if (abu3.b == 0) {
                zp2.c(null);
            } else {
                zp2.f();
            }
        }
        return abu2;
    }

    @Override
    public void b(xq xq2) {
        super.b(xq2);
        this.a.l_();
    }
}

