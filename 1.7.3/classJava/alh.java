/*
 * Decompiled with CFR 0.152.
 */
public class alh {
    private final afs a;
    private final int b;
    private final int c;
    private final int d;
    private int e = 0;
    private r f;
    private int g;
    private int h;

    public alh(afs afs2, int n2, int n3, int n4, int n5) {
        this.a = afs2;
        this.b = n5;
        this.d = alg.a[n5][0];
        this.c = alg.a[n5][1];
        int n6 = n3;
        while (n3 > n6 - 21 && n3 > 0 && this.a(afs2.a(n2, n3 - 1, n4))) {
            --n3;
        }
        int n7 = this.a(n2, n3, n4, this.d) - 1;
        if (n7 >= 0) {
            this.f = new r(n2 + n7 * p.a[this.d], n3, n4 + n7 * p.b[this.d]);
            this.h = this.a(this.f.a, this.f.b, this.f.c, this.c);
            if (this.h < 2 || this.h > 21) {
                this.f = null;
                this.h = 0;
            }
        }
        if (this.f != null) {
            this.g = this.a();
        }
    }

    protected int a(int n2, int n3, int n4, int n5) {
        ahz ahz2;
        ahz ahz3;
        int n6;
        int n7 = p.a[n5];
        int n8 = p.b[n5];
        for (n6 = 0; n6 < 22 && this.a(ahz3 = this.a.a(n2 + n7 * n6, n3, n4 + n8 * n6)) && (ahz2 = this.a.a(n2 + n7 * n6, n3 - 1, n4 + n8 * n6)) == aie.Z; ++n6) {
        }
        ahz3 = this.a.a(n2 + n7 * n6, n3, n4 + n8 * n6);
        if (ahz3 == aie.Z) {
            return n6;
        }
        return 0;
    }

    protected int a() {
        int n2;
        int n3;
        int n4;
        int n5;
        this.g = 0;
        block0: while (this.g < 21) {
            n5 = this.f.b + this.g;
            for (n4 = 0; n4 < this.h; ++n4) {
                n3 = this.f.a + n4 * p.a[alg.a[this.b][1]];
                n2 = this.f.c + n4 * p.b[alg.a[this.b][1]];
                ahz ahz2 = this.a.a(n3, n5, n2);
                if (!this.a(ahz2)) break block0;
                if (ahz2 == aie.aO) {
                    ++this.e;
                }
                if (n4 == 0 ? (ahz2 = this.a.a(n3 + p.a[alg.a[this.b][0]], n5, n2 + p.b[alg.a[this.b][0]])) != aie.Z : n4 == this.h - 1 && (ahz2 = this.a.a(n3 + p.a[alg.a[this.b][1]], n5, n2 + p.b[alg.a[this.b][1]])) != aie.Z) break block0;
            }
            ++this.g;
        }
        for (n5 = 0; n5 < this.h; ++n5) {
            n4 = this.f.a + n5 * p.a[alg.a[this.b][1]];
            n3 = this.f.b + this.g;
            n2 = this.f.c + n5 * p.b[alg.a[this.b][1]];
            if (this.a.a(n4, n3, n2) == aie.Z) continue;
            this.g = 0;
            break;
        }
        if (this.g > 21 || this.g < 3) {
            this.f = null;
            this.h = 0;
            this.g = 0;
            return 0;
        }
        return this.g;
    }

    protected boolean a(ahz ahz2) {
        return ahz2.J == avk.a || ahz2 == aie.ab || ahz2 == aie.aO;
    }

    public boolean b() {
        return this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21;
    }

    public void c() {
        for (int i2 = 0; i2 < this.h; ++i2) {
            int n2 = this.f.a + p.a[this.c] * i2;
            int n3 = this.f.c + p.b[this.c] * i2;
            for (int i3 = 0; i3 < this.g; ++i3) {
                int n4 = this.f.b + i3;
                this.a.d(n2, n4, n3, aie.aO, this.b, 2);
            }
        }
    }

    static /* synthetic */ int a(alh alh2) {
        return alh2.e;
    }

    static /* synthetic */ int b(alh alh2) {
        return alh2.h;
    }

    static /* synthetic */ int c(alh alh2) {
        return alh2.g;
    }
}

