/*
 * Decompiled with CFR 0.152.
 */
public class abe
extends abs {
    public abe() {
        this.a(aak.f);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        ahz ahz2 = afs2.a(n2, n3, n4);
        int n6 = afs2.e(n2, n3, n4);
        if (xq2.a(n2, n3, n4, n5, abu2) && ahz2 == aie.br && !ajl.b(n6)) {
            int n7;
            int n8;
            int n9;
            if (afs2.E) {
                return true;
            }
            afs2.a(n2, n3, n4, n6 + 4, 2);
            afs2.f(n2, n3, n4, aie.br);
            --abu2.b;
            for (n9 = 0; n9 < 16; ++n9) {
                double d2 = (float)n2 + (5.0f + g.nextFloat() * 6.0f) / 16.0f;
                double d3 = (float)n3 + 0.8125f;
                double d4 = (float)n4 + (5.0f + g.nextFloat() * 6.0f) / 16.0f;
                double d5 = 0.0;
                double d6 = 0.0;
                double d7 = 0.0;
                afs2.a("smoke", d2, d3, d4, d5, d6, d7);
            }
            n9 = n6 & 3;
            int n10 = 0;
            int n11 = 0;
            boolean bl2 = false;
            boolean bl3 = true;
            int n12 = p.g[n9];
            for (n8 = -2; n8 <= 2; ++n8) {
                int n13 = n2 + p.a[n12] * n8;
                n7 = n4 + p.b[n12] * n8;
                if (afs2.a(n13, n3, n7) != aie.br) continue;
                if (!ajl.b(afs2.e(n13, n3, n7))) {
                    bl3 = false;
                    break;
                }
                n11 = n8;
                if (bl2) continue;
                n10 = n8;
                bl2 = true;
            }
            if (bl3 && n11 == n10 + 2) {
                for (n8 = n10; n8 <= n11; ++n8) {
                    int n14 = n2 + p.a[n12] * n8;
                    n7 = n4 + p.b[n12] * n8;
                    if (afs2.a(n14 += p.a[n9] * 4, n3, n7 += p.b[n9] * 4) == aie.br && ajl.b(afs2.e(n14, n3, n7))) continue;
                    bl3 = false;
                    break;
                }
                block3: for (n8 = n10 - 1; n8 <= n11 + 1; n8 += 4) {
                    for (int i2 = 1; i2 <= 3; ++i2) {
                        n7 = n2 + p.a[n12] * n8;
                        int n15 = n4 + p.b[n12] * n8;
                        if (afs2.a(n7 += p.a[n9] * i2, n3, n15 += p.b[n9] * i2) == aie.br && ajl.b(afs2.e(n7, n3, n15))) continue;
                        bl3 = false;
                        continue block3;
                    }
                }
                if (bl3) {
                    for (n8 = n10; n8 <= n11; ++n8) {
                        for (int i3 = 1; i3 <= 3; ++i3) {
                            n7 = n2 + p.a[n12] * n8;
                            int n16 = n4 + p.b[n12] * n8;
                            afs2.d(n7 += p.a[n9] * i3, n3, n16 += p.b[n9] * i3, aie.bq, 0, 2);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        afk afk2;
        ayn ayn2 = this.a(afs2, xq2, false);
        if (ayn2 != null && ayn2.a == ayo.b && afs2.a(ayn2.b, ayn2.c, ayn2.d) == aie.br) {
            return abu2;
        }
        if (!afs2.E && (afk2 = afs2.b("Stronghold", (int)xq2.s, (int)xq2.t, (int)xq2.u)) != null) {
            xu xu2 = new xu(afs2, xq2.s, xq2.t + 1.62 - (double)xq2.L, xq2.u);
            xu2.a((double)afk2.a, afk2.b, (double)afk2.c);
            afs2.d(xu2);
            afs2.a((qr)xq2, "random.bow", 0.5f, 0.4f / (g.nextFloat() * 0.4f + 0.8f));
            afs2.a(null, 1002, (int)xq2.s, (int)xq2.t, (int)xq2.u, 0);
            if (!xq2.bE.d) {
                --abu2.b;
            }
        }
        return abu2;
    }
}

