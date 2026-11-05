/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Random;

public class ahc
extends agl {
    private byte[] aC;
    private long aD;
    private avc aE;
    private avc aF;
    private avc aG;
    private boolean aH;
    private boolean aI;

    public ahc(int n2, boolean bl2, boolean bl3) {
        super(n2);
        this.aH = bl2;
        this.aI = bl3;
        this.b();
        this.a(2.0f, 0.0f);
        this.at.clear();
        this.ai = aie.m;
        this.aj = 1;
        this.ak = aie.ce;
        this.ar.x = -999;
        this.ar.A = 20;
        this.ar.C = 3;
        this.ar.D = 5;
        this.ar.y = 0;
        this.at.clear();
        if (bl3) {
            this.ar.x = 5;
        }
    }

    @Override
    public apt a(Random random) {
        return this.az;
    }

    @Override
    public int c(int n2, int n3, int n4) {
        return 10387789;
    }

    @Override
    public int b(int n2, int n3, int n4) {
        return 9470285;
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        super.a(afs2, random, n2, n3);
    }

    @Override
    public void a(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        int n4;
        int n5;
        if (this.aC == null || this.aD != afs2.H()) {
            this.a(afs2.H());
        }
        if (this.aE == null || this.aF == null || this.aD != afs2.H()) {
            Random random2 = new Random(this.aD);
            this.aE = new avc(random2, 4);
            this.aF = new avc(random2, 1);
        }
        this.aD = afs2.H();
        double d3 = 0.0;
        if (this.aH) {
            n5 = (n2 & 0xFFFFFFF0) + (n3 & 0xF);
            n4 = (n3 & 0xFFFFFFF0) + (n2 & 0xF);
            double d4 = Math.min(Math.abs(d2), this.aE.a((double)n5 * 0.25, (double)n4 * 0.25));
            if (d4 > 0.0) {
                d3 = d4 * d4 * 2.5;
                double d5 = 0.001953125;
                double d6 = Math.abs(this.aF.a((double)n5 * d5, (double)n4 * d5));
                double d7 = Math.ceil(d6 * 50.0) + 14.0;
                if (d3 > d7) {
                    d3 = d7;
                }
                d3 += 64.0;
            }
        }
        n5 = n2 & 0xF;
        n4 = n3 & 0xF;
        int n6 = 63;
        ahz ahz2 = aie.ce;
        ahz ahz3 = this.ak;
        int n7 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean bl2 = Math.cos(d2 / 3.0 * Math.PI) > 0.0;
        int n8 = -1;
        boolean bl3 = false;
        int n9 = ahzArray.length / 256;
        for (int i2 = 255; i2 >= 0; --i2) {
            int n10;
            int n11 = (n4 * 16 + n5) * n9 + i2;
            if ((ahzArray[n11] == null || ahzArray[n11].o() == avk.a) && i2 < (int)d3) {
                ahzArray[n11] = aie.b;
            }
            if (i2 <= 0 + random.nextInt(5)) {
                ahzArray[n11] = aie.h;
                continue;
            }
            ahz ahz4 = ahzArray[n11];
            if (ahz4 == null || ahz4.o() == avk.a) {
                n8 = -1;
                continue;
            }
            if (ahz4 != aie.b) continue;
            if (n8 == -1) {
                bl3 = false;
                if (n7 <= 0) {
                    ahz2 = null;
                    ahz3 = aie.b;
                } else if (i2 >= 59 && i2 <= 64) {
                    ahz2 = aie.ce;
                    ahz3 = this.ak;
                }
                if (i2 < 63 && (ahz2 == null || ahz2.o() == avk.a)) {
                    ahz2 = aie.j;
                }
                n8 = n7 + Math.max(0, i2 - 63);
                if (i2 >= 62) {
                    if (this.aI && i2 > 86 + n7 * 2) {
                        if (bl2) {
                            ahzArray[n11] = aie.d;
                            byArray[n11] = 1;
                            continue;
                        }
                        ahzArray[n11] = aie.c;
                        continue;
                    }
                    if (i2 > 66 + n7) {
                        n10 = 16;
                        if (i2 < 64 || i2 > 127) {
                            n10 = 1;
                        } else if (!bl2) {
                            n10 = this.d(n2, i2, n3);
                        }
                        if (n10 < 16) {
                            ahzArray[n11] = aie.ce;
                            byArray[n11] = (byte)n10;
                            continue;
                        }
                        ahzArray[n11] = aie.ch;
                        continue;
                    }
                    ahzArray[n11] = this.ai;
                    byArray[n11] = (byte)this.aj;
                    bl3 = true;
                    continue;
                }
                ahzArray[n11] = ahz3;
                if (ahz3 != aie.ce) continue;
                byArray[n11] = 1;
                continue;
            }
            if (n8 <= 0) continue;
            --n8;
            if (bl3) {
                ahzArray[n11] = aie.ce;
                byArray[n11] = 1;
                continue;
            }
            n10 = this.d(n2, i2, n3);
            if (n10 < 16) {
                ahzArray[n11] = aie.ce;
                byArray[n11] = n10;
                continue;
            }
            ahzArray[n11] = aie.ch;
        }
    }

    private void a(long l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        this.aC = new byte[64];
        Arrays.fill(this.aC, (byte)16);
        Random random = new Random(l2);
        this.aG = new avc(random, 1);
        for (n8 = 0; n8 < 64; ++n8) {
            if ((n8 += random.nextInt(5) + 1) >= 64) continue;
            this.aC[n8] = 1;
        }
        n8 = random.nextInt(4) + 2;
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = random.nextInt(3) + 1;
            n5 = random.nextInt(64);
            for (n4 = 0; n5 + n4 < 64 && n4 < n6; ++n4) {
                this.aC[n5 + n4] = 4;
            }
        }
        n7 = random.nextInt(4) + 2;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = random.nextInt(3) + 2;
            n4 = random.nextInt(64);
            for (n3 = 0; n4 + n3 < 64 && n3 < n5; ++n3) {
                this.aC[n4 + n3] = 12;
            }
        }
        n6 = random.nextInt(4) + 2;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = random.nextInt(3) + 1;
            n3 = random.nextInt(64);
            for (n2 = 0; n3 + n2 < 64 && n2 < n4; ++n2) {
                this.aC[n3 + n2] = 14;
            }
        }
        n5 = random.nextInt(3) + 3;
        n4 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = 1;
            n4 += random.nextInt(16) + 4;
            for (int i2 = 0; n4 + i2 < 64 && i2 < n2; ++i2) {
                this.aC[n4 + i2] = 0;
                if (n4 + i2 > 1 && random.nextBoolean()) {
                    this.aC[n4 + i2 - 1] = 8;
                }
                if (n4 + i2 >= 63 || !random.nextBoolean()) continue;
                this.aC[n4 + i2 + 1] = 8;
            }
        }
    }

    private byte d(int n2, int n3, int n4) {
        int n5 = (int)Math.round(this.aG.a((double)n2 * 1.0 / 512.0, (double)n2 * 1.0 / 512.0) * 2.0);
        return this.aC[(n3 + n5 + 64) % 64];
    }

    @Override
    protected agl k() {
        boolean bl2 = this.ay == agl.Z.ay;
        ahc ahc2 = new ahc(this.ay + 128, bl2, this.aI);
        if (!bl2) {
            ahc2.a(g);
            ahc2.a(this.af + " M");
        } else {
            ahc2.a(this.af + " (Bryce)");
        }
        ahc2.a(this.ag, true);
        return ahc2;
    }
}

