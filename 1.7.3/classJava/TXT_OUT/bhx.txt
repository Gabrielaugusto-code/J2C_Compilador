/*
 * Decompiled with CFR 0.152.
 */
public class bhx
extends bim {
    private bjs a;
    private bjs b;
    private bjs c;
    private bjs d;
    private bjs e;
    private bjs f;

    public bhx() {
        this.t = 64;
        this.u = 64;
        this.a = new bjs(this, 0, 0);
        this.a.a(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        bjs bjs2 = new bjs(this, 24, 0);
        bjs2.a(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(bjs2);
        bjs bjs3 = new bjs(this, 24, 0);
        bjs3.i = true;
        bjs3.a(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(bjs3);
        this.b = new bjs(this, 0, 16);
        this.b.a(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.b.a(0, 34).a(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.c = new bjs(this, 42, 0);
        this.c.a(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.e = new bjs(this, 24, 16);
        this.e.a(-12.0f, 1.0f, 1.5f);
        this.e.a(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.d = new bjs(this, 42, 0);
        this.d.i = true;
        this.d.a(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.f = new bjs(this, 24, 16);
        this.f.i = true;
        this.f.a(12.0f, 1.0f, 1.5f);
        this.f.a(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.b.a(this.c);
        this.b.a(this.d);
        this.c.a(this.e);
        this.d.a(this.f);
    }

    public int a() {
        return 36;
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        uv uv2 = (uv)qr2;
        if (uv2.bP()) {
            float f8 = 57.295776f;
            this.a.f = f6 / 57.295776f;
            this.a.g = (float)Math.PI - f5 / 57.295776f;
            this.a.h = (float)Math.PI;
            this.a.a(0.0f, -2.0f, 0.0f);
            this.c.a(-3.0f, 0.0f, 3.0f);
            this.d.a(3.0f, 0.0f, 3.0f);
            this.b.f = (float)Math.PI;
            this.c.f = -0.15707964f;
            this.c.g = -1.2566371f;
            this.e.g = -1.7278761f;
            this.d.f = this.c.f;
            this.d.g = -this.c.g;
            this.f.g = -this.e.g;
        } else {
            float f9 = 57.295776f;
            this.a.f = f6 / 57.295776f;
            this.a.g = f5 / 57.295776f;
            this.a.h = 0.0f;
            this.a.a(0.0f, 0.0f, 0.0f);
            this.c.a(0.0f, 0.0f, 0.0f);
            this.d.a(0.0f, 0.0f, 0.0f);
            this.b.f = 0.7853982f + oy.b(f4 * 0.1f) * 0.15f;
            this.b.g = 0.0f;
            this.c.g = oy.b(f4 * 1.3f) * (float)Math.PI * 0.25f;
            this.d.g = -this.c.g;
            this.e.g = this.c.g * 0.5f;
            this.f.g = -this.c.g * 0.5f;
        }
        this.a.a(f7);
        this.b.a(f7);
    }
}

