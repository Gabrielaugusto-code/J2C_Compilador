/*
 * Decompiled with CFR 0.152.
 */
public class bif
extends bih {
    public boolean a;
    public boolean b;

    public bif() {
        super(0.0f, -14.0f, 64, 32);
        float f2 = -14.0f;
        float f3 = 0.0f;
        this.d = new bjs(this, 0, 16);
        this.d.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f3 - 0.5f);
        this.d.a(0.0f, 0.0f + f2, 0.0f);
        this.e = new bjs(this, 32, 16);
        this.e.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f3);
        this.e.a(0.0f, 0.0f + f2, 0.0f);
        this.f = new bjs(this, 56, 0);
        this.f.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f3);
        this.f.a(-3.0f, 2.0f + f2, 0.0f);
        this.g = new bjs(this, 56, 0);
        this.g.i = true;
        this.g.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f3);
        this.g.a(5.0f, 2.0f + f2, 0.0f);
        this.h = new bjs(this, 56, 0);
        this.h.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f3);
        this.h.a(-2.0f, 12.0f + f2, 0.0f);
        this.i = new bjs(this, 56, 0);
        this.i.i = true;
        this.i.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f3);
        this.i.a(2.0f, 12.0f + f2, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        super.a(f2, f3, f4, f5, f6, f7, qr2);
        this.c.j = true;
        float f8 = -14.0f;
        this.e.f = 0.0f;
        this.e.d = f8;
        this.e.e = -0.0f;
        this.h.f -= 0.0f;
        this.i.f -= 0.0f;
        this.f.f = (float)((double)this.f.f * 0.5);
        this.g.f = (float)((double)this.g.f * 0.5);
        this.h.f = (float)((double)this.h.f * 0.5);
        this.i.f = (float)((double)this.i.f * 0.5);
        float f9 = 0.4f;
        if (this.f.f > f9) {
            this.f.f = f9;
        }
        if (this.g.f > f9) {
            this.g.f = f9;
        }
        if (this.f.f < -f9) {
            this.f.f = -f9;
        }
        if (this.g.f < -f9) {
            this.g.f = -f9;
        }
        if (this.h.f > f9) {
            this.h.f = f9;
        }
        if (this.i.f > f9) {
            this.i.f = f9;
        }
        if (this.h.f < -f9) {
            this.h.f = -f9;
        }
        if (this.i.f < -f9) {
            this.i.f = -f9;
        }
        if (this.a) {
            this.f.f = -0.5f;
            this.g.f = -0.5f;
            this.f.h = 0.05f;
            this.g.h = -0.05f;
        }
        this.f.e = 0.0f;
        this.g.e = 0.0f;
        this.h.e = 0.0f;
        this.i.e = 0.0f;
        this.h.d = 9.0f + f8;
        this.i.d = 9.0f + f8;
        this.c.e = -0.0f;
        this.c.d = f8 + 1.0f;
        this.d.c = this.c.c;
        this.d.d = this.c.d;
        this.d.e = this.c.e;
        this.d.f = this.c.f;
        this.d.g = this.c.g;
        this.d.h = this.c.h;
        if (this.b) {
            float f10 = 1.0f;
            this.c.d -= f10 * 5.0f;
        }
    }
}

