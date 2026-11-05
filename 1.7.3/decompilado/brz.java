/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class brz
implements bro {
    private static final Logger a = LogManager.getLogger();
    private static final Joiner b = Joiner.on((String)", ");
    private final Map c = Maps.newHashMap();
    private final List d = Lists.newArrayList();
    private final Set e = Sets.newLinkedHashSet();
    private final bsj f;

    public brz(bsj bsj2) {
        this.f = bsj2;
    }

    public void a(brt brt2) {
        for (String string : brt2.c()) {
            this.e.add(string);
            brj brj2 = (brj)this.c.get(string);
            if (brj2 == null) {
                brj2 = new brj(this.f);
                this.c.put(string, brj2);
            }
            brj2.a(brt2);
        }
    }

    @Override
    public Set a() {
        return this.e;
    }

    @Override
    public brp a(brq brq2) {
        brr brr2 = (brr)this.c.get(brq2.b());
        if (brr2 != null) {
            return brr2.a(brq2);
        }
        throw new FileNotFoundException(brq2.toString());
    }

    @Override
    public List b(brq brq2) {
        brr brr2 = (brr)this.c.get(brq2.b());
        if (brr2 != null) {
            return brr2.b(brq2);
        }
        throw new FileNotFoundException(brq2.toString());
    }

    private void b() {
        this.c.clear();
        this.e.clear();
    }

    @Override
    public void a(List list) {
        this.b();
        a.info("Reloading ResourceManager: " + b.join(Iterables.transform((Iterable)list, (Function)new bsa(this))));
        for (brt brt2 : list) {
            this.a(brt2);
        }
        this.c();
    }

    @Override
    public void a(brs brs2) {
        this.d.add(brs2);
        brs2.a(this);
    }

    private void c() {
        for (brs brs2 : this.d) {
            brs2.a(this);
        }
    }
}

