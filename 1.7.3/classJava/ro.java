/*
 * Decompiled with CFR 0.152.
 */
public enum ro {
    a(ws.class, 70, avk.a, false, false),
    b(uw.class, 10, avk.a, true, true),
    c(uu.class, 15, avk.a, true, false),
    d(vl.class, 5, avk.h, true, false);

    private final Class e;
    private final int f;
    private final avk g;
    private final boolean h;
    private final boolean i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ro(avk avk2, boolean bl2, boolean bl3) {
        void var7_5;
        void var6_4;
        this.e = avk2;
        this.f = bl2 ? 1 : 0;
        this.g = (avk)bl3;
        this.h = var6_4;
        this.i = var7_5;
    }

    public Class a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public avk c() {
        return this.g;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }
}

