/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cs
implements cr {
    private TIntIntHashMap a = new TIntIntHashMap(256, 0.5f, -1, -1);
    private List b = new ArrayList();

    public void a(Object object, int n2) {
        this.a.put(System.identityHashCode(object), n2);
        while (this.b.size() <= n2) {
            this.b.add(null);
        }
        this.b.set(n2, object);
    }

    public int b(Object object) {
        return this.a.get(System.identityHashCode(object));
    }

    public Object a(int n2) {
        if (n2 >= 0 && n2 < this.b.size()) {
            return this.b.get(n2);
        }
        return null;
    }

    public Iterator iterator() {
        return Iterators.filter(this.b.iterator(), (Predicate)Predicates.notNull());
    }

    public boolean b(int n2) {
        return this.a(n2) != null;
    }
}

