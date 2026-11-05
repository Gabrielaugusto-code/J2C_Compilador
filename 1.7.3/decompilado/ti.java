/*
 * Decompiled with CFR 0.152.
 */
public class ti
extends sz {
    private ru a;
    private up b;
    private int c = -1;
    private int d = -1;

    public ti(ru ru2) {
        this.a = ru2;
        this.a(1);
    }

    @Override
    public boolean a() {
        int n2 = oy.c(this.a.s);
        int n3 = oy.c(this.a.t);
        int n4 = oy.c(this.a.u);
        if (this.a.o.w() && !this.a.o.Q() && this.a.o.a(n2, n4).e() || this.a.o.t.g) {
            return false;
        }
        if (this.a.aH().nextInt(50) != 0) {
            return false;
        }
        if (this.c != -1 && this.a.e(this.c, this.a.t, this.d) < 4.0) {
            return false;
        }
        uq uq2 = this.a.o.A.a(n2, n3, n4, 14);
        if (uq2 == null) {
            return false;
        }
        this.b = uq2.c(n2, n3, n4);
        return this.b != null;
    }

    @Override
    public boolean b() {
        return !this.a.m().g();
    }

    @Override
    public void c() {
        this.c = -1;
        if (this.a.e(this.b.a(), this.b.b, this.b.c()) > 256.0) {
            ayp ayp2 = uo.a(this.a, 14, 3, this.a.o.V().a((double)this.b.a() + 0.5, this.b.b(), (double)this.b.c() + 0.5));
            if (ayp2 != null) {
                this.a.m().a(ayp2.c, ayp2.d, ayp2.e, 1.0);
            }
        } else {
            this.a.m().a((double)this.b.a() + 0.5, this.b.b(), (double)this.b.c() + 0.5, 1.0);
        }
    }

    @Override
    public void d() {
        this.c = this.b.a();
        this.d = this.b.c();
        this.b = null;
    }
}

