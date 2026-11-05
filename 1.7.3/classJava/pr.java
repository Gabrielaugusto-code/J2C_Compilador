/*
 * Decompiled with CFR 0.152.
 */
public class pr
implements ps {
    private String a;
    private ps b;
    private ps c;

    public pr(String string, ps ps2, ps ps3) {
        this.a = string;
        if (ps2 == null) {
            ps2 = ps3;
        }
        if (ps3 == null) {
            ps3 = ps2;
        }
        this.b = ps2;
        this.c = ps3;
    }

    @Override
    public int a() {
        return this.b.a() + this.c.a();
    }

    public boolean a(ps ps2) {
        return this.b == ps2 || this.c == ps2;
    }

    @Override
    public String b() {
        if (this.b.k_()) {
            return this.b.b();
        }
        if (this.c.k_()) {
            return this.c.b();
        }
        return this.a;
    }

    @Override
    public boolean k_() {
        return this.b.k_() || this.c.k_();
    }

    @Override
    public abu a(int n2) {
        if (n2 >= this.b.a()) {
            return this.c.a(n2 - this.b.a());
        }
        return this.b.a(n2);
    }

    @Override
    public abu a(int n2, int n3) {
        if (n2 >= this.b.a()) {
            return this.c.a(n2 - this.b.a(), n3);
        }
        return this.b.a(n2, n3);
    }

    @Override
    public abu a_(int n2) {
        if (n2 >= this.b.a()) {
            return this.c.a_(n2 - this.b.a());
        }
        return this.b.a_(n2);
    }

    @Override
    public void a(int n2, abu abu2) {
        if (n2 >= this.b.a()) {
            this.c.a(n2 - this.b.a(), abu2);
        } else {
            this.b.a(n2, abu2);
        }
    }

    @Override
    public int d() {
        return this.b.d();
    }

    @Override
    public void e() {
        this.b.e();
        this.c.e();
    }

    @Override
    public boolean a(xq xq2) {
        return this.b.a(xq2) && this.c.a(xq2);
    }

    @Override
    public void f() {
        this.b.f();
        this.c.f();
    }

    @Override
    public void l_() {
        this.b.l_();
        this.c.l_();
    }

    @Override
    public boolean b(int n2, abu abu2) {
        return true;
    }
}

