/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bnc
extends bne {
    private static final brq b = new brq("textures/entity/beacon_beam.png");

    public void a(anh anh2, double d2, double d3, double d4, float f2) {
        float f3 = anh2.i();
        GL11.glAlphaFunc((int)516, (float)0.1f);
        if (f3 > 0.0f) {
            bna bna2 = bna.a;
            this.a(b);
            GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
            GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glDepthMask((boolean)true);
            bwg.c(770, 1, 1, 0);
            float f4 = (float)anh2.w().I() + f2;
            float f5 = -f4 * 0.2f - (float)oy.d(-f4 * 0.1f);
            boolean bl2 = true;
            double d5 = (double)f4 * 0.025 * (1.0 - (double)(bl2 & true) * 2.5);
            bna2.b();
            bna2.a(255, 255, 255, 32);
            double d6 = (double)bl2 * 0.2;
            double d7 = 0.5 + Math.cos(d5 + 2.356194490192345) * d6;
            double d8 = 0.5 + Math.sin(d5 + 2.356194490192345) * d6;
            double d9 = 0.5 + Math.cos(d5 + 0.7853981633974483) * d6;
            double d10 = 0.5 + Math.sin(d5 + 0.7853981633974483) * d6;
            double d11 = 0.5 + Math.cos(d5 + 3.9269908169872414) * d6;
            double d12 = 0.5 + Math.sin(d5 + 3.9269908169872414) * d6;
            double d13 = 0.5 + Math.cos(d5 + 5.497787143782138) * d6;
            double d14 = 0.5 + Math.sin(d5 + 5.497787143782138) * d6;
            double d15 = 256.0f * f3;
            double d16 = 0.0;
            double d17 = 1.0;
            double d18 = -1.0f + f5;
            double d19 = (double)(256.0f * f3) * (0.5 / d6) + d18;
            bna2.a(d2 + d7, d3 + d15, d4 + d8, d17, d19);
            bna2.a(d2 + d7, d3, d4 + d8, d17, d18);
            bna2.a(d2 + d9, d3, d4 + d10, d16, d18);
            bna2.a(d2 + d9, d3 + d15, d4 + d10, d16, d19);
            bna2.a(d2 + d13, d3 + d15, d4 + d14, d17, d19);
            bna2.a(d2 + d13, d3, d4 + d14, d17, d18);
            bna2.a(d2 + d11, d3, d4 + d12, d16, d18);
            bna2.a(d2 + d11, d3 + d15, d4 + d12, d16, d19);
            bna2.a(d2 + d9, d3 + d15, d4 + d10, d17, d19);
            bna2.a(d2 + d9, d3, d4 + d10, d17, d18);
            bna2.a(d2 + d13, d3, d4 + d14, d16, d18);
            bna2.a(d2 + d13, d3 + d15, d4 + d14, d16, d19);
            bna2.a(d2 + d11, d3 + d15, d4 + d12, d17, d19);
            bna2.a(d2 + d11, d3, d4 + d12, d17, d18);
            bna2.a(d2 + d7, d3, d4 + d8, d16, d18);
            bna2.a(d2 + d7, d3 + d15, d4 + d8, d16, d19);
            bna2.a();
            GL11.glEnable((int)3042);
            bwg.c(770, 771, 1, 0);
            GL11.glDepthMask((boolean)false);
            bna2.b();
            bna2.a(255, 255, 255, 32);
            double d20 = 0.2;
            double d21 = 0.2;
            double d22 = 0.8;
            double d23 = 0.2;
            double d24 = 0.2;
            double d25 = 0.8;
            double d26 = 0.8;
            double d27 = 0.8;
            double d28 = 256.0f * f3;
            double d29 = 0.0;
            double d30 = 1.0;
            double d31 = -1.0f + f5;
            double d32 = (double)(256.0f * f3) + d31;
            bna2.a(d2 + d20, d3 + d28, d4 + d21, d30, d32);
            bna2.a(d2 + d20, d3, d4 + d21, d30, d31);
            bna2.a(d2 + d22, d3, d4 + d23, d29, d31);
            bna2.a(d2 + d22, d3 + d28, d4 + d23, d29, d32);
            bna2.a(d2 + d26, d3 + d28, d4 + d27, d30, d32);
            bna2.a(d2 + d26, d3, d4 + d27, d30, d31);
            bna2.a(d2 + d24, d3, d4 + d25, d29, d31);
            bna2.a(d2 + d24, d3 + d28, d4 + d25, d29, d32);
            bna2.a(d2 + d22, d3 + d28, d4 + d23, d30, d32);
            bna2.a(d2 + d22, d3, d4 + d23, d30, d31);
            bna2.a(d2 + d26, d3, d4 + d27, d29, d31);
            bna2.a(d2 + d26, d3 + d28, d4 + d27, d29, d32);
            bna2.a(d2 + d24, d3 + d28, d4 + d25, d30, d32);
            bna2.a(d2 + d24, d3, d4 + d25, d30, d31);
            bna2.a(d2 + d20, d3, d4 + d21, d29, d31);
            bna2.a(d2 + d20, d3 + d28, d4 + d21, d29, d32);
            bna2.a();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
            GL11.glDepthMask((boolean)true);
        }
    }
}

