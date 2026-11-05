/*
 * Decompiled with CFR 0.152.
 */
public class ho
extends fk {
    private int a;
    private int b;
    private int c;

    public ho() {
    }

    public ho(int n2, qr qr2, qr qr3) {
        this.a = n2;
        this.b = qr2.x();
        this.c = qr3 != null ? qr3.x() : -1;
    }

    @Override
    public void a(ep ep2) {
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.a = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeByte(this.a);
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
}

