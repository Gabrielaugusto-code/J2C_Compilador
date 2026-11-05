/*
 * Decompiled with CFR 0.152.
 */
public class jd
extends fk {
    private int a;
    private abu b;

    public jd() {
    }

    public jd(int n2, abu abu2) {
        this.a = n2;
        this.b = abu2 != null ? abu2.m() : null;
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readShort();
        this.b = ep2.c();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeShort(this.a);
        ep2.a(this.b);
    }

    public int c() {
        return this.a;
    }

    public abu d() {
        return this.b;
    }
}

