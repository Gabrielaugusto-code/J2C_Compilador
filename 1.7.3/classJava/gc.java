/*
 * Decompiled with CFR 0.152.
 */
public class gc
extends fk {
    private int a;
    private short b;
    private boolean c;

    public gc() {
    }

    public gc(int n2, short s2, boolean bl2) {
        this.a = n2;
        this.b = s2;
        this.c = bl2;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readUnsignedByte();
        this.b = ep2.readShort();
        this.c = ep2.readBoolean();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.writeShort(this.b);
        ep2.writeBoolean(this.c);
    }

    @Override
    public String b() {
        return String.format("id=%d, uid=%d, accepted=%b", this.a, this.b, this.c);
    }

    public int c() {
        return this.a;
    }

    public short d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

