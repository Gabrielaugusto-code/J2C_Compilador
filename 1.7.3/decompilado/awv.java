/*
 * Decompiled with CFR 0.152.
 */
public class awv {
    public final int a;
    public final int b;
    public final int c;
    private final int j;
    int d = -1;
    float e;
    float f;
    float g;
    awv h;
    public boolean i;

    public awv(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.j = awv.a(n2, n3, n4);
    }

    public static int a(int n2, int n3, int n4) {
        return n3 & 0xFF | (n2 & Short.MAX_VALUE) << 8 | (n4 & Short.MAX_VALUE) << 24 | (n2 < 0 ? Integer.MIN_VALUE : 0) | (n4 < 0 ? 32768 : 0);
    }

    public float a(awv awv2) {
        float f2 = awv2.a - this.a;
        float f3 = awv2.b - this.b;
        float f4 = awv2.c - this.c;
        return oy.c(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public float b(awv awv2) {
        float f2 = awv2.a - this.a;
        float f3 = awv2.b - this.b;
        float f4 = awv2.c - this.c;
        return f2 * f2 + f3 * f3 + f4 * f4;
    }

    public boolean equals(Object object) {
        if (object instanceof awv) {
            awv awv2 = (awv)object;
            return this.j == awv2.j && this.a == awv2.a && this.b == awv2.b && this.c == awv2.c;
        }
        return false;
    }

    public int hashCode() {
        return this.j;
    }

    public boolean a() {
        return this.d >= 0;
    }

    public String toString() {
        return this.a + ", " + this.b + ", " + this.c;
    }
}

