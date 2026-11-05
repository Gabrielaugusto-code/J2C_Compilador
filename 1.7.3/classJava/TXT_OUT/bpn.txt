/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpn
extends bpd {
    private static final brq a = new brq("textures/entity/snowman.png");
    private bja f;

    public bpn() {
        super(new bja(), 0.5f);
        this.f = (bja)this.i;
        this.a(this.f);
    }

    protected void a(vi vi2, float f2) {
        super.c(vi2, f2);
        abu abu2 = new abu(aie.aK, 1);
        if (abu2.b() instanceof zy) {
            GL11.glPushMatrix();
            this.f.c.c(0.0625f);
            if (bmf.a(ahz.a(abu2.b()).b())) {
                float f3 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)-0.34375f, (float)0.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f3, (float)(-f3), (float)f3);
            }
            this.b.f.a(vi2, abu2, 0);
            GL11.glPopMatrix();
        }
    }

    protected brq a(vi vi2) {
        return a;
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((vi)rm2, f2);
    }
}

