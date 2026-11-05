/*
 * Decompiled with CFR 0.152.
 */
public class mq {
    public afs a;
    public mp b;
    private agb c = agb.a;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o = -1;

    public mq(afs afs2) {
        this.a = afs2;
    }

    public void a(agb agb2) {
        this.c = agb2;
        agb2.a(this.b.bE);
        this.b.q();
    }

    public agb b() {
        return this.c;
    }

    public boolean d() {
        return this.c.d();
    }

    public void b(agb agb2) {
        if (this.c == agb.a) {
            this.c = agb2;
        }
        this.a(this.c);
    }

    public void a() {
        ++this.i;
        if (this.j) {
            int n2 = this.i - this.n;
            ahz ahz2 = this.a.a(this.k, this.l, this.m);
            if (ahz2.o() == avk.a) {
                this.j = false;
            } else {
                float f2 = ahz2.a(this.b, this.b.o, this.k, this.l, this.m) * (float)(n2 + 1);
                int n3 = (int)(f2 * 10.0f);
                if (n3 != this.o) {
                    this.a.d(this.b.x(), this.k, this.l, this.m, n3);
                    this.o = n3;
                }
                if (f2 >= 1.0f) {
                    this.j = false;
                    this.b(this.k, this.l, this.m);
                }
            }
        } else if (this.d) {
            ahz ahz3 = this.a.a(this.f, this.g, this.h);
            if (ahz3.o() == avk.a) {
                this.a.d(this.b.x(), this.f, this.g, this.h, -1);
                this.o = -1;
                this.d = false;
            } else {
                int n4 = this.i - this.e;
                float f3 = ahz3.a(this.b, this.b.o, this.f, this.g, this.h) * (float)(n4 + 1);
                int n5 = (int)(f3 * 10.0f);
                if (n5 != this.o) {
                    this.a.d(this.b.x(), this.f, this.g, this.h, n5);
                    this.o = n5;
                }
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        if (this.c.c() && !this.b.d(n2, n3, n4)) {
            return;
        }
        if (this.d()) {
            if (!this.a.a(null, n2, n3, n4, n5)) {
                this.b(n2, n3, n4);
            }
            return;
        }
        this.a.a(null, n2, n3, n4, n5);
        this.e = this.i;
        float f2 = 1.0f;
        ahz ahz2 = this.a.a(n2, n3, n4);
        if (ahz2.o() != avk.a) {
            ahz2.a(this.a, n2, n3, n4, this.b);
            f2 = ahz2.a(this.b, this.b.o, n2, n3, n4);
        }
        if (ahz2.o() != avk.a && f2 >= 1.0f) {
            this.b(n2, n3, n4);
        } else {
            this.d = true;
            this.f = n2;
            this.g = n3;
            this.h = n4;
            int n6 = (int)(f2 * 10.0f);
            this.a.d(this.b.x(), n2, n3, n4, n6);
            this.o = n6;
        }
    }

    public void a(int n2, int n3, int n4) {
        if (n2 == this.f && n3 == this.g && n4 == this.h) {
            int n5 = this.i - this.e;
            ahz ahz2 = this.a.a(n2, n3, n4);
            if (ahz2.o() != avk.a) {
                float f2 = ahz2.a(this.b, this.b.o, n2, n3, n4) * (float)(n5 + 1);
                if (f2 >= 0.7f) {
                    this.d = false;
                    this.a.d(this.b.x(), n2, n3, n4, -1);
                    this.b(n2, n3, n4);
                } else if (!this.j) {
                    this.d = false;
                    this.j = true;
                    this.k = n2;
                    this.l = n3;
                    this.m = n4;
                    this.n = this.e;
                }
            }
        }
    }

    public void c(int n2, int n3, int n4) {
        this.d = false;
        this.a.d(this.b.x(), this.f, this.g, this.h, -1);
    }

    private boolean d(int n2, int n3, int n4) {
        ahz ahz2 = this.a.a(n2, n3, n4);
        int n5 = this.a.e(n2, n3, n4);
        ahz2.a(this.a, n2, n3, n4, n5, this.b);
        boolean bl2 = this.a.f(n2, n3, n4);
        if (bl2) {
            ahz2.b(this.a, n2, n3, n4, n5);
        }
        return bl2;
    }

    public boolean b(int n2, int n3, int n4) {
        if (this.c.c() && !this.b.d(n2, n3, n4)) {
            return false;
        }
        if (this.c.d() && this.b.bd() != null && this.b.bd().b() instanceof acy) {
            return false;
        }
        ahz ahz2 = this.a.a(n2, n3, n4);
        int n5 = this.a.e(n2, n3, n4);
        this.a.a(this.b, 2001, n2, n3, n4, ahz.b(ahz2) + (this.a.e(n2, n3, n4) << 12));
        boolean bl2 = this.d(n2, n3, n4);
        if (this.d()) {
            this.b.a.a(new fy(n2, n3, n4, this.a));
        } else {
            abu abu2 = this.b.bE();
            boolean bl3 = this.b.a(ahz2);
            if (abu2 != null) {
                abu2.a(this.a, ahz2, n2, n3, n4, this.b);
                if (abu2.b == 0) {
                    this.b.bF();
                }
            }
            if (bl2 && bl3) {
                ahz2.a(this.a, this.b, n2, n3, n4, n5);
            }
        }
        return bl2;
    }

    public boolean a(xq xq2, afs afs2, abu abu2) {
        int n2 = abu2.b;
        int n3 = abu2.k();
        abu abu3 = abu2.a(afs2, xq2);
        if (abu3 != abu2 || abu3 != null && (abu3.b != n2 || abu3.n() > 0 || abu3.k() != n3)) {
            xq2.bm.a[xq2.bm.c] = abu3;
            if (this.d()) {
                abu3.b = n2;
                if (abu3.g()) {
                    abu3.b(n3);
                }
            }
            if (abu3.b == 0) {
                xq2.bm.a[xq2.bm.c] = null;
            }
            if (!xq2.bx()) {
                ((mp)xq2).a(xq2.bn);
            }
            return true;
        }
        return false;
    }

    public boolean a(xq xq2, afs afs2, abu abu2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if ((!xq2.am() || xq2.bd() == null) && afs2.a(n2, n3, n4).a(afs2, n2, n3, n4, xq2, n5, f2, f3, f4)) {
            return true;
        }
        if (abu2 == null) {
            return false;
        }
        if (this.d()) {
            int n6 = abu2.k();
            int n7 = abu2.b;
            boolean bl2 = abu2.a(xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
            abu2.b(n6);
            abu2.b = n7;
            return bl2;
        }
        return abu2.a(xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
    }

    public void a(mm mm2) {
        this.a = mm2;
    }
}

