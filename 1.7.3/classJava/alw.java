/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class alw
extends aja {
    public static final double[] b = new double[]{-0.0625, 0.0625, 0.1875, 0.3125};
    private static final int[] M = new int[]{1, 2, 3, 4};

    protected alw(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        int n6 = afs2.e(n2, n3, n4);
        int n7 = (n6 & 0xC) >> 2;
        n7 = n7 + 1 << 2 & 0xC;
        afs2.a(n2, n3, n4, n7 | n6 & 3, 3);
        return true;
    }

    @Override
    protected int b(int n2) {
        return M[(n2 & 0xC) >> 2] * 2;
    }

    @Override
    protected aja e() {
        return aie.aS;
    }

    @Override
    protected aja i() {
        return aie.aR;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.aW;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.aW;
    }

    @Override
    public int b() {
        return 15;
    }

    @Override
    public boolean g(agc agc2, int n2, int n3, int n4, int n5) {
        return this.h(agc2, n2, n3, n4, n5) > 0;
    }

    @Override
    protected boolean a(ahz ahz2) {
        return alw.d(ahz2);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        if (!this.a) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        int n6 = alw.l(n5);
        double d2 = (double)((float)n2 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d3 = (double)((float)n3 + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d4 = (double)((float)n4 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d5 = 0.0;
        double d6 = 0.0;
        if (random.nextInt(2) == 0) {
            switch (n6) {
                case 0: {
                    d6 = -0.3125;
                    break;
                }
                case 2: {
                    d6 = 0.3125;
                    break;
                }
                case 3: {
                    d5 = -0.3125;
                    break;
                }
                case 1: {
                    d5 = 0.3125;
                }
            }
        } else {
            int n7 = (n5 & 0xC) >> 2;
            switch (n6) {
                case 0: {
                    d6 = b[n7];
                    break;
                }
                case 2: {
                    d6 = -b[n7];
                    break;
                }
                case 3: {
                    d5 = b[n7];
                    break;
                }
                case 1: {
                    d5 = -b[n7];
                }
            }
        }
        afs2.a("reddust", d2 + d5, d3, d4 + d6, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        super.a(afs2, n2, n3, n4, ahz2, n5);
        this.e(afs2, n2, n3, n4);
    }
}

