/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpg
extends boh {
    private static final brq a = new brq("textures/painting/paintings_kristoffer_zetterstrand.png");

    public void a(rs rs2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslated((double)d2, (double)d3, (double)d4);
        GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glEnable((int)32826);
        this.b(rs2);
        rt rt2 = rs2.e;
        float f4 = 0.0625f;
        GL11.glScalef((float)f4, (float)f4, (float)f4);
        this.a(rs2, rt2.C, rt2.D, rt2.E, rt2.F);
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    protected brq a(rs rs2) {
        return a;
    }

    private void a(rs rs2, int n2, int n3, int n4, int n5) {
        float f2 = (float)(-n2) / 2.0f;
        float f3 = (float)(-n3) / 2.0f;
        float f4 = 0.5f;
        float f5 = 0.75f;
        float f6 = 0.8125f;
        float f7 = 0.0f;
        float f8 = 0.0625f;
        float f9 = 0.75f;
        float f10 = 0.8125f;
        float f11 = 0.001953125f;
        float f12 = 0.001953125f;
        float f13 = 0.7519531f;
        float f14 = 0.7519531f;
        float f15 = 0.0f;
        float f16 = 0.0625f;
        for (int i2 = 0; i2 < n2 / 16; ++i2) {
            for (int i3 = 0; i3 < n3 / 16; ++i3) {
                float f17 = f2 + (float)((i2 + 1) * 16);
                float f18 = f2 + (float)(i2 * 16);
                float f19 = f3 + (float)((i3 + 1) * 16);
                float f20 = f3 + (float)(i3 * 16);
                this.a(rs2, (f17 + f18) / 2.0f, (f19 + f20) / 2.0f);
                float f21 = (float)(n4 + n2 - i2 * 16) / 256.0f;
                float f22 = (float)(n4 + n2 - (i2 + 1) * 16) / 256.0f;
                float f23 = (float)(n5 + n3 - i3 * 16) / 256.0f;
                float f24 = (float)(n5 + n3 - (i3 + 1) * 16) / 256.0f;
                bna bna2 = bna.a;
                bna2.b();
                bna2.c(0.0f, 0.0f, -1.0f);
                bna2.a(f17, f20, -f4, f22, f23);
                bna2.a(f18, f20, -f4, f21, f23);
                bna2.a(f18, f19, -f4, f21, f24);
                bna2.a(f17, f19, -f4, f22, f24);
                bna2.c(0.0f, 0.0f, 1.0f);
                bna2.a(f17, f19, f4, f5, f7);
                bna2.a(f18, f19, f4, f6, f7);
                bna2.a(f18, f20, f4, f6, f8);
                bna2.a(f17, f20, f4, f5, f8);
                bna2.c(0.0f, 1.0f, 0.0f);
                bna2.a(f17, f19, -f4, f9, f11);
                bna2.a(f18, f19, -f4, f10, f11);
                bna2.a(f18, f19, f4, f10, f12);
                bna2.a(f17, f19, f4, f9, f12);
                bna2.c(0.0f, -1.0f, 0.0f);
                bna2.a(f17, f20, f4, f9, f11);
                bna2.a(f18, f20, f4, f10, f11);
                bna2.a(f18, f20, -f4, f10, f12);
                bna2.a(f17, f20, -f4, f9, f12);
                bna2.c(-1.0f, 0.0f, 0.0f);
                bna2.a(f17, f19, f4, f14, f15);
                bna2.a(f17, f20, f4, f14, f16);
                bna2.a(f17, f20, -f4, f13, f16);
                bna2.a(f17, f19, -f4, f13, f15);
                bna2.c(1.0f, 0.0f, 0.0f);
                bna2.a(f18, f19, -f4, f14, f15);
                bna2.a(f18, f20, -f4, f14, f16);
                bna2.a(f18, f20, f4, f13, f16);
                bna2.a(f18, f19, f4, f13, f15);
                bna2.a();
            }
        }
    }

    private void a(rs rs2, float f2, float f3) {
        int n2 = oy.c(rs2.s);
        int n3 = oy.c(rs2.t + (double)(f3 / 16.0f));
        int n4 = oy.c(rs2.u);
        if (rs2.a == 2) {
            n2 = oy.c(rs2.s + (double)(f2 / 16.0f));
        }
        if (rs2.a == 1) {
            n4 = oy.c(rs2.u - (double)(f2 / 16.0f));
        }
        if (rs2.a == 0) {
            n2 = oy.c(rs2.s - (double)(f2 / 16.0f));
        }
        if (rs2.a == 3) {
            n4 = oy.c(rs2.u + (double)(f2 / 16.0f));
        }
        int n5 = this.b.g.c(n2, n3, n4, 0);
        int n6 = n5 % 65536;
        int n7 = n5 / 65536;
        bwg.a(bwg.c, n6, n7);
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
    }
}

