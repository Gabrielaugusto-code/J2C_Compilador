/*
 * Decompiled with CFR 0.152.
 */
class bdc
extends bbf {
    final /* synthetic */ bcz k;

    public bdc(bcz bcz2) {
        this.k = bcz2;
        super(bcz.a(bcz2), bcz2.l, bcz2.m, 32, bcz2.m - 64, 10);
        this.a(false);
    }

    @Override
    protected int b() {
        return og.c.size();
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
        return this.b() * 10;
    }

    @Override
    protected void a() {
        this.k.q_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        ny ny2 = (ny)og.c.get(n2);
        this.k.b(bcz.b(this.k), ny2.e().c(), n3 + 2, n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
        String string = ny2.a(bcz.c(this.k).a(ny2));
        this.k.b(bcz.d(this.k), string, n3 + 2 + 213 - bcz.e(this.k).a(string), n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
    }
}

