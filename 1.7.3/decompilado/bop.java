/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class bop
extends bpd {
    protected bih a;
    protected float f;
    protected bih g;
    protected bih h;
    private static final Map k = Maps.newHashMap();
    private static final String[] l = new String[]{"leather", "chainmail", "iron", "diamond", "gold"};

    public bop(bih bih2, float f2) {
        this(bih2, f2, 1.0f);
    }

    public bop(bih bih2, float f2, float f3) {
        super(bih2, f2);
        this.a = bih2;
        this.f = f3;
        this.d();
    }

    protected void d() {
        this.g = new bih(1.0f);
        this.h = new bih(0.5f);
    }

    public static brq a(zs zs2, int n2) {
        return bop.a(zs2, n2, null);
    }

    public static brq a(zs zs2, int n2, String string) {
        String string2 = String.format("textures/models/armor/%s_layer_%d%s.png", l[zs2.d], n2 == 2 ? 2 : 1, string == null ? "" : String.format("_%s", string));
        brq brq2 = (brq)k.get(string2);
        if (brq2 == null) {
            brq2 = new brq(string2);
            k.put(string2, brq2);
        }
        return brq2;
    }

    protected int a(rn rn2, int n2, float f2) {
        abs abs2;
        abu abu2 = rn2.r(3 - n2);
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

    protected void b(rn rn2, int n2, float f2) {
        abs abs2;
        abu abu2 = rn2.r(3 - n2);
        if (abu2 != null && (abs2 = abu2.b()) instanceof zs) {
            this.a(bop.a((zs)abs2, n2, "overlay"));
            float f3 = 1.0f;
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    @Override
    public void a(rn rn2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        abu abu2 = rn2.bd();
        this.a(rn2, abu2);
        double d5 = d3 - (double)rn2.L;
        if (rn2.am()) {
            d5 -= 0.125;
        }
        super.a(rn2, d2, d5, d4, f2, f3);
        this.a.o = false;
        this.h.o = false;
        this.g.o = false;
        this.a.n = false;
        this.h.n = false;
        this.g.n = false;
        this.a.m = 0;
        this.h.m = 0;
        this.g.m = 0;
    }

    protected brq a(rn rn2) {
        return null;
    }

    protected void a(rn rn2, abu abu2) {
        this.a.m = abu2 != null ? 1 : 0;
        this.h.m = this.a.m;
        this.g.m = this.a.m;
        this.h.n = this.a.n = rn2.am();
        this.g.n = this.a.n;
    }

    protected void a(rn rn2, float f2) {
        float f3;
        abs abs2;
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        super.c(rn2, f2);
        abu abu2 = rn2.bd();
        abu abu3 = rn2.r(3);
        if (abu3 != null) {
            GL11.glPushMatrix();
            this.a.c.c(0.0625f);
            abs2 = abu3.b();
            if (abs2 instanceof zy) {
                if (bmf.a(ahz.a(abs2).b())) {
                    f3 = 0.625f;
                    GL11.glTranslatef((float)0.0f, (float)-0.25f, (float)0.0f);
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glScalef((float)f3, (float)(-f3), (float)(-f3));
                }
                this.b.f.a(rn2, abu3, 0);
            } else if (abs2 == abv.bL) {
                f3 = 1.0625f;
                GL11.glScalef((float)f3, (float)(-f3), (float)(-f3));
                String string = "";
                if (abu3.p() && abu3.q().b("SkullOwner", 8)) {
                    string = abu3.q().j("SkullOwner");
                }
                bnl.b.a(-0.5f, 0.0f, -0.5f, 1, 180.0f, abu3.k(), string);
            }
            GL11.glPopMatrix();
        }
        if (abu2 != null && abu2.b() != null) {
            abs2 = abu2.b();
            GL11.glPushMatrix();
            if (this.i.s) {
                f3 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.625f, (float)0.0f);
                GL11.glRotatef((float)-20.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)f3, (float)f3, (float)f3);
            }
            this.a.f.c(0.0625f);
            GL11.glTranslatef((float)-0.0625f, (float)0.4375f, (float)0.0625f);
            if (abs2 instanceof zy && bmf.a(ahz.a(abs2).b())) {
                f3 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)-0.3125f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(-(f3 *= 0.75f)), (float)(-f3), (float)f3);
            } else if (abs2 == abv.f) {
                f3 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.3125f);
                GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f3, (float)(-f3), (float)f3);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else if (abs2.f()) {
                f3 = 0.625f;
                if (abs2.g()) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.0f);
                }
                this.e();
                GL11.glScalef((float)f3, (float)(-f3), (float)f3);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                f3 = 0.375f;
                GL11.glTranslatef((float)0.25f, (float)0.1875f, (float)-0.1875f);
                GL11.glScalef((float)f3, (float)f3, (float)f3);
                GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (abu2.b().b()) {
                for (int i2 = 0; i2 <= 1; ++i2) {
                    int n2 = abu2.b().a(abu2, i2);
                    float f4 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    float f5 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f6 = (float)(n2 & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f4, (float)f5, (float)f6, (float)1.0f);
                    this.b.f.a(rn2, abu2, i2);
                }
            } else {
                int n3 = abu2.b().a(abu2, 0);
                float f7 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                float f8 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                float f9 = (float)(n3 & 0xFF) / 255.0f;
                GL11.glColor4f((float)f7, (float)f8, (float)f9, (float)1.0f);
                this.b.f.a(rn2, abu2, 0);
            }
            GL11.glPopMatrix();
        }
    }

    protected void e() {
        GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)0.0f);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, int n2, float f2) {
        this.b((rn)rm2, n2, f2);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((rn)rm2, f2);
    }
}

