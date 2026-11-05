/*
 * Decompiled with CFR 0.152.
 */
public class sp
extends sz {
    private vm a;
    private xq b;
    private afs c;
    private float d;
    private int e;

    public sp(vm vm2, float f2) {
        this.a = vm2;
        this.c = vm2.o;
        this.d = f2;
        this.a(2);
    }

    @Override
    public boolean a() {
        this.b = this.c.a((qr)this.a, (double)this.d);
        if (this.b == null) {
            return false;
        }
        return this.a(this.b);
    }

    @Override
    public boolean b() {
        if (!this.b.Y()) {
            return false;
        }
        if (this.a.f((qr)this.b) > (double)(this.d * this.d)) {
            return false;
        }
        return this.e > 0 && this.a(this.b);
    }

    @Override
    public void c() {
        this.a.m(true);
        this.e = 40 + this.a.aH().nextInt(40);
    }

    @Override
    public void d() {
        this.a.m(false);
        this.b = null;
    }

    @Override
    public void e() {
        this.a.j().a(this.b.s, this.b.t + (double)this.b.g(), this.b.u, 10.0f, this.a.bv());
        --this.e;
    }

    private boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 == null) {
            return false;
        }
        if (!this.a.bZ() && abu2.b() == abv.aS) {
            return true;
        }
        return this.a.c(abu2);
    }
}

