/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class boi
extends boh {
    private static final brq a = new brq("textures/entity/experience_orb.png");

    public boi() {
        this.d = 0.15f;
        this.e = 0.75f;
    }

    public void a(rh rh2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        this.b(rh2);
        int n2 = rh2.f();
        float f4 = (float)(n2 % 4 * 16 + 0) / 64.0f;
        float f5 = (float)(n2 % 4 * 16 + 16) / 64.0f;
        float f6 = (float)(n2 / 4 * 16 + 0) / 64.0f;
        float f7 = (float)(n2 / 4 * 16 + 16) / 64.0f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        int n3 = rh2.c(f3);
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        bwg.a(bwg.c, (float)n4 / 1.0f, (float)n5 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f11 = 255.0f;
        float f12 = ((float)rh2.a + f3) / 2.0f;
        n5 = (int)((oy.a(f12 + 0.0f) + 1.0f) * 0.5f * f11);
        int n6 = (int)f11;
        int n7 = (int)((oy.a(f12 + 4.1887903f) + 1.0f) * 0.1f * f11);
        int n8 = n5 << 16 | n6 << 8 | n7;
        GL11.glRotatef((float)(180.0f - this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.b.k), (float)1.0f, (float)0.0f, (float)0.0f);
        float f13 = 0.3f;
        GL11.glScalef((float)f13, (float)f13, (float)f13);
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(n8, 128);
        bna2.c(0.0f, 1.0f, 0.0f);
        bna2.a(0.0f - f9, 0.0f - f10, 0.0, f4, f7);
        bna2.a(f8 - f9, 0.0f - f10, 0.0, f5, f7);
        bna2.a(f8 - f9, 1.0f - f10, 0.0, f5, f6);
        bna2.a(0.0f - f9, 1.0f - f10, 0.0, f4, f6);
        bna2.a();
        GL11.glDisable((int)3042);
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    protected brq a(rh rh2) {
        return a;
    }
}

