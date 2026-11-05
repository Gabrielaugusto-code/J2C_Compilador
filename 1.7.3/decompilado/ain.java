/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ain
extends ahz {
    private pw a;
    private pw b;
    private pw M;

    public ain() {
        super(avk.f);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.b;
        }
        if (n2 == 0) {
            return this.M;
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.a = px2.a(this.N() + "_" + "inner");
        this.b = px2.a(this.N() + "_top");
        this.M = px2.a(this.N() + "_" + "bottom");
        this.L = px2.a(this.N() + "_side");
    }

    public static pw e(String string) {
        if (string.equals("inner")) {
            return aie.bp.a;
        }
        if (string.equals("bottom")) {
            return aie.bp.M;
        }
        return null;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        float f2 = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, f2, 1.0f, 1.0f);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f2);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        this.a(1.0f - f2, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        this.a(0.0f, 0.0f, 1.0f - f2, 1.0f, 1.0f, 1.0f);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        this.g();
    }

    @Override
    public void g() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int b() {
        return 24;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        int n5 = ain.b(afs2.e(n2, n3, n4));
        float f2 = (float)n3 + (6.0f + (float)(3 * n5)) / 16.0f;
        if (!afs2.E && qr2.ak() && n5 > 0 && qr2.C.b <= (double)f2) {
            qr2.E();
            this.a(afs2, n2, n3, n4, n5 - 1);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        abu abu2 = xq2.bm.h();
        if (abu2 == null) {
            return true;
        }
        int n6 = afs2.e(n2, n3, n4);
        int n7 = ain.b(n6);
        if (abu2.b() == abv.as) {
            if (n7 < 3) {
                if (!xq2.bE.d) {
                    xq2.bm.a(xq2.bm.c, new abu(abv.ar));
                }
                this.a(afs2, n2, n3, n4, 3);
            }
            return true;
        }
        if (abu2.b() == abv.bo) {
            if (n7 > 0) {
                if (!xq2.bE.d) {
                    abu abu3 = new abu(abv.bn, 1, 0);
                    if (!xq2.bm.a(abu3)) {
                        afs2.d(new wb(afs2, (double)n2 + 0.5, (double)n3 + 1.5, (double)n4 + 0.5, abu3));
                    } else if (xq2 instanceof mp) {
                        ((mp)xq2).a(xq2.bn);
                    }
                    --abu2.b;
                    if (abu2.b <= 0) {
                        xq2.bm.a(xq2.bm.c, null);
                    }
                }
                this.a(afs2, n2, n3, n4, n7 - 1);
            }
        } else if (n7 > 0 && abu2.b() instanceof zs && ((zs)abu2.b()).m_() == zu.a) {
            zs zs2 = (zs)abu2.b();
            zs2.c(abu2);
            this.a(afs2, n2, n3, n4, n7 - 1);
            return true;
        }
        return false;
    }

    public void a(afs afs2, int n2, int n3, int n4, int n5) {
        afs2.a(n2, n3, n4, oy.a(n5, 0, 3), 2);
        afs2.f(n2, n3, n4, this);
    }

    @Override
    public void l(afs afs2, int n2, int n3, int n4) {
        if (afs2.s.nextInt(20) != 1) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        if (n5 < 3) {
            afs2.a(n2, n3, n4, n5 + 1, 2);
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.bu;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.bu;
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = afs2.e(n2, n3, n4);
        return ain.b(n6);
    }

    public static int b(int n2) {
        return n2;
    }

    public static float c(int n2) {
        int n3 = oy.a(n2, 0, 3);
        return (float)(6 + 3 * n3) / 16.0f;
    }
}

