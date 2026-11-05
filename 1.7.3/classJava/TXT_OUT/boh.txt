/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public abstract class boh {
    private static final brq a = new brq("textures/misc/shadow.png");
    protected bog b;
    protected bmf c = new bmf();
    protected float d;
    protected float e = 1.0f;
    private boolean f = false;

    public abstract void a(qr var1, double var2, double var4, double var6, float var8, float var9);

    protected abstract brq a(qr var1);

    public boolean a() {
        return this.f;
    }

    protected void b(qr qr2) {
        this.a(this.a(qr2));
    }

    protected void a(brq brq2) {
        this.b.e.a(brq2);
    }

    private void a(qr qr2, double d2, double d3, double d4, float f2) {
        GL11.glDisable((int)2896);
        pw pw2 = aie.ab.c(0);
        pw pw3 = aie.ab.c(1);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        float f3 = qr2.M * 1.4f;
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        bna bna2 = bna.a;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = qr2.N / f3;
        float f7 = (float)(qr2.t - qr2.C.b);
        GL11.glRotatef((float)(-this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(-0.3f + (float)((int)f6) * 0.02f));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f8 = 0.0f;
        int n2 = 0;
        bna2.b();
        while (f6 > 0.0f) {
            pw pw4 = n2 % 2 == 0 ? pw2 : pw3;
            this.a(bqs.b);
            float f9 = pw4.c();
            float f10 = pw4.e();
            float f11 = pw4.d();
            float f12 = pw4.f();
            if (n2 / 2 % 2 == 0) {
                float f13 = f11;
                f11 = f9;
                f9 = f13;
            }
            bna2.a(f4 - f5, 0.0f - f7, f8, f11, f12);
            bna2.a(-f4 - f5, 0.0f - f7, f8, f9, f12);
            bna2.a(-f4 - f5, 1.4f - f7, f8, f9, f10);
            bna2.a(f4 - f5, 1.4f - f7, f8, f11, f10);
            f6 -= 0.45f;
            f7 -= 0.45f;
            f4 *= 0.9f;
            f8 += 0.03f;
            ++n2;
        }
        bna2.a();
        GL11.glPopMatrix();
        GL11.glEnable((int)2896);
    }

    private void c(qr qr2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        this.b.e.a(a);
        afs afs2 = this.d();
        GL11.glDepthMask((boolean)false);
        float f4 = this.d;
        if (qr2 instanceof rn) {
            rn rn2 = (rn)qr2;
            f4 *= rn2.bz();
            if (rn2.f()) {
                f4 *= 0.5f;
            }
        }
        double d5 = qr2.S + (qr2.s - qr2.S) * (double)f3;
        double d6 = qr2.T + (qr2.t - qr2.T) * (double)f3 + (double)qr2.X();
        double d7 = qr2.U + (qr2.u - qr2.U) * (double)f3;
        int n2 = oy.c(d5 - (double)f4);
        int n3 = oy.c(d5 + (double)f4);
        int n4 = oy.c(d6 - (double)f4);
        int n5 = oy.c(d6);
        int n6 = oy.c(d7 - (double)f4);
        int n7 = oy.c(d7 + (double)f4);
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        bna bna2 = bna.a;
        bna2.b();
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                for (int i4 = n6; i4 <= n7; ++i4) {
                    ahz ahz2 = afs2.a(i2, i3 - 1, i4);
                    if (ahz2.o() == avk.a || afs2.k(i2, i3, i4) <= 3) continue;
                    this.a(ahz2, d2, d3 + (double)qr2.X(), d4, i2, i3, i4, f2, f4, d8, d9 + (double)qr2.X(), d10);
                }
            }
        }
        bna2.a();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glDepthMask((boolean)true);
    }

    private afs d() {
        return this.b.g;
    }

    private void a(ahz ahz2, double d2, double d3, double d4, int n2, int n3, int n4, float f2, float f3, double d5, double d6, double d7) {
        bna bna2 = bna.a;
        if (!ahz2.d()) {
            return;
        }
        double d8 = ((double)f2 - (d3 - ((double)n3 + d6)) / 2.0) * 0.5 * (double)this.d().n(n2, n3, n4);
        if (d8 < 0.0) {
            return;
        }
        if (d8 > 1.0) {
            d8 = 1.0;
        }
        bna2.a(1.0f, 1.0f, 1.0f, (float)d8);
        double d9 = (double)n2 + ahz2.x() + d5;
        double d10 = (double)n2 + ahz2.y() + d5;
        double d11 = (double)n3 + ahz2.z() + d6 + 0.015625;
        double d12 = (double)n4 + ahz2.B() + d7;
        double d13 = (double)n4 + ahz2.C() + d7;
        float f4 = (float)((d2 - d9) / 2.0 / (double)f3 + 0.5);
        float f5 = (float)((d2 - d10) / 2.0 / (double)f3 + 0.5);
        float f6 = (float)((d4 - d12) / 2.0 / (double)f3 + 0.5);
        float f7 = (float)((d4 - d13) / 2.0 / (double)f3 + 0.5);
        bna2.a(d9, d11, d12, f4, f6);
        bna2.a(d9, d11, d13, f4, f7);
        bna2.a(d10, d11, d13, f5, f7);
        bna2.a(d10, d11, d12, f5, f6);
    }

    public static void a(ayk ayk2, double d2, double d3, double d4) {
        GL11.glDisable((int)3553);
        bna bna2 = bna.a;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bna2.b();
        bna2.b(d2, d3, d4);
        bna2.c(0.0f, 0.0f, -1.0f);
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.c(0.0f, 0.0f, 1.0f);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.c(0.0f, -1.0f, 0.0f);
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.c(0.0f, 1.0f, 0.0f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.c(-1.0f, 0.0f, 0.0f);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.c(1.0f, 0.0f, 0.0f);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.b(0.0, 0.0, 0.0);
        bna2.a();
        GL11.glEnable((int)3553);
    }

    public static void a(ayk ayk2) {
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.a();
    }

    public void a(bog bog2) {
        this.b = bog2;
    }

    public void b(qr qr2, double d2, double d3, double d4, float f2, float f3) {
        double d5;
        float f4;
        if (this.b.l.i && this.d > 0.0f && !qr2.ao() && (f4 = (float)((1.0 - (d5 = this.b.a(qr2.s, qr2.t, qr2.u)) / 256.0) * (double)this.e)) > 0.0f) {
            this.c(qr2, d2, d3, d4, f4, f3);
        }
        if (qr2.az()) {
            this.a(qr2, d2, d3, d4, f3);
        }
    }

    public ban c() {
        return this.b.a();
    }

    public void a(px px2) {
    }

    protected void a(qr qr2, String string, double d2, double d3, double d4, int n2) {
        double d5 = qr2.f(this.b.h);
        if (d5 > (double)(n2 * n2)) {
            return;
        }
        ban ban2 = this.c();
        float f2 = 1.6f;
        float f3 = 0.016666668f * f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2 + 0.0f), (float)((float)d3 + qr2.N + 0.5f), (float)((float)d4));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.b.j), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)this.b.k, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f3), (float)(-f3), (float)f3);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        bna bna2 = bna.a;
        int n3 = 0;
        if (string.equals("deadmau5")) {
            n3 = -10;
        }
        GL11.glDisable((int)3553);
        bna2.b();
        int n4 = ban2.a(string) / 2;
        bna2.a(0.0f, 0.0f, 0.0f, 0.25f);
        bna2.a((double)(-n4 - 1), (double)(-1 + n3), 0.0);
        bna2.a((double)(-n4 - 1), (double)(8 + n3), 0.0);
        bna2.a((double)(n4 + 1), (double)(8 + n3), 0.0);
        bna2.a((double)(n4 + 1), (double)(-1 + n3), 0.0);
        bna2.a();
        GL11.glEnable((int)3553);
        ban2.b(string, -ban2.a(string) / 2, n3, 0x20FFFFFF);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        ban2.b(string, -ban2.a(string) / 2, n3, -1);
        GL11.glEnable((int)2896);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }
}

