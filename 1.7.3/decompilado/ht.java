/*
 * Decompiled with CFR 0.152.
 */
public class ht
extends fk {
    private String a;
    private String b;
    private int c;

    public ht() {
    }

    public ht(ayr ayr2, int n2) {
        this.a = ayr2.b();
        this.b = ayr2.d();
        this.c = n2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(16);
        this.b = ep2.c(32);
        this.c = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.a(this.b);
        ep2.writeByte(this.c);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

