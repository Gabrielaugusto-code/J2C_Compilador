/*
 * Decompiled with CFR 0.152.
 */
public class hm
extends fk {
    private int a;
    private String b;

    public hm() {
    }

    public hm(int n2, ayr ayr2) {
        this.a = n2;
        this.b = ayr2 == null ? "" : ayr2.b();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readByte();
        this.b = ep2.c(16);
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.a(this.b);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }
}

