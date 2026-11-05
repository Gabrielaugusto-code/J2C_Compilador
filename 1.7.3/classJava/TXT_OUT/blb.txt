/*
 * Decompiled with CFR 0.152.
 */
public class blb
extends blg {
    float a;

    public blb(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(afs2, d2, d3, d4, d5, d6, d7, 2.0f);
    }

    public blb(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.v *= (double)0.01f;
        this.w *= (double)0.01f;
        this.x *= (double)0.01f;
        this.w += 0.1;
        this.h *= 0.75f;
        this.h *= f2;
        this.a = this.h;
        this.g = 16;
        this.X = false;
        this.k(80);
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
        if (this.t == this.q) {
            this.v *= 1.1;
            this.x *= 1.1;
        }
        this.v *= (double)0.86f;
        this.w *= (double)0.86f;
        this.x *= (double)0.86f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }
}

