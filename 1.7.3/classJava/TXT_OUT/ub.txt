/*
 * Decompiled with CFR 0.152.
 */
public class ub
extends sz {
    private ru a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private xq h;
    private int i;
    private boolean j;
    private abs k;
    private boolean l;
    private boolean m;

    public ub(ru ru2, double d2, abs abs2, boolean bl2) {
        this.a = ru2;
        this.b = d2;
        this.k = abs2;
        this.l = bl2;
        this.a(3);
    }

    @Override
    public boolean a() {
        if (this.i > 0) {
            --this.i;
            return false;
        }
        this.h = this.a.o.a((qr)this.a, 10.0);
        if (this.h == null) {
            return false;
        }
        abu abu2 = this.h.bE();
        if (abu2 == null) {
            return false;
        }
        return abu2.b() == this.k;
    }

    @Override
    public boolean b() {
        if (this.l) {
            if (this.a.f(this.h) < 36.0) {
                if (this.h.e(this.c, this.d, this.e) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs((double)this.h.z - this.f) > 5.0 || Math.abs((double)this.h.y - this.g) > 5.0) {
                    return false;
                }
            } else {
                this.c = this.h.s;
                this.d = this.h.t;
                this.e = this.h.u;
            }
            this.f = this.h.z;
            this.g = this.h.y;
        }
        return this.a();
    }

    @Override
    public void c() {
        this.c = this.h.s;
        this.d = this.h.t;
        this.e = this.h.u;
        this.j = true;
        this.m = this.a.m().a();
        this.a.m().a(false);
    }

    @Override
    public void d() {
        this.h = null;
        this.a.m().h();
        this.i = 100;
        this.j = false;
        this.a.m().a(this.m);
    }

    @Override
    public void e() {
        this.a.j().a(this.h, 30.0f, (float)this.a.bv());
        if (this.a.f(this.h) < 6.25) {
            this.a.m().h();
        } else {
            this.a.m().a(this.h, this.b);
        }
    }

    public boolean f() {
        return this.j;
    }
}

