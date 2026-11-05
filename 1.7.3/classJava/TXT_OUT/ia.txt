/*
 * Decompiled with CFR 0.152.
 */
public class ia
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private byte e;
    private byte f;

    public ia() {
    }

    public ia(qr qr2) {
        this.a = qr2.x();
        this.b = oy.c(qr2.s * 32.0);
        this.c = oy.c(qr2.t * 32.0);
        this.d = oy.c(qr2.u * 32.0);
        this.e = (byte)(qr2.y * 256.0f / 360.0f);
        this.f = (byte)(qr2.z * 256.0f / 360.0f);
    }

    public ia(int n2, int n3, int n4, int n5, byte by2, byte by3) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = by2;
        this.f = by3;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.e = ep2.readByte();
        this.f = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeByte(this.e);
        ep2.writeByte(this.f);
    }

    public void a(fm fm2) {
        fm2.a(this);
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

    public byte g() {
        return this.e;
    }

    public byte h() {
        return this.f;
    }
}

