/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ake
extends aht {
    private final Random a = new Random();
    private pw b;
    private pw M;
    private pw N;

    public ake() {
        super(avk.f);
        this.a(aak.d);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
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
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        int n7 = q.a[n5];
        if (n7 == 1) {
            n7 = 0;
        }
        return n7;
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anz();
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        super.a(afs2, n2, n3, n4, rm2, abu2);
        if (abu2.u()) {
            anz anz2 = ake.e(afs2, n2, n3, n4);
            anz2.a(abu2.s());
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        this.e(afs2, n2, n3, n4);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        anz anz2 = ake.e(afs2, n2, n3, n4);
        if (anz2 != null) {
            xq2.a(anz2);
        }
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        this.e(afs2, n2, n3, n4);
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        boolean bl2;
        int n5 = afs2.e(n2, n3, n4);
        int n6 = ake.b(n5);
        boolean bl3 = !afs2.v(n2, n3, n4);
        if (bl3 != (bl2 = ake.c(n5))) {
            afs2.a(n2, n3, n4, n6 | (bl3 ? 0 : 8), 4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        anz anz2 = (anz)afs2.o(n2, n3, n4);
        if (anz2 != null) {
            for (int i2 = 0; i2 < anz2.a(); ++i2) {
                abu abu2 = anz2.a(i2);
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
    public int b() {
        return 38;
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
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        return true;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.M;
        }
        return this.b;
    }

    public static int b(int n2) {
        return n2 & 7;
    }

    public static boolean c(int n2) {
        return (n2 & 8) != 8;
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        return yj.b(ake.e(afs2, n2, n3, n4));
    }

    @Override
    public void a(px px2) {
        this.b = px2.a("hopper_outside");
        this.M = px2.a("hopper_top");
        this.N = px2.a("hopper_inside");
    }

    public static pw e(String string) {
        if (string.equals("hopper_outside")) {
            return aie.bZ.b;
        }
        if (string.equals("hopper_inside")) {
            return aie.bZ.N;
        }
        return null;
    }

    @Override
    public String O() {
        return "hopper";
    }

    public static anz e(agc agc2, int n2, int n3, int n4) {
        return (anz)agc2.o(n2, n3, n4);
    }
}

