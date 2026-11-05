/*
 * Decompiled with CFR 0.152.
 */
public class ft
extends fk {
    private int a;
    private int b;

    public ft() {
    }

    public ft(qr qr2, int n2) {
        this.a = qr2.x();
        this.b = n2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.b = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.writeByte(this.b);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, type=%d", this.a, this.b);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}

