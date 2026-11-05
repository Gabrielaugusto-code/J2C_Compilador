/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpe
extends bpd {
    private static final brq a = new brq("textures/entity/cow/mooshroom.png");

    public bpe(bim bim2, float f2) {
        super(bim2, f2);
    }

    public void a(vd vd2, double d2, double d3, double d4, float f2, float f3) {
        super.a(vd2, d2, d3, d4, f2, f3);
    }

    protected brq a(vd vd2) {
        return a;
    }

    protected void a(vd vd2, float f2) {
        super.c(vd2, f2);
        if (vd2.f()) {
            return;
        }
        this.a(bqs.b);
        GL11.glEnable((int)2884);
        GL11.glPushMatrix();
        GL11.glScalef((float)1.0f, (float)-1.0f, (float)1.0f);
        GL11.glTranslatef((float)0.2f, (float)0.4f, (float)0.5f);
        GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        this.c.a((ahz)aie.Q, 0, 1.0f);
        GL11.glTranslatef((float)0.1f, (float)0.0f, (float)-0.6f);
        GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        this.c.a((ahz)aie.Q, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        ((bir)this.i).a.c(0.0625f);
        GL11.glScalef((float)1.0f, (float)-1.0f, (float)1.0f);
        GL11.glTranslatef((float)0.0f, (float)0.75f, (float)-0.2f);
        GL11.glRotatef((float)12.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        this.c.a((ahz)aie.Q, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glDisable((int)2884);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((vd)rm2, f2);
    }
}

