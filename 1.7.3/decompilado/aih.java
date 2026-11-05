/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aih
extends aht {
    private Random a = new Random();
    private pw b;

    public aih() {
        super(avk.f);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int b() {
        return 25;
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anm();
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        this.a(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        this.g();
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
    }

    @Override
    public void g() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        anm anm2 = (anm)afs2.o(n2, n3, n4);
        if (anm2 != null) {
            xq2.a(anm2);
        }
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        if (abu2.u()) {
            ((anm)afs2.o(n2, n3, n4)).a(abu2.s());
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        double d2 = (float)n2 + 0.4f + random.nextFloat() * 0.2f;
        double d3 = (float)n3 + 0.7f + random.nextFloat() * 0.3f;
        double d4 = (float)n4 + 0.4f + random.nextFloat() * 0.2f;
        afs2.a("smoke", d2, d3, d4, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 instanceof anm) {
            anm anm2 = (anm)ani2;
            for (int i2 = 0; i2 < anm2.a(); ++i2) {
                abu abu2 = anm2.a(i2);
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
                    float f5 = 0.05f;
                    wb2.v = (float)this.a.nextGaussian() * f5;
                    wb2.w = (float)this.a.nextGaussian() * f5 + 0.2f;
                    wb2.x = (float)this.a.nextGaussian() * f5;
                    afs2.d(wb2);
                }
            }
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.bt;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.bt;
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
    public void a(px px2) {
        super.a(px2);
        this.b = px2.a(this.N() + "_base");
    }

    public pw e() {
        return this.b;
    }
}

