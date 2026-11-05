/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum bam {
    a("legacy"),
    b("mojang");

    private static final Map c;
    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bam() {
        void var3_1;
        this.d = var3_1;
    }

    public static bam a(String string) {
        return (bam)((Object)c.get(string.toLowerCase()));
    }

    static {
        c = Maps.newHashMap();
        for (bam bam2 : bam.values()) {
            c.put(bam2.d, bam2);
        }
    }
}

