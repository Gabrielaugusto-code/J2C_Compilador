/*
 * Decompiled with CFR 0.152.
 */
public class gk
extends fk {
    private int a;
    private byte b;

    public gk() {
    }

    public gk(qr qr2, byte by2) {
        this.a = qr2.x();
        this.b = by2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(this.b);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public qr a(afs afs2) {
        return afs2.a(this.a);
    }

    public byte c() {
        return this.b;
    }
}

