/*
 * Decompiled with CFR 0.152.
 */
public class bko
extends blg {
    public bko(afs afs2, double d2, double d3, double d4, abs abs2) {
        this(afs2, d2, d3, d4, abs2, 0);
    }

    public bko(afs afs2, double d2, double d3, double d4, abs abs2, int n2) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.a(abs2.b_(n2));
        this.av = 1.0f;
        this.au = 1.0f;
        this.at = 1.0f;
        this.i = aie.aE.I;
        this.h /= 2.0f;
    }

    public bko(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7, abs abs2, int n2) {
        this(afs2, d2, d3, d4, abs2, n2);
        this.v *= (double)0.1f;
        this.w *= (double)0.1f;
        this.x *= (double)0.1f;
        this.v += d5;
        this.w += d6;
        this.x += d7;
    }

    @Override
    public int a() {
        return 2;
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

