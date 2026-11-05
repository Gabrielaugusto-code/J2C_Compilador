/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajv
extends aht {
    private final Random a = new Random();
    private final boolean b;
    private static boolean M;
    private pw N;
    private pw O;

    protected ajv(boolean bl2) {
        super(avk.e);
        this.b = bl2;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(aie.al);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        this.e(afs2, n2, n3, n4);
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        if (afs2.E) {
            return;
        }
        ahz ahz2 = afs2.a(n2, n3, n4 - 1);
        ahz ahz3 = afs2.a(n2, n3, n4 + 1);
        ahz ahz4 = afs2.a(n2 - 1, n3, n4);
        ahz ahz5 = afs2.a(n2 + 1, n3, n4);
        int n5 = 3;
        if (ahz2.j() && !ahz3.j()) {
            n5 = 3;
        }
        if (ahz3.j() && !ahz2.j()) {
            n5 = 2;
        }
        if (ahz4.j() && !ahz5.j()) {
            n5 = 5;
        }
        if (ahz5.j() && !ahz4.j()) {
            n5 = 4;
        }
        afs2.a(n2, n3, n4, n5, 2);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.N;
        }
        if (n2 == 0) {
            return this.N;
        }
        if (n2 != n3) {
            return this.L;
        }
        return this.O;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("furnace_side");
        this.O = px2.a(this.b ? "furnace_front_on" : "furnace_front_off");
        this.N = px2.a("furnace_top");
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        if (!this.b) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        float f2 = (float)n2 + 0.5f;
        float f3 = (float)n3 + 0.0f + random.nextFloat() * 6.0f / 16.0f;
        float f4 = (float)n4 + 0.5f;
        float f5 = 0.52f;
        float f6 = random.nextFloat() * 0.6f - 0.3f;
        if (n5 == 4) {
            afs2.a("smoke", (double)(f2 - f5), (double)f3, (double)(f4 + f6), 0.0, 0.0, 0.0);
            afs2.a("flame", (double)(f2 - f5), (double)f3, (double)(f4 + f6), 0.0, 0.0, 0.0);
        } else if (n5 == 5) {
            afs2.a("smoke", (double)(f2 + f5), (double)f3, (double)(f4 + f6), 0.0, 0.0, 0.0);
            afs2.a("flame", (double)(f2 + f5), (double)f3, (double)(f4 + f6), 0.0, 0.0, 0.0);
        } else if (n5 == 2) {
            afs2.a("smoke", (double)(f2 + f6), (double)f3, (double)(f4 - f5), 0.0, 0.0, 0.0);
            afs2.a("flame", (double)(f2 + f6), (double)f3, (double)(f4 - f5), 0.0, 0.0, 0.0);
        } else if (n5 == 3) {
            afs2.a("smoke", (double)(f2 + f6), (double)f3, (double)(f4 + f5), 0.0, 0.0, 0.0);
            afs2.a("flame", (double)(f2 + f6), (double)f3, (double)(f4 + f5), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        anx anx2 = (anx)afs2.o(n2, n3, n4);
        if (anx2 != null) {
            xq2.a(anx2);
        }
        return true;
    }

    public static void a(boolean bl2, afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        ani ani2 = afs2.o(n2, n3, n4);
        M = true;
        if (bl2) {
            afs2.b(n2, n3, n4, aie.am);
        } else {
            afs2.b(n2, n3, n4, aie.al);
        }
        M = false;
        afs2.a(n2, n3, n4, n5, 2);
        if (ani2 != null) {
            ani2.t();
            afs2.a(n2, n3, n4, ani2);
        }
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anx();
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3;
        if (n5 == 0) {
            afs2.a(n2, n3, n4, 2, 2);
        }
        if (n5 == 1) {
            afs2.a(n2, n3, n4, 5, 2);
        }
        if (n5 == 2) {
            afs2.a(n2, n3, n4, 3, 2);
        }
        if (n5 == 3) {
            afs2.a(n2, n3, n4, 4, 2);
        }
        if (abu2.u()) {
            ((anx)afs2.o(n2, n3, n4)).a(abu2.s());
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        anx anx2;
        if (!M && (anx2 = (anx)afs2.o(n2, n3, n4)) != null) {
            for (int i2 = 0; i2 < anx2.a(); ++i2) {
                abu abu2 = anx2.a(i2);
                if (abu2 == null) continue;
                float f2 = this.a.nextFloat() * 0.8f + 0.1f;
                float f3 = this.a.nextFloat() * 0.8f + 0.1f;
                float f4 = this.a.nextFloat() * 0.8f + 0.1f;
                while (abu2.b > 0) {
                    int n6 = this.a.nextInt(21) + 10;
                    if (n6 > abu2.b) {
                        n6 = abu2.b;
                    }
                    abu2.b -= n6;
                    wb wb2 = new wb(afs2, (float)n2 + f2, (float)n3 + f3, (float)n4 + f4, new abu(abu2.b(), n6, abu2.k()));
                    if (abu2.p()) {
                        wb2.f().d((dg)abu2.q().b());
                    }
                    float f5 = 0.05f;
                    wb2.v = (float)this.a.nextGaussian() * f5;
                    wb2.w = (float)this.a.nextGaussian() * f5 + 0.2f;
                    wb2.x = (float)this.a.nextGaussian() * f5;
                    afs2.d(wb2);
                }
            }
            afs2.f(n2, n3, n4, ahz2);
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        return yj.b((ps)((Object)afs2.o(n2, n3, n4)));
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.a(aie.al);
    }
}

