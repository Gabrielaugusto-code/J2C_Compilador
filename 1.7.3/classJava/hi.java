/*
 * Decompiled with CFR 0.152.
 */
public class hi
extends fk {
    private int a;
    private int b;

    public hi() {
    }

    public hi(int n2, qn qn2) {
        this.a = n2;
        this.b = qn2.a();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(this.b);
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
}

