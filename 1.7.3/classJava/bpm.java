/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpm
extends bpd {
    private static final brq a = new brq("textures/entity/slime/slime.png");
    private bim f;

    public bpm(bim bim2, bim bim3, float f2) {
        super(bim2, f2);
        this.f = bim3;
    }

    protected int a(xd xd2, int n2, float f2) {
        if (xd2.ao()) {
            return 0;
        }
        if (n2 == 0) {
            this.a(this.f);
            GL11.glEnable((int)2977);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            return 1;
        }
        if (n2 == 1) {
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        return -1;
    }

    protected void a(xd xd2, float f2) {
        float f3 = xd2.bX();
        float f4 = (xd2.bm + (xd2.i - xd2.bm) * f2) / (f3 * 0.5f + 1.0f);
        float f5 = 1.0f / (f4 + 1.0f);
        GL11.glScalef((float)(f5 * f3), (float)(1.0f / f5 * f3), (float)(f5 * f3));
    }

    protected brq a(xd xd2) {
        return a;
    }
}

