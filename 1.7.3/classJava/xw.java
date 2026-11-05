/*
 * Decompiled with CFR 0.152.
 */
public class xw
extends qr {
    private int a;
    private int b;

    public xw(afs afs2) {
        super(afs2);
        this.a(0.25f, 0.25f);
    }

    @Override
    protected void c() {
        this.af.a(8, 5);
    }

    @Override
    public boolean a(double d2) {
        return d2 < 4096.0;
    }

    public xw(afs afs2, double d2, double d3, double d4, abu abu2) {
        super(afs2);
        this.a = 0;
        this.a(0.25f, 0.25f);
        this.b(d2, d3, d4);
        this.L = 0.0f;
        int n2 = 1;
        if (abu2 != null && abu2.p()) {
            this.af.b(8, abu2);
            dg dg2 = abu2.q();
            dg dg3 = dg2.m("Fireworks");
            if (dg3 != null) {
                n2 += dg3.d("Flight");
            }
        }
        this.v = this.Z.nextGaussian() * 0.001;
        this.x = this.Z.nextGaussian() * 0.001;
        this.w = 0.05;
        this.b = 10 * n2 + this.Z.nextInt(6) + this.Z.nextInt(7);
    }

    @Override
    public void i(double d2, double d3, double d4) {
        this.v = d2;
        this.w = d3;
        this.x = d4;
        if (this.B == 0.0f && this.A == 0.0f) {
            float f2 = oy.a(d2 * d2 + d4 * d4);
            this.A = this.y = (float)(Math.atan2(d2, d4) * 180.0 / 3.1415927410125732);
            this.B = this.z = (float)(Math.atan2(d3, f2) * 180.0 / 3.1415927410125732);
        }
    }

    @Override
    public void h() {
        this.S = this.s;
        this.T = this.t;
        this.U = this.u;
        super.h();
        this.v *= 1.15;
        this.x *= 1.15;
        this.w += 0.04;
        this.d(this.v, this.w, this.x);
        float f2 = oy.a(this.v * this.v + this.x * this.x);
        this.y = (float)(Math.atan2(this.v, this.x) * 180.0 / 3.1415927410125732);
        this.z = (float)(Math.atan2(this.w, f2) * 180.0 / 3.1415927410125732);
        while (this.z - this.B < -180.0f) {
            this.B -= 360.0f;
        }
        while (this.z - this.B >= 180.0f) {
            this.B += 360.0f;
        }
        while (this.y - this.A < -180.0f) {
            this.A -= 360.0f;
        }
        while (this.y - this.A >= 180.0f) {
            this.A += 360.0f;
        }
        this.z = this.B + (this.z - this.B) * 0.2f;
        this.y = this.A + (this.y - this.A) * 0.2f;
        if (this.a == 0) {
            this.o.a(this, "fireworks.launch", 3.0f, 1.0f);
        }
        ++this.a;
        if (this.o.E && this.a % 2 < 2) {
            this.o.a("fireworksSpark", this.s, this.t - 0.3, this.u, this.Z.nextGaussian() * 0.05, -this.w * 0.5, this.Z.nextGaussian() * 0.05);
        }
        if (!this.o.E && this.a > this.b) {
            this.o.a((qr)this, (byte)17);
            this.A();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 17 && this.o.E) {
            abu abu2 = this.af.f(8);
            dg dg2 = null;
            if (abu2 != null && abu2.p()) {
                dg2 = abu2.q().m("Fireworks");
            }
            this.o.a(this.s, this.t, this.u, this.v, this.w, this.x, dg2);
        }
        super.a(by2);
    }

    @Override
    public void b(dg dg2) {
        dg2.a("Life", this.a);
        dg2.a("LifeTime", this.b);
        abu abu2 = this.af.f(8);
        if (abu2 != null) {
            dg dg3 = new dg();
            abu2.b(dg3);
            dg2.a("FireworksItem", dg3);
        }
    }

    @Override
    public void a(dg dg2) {
        abu abu2;
        this.a = dg2.f("Life");
        this.b = dg2.f("LifeTime");
        dg dg3 = dg2.m("FireworksItem");
        if (dg3 != null && (abu2 = abu.a(dg3)) != null) {
            this.af.b(8, abu2);
        }
    }

    @Override
    public float X() {
        return 0.0f;
    }

    @Override
    public float d(float f2) {
        return super.d(f2);
    }

    @Override
    public int c(float f2) {
        return super.c(f2);
    }

    @Override
    public boolean au() {
        return false;
    }
}

