/*
 * Decompiled with CFR 0.152.
 */
public enum ik {
    a(0),
    b(1),
    c(2);

    private final int d;
    private static final ik[] e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ik() {
        void var3_1;
        this.d = var3_1;
    }

    static /* synthetic */ ik[] a() {
        return e;
    }

    static /* synthetic */ int a(ik ik2) {
        return ik2.d;
    }

    static {
        e = new ik[ik.values().length];
        ik[] ikArray = ik.values();
        int n2 = ikArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ik ik2;
            ik.e[ik2.d] = ik2 = ikArray[i2];
        }
    }
}

