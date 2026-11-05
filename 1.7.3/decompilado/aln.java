/*
 * Decompiled with CFR 0.152.
 */
public class aln
extends ajb {
    private boolean a;
    private pw b;
    private pw M;

    protected aln(boolean bl2) {
        super(avk.C);
        this.a(true);
        this.a = bl2;
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.b;
        }
        if (n2 == 0) {
            return this.b;
        }
        if (n3 == 2 && n2 == 2) {
            return this.M;
        }
        if (n3 == 3 && n2 == 5) {
            return this.M;
        }
        if (n3 == 0 && n2 == 3) {
            return this.M;
        }
        if (n3 == 1 && n2 == 4) {
            return this.M;
        }
        return this.L;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        if (afs2.a(n2, n3 - 1, n4) == aie.aE && afs2.a(n2, n3 - 2, n4) == aie.aE) {
            if (!afs2.E) {
                afs2.d(n2, n3, n4, aln.e(0), 0, 2);
                afs2.d(n2, n3 - 1, n4, aln.e(0), 0, 2);
                afs2.d(n2, n3 - 2, n4, aln.e(0), 0, 2);
                vi vi2 = new vi(afs2);
                vi2.b((double)n2 + 0.5, (double)n3 - 1.95, (double)n4 + 0.5, 0.0f, 0.0f);
                afs2.d(vi2);
                afs2.c(n2, n3, n4, aln.e(0));
                afs2.c(n2, n3 - 1, n4, aln.e(0));
                afs2.c(n2, n3 - 2, n4, aln.e(0));
            }
            for (int i2 = 0; i2 < 120; ++i2) {
                afs2.a("snowshovel", (double)n2 + afs2.s.nextDouble(), (double)(n3 - 2) + afs2.s.nextDouble() * 2.5, (double)n4 + afs2.s.nextDouble(), 0.0, 0.0, 0.0);
            }
        } else if (afs2.a(n2, n3 - 1, n4) == aie.S && afs2.a(n2, n3 - 2, n4) == aie.S) {
            boolean bl2;
            boolean bl3 = afs2.a(n2 - 1, n3 - 1, n4) == aie.S && afs2.a(n2 + 1, n3 - 1, n4) == aie.S;
            boolean bl4 = bl2 = afs2.a(n2, n3 - 1, n4 - 1) == aie.S && afs2.a(n2, n3 - 1, n4 + 1) == aie.S;
            if (bl3 || bl2) {
                afs2.d(n2, n3, n4, aln.e(0), 0, 2);
                afs2.d(n2, n3 - 1, n4, aln.e(0), 0, 2);
                afs2.d(n2, n3 - 2, n4, aln.e(0), 0, 2);
                if (bl3) {
                    afs2.d(n2 - 1, n3 - 1, n4, aln.e(0), 0, 2);
                    afs2.d(n2 + 1, n3 - 1, n4, aln.e(0), 0, 2);
                } else {
                    afs2.d(n2, n3 - 1, n4 - 1, aln.e(0), 0, 2);
                    afs2.d(n2, n3 - 1, n4 + 1, aln.e(0), 0, 2);
                }
                vk vk2 = new vk(afs2);
                vk2.i(true);
                vk2.b((double)n2 + 0.5, (double)n3 - 1.95, (double)n4 + 0.5, 0.0f, 0.0f);
                afs2.d(vk2);
                for (int i3 = 0; i3 < 120; ++i3) {
                    afs2.a("snowballpoof", (double)n2 + afs2.s.nextDouble(), (double)(n3 - 2) + afs2.s.nextDouble() * 3.9, (double)n4 + afs2.s.nextDouble(), 0.0, 0.0, 0.0);
                }
                afs2.c(n2, n3, n4, aln.e(0));
                afs2.c(n2, n3 - 1, n4, aln.e(0));
                afs2.c(n2, n3 - 2, n4, aln.e(0));
                if (bl3) {
                    afs2.c(n2 - 1, n3 - 1, n4, aln.e(0));
                    afs2.c(n2 + 1, n3 - 1, n4, aln.e(0));
                } else {
                    afs2.c(n2, n3 - 1, n4 - 1, aln.e(0));
                    afs2.c(n2, n3 - 1, n4 + 1, aln.e(0));
                }
            }
        }
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return afs2.a((int)n2, (int)n3, (int)n4).J.j() && afs.a(afs2, n2, n3 - 1, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 2.5) & 3;
        afs2.a(n2, n3, n4, n5, 2);
    }

    @Override
    public void a(px px2) {
        this.M = px2.a(this.N() + "_face_" + (this.a ? "on" : "off"));
        this.b = px2.a(this.N() + "_top");
        this.L = px2.a(this.N() + "_side");
    }
}

