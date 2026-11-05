/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aju
extends aht {
    public aju() {
        super(avk.q);
        this.g();
    }

    @Override
    public void g() {
        float f2 = 0.375f;
        float f3 = f2 / 2.0f;
        this.a(0.5f - f3, 0.0f, 0.5f - f3, 0.5f + f3, f2, 0.5f + f3);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int b() {
        return 33;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        abu abu2 = xq2.bm.h();
        if (abu2 == null || !(abu2.b() instanceof zy)) {
            return false;
        }
        anw anw2 = this.e(afs2, n2, n3, n4);
        if (anw2 != null) {
            if (anw2.a() != null) {
                return false;
            }
            ahz ahz2 = ahz.a(abu2.b());
            if (!this.a(ahz2, abu2.k())) {
                return false;
            }
            anw2.a(abu2.b(), abu2.k());
            anw2.e();
            if (!afs2.a(n2, n3, n4, abu2.k(), 2)) {
                afs2.g(n2, n3, n4);
            }
            if (!xq2.bE.d && --abu2.b <= 0) {
                xq2.bm.a(xq2.bm.c, null);
            }
            return true;
        }
        return false;
    }

    private boolean a(ahz ahz2, int n2) {
        if (ahz2 == aie.N || ahz2 == aie.O || ahz2 == aie.aF || ahz2 == aie.P || ahz2 == aie.Q || ahz2 == aie.g || ahz2 == aie.I) {
            return true;
        }
        return ahz2 == aie.H && n2 == 2;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        anw anw2 = this.e(afs2, n2, n3, n4);
        if (anw2 != null && anw2.a() != null) {
            return anw2.a();
        }
        return abv.bE;
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        anw anw2 = this.e(afs2, n2, n3, n4);
        if (anw2 != null && anw2.a() != null) {
            return anw2.b();
        }
        return 0;
    }

    @Override
    public boolean K() {
        return true;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return super.c(afs2, n2, n3, n4) && afs.a(afs2, n2, n3 - 1, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!afs.a(afs2, n2, n3 - 1, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        anw anw2 = this.e(afs2, n2, n3, n4);
        if (anw2 != null && anw2.a() != null) {
            this.a(afs2, n2, n3, n4, new abu(anw2.a(), 1, anw2.b()));
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        anw anw2;
        super.a(afs2, n2, n3, n4, n5, xq2);
        if (xq2.bE.d && (anw2 = this.e(afs2, n2, n3, n4)) != null) {
            anw2.a(abs.d(0), 0);
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.bE;
    }

    private anw e(afs afs2, int n2, int n3, int n4) {
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 != null && ani2 instanceof anw) {
            return (anw)ani2;
        }
        return null;
    }

    @Override
    public ani a(afs afs2, int n2) {
        ahz ahz2 = null;
        int n3 = 0;
        switch (n2) {
            default: {
                break;
            }
            case 1: {
                ahz2 = aie.O;
                n3 = 0;
                break;
            }
            case 2: {
                ahz2 = aie.N;
                break;
            }
            case 3: {
                ahz2 = aie.g;
                n3 = 0;
                break;
            }
            case 4: {
                ahz2 = aie.g;
                n3 = 1;
                break;
            }
            case 5: {
                ahz2 = aie.g;
                n3 = 2;
                break;
            }
            case 6: {
                ahz2 = aie.g;
                n3 = 3;
                break;
            }
            case 12: {
                ahz2 = aie.g;
                n3 = 4;
                break;
            }
            case 13: {
                ahz2 = aie.g;
                n3 = 5;
                break;
            }
            case 7: {
                ahz2 = aie.Q;
                break;
            }
            case 8: {
                ahz2 = aie.P;
                break;
            }
            case 9: {
                ahz2 = aie.aF;
                break;
            }
            case 10: {
                ahz2 = aie.I;
                break;
            }
            case 11: {
                ahz2 = aie.H;
                n3 = 2;
            }
        }
        return new anw(abs.a(ahz2), n3);
    }
}

