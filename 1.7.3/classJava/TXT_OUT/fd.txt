/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum fd {
    a("show_text", true),
    b("show_achievement", true),
    c("show_item", true);

    private static final Map d;
    private final boolean e;
    private final String f;

    /*
     * WARNING - void declaration
     */
    private fd() {
        void var4_2;
        void var3_1;
        this.f = var3_1;
        this.e = var4_2;
    }

    public boolean a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public static fd a(String string) {
        return (fd)((Object)d.get(string));
    }

    static {
        d = Maps.newHashMap();
        for (fd fd2 : fd.values()) {
            d.put(fd2.b(), fd2);
        }
    }
}

