/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpb
extends boh {
    private static final brq g = new brq("textures/entity/minecart.png");
    protected bim a = new bil();
    protected final bmf f;

    public bpb() {
        this.d = 0.5f;
        this.f = new bmf();
    }

    public void a(wc wc2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        this.b(wc2);
        long l2 = (long)wc2.x() * 493286711L;
        l2 = l2 * l2 * 4392167121L + l2 * 98761L;
        float f4 = (((float)(l2 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f5 = (((float)(l2 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f6 = (((float)(l2 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        GL11.glTranslatef((float)f4, (float)f5, (float)f6);
        double d5 = wc2.S + (wc2.s - wc2.S) * (double)f3;
        double d6 = wc2.T + (wc2.t - wc2.T) * (double)f3;
        double d7 = wc2.U + (wc2.u - wc2.U) * (double)f3;
        double d8 = 0.3f;
        ayp ayp2 = wc2.a(d5, d6, d7);
        float f7 = wc2.B + (wc2.z - wc2.B) * f3;
        if (ayp2 != null) {
            ayp ayp3 = wc2.a(d5, d6, d7, d8);
            ayp ayp4 = wc2.a(d5, d6, d7, -d8);
            if (ayp3 == null) {
                ayp3 = ayp2;
            }
            if (ayp4 == null) {
                ayp4 = ayp2;
            }
            d2 += ayp2.c - d5;
            d3 += (ayp3.d + ayp4.d) / 2.0 - d6;
            d4 += ayp2.e - d7;
            ayp ayp5 = ayp4.c(-ayp3.c, -ayp3.d, -ayp3.e);
            if (ayp5.b() != 0.0) {
                ayp5 = ayp5.a();
                f2 = (float)(Math.atan2(ayp5.e, ayp5.c) * 180.0 / Math.PI);
                f7 = (float)(Math.atan(ayp5.d) * 73.0);
            }
        }
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        GL11.glRotatef((float)(180.0f - f2), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-f7), (float)0.0f, (float)0.0f, (float)1.0f);
        float f8 = (float)wc2.k() - f3;
        float f9 = wc2.j() - f3;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f8 > 0.0f) {
            GL11.glRotatef((float)(oy.a(f8) * f8 * f9 / 10.0f * (float)wc2.l()), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        int n2 = wc2.r();
        ahz ahz2 = wc2.n();
        int n3 = wc2.p();
        if (ahz2.b() != -1) {
            GL11.glPushMatrix();
            this.a(bqs.b);
            float f10 = 0.75f;
            GL11.glScalef((float)f10, (float)f10, (float)f10);
            GL11.glTranslatef((float)0.0f, (float)((float)n2 / 16.0f), (float)0.0f);
            this.a(wc2, f3, ahz2, n3);
            GL11.glPopMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.b(wc2);
        }
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        this.a.a(wc2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    protected brq a(wc wc2) {
        return g;
    }

    protected void a(wc wc2, float f2, ahz ahz2, int n2) {
        float f3 = wc2.d(f2);
        GL11.glPushMatrix();
        this.f.a(ahz2, n2, f3);
        GL11.glPopMatrix();
    }
}

