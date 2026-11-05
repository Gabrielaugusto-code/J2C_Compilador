/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class alv
extends ahz {
    protected alv() {
        super(avk.k);
        float f2 = 0.375f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 1.0f, 0.5f + f2);
        this.a(true);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.a(n2, n3 - 1, n4) != aie.aH && !this.e(afs2, n2, n3, n4)) {
            return;
        }
        if (afs2.c(n2, n3 + 1, n4)) {
            int n5 = 1;
            while (afs2.a(n2, n3 - n5, n4) == this) {
                ++n5;
            }
            if (n5 < 3) {
                int n6 = afs2.e(n2, n3, n4);
                if (n6 == 15) {
                    afs2.b(n2, n3 + 1, n4, this);
                    afs2.a(n2, n3, n4, 0, 4);
                } else {
                    afs2.a(n2, n3, n4, n6 + 1, 4);
                }
            }
        }
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        ahz ahz2 = afs2.a(n2, n3 - 1, n4);
        if (ahz2 == this) {
            return true;
        }
        if (ahz2 != aie.c && ahz2 != aie.d && ahz2 != aie.m) {
            return false;
        }
        if (afs2.a(n2 - 1, n3 - 1, n4).o() == avk.h) {
            return true;
        }
        if (afs2.a(n2 + 1, n3 - 1, n4).o() == avk.h) {
            return true;
        }
        if (afs2.a(n2, n3 - 1, n4 - 1).o() == avk.h) {
            return true;
        }
        return afs2.a(n2, n3 - 1, n4 + 1).o() == avk.h;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        this.e(afs2, n2, n3, n4);
    }

    protected final boolean e(afs afs2, int n2, int n3, int n4) {
        if (!this.j(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
            return false;
        }
        return true;
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        return this.c(afs2, n2, n3, n4);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.aE;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.aE;
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        return agc2.a(n2, n4).b(n2, n3, n4);
    }
}

