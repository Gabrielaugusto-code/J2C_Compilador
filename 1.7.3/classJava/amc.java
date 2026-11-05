/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class amc
extends aht {
    protected amc() {
        super(avk.q);
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }

    @Override
    public int b() {
        return -1;
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
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4) & 7;
        switch (n5) {
            default: {
                this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                break;
            }
            case 2: {
                this.a(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                break;
            }
            case 3: {
                this.a(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                break;
            }
            case 4: {
                this.a(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                break;
            }
            case 5: {
                this.a(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
            }
        }
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        return super.a(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 2.5) & 3;
        afs2.a(n2, n3, n4, n5, 2);
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new aoe();
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.bL;
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 != null && ani2 instanceof aoe) {
            return ((aoe)ani2).a();
        }
        return super.k(afs2, n2, n3, n4);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        if (xq2.bE.d) {
            afs2.a(n2, n3, n4, n5 |= 8, 4);
        }
        super.a(afs2, n2, n3, n4, n5, xq2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        if (afs2.E) {
            return;
        }
        if ((n5 & 8) == 0) {
            abu abu2 = new abu(abv.bL, 1, this.k(afs2, n2, n3, n4));
            aoe aoe2 = (aoe)afs2.o(n2, n3, n4);
            if (aoe2.a() == 3 && aoe2.c() != null && aoe2.c().length() > 0) {
                abu2.d(new dg());
                abu2.q().a("SkullOwner", aoe2.c());
            }
            this.a(afs2, n2, n3, n4, abu2);
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.bL;
    }

    public void a(afs afs2, int n2, int n3, int n4, aoe aoe2) {
        if (aoe2.a() == 1 && n3 >= 2 && afs2.r != pu.a && !afs2.E) {
            int n5;
            for (n5 = -2; n5 <= 0; ++n5) {
                if (afs2.a(n2, n3 - 1, n4 + n5) != aie.aM || afs2.a(n2, n3 - 1, n4 + n5 + 1) != aie.aM || afs2.a(n2, n3 - 2, n4 + n5 + 1) != aie.aM || afs2.a(n2, n3 - 1, n4 + n5 + 2) != aie.aM || !this.a(afs2, n2, n3, n4 + n5, 1) || !this.a(afs2, n2, n3, n4 + n5 + 1, 1) || !this.a(afs2, n2, n3, n4 + n5 + 2, 1)) continue;
                afs2.a(n2, n3, n4 + n5, 8, 2);
                afs2.a(n2, n3, n4 + n5 + 1, 8, 2);
                afs2.a(n2, n3, n4 + n5 + 2, 8, 2);
                afs2.d(n2, n3, n4 + n5, amc.e(0), 0, 2);
                afs2.d(n2, n3, n4 + n5 + 1, amc.e(0), 0, 2);
                afs2.d(n2, n3, n4 + n5 + 2, amc.e(0), 0, 2);
                afs2.d(n2, n3 - 1, n4 + n5, amc.e(0), 0, 2);
                afs2.d(n2, n3 - 1, n4 + n5 + 1, amc.e(0), 0, 2);
                afs2.d(n2, n3 - 1, n4 + n5 + 2, amc.e(0), 0, 2);
                afs2.d(n2, n3 - 2, n4 + n5 + 1, amc.e(0), 0, 2);
                if (!afs2.E) {
                    vt vt2 = new vt(afs2);
                    vt2.b((double)n2 + 0.5, (double)n3 - 1.45, (double)(n4 + n5) + 1.5, 90.0f, 0.0f);
                    vt2.aM = 90.0f;
                    vt2.bZ();
                    if (!afs2.E) {
                        for (xq xq2 : afs2.a(xq.class, vt2.C.b(50.0, 50.0, 50.0))) {
                            xq2.a(nt.I);
                        }
                    }
                    afs2.d(vt2);
                }
                for (int i2 = 0; i2 < 120; ++i2) {
                    afs2.a("snowballpoof", (double)n2 + afs2.s.nextDouble(), (double)(n3 - 2) + afs2.s.nextDouble() * 3.9, (double)(n4 + n5 + 1) + afs2.s.nextDouble(), 0.0, 0.0, 0.0);
                }
                afs2.c(n2, n3, n4 + n5, amc.e(0));
                afs2.c(n2, n3, n4 + n5 + 1, amc.e(0));
                afs2.c(n2, n3, n4 + n5 + 2, amc.e(0));
                afs2.c(n2, n3 - 1, n4 + n5, amc.e(0));
                afs2.c(n2, n3 - 1, n4 + n5 + 1, amc.e(0));
                afs2.c(n2, n3 - 1, n4 + n5 + 2, amc.e(0));
                afs2.c(n2, n3 - 2, n4 + n5 + 1, amc.e(0));
                return;
            }
            for (n5 = -2; n5 <= 0; ++n5) {
                if (afs2.a(n2 + n5, n3 - 1, n4) != aie.aM || afs2.a(n2 + n5 + 1, n3 - 1, n4) != aie.aM || afs2.a(n2 + n5 + 1, n3 - 2, n4) != aie.aM || afs2.a(n2 + n5 + 2, n3 - 1, n4) != aie.aM || !this.a(afs2, n2 + n5, n3, n4, 1) || !this.a(afs2, n2 + n5 + 1, n3, n4, 1) || !this.a(afs2, n2 + n5 + 2, n3, n4, 1)) continue;
                afs2.a(n2 + n5, n3, n4, 8, 2);
                afs2.a(n2 + n5 + 1, n3, n4, 8, 2);
                afs2.a(n2 + n5 + 2, n3, n4, 8, 2);
                afs2.d(n2 + n5, n3, n4, amc.e(0), 0, 2);
                afs2.d(n2 + n5 + 1, n3, n4, amc.e(0), 0, 2);
                afs2.d(n2 + n5 + 2, n3, n4, amc.e(0), 0, 2);
                afs2.d(n2 + n5, n3 - 1, n4, amc.e(0), 0, 2);
                afs2.d(n2 + n5 + 1, n3 - 1, n4, amc.e(0), 0, 2);
                afs2.d(n2 + n5 + 2, n3 - 1, n4, amc.e(0), 0, 2);
                afs2.d(n2 + n5 + 1, n3 - 2, n4, amc.e(0), 0, 2);
                if (!afs2.E) {
                    vt vt3 = new vt(afs2);
                    vt3.b((double)(n2 + n5) + 1.5, (double)n3 - 1.45, (double)n4 + 0.5, 0.0f, 0.0f);
                    vt3.bZ();
                    if (!afs2.E) {
                        for (xq xq3 : afs2.a(xq.class, vt3.C.b(50.0, 50.0, 50.0))) {
                            xq3.a(nt.I);
                        }
                    }
                    afs2.d(vt3);
                }
                for (int i3 = 0; i3 < 120; ++i3) {
                    afs2.a("snowballpoof", (double)(n2 + n5 + 1) + afs2.s.nextDouble(), (double)(n3 - 2) + afs2.s.nextDouble() * 3.9, (double)n4 + afs2.s.nextDouble(), 0.0, 0.0, 0.0);
                }
                afs2.c(n2 + n5, n3, n4, amc.e(0));
                afs2.c(n2 + n5 + 1, n3, n4, amc.e(0));
                afs2.c(n2 + n5 + 2, n3, n4, amc.e(0));
                afs2.c(n2 + n5, n3 - 1, n4, amc.e(0));
                afs2.c(n2 + n5 + 1, n3 - 1, n4, amc.e(0));
                afs2.c(n2 + n5 + 2, n3 - 1, n4, amc.e(0));
                afs2.c(n2 + n5 + 1, n3 - 2, n4, amc.e(0));
                return;
            }
        }
    }

    private boolean a(afs afs2, int n2, int n3, int n4, int n5) {
        if (afs2.a(n2, n3, n4) != this) {
            return false;
        }
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 == null || !(ani2 instanceof aoe)) {
            return false;
        }
        return ((aoe)ani2).a() == n5;
    }

    @Override
    public void a(px px2) {
    }

    @Override
    public pw a(int n2, int n3) {
        return aie.aM.h(n2);
    }

    @Override
    public String O() {
        return this.N() + "_" + acs.a[0];
    }
}

