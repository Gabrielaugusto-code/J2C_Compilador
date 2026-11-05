/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class akn
extends ahz {
    private pw[] a;

    protected akn(avk avk2) {
        super(avk2);
        float f2 = 0.0f;
        float f3 = 0.0f;
        this.a(0.0f + f3, 0.0f + f2, 0.0f + f3, 1.0f + f3, 1.0f + f2, 1.0f + f3);
        this.a(true);
    }

    @Override
    public boolean b(agc agc2, int n2, int n3, int n4) {
        return this.J != avk.i;
    }

    @Override
    public int D() {
        return 0xFFFFFF;
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        if (this.J == avk.h) {
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            for (int i2 = -1; i2 <= 1; ++i2) {
                for (int i3 = -1; i3 <= 1; ++i3) {
                    int n8 = agc2.a((int)(n2 + i3), (int)(n4 + i2)).aq;
                    n5 += (n8 & 0xFF0000) >> 16;
                    n6 += (n8 & 0xFF00) >> 8;
                    n7 += n8 & 0xFF;
                }
            }
            return (n5 / 9 & 0xFF) << 16 | (n6 / 9 & 0xFF) << 8 | n7 / 9 & 0xFF;
        }
        return 0xFFFFFF;
    }

    public static float b(int n2) {
        if (n2 >= 8) {
            n2 = 0;
        }
        return (float)(n2 + 1) / 9.0f;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 0 || n2 == 1) {
            return this.a[0];
        }
        return this.a[1];
    }

    protected int e(afs afs2, int n2, int n3, int n4) {
        if (afs2.a(n2, n3, n4).o() == this.J) {
            return afs2.e(n2, n3, n4);
        }
        return -1;
    }

    protected int e(agc agc2, int n2, int n3, int n4) {
        if (agc2.a(n2, n3, n4).o() != this.J) {
            return -1;
        }
        int n5 = agc2.e(n2, n3, n4);
        if (n5 >= 8) {
            n5 = 0;
        }
        return n5;
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
    public boolean a(int n2, boolean bl2) {
        return bl2 && n2 == 0;
    }

    @Override
    public boolean d(agc agc2, int n2, int n3, int n4, int n5) {
        avk avk2 = agc2.a(n2, n3, n4).o();
        if (avk2 == this.J) {
            return false;
        }
        if (n5 == 1) {
            return true;
        }
        if (avk2 == avk.w) {
            return false;
        }
        return super.d(agc2, n2, n3, n4, n5);
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        avk avk2 = agc2.a(n2, n3, n4).o();
        if (avk2 == this.J) {
            return false;
        }
        if (n5 == 1) {
            return true;
        }
        return super.a(agc2, n2, n3, n4, n5);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public int b() {
        return 4;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    private ayp f(agc agc2, int n2, int n3, int n4) {
        int n5;
        ayp ayp2 = agc2.V().a(0.0, 0.0, 0.0);
        int n6 = this.e(agc2, n2, n3, n4);
        for (n5 = 0; n5 < 4; ++n5) {
            int n7;
            int n8;
            int n9 = n2;
            int n10 = n3;
            int n11 = n4;
            if (n5 == 0) {
                --n9;
            }
            if (n5 == 1) {
                --n11;
            }
            if (n5 == 2) {
                ++n9;
            }
            if (n5 == 3) {
                ++n11;
            }
            if ((n8 = this.e(agc2, n9, n10, n11)) < 0) {
                if (agc2.a(n9, n10, n11).o().c() || (n8 = this.e(agc2, n9, n10 - 1, n11)) < 0) continue;
                n7 = n8 - (n6 - 8);
                ayp2 = ayp2.c((n9 - n2) * n7, (n10 - n3) * n7, (n11 - n4) * n7);
                continue;
            }
            if (n8 < 0) continue;
            n7 = n8 - n6;
            ayp2 = ayp2.c((n9 - n2) * n7, (n10 - n3) * n7, (n11 - n4) * n7);
        }
        if (agc2.e(n2, n3, n4) >= 8) {
            n5 = 0;
            if (n5 != 0 || this.d(agc2, n2, n3, n4 - 1, 2)) {
                n5 = 1;
            }
            if (n5 != 0 || this.d(agc2, n2, n3, n4 + 1, 3)) {
                n5 = 1;
            }
            if (n5 != 0 || this.d(agc2, n2 - 1, n3, n4, 4)) {
                n5 = 1;
            }
            if (n5 != 0 || this.d(agc2, n2 + 1, n3, n4, 5)) {
                n5 = 1;
            }
            if (n5 != 0 || this.d(agc2, n2, n3 + 1, n4 - 1, 2)) {
                n5 = 1;
            }
            if (n5 != 0 || this.d(agc2, n2, n3 + 1, n4 + 1, 3)) {
                n5 = 1;
            }
            if (n5 != 0 || this.d(agc2, n2 - 1, n3 + 1, n4, 4)) {
                n5 = 1;
            }
            if (n5 != 0 || this.d(agc2, n2 + 1, n3 + 1, n4, 5)) {
                n5 = 1;
            }
            if (n5 != 0) {
                ayp2 = ayp2.a().c(0.0, -6.0, 0.0);
            }
        }
        ayp2 = ayp2.a();
        return ayp2;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2, ayp ayp2) {
        ayp ayp3 = this.f((agc)afs2, n2, n3, n4);
        ayp2.c += ayp3.c;
        ayp2.d += ayp3.d;
        ayp2.e += ayp3.e;
    }

    @Override
    public int a(afs afs2) {
        if (this.J == avk.h) {
            return 5;
        }
        if (this.J == avk.i) {
            if (afs2.t.g) {
                return 10;
            }
            return 30;
        }
        return 0;
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.c(n2, n3, n4, 0);
        int n6 = agc2.c(n2, n3 + 1, n4, 0);
        int n7 = n5 & 0xFF;
        int n8 = n6 & 0xFF;
        int n9 = n5 >> 16 & 0xFF;
        int n10 = n6 >> 16 & 0xFF;
        return (n7 > n8 ? n7 : n8) | (n9 > n10 ? n9 : n10) << 16;
    }

    @Override
    public int w() {
        return this.J == avk.h ? 1 : 0;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        int n5;
        if (this.J == avk.h) {
            if (random.nextInt(10) == 0 && ((n5 = afs2.e(n2, n3, n4)) <= 0 || n5 >= 8)) {
                afs2.a("suspended", (double)((float)n2 + random.nextFloat()), (double)((float)n3 + random.nextFloat()), (double)((float)n4 + random.nextFloat()), 0.0, 0.0, 0.0);
            }
            for (n5 = 0; n5 < 0; ++n5) {
                int n6 = random.nextInt(4);
                int n7 = n2;
                int n8 = n4;
                if (n6 == 0) {
                    --n7;
                }
                if (n6 == 1) {
                    ++n7;
                }
                if (n6 == 2) {
                    --n8;
                }
                if (n6 == 3) {
                    ++n8;
                }
                if (afs2.a(n7, n3, n8).o() != avk.a || !afs2.a(n7, n3 - 1, n8).o().c() && !afs2.a(n7, n3 - 1, n8).o().d()) continue;
                float f2 = 0.0625f;
                double d2 = (float)n2 + random.nextFloat();
                double d3 = (float)n3 + random.nextFloat();
                double d4 = (float)n4 + random.nextFloat();
                if (n6 == 0) {
                    d2 = (float)n2 - f2;
                }
                if (n6 == 1) {
                    d2 = (float)(n2 + 1) + f2;
                }
                if (n6 == 2) {
                    d4 = (float)n4 - f2;
                }
                if (n6 == 3) {
                    d4 = (float)(n4 + 1) + f2;
                }
                double d5 = 0.0;
                double d6 = 0.0;
                if (n6 == 0) {
                    d5 = -f2;
                }
                if (n6 == 1) {
                    d5 = f2;
                }
                if (n6 == 2) {
                    d6 = -f2;
                }
                if (n6 == 3) {
                    d6 = f2;
                }
                afs2.a("splash", d2, d3, d4, d5, 0.0, d6);
            }
        }
        if (this.J == avk.h && random.nextInt(64) == 0 && (n5 = afs2.e(n2, n3, n4)) > 0 && n5 < 8) {
            afs2.a((double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "liquid.water", random.nextFloat() * 0.25f + 0.75f, random.nextFloat() * 1.0f + 0.5f, false);
        }
        if (this.J == avk.i && afs2.a(n2, n3 + 1, n4).o() == avk.a && !afs2.a(n2, n3 + 1, n4).c()) {
            if (random.nextInt(100) == 0) {
                double d7 = (float)n2 + random.nextFloat();
                double d8 = (double)n3 + this.F;
                double d9 = (float)n4 + random.nextFloat();
                afs2.a("lava", d7, d8, d9, 0.0, 0.0, 0.0);
                afs2.a(d7, d8, d9, "liquid.lavapop", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                afs2.a((double)n2, (double)n3, (double)n4, "liquid.lava", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        if (random.nextInt(10) == 0 && afs.a(afs2, n2, n3 - 1, n4) && !afs2.a(n2, n3 - 2, n4).o().c()) {
            double d10 = (float)n2 + random.nextFloat();
            double d11 = (double)n3 - 1.05;
            double d12 = (float)n4 + random.nextFloat();
            if (this.J == avk.h) {
                afs2.a("dripWater", d10, d11, d12, 0.0, 0.0, 0.0);
            } else {
                afs2.a("dripLava", d10, d11, d12, 0.0, 0.0, 0.0);
            }
        }
    }

    public static double a(agc agc2, int n2, int n3, int n4, avk avk2) {
        ayp ayp2 = null;
        if (avk2 == avk.h) {
            ayp2 = aie.i.f(agc2, n2, n3, n4);
        }
        if (avk2 == avk.i) {
            ayp2 = aie.k.f(agc2, n2, n3, n4);
        }
        if (ayp2.c == 0.0 && ayp2.e == 0.0) {
            return -1000.0;
        }
        return Math.atan2(ayp2.e, ayp2.c) - 1.5707963267948966;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        this.n(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        this.n(afs2, n2, n3, n4);
    }

    private void n(afs afs2, int n2, int n3, int n4) {
        if (afs2.a(n2, n3, n4) != this) {
            return;
        }
        if (this.J == avk.i) {
            boolean bl2 = false;
            if (bl2 || afs2.a(n2, n3, n4 - 1).o() == avk.h) {
                bl2 = true;
            }
            if (bl2 || afs2.a(n2, n3, n4 + 1).o() == avk.h) {
                bl2 = true;
            }
            if (bl2 || afs2.a(n2 - 1, n3, n4).o() == avk.h) {
                bl2 = true;
            }
            if (bl2 || afs2.a(n2 + 1, n3, n4).o() == avk.h) {
                bl2 = true;
            }
            if (bl2 || afs2.a(n2, n3 + 1, n4).o() == avk.h) {
                bl2 = true;
            }
            if (bl2) {
                int n5 = afs2.e(n2, n3, n4);
                if (n5 == 0) {
                    afs2.b(n2, n3, n4, aie.Z);
                } else if (n5 <= 4) {
                    afs2.b(n2, n3, n4, aie.e);
                }
                this.m(afs2, n2, n3, n4);
            }
        }
    }

    protected void m(afs afs2, int n2, int n3, int n4) {
        afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.fizz", 0.5f, 2.6f + (afs2.s.nextFloat() - afs2.s.nextFloat()) * 0.8f);
        for (int i2 = 0; i2 < 8; ++i2) {
            afs2.a("largesmoke", (double)n2 + Math.random(), (double)n3 + 1.2, (double)n4 + Math.random(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void a(px px2) {
        this.a = this.J == avk.i ? new pw[]{px2.a("lava_still"), px2.a("lava_flow")} : new pw[]{px2.a("water_still"), px2.a("water_flow")};
    }

    public static pw e(String string) {
        if (string == "water_still") {
            return aie.i.a[0];
        }
        if (string == "water_flow") {
            return aie.i.a[1];
        }
        if (string == "lava_still") {
            return aie.k.a[0];
        }
        if (string == "lava_flow") {
            return aie.k.a[1];
        }
        return null;
    }
}

