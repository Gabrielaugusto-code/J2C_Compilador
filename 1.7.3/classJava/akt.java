/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class akt
extends aii
implements aif {
    protected akt() {
        float f2 = 0.2f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f2 * 2.0f, 0.5f + f2);
        this.a(true);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (random.nextInt(25) == 0) {
            int n5;
            int n6;
            int n7;
            int n8 = 4;
            int n9 = 5;
            for (n7 = n2 - n8; n7 <= n2 + n8; ++n7) {
                for (n6 = n4 - n8; n6 <= n4 + n8; ++n6) {
                    for (n5 = n3 - 1; n5 <= n3 + 1; ++n5) {
                        if (afs2.a(n7, n5, n6) != this || --n9 > 0) continue;
                        return;
                    }
                }
            }
            n7 = n2 + random.nextInt(3) - 1;
            n6 = n3 + random.nextInt(2) - random.nextInt(2);
            n5 = n4 + random.nextInt(3) - 1;
            for (int i2 = 0; i2 < 4; ++i2) {
                if (afs2.c(n7, n6, n5) && this.j(afs2, n7, n6, n5)) {
                    n2 = n7;
                    n3 = n6;
                    n4 = n5;
                }
                n7 = n2 + random.nextInt(3) - 1;
                n6 = n3 + random.nextInt(2) - random.nextInt(2);
                n5 = n4 + random.nextInt(3) - 1;
            }
            if (afs2.c(n7, n6, n5) && this.j(afs2, n7, n6, n5)) {
                afs2.d(n7, n6, n5, this, 0, 2);
            }
        }
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return super.c(afs2, n2, n3, n4) && this.j(afs2, n2, n3, n4);
    }

    @Override
    protected boolean a(ahz ahz2) {
        return ahz2.j();
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        if (n3 < 0 || n3 >= 256) {
            return false;
        }
        ahz ahz2 = afs2.a(n2, n3 - 1, n4);
        return ahz2 == aie.bh || ahz2 == aie.d && afs2.e(n2, n3 - 1, n4) == 2 || afs2.j(n2, n3, n4) < 13 && this.a(ahz2);
    }

    public boolean c(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4);
        afs2.f(n2, n3, n4);
        aql aql2 = null;
        if (this == aie.P) {
            aql2 = new aql(0);
        } else if (this == aie.Q) {
            aql2 = new aql(1);
        }
        if (aql2 == null || !((aqe)aql2).a(afs2, random, n2, n3, n4)) {
            afs2.d(n2, n3, n4, this, n5, 3);
            return false;
        }
        return true;
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        this.c(afs2, n2, n3, n4, random);
    }
}

