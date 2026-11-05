/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public class bmz {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public float[] i;
    public int j;

    public bmz(int n2, int n3, boolean bl2) {
        this.e = bl2;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = new float[4];
        this.i[0] = 1.0f;
        this.i[1] = 1.0f;
        this.i[2] = 1.0f;
        this.i[3] = 0.0f;
        this.a(n2, n3);
    }

    public void a(int n2, int n3) {
        if (!bwg.g()) {
            this.c = n2;
            this.d = n3;
            return;
        }
        GL11.glEnable((int)2929);
        if (this.f >= 0) {
            this.a();
        }
        this.b(n2, n3);
        this.b();
        bwg.g(bwg.e, 0);
    }

    public void a() {
        if (!bwg.g()) {
            return;
        }
        this.d();
        this.e();
        if (this.h > -1) {
            bwg.g(this.h);
            this.h = -1;
        }
        if (this.g > -1) {
            brb.a(this.g);
            this.g = -1;
        }
        if (this.f > -1) {
            bwg.g(bwg.e, 0);
            bwg.h(this.f);
            this.f = -1;
        }
    }

    public void b(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.a = n2;
        this.b = n3;
        if (!bwg.g()) {
            this.f();
            return;
        }
        this.f = bwg.e();
        this.g = brb.a();
        if (this.e) {
            this.h = bwg.f();
        }
        this.a(9728);
        GL11.glBindTexture((int)3553, (int)this.g);
        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)this.a, (int)this.b, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
        bwg.g(bwg.e, this.f);
        bwg.a(bwg.e, bwg.g, 3553, this.g, 0);
        if (this.e) {
            bwg.h(bwg.f, this.h);
            bwg.a(bwg.f, 33190, this.a, this.b);
            bwg.b(bwg.e, bwg.h, bwg.f, this.h);
        }
        this.f();
        this.d();
    }

    public void a(int n2) {
        if (bwg.g()) {
            this.j = n2;
            GL11.glBindTexture((int)3553, (int)this.g);
            GL11.glTexParameterf((int)3553, (int)10241, (float)n2);
            GL11.glTexParameterf((int)3553, (int)10240, (float)n2);
            GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
            GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
            GL11.glBindTexture((int)3553, (int)0);
        }
    }

    public void b() {
        int n2 = bwg.i(bwg.e);
        if (n2 == bwg.i) {
            return;
        }
        if (n2 == bwg.j) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
        }
        if (n2 == bwg.k) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
        }
        if (n2 == bwg.l) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
        }
        if (n2 == bwg.m) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
        }
        throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n2);
    }

    public void c() {
        if (bwg.g()) {
            GL11.glBindTexture((int)3553, (int)this.g);
        }
    }

    public void d() {
        if (bwg.g()) {
            GL11.glBindTexture((int)3553, (int)0);
        }
    }

    public void a(boolean bl2) {
        if (bwg.g()) {
            bwg.g(bwg.e, this.f);
            if (bl2) {
                GL11.glViewport((int)0, (int)0, (int)this.c, (int)this.d);
            }
        }
    }

    public void e() {
        if (bwg.g()) {
            bwg.g(bwg.e, 0);
        }
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.i[0] = f2;
        this.i[1] = f3;
        this.i[2] = f4;
        this.i[3] = f5;
    }

    public void c(int n2, int n3) {
        if (!bwg.g()) {
            return;
        }
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)n2, (double)n3, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        GL11.glViewport((int)0, (int)0, (int)n2, (int)n3);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2903);
        this.c();
        float f2 = n2;
        float f3 = n3;
        float f4 = (float)this.c / (float)this.a;
        float f5 = (float)this.d / (float)this.b;
        bna bna2 = bna.a;
        bna2.b();
        bna2.c(-1);
        bna2.a(0.0, f3, 0.0, 0.0, 0.0);
        bna2.a(f2, f3, 0.0, f4, 0.0);
        bna2.a(f2, 0.0, 0.0, f4, f5);
        bna2.a(0.0, 0.0, 0.0, 0.0, f5);
        bna2.a();
        this.d();
        GL11.glDepthMask((boolean)true);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
    }

    public void f() {
        this.a(true);
        GL11.glClearColor((float)this.i[0], (float)this.i[1], (float)this.i[2], (float)this.i[3]);
        int n2 = 16384;
        if (this.e) {
            GL11.glClearDepth((double)1.0);
            n2 |= 0x100;
        }
        GL11.glClear((int)n2);
        this.e();
    }
}

