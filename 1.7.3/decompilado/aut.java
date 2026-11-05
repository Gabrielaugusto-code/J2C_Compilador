/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

abstract class aut
extends aua {
    protected int k = -1;
    private int a;
    private boolean b;

    public aut() {
    }

    protected aut(auq auq2, int n2) {
        super(n2);
        if (auq2 != null) {
            this.b = auq2.b;
        }
    }

    @Override
    protected void a(dg dg2) {
        dg2.a("HPos", this.k);
        dg2.a("VCount", this.a);
        dg2.a("Desert", this.b);
    }

    @Override
    protected void b(dg dg2) {
        this.k = dg2.f("HPos");
        this.a = dg2.f("VCount");
        this.b = dg2.n("Desert");
    }

    protected aua a(auq auq2, List list, Random random, int n2, int n3) {
        switch (this.g) {
            case 2: {
                return auf.a(auq2, list, random, this.f.a - 1, this.f.b + n2, this.f.c + n3, 1, this.d());
            }
            case 0: {
                return auf.a(auq2, list, random, this.f.a - 1, this.f.b + n2, this.f.c + n3, 1, this.d());
            }
            case 1: {
                return auf.a(auq2, list, random, this.f.a + n3, this.f.b + n2, this.f.c - 1, 2, this.d());
            }
            case 3: {
                return auf.a(auq2, list, random, this.f.a + n3, this.f.b + n2, this.f.c - 1, 2, this.d());
            }
        }
        return null;
    }

    protected aua b(auq auq2, List list, Random random, int n2, int n3) {
        switch (this.g) {
            case 2: {
                return auf.a(auq2, list, random, this.f.d + 1, this.f.b + n2, this.f.c + n3, 3, this.d());
            }
            case 0: {
                return auf.a(auq2, list, random, this.f.d + 1, this.f.b + n2, this.f.c + n3, 3, this.d());
            }
            case 1: {
                return auf.a(auq2, list, random, this.f.a + n3, this.f.b + n2, this.f.f + 1, 0, this.d());
            }
            case 3: {
                return auf.a(auq2, list, random, this.f.a + n3, this.f.b + n2, this.f.f + 1, 0, this.d());
            }
        }
        return null;
    }

    protected int b(afs afs2, arm arm2) {
        int n2 = 0;
        int n3 = 0;
        for (int i2 = this.f.c; i2 <= this.f.f; ++i2) {
            for (int i3 = this.f.a; i3 <= this.f.d; ++i3) {
                if (!arm2.b(i3, 64, i2)) continue;
                n2 += Math.max(afs2.i(i3, i2), afs2.t.i());
                ++n3;
            }
        }
        if (n3 == 0) {
            return -1;
        }
        return n2 / n3;
    }

    protected static boolean a(arm arm2) {
        return arm2 != null && arm2.b > 10;
    }

    protected void a(afs afs2, arm arm2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        if (this.a >= n5) {
            return;
        }
        for (int i2 = this.a; i2 < n5 && arm2.b(n8 = this.a(n2 + i2, n4), n7 = this.a(n3), n6 = this.b(n2 + i2, n4)); ++i2) {
            ++this.a;
            xm xm2 = new xm(afs2, this.b(i2));
            xm2.b((double)n8 + 0.5, n7, (double)n6 + 0.5, 0.0f, 0.0f);
            afs2.d(xm2);
        }
    }

    protected int b(int n2) {
        return 0;
    }

    protected ahz b(ahz ahz2, int n2) {
        if (this.b) {
            if (ahz2 == aie.r || ahz2 == aie.s) {
                return aie.A;
            }
            if (ahz2 == aie.e) {
                return aie.A;
            }
            if (ahz2 == aie.f) {
                return aie.A;
            }
            if (ahz2 == aie.ad) {
                return aie.bz;
            }
            if (ahz2 == aie.ar) {
                return aie.bz;
            }
            if (ahz2 == aie.n) {
                return aie.A;
            }
        }
        return ahz2;
    }

    protected int c(ahz ahz2, int n2) {
        if (this.b) {
            if (ahz2 == aie.r || ahz2 == aie.s) {
                return 0;
            }
            if (ahz2 == aie.e) {
                return 0;
            }
            if (ahz2 == aie.f) {
                return 2;
            }
        }
        return n2;
    }

    @Override
    protected void a(afs afs2, ahz ahz2, int n2, int n3, int n4, int n5, arm arm2) {
        ahz ahz3 = this.b(ahz2, n2);
        int n6 = this.c(ahz2, n2);
        super.a(afs2, ahz3, n6, n3, n4, n5, arm2);
    }

    @Override
    protected void a(afs afs2, arm arm2, int n2, int n3, int n4, int n5, int n6, int n7, ahz ahz2, ahz ahz3, boolean bl2) {
        ahz ahz4 = this.b(ahz2, 0);
        int n8 = this.c(ahz2, 0);
        ahz ahz5 = this.b(ahz3, 0);
        int n9 = this.c(ahz3, 0);
        super.a(afs2, arm2, n2, n3, n4, n5, n6, n7, ahz4, n8, ahz5, n9, bl2);
    }

    @Override
    protected void b(afs afs2, ahz ahz2, int n2, int n3, int n4, int n5, arm arm2) {
        ahz ahz3 = this.b(ahz2, n2);
        int n6 = this.c(ahz2, n2);
        super.b(afs2, ahz3, n6, n3, n4, n5, arm2);
    }
}

