/*
 * Decompiled with CFR 0.152.
 */
public class zj
implements ps {
    private final afd a;
    private abu[] b = new abu[3];
    private final xq c;
    private afe d;
    private int e;

    public zj(xq xq2, afd afd2) {
        this.c = xq2;
        this.a = afd2;
    }

    @Override
    public int a() {
        return this.b.length;
    }

    @Override
    public abu a(int n2) {
        return this.b[n2];
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.b[n2] != null) {
            if (n2 == 2) {
                abu abu2 = this.b[n2];
                this.b[n2] = null;
                return abu2;
            }
            if (this.b[n2].b <= n3) {
                abu abu3 = this.b[n2];
                this.b[n2] = null;
                if (this.d(n2)) {
                    this.h();
                }
                return abu3;
            }
            abu abu4 = this.b[n2].a(n3);
            if (this.b[n2].b == 0) {
                this.b[n2] = null;
            }
            if (this.d(n2)) {
                this.h();
            }
            return abu4;
        }
        return null;
    }

    private boolean d(int n2) {
        return n2 == 0 || n2 == 1;
    }

    @Override
    public abu a_(int n2) {
        if (this.b[n2] != null) {
            abu abu2 = this.b[n2];
            this.b[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.b[n2] = abu2;
        if (abu2 != null && abu2.b > this.d()) {
            abu2.b = this.d();
        }
        if (this.d(n2)) {
            this.h();
        }
    }

    @Override
    public String b() {
        return "mob.villager";
    }

    @Override
    public boolean k_() {
        return false;
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public boolean a(xq xq2) {
        return this.a.b() == xq2;
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

    @Override
    public void e() {
        this.h();
    }

    public void h() {
        this.d = null;
        abu abu2 = this.b[0];
        abu abu3 = this.b[1];
        if (abu2 == null) {
            abu2 = abu3;
            abu3 = null;
        }
        if (abu2 == null) {
            this.a(2, null);
        } else {
            aff aff2 = this.a.b(this.c);
            if (aff2 != null) {
                afe afe2 = aff2.a(abu2, abu3, this.e);
                if (afe2 != null && !afe2.g()) {
                    this.d = afe2;
                    this.a(2, afe2.d().m());
                } else if (abu3 != null) {
                    afe2 = aff2.a(abu3, abu2, this.e);
                    if (afe2 != null && !afe2.g()) {
                        this.d = afe2;
                        this.a(2, afe2.d().m());
                    } else {
                        this.a(2, null);
                    }
                } else {
                    this.a(2, null);
                }
            }
        }
        this.a.a_(this.a(2));
    }

    public afe i() {
        return this.d;
    }

    public void c(int n2) {
        this.e = n2;
        this.h();
    }
}

