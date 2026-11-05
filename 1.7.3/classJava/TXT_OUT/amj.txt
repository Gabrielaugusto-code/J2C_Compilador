/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class amj
extends ahz {
    private static final int[][] a = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
    private final ahz b;
    private final int M;
    private boolean N;
    private int O;

    protected amj(ahz ahz2, int n2) {
        super(ahz2.J);
        this.b = ahz2;
        this.M = n2;
        this.c(ahz2.v);
        this.b(ahz2.w / 3.0f);
        this.a(ahz2.H);
        this.g(255);
        this.a(aak.b);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        if (this.N) {
            this.a(0.5f * (float)(this.O % 2), 0.5f * (float)(this.O / 2 % 2), 0.5f * (float)(this.O / 4 % 2), 0.5f + 0.5f * (float)(this.O % 2), 0.5f + 0.5f * (float)(this.O / 2 % 2), 0.5f + 0.5f * (float)(this.O / 4 % 2));
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
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
        return 10;
    }

    public void e(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        if ((n5 & 4) != 0) {
            this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    public static boolean a(ahz ahz2) {
        return ahz2 instanceof amj;
    }

    private boolean f(agc agc2, int n2, int n3, int n4, int n5) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        return amj.a(ahz2) && agc2.e(n2, n3, n4) == n5;
    }

    public boolean f(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        int n6 = n5 & 3;
        float f2 = 0.5f;
        float f3 = 1.0f;
        if ((n5 & 4) != 0) {
            f2 = 0.0f;
            f3 = 0.5f;
        }
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 0.0f;
        float f7 = 0.5f;
        boolean bl2 = true;
        if (n6 == 0) {
            f4 = 0.5f;
            f7 = 1.0f;
            ahz ahz2 = agc2.a(n2 + 1, n3, n4);
            int n7 = agc2.e(n2 + 1, n3, n4);
            if (amj.a(ahz2) && (n5 & 4) == (n7 & 4)) {
                int n8 = n7 & 3;
                if (n8 == 3 && !this.f(agc2, n2, n3, n4 + 1, n5)) {
                    f7 = 0.5f;
                    bl2 = false;
                } else if (n8 == 2 && !this.f(agc2, n2, n3, n4 - 1, n5)) {
                    f6 = 0.5f;
                    bl2 = false;
                }
            }
        } else if (n6 == 1) {
            f5 = 0.5f;
            f7 = 1.0f;
            ahz ahz3 = agc2.a(n2 - 1, n3, n4);
            int n9 = agc2.e(n2 - 1, n3, n4);
            if (amj.a(ahz3) && (n5 & 4) == (n9 & 4)) {
                int n10 = n9 & 3;
                if (n10 == 3 && !this.f(agc2, n2, n3, n4 + 1, n5)) {
                    f7 = 0.5f;
                    bl2 = false;
                } else if (n10 == 2 && !this.f(agc2, n2, n3, n4 - 1, n5)) {
                    f6 = 0.5f;
                    bl2 = false;
                }
            }
        } else if (n6 == 2) {
            f6 = 0.5f;
            f7 = 1.0f;
            ahz ahz4 = agc2.a(n2, n3, n4 + 1);
            int n11 = agc2.e(n2, n3, n4 + 1);
            if (amj.a(ahz4) && (n5 & 4) == (n11 & 4)) {
                int n12 = n11 & 3;
                if (n12 == 1 && !this.f(agc2, n2 + 1, n3, n4, n5)) {
                    f5 = 0.5f;
                    bl2 = false;
                } else if (n12 == 0 && !this.f(agc2, n2 - 1, n3, n4, n5)) {
                    f4 = 0.5f;
                    bl2 = false;
                }
            }
        } else if (n6 == 3) {
            ahz ahz5 = agc2.a(n2, n3, n4 - 1);
            int n13 = agc2.e(n2, n3, n4 - 1);
            if (amj.a(ahz5) && (n5 & 4) == (n13 & 4)) {
                int n14 = n13 & 3;
                if (n14 == 1 && !this.f(agc2, n2 + 1, n3, n4, n5)) {
                    f5 = 0.5f;
                    bl2 = false;
                } else if (n14 == 0 && !this.f(agc2, n2 - 1, n3, n4, n5)) {
                    f4 = 0.5f;
                    bl2 = false;
                }
            }
        }
        this.a(f4, f2, f6, f5, f3, f7);
        return bl2;
    }

    public boolean g(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        int n6 = n5 & 3;
        float f2 = 0.5f;
        float f3 = 1.0f;
        if ((n5 & 4) != 0) {
            f2 = 0.0f;
            f3 = 0.5f;
        }
        float f4 = 0.0f;
        float f5 = 0.5f;
        float f6 = 0.5f;
        float f7 = 1.0f;
        boolean bl2 = false;
        if (n6 == 0) {
            ahz ahz2 = agc2.a(n2 - 1, n3, n4);
            int n7 = agc2.e(n2 - 1, n3, n4);
            if (amj.a(ahz2) && (n5 & 4) == (n7 & 4)) {
                int n8 = n7 & 3;
                if (n8 == 3 && !this.f(agc2, n2, n3, n4 - 1, n5)) {
                    f6 = 0.0f;
                    f7 = 0.5f;
                    bl2 = true;
                } else if (n8 == 2 && !this.f(agc2, n2, n3, n4 + 1, n5)) {
                    f6 = 0.5f;
                    f7 = 1.0f;
                    bl2 = true;
                }
            }
        } else if (n6 == 1) {
            ahz ahz3 = agc2.a(n2 + 1, n3, n4);
            int n9 = agc2.e(n2 + 1, n3, n4);
            if (amj.a(ahz3) && (n5 & 4) == (n9 & 4)) {
                f4 = 0.5f;
                f5 = 1.0f;
                int n10 = n9 & 3;
                if (n10 == 3 && !this.f(agc2, n2, n3, n4 - 1, n5)) {
                    f6 = 0.0f;
                    f7 = 0.5f;
                    bl2 = true;
                } else if (n10 == 2 && !this.f(agc2, n2, n3, n4 + 1, n5)) {
                    f6 = 0.5f;
                    f7 = 1.0f;
                    bl2 = true;
                }
            }
        } else if (n6 == 2) {
            ahz ahz4 = agc2.a(n2, n3, n4 - 1);
            int n11 = agc2.e(n2, n3, n4 - 1);
            if (amj.a(ahz4) && (n5 & 4) == (n11 & 4)) {
                f6 = 0.0f;
                f7 = 0.5f;
                int n12 = n11 & 3;
                if (n12 == 1 && !this.f(agc2, n2 - 1, n3, n4, n5)) {
                    bl2 = true;
                } else if (n12 == 0 && !this.f(agc2, n2 + 1, n3, n4, n5)) {
                    f4 = 0.5f;
                    f5 = 1.0f;
                    bl2 = true;
                }
            }
        } else if (n6 == 3) {
            ahz ahz5 = agc2.a(n2, n3, n4 + 1);
            int n13 = agc2.e(n2, n3, n4 + 1);
            if (amj.a(ahz5) && (n5 & 4) == (n13 & 4)) {
                int n14 = n13 & 3;
                if (n14 == 1 && !this.f(agc2, n2 - 1, n3, n4, n5)) {
                    bl2 = true;
                } else if (n14 == 0 && !this.f(agc2, n2 + 1, n3, n4, n5)) {
                    f4 = 0.5f;
                    f5 = 1.0f;
                    bl2 = true;
                }
            }
        }
        if (bl2) {
            this.a(f4, f2, f6, f5, f3, f7);
        }
        return bl2;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        this.e(afs2, n2, n3, n4);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        boolean bl2 = this.f((agc)afs2, n2, n3, n4);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        if (bl2 && this.g((agc)afs2, n2, n3, n4)) {
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        }
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        this.b.b(afs2, n2, n3, n4, random);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, xq xq2) {
        this.b.a(afs2, n2, n3, n4, xq2);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, int n5) {
        this.b.b(afs2, n2, n3, n4, n5);
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4) {
        return this.b.c(agc2, n2, n3, n4);
    }

    @Override
    public float a(qr qr2) {
        return this.b.a(qr2);
    }

    @Override
    public int w() {
        return this.b.w();
    }

    @Override
    public pw a(int n2, int n3) {
        return this.b.a(n2, this.M);
    }

    @Override
    public int a(afs afs2) {
        return this.b.a(afs2);
    }

    @Override
    public ayk g(afs afs2, int n2, int n3, int n4) {
        return this.b.g(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2, ayp ayp2) {
        this.b.a(afs2, n2, n3, n4, qr2, ayp2);
    }

    @Override
    public boolean v() {
        return this.b.v();
    }

    @Override
    public boolean a(int n2, boolean bl2) {
        return this.b.a(n2, bl2);
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return this.b.c(afs2, n2, n3, n4);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        this.a(afs2, n2, n3, n4, aie.a);
        this.b.b(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        this.b.a(afs2, n2, n3, n4, ahz2, n5);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, qr qr2) {
        this.b.b(afs2, n2, n3, n4, qr2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        this.b.a(afs2, n2, n3, n4, random);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        return this.b.a(afs2, n2, n3, n4, xq2, 0, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, afn afn2) {
        this.b.a(afs2, n2, n3, n4, afn2);
    }

    @Override
    public avm f(int n2) {
        return this.b.f(this.M);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3;
        int n6 = afs2.e(n2, n3, n4) & 4;
        if (n5 == 0) {
            afs2.a(n2, n3, n4, 2 | n6, 2);
        }
        if (n5 == 1) {
            afs2.a(n2, n3, n4, 1 | n6, 2);
        }
        if (n5 == 2) {
            afs2.a(n2, n3, n4, 3 | n6, 2);
        }
        if (n5 == 3) {
            afs2.a(n2, n3, n4, 0 | n6, 2);
        }
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        if (n5 == 0 || n5 != 1 && (double)f3 > 0.5) {
            return n6 | 4;
        }
        return n6;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ayn a(afs afs2, int n2, int n3, int n4, ayp ayp2, ayp ayp3) {
        void var12_16;
        void object;
        ayn[] aynArray = new ayn[8];
        int n5 = afs2.e(n2, n3, n4);
        int n6 = n5 & 3;
        boolean bl2 = (n5 & 4) == 4;
        int[] nArray = a[n6 + (bl2 ? 4 : 0)];
        this.N = true;
        boolean i2 = false;
        while (object < 8) {
            this.O = object;
            int[] nArray2 = nArray;
            int n7 = nArray2.length;
            for (int i3 = 0; i3 < n7; ++i3) {
                int n8 = nArray2[i3];
                if (n8 != object) continue;
            }
            aynArray[object] = super.a(afs2, n2, n3, n4, ayp2, ayp3);
            ++object;
        }
        for (int i3 : nArray) {
            aynArray[i3] = null;
        }
        Object var12_15 = null;
        double d2 = 0.0;
        for (ayn ayn2 : aynArray) {
            double d3;
            if (ayn2 == null || !((d3 = ayn2.f.e(ayp3)) > d2)) continue;
            ayn ayn3 = ayn2;
            d2 = d3;
        }
        return var12_16;
    }

    @Override
    public void a(px px2) {
    }
}

