/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bod
extends boh {
    private static final brq a = new brq("textures/entity/endercrystal/endercrystal.png");
    private bim f;

    public bod() {
        this.d = 0.5f;
        this.f = new bjm(0.0f, true);
    }

    public void a(vq vq2, double d2, double d3, double d4, float f2, float f3) {
        float f4 = (float)vq2.a + f3;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        this.a(a);
        float f5 = oy.a(f4 * 0.2f) / 2.0f + 0.5f;
        f5 = f5 * f5 + f5;
        this.f.a(vq2, 0.0f, f4 * 3.0f, f5 * 0.2f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    protected brq a(vq vq2) {
        return a;
    }
}

