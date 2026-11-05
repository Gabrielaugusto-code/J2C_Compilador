/*
 * Decompiled with CFR 0.152.
 */
public class biw
extends bim {
    public bjs a;

    public biw() {
        this(0, 35, 64, 64);
    }

    public biw(int n2, int n3, int n4, int n5) {
        this.t = n4;
        this.u = n5;
        this.a = new bjs(this, n2, n3);
        this.a.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.a.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        this.a.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        super.a(f2, f3, f4, f5, f6, f7, qr2);
        this.a.g = f5 / 57.295776f;
        this.a.f = f6 / 57.295776f;
    }
}

