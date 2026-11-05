/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class akw
extends aii {
    private pw[] a;

    protected akw() {
        this.a(true);
        float f2 = 0.5f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.25f, 0.5f + f2);
        this.a((aak)null);
    }

    @Override
    protected boolean a(ahz ahz2) {
        return ahz2 == aie.aM;
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        return this.a(afs2.a(n2, n3 - 1, n4));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4);
        if (n5 < 3 && random.nextInt(10) == 0) {
            afs2.a(n2, n3, n4, ++n5, 2);
        }
        super.a(afs2, n2, n3, n4, random);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 >= 3) {
            return this.a[2];
        }
        if (n3 > 0) {
            return this.a[1];
        }
        return this.a[0];
    }

    @Override
    public int b() {
        return 6;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        if (afs2.E) {
            return;
        }
        int n7 = 1;
        if (n5 >= 3) {
            n7 = 2 + afs2.s.nextInt(3);
            if (n6 > 0) {
                n7 += afs2.s.nextInt(n6 + 1);
            }
        }
        for (int i2 = 0; i2 < n7; ++i2) {
            this.a(afs2, n2, n3, n4, new abu(abv.bm));
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.bm;
    }

    @Override
    public void a(px px2) {
        this.a = new pw[3];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = px2.a(this.N() + "_stage_" + i2);
        }
    }
}

