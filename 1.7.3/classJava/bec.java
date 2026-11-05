/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

class bec
extends yj {
    public List a = new ArrayList();

    public bec(xq xq2) {
        int n2;
        xo xo2 = xq2.bm;
        for (n2 = 0; n2 < 5; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new zp(beb.h(), n2 * 9 + i2, 9 + i2 * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new zp(xo2, n2, 9 + n2 * 18, 112));
        }
        this.a(0.0f);
    }

    @Override
    public boolean a(xq xq2) {
        return true;
    }

    public void a(float f2) {
        int n2 = this.a.size() / 9 - 5 + 1;
        int n3 = (int)((double)(f2 * (float)n2) + 0.5);
        if (n3 < 0) {
            n3 = 0;
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 9; ++i3) {
                int n4 = i3 + (i2 + n3) * 9;
                if (n4 >= 0 && n4 < this.a.size()) {
                    beb.h().a(i3 + i2 * 9, (abu)this.a.get(n4));
                    continue;
                }
                beb.h().a(i3 + i2 * 9, null);
            }
        }
    }

    public boolean e() {
        return this.a.size() > 45;
    }

    @Override
    protected void a(int n2, int n3, boolean bl2, xq xq2) {
    }

    @Override
    public abu b(xq xq2, int n2) {
        zp zp2;
        if (n2 >= this.c.size() - 9 && n2 < this.c.size() && (zp2 = (zp)this.c.get(n2)) != null && zp2.e()) {
            zp2.c(null);
        }
        return null;
    }

    @Override
    public boolean a(abu abu2, zp zp2) {
        return zp2.i > 90;
    }

    @Override
    public boolean b(zp zp2) {
        return zp2.f instanceof xo || zp2.i > 90 && zp2.h <= 162;
    }
}

