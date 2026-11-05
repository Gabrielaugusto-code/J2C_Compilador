/*
 * Decompiled with CFR 0.152.
 */
public class gv
extends fk {
    private int a;
    private byte[] b;

    public gv() {
    }

    public gv(int n2, byte[] byArray) {
        this.a = n2;
        this.b = byArray;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.b = new byte[ep2.readUnsignedShort()];
        ep2.readBytes(this.b);
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.writeShort(this.b.length);
        ep2.writeBytes(this.b);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, length=%d", this.a, this.b.length);
    }

    public int c() {
        return this.a;
    }

    public byte[] d() {
        return this.b;
    }
}

