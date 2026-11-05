/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public abstract class bpa
extends boh {
    private static final Logger a = LogManager.getLogger();
    private static final brq f = new brq("textures/misc/enchanted_item_glint.png");
    protected bim i;
    protected bim j;

    public bpa(bim bim2, float f2) {
        this.i = bim2;
        this.d = f2;
    }

    public void a(bim bim2) {
        this.j = bim2;
    }

    private float a(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    public void a(rm rm2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        this.i.p = this.d(rm2, f3);
        if (this.j != null) {
            this.j.p = this.i.p;
        }
        this.i.q = rm2.al();
        if (this.j != null) {
            this.j.q = this.i.q;
        }
        this.i.s = rm2.f();
        if (this.j != null) {
            this.j.s = this.i.s;
        }
        try {
            float f4;
            float f5;
            int n2;
            float f6;
            float f7 = this.a(rm2.aN, rm2.aM, f3);
            float f8 = this.a(rm2.aP, rm2.aO, f3);
            if (rm2.al() && rm2.m instanceof rm) {
                rm rm3 = (rm)rm2.m;
                f7 = this.a(rm3.aN, rm3.aM, f3);
                f6 = oy.g(f8 - f7);
                if (f6 < -85.0f) {
                    f6 = -85.0f;
                }
                if (f6 >= 85.0f) {
                    f6 = 85.0f;
                }
                f7 = f8 - f6;
                if (f6 * f6 > 2500.0f) {
                    f7 += f6 * 0.2f;
                }
            }
            float f9 = rm2.B + (rm2.z - rm2.B) * f3;
            this.a(rm2, d2, d3, d4);
            f6 = this.b(rm2, f3);
            this.a(rm2, f6, f7, f3);
            float f10 = 0.0625f;
            GL11.glEnable((int)32826);
            GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
            this.a(rm2, f3);
            GL11.glTranslatef((float)0.0f, (float)(-24.0f * f10 - 0.0078125f), (float)0.0f);
            float f11 = rm2.aE + (rm2.aF - rm2.aE) * f3;
            float f12 = rm2.aG - rm2.aF * (1.0f - f3);
            if (rm2.f()) {
                f12 *= 3.0f;
            }
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            GL11.glEnable((int)3008);
            this.i.a(rm2, f12, f11, f3);
            this.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
            for (int i2 = 0; i2 < 4; ++i2) {
                n2 = this.a(rm2, i2, f3);
                if (n2 <= 0) continue;
                this.j.a(rm2, f12, f11, f3);
                this.j.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
                if ((n2 & 0xF0) == 16) {
                    this.c(rm2, i2, f3);
                    this.j.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
                }
                if ((n2 & 0xF) == 15) {
                    float f13 = (float)rm2.aa + f3;
                    this.a(f);
                    GL11.glEnable((int)3042);
                    f5 = 0.5f;
                    GL11.glColor4f((float)f5, (float)f5, (float)f5, (float)1.0f);
                    GL11.glDepthFunc((int)514);
                    GL11.glDepthMask((boolean)false);
                    for (int i3 = 0; i3 < 2; ++i3) {
                        GL11.glDisable((int)2896);
                        f4 = 0.76f;
                        GL11.glColor4f((float)(0.5f * f4), (float)(0.25f * f4), (float)(0.8f * f4), (float)1.0f);
                        GL11.glBlendFunc((int)768, (int)1);
                        GL11.glMatrixMode((int)5890);
                        GL11.glLoadIdentity();
                        float f14 = f13 * (0.001f + (float)i3 * 0.003f) * 20.0f;
                        float f15 = 0.33333334f;
                        GL11.glScalef((float)f15, (float)f15, (float)f15);
                        GL11.glRotatef((float)(30.0f - (float)i3 * 60.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                        GL11.glTranslatef((float)0.0f, (float)f14, (float)0.0f);
                        GL11.glMatrixMode((int)5888);
                        this.j.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
                    }
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glMatrixMode((int)5890);
                    GL11.glDepthMask((boolean)true);
                    GL11.glLoadIdentity();
                    GL11.glMatrixMode((int)5888);
                    GL11.glEnable((int)2896);
                    GL11.glDisable((int)3042);
                    GL11.glDepthFunc((int)515);
                }
                GL11.glDisable((int)3042);
                GL11.glEnable((int)3008);
            }
            GL11.glDepthMask((boolean)true);
            this.c(rm2, f3);
            float f16 = rm2.d(f3);
            n2 = this.a(rm2, f16, f3);
            bwg.j(bwg.c);
            GL11.glDisable((int)3553);
            bwg.j(bwg.b);
            if ((n2 >> 24 & 0xFF) > 0 || rm2.ax > 0 || rm2.aA > 0) {
                GL11.glDisable((int)3553);
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glDepthFunc((int)514);
                if (rm2.ax > 0 || rm2.aA > 0) {
                    GL11.glColor4f((float)f16, (float)0.0f, (float)0.0f, (float)0.4f);
                    this.i.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
                    for (int i4 = 0; i4 < 4; ++i4) {
                        if (this.b(rm2, i4, f3) < 0) continue;
                        GL11.glColor4f((float)f16, (float)0.0f, (float)0.0f, (float)0.4f);
                        this.j.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
                    }
                }
                if ((n2 >> 24 & 0xFF) > 0) {
                    float f17 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    f5 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f18 = (float)(n2 & 0xFF) / 255.0f;
                    f4 = (float)(n2 >> 24 & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f17, (float)f5, (float)f18, (float)f4);
                    this.i.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
                    for (int i5 = 0; i5 < 4; ++i5) {
                        if (this.b(rm2, i5, f3) < 0) continue;
                        GL11.glColor4f((float)f17, (float)f5, (float)f18, (float)f4);
                        this.j.a(rm2, f12, f11, f6, f8 - f7, f9, f10);
                    }
                }
                GL11.glDepthFunc((int)515);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)3008);
                GL11.glEnable((int)3553);
            }
            GL11.glDisable((int)32826);
        }
        catch (Exception exception) {
            a.error("Couldn't render entity", (Throwable)exception);
        }
        bwg.j(bwg.c);
        GL11.glEnable((int)3553);
        bwg.j(bwg.b);
        GL11.glEnable((int)2884);
        GL11.glPopMatrix();
        this.b(rm2, d2, d3, d4);
    }

    protected void a(rm rm2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.b((qr)rm2);
        if (!rm2.ao()) {
            this.i.a(rm2, f2, f3, f4, f5, f6, f7);
        } else if (!rm2.d(azi.B().h)) {
            GL11.glPushMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.15f);
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glAlphaFunc((int)516, (float)0.003921569f);
            this.i.a(rm2, f2, f3, f4, f5, f6, f7);
            GL11.glDisable((int)3042);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            GL11.glPopMatrix();
            GL11.glDepthMask((boolean)true);
        } else {
            this.i.a(f2, f3, f4, f5, f6, f7, rm2);
        }
    }

    protected void a(rm rm2, double d2, double d3, double d4) {
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
    }

    protected void a(rm rm2, float f2, float f3, float f4) {
        GL11.glRotatef((float)(180.0f - f3), (float)0.0f, (float)1.0f, (float)0.0f);
        if (rm2.aA > 0) {
            float f5 = ((float)rm2.aA + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f5 = oy.c(f5)) > 1.0f) {
                f5 = 1.0f;
            }
            GL11.glRotatef((float)(f5 * this.a(rm2)), (float)0.0f, (float)0.0f, (float)1.0f);
        } else {
            String string = a.a(rm2.b_());
            if (!(!string.equals("Dinnerbone") && !string.equals("Grumm") || rm2 instanceof xq && ((xq)rm2).bS())) {
                GL11.glTranslatef((float)0.0f, (float)(rm2.N + 0.1f), (float)0.0f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        }
    }

    protected float d(rm rm2, float f2) {
        return rm2.k(f2);
    }

    protected float b(rm rm2, float f2) {
        return (float)rm2.aa + f2;
    }

    protected void c(rm rm2, float f2) {
    }

    protected void e(rm rm2, float f2) {
        int n2 = rm2.aY();
        if (n2 > 0) {
            xt xt2 = new xt(rm2.o, rm2.s, rm2.t, rm2.u);
            Random random = new Random(rm2.x());
            azg.a();
            for (int i2 = 0; i2 < n2; ++i2) {
                GL11.glPushMatrix();
                bjs bjs2 = this.i.a(random);
                bjn bjn2 = (bjn)bjs2.l.get(random.nextInt(bjs2.l.size()));
                bjs2.c(0.0625f);
                float f3 = random.nextFloat();
                float f4 = random.nextFloat();
                float f5 = random.nextFloat();
                float f6 = (bjn2.a + (bjn2.d - bjn2.a) * f3) / 16.0f;
                float f7 = (bjn2.b + (bjn2.e - bjn2.b) * f4) / 16.0f;
                float f8 = (bjn2.c + (bjn2.f - bjn2.c) * f5) / 16.0f;
                GL11.glTranslatef((float)f6, (float)f7, (float)f8);
                f3 = f3 * 2.0f - 1.0f;
                f4 = f4 * 2.0f - 1.0f;
                f5 = f5 * 2.0f - 1.0f;
                float f9 = oy.c((f3 *= -1.0f) * f3 + (f5 *= -1.0f) * f5);
                xt2.A = xt2.y = (float)(Math.atan2(f3, f5) * 180.0 / 3.1415927410125732);
                xt2.B = xt2.z = (float)(Math.atan2(f4 *= -1.0f, f9) * 180.0 / 3.1415927410125732);
                double d2 = 0.0;
                double d3 = 0.0;
                double d4 = 0.0;
                float f10 = 0.0f;
                this.b.a(xt2, d2, d3, d4, f10, f2);
                GL11.glPopMatrix();
            }
            azg.b();
        }
    }

    protected int b(rm rm2, int n2, float f2) {
        return this.a(rm2, n2, f2);
    }

    protected int a(rm rm2, int n2, float f2) {
        return -1;
    }

    protected void c(rm rm2, int n2, float f2) {
    }

    protected float a(rm rm2) {
        return 90.0f;
    }

    protected int a(rm rm2, float f2, float f3) {
        return 0;
    }

    protected void a(rm rm2, float f2) {
    }

    protected void b(rm rm2, double d2, double d3, double d4) {
        GL11.glAlphaFunc((int)516, (float)0.1f);
        if (this.b(rm2)) {
            float f2;
            float f3 = 1.6f;
            float f4 = 0.016666668f * f3;
            double d5 = rm2.f(this.b.h);
            float f5 = f2 = rm2.am() ? 32.0f : 64.0f;
            if (d5 < (double)(f2 * f2)) {
                String string = rm2.c_().d();
                if (rm2.am()) {
                    ban ban2 = this.c();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)((float)d2 + 0.0f), (float)((float)d3 + rm2.N + 0.5f), (float)((float)d4));
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)this.b.k, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glScalef((float)(-f4), (float)(-f4), (float)f4);
                    GL11.glDisable((int)2896);
                    GL11.glTranslatef((float)0.0f, (float)(0.25f / f4), (float)0.0f);
                    GL11.glDepthMask((boolean)false);
                    GL11.glEnable((int)3042);
                    bwg.c(770, 771, 1, 0);
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
                    this.a(rm2, d2, d3, d4, string, f4, d5);
                }
            }
        }
    }

    protected boolean b(rm rm2) {
        return azi.w() && rm2 != this.b.h && !rm2.d(azi.B().h) && rm2.l == null;
    }

    protected void a(rm rm2, double d2, double d3, double d4, String string, float f2, double d5) {
        if (rm2.bl()) {
            this.a((qr)rm2, string, d2, d3 - 1.5, d4, 64);
        } else {
            this.a((qr)rm2, string, d2, d3, d4, 64);
        }
    }
}

