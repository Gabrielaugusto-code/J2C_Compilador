/*
 * Decompiled with CFR 0.152.
 */
public class ble
extends blg {
    private float a;

    public ble(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.v *= (double)0.8f;
        this.w *= (double)0.8f;
        this.x *= (double)0.8f;
        this.w = this.Z.nextFloat() * 0.4f + 0.05f;
        this.av = 1.0f;
        this.au = 1.0f;
        this.at = 1.0f;
        this.h *= this.Z.nextFloat() * 2.0f + 0.2f;
        this.a = this.h;
        this.g = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.X = false;
        this.k(49);
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
        int n3 = 240;
        int n4 = n2 >> 16 & 0xFF;
        return n3 | n4 << 16;
    }

    @Override
    public float d(float f2) {
        return 1.0f;
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.f + f2) / (float)this.g;
        this.h = this.a * (1.0f - f8 * f8);
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
        float f2 = (float)this.f / (float)this.g;
        if (this.Z.nextFloat() > f2) {
            this.o.a("smoke", this.s, this.t, this.u, this.v, this.w, this.x);
        }
        this.w -= 0.03;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.999f;
        this.w *= (double)0.999f;
        this.x *= (double)0.999f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }
}

