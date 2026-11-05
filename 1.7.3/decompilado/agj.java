/*
 * Decompiled with CFR 0.152.
 */
public class agj
implements Comparable {
    private static long f;
    private final ahz g;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    private long h = f++;

    public agj(int n2, int n3, int n4, ahz ahz2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.g = ahz2;
    }

    public boolean equals(Object object) {
        if (object instanceof agj) {
            agj agj2 = (agj)object;
            return this.a == agj2.a && this.b == agj2.b && this.c == agj2.c && ahz.a(this.g, agj2.g);
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 1024 * 1024 + this.c * 1024 + this.b) * 256;
    }

    public agj a(long l2) {
        this.d = l2;
        return this;
    }

    public void a(int n2) {
        this.e = n2;
    }

    public int a(agj agj2) {
        if (this.d < agj2.d) {
            return -1;
        }
        if (this.d > agj2.d) {
            return 1;
        }
        if (this.e != agj2.e) {
            return this.e - agj2.e;
        }
        if (this.h < agj2.h) {
            return -1;
        }
        if (this.h > agj2.h) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return ahz.b(this.g) + ": (" + this.a + ", " + this.b + ", " + this.c + "), " + this.d + ", " + this.e + ", " + this.h;
    }

    public ahz a() {
        return this.g;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((agj)object);
    }
}

