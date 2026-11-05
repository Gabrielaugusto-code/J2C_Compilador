/*
 * Decompiled with CFR 0.152.
 */
public class bjb
extends bim {
    public bjs a;
    public bjs b;
    public bjs c;
    public bjs d;
    public bjs e;
    public bjs f;
    public bjs g;
    public bjs h;
    public bjs i;
    public bjs j;
    public bjs k;

    public bjb() {
        float f2 = 0.0f;
        int n2 = 15;
        this.a = new bjs(this, 32, 4);
        this.a.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f2);
        this.a.a(0.0f, n2, -3.0f);
        this.b = new bjs(this, 0, 0);
        this.b.a(-3.0f, -3.0f, -3.0f, 6, 6, 6, f2);
        this.b.a(0.0f, n2, 0.0f);
        this.c = new bjs(this, 0, 12);
        this.c.a(-5.0f, -4.0f, -6.0f, 10, 8, 12, f2);
        this.c.a(0.0f, n2, 9.0f);
        this.d = new bjs(this, 18, 0);
        this.d.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.d.a(-4.0f, n2, 2.0f);
        this.e = new bjs(this, 18, 0);
        this.e.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.e.a(4.0f, n2, 2.0f);
        this.f = new bjs(this, 18, 0);
        this.f.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.f.a(-4.0f, n2, 1.0f);
        this.g = new bjs(this, 18, 0);
        this.g.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.g.a(4.0f, n2, 1.0f);
        this.h = new bjs(this, 18, 0);
        this.h.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.h.a(-4.0f, n2, 0.0f);
        this.i = new bjs(this, 18, 0);
        this.i.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.i.a(4.0f, n2, 0.0f);
        this.j = new bjs(this, 18, 0);
        this.j.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.j.a(-4.0f, n2, -1.0f);
        this.k = new bjs(this, 18, 0);
        this.k.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f2);
        this.k.a(4.0f, n2, -1.0f);
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        this.a.a(f7);
        this.b.a(f7);
        this.c.a(f7);
        this.d.a(f7);
        this.e.a(f7);
        this.f.a(f7);
        this.g.a(f7);
        this.h.a(f7);
        this.i.a(f7);
        this.j.a(f7);
        this.k.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        this.a.g = f5 / 57.295776f;
        this.a.f = f6 / 57.295776f;
        float f8 = 0.7853982f;
        this.d.h = -f8;
        this.e.h = f8;
        this.f.h = -f8 * 0.74f;
        this.g.h = f8 * 0.74f;
        this.h.h = -f8 * 0.74f;
        this.i.h = f8 * 0.74f;
        this.j.h = -f8;
        this.k.h = f8;
        float f9 = -0.0f;
        float f10 = 0.3926991f;
        this.d.g = f10 * 2.0f + f9;
        this.e.g = -f10 * 2.0f - f9;
        this.f.g = f10 * 1.0f + f9;
        this.g.g = -f10 * 1.0f - f9;
        this.h.g = -f10 * 1.0f + f9;
        this.i.g = f10 * 1.0f - f9;
        this.j.g = -f10 * 2.0f + f9;
        this.k.g = f10 * 2.0f - f9;
        float f11 = -(oy.b(f2 * 0.6662f * 2.0f + 0.0f) * 0.4f) * f3;
        float f12 = -(oy.b(f2 * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f3;
        float f13 = -(oy.b(f2 * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f3;
        float f14 = -(oy.b(f2 * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f3;
        float f15 = Math.abs(oy.a(f2 * 0.6662f + 0.0f) * 0.4f) * f3;
        float f16 = Math.abs(oy.a(f2 * 0.6662f + (float)Math.PI) * 0.4f) * f3;
        float f17 = Math.abs(oy.a(f2 * 0.6662f + 1.5707964f) * 0.4f) * f3;
        float f18 = Math.abs(oy.a(f2 * 0.6662f + 4.712389f) * 0.4f) * f3;
        this.d.g += f11;
        this.e.g += -f11;
        this.f.g += f12;
        this.g.g += -f12;
        this.h.g += f13;
        this.i.g += -f13;
        this.j.g += f14;
        this.k.g += -f14;
        this.d.h += f15;
        this.e.h += -f15;
        this.f.h += f16;
        this.g.h += -f16;
        this.h.h += f17;
        this.i.h += -f17;
        this.j.h += f18;
        this.k.h += -f18;
    }
}

