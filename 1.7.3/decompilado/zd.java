/*
 * Decompiled with CFR 0.152.
 */
public class zd
extends yj {
    private ps a;
    private uz f;

    public zd(ps ps2, ps ps3, uz uz2) {
        int n2;
        int n3;
        this.a = ps3;
        this.f = uz2;
        int n4 = 3;
        ps3.f();
        int n5 = (n4 - 4) * 18;
        this.a(new ze(this, ps3, 0, 8, 18));
        this.a(new zf(this, ps3, 1, 8, 36, uz2));
        if (uz2.ck()) {
            for (n3 = 0; n3 < n4; ++n3) {
                for (n2 = 0; n2 < 5; ++n2) {
                    this.a(new zp(ps3, 2 + n2 + n3 * 5, 80 + n2 * 18, 18 + n3 * 18));
                }
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new zp(ps2, n2 + n3 * 9 + 9, 8 + n2 * 18, 102 + n3 * 18 + n5));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.a(new zp(ps2, n3, 8 + n3 * 18, 160 + n5));
        }
    }

    @Override
    public boolean a(xq xq2) {
        return this.a.a(xq2) && this.f.Y() && this.f.e((qr)xq2) < 8.0f;
    }

    @Override
    public abu b(xq xq2, int n2) {
        abu abu2 = null;
        zp zp2 = (zp)this.c.get(n2);
        if (zp2 != null && zp2.e()) {
            abu abu3 = zp2.d();
            abu2 = abu3.m();
            if (n2 < this.a.a() ? !this.a(abu3, this.a.a(), this.c.size(), true) : (this.a(1).a(abu3) && !this.a(1).e() ? !this.a(abu3, 1, 2, false) : (this.a(0).a(abu3) ? !this.a(abu3, 0, 1, false) : this.a.a() <= 2 || !this.a(abu3, 2, this.a.a(), false)))) {
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

