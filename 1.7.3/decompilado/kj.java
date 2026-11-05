/*
 * Decompiled with CFR 0.152.
 */
final class kj
extends cl {
    private boolean b = true;

    kj() {
    }

    @Override
    protected abu b(cj cj2, abu abu2) {
        if (abu2.k() == 15) {
            int n2;
            int n3;
            int n4;
            cq cq2 = ajd.b(cj2.h());
            afs afs2 = cj2.k();
            if (aba.a(abu2, afs2, n4 = cj2.d() + cq2.c(), n3 = cj2.e() + cq2.d(), n2 = cj2.f() + cq2.e())) {
                if (!afs2.E) {
                    afs2.c(2005, n4, n3, n2, 0);
                }
            } else {
                this.b = false;
            }
            return abu2;
        }
        return super.b(cj2, abu2);
    }

    @Override
    protected void a(cj cj2) {
        if (this.b) {
            cj2.k().c(1000, cj2.d(), cj2.e(), cj2.f(), 0);
        } else {
            cj2.k().c(1001, cj2.d(), cj2.e(), cj2.f(), 0);
        }
    }
}

