/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class alq
extends ahz {
    private boolean a;

    public alq(boolean bl2) {
        super(avk.e);
        if (bl2) {
            this.a(true);
        }
        this.a = bl2;
    }

    @Override
    public int a(afs afs2) {
        return 30;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, xq xq2) {
        this.e(afs2, n2, n3, n4);
        super.a(afs2, n2, n3, n4, xq2);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, qr qr2) {
        this.e(afs2, n2, n3, n4);
        super.b(afs2, n2, n3, n4, qr2);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        this.e(afs2, n2, n3, n4);
        return super.a(afs2, n2, n3, n4, xq2, n5, f2, f3, f4);
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        this.m(afs2, n2, n3, n4);
        if (this == aie.ax) {
            afs2.b(n2, n3, n4, aie.ay);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (this == aie.ay) {
            afs2.b(n2, n3, n4, aie.ax);
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.ax;
    }

    @Override
    public int a(int n2, Random random) {
        return this.a(random) + random.nextInt(n2 + 1);
    }

    @Override
    public int a(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        super.a(afs2, n2, n3, n4, n5, f2, n6);
        if (this.a(n5, afs2.s, n6) != abs.a(this)) {
            int n7 = 1 + afs2.s.nextInt(5);
            this.c(afs2, n2, n3, n4, n7);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        if (this.a) {
            this.m(afs2, n2, n3, n4);
        }
    }

    private void m(afs afs2, int n2, int n3, int n4) {
        Random random = afs2.s;
        double d2 = 0.0625;
        for (int i2 = 0; i2 < 6; ++i2) {
            double d3 = (float)n2 + random.nextFloat();
            double d4 = (float)n3 + random.nextFloat();
            double d5 = (float)n4 + random.nextFloat();
            if (i2 == 0 && !afs2.a(n2, n3 + 1, n4).c()) {
                d4 = (double)(n3 + 1) + d2;
            }
            if (i2 == 1 && !afs2.a(n2, n3 - 1, n4).c()) {
                d4 = (double)(n3 + 0) - d2;
            }
            if (i2 == 2 && !afs2.a(n2, n3, n4 + 1).c()) {
                d5 = (double)(n4 + 1) + d2;
            }
            if (i2 == 3 && !afs2.a(n2, n3, n4 - 1).c()) {
                d5 = (double)(n4 + 0) - d2;
            }
            if (i2 == 4 && !afs2.a(n2 + 1, n3, n4).c()) {
                d3 = (double)(n2 + 1) + d2;
            }
            if (i2 == 5 && !afs2.a(n2 - 1, n3, n4).c()) {
                d3 = (double)(n2 + 0) - d2;
            }
            if (!(d3 < (double)n2 || d3 > (double)(n2 + 1) || d4 < 0.0 || d4 > (double)(n3 + 1) || d5 < (double)n4) && !(d5 > (double)(n4 + 1))) continue;
            afs2.a("reddust", d3, d4, d5, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected abu j(int n2) {
        return new abu(aie.ax);
    }
}

