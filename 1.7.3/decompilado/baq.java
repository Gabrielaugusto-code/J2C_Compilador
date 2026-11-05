/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class baq {
    private static final brq a = new brq("textures/map/map_icons.png");
    private final bqy b;
    private final Map c = Maps.newHashMap();

    public baq(bqy bqy2) {
        this.b = bqy2;
    }

    public void a(awz awz2) {
        bas.a(this.b(awz2));
    }

    public void a(awz awz2, boolean bl2) {
        bas.a(this.b(awz2), bl2);
    }

    private bas b(awz awz2) {
        bas bas2 = (bas)this.c.get(awz2.h);
        if (bas2 == null) {
            bas2 = new bas(this, awz2, null);
            this.c.put(awz2.h, bas2);
        }
        return bas2;
    }

    public void a() {
        for (bas bas2 : this.c.values()) {
            this.b.c(bas.b(bas2));
        }
        this.c.clear();
    }

    static /* synthetic */ bqy a(baq baq2) {
        return baq2.b;
    }

    static /* synthetic */ brq b() {
        return a;
    }
}

