/*
 * Decompiled with CFR 0.152.
 */
public class acd
extends abs {
    public acd() {
        this.a(aak.i);
    }

    @Override
    public boolean a(abu abu2, xq xq2, rm rm2) {
        if (!abu2.u()) {
            return false;
        }
        if (rm2 instanceof rn) {
            rn rn2 = (rn)rm2;
            rn2.a(abu2.s());
            rn2.bF();
            --abu2.b;
            return true;
        }
        return super.a(abu2, xq2, rm2);
    }
}

