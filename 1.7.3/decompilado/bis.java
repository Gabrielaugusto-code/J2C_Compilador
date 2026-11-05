/*
 * Decompiled with CFR 0.152.
 */
public class bis
extends bir {
    private float i;

    public bis() {
        super(12, 0.0f);
        this.a = new bjs(this, 0, 0);
        this.a.a(-3.0f, -4.0f, -4.0f, 6, 6, 6, 0.6f);
        this.a.a(0.0f, 6.0f, -8.0f);
        this.b = new bjs(this, 28, 8);
        this.b.a(-4.0f, -10.0f, -7.0f, 8, 16, 6, 1.75f);
        this.b.a(0.0f, 5.0f, 2.0f);
        float f2 = 0.5f;
        this.c = new bjs(this, 0, 16);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.c.a(-3.0f, 12.0f, 7.0f);
        this.d = new bjs(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.d.a(3.0f, 12.0f, 7.0f);
        this.e = new bjs(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.e.a(-3.0f, 12.0f, -5.0f);
        this.f = new bjs(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.f.a(3.0f, 12.0f, -5.0f);
    }

    @Override
    public void a(rm rm2, float f2, float f3, float f4) {
        super.a(rm2, f2, f3, f4);
        this.a.d = 6.0f + ((vg)rm2).p(f4) * 9.0f;
        this.i = ((vg)rm2).q(f4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        super.a(f2, f3, f4, f5, f6, f7, qr2);
        this.a.f = this.i;
    }
}

