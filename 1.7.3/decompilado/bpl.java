/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpl
extends bop {
    private static final brq k = new brq("textures/entity/skeleton/skeleton.png");
    private static final brq l = new brq("textures/entity/skeleton/wither_skeleton.png");

    public bpl() {
        super(new bix(), 0.5f);
    }

    protected void a(xc xc2, float f2) {
        if (xc2.cb() == 1) {
            GL11.glScalef((float)1.2f, (float)1.2f, (float)1.2f);
        }
    }

    @Override
    protected void e() {
        GL11.glTranslatef((float)0.09375f, (float)0.1875f, (float)0.0f);
    }

    protected brq a(xc xc2) {
        if (xc2.cb() == 1) {
            return l;
        }
        return k;
    }
}

