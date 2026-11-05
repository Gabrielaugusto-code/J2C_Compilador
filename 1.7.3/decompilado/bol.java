/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bol
extends boh {
    private static final brq a = new brq("textures/particle/particles.png");

    public void a(vv vv2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        GL11.glEnable((int)32826);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.b(vv2);
        bna bna2 = bna.a;
        int n2 = 1;
        int n3 = 2;
        float f4 = (float)(n2 * 8 + 0) / 128.0f;
        float f5 = (float)(n2 * 8 + 8) / 128.0f;
        float f6 = (float)(n3 * 8 + 0) / 128.0f;
        float f7 = (float)(n3 * 8 + 8) / 128.0f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.5f;
        GL11.glRotatef((float)(180.0f - this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.b.k), (float)1.0f, (float)0.0f, (float)0.0f);
        bna2.b();
        bna2.c(0.0f, 1.0f, 0.0f);
        bna2.a(0.0f - f9, 0.0f - f10, 0.0, f4, f7);
        bna2.a(f8 - f9, 0.0f - f10, 0.0, f5, f7);
        bna2.a(f8 - f9, 1.0f - f10, 0.0, f5, f6);
        bna2.a(0.0f - f9, 1.0f - f10, 0.0, f4, f6);
        bna2.a();
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
        if (vv2.b != null) {
            double d5;
            float f11 = vv2.b.k(f3);
            float f12 = oy.a(oy.c(f11) * (float)Math.PI);
            ayp ayp2 = vv2.o.V().a(-0.5, 0.03, 0.8);
            ayp2.a(-(vv2.b.B + (vv2.b.z - vv2.b.B) * f3) * (float)Math.PI / 180.0f);
            ayp2.b(-(vv2.b.A + (vv2.b.y - vv2.b.A) * f3) * (float)Math.PI / 180.0f);
            ayp2.b(f12 * 0.5f);
            ayp2.a(-f12 * 0.7f);
            double d6 = vv2.b.p + (vv2.b.s - vv2.b.p) * (double)f3 + ayp2.c;
            double d7 = vv2.b.q + (vv2.b.t - vv2.b.q) * (double)f3 + ayp2.d;
            double d8 = vv2.b.r + (vv2.b.u - vv2.b.r) * (double)f3 + ayp2.e;
            double d9 = d5 = vv2.b == azi.B().h ? 0.0 : (double)vv2.b.g();
            if (this.b.l.ax > 0 || vv2.b != azi.B().h) {
                float f13 = (vv2.b.aN + (vv2.b.aM - vv2.b.aN) * f3) * (float)Math.PI / 180.0f;
                double d10 = oy.a(f13);
                double d11 = oy.b(f13);
                d6 = vv2.b.p + (vv2.b.s - vv2.b.p) * (double)f3 - d11 * 0.35 - d10 * 0.85;
                d7 = vv2.b.q + d5 + (vv2.b.t - vv2.b.q) * (double)f3 - 0.45;
                d8 = vv2.b.r + (vv2.b.u - vv2.b.r) * (double)f3 - d10 * 0.35 + d11 * 0.85;
            }
            double d12 = vv2.p + (vv2.s - vv2.p) * (double)f3;
            double d13 = vv2.q + (vv2.t - vv2.q) * (double)f3 + 0.25;
            double d14 = vv2.r + (vv2.u - vv2.r) * (double)f3;
            double d15 = (float)(d6 - d12);
            double d16 = (float)(d7 - d13);
            double d17 = (float)(d8 - d14);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            bna2.a(3);
            bna2.c(0);
            int n4 = 16;
            for (int i2 = 0; i2 <= n4; ++i2) {
                float f14 = (float)i2 / (float)n4;
                bna2.a(d2 + d15 * (double)f14, d3 + d16 * (double)(f14 * f14 + f14) * 0.5 + 0.25, d4 + d17 * (double)f14);
            }
            bna2.a();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
        }
    }

    protected brq a(vv vv2) {
        return a;
    }
}

