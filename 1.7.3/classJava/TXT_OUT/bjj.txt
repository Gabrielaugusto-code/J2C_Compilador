/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bjj
extends bim {
    public bjs a;
    public bjs b;
    public bjs c;
    public bjs d;
    public bjs e;
    public bjs f;
    bjs g;
    bjs h;

    public bjj() {
        float f2 = 0.0f;
        float f3 = 13.5f;
        this.a = new bjs(this, 0, 0);
        this.a.a(-3.0f, -3.0f, -2.0f, 6, 6, 4, f2);
        this.a.a(-1.0f, f3, -7.0f);
        this.b = new bjs(this, 18, 14);
        this.b.a(-4.0f, -2.0f, -3.0f, 6, 9, 6, f2);
        this.b.a(0.0f, 14.0f, 2.0f);
        this.h = new bjs(this, 21, 0);
        this.h.a(-4.0f, -3.0f, -3.0f, 8, 6, 7, f2);
        this.h.a(-1.0f, 14.0f, 2.0f);
        this.c = new bjs(this, 0, 18);
        this.c.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, f2);
        this.c.a(-2.5f, 16.0f, 7.0f);
        this.d = new bjs(this, 0, 18);
        this.d.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, f2);
        this.d.a(0.5f, 16.0f, 7.0f);
        this.e = new bjs(this, 0, 18);
        this.e.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, f2);
        this.e.a(-2.5f, 16.0f, -4.0f);
        this.f = new bjs(this, 0, 18);
        this.f.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, f2);
        this.f.a(0.5f, 16.0f, -4.0f);
        this.g = new bjs(this, 9, 18);
        this.g.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, f2);
        this.g.a(-1.0f, 12.0f, 8.0f);
        this.a.a(16, 14).a(-3.0f, -5.0f, 0.0f, 2, 2, 1, f2);
        this.a.a(16, 14).a(1.0f, -5.0f, 0.0f, 2, 2, 1, f2);
        this.a.a(0, 10).a(-1.5f, 0.0f, -5.0f, 3, 3, 4, f2);
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(qr2, f2, f3, f4, f5, f6, f7);
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        if (this.s) {
            float f8 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(5.0f * f7), (float)(2.0f * f7));
            this.a.b(f7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f8), (float)(1.0f / f8), (float)(1.0f / f8));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f7), (float)0.0f);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.b(f7);
            this.h.a(f7);
            GL11.glPopMatrix();
        } else {
            this.a.b(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.b(f7);
            this.h.a(f7);
        }
    }

    @Override
    public void a(rm rm2, float f2, float f3, float f4) {
        vm vm2 = (vm)rm2;
        this.g.g = vm2.ci() ? 0.0f : oy.b(f2 * 0.6662f) * 1.4f * f3;
        if (vm2.ca()) {
            this.h.a(-1.0f, 16.0f, -3.0f);
            this.h.f = 1.2566371f;
            this.h.g = 0.0f;
            this.b.a(0.0f, 18.0f, 0.0f);
            this.b.f = 0.7853982f;
            this.g.a(-1.0f, 21.0f, 6.0f);
            this.c.a(-2.5f, 22.0f, 2.0f);
            this.c.f = 4.712389f;
            this.d.a(0.5f, 22.0f, 2.0f);
            this.d.f = 4.712389f;
            this.e.f = 5.811947f;
            this.e.a(-2.49f, 17.0f, -4.0f);
            this.f.f = 5.811947f;
            this.f.a(0.51f, 17.0f, -4.0f);
        } else {
            this.b.a(0.0f, 14.0f, 2.0f);
            this.b.f = 1.5707964f;
            this.h.a(-1.0f, 14.0f, -3.0f);
            this.h.f = this.b.f;
            this.g.a(-1.0f, 12.0f, 8.0f);
            this.c.a(-2.5f, 16.0f, 7.0f);
            this.d.a(0.5f, 16.0f, 7.0f);
            this.e.a(-2.5f, 16.0f, -4.0f);
            this.f.a(0.5f, 16.0f, -4.0f);
            this.c.f = oy.b(f2 * 0.6662f) * 1.4f * f3;
            this.d.f = oy.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.e.f = oy.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.f.f = oy.b(f2 * 0.6662f) * 1.4f * f3;
        }
        this.a.h = vm2.q(f4) + vm2.g(f4, 0.0f);
        this.h.h = vm2.g(f4, -0.08f);
        this.b.h = vm2.g(f4, -0.16f);
        this.g.h = vm2.g(f4, -0.2f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        super.a(f2, f3, f4, f5, f6, f7, qr2);
        this.a.f = f6 / 57.295776f;
        this.a.g = f5 / 57.295776f;
        this.g.f = f4;
    }
}

