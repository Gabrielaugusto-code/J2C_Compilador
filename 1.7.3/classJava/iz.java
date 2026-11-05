/*
 * Decompiled with CFR 0.152.
 */
public class iz
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public iz() {
    }

    public iz(int n2, int n3, int n4, int n5, int n6) {
        this.e = n2;
        this.a = n3;
        this.b = n4;
        this.c = n5;
        this.d = n6;
    }

    @Override
    public void a(ep ep2) {
        this.e = ep2.readUnsignedByte();
        this.a = ep2.readInt();
        this.b = ep2.readUnsignedByte();
        this.c = ep2.readInt();
        this.d = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.e);
        ep2.writeInt(this.a);
        ep2.writeByte(this.b);
        ep2.writeInt(this.c);
        ep2.writeByte(this.d);
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

    public int g() {
        return this.e;
    }
}

