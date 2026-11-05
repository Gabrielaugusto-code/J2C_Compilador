/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpf
extends bpd {
    private static final brq a = new brq("textures/entity/cat/black.png");
    private static final brq f = new brq("textures/entity/cat/ocelot.png");
    private static final brq g = new brq("textures/entity/cat/red.png");
    private static final brq h = new brq("textures/entity/cat/siamese.png");

    public bpf(bim bim2, float f2) {
        super(bim2, f2);
    }

    public void a(ve ve2, double d2, double d3, double d4, float f2, float f3) {
        super.a(ve2, d2, d3, d4, f2, f3);
    }

    protected brq a(ve ve2) {
        switch (ve2.cg()) {
            default: {
                return f;
            }
            case 1: {
                return a;
            }
            case 2: {
                return g;
            }
            case 3: 
        }
        return h;
    }

    protected void a(ve ve2, float f2) {
        super.a(ve2, f2);
        if (ve2.bZ()) {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
        }
    }
}

