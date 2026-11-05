/*
 * Decompiled with CFR 0.152.
 */
public class bji
extends bim {
    private bjs[] a;
    private bjs[] b;

    public bji() {
        this.t = 64;
        this.u = 64;
        this.a = new bjs[3];
        this.a[0] = new bjs(this, 0, 16);
        this.a[0].a(-10.0f, 3.9f, -0.5f, 20, 3, 3);
        this.a[1] = new bjs(this).b(this.t, this.u);
        this.a[1].a(-2.0f, 6.9f, -0.5f);
        this.a[1].a(0, 22).a(0.0f, 0.0f, 0.0f, 3, 10, 3);
        this.a[1].a(24, 22).a(-4.0f, 1.5f, 0.5f, 11, 2, 2);
        this.a[1].a(24, 22).a(-4.0f, 4.0f, 0.5f, 11, 2, 2);
        this.a[1].a(24, 22).a(-4.0f, 6.5f, 0.5f, 11, 2, 2);
        this.a[2] = new bjs(this, 12, 22);
        this.a[2].a(0.0f, 0.0f, 0.0f, 3, 6, 3);
        this.b = new bjs[3];
        this.b[0] = new bjs(this, 0, 0);
        this.b[0].a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.b[1] = new bjs(this, 32, 0);
        this.b[1].a(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.b[1].c = -8.0f;
        this.b[1].d = 4.0f;
        this.b[2] = new bjs(this, 32, 0);
        this.b[2].a(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.b[2].c = 10.0f;
        this.b[2].d = 4.0f;
    }

    public int a() {
        return 32;
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        for (bjs bjs2 : this.b) {
            bjs2.a(f7);
        }
        for (bjs bjs2 : this.a) {
            bjs2.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        float f8 = oy.b(f4 * 0.1f);
        this.a[1].f = (0.065f + 0.05f * f8) * (float)Math.PI;
        this.a[2].a(-2.0f, 6.9f + oy.b(this.a[1].f) * 10.0f, -0.5f + oy.a(this.a[1].f) * 10.0f);
        this.a[2].f = (0.265f + 0.1f * f8) * (float)Math.PI;
        this.b[0].g = f5 / 57.295776f;
        this.b[0].f = f6 / 57.295776f;
    }

    @Override
    public void a(rm rm2, float f2, float f3, float f4) {
        vt vt2 = (vt)rm2;
        for (int i2 = 1; i2 < 3; ++i2) {
            this.b[i2].g = (vt2.a(i2 - 1) - rm2.aM) / 57.295776f;
            this.b[i2].f = vt2.c(i2 - 1) / 57.295776f;
        }
    }
}

