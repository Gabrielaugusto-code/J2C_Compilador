/*
 * Decompiled with CFR 0.152.
 */
public class tg
extends sz {
    private xm b;
    private xm c;
    private afs d;
    private int e;
    uq a;

    public tg(xm xm2) {
        this.b = xm2;
        this.d = xm2.o;
        this.a(3);
    }

    @Override
    public boolean a() {
        if (this.b.d() != 0) {
            return false;
        }
        if (this.b.aH().nextInt(500) != 0) {
            return false;
        }
        this.a = this.d.A.a(oy.c(this.b.s), oy.c(this.b.t), oy.c(this.b.u), 0);
        if (this.a == null) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        qr qr2 = this.d.a(xm.class, this.b.C.b(8.0, 3.0, 8.0), (qr)this.b);
        if (qr2 == null) {
            return false;
        }
        this.c = (xm)qr2;
        return this.c.d() == 0;
    }

    @Override
    public void c() {
        this.e = 300;
        this.b.i(true);
    }

    @Override
    public void d() {
        this.a = null;
        this.c = null;
        this.b.i(false);
    }

    @Override
    public boolean b() {
        return this.e >= 0 && this.f() && this.b.d() == 0;
    }

    @Override
    public void e() {
        --this.e;
        this.b.j().a(this.c, 10.0f, 30.0f);
        if (this.b.f(this.c) > 2.25) {
            this.b.m().a(this.c, 0.25);
        } else if (this.e == 0 && this.c.ca()) {
            this.g();
        }
        if (this.b.aH().nextInt(35) == 0) {
            this.d.a((qr)this.b, (byte)12);
        }
    }

    private boolean f() {
        if (!this.a.i()) {
            return false;
        }
        int n2 = (int)((double)this.a.c() * 0.35);
        return this.a.e() < n2;
    }

    private void g() {
        xm xm2 = this.b.b(this.c);
        this.c.c(6000);
        this.b.c(6000);
        xm2.c(-24000);
        xm2.b(this.b.s, this.b.t, this.b.u, 0.0f, 0.0f);
        this.d.d(xm2);
        this.d.a((qr)xm2, (byte)12);
    }
}

