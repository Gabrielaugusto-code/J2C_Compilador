/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bfs
extends bfj {
    final /* synthetic */ bfq a;

    public bfs(bfq bfq2) {
        this.a = bfq2;
        super(bfq.f(bfq2), bfq2.l, bfq2.m, 32, bfq2.m - 64, 36);
    }

    @Override
    protected int a() {
        return bfq.c(this.a).size() + 1;
    }

    @Override
    protected void a(int n2, boolean bl2) {
        if (n2 >= bfq.c(this.a).size()) {
            return;
        }
        bvo bvo2 = (bvo)bfq.c(this.a).get(n2);
        bfq.b(this.a, bvo2.a);
        bfq.g((bfq)this.a).l = !bvo2.d.equals(bvp.c.name());
        boolean bl3 = bfq.h((bfq)this.a).l = !bvo2.d.equals(bvp.c.name());
        if (!this.a(bvo2)) {
            bfq.g((bfq)this.a).l = false;
        } else {
            bfq.h((bfq)this.a).l = false;
        }
        boolean bl4 = bfq.i((bfq)this.a).l = bvo2.d.equals(bvp.b.name()) && !bvo2.h;
        if (bl2 && bfq.i((bfq)this.a).l) {
            bfq.c(this.a, bfq.a(this.a));
        }
    }

    @Override
    protected boolean a(int n2) {
        return n2 == bfq.d(this.a, bfq.a(this.a));
    }

    @Override
    protected boolean b(int n2) {
        try {
            return n2 >= 0 && n2 < bfq.c(this.a).size() && ((bvo)bfq.c((bfq)this.a).get((int)n2)).e.toLowerCase().equals(bfq.j(this.a).M().c());
        }
        catch (Exception exception) {
            return false;
        }
    }

    @Override
    protected int b() {
        return this.a() * 36;
    }

    @Override
    protected void c() {
        this.a.q_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2) {
        if (n2 < bfq.c(this.a).size()) {
            this.a(n2, n3, n4);
        }
    }

    private void a(int n2, int n3, int n4) {
        bvo bvo2 = (bvo)bfq.c(this.a).get(n2);
        if (!bvo2.o) {
            bvo2.o = true;
            bfq.r().submit(new bft(this, bvo2));
        }
        int n5 = -1;
        if (this.a(bvo2)) {
            n5 = -8388737;
        }
        this.a.b(bfq.k(this.a), bvo2.b(), n3 + 2, n4 + 1, n5);
        int n6 = 207;
        int n7 = 1;
        if (bvo2.h) {
            bfq.a(this.a, n3 + n6, n4 + n7, this.e, this.f);
        } else if (bvo2.d.equals(bvp.a.name())) {
            bfq.b(this.a, n3 + n6, n4 + n7, this.e, this.f);
        } else if (this.a(bvo2) && bvo2.k < 7) {
            this.a(n3 - 14, n4, bvo2);
            bfq.a(this.a, n3 + n6, n4 + n7, this.e, this.f, bvo2.k);
        } else if (bvo2.d.equals(bvp.b.name())) {
            bfq.c(this.a, n3 + n6, n4 + n7, this.e, this.f);
            this.a(n3 - 14, n4, bvo2);
        } else if (bvo2.d.equals(bvp.c.name())) {
            bfq.d(this.a, n3 + n6, n4 + n7, this.e, this.f);
        }
        this.a.b(bfq.l(this.a), bvo2.n, n3 + 200 - bfq.m(this.a).a(bvo2.n), n4 + 1, 0x808080);
        this.a.b(bfq.n(this.a), bvo2.a(), n3 + 2, n4 + 12, 0x6C6C6C);
        this.a.b(bfq.o(this.a), bvo2.e, n3 + 2, n4 + 12 + 11, 0x4C4C4C);
        brq brq2 = bma.e(bvo2.e);
        bma.a(brq2, bvo2.e);
        bfq.p(this.a).P().a(brq2);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bap.a(n3 - 36, n4, 8.0f, 8.0f, 8, 8, 32, 32, 64.0f, 32.0f);
    }

    private void a(int n2, int n3, bvo bvo2) {
        if (bvo2.g == null) {
            return;
        }
        if (bvo2.m != null) {
            this.a.b(bfq.q(this.a), bvo2.m, n2 + 215 - bfq.r(this.a).a(bvo2.m), n3 + 1, 0x808080);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bfq.s(this.a).P().a(bap.d);
    }

    private boolean a(bvo bvo2) {
        return bvo2.e.equals(bfq.t(this.a).M().c());
    }
}

