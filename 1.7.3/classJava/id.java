/*
 * Decompiled with CFR 0.152.
 */
public class id
extends fk {
    private int a;
    private byte b;
    private byte c;
    private short d;

    public id() {
    }

    public id(int n2, qn qn2) {
        this.a = n2;
        this.b = (byte)(qn2.a() & 0xFF);
        this.c = (byte)(qn2.c() & 0xFF);
        this.d = qn2.b() > Short.MAX_VALUE ? (short)Short.MAX_VALUE : (short)qn2.b();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readByte();
        this.c = ep2.readByte();
        this.d = ep2.readShort();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(this.b);
        ep2.writeByte(this.c);
        ep2.writeShort(this.d);
    }

    public boolean c() {
        return this.d == Short.MAX_VALUE;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public int d() {
        return this.a;
    }

    public byte e() {
        return this.b;
    }

    public byte f() {
        return this.c;
    }

    public short g() {
        return this.d;
    }
}

