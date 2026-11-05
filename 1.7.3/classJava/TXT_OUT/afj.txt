/*
 * Decompiled with CFR 0.152.
 */
public class afj {
    private int a;
    private int b;
    private int c;
    private ahz d;
    private int e;
    private int f;

    public afj(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.e = n5;
        this.f = n6;
        this.d = ahz2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public ahz f() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof afj) {
            afj afj2 = (afj)object;
            return this.a == afj2.a && this.b == afj2.b && this.c == afj2.c && this.e == afj2.e && this.f == afj2.f && this.d == afj2.d;
        }
        return false;
    }

    public String toString() {
        return "TE(" + this.a + "," + this.b + "," + this.c + ")," + this.e + "," + this.f + "," + this.d;
    }
}

