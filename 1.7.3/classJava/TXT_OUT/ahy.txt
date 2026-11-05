/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahy
extends ajb {
    public static final int[][] a = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
    private pw[] b;
    private pw[] M;
    private pw[] N;

    public ahy() {
        super(avk.n);
        this.e();
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        xr xr2;
        if (afs2.E) {
            return true;
        }
        int n6 = afs2.e(n2, n3, n4);
        if (!ahy.b(n6)) {
            int n7 = ahy.l(n6);
            if (afs2.a(n2 += a[n7][0], n3, n4 += a[n7][1]) != this) {
                return true;
            }
            n6 = afs2.e(n2, n3, n4);
        }
        if (!afs2.t.e() || afs2.a(n2, n4) == agl.w) {
            double d2 = (double)n2 + 0.5;
            double d3 = (double)n3 + 0.5;
            double d4 = (double)n4 + 0.5;
            afs2.f(n2, n3, n4);
            int n8 = ahy.l(n6);
            if (afs2.a(n2 += a[n8][0], n3, n4 += a[n8][1]) == this) {
                afs2.f(n2, n3, n4);
                d2 = (d2 + (double)n2 + 0.5) / 2.0;
                d3 = (d3 + (double)n3 + 0.5) / 2.0;
                d4 = (d4 + (double)n4 + 0.5) / 2.0;
            }
            afs2.a(null, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), 5.0f, true, true);
            return true;
        }
        if (ahy.c(n6)) {
            xq xq3 = null;
            for (xq xq4 : afs2.h) {
                if (!xq4.bl()) continue;
                r r2 = xq4.bB;
                if (r2.a != n2 || r2.b != n3 || r2.c != n4) continue;
                xq3 = xq4;
            }
            if (xq3 == null) {
                ahy.a(afs2, n2, n3, n4, false);
            } else {
                xq2.b(new fi("tile.bed.occupied", new Object[0]));
                return true;
            }
        }
        if ((xr2 = xq2.a(n2, n3, n4)) == xr.a) {
            ahy.a(afs2, n2, n3, n4, true);
            return true;
        }
        if (xr2 == xr.c) {
            xq2.b(new fi("tile.bed.noSleep", new Object[0]));
        } else if (xr2 == xr.f) {
            xq2.b(new fi("tile.bed.notSafe", new Object[0]));
        }
        return true;
    }

    @Override
    public pw a(int n2, int n3) {
        int n4;
        if (n2 == 0) {
            return aie.f.h(n2);
        }
        int n5 = ahy.l(n3);
        int n6 = p.i[n5][n2];
        int n7 = n4 = ahy.b(n3) ? 1 : 0;
        if (n4 == 1 && n6 == 2 || n4 == 0 && n6 == 3) {
            return this.b[n4];
        }
        if (n6 == 5 || n6 == 4) {
            return this.M[n4];
        }
        return this.N[n4];
    }

    @Override
    public void a(px px2) {
        this.N = new pw[]{px2.a(this.N() + "_feet_top"), px2.a(this.N() + "_head_top")};
        this.b = new pw[]{px2.a(this.N() + "_feet_end"), px2.a(this.N() + "_head_end")};
        this.M = new pw[]{px2.a(this.N() + "_feet_side"), px2.a(this.N() + "_head_side")};
    }

    @Override
    public int b() {
        return 14;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.e();
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        int n5 = afs2.e(n2, n3, n4);
        int n6 = ahy.l(n5);
        if (ahy.b(n5)) {
            if (afs2.a(n2 - a[n6][0], n3, n4 - a[n6][1]) != this) {
                afs2.f(n2, n3, n4);
            }
        } else if (afs2.a(n2 + a[n6][0], n3, n4 + a[n6][1]) != this) {
            afs2.f(n2, n3, n4);
            if (!afs2.E) {
                this.b(afs2, n2, n3, n4, n5, 0);
            }
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        if (ahy.b(n2)) {
            return abs.d(0);
        }
        return abv.aV;
    }

    private void e() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }

    public static boolean b(int n2) {
        return (n2 & 8) != 0;
    }

    public static boolean c(int n2) {
        return (n2 & 4) != 0;
    }

    public static void a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        int n5 = afs2.e(n2, n3, n4);
        n5 = bl2 ? (n5 |= 4) : (n5 &= 0xFFFFFFFB);
        afs2.a(n2, n3, n4, n5, 4);
    }

    public static r a(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = afs2.e(n2, n3, n4);
        int n7 = ajb.l(n6);
        for (int i2 = 0; i2 <= 1; ++i2) {
            int n8 = n2 - a[n7][0] * i2 - 1;
            int n9 = n4 - a[n7][1] * i2 - 1;
            int n10 = n8 + 2;
            int n11 = n9 + 2;
            for (int i3 = n8; i3 <= n10; ++i3) {
                for (int i4 = n9; i4 <= n11; ++i4) {
                    if (!afs.a(afs2, i3, n3 - 1, i4) || afs2.a(i3, n3, i4).o().k() || afs2.a(i3, n3 + 1, i4).o().k()) continue;
                    if (n5 > 0) {
                        --n5;
                        continue;
                    }
                    return new r(i3, n3, i4);
                }
            }
        }
        return null;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        if (!ahy.b(n5)) {
            super.a(afs2, n2, n3, n4, n5, f2, 0);
        }
    }

    @Override
    public int h() {
        return 1;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.aV;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        int n6;
        if (xq2.bE.d && ahy.b(n5) && afs2.a(n2 -= a[n6 = ahy.l(n5)][0], n3, n4 -= a[n6][1]) == this) {
            afs2.f(n2, n3, n4);
        }
    }
}

