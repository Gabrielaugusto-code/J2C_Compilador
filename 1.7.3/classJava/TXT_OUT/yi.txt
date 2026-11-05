/*
 * Decompiled with CFR 0.152.
 */
public class yi {
    private int a = 20;
    private float b = 5.0f;
    private float c;
    private int d;
    private int e = 20;

    public void a(int n2, float f2) {
        this.a = Math.min(n2 + this.a, 20);
        this.b = Math.min(this.b + (float)n2 * f2 * 2.0f, (float)this.a);
    }

    public void a(abo abo2, abu abu2) {
        this.a(abo2.g(abu2), abo2.h(abu2));
    }

    public void a(xq xq2) {
        pu pu2 = xq2.o.r;
        this.e = this.a;
        if (this.c > 4.0f) {
            this.c -= 4.0f;
            if (this.b > 0.0f) {
                this.b = Math.max(this.b - 1.0f, 0.0f);
            } else if (pu2 != pu.a) {
                this.a = Math.max(this.a - 1, 0);
            }
        }
        if (xq2.o.O().b("naturalRegeneration") && this.a >= 18 && xq2.bQ()) {
            ++this.d;
            if (this.d >= 80) {
                xq2.f(1.0f);
                this.a(3.0f);
                this.d = 0;
            }
        } else if (this.a <= 0) {
            ++this.d;
            if (this.d >= 80) {
                if (xq2.aR() > 10.0f || pu2 == pu.d || xq2.aR() > 1.0f && pu2 == pu.c) {
                    xq2.a(qf.f, 1.0f);
                }
                this.d = 0;
            }
        } else {
            this.d = 0;
        }
    }

    public void a(dg dg2) {
        if (dg2.b("foodLevel", 99)) {
            this.a = dg2.f("foodLevel");
            this.d = dg2.f("foodTickTimer");
            this.b = dg2.h("foodSaturationLevel");
            this.c = dg2.h("foodExhaustionLevel");
        }
    }

    public void b(dg dg2) {
        dg2.a("foodLevel", this.a);
        dg2.a("foodTickTimer", this.d);
        dg2.a("foodSaturationLevel", this.b);
        dg2.a("foodExhaustionLevel", this.c);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.e;
    }

    public boolean c() {
        return this.a < 20;
    }

    public void a(float f2) {
        this.c = Math.min(this.c + f2, 40.0f);
    }

    public float e() {
        return this.b;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public void b(float f2) {
        this.b = f2;
    }
}

