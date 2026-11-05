/*
 * Decompiled with CFR 0.152.
 */
public class fv
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public fv() {
    }

    public fv(int n2, int n3, int n4, int n5, int n6) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.e = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeByte(this.e);
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

    public int g() {
        return this.e;
    }
}

