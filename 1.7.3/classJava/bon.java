/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bon
extends bpd {
    private static final brq a = new brq("textures/entity/zombie/zombie.png");
    private float f;

    public bon(bim bim2, float f2, float f3) {
        super(bim2, f2 * f3);
        this.f = f3;
    }

    protected void a(wv wv2, float f2) {
        GL11.glScalef((float)this.f, (float)this.f, (float)this.f);
    }

    protected brq a(wv wv2) {
        return a;
    }
}

