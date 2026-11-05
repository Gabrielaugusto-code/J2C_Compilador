/*
 * Decompiled with CFR 0.152.
 */
public class sx
extends sz {
    private rx d;
    private rm e;
    afs a;
    private double f;
    private um g;
    private int h;
    float b;
    float c;
    private boolean i;

    public sx(rx rx2, double d2, float f2, float f3) {
        this.d = rx2;
        this.a = rx2.o;
        this.f = d2;
        this.g = rx2.m();
        this.c = f2;
        this.b = f3;
        this.a(3);
    }

    @Override
    public boolean a() {
        rm rm2 = this.d.cb();
        if (rm2 == null) {
            return false;
        }
        if (this.d.ca()) {
            return false;
        }
        if (this.d.f(rm2) < (double)(this.c * this.c)) {
            return false;
        }
        this.e = rm2;
        return true;
    }

    @Override
    public boolean b() {
        return !this.g.g() && this.d.f(this.e) > (double)(this.b * this.b) && !this.d.ca();
    }

    @Override
    public void c() {
        this.h = 0;
        this.i = this.d.m().a();
        this.d.m().a(false);
    }

    @Override
    public void d() {
        this.e = null;
        this.g.h();
        this.d.m().a(this.i);
    }

    @Override
    public void e() {
        this.d.j().a(this.e, 10.0f, (float)this.d.bv());
        if (this.d.ca()) {
            return;
        }
        if (--this.h > 0) {
            return;
        }
        this.h = 10;
        if (this.g.a(this.e, this.f)) {
            return;
        }
        if (this.d.bN()) {
            return;
        }
        if (this.d.f(this.e) < 144.0) {
            return;
        }
        int n2 = oy.c(this.e.s) - 2;
        int n3 = oy.c(this.e.u) - 2;
        int n4 = oy.c(this.e.C.b);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 4; ++i3) {
                if (i2 >= 1 && i3 >= 1 && i2 <= 3 && i3 <= 3 || !afs.a(this.a, n2 + i2, n4 - 1, n3 + i3) || this.a.a(n2 + i2, n4, n3 + i3).r() || this.a.a(n2 + i2, n4 + 1, n3 + i3).r()) continue;
                this.d.b((float)(n2 + i2) + 0.5f, n4, (float)(n3 + i3) + 0.5f, this.d.y, this.d.z);
                this.g.h();
                return;
            }
        }
    }
}

