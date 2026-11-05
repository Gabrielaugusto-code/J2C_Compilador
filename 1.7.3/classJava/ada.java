/*
 * Decompiled with CFR 0.152.
 */
public class ada
extends aai {
    public ada(ahz ahz2) {
        super(ahz2, false);
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        ayn ayn2 = this.a(afs2, xq2, true);
        if (ayn2 == null) {
            return abu2;
        }
        if (ayn2.a == ayo.b) {
            int n2 = ayn2.b;
            int n3 = ayn2.c;
            int n4 = ayn2.d;
            if (!afs2.a(xq2, n2, n3, n4)) {
                return abu2;
            }
            if (!xq2.a(n2, n3, n4, ayn2.e, abu2)) {
                return abu2;
            }
            if (afs2.a(n2, n3, n4).o() == avk.h && afs2.e(n2, n3, n4) == 0 && afs2.c(n2, n3 + 1, n4)) {
                afs2.b(n2, n3 + 1, n4, aie.bi);
                if (!xq2.bE.d) {
                    --abu2.b;
                }
            }
        }
        return abu2;
    }

    @Override
    public int a(abu abu2, int n2) {
        return aie.bi.i(abu2.k());
    }
}

