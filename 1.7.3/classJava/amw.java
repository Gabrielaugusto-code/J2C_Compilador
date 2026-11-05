/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class amw
extends ahz {
    public amw() {
        super(avk.q);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.a(true);
    }

    @Override
    public int a(afs afs2) {
        return 10;
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
    public int w() {
        return 1;
    }

    @Override
    public int b() {
        return 30;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.F;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.F;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        boolean bl2;
        int n5 = afs2.e(n2, n3, n4);
        boolean bl3 = (n5 & 2) == 2;
        boolean bl4 = bl2 = !afs.a(afs2, n2, n3 - 1, n4);
        if (bl3 != bl2) {
            this.b(afs2, n2, n3, n4, n5, 0);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        boolean bl2;
        int n5 = agc2.e(n2, n3, n4);
        boolean bl3 = (n5 & 4) == 4;
        boolean bl4 = bl2 = (n5 & 2) == 2;
        if (!bl2) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
        } else if (!bl3) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        } else {
            this.a(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        int n5 = afs.a(afs2, n2, n3 - 1, n4) ? 0 : 2;
        afs2.a(n2, n3, n4, n5, 3);
        this.a(afs2, n2, n3, n4, n5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        this.a(afs2, n2, n3, n4, n5 | 1);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        if (afs2.E) {
            return;
        }
        if (xq2.bE() != null && xq2.bE().b() == abv.aZ) {
            afs2.a(n2, n3, n4, n5 | 8, 4);
        }
    }

    private void a(afs afs2, int n2, int n3, int n4, int n5) {
        block0: for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = 1; i3 < 42; ++i3) {
                int n6 = n2 + p.a[i2] * i3;
                int n7 = n4 + p.b[i2] * i3;
                ahz ahz2 = afs2.a(n6, n3, n7);
                if (ahz2 == aie.bC) {
                    int n8 = afs2.e(n6, n3, n7) & 3;
                    if (n8 != p.f[i2]) continue block0;
                    aie.bC.a(afs2, n6, n3, n7, false, afs2.e(n6, n3, n7), true, i3, n5);
                    continue block0;
                }
                if (ahz2 != aie.bD) continue block0;
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        if (afs2.E) {
            return;
        }
        if ((afs2.e(n2, n3, n4) & 1) == 1) {
            return;
        }
        this.e(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.E) {
            return;
        }
        if ((afs2.e(n2, n3, n4) & 1) != 1) {
            return;
        }
        this.e(afs2, n2, n3, n4);
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        boolean bl2 = (n5 & 1) == 1;
        boolean bl3 = false;
        List list = afs2.b(null, ayk.a().a((double)n2 + this.B, (double)n3 + this.C, (double)n4 + this.D, (double)n2 + this.E, (double)n3 + this.F, (double)n4 + this.G));
        if (!list.isEmpty()) {
            for (qr qr2 : list) {
                if (qr2.ay()) continue;
                bl3 = true;
                break;
            }
        }
        if (bl3 && !bl2) {
            n5 |= 1;
        }
        if (!bl3 && bl2) {
            n5 &= 0xFFFFFFFE;
        }
        if (bl3 != bl2) {
            afs2.a(n2, n3, n4, n5, 3);
            this.a(afs2, n2, n3, n4, n5);
        }
        if (bl3) {
            afs2.a(n2, n3, n4, this, this.a(afs2));
        }
    }

    public static boolean a(agc agc2, int n2, int n3, int n4, int n5, int n6) {
        boolean bl2;
        int n7 = n2 + p.a[n6];
        int n8 = n3;
        int n9 = n4 + p.b[n6];
        ahz ahz2 = agc2.a(n7, n8, n9);
        boolean bl3 = bl2 = (n5 & 2) == 2;
        if (ahz2 == aie.bC) {
            int n10 = agc2.e(n7, n8, n9);
            int n11 = n10 & 3;
            return n11 == p.f[n6];
        }
        if (ahz2 == aie.bD) {
            int n12 = agc2.e(n7, n8, n9);
            boolean bl4 = (n12 & 2) == 2;
            return bl2 == bl4;
        }
        return false;
    }
}

