/*
 * Decompiled with CFR 0.152.
 */
public class aad
extends abs {
    public static final String[] a = new String[]{"pulling_0", "pulling_1", "pulling_2"};
    private pw[] b;

    public aad() {
        this.h = 1;
        this.f(384);
        this.a(aak.j);
    }

    @Override
    public void a(abu abu2, afs afs2, xq xq2, int n2) {
        boolean bl2;
        boolean bl3 = bl2 = xq2.bE.d || aem.a(aek.y.B, abu2) > 0;
        if (bl2 || xq2.bm.b(abv.g)) {
            int n3;
            int n4;
            int n5 = this.d_(abu2) - n2;
            float f2 = (float)n5 / 20.0f;
            if ((double)(f2 = (f2 * f2 + f2 * 2.0f) / 3.0f) < 0.1) {
                return;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            xt xt2 = new xt(afs2, xq2, f2 * 2.0f);
            if (f2 == 1.0f) {
                xt2.a(true);
            }
            if ((n4 = aem.a(aek.v.B, abu2)) > 0) {
                xt2.b(xt2.e() + (double)n4 * 0.5 + 0.5);
            }
            if ((n3 = aem.a(aek.w.B, abu2)) > 0) {
                xt2.a(n3);
            }
            if (aem.a(aek.x.B, abu2) > 0) {
                xt2.e(100);
            }
            abu2.a(1, (rm)xq2);
            afs2.a((qr)xq2, "random.bow", 1.0f, 1.0f / (g.nextFloat() * 0.4f + 1.2f) + f2 * 0.5f);
            if (bl2) {
                xt2.a = 2;
            } else {
                xq2.bm.a(abv.g);
            }
            if (!afs2.E) {
                afs2.d(xt2);
            }
        }
    }

    @Override
    public abu b(abu abu2, afs afs2, xq xq2) {
        return abu2;
    }

    @Override
    public int d_(abu abu2) {
        return 72000;
    }

    @Override
    public acz d(abu abu2) {
        return acz.e;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        if (xq2.bE.d || xq2.bm.b(abv.g)) {
            xq2.a(abu2, this.d_(abu2));
        }
        return abu2;
    }

    @Override
    public int c() {
        return 1;
    }

    @Override
    public void a(px px2) {
        this.k = px2.a(this.w() + "_standby");
        this.b = new pw[a.length];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = px2.a(this.w() + "_" + a[i2]);
        }
    }

    public pw c(int n2) {
        return this.b[n2];
    }
}

