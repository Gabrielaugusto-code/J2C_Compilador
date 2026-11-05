/*
 * Decompiled with CFR 0.152.
 */
public class afl {
    public final int a;
    public final int b;

    public afl(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public static long a(int n2, int n3) {
        return (long)n2 & 0xFFFFFFFFL | ((long)n3 & 0xFFFFFFFFL) << 32;
    }

    public int hashCode() {
        long l2 = afl.a(this.a, this.b);
        int n2 = (int)l2;
        int n3 = (int)(l2 >> 32);
        return n2 ^ n3;
    }

    public boolean equals(Object object) {
        afl afl2 = (afl)object;
        return afl2.a == this.a && afl2.b == this.b;
    }

    public int a() {
        return (this.a << 4) + 8;
    }

    public int b() {
        return (this.b << 4) + 8;
    }

    public afk a(int n2) {
        return new afk(this.a(), n2, this.b());
    }

    public String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}

