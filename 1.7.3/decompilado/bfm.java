/*
 * Decompiled with CFR 0.152.
 */
class bfm
extends bfj {
    final /* synthetic */ bfk a;

    public bfm(bfk bfk2) {
        this.a = bfk2;
        super(bfk.b(bfk2), bfk2.l, bfk2.m, 32, bfk2.m - 64, 36);
    }

    @Override
    protected int a() {
        return bfk.c(this.a).size() + 1;
    }

    @Override
    protected void a(int n2, boolean bl2) {
        if (n2 >= bfk.c(this.a).size()) {
            return;
        }
        bfk.a(this.a, n2);
        bfk.a(this.a, null);
    }

    @Override
    protected boolean a(int n2) {
        if (bfk.c(this.a).size() == 0) {
            return false;
        }
        if (n2 >= bfk.c(this.a).size()) {
            return false;
        }
        if (bfk.d(this.a) != null) {
            boolean bl2 = bfk.d((bfk)this.a).b.equals(((bvx)bfk.c((bfk)this.a).get((int)n2)).b);
            if (bl2) {
                bfk.a(this.a, n2);
            }
            return bl2;
        }
        return n2 == bfk.e(this.a);
    }

    @Override
    protected boolean b(int n2) {
        return false;
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
        if (n2 < bfk.c(this.a).size()) {
            this.b(n2, n3, n4, n5, bna2);
        }
    }

    private void b(int n2, int n3, int n4, int n5, bna bna2) {
        bvx bvx2 = (bvx)bfk.c(this.a).get(n2);
        this.a.b(bfk.f(this.a), bvx2.b, n3 + 2, n4 + 1, 0xFFFFFF);
        this.a.b(bfk.g(this.a), bvx2.d, n3 + 2, n4 + 12, 0x6C6C6C);
        this.a.b(bfk.h(this.a), bvx2.c, n3 + 2 + 207 - bfk.i(this.a).a(bvx2.c), n4 + 1, 0x4C4C4C);
    }
}

