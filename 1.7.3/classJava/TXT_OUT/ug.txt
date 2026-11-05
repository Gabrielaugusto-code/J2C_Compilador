/*
 * Decompiled with CFR 0.152.
 */
class ug
implements ra {
    final /* synthetic */ ra d;
    final /* synthetic */ uf e;

    ug(uf uf2, ra ra2) {
        this.e = uf2;
        this.d = ra2;
    }

    @Override
    public boolean a(qr qr2) {
        if (!(qr2 instanceof rm)) {
            return false;
        }
        if (this.d != null && !this.d.a(qr2)) {
            return false;
        }
        return this.e.a((rm)qr2, false);
    }
}

