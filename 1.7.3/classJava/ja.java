/*
 * Decompiled with CFR 0.152.
 */
public class ja
extends fk {
    private int a;
    private int b;
    private int c;

    public ja() {
    }

    public ja(qr qr2, int n2) {
        this(qr2, n2, 0);
    }

    public ja(qr qr2, int n2, int n3) {
        this.a = qr2.x();
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readByte();
        this.c = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(this.b);
        ep2.writeInt(this.c);
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

