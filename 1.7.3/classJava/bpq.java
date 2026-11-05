/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpq
extends bpb {
    protected void a(wm wm2, float f2, ahz ahz2, int n2) {
        int n3 = wm2.f();
        if (n3 > -1 && (float)n3 - f2 + 1.0f < 10.0f) {
            float f3 = 1.0f - ((float)n3 - f2 + 1.0f) / 10.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            GL11.glScalef((float)f4, (float)f4, (float)f4);
        }
        super.a(wm2, f2, ahz2, n2);
        if (n3 > -1 && n3 / 5 % 2 == 0) {
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)772);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)((1.0f - ((float)n3 - f2 + 1.0f) / 100.0f) * 0.8f));
            GL11.glPushMatrix();
            this.f.a(aie.W, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
        }
    }
}

