/*
 * Decompiled with CFR 0.152.
 */
public class zp {
    private final int a;
    public final ps f;
    public int g;
    public int h;
    public int i;

    public zp(ps ps2, int n2, int n3, int n4) {
        this.f = ps2;
        this.a = n2;
        this.h = n3;
        this.i = n4;
    }

    public void a(abu abu2, abu abu3) {
        if (abu2 == null || abu3 == null) {
            return;
        }
        if (abu2.b() != abu3.b()) {
            return;
        }
        int n2 = abu3.b - abu2.b;
        if (n2 > 0) {
            this.a(abu2, n2);
        }
    }

    protected void a(abu abu2, int n2) {
    }

    protected void b(abu abu2) {
    }

    public void a(xq xq2, abu abu2) {
        this.f();
    }

    public boolean a(abu abu2) {
        return true;
    }

    public abu d() {
        return this.f.a(this.a);
    }

    public boolean e() {
        return this.d() != null;
    }

    public void c(abu abu2) {
        this.f.a(this.a, abu2);
        this.f();
    }

    public void f() {
        this.f.e();
    }

    public int a() {
        return this.f.d();
    }

    public pw c() {
        return null;
    }

    public abu a(int n2) {
        return this.f.a(this.a, n2);
    }

    public boolean a(ps ps2, int n2) {
        return ps2 == this.f && n2 == this.a;
    }

    public boolean a(xq xq2) {
        return true;
    }

    public boolean b() {
        return true;
    }
}

