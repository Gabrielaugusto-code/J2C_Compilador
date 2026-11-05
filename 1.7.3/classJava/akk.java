/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class akk
extends amu {
    int[] a;
    protected int b;
    protected pw[][] M = new pw[2][];

    public akk() {
        super(avk.j, false);
        this.a(true);
        this.a(aak.c);
        this.c(0.2f);
        this.g(1);
        this.a(h);
    }

    @Override
    public int D() {
        double d2 = 0.5;
        double d3 = 1.0;
        return afo.a(d2, d3);
    }

    @Override
    public int i(int n2) {
        return afo.c();
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                int n8 = agc2.a(n2 + i3, n4 + i2).c(n2 + i3, n3, n4 + i2);
                n5 += (n8 & 0xFF0000) >> 16;
                n6 += (n8 & 0xFF00) >> 8;
                n7 += n8 & 0xFF;
            }
        }
        return (n5 / 9 & 0xFF) << 16 | (n6 / 9 & 0xFF) << 8 | n7 / 9 & 0xFF;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        int n6 = 1;
        int n7 = n6 + 1;
        if (afs2.b(n2 - n7, n3 - n7, n4 - n7, n2 + n7, n3 + n7, n4 + n7)) {
            for (int i2 = -n6; i2 <= n6; ++i2) {
                for (int i3 = -n6; i3 <= n6; ++i3) {
                    for (int i4 = -n6; i4 <= n6; ++i4) {
                        if (afs2.a(n2 + i2, n3 + i3, n4 + i4).o() != avk.j) continue;
                        int n8 = afs2.e(n2 + i2, n3 + i3, n4 + i4);
                        afs2.a(n2 + i2, n3 + i3, n4 + i4, n8 | 8, 4);
                    }
                }
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.E) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        if ((n5 & 8) != 0 && (n5 & 4) == 0) {
            int n6;
            int n7 = 4;
            int n8 = n7 + 1;
            int n9 = 32;
            int n10 = n9 * n9;
            int n11 = n9 / 2;
            if (this.a == null) {
                this.a = new int[n9 * n9 * n9];
            }
            if (afs2.b(n2 - n8, n3 - n8, n4 - n8, n2 + n8, n3 + n8, n4 + n8)) {
                int n12;
                int n13;
                for (n6 = -n7; n6 <= n7; ++n6) {
                    for (n13 = -n7; n13 <= n7; ++n13) {
                        for (n12 = -n7; n12 <= n7; ++n12) {
                            ahz ahz2 = afs2.a(n2 + n6, n3 + n13, n4 + n12);
                            this.a[(n6 + n11) * n10 + (n13 + n11) * n9 + (n12 + n11)] = ahz2 == aie.r || ahz2 == aie.s ? 0 : (ahz2.o() == avk.j ? -2 : -1);
                        }
                    }
                }
                for (n6 = 1; n6 <= 4; ++n6) {
                    for (n13 = -n7; n13 <= n7; ++n13) {
                        for (n12 = -n7; n12 <= n7; ++n12) {
                            for (int i2 = -n7; i2 <= n7; ++i2) {
                                if (this.a[(n13 + n11) * n10 + (n12 + n11) * n9 + (i2 + n11)] != n6 - 1) continue;
                                if (this.a[(n13 + n11 - 1) * n10 + (n12 + n11) * n9 + (i2 + n11)] == -2) {
                                    this.a[(n13 + n11 - 1) * n10 + (n12 + n11) * n9 + (i2 + n11)] = n6;
                                }
                                if (this.a[(n13 + n11 + 1) * n10 + (n12 + n11) * n9 + (i2 + n11)] == -2) {
                                    this.a[(n13 + n11 + 1) * n10 + (n12 + n11) * n9 + (i2 + n11)] = n6;
                                }
                                if (this.a[(n13 + n11) * n10 + (n12 + n11 - 1) * n9 + (i2 + n11)] == -2) {
                                    this.a[(n13 + n11) * n10 + (n12 + n11 - 1) * n9 + (i2 + n11)] = n6;
                                }
                                if (this.a[(n13 + n11) * n10 + (n12 + n11 + 1) * n9 + (i2 + n11)] == -2) {
                                    this.a[(n13 + n11) * n10 + (n12 + n11 + 1) * n9 + (i2 + n11)] = n6;
                                }
                                if (this.a[(n13 + n11) * n10 + (n12 + n11) * n9 + (i2 + n11 - 1)] == -2) {
                                    this.a[(n13 + n11) * n10 + (n12 + n11) * n9 + (i2 + n11 - 1)] = n6;
                                }
                                if (this.a[(n13 + n11) * n10 + (n12 + n11) * n9 + (i2 + n11 + 1)] != -2) continue;
                                this.a[(n13 + n11) * n10 + (n12 + n11) * n9 + (i2 + n11 + 1)] = n6;
                            }
                        }
                    }
                }
            }
            if ((n6 = this.a[n11 * n10 + n11 * n9 + n11]) >= 0) {
                afs2.a(n2, n3, n4, n5 & 0xFFFFFFF7, 4);
            } else {
                this.e(afs2, n2, n3, n4);
            }
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.y(n2, n3 + 1, n4) && !afs.a(afs2, n2, n3 - 1, n4) && random.nextInt(15) == 1) {
            double d2 = (float)n2 + random.nextFloat();
            double d3 = (double)n3 - 0.05;
            double d4 = (float)n4 + random.nextFloat();
            afs2.a("dripWater", d2, d3, d4, 0.0, 0.0, 0.0);
        }
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
        afs2.f(n2, n3, n4);
    }

    @Override
    public int a(Random random) {
        return random.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(aie.g);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        if (!afs2.E) {
            int n7 = this.b(n5);
            if (n6 > 0 && (n7 -= 2 << n6) < 10) {
                n7 = 10;
            }
            if (afs2.s.nextInt(n7) == 0) {
                abs abs2 = this.a(n5, afs2.s, n6);
                this.a(afs2, n2, n3, n4, new abu(abs2, 1, this.a(n5)));
            }
            n7 = 200;
            if (n6 > 0 && (n7 -= 10 << n6) < 40) {
                n7 = 40;
            }
            this.c(afs2, n2, n3, n4, n5, n7);
        }
    }

    protected void c(afs afs2, int n2, int n3, int n4, int n5, int n6) {
    }

    protected int b(int n2) {
        return 20;
    }

    @Override
    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        if (!afs2.E && xq2.bE() != null && xq2.bE().b() == abv.aZ) {
            xq2.a(og.C[ahz.b(this)], 1);
            this.a(afs2, n2, n3, n4, new abu(abs.a(this), 1, n5 & 3));
        } else {
            super.a(afs2, xq2, n2, n3, n4, n5);
        }
    }

    @Override
    public int a(int n2) {
        return n2 & 3;
    }

    @Override
    public boolean c() {
        return !this.P;
    }

    @Override
    public abstract pw a(int var1, int var2);

    public void b(boolean bl2) {
        this.P = bl2;
        this.b = bl2 ? 0 : 1;
    }

    @Override
    protected abu j(int n2) {
        return new abu(abs.a(this), 1, n2 & 3);
    }

    public abstract String[] e();
}

