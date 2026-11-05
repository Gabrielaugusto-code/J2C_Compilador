/*
 * Decompiled with CFR 0.152.
 */
public class fo
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public fo() {
    }

    public fo(rh rh2) {
        this.a = rh2.x();
        this.b = oy.c(rh2.s * 32.0);
        this.c = oy.c(rh2.t * 32.0);
        this.d = oy.c(rh2.u * 32.0);
        this.e = rh2.e();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.e = ep2.readShort();
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeShort(this.e);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, value=%d, x=%.2f, y=%.2f, z=%.2f", this.a, this.e, Float.valueOf((float)this.b / 32.0f), Float.valueOf((float)this.c / 32.0f), Float.valueOf((float)this.d / 32.0f));
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
}

