/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpu
extends bpd {
    private static final brq a = new brq("textures/entity/witch.png");
    private final bjh f;

    public bpu() {
        super(new bjh(0.0f), 0.5f);
        this.f = (bjh)this.i;
    }

    public void a(xg xg2, double d2, double d3, double d4, float f2, float f3) {
        abu abu2 = xg2.bd();
        this.f.g = abu2 != null;
        super.a(xg2, d2, d3, d4, f2, f3);
    }

    protected brq a(xg xg2) {
        return a;
    }

    protected void a(xg xg2, float f2) {
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        super.c(xg2, f2);
        abu abu2 = xg2.bd();
        if (abu2 != null) {
            float f3;
            GL11.glPushMatrix();
            if (this.i.s) {
                f3 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.625f, (float)0.0f);
                GL11.glRotatef((float)-20.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)f3, (float)f3, (float)f3);
            }
            this.f.f.c(0.0625f);
            GL11.glTranslatef((float)-0.0625f, (float)0.53125f, (float)0.21875f);
            if (abu2.b() instanceof zy && bmf.a(ahz.a(abu2.b()).b())) {
                f3 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)-0.3125f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(f3 *= 0.75f), (float)(-f3), (float)f3);
            } else if (abu2.b() == abv.f) {
                f3 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.3125f);
                GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f3, (float)(-f3), (float)f3);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else if (abu2.b().f()) {
                f3 = 0.625f;
                if (abu2.b().g()) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.0f);
                }
                this.d();
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
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            this.b.f.a(xg2, abu2, 0);
            if (abu2.b().b()) {
                this.b.f.a(xg2, abu2, 1);
            }
            GL11.glPopMatrix();
        }
    }

    protected void d() {
        GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)0.0f);
    }

    protected void b(xg xg2, float f2) {
        float f3 = 0.9375f;
        GL11.glScalef((float)f3, (float)f3, (float)f3);
    }

    @Override
    protected /* synthetic */ void a(rm rm2, float f2) {
        this.b((xg)rm2, f2);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((xg)rm2, f2);
    }
}

