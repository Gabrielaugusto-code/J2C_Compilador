/*
 * Decompiled with CFR 0.152.
 */
public class alp
extends ahv {
    private pw b;

    protected alp() {
        super(false);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 >= 6) {
            return this.b;
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        this.b = px2.a(this.N() + "_turned");
    }

    @Override
    protected void a(afs afs2, int n2, int n3, int n4, int n5, int n6, ahz ahz2) {
        if (ahz2.f() && new ahw(this, afs2, n2, n3, n4).a() == 3) {
            this.a(afs2, n2, n3, n4, false);
        }
    }
}

