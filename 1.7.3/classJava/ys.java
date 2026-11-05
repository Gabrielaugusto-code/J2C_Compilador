/*
 * Decompiled with CFR 0.152.
 */
class ys
extends zp {
    private xq a;

    public ys(xq xq2, ps ps2, int n2, int n3, int n4) {
        super(ps2, n2, n3, n4);
        this.a = xq2;
    }

    @Override
    public boolean a(abu abu2) {
        return ys.b_(abu2);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(xq xq2, abu abu2) {
        if (abu2.b() == abv.bn && abu2.k() > 0) {
            this.a.a(nt.B, 1);
        }
        super.a(xq2, abu2);
    }

    public static boolean b_(abu abu2) {
        return abu2 != null && (abu2.b() == abv.bn || abu2.b() == abv.bo);
    }
}

