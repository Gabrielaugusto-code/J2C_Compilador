/*
 * Decompiled with CFR 0.152.
 */
public class gg
extends fk {
    private int a;
    private int b;
    private int c;

    public gg() {
    }

    public gg(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readUnsignedByte();
        this.b = ep2.readShort();
        this.c = ep2.readShort();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.writeShort(this.b);
        ep2.writeShort(this.c);
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
}

