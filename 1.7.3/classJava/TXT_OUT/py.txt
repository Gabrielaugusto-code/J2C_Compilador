/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class py
implements ps {
    private String a;
    private int b;
    private abu[] c;
    private List d;
    private boolean e;

    public py(String string, boolean bl2, int n2) {
        this.a = string;
        this.e = bl2;
        this.b = n2;
        this.c = new abu[n2];
    }

    public void a(pt pt2) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(pt2);
    }

    public void b(pt pt2) {
        this.d.remove(pt2);
    }

    @Override
    public abu a(int n2) {
        return this.c[n2];
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.c[n2] != null) {
            if (this.c[n2].b <= n3) {
                abu abu2 = this.c[n2];
                this.c[n2] = null;
                this.e();
                return abu2;
            }
            abu abu3 = this.c[n2].a(n3);
            if (this.c[n2].b == 0) {
                this.c[n2] = null;
            }
            this.e();
            return abu3;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (this.c[n2] != null) {
            abu abu2 = this.c[n2];
            this.c[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.c[n2] = abu2;
        if (abu2 != null && abu2.b > this.d()) {
            abu2.b = this.d();
        }
        this.e();
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public boolean k_() {
        return this.e;
    }

    public void a(String string) {
        this.e = true;
        this.a = string;
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public void e() {
        if (this.d != null) {
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                ((pt)this.d.get(i2)).a(this);
            }
        }
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

