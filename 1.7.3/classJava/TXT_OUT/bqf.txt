/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum bqf {
    a("vertex", ".vsh", bwg.q),
    b("fragment", ".fsh", bwg.r);

    private final String c;
    private final String d;
    private final int e;
    private final Map f = Maps.newHashMap();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bqf(int n2) {
        void var5_3;
        void var4_2;
        this.c = (String)n2;
        this.d = var4_2;
        this.e = var5_3;
    }

    public String a() {
        return this.c;
    }

    protected String b() {
        return this.d;
    }

    protected int c() {
        return this.e;
    }

    protected Map d() {
        return this.f;
    }
}

