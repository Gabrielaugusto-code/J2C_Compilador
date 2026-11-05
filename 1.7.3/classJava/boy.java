/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class boy
extends boh {
    private static final brq a = new brq("textures/entity/lead_knot.png");
    private bik f = new bik();

    public void a(rl rl2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        float f4 = 0.0625f;
        GL11.glEnable((int)32826);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        GL11.glEnable((int)3008);
        this.b(rl2);
        this.f.a(rl2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4);
        GL11.glPopMatrix();
    }

    protected brq a(rl rl2) {
        return a;
    }
}

