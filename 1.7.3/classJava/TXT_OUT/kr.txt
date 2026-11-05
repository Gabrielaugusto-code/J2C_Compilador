/*
 * Decompiled with CFR 0.152.
 */
final class kr
extends cl {
    kr() {
    }

    @Override
    public abu b(cj cj2, abu abu2) {
        cq cq2 = ajd.b(cj2.h());
        double d2 = cj2.a() + (double)cq2.c();
        double d3 = (float)cj2.e() + 0.2f;
        double d4 = cj2.c() + (double)cq2.e();
        xw xw2 = new xw(cj2.k(), d2, d3, d4, abu2);
        cj2.k().d(xw2);
        abu2.a(1);
        return abu2;
    }

    @Override
    protected void a(cj cj2) {
        cj2.k().c(1002, cj2.d(), cj2.e(), cj2.f(), 0);
    }
}

