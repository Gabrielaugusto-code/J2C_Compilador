/*
 * Decompiled with CFR 0.152.
 */
public class aaf
extends abs {
    private ahz a;

    public aaf(ahz ahz2) {
        this.h = 1;
        this.a = ahz2;
        this.a(aak.f);
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        boolean bl2 = this.a == aie.a;
        ayn ayn2 = this.a(afs2, xq2, bl2);
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
            if (bl2) {
                if (!xq2.a(n2, n3, n4, ayn2.e, abu2)) {
                    return abu2;
                }
                avk avk2 = afs2.a(n2, n3, n4).o();
                int n5 = afs2.e(n2, n3, n4);
                if (avk2 == avk.h && n5 == 0) {
                    afs2.f(n2, n3, n4);
                    return this.a(abu2, xq2, abv.as);
                }
                if (avk2 == avk.i && n5 == 0) {
                    afs2.f(n2, n3, n4);
                    return this.a(abu2, xq2, abv.at);
                }
            } else {
                if (this.a == aie.a) {
                    return new abu(abv.ar);
                }
                if (ayn2.e == 0) {
                    --n3;
                }
                if (ayn2.e == 1) {
                    ++n3;
                }
                if (ayn2.e == 2) {
                    --n4;
                }
                if (ayn2.e == 3) {
                    ++n4;
                }
                if (ayn2.e == 4) {
                    --n2;
                }
                if (ayn2.e == 5) {
                    ++n2;
                }
                if (!xq2.a(n2, n3, n4, ayn2.e, abu2)) {
                    return abu2;
                }
                if (this.a(afs2, n2, n3, n4) && !xq2.bE.d) {
                    return new abu(abv.ar);
                }
            }
        }
        return abu2;
    }

    private abu a(abu abu2, xq xq2, abs abs2) {
        if (xq2.bE.d) {
            return abu2;
        }
        if (--abu2.b <= 0) {
            return new abu(abs2);
        }
        if (!xq2.bm.a(new abu(abs2))) {
            xq2.a(new abu(abs2, 1, 0), false);
        }
        return abu2;
    }

    public boolean a(afs afs2, int n2, int n3, int n4) {
        boolean bl2;
        if (this.a == aie.a) {
            return false;
        }
        avk avk2 = afs2.a(n2, n3, n4).o();
        boolean bl3 = bl2 = !avk2.a();
        if (afs2.c(n2, n3, n4) || bl2) {
            if (afs2.t.f && this.a == aie.i) {
                afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.fizz", 0.5f, 2.6f + (afs2.s.nextFloat() - afs2.s.nextFloat()) * 0.8f);
                for (int i2 = 0; i2 < 8; ++i2) {
                    afs2.a("largesmoke", (double)n2 + Math.random(), (double)n3 + Math.random(), (double)n4 + Math.random(), 0.0, 0.0, 0.0);
                }
            } else {
                if (!afs2.E && bl2 && !avk2.d()) {
                    afs2.a(n2, n3, n4, true);
                }
                afs2.d(n2, n3, n4, this.a, 0, 3);
            }
            return true;
        }
        return false;
    }
}

