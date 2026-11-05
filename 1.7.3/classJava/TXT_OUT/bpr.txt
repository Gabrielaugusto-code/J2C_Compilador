/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpr
extends boh {
    private bmf a = new bmf();

    public bpr() {
        this.d = 0.5f;
    }

    public void a(wn wn2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        if ((float)wn2.a - f3 + 1.0f < 10.0f) {
            f4 = 1.0f - ((float)wn2.a - f3 + 1.0f) / 10.0f;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            f4 *= f4;
            f4 *= f4;
            float f5 = 1.0f + f4 * 0.3f;
            GL11.glScalef((float)f5, (float)f5, (float)f5);
        }
        f4 = (1.0f - ((float)wn2.a - f3 + 1.0f) / 100.0f) * 0.8f;
        this.b(wn2);
        this.a.a(aie.W, 0, wn2.d(f3));
        if (wn2.a / 5 % 2 == 0) {
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)772);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f4);
            this.a.a(aie.W, 0, 1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
        }
        GL11.glPopMatrix();
    }

    protected brq a(wn wn2) {
        return bqs.b;
    }
}

