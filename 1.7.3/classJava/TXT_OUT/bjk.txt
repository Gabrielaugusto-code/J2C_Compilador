/*
 * Decompiled with CFR 0.152.
 */
public class bjk
extends bih {
    public bjk() {
        this(0.0f, false);
    }

    protected bjk(float f2, float f3, int n2, int n3) {
        super(f2, f3, n2, n3);
    }

    public bjk(float f2, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        super.a(f2, f3, f4, f5, f6, f7, qr2);
        float f8 = oy.a(this.p * (float)Math.PI);
        float f9 = oy.a((1.0f - (1.0f - this.p) * (1.0f - this.p)) * (float)Math.PI);
        this.f.h = 0.0f;
        this.g.h = 0.0f;
        this.f.g = -(0.1f - f8 * 0.6f);
        this.g.g = 0.1f - f8 * 0.6f;
        this.f.f = -1.5707964f;
        this.g.f = -1.5707964f;
        this.f.f -= f8 * 1.2f - f9 * 0.4f;
        this.g.f -= f8 * 1.2f - f9 * 0.4f;
        this.f.h += oy.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.g.h -= oy.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.f.f += oy.a(f4 * 0.067f) * 0.05f;
        this.g.f -= oy.a(f4 * 0.067f) * 0.05f;
    }
}

