/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

class bdf
extends bbf {
    private final List l;
    final /* synthetic */ bcz k;

    public bdf(bcz bcz2) {
        this.k = bcz2;
        super(bcz.p(bcz2), bcz2.l, bcz2.m, 32, bcz2.m - 64, bcz.q((bcz)bcz2).a * 4);
        this.l = new ArrayList();
        this.a(false);
        for (qy qy2 : qx.a.values()) {
            if (bcz.c(bcz2).a(qy2.d) <= 0 && bcz.c(bcz2).a(qy2.e) <= 0) continue;
            this.l.add(qy2);
        }
    }

    @Override
    protected int b() {
        return this.l.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected int e() {
        return this.b() * bcz.r((bcz)this.k).a * 4;
    }

    @Override
    protected void a() {
        this.k.q_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        qy qy2 = (qy)this.l.get(n2);
        String string = bsc.a("entity." + qx.b(qy2.a) + ".name", new Object[0]);
        int n8 = bcz.c(this.k).a(qy2.d);
        int n9 = bcz.c(this.k).a(qy2.e);
        String string2 = bsc.a("stat.entityKills", n8, string);
        String string3 = bsc.a("stat.entityKilledBy", string, n9);
        if (n8 == 0) {
            string2 = bsc.a("stat.entityKills.none", string);
        }
        if (n9 == 0) {
            string3 = bsc.a("stat.entityKilledBy.none", string);
        }
        this.k.b(bcz.s(this.k), string, n3 + 2 - 10, n4 + 1, 0xFFFFFF);
        this.k.b(bcz.t(this.k), string2, n3 + 2, n4 + 1 + bcz.u((bcz)this.k).a, n8 == 0 ? 0x606060 : 0x909090);
        this.k.b(bcz.v(this.k), string3, n3 + 2, n4 + 1 + bcz.w((bcz)this.k).a * 2, n9 == 0 ? 0x606060 : 0x909090);
    }
}

