/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajg
extends ahz {
    public ajg() {
        super(avk.D);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        afs2.a(n2, n3, n4, this, this.a(afs2));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        afs2.a(n2, n3, n4, this, this.a(afs2));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        this.e(afs2, n2, n3, n4);
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        if (ajo.e(afs2, n2, n3 - 1, n4) && n3 >= 0) {
            int n5 = 32;
            if (ajo.M || !afs2.b(n2 - n5, n3 - n5, n4 - n5, n2 + n5, n3 + n5, n4 + n5)) {
                afs2.f(n2, n3, n4);
                while (ajo.e(afs2, n2, n3 - 1, n4) && n3 > 0) {
                    --n3;
                }
                if (n3 > 0) {
                    afs2.d(n2, n3, n4, this, 0, 2);
                }
            } else {
                wa wa2 = new wa(afs2, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, this);
                afs2.d(wa2);
            }
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        this.m(afs2, n2, n3, n4);
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, xq xq2) {
        this.m(afs2, n2, n3, n4);
    }

    private void m(afs afs2, int n2, int n3, int n4) {
        if (afs2.a(n2, n3, n4) != this) {
            return;
        }
        for (int i2 = 0; i2 < 1000; ++i2) {
            int n5 = n2 + afs2.s.nextInt(16) - afs2.s.nextInt(16);
            int n6 = n3 + afs2.s.nextInt(8) - afs2.s.nextInt(8);
            int n7 = n4 + afs2.s.nextInt(16) - afs2.s.nextInt(16);
            if (afs2.a((int)n5, (int)n6, (int)n7).J != avk.a) continue;
            if (!afs2.E) {
                afs2.d(n5, n6, n7, this, afs2.e(n2, n3, n4), 2);
                afs2.f(n2, n3, n4);
            } else {
                int n8 = 128;
                for (int i3 = 0; i3 < n8; ++i3) {
                    double d2 = afs2.s.nextDouble();
                    float f2 = (afs2.s.nextFloat() - 0.5f) * 0.2f;
                    float f3 = (afs2.s.nextFloat() - 0.5f) * 0.2f;
                    float f4 = (afs2.s.nextFloat() - 0.5f) * 0.2f;
                    double d3 = (double)n5 + (double)(n2 - n5) * d2 + (afs2.s.nextDouble() - 0.5) * 1.0 + 0.5;
                    double d4 = (double)n6 + (double)(n3 - n6) * d2 + afs2.s.nextDouble() * 1.0 - 0.5;
                    double d5 = (double)n7 + (double)(n4 - n7) * d2 + (afs2.s.nextDouble() - 0.5) * 1.0 + 0.5;
                    afs2.a("portal", d3, d4, d5, (double)f2, (double)f3, f4);
                }
            }
            return;
        }
    }

    @Override
    public int a(afs afs2) {
        return 5;
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
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        return true;
    }

    @Override
    public int b() {
        return 27;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.d(0);
    }
}

