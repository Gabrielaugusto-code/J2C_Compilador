/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bni
extends bne {
    public void a(aoa aoa2, double d2, double d3, double d4, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2 + 0.5f), (float)((float)d3), (float)((float)d4 + 0.5f));
        bni.a(aoa2.a(), d2, d3, d4, f2);
        GL11.glPopMatrix();
    }

    public static void a(afh afh2, double d2, double d3, double d4, float f2) {
        qr qr2 = afh2.h();
        if (qr2 != null) {
            qr2.a(afh2.a());
            float f3 = 0.4375f;
            GL11.glTranslatef((float)0.0f, (float)0.4f, (float)0.0f);
            GL11.glRotatef((float)((float)(afh2.d + (afh2.c - afh2.d) * (double)f2) * 10.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.4f, (float)0.0f);
            GL11.glScalef((float)f3, (float)f3, (float)f3);
            qr2.b(d2, d3, d4, 0.0f, 0.0f);
            bog.a.a(qr2, 0.0, 0.0, 0.0, 0.0f, f2);
        }
    }
}

