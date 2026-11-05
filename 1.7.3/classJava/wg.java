/*
 * Decompiled with CFR 0.152.
 */
public abstract class wg
extends wc
implements ps {
    private abu[] a = new abu[36];
    private boolean b = true;

    public wg(afs afs2) {
        super(afs2);
    }

    public wg(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        for (int i2 = 0; i2 < this.a(); ++i2) {
            abu abu2 = this.a(i2);
            if (abu2 == null) continue;
            float f2 = this.Z.nextFloat() * 0.8f + 0.1f;
            float f3 = this.Z.nextFloat() * 0.8f + 0.1f;
            float f4 = this.Z.nextFloat() * 0.8f + 0.1f;
            while (abu2.b > 0) {
                int n2 = this.Z.nextInt(21) + 10;
                if (n2 > abu2.b) {
                    n2 = abu2.b;
                }
                abu2.b -= n2;
                wb wb2 = new wb(this.o, this.s + (double)f2, this.t + (double)f3, this.u + (double)f4, new abu(abu2.b(), n2, abu2.k()));
                float f5 = 0.05f;
                wb2.v = (float)this.Z.nextGaussian() * f5;
                wb2.w = (float)this.Z.nextGaussian() * f5 + 0.2f;
                wb2.x = (float)this.Z.nextGaussian() * f5;
                this.o.d(wb2);
            }
        }
    }

    @Override
    public abu a(int n2) {
        return this.a[n2];
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.a[n2] != null) {
            if (this.a[n2].b <= n3) {
                abu abu2 = this.a[n2];
                this.a[n2] = null;
                return abu2;
            }
            abu abu3 = this.a[n2].a(n3);
            if (this.a[n2].b == 0) {
                this.a[n2] = null;
            }
            return abu3;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (this.a[n2] != null) {
            abu abu2 = this.a[n2];
            this.a[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.a[n2] = abu2;
        if (abu2 != null && abu2.b > this.d()) {
            abu2.b = this.d();
        }
    }

    @Override
    public void e() {
    }

    @Override
    public boolean a(xq xq2) {
        if (this.K) {
            return false;
        }
        return !(xq2.f(this) > 64.0);
    }

    @Override
    public void f() {
    }

    @Override
    public void l_() {
    }

    @Override
    public boolean b(int n2, abu abu2) {
        return true;
    }

    @Override
    public String b() {
        return this.k_() ? this.u() : "container.minecart";
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public void b(int n2) {
        this.b = false;
        super.b(n2);
    }

    @Override
    public void A() {
        if (this.b) {
            for (int i2 = 0; i2 < this.a(); ++i2) {
                abu abu2 = this.a(i2);
                if (abu2 == null) continue;
                float f2 = this.Z.nextFloat() * 0.8f + 0.1f;
                float f3 = this.Z.nextFloat() * 0.8f + 0.1f;
                float f4 = this.Z.nextFloat() * 0.8f + 0.1f;
                while (abu2.b > 0) {
                    int n2 = this.Z.nextInt(21) + 10;
                    if (n2 > abu2.b) {
                        n2 = abu2.b;
                    }
                    abu2.b -= n2;
                    wb wb2 = new wb(this.o, this.s + (double)f2, this.t + (double)f3, this.u + (double)f4, new abu(abu2.b(), n2, abu2.k()));
                    if (abu2.p()) {
                        wb2.f().d((dg)abu2.q().b());
                    }
                    float f5 = 0.05f;
                    wb2.v = (float)this.Z.nextGaussian() * f5;
                    wb2.w = (float)this.Z.nextGaussian() * f5 + 0.2f;
                    wb2.x = (float)this.Z.nextGaussian() * f5;
                    this.o.d(wb2);
                }
            }
        }
        super.A();
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null) continue;
            dg dg3 = new dg();
            dg3.a("Slot", (byte)i2);
            this.a[i2].b(dg3);
            dp2.a(dg3);
        }
        dg2.a("Items", dp2);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dp dp2 = dg2.c("Items", 10);
        this.a = new abu[this.a()];
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            int n2 = dg3.d("Slot") & 0xFF;
            if (n2 < 0 || n2 >= this.a.length) continue;
            this.a[n2] = abu.a(dg3);
        }
    }

    @Override
    public boolean c(xq xq2) {
        if (!this.o.E) {
            xq2.a(this);
        }
        return true;
    }

    @Override
    protected void i() {
        int n2 = 15 - yj.b(this);
        float f2 = 0.98f + (float)n2 * 0.001f;
        this.v *= (double)f2;
        this.w *= 0.0;
        this.x *= (double)f2;
    }
}

