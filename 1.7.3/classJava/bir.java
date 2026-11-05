/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bir
extends bim {
    public bjs a = new bjs(this, 0, 0);
    public bjs b;
    public bjs c;
    public bjs d;
    public bjs e;
    public bjs f;
    protected float g = 8.0f;
    protected float h = 4.0f;

    public bir(int n2, float f2) {
        this.a.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f2);
        this.a.a(0.0f, 18 - n2, -6.0f);
        this.b = new bjs(this, 28, 8);
        this.b.a(-5.0f, -10.0f, -7.0f, 10, 16, 8, f2);
        this.b.a(0.0f, 17 - n2, 2.0f);
        this.c = new bjs(this, 0, 16);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.c.a(-3.0f, 24 - n2, 7.0f);
        this.d = new bjs(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.d.a(3.0f, 24 - n2, 7.0f);
        this.e = new bjs(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.e.a(-3.0f, 24 - n2, -5.0f);
        this.f = new bjs(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.f.a(3.0f, 24 - n2, -5.0f);
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        if (this.s) {
            float f8 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(this.g * f7), (float)(this.h * f7));
            this.a.a(f7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f8), (float)(1.0f / f8), (float)(1.0f / f8));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f7), (float)0.0f);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            GL11.glPopMatrix();
        } else {
            this.a.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        float f8 = 57.295776f;
        this.a.f = f6 / 57.295776f;
        this.a.g = f5 / 57.295776f;
        this.b.f = 1.5707964f;
        this.c.f = oy.b(f2 * 0.6662f) * 1.4f * f3;
        this.d.f = oy.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.e.f = oy.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.f.f = oy.b(f2 * 0.6662f) * 1.4f * f3;
    }
}

