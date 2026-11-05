/*
 * Decompiled with CFR 0.152.
 */
public class bjg
extends bih {
    public bjg() {
        this(0.0f, 0.0f, false);
    }

    public bjg(float f2, float f3, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
        if (bl2) {
            this.c = new bjs(this, 0, 0);
            this.c.a(-4.0f, -10.0f, -4.0f, 8, 6, 8, f2);
            this.c.a(0.0f, 0.0f + f3, 0.0f);
        } else {
            this.c = new bjs(this);
            this.c.a(0.0f, 0.0f + f3, 0.0f);
            this.c.a(0, 32).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, f2);
            this.c.a(24, 32).a(-1.0f, -3.0f, -6.0f, 2, 4, 2, f2);
        }
    }

    public int a() {
        return 10;
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

