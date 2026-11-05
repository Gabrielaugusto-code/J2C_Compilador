/*
 * Decompiled with CFR 0.152.
 */
public class biq {
    public bjd[] a;
    public int b;
    private boolean c;

    public biq(bjd[] bjdArray) {
        this.a = bjdArray;
        this.b = bjdArray.length;
    }

    public biq(bjd[] bjdArray, int n2, int n3, int n4, int n5, float f2, float f3) {
        this(bjdArray);
        float f4 = 0.0f / f2;
        float f5 = 0.0f / f3;
        bjdArray[0] = bjdArray[0].a((float)n4 / f2 - f4, (float)n3 / f3 + f5);
        bjdArray[1] = bjdArray[1].a((float)n2 / f2 + f4, (float)n3 / f3 + f5);
        bjdArray[2] = bjdArray[2].a((float)n2 / f2 + f4, (float)n5 / f3 - f5);
        bjdArray[3] = bjdArray[3].a((float)n4 / f2 - f4, (float)n5 / f3 - f5);
    }

    public void a() {
        bjd[] bjdArray = new bjd[this.a.length];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            bjdArray[i2] = this.a[this.a.length - i2 - 1];
        }
        this.a = bjdArray;
    }

    public void a(bna bna2, float f2) {
        ayp ayp2 = this.a[1].a.a(this.a[0].a);
        ayp ayp3 = this.a[1].a.a(this.a[2].a);
        ayp ayp4 = ayp3.c(ayp2).a();
        bna2.b();
        if (this.c) {
            bna2.c(-((float)ayp4.c), -((float)ayp4.d), -((float)ayp4.e));
        } else {
            bna2.c((float)ayp4.c, (float)ayp4.d, (float)ayp4.e);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            bjd bjd2 = this.a[i2];
            bna2.a((float)bjd2.a.c * f2, (float)bjd2.a.d * f2, (float)bjd2.a.e * f2, bjd2.b, bjd2.c);
        }
        bna2.a();
    }
}

