/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.FloatBuffer;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bnm
extends bne {
    private static final brq c = new brq("textures/environment/end_sky.png");
    private static final brq d = new brq("textures/entity/end_portal.png");
    private static final Random e = new Random(31100L);
    FloatBuffer b = azh.h(16);

    public void a(aof aof2, double d2, double d3, double d4, float f2) {
        float f3 = (float)this.a.j;
        float f4 = (float)this.a.k;
        float f5 = (float)this.a.l;
        GL11.glDisable((int)2896);
        e.setSeed(31100L);
        float f6 = 0.75f;
        for (int i2 = 0; i2 < 16; ++i2) {
            GL11.glPushMatrix();
            float f7 = 16 - i2;
            float f8 = 0.0625f;
            float f9 = 1.0f / (f7 + 1.0f);
            if (i2 == 0) {
                this.a(c);
                f9 = 0.1f;
                f7 = 65.0f;
                f8 = 0.125f;
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
            }
            if (i2 == 1) {
                this.a(d);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)1, (int)1);
                f8 = 0.5f;
            }
            float f10 = (float)(-(d3 + (double)f6));
            float f11 = f10 + azd.b;
            float f12 = f10 + f7 + azd.b;
            float f13 = f11 / f12;
            f13 = (float)(d3 + (double)f6) + f13;
            GL11.glTranslatef((float)f3, (float)f13, (float)f5);
            GL11.glTexGeni((int)8192, (int)9472, (int)9217);
            GL11.glTexGeni((int)8193, (int)9472, (int)9217);
            GL11.glTexGeni((int)8194, (int)9472, (int)9217);
            GL11.glTexGeni((int)8195, (int)9472, (int)9216);
            GL11.glTexGen((int)8192, (int)9473, (FloatBuffer)this.a(1.0f, 0.0f, 0.0f, 0.0f));
            GL11.glTexGen((int)8193, (int)9473, (FloatBuffer)this.a(0.0f, 0.0f, 1.0f, 0.0f));
            GL11.glTexGen((int)8194, (int)9473, (FloatBuffer)this.a(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.glTexGen((int)8195, (int)9474, (FloatBuffer)this.a(0.0f, 1.0f, 0.0f, 0.0f));
            GL11.glEnable((int)3168);
            GL11.glEnable((int)3169);
            GL11.glEnable((int)3170);
            GL11.glEnable((int)3171);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5890);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)((float)(azi.K() % 700000L) / 700000.0f), (float)0.0f);
            GL11.glScalef((float)f8, (float)f8, (float)f8);
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.0f);
            GL11.glRotatef((float)((float)(i2 * i2 * 4321 + i2 * 9) * 2.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)0.0f);
            GL11.glTranslatef((float)(-f3), (float)(-f5), (float)(-f4));
            f11 = f10 + azd.b;
            GL11.glTranslatef((float)(azd.a * f7 / f11), (float)(azd.c * f7 / f11), (float)(-f4));
            bna bna2 = bna.a;
            bna2.b();
            f13 = e.nextFloat() * 0.5f + 0.1f;
            float f14 = e.nextFloat() * 0.5f + 0.4f;
            float f15 = e.nextFloat() * 0.5f + 0.5f;
            if (i2 == 0) {
                f15 = 1.0f;
                f14 = 1.0f;
                f13 = 1.0f;
            }
            bna2.a(f13 * f9, f14 * f9, f15 * f9, 1.0f);
            bna2.a(d2, d3 + (double)f6, d4);
            bna2.a(d2, d3 + (double)f6, d4 + 1.0);
            bna2.a(d2 + 1.0, d3 + (double)f6, d4 + 1.0);
            bna2.a(d2 + 1.0, d3 + (double)f6, d4);
            bna2.a();
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
        }
        GL11.glDisable((int)3042);
        GL11.glDisable((int)3168);
        GL11.glDisable((int)3169);
        GL11.glDisable((int)3170);
        GL11.glDisable((int)3171);
        GL11.glEnable((int)2896);
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.b.clear();
        this.b.put(f2).put(f3).put(f4).put(f5);
        this.b.flip();
        return this.b;
    }
}

