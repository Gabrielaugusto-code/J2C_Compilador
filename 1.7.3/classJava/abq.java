/*
 * Decompiled with CFR 0.152.
 */
public class abq
extends abs {
    private final Class a;

    public abq(Class clazz) {
        this.a = clazz;
        this.a(aak.c);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (n5 == 0) {
            return false;
        }
        if (n5 == 1) {
            return false;
        }
        int n6 = p.e[n5];
        rj rj2 = this.a(afs2, n2, n3, n4, n6);
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (rj2 != null && rj2.e()) {
            if (!afs2.E) {
                afs2.d(rj2);
            }
            --abu2.b;
        }
        return true;
    }

    private rj a(afs afs2, int n2, int n3, int n4, int n5) {
        if (this.a == rs.class) {
            return new rs(afs2, n2, n3, n4, n5);
        }
        if (this.a == rk.class) {
            return new rk(afs2, n2, n3, n4, n5);
        }
        return null;
    }
}

