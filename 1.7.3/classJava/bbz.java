/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

class bbz
extends bbf {
    private final List l;
    private final Map m;
    final /* synthetic */ bby k;

    public bbz(bby bby2) {
        this.k = bby2;
        super(bby2.k, bby2.l, bby2.m, 32, bby2.m - 65 + 4, 18);
        this.l = Lists.newArrayList();
        this.m = Maps.newHashMap();
        for (bsd bsd2 : bby.a(bby2).d()) {
            this.m.put(bsd2.a(), bsd2);
            this.l.add(bsd2.a());
        }
    }

    @Override
    protected int b() {
        return this.l.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        bsd bsd2 = (bsd)this.m.get(this.l.get(n2));
        bby.a(this.k).a(bsd2);
        bby.b((bby)this.k).aL = bsd2.a();
        this.k.k.c();
        this.k.q.a(bby.a(this.k).a() || bby.b((bby)this.k).aM);
        this.k.q.b(bby.a(this.k).b());
        bby.c((bby)this.k).j = bsc.a("gui.done", new Object[0]);
        bby.d((bby)this.k).j = bby.b(this.k).c(baf.I);
        bby.b(this.k).b();
    }

    @Override
    protected boolean a(int n2) {
        return ((String)this.l.get(n2)).equals(bby.a(this.k).c().a());
    }

    @Override
    protected int e() {
        return this.b() * 18;
    }

    @Override
    protected void a() {
        this.k.q_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        this.k.q.b(true);
        this.k.a(this.k.q, ((bsd)this.m.get(this.l.get(n2))).toString(), this.a / 2, n4 + 1, 0xFFFFFF);
        this.k.q.b(bby.a(this.k).c().b());
    }
}

