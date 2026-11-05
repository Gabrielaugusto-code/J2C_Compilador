/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

class br {
    double a;
    double b;

    br() {
    }

    br(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    double a(br br2) {
        double d2 = this.a - br2.a;
        double d3 = this.b - br2.b;
        return Math.sqrt(d2 * d2 + d3 * d3);
    }

    void a() {
        double d2 = this.b();
        this.a /= d2;
        this.b /= d2;
    }

    float b() {
        return oy.a(this.a * this.a + this.b * this.b);
    }

    public void b(br br2) {
        this.a -= br2.a;
        this.b -= br2.b;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        boolean bl2 = false;
        if (this.a < d2) {
            this.a = d2;
            bl2 = true;
        } else if (this.a > d4) {
            this.a = d4;
            bl2 = true;
        }
        if (this.b < d3) {
            this.b = d3;
            bl2 = true;
        } else if (this.b > d5) {
            this.b = d5;
            bl2 = true;
        }
        return bl2;
    }

    public int a(afs afs2) {
        int n2 = oy.c(this.a);
        int n3 = oy.c(this.b);
        for (int i2 = 256; i2 > 0; --i2) {
            if (afs2.a(n2, i2, n3).o() == avk.a) continue;
            return i2 + 1;
        }
        return 257;
    }

    public boolean b(afs afs2) {
        int n2 = oy.c(this.a);
        int n3 = oy.c(this.b);
        int n4 = 256;
        if (n4 > 0) {
            avk avk2 = afs2.a(n2, n4, n3).o();
            return !avk2.d() && avk2 != avk.o;
        }
        return false;
    }

    public void a(Random random, double d2, double d3, double d4, double d5) {
        this.a = oy.a(random, d2, d4);
        this.b = oy.a(random, d3, d5);
    }
}

