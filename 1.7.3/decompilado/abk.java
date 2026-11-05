/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class abk
extends abo {
    private final boolean b;

    public abk(boolean bl2) {
        super(0, 0.0f, false);
        this.b = bl2;
    }

    @Override
    public int g(abu abu2) {
        abl abl2 = abl.a(abu2);
        if (this.b && abl2.i()) {
            return abl2.e();
        }
        return abl2.c();
    }

    @Override
    public float h(abu abu2) {
        abl abl2 = abl.a(abu2);
        if (this.b && abl2.i()) {
            return abl2.f();
        }
        return abl2.d();
    }

    @Override
    public String i(abu abu2) {
        if (abl.a(abu2) == abl.d) {
            return ade.m;
        }
        return null;
    }

    @Override
    public void a(px px2) {
        for (abl abl2 : abl.values()) {
            abl2.a(px2);
        }
    }

    @Override
    protected void c(abu abu2, afs afs2, xq xq2) {
        abl abl2 = abl.a(abu2);
        if (abl2 == abl.d) {
            xq2.c(new qn(qm.u.H, 1200, 3));
            xq2.c(new qn(qm.s.H, 300, 2));
            xq2.c(new qn(qm.k.H, 300, 1));
        }
        super.c(abu2, afs2, xq2);
    }

    @Override
    public pw b_(int n2) {
        abl abl2 = abl.a(n2);
        if (this.b && abl2.i()) {
            return abl2.h();
        }
        return abl2.g();
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (abl abl2 : abl.values()) {
            if (this.b && !abl2.i()) continue;
            list.add(new abu(this, 1, abl2.a()));
        }
    }

    @Override
    public String a(abu abu2) {
        abl abl2 = abl.a(abu2);
        return this.a() + "." + abl2.b() + "." + (this.b && abl2.i() ? "cooked" : "raw");
    }
}

