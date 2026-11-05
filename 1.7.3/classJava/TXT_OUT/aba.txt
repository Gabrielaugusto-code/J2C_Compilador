/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aba
extends abs {
    public static final String[] a = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
    public static final String[] b = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};
    public static final int[] c = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};
    private pw[] d;

    public aba() {
        this.a(true);
        this.f(0);
        this.a(aak.l);
    }

    @Override
    public pw b_(int n2) {
        int n3 = oy.a(n2, 0, 15);
        return this.d[n3];
    }

    @Override
    public String a(abu abu2) {
        int n2 = oy.a(abu2.k(), 0, 15);
        return super.a() + "." + a[n2];
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (abu2.k() == 15) {
            if (aba.a(abu2, afs2, n2, n3, n4)) {
                if (!afs2.E) {
                    afs2.c(2005, n2, n3, n4, 0);
                }
                return true;
            }
        } else if (abu2.k() == 3) {
            ahz ahz2 = afs2.a(n2, n3, n4);
            int n6 = afs2.e(n2, n3, n4);
            if (ahz2 == aie.r && ako.c(n6) == 3) {
                if (n5 == 0) {
                    return false;
                }
                if (n5 == 1) {
                    return false;
                }
                if (n5 == 2) {
                    --n4;
                }
                if (n5 == 3) {
                    ++n4;
                }
                if (n5 == 4) {
                    --n2;
                }
                if (n5 == 5) {
                    ++n2;
                }
                if (afs2.c(n2, n3, n4)) {
                    int n7 = aie.by.a(afs2, n2, n3, n4, n5, f2, f3, f4, 0);
                    afs2.d(n2, n3, n4, aie.by, n7, 2);
                    if (!xq2.bE.d) {
                        --abu2.b;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(abu abu2, afs afs2, int n2, int n3, int n4) {
        aif aif2;
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2 instanceof aif && (aif2 = (aif)((Object)ahz2)).a(afs2, n2, n3, n4, afs2.E)) {
            if (!afs2.E) {
                if (aif2.a(afs2, afs2.s, n2, n3, n4)) {
                    aif2.b(afs2, afs2.s, n2, n3, n4);
                }
                --abu2.b;
            }
            return true;
        }
        return false;
    }

    public static void a(afs afs2, int n2, int n3, int n4, int n5) {
        ahz ahz2;
        if (n5 == 0) {
            n5 = 15;
        }
        if ((ahz2 = afs2.a(n2, n3, n4)).o() == avk.a) {
            return;
        }
        ahz2.a((agc)afs2, n2, n3, n4);
        for (int i2 = 0; i2 < n5; ++i2) {
            double d2 = g.nextGaussian() * 0.02;
            double d3 = g.nextGaussian() * 0.02;
            double d4 = g.nextGaussian() * 0.02;
            afs2.a("happyVillager", (double)((float)n2 + g.nextFloat()), (double)n3 + (double)g.nextFloat() * ahz2.A(), (double)((float)n4 + g.nextFloat()), d2, d3, d4);
        }
    }

    @Override
    public boolean a(abu abu2, xq xq2, rm rm2) {
        if (rm2 instanceof vg) {
            vg vg2 = (vg)rm2;
            int n2 = air.b(abu2.k());
            if (!vg2.ca() && vg2.bZ() != n2) {
                vg2.s(n2);
                --abu2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public void a(px px2) {
        this.d = new pw[b.length];
        for (int i2 = 0; i2 < b.length; ++i2) {
            this.d[i2] = px2.a(this.w() + "_" + b[i2]);
        }
    }
}

