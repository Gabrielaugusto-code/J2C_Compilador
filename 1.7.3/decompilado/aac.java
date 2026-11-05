/*
 * Decompiled with CFR 0.152.
 */
public class aac
extends abs {
    public aac() {
        this.a(aak.k);
    }

    @Override
    public pw b_(int n2) {
        return abv.bn.b_(0);
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
            if (afs2.a(n2, n3, n4).o() == avk.h) {
                --abu2.b;
                if (abu2.b <= 0) {
                    return new abu(abv.bn);
                }
                if (!xq2.bm.a(new abu(abv.bn))) {
                    xq2.a(new abu(abv.bn, 1, 0), false);
                }
            }
        }
        return abu2;
    }

    @Override
    public void a(px px2) {
    }
}

