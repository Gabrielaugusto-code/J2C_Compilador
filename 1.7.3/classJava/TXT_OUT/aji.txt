/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aji
extends akn {
    int a;
    boolean[] b = new boolean[4];
    int[] M = new int[4];

    protected aji(avk avk2) {
        super(avk2);
    }

    private void n(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        afs2.d(n2, n3, n4, ahz.e(ahz.b(this) + 1), n5, 2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        int n5;
        int n6 = this.e(afs2, n2, n3, n4);
        int n7 = 1;
        if (this.J == avk.i && !afs2.t.f) {
            n7 = 2;
        }
        boolean bl2 = true;
        int n8 = this.a(afs2);
        if (n6 > 0) {
            int n9 = -100;
            this.a = 0;
            n9 = this.a(afs2, n2 - 1, n3, n4, n9);
            n9 = this.a(afs2, n2 + 1, n3, n4, n9);
            n9 = this.a(afs2, n2, n3, n4 - 1, n9);
            n5 = (n9 = this.a(afs2, n2, n3, n4 + 1, n9)) + n7;
            if (n5 >= 8 || n9 < 0) {
                n5 = -1;
            }
            if (this.e(afs2, n2, n3 + 1, n4) >= 0) {
                int n10 = this.e(afs2, n2, n3 + 1, n4);
                n5 = n10 >= 8 ? n10 : n10 + 8;
            }
            if (this.a >= 2 && this.J == avk.h) {
                if (afs2.a(n2, n3 - 1, n4).o().a()) {
                    n5 = 0;
                } else if (afs2.a(n2, n3 - 1, n4).o() == this.J && afs2.e(n2, n3 - 1, n4) == 0) {
                    n5 = 0;
                }
            }
            if (this.J == avk.i && n6 < 8 && n5 < 8 && n5 > n6 && random.nextInt(4) != 0) {
                n8 *= 4;
            }
            if (n5 == n6) {
                if (bl2) {
                    this.n(afs2, n2, n3, n4);
                }
            } else {
                n6 = n5;
                if (n6 < 0) {
                    afs2.f(n2, n3, n4);
                } else {
                    afs2.a(n2, n3, n4, n6, 2);
                    afs2.a(n2, n3, n4, this, n8);
                    afs2.d(n2, n3, n4, this);
                }
            }
        } else {
            this.n(afs2, n2, n3, n4);
        }
        if (this.q(afs2, n2, n3 - 1, n4)) {
            if (this.J == avk.i && afs2.a(n2, n3 - 1, n4).o() == avk.h) {
                afs2.b(n2, n3 - 1, n4, aie.b);
                this.m(afs2, n2, n3 - 1, n4);
                return;
            }
            if (n6 >= 8) {
                this.h(afs2, n2, n3 - 1, n4, n6);
            } else {
                this.h(afs2, n2, n3 - 1, n4, n6 + 8);
            }
        } else if (n6 >= 0 && (n6 == 0 || this.p(afs2, n2, n3 - 1, n4))) {
            boolean[] blArray = this.o(afs2, n2, n3, n4);
            n5 = n6 + n7;
            if (n6 >= 8) {
                n5 = 1;
            }
            if (n5 >= 8) {
                return;
            }
            if (blArray[0]) {
                this.h(afs2, n2 - 1, n3, n4, n5);
            }
            if (blArray[1]) {
                this.h(afs2, n2 + 1, n3, n4, n5);
            }
            if (blArray[2]) {
                this.h(afs2, n2, n3, n4 - 1, n5);
            }
            if (blArray[3]) {
                this.h(afs2, n2, n3, n4 + 1, n5);
            }
        }
    }

    private void h(afs afs2, int n2, int n3, int n4, int n5) {
        if (this.q(afs2, n2, n3, n4)) {
            ahz ahz2 = afs2.a(n2, n3, n4);
            if (this.J == avk.i) {
                this.m(afs2, n2, n3, n4);
            } else {
                ahz2.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            }
            afs2.d(n2, n3, n4, this, n5, 3);
        }
    }

    private int c(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        int n7 = 1000;
        for (int i2 = 0; i2 < 4; ++i2) {
            if (i2 == 0 && n6 == 1 || i2 == 1 && n6 == 0 || i2 == 2 && n6 == 3 || i2 == 3 && n6 == 2) continue;
            int n8 = n2;
            int n9 = n3;
            int n10 = n4;
            if (i2 == 0) {
                --n8;
            }
            if (i2 == 1) {
                ++n8;
            }
            if (i2 == 2) {
                --n10;
            }
            if (i2 == 3) {
                ++n10;
            }
            if (this.p(afs2, n8, n9, n10) || afs2.a(n8, n9, n10).o() == this.J && afs2.e(n8, n9, n10) == 0) continue;
            if (this.p(afs2, n8, n9 - 1, n10)) {
                int n11;
                if (n5 >= 4 || (n11 = this.c(afs2, n8, n9, n10, n5 + 1, i2)) >= n7) continue;
                n7 = n11;
                continue;
            }
            return n5;
        }
        return n7;
    }

    private boolean[] o(afs afs2, int n2, int n3, int n4) {
        int n5;
        int n6;
        for (n6 = 0; n6 < 4; ++n6) {
            this.M[n6] = 1000;
            n5 = n2;
            int n7 = n3;
            int n8 = n4;
            if (n6 == 0) {
                --n5;
            }
            if (n6 == 1) {
                ++n5;
            }
            if (n6 == 2) {
                --n8;
            }
            if (n6 == 3) {
                ++n8;
            }
            if (this.p(afs2, n5, n7, n8) || afs2.a(n5, n7, n8).o() == this.J && afs2.e(n5, n7, n8) == 0) continue;
            this.M[n6] = this.p(afs2, n5, n7 - 1, n8) ? this.c(afs2, n5, n7, n8, 1, n6) : 0;
        }
        n6 = this.M[0];
        for (n5 = 1; n5 < 4; ++n5) {
            if (this.M[n5] >= n6) continue;
            n6 = this.M[n5];
        }
        for (n5 = 0; n5 < 4; ++n5) {
            this.b[n5] = this.M[n5] == n6;
        }
        return this.b;
    }

    private boolean p(afs afs2, int n2, int n3, int n4) {
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2 == aie.ao || ahz2 == aie.av || ahz2 == aie.an || ahz2 == aie.ap || ahz2 == aie.aH) {
            return true;
        }
        if (ahz2.J == avk.E) {
            return true;
        }
        return ahz2.J.c();
    }

    protected int a(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = this.e(afs2, n2, n3, n4);
        if (n6 < 0) {
            return n5;
        }
        if (n6 == 0) {
            ++this.a;
        }
        if (n6 >= 8) {
            n6 = 0;
        }
        return n5 < 0 || n6 < n5 ? n6 : n5;
    }

    private boolean q(afs afs2, int n2, int n3, int n4) {
        avk avk2 = afs2.a(n2, n3, n4).o();
        if (avk2 == this.J) {
            return false;
        }
        if (avk2 == avk.i) {
            return false;
        }
        return !this.p(afs2, n2, n3, n4);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        if (afs2.a(n2, n3, n4) == this) {
            afs2.a(n2, n3, n4, this, this.a(afs2));
        }
    }

    @Override
    public boolean L() {
        return true;
    }
}

