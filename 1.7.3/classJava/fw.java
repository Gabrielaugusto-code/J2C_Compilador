/*
 * Decompiled with CFR 0.152.
 */
public class fw
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private dg e;

    public fw() {
    }

    public fw(int n2, int n3, int n4, int n5, dg dg2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = dg2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readShort();
        this.c = ep2.readInt();
        this.d = ep2.readUnsignedByte();
        this.e = ep2.b();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeShort(this.b);
        ep2.writeInt(this.c);
        ep2.writeByte((byte)this.d);
        ep2.a(this.e);
    }

    public void a(fm fm2) {
        fm2.a(this);
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

    public dg g() {
        return this.e;
    }
}

