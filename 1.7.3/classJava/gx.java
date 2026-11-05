/*
 * Decompiled with CFR 0.152.
 */
public class gx
extends gw {
    public gx() {
    }

    public gx(int n2, byte by2, byte by3, byte by4) {
        super(n2);
        this.b = by2;
        this.c = by3;
        this.d = by4;
    }

    @Override
    public void a(ep ep2) {
        super.a(ep2);
        this.b = ep2.readByte();
        this.c = ep2.readByte();
        this.d = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        super.b(ep2);
        ep2.writeByte(this.b);
        ep2.writeByte(this.c);
        ep2.writeByte(this.d);
    }

    @Override
    public String b() {
        return super.b() + String.format(", xa=%d, ya=%d, za=%d", this.b, this.c, this.d);
    }
}

