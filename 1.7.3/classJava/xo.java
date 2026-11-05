/*
 * Decompiled with CFR 0.152.
 */
public class xo
implements ps {
    public abu[] a = new abu[36];
    public abu[] b = new abu[4];
    public int c;
    private abu f;
    public xq d;
    private abu g;
    public boolean e;

    public xo(xq xq2) {
        this.d = xq2;
    }

    public abu h() {
        if (this.c < 9 && this.c >= 0) {
            return this.a[this.c];
        }
        return null;
    }

    public static int i() {
        return 9;
    }

    private int c(abs abs2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null || this.a[i2].b() != abs2) continue;
            return i2;
        }
        return -1;
    }

    private int c(abs abs2, int n2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null || this.a[i2].b() != abs2 || this.a[i2].k() != n2) continue;
            return i2;
        }
        return -1;
    }

    private int d(abu abu2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null || this.a[i2].b() != abu2.b() || !this.a[i2].f() || this.a[i2].b >= this.a[i2].e() || this.a[i2].b >= this.d() || this.a[i2].h() && this.a[i2].k() != abu2.k() || !abu.a(this.a[i2], abu2)) continue;
            return i2;
        }
        return -1;
    }

    public int j() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] != null) continue;
            return i2;
        }
        return -1;
    }

    public void a(abs abs2, int n2, boolean bl2, boolean bl3) {
        int n3 = -1;
        this.f = this.h();
        n3 = bl2 ? this.c(abs2, n2) : this.c(abs2);
        if (n3 >= 0 && n3 < 9) {
            this.c = n3;
            return;
        }
        if (bl3 && abs2 != null) {
            int n4 = this.j();
            if (n4 >= 0 && n4 < 9) {
                this.c = n4;
            }
            this.b(abs2, n2);
        }
    }

    public void c(int n2) {
        if (n2 > 0) {
            n2 = 1;
        }
        if (n2 < 0) {
            n2 = -1;
        }
        this.c -= n2;
        while (this.c < 0) {
            this.c += 9;
        }
        while (this.c >= 9) {
            this.c -= 9;
        }
    }

    public int a(abs abs2, int n2) {
        abu abu2;
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 < this.a.length; ++n3) {
            abu2 = this.a[n3];
            if (abu2 == null || abs2 != null && abu2.b() != abs2 || n2 > -1 && abu2.k() != n2) continue;
            n4 += abu2.b;
            this.a[n3] = null;
        }
        for (n3 = 0; n3 < this.b.length; ++n3) {
            abu2 = this.b[n3];
            if (abu2 == null || abs2 != null && abu2.b() != abs2 || n2 > -1 && abu2.k() != n2) continue;
            n4 += abu2.b;
            this.b[n3] = null;
        }
        if (this.g != null) {
            if (abs2 != null && this.g.b() != abs2) {
                return n4;
            }
            if (n2 > -1 && this.g.k() != n2) {
                return n4;
            }
            n4 += this.g.b;
            this.b((abu)null);
        }
        return n4;
    }

    public void b(abs abs2, int n2) {
        if (abs2 != null) {
            if (this.f != null && this.f.x() && this.c(this.f.b(), this.f.j()) == this.c) {
                return;
            }
            int n3 = this.c(abs2, n2);
            if (n3 >= 0) {
                int n4 = this.a[n3].b;
                this.a[n3] = this.a[this.c];
                this.a[this.c] = new abu(abs2, n4, n2);
            } else {
                this.a[this.c] = new abu(abs2, 1, n2);
            }
        }
    }

    private int e(abu abu2) {
        int n2;
        abs abs2 = abu2.b();
        int n3 = abu2.b;
        if (abu2.e() == 1) {
            int n4 = this.j();
            if (n4 < 0) {
                return n3;
            }
            if (this.a[n4] == null) {
                this.a[n4] = abu.b(abu2);
            }
            return 0;
        }
        int n5 = this.d(abu2);
        if (n5 < 0) {
            n5 = this.j();
        }
        if (n5 < 0) {
            return n3;
        }
        if (this.a[n5] == null) {
            this.a[n5] = new abu(abs2, 0, abu2.k());
            if (abu2.p()) {
                this.a[n5].d((dg)abu2.q().b());
            }
        }
        if ((n2 = n3) > this.a[n5].e() - this.a[n5].b) {
            n2 = this.a[n5].e() - this.a[n5].b;
        }
        if (n2 > this.d() - this.a[n5].b) {
            n2 = this.d() - this.a[n5].b;
        }
        if (n2 == 0) {
            return n3;
        }
        this.a[n5].b += n2;
        this.a[n5].c = 5;
        return n3 -= n2;
    }

    public void k() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null) continue;
            this.a[i2].a(this.d.o, this.d, i2, this.c == i2);
        }
    }

    public boolean a(abs abs2) {
        int n2 = this.c(abs2);
        if (n2 < 0) {
            return false;
        }
        if (--this.a[n2].b <= 0) {
            this.a[n2] = null;
        }
        return true;
    }

    public boolean b(abs abs2) {
        int n2 = this.c(abs2);
        return n2 >= 0;
    }

    public boolean a(abu abu2) {
        if (abu2 == null || abu2.b == 0 || abu2.b() == null) {
            return false;
        }
        try {
            if (!abu2.i()) {
                int n2;
                do {
                    n2 = abu2.b;
                    abu2.b = this.e(abu2);
                } while (abu2.b > 0 && abu2.b < n2);
                if (abu2.b == n2 && this.d.bE.d) {
                    abu2.b = 0;
                    return true;
                }
                return abu2.b < n2;
            }
            int n3 = this.j();
            if (n3 >= 0) {
                this.a[n3] = abu.b(abu2);
                this.a[n3].c = 5;
                abu2.b = 0;
                return true;
            }
            if (this.d.bE.d) {
                abu2.b = 0;
                return true;
            }
            return false;
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Adding item to inventory");
            k k2 = b2.a("Item being added");
            k2.a("Item ID", abs.b(abu2.b()));
            k2.a("Item data", abu2.k());
            k2.a("Item name", new xp(this, abu2));
            throw new s(b2);
        }
    }

    @Override
    public abu a(int n2, int n3) {
        abu[] abuArray = this.a;
        if (n2 >= this.a.length) {
            abuArray = this.b;
            n2 -= this.a.length;
        }
        if (abuArray[n2] != null) {
            if (abuArray[n2].b <= n3) {
                abu abu2 = abuArray[n2];
                abuArray[n2] = null;
                return abu2;
            }
            abu abu3 = abuArray[n2].a(n3);
            if (abuArray[n2].b == 0) {
                abuArray[n2] = null;
            }
            return abu3;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        abu[] abuArray = this.a;
        if (n2 >= this.a.length) {
            abuArray = this.b;
            n2 -= this.a.length;
        }
        if (abuArray[n2] != null) {
            abu abu2 = abuArray[n2];
            abuArray[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        abu[] abuArray = this.a;
        if (n2 >= abuArray.length) {
            n2 -= abuArray.length;
            abuArray = this.b;
        }
        abuArray[n2] = abu2;
    }

    public float a(ahz ahz2) {
        float f2 = 1.0f;
        if (this.a[this.c] != null) {
            f2 *= this.a[this.c].a(ahz2);
        }
        return f2;
    }

    public dp a(dp dp2) {
        dg dg2;
        int n2;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            if (this.a[n2] == null) continue;
            dg2 = new dg();
            dg2.a("Slot", (byte)n2);
            this.a[n2].b(dg2);
            dp2.a(dg2);
        }
        for (n2 = 0; n2 < this.b.length; ++n2) {
            if (this.b[n2] == null) continue;
            dg2 = new dg();
            dg2.a("Slot", (byte)(n2 + 100));
            this.b[n2].b(dg2);
            dp2.a(dg2);
        }
        return dp2;
    }

    public void b(dp dp2) {
        this.a = new abu[36];
        this.b = new abu[4];
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg2 = dp2.b(i2);
            int n2 = dg2.d("Slot") & 0xFF;
            abu abu2 = abu.a(dg2);
            if (abu2 == null) continue;
            if (n2 >= 0 && n2 < this.a.length) {
                this.a[n2] = abu2;
            }
            if (n2 < 100 || n2 >= this.b.length + 100) continue;
            this.b[n2 - 100] = abu2;
        }
    }

    @Override
    public int a() {
        return this.a.length + 4;
    }

    @Override
    public abu a(int n2) {
        abu[] abuArray = this.a;
        if (n2 >= abuArray.length) {
            n2 -= abuArray.length;
            abuArray = this.b;
        }
        return abuArray[n2];
    }

    @Override
    public String b() {
        return "container.inventory";
    }

    @Override
    public boolean k_() {
        return false;
    }

    @Override
    public int d() {
        return 64;
    }

    public boolean b(ahz ahz2) {
        if (ahz2.o().l()) {
            return true;
        }
        abu abu2 = this.a(this.c);
        if (abu2 != null) {
            return abu2.b(ahz2);
        }
        return false;
    }

    public abu d(int n2) {
        return this.b[n2];
    }

    public int l() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == null || !(this.b[i2].b() instanceof zs)) continue;
            int n3 = ((zs)this.b[i2].b()).c;
            n2 += n3;
        }
        return n2;
    }

    public void a(float f2) {
        if ((f2 /= 4.0f) < 1.0f) {
            f2 = 1.0f;
        }
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == null || !(this.b[i2].b() instanceof zs)) continue;
            this.b[i2].a((int)f2, (rm)this.d);
            if (this.b[i2].b != 0) continue;
            this.b[i2] = null;
        }
    }

    public void m() {
        int n2;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            if (this.a[n2] == null) continue;
            this.d.a(this.a[n2], true, false);
            this.a[n2] = null;
        }
        for (n2 = 0; n2 < this.b.length; ++n2) {
            if (this.b[n2] == null) continue;
            this.d.a(this.b[n2], true, false);
            this.b[n2] = null;
        }
    }

    @Override
    public void e() {
        this.e = true;
    }

    public void b(abu abu2) {
        this.g = abu2;
    }

    public abu o() {
        return this.g;
    }

    @Override
    public boolean a(xq xq2) {
        if (this.d.K) {
            return false;
        }
        return !(xq2.f(this.d) > 64.0);
    }

    public boolean c(abu abu2) {
        int n2;
        for (n2 = 0; n2 < this.b.length; ++n2) {
            if (this.b[n2] == null || !this.b[n2].a(abu2)) continue;
            return true;
        }
        for (n2 = 0; n2 < this.a.length; ++n2) {
            if (this.a[n2] == null || !this.a[n2].a(abu2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void f() {
    }

    @Override
    public void l_() {
    }

    @Override
    public boolean b(int n2, abu abu2) {
        return true;
    }

    public void b(xo xo2) {
        int n2;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            this.a[n2] = abu.b(xo2.a[n2]);
        }
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.b[n2] = abu.b(xo2.b[n2]);
        }
        this.c = xo2.c;
    }
}

