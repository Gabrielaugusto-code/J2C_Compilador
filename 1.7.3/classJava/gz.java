/*
 * Decompiled with CFR 0.152.
 */
public class gz
extends gw {
    public gz() {
        this.g = true;
    }

    public gz(int n2, byte by2, byte by3) {
        super(n2);
        this.e = by2;
        this.f = by3;
        this.g = true;
    }

    @Override
    public void a(ep ep2) {
        super.a(ep2);
        this.e = ep2.readByte();
        this.f = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        super.b(ep2);
        ep2.writeByte(this.e);
        ep2.writeByte(this.f);
    }

    @Override
    public String b() {
        return super.b() + String.format(", yRot=%d, xRot=%d", this.e, this.f);
    }
}

