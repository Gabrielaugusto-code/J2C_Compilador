/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class boq
extends boh {
    private static final brq a = new brq("textures/map/map_background.png");
    private final bmf f = new bmf();
    private final azi g = azi.B();
    private pw h;

    @Override
    public void a(px px2) {
        this.h = px2.a("itemframe_background");
    }

    public void a(rk rk2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        double d5 = rk2.s - d2 - 0.5;
        double d6 = rk2.t - d3 - 0.5;
        double d7 = rk2.u - d4 - 0.5;
        int n2 = rk2.b + p.a[rk2.a];
        int n3 = rk2.c;
        int n4 = rk2.d + p.b[rk2.a];
        GL11.glTranslated((double)((double)n2 - d5), (double)((double)n3 - d6), (double)((double)n4 - d7));
        if (rk2.j() != null && rk2.j().b() == abv.aY) {
            this.b(rk2);
        } else {
            this.c(rk2);
        }
        this.d(rk2);
        GL11.glPopMatrix();
        this.a(rk2, d2 + (double)((float)p.a[rk2.a] * 0.3f), d3 - 0.25, d4 + (double)((float)p.b[rk2.a] * 0.3f));
    }

    protected brq a(rk rk2) {
        return null;
    }

    private void b(rk rk2) {
        GL11.glPushMatrix();
        GL11.glRotatef((float)rk2.y, (float)0.0f, (float)1.0f, (float)0.0f);
        this.b.e.a(bqs.b);
        ahz ahz2 = aie.f;
        float f2 = 0.0625f;
        float f3 = 1.0f;
        float f4 = f3 / 2.0f;
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4 + 0.0625f, 0.5f - f4 + 0.0625f, f2, 0.5f + f4 - 0.0625f, 0.5f + f4 - 0.0625f);
        this.f.a(this.h);
        this.f.a(ahz2, 0, 1.0f);
        this.f.a();
        this.f.c();
        GL11.glPopMatrix();
        this.f.a(aie.f.a(1, 2));
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4, 0.5f - f4, f2 + 1.0E-4f, f2 + 0.5f - f4, 0.5f + f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f + f4 - f2, 0.5f - f4, f2 + 1.0E-4f, 0.5f + f4, 0.5f + f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4, 0.5f - f4, f2, 0.5f + f4, f2 + 0.5f - f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4, 0.5f + f4 - f2, f2, 0.5f + f4, 0.5f + f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        this.f.c();
        this.f.a();
        GL11.glPopMatrix();
    }

    private void c(rk rk2) {
        GL11.glPushMatrix();
        GL11.glRotatef((float)rk2.y, (float)0.0f, (float)1.0f, (float)0.0f);
        this.b.e.a(bqs.b);
        ahz ahz2 = aie.f;
        float f2 = 0.0625f;
        float f3 = 0.75f;
        float f4 = f3 / 2.0f;
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4 + 0.0625f, 0.5f - f4 + 0.0625f, f2 * 0.5f, 0.5f + f4 - 0.0625f, 0.5f + f4 - 0.0625f);
        this.f.a(this.h);
        this.f.a(ahz2, 0, 1.0f);
        this.f.a();
        this.f.c();
        GL11.glPopMatrix();
        this.f.a(aie.f.a(1, 2));
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4, 0.5f - f4, f2 + 1.0E-4f, f2 + 0.5f - f4, 0.5f + f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f + f4 - f2, 0.5f - f4, f2 + 1.0E-4f, 0.5f + f4, 0.5f + f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4, 0.5f - f4, f2, 0.5f + f4, f2 + 0.5f - f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.f.b(0.0, 0.5f - f4, 0.5f + f4 - f2, f2, 0.5f + f4, 0.5f + f4);
        this.f.a(ahz2, 0, 1.0f);
        GL11.glPopMatrix();
        this.f.c();
        this.f.a();
        GL11.glPopMatrix();
    }

    private void d(rk rk2) {
        abu abu2 = rk2.j();
        if (abu2 == null) {
            return;
        }
        wb wb2 = new wb(rk2.o, 0.0, 0.0, 0.0, abu2);
        abs abs2 = wb2.f().b();
        wb2.f().b = 1;
        wb2.c = 0.0f;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(-0.453125f * (float)p.a[rk2.a]), (float)-0.18f, (float)(-0.453125f * (float)p.b[rk2.a]));
        GL11.glRotatef((float)(180.0f + rk2.y), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-90 * rk2.k()), (float)0.0f, (float)0.0f, (float)1.0f);
        switch (rk2.k()) {
            case 1: {
                GL11.glTranslatef((float)-0.16f, (float)-0.16f, (float)0.0f);
                break;
            }
            case 2: {
                GL11.glTranslatef((float)0.0f, (float)-0.32f, (float)0.0f);
                break;
            }
            case 3: {
                GL11.glTranslatef((float)0.16f, (float)-0.16f, (float)0.0f);
            }
        }
        if (abs2 == abv.aY) {
            this.b.e.a(a);
            bna bna2 = bna.a;
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            float f2 = 0.0078125f;
            GL11.glScalef((float)f2, (float)f2, (float)f2);
            switch (rk2.k()) {
                case 0: {
                    GL11.glTranslatef((float)-64.0f, (float)-87.0f, (float)-1.5f);
                    break;
                }
                case 1: {
                    GL11.glTranslatef((float)-66.5f, (float)-84.5f, (float)-1.5f);
                    break;
                }
                case 2: {
                    GL11.glTranslatef((float)-64.0f, (float)-82.0f, (float)-1.5f);
                    break;
                }
                case 3: {
                    GL11.glTranslatef((float)-61.5f, (float)-84.5f, (float)-1.5f);
                }
            }
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
            awz awz2 = abv.aY.a(wb2.f(), rk2.o);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-1.0f);
            if (awz2 != null) {
                this.g.p.i().a(awz2, true);
            }
        } else {
            Object object;
            if (abs2 == abv.aL) {
                object = azi.B().P();
                ((bqy)object).a(bqs.c);
                bqw bqw2 = ((bqs)((bqy)object).b(bqs.c)).b(abv.aL.j(wb2.f()).g());
                if (bqw2 instanceof brf) {
                    brf brf2 = (brf)bqw2;
                    double d2 = brf2.i;
                    double d3 = brf2.j;
                    brf2.i = 0.0;
                    brf2.j = 0.0;
                    brf2.a(rk2.o, rk2.s, rk2.u, oy.g(180 + rk2.a * 90), false, true);
                    brf2.i = d2;
                    brf2.j = d3;
                }
            }
            bor.g = true;
            bog.a.a(wb2, 0.0, 0.0, 0.0, 0.0f, 0.0f);
            bor.g = false;
            if (abs2 == abv.aL && ((bqw)(object = ((bqs)azi.B().P().b(bqs.c)).b(abv.aL.j(wb2.f()).g()))).k() > 0) {
                ((bqw)object).j();
            }
        }
        GL11.glPopMatrix();
    }

    protected void a(rk rk2, double d2, double d3, double d4) {
        if (azi.w() && rk2.j() != null && rk2.j().u() && this.b.i == rk2) {
            float f2;
            float f3 = 1.6f;
            float f4 = 0.016666668f * f3;
            double d5 = rk2.f(this.b.h);
            float f5 = f2 = rk2.am() ? 32.0f : 64.0f;
            if (d5 < (double)(f2 * f2)) {
                String string = rk2.j().s();
                if (rk2.am()) {
                    ban ban2 = this.c();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)((float)d2 + 0.0f), (float)((float)d3 + rk2.N + 0.5f), (float)((float)d4));
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)this.b.k, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glScalef((float)(-f4), (float)(-f4), (float)f4);
                    GL11.glDisable((int)2896);
                    GL11.glTranslatef((float)0.0f, (float)(0.25f / f4), (float)0.0f);
                    GL11.glDepthMask((boolean)false);
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    bna bna2 = bna.a;
                    GL11.glDisable((int)3553);
                    bna2.b();
                    int n2 = ban2.a(string) / 2;
                    bna2.a(0.0f, 0.0f, 0.0f, 0.25f);
                    bna2.a((double)(-n2 - 1), -1.0, 0.0);
                    bna2.a((double)(-n2 - 1), 8.0, 0.0);
                    bna2.a((double)(n2 + 1), 8.0, 0.0);
                    bna2.a((double)(n2 + 1), -1.0, 0.0);
                    bna2.a();
                    GL11.glEnable((int)3553);
                    GL11.glDepthMask((boolean)true);
                    ban2.b(string, -ban2.a(string) / 2, 0, 0x20FFFFFF);
                    GL11.glEnable((int)2896);
                    GL11.glDisable((int)3042);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glPopMatrix();
                } else {
                    this.a((qr)rk2, string, d2, d3, d4, 64);
                }
            }
        }
    }
}

