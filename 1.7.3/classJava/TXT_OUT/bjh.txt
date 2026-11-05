/*
 * Decompiled with CFR 0.152.
 */
public class bjh
extends bjf {
    public boolean g;
    private bjs h = new bjs(this).b(64, 128);
    private bjs i;

    public bjh(float f2) {
        super(f2, 0.0f, 64, 128);
        this.h.a(0.0f, -2.0f, 0.0f);
        this.h.a(0, 0).a(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.f.a(this.h);
        this.i = new bjs(this).b(64, 128);
        this.i.a(-5.0f, -10.03125f, -5.0f);
        this.i.a(0, 64).a(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.a.a(this.i);
        bjs bjs2 = new bjs(this).b(64, 128);
        bjs2.a(1.75f, -4.0f, 2.0f);
        bjs2.a(0, 76).a(0.0f, 0.0f, 0.0f, 7, 4, 7);
        bjs2.f = -0.05235988f;
        bjs2.h = 0.02617994f;
        this.i.a(bjs2);
        bjs bjs3 = new bjs(this).b(64, 128);
        bjs3.a(1.75f, -4.0f, 2.0f);
        bjs3.a(0, 87).a(0.0f, 0.0f, 0.0f, 4, 4, 4);
        bjs3.f = -0.10471976f;
        bjs3.h = 0.05235988f;
        bjs2.a(bjs3);
        bjs bjs4 = new bjs(this).b(64, 128);
        bjs4.a(1.75f, -2.0f, 2.0f);
        bjs4.a(0, 95).a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        bjs4.f = -0.20943952f;
        bjs4.h = 0.10471976f;
        bjs3.a(bjs4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        super.a(f2, f3, f4, f5, f6, f7, qr2);
        this.f.q = 0.0f;
        this.f.p = 0.0f;
        this.f.o = 0.0f;
        float f8 = 0.01f * (float)(qr2.x() % 10);
        this.f.f = oy.a((float)qr2.aa * f8) * 4.5f * (float)Math.PI / 180.0f;
        this.f.g = 0.0f;
        this.f.h = oy.b((float)qr2.aa * f8) * 2.5f * (float)Math.PI / 180.0f;
        if (this.g) {
            this.f.f = -0.9f;
            this.f.q = -0.09375f;
            this.f.p = 0.1875f;
        }
    }
}

