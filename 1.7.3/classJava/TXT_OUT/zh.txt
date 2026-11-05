/*
 * Decompiled with CFR 0.152.
 */
class zh
extends zp {
    final /* synthetic */ int a;
    final /* synthetic */ zg b;

    zh(zg zg2, ps ps2, int n2, int n3, int n4, int n5) {
        this.b = zg2;
        this.a = n5;
        super(ps2, n2, n3, n4);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public boolean a(abu abu2) {
        if (abu2 == null) {
            return false;
        }
        if (abu2.b() instanceof zs) {
            return ((zs)abu2.b()).b == this.a;
        }
        if (abu2.b() == abs.a(aie.aK) || abu2.b() == abv.bL) {
            return this.a == 0;
        }
        return false;
    }

    @Override
    public pw c() {
        return zs.b(this.a);
    }
}

