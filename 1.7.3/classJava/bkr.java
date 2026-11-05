/*
 * Decompiled with CFR 0.152.
 */
public class bkr
extends blg {
    float a;

    public bkr(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(afs2, d2, d3, d4, d5, d6, d7, 1.0f);
    }

    public bkr(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.v *= (double)0.1f;
        this.w *= (double)0.1f;
        this.x *= (double)0.1f;
        this.v += d5 * 0.4;
        this.w += d6 * 0.4;
        this.x += d7 * 0.4;
        this.au = this.av = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.at = this.av;
        this.h *= 0.75f;
        this.h *= f2;
        this.a = this.h;
        this.g = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.g = (int)((float)this.g * f2);
        this.X = false;
        this.k(65);
        this.h();
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.f + f2) / (float)this.g * 32.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        this.h = this.a * f8;
        super.a(bna2, f2, f3, f4, f5, f6, f7);
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
        this.au = (float)((double)this.au * 0.96);
        this.av = (float)((double)this.av * 0.9);
        this.v *= (double)0.7f;
        this.w *= (double)0.7f;
        this.x *= (double)0.7f;
        this.w -= (double)0.02f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }
}

