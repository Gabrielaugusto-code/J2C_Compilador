/*
 * Decompiled with CFR 0.152.
 */
public class blg
extends qr {
    protected int b;
    protected int c;
    protected float d;
    protected float e;
    protected int f;
    protected int g;
    protected float h;
    protected float i;
    protected float at;
    protected float au;
    protected float av;
    protected float aw = 1.0f;
    protected pw ax;
    public static double ay;
    public static double az;
    public static double aA;

    protected blg(afs afs2, double d2, double d3, double d4) {
        super(afs2);
        this.a(0.2f, 0.2f);
        this.L = this.N / 2.0f;
        this.b(d2, d3, d4);
        this.S = d2;
        this.T = d3;
        this.U = d4;
        this.av = 1.0f;
        this.au = 1.0f;
        this.at = 1.0f;
        this.d = this.Z.nextFloat() * 3.0f;
        this.e = this.Z.nextFloat() * 3.0f;
        this.h = (this.Z.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.g = (int)(4.0f / (this.Z.nextFloat() * 0.9f + 0.1f));
        this.f = 0;
    }

    public blg(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(afs2, d2, d3, d4);
        this.v = d5 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        this.w = d6 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        this.x = d7 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        float f2 = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f3 = oy.a(this.v * this.v + this.w * this.w + this.x * this.x);
        this.v = this.v / (double)f3 * (double)f2 * (double)0.4f;
        this.w = this.w / (double)f3 * (double)f2 * (double)0.4f + (double)0.1f;
        this.x = this.x / (double)f3 * (double)f2 * (double)0.4f;
    }

    public blg a(float f2) {
        this.v *= (double)f2;
        this.w = (this.w - (double)0.1f) * (double)f2 + (double)0.1f;
        this.x *= (double)f2;
        return this;
    }

    public blg f(float f2) {
        this.a(0.2f * f2, 0.2f * f2);
        this.h *= f2;
        return this;
    }

    public void b(float f2, float f3, float f4) {
        this.at = f2;
        this.au = f3;
        this.av = f4;
    }

    public void g(float f2) {
        this.aw = f2;
    }

    public float b() {
        return this.at;
    }

    public float d() {
        return this.au;
    }

    public float e() {
        return this.av;
    }

    @Override
    protected boolean g_() {
        return false;
    }

    @Override
    protected void c() {
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.A();
        }
        this.w -= 0.04 * (double)this.i;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.98f;
        this.w *= (double)0.98f;
        this.x *= (double)0.98f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }

    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = (float)this.b / 16.0f;
        float f9 = f8 + 0.0624375f;
        float f10 = (float)this.c / 16.0f;
        float f11 = f10 + 0.0624375f;
        float f12 = 0.1f * this.h;
        if (this.ax != null) {
            f8 = this.ax.c();
            f9 = this.ax.d();
            f10 = this.ax.e();
            f11 = this.ax.f();
        }
        float f13 = (float)(this.p + (this.s - this.p) * (double)f2 - ay);
        float f14 = (float)(this.q + (this.t - this.q) * (double)f2 - az);
        float f15 = (float)(this.r + (this.u - this.r) * (double)f2 - aA);
        bna2.a(this.at, this.au, this.av, this.aw);
        bna2.a(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12, f9, f11);
        bna2.a(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12, f9, f10);
        bna2.a(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12, f8, f10);
        bna2.a(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12, f8, f11);
    }

    public int a() {
        return 0;
    }

    @Override
    public void b(dg dg2) {
    }

    @Override
    public void a(dg dg2) {
    }

    public void a(pw pw2) {
        if (this.a() == 1) {
            this.ax = pw2;
        } else if (this.a() == 2) {
            this.ax = pw2;
        } else {
            throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
        }
    }

    public void k(int n2) {
        if (this.a() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.b = n2 % 16;
        this.c = n2 / 16;
    }

    public void i() {
        ++this.b;
    }

    @Override
    public boolean au() {
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.s + "," + this.t + "," + this.u + "), RGBA (" + this.at + "," + this.au + "," + this.av + "," + this.aw + "), Age " + this.f;
    }
}

