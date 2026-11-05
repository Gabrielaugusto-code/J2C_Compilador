/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bow
extends boh {
    private abs a;
    private int f;

    public bow(abs abs2, int n2) {
        this.a = abs2;
        this.f = n2;
    }

    public bow(abs abs2) {
        this(abs2, 0);
    }

    @Override
    public void a(qr qr2, double d2, double d3, double d4, float f2, float f3) {
        pw pw2 = this.a.b_(this.f);
        if (pw2 == null) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        GL11.glEnable((int)32826);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.b(qr2);
        bna bna2 = bna.a;
        if (pw2 == acg.b("bottle_splash")) {
            int n2 = ade.a(((yf)qr2).k(), false);
            float f4 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f5 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f6 = (float)(n2 & 0xFF) / 255.0f;
            GL11.glColor3f((float)f4, (float)f5, (float)f6);
            GL11.glPushMatrix();
            this.a(bna2, acg.b("overlay"));
            GL11.glPopMatrix();
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        }
        this.a(bna2, pw2);
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    @Override
    protected brq a(qr qr2) {
        return bqs.c;
    }

    private void a(bna bna2, pw pw2) {
        float f2 = pw2.c();
        float f3 = pw2.d();
        float f4 = pw2.e();
        float f5 = pw2.f();
        float f6 = 1.0f;
        float f7 = 0.5f;
        float f8 = 0.25f;
        GL11.glRotatef((float)(180.0f - this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.b.k), (float)1.0f, (float)0.0f, (float)0.0f);
        bna2.b();
        bna2.c(0.0f, 1.0f, 0.0f);
        bna2.a(0.0f - f7, 0.0f - f8, 0.0, f2, f5);
        bna2.a(f6 - f7, 0.0f - f8, 0.0, f3, f5);
        bna2.a(f6 - f7, f6 - f8, 0.0, f3, f4);
        bna2.a(0.0f - f7, f6 - f8, 0.0, f2, f4);
        bna2.a();
    }
}

