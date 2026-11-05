/*
 * Decompiled with CFR 0.152.
 */
final class kh
extends cl {
    private final cl b = new cl();

    kh() {
    }

    @Override
    public abu b(cj cj2, abu abu2) {
        abs abs2;
        cq cq2 = ajd.b(cj2.h());
        afs afs2 = cj2.k();
        int n2 = cj2.d() + cq2.c();
        int n3 = cj2.e() + cq2.d();
        int n4 = cj2.f() + cq2.e();
        avk avk2 = afs2.a(n2, n3, n4).o();
        int n5 = afs2.e(n2, n3, n4);
        if (avk.h.equals(avk2) && n5 == 0) {
            abs2 = abv.as;
        } else if (avk.i.equals(avk2) && n5 == 0) {
            abs2 = abv.at;
        } else {
            return super.b(cj2, abu2);
        }
        afs2.f(n2, n3, n4);
        if (--abu2.b == 0) {
            abu2.a(abs2);
            abu2.b = 1;
        } else if (((ans)cj2.j()).a(new abu(abs2)) < 0) {
            this.b.a(cj2, new abu(abs2));
        }
        return abu2;
    }
}

