/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class anh
extends ani
implements ps {
    public static final qm[][] a = new qm[][]{{qm.c, qm.e}, {qm.m, qm.j}, {qm.g}, {qm.l}};
    private long i;
    private float j;
    private boolean k;
    private int l = -1;
    private int m;
    private int n;
    private abu o;
    private String p;

    @Override
    public void h() {
        if (this.b.I() % 80L == 0L) {
            this.y();
            this.x();
        }
    }

    private void x() {
        if (this.k && this.l > 0 && !this.b.E && this.m > 0) {
            double d2 = this.l * 10 + 10;
            int n2 = 0;
            if (this.l >= 4 && this.m == this.n) {
                n2 = 1;
            }
            ayk ayk2 = ayk.a().a(this.c, this.d, this.e, this.c + 1, this.d + 1, this.e + 1).b(d2, d2, d2);
            ayk2.e = this.b.R();
            List list = this.b.a(xq.class, ayk2);
            for (xq xq2 : list) {
                xq2.c(new qn(this.m, 180, n2, true));
            }
            if (this.l >= 4 && this.m != this.n && this.n > 0) {
                for (xq xq2 : list) {
                    xq2.c(new qn(this.n, 180, 0, true));
                }
            }
        }
    }

    private void y() {
        int n2 = this.l;
        if (!this.b.i(this.c, this.d + 1, this.e)) {
            this.k = false;
            this.l = 0;
        } else {
            int n3;
            this.k = true;
            this.l = 0;
            int n4 = 1;
            while (n4 <= 4 && (n3 = this.d - n4) >= 0) {
                boolean bl2 = true;
                block1: for (int i2 = this.c - n4; i2 <= this.c + n4 && bl2; ++i2) {
                    for (int i3 = this.e - n4; i3 <= this.e + n4; ++i3) {
                        ahz ahz2 = this.b.a(i2, n3, i3);
                        if (ahz2 == aie.bE || ahz2 == aie.R || ahz2 == aie.ah || ahz2 == aie.S) continue;
                        bl2 = false;
                        continue block1;
                    }
                }
                if (!bl2) break;
                this.l = n4++;
            }
            if (this.l == 0) {
                this.k = false;
            }
        }
        if (!this.b.E && this.l == 4 && n2 < this.l) {
            for (xq xq2 : this.b.a(xq.class, ayk.a().a(this.c, this.d, this.e, this.c, this.d - 4, this.e).b(10.0, 5.0, 10.0))) {
                xq2.a(nt.K);
            }
        }
    }

    public float i() {
        if (!this.k) {
            return 0.0f;
        }
        int n2 = (int)(this.b.I() - this.i);
        this.i = this.b.I();
        if (n2 > 1) {
            this.j -= (float)n2 / 40.0f;
            if (this.j < 0.0f) {
                this.j = 0.0f;
            }
        }
        this.j += 0.025f;
        if (this.j > 1.0f) {
            this.j = 1.0f;
        }
        return this.j;
    }

    public int j() {
        return this.m;
    }

    public int k() {
        return this.n;
    }

    public int l() {
        return this.l;
    }

    public void c(int n2) {
        this.l = n2;
    }

    public void d(int n2) {
        this.m = 0;
        for (int i2 = 0; i2 < this.l && i2 < 3; ++i2) {
            for (qm qm2 : a[i2]) {
                if (qm2.H != n2) continue;
                this.m = n2;
                return;
            }
        }
    }

    public void e(int n2) {
        this.n = 0;
        if (this.l >= 4) {
            for (int i2 = 0; i2 < 4; ++i2) {
                for (qm qm2 : a[i2]) {
                    if (qm2.H != n2) continue;
                    this.n = n2;
                    return;
                }
            }
        }
    }

    @Override
    public fk m() {
        dg dg2 = new dg();
        this.b(dg2);
        return new fw(this.c, this.d, this.e, 3, dg2);
    }

    @Override
    public double n() {
        return 65536.0;
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.m = dg2.f("Primary");
        this.n = dg2.f("Secondary");
        this.l = dg2.f("Levels");
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Primary", this.m);
        dg2.a("Secondary", this.n);
        dg2.a("Levels", this.l);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public abu a(int n2) {
        if (n2 == 0) {
            return this.o;
        }
        return null;
    }

    @Override
    public abu a(int n2, int n3) {
        if (n2 == 0 && this.o != null) {
            if (n3 >= this.o.b) {
                abu abu2 = this.o;
                this.o = null;
                return abu2;
            }
            this.o.b -= n3;
            return new abu(this.o.b(), n3, this.o.k());
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (n2 == 0 && this.o != null) {
            abu abu2 = this.o;
            this.o = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        if (n2 == 0) {
            this.o = abu2;
        }
    }

    @Override
    public String b() {
        return this.k_() ? this.p : "container.beacon";
    }

    @Override
    public boolean k_() {
        return this.p != null && this.p.length() > 0;
    }

    public void a(String string) {
        this.p = string;
    }

    @Override
    public int d() {
        return 1;
    }

    @Override
    public boolean a(xq xq2) {
        if (this.b.o(this.c, this.d, this.e) != this) {
            return false;
        }
        return !(xq2.e((double)this.c + 0.5, (double)this.d + 0.5, (double)this.e + 0.5) > 64.0);
    }

    @Override
    public void f() {
    }

    @Override
    public void l_() {
    }

    @Override
    public boolean b(int n2, abu abu2) {
        return abu2.b() == abv.bC || abu2.b() == abv.i || abu2.b() == abv.k || abu2.b() == abv.j;
    }
}

