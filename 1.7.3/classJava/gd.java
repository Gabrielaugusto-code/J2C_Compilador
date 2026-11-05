/*
 * Decompiled with CFR 0.152.
 */
public class gd
extends fk {
    private int a;

    public gd() {
    }

    public gd(int n2) {
        this.a = n2;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
    }
}

