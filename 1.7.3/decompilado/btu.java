/*
 * Decompiled with CFR 0.152.
 */
public enum btu {
    a(new brq("minecraft:music.menu"), 20, 600),
    b(new brq("minecraft:music.game"), 12000, 24000),
    c(new brq("minecraft:music.game.creative"), 1200, 3600),
    d(new brq("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE),
    e(new brq("minecraft:music.game.nether"), 1200, 3600),
    f(new brq("minecraft:music.game.end.dragon"), 0, 0),
    g(new brq("minecraft:music.game.end"), 6000, 24000);

    private final brq h;
    private final int i;
    private final int j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private btu(int n2) {
        void var5_3;
        void var4_2;
        this.h = (brq)n2;
        this.i = var4_2;
        this.j = var5_3;
    }

    public brq a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }
}

