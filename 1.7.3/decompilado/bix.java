/*
 * Decompiled with CFR 0.152.
 */
public class bix
extends bjk {
    public bix() {
        this(0.0f);
    }

    public bix(float f2) {
        super(f2, 0.0f, 64, 32);
        this.f = new bjs(this, 40, 16);
        this.f.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.f.a(-5.0f, 2.0f, 0.0f);
        this.g = new bjs(this, 40, 16);
        this.g.i = true;
        this.g.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.g.a(5.0f, 2.0f, 0.0f);
        this.h = new bjs(this, 0, 16);
        this.h.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
        this.h.a(-2.0f, 12.0f, 0.0f);
        this.i = new bjs(this, 0, 16);
        this.i.i = true;
        this.i.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
        this.i.a(2.0f, 12.0f, 0.0f);
    }

    @Override
    public void a(rm rm2, float f2, float f3, float f4) {
        this.o = ((xc)rm2).cb() == 1;
        super.a(rm2, f2, f3, f4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        super.a(f2, f3, f4, f5, f6, f7, qr2);
    }
}

