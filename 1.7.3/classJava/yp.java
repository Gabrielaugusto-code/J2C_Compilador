/*
 * Decompiled with CFR 0.152.
 */
class yp
extends zp {
    final /* synthetic */ yo a;

    public yp(yo yo2, ps ps2, int n2, int n3, int n4) {
        this.a = yo2;
        super(ps2, n2, n3, n4);
    }

    @Override
    public boolean a(abu abu2) {
        if (abu2 != null) {
            return abu2.b() == abv.bC || abu2.b() == abv.i || abu2.b() == abv.k || abu2.b() == abv.j;
        }
        return false;
    }

    @Override
    public int a() {
        return 1;
    }
}

