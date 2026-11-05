/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ail
extends ahz {
    private pw a;
    private pw b;
    private pw M;

    protected ail() {
        super(avk.F);
        this.a(true);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        float f2 = 0.0625f;
        float f3 = (float)(1 + n5 * 2) / 16.0f;
        float f4 = 0.5f;
        this.a(f3, 0.0f, f2, 1.0f - f2, f4, 1.0f - f2);
    }

    @Override
    public void g() {
        float f2 = 0.0625f;
        float f3 = 0.5f;
        this.a(f2, 0.0f, f2, 1.0f - f2, f3, 1.0f - f2);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        float f2 = 0.0625f;
        float f3 = (float)(1 + n5 * 2) / 16.0f;
        float f4 = 0.5f;
        return ayk.a().a((float)n2 + f3, n3, (float)n4 + f2, (float)(n2 + 1) - f2, (float)n3 + f4 - f2, (float)(n4 + 1) - f2);
    }

    @Override
    public ayk g(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        float f2 = 0.0625f;
        float f3 = (float)(1 + n5 * 2) / 16.0f;
        float f4 = 0.5f;
        return ayk.a().a((float)n2 + f3, n3, (float)n4 + f2, (float)(n2 + 1) - f2, (float)n3 + f4, (float)(n4 + 1) - f2);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.a;
        }
        if (n2 == 0) {
            return this.b;
        }
        if (n3 > 0 && n2 == 4) {
            return this.M;
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.M = px2.a(this.N() + "_inner");
        this.a = px2.a(this.N() + "_top");
        this.b = px2.a(this.N() + "_bottom");
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
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        this.b(afs2, n2, n3, n4, xq2);
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, xq xq2) {
        this.b(afs2, n2, n3, n4, xq2);
    }

    private void b(afs afs2, int n2, int n3, int n4, xq xq2) {
        if (xq2.g(false)) {
            xq2.bP().a(2, 0.1f);
            int n5 = afs2.e(n2, n3, n4) + 1;
            if (n5 >= 6) {
                afs2.f(n2, n3, n4);
            } else {
                afs2.a(n2, n3, n4, n5, 2);
            }
        }
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        if (!super.c(afs2, n2, n3, n4)) {
            return false;
        }
        return this.j(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!this.j(afs2, n2, n3, n4)) {
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        return afs2.a(n2, n3 - 1, n4).o().a();
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.aU;
    }
}

