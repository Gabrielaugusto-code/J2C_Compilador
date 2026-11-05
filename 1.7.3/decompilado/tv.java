/*
 * Decompiled with CFR 0.152.
 */
public class tv
extends sz {
    private ru a;
    private up b;

    public tv(ru ru2) {
        this.a = ru2;
    }

    @Override
    public boolean a() {
        if (this.a.o.w()) {
            return false;
        }
        uq uq2 = this.a.o.A.a(oy.c(this.a.s), oy.c(this.a.t), oy.c(this.a.u), 16);
        if (uq2 == null) {
            return false;
        }
        this.b = uq2.b(oy.c(this.a.s), oy.c(this.a.t), oy.c(this.a.u));
        if (this.b == null) {
            return false;
        }
        return (double)this.b.c(oy.c(this.a.s), oy.c(this.a.t), oy.c(this.a.u)) < 2.25;
    }

    @Override
    public boolean b() {
        if (this.a.o.w()) {
            return false;
        }
        return !this.b.g && this.b.a(oy.c(this.a.s), oy.c(this.a.u));
    }

    @Override
    public void c() {
        this.a.m().b(false);
        this.a.m().c(false);
    }

    @Override
    public void d() {
        this.a.m().b(true);
        this.a.m().c(true);
        this.b = null;
    }

    @Override
    public void e() {
        this.b.e();
    }
}

