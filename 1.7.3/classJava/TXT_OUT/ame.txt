/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ame
extends ahz {
    protected ame() {
        super(avk.y);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.a(true);
        this.a(aak.c);
        this.b(0);
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("snow");
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4) & 7;
        float f2 = 0.125f;
        return ayk.a().a((double)n2 + this.B, (double)n3 + this.C, (double)n4 + this.D, (double)n2 + this.E, (float)n3 + (float)n5 * f2, (double)n4 + this.G);
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
    public void g() {
        this.b(0);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.b(agc2.e(n2, n3, n4));
    }

    protected void b(int n2) {
        int n3 = n2 & 7;
        float f2 = (float)(2 * (1 + n3)) / 16.0f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, f2, 1.0f);
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        ahz ahz2 = afs2.a(n2, n3 - 1, n4);
        if (ahz2 == aie.aD || ahz2 == aie.cj) {
            return false;
        }
        if (ahz2.o() == avk.j) {
            return true;
        }
        if (ahz2 == this && (afs2.e(n2, n3 - 1, n4) & 7) == 7) {
            return true;
        }
        return ahz2.c() && ahz2.J.c();
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        this.m(afs2, n2, n3, n4);
    }

    private boolean m(afs afs2, int n2, int n3, int n4) {
        if (!this.c(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
            return false;
        }
        return true;
    }

    @Override
    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        int n6 = n5 & 7;
        this.a(afs2, n2, n3, n4, new abu(abv.ay, n6 + 1, 0));
        afs2.f(n2, n3, n4);
        xq2.a(og.C[ahz.b(this)], 1);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.ay;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.b(age.b, n2, n3, n4) > 11) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            return true;
        }
        return super.a(agc2, n2, n3, n4, n5);
    }
}

