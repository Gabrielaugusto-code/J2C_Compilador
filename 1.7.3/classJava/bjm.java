/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bjm
extends bim {
    private bjs a;
    private bjs b = new bjs(this, "glass");
    private bjs c;

    public bjm(float f2, boolean bl2) {
        this.b.a(0, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.a = new bjs(this, "cube");
        this.a.a(32, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (bl2) {
            this.c = new bjs(this, "base");
            this.c.a(0, 16).a(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glTranslatef((float)0.0f, (float)-0.5f, (float)0.0f);
        if (this.c != null) {
            this.c.a(f7);
        }
        GL11.glRotatef((float)f3, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)(0.8f + f4), (float)0.0f);
        GL11.glRotatef((float)60.0f, (float)0.7071f, (float)0.0f, (float)0.7071f);
        this.b.a(f7);
        float f8 = 0.875f;
        GL11.glScalef((float)f8, (float)f8, (float)f8);
        GL11.glRotatef((float)60.0f, (float)0.7071f, (float)0.0f, (float)0.7071f);
        GL11.glRotatef((float)f3, (float)0.0f, (float)1.0f, (float)0.0f);
        this.b.a(f7);
        GL11.glScalef((float)f8, (float)f8, (float)f8);
        GL11.glRotatef((float)60.0f, (float)0.7071f, (float)0.0f, (float)0.7071f);
        GL11.glRotatef((float)f3, (float)0.0f, (float)1.0f, (float)0.0f);
        this.a.a(f7);
        GL11.glPopMatrix();
    }
}

