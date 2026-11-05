/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class amy
extends ahz {
    public amy() {
        super(avk.l);
        this.a(true);
        this.a(aak.c);
    }

    @Override
    public void g() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int b() {
        return 20;
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
    public void a(agc agc2, int n2, int n3, int n4) {
        boolean bl2;
        float f2 = 0.0625f;
        int n5 = agc2.e(n2, n3, n4);
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean bl3 = bl2 = n5 > 0;
        if ((n5 & 2) != 0) {
            f6 = Math.max(f6, 0.0625f);
            f3 = 0.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            f5 = 0.0f;
            f8 = 1.0f;
            bl2 = true;
        }
        if ((n5 & 8) != 0) {
            f3 = Math.min(f3, 0.9375f);
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            f5 = 0.0f;
            f8 = 1.0f;
            bl2 = true;
        }
        if ((n5 & 4) != 0) {
            f8 = Math.max(f8, 0.0625f);
            f5 = 0.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            bl2 = true;
        }
        if ((n5 & 1) != 0) {
            f5 = Math.min(f5, 0.9375f);
            f8 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            bl2 = true;
        }
        if (!bl2 && this.a(agc2.a(n2, n3 + 1, n4))) {
            f4 = Math.min(f4, 0.9375f);
            f7 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f5 = 0.0f;
            f8 = 1.0f;
        }
        this.a(f3, f4, f5, f6, f7, f8);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public boolean d(afs afs2, int n2, int n3, int n4, int n5) {
        switch (n5) {
            default: {
                return false;
            }
            case 1: {
                return this.a(afs2.a(n2, n3 + 1, n4));
            }
            case 2: {
                return this.a(afs2.a(n2, n3, n4 + 1));
            }
            case 3: {
                return this.a(afs2.a(n2, n3, n4 - 1));
            }
            case 5: {
                return this.a(afs2.a(n2 - 1, n3, n4));
            }
            case 4: 
        }
        return this.a(afs2.a(n2 + 1, n3, n4));
    }

    private boolean a(ahz ahz2) {
        return ahz2.d() && ahz2.J.c();
    }

    private boolean e(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        int n6 = n5;
        if (n6 > 0) {
            for (int i2 = 0; i2 <= 3; ++i2) {
                int n7 = 1 << i2;
                if ((n5 & n7) == 0 || this.a(afs2.a(n2 + p.a[i2], n3, n4 + p.b[i2])) || afs2.a(n2, n3 + 1, n4) == this && (afs2.e(n2, n3 + 1, n4) & n7) != 0) continue;
                n6 &= ~n7;
            }
        }
        if (n6 == 0 && !this.a(afs2.a(n2, n3 + 1, n4))) {
            return false;
        }
        if (n6 != n5) {
            afs2.a(n2, n3, n4, n6, 2);
        }
        return true;
    }

    @Override
    public int D() {
        return afo.c();
    }

    @Override
    public int i(int n2) {
        return afo.c();
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        return agc2.a(n2, n4).c(n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!afs2.E && !this.e(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (!afs2.E && afs2.s.nextInt(4) == 0) {
            int n5;
            int n6;
            int n7;
            int n8 = 4;
            int n9 = 5;
            boolean bl2 = false;
            block0: for (n7 = n2 - n8; n7 <= n2 + n8; ++n7) {
                for (n6 = n4 - n8; n6 <= n4 + n8; ++n6) {
                    for (n5 = n3 - 1; n5 <= n3 + 1; ++n5) {
                        if (afs2.a(n7, n5, n6) != this || --n9 > 0) continue;
                        bl2 = true;
                        break block0;
                    }
                }
            }
            n7 = afs2.e(n2, n3, n4);
            n6 = afs2.s.nextInt(6);
            n5 = p.e[n6];
            if (n6 == 1 && n3 < 255 && afs2.c(n2, n3 + 1, n4)) {
                if (bl2) {
                    return;
                }
                int n10 = afs2.s.nextInt(16) & n7;
                if (n10 > 0) {
                    for (int i2 = 0; i2 <= 3; ++i2) {
                        if (this.a(afs2.a(n2 + p.a[i2], n3 + 1, n4 + p.b[i2]))) continue;
                        n10 &= ~(1 << i2);
                    }
                    if (n10 > 0) {
                        afs2.d(n2, n3 + 1, n4, this, n10, 2);
                    }
                }
            } else if (n6 >= 2 && n6 <= 5 && (n7 & 1 << n5) == 0) {
                if (bl2) {
                    return;
                }
                ahz ahz2 = afs2.a(n2 + p.a[n5], n3, n4 + p.b[n5]);
                if (ahz2.J == avk.a) {
                    int n11 = n5 + 1 & 3;
                    int n12 = n5 + 3 & 3;
                    if ((n7 & 1 << n11) != 0 && this.a(afs2.a(n2 + p.a[n5] + p.a[n11], n3, n4 + p.b[n5] + p.b[n11]))) {
                        afs2.d(n2 + p.a[n5], n3, n4 + p.b[n5], this, 1 << n11, 2);
                    } else if ((n7 & 1 << n12) != 0 && this.a(afs2.a(n2 + p.a[n5] + p.a[n12], n3, n4 + p.b[n5] + p.b[n12]))) {
                        afs2.d(n2 + p.a[n5], n3, n4 + p.b[n5], this, 1 << n12, 2);
                    } else if ((n7 & 1 << n11) != 0 && afs2.c(n2 + p.a[n5] + p.a[n11], n3, n4 + p.b[n5] + p.b[n11]) && this.a(afs2.a(n2 + p.a[n11], n3, n4 + p.b[n11]))) {
                        afs2.d(n2 + p.a[n5] + p.a[n11], n3, n4 + p.b[n5] + p.b[n11], this, 1 << (n5 + 2 & 3), 2);
                    } else if ((n7 & 1 << n12) != 0 && afs2.c(n2 + p.a[n5] + p.a[n12], n3, n4 + p.b[n5] + p.b[n12]) && this.a(afs2.a(n2 + p.a[n12], n3, n4 + p.b[n12]))) {
                        afs2.d(n2 + p.a[n5] + p.a[n12], n3, n4 + p.b[n5] + p.b[n12], this, 1 << (n5 + 2 & 3), 2);
                    } else if (this.a(afs2.a(n2 + p.a[n5], n3 + 1, n4 + p.b[n5]))) {
                        afs2.d(n2 + p.a[n5], n3, n4 + p.b[n5], this, 0, 2);
                    }
                } else if (ahz2.J.k() && ahz2.d()) {
                    afs2.a(n2, n3, n4, n7 | 1 << n5, 2);
                }
            } else if (n3 > 1) {
                ahz ahz3 = afs2.a(n2, n3 - 1, n4);
                if (ahz3.J == avk.a) {
                    int n13 = afs2.s.nextInt(16) & n7;
                    if (n13 > 0) {
                        afs2.d(n2, n3 - 1, n4, this, n13, 2);
                    }
                } else if (ahz3 == this) {
                    int n14 = afs2.s.nextInt(16) & n7;
                    int n15 = afs2.e(n2, n3 - 1, n4);
                    if (n15 != (n15 | n14)) {
                        afs2.a(n2, n3 - 1, n4, n15 | n14, 2);
                    }
                }
            }
        }
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        int n7 = 0;
        switch (n5) {
            case 2: {
                n7 = 1;
                break;
            }
            case 3: {
                n7 = 4;
                break;
            }
            case 4: {
                n7 = 8;
                break;
            }
            case 5: {
                n7 = 2;
            }
        }
        if (n7 != 0) {
            return n7;
        }
        return n6;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        if (!afs2.E && xq2.bE() != null && xq2.bE().b() == abv.aZ) {
            xq2.a(og.C[ahz.b(this)], 1);
            this.a(afs2, n2, n3, n4, new abu(aie.bd, 1, 0));
        } else {
            super.a(afs2, xq2, n2, n3, n4, n5);
        }
    }
}

