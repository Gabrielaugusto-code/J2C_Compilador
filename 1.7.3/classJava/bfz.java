/*
 * Decompiled with CFR 0.152.
 */
class bfz
extends bfj {
    final /* synthetic */ bfv a;

    public bfz(bfv bfv2) {
        this.a = bfv2;
        super(bfv.g(bfv2), bfv2.l, bfv2.m, 32, bfv2.m - 64, 36);
    }

    @Override
    protected int a() {
        return bfv.d(this.a).size() + 1;
    }

    @Override
    protected void a(int n2, boolean bl2) {
        if (n2 >= bfv.d(this.a).size()) {
            return;
        }
        bfv.a(this.a, n2);
    }

    @Override
    protected boolean a(int n2) {
        return n2 == bfv.c(this.a);
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
        if (n2 < bfv.d(this.a).size()) {
            this.b(n2, n3, n4, n5, bna2);
        }
    }

    private void b(int n2, int n3, int n4, int n5, bna bna2) {
        bvs bvs2 = (bvs)bfv.d(this.a).get(n2);
        this.a.b(bfv.h(this.a), bvs2.b, n3 + 2, n4 + 1, 0xFFFFFF);
        this.a.b(bfv.i(this.a), bvs2.c, n3 + 2, n4 + 12, 0x6C6C6C);
    }
}

