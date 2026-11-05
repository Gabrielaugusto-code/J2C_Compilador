/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpi
extends bpa {
    private static final brq a = new brq("textures/entity/steve.png");
    private bih f;
    private bih g;
    private bih h;

    public bpi() {
        super(new bih(0.0f), 0.5f);
        this.f = (bih)this.i;
        this.g = new bih(1.0f);
        this.h = new bih(0.5f);
    }

    protected int a(bma bma2, int n2, float f2) {
        abs abs2;
        abu abu2 = bma2.bm.d(3 - n2);
        if (abu2 != null && (abs2 = abu2.b()) instanceof zs) {
            zs zs2 = (zs)abs2;
            this.a(bop.a(zs2, n2));
            bih bih2 = n2 == 2 ? this.h : this.g;
            bih2.c.j = n2 == 0;
            bih2.d.j = n2 == 0;
            bih2.e.j = n2 == 1 || n2 == 2;
            bih2.f.j = n2 == 1;
            bih2.g.j = n2 == 1;
            bih2.h.j = n2 == 2 || n2 == 3;
            bih2.i.j = n2 == 2 || n2 == 3;
            this.a(bih2);
            bih2.p = this.i.p;
            bih2.q = this.i.q;
            bih2.s = this.i.s;
            if (zs2.m_() == zu.a) {
                int n3 = zs2.b(abu2);
                float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                float f5 = (float)(n3 & 0xFF) / 255.0f;
                GL11.glColor3f((float)f3, (float)f4, (float)f5);
                if (abu2.y()) {
                    return 31;
                }
                return 16;
            }
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            if (abu2.y()) {
                return 15;
            }
            return 1;
        }
        return -1;
    }

    protected void b(bma bma2, int n2, float f2) {
        abs abs2;
        abu abu2 = bma2.bm.d(3 - n2);
        if (abu2 != null && (abs2 = abu2.b()) instanceof zs) {
            this.a(bop.a((zs)abs2, n2, "overlay"));
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    public void a(bma bma2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        abu abu2 = bma2.bm.h();
        this.f.m = abu2 != null ? 1 : 0;
        this.h.m = this.f.m;
        this.g.m = this.f.m;
        if (abu2 != null && bma2.bw() > 0) {
            acz acz2 = abu2.o();
            if (acz2 == acz.d) {
                this.f.m = 3;
                this.h.m = 3;
                this.g.m = 3;
            } else if (acz2 == acz.e) {
                this.f.o = true;
                this.h.o = true;
                this.g.o = true;
            }
        }
        this.h.n = this.f.n = bma2.am();
        this.g.n = this.f.n;
        double d5 = d3 - (double)bma2.L;
        if (bma2.am() && !(bma2 instanceof bmd)) {
            d5 -= 0.125;
        }
        super.a(bma2, d2, d5, d4, f2, f3);
        this.f.o = false;
        this.h.o = false;
        this.g.o = false;
        this.f.n = false;
        this.h.n = false;
        this.g.n = false;
        this.f.m = 0;
        this.h.m = 0;
        this.g.m = 0;
    }

    protected brq a(bma bma2) {
        return bma2.t();
    }

    protected void a(bma bma2, float f2) {
        abu abu2;
        float f3;
        boolean bl2;
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        super.c(bma2, f2);
        super.e(bma2, f2);
        abu abu3 = bma2.bm.d(3);
        if (abu3 != null) {
            float f4;
            GL11.glPushMatrix();
            this.f.c.c(0.0625f);
            if (abu3.b() instanceof zy) {
                if (bmf.a(ahz.a(abu3.b()).b())) {
                    f4 = 0.625f;
                    GL11.glTranslatef((float)0.0f, (float)-0.25f, (float)0.0f);
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glScalef((float)f4, (float)(-f4), (float)(-f4));
                }
                this.b.f.a(bma2, abu3, 0);
            } else if (abu3.b() == abv.bL) {
                f4 = 1.0625f;
                GL11.glScalef((float)f4, (float)(-f4), (float)(-f4));
                String string = "";
                if (abu3.p() && abu3.q().b("SkullOwner", 8)) {
                    string = abu3.q().j("SkullOwner");
                }
                bnl.b.a(-0.5f, 0.0f, -0.5f, 1, 180.0f, abu3.k(), string);
            }
            GL11.glPopMatrix();
        }
        if (bma2.b_().equals("deadmau5") && bma2.r().a()) {
            this.a(bma2.t());
            for (int i2 = 0; i2 < 2; ++i2) {
                float f5 = bma2.A + (bma2.y - bma2.A) * f2 - (bma2.aN + (bma2.aM - bma2.aN) * f2);
                float f6 = bma2.B + (bma2.z - bma2.B) * f2;
                GL11.glPushMatrix();
                GL11.glRotatef((float)f5, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)f6, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslatef((float)(0.375f * (float)(i2 * 2 - 1)), (float)0.0f, (float)0.0f);
                GL11.glTranslatef((float)0.0f, (float)-0.375f, (float)0.0f);
                GL11.glRotatef((float)(-f6), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f5), (float)0.0f, (float)1.0f, (float)0.0f);
                float f7 = 1.3333334f;
                GL11.glScalef((float)f7, (float)f7, (float)f7);
                this.f.b(0.0625f);
                GL11.glPopMatrix();
            }
        }
        if ((bl2 = bma2.s().a()) && !bma2.ao() && !bma2.bS()) {
            this.a(bma2.u());
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.125f);
            double d2 = bma2.bu + (bma2.bx - bma2.bu) * (double)f2 - (bma2.p + (bma2.s - bma2.p) * (double)f2);
            double d3 = bma2.bv + (bma2.by - bma2.bv) * (double)f2 - (bma2.q + (bma2.t - bma2.q) * (double)f2);
            double d4 = bma2.bw + (bma2.bz - bma2.bw) * (double)f2 - (bma2.r + (bma2.u - bma2.r) * (double)f2);
            f3 = bma2.aN + (bma2.aM - bma2.aN) * f2;
            double d5 = oy.a(f3 * (float)Math.PI / 180.0f);
            double d6 = -oy.b(f3 * (float)Math.PI / 180.0f);
            float f8 = (float)d3 * 10.0f;
            if (f8 < -6.0f) {
                f8 = -6.0f;
            }
            if (f8 > 32.0f) {
                f8 = 32.0f;
            }
            float f9 = (float)(d2 * d5 + d4 * d6) * 100.0f;
            float f10 = (float)(d2 * d6 - d4 * d5) * 100.0f;
            if (f9 < 0.0f) {
                f9 = 0.0f;
            }
            float f11 = bma2.br + (bma2.bs - bma2.br) * f2;
            f8 += oy.a((bma2.O + (bma2.P - bma2.O) * f2) * 6.0f) * 32.0f * f11;
            if (bma2.am()) {
                f8 += 25.0f;
            }
            GL11.glRotatef((float)(6.0f + f9 / 2.0f + f8), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(f10 / 2.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(-f10 / 2.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.f.c(0.0625f);
            GL11.glPopMatrix();
        }
        if ((abu2 = bma2.bm.h()) != null) {
            float f12;
            GL11.glPushMatrix();
            this.f.f.c(0.0625f);
            GL11.glTranslatef((float)-0.0625f, (float)0.4375f, (float)0.0625f);
            if (bma2.bK != null) {
                abu2 = new abu(abv.y);
            }
            acz acz2 = null;
            if (bma2.bw() > 0) {
                acz2 = abu2.o();
            }
            if (abu2.b() instanceof zy && bmf.a(ahz.a(abu2.b()).b())) {
                f12 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)-0.3125f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(-(f12 *= 0.75f)), (float)(-f12), (float)f12);
            } else if (abu2.b() == abv.f) {
                f12 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.3125f);
                GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f12, (float)(-f12), (float)f12);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else if (abu2.b().f()) {
                f12 = 0.625f;
                if (abu2.b().g()) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.0f);
                }
                if (bma2.bw() > 0 && acz2 == acz.d) {
                    GL11.glTranslatef((float)0.05f, (float)0.0f, (float)-0.1f);
                    GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)0.0f);
                GL11.glScalef((float)f12, (float)(-f12), (float)f12);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                f12 = 0.375f;
                GL11.glTranslatef((float)0.25f, (float)0.1875f, (float)-0.1875f);
                GL11.glScalef((float)f12, (float)f12, (float)f12);
                GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (abu2.b().b()) {
                for (int i3 = 0; i3 <= 1; ++i3) {
                    int n2 = abu2.b().a(abu2, i3);
                    float f13 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    float f14 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    f3 = (float)(n2 & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f13, (float)f14, (float)f3, (float)1.0f);
                    this.b.f.a(bma2, abu2, i3);
                }
            } else {
                int n3 = abu2.b().a(abu2, 0);
                float f15 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                float f16 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                float f17 = (float)(n3 & 0xFF) / 255.0f;
                GL11.glColor4f((float)f15, (float)f16, (float)f17, (float)1.0f);
                this.b.f.a(bma2, abu2, 0);
            }
            GL11.glPopMatrix();
        }
    }

    protected void b(bma bma2, float f2) {
        float f3 = 0.9375f;
        GL11.glScalef((float)f3, (float)f3, (float)f3);
    }

    protected void a(bma bma2, double d2, double d3, double d4, String string, float f2, double d5) {
        ayw ayw2;
        ayr ayr2;
        if (d5 < 100.0 && (ayr2 = (ayw2 = bma2.bT()).a(2)) != null) {
            ayt ayt2 = ayw2.a(bma2.b_(), ayr2);
            if (bma2.bl()) {
                this.a((qr)bma2, ayt2.c() + " " + ayr2.d(), d2, d3 - 1.5, d4, 64);
            } else {
                this.a((qr)bma2, ayt2.c() + " " + ayr2.d(), d2, d3, d4, 64);
            }
            d3 += (double)((float)this.c().a * 1.15f * f2);
        }
        super.a((rm)bma2, d2, d3, d4, string, f2, d5);
    }

    public void a(xq xq2) {
        float f2 = 1.0f;
        GL11.glColor3f((float)f2, (float)f2, (float)f2);
        this.f.p = 0.0f;
        this.f.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, xq2);
        this.f.f.a(0.0625f);
    }

    protected void a(bma bma2, double d2, double d3, double d4) {
        if (bma2.Y() && bma2.bl()) {
            super.a((rm)bma2, d2 + (double)bma2.bC, d3 + (double)bma2.cc, d4 + (double)bma2.bD);
        } else {
            super.a((rm)bma2, d2, d3, d4);
        }
    }

    protected void a(bma bma2, float f2, float f3, float f4) {
        if (bma2.Y() && bma2.bl()) {
            GL11.glRotatef((float)bma2.bJ(), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)this.a((rm)bma2), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)270.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        } else {
            super.a((rm)bma2, f2, f3, f4);
        }
    }

    @Override
    protected /* synthetic */ void a(rm rm2, float f2) {
        this.b((bma)rm2, f2);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, int n2, float f2) {
        this.b((bma)rm2, n2, f2);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((bma)rm2, f2);
    }
}

