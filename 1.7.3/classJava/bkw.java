/*
 * Decompiled with CFR 0.152.
 */
public class bkw
extends blg {
    protected bkw(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
        this.g = 4;
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = 0.25f;
        float f9 = f8 + 0.25f;
        float f10 = 0.125f;
        float f11 = f10 + 0.25f;
        float f12 = 7.1f * oy.a(((float)this.f + f2 - 1.0f) * 0.25f * (float)Math.PI);
        this.aw = 0.6f - ((float)this.f + f2 - 1.0f) * 0.25f * 0.5f;
        float f13 = (float)(this.p + (this.s - this.p) * (double)f2 - ay);
        float f14 = (float)(this.q + (this.t - this.q) * (double)f2 - az);
        float f15 = (float)(this.r + (this.u - this.r) * (double)f2 - aA);
        bna2.a(this.at, this.au, this.av, this.aw);
        bna2.a(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12, f9, f11);
        bna2.a(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12, f9, f10);
        bna2.a(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12, f8, f10);
        bna2.a(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12, f8, f11);
    }
}

