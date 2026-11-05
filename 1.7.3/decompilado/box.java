/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class box
extends bpd {
    private static final brq a = new brq("textures/entity/slime/magmacube.png");

    public box() {
        super(new bij(), 0.25f);
    }

    protected brq a(ww ww2) {
        return a;
    }

    protected void a(ww ww2, float f2) {
        int n2 = ww2.bX();
        float f3 = (ww2.bm + (ww2.i - ww2.bm) * f2) / ((float)n2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        float f5 = n2;
        GL11.glScalef((float)(f4 * f5), (float)(1.0f / f4 * f5), (float)(f4 * f5));
    }
}

