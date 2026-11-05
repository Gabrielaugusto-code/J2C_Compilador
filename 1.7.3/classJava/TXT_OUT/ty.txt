/*
 * Decompiled with CFR 0.152.
 */
public class ty
extends sz {
    private rx a;
    private boolean b;

    public ty(rx rx2) {
        this.a = rx2;
        this.a(5);
    }

    @Override
    public boolean a() {
        if (!this.a.bZ()) {
            return false;
        }
        if (this.a.L()) {
            return false;
        }
        if (!this.a.D) {
            return false;
        }
        rm rm2 = this.a.cb();
        if (rm2 == null) {
            return true;
        }
        if (this.a.f(rm2) < 144.0 && rm2.aI() != null) {
            return false;
        }
        return this.b;
    }

    @Override
    public void c() {
        this.a.m().h();
        this.a.k(true);
    }

    @Override
    public void d() {
        this.a.k(false);
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }
}

