/*
 * Decompiled with CFR 0.152.
 */
public enum is {
    a(0),
    b(1);

    private static final is[] c;
    private final int d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private is() {
        void var3_1;
        this.d = var3_1;
    }

    static /* synthetic */ is[] a() {
        return c;
    }

    static /* synthetic */ int a(is is2) {
        return is2.d;
    }

    static {
        c = new is[is.values().length];
        is[] isArray = is.values();
        int n2 = isArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            is is2;
            is.c[is2.d] = is2 = isArray[i2];
        }
    }
}

