/*
 * Decompiled with CFR 0.152.
 */
public class agd {
    public static final agd[] a = new agd[16];
    public static final agd b = new agd(0, "default", 1).i();
    public static final agd c = new agd(1, "flat");
    public static final agd d = new agd(2, "largeBiomes");
    public static final agd e = new agd(3, "amplified").j();
    public static final agd f = new agd(8, "default_1_1", 0).a(false);
    private final int g;
    private final String h;
    private final int i;
    private boolean j;
    private boolean k;
    private boolean l;

    private agd(int n2, String string) {
        this(n2, string, 0);
    }

    private agd(int n2, String string, int n3) {
        this.h = string;
        this.i = n3;
        this.j = true;
        this.g = n2;
        agd.a[n2] = this;
    }

    public String a() {
        return this.h;
    }

    public String b() {
        return "generator." + this.h;
    }

    public String c() {
        return this.b() + ".info";
    }

    public int d() {
        return this.i;
    }

    public agd a(int n2) {
        if (this == b && n2 == 0) {
            return f;
        }
        return this;
    }

    private agd a(boolean bl2) {
        this.j = bl2;
        return this;
    }

    public boolean e() {
        return this.j;
    }

    private agd i() {
        this.k = true;
        return this;
    }

    public boolean f() {
        return this.k;
    }

    public static agd a(String string) {
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (a[i2] == null || !agd.a[i2].h.equalsIgnoreCase(string)) continue;
            return a[i2];
        }
        return null;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return this.l;
    }

    private agd j() {
        this.l = true;
        return this;
    }
}

