/*
 * Decompiled with CFR 0.152.
 */
class bcq
extends bbf {
    final /* synthetic */ bcp k;

    public bcq(bcp bcp2) {
        this.k = bcp2;
        super(bcp2.k, bcp2.l, bcp2.m, 80, bcp2.m - 40, bcp2.q.a + 1);
    }

    @Override
    protected int b() {
        return bcp.a(this.k).size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        this.k.q.b((String)bcp.a(this.k).get(n2), 10, n4, 0xFFFFFF);
        this.k.q.b((String)bcp.b(this.k).get(n2), 230, n4, 0xFFFFFF);
    }

    @Override
    protected int d() {
        return this.a - 10;
    }
}

