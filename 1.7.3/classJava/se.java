/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class se
implements rz {
    private final sc a;
    private final ry b;
    private final Map c = Maps.newHashMap();
    private final Map d = Maps.newHashMap();
    private final Map e = Maps.newHashMap();
    private double f;
    private boolean g = true;
    private double h;

    public se(sc sc2, ry ry2) {
        this.a = sc2;
        this.b = ry2;
        this.f = ry2.b();
        for (int i2 = 0; i2 < 3; ++i2) {
            this.c.put(i2, new HashSet());
        }
    }

    @Override
    public ry a() {
        return this.b;
    }

    @Override
    public double b() {
        return this.f;
    }

    @Override
    public void a(double d2) {
        if (d2 == this.b()) {
            return;
        }
        this.f = d2;
        this.f();
    }

    public Collection a(int n2) {
        return (Collection)this.c.get(n2);
    }

    @Override
    public Collection c() {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 3; ++i2) {
            hashSet.addAll(this.a(i2));
        }
        return hashSet;
    }

    @Override
    public sa a(UUID uUID) {
        return (sa)this.e.get(uUID);
    }

    @Override
    public void a(sa sa2) {
        if (this.a(sa2.a()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        HashSet<sa> hashSet = (HashSet<sa>)this.d.get(sa2.b());
        if (hashSet == null) {
            hashSet = new HashSet<sa>();
            this.d.put(sa2.b(), hashSet);
        }
        ((Set)this.c.get(sa2.c())).add(sa2);
        hashSet.add(sa2);
        this.e.put(sa2.a(), sa2);
        this.f();
    }

    private void f() {
        this.g = true;
        this.a.a(this);
    }

    @Override
    public void b(sa sa2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            Set set = (Set)this.c.get(i2);
            set.remove(sa2);
        }
        Set set = (Set)this.d.get(sa2.b());
        if (set != null) {
            set.remove(sa2);
            if (set.isEmpty()) {
                this.d.remove(sa2.b());
            }
        }
        this.e.remove(sa2.a());
        this.f();
    }

    @Override
    public void d() {
        ArrayList arrayList = this.c();
        if (arrayList == null) {
            return;
        }
        arrayList = new ArrayList(arrayList);
        for (sa sa2 : arrayList) {
            this.b(sa2);
        }
    }

    @Override
    public double e() {
        if (this.g) {
            this.h = this.g();
            this.g = false;
        }
        return this.h;
    }

    private double g() {
        double d2 = this.b();
        for (sa sa2 : this.a(0)) {
            d2 += sa2.d();
        }
        double d3 = d2;
        for (sa sa3 : this.a(1)) {
            d3 += d2 * sa3.d();
        }
        for (sa sa3 : this.a(2)) {
            d3 *= 1.0 + sa3.d();
        }
        return this.b.a(d3);
    }
}

