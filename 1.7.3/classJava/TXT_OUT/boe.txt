/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class boe
extends bpd {
    private static final brq f = new brq("textures/entity/enderdragon/dragon_exploding.png");
    private static final brq g = new brq("textures/entity/endercrystal/endercrystal_beam.png");
    private static final brq h = new brq("textures/entity/enderdragon/dragon_eyes.png");
    private static final brq k = new brq("textures/entity/enderdragon/dragon.png");
    protected bjl a;

    public boe() {
        super(new bjl(0.0f), 0.5f);
        this.a = (bjl)this.i;
        this.a(this.i);
    }

    protected void a(vr vr2, float f2, float f3, float f4) {
        float f5 = (float)vr2.b(7, f4)[0];
        float f6 = (float)(vr2.b(5, f4)[1] - vr2.b(10, f4)[1]);
        GL11.glRotatef((float)(-f5), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(f6 * 10.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f);
        if (vr2.aA > 0) {
            float f7 = ((float)vr2.aA + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f7 = oy.c(f7)) > 1.0f) {
                f7 = 1.0f;
            }
            GL11.glRotatef((float)(f7 * this.a((rm)vr2)), (float)0.0f, (float)0.0f, (float)1.0f);
        }
    }

    protected void a(vr vr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (vr2.bB > 0) {
            float f8 = (float)vr2.bB / 200.0f;
            GL11.glDepthFunc((int)515);
            GL11.glEnable((int)3008);
            GL11.glAlphaFunc((int)516, (float)f8);
            this.a(f);
            this.i.a(vr2, f2, f3, f4, f5, f6, f7);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            GL11.glDepthFunc((int)514);
        }
        this.b((qr)vr2);
        this.i.a(vr2, f2, f3, f4, f5, f6, f7);
        if (vr2.ax > 0) {
            GL11.glDepthFunc((int)514);
            GL11.glDisable((int)3553);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)0.5f);
            this.i.a(vr2, f2, f3, f4, f5, f6, f7);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            GL11.glDepthFunc((int)515);
        }
    }

    public void a(vr vr2, double d2, double d3, double d4, float f2, float f3) {
        bmg.a(vr2, false);
        super.a(vr2, d2, d3, d4, f2, f3);
        if (vr2.bC != null) {
            float f4 = (float)vr2.bC.a + f3;
            float f5 = oy.a(f4 * 0.2f) / 2.0f + 0.5f;
            f5 = (f5 * f5 + f5) * 0.2f;
            float f6 = (float)(vr2.bC.s - vr2.s - (vr2.p - vr2.s) * (double)(1.0f - f3));
            float f7 = (float)((double)f5 + vr2.bC.t - 1.0 - vr2.t - (vr2.q - vr2.t) * (double)(1.0f - f3));
            float f8 = (float)(vr2.bC.u - vr2.u - (vr2.r - vr2.u) * (double)(1.0f - f3));
            float f9 = oy.c(f6 * f6 + f8 * f8);
            float f10 = oy.c(f6 * f6 + f7 * f7 + f8 * f8);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)d2), (float)((float)d3 + 2.0f), (float)((float)d4));
            GL11.glRotatef((float)((float)(-Math.atan2(f8, f6)) * 180.0f / (float)Math.PI - 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)((float)(-Math.atan2(f9, f7)) * 180.0f / (float)Math.PI - 90.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            bna bna2 = bna.a;
            azg.a();
            GL11.glDisable((int)2884);
            this.a(g);
            GL11.glShadeModel((int)7425);
            float f11 = 0.0f - ((float)vr2.aa + f3) * 0.01f;
            float f12 = oy.c(f6 * f6 + f7 * f7 + f8 * f8) / 32.0f - ((float)vr2.aa + f3) * 0.01f;
            bna2.a(5);
            int n2 = 8;
            for (int i2 = 0; i2 <= n2; ++i2) {
                float f13 = oy.a((float)(i2 % n2) * (float)Math.PI * 2.0f / (float)n2) * 0.75f;
                float f14 = oy.b((float)(i2 % n2) * (float)Math.PI * 2.0f / (float)n2) * 0.75f;
                float f15 = (float)(i2 % n2) * 1.0f / (float)n2;
                bna2.c(0);
                bna2.a(f13 * 0.2f, f14 * 0.2f, 0.0, f15, f12);
                bna2.c(0xFFFFFF);
                bna2.a(f13, f14, f10, f15, f11);
            }
            bna2.a();
            GL11.glEnable((int)2884);
            GL11.glShadeModel((int)7424);
            azg.b();
            GL11.glPopMatrix();
        }
    }

    protected brq a(vr vr2) {
        return k;
    }

    protected void a(vr vr2, float f2) {
        super.c(vr2, f2);
        bna bna2 = bna.a;
        if (vr2.bB > 0) {
            azg.a();
            float f3 = ((float)vr2.bB + f2) / 200.0f;
            float f4 = 0.0f;
            if (f3 > 0.8f) {
                f4 = (f3 - 0.8f) / 0.2f;
            }
            Random random = new Random(432L);
            GL11.glDisable((int)3553);
            GL11.glShadeModel((int)7425);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)1);
            GL11.glDisable((int)3008);
            GL11.glEnable((int)2884);
            GL11.glDepthMask((boolean)false);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.0f);
            int n2 = 0;
            while ((float)n2 < (f3 + f3 * f3) / 2.0f * 60.0f) {
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f + f3 * 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                bna2.a(6);
                float f5 = random.nextFloat() * 20.0f + 5.0f + f4 * 10.0f;
                float f6 = random.nextFloat() * 2.0f + 1.0f + f4 * 2.0f;
                bna2.a(0xFFFFFF, (int)(255.0f * (1.0f - f4)));
                bna2.a(0.0, 0.0, 0.0);
                bna2.a(0xFF00FF, 0);
                bna2.a(-0.866 * (double)f6, (double)f5, (double)(-0.5f * f6));
                bna2.a(0.866 * (double)f6, (double)f5, (double)(-0.5f * f6));
                bna2.a(0.0, (double)f5, (double)(1.0f * f6));
                bna2.a(-0.866 * (double)f6, (double)f5, (double)(-0.5f * f6));
                bna2.a();
                ++n2;
            }
            GL11.glPopMatrix();
            GL11.glDepthMask((boolean)true);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glShadeModel((int)7424);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            azg.b();
        }
    }

    protected int a(vr vr2, int n2, float f2) {
        if (n2 == 1) {
            GL11.glDepthFunc((int)515);
        }
        if (n2 != 0) {
            return -1;
        }
        this.a(h);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)1, (int)1);
        GL11.glDisable((int)2896);
        GL11.glDepthFunc((int)514);
        int n3 = 61680;
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        bwg.a(bwg.c, (float)n4 / 1.0f, (float)n5 / 1.0f);
        GL11.glEnable((int)2896);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return 1;
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((vr)rm2, f2);
    }
}

