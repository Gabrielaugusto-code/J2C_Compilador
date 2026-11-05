/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class arp
extends aua {
    private boolean a;
    private boolean b;
    private boolean c;
    private int d;

    public arp() {
    }

    @Override
    protected void a(dg dg2) {
        dg2.a("hr", this.a);
        dg2.a("sc", this.b);
        dg2.a("hps", this.c);
        dg2.a("Num", this.d);
    }

    @Override
    protected void b(dg dg2) {
        this.a = dg2.n("hr");
        this.b = dg2.n("sc");
        this.c = dg2.n("hps");
        this.d = dg2.f("Num");
    }

    public arp(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
        this.a = random.nextInt(3) == 0;
        this.b = !this.a && random.nextInt(23) == 0;
        this.d = this.g == 2 || this.g == 0 ? arm2.d() / 5 : arm2.b() / 5;
    }

    public static arm a(List list, Random random, int n2, int n3, int n4, int n5) {
        int n6;
        arm arm2 = new arm(n2, n3, n4, n2, n3 + 2, n4);
        for (n6 = random.nextInt(3) + 2; n6 > 0; --n6) {
            int n7 = n6 * 5;
            switch (n5) {
                case 2: {
                    arm2.d = n2 + 2;
                    arm2.c = n4 - (n7 - 1);
                    break;
                }
                case 0: {
                    arm2.d = n2 + 2;
                    arm2.f = n4 + (n7 - 1);
                    break;
                }
                case 1: {
                    arm2.a = n2 - (n7 - 1);
                    arm2.f = n4 + 2;
                    break;
                }
                case 3: {
                    arm2.d = n2 + (n7 - 1);
                    arm2.f = n4 + 2;
                }
            }
            if (aua.a(list, arm2) == null) break;
        }
        if (n6 > 0) {
            return arm2;
        }
        return null;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        block24: {
            int n2 = this.d();
            int n3 = random.nextInt(4);
            switch (this.g) {
                case 2: {
                    if (n3 <= 1) {
                        aro.a(aua2, list, random, this.f.a, this.f.b - 1 + random.nextInt(3), this.f.c - 1, this.g, n2);
                        break;
                    }
                    if (n3 == 2) {
                        aro.a(aua2, list, random, this.f.a - 1, this.f.b - 1 + random.nextInt(3), this.f.c, 1, n2);
                        break;
                    }
                    aro.a(aua2, list, random, this.f.d + 1, this.f.b - 1 + random.nextInt(3), this.f.c, 3, n2);
                    break;
                }
                case 0: {
                    if (n3 <= 1) {
                        aro.a(aua2, list, random, this.f.a, this.f.b - 1 + random.nextInt(3), this.f.f + 1, this.g, n2);
                        break;
                    }
                    if (n3 == 2) {
                        aro.a(aua2, list, random, this.f.a - 1, this.f.b - 1 + random.nextInt(3), this.f.f - 3, 1, n2);
                        break;
                    }
                    aro.a(aua2, list, random, this.f.d + 1, this.f.b - 1 + random.nextInt(3), this.f.f - 3, 3, n2);
                    break;
                }
                case 1: {
                    if (n3 <= 1) {
                        aro.a(aua2, list, random, this.f.a - 1, this.f.b - 1 + random.nextInt(3), this.f.c, this.g, n2);
                        break;
                    }
                    if (n3 == 2) {
                        aro.a(aua2, list, random, this.f.a, this.f.b - 1 + random.nextInt(3), this.f.c - 1, 2, n2);
                        break;
                    }
                    aro.a(aua2, list, random, this.f.a, this.f.b - 1 + random.nextInt(3), this.f.f + 1, 0, n2);
                    break;
                }
                case 3: {
                    if (n3 <= 1) {
                        aro.a(aua2, list, random, this.f.d + 1, this.f.b - 1 + random.nextInt(3), this.f.c, this.g, n2);
                        break;
                    }
                    if (n3 == 2) {
                        aro.a(aua2, list, random, this.f.d - 3, this.f.b - 1 + random.nextInt(3), this.f.c - 1, 2, n2);
                        break;
                    }
                    aro.a(aua2, list, random, this.f.d - 3, this.f.b - 1 + random.nextInt(3), this.f.f + 1, 0, n2);
                }
            }
            if (n2 >= 8) break block24;
            if (this.g == 2 || this.g == 0) {
                int n4 = this.f.c + 3;
                while (n4 + 3 <= this.f.f) {
                    int n5 = random.nextInt(5);
                    if (n5 == 0) {
                        aro.a(aua2, list, random, this.f.a - 1, this.f.b, n4, 1, n2 + 1);
                    } else if (n5 == 1) {
                        aro.a(aua2, list, random, this.f.d + 1, this.f.b, n4, 3, n2 + 1);
                    }
                    n4 += 5;
                }
            } else {
                int n6 = this.f.a + 3;
                while (n6 + 3 <= this.f.d) {
                    int n7 = random.nextInt(5);
                    if (n7 == 0) {
                        aro.a(aua2, list, random, n6, this.f.b, this.f.c - 1, 2, n2 + 1);
                    } else if (n7 == 1) {
                        aro.a(aua2, list, random, n6, this.f.b, this.f.f + 1, 0, n2 + 1);
                    }
                    n6 += 5;
                }
            }
        }
    }

    @Override
    protected boolean a(afs afs2, arm arm2, Random random, int n2, int n3, int n4, po[] poArray, int n5) {
        int n6;
        int n7;
        int n8 = this.a(n2, n4);
        if (arm2.b(n8, n7 = this.a(n3), n6 = this.b(n2, n4)) && afs2.a(n8, n7, n6).o() == avk.a) {
            int n9 = random.nextBoolean() ? 1 : 0;
            afs2.d(n8, n7, n6, aie.aq, this.a(aie.aq, n9), 2);
            wd wd2 = new wd(afs2, (float)n8 + 0.5f, (float)n7 + 0.5f, (float)n6 + 0.5f);
            po.a(random, poArray, wd2, n5);
            afs2.d(wd2);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.a(afs2, arm2)) {
            return false;
        }
        boolean bl2 = false;
        int n6 = 2;
        boolean bl3 = false;
        int n7 = 2;
        int n8 = this.d * 5 - 1;
        this.a(afs2, arm2, 0, 0, 0, 2, 1, n8, aie.a, aie.a, false);
        this.a(afs2, arm2, random, 0.8f, 0, 2, 0, 2, 2, n8, aie.a, aie.a, false);
        if (this.b) {
            this.a(afs2, arm2, random, 0.6f, 0, 0, 0, 2, 1, n8, aie.G, aie.a, false);
        }
        for (n5 = 0; n5 < this.d; ++n5) {
            n4 = 2 + n5 * 5;
            this.a(afs2, arm2, 0, 0, n4, 0, 1, n4, aie.aJ, aie.a, false);
            this.a(afs2, arm2, 2, 0, n4, 2, 1, n4, aie.aJ, aie.a, false);
            if (random.nextInt(4) == 0) {
                this.a(afs2, arm2, 0, 2, n4, 0, 2, n4, aie.f, aie.a, false);
                this.a(afs2, arm2, 2, 2, n4, 2, 2, n4, aie.f, aie.a, false);
            } else {
                this.a(afs2, arm2, 0, 2, n4, 2, 2, n4, aie.f, aie.a, false);
            }
            this.a(afs2, arm2, random, 0.1f, 0, 2, n4 - 1, aie.G, 0);
            this.a(afs2, arm2, random, 0.1f, 2, 2, n4 - 1, aie.G, 0);
            this.a(afs2, arm2, random, 0.1f, 0, 2, n4 + 1, aie.G, 0);
            this.a(afs2, arm2, random, 0.1f, 2, 2, n4 + 1, aie.G, 0);
            this.a(afs2, arm2, random, 0.05f, 0, 2, n4 - 2, aie.G, 0);
            this.a(afs2, arm2, random, 0.05f, 2, 2, n4 - 2, aie.G, 0);
            this.a(afs2, arm2, random, 0.05f, 0, 2, n4 + 2, aie.G, 0);
            this.a(afs2, arm2, random, 0.05f, 2, 2, n4 + 2, aie.G, 0);
            this.a(afs2, arm2, random, 0.05f, 1, 2, n4 - 1, aie.aa, 0);
            this.a(afs2, arm2, random, 0.05f, 1, 2, n4 + 1, aie.aa, 0);
            if (random.nextInt(100) == 0) {
                this.a(afs2, arm2, random, 2, 0, n4 - 1, po.a(aro.b(), abv.bR.b(random)), 3 + random.nextInt(4));
            }
            if (random.nextInt(100) == 0) {
                this.a(afs2, arm2, random, 0, 0, n4 + 1, po.a(aro.b(), abv.bR.b(random)), 3 + random.nextInt(4));
            }
            if (!this.b || this.c) continue;
            n3 = this.a(0);
            int n9 = n4 - 1 + random.nextInt(3);
            n2 = this.a(1, n9);
            if (!arm2.b(n2, n3, n9 = this.b(1, n9))) continue;
            this.c = true;
            afs2.d(n2, n3, n9, aie.ac, 0, 2);
            aoa aoa2 = (aoa)afs2.o(n2, n3, n9);
            if (aoa2 == null) continue;
            aoa2.a().a("CaveSpider");
        }
        for (n5 = 0; n5 <= 2; ++n5) {
            for (n4 = 0; n4 <= n8; ++n4) {
                n3 = -1;
                ahz ahz2 = this.a(afs2, n5, n3, n4, arm2);
                if (ahz2.o() != avk.a) continue;
                n2 = -1;
                this.a(afs2, aie.f, 0, n5, n2, n4, arm2);
            }
        }
        if (this.a) {
            for (n5 = 0; n5 <= n8; ++n5) {
                ahz ahz3 = this.a(afs2, 1, -1, n5, arm2);
                if (ahz3.o() == avk.a || !ahz3.j()) continue;
                this.a(afs2, arm2, random, 0.7f, 1, 0, n5, aie.aq, this.a(aie.aq, 0));
            }
        }
        return true;
    }
}

