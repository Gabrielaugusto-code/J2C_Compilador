/*
 * Decompiled with CFR 0.152.
 */
public class wm
extends wc {
    private int a = -1;

    public wm(afs afs2) {
        super(afs2);
    }

    public wm(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    public int m() {
        return 3;
    }

    @Override
    public ahz o() {
        return aie.W;
    }

    @Override
    public void h() {
        double d2;
        super.h();
        if (this.a > 0) {
            --this.a;
            this.o.a("smoke", this.s, this.t + 0.5, this.u, 0.0, 0.0, 0.0);
        } else if (this.a == 0) {
            this.c(this.v * this.v + this.x * this.x);
        }
        if (this.E && (d2 = this.v * this.v + this.x * this.x) >= (double)0.01f) {
            this.c(d2);
        }
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        double d2 = this.v * this.v + this.x * this.x;
        if (!qf2.c()) {
            this.a(new abu(aie.W, 1), 0.0f);
        }
        if (qf2.o() || qf2.c() || d2 >= (double)0.01f) {
            this.c(d2);
        }
    }

    protected void c(double d2) {
        if (!this.o.E) {
            double d3 = Math.sqrt(d2);
            if (d3 > 5.0) {
                d3 = 5.0;
            }
            this.o.a(this, this.s, this.t, this.u, (float)(4.0 + this.Z.nextDouble() * 1.5 * d3), true);
            this.A();
        }
    }

    @Override
    protected void b(float f2) {
        if (f2 >= 3.0f) {
            float f3 = f2 / 10.0f;
            this.c((double)(f3 * f3));
        }
        super.b(f2);
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.a < 0) {
            this.e();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.e();
        } else {
            super.a(by2);
        }
    }

    public void e() {
        this.a = 80;
        if (!this.o.E) {
            this.o.a((qr)this, (byte)10);
            this.o.a(this, "game.tnt.primed", 1.0f, 1.0f);
        }
    }

    public int f() {
        return this.a;
    }

    public boolean v() {
        return this.a > -1;
    }

    @Override
    public float a(afn afn2, afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (this.v() && (ahv.a(ahz2) || ahv.b_(afs2, n2, n3 + 1, n4))) {
            return 0.0f;
        }
        return super.a(afn2, afs2, n2, n3, n4, ahz2);
    }

    @Override
    public boolean a(afn afn2, afs afs2, int n2, int n3, int n4, ahz ahz2, float f2) {
        if (this.v() && (ahv.a(ahz2) || ahv.b_(afs2, n2, n3 + 1, n4))) {
            return false;
        }
        return super.a(afn2, afs2, n2, n3, n4, ahz2, f2);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        if (dg2.b("TNTFuse", 99)) {
            this.a = dg2.f("TNTFuse");
        }
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        dg2.a("TNTFuse", this.a);
    }
}

