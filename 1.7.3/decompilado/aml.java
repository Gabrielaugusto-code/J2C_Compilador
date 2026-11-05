/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aml
extends aii
implements aif {
    private final ahz a;
    private pw b;

    protected aml(ahz ahz2) {
        this.a = ahz2;
        this.a(true);
        float f2 = 0.125f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.25f, 0.5f + f2);
        this.a((aak)null);
    }

    @Override
    protected boolean a(ahz ahz2) {
        return ahz2 == aie.ak;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        float f2;
        super.a(afs2, n2, n3, n4, random);
        if (afs2.k(n2, n3 + 1, n4) >= 9 && random.nextInt((int)(25.0f / (f2 = this.n(afs2, n2, n3, n4))) + 1) == 0) {
            int n5 = afs2.e(n2, n3, n4);
            if (n5 < 7) {
                afs2.a(n2, n3, n4, ++n5, 2);
            } else {
                if (afs2.a(n2 - 1, n3, n4) == this.a) {
                    return;
                }
                if (afs2.a(n2 + 1, n3, n4) == this.a) {
                    return;
                }
                if (afs2.a(n2, n3, n4 - 1) == this.a) {
                    return;
                }
                if (afs2.a(n2, n3, n4 + 1) == this.a) {
                    return;
                }
                int n6 = random.nextInt(4);
                int n7 = n2;
                int n8 = n4;
                if (n6 == 0) {
                    --n7;
                }
                if (n6 == 1) {
                    ++n7;
                }
                if (n6 == 2) {
                    --n8;
                }
                if (n6 == 3) {
                    ++n8;
                }
                ahz ahz2 = afs2.a(n7, n3 - 1, n8);
                if (afs2.a((int)n7, (int)n3, (int)n8).J == avk.a && (ahz2 == aie.ak || ahz2 == aie.d || ahz2 == aie.c)) {
                    afs2.b(n7, n3, n8, this.a);
                }
            }
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
                ahz ahz10 = afs2.a(i2, n3 - 1, i3);
                float f3 = 0.0f;
                if (ahz10 == aie.ak) {
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
    public int i(int n2) {
        int n3 = n2 * 32;
        int n4 = 255 - n2 * 8;
        int n5 = n2 * 4;
        return n3 << 16 | n4 << 8 | n5;
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        return this.i(agc2.e(n2, n3, n4));
    }

    @Override
    public void g() {
        float f2 = 0.125f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.25f, 0.5f + f2);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.F = (float)(agc2.e(n2, n3, n4) * 2 + 2) / 16.0f;
        float f2 = 0.125f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, (float)this.F, 0.5f + f2);
    }

    @Override
    public int b() {
        return 19;
    }

    public int e(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        if (n5 < 7) {
            return -1;
        }
        if (agc2.a(n2 - 1, n3, n4) == this.a) {
            return 0;
        }
        if (agc2.a(n2 + 1, n3, n4) == this.a) {
            return 1;
        }
        if (agc2.a(n2, n3, n4 - 1) == this.a) {
            return 2;
        }
        if (agc2.a(n2, n3, n4 + 1) == this.a) {
            return 3;
        }
        return -1;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        super.a(afs2, n2, n3, n4, n5, f2, n6);
        if (afs2.E) {
            return;
        }
        abs abs2 = null;
        if (this.a == aie.aK) {
            abs2 = abv.bb;
        }
        if (this.a == aie.ba) {
            abs2 = abv.bc;
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            if (afs2.s.nextInt(15) > n5) continue;
            this.a(afs2, n2, n3, n4, new abu(abs2));
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 1;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        if (this.a == aie.aK) {
            return abv.bb;
        }
        if (this.a == aie.ba) {
            return abv.bc;
        }
        return abs.d(0);
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_disconnected");
        this.b = px2.a(this.N() + "_connected");
    }

    public pw i() {
        return this.b;
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

