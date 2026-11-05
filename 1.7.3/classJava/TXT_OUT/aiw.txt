/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aiw
extends aii
implements aif {
    private pw[] a;

    protected aiw() {
        this.a(true);
        float f2 = 0.5f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.25f, 0.5f + f2);
        this.a((aak)null);
        this.c(0.0f);
        this.a(h);
        this.H();
    }

    @Override
    protected boolean a(ahz ahz2) {
        return ahz2 == aie.ak;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        float f2;
        int n5;
        super.a(afs2, n2, n3, n4, random);
        if (afs2.k(n2, n3 + 1, n4) >= 9 && (n5 = afs2.e(n2, n3, n4)) < 7 && random.nextInt((int)(25.0f / (f2 = this.n(afs2, n2, n3, n4))) + 1) == 0) {
            afs2.a(n2, n3, n4, ++n5, 2);
        }
    }

    public void m(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4) + oy.a(afs2.s, 2, 5);
        if (n5 > 7) {
            n5 = 7;
        }
        afs2.a(n2, n3, n4, n5, 2);
    }

    private float n(afs afs2, int n2, int n3, int n4) {
        float f2 = 1.0f;
        ahz ahz2 = afs2.a(n2, n3, n4 - 1);
        ahz ahz3 = afs2.a(n2, n3, n4 + 1);
        ahz ahz4 = afs2.a(n2 - 1, n3, n4);
        ahz ahz5 = afs2.a(n2 + 1, n3, n4);
        ahz ahz6 = afs2.a(n2 - 1, n3, n4 - 1);
        ahz ahz7 = afs2.a(n2 + 1, n3, n4 - 1);
        ahz ahz8 = afs2.a(n2 + 1, n3, n4 + 1);
        ahz ahz9 = afs2.a(n2 - 1, n3, n4 + 1);
        boolean bl2 = ahz4 == this || ahz5 == this;
        boolean bl3 = ahz2 == this || ahz3 == this;
        boolean bl4 = ahz6 == this || ahz7 == this || ahz8 == this || ahz9 == this;
        for (int i2 = n2 - 1; i2 <= n2 + 1; ++i2) {
            for (int i3 = n4 - 1; i3 <= n4 + 1; ++i3) {
                float f3 = 0.0f;
                if (afs2.a(i2, n3 - 1, i3) == aie.ak) {
                    f3 = 1.0f;
                    if (afs2.e(i2, n3 - 1, i3) > 0) {
                        f3 = 3.0f;
                    }
                }
                if (i2 != n2 || i3 != n4) {
                    f3 /= 4.0f;
                }
                f2 += f3;
            }
        }
        if (bl4 || bl2 && bl3) {
            f2 /= 2.0f;
        }
        return f2;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 < 0 || n3 > 7) {
            n3 = 7;
        }
        return this.a[n3];
    }

    @Override
    public int b() {
        return 6;
    }

    protected abs i() {
        return abv.N;
    }

    protected abs P() {
        return abv.O;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        super.a(afs2, n2, n3, n4, n5, f2, 0);
        if (afs2.E) {
            return;
        }
        if (n5 >= 7) {
            int n7 = 3 + n6;
            for (int i2 = 0; i2 < n7; ++i2) {
                if (afs2.s.nextInt(15) > n5) continue;
                this.a(afs2, n2, n3, n4, new abu(this.i(), 1, 0));
            }
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        if (n2 == 7) {
            return this.P();
        }
        return this.i();
    }

    @Override
    public int a(Random random) {
        return 1;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return this.i();
    }

    @Override
    public void a(px px2) {
        this.a = new pw[8];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = px2.a(this.N() + "_stage_" + i2);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        return afs2.e(n2, n3, n4) != 7;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        this.m(afs2, n2, n3, n4);
    }
}

