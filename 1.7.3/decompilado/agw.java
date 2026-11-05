/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class agw
extends agl {
    private int aF;
    protected static final apv aC = new apv(false, true);
    protected static final apv aD = new apv(false, false);
    protected static final aqz aE = new aqz(false);

    public agw(int n2, int n3) {
        super(n2);
        this.aF = n3;
        this.ar.x = 10;
        this.ar.z = 2;
        if (this.aF == 1) {
            this.ar.x = 6;
            this.ar.y = 100;
            this.ar.z = 1;
        }
        this.a(5159473);
        this.a(0.7f, 0.8f);
        if (this.aF == 2) {
            this.ah = 353825;
            this.ag = 3175492;
            this.a(0.6f, 0.6f);
        }
        if (this.aF == 0) {
            this.at.add(new ago(vm.class, 5, 4, 4));
        }
        if (this.aF == 3) {
            this.ar.x = -999;
        }
    }

    @Override
    protected agl a(int n2, boolean bl2) {
        if (this.aF == 2) {
            this.ah = 353825;
            this.ag = n2;
            if (bl2) {
                this.ah = (this.ah & 0xFEFEFE) >> 1;
            }
            return this;
        }
        return super.a(n2, bl2);
    }

    @Override
    public apt a(Random random) {
        if (this.aF == 3 && random.nextInt(3) > 0) {
            return aE;
        }
        if (this.aF == 2 || random.nextInt(5) == 0) {
            return aD;
        }
        return this.az;
    }

    @Override
    public String a(Random random, int n2, int n3, int n4) {
        if (this.aF == 1) {
            double d2 = oy.a((1.0 + ad.a((double)n2 / 48.0, (double)n4 / 48.0)) / 2.0, 0.0, 0.9999);
            int n5 = (int)(d2 * (double)ajt.a.length);
            if (n5 == 1) {
                n5 = 0;
            }
            return ajt.a[n5];
        }
        return super.a(random, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        if (this.aF == 3) {
            for (n8 = 0; n8 < 4; ++n8) {
                for (n7 = 0; n7 < 4; ++n7) {
                    aqe aqe2;
                    n6 = n2 + n8 * 4 + 1 + 8 + random.nextInt(3);
                    n5 = n3 + n7 * 4 + 1 + 8 + random.nextInt(3);
                    n4 = afs2.f(n6, n5);
                    if (random.nextInt(20) == 0) {
                        aqe2 = new aql();
                        ((aql)aqe2).a(afs2, random, n6, n4, n5);
                        continue;
                    }
                    aqe2 = this.a(random);
                    aqe2.a(1.0, 1.0, 1.0);
                    if (!aqe2.a(afs2, random, n6, n4, n5)) continue;
                    ((apt)aqe2).b(afs2, random, n6, n4, n5);
                }
            }
        }
        n8 = random.nextInt(5) - 3;
        if (this.aF == 1) {
            n8 += 2;
        }
        for (n7 = 0; n7 < n8; ++n7) {
            int n9;
            int n10;
            n6 = random.nextInt(3);
            if (n6 == 0) {
                ae.a(1);
            } else if (n6 == 1) {
                ae.a(4);
            } else if (n6 == 2) {
                ae.a(5);
            }
            for (n5 = 0; n5 < 5 && !ae.a(afs2, random, n4 = n2 + random.nextInt(16) + 8, n10 = random.nextInt(afs2.f(n4, n9 = n3 + random.nextInt(16) + 8) + 32), n9); ++n5) {
            }
        }
        super.a(afs2, random, n2, n3);
    }

    @Override
    public int b(int n2, int n3, int n4) {
        int n5 = super.b(n2, n3, n4);
        if (this.aF == 3) {
            return (n5 & 0xFEFEFE) + 2634762 >> 1;
        }
        return n5;
    }

    @Override
    protected agl k() {
        if (this.ay == agl.s.ay) {
            agw agw2 = new agw(this.ay + 128, 1);
            agw2.a(new agm(this.am, this.an + 0.2f));
            agw2.a("Flower Forest");
            agw2.a(6976549, true);
            agw2.a(8233509);
            return agw2;
        }
        if (this.ay == agl.P.ay || this.ay == agl.Q.ay) {
            return new agx(this, this.ay + 128, this);
        }
        return new agy(this, this.ay + 128, this);
    }
}

