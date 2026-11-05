/*
 * Decompiled with CFR 0.152.
 */
public class aiv
extends ahz {
    private pw a;
    private pw b;

    protected aiv() {
        super(avk.d);
        this.a(aak.c);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.a;
        }
        if (n2 == 0) {
            return aie.f.h(n2);
        }
        if (n2 == 2 || n2 == 4) {
            return this.b;
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.a = px2.a(this.N() + "_top");
        this.b = px2.a(this.N() + "_front");
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        xq2.b(n2, n3, n4);
        return true;
    }
}

