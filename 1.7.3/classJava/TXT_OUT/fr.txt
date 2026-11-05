/*
 * Decompiled with CFR 0.152.
 */
public class fr
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private String f;

    public fr() {
    }

    public fr(rs rs2) {
        this.a = rs2.x();
        this.b = rs2.b;
        this.c = rs2.c;
        this.d = rs2.d;
        this.e = rs2.a;
        this.f = rs2.e.B;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.f = ep2.c(rt.A);
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.e = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.a(this.f);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeInt(this.e);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, type=%s, x=%d, y=%d, z=%d", this.a, this.f, this.b, this.c, this.d);
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

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }
}

