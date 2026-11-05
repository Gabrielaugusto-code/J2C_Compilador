/*
 * Decompiled with CFR 0.152.
 */
public class iv
extends iu {
    public iv() {
        this.h = true;
    }

    public iv(double d2, double d3, double d4, double d5, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.d = d4;
        this.c = d5;
        this.g = bl2;
        this.h = true;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readDouble();
        this.b = ep2.readDouble();
        this.d = ep2.readDouble();
        this.c = ep2.readDouble();
        super.a(ep2);
    }

    @Override
    public void b(ep ep2) {
        ep2.writeDouble(this.a);
        ep2.writeDouble(this.b);
        ep2.writeDouble(this.d);
        ep2.writeDouble(this.c);
        super.b(ep2);
    }
}

