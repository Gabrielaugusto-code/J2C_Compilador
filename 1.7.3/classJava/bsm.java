/*
 * Decompiled with CFR 0.152.
 */
public class bsm {
    private final int a;
    private final int b;

    public bsm(int n2) {
        this(n2, -1);
    }

    public bsm(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a() {
        return this.b == -1;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }
}

