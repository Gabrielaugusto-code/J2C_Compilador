/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajd
extends aht {
    public static final cy a = new cn(new cl());
    protected Random b = new Random();
    protected pw M;
    protected pw N;
    protected pw O;

    protected ajd() {
        super(avk.e);
        this.a(aak.d);
    }

    @Override
    public int a(afs afs2) {
        return 4;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        this.m(afs2, n2, n3, n4);
    }

    private void m(afs afs2, int n2, int n3, int n4) {
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
        int n4 = n3 & 7;
        if (n2 == n4) {
            if (n4 == 1 || n4 == 0) {
                return this.O;
            }
            return this.N;
        }
        if (n4 == 1 || n4 == 0) {
            return this.M;
        }
        if (n2 == 1 || n2 == 0) {
            return this.M;
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("furnace_side");
        this.M = px2.a("furnace_top");
        this.N = px2.a(this.N() + "_front_horizontal");
        this.O = px2.a(this.N() + "_front_vertical");
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        ans ans2 = (ans)afs2.o(n2, n3, n4);
        if (ans2 != null) {
            xq2.a(ans2);
        }
        return true;
    }

    protected void e(afs afs2, int n2, int n3, int n4) {
        ck ck2 = new ck(afs2, n2, n3, n4);
        ans ans2 = (ans)ck2.j();
        if (ans2 == null) {
            return;
        }
        int n5 = ans2.i();
        if (n5 < 0) {
            afs2.c(1001, n2, n3, n4, 0);
        } else {
            abu abu2 = ans2.a(n5);
            co co2 = this.a(abu2);
            if (co2 != co.a) {
                abu abu3 = co2.a(ck2, abu2);
                ans2.a(n5, abu3.b == 0 ? null : abu3);
            }
        }
    }

    protected co a(abu abu2) {
        return (co)a.a(abu2.b());
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        boolean bl2;
        boolean bl3 = afs2.v(n2, n3, n4) || afs2.v(n2, n3 + 1, n4);
        int n5 = afs2.e(n2, n3, n4);
        boolean bl4 = bl2 = (n5 & 8) != 0;
        if (bl3 && !bl2) {
            afs2.a(n2, n3, n4, this, this.a(afs2));
            afs2.a(n2, n3, n4, n5 | 8, 4);
        } else if (!bl3 && bl2) {
            afs2.a(n2, n3, n4, n5 & 0xFFFFFFF7, 4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (!afs2.E) {
            this.e(afs2, n2, n3, n4);
        }
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new ans();
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = aog.a(afs2, n2, n3, n4, rm2);
        afs2.a(n2, n3, n4, n5, 2);
        if (abu2.u()) {
            ((ans)afs2.o(n2, n3, n4)).a(abu2.s());
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        ans ans2 = (ans)afs2.o(n2, n3, n4);
        if (ans2 != null) {
            for (int i2 = 0; i2 < ans2.a(); ++i2) {
                abu abu2 = ans2.a(i2);
                if (abu2 == null) continue;
                float f2 = this.b.nextFloat() * 0.8f + 0.1f;
                float f3 = this.b.nextFloat() * 0.8f + 0.1f;
                float f4 = this.b.nextFloat() * 0.8f + 0.1f;
                while (abu2.b > 0) {
                    int n6 = this.b.nextInt(21) + 10;
                    if (n6 > abu2.b) {
                        n6 = abu2.b;
                    }
                    abu2.b -= n6;
                    wb wb2 = new wb(afs2, (float)n2 + f2, (float)n3 + f3, (float)n4 + f4, new abu(abu2.b(), n6, abu2.k()));
                    if (abu2.p()) {
                        wb2.f().d((dg)abu2.q().b());
                    }
                    float f5 = 0.05f;
                    wb2.v = (float)this.b.nextGaussian() * f5;
                    wb2.w = (float)this.b.nextGaussian() * f5 + 0.2f;
                    wb2.x = (float)this.b.nextGaussian() * f5;
                    afs2.d(wb2);
                }
            }
            afs2.f(n2, n3, n4, ahz2);
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    public static cw a(cj cj2) {
        cq cq2 = ajd.b(cj2.h());
        double d2 = cj2.a() + 0.7 * (double)cq2.c();
        double d3 = cj2.b() + 0.7 * (double)cq2.d();
        double d4 = cj2.c() + 0.7 * (double)cq2.e();
        return new cx(d2, d3, d4);
    }

    public static cq b(int n2) {
        return cq.a(n2 & 7);
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        return yj.b((ps)((Object)afs2.o(n2, n3, n4)));
    }
}

