/*
 * Decompiled with CFR 0.152.
 */
public class uc
extends sz {
    private xm a;

    public uc(xm xm2) {
        this.a = xm2;
        this.a(5);
    }

    @Override
    public boolean a() {
        if (!this.a.Y()) {
            return false;
        }
        if (this.a.L()) {
            return false;
        }
        if (!this.a.D) {
            return false;
        }
        if (this.a.H) {
            return false;
        }
        xq xq2 = this.a.b();
        if (xq2 == null) {
            return false;
        }
        if (this.a.f(xq2) > 16.0) {
            return false;
        }
        return xq2.bo instanceof yj;
    }

    @Override
    public void c() {
        this.a.m().h();
    }

    @Override
    public void d() {
        this.a.a_((xq)null);
    }
}

