/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bek
extends bee {
    private float u;
    private float v;

    public bek(xq xq2) {
        super(xq2.bn);
        this.p = true;
    }

    @Override
    public void c() {
        if (this.k.c.h()) {
            this.k.a(new beb(this.k.h));
        }
    }

    @Override
    public void r_() {
        this.n.clear();
        if (this.k.c.h()) {
            this.k.a(new beb(this.k.h));
        } else {
            super.r_();
        }
    }

    @Override
    protected void b(int n2, int n3) {
        this.q.b(bsc.a("container.crafting", new Object[0]), 86, 16, 0x404040);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        this.u = n2;
        this.v = n3;
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(a);
        int n4 = this.i;
        int n5 = this.r;
        this.b(n4, n5, 0, 0, this.f, this.g);
        bek.a(n4 + 51, n5 + 75, 30, (float)(n4 + 51) - this.u, (float)(n5 + 75 - 50) - this.v, this.k.h);
    }

    public static void a(int n2, int n3, int n4, float f2, float f3, rm rm2) {
        GL11.glEnable((int)2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n2, (float)n3, (float)50.0f);
        GL11.glScalef((float)(-n4), (float)n4, (float)n4);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        float f4 = rm2.aM;
        float f5 = rm2.y;
        float f6 = rm2.z;
        float f7 = rm2.aP;
        float f8 = rm2.aO;
        GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        azg.b();
        GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-((float)Math.atan(f3 / 40.0f)) * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        rm2.aM = (float)Math.atan(f2 / 40.0f) * 20.0f;
        rm2.y = (float)Math.atan(f2 / 40.0f) * 40.0f;
        rm2.z = -((float)Math.atan(f3 / 40.0f)) * 20.0f;
        rm2.aO = rm2.y;
        rm2.aP = rm2.y;
        GL11.glTranslatef((float)0.0f, (float)rm2.L, (float)0.0f);
        bog.a.j = 180.0f;
        bog.a.a(rm2, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        rm2.aM = f4;
        rm2.y = f5;
        rm2.z = f6;
        rm2.aP = f7;
        rm2.aO = f8;
        GL11.glPopMatrix();
        azg.a();
        GL11.glDisable((int)32826);
        bwg.j(bwg.c);
        GL11.glDisable((int)3553);
        bwg.j(bwg.b);
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 0) {
            this.k.a(new bcy(this, this.k.h.m()));
        }
        if (bau2.k == 1) {
            this.k.a(new bcz(this, this.k.h.m()));
        }
    }
}

