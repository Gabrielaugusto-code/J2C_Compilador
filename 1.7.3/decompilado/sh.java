/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sh
extends sc {
    private final Set d = Sets.newHashSet();
    protected final Map c = new op();

    public se c(ry ry2) {
        return (se)super.a(ry2);
    }

    public se b(String string) {
        rz rz2 = super.a(string);
        if (rz2 == null) {
            rz2 = (rz)this.c.get(string);
        }
        return (se)rz2;
    }

    @Override
    public rz b(ry ry2) {
        if (this.b.containsKey(ry2.a())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        se se2 = new se(this, ry2);
        this.b.put(ry2.a(), se2);
        if (ry2 instanceof sf && ((sf)ry2).f() != null) {
            this.c.put(((sf)ry2).f(), se2);
        }
        this.a.put(ry2, se2);
        return se2;
    }

    @Override
    public void a(se se2) {
        if (se2.a().c()) {
            this.d.add(se2);
        }
    }

    public Set b() {
        return this.d;
    }

    public Collection c() {
        HashSet hashSet = Sets.newHashSet();
        for (rz rz2 : this.a()) {
            if (!rz2.a().c()) continue;
            hashSet.add(rz2);
        }
        return hashSet;
    }

    @Override
    public /* synthetic */ rz a(String string) {
        return this.b(string);
    }

    @Override
    public /* synthetic */ rz a(ry ry2) {
        return this.c(ry2);
    }
}

