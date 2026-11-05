/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bnh
extends bne {
    private static final brq b = new brq("textures/entity/chest/ender.png");
    private bib c = new bib();

    public void a(anv anv2, double d2, double d3, double d4, float f2) {
        int n2 = 0;
        if (anv2.o()) {
            n2 = anv2.p();
        }
        this.a(b);
        GL11.glPushMatrix();
        GL11.glEnable((int)32826);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glTranslatef((float)((float)d2), (float)((float)d3 + 1.0f), (float)((float)d4 + 1.0f));
        GL11.glScalef((float)1.0f, (float)-1.0f, (float)-1.0f);
        GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        int n3 = 0;
        if (n2 == 2) {
            n3 = 180;
        }
        if (n2 == 3) {
            n3 = 0;
        }
        if (n2 == 4) {
            n3 = 90;
        }
        if (n2 == 5) {
            n3 = -90;
        }
        GL11.glRotatef((float)n3, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
        float f3 = anv2.i + (anv2.a - anv2.i) * f2;
        f3 = 1.0f - f3;
        f3 = 1.0f - f3 * f3 * f3;
        this.c.a.f = -(f3 * (float)Math.PI / 2.0f);
        this.c.a();
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

