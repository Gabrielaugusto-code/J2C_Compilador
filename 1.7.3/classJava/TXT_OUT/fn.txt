/*
 * Decompiled with CFR 0.152.
 */
public class fn
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public fn() {
    }

    public fn(qr qr2, int n2) {
        this(qr2, n2, 0);
    }

    public fn(qr qr2, int n2, int n3) {
        this.a = qr2.x();
        this.b = oy.c(qr2.s * 32.0);
        this.c = oy.c(qr2.t * 32.0);
        this.d = oy.c(qr2.u * 32.0);
        this.h = oy.d(qr2.z * 256.0f / 360.0f);
        this.i = oy.d(qr2.y * 256.0f / 360.0f);
        this.j = n2;
        this.k = n3;
        if (n3 > 0) {
            double d2 = qr2.v;
            double d3 = qr2.w;
            double d4 = qr2.x;
            double d5 = 3.9;
            if (d2 < -d5) {
                d2 = -d5;
            }
            if (d3 < -d5) {
                d3 = -d5;
            }
            if (d4 < -d5) {
                d4 = -d5;
            }
            if (d2 > d5) {
                d2 = d5;
            }
            if (d3 > d5) {
                d3 = d5;
            }
            if (d4 > d5) {
                d4 = d5;
            }
            this.e = (int)(d2 * 8000.0);
            this.f = (int)(d3 * 8000.0);
            this.g = (int)(d4 * 8000.0);
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.j = ep2.readByte();
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.h = ep2.readByte();
        this.i = ep2.readByte();
        this.k = ep2.readInt();
        if (this.k > 0) {
            this.e = ep2.readShort();
            this.f = ep2.readShort();
            this.g = ep2.readShort();
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.writeByte(this.j);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeByte(this.h);
        ep2.writeByte(this.i);
        ep2.writeInt(this.k);
        if (this.k > 0) {
            ep2.writeShort(this.e);
            ep2.writeShort(this.f);
            ep2.writeShort(this.g);
        }
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", this.a, this.j, Float.valueOf((float)this.b / 32.0f), Float.valueOf((float)this.c / 32.0f), Float.valueOf((float)this.d / 32.0f));
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

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public void b(int n2) {
        this.c = n2;
    }

    public void c(int n2) {
        this.d = n2;
    }

    public void d(int n2) {
        this.e = n2;
    }

    public void e(int n2) {
        this.f = n2;
    }

    public void f(int n2) {
        this.g = n2;
    }

    public void g(int n2) {
        this.k = n2;
    }
}

