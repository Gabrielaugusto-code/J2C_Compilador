/*
 * Decompiled with CFR 0.152.
 */
public class blx
extends blg {
    private ahz a;

    public blx(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7, ahz ahz2, int n2) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.a = ahz2;
        this.a(ahz2.a(0, n2));
        this.i = ahz2.I;
        this.av = 0.6f;
        this.au = 0.6f;
        this.at = 0.6f;
        this.h /= 2.0f;
    }

    public blx a(int n2, int n3, int n4) {
        if (this.a == aie.c) {
            return this;
        }
        int n5 = this.a.d((agc)this.o, n2, n3, n4);
        this.at *= (float)(n5 >> 16 & 0xFF) / 255.0f;
        this.au *= (float)(n5 >> 8 & 0xFF) / 255.0f;
        this.av *= (float)(n5 & 0xFF) / 255.0f;
        return this;
    }

    public blx a(int n2) {
        if (this.a == aie.c) {
            return this;
        }
        int n3 = this.a.i(n2);
        this.at *= (float)(n3 >> 16 & 0xFF) / 255.0f;
        this.au *= (float)(n3 >> 8 & 0xFF) / 255.0f;
        this.av *= (float)(n3 & 0xFF) / 255.0f;
        return this;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.b + this.d / 4.0f) / 16.0f;
        float f9 = f8 + 0.015609375f;
        float f10 = ((float)this.c + this.e / 4.0f) / 16.0f;
        float f11 = f10 + 0.015609375f;
        float f12 = 0.1f * this.h;
        if (this.ax != null) {
            f8 = this.ax.a(this.d / 4.0f * 16.0f);
            f9 = this.ax.a((this.d + 1.0f) / 4.0f * 16.0f);
            f10 = this.ax.b(this.e / 4.0f * 16.0f);
            f11 = this.ax.b((this.e + 1.0f) / 4.0f * 16.0f);
        }
        float f13 = (float)(this.p + (this.s - this.p) * (double)f2 - ay);
        float f14 = (float)(this.q + (this.t - this.q) * (double)f2 - az);
        float f15 = (float)(this.r + (this.u - this.r) * (double)f2 - aA);
        bna2.b(this.at, this.au, this.av);
        bna2.a(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12, f8, f11);
        bna2.a(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12, f8, f10);
        bna2.a(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12, f9, f10);
        bna2.a(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12, f9, f11);
    }
}

