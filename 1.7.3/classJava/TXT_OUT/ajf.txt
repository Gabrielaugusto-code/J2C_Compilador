/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ajf
extends aii
implements aif {
    public static final String[] a = new String[]{"sunflower", "syringa", "grass", "fern", "rose", "paeonia"};
    private pw[] M;
    private pw[] N;
    public pw[] b;

    public ajf() {
        super(avk.k);
        this.c(0.0f);
        this.a(h);
        this.c("doublePlant");
    }

    @Override
    public int b() {
        return 40;
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public int e(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        if (!ajf.c(n5)) {
            return n5 & 7;
        }
        return agc2.e(n2, n3 - 1, n4) & 7;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return super.c(afs2, n2, n3, n4) && afs2.c(n2, n3 + 1, n4);
    }

    @Override
    protected void e(afs afs2, int n2, int n3, int n4) {
        if (!this.j(afs2, n2, n3, n4)) {
            int n5 = afs2.e(n2, n3, n4);
            if (!ajf.c(n5)) {
                this.b(afs2, n2, n3, n4, n5, 0);
                if (afs2.a(n2, n3 + 1, n4) == this) {
                    afs2.d(n2, n3 + 1, n4, aie.a, 0, 2);
                }
            }
            afs2.d(n2, n3, n4, aie.a, 0, 2);
        }
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        if (ajf.c(n5)) {
            return afs2.a(n2, n3 - 1, n4) == this;
        }
        return afs2.a(n2, n3 + 1, n4) == this && super.j(afs2, n2, n3, n4);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        if (ajf.c(n2)) {
            return null;
        }
        int n4 = ajf.d(n2);
        if (n4 == 3 || n4 == 2) {
            return null;
        }
        return abs.a(this);
    }

    @Override
    public int a(int n2) {
        if (ajf.c(n2)) {
            return 0;
        }
        return n2 & 7;
    }

    public static boolean c(int n2) {
        return (n2 & 8) != 0;
    }

    public static int d(int n2) {
        return n2 & 7;
    }

    @Override
    public pw a(int n2, int n3) {
        if (ajf.c(n3)) {
            return this.M[0];
        }
        return this.M[n3 & 7];
    }

    public pw a(boolean bl2, int n2) {
        if (bl2) {
            return this.N[n2];
        }
        return this.M[n2];
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        int n5 = this.e(agc2, n2, n3, n4);
        if (n5 == 2 || n5 == 3) {
            return agc2.a(n2, n4).b(n2, n3, n4);
        }
        return 0xFFFFFF;
    }

    public void c(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        afs2.d(n2, n3, n4, this, n5, n6);
        afs2.d(n2, n3 + 1, n4, this, 8, n6);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = ((oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        afs2.d(n2, n3 + 1, n4, this, 8 | n5, 2);
    }

    @Override
    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        if (!afs2.E && xq2.bE() != null && xq2.bE().b() == abv.aZ && !ajf.c(n5) && this.b(afs2, n2, n3, n4, n5, xq2)) {
            return;
        }
        super.a(afs2, xq2, n2, n3, n4, n5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        if (ajf.c(n5)) {
            if (afs2.a(n2, n3 - 1, n4) == this) {
                if (!xq2.bE.d) {
                    int n6 = afs2.e(n2, n3 - 1, n4);
                    int n7 = ajf.d(n6);
                    if (n7 == 3 || n7 == 2) {
                        if (!afs2.E && xq2.bE() != null && xq2.bE().b() == abv.aZ) {
                            this.b(afs2, n2, n3, n4, n6, xq2);
                        }
                        afs2.f(n2, n3 - 1, n4);
                    } else {
                        afs2.a(n2, n3 - 1, n4, true);
                    }
                } else {
                    afs2.f(n2, n3 - 1, n4);
                }
            }
        } else if (xq2.bE.d && afs2.a(n2, n3 + 1, n4) == this) {
            afs2.d(n2, n3 + 1, n4, aie.a, 0, 2);
        }
        super.a(afs2, n2, n3, n4, n5, xq2);
    }

    private boolean b(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        int n6 = ajf.d(n5);
        if (n6 == 3 || n6 == 2) {
            xq2.a(og.C[ahz.b(this)], 1);
            int n7 = 1;
            if (n6 == 3) {
                n7 = 2;
            }
            this.a(afs2, n2, n3, n4, new abu(aie.H, 2, n7));
            return true;
        }
        return false;
    }

    @Override
    public void a(px px2) {
        this.M = new pw[a.length];
        this.N = new pw[a.length];
        for (int i2 = 0; i2 < this.M.length; ++i2) {
            this.M[i2] = px2.a("double_plant_" + a[i2] + "_bottom");
            this.N[i2] = px2.a("double_plant_" + a[i2] + "_top");
        }
        this.b = new pw[2];
        this.b[0] = px2.a("double_plant_sunflower_front");
        this.b[1] = px2.a("double_plant_sunflower_back");
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < this.M.length; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        if (ajf.c(n5)) {
            return ajf.d(afs2.e(n2, n3 - 1, n4));
        }
        return ajf.d(n5);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        int n5 = this.e((agc)afs2, n2, n3, n4);
        return n5 != 2 && n5 != 3;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        int n5 = this.e((agc)afs2, n2, n3, n4);
        this.a(afs2, n2, n3, n4, new abu(this, 1, n5));
    }
}

