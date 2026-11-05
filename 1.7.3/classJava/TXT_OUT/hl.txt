/*
 * Decompiled with CFR 0.152.
 */
public class hl
extends fk {
    private int a;

    public hl() {
    }

    public hl(int n2) {
        this.a = n2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public int c() {
        return this.a;
    }
}

