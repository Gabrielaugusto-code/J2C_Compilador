/*
 * Decompiled with CFR 0.152.
 */
public class anx
extends ani
implements qc {
    private static final int[] k = new int[]{0};
    private static final int[] l = new int[]{2, 1};
    private static final int[] m = new int[]{1};
    private abu[] n = new abu[3];
    public int a;
    public int i;
    public int j;
    private String o;

    @Override
    public int a() {
        return this.n.length;
    }

    @Override
    public abu a(int n2) {
        return this.n[n2];
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.n[n2] != null) {
            if (this.n[n2].b <= n3) {
                abu abu2 = this.n[n2];
                this.n[n2] = null;
                return abu2;
            }
            abu abu3 = this.n[n2].a(n3);
            if (this.n[n2].b == 0) {
                this.n[n2] = null;
            }
            return abu3;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (this.n[n2] != null) {
            abu abu2 = this.n[n2];
            this.n[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.n[n2] = abu2;
        if (abu2 != null && abu2.b > this.d()) {
            abu2.b = this.d();
        }
    }

    @Override
    public String b() {
        return this.k_() ? this.o : "container.furnace";
    }

    @Override
    public boolean k_() {
        return this.o != null && this.o.length() > 0;
    }

    public void a(String string) {
        this.o = string;
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        dp dp2 = dg2.c("Items", 10);
        this.n = new abu[this.a()];
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            byte by2 = dg3.d("Slot");
            if (by2 < 0 || by2 >= this.n.length) continue;
            this.n[by2] = abu.a(dg3);
        }
        this.a = dg2.e("BurnTime");
        this.j = dg2.e("CookTime");
        this.i = anx.a(this.n[1]);
        if (dg2.b("CustomName", 8)) {
            this.o = dg2.j("CustomName");
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("BurnTime", (short)this.a);
        dg2.a("CookTime", (short)this.j);
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.n.length; ++i2) {
            if (this.n[i2] == null) continue;
            dg dg3 = new dg();
            dg3.a("Slot", (byte)i2);
            this.n[i2].b(dg3);
            dp2.a(dg3);
        }
        dg2.a("Items", dp2);
        if (this.k_()) {
            dg2.a("CustomName", this.o);
        }
    }

    @Override
    public int d() {
        return 64;
    }

    public int d(int n2) {
        return this.j * n2 / 200;
    }

    public int e(int n2) {
        if (this.i == 0) {
            this.i = 200;
        }
        return this.a * n2 / this.i;
    }

    public boolean i() {
        return this.a > 0;
    }

    @Override
    public void h() {
        boolean bl2 = this.a > 0;
        boolean bl3 = false;
        if (this.a > 0) {
            --this.a;
        }
        if (!this.b.E) {
            if (this.a != 0 || this.n[1] != null && this.n[0] != null) {
                if (this.a == 0 && this.k()) {
                    this.i = this.a = anx.a(this.n[1]);
                    if (this.a > 0) {
                        bl3 = true;
                        if (this.n[1] != null) {
                            --this.n[1].b;
                            if (this.n[1].b == 0) {
                                abs abs2 = this.n[1].b().t();
                                abu abu2 = this.n[1] = abs2 != null ? new abu(abs2) : null;
                            }
                        }
                    }
                }
                if (this.i() && this.k()) {
                    ++this.j;
                    if (this.j == 200) {
                        this.j = 0;
                        this.j();
                        bl3 = true;
                    }
                } else {
                    this.j = 0;
                }
            }
            if (bl2 != this.a > 0) {
                bl3 = true;
                ajv.a(this.a > 0, this.b, this.c, this.d, this.e);
            }
        }
        if (bl3) {
            this.e();
        }
    }

    private boolean k() {
        if (this.n[0] == null) {
            return false;
        }
        abu abu2 = adr.a().a(this.n[0]);
        if (abu2 == null) {
            return false;
        }
        if (this.n[2] == null) {
            return true;
        }
        if (!this.n[2].a(abu2)) {
            return false;
        }
        if (this.n[2].b < this.d() && this.n[2].b < this.n[2].e()) {
            return true;
        }
        return this.n[2].b < abu2.e();
    }

    public void j() {
        if (!this.k()) {
            return;
        }
        abu abu2 = adr.a().a(this.n[0]);
        if (this.n[2] == null) {
            this.n[2] = abu2.m();
        } else if (this.n[2].b() == abu2.b()) {
            ++this.n[2].b;
        }
        --this.n[0].b;
        if (this.n[0].b <= 0) {
            this.n[0] = null;
        }
    }

    public static int a(abu abu2) {
        if (abu2 == null) {
            return 0;
        }
        abs abs2 = abu2.b();
        if (abs2 instanceof zy && ahz.a(abs2) != aie.a) {
            ahz ahz2 = ahz.a(abs2);
            if (ahz2 == aie.bx) {
                return 150;
            }
            if (ahz2.o() == avk.d) {
                return 300;
            }
            if (ahz2 == aie.ci) {
                return 16000;
            }
        }
        if (abs2 instanceof aax && ((aax)abs2).j().equals("WOOD")) {
            return 200;
        }
        if (abs2 instanceof acy && ((acy)abs2).j().equals("WOOD")) {
            return 200;
        }
        if (abs2 instanceof abr && ((abr)abs2).i().equals("WOOD")) {
            return 200;
        }
        if (abs2 == abv.y) {
            return 100;
        }
        if (abs2 == abv.h) {
            return 1600;
        }
        if (abs2 == abv.at) {
            return 20000;
        }
        if (abs2 == abs.a(aie.g)) {
            return 100;
        }
        if (abs2 == abv.bj) {
            return 2400;
        }
        return 0;
    }

    public static boolean b(abu abu2) {
        return anx.a(abu2) > 0;
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
        if (n2 == 2) {
            return false;
        }
        if (n2 == 1) {
            return anx.b(abu2);
        }
        return true;
    }

    @Override
    public int[] c(int n2) {
        if (n2 == 0) {
            return l;
        }
        if (n2 == 1) {
            return k;
        }
        return m;
    }

    @Override
    public boolean a(int n2, abu abu2, int n3) {
        return this.b(n2, abu2);
    }

    @Override
    public boolean b(int n2, abu abu2, int n3) {
        return n3 != 0 || n2 != 1 || abu2.b() == abv.ar;
    }
}

