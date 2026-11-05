/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class bfj {
    private final azi a;
    private int g;
    private int h;
    protected int b;
    protected int c;
    private int i;
    private int j;
    protected final int d;
    private int k;
    private int l;
    protected int e;
    protected int f;
    private float m = -2.0f;
    private float n;
    private float o;
    private int p = -1;
    private long q;
    private boolean r = true;
    private boolean s;
    private int t;

    public bfj(azi azi2, int n2, int n3, int n4, int n5, int n6) {
        this.a = azi2;
        this.g = n2;
        this.h = n3;
        this.b = n4;
        this.c = n5;
        this.d = n6;
        this.j = 0;
        this.i = n2;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.g = n2;
        this.h = n3;
        this.b = n4;
        this.c = n5;
        this.j = 0;
        this.i = n2;
    }

    protected abstract int a();

    protected abstract void a(int var1, boolean var2);

    protected abstract boolean a(int var1);

    protected abstract boolean b(int var1);

    protected int b() {
        return this.a() * this.d + this.t;
    }

    protected abstract void c();

    protected abstract void a(int var1, int var2, int var3, int var4, bna var5);

    protected void a(int n2, int n3, bna bna2) {
    }

    protected void a(int n2, int n3) {
    }

    protected void b(int n2, int n3) {
    }

    private void h() {
        int n2 = this.d();
        if (n2 < 0) {
            n2 /= 2;
        }
        if (this.o < 0.0f) {
            this.o = 0.0f;
        }
        if (this.o > (float)n2) {
            this.o = n2;
        }
    }

    public int d() {
        return this.b() - (this.c - this.b - 4);
    }

    public void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == this.k) {
            this.o -= (float)(this.d * 2 / 3);
            this.m = -2.0f;
            this.h();
        } else if (bau2.k == this.l) {
            this.o += (float)(this.d * 2 / 3);
            this.m = -2.0f;
            this.h();
        }
    }

    public void a(int n2, int n3, float f2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        this.e = n2;
        this.f = n3;
        this.c();
        int n11 = this.a();
        int n12 = this.g();
        int n13 = n12 + 6;
        if (Mouse.isButtonDown((int)0)) {
            if (this.m == -1.0f) {
                n10 = 1;
                if (n3 >= this.b && n3 <= this.c) {
                    int n14 = this.g / 2 - 110;
                    n9 = this.g / 2 + 110;
                    n8 = n3 - this.b - this.t + (int)this.o - 4;
                    n7 = n8 / this.d;
                    if (n2 >= n14 && n2 <= n9 && n7 >= 0 && n8 >= 0 && n7 < n11) {
                        n6 = n7 == this.p && azi.K() - this.q < 250L ? 1 : 0;
                        this.a(n7, n6 != 0);
                        this.p = n7;
                        this.q = azi.K();
                    } else if (n2 >= n14 && n2 <= n9 && n8 < 0) {
                        this.a(n2 - n14, n3 - this.b + (int)this.o - 4);
                        n10 = 0;
                    }
                    if (n2 >= n12 && n2 <= n13) {
                        this.n = -1.0f;
                        n6 = this.d();
                        if (n6 < 1) {
                            n6 = 1;
                        }
                        if ((n5 = (int)((float)((this.c - this.b) * (this.c - this.b)) / (float)this.b())) < 32) {
                            n5 = 32;
                        }
                        if (n5 > this.c - this.b - 8) {
                            n5 = this.c - this.b - 8;
                        }
                        this.n /= (float)(this.c - this.b - n5) / (float)n6;
                    } else {
                        this.n = 1.0f;
                    }
                    this.m = n10 != 0 ? (float)n3 : -2.0f;
                } else {
                    this.m = -2.0f;
                }
            } else if (this.m >= 0.0f) {
                this.o -= ((float)n3 - this.m) * this.n;
                this.m = n3;
            }
        } else {
            while (!this.a.u.z && Mouse.next()) {
                n10 = Mouse.getEventDWheel();
                if (n10 == 0) continue;
                if (n10 > 0) {
                    n10 = -1;
                } else if (n10 < 0) {
                    n10 = 1;
                }
                this.o += (float)(n10 * this.d / 2);
            }
            this.m = -1.0f;
        }
        this.h();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        bna bna2 = bna.a;
        this.a.P().a(bap.b);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f3 = 32.0f;
        bna2.b();
        bna2.c(0x202020);
        bna2.a(this.j, this.c, 0.0, (float)this.j / f3, (float)(this.c + (int)this.o) / f3);
        bna2.a(this.i, this.c, 0.0, (float)this.i / f3, (float)(this.c + (int)this.o) / f3);
        bna2.a(this.i, this.b, 0.0, (float)this.i / f3, (float)(this.b + (int)this.o) / f3);
        bna2.a(this.j, this.b, 0.0, (float)this.j / f3, (float)(this.b + (int)this.o) / f3);
        bna2.a();
        n9 = this.g / 2 - 92 - 16;
        n8 = this.b + 4 - (int)this.o;
        if (this.s) {
            this.a(n9, n8, bna2);
        }
        for (n7 = 0; n7 < n11; ++n7) {
            int n15;
            n6 = n8 + n7 * this.d + this.t;
            n5 = this.d - 4;
            if (n6 > this.c || n6 + n5 < this.b) continue;
            if (this.r && this.b(n7)) {
                n4 = this.g / 2 - 110;
                n15 = this.g / 2 + 110;
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)3553);
                bna2.b();
                bna2.c(0);
                bna2.a(n4, n6 + n5 + 2, 0.0, 0.0, 1.0);
                bna2.a(n15, n6 + n5 + 2, 0.0, 1.0, 1.0);
                bna2.a(n15, n6 - 2, 0.0, 1.0, 0.0);
                bna2.a(n4, n6 - 2, 0.0, 0.0, 0.0);
                bna2.a();
                GL11.glEnable((int)3553);
            }
            if (this.r && this.a(n7)) {
                n4 = this.g / 2 - 110;
                n15 = this.g / 2 + 110;
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)3553);
                bna2.b();
                bna2.c(0x808080);
                bna2.a(n4, n6 + n5 + 2, 0.0, 0.0, 1.0);
                bna2.a(n15, n6 + n5 + 2, 0.0, 1.0, 1.0);
                bna2.a(n15, n6 - 2, 0.0, 1.0, 0.0);
                bna2.a(n4, n6 - 2, 0.0, 0.0, 0.0);
                bna2.c(0);
                bna2.a(n4 + 1, n6 + n5 + 1, 0.0, 0.0, 1.0);
                bna2.a(n15 - 1, n6 + n5 + 1, 0.0, 1.0, 1.0);
                bna2.a(n15 - 1, n6 - 1, 0.0, 1.0, 0.0);
                bna2.a(n4 + 1, n6 - 1, 0.0, 0.0, 0.0);
                bna2.a();
                GL11.glEnable((int)3553);
            }
            this.a(n7, n9, n6, n5, bna2);
        }
        GL11.glDisable((int)2929);
        n7 = 4;
        this.b(0, this.b, 255, 255);
        this.b(this.c, this.h, 255, 255);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3008);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        bna2.b();
        bna2.a(0, 0);
        bna2.a(this.j, this.b + n7, 0.0, 0.0, 1.0);
        bna2.a(this.i, this.b + n7, 0.0, 1.0, 1.0);
        bna2.a(0, 255);
        bna2.a(this.i, this.b, 0.0, 1.0, 0.0);
        bna2.a(this.j, this.b, 0.0, 0.0, 0.0);
        bna2.a();
        bna2.b();
        bna2.a(0, 255);
        bna2.a(this.j, this.c, 0.0, 0.0, 1.0);
        bna2.a(this.i, this.c, 0.0, 1.0, 1.0);
        bna2.a(0, 0);
        bna2.a(this.i, this.c - n7, 0.0, 1.0, 0.0);
        bna2.a(this.j, this.c - n7, 0.0, 0.0, 0.0);
        bna2.a();
        n6 = this.d();
        if (n6 > 0) {
            n5 = (this.c - this.b) * (this.c - this.b) / this.b();
            if (n5 < 32) {
                n5 = 32;
            }
            if (n5 > this.c - this.b - 8) {
                n5 = this.c - this.b - 8;
            }
            if ((n4 = (int)this.o * (this.c - this.b - n5) / n6 + this.b) < this.b) {
                n4 = this.b;
            }
            bna2.b();
            bna2.a(0, 255);
            bna2.a(n12, this.c, 0.0, 0.0, 1.0);
            bna2.a(n13, this.c, 0.0, 1.0, 1.0);
            bna2.a(n13, this.b, 0.0, 1.0, 0.0);
            bna2.a(n12, this.b, 0.0, 0.0, 0.0);
            bna2.a();
            bna2.b();
            bna2.a(0x808080, 255);
            bna2.a(n12, n4 + n5, 0.0, 0.0, 1.0);
            bna2.a(n13, n4 + n5, 0.0, 1.0, 1.0);
            bna2.a(n13, n4, 0.0, 1.0, 0.0);
            bna2.a(n12, n4, 0.0, 0.0, 0.0);
            bna2.a();
            bna2.b();
            bna2.a(0xC0C0C0, 255);
            bna2.a(n12, n4 + n5 - 1, 0.0, 0.0, 1.0);
            bna2.a(n13 - 1, n4 + n5 - 1, 0.0, 1.0, 1.0);
            bna2.a(n13 - 1, n4, 0.0, 1.0, 0.0);
            bna2.a(n12, n4, 0.0, 0.0, 0.0);
            bna2.a();
        }
        this.b(n2, n3);
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
    }

    protected int g() {
        return this.g / 2 + 124;
    }

    private void b(int n2, int n3, int n4, int n5) {
        bna bna2 = bna.a;
        this.a.P().a(bap.b);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f2 = 32.0f;
        bna2.b();
        bna2.a(0x404040, n5);
        bna2.a(0.0, n3, 0.0, 0.0, (float)n3 / f2);
        bna2.a(this.g, n3, 0.0, (float)this.g / f2, (float)n3 / f2);
        bna2.a(0x404040, n4);
        bna2.a(this.g, n2, 0.0, (float)this.g / f2, (float)n2 / f2);
        bna2.a(0.0, n2, 0.0, 0.0, (float)n2 / f2);
        bna2.a();
    }
}

