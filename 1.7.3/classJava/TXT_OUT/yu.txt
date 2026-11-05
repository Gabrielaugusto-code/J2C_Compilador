/*
 * Decompiled with CFR 0.152.
 */
public class yu
extends yj {
    private ps a;
    private int f;

    public yu(ps ps2, ps ps3) {
        int n2;
        int n3;
        this.a = ps3;
        this.f = ps3.a() / 9;
        ps3.f();
        int n4 = (this.f - 4) * 18;
        for (n3 = 0; n3 < this.f; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new zp(ps3, n2 + n3 * 9, 8 + n2 * 18, 18 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new zp(ps2, n2 + n3 * 9 + 9, 8 + n2 * 18, 103 + n3 * 18 + n4));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.a(new zp(ps2, n3, 8 + n3 * 18, 161 + n4));
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
            if (n2 < this.f * 9 ? !this.a(abu3, this.f * 9, this.c.size(), true) : !this.a(abu3, 0, this.f * 9, false)) {
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

    public ps e() {
        return this.a;
    }
}

