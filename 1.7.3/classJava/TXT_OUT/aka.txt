/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public abstract class aka
extends ahz {
    protected final boolean a;

    public aka(boolean bl2, avk avk2) {
        super(avk2);
        this.a = bl2;
        if (bl2) {
            this.q = true;
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.g(255);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        if (this.a) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            boolean bl2;
            boolean bl3 = bl2 = (agc2.e(n2, n3, n4) & 8) != 0;
            if (bl2) {
                this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
            } else {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            }
        }
    }

    @Override
    public void g() {
        if (this.a) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        this.a((agc)afs2, n2, n3, n4);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
    }

    @Override
    public boolean c() {
        return this.a;
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        if (this.a) {
            return n6;
        }
        if (n5 == 0 || n5 != 1 && (double)f3 > 0.5) {
            return n6 | 8;
        }
        return n6;
    }

    @Override
    public int a(Random random) {
        if (this.a) {
            return 2;
        }
        return 1;
    }

    @Override
    public int a(int n2) {
        return n2 & 7;
    }

    @Override
    public boolean d() {
        return this.a;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        boolean bl2;
        if (this.a) {
            return super.a(agc2, n2, n3, n4, n5);
        }
        if (n5 != 1 && n5 != 0 && !super.a(agc2, n2, n3, n4, n5)) {
            return false;
        }
        int n6 = n2;
        int n7 = n3;
        int n8 = n4;
        boolean bl3 = bl2 = (agc2.e(n6 += q.b[q.a[n5]], n7 += q.c[q.a[n5]], n8 += q.d[q.a[n5]]) & 8) != 0;
        if (bl2) {
            if (n5 == 0) {
                return true;
            }
            if (n5 == 1 && super.a(agc2, n2, n3, n4, n5)) {
                return true;
            }
            return !aka.a(agc2.a(n2, n3, n4)) || (agc2.e(n2, n3, n4) & 8) == 0;
        }
        if (n5 == 1) {
            return true;
        }
        if (n5 == 0 && super.a(agc2, n2, n3, n4, n5)) {
            return true;
        }
        return !aka.a(agc2.a(n2, n3, n4)) || (agc2.e(n2, n3, n4) & 8) != 0;
    }

    private static boolean a(ahz ahz2) {
        return ahz2 == aie.U || ahz2 == aie.bx;
    }

    public abstract String b(int var1);

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        return super.k(afs2, n2, n3, n4) & 7;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        if (aka.a(this)) {
            return abs.a(this);
        }
        if (this == aie.T) {
            return abs.a(aie.U);
        }
        if (this == aie.bw) {
            return abs.a(aie.bx);
        }
        return abs.a(aie.U);
    }
}

