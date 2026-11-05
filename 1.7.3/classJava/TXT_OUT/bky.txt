/*
 * Decompiled with CFR 0.152.
 */
public class bky
extends blg {
    private int aB;
    private final blh aC;
    private dp aD;
    boolean a;

    public bky(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7, blh blh2, dg dg2) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.v = d5;
        this.w = d6;
        this.x = d7;
        this.aC = blh2;
        this.g = 8;
        if (dg2 != null) {
            this.aD = dg2.c("Explosions", 10);
            if (this.aD.c() == 0) {
                this.aD = null;
            } else {
                this.g = this.aD.c() * 2 - 1;
                for (int i2 = 0; i2 < this.aD.c(); ++i2) {
                    dg dg3 = this.aD.b(i2);
                    if (!dg3.n("Flicker")) continue;
                    this.a = true;
                    this.g += 15;
                    break;
                }
            }
        }
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void h() {
        int n2;
        if (this.aB == 0 && this.aD != null) {
            n2 = this.j();
            boolean bl2 = false;
            if (this.aD.c() >= 3) {
                bl2 = true;
            } else {
                for (int i2 = 0; i2 < this.aD.c(); ++i2) {
                    dg dg2 = this.aD.b(i2);
                    if (dg2.d("Type") != 1) continue;
                    bl2 = true;
                    break;
                }
            }
            String string = "fireworks." + (bl2 ? "largeBlast" : "blast") + (n2 != 0 ? "_far" : "");
            this.o.a(this.s, this.t, this.u, string, 20.0f, 0.95f + this.Z.nextFloat() * 0.1f, true);
        }
        if (this.aB % 2 == 0 && this.aD != null && this.aB / 2 < this.aD.c()) {
            n2 = this.aB / 2;
            dg dg3 = this.aD.b(n2);
            byte by2 = dg3.d("Type");
            boolean bl3 = dg3.n("Trail");
            boolean bl4 = dg3.n("Flicker");
            int[] nArray = dg3.l("Colors");
            int[] nArray2 = dg3.l("FadeColors");
            if (by2 == 1) {
                this.a(0.5, 4, nArray, nArray2, bl3, bl4);
            } else if (by2 == 2) {
                this.a(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, nArray, nArray2, bl3, bl4, false);
            } else if (by2 == 3) {
                this.a(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, nArray, nArray2, bl3, bl4, true);
            } else if (by2 == 4) {
                this.a(nArray, nArray2, bl3, bl4);
            } else {
                this.a(0.25, 2, nArray, nArray2, bl3, bl4);
            }
            int n3 = nArray[0];
            float f2 = (float)((n3 & 0xFF0000) >> 16) / 255.0f;
            float f3 = (float)((n3 & 0xFF00) >> 8) / 255.0f;
            float f4 = (float)((n3 & 0xFF) >> 0) / 255.0f;
            bkw bkw2 = new bkw(this.o, this.s, this.t, this.u);
            bkw2.b(f2, f3, f4);
            this.aC.a(bkw2);
        }
        ++this.aB;
        if (this.aB > this.g) {
            if (this.a) {
                n2 = this.j() ? 1 : 0;
                String string = "fireworks." + (n2 != 0 ? "twinkle_far" : "twinkle");
                this.o.a(this.s, this.t, this.u, string, 20.0f, 0.9f + this.Z.nextFloat() * 0.15f, true);
            }
            this.A();
        }
    }

    private boolean j() {
        azi azi2 = azi.B();
        return azi2 == null || azi2.i == null || !(azi2.i.e(this.s, this.t, this.u) < 256.0);
    }

    private void a(double d2, double d3, double d4, double d5, double d6, double d7, int[] nArray, int[] nArray2, boolean bl2, boolean bl3) {
        bkx bkx2 = new bkx(this.o, d2, d3, d4, d5, d6, d7, this.aC);
        bkx2.a(bl2);
        bkx2.f(bl3);
        int n2 = this.Z.nextInt(nArray.length);
        bkx2.a(nArray[n2]);
        if (nArray2 != null && nArray2.length > 0) {
            bkx2.c(nArray2[this.Z.nextInt(nArray2.length)]);
        }
        this.aC.a(bkx2);
    }

    private void a(double d2, int n2, int[] nArray, int[] nArray2, boolean bl2, boolean bl3) {
        double d3 = this.s;
        double d4 = this.t;
        double d5 = this.u;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    double d6 = (double)i3 + (this.Z.nextDouble() - this.Z.nextDouble()) * 0.5;
                    double d7 = (double)i2 + (this.Z.nextDouble() - this.Z.nextDouble()) * 0.5;
                    double d8 = (double)i4 + (this.Z.nextDouble() - this.Z.nextDouble()) * 0.5;
                    double d9 = (double)oy.a(d6 * d6 + d7 * d7 + d8 * d8) / d2 + this.Z.nextGaussian() * 0.05;
                    this.a(d3, d4, d5, d6 / d9, d7 / d9, d8 / d9, nArray, nArray2, bl2, bl3);
                    if (i2 == -n2 || i2 == n2 || i3 == -n2 || i3 == n2) continue;
                    i4 += n2 * 2 - 1;
                }
            }
        }
    }

    private void a(double d2, double[][] dArray, int[] nArray, int[] nArray2, boolean bl2, boolean bl3, boolean bl4) {
        double d3 = dArray[0][0];
        double d4 = dArray[0][1];
        this.a(this.s, this.t, this.u, d3 * d2, d4 * d2, 0.0, nArray, nArray2, bl2, bl3);
        float f2 = this.Z.nextFloat() * (float)Math.PI;
        double d5 = bl4 ? 0.034 : 0.34;
        for (int i2 = 0; i2 < 3; ++i2) {
            double d6 = (double)f2 + (double)((float)i2 * (float)Math.PI) * d5;
            double d7 = d3;
            double d8 = d4;
            for (int i3 = 1; i3 < dArray.length; ++i3) {
                double d9 = dArray[i3][0];
                double d10 = dArray[i3][1];
                for (double d11 = 0.25; d11 <= 1.0; d11 += 0.25) {
                    double d12 = (d7 + (d9 - d7) * d11) * d2;
                    double d13 = (d8 + (d10 - d8) * d11) * d2;
                    double d14 = d12 * Math.sin(d6);
                    d12 *= Math.cos(d6);
                    for (double d15 = -1.0; d15 <= 1.0; d15 += 2.0) {
                        this.a(this.s, this.t, this.u, d12 * d15, d13, d14 * d15, nArray, nArray2, bl2, bl3);
                    }
                }
                d7 = d9;
                d8 = d10;
            }
        }
    }

    private void a(int[] nArray, int[] nArray2, boolean bl2, boolean bl3) {
        double d2 = this.Z.nextGaussian() * 0.05;
        double d3 = this.Z.nextGaussian() * 0.05;
        for (int i2 = 0; i2 < 70; ++i2) {
            double d4 = this.v * 0.5 + this.Z.nextGaussian() * 0.15 + d2;
            double d5 = this.x * 0.5 + this.Z.nextGaussian() * 0.15 + d3;
            double d6 = this.w * 0.5 + this.Z.nextDouble() * 0.5;
            this.a(this.s, this.t, this.u, d4, d6, d5, nArray, nArray2, bl2, bl3);
        }
    }

    @Override
    public int a() {
        return 0;
    }
}

