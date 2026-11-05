/*
 * Decompiled with CFR 0.152.
 */
public class rh
extends qr {
    public int a;
    public int b;
    public int c;
    private int d = 5;
    private int e;
    private xq f;
    private int g;

    public rh(afs afs2, double d2, double d3, double d4, int n2) {
        super(afs2);
        this.a(0.5f, 0.5f);
        this.L = this.N / 2.0f;
        this.b(d2, d3, d4);
        this.y = (float)(Math.random() * 360.0);
        this.v = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.w = (float)(Math.random() * 0.2) * 2.0f;
        this.x = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.e = n2;
    }

    @Override
    protected boolean g_() {
        return false;
    }

    public rh(afs afs2) {
        super(afs2);
        this.a(0.25f, 0.25f);
        this.L = this.N / 2.0f;
    }

    @Override
    protected void c() {
    }

    @Override
    public int c(float f2) {
        float f3 = 0.5f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        int n2 = super.c(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public void h() {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        super.h();
        if (this.c > 0) {
            --this.c;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= (double)0.03f;
        if (this.o.a(oy.c(this.s), oy.c(this.t), oy.c(this.u)).o() == avk.i) {
            this.w = 0.2f;
            this.v = (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f;
            this.x = (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f;
            this.a("random.fizz", 0.4f, 2.0f + this.Z.nextFloat() * 0.4f);
        }
        this.j(this.s, (this.C.b + this.C.e) / 2.0, this.u);
        double d7 = 8.0;
        if (this.g < this.a - 20 + this.x() % 100) {
            if (this.f == null || this.f.f(this) > d7 * d7) {
                this.f = this.o.a((qr)this, d7);
            }
            this.g = this.a;
        }
        if (this.f != null && (d6 = 1.0 - (d5 = Math.sqrt((d4 = (this.f.s - this.s) / d7) * d4 + (d3 = (this.f.t + (double)this.f.g() - this.t) / d7) * d3 + (d2 = (this.f.u - this.u) / d7) * d2))) > 0.0) {
            d6 *= d6;
            this.v += d4 / d5 * d6 * 0.1;
            this.w += d3 / d5 * d6 * 0.1;
            this.x += d2 / d5 * d6 * 0.1;
        }
        this.d(this.v, this.w, this.x);
        float f2 = 0.98f;
        if (this.D) {
            f2 = this.o.a((int)oy.c((double)this.s), (int)(oy.c((double)this.C.b) - 1), (int)oy.c((double)this.u)).K * 0.98f;
        }
        this.v *= (double)f2;
        this.w *= (double)0.98f;
        this.x *= (double)f2;
        if (this.D) {
            this.w *= (double)-0.9f;
        }
        ++this.a;
        ++this.b;
        if (this.b >= 6000) {
            this.A();
        }
    }

    @Override
    public boolean M() {
        return this.o.a(this.C, avk.h, (qr)this);
    }

    @Override
    protected void f(int n2) {
        this.a(qf.a, (float)n2);
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        this.P();
        this.d = (int)((float)this.d - f2);
        if (this.d <= 0) {
            this.A();
        }
        return false;
    }

    @Override
    public void b(dg dg2) {
        dg2.a("Health", (short)((byte)this.d));
        dg2.a("Age", (short)this.b);
        dg2.a("Value", (short)this.e);
    }

    @Override
    public void a(dg dg2) {
        this.d = dg2.e("Health") & 0xFF;
        this.b = dg2.e("Age");
        this.e = dg2.e("Value");
    }

    @Override
    public void b_(xq xq2) {
        if (this.o.E) {
            return;
        }
        if (this.c == 0 && xq2.bt == 0) {
            xq2.bt = 2;
            this.o.a((qr)xq2, "random.orb", 0.1f, 0.5f * ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7f + 1.8f));
            xq2.a((qr)this, 1);
            xq2.v(this.e);
            this.A();
        }
    }

    public int e() {
        return this.e;
    }

    public int f() {
        if (this.e >= 2477) {
            return 10;
        }
        if (this.e >= 1237) {
            return 9;
        }
        if (this.e >= 617) {
            return 8;
        }
        if (this.e >= 307) {
            return 7;
        }
        if (this.e >= 149) {
            return 6;
        }
        if (this.e >= 73) {
            return 5;
        }
        if (this.e >= 37) {
            return 4;
        }
        if (this.e >= 17) {
            return 3;
        }
        if (this.e >= 7) {
            return 2;
        }
        if (this.e >= 3) {
            return 1;
        }
        return 0;
    }

    public static int a(int n2) {
        if (n2 >= 2477) {
            return 2477;
        }
        if (n2 >= 1237) {
            return 1237;
        }
        if (n2 >= 617) {
            return 617;
        }
        if (n2 >= 307) {
            return 307;
        }
        if (n2 >= 149) {
            return 149;
        }
        if (n2 >= 73) {
            return 73;
        }
        if (n2 >= 37) {
            return 37;
        }
        if (n2 >= 17) {
            return 17;
        }
        if (n2 >= 7) {
            return 7;
        }
        if (n2 >= 3) {
            return 3;
        }
        return 1;
    }

    @Override
    public boolean au() {
        return false;
    }
}

