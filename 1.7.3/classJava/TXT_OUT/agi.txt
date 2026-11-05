/*
 * Decompiled with CFR 0.152.
 */
public class agi
implements agc {
    private int a;
    private int b;
    private aoo[][] c;
    private boolean d;
    private afs e;

    public agi(afs afs2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        aoo aoo2;
        int n9;
        int n10;
        this.e = afs2;
        this.a = n2 - n8 >> 4;
        this.b = n4 - n8 >> 4;
        int n11 = n5 + n8 >> 4;
        int n12 = n7 + n8 >> 4;
        this.c = new aoo[n11 - this.a + 1][n12 - this.b + 1];
        this.d = true;
        for (n10 = this.a; n10 <= n11; ++n10) {
            for (n9 = this.b; n9 <= n12; ++n9) {
                aoo2 = afs2.e(n10, n9);
                if (aoo2 == null) continue;
                this.c[n10 - this.a][n9 - this.b] = aoo2;
            }
        }
        for (n10 = n2 >> 4; n10 <= n5 >> 4; ++n10) {
            for (n9 = n4 >> 4; n9 <= n7 >> 4; ++n9) {
                aoo2 = this.c[n10 - this.a][n9 - this.b];
                if (aoo2 == null || aoo2.c(n3, n6)) continue;
                this.d = false;
            }
        }
    }

    @Override
    public boolean T() {
        return this.d;
    }

    @Override
    public ahz a(int n2, int n3, int n4) {
        ahz ahz2 = aie.a;
        if (n3 >= 0 && n3 < 256) {
            aoo aoo2;
            int n5 = (n2 >> 4) - this.a;
            int n6 = (n4 >> 4) - this.b;
            if (n5 >= 0 && n5 < this.c.length && n6 >= 0 && n6 < this.c[n5].length && (aoo2 = this.c[n5][n6]) != null) {
                ahz2 = aoo2.a(n2 & 0xF, n3, n4 & 0xF);
            }
        }
        return ahz2;
    }

    @Override
    public ani o(int n2, int n3, int n4) {
        int n5 = (n2 >> 4) - this.a;
        int n6 = (n4 >> 4) - this.b;
        return this.c[n5][n6].e(n2 & 0xF, n3, n4 & 0xF);
    }

    @Override
    public int c(int n2, int n3, int n4, int n5) {
        int n6 = this.a(age.a, n2, n3, n4);
        int n7 = this.a(age.b, n2, n3, n4);
        if (n7 < n5) {
            n7 = n5;
        }
        return n6 << 20 | n7 << 4;
    }

    @Override
    public int e(int n2, int n3, int n4) {
        if (n3 < 0) {
            return 0;
        }
        if (n3 >= 256) {
            return 0;
        }
        int n5 = (n2 >> 4) - this.a;
        int n6 = (n4 >> 4) - this.b;
        return this.c[n5][n6].c(n2 & 0xF, n3, n4 & 0xF);
    }

    @Override
    public agl a(int n2, int n3) {
        return this.e.a(n2, n3);
    }

    @Override
    public ayq V() {
        return this.e.V();
    }

    @Override
    public boolean c(int n2, int n3, int n4) {
        return this.a(n2, n3, n4).o() == avk.a;
    }

    public int a(age age2, int n2, int n3, int n4) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        if (n3 < 0 || n3 >= 256 || n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 > 30000000) {
            return age2.c;
        }
        if (age2 == age.a && this.e.t.g) {
            return 0;
        }
        if (this.a(n2, n3, n4).n()) {
            int n5 = this.b(age2, n2, n3 + 1, n4);
            int n6 = this.b(age2, n2 + 1, n3, n4);
            int n7 = this.b(age2, n2 - 1, n3, n4);
            int n8 = this.b(age2, n2, n3, n4 + 1);
            int n9 = this.b(age2, n2, n3, n4 - 1);
            if (n6 > n5) {
                n5 = n6;
            }
            if (n7 > n5) {
                n5 = n7;
            }
            if (n8 > n5) {
                n5 = n8;
            }
            if (n9 > n5) {
                n5 = n9;
            }
            return n5;
        }
        int n10 = (n2 >> 4) - this.a;
        int n11 = (n4 >> 4) - this.b;
        return this.c[n10][n11].a(age2, n2 & 0xF, n3, n4 & 0xF);
    }

    public int b(age age2, int n2, int n3, int n4) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        if (n3 < 0 || n3 >= 256 || n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 > 30000000) {
            return age2.c;
        }
        int n5 = (n2 >> 4) - this.a;
        int n6 = (n4 >> 4) - this.b;
        return this.c[n5][n6].a(age2, n2 & 0xF, n3, n4 & 0xF);
    }

    @Override
    public int R() {
        return 256;
    }

    @Override
    public int e(int n2, int n3, int n4, int n5) {
        return this.a(n2, n3, n4).c(this, n2, n3, n4, n5);
    }
}

