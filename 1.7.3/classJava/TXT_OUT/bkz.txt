/*
 * Decompiled with CFR 0.152.
 */
public class bkz
extends blg {
    private float a;

    public bkz(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.v = this.v * (double)0.01f + d5;
        this.w = this.w * (double)0.01f + d6;
        this.x = this.x * (double)0.01f + d7;
        d2 += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.05f);
        d3 += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.05f);
        d4 += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.05f);
        this.a = this.h;
        this.av = 1.0f;
        this.au = 1.0f;
        this.at = 1.0f;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.X = true;
        this.k(48);
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.f + f2) / (float)this.g;
        this.h = this.a * (1.0f - f8 * f8 * 0.5f);
        super.a(bna2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public int c(float f2) {
        float f3 = ((float)this.f + f2) / (float)this.g;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        int n2 = super.c(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public float d(float f2) {
        float f3 = ((float)this.f + f2) / (float)this.g;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = super.d(f2);
        return f4 * f3 + (1.0f - f3);
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.A();
        }
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.96f;
        this.w *= (double)0.96f;
        this.x *= (double)0.96f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }
}

