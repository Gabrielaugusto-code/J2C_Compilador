/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class bmm
implements brs {
    private static final Logger q = LogManager.getLogger();
    private static final brq r = new brq("textures/environment/rain.png");
    private static final brq s = new brq("textures/environment/snow.png");
    public static boolean a;
    public static int b;
    private azi t;
    private float u;
    public final bmr c;
    private final baq v;
    private int w;
    private qr x;
    private pd y = new pd();
    private pd z = new pd();
    private pd A = new pd();
    private pd B = new pd();
    private pd C = new pd();
    private pd D = new pd();
    private float E = 4.0f;
    private float F = 4.0f;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private final bqj T;
    private final int[] U;
    private final brq V;
    private float W;
    private float X;
    private float Y;
    private float Z;
    private float aa;
    private boolean ab;
    private final brr ac;
    public bqc d;
    private static final brq[] ad;
    public static final int e;
    private int ae = e;
    private double af = 1.0;
    private double ag;
    private double ah;
    private long ai = azi.K();
    private long aj;
    private boolean ak;
    float f;
    float g;
    float h;
    float i;
    private Random al = new Random();
    private int am;
    float[] j;
    float[] k;
    FloatBuffer l = azh.h(16);
    float m;
    float n;
    float o;
    private float an;
    private float ao;
    public int p;

    public bmm(azi azi2, brr brr2) {
        this.t = azi2;
        this.ac = brr2;
        this.v = new baq(azi2.P());
        this.c = new bmr(azi2);
        this.T = new bqj(16, 16);
        this.V = azi2.P().a("lightMap", this.T);
        this.U = this.T.d();
        this.d = null;
    }

    public boolean a() {
        return bwg.v && this.d != null;
    }

    public void b() {
        if (this.d != null) {
            this.d.a();
        }
        this.d = null;
        this.ae = e;
    }

    public void c() {
        if (!bwg.v) {
            return;
        }
        if (this.d != null) {
            this.d.a();
        }
        this.ae = (this.ae + 1) % (ad.length + 1);
        if (this.ae != e) {
            try {
                q.info("Selecting effect " + ad[this.ae]);
                this.d = new bqc(this.t.P(), this.ac, this.t.a(), ad[this.ae]);
                this.d.a(this.t.d, this.t.e);
            }
            catch (IOException iOException) {
                q.warn("Failed to load shader: " + ad[this.ae], (Throwable)iOException);
                this.ae = e;
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                q.warn("Failed to load shader: " + ad[this.ae], (Throwable)jsonSyntaxException);
                this.ae = e;
            }
        } else {
            this.d = null;
            q.info("No effect selected");
        }
    }

    @Override
    public void a(brr brr2) {
        if (this.d != null) {
            this.d.a();
        }
        if (this.ae != e) {
            try {
                this.d = new bqc(this.t.P(), brr2, this.t.a(), ad[this.ae]);
                this.d.a(this.t.d, this.t.e);
            }
            catch (IOException iOException) {
                q.warn("Failed to load shader: " + ad[this.ae], (Throwable)iOException);
                this.ae = e;
            }
        }
    }

    public void d() {
        float f2;
        float f3;
        if (bwg.v && bqg.b() == null) {
            bqg.a();
        }
        this.j();
        this.k();
        this.an = this.ao;
        this.F = this.E;
        this.H = this.G;
        this.J = this.I;
        this.Q = this.P;
        this.S = this.R;
        if (this.t.u.aC) {
            f3 = this.t.u.a * 0.6f + 0.2f;
            f2 = f3 * f3 * f3 * 8.0f;
            this.M = this.y.a(this.K, 0.05f * f2);
            this.N = this.z.a(this.L, 0.05f * f2);
            this.O = 0.0f;
            this.K = 0.0f;
            this.L = 0.0f;
        }
        if (this.t.i == null) {
            this.t.i = this.t.h;
        }
        f3 = this.t.f.n(oy.c(this.t.i.s), oy.c(this.t.i.t), oy.c(this.t.i.u));
        f2 = (float)this.t.u.c / 16.0f;
        float f4 = f3 * (1.0f - f2) + f2;
        this.ao += (f4 - this.ao) * 0.1f;
        ++this.w;
        this.c.a();
        this.l();
        this.aa = this.Z;
        if (bmg.d) {
            this.Z += 0.05f;
            if (this.Z > 1.0f) {
                this.Z = 1.0f;
            }
            bmg.d = false;
        } else if (this.Z > 0.0f) {
            this.Z -= 0.0125f;
        }
    }

    public bqc e() {
        return this.d;
    }

    public void a(int n2, int n3) {
        if (!bwg.v) {
            return;
        }
        if (this.d != null) {
            this.d.a(n2, n3);
        }
    }

    public void a(float f2) {
        if (this.t.i == null) {
            return;
        }
        if (this.t.f == null) {
            return;
        }
        this.t.j = null;
        double d2 = this.t.c.d();
        this.t.t = this.t.i.a(d2, f2);
        double d3 = d2;
        ayp ayp2 = this.t.i.l(f2);
        if (this.t.c.i()) {
            d2 = 6.0;
            d3 = 6.0;
        } else {
            if (d3 > 3.0) {
                d3 = 3.0;
            }
            d2 = d3;
        }
        if (this.t.t != null) {
            d3 = this.t.t.f.d(ayp2);
        }
        ayp ayp3 = this.t.i.j(f2);
        ayp ayp4 = ayp2.c(ayp3.c * d2, ayp3.d * d2, ayp3.e * d2);
        this.x = null;
        ayp ayp5 = null;
        float f3 = 1.0f;
        List list = this.t.f.b((qr)this.t.i, this.t.i.C.a(ayp3.c * d2, ayp3.d * d2, ayp3.e * d2).b(f3, f3, f3));
        double d4 = d3;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d5;
            qr qr2 = (qr)list.get(i2);
            if (!qr2.Q()) continue;
            float f4 = qr2.ae();
            ayk ayk2 = qr2.C.b(f4, f4, f4);
            ayn ayn2 = ayk2.a(ayp2, ayp4);
            if (ayk2.a(ayp2)) {
                if (!(0.0 < d4) && d4 != 0.0) continue;
                this.x = qr2;
                ayp5 = ayn2 == null ? ayp2 : ayn2.f;
                d4 = 0.0;
                continue;
            }
            if (ayn2 == null || !((d5 = ayp2.d(ayn2.f)) < d4) && d4 != 0.0) continue;
            if (qr2 == this.t.i.m) {
                if (d4 != 0.0) continue;
                this.x = qr2;
                ayp5 = ayn2.f;
                continue;
            }
            this.x = qr2;
            ayp5 = ayn2.f;
            d4 = d5;
        }
        if (this.x != null && (d4 < d3 || this.t.t == null)) {
            this.t.t = new ayn(this.x, ayp5);
            if (this.x instanceof rm || this.x instanceof rk) {
                this.t.j = this.x;
            }
        }
    }

    private void j() {
        bmd bmd2 = (bmd)this.t.i;
        this.Y = bmd2.v();
        this.X = this.W;
        this.W += (this.Y - this.W) * 0.5f;
        if (this.W > 1.5f) {
            this.W = 1.5f;
        }
        if (this.W < 0.1f) {
            this.W = 0.1f;
        }
    }

    private float a(float f2, boolean bl2) {
        ahz ahz2;
        if (this.p > 0) {
            return 90.0f;
        }
        xq xq2 = (xq)this.t.i;
        float f3 = 70.0f;
        if (bl2) {
            f3 += this.t.u.aG * 40.0f;
            f3 *= this.X + (this.W - this.X) * f2;
        }
        if (xq2.aR() <= 0.0f) {
            float f4 = (float)xq2.aA + f2;
            f3 /= (1.0f - 500.0f / (f4 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((ahz2 = azd.a(this.t.f, xq2, f2)).o() == avk.h) {
            f3 = f3 * 60.0f / 70.0f;
        }
        return f3 + this.Q + (this.P - this.Q) * f2;
    }

    private void f(float f2) {
        float f3;
        rm rm2 = this.t.i;
        float f4 = (float)rm2.ax - f2;
        if (rm2.aR() <= 0.0f) {
            f3 = (float)rm2.aA + f2;
            GL11.glRotatef((float)(40.0f - 8000.0f / (f3 + 200.0f)), (float)0.0f, (float)0.0f, (float)1.0f);
        }
        if (f4 < 0.0f) {
            return;
        }
        f4 /= (float)rm2.ay;
        f4 = oy.a(f4 * f4 * f4 * f4 * (float)Math.PI);
        f3 = rm2.az;
        GL11.glRotatef((float)(-f3), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-f4 * 14.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glRotatef((float)f3, (float)0.0f, (float)1.0f, (float)0.0f);
    }

    private void g(float f2) {
        if (!(this.t.i instanceof xq)) {
            return;
        }
        xq xq2 = (xq)this.t.i;
        float f3 = xq2.P - xq2.O;
        float f4 = -(xq2.P + f3 * f2);
        float f5 = xq2.br + (xq2.bs - xq2.br) * f2;
        float f6 = xq2.aI + (xq2.aJ - xq2.aI) * f2;
        GL11.glTranslatef((float)(oy.a(f4 * (float)Math.PI) * f5 * 0.5f), (float)(-Math.abs(oy.b(f4 * (float)Math.PI) * f5)), (float)0.0f);
        GL11.glRotatef((float)(oy.a(f4 * (float)Math.PI) * f5 * 3.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glRotatef((float)(Math.abs(oy.b(f4 * (float)Math.PI - 0.2f) * f5) * 5.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)f6, (float)1.0f, (float)0.0f, (float)0.0f);
    }

    private void h(float f2) {
        rm rm2 = this.t.i;
        float f3 = rm2.L - 1.62f;
        double d2 = rm2.p + (rm2.s - rm2.p) * (double)f2;
        double d3 = rm2.q + (rm2.t - rm2.q) * (double)f2 - (double)f3;
        double d4 = rm2.r + (rm2.u - rm2.r) * (double)f2;
        GL11.glRotatef((float)(this.S + (this.R - this.S) * f2), (float)0.0f, (float)0.0f, (float)1.0f);
        if (rm2.bl()) {
            f3 = (float)((double)f3 + 1.0);
            GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.0f);
            if (!this.t.u.aD) {
                ahz ahz2 = this.t.f.a(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u));
                if (ahz2 == aie.C) {
                    int n2 = this.t.f.e(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u));
                    int n3 = n2 & 3;
                    GL11.glRotatef((float)(n3 * 90), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glRotatef((float)(rm2.A + (rm2.y - rm2.A) * f2 + 180.0f), (float)0.0f, (float)-1.0f, (float)0.0f);
                GL11.glRotatef((float)(rm2.B + (rm2.z - rm2.B) * f2), (float)-1.0f, (float)0.0f, (float)0.0f);
            }
        } else if (this.t.u.ax > 0) {
            double d5 = this.F + (this.E - this.F) * f2;
            if (this.t.u.aD) {
                float f4 = this.H + (this.G - this.H) * f2;
                float f5 = this.J + (this.I - this.J) * f2;
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)((float)(-d5)));
                GL11.glRotatef((float)f5, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                float f6 = rm2.y;
                float f7 = rm2.z;
                if (this.t.u.ax == 2) {
                    f7 += 180.0f;
                }
                double d6 = (double)(-oy.a(f6 / 180.0f * (float)Math.PI) * oy.b(f7 / 180.0f * (float)Math.PI)) * d5;
                double d7 = (double)(oy.b(f6 / 180.0f * (float)Math.PI) * oy.b(f7 / 180.0f * (float)Math.PI)) * d5;
                double d8 = (double)(-oy.a(f7 / 180.0f * (float)Math.PI)) * d5;
                for (int i2 = 0; i2 < 8; ++i2) {
                    double d9;
                    float f8 = (i2 & 1) * 2 - 1;
                    float f9 = (i2 >> 1 & 1) * 2 - 1;
                    float f10 = (i2 >> 2 & 1) * 2 - 1;
                    ayn ayn2 = this.t.f.a(this.t.f.V().a(d2 + (double)(f8 *= 0.1f), d3 + (double)(f9 *= 0.1f), d4 + (double)(f10 *= 0.1f)), this.t.f.V().a(d2 - d6 + (double)f8 + (double)f10, d3 - d8 + (double)f9, d4 - d7 + (double)f10));
                    if (ayn2 == null || !((d9 = ayn2.f.d(this.t.f.V().a(d2, d3, d4))) < d5)) continue;
                    d5 = d9;
                }
                if (this.t.u.ax == 2) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glRotatef((float)(rm2.z - f7), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(rm2.y - f6), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)((float)(-d5)));
                GL11.glRotatef((float)(f6 - rm2.y), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(f7 - rm2.z), (float)1.0f, (float)0.0f, (float)0.0f);
            }
        } else {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.1f);
        }
        if (!this.t.u.aD) {
            GL11.glRotatef((float)(rm2.B + (rm2.z - rm2.B) * f2), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(rm2.A + (rm2.y - rm2.A) * f2 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        }
        GL11.glTranslatef((float)0.0f, (float)f3, (float)0.0f);
        d2 = rm2.p + (rm2.s - rm2.p) * (double)f2;
        d3 = rm2.q + (rm2.t - rm2.q) * (double)f2 - (double)f3;
        d4 = rm2.r + (rm2.u - rm2.r) * (double)f2;
        this.ab = this.t.g.a(d2, d3, d4, f2);
    }

    private void a(float f2, int n2) {
        int n3;
        float f3;
        this.u = this.t.u.c * 16;
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f4 = 0.07f;
        if (this.t.u.e) {
            GL11.glTranslatef((float)((float)(-(n2 * 2 - 1)) * f4), (float)0.0f, (float)0.0f);
        }
        if (this.af != 1.0) {
            GL11.glTranslatef((float)((float)this.ag), (float)((float)(-this.ah)), (float)0.0f);
            GL11.glScaled((double)this.af, (double)this.af, (double)1.0);
        }
        Project.gluPerspective((float)this.a(f2, true), (float)((float)this.t.d / (float)this.t.e), (float)0.05f, (float)(this.u * 2.0f));
        if (this.t.c.a()) {
            f3 = 0.6666667f;
            GL11.glScalef((float)1.0f, (float)f3, (float)1.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.t.u.e) {
            GL11.glTranslatef((float)((float)(n2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        this.f(f2);
        if (this.t.u.d) {
            this.g(f2);
        }
        if ((f3 = this.t.h.bN + (this.t.h.bM - this.t.h.bN) * f2) > 0.0f) {
            n3 = 20;
            if (this.t.h.a(qm.k)) {
                n3 = 7;
            }
            float f5 = 5.0f / (f3 * f3 + 5.0f) - f3 * 0.04f;
            f5 *= f5;
            GL11.glRotatef((float)(((float)this.w + f2) * (float)n3), (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)(1.0f / f5), (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)(-((float)this.w + f2) * (float)n3), (float)0.0f, (float)1.0f, (float)1.0f);
        }
        this.h(f2);
        if (this.p > 0) {
            n3 = this.p - 1;
            if (n3 == 1) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (n3 == 2) {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (n3 == 3) {
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (n3 == 4) {
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (n3 == 5) {
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
        }
    }

    private void b(float f2, int n2) {
        if (this.p > 0) {
            return;
        }
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f3 = 0.07f;
        if (this.t.u.e) {
            GL11.glTranslatef((float)((float)(-(n2 * 2 - 1)) * f3), (float)0.0f, (float)0.0f);
        }
        if (this.af != 1.0) {
            GL11.glTranslatef((float)((float)this.ag), (float)((float)(-this.ah)), (float)0.0f);
            GL11.glScaled((double)this.af, (double)this.af, (double)1.0);
        }
        Project.gluPerspective((float)this.a(f2, false), (float)((float)this.t.d / (float)this.t.e), (float)0.05f, (float)(this.u * 2.0f));
        if (this.t.c.a()) {
            float f4 = 0.6666667f;
            GL11.glScalef((float)1.0f, (float)f4, (float)1.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.t.u.e) {
            GL11.glTranslatef((float)((float)(n2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        GL11.glPushMatrix();
        this.f(f2);
        if (this.t.u.d) {
            this.g(f2);
        }
        if (!(this.t.u.ax != 0 || this.t.i.bl() || this.t.u.aw || this.t.c.a())) {
            this.b((double)f2);
            this.c.a(f2);
            this.a((double)f2);
        }
        GL11.glPopMatrix();
        if (this.t.u.ax == 0 && !this.t.i.bl()) {
            this.c.b(f2);
            this.f(f2);
        }
        if (this.t.u.d) {
            this.g(f2);
        }
    }

    public void a(double d2) {
        bwg.j(bwg.c);
        GL11.glDisable((int)3553);
        bwg.j(bwg.b);
    }

    public void b(double d2) {
        bwg.j(bwg.c);
        GL11.glMatrixMode((int)5890);
        GL11.glLoadIdentity();
        float f2 = 0.00390625f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        GL11.glTranslatef((float)8.0f, (float)8.0f, (float)8.0f);
        GL11.glMatrixMode((int)5888);
        this.t.P().a(this.V);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        bwg.j(bwg.b);
    }

    private void k() {
        this.g = (float)((double)this.g + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.i = (float)((double)this.i + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.g = (float)((double)this.g * 0.9);
        this.i = (float)((double)this.i * 0.9);
        this.f += (this.g - this.f) * 1.0f;
        this.h += (this.i - this.h) * 1.0f;
        this.ak = true;
    }

    private void i(float f2) {
        bka bka2 = this.t.f;
        if (bka2 == null) {
            return;
        }
        for (int i2 = 0; i2 < 256; ++i2) {
            float f3;
            float f4;
            float f5 = bka2.b(1.0f) * 0.95f + 0.05f;
            float f6 = bka2.t.h[i2 / 16] * f5;
            float f7 = bka2.t.h[i2 % 16] * (this.f * 0.1f + 1.5f);
            if (bka2.q > 0) {
                f6 = bka2.t.h[i2 / 16];
            }
            float f8 = f6 * (bka2.b(1.0f) * 0.65f + 0.35f);
            float f9 = f6 * (bka2.b(1.0f) * 0.65f + 0.35f);
            float f10 = f6;
            float f11 = f7;
            float f12 = f7 * ((f7 * 0.6f + 0.4f) * 0.6f + 0.4f);
            float f13 = f7 * (f7 * f7 * 0.6f + 0.4f);
            float f14 = f8 + f11;
            float f15 = f9 + f12;
            float f16 = f10 + f13;
            f14 = f14 * 0.96f + 0.03f;
            f15 = f15 * 0.96f + 0.03f;
            f16 = f16 * 0.96f + 0.03f;
            if (this.Z > 0.0f) {
                f4 = this.aa + (this.Z - this.aa) * f2;
                f14 = f14 * (1.0f - f4) + f14 * 0.7f * f4;
                f15 = f15 * (1.0f - f4) + f15 * 0.6f * f4;
                f16 = f16 * (1.0f - f4) + f16 * 0.6f * f4;
            }
            if (bka2.t.i == 1) {
                f14 = 0.22f + f11 * 0.75f;
                f15 = 0.28f + f12 * 0.75f;
                f16 = 0.25f + f13 * 0.75f;
            }
            if (this.t.h.a(qm.r)) {
                f4 = this.a(this.t.h, f2);
                f3 = 1.0f / f14;
                if (f3 > 1.0f / f15) {
                    f3 = 1.0f / f15;
                }
                if (f3 > 1.0f / f16) {
                    f3 = 1.0f / f16;
                }
                f14 = f14 * (1.0f - f4) + f14 * f3 * f4;
                f15 = f15 * (1.0f - f4) + f15 * f3 * f4;
                f16 = f16 * (1.0f - f4) + f16 * f3 * f4;
            }
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            f4 = this.t.u.aH;
            f3 = 1.0f - f14;
            float f17 = 1.0f - f15;
            float f18 = 1.0f - f16;
            f3 = 1.0f - f3 * f3 * f3 * f3;
            f17 = 1.0f - f17 * f17 * f17 * f17;
            f18 = 1.0f - f18 * f18 * f18 * f18;
            f14 = f14 * (1.0f - f4) + f3 * f4;
            f15 = f15 * (1.0f - f4) + f17 * f4;
            f16 = f16 * (1.0f - f4) + f18 * f4;
            f14 = f14 * 0.96f + 0.03f;
            f15 = f15 * 0.96f + 0.03f;
            f16 = f16 * 0.96f + 0.03f;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            if (f14 < 0.0f) {
                f14 = 0.0f;
            }
            if (f15 < 0.0f) {
                f15 = 0.0f;
            }
            if (f16 < 0.0f) {
                f16 = 0.0f;
            }
            int n2 = 255;
            int n3 = (int)(f14 * 255.0f);
            int n4 = (int)(f15 * 255.0f);
            int n5 = (int)(f16 * 255.0f);
            this.U[i2] = n2 << 24 | n3 << 16 | n4 << 8 | n5;
        }
        this.T.a();
        this.ak = false;
    }

    private float a(xq xq2, float f2) {
        int n2 = xq2.b(qm.r).b();
        if (n2 > 200) {
            return 1.0f;
        }
        return 0.7f + oy.a(((float)n2 - f2) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public void b(float f2) {
        int n2;
        this.t.z.a("lightTex");
        if (this.ak) {
            this.i(f2);
        }
        this.t.z.b();
        boolean bl2 = Display.isActive();
        if (bl2 || !this.t.u.x || this.t.u.z && Mouse.isButtonDown((int)1)) {
            this.ai = azi.K();
        } else if (azi.K() - this.ai > 500L) {
            this.t.n();
        }
        this.t.z.a("mouse");
        if (this.t.x && bl2) {
            this.t.v.c();
            float f3 = this.t.u.a * 0.6f + 0.2f;
            float f4 = f3 * f3 * f3 * 8.0f;
            float f5 = (float)this.t.v.a * f4;
            float f6 = (float)this.t.v.b * f4;
            n2 = 1;
            if (this.t.u.b) {
                n2 = -1;
            }
            if (this.t.u.aC) {
                this.K += f5;
                this.L += f6;
                float f7 = f2 - this.O;
                this.O = f2;
                f5 = this.M * f7;
                f6 = this.N * f7;
                this.t.h.c(f5, f6 * (float)n2);
            } else {
                this.t.h.c(f5, f6 * (float)n2);
            }
        }
        this.t.z.b();
        if (this.t.s) {
            return;
        }
        a = this.t.u.e;
        bat bat2 = new bat(this.t, this.t.d, this.t.e);
        int n3 = bat2.a();
        int n4 = bat2.b();
        int n5 = Mouse.getX() * n3 / this.t.d;
        n2 = n4 - Mouse.getY() * n4 / this.t.e - 1;
        int n6 = this.t.u.h;
        if (this.t.f != null) {
            this.t.z.a("level");
            if (this.t.i()) {
                this.a(f2, this.aj + (long)(1000000000 / n6));
            } else {
                this.a(f2, 0L);
            }
            if (bwg.v) {
                if (this.d != null) {
                    GL11.glMatrixMode((int)5890);
                    GL11.glPushMatrix();
                    GL11.glLoadIdentity();
                    this.d.a(f2);
                    GL11.glPopMatrix();
                }
                this.t.a().a(true);
            }
            this.aj = System.nanoTime();
            this.t.z.c("gui");
            if (!this.t.u.aw || this.t.n != null) {
                GL11.glAlphaFunc((int)516, (float)0.1f);
                this.t.r.a(f2, this.t.n != null, n5, n2);
            }
            this.t.z.b();
        } else {
            GL11.glViewport((int)0, (int)0, (int)this.t.d, (int)this.t.e);
            GL11.glMatrixMode((int)5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode((int)5888);
            GL11.glLoadIdentity();
            this.g();
            this.aj = System.nanoTime();
        }
        if (this.t.n != null) {
            GL11.glClear((int)256);
            try {
                this.t.n.a(n5, n2, f2);
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Rendering screen");
                k k2 = b2.a("Screen render details");
                k2.a("Screen name", new bmn(this));
                k2.a("Mouse location", new bmo(this, n5, n2));
                k2.a("Screen size", new bmp(this, bat2));
                throw new s(b2);
            }
        }
    }

    public void c(float f2) {
        this.g();
        bat bat2 = new bat(this.t, this.t.d, this.t.e);
        int n2 = bat2.a();
        int n3 = bat2.b();
        this.t.r.a((float)n2, (float)n3);
    }

    public void a(float f2, long l2) {
        this.t.z.a("lightTex");
        if (this.ak) {
            this.i(f2);
        }
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glAlphaFunc((int)516, (float)0.5f);
        if (this.t.i == null) {
            this.t.i = this.t.h;
        }
        this.t.z.c("pick");
        this.a(f2);
        rm rm2 = this.t.i;
        bmt bmt2 = this.t.g;
        blh blh2 = this.t.k;
        double d2 = rm2.S + (rm2.s - rm2.S) * (double)f2;
        double d3 = rm2.T + (rm2.t - rm2.T) * (double)f2;
        double d4 = rm2.U + (rm2.u - rm2.U) * (double)f2;
        this.t.z.c("center");
        for (int i2 = 0; i2 < 2; ++i2) {
            if (this.t.u.e) {
                b = i2;
                if (b == 0) {
                    GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)false);
                } else {
                    GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)false);
                }
            }
            this.t.z.c("clear");
            GL11.glViewport((int)0, (int)0, (int)this.t.d, (int)this.t.e);
            this.j(f2);
            GL11.glClear((int)16640);
            GL11.glEnable((int)2884);
            this.t.z.c("camera");
            this.a(f2, i2);
            azd.a(this.t.h, this.t.u.ax == 2);
            this.t.z.c("frustrum");
            bnp.a();
            if (this.t.u.c >= 4) {
                this.a(-1, f2);
                this.t.z.c("sky");
                bmt2.a(f2);
            }
            GL11.glEnable((int)2912);
            this.a(1, f2);
            if (this.t.u.j != 0) {
                GL11.glShadeModel((int)7425);
            }
            this.t.z.c("culling");
            bnq bnq2 = new bnq();
            bnq2.a(d2, d3, d4);
            this.t.g.a(bnq2, f2);
            if (i2 == 0) {
                long l3;
                this.t.z.c("updatechunks");
                while (!this.t.g.a(rm2, false) && l2 != 0L && (l3 = l2 - System.nanoTime()) >= 0L && l3 <= 1000000000L) {
                }
            }
            if (rm2.t < 128.0) {
                this.a(bmt2, f2);
            }
            this.t.z.c("prepareterrain");
            this.a(0, f2);
            GL11.glEnable((int)2912);
            this.t.P().a(bqs.b);
            azg.a();
            this.t.z.c("terrain");
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            bmt2.a(rm2, 0, (double)f2);
            GL11.glShadeModel((int)7424);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            if (this.p == 0) {
                GL11.glMatrixMode((int)5888);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                azg.b();
                this.t.z.c("entities");
                bmt2.a(rm2, bnq2, f2);
                azg.a();
                this.a((double)f2);
                GL11.glMatrixMode((int)5888);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                if (this.t.t != null && rm2.a(avk.h) && rm2 instanceof xq && !this.t.u.aw) {
                    xq xq2 = (xq)rm2;
                    GL11.glDisable((int)3008);
                    this.t.z.c("outline");
                    bmt2.a(xq2, this.t.t, 0, f2);
                    GL11.glEnable((int)3008);
                }
            }
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            if (this.af == 1.0 && rm2 instanceof xq && !this.t.u.aw && this.t.t != null && !rm2.a(avk.h)) {
                xq xq3 = (xq)rm2;
                GL11.glDisable((int)3008);
                this.t.z.c("outline");
                bmt2.a(xq3, this.t.t, 0, f2);
                GL11.glEnable((int)3008);
            }
            this.t.z.c("destroyProgress");
            GL11.glEnable((int)3042);
            bwg.c(770, 1, 1, 0);
            bmt2.a(bna.a, (xq)rm2, f2);
            GL11.glDisable((int)3042);
            if (this.p == 0) {
                this.b((double)f2);
                this.t.z.c("litParticles");
                blh2.b(rm2, f2);
                azg.a();
                this.a(0, f2);
                this.t.z.c("particles");
                blh2.a(rm2, f2);
                this.a((double)f2);
            }
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)2884);
            this.t.z.c("weather");
            this.e(f2);
            GL11.glDepthMask((boolean)true);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2884);
            bwg.c(770, 771, 1, 0);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            this.a(0, f2);
            GL11.glEnable((int)3042);
            GL11.glDepthMask((boolean)false);
            this.t.P().a(bqs.b);
            if (this.t.u.i) {
                this.t.z.c("water");
                if (this.t.u.j != 0) {
                    GL11.glShadeModel((int)7425);
                }
                GL11.glEnable((int)3042);
                bwg.c(770, 771, 1, 0);
                if (this.t.u.e) {
                    if (b == 0) {
                        GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)true);
                    } else {
                        GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)true);
                    }
                    bmt2.a(rm2, 1, (double)f2);
                } else {
                    bmt2.a(rm2, 1, (double)f2);
                }
                GL11.glDisable((int)3042);
                GL11.glShadeModel((int)7424);
            } else {
                this.t.z.c("water");
                bmt2.a(rm2, 1, (double)f2);
            }
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glDisable((int)2912);
            if (rm2.t >= 128.0) {
                this.t.z.c("aboveClouds");
                this.a(bmt2, f2);
            }
            this.t.z.c("hand");
            if (this.af == 1.0) {
                GL11.glClear((int)256);
                this.b(f2, i2);
            }
            if (this.t.u.e) continue;
            this.t.z.b();
            return;
        }
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        this.t.z.b();
    }

    private void a(bmt bmt2, float f2) {
        if (this.t.u.d()) {
            this.t.z.c("clouds");
            GL11.glPushMatrix();
            this.a(0, f2);
            GL11.glEnable((int)2912);
            bmt2.b(f2);
            GL11.glDisable((int)2912);
            this.a(1, f2);
            GL11.glPopMatrix();
        }
    }

    private void l() {
        float f2 = this.t.f.j(1.0f);
        if (!this.t.u.i) {
            f2 /= 2.0f;
        }
        if (f2 == 0.0f) {
            return;
        }
        this.al.setSeed((long)this.w * 312987231L);
        rm rm2 = this.t.i;
        bka bka2 = this.t.f;
        int n2 = oy.c(rm2.s);
        int n3 = oy.c(rm2.t);
        int n4 = oy.c(rm2.u);
        int n5 = 10;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        int n6 = 0;
        int n7 = (int)(100.0f * f2 * f2);
        if (this.t.u.aK == 1) {
            n7 >>= 1;
        } else if (this.t.u.aK == 2) {
            n7 = 0;
        }
        for (int i2 = 0; i2 < n7; ++i2) {
            int n8 = n2 + this.al.nextInt(n5) - this.al.nextInt(n5);
            int n9 = n4 + this.al.nextInt(n5) - this.al.nextInt(n5);
            int n10 = bka2.h(n8, n9);
            ahz ahz2 = bka2.a(n8, n10 - 1, n9);
            agl agl2 = bka2.a(n8, n9);
            if (n10 > n3 + n5 || n10 < n3 - n5 || !agl2.e() || !(agl2.a(n8, n10, n9) >= 0.15f)) continue;
            float f3 = this.al.nextFloat();
            float f4 = this.al.nextFloat();
            if (ahz2.o() == avk.i) {
                this.t.k.a(new blp(bka2, (float)n8 + f3, (double)((float)n10 + 0.1f) - ahz2.z(), (float)n9 + f4, 0.0, 0.0, 0.0));
                continue;
            }
            if (ahz2.o() == avk.a) continue;
            if (this.al.nextInt(++n6) == 0) {
                d2 = (float)n8 + f3;
                d3 = (double)((float)n10 + 0.1f) - ahz2.z();
                d4 = (float)n9 + f4;
            }
            this.t.k.a(new blz(bka2, (float)n8 + f3, (double)((float)n10 + 0.1f) - ahz2.z(), (float)n9 + f4));
        }
        if (n6 > 0 && this.al.nextInt(3) < this.am++) {
            this.am = 0;
            if (d3 > rm2.t + 1.0 && bka2.h(oy.c(rm2.s), oy.c(rm2.u)) > oy.c(rm2.t)) {
                this.t.f.a(d2, d3, d4, "ambient.weather.rain", 0.1f, 0.5f, false);
            } else {
                this.t.f.a(d2, d3, d4, "ambient.weather.rain", 0.2f, 1.0f, false);
            }
        }
    }

    protected void e(float f2) {
        float f3 = this.t.f.j(f2);
        if (f3 <= 0.0f) {
            return;
        }
        this.b((double)f2);
        if (this.j == null) {
            this.j = new float[1024];
            this.k = new float[1024];
            for (int i2 = 0; i2 < 32; ++i2) {
                for (int i3 = 0; i3 < 32; ++i3) {
                    float f4 = i3 - 16;
                    float f5 = i2 - 16;
                    float f6 = oy.c(f4 * f4 + f5 * f5);
                    this.j[i2 << 5 | i3] = -f5 / f6;
                    this.k[i2 << 5 | i3] = f4 / f6;
                }
            }
        }
        rm rm2 = this.t.i;
        bka bka2 = this.t.f;
        int n2 = oy.c(rm2.s);
        int n3 = oy.c(rm2.t);
        int n4 = oy.c(rm2.u);
        bna bna2 = bna.a;
        GL11.glDisable((int)2884);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        double d2 = rm2.S + (rm2.s - rm2.S) * (double)f2;
        double d3 = rm2.T + (rm2.t - rm2.T) * (double)f2;
        double d4 = rm2.U + (rm2.u - rm2.U) * (double)f2;
        int n5 = oy.c(d3);
        int n6 = 5;
        if (this.t.u.i) {
            n6 = 10;
        }
        boolean bl2 = false;
        int n7 = -1;
        float f7 = (float)this.w + f2;
        if (this.t.u.i) {
            n6 = 10;
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bl2 = false;
        for (int i4 = n4 - n6; i4 <= n4 + n6; ++i4) {
            for (int i5 = n2 - n6; i5 <= n2 + n6; ++i5) {
                double d5;
                float f8;
                int n8 = (i4 - n4 + 16) * 32 + (i5 - n2 + 16);
                float f9 = this.j[n8] * 0.5f;
                float f10 = this.k[n8] * 0.5f;
                agl agl2 = bka2.a(i5, i4);
                if (!agl2.e() && !agl2.d()) continue;
                int n9 = bka2.h(i5, i4);
                int n10 = n3 - n6;
                int n11 = n3 + n6;
                if (n10 < n9) {
                    n10 = n9;
                }
                if (n11 < n9) {
                    n11 = n9;
                }
                float f11 = 1.0f;
                int n12 = n9;
                if (n12 < n5) {
                    n12 = n5;
                }
                if (n10 == n11) continue;
                this.al.setSeed(i5 * i5 * 3121 + i5 * 45238971 ^ i4 * i4 * 418711 + i4 * 13761);
                float f12 = agl2.a(i5, n10, i4);
                if (bka2.v().a(f12, n9) >= 0.15f) {
                    if (n7 != 0) {
                        if (n7 >= 0) {
                            bna2.a();
                        }
                        n7 = 0;
                        this.t.P().a(r);
                        bna2.b();
                    }
                    f8 = ((float)(this.w + i5 * i5 * 3121 + i5 * 45238971 + i4 * i4 * 418711 + i4 * 13761 & 0x1F) + f2) / 32.0f * (3.0f + this.al.nextFloat());
                    double d6 = (double)((float)i5 + 0.5f) - rm2.s;
                    d5 = (double)((float)i4 + 0.5f) - rm2.u;
                    float f13 = oy.a(d6 * d6 + d5 * d5) / (float)n6;
                    float f14 = 1.0f;
                    bna2.b(bka2.c(i5, n12, i4, 0));
                    bna2.a(f14, f14, f14, ((1.0f - f13 * f13) * 0.5f + 0.5f) * f3);
                    bna2.b(-d2 * 1.0, -d3 * 1.0, -d4 * 1.0);
                    bna2.a((double)((float)i5 - f9) + 0.5, n10, (double)((float)i4 - f10) + 0.5, 0.0f * f11, (float)n10 * f11 / 4.0f + f8 * f11);
                    bna2.a((double)((float)i5 + f9) + 0.5, n10, (double)((float)i4 + f10) + 0.5, 1.0f * f11, (float)n10 * f11 / 4.0f + f8 * f11);
                    bna2.a((double)((float)i5 + f9) + 0.5, n11, (double)((float)i4 + f10) + 0.5, 1.0f * f11, (float)n11 * f11 / 4.0f + f8 * f11);
                    bna2.a((double)((float)i5 - f9) + 0.5, n11, (double)((float)i4 - f10) + 0.5, 0.0f * f11, (float)n11 * f11 / 4.0f + f8 * f11);
                    bna2.b(0.0, 0.0, 0.0);
                    continue;
                }
                if (n7 != 1) {
                    if (n7 >= 0) {
                        bna2.a();
                    }
                    n7 = 1;
                    this.t.P().a(s);
                    bna2.b();
                }
                f8 = ((float)(this.w & 0x1FF) + f2) / 512.0f;
                float f15 = this.al.nextFloat() + f7 * 0.01f * (float)this.al.nextGaussian();
                float f16 = this.al.nextFloat() + f7 * (float)this.al.nextGaussian() * 0.001f;
                d5 = (double)((float)i5 + 0.5f) - rm2.s;
                double d7 = (double)((float)i4 + 0.5f) - rm2.u;
                float f17 = oy.a(d5 * d5 + d7 * d7) / (float)n6;
                float f18 = 1.0f;
                bna2.b((bka2.c(i5, n12, i4, 0) * 3 + 0xF000F0) / 4);
                bna2.a(f18, f18, f18, ((1.0f - f17 * f17) * 0.3f + 0.5f) * f3);
                bna2.b(-d2 * 1.0, -d3 * 1.0, -d4 * 1.0);
                bna2.a((double)((float)i5 - f9) + 0.5, n10, (double)((float)i4 - f10) + 0.5, 0.0f * f11 + f15, (float)n10 * f11 / 4.0f + f8 * f11 + f16);
                bna2.a((double)((float)i5 + f9) + 0.5, n10, (double)((float)i4 + f10) + 0.5, 1.0f * f11 + f15, (float)n10 * f11 / 4.0f + f8 * f11 + f16);
                bna2.a((double)((float)i5 + f9) + 0.5, n11, (double)((float)i4 + f10) + 0.5, 1.0f * f11 + f15, (float)n11 * f11 / 4.0f + f8 * f11 + f16);
                bna2.a((double)((float)i5 - f9) + 0.5, n11, (double)((float)i4 - f10) + 0.5, 0.0f * f11 + f15, (float)n11 * f11 / 4.0f + f8 * f11 + f16);
                bna2.b(0.0, 0.0, 0.0);
            }
        }
        if (n7 >= 0) {
            bna2.a();
        }
        GL11.glEnable((int)2884);
        GL11.glDisable((int)3042);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        this.a((double)f2);
    }

    public void g() {
        bat bat2 = new bat(this.t, this.t.d, this.t.e);
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)bat2.c(), (double)bat2.d(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    private void j(float f2) {
        float f3;
        Object object;
        float f4;
        bka bka2 = this.t.f;
        rm rm2 = this.t.i;
        float f5 = 0.25f + 0.75f * (float)this.t.u.c / 16.0f;
        f5 = 1.0f - (float)Math.pow(f5, 0.25);
        ayp ayp2 = bka2.a((qr)this.t.i, f2);
        float f6 = (float)ayp2.c;
        float f7 = (float)ayp2.d;
        float f8 = (float)ayp2.e;
        ayp ayp3 = bka2.f(f2);
        this.m = (float)ayp3.c;
        this.n = (float)ayp3.d;
        this.o = (float)ayp3.e;
        if (this.t.u.c >= 4) {
            ayp ayp4 = oy.a(bka2.d(f2)) > 0.0f ? bka2.V().a(-1.0, 0.0, 0.0) : bka2.V().a(1.0, 0.0, 0.0);
            f4 = (float)rm2.j(f2).b(ayp4);
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 0.0f && (object = bka2.t.a(bka2.c(f2), f2)) != null) {
                this.m = this.m * (1.0f - (f4 *= object[3])) + object[0] * f4;
                this.n = this.n * (1.0f - f4) + object[1] * f4;
                this.o = this.o * (1.0f - f4) + object[2] * f4;
            }
        }
        this.m += (f6 - this.m) * f5;
        this.n += (f7 - this.n) * f5;
        this.o += (f8 - this.o) * f5;
        float f9 = bka2.j(f2);
        if (f9 > 0.0f) {
            f4 = 1.0f - f9 * 0.5f;
            float f10 = 1.0f - f9 * 0.4f;
            this.m *= f4;
            this.n *= f4;
            this.o *= f10;
        }
        if ((f4 = bka2.h(f2)) > 0.0f) {
            float f11 = 1.0f - f4 * 0.5f;
            this.m *= f11;
            this.n *= f11;
            this.o *= f11;
        }
        object = azd.a(this.t.f, rm2, f2);
        if (this.ab) {
            ayp ayp5 = bka2.e(f2);
            this.m = (float)ayp5.c;
            this.n = (float)ayp5.d;
            this.o = (float)ayp5.e;
        } else if (((ahz)object).o() == avk.h) {
            float f12 = (float)aem.b(rm2) * 0.2f;
            this.m = 0.02f + f12;
            this.n = 0.02f + f12;
            this.o = 0.2f + f12;
        } else if (((ahz)object).o() == avk.i) {
            this.m = 0.6f;
            this.n = 0.1f;
            this.o = 0.0f;
        }
        float f13 = this.an + (this.ao - this.an) * f2;
        this.m *= f13;
        this.n *= f13;
        this.o *= f13;
        double d2 = (rm2.T + (rm2.t - rm2.T) * (double)f2) * bka2.t.k();
        if (rm2.a(qm.q)) {
            int n2 = rm2.b(qm.q).b();
            d2 = n2 < 20 ? (d2 *= (double)(1.0f - (float)n2 / 20.0f)) : 0.0;
        }
        if (d2 < 1.0) {
            if (d2 < 0.0) {
                d2 = 0.0;
            }
            d2 *= d2;
            this.m = (float)((double)this.m * d2);
            this.n = (float)((double)this.n * d2);
            this.o = (float)((double)this.o * d2);
        }
        if (this.Z > 0.0f) {
            float f14 = this.aa + (this.Z - this.aa) * f2;
            this.m = this.m * (1.0f - f14) + this.m * 0.7f * f14;
            this.n = this.n * (1.0f - f14) + this.n * 0.6f * f14;
            this.o = this.o * (1.0f - f14) + this.o * 0.6f * f14;
        }
        if (rm2.a(qm.r)) {
            float f15 = this.a(this.t.h, f2);
            f3 = 1.0f / this.m;
            if (f3 > 1.0f / this.n) {
                f3 = 1.0f / this.n;
            }
            if (f3 > 1.0f / this.o) {
                f3 = 1.0f / this.o;
            }
            this.m = this.m * (1.0f - f15) + this.m * f3 * f15;
            this.n = this.n * (1.0f - f15) + this.n * f3 * f15;
            this.o = this.o * (1.0f - f15) + this.o * f3 * f15;
        }
        if (this.t.u.e) {
            float f16 = (this.m * 30.0f + this.n * 59.0f + this.o * 11.0f) / 100.0f;
            f3 = (this.m * 30.0f + this.n * 70.0f) / 100.0f;
            float f17 = (this.m * 30.0f + this.o * 70.0f) / 100.0f;
            this.m = f16;
            this.n = f3;
            this.o = f17;
        }
        GL11.glClearColor((float)this.m, (float)this.n, (float)this.o, (float)0.0f);
    }

    private void a(int n2, float f2) {
        rm rm2 = this.t.i;
        boolean bl2 = false;
        if (rm2 instanceof xq) {
            bl2 = ((xq)rm2).bE.d;
        }
        if (n2 == 999) {
            GL11.glFog((int)2918, (FloatBuffer)this.a(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.glFogi((int)2917, (int)9729);
            GL11.glFogf((int)2915, (float)0.0f);
            GL11.glFogf((int)2916, (float)8.0f);
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi((int)34138, (int)34139);
            }
            GL11.glFogf((int)2915, (float)0.0f);
            return;
        }
        GL11.glFog((int)2918, (FloatBuffer)this.a(this.m, this.n, this.o, 1.0f));
        GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ahz ahz2 = azd.a(this.t.f, rm2, f2);
        if (rm2.a(qm.q)) {
            float f3 = 5.0f;
            int n3 = rm2.b(qm.q).b();
            if (n3 < 20) {
                f3 = 5.0f + (this.u - 5.0f) * (1.0f - (float)n3 / 20.0f);
            }
            GL11.glFogi((int)2917, (int)9729);
            if (n2 < 0) {
                GL11.glFogf((int)2915, (float)0.0f);
                GL11.glFogf((int)2916, (float)(f3 * 0.8f));
            } else {
                GL11.glFogf((int)2915, (float)(f3 * 0.25f));
                GL11.glFogf((int)2916, (float)f3);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi((int)34138, (int)34139);
            }
        } else if (this.ab) {
            GL11.glFogi((int)2917, (int)2048);
            GL11.glFogf((int)2914, (float)0.1f);
        } else if (ahz2.o() == avk.h) {
            GL11.glFogi((int)2917, (int)2048);
            if (rm2.a(qm.o)) {
                GL11.glFogf((int)2914, (float)0.05f);
            } else {
                GL11.glFogf((int)2914, (float)(0.1f - (float)aem.b(rm2) * 0.03f));
            }
        } else if (ahz2.o() == avk.i) {
            GL11.glFogi((int)2917, (int)2048);
            GL11.glFogf((int)2914, (float)2.0f);
        } else {
            double d2;
            float f4 = this.u;
            if (this.t.f.t.j() && !bl2 && (d2 = (double)((rm2.c(f2) & 0xF00000) >> 20) / 16.0 + (rm2.T + (rm2.t - rm2.T) * (double)f2 + 4.0) / 32.0) < 1.0) {
                float f5;
                if (d2 < 0.0) {
                    d2 = 0.0;
                }
                if ((f5 = 100.0f * (float)(d2 *= d2)) < 5.0f) {
                    f5 = 5.0f;
                }
                if (f4 > f5) {
                    f4 = f5;
                }
            }
            GL11.glFogi((int)2917, (int)9729);
            if (n2 < 0) {
                GL11.glFogf((int)2915, (float)0.0f);
                GL11.glFogf((int)2916, (float)f4);
            } else {
                GL11.glFogf((int)2915, (float)(f4 * 0.75f));
                GL11.glFogf((int)2916, (float)f4);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi((int)34138, (int)34139);
            }
            if (this.t.f.t.b((int)rm2.s, (int)rm2.u)) {
                GL11.glFogf((int)2915, (float)(f4 * 0.05f));
                GL11.glFogf((int)2916, (float)(Math.min(f4, 192.0f) * 0.5f));
            }
        }
        GL11.glEnable((int)2903);
        GL11.glColorMaterial((int)1028, (int)4608);
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.l.clear();
        this.l.put(f2).put(f3).put(f4).put(f5);
        this.l.flip();
        return this.l;
    }

    public baq i() {
        return this.v;
    }

    static /* synthetic */ azi a(bmm bmm2) {
        return bmm2.t;
    }

    static {
        ad = new brq[]{new brq("shaders/post/notch.json"), new brq("shaders/post/fxaa.json"), new brq("shaders/post/art.json"), new brq("shaders/post/bumpy.json"), new brq("shaders/post/blobs2.json"), new brq("shaders/post/pencil.json"), new brq("shaders/post/color_convolve.json"), new brq("shaders/post/deconverge.json"), new brq("shaders/post/flip.json"), new brq("shaders/post/invert.json"), new brq("shaders/post/ntsc.json"), new brq("shaders/post/outline.json"), new brq("shaders/post/phosphor.json"), new brq("shaders/post/scan_pincushion.json"), new brq("shaders/post/sobel.json"), new brq("shaders/post/bits.json"), new brq("shaders/post/desaturate.json"), new brq("shaders/post/green.json"), new brq("shaders/post/blur.json"), new brq("shaders/post/wobble.json"), new brq("shaders/post/blobs.json"), new brq("shaders/post/antialias.json")};
        e = ad.length;
    }
}

