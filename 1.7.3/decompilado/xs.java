/*
 * Decompiled with CFR 0.152.
 */
public enum xs {
    a(0, "options.chat.visibility.full"),
    b(1, "options.chat.visibility.system"),
    c(2, "options.chat.visibility.hidden");

    private static final xs[] d;
    private final int e;
    private final String f;

    /*
     * WARNING - void declaration
     */
    private xs() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public int a() {
        return this.e;
    }

    public static xs a(int n2) {
        return d[n2 % d.length];
    }

    public String b() {
        return this.f;
    }

    static {
        d = new xs[xs.values().length];
        xs[] xsArray = xs.values();
        int n2 = xsArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            xs xs2;
            xs.d[xs2.e] = xs2 = xsArray[i2];
        }
    }
}

