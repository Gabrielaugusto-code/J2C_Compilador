/*
 * Decompiled with CFR 0.152.
 */
public class jf
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private abu e;
    private float f;
    private float g;
    private float h;

    public jf() {
    }

    public jf(int n2, int n3, int n4, int n5, abu abu2, float f2, float f3, float f4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = abu2 != null ? abu2.m() : null;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readUnsignedByte();
        this.c = ep2.readInt();
        this.d = ep2.readUnsignedByte();
        this.e = ep2.c();
        this.f = (float)ep2.readUnsignedByte() / 16.0f;
        this.g = (float)ep2.readUnsignedByte() / 16.0f;
        this.h = (float)ep2.readUnsignedByte() / 16.0f;
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(this.b);
        ep2.writeInt(this.c);
        ep2.writeByte(this.d);
        ep2.a(this.e);
        ep2.writeByte((int)(this.f * 16.0f));
        ep2.writeByte((int)(this.g * 16.0f));
        ep2.writeByte((int)(this.h * 16.0f));
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public abu g() {
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
}

