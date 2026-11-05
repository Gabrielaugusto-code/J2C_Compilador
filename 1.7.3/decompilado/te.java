/*
 * Decompiled with CFR 0.152.
 */
public class te
extends sz {
    private rn b;
    protected qr a;
    private float c;
    private int d;
    private float e;
    private Class f;

    public te(rn rn2, Class clazz, float f2) {
        this.b = rn2;
        this.f = clazz;
        this.c = f2;
        this.e = 0.02f;
        this.a(2);
    }

    public te(rn rn2, Class clazz, float f2, float f3) {
        this.b = rn2;
        this.f = clazz;
        this.c = f2;
        this.e = f3;
        this.a(2);
    }

    @Override
    public boolean a() {
        if (this.b.aH().nextFloat() >= this.e) {
            return false;
        }
        if (this.b.o() != null) {
            this.a = this.b.o();
        }
        this.a = this.f == xq.class ? this.b.o.a((qr)this.b, (double)this.c) : this.b.o.a(this.f, this.b.C.b(this.c, 3.0, this.c), (qr)this.b);
        return this.a != null;
    }

    @Override
    public boolean b() {
        if (!this.a.Y()) {
            return false;
        }
        if (this.b.f(this.a) > (double)(this.c * this.c)) {
            return false;
        }
        return this.d > 0;
    }

    @Override
    public void c() {
        this.d = 40 + this.b.aH().nextInt(40);
    }

    @Override
    public void d() {
        this.a = null;
    }

    @Override
    public void e() {
        this.b.j().a(this.a.s, this.a.t + (double)this.a.g(), this.a.u, 10.0f, this.b.bv());
        --this.d;
    }
}

