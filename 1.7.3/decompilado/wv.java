/*
 * Decompiled with CFR 0.152.
 */
public class wv
extends wx {
    public wv(afs afs2) {
        super(afs2);
        this.L *= 6.0f;
        this.a(this.M * 6.0f, this.N * 6.0f);
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(100.0);
        this.a(xa.d).a(0.5);
        this.a(xa.e).a(50.0);
    }

    @Override
    public float a(int n2, int n3, int n4) {
        return this.o.n(n2, n3, n4) - 0.5f;
    }
}

