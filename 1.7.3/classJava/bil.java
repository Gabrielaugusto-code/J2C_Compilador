/*
 * Decompiled with CFR 0.152.
 */
public class bil
extends bim {
    public bjs[] a = new bjs[7];

    public bil() {
        this.a[0] = new bjs(this, 0, 10);
        this.a[1] = new bjs(this, 0, 0);
        this.a[2] = new bjs(this, 0, 0);
        this.a[3] = new bjs(this, 0, 0);
        this.a[4] = new bjs(this, 0, 0);
        this.a[5] = new bjs(this, 44, 10);
        int n2 = 20;
        int n3 = 8;
        int n4 = 16;
        int n5 = 4;
        this.a[0].a(-n2 / 2, (float)(-n4 / 2), -1.0f, n2, n4, 2, 0.0f);
        this.a[0].a(0.0f, n5, 0.0f);
        this.a[5].a(-n2 / 2 + 1, (float)(-n4 / 2 + 1), -1.0f, n2 - 2, n4 - 2, 1, 0.0f);
        this.a[5].a(0.0f, n5, 0.0f);
        this.a[1].a(-n2 / 2 + 2, (float)(-n3 - 1), -1.0f, n2 - 4, n3, 2, 0.0f);
        this.a[1].a(-n2 / 2 + 1, n5, 0.0f);
        this.a[2].a(-n2 / 2 + 2, (float)(-n3 - 1), -1.0f, n2 - 4, n3, 2, 0.0f);
        this.a[2].a(n2 / 2 - 1, n5, 0.0f);
        this.a[3].a(-n2 / 2 + 2, (float)(-n3 - 1), -1.0f, n2 - 4, n3, 2, 0.0f);
        this.a[3].a(0.0f, n5, -n4 / 2 + 1);
        this.a[4].a(-n2 / 2 + 2, (float)(-n3 - 1), -1.0f, n2 - 4, n3, 2, 0.0f);
        this.a[4].a(0.0f, n5, n4 / 2 - 1);
        this.a[0].f = 1.5707964f;
        this.a[1].g = 4.712389f;
        this.a[2].g = 1.5707964f;
        this.a[3].g = (float)Math.PI;
        this.a[5].f = -1.5707964f;
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a[5].d = 4.0f - f4;
        for (int i2 = 0; i2 < 6; ++i2) {
            this.a[i2].a(f7);
        }
    }
}

