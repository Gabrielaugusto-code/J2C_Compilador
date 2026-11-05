/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class ben
extends bcl {
    private aod a;
    private int f;
    private int g;
    private bau h;

    public ben(aod aod2) {
        this.a = aod2;
    }

    @Override
    public void r_() {
        this.n.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.h = new bau(0, this.l / 2 - 100, this.m / 4 + 120, bsc.a("gui.done", new Object[0]));
        this.n.add(this.h);
        this.a.a(false);
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
        bjw bjw2 = this.k.v();
        if (bjw2 != null) {
            bjw2.a(new je(this.a.c, this.a.d, this.a.e, this.a.a));
        }
        this.a.a(true);
    }

    @Override
    public void c() {
        ++this.f;
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 0) {
            this.a.e();
            this.k.a((bcl)null);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 200) {
            this.g = this.g - 1 & 3;
        }
        if (n2 == 208 || n2 == 28 || n2 == 156) {
            this.g = this.g + 1 & 3;
        }
        if (n2 == 14 && this.a.a[this.g].length() > 0) {
            this.a.a[this.g] = this.a.a[this.g].substring(0, this.a.a[this.g].length() - 1);
        }
        if (t.a(c2) && this.a.a[this.g].length() < 15) {
            int n3 = this.g;
            this.a.a[n3] = this.a.a[n3] + c2;
        }
        if (n2 == 1) {
            this.a(this.h);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("sign.edit", new Object[0]), this.l / 2, 40, 0xFFFFFF);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.l / 2), (float)0.0f, (float)50.0f);
        float f3 = 93.75f;
        GL11.glScalef((float)(-f3), (float)(-f3), (float)(-f3));
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        ahz ahz2 = this.a.q();
        if (ahz2 == aie.an) {
            float f4 = (float)(this.a.p() * 360) / 16.0f;
            GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.0625f, (float)0.0f);
        } else {
            int n4 = this.a.p();
            float f5 = 0.0f;
            if (n4 == 2) {
                f5 = 180.0f;
            }
            if (n4 == 4) {
                f5 = 90.0f;
            }
            if (n4 == 5) {
                f5 = -90.0f;
            }
            GL11.glRotatef((float)f5, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.0625f, (float)0.0f);
        }
        if (this.f / 6 % 2 == 0) {
            this.a.i = this.g;
        }
        bnd.a.a(this.a, -0.5, -0.75, -0.5, 0.0f);
        this.a.i = -1;
        GL11.glPopMatrix();
        super.a(n2, n3, f2);
    }
}

