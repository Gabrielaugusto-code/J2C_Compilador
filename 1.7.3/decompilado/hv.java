/*
 * Decompiled with CFR 0.152.
 */
public class hv
extends fk {
    private String a = "";
    private String b = "";
    private int c;
    private int d;

    public hv() {
    }

    public hv(ayt ayt2, int n2) {
        this.a = ayt2.e();
        this.b = ayt2.d().b();
        this.c = ayt2.c();
        this.d = n2;
    }

    public hv(String string) {
        this.a = string;
        this.b = "";
        this.c = 0;
        this.d = 1;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(16);
        this.d = ep2.readByte();
        if (this.d != 1) {
            this.b = ep2.c(16);
            this.c = ep2.readInt();
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeByte(this.d);
        if (this.d != 1) {
            ep2.a(this.b);
            ep2.writeInt(this.c);
        }
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

    public int f() {
        return this.d;
    }
}

