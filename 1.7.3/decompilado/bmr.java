/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bmr {
    private static final brq a = new brq("textures/misc/enchanted_item_glint.png");
    private static final brq b = new brq("textures/map/map_background.png");
    private static final brq c = new brq("textures/misc/underwater.png");
    private azi d;
    private abu e;
    private float f;
    private float g;
    private bmf h = new bmf();
    private int i = -1;

    public bmr(azi azi2) {
        this.d = azi2;
    }

    public void a(rm rm2, abu abu2, int n2) {
        GL11.glPushMatrix();
        bqy bqy2 = this.d.P();
        abs abs2 = abu2.b();
        ahz ahz2 = ahz.a(abs2);
        if (abu2 != null && ahz2 != null && ahz2.w() != 0) {
            GL11.glEnable((int)3042);
            GL11.glEnable((int)2884);
            bwg.c(770, 771, 1, 0);
        }
        if (abu2.d() == 0 && abs2 instanceof zy && bmf.a(ahz2.b())) {
            bqy2.a(bqy2.a(0));
            if (abu2 != null && ahz2 != null && ahz2.w() != 0) {
                GL11.glDepthMask((boolean)false);
                this.h.a(ahz2, abu2.k(), 1.0f);
                GL11.glDepthMask((boolean)true);
            } else {
                this.h.a(ahz2, abu2.k(), 1.0f);
            }
        } else {
            pw pw2 = rm2.b(abu2, n2);
            if (pw2 == null) {
                GL11.glPopMatrix();
                return;
            }
            bqy2.a(bqy2.a(abu2.d()));
            brb.a(false, false, 1.0f);
            bna bna2 = bna.a;
            float f2 = pw2.c();
            float f3 = pw2.d();
            float f4 = pw2.e();
            float f5 = pw2.f();
            float f6 = 0.0f;
            float f7 = 0.3f;
            GL11.glEnable((int)32826);
            GL11.glTranslatef((float)(-f6), (float)(-f7), (float)0.0f);
            float f8 = 1.5f;
            GL11.glScalef((float)f8, (float)f8, (float)f8);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)335.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.9375f, (float)-0.0625f, (float)0.0f);
            bmr.a(bna2, f3, f4, f2, f5, pw2.a(), pw2.b(), 0.0625f);
            if (abu2.v() && n2 == 0) {
                GL11.glDepthFunc((int)514);
                GL11.glDisable((int)2896);
                bqy2.a(a);
                GL11.glEnable((int)3042);
                bwg.c(768, 1, 1, 0);
                float f9 = 0.76f;
                GL11.glColor4f((float)(0.5f * f9), (float)(0.25f * f9), (float)(0.8f * f9), (float)1.0f);
                GL11.glMatrixMode((int)5890);
                GL11.glPushMatrix();
                float f10 = 0.125f;
                GL11.glScalef((float)f10, (float)f10, (float)f10);
                float f11 = (float)(azi.K() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef((float)f11, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                bmr.a(bna2, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)f10, (float)f10, (float)f10);
                f11 = (float)(azi.K() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef((float)(-f11), (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                bmr.a(bna2, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glMatrixMode((int)5888);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)2896);
                GL11.glDepthFunc((int)515);
            }
            GL11.glDisable((int)32826);
            bqy2.a(bqy2.a(abu2.d()));
            brb.b();
        }
        if (abu2 != null && ahz2 != null && ahz2.w() != 0) {
            GL11.glDisable((int)3042);
        }
        GL11.glPopMatrix();
    }

    public static void a(bna bna2, float f2, float f3, float f4, float f5, int n2, int n3, float f6) {
        float f7;
        float f8;
        float f9;
        int n4;
        bna2.b();
        bna2.c(0.0f, 0.0f, 1.0f);
        bna2.a(0.0, 0.0, 0.0, f2, f5);
        bna2.a(1.0, 0.0, 0.0, f4, f5);
        bna2.a(1.0, 1.0, 0.0, f4, f3);
        bna2.a(0.0, 1.0, 0.0, f2, f3);
        bna2.a();
        bna2.b();
        bna2.c(0.0f, 0.0f, -1.0f);
        bna2.a(0.0, 1.0, 0.0f - f6, f2, f3);
        bna2.a(1.0, 1.0, 0.0f - f6, f4, f3);
        bna2.a(1.0, 0.0, 0.0f - f6, f4, f5);
        bna2.a(0.0, 0.0, 0.0f - f6, f2, f5);
        bna2.a();
        float f10 = 0.5f * (f2 - f4) / (float)n2;
        float f11 = 0.5f * (f5 - f3) / (float)n3;
        bna2.b();
        bna2.c(-1.0f, 0.0f, 0.0f);
        for (n4 = 0; n4 < n2; ++n4) {
            f9 = (float)n4 / (float)n2;
            f8 = f2 + (f4 - f2) * f9 - f10;
            f7 = f9;
            bna2.a(f7, 0.0, 0.0f - f6, f8, f5);
            bna2.a(f7, 0.0, 0.0, f8, f5);
            bna2.a(f7, 1.0, 0.0, f8, f3);
            bna2.a(f7, 1.0, 0.0f - f6, f8, f3);
        }
        bna2.a();
        bna2.b();
        bna2.c(1.0f, 0.0f, 0.0f);
        for (n4 = 0; n4 < n2; ++n4) {
            f9 = (float)n4 / (float)n2;
            f8 = f2 + (f4 - f2) * f9 - f10;
            f7 = f9 + 1.0f / (float)n2;
            bna2.a(f7, 1.0, 0.0f - f6, f8, f3);
            bna2.a(f7, 1.0, 0.0, f8, f3);
            bna2.a(f7, 0.0, 0.0, f8, f5);
            bna2.a(f7, 0.0, 0.0f - f6, f8, f5);
        }
        bna2.a();
        bna2.b();
        bna2.c(0.0f, 1.0f, 0.0f);
        for (n4 = 0; n4 < n3; ++n4) {
            f9 = (float)n4 / (float)n3;
            f8 = f5 + (f3 - f5) * f9 - f11;
            f7 = f9 + 1.0f / (float)n3;
            bna2.a(0.0, f7, 0.0, f2, f8);
            bna2.a(1.0, f7, 0.0, f4, f8);
            bna2.a(1.0, f7, 0.0f - f6, f4, f8);
            bna2.a(0.0, f7, 0.0f - f6, f2, f8);
        }
        bna2.a();
        bna2.b();
        bna2.c(0.0f, -1.0f, 0.0f);
        for (n4 = 0; n4 < n3; ++n4) {
            f9 = (float)n4 / (float)n3;
            f8 = f5 + (f3 - f5) * f9 - f11;
            f7 = f9;
            bna2.a(1.0, f7, 0.0, f4, f8);
            bna2.a(0.0, f7, 0.0, f2, f8);
            bna2.a(0.0, f7, 0.0f - f6, f2, f8);
            bna2.a(1.0, f7, 0.0f - f6, f4, f8);
        }
        bna2.a();
    }

    public void a(float f2) {
        float f3;
        float f4;
        float f5;
        float f6 = this.g + (this.f - this.g) * f2;
        bkf bkf2 = this.d.h;
        float f7 = bkf2.B + (bkf2.z - bkf2.B) * f2;
        GL11.glPushMatrix();
        GL11.glRotatef((float)f7, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)(bkf2.A + (bkf2.y - bkf2.A) * f2), (float)0.0f, (float)1.0f, (float)0.0f);
        azg.b();
        GL11.glPopMatrix();
        bmd bmd2 = bkf2;
        float f8 = bmd2.bL + (bmd2.h - bmd2.bL) * f2;
        float f9 = bmd2.i + (bmd2.g - bmd2.i) * f2;
        GL11.glRotatef((float)((bkf2.z - f8) * 0.1f), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)((bkf2.y - f9) * 0.1f), (float)0.0f, (float)1.0f, (float)0.0f);
        abu abu2 = this.e;
        if (abu2 != null && abu2.b() instanceof adb) {
            GL11.glEnable((int)3042);
            bwg.c(770, 771, 1, 0);
        }
        int n2 = this.d.f.c(oy.c(bkf2.s), oy.c(bkf2.t), oy.c(bkf2.u), 0);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        bwg.a(bwg.c, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (abu2 != null) {
            int n5 = abu2.b().a(abu2, 0);
            f5 = (float)(n5 >> 16 & 0xFF) / 255.0f;
            f4 = (float)(n5 >> 8 & 0xFF) / 255.0f;
            f3 = (float)(n5 & 0xFF) / 255.0f;
            GL11.glColor4f((float)f5, (float)f4, (float)f3, (float)1.0f);
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        if (abu2 != null && abu2.b() == abv.aY) {
            float f10;
            GL11.glPushMatrix();
            float f11 = 0.8f;
            f5 = bkf2.k(f2);
            f4 = oy.a(f5 * (float)Math.PI);
            f3 = oy.a(oy.c(f5) * (float)Math.PI);
            GL11.glTranslatef((float)(-f3 * 0.4f), (float)(oy.a(oy.c(f5) * (float)Math.PI * 2.0f) * 0.2f), (float)(-f4 * 0.2f));
            f5 = 1.0f - f7 / 45.0f + 0.1f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            f5 = -oy.b(f5 * (float)Math.PI) * 0.5f + 0.5f;
            GL11.glTranslatef((float)0.0f, (float)(0.0f * f11 - (1.0f - f6) * 1.2f - f5 * 0.5f + 0.04f), (float)(-0.9f * f11));
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(f5 * -85.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glEnable((int)32826);
            this.d.P().a(bkf2.t());
            for (int i2 = 0; i2 < 2; ++i2) {
                int n6 = i2 * 2 - 1;
                GL11.glPushMatrix();
                GL11.glTranslatef((float)-0.0f, (float)-0.6f, (float)(1.1f * (float)n6));
                GL11.glRotatef((float)(-45 * n6), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)59.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)(-65 * n6), (float)0.0f, (float)1.0f, (float)0.0f);
                boh boh2 = bog.a.a(this.d.h);
                bpi bpi2 = (bpi)boh2;
                f10 = 1.0f;
                GL11.glScalef((float)f10, (float)f10, (float)f10);
                bpi2.a((xq)this.d.h);
                GL11.glPopMatrix();
            }
            float f12 = bkf2.k(f2);
            f3 = oy.a(f12 * f12 * (float)Math.PI);
            float f13 = oy.a(oy.c(f12) * (float)Math.PI);
            GL11.glRotatef((float)(-f3 * 20.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-f13 * 20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(-f13 * 80.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            float f14 = 0.38f;
            GL11.glScalef((float)f14, (float)f14, (float)f14);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.0f, (float)-1.0f, (float)0.0f);
            f10 = 0.015625f;
            GL11.glScalef((float)f10, (float)f10, (float)f10);
            this.d.P().a(b);
            bna bna2 = bna.a;
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
            bna2.b();
            int n7 = 7;
            bna2.a(0 - n7, 128 + n7, 0.0, 0.0, 1.0);
            bna2.a(128 + n7, 128 + n7, 0.0, 1.0, 1.0);
            bna2.a(128 + n7, 0 - n7, 0.0, 1.0, 0.0);
            bna2.a(0 - n7, 0 - n7, 0.0, 0.0, 0.0);
            bna2.a();
            awz awz2 = abv.aY.a(abu2, this.d.f);
            if (awz2 != null) {
                this.d.p.i().a(awz2, false);
            }
            GL11.glPopMatrix();
        } else if (abu2 != null) {
            float f15;
            float f16;
            float f17;
            float f18;
            GL11.glPushMatrix();
            float f19 = 0.8f;
            if (bkf2.bw() > 0) {
                acz acz2 = abu2.o();
                if (acz2 == acz.b || acz2 == acz.c) {
                    f4 = (float)bkf2.bw() - f2 + 1.0f;
                    f3 = 1.0f - f4 / (float)abu2.n();
                    f18 = 1.0f - f3;
                    f18 = f18 * f18 * f18;
                    f18 = f18 * f18 * f18;
                    f18 = f18 * f18 * f18;
                    float f20 = 1.0f - f18;
                    GL11.glTranslatef((float)0.0f, (float)(oy.e(oy.b(f4 / 4.0f * (float)Math.PI) * 0.1f) * (float)((double)f3 > 0.2 ? 1 : 0)), (float)0.0f);
                    GL11.glTranslatef((float)(f20 * 0.6f), (float)(-f20 * 0.5f), (float)0.0f);
                    GL11.glRotatef((float)(f20 * 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(f20 * 10.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(f20 * 30.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                }
            } else {
                f5 = bkf2.k(f2);
                f4 = oy.a(f5 * (float)Math.PI);
                f3 = oy.a(oy.c(f5) * (float)Math.PI);
                GL11.glTranslatef((float)(-f3 * 0.4f), (float)(oy.a(oy.c(f5) * (float)Math.PI * 2.0f) * 0.2f), (float)(-f4 * 0.2f));
            }
            GL11.glTranslatef((float)(0.7f * f19), (float)(-0.65f * f19 - (1.0f - f6) * 0.6f), (float)(-0.9f * f19));
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glEnable((int)32826);
            float f21 = bkf2.k(f2);
            f4 = oy.a(f21 * f21 * (float)Math.PI);
            f3 = oy.a(oy.c(f21) * (float)Math.PI);
            GL11.glRotatef((float)(-f4 * 20.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-f3 * 20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(-f3 * 80.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            f18 = 0.4f;
            GL11.glScalef((float)f18, (float)f18, (float)f18);
            if (bkf2.bw() > 0) {
                acz acz3 = abu2.o();
                if (acz3 == acz.d) {
                    GL11.glTranslatef((float)-0.5f, (float)0.2f, (float)0.0f);
                    GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                } else if (acz3 == acz.e) {
                    GL11.glRotatef((float)-18.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)-12.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glTranslatef((float)-0.9f, (float)0.2f, (float)0.0f);
                    f17 = (float)abu2.n() - ((float)bkf2.bw() - f2 + 1.0f);
                    f16 = f17 / 20.0f;
                    f16 = (f16 * f16 + f16 * 2.0f) / 3.0f;
                    if (f16 > 1.0f) {
                        f16 = 1.0f;
                    }
                    if (f16 > 0.1f) {
                        GL11.glTranslatef((float)0.0f, (float)(oy.a((f17 - 0.1f) * 1.3f) * 0.01f * (f16 - 0.1f)), (float)0.0f);
                    }
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(f16 * 0.1f));
                    GL11.glRotatef((float)-335.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glTranslatef((float)0.0f, (float)0.5f, (float)0.0f);
                    f15 = 1.0f + f16 * 0.2f;
                    GL11.glScalef((float)1.0f, (float)1.0f, (float)f15);
                    GL11.glTranslatef((float)0.0f, (float)-0.5f, (float)0.0f);
                    GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)335.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
            }
            if (abu2.b().g()) {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (abu2.b().b()) {
                this.a(bkf2, abu2, 0);
                int n8 = abu2.b().a(abu2, 1);
                f17 = (float)(n8 >> 16 & 0xFF) / 255.0f;
                f16 = (float)(n8 >> 8 & 0xFF) / 255.0f;
                f15 = (float)(n8 & 0xFF) / 255.0f;
                GL11.glColor4f((float)(1.0f * f17), (float)(1.0f * f16), (float)(1.0f * f15), (float)1.0f);
                this.a(bkf2, abu2, 1);
            } else {
                this.a(bkf2, abu2, 0);
            }
            GL11.glPopMatrix();
        } else if (!bkf2.ao()) {
            GL11.glPushMatrix();
            float f22 = 0.8f;
            f5 = bkf2.k(f2);
            f4 = oy.a(f5 * (float)Math.PI);
            f3 = oy.a(oy.c(f5) * (float)Math.PI);
            GL11.glTranslatef((float)(-f3 * 0.3f), (float)(oy.a(oy.c(f5) * (float)Math.PI * 2.0f) * 0.4f), (float)(-f4 * 0.4f));
            GL11.glTranslatef((float)(0.8f * f22), (float)(-0.75f * f22 - (1.0f - f6) * 0.6f), (float)(-0.9f * f22));
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glEnable((int)32826);
            f5 = bkf2.k(f2);
            f4 = oy.a(f5 * f5 * (float)Math.PI);
            f3 = oy.a(oy.c(f5) * (float)Math.PI);
            GL11.glRotatef((float)(f3 * 70.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-f4 * 20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            this.d.P().a(bkf2.t());
            GL11.glTranslatef((float)-1.0f, (float)3.6f, (float)3.5f);
            GL11.glRotatef((float)120.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)200.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)5.6f, (float)0.0f, (float)0.0f);
            boh boh3 = bog.a.a(this.d.h);
            bpi bpi3 = (bpi)boh3;
            float f23 = 1.0f;
            GL11.glScalef((float)f23, (float)f23, (float)f23);
            bpi3.a((xq)this.d.h);
            GL11.glPopMatrix();
        }
        if (abu2 != null && abu2.b() instanceof adb) {
            GL11.glDisable((int)3042);
        }
        GL11.glDisable((int)32826);
        azg.a();
    }

    public void b(float f2) {
        GL11.glDisable((int)3008);
        if (this.d.h.ak()) {
            this.d(f2);
        }
        if (this.d.h.Z()) {
            int n2 = oy.c(this.d.h.s);
            int n3 = oy.c(this.d.h.t);
            int n4 = oy.c(this.d.h.u);
            ahz ahz2 = this.d.f.a(n2, n3, n4);
            if (this.d.f.a(n2, n3, n4).r()) {
                this.a(f2, ahz2.h(2));
            } else {
                for (int i2 = 0; i2 < 8; ++i2) {
                    int n5;
                    int n6;
                    float f3 = ((float)((i2 >> 0) % 2) - 0.5f) * this.d.h.M * 0.9f;
                    float f4 = ((float)((i2 >> 1) % 2) - 0.5f) * this.d.h.N * 0.2f;
                    float f5 = ((float)((i2 >> 2) % 2) - 0.5f) * this.d.h.M * 0.9f;
                    int n7 = oy.d((float)n2 + f3);
                    if (!this.d.f.a(n7, n6 = oy.d((float)n3 + f4), n5 = oy.d((float)n4 + f5)).r()) continue;
                    ahz2 = this.d.f.a(n7, n6, n5);
                }
            }
            if (ahz2.o() != avk.a) {
                this.a(f2, ahz2.h(2));
            }
        }
        if (this.d.h.a(avk.h)) {
            this.c(f2);
        }
        GL11.glEnable((int)3008);
    }

    private void a(float f2, pw pw2) {
        this.d.P().a(bqs.b);
        bna bna2 = bna.a;
        float f3 = 0.1f;
        GL11.glColor4f((float)f3, (float)f3, (float)f3, (float)0.5f);
        GL11.glPushMatrix();
        float f4 = -1.0f;
        float f5 = 1.0f;
        float f6 = -1.0f;
        float f7 = 1.0f;
        float f8 = -0.5f;
        float f9 = pw2.c();
        float f10 = pw2.d();
        float f11 = pw2.e();
        float f12 = pw2.f();
        bna2.b();
        bna2.a(f4, f6, f8, f10, f12);
        bna2.a(f5, f6, f8, f9, f12);
        bna2.a(f5, f7, f8, f9, f11);
        bna2.a(f4, f7, f8, f10, f11);
        bna2.a();
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void c(float f2) {
        this.d.P().a(c);
        bna bna2 = bna.a;
        float f3 = this.d.h.d(f2);
        GL11.glColor4f((float)f3, (float)f3, (float)f3, (float)0.5f);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        GL11.glPushMatrix();
        float f4 = 4.0f;
        float f5 = -1.0f;
        float f6 = 1.0f;
        float f7 = -1.0f;
        float f8 = 1.0f;
        float f9 = -0.5f;
        float f10 = -this.d.h.y / 64.0f;
        float f11 = this.d.h.z / 64.0f;
        bna2.b();
        bna2.a(f5, f7, f9, f4 + f10, f4 + f11);
        bna2.a(f6, f7, f9, 0.0f + f10, f4 + f11);
        bna2.a(f6, f8, f9, 0.0f + f10, 0.0f + f11);
        bna2.a(f5, f8, f9, f4 + f10, 0.0f + f11);
        bna2.a();
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
    }

    private void d(float f2) {
        bna bna2 = bna.a;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        float f3 = 1.0f;
        for (int i2 = 0; i2 < 2; ++i2) {
            GL11.glPushMatrix();
            pw pw2 = aie.ab.c(1);
            this.d.P().a(bqs.b);
            float f4 = pw2.c();
            float f5 = pw2.d();
            float f6 = pw2.e();
            float f7 = pw2.f();
            float f8 = (0.0f - f3) / 2.0f;
            float f9 = f8 + f3;
            float f10 = 0.0f - f3 / 2.0f;
            float f11 = f10 + f3;
            float f12 = -0.5f;
            GL11.glTranslatef((float)((float)(-(i2 * 2 - 1)) * 0.24f), (float)-0.3f, (float)0.0f);
            GL11.glRotatef((float)((float)(i2 * 2 - 1) * 10.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            bna2.b();
            bna2.a(f8, f10, f12, f5, f7);
            bna2.a(f9, f10, f12, f4, f7);
            bna2.a(f9, f11, f12, f4, f6);
            bna2.a(f8, f11, f12, f5, f6);
            bna2.a();
            GL11.glPopMatrix();
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
    }

    public void a() {
        float f2;
        float f3;
        float f4;
        boolean bl2;
        this.g = this.f;
        bkf bkf2 = this.d.h;
        abu abu2 = bkf2.bm.h();
        boolean bl3 = bl2 = this.i == bkf2.bm.c && abu2 == this.e;
        if (this.e == null && abu2 == null) {
            bl2 = true;
        }
        if (abu2 != null && this.e != null && abu2 != this.e && abu2.b() == this.e.b() && abu2.k() == this.e.k()) {
            this.e = abu2;
            bl2 = true;
        }
        if ((f4 = (f3 = bl2 ? 1.0f : 0.0f) - this.f) < -(f2 = 0.4f)) {
            f4 = -f2;
        }
        if (f4 > f2) {
            f4 = f2;
        }
        this.f += f4;
        if (this.f < 0.1f) {
            this.e = abu2;
            this.i = bkf2.bm.c;
        }
    }

    public void b() {
        this.f = 0.0f;
    }

    public void c() {
        this.f = 0.0f;
    }
}

