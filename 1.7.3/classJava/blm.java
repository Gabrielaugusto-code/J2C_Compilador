/*
 * Decompiled with CFR 0.152.
 */
public class blm
extends blg {
    float a;

    public blm(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f2 = 2.5f;
        this.v *= (double)0.1f;
        this.w *= (double)0.1f;
        this.x *= (double)0.1f;
        this.v += d5;
        this.w += d6;
        this.x += d7;
        this.au = this.av = 1.0f - (float)(Math.random() * (double)0.3f);
        this.at = this.av;
        this.h *= 0.75f;
        this.h *= f2;
        this.a = this.h;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.3));
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
        this.v *= (double)0.96f;
        this.w *= (double)0.96f;
        this.x *= (double)0.96f;
        xq xq2 = this.o.a((qr)this, 2.0);
        if (xq2 != null && this.t > xq2.C.b) {
            this.t += (xq2.C.b - this.t) * 0.2;
            this.w += (xq2.w - this.w) * 0.2;
            this.b(this.s, this.t, this.u);
        }
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }
}

