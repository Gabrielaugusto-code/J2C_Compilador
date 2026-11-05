/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ana
extends aii {
    protected ana() {
        float f2 = 0.5f;
        float f3 = 0.015625f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f3, 0.5f + f2);
        this.a(aak.c);
    }

    @Override
    public int b() {
        return 23;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        if (qr2 == null || !(qr2 instanceof vz)) {
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        }
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return ayk.a().a((double)n2 + this.B, (double)n3 + this.C, (double)n4 + this.D, (double)n2 + this.E, (double)n3 + this.F, (double)n4 + this.G);
    }

    @Override
    public int D() {
        return 2129968;
    }

    @Override
    public int i(int n2) {
        return 2129968;
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        return 2129968;
    }

    @Override
    protected boolean a(ahz ahz2) {
        return ahz2 == aie.j;
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        if (n3 < 0 || n3 >= 256) {
            return false;
        }
        return afs2.a(n2, n3 - 1, n4).o() == avk.h && afs2.e(n2, n3 - 1, n4) == 0;
    }
}

