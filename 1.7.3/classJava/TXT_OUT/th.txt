/*
 * Decompiled with CFR 0.152.
 */
public class th
extends sz {
    afs a;
    ru b;
    int c;
    double d;
    boolean e;
    aww f;
    Class g;
    private int h;
    private double i;
    private double j;
    private double k;

    public th(ru ru2, Class clazz, double d2, boolean bl2) {
        this(ru2, d2, bl2);
        this.g = clazz;
    }

    public th(ru ru2, double d2, boolean bl2) {
        this.b = ru2;
        this.a = ru2.o;
        this.d = d2;
        this.e = bl2;
        this.a(3);
    }

    @Override
    public boolean a() {
        rm rm2 = this.b.o();
        if (rm2 == null) {
            return false;
        }
        if (!rm2.Y()) {
            return false;
        }
        if (this.g != null && !this.g.isAssignableFrom(rm2.getClass())) {
            return false;
        }
        this.f = this.b.m().a(rm2);
        return this.f != null;
    }

    @Override
    public boolean b() {
        rm rm2 = this.b.o();
        if (rm2 == null) {
            return false;
        }
        if (!rm2.Y()) {
            return false;
        }
        if (!this.e) {
            return !this.b.m().g();
        }
        return this.b.b(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u));
    }

    @Override
    public void c() {
        this.b.m().a(this.f, this.d);
        this.h = 0;
    }

    @Override
    public void d() {
        this.b.m().h();
    }

    @Override
    public void e() {
        rm rm2 = this.b.o();
        this.b.j().a(rm2, 30.0f, 30.0f);
        double d2 = this.b.e(rm2.s, rm2.C.b, rm2.u);
        double d3 = this.b.M * 2.0f * (this.b.M * 2.0f) + rm2.M;
        --this.h;
        if ((this.e || this.b.n().a(rm2)) && this.h <= 0 && (this.i == 0.0 && this.j == 0.0 && this.k == 0.0 || rm2.e(this.i, this.j, this.k) >= 1.0 || this.b.aH().nextFloat() < 0.05f)) {
            this.i = rm2.s;
            this.j = rm2.C.b;
            this.k = rm2.u;
            this.h = 4 + this.b.aH().nextInt(7);
            if (d2 > 1024.0) {
                this.h += 10;
            } else if (d2 > 256.0) {
                this.h += 5;
            }
            if (!this.b.m().a(rm2, this.d)) {
                this.h += 15;
            }
        }
        this.c = Math.max(this.c - 1, 0);
        if (d2 <= d3 && this.c <= 20) {
            this.c = 20;
            if (this.b.bd() != null) {
                this.b.aZ();
            }
            this.b.n(rm2);
        }
    }
}

