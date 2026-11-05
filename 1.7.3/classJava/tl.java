/*
 * Decompiled with CFR 0.152.
 */
public class tl
extends sz {
    private ru a;
    private rm b;
    private double c;
    private double d;
    private double e;
    private double f;
    private float g;

    public tl(ru ru2, double d2, float f2) {
        this.a = ru2;
        this.f = d2;
        this.g = f2;
        this.a(1);
    }

    @Override
    public boolean a() {
        this.b = this.a.o();
        if (this.b == null) {
            return false;
        }
        if (this.b.f(this.a) > (double)(this.g * this.g)) {
            return false;
        }
        ayp ayp2 = uo.a(this.a, 16, 7, this.a.o.V().a(this.b.s, this.b.t, this.b.u));
        if (ayp2 == null) {
            return false;
        }
        this.c = ayp2.c;
        this.d = ayp2.d;
        this.e = ayp2.e;
        return true;
    }

    @Override
    public boolean b() {
        return !this.a.m().g() && this.b.Y() && this.b.f(this.a) < (double)(this.g * this.g);
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void c() {
        this.a.m().a(this.c, this.d, this.e, this.f);
    }
}

