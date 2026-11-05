/*
 * Decompiled with CFR 0.152.
 */
public class ir
extends fk {
    private int a;
    private is b;

    public ir() {
    }

    public ir(qr qr2, is is2) {
        this.a = qr2.x();
        this.b = is2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = is.a()[ep2.readByte() % is.a().length];
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(is.a(this.b));
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public qr a(afs afs2) {
        return afs2.a(this.a);
    }

    public is c() {
        return this.b;
    }
}

