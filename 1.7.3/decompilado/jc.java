/*
 * Decompiled with CFR 0.152.
 */
public class jc
extends fk {
    private int a;

    public jc() {
    }

    public jc(int n2) {
        this.a = n2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readShort();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeShort(this.a);
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public int c() {
        return this.a;
    }
}

