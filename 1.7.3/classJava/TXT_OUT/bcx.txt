/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bcx
extends bap {
    private static final brq a = new brq("textures/gui/achievement/achievement_background.png");
    private azi f;
    private int g;
    private int h;
    private String i;
    private String j;
    private ns k;
    private long l;
    private bor m;
    private boolean n;

    public bcx(azi azi2) {
        this.f = azi2;
        this.m = new bor();
    }

    public void a(ns ns2) {
        this.i = bsc.a("achievement.get", new Object[0]);
        this.j = ns2.e().c();
        this.l = azi.K();
        this.k = ns2;
        this.n = false;
    }

    public void b(ns ns2) {
        this.i = ns2.e().c();
        this.j = ns2.f();
        this.l = azi.K() + 2500L;
        this.k = ns2;
        this.n = true;
    }

    private void c() {
        GL11.glViewport((int)0, (int)0, (int)this.f.d, (int)this.f.e);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        this.g = this.f.d;
        this.h = this.f.e;
        bat bat2 = new bat(this.f, this.f.d, this.f.e);
        this.g = bat2.a();
        this.h = bat2.b();
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)this.g, (double)this.h, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    public void a() {
        if (this.k == null || this.l == 0L || azi.B().h == null) {
            return;
        }
        double d2 = (double)(azi.K() - this.l) / 3000.0;
        if (!this.n) {
            if (d2 < 0.0 || d2 > 1.0) {
                this.l = 0L;
                return;
            }
        } else if (d2 > 0.5) {
            d2 = 0.5;
        }
        this.c();
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d3 = d2 * 2.0;
        if (d3 > 1.0) {
            d3 = 2.0 - d3;
        }
        d3 *= 4.0;
        if ((d3 = 1.0 - d3) < 0.0) {
            d3 = 0.0;
        }
        d3 *= d3;
        d3 *= d3;
        int n2 = this.g - 160;
        int n3 = 0 - (int)(d3 * 36.0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        this.f.P().a(a);
        GL11.glDisable((int)2896);
        this.b(n2, n3, 96, 202, 160, 32);
        if (this.n) {
            this.f.l.a(this.j, n2 + 30, n3 + 7, 120, -1);
        } else {
            this.f.l.b(this.i, n2 + 30, n3 + 7, -256);
            this.f.l.b(this.j, n2 + 30, n3 + 18, -1);
        }
        azg.c();
        GL11.glDisable((int)2896);
        GL11.glEnable((int)32826);
        GL11.glEnable((int)2903);
        GL11.glEnable((int)2896);
        this.m.b(this.f.l, this.f.P(), this.k.d, n2 + 8, n3 + 8);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
    }

    public void b() {
        this.k = null;
        this.l = 0L;
    }
}

