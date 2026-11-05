/*
 * Decompiled with CFR 0.152.
 */
public class tz
extends sz {
    wq a;
    rm b;

    public tz(wq wq2) {
        this.a = wq2;
        this.a(1);
    }

    @Override
    public boolean a() {
        rm rm2 = this.a.o();
        return this.a.cb() > 0 || rm2 != null && this.a.f(rm2) < 9.0;
    }

    @Override
    public void c() {
        this.a.m().h();
        this.b = this.a.o();
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void e() {
        if (this.b == null) {
            this.a.a(-1);
            return;
        }
        if (this.a.f(this.b) > 49.0) {
            this.a.a(-1);
            return;
        }
        if (!this.a.n().a(this.b)) {
            this.a.a(-1);
            return;
        }
        this.a.a(1);
    }
}

