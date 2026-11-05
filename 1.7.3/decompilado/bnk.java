/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bnk
extends bne {
    private static final brq b = new brq("textures/entity/sign.png");
    private final biu c = new biu();

    public void a(aod aod2, double d2, double d3, double d4, float f2) {
        float f3;
        ahz ahz2 = aod2.q();
        GL11.glPushMatrix();
        float f4 = 0.6666667f;
        if (ahz2 == aie.an) {
            GL11.glTranslatef((float)((float)d2 + 0.5f), (float)((float)d3 + 0.75f * f4), (float)((float)d4 + 0.5f));
            float f5 = (float)(aod2.p() * 360) / 16.0f;
            GL11.glRotatef((float)(-f5), (float)0.0f, (float)1.0f, (float)0.0f);
            this.c.b.j = true;
        } else {
            int n2 = aod2.p();
            f3 = 0.0f;
            if (n2 == 2) {
                f3 = 180.0f;
            }
            if (n2 == 4) {
                f3 = 90.0f;
            }
            if (n2 == 5) {
                f3 = -90.0f;
            }
            GL11.glTranslatef((float)((float)d2 + 0.5f), (float)((float)d3 + 0.75f * f4), (float)((float)d4 + 0.5f));
            GL11.glRotatef((float)(-f3), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.3125f, (float)-0.4375f);
            this.c.b.j = false;
        }
        this.a(b);
        GL11.glPushMatrix();
        GL11.glScalef((float)f4, (float)(-f4), (float)(-f4));
        this.c.a();
        GL11.glPopMatrix();
        ban ban2 = this.b();
        f3 = 0.016666668f * f4;
        GL11.glTranslatef((float)0.0f, (float)(0.5f * f4), (float)(0.07f * f4));
        GL11.glScalef((float)f3, (float)(-f3), (float)f3);
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(-1.0f * f3));
        GL11.glDepthMask((boolean)false);
        int n3 = 0;
        for (int i2 = 0; i2 < aod2.a.length; ++i2) {
            String string = aod2.a[i2];
            if (i2 == aod2.i) {
                string = "> " + string + " <";
                ban2.b(string, -ban2.a(string) / 2, i2 * 10 - aod2.a.length * 5, n3);
                continue;
            }
            ban2.b(string, -ban2.a(string) / 2, i2 * 10 - aod2.a.length * 5, n3);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }
}

