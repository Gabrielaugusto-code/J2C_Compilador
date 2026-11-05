/*
 * Decompiled with CFR 0.152.
 */
public class hp
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;

    public hp() {
    }

    public hp(qr qr2) {
        this(qr2.x(), qr2.v, qr2.w, qr2.x);
    }

    public hp(int n2, double d2, double d3, double d4) {
        this.a = n2;
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
        this.b = (int)(d2 * 8000.0);
        this.c = (int)(d3 * 8000.0);
        this.d = (int)(d4 * 8000.0);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readShort();
        this.c = ep2.readShort();
        this.d = ep2.readShort();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeShort(this.b);
        ep2.writeShort(this.c);
        ep2.writeShort(this.d);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d, x=%.2f, y=%.2f, z=%.2f", this.a, Float.valueOf((float)this.b / 8000.0f), Float.valueOf((float)this.c / 8000.0f), Float.valueOf((float)this.d / 8000.0f));
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
}

