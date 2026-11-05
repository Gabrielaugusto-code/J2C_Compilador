/*
 * Decompiled with CFR 0.152.
 */
public class iw
extends iu {
    public iw() {
        this.h = true;
        this.i = true;
    }

    public iw(double d2, double d3, double d4, double d5, float f2, float f3, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.d = d4;
        this.c = d5;
        this.e = f2;
        this.f = f3;
        this.g = bl2;
        this.i = true;
        this.h = true;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readDouble();
        this.b = ep2.readDouble();
        this.d = ep2.readDouble();
        this.c = ep2.readDouble();
        this.e = ep2.readFloat();
        this.f = ep2.readFloat();
        super.a(ep2);
    }

    @Override
    public void b(ep ep2) {
        ep2.writeDouble(this.a);
        ep2.writeDouble(this.b);
        ep2.writeDouble(this.d);
        ep2.writeDouble(this.c);
        ep2.writeFloat(this.e);
        ep2.writeFloat(this.f);
        super.b(ep2);
    }
}

