/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Calendar;
import org.lwjgl.opengl.GL11;

public class bnf
extends bne {
    private static final brq b = new brq("textures/entity/chest/trapped_double.png");
    private static final brq c = new brq("textures/entity/chest/christmas_double.png");
    private static final brq d = new brq("textures/entity/chest/normal_double.png");
    private static final brq e = new brq("textures/entity/chest/trapped.png");
    private static final brq f = new brq("textures/entity/chest/christmas.png");
    private static final brq g = new brq("textures/entity/chest/normal.png");
    private bib h = new bib();
    private bib i = new bii();
    private boolean j;

    public bnf() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.j = true;
        }
    }

    public void a(ann ann2, double d2, double d3, double d4, float f2) {
        float f3;
        Object object;
        int n2;
        if (!ann2.o()) {
            n2 = 0;
        } else {
            object = ann2.q();
            n2 = ann2.p();
            if (object instanceof aio && n2 == 0) {
                ((aio)object).e(ann2.w(), ann2.c, ann2.d, ann2.e);
                n2 = ann2.p();
            }
            ann2.i();
        }
        if (ann2.i != null || ann2.k != null) {
            return;
        }
        if (ann2.j != null || ann2.l != null) {
            object = this.i;
            if (ann2.j() == 1) {
                this.a(b);
            } else if (this.j) {
                this.a(c);
            } else {
                this.a(d);
            }
        } else {
            object = this.h;
            if (ann2.j() == 1) {
                this.a(e);
            } else if (this.j) {
                this.a(f);
            } else {
                this.a(g);
            }
        }
        GL11.glPushMatrix();
        GL11.glEnable((int)32826);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glTranslatef((float)((float)d2), (float)((float)d3 + 1.0f), (float)((float)d4 + 1.0f));
        GL11.glScalef((float)1.0f, (float)-1.0f, (float)-1.0f);
        GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        int n3 = 0;
        if (n2 == 2) {
            n3 = 180;
        }
        if (n2 == 3) {
            n3 = 0;
        }
        if (n2 == 4) {
            n3 = 90;
        }
        if (n2 == 5) {
            n3 = -90;
        }
        if (n2 == 2 && ann2.j != null) {
            GL11.glTranslatef((float)1.0f, (float)0.0f, (float)0.0f);
        }
        if (n2 == 5 && ann2.l != null) {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-1.0f);
        }
        GL11.glRotatef((float)n3, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
        float f4 = ann2.n + (ann2.m - ann2.n) * f2;
        if (ann2.i != null && (f3 = ann2.i.n + (ann2.i.m - ann2.i.n) * f2) > f4) {
            f4 = f3;
        }
        if (ann2.k != null && (f3 = ann2.k.n + (ann2.k.m - ann2.k.n) * f2) > f4) {
            f4 = f3;
        }
        f4 = 1.0f - f4;
        f4 = 1.0f - f4 * f4 * f4;
        ((bib)object).a.f = -(f4 * (float)Math.PI / 2.0f);
        ((bib)object).a();
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

