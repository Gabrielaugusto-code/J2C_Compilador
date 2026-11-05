/*
 * Decompiled with CFR 0.152.
 */
public class bhy
extends bim {
    private bjs[] a = new bjs[12];
    private bjs b;

    public bhy() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new bjs(this, 0, 16);
            this.a[i2].a(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.b = new bjs(this, 0, 0);
        this.b.a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    public int a() {
        return 8;
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        this.b.a(f7);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2].a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        int n2;
        float f8 = f4 * (float)Math.PI * -0.1f;
        for (n2 = 0; n2 < 4; ++n2) {
            this.a[n2].d = -2.0f + oy.b(((float)(n2 * 2) + f4) * 0.25f);
            this.a[n2].c = oy.b(f8) * 9.0f;
            this.a[n2].e = oy.a(f8) * 9.0f;
            f8 += 1.5707964f;
        }
        f8 = 0.7853982f + f4 * (float)Math.PI * 0.03f;
        for (n2 = 4; n2 < 8; ++n2) {
            this.a[n2].d = 2.0f + oy.b(((float)(n2 * 2) + f4) * 0.25f);
            this.a[n2].c = oy.b(f8) * 7.0f;
            this.a[n2].e = oy.a(f8) * 7.0f;
            f8 += 1.5707964f;
        }
        f8 = 0.47123894f + f4 * (float)Math.PI * -0.05f;
        for (n2 = 8; n2 < 12; ++n2) {
            this.a[n2].d = 11.0f + oy.b(((float)n2 * 1.5f + f4) * 0.5f);
            this.a[n2].c = oy.b(f8) * 5.0f;
            this.a[n2].e = oy.a(f8) * 5.0f;
            f8 += 1.5707964f;
        }
        this.b.g = f5 / 57.295776f;
        this.b.f = f6 / 57.295776f;
    }
}

