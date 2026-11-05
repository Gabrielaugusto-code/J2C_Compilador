/*
 * Decompiled with CFR 0.152.
 */
public class bjz {
    private final azi a;
    private final bjw b;
    private int c = -1;
    private int d = -1;
    private int e = -1;
    private abu f;
    private float g;
    private float h;
    private int i;
    private boolean j;
    private agb k = agb.b;
    private int l;

    public bjz(azi azi2, bjw bjw2) {
        this.a = azi2;
        this.b = bjw2;
    }

    public static void a(azi azi2, bjz bjz2, int n2, int n3, int n4, int n5) {
        if (!azi2.f.a(azi2.h, n2, n3, n4, n5)) {
            bjz2.a(n2, n3, n4, n5);
        }
    }

    public void a(xq xq2) {
        this.k.a(xq2.bE);
    }

    public boolean a() {
        return false;
    }

    public void a(agb agb2) {
        this.k = agb2;
        this.k.a(this.a.h.bE);
    }

    public void b(xq xq2) {
        xq2.y = -180.0f;
    }

    public boolean b() {
        return this.k.e();
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        abu abu2;
        if (this.k.c() && !this.a.h.d(n2, n3, n4)) {
            return false;
        }
        if (this.k.d() && this.a.h.bd() != null && this.a.h.bd().b() instanceof acy) {
            return false;
        }
        bka bka2 = this.a.f;
        ahz ahz2 = bka2.a(n2, n3, n4);
        if (ahz2.o() == avk.a) {
            return false;
        }
        bka2.c(2001, n2, n3, n4, ahz.b(ahz2) + (bka2.e(n2, n3, n4) << 12));
        int n6 = bka2.e(n2, n3, n4);
        boolean bl2 = bka2.f(n2, n3, n4);
        if (bl2) {
            ahz2.b((afs)bka2, n2, n3, n4, n6);
        }
        this.d = -1;
        if (!this.k.d() && (abu2 = this.a.h.bE()) != null) {
            abu2.a(bka2, ahz2, n2, n3, n4, this.a.h);
            if (abu2.b == 0) {
                this.a.h.bF();
            }
        }
        return bl2;
    }

    public void b(int n2, int n3, int n4, int n5) {
        if (this.k.c() && !this.a.h.d(n2, n3, n4)) {
            return;
        }
        if (this.k.d()) {
            this.b.a(new iz(0, n2, n3, n4, n5));
            bjz.a(this.a, this, n2, n3, n4, n5);
            this.i = 5;
        } else if (!this.j || !this.a(n2, n3, n4)) {
            boolean bl2;
            if (this.j) {
                this.b.a(new iz(1, this.c, this.d, this.e, n5));
            }
            this.b.a(new iz(0, n2, n3, n4, n5));
            ahz ahz2 = this.a.f.a(n2, n3, n4);
            boolean bl3 = bl2 = ahz2.o() != avk.a;
            if (bl2 && this.g == 0.0f) {
                ahz2.a((afs)this.a.f, n2, n3, n4, this.a.h);
            }
            if (bl2 && ahz2.a(this.a.h, this.a.h.o, n2, n3, n4) >= 1.0f) {
                this.a(n2, n3, n4, n5);
            } else {
                this.j = true;
                this.c = n2;
                this.d = n3;
                this.e = n4;
                this.f = this.a.h.bd();
                this.g = 0.0f;
                this.h = 0.0f;
                this.a.f.d(this.a.h.x(), this.c, this.d, this.e, (int)(this.g * 10.0f) - 1);
            }
        }
    }

    public void c() {
        if (this.j) {
            this.b.a(new iz(1, this.c, this.d, this.e, -1));
        }
        this.j = false;
        this.g = 0.0f;
        this.a.f.d(this.a.h.x(), this.c, this.d, this.e, -1);
    }

    public void c(int n2, int n3, int n4, int n5) {
        this.k();
        if (this.i > 0) {
            --this.i;
            return;
        }
        if (this.k.d()) {
            this.i = 5;
            this.b.a(new iz(0, n2, n3, n4, n5));
            bjz.a(this.a, this, n2, n3, n4, n5);
            return;
        }
        if (this.a(n2, n3, n4)) {
            ahz ahz2 = this.a.f.a(n2, n3, n4);
            if (ahz2.o() == avk.a) {
                this.j = false;
                return;
            }
            this.g += ahz2.a(this.a.h, this.a.h.o, n2, n3, n4);
            if (this.h % 4.0f == 0.0f) {
                this.a.X().a(new btb(new brq(ahz2.H.e()), (ahz2.H.c() + 1.0f) / 8.0f, ahz2.H.d() * 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f));
            }
            this.h += 1.0f;
            if (this.g >= 1.0f) {
                this.j = false;
                this.b.a(new iz(2, n2, n3, n4, n5));
                this.a(n2, n3, n4, n5);
                this.g = 0.0f;
                this.h = 0.0f;
                this.i = 5;
            }
            this.a.f.d(this.a.h.x(), this.c, this.d, this.e, (int)(this.g * 10.0f) - 1);
        } else {
            this.b(n2, n3, n4, n5);
        }
    }

    public float d() {
        if (this.k.d()) {
            return 5.0f;
        }
        return 4.5f;
    }

    public void e() {
        this.k();
        if (this.b.b().d()) {
            this.b.b().a();
        } else if (this.b.b().f() != null) {
            this.b.b().e().a(this.b.b().f());
        } else {
            this.b.b().e().a(new fh("Disconnected from server"));
        }
    }

    private boolean a(int n2, int n3, int n4) {
        boolean bl2;
        abu abu2 = this.a.h.bd();
        boolean bl3 = bl2 = this.f == null && abu2 == null;
        if (this.f != null && abu2 != null) {
            bl2 = abu2.b() == this.f.b() && abu.a(abu2, this.f) && (abu2.g() || abu2.k() == this.f.k());
        }
        return n2 == this.c && n3 == this.d && n4 == this.e && bl2;
    }

    private void k() {
        int n2 = this.a.h.bm.c;
        if (n2 != this.l) {
            this.l = n2;
            this.b.a(new jc(this.l));
        }
    }

    public boolean a(xq xq2, afs afs2, abu abu2, int n2, int n3, int n4, int n5, ayp ayp2) {
        zy zy2;
        this.k();
        float f2 = (float)ayp2.c - (float)n2;
        float f3 = (float)ayp2.d - (float)n3;
        float f4 = (float)ayp2.e - (float)n4;
        boolean bl2 = false;
        if ((!xq2.am() || xq2.bd() == null) && afs2.a(n2, n3, n4).a(afs2, n2, n3, n4, xq2, n5, f2, f3, f4)) {
            bl2 = true;
        }
        if (!bl2 && abu2 != null && abu2.b() instanceof zy && !(zy2 = (zy)abu2.b()).a(afs2, n2, n3, n4, n5, xq2, abu2)) {
            return false;
        }
        this.b.a(new jf(n2, n3, n4, n5, xq2.bm.h(), f2, f3, f4));
        if (bl2) {
            return true;
        }
        if (abu2 == null) {
            return false;
        }
        if (this.k.d()) {
            int n6 = abu2.k();
            int n7 = abu2.b;
            boolean bl3 = abu2.a(xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
            abu2.b(n6);
            abu2.b = n7;
            return bl3;
        }
        return abu2.a(xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
    }

    public boolean a(xq xq2, afs afs2, abu abu2) {
        this.k();
        this.b.a(new jf(-1, -1, -1, 255, xq2.bm.h(), 0.0f, 0.0f, 0.0f));
        int n2 = abu2.b;
        abu abu3 = abu2.a(afs2, xq2);
        if (abu3 != abu2 || abu3 != null && abu3.b != n2) {
            xq2.bm.a[xq2.bm.c] = abu3;
            if (abu3.b == 0) {
                xq2.bm.a[xq2.bm.c] = null;
            }
            return true;
        }
        return false;
    }

    public bkf a(afs afs2, oh oh2) {
        return new bkf(this.a, afs2, this.a.M(), this.b, oh2);
    }

    public void a(xq xq2, qr qr2) {
        this.k();
        this.b.a(new ir(qr2, is.b));
        xq2.r(qr2);
    }

    public boolean b(xq xq2, qr qr2) {
        this.k();
        this.b.a(new ir(qr2, is.a));
        return xq2.q(qr2);
    }

    public abu a(int n2, int n3, int n4, int n5, xq xq2) {
        short s2 = xq2.bo.a(xq2.bm);
        abu abu2 = xq2.bo.a(n3, n4, n5, xq2);
        this.b.a(new io(n2, n3, n4, n5, abu2, s2));
        return abu2;
    }

    public void a(int n2, int n3) {
        this.b.a(new in(n2, n3));
    }

    public void a(abu abu2, int n2) {
        if (this.k.d()) {
            this.b.a(new jd(n2, abu2));
        }
    }

    public void a(abu abu2) {
        if (this.k.d() && abu2 != null) {
            this.b.a(new jd(-1, abu2));
        }
    }

    public void c(xq xq2) {
        this.k();
        this.b.a(new iz(5, 0, 0, 0, 255));
        xq2.bz();
    }

    public boolean f() {
        return this.k.e();
    }

    public boolean g() {
        return !this.k.d();
    }

    public boolean h() {
        return this.k.d();
    }

    public boolean i() {
        return this.k.d();
    }

    public boolean j() {
        return this.a.h.al() && this.a.h.m instanceof uz;
    }
}

