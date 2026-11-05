/*
 * Decompiled with CFR 0.152.
 */
public class blr
extends blg {
    private int a = 128;

    public blr(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.w *= (double)0.2f;
        if (d5 == 0.0 && d7 == 0.0) {
            this.v *= (double)0.1f;
            this.x *= (double)0.1f;
        }
        this.h *= 0.75f;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
        this.k(this.a + (7 - this.f * 8 / this.g));
        this.w += 0.004;
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

    public void a(int n2) {
        this.a = n2;
    }
}

