/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bcz
extends bcl
implements bdh {
    private static bor g = new bor();
    protected bcl a;
    protected String f = "Select world";
    private bdc h;
    private bdd i;
    private bda r;
    private bdf s;
    private oh t;
    private bbf u;
    private boolean v = true;

    public bcz(bcl bcl2, oh oh2) {
        this.a = bcl2;
        this.t = oh2;
    }

    @Override
    public void r_() {
        this.f = bsc.a("gui.stats", new Object[0]);
        this.k.v().a(new ij(ik.b));
    }

    public void h() {
        this.n.add(new bau(0, this.l / 2 + 4, this.m - 28, 150, 20, bsc.a("gui.done", new Object[0])));
        this.n.add(new bau(1, this.l / 2 - 160, this.m - 52, 80, 20, bsc.a("stat.generalButton", new Object[0])));
        bau bau2 = new bau(2, this.l / 2 - 80, this.m - 52, 80, 20, bsc.a("stat.blocksButton", new Object[0]));
        this.n.add(bau2);
        bau bau3 = new bau(3, this.l / 2, this.m - 52, 80, 20, bsc.a("stat.itemsButton", new Object[0]));
        this.n.add(bau3);
        bau bau4 = new bau(4, this.l / 2 + 80, this.m - 52, 80, 20, bsc.a("stat.mobsButton", new Object[0]));
        this.n.add(bau4);
        if (this.r.b() == 0) {
            bau2.l = false;
        }
        if (this.i.b() == 0) {
            bau3.l = false;
        }
        if (this.s.b() == 0) {
            bau4.l = false;
        }
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 0) {
            this.k.a(this.a);
        } else if (bau2.k == 1) {
            this.u = this.h;
        } else if (bau2.k == 3) {
            this.u = this.i;
        } else if (bau2.k == 2) {
            this.u = this.r;
        } else if (bau2.k == 4) {
            this.u = this.s;
        } else {
            this.u.a(bau2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.v) {
            this.q_();
            this.a(this.q, bsc.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 0xFFFFFF);
            this.a(this.q, b_[(int)(azi.K() / 150L % (long)b_.length)], this.l / 2, this.m / 2 + this.q.a * 2, 0xFFFFFF);
        } else {
            this.u.a(n2, n3, f2);
            this.a(this.q, this.f, this.l / 2, 20, 0xFFFFFF);
            super.a(n2, n3, f2);
        }
    }

    @Override
    public void g() {
        if (this.v) {
            this.h = new bdc(this);
            this.h.d(1, 1);
            this.i = new bdd(this);
            this.i.d(1, 1);
            this.r = new bda(this);
            this.r.d(1, 1);
            this.s = new bdf(this);
            this.s.d(1, 1);
            this.u = this.h;
            this.h();
            this.v = false;
        }
    }

    @Override
    public boolean f() {
        return !this.v;
    }

    private void a(int n2, int n3, abs abs2) {
        this.b(n2 + 1, n3 + 1);
        GL11.glEnable((int)32826);
        azg.c();
        g.a(this.q, this.k.P(), new abu(abs2, 1, 0), n2 + 2, n3 + 2);
        azg.a();
        GL11.glDisable((int)32826);
    }

    private void b(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    private void c(int n2, int n3, int n4, int n5) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(c);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(n2 + 0, n3 + 18, this.e, (float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f);
        bna2.a(n2 + 18, n3 + 18, this.e, (float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f);
        bna2.a(n2 + 18, n3 + 0, this.e, (float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f);
        bna2.a(n2 + 0, n3 + 0, this.e, (float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f);
        bna2.a();
    }

    static /* synthetic */ azi a(bcz bcz2) {
        return bcz2.k;
    }

    static /* synthetic */ ban b(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ oh c(bcz bcz2) {
        return bcz2.t;
    }

    static /* synthetic */ ban d(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban e(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ azi f(bcz bcz2) {
        return bcz2.k;
    }

    static /* synthetic */ void a(bcz bcz2, int n2, int n3, int n4, int n5) {
        bcz2.c(n2, n3, n4, n5);
    }

    static /* synthetic */ azi g(bcz bcz2) {
        return bcz2.k;
    }

    static /* synthetic */ ban h(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban i(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban j(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban k(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban l(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ void a(bcz bcz2, int n2, int n3, int n4, int n5, int n6, int n7) {
        bcz2.a(n2, n3, n4, n5, n6, n7);
    }

    static /* synthetic */ ban m(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban n(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ void b(bcz bcz2, int n2, int n3, int n4, int n5, int n6, int n7) {
        bcz2.a(n2, n3, n4, n5, n6, n7);
    }

    static /* synthetic */ ban o(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ void a(bcz bcz2, int n2, int n3, abs abs2) {
        bcz2.a(n2, n3, abs2);
    }

    static /* synthetic */ azi p(bcz bcz2) {
        return bcz2.k;
    }

    static /* synthetic */ ban q(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban r(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban s(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban t(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban u(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban v(bcz bcz2) {
        return bcz2.q;
    }

    static /* synthetic */ ban w(bcz bcz2) {
        return bcz2.q;
    }
}

