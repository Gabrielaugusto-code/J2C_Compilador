/*
 * Decompiled with CFR 0.152.
 */
public enum cq {
    a(0, 1, 0, -1, 0),
    b(1, 0, 0, 1, 0),
    c(2, 3, 0, 0, -1),
    d(3, 2, 0, 0, 1),
    e(4, 5, -1, 0, 0),
    f(5, 4, 1, 0, 0);

    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private static final cq[] l;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cq(int n3, int n4, int n5) {
        void var7_5;
        void var6_4;
        this.g = n3;
        this.h = n4;
        this.i = n5;
        this.j = var6_4;
        this.k = var7_5;
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public static cq a(int n2) {
        return l[n2 % l.length];
    }

    static {
        l = new cq[6];
        cq[] cqArray = cq.values();
        int n2 = cqArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cq cq2;
            cq.l[cq2.g] = cq2 = cqArray[i2];
        }
    }
}

