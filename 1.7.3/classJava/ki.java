/*
 * Decompiled with CFR 0.152.
 */
final class ki
extends cl {
    private boolean b = true;

    ki() {
    }

    @Override
    protected abu b(cj cj2, abu abu2) {
        int n2;
        int n3;
        int n4;
        cq cq2 = ajd.b(cj2.h());
        afs afs2 = cj2.k();
        if (afs2.c(n4 = cj2.d() + cq2.c(), n3 = cj2.e() + cq2.d(), n2 = cj2.f() + cq2.e())) {
            afs2.b(n4, n3, n2, aie.ab);
            if (abu2.a(1, afs2.s)) {
                abu2.b = 0;
            }
        } else if (afs2.a(n4, n3, n2) == aie.W) {
            aie.W.b(afs2, n4, n3, n2, 1);
            afs2.f(n4, n3, n2);
        } else {
            this.b = false;
        }
        return abu2;
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

