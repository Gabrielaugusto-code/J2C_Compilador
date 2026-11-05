/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajs
extends ahz {
    private int[] a = new int[256];
    private int[] b = new int[256];
    private pw[] M;

    protected ajs() {
        super(avk.o);
        this.a(true);
    }

    public static void e() {
        aie.ab.a(ajs.b(aie.f), 5, 20);
        aie.ab.a(ajs.b(aie.bw), 5, 20);
        aie.ab.a(ajs.b(aie.bx), 5, 20);
        aie.ab.a(ajs.b(aie.aJ), 5, 20);
        aie.ab.a(ajs.b(aie.ad), 5, 20);
        aie.ab.a(ajs.b(aie.bG), 5, 20);
        aie.ab.a(ajs.b(aie.bF), 5, 20);
        aie.ab.a(ajs.b(aie.bH), 5, 20);
        aie.ab.a(ajs.b(aie.r), 5, 5);
        aie.ab.a(ajs.b(aie.s), 5, 5);
        aie.ab.a(ajs.b(aie.t), 30, 60);
        aie.ab.a(ajs.b(aie.u), 30, 60);
        aie.ab.a(ajs.b(aie.X), 30, 20);
        aie.ab.a(ajs.b(aie.W), 15, 100);
        aie.ab.a(ajs.b(aie.H), 60, 100);
        aie.ab.a(ajs.b(aie.cm), 60, 100);
        aie.ab.a(ajs.b(aie.N), 60, 100);
        aie.ab.a(ajs.b(aie.O), 60, 100);
        aie.ab.a(ajs.b(aie.L), 30, 60);
        aie.ab.a(ajs.b(aie.bd), 15, 100);
        aie.ab.a(ajs.b(aie.ci), 5, 5);
        aie.ab.a(ajs.b(aie.cf), 60, 20);
        aie.ab.a(ajs.b(aie.cg), 60, 20);
    }

    public void a(int n2, int n3, int n4) {
        this.a[n2] = n3;
        this.b[n2] = n4;
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
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
        return 3;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int a(afs afs2) {
        return 30;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        boolean bl2;
        if (!afs2.O().b("doFireTick")) {
            return;
        }
        boolean bl3 = bl2 = afs2.a(n2, n3 - 1, n4) == aie.aL;
        if (afs2.t instanceof api && afs2.a(n2, n3 - 1, n4) == aie.h) {
            bl2 = true;
        }
        if (!this.c(afs2, n2, n3, n4)) {
            afs2.f(n2, n3, n4);
        }
        if (!bl2 && afs2.Q() && (afs2.y(n2, n3, n4) || afs2.y(n2 - 1, n3, n4) || afs2.y(n2 + 1, n3, n4) || afs2.y(n2, n3, n4 - 1) || afs2.y(n2, n3, n4 + 1))) {
            afs2.f(n2, n3, n4);
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        if (n5 < 15) {
            afs2.a(n2, n3, n4, n5 + random.nextInt(3) / 2, 4);
        }
        afs2.a(n2, n3, n4, this, this.a(afs2) + random.nextInt(10));
        if (!bl2 && !this.e(afs2, n2, n3, n4)) {
            if (!afs.a(afs2, n2, n3 - 1, n4) || n5 > 3) {
                afs2.f(n2, n3, n4);
            }
            return;
        }
        if (!bl2 && !this.e((agc)afs2, n2, n3 - 1, n4) && n5 == 15 && random.nextInt(4) == 0) {
            afs2.f(n2, n3, n4);
            return;
        }
        boolean bl4 = afs2.z(n2, n3, n4);
        int n6 = 0;
        if (bl4) {
            n6 = -50;
        }
        this.a(afs2, n2 + 1, n3, n4, 300 + n6, random, n5);
        this.a(afs2, n2 - 1, n3, n4, 300 + n6, random, n5);
        this.a(afs2, n2, n3 - 1, n4, 250 + n6, random, n5);
        this.a(afs2, n2, n3 + 1, n4, 250 + n6, random, n5);
        this.a(afs2, n2, n3, n4 - 1, 300 + n6, random, n5);
        this.a(afs2, n2, n3, n4 + 1, 300 + n6, random, n5);
        for (int i2 = n2 - 1; i2 <= n2 + 1; ++i2) {
            for (int i3 = n4 - 1; i3 <= n4 + 1; ++i3) {
                for (int i4 = n3 - 1; i4 <= n3 + 4; ++i4) {
                    int n7;
                    if (i2 == n2 && i4 == n3 && i3 == n4) continue;
                    int n8 = 100;
                    if (i4 > n3 + 1) {
                        n8 += (i4 - (n3 + 1)) * 100;
                    }
                    if ((n7 = this.m(afs2, i2, i4, i3)) <= 0) continue;
                    int n9 = (n7 + 40 + afs2.r.a() * 7) / (n5 + 30);
                    if (bl4) {
                        n9 /= 2;
                    }
                    if (n9 <= 0 || random.nextInt(n8) > n9 || afs2.Q() && afs2.y(i2, i4, i3) || afs2.y(i2 - 1, i4, n4) || afs2.y(i2 + 1, i4, i3) || afs2.y(i2, i4, i3 - 1) || afs2.y(i2, i4, i3 + 1)) continue;
                    int n10 = n5 + random.nextInt(5) / 4;
                    if (n10 > 15) {
                        n10 = 15;
                    }
                    afs2.d(i2, i4, i3, this, n10, 3);
                }
            }
        }
    }

    @Override
    public boolean L() {
        return false;
    }

    private void a(afs afs2, int n2, int n3, int n4, int n5, Random random, int n6) {
        int n7 = this.b[ahz.b(afs2.a(n2, n3, n4))];
        if (random.nextInt(n5) < n7) {
            boolean bl2;
            boolean bl3 = bl2 = afs2.a(n2, n3, n4) == aie.W;
            if (random.nextInt(n6 + 10) < 5 && !afs2.y(n2, n3, n4)) {
                int n8 = n6 + random.nextInt(5) / 4;
                if (n8 > 15) {
                    n8 = 15;
                }
                afs2.d(n2, n3, n4, this, n8, 3);
            } else {
                afs2.f(n2, n3, n4);
            }
            if (bl2) {
                aie.W.b(afs2, n2, n3, n4, 1);
            }
        }
    }

    private boolean e(afs afs2, int n2, int n3, int n4) {
        if (this.e((agc)afs2, n2 + 1, n3, n4)) {
            return true;
        }
        if (this.e((agc)afs2, n2 - 1, n3, n4)) {
            return true;
        }
        if (this.e((agc)afs2, n2, n3 - 1, n4)) {
            return true;
        }
        if (this.e((agc)afs2, n2, n3 + 1, n4)) {
            return true;
        }
        if (this.e((agc)afs2, n2, n3, n4 - 1)) {
            return true;
        }
        return this.e((agc)afs2, n2, n3, n4 + 1);
    }

    private int m(afs afs2, int n2, int n3, int n4) {
        int n5 = 0;
        if (!afs2.c(n2, n3, n4)) {
            return 0;
        }
        n5 = this.a(afs2, n2 + 1, n3, n4, n5);
        n5 = this.a(afs2, n2 - 1, n3, n4, n5);
        n5 = this.a(afs2, n2, n3 - 1, n4, n5);
        n5 = this.a(afs2, n2, n3 + 1, n4, n5);
        n5 = this.a(afs2, n2, n3, n4 - 1, n5);
        n5 = this.a(afs2, n2, n3, n4 + 1, n5);
        return n5;
    }

    @Override
    public boolean v() {
        return false;
    }

    public boolean e(agc agc2, int n2, int n3, int n4) {
        return this.a[ahz.b(agc2.a(n2, n3, n4))] > 0;
    }

    public int a(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = this.a[ahz.b(afs2.a(n2, n3, n4))];
        if (n6 > n5) {
            return n6;
        }
        return n5;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return afs.a(afs2, n2, n3 - 1, n4) || this.e(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!afs.a(afs2, n2, n3 - 1, n4) && !this.e(afs2, n2, n3, n4)) {
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        if (afs2.t.i <= 0 && aie.aO.e(afs2, n2, n3, n4)) {
            return;
        }
        if (!afs.a(afs2, n2, n3 - 1, n4) && !this.e(afs2, n2, n3, n4)) {
            afs2.f(n2, n3, n4);
            return;
        }
        afs2.a(n2, n3, n4, this, this.a(afs2) + afs2.s.nextInt(10));
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        block12: {
            float f2;
            float f3;
            float f4;
            int n5;
            block11: {
                if (random.nextInt(24) == 0) {
                    afs2.a((double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "fire.fire", 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (!afs.a(afs2, n2, n3 - 1, n4) && !aie.ab.e((agc)afs2, n2, n3 - 1, n4)) break block11;
                for (int i2 = 0; i2 < 3; ++i2) {
                    float f5 = (float)n2 + random.nextFloat();
                    float f6 = (float)n3 + random.nextFloat() * 0.5f + 0.5f;
                    float f7 = (float)n4 + random.nextFloat();
                    afs2.a("largesmoke", (double)f5, (double)f6, (double)f7, 0.0, 0.0, 0.0);
                }
                break block12;
            }
            if (aie.ab.e((agc)afs2, n2 - 1, n3, n4)) {
                for (n5 = 0; n5 < 2; ++n5) {
                    f4 = (float)n2 + random.nextFloat() * 0.1f;
                    f3 = (float)n3 + random.nextFloat();
                    f2 = (float)n4 + random.nextFloat();
                    afs2.a("largesmoke", (double)f4, (double)f3, (double)f2, 0.0, 0.0, 0.0);
                }
            }
            if (aie.ab.e((agc)afs2, n2 + 1, n3, n4)) {
                for (n5 = 0; n5 < 2; ++n5) {
                    f4 = (float)(n2 + 1) - random.nextFloat() * 0.1f;
                    f3 = (float)n3 + random.nextFloat();
                    f2 = (float)n4 + random.nextFloat();
                    afs2.a("largesmoke", (double)f4, (double)f3, (double)f2, 0.0, 0.0, 0.0);
                }
            }
            if (aie.ab.e((agc)afs2, n2, n3, n4 - 1)) {
                for (n5 = 0; n5 < 2; ++n5) {
                    f4 = (float)n2 + random.nextFloat();
                    f3 = (float)n3 + random.nextFloat();
                    f2 = (float)n4 + random.nextFloat() * 0.1f;
                    afs2.a("largesmoke", (double)f4, (double)f3, (double)f2, 0.0, 0.0, 0.0);
                }
            }
            if (aie.ab.e((agc)afs2, n2, n3, n4 + 1)) {
                for (n5 = 0; n5 < 2; ++n5) {
                    f4 = (float)n2 + random.nextFloat();
                    f3 = (float)n3 + random.nextFloat();
                    f2 = (float)(n4 + 1) - random.nextFloat() * 0.1f;
                    afs2.a("largesmoke", (double)f4, (double)f3, (double)f2, 0.0, 0.0, 0.0);
                }
            }
            if (!aie.ab.e((agc)afs2, n2, n3 + 1, n4)) break block12;
            for (n5 = 0; n5 < 2; ++n5) {
                f4 = (float)n2 + random.nextFloat();
                f3 = (float)(n3 + 1) - random.nextFloat() * 0.1f;
                f2 = (float)n4 + random.nextFloat();
                afs2.a("largesmoke", (double)f4, (double)f3, (double)f2, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public void a(px px2) {
        this.M = new pw[]{px2.a(this.N() + "_layer_0"), px2.a(this.N() + "_layer_1")};
    }

    public pw c(int n2) {
        return this.M[n2];
    }

    @Override
    public pw a(int n2, int n3) {
        return this.M[0];
    }

    @Override
    public avm f(int n2) {
        return avm.f;
    }
}

