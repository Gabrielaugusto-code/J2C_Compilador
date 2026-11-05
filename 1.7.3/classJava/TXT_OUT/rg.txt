/*
 * Decompiled with CFR 0.152.
 */
public class rg
implements ra {
    private final abu d;

    public rg(abu abu2) {
        this.d = abu2;
    }

    @Override
    public boolean a(qr qr2) {
        if (!qr2.Y()) {
            return false;
        }
        if (!(qr2 instanceof rm)) {
            return false;
        }
        rm rm2 = (rm)qr2;
        if (rm2.q(rn.b(this.d)) != null) {
            return false;
        }
        if (rm2 instanceof rn) {
            return ((rn)rm2).bJ();
        }
        return rm2 instanceof xq;
    }
}

