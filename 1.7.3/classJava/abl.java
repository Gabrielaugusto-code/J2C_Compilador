/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum abl {
    a(0, "cod", 2, 0.1f, 5, 0.6f),
    b(1, "salmon", 2, 0.1f, 6, 0.8f),
    c(2, "clownfish", 1, 0.1f),
    d(3, "pufferfish", 1, 0.1f);

    private static final Map e;
    private final int f;
    private final String g;
    private pw h;
    private pw i;
    private final int j;
    private final float k;
    private final int l;
    private final float m;
    private boolean n = false;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private abl(int n3, float f2, int n4, float f3) {
        void var8_6;
        void var7_5;
        this.f = n3;
        this.g = (String)f2;
        this.j = n4;
        this.k = f3;
        this.l = var7_5;
        this.m = var8_6;
        this.n = true;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private abl(int n3, float f2) {
        void var6_4;
        void var5_3;
        this.f = n3;
        this.g = (String)f2;
        this.j = var5_3;
        this.k = var6_4;
        this.l = 0;
        this.m = 0.0f;
        this.n = false;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public int c() {
        return this.j;
    }

    public float d() {
        return this.k;
    }

    public int e() {
        return this.l;
    }

    public float f() {
        return this.m;
    }

    public void a(px px2) {
        this.h = px2.a("fish_" + this.g + "_raw");
        if (this.n) {
            this.i = px2.a("fish_" + this.g + "_cooked");
        }
    }

    public pw g() {
        return this.h;
    }

    public pw h() {
        return this.i;
    }

    public boolean i() {
        return this.n;
    }

    public static abl a(int n2) {
        abl abl2 = (abl)((Object)e.get(n2));
        if (abl2 == null) {
            return a;
        }
        return abl2;
    }

    public static abl a(abu abu2) {
        if (abu2.b() instanceof abk) {
            return abl.a(abu2.k());
        }
        return a;
    }

    static {
        e = Maps.newHashMap();
        for (abl abl2 : abl.values()) {
            e.put(abl2.a(), abl2);
        }
    }
}

