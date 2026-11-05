/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

final class ks
extends cl {
    ks() {
    }

    @Override
    public abu b(cj cj2, abu abu2) {
        cq cq2 = ajd.b(cj2.h());
        cw cw2 = ajd.a(cj2);
        double d2 = cw2.a() + (double)((float)cq2.c() * 0.3f);
        double d3 = cw2.b() + (double)((float)cq2.c() * 0.3f);
        double d4 = cw2.c() + (double)((float)cq2.e() * 0.3f);
        afs afs2 = cj2.k();
        Random random = afs2.s;
        double d5 = random.nextGaussian() * 0.05 + (double)cq2.c();
        double d6 = random.nextGaussian() * 0.05 + (double)cq2.d();
        double d7 = random.nextGaussian() * 0.05 + (double)cq2.e();
        afs2.d(new xz(afs2, d2, d3, d4, d5, d6, d7));
        abu2.a(1);
        return abu2;
    }

    @Override
    protected void a(cj cj2) {
        cj2.k().c(1009, cj2.d(), cj2.e(), cj2.f(), 0);
    }
}

