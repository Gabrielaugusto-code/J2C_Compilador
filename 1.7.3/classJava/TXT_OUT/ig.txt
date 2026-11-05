/*
 * Decompiled with CFR 0.152.
 */
public class ig
extends fk {
    private int a;
    private int b;

    public ig() {
    }

    public ig(qr qr2, int n2) {
        this.a = qr2.x();
        this.b = n2;
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

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, type=%d", this.a, this.b);
    }

    public int d() {
        return this.b;
    }
}

