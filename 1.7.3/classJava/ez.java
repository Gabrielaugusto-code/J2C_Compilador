/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum ez {
    a("open_url", true),
    b("open_file", false),
    c("run_command", true),
    d("twitch_user_info", false),
    e("suggest_command", true);

    private static final Map f;
    private final boolean g;
    private final String h;

    /*
     * WARNING - void declaration
     */
    private ez() {
        void var4_2;
        void var3_1;
        this.h = var3_1;
        this.g = var4_2;
    }

    public boolean a() {
        return this.g;
    }

    public String b() {
        return this.h;
    }

    public static ez a(String string) {
        return (ez)((Object)f.get(string));
    }

    static {
        f = Maps.newHashMap();
        for (ez ez2 : ez.values()) {
            f.put(ez2.b(), ez2);
        }
    }
}

