/*
 * Decompiled with CFR 0.152.
 */
public class io
extends fk {
    private int a;
    private int b;
    private int c;
    private short d;
    private abu e;
    private int f;

    public io() {
    }

    public io(int n2, int n3, int n4, int n5, abu abu2, short s2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.e = abu2 != null ? abu2.m() : null;
        this.d = s2;
        this.f = n5;
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readByte();
        this.b = ep2.readShort();
        this.c = ep2.readByte();
        this.d = ep2.readShort();
        this.f = ep2.readByte();
        this.e = ep2.c();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.writeShort(this.b);
        ep2.writeByte(this.c);
        ep2.writeShort(this.d);
        ep2.writeByte(this.f);
        ep2.a(this.e);
    }

    @Override
    public String b() {
        if (this.e != null) {
            return String.format("id=%d, slot=%d, button=%d, type=%d, itemid=%d, itemcount=%d, itemaux=%d", this.a, this.b, this.c, this.f, abs.b(this.e.b()), this.e.b, this.e.k());
        }
        return String.format("id=%d, slot=%d, button=%d, type=%d, itemid=-1", this.a, this.b, this.c, this.f);
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

    public short f() {
        return this.d;
    }

    public abu g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }
}

