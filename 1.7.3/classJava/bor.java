/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bor
extends boh {
    private static final brq h = new brq("textures/misc/enchanted_item_glint.png");
    private bmf i = new bmf();
    private Random j = new Random();
    public boolean a = true;
    public float f;
    public static boolean g;

    public bor() {
        this.d = 0.15f;
        this.e = 0.75f;
    }

    public void a(wb wb2, double d2, double d3, double d4, float f2, float f3) {
        abu abu2 = wb2.f();
        if (abu2.b() == null) {
            return;
        }
        this.b(wb2);
        brb.a(false, false, 1.0f);
        this.j.setSeed(187L);
        GL11.glPushMatrix();
        float f4 = oy.a(((float)wb2.a + f3) / 10.0f + wb2.c) * 0.1f + 0.1f;
        float f5 = (((float)wb2.a + f3) / 20.0f + wb2.c) * 57.295776f;
        int n2 = 1;
        if (wb2.f().b > 1) {
            n2 = 2;
        }
        if (wb2.f().b > 5) {
            n2 = 3;
        }
        if (wb2.f().b > 20) {
            n2 = 4;
        }
        if (wb2.f().b > 40) {
            n2 = 5;
        }
        GL11.glTranslatef((float)((float)d2), (float)((float)d3 + f4), (float)((float)d4));
        GL11.glEnable((int)32826);
        if (abu2.d() == 0 && abu2.b() instanceof zy && bmf.a(ahz.a(abu2.b()).b())) {
            ahz ahz2 = ahz.a(abu2.b());
            GL11.glRotatef((float)f5, (float)0.0f, (float)1.0f, (float)0.0f);
            if (g) {
                GL11.glScalef((float)1.25f, (float)1.25f, (float)1.25f);
                GL11.glTranslatef((float)0.0f, (float)0.05f, (float)0.0f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            float f6 = 0.25f;
            int n3 = ahz2.b();
            if (n3 == 1 || n3 == 19 || n3 == 12 || n3 == 2) {
                f6 = 0.5f;
            }
            if (ahz2.w() > 0) {
                GL11.glAlphaFunc((int)516, (float)0.1f);
                GL11.glEnable((int)3042);
                bwg.c(770, 771, 1, 0);
            }
            GL11.glScalef((float)f6, (float)f6, (float)f6);
            for (int i2 = 0; i2 < n2; ++i2) {
                GL11.glPushMatrix();
                if (i2 > 0) {
                    float f7 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.2f / f6;
                    float f8 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.2f / f6;
                    float f9 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.2f / f6;
                    GL11.glTranslatef((float)f7, (float)f8, (float)f9);
                }
                this.i.a(ahz2, abu2.k(), 1.0f);
                GL11.glPopMatrix();
            }
            if (ahz2.w() > 0) {
                GL11.glDisable((int)3042);
            }
        } else if (abu2.d() == 1 && abu2.b().b()) {
            if (g) {
                GL11.glScalef((float)0.5128205f, (float)0.5128205f, (float)0.5128205f);
                GL11.glTranslatef((float)0.0f, (float)-0.05f, (float)0.0f);
            } else {
                GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
            }
            for (int i3 = 0; i3 <= 1; ++i3) {
                this.j.setSeed(187L);
                pw pw2 = abu2.b().a(abu2.k(), i3);
                if (this.a) {
                    int n4 = abu2.b().a(abu2, i3);
                    float f10 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                    float f11 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                    float f12 = (float)(n4 & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f10, (float)f11, (float)f12, (float)1.0f);
                    this.a(wb2, pw2, n2, f3, f10, f11, f12);
                    continue;
                }
                this.a(wb2, pw2, n2, f3, 1.0f, 1.0f, 1.0f);
            }
        } else {
            if (abu2 != null && abu2.b() instanceof adb) {
                GL11.glAlphaFunc((int)516, (float)0.1f);
                GL11.glEnable((int)3042);
                bwg.c(770, 771, 1, 0);
            }
            if (g) {
                GL11.glScalef((float)0.5128205f, (float)0.5128205f, (float)0.5128205f);
                GL11.glTranslatef((float)0.0f, (float)-0.05f, (float)0.0f);
            } else {
                GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
            }
            pw pw3 = abu2.c();
            if (this.a) {
                int n5 = abu2.b().a(abu2, 0);
                float f13 = (float)(n5 >> 16 & 0xFF) / 255.0f;
                float f14 = (float)(n5 >> 8 & 0xFF) / 255.0f;
                float f15 = (float)(n5 & 0xFF) / 255.0f;
                this.a(wb2, pw3, n2, f3, f13, f14, f15);
            } else {
                this.a(wb2, pw3, n2, f3, 1.0f, 1.0f, 1.0f);
            }
            if (abu2 != null && abu2.b() instanceof adb) {
                GL11.glDisable((int)3042);
            }
        }
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
        this.b(wb2);
        brb.b();
    }

    protected brq a(wb wb2) {
        return this.b.e.a(wb2.f().d());
    }

    private void a(wb wb2, pw pw2, int n2, float f2, float f3, float f4, float f5) {
        bna bna2 = bna.a;
        if (pw2 == null) {
            bqy bqy2 = azi.B().P();
            brq brq2 = bqy2.a(wb2.f().d());
            pw2 = ((bqs)bqy2.b(brq2)).b("missingno");
        }
        float f6 = pw2.c();
        float f7 = pw2.d();
        float f8 = pw2.e();
        float f9 = pw2.f();
        float f10 = 1.0f;
        float f11 = 0.5f;
        float f12 = 0.25f;
        if (this.b.l.i) {
            GL11.glPushMatrix();
            if (g) {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)((((float)wb2.a + f2) / 20.0f + wb2.c) * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            float f13 = 0.0625f;
            float f14 = 0.021875f;
            abu abu2 = wb2.f();
            int n3 = abu2.b;
            n2 = n3 < 2 ? 1 : (n3 < 16 ? 2 : (n3 < 32 ? 3 : 4));
            GL11.glTranslatef((float)(-f11), (float)(-f12), (float)(-((f13 + f14) * (float)n2 / 2.0f)));
            for (int i2 = 0; i2 < n2; ++i2) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(f13 + f14));
                if (abu2.d() == 0) {
                    this.a(bqs.b);
                } else {
                    this.a(bqs.c);
                }
                GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)1.0f);
                bmr.a(bna2, f7, f8, f6, f9, pw2.a(), pw2.b(), f13);
                if (!abu2.v()) continue;
                GL11.glDepthFunc((int)514);
                GL11.glDisable((int)2896);
                this.b.e.a(h);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)768, (int)1);
                float f15 = 0.76f;
                GL11.glColor4f((float)(0.5f * f15), (float)(0.25f * f15), (float)(0.8f * f15), (float)1.0f);
                GL11.glMatrixMode((int)5890);
                GL11.glPushMatrix();
                float f16 = 0.125f;
                GL11.glScalef((float)f16, (float)f16, (float)f16);
                float f17 = (float)(azi.K() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef((float)f17, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                bmr.a(bna2, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f13);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)f16, (float)f16, (float)f16);
                f17 = (float)(azi.K() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef((float)(-f17), (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                bmr.a(bna2, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f13);
                GL11.glPopMatrix();
                GL11.glMatrixMode((int)5888);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)2896);
                GL11.glDepthFunc((int)515);
            }
            GL11.glPopMatrix();
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                GL11.glPushMatrix();
                if (i3 > 0) {
                    float f18 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    float f19 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    float f20 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    GL11.glTranslatef((float)f18, (float)f19, (float)f20);
                }
                if (!g) {
                    GL11.glRotatef((float)(180.0f - this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)1.0f);
                bna2.b();
                bna2.c(0.0f, 1.0f, 0.0f);
                bna2.a(0.0f - f11, 0.0f - f12, 0.0, f6, f9);
                bna2.a(f10 - f11, 0.0f - f12, 0.0, f7, f9);
                bna2.a(f10 - f11, 1.0f - f12, 0.0, f7, f8);
                bna2.a(0.0f - f11, 1.0f - f12, 0.0, f6, f8);
                bna2.a();
                GL11.glPopMatrix();
            }
        }
    }

    public void a(ban ban2, bqy bqy2, abu abu2, int n2, int n3) {
        int n4 = abu2.k();
        pw pw2 = abu2.c();
        if (abu2.d() == 0 && bmf.a(ahz.a(abu2.b()).b())) {
            bqy2.a(bqs.b);
            ahz ahz2 = ahz.a(abu2.b());
            GL11.glEnable((int)3008);
            if (ahz2.w() != 0) {
                GL11.glAlphaFunc((int)516, (float)0.1f);
                GL11.glEnable((int)3042);
                bwg.c(770, 771, 1, 0);
            } else {
                GL11.glAlphaFunc((int)516, (float)0.5f);
                GL11.glDisable((int)3042);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n2 - 2), (float)(n3 + 3), (float)(-3.0f + this.f));
            GL11.glScalef((float)10.0f, (float)10.0f, (float)10.0f);
            GL11.glTranslatef((float)1.0f, (float)0.5f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)-1.0f);
            GL11.glRotatef((float)210.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            int n5 = abu2.b().a(abu2, 0);
            float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n5 & 0xFF) / 255.0f;
            if (this.a) {
                GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)1.0f);
            }
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.i.c = this.a;
            this.i.a(ahz2, n4, 1.0f);
            this.i.c = true;
            if (ahz2.w() == 0) {
                GL11.glAlphaFunc((int)516, (float)0.1f);
            }
            GL11.glPopMatrix();
        } else if (abu2.b().b()) {
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3008);
            bqy2.a(bqs.c);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3553);
            GL11.glEnable((int)3042);
            bwg.c(0, 0, 0, 0);
            GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)true);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            bna bna2 = bna.a;
            bna2.b();
            bna2.c(-1);
            bna2.a((double)(n2 - 2), (double)(n3 + 18), (double)this.f);
            bna2.a((double)(n2 + 18), (double)(n3 + 18), (double)this.f);
            bna2.a((double)(n2 + 18), (double)(n3 - 2), (double)this.f);
            bna2.a((double)(n2 - 2), (double)(n3 - 2), (double)this.f);
            bna2.a();
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            bwg.c(770, 771, 1, 0);
            for (int i2 = 0; i2 <= 1; ++i2) {
                pw pw3 = abu2.b().a(n4, i2);
                int n6 = abu2.b().a(abu2, i2);
                float f5 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f6 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f7 = (float)(n6 & 0xFF) / 255.0f;
                if (this.a) {
                    GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)1.0f);
                }
                this.a(n2, n3, pw3, 16, 16);
            }
            GL11.glEnable((int)2896);
        } else {
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            bwg.c(770, 771, 1, 0);
            brq brq2 = bqy2.a(abu2.d());
            bqy2.a(brq2);
            if (pw2 == null) {
                pw2 = ((bqs)azi.B().P().b(brq2)).b("missingno");
            }
            int n7 = abu2.b().a(abu2, 0);
            float f8 = (float)(n7 >> 16 & 0xFF) / 255.0f;
            float f9 = (float)(n7 >> 8 & 0xFF) / 255.0f;
            float f10 = (float)(n7 & 0xFF) / 255.0f;
            if (this.a) {
                GL11.glColor4f((float)f8, (float)f9, (float)f10, (float)1.0f);
            }
            this.a(n2, n3, pw2, 16, 16);
            GL11.glEnable((int)2896);
            GL11.glDisable((int)3042);
        }
        GL11.glEnable((int)2884);
    }

    public void b(ban ban2, bqy bqy2, abu abu2, int n2, int n3) {
        if (abu2 == null) {
            return;
        }
        this.f += 50.0f;
        try {
            this.a(ban2, bqy2, abu2, n2, n3);
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Rendering item");
            k k2 = b2.a("Item being rendered");
            k2.a("Item Type", new bos(this, abu2));
            k2.a("Item Aux", new bot(this, abu2));
            k2.a("Item NBT", new bou(this, abu2));
            k2.a("Item Foil", new bov(this, abu2));
            throw new s(b2);
        }
        if (abu2.v()) {
            GL11.glDepthFunc((int)514);
            GL11.glDisable((int)2896);
            GL11.glDepthMask((boolean)false);
            bqy2.a(h);
            GL11.glEnable((int)3008);
            GL11.glEnable((int)3042);
            GL11.glColor4f((float)0.5f, (float)0.25f, (float)0.8f, (float)1.0f);
            this.a(n2 * 431278612 + n3 * 32178161, n2 - 2, n3 - 2, 20, 20);
            bwg.c(770, 771, 1, 0);
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)2896);
            GL11.glDepthFunc((int)515);
        }
        this.f -= 50.0f;
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        for (int i2 = 0; i2 < 2; ++i2) {
            bwg.c(772, 1, 0, 0);
            float f2 = 0.00390625f;
            float f3 = 0.00390625f;
            float f4 = (float)(azi.K() % (long)(3000 + i2 * 1873)) / (3000.0f + (float)(i2 * 1873)) * 256.0f;
            float f5 = 0.0f;
            bna bna2 = bna.a;
            float f6 = 4.0f;
            if (i2 == 1) {
                f6 = -1.0f;
            }
            bna2.b();
            bna2.a(n3 + 0, n4 + n6, this.f, (f4 + (float)n6 * f6) * f2, (f5 + (float)n6) * f3);
            bna2.a(n3 + n5, n4 + n6, this.f, (f4 + (float)n5 + (float)n6 * f6) * f2, (f5 + (float)n6) * f3);
            bna2.a(n3 + n5, n4 + 0, this.f, (f4 + (float)n5) * f2, (f5 + 0.0f) * f3);
            bna2.a(n3 + 0, n4 + 0, this.f, (f4 + 0.0f) * f2, (f5 + 0.0f) * f3);
            bna2.a();
        }
    }

    public void c(ban ban2, bqy bqy2, abu abu2, int n2, int n3) {
        this.a(ban2, bqy2, abu2, n2, n3, null);
    }

    public void a(ban ban2, bqy bqy2, abu abu2, int n2, int n3, String string) {
        if (abu2 == null) {
            return;
        }
        if (abu2.b > 1 || string != null) {
            String string2 = string == null ? String.valueOf(abu2.b) : string;
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3042);
            ban2.a(string2, n2 + 19 - 2 - ban2.a(string2), n3 + 6 + 3, 0xFFFFFF);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
        }
        if (abu2.i()) {
            int n4 = (int)Math.round(13.0 - (double)abu2.j() * 13.0 / (double)abu2.l());
            int n5 = (int)Math.round(255.0 - (double)abu2.j() * 255.0 / (double)abu2.l());
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3042);
            bna bna2 = bna.a;
            int n6 = 255 - n5 << 16 | n5 << 8;
            int n7 = (255 - n5) / 4 << 16 | 0x3F00;
            this.a(bna2, n2 + 2, n3 + 13, 13, 2, 0);
            this.a(bna2, n2 + 2, n3 + 13, 12, 1, n7);
            this.a(bna2, n2 + 2, n3 + 13, n4, 1, n6);
            GL11.glEnable((int)3042);
            GL11.glEnable((int)3008);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    private void a(bna bna2, int n2, int n3, int n4, int n5, int n6) {
        bna2.b();
        bna2.c(n6);
        bna2.a((double)(n2 + 0), (double)(n3 + 0), 0.0);
        bna2.a((double)(n2 + 0), (double)(n3 + n5), 0.0);
        bna2.a((double)(n2 + n4), (double)(n3 + n5), 0.0);
        bna2.a((double)(n2 + n4), (double)(n3 + 0), 0.0);
        bna2.a();
    }

    public void a(int n2, int n3, pw pw2, int n4, int n5) {
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(n2 + 0, n3 + n5, this.f, pw2.c(), pw2.f());
        bna2.a(n2 + n4, n3 + n5, this.f, pw2.d(), pw2.f());
        bna2.a(n2 + n4, n3 + 0, this.f, pw2.d(), pw2.e());
        bna2.a(n2 + 0, n3 + 0, this.f, pw2.c(), pw2.e());
        bna2.a();
    }
}

