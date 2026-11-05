/*
 * Decompiled with CFR 0.152.
 */
public class fl
extends fk {
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;
    private boolean f;

    public fl() {
    }

    public fl(double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = f3;
        this.f = bl2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readDouble();
        this.b = ep2.readDouble();
        this.c = ep2.readDouble();
        this.d = ep2.readFloat();
        this.e = ep2.readFloat();
        this.f = ep2.readBoolean();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeDouble(this.a);
        ep2.writeDouble(this.b);
        ep2.writeDouble(this.c);
        ep2.writeFloat(this.d);
        ep2.writeFloat(this.e);
        ep2.writeBoolean(this.f);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public double c() {
        return this.a;
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public float f() {
        return this.d;
    }

    public float g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }
}

