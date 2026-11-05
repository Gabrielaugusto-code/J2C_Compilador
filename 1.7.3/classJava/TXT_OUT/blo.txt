/*
 * Decompiled with CFR 0.152.
 */
public class blo
extends blg {
    float a;

    public blo(afs afs2, double d2, double d3, double d4, float f2, float f3, float f4) {
        this(afs2, d2, d3, d4, 1.0f, f2, f3, f4);
    }

    public blo(afs afs2, double d2, double d3, double d4, float f2, float f3, float f4, float f5) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.v *= (double)0.1f;
        this.w *= (double)0.1f;
        this.x *= (double)0.1f;
        if (f3 == 0.0f) {
            f3 = 1.0f;
        }
        float f6 = (float)Math.random() * 0.4f + 0.6f;
        this.at = ((float)(Math.random() * (double)0.2f) + 0.8f) * f3 * f6;
        this.au = ((float)(Math.random() * (double)0.2f) + 0.8f) * f4 * f6;
        this.av = ((float)(Math.random() * (double)0.2f) + 0.8f) * f5 * f6;
        this.h *= 0.75f;
        this.h *= f2;
        this.a = this.h;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.g = (int)((float)this.g * f2);
        this.X = false;
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
        this.k(7 - this.f * 8 / this.g);
        this.d(this.v, this.w, this.x);
        if (this.t == this.q) {
            this.v *= 1.1;
            this.x *= 1.1;
        }
        this.v *= (double)0.96f;
        this.w *= (double)0.96f;
        this.x *= (double)0.96f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }
}

