/*
 * Decompiled with CFR 0.152.
 */
public class bjn {
    private bjd[] h;
    private biq[] i;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public String g;

    public bjn(bjs bjs2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f2 + (float)n4;
        this.e = f3 + (float)n5;
        this.f = f4 + (float)n6;
        this.h = new bjd[8];
        this.i = new biq[6];
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        float f8 = f4 + (float)n6;
        f2 -= f5;
        f3 -= f5;
        f4 -= f5;
        f6 += f5;
        f7 += f5;
        f8 += f5;
        if (bjs2.i) {
            float f9 = f6;
            f6 = f2;
            f2 = f9;
        }
        bjd bjd2 = new bjd(f2, f3, f4, 0.0f, 0.0f);
        bjd bjd3 = new bjd(f6, f3, f4, 0.0f, 8.0f);
        bjd bjd4 = new bjd(f6, f7, f4, 8.0f, 8.0f);
        bjd bjd5 = new bjd(f2, f7, f4, 8.0f, 0.0f);
        bjd bjd6 = new bjd(f2, f3, f8, 0.0f, 0.0f);
        bjd bjd7 = new bjd(f6, f3, f8, 0.0f, 8.0f);
        bjd bjd8 = new bjd(f6, f7, f8, 8.0f, 8.0f);
        bjd bjd9 = new bjd(f2, f7, f8, 8.0f, 0.0f);
        this.h[0] = bjd2;
        this.h[1] = bjd3;
        this.h[2] = bjd4;
        this.h[3] = bjd5;
        this.h[4] = bjd6;
        this.h[5] = bjd7;
        this.h[6] = bjd8;
        this.h[7] = bjd9;
        this.i[0] = new biq(new bjd[]{bjd7, bjd3, bjd4, bjd8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n6, n3 + n6 + n5, bjs2.a, bjs2.b);
        this.i[1] = new biq(new bjd[]{bjd2, bjd6, bjd9, bjd5}, n2, n3 + n6, n2 + n6, n3 + n6 + n5, bjs2.a, bjs2.b);
        this.i[2] = new biq(new bjd[]{bjd7, bjd6, bjd2, bjd3}, n2 + n6, n3, n2 + n6 + n4, n3 + n6, bjs2.a, bjs2.b);
        this.i[3] = new biq(new bjd[]{bjd4, bjd5, bjd9, bjd8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n4, n3, bjs2.a, bjs2.b);
        this.i[4] = new biq(new bjd[]{bjd3, bjd2, bjd5, bjd4}, n2 + n6, n3 + n6, n2 + n6 + n4, n3 + n6 + n5, bjs2.a, bjs2.b);
        this.i[5] = new biq(new bjd[]{bjd6, bjd7, bjd8, bjd9}, n2 + n6 + n4 + n6, n3 + n6, n2 + n6 + n4 + n6 + n4, n3 + n6 + n5, bjs2.a, bjs2.b);
        if (bjs2.i) {
            for (int i2 = 0; i2 < this.i.length; ++i2) {
                this.i[i2].a();
            }
        }
    }

    public void a(bna bna2, float f2) {
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2].a(bna2, f2);
        }
    }

    public bjn a(String string) {
        this.g = string;
        return this;
    }
}

