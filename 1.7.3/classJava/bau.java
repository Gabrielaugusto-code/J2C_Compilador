/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bau
extends bap {
    protected static final brq a = new brq("textures/gui/widgets.png");
    protected int f = 200;
    protected int g = 20;
    public int h;
    public int i;
    public String j;
    public int k;
    public boolean l = true;
    public boolean m = true;
    protected boolean n;

    public bau(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, 200, 20, string);
    }

    public bau(int n2, int n3, int n4, int n5, int n6, String string) {
        this.k = n2;
        this.h = n3;
        this.i = n4;
        this.f = n5;
        this.g = n6;
        this.j = string;
    }

    protected int a(boolean bl2) {
        int n2 = 1;
        if (!this.l) {
            n2 = 0;
        } else if (bl2) {
            n2 = 2;
        }
        return n2;
    }

    public void a(azi azi2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        ban ban2 = azi2.l;
        azi2.P().a(a);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.n = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        int n4 = this.a(this.n);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        GL11.glBlendFunc((int)770, (int)771);
        this.b(this.h, this.i, 0, 46 + n4 * 20, this.f / 2, this.g);
        this.b(this.h + this.f / 2, this.i, 200 - this.f / 2, 46 + n4 * 20, this.f / 2, this.g);
        this.b(azi2, n2, n3);
        int n5 = 0xE0E0E0;
        if (!this.l) {
            n5 = 0xA0A0A0;
        } else if (this.n) {
            n5 = 0xFFFFA0;
        }
        this.a(ban2, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, n5);
    }

    protected void b(azi azi2, int n2, int n3) {
    }

    public void a(int n2, int n3) {
    }

    public boolean c(azi azi2, int n2, int n3) {
        return this.l && this.m && n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
    }

    public boolean a() {
        return this.n;
    }

    public void b(int n2, int n3) {
    }

    public void a(buc buc2) {
        buc2.a(btb.a(new brq("gui.button.press"), 1.0f));
    }

    public int b() {
        return this.f;
    }
}

