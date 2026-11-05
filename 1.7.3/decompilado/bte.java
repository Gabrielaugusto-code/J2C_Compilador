/*
 * Decompiled with CFR 0.152.
 */
public enum bte {
    a("file"),
    b("event");

    private final String c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bte() {
        void var3_1;
        this.c = var3_1;
    }

    public static bte a(String string) {
        for (bte bte2 : bte.values()) {
            if (!bte2.c.equals(string)) continue;
            return bte2;
        }
        return null;
    }
}

