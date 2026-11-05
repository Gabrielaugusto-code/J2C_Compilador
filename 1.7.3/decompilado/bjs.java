/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bjs {
    public float a = 64.0f;
    public float b = 32.0f;
    private int r;
    private int s;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    private boolean t;
    private int u;
    public boolean i;
    public boolean j = true;
    public boolean k;
    public List l = new ArrayList();
    public List m;
    public final String n;
    private bim v;
    public float o;
    public float p;
    public float q;

    public bjs(bim bim2, String string) {
        this.v = bim2;
        bim2.r.add(this);
        this.n = string;
        this.b(bim2.t, bim2.u);
    }

    public bjs(bim bim2) {
        this(bim2, null);
    }

    public bjs(bim bim2, int n2, int n3) {
        this(bim2);
        this.a(n2, n3);
    }

    public void a(bjs bjs2) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(bjs2);
    }

    public bjs a(int n2, int n3) {
        this.r = n2;
        this.s = n3;
        return this;
    }

    public bjs a(String string, float f2, float f3, float f4, int n2, int n3, int n4) {
        string = this.n + "." + string;
        bjt bjt2 = this.v.a(string);
        this.a(bjt2.a, bjt2.b);
        this.l.add(new bjn(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f).a(string));
        return this;
    }

    public bjs a(float f2, float f3, float f4, int n2, int n3, int n4) {
        this.l.add(new bjn(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f));
        return this;
    }

    public void a(float f2, float f3, float f4, int n2, int n3, int n4, float f5) {
        this.l.add(new bjn(this, this.r, this.s, f2, f3, f4, n2, n3, n4, f5));
    }

    public void a(float f2, float f3, float f4) {
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public void a(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        GL11.glTranslatef((float)this.o, (float)this.p, (float)this.q);
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.c * f2), (float)(this.d * f2), (float)(this.e * f2));
            if (this.h != 0.0f) {
                GL11.glRotatef((float)(this.h * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (this.g != 0.0f) {
                GL11.glRotatef((float)(this.g * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.f != 0.0f) {
                GL11.glRotatef((float)(this.f * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glCallList((int)this.u);
            if (this.m != null) {
                for (int i2 = 0; i2 < this.m.size(); ++i2) {
                    ((bjs)this.m.get(i2)).a(f2);
                }
            }
            GL11.glPopMatrix();
        } else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            GL11.glTranslatef((float)(this.c * f2), (float)(this.d * f2), (float)(this.e * f2));
            GL11.glCallList((int)this.u);
            if (this.m != null) {
                for (int i3 = 0; i3 < this.m.size(); ++i3) {
                    ((bjs)this.m.get(i3)).a(f2);
                }
            }
            GL11.glTranslatef((float)(-this.c * f2), (float)(-this.d * f2), (float)(-this.e * f2));
        } else {
            GL11.glCallList((int)this.u);
            if (this.m != null) {
                for (int i4 = 0; i4 < this.m.size(); ++i4) {
                    ((bjs)this.m.get(i4)).a(f2);
                }
            }
        }
        GL11.glTranslatef((float)(-this.o), (float)(-this.p), (float)(-this.q));
    }

    public void b(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.c * f2), (float)(this.d * f2), (float)(this.e * f2));
        if (this.g != 0.0f) {
            GL11.glRotatef((float)(this.g * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (this.f != 0.0f) {
            GL11.glRotatef((float)(this.f * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        if (this.h != 0.0f) {
            GL11.glRotatef((float)(this.h * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
        }
        GL11.glCallList((int)this.u);
        GL11.glPopMatrix();
    }

    public void c(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            GL11.glTranslatef((float)(this.c * f2), (float)(this.d * f2), (float)(this.e * f2));
            if (this.h != 0.0f) {
                GL11.glRotatef((float)(this.h * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (this.g != 0.0f) {
                GL11.glRotatef((float)(this.g * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.f != 0.0f) {
                GL11.glRotatef((float)(this.f * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
        } else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            GL11.glTranslatef((float)(this.c * f2), (float)(this.d * f2), (float)(this.e * f2));
        }
    }

    private void d(float f2) {
        this.u = azh.a(1);
        GL11.glNewList((int)this.u, (int)4864);
        bna bna2 = bna.a;
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            ((bjn)this.l.get(i2)).a(bna2, f2);
        }
        GL11.glEndList();
        this.t = true;
    }

    public bjs b(int n2, int n3) {
        this.a = n2;
        this.b = n3;
        return this;
    }
}

