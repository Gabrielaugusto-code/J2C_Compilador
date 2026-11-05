/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class alg
extends akb {
    public static final int[][] a = new int[][]{new int[0], {3, 1}, {2, 0}};

    public alg() {
        super("portal", avk.E, false);
        this.a(true);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        super.a(afs2, n2, n3, n4, random);
        if (afs2.t.d() && afs2.O().b("doMobSpawning") && random.nextInt(2000) < afs2.r.a()) {
            qr qr2;
            int n5;
            for (n5 = n3; !afs.a(afs2, n2, n5, n4) && n5 > 0; --n5) {
            }
            if (n5 > 0 && !afs2.a(n2, n5 + 1, n4).r() && (qr2 = acv.a(afs2, 57, (double)n2 + 0.5, (double)n5 + 1.1, (double)n4 + 0.5)) != null) {
                qr2.am = qr2.ah();
            }
        }
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = alg.b(agc2.e(n2, n3, n4));
        if (n5 == 0) {
            n5 = agc2.a(n2 - 1, n3, n4) == this || agc2.a(n2 + 1, n3, n4) == this ? 1 : 2;
            if (agc2 instanceof afs && !((afs)agc2).E) {
                ((afs)agc2).a(n2, n3, n4, n5, 2);
            }
        }
        float f2 = 0.125f;
        float f3 = 0.125f;
        if (n5 == 1) {
            f2 = 0.5f;
        }
        if (n5 == 2) {
            f3 = 0.5f;
        }
        this.a(0.5f - f2, 0.0f, 0.5f - f3, 0.5f + f2, 1.0f, 0.5f + f3);
    }

    @Override
    public boolean d() {
        return false;
    }

    public boolean e(afs afs2, int n2, int n3, int n4) {
        alh alh2 = new alh(afs2, n2, n3, n4, 1);
        alh alh3 = new alh(afs2, n2, n3, n4, 2);
        if (alh2.b() && alh.a(alh2) == 0) {
            alh2.c();
            return true;
        }
        if (alh3.b() && alh.a(alh3) == 0) {
            alh3.c();
            return true;
        }
        return false;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        int n5 = alg.b(afs2.e(n2, n3, n4));
        alh alh2 = new alh(afs2, n2, n3, n4, 1);
        alh alh3 = new alh(afs2, n2, n3, n4, 2);
        if (!(n5 != 1 || alh2.b() && alh.a(alh2) >= alh.b(alh2) * alh.c(alh2))) {
            afs2.b(n2, n3, n4, aie.a);
        } else if (!(n5 != 2 || alh3.b() && alh.a(alh3) >= alh.b(alh3) * alh.c(alh3))) {
            afs2.b(n2, n3, n4, aie.a);
        } else if (n5 == 0 && !alh2.b() && !alh3.b()) {
            afs2.b(n2, n3, n4, aie.a);
        }
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        boolean bl2;
        int n6 = 0;
        if (agc2.a(n2, n3, n4) == this) {
            n6 = alg.b(agc2.e(n2, n3, n4));
            if (n6 == 0) {
                return false;
            }
            if (n6 == 2 && n5 != 5 && n5 != 4) {
                return false;
            }
            if (n6 == 1 && n5 != 3 && n5 != 2) {
                return false;
            }
        }
        boolean bl3 = agc2.a(n2 - 1, n3, n4) == this && agc2.a(n2 - 2, n3, n4) != this;
        boolean bl4 = agc2.a(n2 + 1, n3, n4) == this && agc2.a(n2 + 2, n3, n4) != this;
        boolean bl5 = agc2.a(n2, n3, n4 - 1) == this && agc2.a(n2, n3, n4 - 2) != this;
        boolean bl6 = agc2.a(n2, n3, n4 + 1) == this && agc2.a(n2, n3, n4 + 2) != this;
        boolean bl7 = bl3 || bl4 || n6 == 1;
        boolean bl8 = bl2 = bl5 || bl6 || n6 == 2;
        if (bl7 && n5 == 4) {
            return true;
        }
        if (bl7 && n5 == 5) {
            return true;
        }
        if (bl2 && n5 == 2) {
            return true;
        }
        return bl2 && n5 == 3;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int w() {
        return 1;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        if (qr2.m == null && qr2.l == null) {
            qr2.ag();
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        if (random.nextInt(100) == 0) {
            afs2.a((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "portal.portal", 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            double d2 = (float)n2 + random.nextFloat();
            double d3 = (float)n3 + random.nextFloat();
            double d4 = (float)n4 + random.nextFloat();
            double d5 = 0.0;
            double d6 = 0.0;
            double d7 = 0.0;
            int n5 = random.nextInt(2) * 2 - 1;
            d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            d7 = ((double)random.nextFloat() - 0.5) * 0.5;
            if (afs2.a(n2 - 1, n3, n4) == this || afs2.a(n2 + 1, n3, n4) == this) {
                d4 = (double)n4 + 0.5 + 0.25 * (double)n5;
                d7 = random.nextFloat() * 2.0f * (float)n5;
            } else {
                d2 = (double)n2 + 0.5 + 0.25 * (double)n5;
                d5 = random.nextFloat() * 2.0f * (float)n5;
            }
            afs2.a("portal", d2, d3, d4, d5, d6, d7);
        }
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.d(0);
    }

    public static int b(int n2) {
        return n2 & 3;
    }
}

