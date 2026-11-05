/*
 * Decompiled with CFR 0.152.
 */
public class ayp {
    public static final ayq a = new ayq(-1, -1);
    public final ayq b;
    public double c;
    public double d;
    public double e;

    public static ayp a(double d2, double d3, double d4) {
        return new ayp(a, d2, d3, d4);
    }

    protected ayp(ayq ayq2, double d2, double d3, double d4) {
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        if (d4 == -0.0) {
            d4 = 0.0;
        }
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.b = ayq2;
    }

    protected ayp b(double d2, double d3, double d4) {
        this.c = d2;
        this.d = d3;
        this.e = d4;
        return this;
    }

    public ayp a(ayp ayp2) {
        return this.b.a(ayp2.c - this.c, ayp2.d - this.d, ayp2.e - this.e);
    }

    public ayp a() {
        double d2 = oy.a(this.c * this.c + this.d * this.d + this.e * this.e);
        if (d2 < 1.0E-4) {
            return this.b.a(0.0, 0.0, 0.0);
        }
        return this.b.a(this.c / d2, this.d / d2, this.e / d2);
    }

    public double b(ayp ayp2) {
        return this.c * ayp2.c + this.d * ayp2.d + this.e * ayp2.e;
    }

    public ayp c(ayp ayp2) {
        return this.b.a(this.d * ayp2.e - this.e * ayp2.d, this.e * ayp2.c - this.c * ayp2.e, this.c * ayp2.d - this.d * ayp2.c);
    }

    public ayp c(double d2, double d3, double d4) {
        return this.b.a(this.c + d2, this.d + d3, this.e + d4);
    }

    public double d(ayp ayp2) {
        double d2 = ayp2.c - this.c;
        double d3 = ayp2.d - this.d;
        double d4 = ayp2.e - this.e;
        return oy.a(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public double e(ayp ayp2) {
        double d2 = ayp2.c - this.c;
        double d3 = ayp2.d - this.d;
        double d4 = ayp2.e - this.e;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public double d(double d2, double d3, double d4) {
        double d5 = d2 - this.c;
        double d6 = d3 - this.d;
        double d7 = d4 - this.e;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double b() {
        return oy.a(this.c * this.c + this.d * this.d + this.e * this.e);
    }

    public ayp b(ayp ayp2, double d2) {
        double d3 = ayp2.c - this.c;
        double d4 = ayp2.d - this.d;
        double d5 = ayp2.e - this.e;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.c) / d3;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return this.b.a(this.c + d3 * d6, this.d + d4 * d6, this.e + d5 * d6);
    }

    public ayp c(ayp ayp2, double d2) {
        double d3 = ayp2.c - this.c;
        double d4 = ayp2.d - this.d;
        double d5 = ayp2.e - this.e;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.d) / d4;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return this.b.a(this.c + d3 * d6, this.d + d4 * d6, this.e + d5 * d6);
    }

    public ayp d(ayp ayp2, double d2) {
        double d3 = ayp2.c - this.c;
        double d4 = ayp2.d - this.d;
        double d5 = ayp2.e - this.e;
        if (d5 * d5 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.e) / d5;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return this.b.a(this.c + d3 * d6, this.d + d4 * d6, this.e + d5 * d6);
    }

    public String toString() {
        return "(" + this.c + ", " + this.d + ", " + this.e + ")";
    }

    public void a(float f2) {
        float f3 = oy.b(f2);
        float f4 = oy.a(f2);
        double d2 = this.c;
        double d3 = this.d * (double)f3 + this.e * (double)f4;
        double d4 = this.e * (double)f3 - this.d * (double)f4;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    public void b(float f2) {
        float f3 = oy.b(f2);
        float f4 = oy.a(f2);
        double d2 = this.c * (double)f3 + this.e * (double)f4;
        double d3 = this.d;
        double d4 = this.e * (double)f3 - this.c * (double)f4;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    public void c(float f2) {
        float f3 = oy.b(f2);
        float f4 = oy.a(f2);
        double d2 = this.c * (double)f3 + this.d * (double)f4;
        double d3 = this.d * (double)f3 - this.c * (double)f4;
        double d4 = this.e;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }
}

