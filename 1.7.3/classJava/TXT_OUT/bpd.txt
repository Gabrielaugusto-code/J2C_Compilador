/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public abstract class bpd
extends bpa {
    public bpd(bim bim2, float f2) {
        super(bim2, f2);
    }

    protected boolean b(rn rn2) {
        return super.b(rn2) && (rn2.bh() || rn2.bH() && rn2 == this.b.i);
    }

    public void a(rn rn2, double d2, double d3, double d4, float f2, float f3) {
        super.a(rn2, d2, d3, d4, f2, f3);
        this.b(rn2, d2, d3, d4, f2, f3);
    }

    private double a(double d2, double d3, double d4) {
        return d2 + (d3 - d2) * d4;
    }

    protected void b(rn rn2, double d2, double d3, double d4, float f2, float f3) {
        qr qr2 = rn2.bO();
        if (qr2 != null) {
            float f4;
            int n2;
            d3 -= (1.6 - (double)rn2.N) * 0.5;
            bna bna2 = bna.a;
            double d5 = this.a(qr2.A, (double)qr2.y, (double)(f3 * 0.5f)) * 0.01745329238474369;
            double d6 = this.a(qr2.B, (double)qr2.z, (double)(f3 * 0.5f)) * 0.01745329238474369;
            double d7 = Math.cos(d5);
            double d8 = Math.sin(d5);
            double d9 = Math.sin(d6);
            if (qr2 instanceof rj) {
                d7 = 0.0;
                d8 = 0.0;
                d9 = -1.0;
            }
            double d10 = Math.cos(d6);
            double d11 = this.a(qr2.p, qr2.s, (double)f3) - d7 * 0.7 - d8 * 0.5 * d10;
            double d12 = this.a(qr2.q + (double)qr2.g() * 0.7, qr2.t + (double)qr2.g() * 0.7, (double)f3) - d9 * 0.5 - 0.25;
            double d13 = this.a(qr2.r, qr2.u, (double)f3) - d8 * 0.7 + d7 * 0.5 * d10;
            double d14 = this.a(rn2.aN, (double)rn2.aM, (double)f3) * 0.01745329238474369 + 1.5707963267948966;
            d7 = Math.cos(d14) * (double)rn2.M * 0.4;
            d8 = Math.sin(d14) * (double)rn2.M * 0.4;
            double d15 = this.a(rn2.p, rn2.s, (double)f3) + d7;
            double d16 = this.a(rn2.q, rn2.t, (double)f3);
            double d17 = this.a(rn2.r, rn2.u, (double)f3) + d8;
            d2 += d7;
            d4 += d8;
            double d18 = (float)(d11 - d15);
            double d19 = (float)(d12 - d16);
            double d20 = (float)(d13 - d17);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2884);
            int n3 = 24;
            double d21 = 0.025;
            bna2.a(5);
            for (n2 = 0; n2 <= 24; ++n2) {
                if (n2 % 2 == 0) {
                    bna2.a(0.5f, 0.4f, 0.3f, 1.0f);
                } else {
                    bna2.a(0.35f, 0.28f, 0.21000001f, 1.0f);
                }
                f4 = (float)n2 / 24.0f;
                bna2.a(d2 + d18 * (double)f4 + 0.0, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d4 + d20 * (double)f4);
                bna2.a(d2 + d18 * (double)f4 + 0.025, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f4);
            }
            bna2.a();
            bna2.a(5);
            for (n2 = 0; n2 <= 24; ++n2) {
                if (n2 % 2 == 0) {
                    bna2.a(0.5f, 0.4f, 0.3f, 1.0f);
                } else {
                    bna2.a(0.35f, 0.28f, 0.21000001f, 1.0f);
                }
                f4 = (float)n2 / 24.0f;
                bna2.a(d2 + d18 * (double)f4 + 0.0, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f4);
                bna2.a(d2 + d18 * (double)f4 + 0.025, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d4 + d20 * (double)f4 + 0.025);
            }
            bna2.a();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2884);
        }
    }
}

