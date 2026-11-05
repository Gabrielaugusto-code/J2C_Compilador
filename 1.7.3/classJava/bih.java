/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bih
extends bim {
    public bjs c;
    public bjs d;
    public bjs e;
    public bjs f;
    public bjs g;
    public bjs h;
    public bjs i;
    public bjs j;
    public bjs k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    public bih() {
        this(0.0f);
    }

    public bih(float f2) {
        this(f2, 0.0f, 64, 32);
    }

    public bih(float f2, float f3, int n2, int n3) {
        this.t = n2;
        this.u = n3;
        this.k = new bjs(this, 0, 0);
        this.k.a(-5.0f, 0.0f, -1.0f, 10, 16, 1, f2);
        this.j = new bjs(this, 24, 0);
        this.j.a(-3.0f, -6.0f, -1.0f, 6, 6, 1, f2);
        this.c = new bjs(this, 0, 0);
        this.c.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2);
        this.c.a(0.0f, 0.0f + f3, 0.0f);
        this.d = new bjs(this, 32, 0);
        this.d.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 + 0.5f);
        this.d.a(0.0f, 0.0f + f3, 0.0f);
        this.e = new bjs(this, 16, 16);
        this.e.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.e.a(0.0f, 0.0f + f3, 0.0f);
        this.f = new bjs(this, 40, 16);
        this.f.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.f.a(-5.0f, 2.0f + f3, 0.0f);
        this.g = new bjs(this, 40, 16);
        this.g.i = true;
        this.g.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.g.a(5.0f, 2.0f + f3, 0.0f);
        this.h = new bjs(this, 0, 16);
        this.h.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.h.a(-1.9f, 12.0f + f3, 0.0f);
        this.i = new bjs(this, 0, 16);
        this.i.i = true;
        this.i.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.i.a(1.9f, 12.0f + f3, 0.0f);
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        if (this.s) {
            float f8 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.5f / f8), (float)(1.5f / f8), (float)(1.5f / f8));
            GL11.glTranslatef((float)0.0f, (float)(16.0f * f7), (float)0.0f);
            this.c.a(f7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f8), (float)(1.0f / f8), (float)(1.0f / f8));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f7), (float)0.0f);
            this.e.a(f7);
            this.f.a(f7);
            this.g.a(f7);
            this.h.a(f7);
            this.i.a(f7);
            this.d.a(f7);
            GL11.glPopMatrix();
        } else {
            this.c.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.a(f7);
            this.h.a(f7);
            this.i.a(f7);
            this.d.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        float f8;
        float f9;
        this.c.g = f5 / 57.295776f;
        this.c.f = f6 / 57.295776f;
        this.d.g = this.c.g;
        this.d.f = this.c.f;
        this.f.f = oy.b(f2 * 0.6662f + (float)Math.PI) * 2.0f * f3 * 0.5f;
        this.g.f = oy.b(f2 * 0.6662f) * 2.0f * f3 * 0.5f;
        this.f.h = 0.0f;
        this.g.h = 0.0f;
        this.h.f = oy.b(f2 * 0.6662f) * 1.4f * f3;
        this.i.f = oy.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.h.g = 0.0f;
        this.i.g = 0.0f;
        if (this.q) {
            this.f.f += -0.62831855f;
            this.g.f += -0.62831855f;
            this.h.f = -1.2566371f;
            this.i.f = -1.2566371f;
            this.h.g = 0.31415927f;
            this.i.g = -0.31415927f;
        }
        if (this.l != 0) {
            this.g.f = this.g.f * 0.5f - 0.31415927f * (float)this.l;
        }
        if (this.m != 0) {
            this.f.f = this.f.f * 0.5f - 0.31415927f * (float)this.m;
        }
        this.f.g = 0.0f;
        this.g.g = 0.0f;
        if (this.p > -9990.0f) {
            f9 = this.p;
            this.e.g = oy.a(oy.c(f9) * (float)Math.PI * 2.0f) * 0.2f;
            this.f.e = oy.a(this.e.g) * 5.0f;
            this.f.c = -oy.b(this.e.g) * 5.0f;
            this.g.e = -oy.a(this.e.g) * 5.0f;
            this.g.c = oy.b(this.e.g) * 5.0f;
            this.f.g += this.e.g;
            this.g.g += this.e.g;
            this.g.f += this.e.g;
            f9 = 1.0f - this.p;
            f9 *= f9;
            f9 *= f9;
            f9 = 1.0f - f9;
            f8 = oy.a(f9 * (float)Math.PI);
            float f10 = oy.a(this.p * (float)Math.PI) * -(this.c.f - 0.7f) * 0.75f;
            this.f.f = (float)((double)this.f.f - ((double)f8 * 1.2 + (double)f10));
            this.f.g += this.e.g * 2.0f;
            this.f.h = oy.a(this.p * (float)Math.PI) * -0.4f;
        }
        if (this.n) {
            this.e.f = 0.5f;
            this.f.f += 0.4f;
            this.g.f += 0.4f;
            this.h.e = 4.0f;
            this.i.e = 4.0f;
            this.h.d = 9.0f;
            this.i.d = 9.0f;
            this.c.d = 1.0f;
            this.d.d = 1.0f;
        } else {
            this.e.f = 0.0f;
            this.h.e = 0.1f;
            this.i.e = 0.1f;
            this.h.d = 12.0f;
            this.i.d = 12.0f;
            this.c.d = 0.0f;
            this.d.d = 0.0f;
        }
        this.f.h += oy.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.g.h -= oy.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.f.f += oy.a(f4 * 0.067f) * 0.05f;
        this.g.f -= oy.a(f4 * 0.067f) * 0.05f;
        if (this.o) {
            f9 = 0.0f;
            f8 = 0.0f;
            this.f.h = 0.0f;
            this.g.h = 0.0f;
            this.f.g = -(0.1f - f9 * 0.6f) + this.c.g;
            this.g.g = 0.1f - f9 * 0.6f + this.c.g + 0.4f;
            this.f.f = -1.5707964f + this.c.f;
            this.g.f = -1.5707964f + this.c.f;
            this.f.f -= f9 * 1.2f - f8 * 0.4f;
            this.g.f -= f9 * 1.2f - f8 * 0.4f;
            this.f.h += oy.b(f4 * 0.09f) * 0.05f + 0.05f;
            this.g.h -= oy.b(f4 * 0.09f) * 0.05f + 0.05f;
            this.f.f += oy.a(f4 * 0.067f) * 0.05f;
            this.g.f -= oy.a(f4 * 0.067f) * 0.05f;
        }
    }

    public void b(float f2) {
        this.j.g = this.c.g;
        this.j.f = this.c.f;
        this.j.c = 0.0f;
        this.j.d = 0.0f;
        this.j.a(f2);
    }

    public void c(float f2) {
        this.k.a(f2);
    }
}

