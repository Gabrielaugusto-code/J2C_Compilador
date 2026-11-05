/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bok
extends boh {
    private float a;

    public bok(float f2) {
        this.a = f2;
    }

    public void a(xv xv2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        this.b(xv2);
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        GL11.glEnable((int)32826);
        float f4 = this.a;
        GL11.glScalef((float)(f4 / 1.0f), (float)(f4 / 1.0f), (float)(f4 / 1.0f));
        pw pw2 = abv.bz.b_(0);
        bna bna2 = bna.a;
        float f5 = pw2.c();
        float f6 = pw2.d();
        float f7 = pw2.e();
        float f8 = pw2.f();
        float f9 = 1.0f;
        float f10 = 0.5f;
        float f11 = 0.25f;
        GL11.glRotatef((float)(180.0f - this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.b.k), (float)1.0f, (float)0.0f, (float)0.0f);
        bna2.b();
        bna2.c(0.0f, 1.0f, 0.0f);
        bna2.a(0.0f - f10, 0.0f - f11, 0.0, f5, f8);
        bna2.a(f9 - f10, 0.0f - f11, 0.0, f6, f8);
        bna2.a(f9 - f10, 1.0f - f11, 0.0, f6, f7);
        bna2.a(0.0f - f10, 1.0f - f11, 0.0, f5, f7);
        bna2.a();
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    protected brq a(xv xv2) {
        return bqs.c;
    }
}

