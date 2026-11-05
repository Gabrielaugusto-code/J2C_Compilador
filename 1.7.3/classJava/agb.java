/*
 * Decompiled with CFR 0.152.
 */
public enum agb {
    a(-1, ""),
    b(0, "survival"),
    c(1, "creative"),
    d(2, "adventure");

    int e;
    String f;

    /*
     * WARNING - void declaration
     */
    private agb() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public void a(xn xn2) {
        if (this == c) {
            xn2.c = true;
            xn2.d = true;
            xn2.a = true;
        } else {
            xn2.c = false;
            xn2.d = false;
            xn2.a = false;
            xn2.b = false;
        }
        xn2.e = !this.c();
    }

    public boolean c() {
        return this == d;
    }

    public boolean d() {
        return this == c;
    }

    public boolean e() {
        return this == b || this == d;
    }

    public static agb a(int n2) {
        for (agb agb2 : agb.values()) {
            if (agb2.e != n2) continue;
            return agb2;
        }
        return b;
    }

    public static agb a(String string) {
        for (agb agb2 : agb.values()) {
            if (!agb2.f.equals(string)) continue;
            return agb2;
        }
        return b;
    }
}

