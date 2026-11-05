/*
 * Decompiled with CFR 0.152.
 */
public class hq
extends fk {
    private int a;
    private int b;
    private abu c;

    public hq() {
    }

    public hq(int n2, int n3, abu abu2) {
        this.a = n2;
        this.b = n3;
        this.c = abu2 == null ? null : abu2.m();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readShort();
        this.c = ep2.c();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeShort(this.b);
        ep2.a(this.c);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public abu c() {
        return this.c;
    }

    @Override
    public String b() {
        return String.format("entity=%d, slot=%d, item=%s", this.a, this.b, this.c);
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }
}

