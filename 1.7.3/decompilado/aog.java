/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aog
extends ahz {
    private final boolean a;
    private pw b;
    private pw M;
    private pw N;

    public aog(boolean bl2) {
        super(avk.H);
        this.a = bl2;
        this.a(i);
        this.c(0.5f);
        this.a(aak.d);
    }

    public pw e() {
        return this.N;
    }

    public void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7);
    }

    @Override
    public pw a(int n2, int n3) {
        int n4 = aog.b(n3);
        if (n4 > 5) {
            return this.N;
        }
        if (n2 == n4) {
            if (aog.c(n3) || this.B > 0.0 || this.C > 0.0 || this.D > 0.0 || this.E < 1.0 || this.F < 1.0 || this.G < 1.0) {
                return this.b;
            }
            return this.N;
        }
        if (n2 == q.a[n4]) {
            return this.M;
        }
        return this.L;
    }

    public static pw e(String string) {
        if (string == "piston_side") {
            return aie.J.L;
        }
        if (string == "piston_top_normal") {
            return aie.J.N;
        }
        if (string == "piston_top_sticky") {
            return aie.F.N;
        }
        if (string == "piston_inner") {
            return aie.J.b;
        }
        return null;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("piston_side");
        this.N = px2.a(this.a ? "piston_top_sticky" : "piston_top_normal");
        this.b = px2.a("piston_inner");
        this.M = px2.a("piston_bottom");
    }

    @Override
    public int b() {
        return 16;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        return false;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = aog.a(afs2, n2, n3, n4, rm2);
        afs2.a(n2, n3, n4, n5, 2);
        if (!afs2.E) {
            this.e(afs2, n2, n3, n4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!afs2.E) {
            this.e(afs2, n2, n3, n4);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        if (!afs2.E && afs2.o(n2, n3, n4) == null) {
            this.e(afs2, n2, n3, n4);
        }
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        int n6 = aog.b(n5);
        if (n6 == 7) {
            return;
        }
        boolean bl2 = this.a(afs2, n2, n3, n4, n6);
        if (bl2 && !aog.c(n5)) {
            if (aog.h(afs2, n2, n3, n4, n6)) {
                afs2.c(n2, n3, n4, this, 0, n6);
            }
        } else if (!bl2 && aog.c(n5)) {
            afs2.a(n2, n3, n4, n6, 2);
            afs2.c(n2, n3, n4, this, 1, n6);
        }
    }

    private boolean a(afs afs2, int n2, int n3, int n4, int n5) {
        if (n5 != 0 && afs2.f(n2, n3 - 1, n4, 0)) {
            return true;
        }
        if (n5 != 1 && afs2.f(n2, n3 + 1, n4, 1)) {
            return true;
        }
        if (n5 != 2 && afs2.f(n2, n3, n4 - 1, 2)) {
            return true;
        }
        if (n5 != 3 && afs2.f(n2, n3, n4 + 1, 3)) {
            return true;
        }
        if (n5 != 5 && afs2.f(n2 + 1, n3, n4, 5)) {
            return true;
        }
        if (n5 != 4 && afs2.f(n2 - 1, n3, n4, 4)) {
            return true;
        }
        if (afs2.f(n2, n3, n4, 0)) {
            return true;
        }
        if (afs2.f(n2, n3 + 2, n4, 1)) {
            return true;
        }
        if (afs2.f(n2, n3 + 1, n4 - 1, 2)) {
            return true;
        }
        if (afs2.f(n2, n3 + 1, n4 + 1, 3)) {
            return true;
        }
        if (afs2.f(n2 - 1, n3 + 1, n4, 4)) {
            return true;
        }
        return afs2.f(n2 + 1, n3 + 1, n4, 5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        if (!afs2.E) {
            boolean bl2 = this.a(afs2, n2, n3, n4, n6);
            if (bl2 && n5 == 1) {
                afs2.a(n2, n3, n4, n6 | 8, 2);
                return false;
            }
            if (!bl2 && n5 == 0) {
                return false;
            }
        }
        if (n5 == 0) {
            if (!this.i(afs2, n2, n3, n4, n6)) return false;
            afs2.a(n2, n3, n4, n6 | 8, 2);
            afs2.a((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "tile.piston.out", 0.5f, afs2.s.nextFloat() * 0.25f + 0.6f);
            return true;
        } else {
            if (n5 != 1) return true;
            ani ani2 = afs2.o(n2 + q.b[n6], n3 + q.c[n6], n4 + q.d[n6]);
            if (ani2 instanceof aoj) {
                ((aoj)ani2).f();
            }
            afs2.d(n2, n3, n4, aie.M, n6, 3);
            afs2.a(n2, n3, n4, aoi.a(this, n6, n6, false, true));
            if (this.a) {
                aoj aoj2;
                ani ani3;
                int n7 = n2 + q.b[n6] * 2;
                int n8 = n3 + q.c[n6] * 2;
                int n9 = n4 + q.d[n6] * 2;
                ahz ahz2 = afs2.a(n7, n8, n9);
                int n10 = afs2.e(n7, n8, n9);
                boolean bl3 = false;
                if (ahz2 == aie.M && (ani3 = afs2.o(n7, n8, n9)) instanceof aoj && (aoj2 = (aoj)ani3).c() == n6 && aoj2.b()) {
                    aoj2.f();
                    ahz2 = aoj2.a();
                    n10 = aoj2.p();
                    bl3 = true;
                }
                if (!bl3 && ahz2.o() != avk.a && aog.a(ahz2, afs2, n7, n8, n9, false) && (ahz2.h() == 0 || ahz2 == aie.J || ahz2 == aie.F)) {
                    afs2.d(n2 += q.b[n6], n3 += q.c[n6], n4 += q.d[n6], aie.M, n10, 3);
                    afs2.a(n2, n3, n4, aoi.a(ahz2, n10, n6, false, false));
                    afs2.f(n7, n8, n9);
                } else if (!bl3) {
                    afs2.f(n2 + q.b[n6], n3 + q.c[n6], n4 + q.d[n6]);
                }
            } else {
                afs2.f(n2 + q.b[n6], n3 + q.c[n6], n4 + q.d[n6]);
            }
            afs2.a((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "tile.piston.in", 0.5f, afs2.s.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        if (aog.c(n5)) {
            float f2 = 0.25f;
            switch (aog.b(n5)) {
                case 0: {
                    this.a(0.0f, 0.25f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 1: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
                    break;
                }
                case 2: {
                    this.a(0.0f, 0.0f, 0.25f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 3: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.75f);
                    break;
                }
                case 4: {
                    this.a(0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 5: {
                    this.a(0.0f, 0.0f, 0.0f, 0.75f, 1.0f, 1.0f);
                }
            }
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void g() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        return super.a(afs2, n2, n3, n4);
    }

    @Override
    public boolean d() {
        return false;
    }

    public static int b(int n2) {
        return n2 & 7;
    }

    public static boolean c(int n2) {
        return (n2 & 8) != 0;
    }

    public static int a(afs afs2, int n2, int n3, int n4, rm rm2) {
        int n5;
        if (oy.e((float)rm2.s - (float)n2) < 2.0f && oy.e((float)rm2.u - (float)n4) < 2.0f) {
            double d2 = rm2.t + 1.82 - (double)rm2.L;
            if (d2 - (double)n3 > 2.0) {
                return 1;
            }
            if ((double)n3 - d2 > 0.0) {
                return 0;
            }
        }
        if ((n5 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3) == 0) {
            return 2;
        }
        if (n5 == 1) {
            return 5;
        }
        if (n5 == 2) {
            return 3;
        }
        if (n5 == 3) {
            return 4;
        }
        return 0;
    }

    private static boolean a(ahz ahz2, afs afs2, int n2, int n3, int n4, boolean bl2) {
        if (ahz2 == aie.Z) {
            return false;
        }
        if (ahz2 == aie.J || ahz2 == aie.F) {
            if (aog.c(afs2.e(n2, n3, n4))) {
                return false;
            }
        } else {
            if (ahz2.f(afs2, n2, n3, n4) == -1.0f) {
                return false;
            }
            if (ahz2.h() == 2) {
                return false;
            }
            if (ahz2.h() == 1) {
                return bl2;
            }
        }
        return !(ahz2 instanceof ajn);
    }

    private static boolean h(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = n2 + q.b[n5];
        int n7 = n3 + q.c[n5];
        int n8 = n4 + q.d[n5];
        for (int i2 = 0; i2 < 13; ++i2) {
            if (n7 <= 0 || n7 >= 255) {
                return false;
            }
            ahz ahz2 = afs2.a(n6, n7, n8);
            if (ahz2.o() == avk.a) break;
            if (!aog.a(ahz2, afs2, n6, n7, n8, true)) {
                return false;
            }
            if (ahz2.h() == 1) break;
            if (i2 == 12) {
                return false;
            }
            n6 += q.b[n5];
            n7 += q.c[n5];
            n8 += q.d[n5];
        }
        return true;
    }

    private boolean i(afs afs2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = n2 + q.b[n5];
        int n11 = n3 + q.c[n5];
        int n12 = n4 + q.d[n5];
        for (n9 = 0; n9 < 13; ++n9) {
            if (n11 <= 0 || n11 >= 255) {
                return false;
            }
            ahz ahz2 = afs2.a(n10, n11, n12);
            if (ahz2.o() == avk.a) break;
            if (!aog.a(ahz2, afs2, n10, n11, n12, true)) {
                return false;
            }
            if (ahz2.h() == 1) {
                ahz2.b(afs2, n10, n11, n12, afs2.e(n10, n11, n12), 0);
                afs2.f(n10, n11, n12);
                break;
            }
            if (n9 == 12) {
                return false;
            }
            n10 += q.b[n5];
            n11 += q.c[n5];
            n12 += q.d[n5];
        }
        n9 = n10;
        int n13 = n11;
        int n14 = n12;
        int n15 = 0;
        ahz[] ahzArray = new ahz[13];
        while (n10 != n2 || n11 != n3 || n12 != n4) {
            n8 = n10 - q.b[n5];
            n7 = n11 - q.c[n5];
            n6 = n12 - q.d[n5];
            ahz ahz3 = afs2.a(n8, n7, n6);
            int n16 = afs2.e(n8, n7, n6);
            if (ahz3 == this && n8 == n2 && n7 == n3 && n6 == n4) {
                afs2.d(n10, n11, n12, aie.M, n5 | (this.a ? 8 : 0), 4);
                afs2.a(n10, n11, n12, aoi.a(aie.K, n5 | (this.a ? 8 : 0), n5, true, false));
            } else {
                afs2.d(n10, n11, n12, aie.M, n16, 4);
                afs2.a(n10, n11, n12, aoi.a(ahz3, n16, n5, true, false));
            }
            ahzArray[n15++] = ahz3;
            n10 = n8;
            n11 = n7;
            n12 = n6;
        }
        n10 = n9;
        n11 = n13;
        n12 = n14;
        n15 = 0;
        while (n10 != n2 || n11 != n3 || n12 != n4) {
            n8 = n10 - q.b[n5];
            n7 = n11 - q.c[n5];
            n6 = n12 - q.d[n5];
            afs2.d(n8, n7, n6, ahzArray[n15++]);
            n10 = n8;
            n11 = n7;
            n12 = n6;
        }
        return true;
    }
}

