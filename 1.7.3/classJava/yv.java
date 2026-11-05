/*
 * Decompiled with CFR 0.152.
 */
public class yv
implements ps {
    private abu[] a;
    private int b;
    private yj c;

    public yv(yj yj2, int n2, int n3) {
        int n4 = n2 * n3;
        this.a = new abu[n4];
        this.c = yj2;
        this.b = n2;
    }

    @Override
    public int a() {
        return this.a.length;
    }

    @Override
    public abu a(int n2) {
        if (n2 >= this.a()) {
            return null;
        }
        return this.a[n2];
    }

    public abu b(int n2, int n3) {
        if (n2 < 0 || n2 >= this.b) {
            return null;
        }
        int n4 = n2 + n3 * this.b;
        return this.a(n4);
    }

    @Override
    public String b() {
        return "container.crafting";
    }

    @Override
    public boolean k_() {
        return false;
    }

    @Override
    public abu a_(int n2) {
        if (this.a[n2] != null) {
            abu abu2 = this.a[n2];
            this.a[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.a[n2] != null) {
            if (this.a[n2].b <= n3) {
                abu abu2 = this.a[n2];
                this.a[n2] = null;
                this.c.a(this);
                return abu2;
            }
            abu abu3 = this.a[n2].a(n3);
            if (this.a[n2].b == 0) {
                this.a[n2] = null;
            }
            this.c.a(this);
            return abu3;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.a[n2] = abu2;
        this.c.a(this);
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public void e() {
    }

    @Override
    public boolean a(xq xq2) {
        return true;
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
}

