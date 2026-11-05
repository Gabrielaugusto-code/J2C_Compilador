/*
 * Decompiled with CFR 0.152.
 */
public class mc {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private int f;

    public mc(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void a(int n2) {
        if (n2 > 10) {
            n2 = 10;
        }
        this.e = n2;
    }

    public int e() {
        return this.e;
    }

    public void b(int n2) {
        this.f = n2;
    }

    public int f() {
        return this.f;
    }
}

