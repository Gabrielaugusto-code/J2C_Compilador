/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public abstract class ev
implements fa {
    protected List a = Lists.newArrayList();
    private fe b;

    @Override
    public fa a(fa fa2) {
        fa2.b().a(this.b());
        this.a.add(fa2);
        return this;
    }

    @Override
    public List a() {
        return this.a;
    }

    @Override
    public fa a(String string) {
        return this.a(new fh(string));
    }

    @Override
    public fa a(fe fe2) {
        this.b = fe2;
        for (fa fa2 : this.a) {
            fa2.b().a(this.b());
        }
        return this;
    }

    @Override
    public fe b() {
        if (this.b == null) {
            this.b = new fe();
            for (fa fa2 : this.a) {
                fa2.b().a(this.b);
            }
        }
        return this.b;
    }

    public Iterator iterator() {
        return Iterators.concat((Iterator)Iterators.forArray((Object[])new ev[]{this}), (Iterator)ev.a(this.a));
    }

    @Override
    public final String c() {
        StringBuilder stringBuilder = new StringBuilder();
        for (fa fa2 : this) {
            stringBuilder.append(fa2.e());
        }
        return stringBuilder.toString();
    }

    @Override
    public final String d() {
        StringBuilder stringBuilder = new StringBuilder();
        for (fa fa2 : this) {
            stringBuilder.append(fa2.b().j());
            stringBuilder.append(fa2.e());
            stringBuilder.append((Object)a.v);
        }
        return stringBuilder.toString();
    }

    public static Iterator a(Iterable iterable) {
        Iterator iterator = Iterators.concat((Iterator)Iterators.transform(iterable.iterator(), (Function)new ew()));
        iterator = Iterators.transform((Iterator)iterator, (Function)new ex());
        return iterator;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ev) {
            ev ev2 = (ev)object;
            return ((Object)this.a).equals(ev2.a) && this.b().equals(ev2.b());
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + ((Object)this.a).hashCode();
    }

    public String toString() {
        return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
    }
}

