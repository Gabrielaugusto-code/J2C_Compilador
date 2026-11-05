/*
 * Decompiled with CFR 0.152.
 */
final class kt
extends cl {
    private final cl b = new cl();

    kt() {
    }

    @Override
    public abu b(cj cj2, abu abu2) {
        double d2;
        int n2;
        int n3;
        cq cq2 = ajd.b(cj2.h());
        afs afs2 = cj2.k();
        double d3 = cj2.a() + (double)((float)cq2.c() * 1.125f);
        double d4 = cj2.b() + (double)((float)cq2.d() * 1.125f);
        double d5 = cj2.c() + (double)((float)cq2.e() * 1.125f);
        int n4 = cj2.d() + cq2.c();
        avk avk2 = afs2.a(n4, n3 = cj2.e() + cq2.d(), n2 = cj2.f() + cq2.e()).o();
        if (avk.h.equals(avk2)) {
            d2 = 1.0;
        } else if (avk.a.equals(avk2) && avk.h.equals(afs2.a(n4, n3 - 1, n2).o())) {
            d2 = 0.0;
        } else {
            return this.b.a(cj2, abu2);
        }
        vz vz2 = new vz(afs2, d3, d4 + d2, d5);
        afs2.d(vz2);
        abu2.a(1);
        return abu2;
    }

    @Override
    protected void a(cj cj2) {
        cj2.k().c(1000, cj2.d(), cj2.e(), cj2.f(), 0);
    }
}

