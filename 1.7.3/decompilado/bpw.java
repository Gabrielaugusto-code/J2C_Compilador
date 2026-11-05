/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpw
extends boh {
    private static final brq a = new brq("textures/entity/wither/wither_invulnerable.png");
    private static final brq f = new brq("textures/entity/wither/wither.png");
    private final biw g = new biw();

    private float a(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    public void a(yg yg2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        float f4 = this.a(yg2.A, yg2.y, f3);
        float f5 = yg2.B + (yg2.z - yg2.B) * f3;
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        float f6 = 0.0625f;
        GL11.glEnable((int)32826);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        GL11.glEnable((int)3008);
        this.b(yg2);
        this.g.a(yg2, 0.0f, 0.0f, 0.0f, f4, f5, f6);
        GL11.glPopMatrix();
    }

    protected brq a(yg yg2) {
        return yg2.f() ? a : f;
    }
}

