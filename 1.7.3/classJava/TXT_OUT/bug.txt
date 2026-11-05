/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class bug
extends cz {
    private Map a;

    @Override
    protected Map a() {
        this.a = Maps.newHashMap();
        return this.a;
    }

    public void a(bub bub2) {
        this.a(bub2.c(), bub2);
    }

    public void c() {
        this.a.clear();
    }
}

