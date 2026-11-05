/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aoi
extends aht {
    public aoi() {
        super(avk.H);
        this.c(-1.0f);
    }

    @Override
    public ani a(afs afs2, int n2) {
        return null;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 instanceof aoj) {
            ((aoj)ani2).f();
        } else {
            super.a(afs2, n2, n3, n4, ahz2, n5);
        }
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
    public int b() {
        return -1;
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
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (!afs2.E && afs2.o(n2, n3, n4) == null) {
            afs2.f(n2, n3, n4);
            return true;
        }
        return false;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        if (afs2.E) {
            return;
        }
        aoj aoj2 = this.e(afs2, n2, n3, n4);
        if (aoj2 == null) {
            return;
        }
        aoj2.a().b(afs2, n2, n3, n4, aoj2.p(), 0);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!afs2.E) {
            afs2.o(n2, n3, n4);
        }
    }

    public static ani a(ahz ahz2, int n2, int n3, boolean bl2, boolean bl3) {
        return new aoj(ahz2, n2, n3, bl2, bl3);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        aoj aoj2 = this.e(afs2, n2, n3, n4);
        if (aoj2 == null) {
            return null;
        }
        float f2 = aoj2.a(0.0f);
        if (aoj2.b()) {
            f2 = 1.0f - f2;
        }
        return this.a(afs2, n2, n3, n4, aoj2.a(), f2, aoj2.c());
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        aoj aoj2 = this.e(agc2, n2, n3, n4);
        if (aoj2 != null) {
            ahz ahz2 = aoj2.a();
            if (ahz2 == this || ahz2.o() == avk.a) {
                return;
            }
            ahz2.a(agc2, n2, n3, n4);
            float f2 = aoj2.a(0.0f);
            if (aoj2.b()) {
                f2 = 1.0f - f2;
            }
            int n5 = aoj2.c();
            this.B = ahz2.x() - (double)((float)q.b[n5] * f2);
            this.C = ahz2.z() - (double)((float)q.c[n5] * f2);
            this.D = ahz2.B() - (double)((float)q.d[n5] * f2);
            this.E = ahz2.y() - (double)((float)q.b[n5] * f2);
            this.F = ahz2.A() - (double)((float)q.c[n5] * f2);
            this.G = ahz2.C() - (double)((float)q.d[n5] * f2);
        }
    }

    public ayk a(afs afs2, int n2, int n3, int n4, ahz ahz2, float f2, int n5) {
        if (ahz2 == this || ahz2.o() == avk.a) {
            return null;
        }
        ayk ayk2 = ahz2.a(afs2, n2, n3, n4);
        if (ayk2 == null) {
            return null;
        }
        if (q.b[n5] < 0) {
            ayk2.a -= (double)((float)q.b[n5] * f2);
        } else {
            ayk2.d -= (double)((float)q.b[n5] * f2);
        }
        if (q.c[n5] < 0) {
            ayk2.b -= (double)((float)q.c[n5] * f2);
        } else {
            ayk2.e -= (double)((float)q.c[n5] * f2);
        }
        if (q.d[n5] < 0) {
            ayk2.c -= (double)((float)q.d[n5] * f2);
        } else {
            ayk2.f -= (double)((float)q.d[n5] * f2);
        }
        return ayk2;
    }

    private aoj e(agc agc2, int n2, int n3, int n4) {
        ani ani2 = agc2.o(n2, n3, n4);
        if (ani2 instanceof aoj) {
            return (aoj)ani2;
        }
        return null;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.d(0);
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("piston_top_normal");
    }
}

