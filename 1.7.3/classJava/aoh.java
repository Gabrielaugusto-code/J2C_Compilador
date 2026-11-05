/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aoh
extends ahz {
    private pw a;

    public aoh() {
        super(avk.H);
        this.a(i);
        this.c(0.5f);
    }

    public void a(pw pw2) {
        this.a = pw2;
    }

    public void e() {
        this.a = null;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        int n6;
        ahz ahz2;
        if (xq2.bE.d && ((ahz2 = afs2.a(n2 - q.b[n6 = aoh.b(n5)], n3 - q.c[n6], n4 - q.d[n6])) == aie.J || ahz2 == aie.F)) {
            afs2.f(n2 - q.b[n6], n3 - q.c[n6], n4 - q.d[n6]);
        }
        super.a(afs2, n2, n3, n4, n5, xq2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        super.a(afs2, n2, n3, n4, ahz2, n5);
        int n6 = q.a[aoh.b(n5)];
        ahz ahz3 = afs2.a(n2 += q.b[n6], n3 += q.c[n6], n4 += q.d[n6]);
        if ((ahz3 == aie.J || ahz3 == aie.F) && aog.c(n5 = afs2.e(n2, n3, n4))) {
            ahz3.b(afs2, n2, n3, n4, n5, 0);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public pw a(int n2, int n3) {
        int n4 = aoh.b(n3);
        if (n2 == n4) {
            if (this.a != null) {
                return this.a;
            }
            if ((n3 & 8) != 0) {
                return aog.e("piston_top_sticky");
            }
            return aog.e("piston_top_normal");
        }
        if (n4 < 6 && n2 == q.a[n4]) {
            return aog.e("piston_top_normal");
        }
        return aog.e("piston_side");
    }

    @Override
    public void a(px px2) {
    }

    @Override
    public int b() {
        return 17;
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
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return false;
    }

    @Override
    public boolean d(afs afs2, int n2, int n3, int n4, int n5) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        int n5 = afs2.e(n2, n3, n4);
        float f2 = 0.25f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        float f5 = 0.25f;
        float f6 = 0.75f;
        switch (aoh.b(n5)) {
            case 0: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                this.a(0.375f, 0.25f, 0.375f, 0.625f, 1.0f, 0.625f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                break;
            }
            case 1: {
                this.a(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.75f, 0.625f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                break;
            }
            case 2: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                this.a(0.25f, 0.375f, 0.25f, 0.75f, 0.625f, 1.0f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                break;
            }
            case 3: {
                this.a(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                this.a(0.25f, 0.375f, 0.0f, 0.75f, 0.625f, 0.75f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                break;
            }
            case 4: {
                this.a(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                this.a(0.375f, 0.25f, 0.25f, 0.625f, 0.75f, 1.0f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                break;
            }
            case 5: {
                this.a(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
                this.a(0.0f, 0.375f, 0.25f, 0.75f, 0.625f, 0.75f);
                super.a(afs2, n2, n3, n4, ayk2, list, qr2);
            }
        }
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        float f2 = 0.25f;
        switch (aoh.b(n5)) {
            case 0: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                break;
            }
            case 1: {
                this.a(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 2: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                break;
            }
            case 3: {
                this.a(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 4: {
                this.a(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                break;
            }
            case 5: {
                this.a(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        int n5 = aoh.b(afs2.e(n2, n3, n4));
        ahz ahz3 = afs2.a(n2 - q.b[n5], n3 - q.c[n5], n4 - q.d[n5]);
        if (ahz3 != aie.J && ahz3 != aie.F) {
            afs2.f(n2, n3, n4);
        } else {
            ahz3.a(afs2, n2 - q.b[n5], n3 - q.c[n5], n4 - q.d[n5], ahz2);
        }
    }

    public static int b(int n2) {
        return n2 & 7;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        if ((n5 & 8) != 0) {
            return abs.a(aie.F);
        }
        return abs.a(aie.J);
    }
}

