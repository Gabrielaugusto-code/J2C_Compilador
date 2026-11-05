/*
 * Decompiled with CFR 0.152.
 */
public class bkt
extends blg {
    private float a;
    private double aB;
    private double aC;
    private double aD;

    public bkt(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.v = d5;
        this.w = d6;
        this.x = d7;
        this.aB = this.s = d2;
        this.aC = this.t = d3;
        this.aD = this.u = d4;
        float f2 = this.Z.nextFloat() * 0.6f + 0.4f;
        this.a = this.h = this.Z.nextFloat() * 0.5f + 0.2f;
        this.au = this.av = 1.0f * f2;
        this.at = this.av;
        this.au *= 0.9f;
        this.at *= 0.9f;
        this.g = (int)(Math.random() * 10.0) + 30;
        this.X = true;
        this.k((int)(Math.random() * 26.0 + 1.0 + 224.0));
    }

    @Override
    public int c(float f2) {
        int n2 = super.c(f2);
        float f3 = (float)this.f / (float)this.g;
        f3 *= f3;
        f3 *= f3;
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n4 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n4 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public float d(float f2) {
        float f3 = super.d(f2);
        float f4 = (float)this.f / (float)this.g;
        f4 *= f4;
        f4 *= f4;
        return f3 * (1.0f - f4) + f4;
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        float f2 = (float)this.f / (float)this.g;
        f2 = 1.0f - f2;
        float f3 = 1.0f - f2;
        f3 *= f3;
        f3 *= f3;
        this.s = this.aB + this.v * (double)f2;
        this.t = this.aC + this.w * (double)f2 - (double)(f3 * 1.2f);
        this.u = this.aD + this.x * (double)f2;
        if (this.f++ >= this.g) {
            this.A();
        }
    }
}

