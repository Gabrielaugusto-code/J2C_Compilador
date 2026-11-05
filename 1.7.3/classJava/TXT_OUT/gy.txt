/*
 * Decompiled with CFR 0.152.
 */
public class gy
extends gw {
    public gy() {
        this.g = true;
    }

    public gy(int n2, byte by2, byte by3, byte by4, byte by5, byte by6) {
        super(n2);
        this.b = by2;
        this.c = by3;
        this.d = by4;
        this.e = by5;
        this.f = by6;
        this.g = true;
    }

    @Override
    public void a(ep ep2) {
        super.a(ep2);
        this.b = ep2.readByte();
        this.c = ep2.readByte();
        this.d = ep2.readByte();
        this.e = ep2.readByte();
        this.f = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        super.b(ep2);
        ep2.writeByte(this.b);
        ep2.writeByte(this.c);
        ep2.writeByte(this.d);
        ep2.writeByte(this.e);
        ep2.writeByte(this.f);
    }

    @Override
    public String b() {
        return super.b() + String.format(", xa=%d, ya=%d, za=%d, yRot=%d, xRot=%d", this.b, this.c, this.d, this.e, this.f);
    }
}

