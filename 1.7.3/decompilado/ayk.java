/*
 * Decompiled with CFR 0.152.
 */
public class ayk {
    private static final ThreadLocal g = new ayl();
    public double a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;

    public static ayk a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return new ayk(d2, d3, d4, d5, d6, d7);
    }

    public static aym a() {
        return (aym)g.get();
    }

    protected ayk(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.f = d7;
    }

    public ayk b(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.f = d7;
        return this;
    }

    public ayk a(double d2, double d3, double d4) {
        double d5 = this.a;
        double d6 = this.b;
        double d7 = this.c;
        double d8 = this.d;
        double d9 = this.e;
        double d10 = this.f;
        if (d2 < 0.0) {
            d5 += d2;
        }
        if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        }
        if (d3 > 0.0) {
            d9 += d3;
        }
        if (d4 < 0.0) {
            d7 += d4;
        }
        if (d4 > 0.0) {
            d10 += d4;
        }
        return ayk.a().a(d5, d6, d7, d8, d9, d10);
    }

    public ayk b(double d2, double d3, double d4) {
        double d5 = this.a - d2;
        double d6 = this.b - d3;
        double d7 = this.c - d4;
        double d8 = this.d + d2;
        double d9 = this.e + d3;
        double d10 = this.f + d4;
        return ayk.a().a(d5, d6, d7, d8, d9, d10);
    }

    public ayk a(ayk ayk2) {
        double d2 = Math.min(this.a, ayk2.a);
        double d3 = Math.min(this.b, ayk2.b);
        double d4 = Math.min(this.c, ayk2.c);
        double d5 = Math.max(this.d, ayk2.d);
        double d6 = Math.max(this.e, ayk2.e);
        double d7 = Math.max(this.f, ayk2.f);
        return ayk.a().a(d2, d3, d4, d5, d6, d7);
    }

    public ayk c(double d2, double d3, double d4) {
        return ayk.a().a(this.a + d2, this.b + d3, this.c + d4, this.d + d2, this.e + d3, this.f + d4);
    }

    public double a(ayk ayk2, double d2) {
        double d3;
        if (ayk2.e <= this.b || ayk2.b >= this.e) {
            return d2;
        }
        if (ayk2.f <= this.c || ayk2.c >= this.f) {
            return d2;
        }
        if (d2 > 0.0 && ayk2.d <= this.a && (d3 = this.a - ayk2.d) < d2) {
            d2 = d3;
        }
        if (d2 < 0.0 && ayk2.a >= this.d && (d3 = this.d - ayk2.a) > d2) {
            d2 = d3;
        }
        return d2;
    }

    public double b(ayk ayk2, double d2) {
        double d3;
        if (ayk2.d <= this.a || ayk2.a >= this.d) {
            return d2;
        }
        if (ayk2.f <= this.c || ayk2.c >= this.f) {
            return d2;
        }
        if (d2 > 0.0 && ayk2.e <= this.b && (d3 = this.b - ayk2.e) < d2) {
            d2 = d3;
        }
        if (d2 < 0.0 && ayk2.b >= this.e && (d3 = this.e - ayk2.b) > d2) {
            d2 = d3;
        }
        return d2;
    }

    public double c(ayk ayk2, double d2) {
        double d3;
        if (ayk2.d <= this.a || ayk2.a >= this.d) {
            return d2;
        }
        if (ayk2.e <= this.b || ayk2.b >= this.e) {
            return d2;
        }
        if (d2 > 0.0 && ayk2.f <= this.c && (d3 = this.c - ayk2.f) < d2) {
            d2 = d3;
        }
        if (d2 < 0.0 && ayk2.c >= this.f && (d3 = this.f - ayk2.c) > d2) {
            d2 = d3;
        }
        return d2;
    }

    public boolean b(ayk ayk2) {
        if (ayk2.d <= this.a || ayk2.a >= this.d) {
            return false;
        }
        if (ayk2.e <= this.b || ayk2.b >= this.e) {
            return false;
        }
        return !(ayk2.f <= this.c) && !(ayk2.c >= this.f);
    }

    public ayk d(double d2, double d3, double d4) {
        this.a += d2;
        this.b += d3;
        this.c += d4;
        this.d += d2;
        this.e += d3;
        this.f += d4;
        return this;
    }

    public boolean a(ayp ayp2) {
        if (ayp2.c <= this.a || ayp2.c >= this.d) {
            return false;
        }
        if (ayp2.d <= this.b || ayp2.d >= this.e) {
            return false;
        }
        return !(ayp2.e <= this.c) && !(ayp2.e >= this.f);
    }

    public double b() {
        double d2 = this.d - this.a;
        double d3 = this.e - this.b;
        double d4 = this.f - this.c;
        return (d2 + d3 + d4) / 3.0;
    }

    public ayk e(double d2, double d3, double d4) {
        double d5 = this.a + d2;
        double d6 = this.b + d3;
        double d7 = this.c + d4;
        double d8 = this.d - d2;
        double d9 = this.e - d3;
        double d10 = this.f - d4;
        return ayk.a().a(d5, d6, d7, d8, d9, d10);
    }

    public ayk c() {
        return ayk.a().a(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public ayn a(ayp ayp2, ayp ayp3) {
        ayp ayp4 = ayp2.b(ayp3, this.a);
        ayp ayp5 = ayp2.b(ayp3, this.d);
        ayp ayp6 = ayp2.c(ayp3, this.b);
        ayp ayp7 = ayp2.c(ayp3, this.e);
        ayp ayp8 = ayp2.d(ayp3, this.c);
        ayp ayp9 = ayp2.d(ayp3, this.f);
        if (!this.b(ayp4)) {
            ayp4 = null;
        }
        if (!this.b(ayp5)) {
            ayp5 = null;
        }
        if (!this.c(ayp6)) {
            ayp6 = null;
        }
        if (!this.c(ayp7)) {
            ayp7 = null;
        }
        if (!this.d(ayp8)) {
            ayp8 = null;
        }
        if (!this.d(ayp9)) {
            ayp9 = null;
        }
        ayp ayp10 = null;
        if (ayp4 != null && (ayp10 == null || ayp2.e(ayp4) < ayp2.e(ayp10))) {
            ayp10 = ayp4;
        }
        if (ayp5 != null && (ayp10 == null || ayp2.e(ayp5) < ayp2.e(ayp10))) {
            ayp10 = ayp5;
        }
        if (ayp6 != null && (ayp10 == null || ayp2.e(ayp6) < ayp2.e(ayp10))) {
            ayp10 = ayp6;
        }
        if (ayp7 != null && (ayp10 == null || ayp2.e(ayp7) < ayp2.e(ayp10))) {
            ayp10 = ayp7;
        }
        if (ayp8 != null && (ayp10 == null || ayp2.e(ayp8) < ayp2.e(ayp10))) {
            ayp10 = ayp8;
        }
        if (ayp9 != null && (ayp10 == null || ayp2.e(ayp9) < ayp2.e(ayp10))) {
            ayp10 = ayp9;
        }
        if (ayp10 == null) {
            return null;
        }
        int n2 = -1;
        if (ayp10 == ayp4) {
            n2 = 4;
        }
        if (ayp10 == ayp5) {
            n2 = 5;
        }
        if (ayp10 == ayp6) {
            n2 = 0;
        }
        if (ayp10 == ayp7) {
            n2 = 1;
        }
        if (ayp10 == ayp8) {
            n2 = 2;
        }
        if (ayp10 == ayp9) {
            n2 = 3;
        }
        return new ayn(0, 0, 0, n2, ayp10);
    }

    private boolean b(ayp ayp2) {
        if (ayp2 == null) {
            return false;
        }
        return ayp2.d >= this.b && ayp2.d <= this.e && ayp2.e >= this.c && ayp2.e <= this.f;
    }

    private boolean c(ayp ayp2) {
        if (ayp2 == null) {
            return false;
        }
        return ayp2.c >= this.a && ayp2.c <= this.d && ayp2.e >= this.c && ayp2.e <= this.f;
    }

    private boolean d(ayp ayp2) {
        if (ayp2 == null) {
            return false;
        }
        return ayp2.c >= this.a && ayp2.c <= this.d && ayp2.d >= this.b && ayp2.d <= this.e;
    }

    public void d(ayk ayk2) {
        this.a = ayk2.a;
        this.b = ayk2.b;
        this.c = ayk2.c;
        this.d = ayk2.d;
        this.e = ayk2.e;
        this.f = ayk2.f;
    }

    public String toString() {
        return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
    }
}

