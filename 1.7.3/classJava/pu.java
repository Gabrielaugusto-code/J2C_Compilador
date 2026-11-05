/*
 * Decompiled with CFR 0.152.
 */
public enum pu {
    a(0, "options.difficulty.peaceful"),
    b(1, "options.difficulty.easy"),
    c(2, "options.difficulty.normal"),
    d(3, "options.difficulty.hard");

    private static final pu[] e;
    private final int f;
    private final String g;

    /*
     * WARNING - void declaration
     */
    private pu() {
        void var4_2;
        void var3_1;
        this.f = var3_1;
        this.g = var4_2;
    }

    public int a() {
        return this.f;
    }

    public static pu a(int n2) {
        return e[n2 % e.length];
    }

    public String b() {
        return this.g;
    }

    static {
        e = new pu[pu.values().length];
        pu[] puArray = pu.values();
        int n2 = puArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            pu pu2;
            pu.e[pu2.f] = pu2 = puArray[i2];
        }
    }
}

