/*
 * Decompiled with CFR 0.152.
 */
public class ss
extends sz {
    private final rn a;
    private final float b;
    private float c;
    private boolean d;
    private int e;
    private int f;

    public ss(rn rn2, float f2) {
        this.a = rn2;
        this.b = f2;
        this.a(7);
    }

    @Override
    public void c() {
        this.c = 0.0f;
    }

    @Override
    public void d() {
        this.d = false;
        this.c = 0.0f;
    }

    @Override
    public boolean a() {
        return this.a.Y() && this.a.l != null && this.a.l instanceof xq && (this.d || this.a.bE());
    }

    @Override
    public void e() {
        Object object;
        xq xq2 = (xq)this.a.l;
        ru ru2 = (ru)this.a;
        float f2 = oy.g(xq2.y - this.a.y) * 0.5f;
        if (f2 > 5.0f) {
            f2 = 5.0f;
        }
        if (f2 < -5.0f) {
            f2 = -5.0f;
        }
        this.a.y = oy.g(this.a.y + f2);
        if (this.c < this.b) {
            this.c += (this.b - this.c) * 0.01f;
        }
        if (this.c > this.b) {
            this.c = this.b;
        }
        int n2 = oy.c(this.a.s);
        int n3 = oy.c(this.a.t);
        int n4 = oy.c(this.a.u);
        float f3 = this.c;
        if (this.d) {
            if (this.e++ > this.f) {
                this.d = false;
            }
            f3 += f3 * 1.15f * oy.a((float)this.e / (float)this.f * (float)Math.PI);
        }
        float f4 = 0.91f;
        if (this.a.D) {
            f4 = this.a.o.a((int)oy.d((float)((float)n2)), (int)(oy.d((float)((float)n3)) - 1), (int)oy.d((float)((float)n4))).K * 0.91f;
        }
        float f5 = 0.16277136f / (f4 * f4 * f4);
        float f6 = oy.a(ru2.y * (float)Math.PI / 180.0f);
        float f7 = oy.b(ru2.y * (float)Math.PI / 180.0f);
        float f8 = ru2.bk() * f5;
        float f9 = Math.max(f3, 1.0f);
        f9 = f8 / f9;
        float f10 = f3 * f9;
        float f11 = -(f10 * f6);
        float f12 = f10 * f7;
        if (oy.e(f11) > oy.e(f12)) {
            if (f11 < 0.0f) {
                f11 -= this.a.M / 2.0f;
            }
            if (f11 > 0.0f) {
                f11 += this.a.M / 2.0f;
            }
            f12 = 0.0f;
        } else {
            f11 = 0.0f;
            if (f12 < 0.0f) {
                f12 -= this.a.M / 2.0f;
            }
            if (f12 > 0.0f) {
                f12 += this.a.M / 2.0f;
            }
        }
        int n5 = oy.c(this.a.s + (double)f11);
        int n6 = oy.c(this.a.u + (double)f12);
        awv awv2 = new awv(oy.d(this.a.M + 1.0f), oy.d(this.a.N + xq2.N + 1.0f), oy.d(this.a.M + 1.0f));
        if (n2 != n5 || n4 != n6) {
            boolean bl2;
            object = this.a.o.a(n2, n3, n4);
            boolean bl3 = bl2 = !this.a((ahz)object) && (((ahz)object).o() != avk.a || !this.a(this.a.o.a(n2, n3 - 1, n4)));
            if (bl2 && awx.a(this.a, n5, n3, n6, awv2, false, false, true) == 0 && awx.a(this.a, n2, n3 + 1, n4, awv2, false, false, true) == 1 && awx.a(this.a, n5, n3 + 1, n6, awv2, false, false, true) == 1) {
                ru2.l().a();
            }
        }
        if (!xq2.bE.d && this.c >= this.b * 0.5f && this.a.aH().nextFloat() < 0.006f && !this.d && (object = xq2.bd()) != null && ((abu)object).b() == abv.bM) {
            ((abu)object).a(1, (rm)xq2);
            if (((abu)object).b == 0) {
                abu abu2 = new abu(abv.aM);
                abu2.d(((abu)object).d);
                xq2.bm.a[xq2.bm.c] = abu2;
            }
        }
        this.a.e(0.0f, f3);
    }

    private boolean a(ahz ahz2) {
        return ahz2.b() == 10 || ahz2 instanceof aka;
    }

    public boolean f() {
        return this.d;
    }

    public void g() {
        this.d = true;
        this.e = 0;
        this.f = this.a.aH().nextInt(841) + 140;
    }

    public boolean h() {
        return !this.f() && this.c > this.b * 0.3f;
    }
}

