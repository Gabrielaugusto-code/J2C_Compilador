/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class akf
extends ahz {
    private static final String[] a = new String[]{"skin_brown", "skin_red"};
    private final int b;
    private pw[] M;
    private pw N;
    private pw O;

    public akf(avk avk2, int n2) {
        super(avk2);
        this.b = n2;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 == 10 && n2 > 1) {
            return this.N;
        }
        if (n3 >= 1 && n3 <= 9 && n2 == 1) {
            return this.M[this.b];
        }
        if (n3 >= 1 && n3 <= 3 && n2 == 2) {
            return this.M[this.b];
        }
        if (n3 >= 7 && n3 <= 9 && n2 == 3) {
            return this.M[this.b];
        }
        if ((n3 == 1 || n3 == 4 || n3 == 7) && n2 == 4) {
            return this.M[this.b];
        }
        if ((n3 == 3 || n3 == 6 || n3 == 9) && n2 == 5) {
            return this.M[this.b];
        }
        if (n3 == 14) {
            return this.M[this.b];
        }
        if (n3 == 15) {
            return this.N;
        }
        return this.O;
    }

    @Override
    public int a(Random random) {
        int n2 = random.nextInt(10) - 7;
        if (n2 < 0) {
            n2 = 0;
        }
        return n2;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.d(ahz.b(aie.P) + this.b);
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.d(ahz.b(aie.P) + this.b);
    }

    @Override
    public void a(px px2) {
        this.M = new pw[a.length];
        for (int i2 = 0; i2 < this.M.length; ++i2) {
            this.M[i2] = px2.a(this.N() + "_" + a[i2]);
        }
        this.O = px2.a(this.N() + "_" + "inside");
        this.N = px2.a(this.N() + "_" + "skin_stem");
    }
}

