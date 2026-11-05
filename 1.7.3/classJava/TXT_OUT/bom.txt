/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bom
extends bpd {
    private static final brq a = new brq("textures/entity/ghast/ghast.png");
    private static final brq f = new brq("textures/entity/ghast/ghast_shooting.png");

    public bom() {
        super(new big(), 0.5f);
    }

    protected brq a(wu wu2) {
        if (wu2.bP()) {
            return f;
        }
        return a;
    }

    protected void a(wu wu2, float f2) {
        wu wu3 = wu2;
        float f3 = ((float)wu3.bo + (float)(wu3.bp - wu3.bo) * f2) / 20.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        f3 = 1.0f / (f3 * f3 * f3 * f3 * f3 * 2.0f + 1.0f);
        float f4 = (8.0f + f3) / 2.0f;
        float f5 = (8.0f + 1.0f / f3) / 2.0f;
        GL11.glScalef((float)f5, (float)f4, (float)f5);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

