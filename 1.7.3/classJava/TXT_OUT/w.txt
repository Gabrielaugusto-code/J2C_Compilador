/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum w {
    a("master", 0),
    b("music", 1),
    c("record", 2),
    d("weather", 3),
    e("block", 4),
    f("hostile", 5),
    g("neutral", 6),
    h("player", 7),
    i("ambient", 8);

    private static final Map j;
    private static final Map k;
    private final String l;
    private final int m;

    /*
     * WARNING - void declaration
     */
    private w() {
        void var4_2;
        void var3_1;
        this.l = var3_1;
        this.m = var4_2;
    }

    public String a() {
        return this.l;
    }

    public int b() {
        return this.m;
    }

    public static w a(String string) {
        return (w)((Object)j.get(string));
    }

    static {
        j = Maps.newHashMap();
        k = Maps.newHashMap();
        for (w w2 : w.values()) {
            if (j.containsKey(w2.a()) || k.containsKey(w2.b())) {
                throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + (Object)((Object)w2));
            }
            j.put(w2.a(), w2);
            k.put(w2.b(), w2);
        }
    }
}

