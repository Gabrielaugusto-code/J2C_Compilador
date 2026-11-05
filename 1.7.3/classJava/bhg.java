/*
 * Decompiled with CFR 0.152.
 */
public class bhg
extends bcl {
    private final bcl a;
    private String f;
    private bhh g;

    public bhg(bcl bcl2) {
        this.a = bcl2;
    }

    @Override
    public void r_() {
        this.f = bsc.a("options.stream.ingest.title", new Object[0]);
        this.g = new bhh(this);
        if (!this.k.Z().z()) {
            this.k.Z().x();
        }
        this.n.add(new bau(1, this.l / 2 - 155, this.m - 24 - 6, 150, 20, bsc.a("gui.done", new Object[0])));
        this.n.add(new bau(2, this.l / 2 + 5, this.m - 24 - 6, 150, 20, bsc.a("options.stream.ingest.reset", new Object[0])));
    }

    @Override
    public void b() {
        if (this.k.Z().z()) {
            this.k.Z().y().l();
        }
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            this.k.a(this.a);
        } else {
            this.k.u.R = "";
            this.k.u.b();
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.g.a(n2, n3, f2);
        this.a(this.q, this.f, this.l / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ azi a(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi b(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi c(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi d(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi e(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi f(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi g(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi h(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi i(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ azi j(bhg bhg2) {
        return bhg2.k;
    }

    static /* synthetic */ ban k(bhg bhg2) {
        return bhg2.q;
    }

    static /* synthetic */ ban l(bhg bhg2) {
        return bhg2.q;
    }

    static /* synthetic */ ban m(bhg bhg2) {
        return bhg2.q;
    }

    static /* synthetic */ ban n(bhg bhg2) {
        return bhg2.q;
    }

    static /* synthetic */ ban o(bhg bhg2) {
        return bhg2.q;
    }

    static /* synthetic */ ban p(bhg bhg2) {
        return bhg2.q;
    }

    static /* synthetic */ ban q(bhg bhg2) {
        return bhg2.q;
    }

    static /* synthetic */ ban r(bhg bhg2) {
        return bhg2.q;
    }
}

