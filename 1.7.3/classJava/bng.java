/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bng
extends bne {
    private static final brq b = new brq("textures/entity/enchanting_table_book.png");
    private bia c = new bia();

    public void a(anu anu2, double d2, double d3, double d4, float f2) {
        float f3;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2 + 0.5f), (float)((float)d3 + 0.75f), (float)((float)d4 + 0.5f));
        float f4 = (float)anu2.a + f2;
        GL11.glTranslatef((float)0.0f, (float)(0.1f + oy.a(f4 * 0.1f) * 0.01f), (float)0.0f);
        for (f3 = anu2.o - anu2.p; f3 >= (float)Math.PI; f3 -= (float)Math.PI * 2) {
        }
        while (f3 < (float)(-Math.PI)) {
            f3 += (float)Math.PI * 2;
        }
        float f5 = anu2.p + f3 * f2;
        GL11.glRotatef((float)(-f5 * 180.0f / (float)Math.PI), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        this.a(b);
        float f6 = anu2.j + (anu2.i - anu2.j) * f2 + 0.25f;
        float f7 = anu2.j + (anu2.i - anu2.j) * f2 + 0.75f;
        f6 = (f6 - (float)oy.b((double)f6)) * 1.6f - 0.3f;
        f7 = (f7 - (float)oy.b((double)f7)) * 1.6f - 0.3f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = anu2.n + (anu2.m - anu2.n) * f2;
        GL11.glEnable((int)2884);
        this.c.a(null, f4, f6, f7, f8, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
}

