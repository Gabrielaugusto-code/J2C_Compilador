/*
 * Decompiled with CFR 0.152.
 */
public class bat {
    private int a;
    private int b;
    private double c;
    private double d;
    private int e;

    public bat(azi azi2, int n2, int n3) {
        this.a = n2;
        this.b = n3;
        this.e = 1;
        boolean bl2 = azi2.b();
        int n4 = azi2.u.aJ;
        if (n4 == 0) {
            n4 = 1000;
        }
        while (this.e < n4 && this.a / (this.e + 1) >= 320 && this.b / (this.e + 1) >= 240) {
            ++this.e;
        }
        if (bl2 && this.e % 2 != 0 && this.e != 1) {
            --this.e;
        }
        this.c = (double)this.a / (double)this.e;
        this.d = (double)this.b / (double)this.e;
        this.a = oy.f(this.c);
        this.b = oy.f(this.d);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }
}

