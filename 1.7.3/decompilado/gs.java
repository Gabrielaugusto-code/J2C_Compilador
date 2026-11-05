/*
 * Decompiled with CFR 0.152.
 */
public class gs
extends fk {
    private String a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;

    public gs() {
    }

    public gs(String string, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2) {
        this.a = string;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = n2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(64);
        this.b = ep2.readFloat();
        this.c = ep2.readFloat();
        this.d = ep2.readFloat();
        this.e = ep2.readFloat();
        this.f = ep2.readFloat();
        this.g = ep2.readFloat();
        this.h = ep2.readFloat();
        this.i = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeFloat(this.b);
        ep2.writeFloat(this.c);
        ep2.writeFloat(this.d);
        ep2.writeFloat(this.e);
        ep2.writeFloat(this.f);
        ep2.writeFloat(this.g);
        ep2.writeFloat(this.h);
        ep2.writeInt(this.i);
    }

    public String c() {
        return this.a;
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public double f() {
        return this.d;
    }

    public float g() {
        return this.e;
    }

    public float h() {
        return this.f;
    }

    public float i() {
        return this.g;
    }

    public float j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }
}

