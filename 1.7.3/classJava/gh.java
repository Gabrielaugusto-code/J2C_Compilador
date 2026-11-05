/*
 * Decompiled with CFR 0.152.
 */
public class gh
extends fk {
    private int a;
    private int b;
    private abu c;

    public gh() {
    }

    public gh(int n2, int n3, abu abu2) {
        this.a = n2;
        this.b = n3;
        this.c = abu2 == null ? null : abu2.m();
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readByte();
        this.b = ep2.readShort();
        this.c = ep2.c();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.writeShort(this.b);
        ep2.a(this.c);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public abu e() {
        return this.c;
    }
}

