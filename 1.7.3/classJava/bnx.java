/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bnx
extends boh {
    private static final brq f = new brq("textures/entity/boat.png");
    protected bim a;

    public bnx() {
        this.d = 0.5f;
        this.a = new bhz();
    }

    public void a(vz vz2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        GL11.glRotatef((float)(180.0f - f2), (float)0.0f, (float)1.0f, (float)0.0f);
        float f4 = (float)vz2.f() - f3;
        float f5 = vz2.e() - f3;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f4 > 0.0f) {
            GL11.glRotatef((float)(oy.a(f4) * f4 * f5 / 10.0f * (float)vz2.i()), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        float f6 = 0.75f;
        GL11.glScalef((float)f6, (float)f6, (float)f6);
        GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
        this.b(vz2);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        this.a.a(vz2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    protected brq a(vz vz2) {
        return f;
    }
}

