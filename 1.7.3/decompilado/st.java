/*
 * Decompiled with CFR 0.152.
 */
public abstract class st
extends sz {
    protected rn a;
    protected int b;
    protected int c;
    protected int d;
    protected aje e;
    boolean f;
    float g;
    float h;

    public st(rn rn2) {
        this.a = rn2;
    }

    @Override
    public boolean a() {
        if (!this.a.E) {
            return false;
        }
        um um2 = this.a.m();
        aww aww2 = um2.e();
        if (aww2 == null || aww2.b() || !um2.c()) {
            return false;
        }
        for (int i2 = 0; i2 < Math.min(aww2.e() + 2, aww2.d()); ++i2) {
            awv awv2 = aww2.a(i2);
            this.b = awv2.a;
            this.c = awv2.b + 1;
            this.d = awv2.c;
            if (this.a.e(this.b, this.a.t, this.d) > 2.25) continue;
            this.e = this.a(this.b, this.c, this.d);
            if (this.e == null) continue;
            return true;
        }
        this.b = oy.c(this.a.s);
        this.c = oy.c(this.a.t + 1.0);
        this.d = oy.c(this.a.u);
        this.e = this.a(this.b, this.c, this.d);
        return this.e != null;
    }

    @Override
    public boolean b() {
        return !this.f;
    }

    @Override
    public void c() {
        this.f = false;
        this.g = (float)((double)((float)this.b + 0.5f) - this.a.s);
        this.h = (float)((double)((float)this.d + 0.5f) - this.a.u);
    }

    @Override
    public void e() {
        float f2 = (float)((double)((float)this.b + 0.5f) - this.a.s);
        float f3 = (float)((double)((float)this.d + 0.5f) - this.a.u);
        float f4 = this.g * f2 + this.h * f3;
        if (f4 < 0.0f) {
            this.f = true;
        }
    }

    private aje a(int n2, int n3, int n4) {
        ahz ahz2 = this.a.o.a(n2, n3, n4);
        if (ahz2 != aie.ao) {
            return null;
        }
        return (aje)ahz2;
    }
}

