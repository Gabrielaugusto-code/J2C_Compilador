/*
 * Decompiled with CFR 0.152.
 */
public class fx
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private ahz f;

    public fx() {
    }

    public fx(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
        this.f = ahz2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readShort();
        this.c = ep2.readInt();
        this.d = ep2.readUnsignedByte();
        this.e = ep2.readUnsignedByte();
        this.f = ahz.e(ep2.a() & 0xFFF);
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeShort(this.b);
        ep2.writeInt(this.c);
        ep2.writeByte(this.d);
        ep2.writeByte(this.e);
        ep2.b(ahz.b(this.f) & 0xFFF);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public ahz c() {
        return this.f;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }
}

