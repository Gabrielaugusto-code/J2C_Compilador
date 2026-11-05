/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class sc {
    protected final Map a = new HashMap();
    protected final Map b = new op();

    public rz a(ry ry2) {
        return (rz)this.a.get(ry2);
    }

    public rz a(String string) {
        return (rz)this.b.get(string);
    }

    public abstract rz b(ry var1);

    public Collection a() {
        return this.b.values();
    }

    public void a(se se2) {
    }

    public void a(Multimap multimap) {
        for (Map.Entry entry : multimap.entries()) {
            rz rz2 = this.a((String)entry.getKey());
            if (rz2 == null) continue;
            rz2.b((sa)entry.getValue());
        }
    }

    public void b(Multimap multimap) {
        for (Map.Entry entry : multimap.entries()) {
            rz rz2 = this.a((String)entry.getKey());
            if (rz2 == null) continue;
            rz2.b((sa)entry.getValue());
            rz2.a((sa)entry.getValue());
        }
    }
}

