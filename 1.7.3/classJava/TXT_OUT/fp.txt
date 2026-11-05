/*
 * Decompiled with CFR 0.152.
 */
public class fp
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public fp() {
    }

    public fp(qr qr2) {
        this.a = qr2.x();
        this.b = oy.c(qr2.s * 32.0);
        this.c = oy.c(qr2.t * 32.0);
        this.d = oy.c(qr2.u * 32.0);
        if (qr2 instanceof vy) {
            this.e = 1;
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.e = ep2.readByte();
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.writeByte(this.e);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", this.a, this.e, Float.valueOf((float)this.b / 32.0f), Float.valueOf((float)this.c / 32.0f), Float.valueOf((float)this.d / 32.0f));
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

