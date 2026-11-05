/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bic
extends bim {
    public bjs a;
    public bjs b;
    public bjs c;
    public bjs d;
    public bjs e;
    public bjs f;
    public bjs g;
    public bjs h;

    public bic() {
        int n2 = 16;
        this.a = new bjs(this, 0, 0);
        this.a.a(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.a.a(0.0f, -1 + n2, -4.0f);
        this.g = new bjs(this, 14, 0);
        this.g.a(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.g.a(0.0f, -1 + n2, -4.0f);
        this.h = new bjs(this, 14, 4);
        this.h.a(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.h.a(0.0f, -1 + n2, -4.0f);
        this.b = new bjs(this, 0, 9);
        this.b.a(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.b.a(0.0f, n2, 0.0f);
        this.c = new bjs(this, 26, 0);
        this.c.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.c.a(-2.0f, 3 + n2, 1.0f);
        this.d = new bjs(this, 26, 0);
        this.d.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.d.a(1.0f, 3 + n2, 1.0f);
        this.e = new bjs(this, 24, 13);
        this.e.a(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.e.a(-4.0f, -3 + n2, 0.0f);
        this.f = new bjs(this, 24, 13);
        this.f.a(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.f.a(4.0f, -3 + n2, 0.0f);
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        if (this.s) {
            float f8 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(5.0f * f7), (float)(2.0f * f7));
            this.a.a(f7);
            this.g.a(f7);
            this.h.a(f7);
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
            this.g.a(f7);
            this.h.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        this.a.f = f6 / 57.295776f;
        this.a.g = f5 / 57.295776f;
        this.g.f = this.a.f;
        this.g.g = this.a.g;
        this.h.f = this.a.f;
        this.h.g = this.a.g;
        this.b.f = 1.5707964f;
        this.c.f = oy.b(f2 * 0.6662f) * 1.4f * f3;
        this.d.f = oy.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.e.h = f4;
        this.f.h = -f4;
    }
}

