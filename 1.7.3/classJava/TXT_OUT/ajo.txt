/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajo
extends ahz {
    public static boolean M;

    public ajo() {
        super(avk.p);
        this.a(aak.b);
    }

    public ajo(avk avk2) {
        super(avk2);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        afs2.a(n2, n3, n4, this, this.a(afs2));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        afs2.a(n2, n3, n4, this, this.a(afs2));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (!afs2.E) {
            this.m(afs2, n2, n3, n4);
        }
    }

    private void m(afs afs2, int n2, int n3, int n4) {
        int n5 = n2;
        int n6 = n3;
        int n7 = n4;
        if (ajo.e(afs2, n5, n6 - 1, n7) && n6 >= 0) {
            int n8 = 32;
            if (M || !afs2.b(n2 - n8, n3 - n8, n4 - n8, n2 + n8, n3 + n8, n4 + n8)) {
                afs2.f(n2, n3, n4);
                while (ajo.e(afs2, n2, n3 - 1, n4) && n3 > 0) {
                    --n3;
                }
                if (n3 > 0) {
                    afs2.b(n2, n3, n4, this);
                }
            } else if (!afs2.E) {
                wa wa2 = new wa(afs2, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, this, afs2.e(n2, n3, n4));
                this.a(wa2);
                afs2.d(wa2);
            }
        }
    }

    protected void a(wa wa2) {
    }

    @Override
    public int a(afs afs2) {
        return 2;
    }

    public static boolean e(afs afs2, int n2, int n3, int n4) {
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2.J == avk.a) {
            return true;
        }
        if (ahz2 == aie.ab) {
            return true;
        }
        avk avk2 = ahz2.J;
        if (avk2 == avk.h) {
            return true;
        }
        return avk2 == avk.i;
    }

    public void a(afs afs2, int n2, int n3, int n4, int n5) {
    }
}

