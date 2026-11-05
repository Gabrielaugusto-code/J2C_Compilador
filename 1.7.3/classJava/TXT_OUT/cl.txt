/*
 * Decompiled with CFR 0.152.
 */
public class cl
implements co {
    @Override
    public final abu a(cj cj2, abu abu2) {
        abu abu3 = this.b(cj2, abu2);
        this.a(cj2);
        this.a(cj2, ajd.b(cj2.h()));
        return abu3;
    }

    protected abu b(cj cj2, abu abu2) {
        cq cq2 = ajd.b(cj2.h());
        cw cw2 = ajd.a(cj2);
        abu abu3 = abu2.a(1);
        cl.a(cj2.k(), abu3, 6, cq2, cw2);
        return abu2;
    }

    public static void a(afs afs2, abu abu2, int n2, cq cq2, cw cw2) {
        double d2 = cw2.a();
        double d3 = cw2.b();
        double d4 = cw2.c();
        wb wb2 = new wb(afs2, d2, d3 - 0.3, d4, abu2);
        double d5 = afs2.s.nextDouble() * 0.1 + 0.2;
        wb2.v = (double)cq2.c() * d5;
        wb2.w = 0.2f;
        wb2.x = (double)cq2.e() * d5;
        wb2.v += afs2.s.nextGaussian() * (double)0.0075f * (double)n2;
        wb2.w += afs2.s.nextGaussian() * (double)0.0075f * (double)n2;
        wb2.x += afs2.s.nextGaussian() * (double)0.0075f * (double)n2;
        afs2.d(wb2);
    }

    protected void a(cj cj2) {
        cj2.k().c(1000, cj2.d(), cj2.e(), cj2.f(), 0);
    }

    protected void a(cj cj2, cq cq2) {
        cj2.k().c(2000, cj2.d(), cj2.e(), cj2.f(), this.a(cq2));
    }

    private int a(cq cq2) {
        return cq2.c() + 1 + (cq2.e() + 1) * 3;
    }
}

