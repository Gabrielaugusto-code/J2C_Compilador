/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class fu
extends fk {
    private Map a;

    public fu() {
    }

    public fu(Map map) {
        this.a = map;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public void a(ep ep2) {
        int n2 = ep2.a();
        this.a = Maps.newHashMap();
        for (int i2 = 0; i2 < n2; ++i2) {
            ny ny2 = og.a(ep2.c(Short.MAX_VALUE));
            int n3 = ep2.a();
            if (ny2 == null) continue;
            this.a.put(ny2, n3);
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            ep2.a(((ny)entry.getKey()).e);
            ep2.b((Integer)entry.getValue());
        }
    }

    @Override
    public String b() {
        return String.format("count=%d", this.a.size());
    }

    public Map c() {
        return this.a;
    }
}

