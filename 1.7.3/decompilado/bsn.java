/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bsn
implements bsh {
    private final List a;
    private final int b;
    private final int c;
    private final int d;

    public bsn(List list, int n2, int n3, int n4) {
        this.a = list;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a.size();
    }

    public int d() {
        return this.d;
    }

    private bsm d(int n2) {
        return (bsm)this.a.get(n2);
    }

    public int a(int n2) {
        bsm bsm2 = this.d(n2);
        if (bsm2.a()) {
            return this.d;
        }
        return bsm2.b();
    }

    public boolean b(int n2) {
        return !((bsm)this.a.get(n2)).a();
    }

    public int c(int n2) {
        return ((bsm)this.a.get(n2)).c();
    }

    public Set e() {
        HashSet hashSet = Sets.newHashSet();
        for (bsm bsm2 : this.a) {
            hashSet.add(bsm2.c());
        }
        return hashSet;
    }
}

