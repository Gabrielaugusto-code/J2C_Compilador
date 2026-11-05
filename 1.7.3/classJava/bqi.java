/*
 * Decompiled with CFR 0.152.
 */
public abstract class bqi
implements bra {
    protected int a = -1;

    @Override
    public int b() {
        if (this.a == -1) {
            this.a = brb.a();
        }
        return this.a;
    }

    public void c() {
        if (this.a != -1) {
            brb.a(this.a);
            this.a = -1;
        }
    }
}

