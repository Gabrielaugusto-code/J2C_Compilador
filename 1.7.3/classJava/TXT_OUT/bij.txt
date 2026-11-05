/*
 * Decompiled with CFR 0.152.
 */
public class bij
extends bim {
    bjs[] a = new bjs[8];
    bjs b;

    public bij() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n2 = 0;
            int n3 = i2;
            if (i2 == 2) {
                n2 = 24;
                n3 = 10;
            } else if (i2 == 3) {
                n2 = 24;
                n3 = 19;
            }
            this.a[i2] = new bjs(this, n2, n3);
            this.a[i2].a(-4.0f, 16 + i2, -4.0f, 8, 1, 8);
        }
        this.b = new bjs(this, 0, 16);
        this.b.a(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }

    @Override
    public void a(rm rm2, float f2, float f3, float f4) {
        ww ww2 = (ww)rm2;
        float f5 = ww2.bm + (ww2.i - ww2.bm) * f4;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2].d = (float)(-(4 - i2)) * f5 * 1.7f;
        }
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        this.b.a(f7);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2].a(f7);
        }
    }
}

