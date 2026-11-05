/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class bbf {
    private final azi k;
    protected int a;
    private int l;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected final int f;
    private int m;
    private int n;
    protected int g;
    protected int h;
    protected boolean i = true;
    private float o = -2.0f;
    private float p;
    private float q;
    private int r = -1;
    private long s;
    private boolean t = true;
    private boolean u;
    protected int j;
    private boolean v = true;

    public bbf(azi azi2, int n2, int n3, int n4, int n5, int n6) {
        this.k = azi2;
        this.a = n2;
        this.l = n3;
        this.b = n4;
        this.c = n5;
        this.f = n6;
        this.e = 0;
        this.d = n2;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.l = n3;
        this.b = n4;
        this.c = n5;
        this.e = 0;
        this.d = n2;
    }

    public void a(boolean bl2) {
        this.t = bl2;
    }

    protected void a(boolean bl2, int n2) {
        this.u = bl2;
        this.j = n2;
        if (!bl2) {
            this.j = 0;
        }
    }

    protected abstract int b();

    protected abstract void a(int var1, boolean var2, int var3, int var4);

    protected abstract boolean a(int var1);

    protected int e() {
        return this.b() * this.f + this.j;
    }

    protected abstract void a();

    protected abstract void a(int var1, int var2, int var3, int var4, bna var5, int var6, int var7);

    protected void a(int n2, int n3, bna bna2) {
    }

    protected void a(int n2, int n3) {
    }

    protected void b(int n2, int n3) {
    }

    public int c(int n2, int n3) {
        int n4 = this.e + this.a / 2 - this.c() / 2;
        int n5 = this.e + this.a / 2 + this.c() / 2;
        int n6 = n3 - this.b - this.j + (int)this.q - 4;
        int n7 = n6 / this.f;
        if (n2 < this.d() && n2 >= n4 && n2 <= n5 && n7 >= 0 && n6 >= 0 && n7 < this.b()) {
            return n7;
        }
        return -1;
    }

    public void d(int n2, int n3) {
        this.m = n2;
        this.n = n3;
    }

    private void k() {
        int n2 = this.f();
        if (n2 < 0) {
            n2 /= 2;
        }
        if (!this.i && n2 < 0) {
            n2 = 0;
        }
        if (this.q < 0.0f) {
            this.q = 0.0f;
        }
        if (this.q > (float)n2) {
            this.q = n2;
        }
    }

    public int f() {
        return this.e() - (this.c - this.b - 4);
    }

    public int g() {
        return (int)this.q;
    }

    public boolean e(int n2) {
        return n2 >= this.b && n2 <= this.c;
    }

    public void f(int n2) {
        this.q += (float)n2;
        this.k();
        this.o = -2.0f;
    }

    public void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == this.m) {
            this.q -= (float)(this.f * 2 / 3);
            this.o = -2.0f;
            this.k();
        } else if (bau2.k == this.n) {
            this.q += (float)(this.f * 2 / 3);
            this.o = -2.0f;
            this.k();
        }
    }

    public void a(int n2, int n3, float f2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        this.g = n2;
        this.h = n3;
        this.a();
        int n9 = this.b();
        int n10 = this.d();
        int n11 = n10 + 6;
        if (n2 > this.e && n2 < this.d && n3 > this.b && n3 < this.c) {
            int n12;
            if (Mouse.isButtonDown((int)0) && this.i()) {
                if (this.o == -1.0f) {
                    n12 = 1;
                    if (n3 >= this.b && n3 <= this.c) {
                        int n13 = this.a / 2 - this.c() / 2;
                        n8 = this.a / 2 + this.c() / 2;
                        n7 = n3 - this.b - this.j + (int)this.q - 4;
                        n6 = n7 / this.f;
                        if (n2 >= n13 && n2 <= n8 && n6 >= 0 && n7 >= 0 && n6 < n9) {
                            n5 = n6 == this.r && azi.K() - this.s < 250L ? 1 : 0;
                            this.a(n6, n5 != 0, n2, n3);
                            this.r = n6;
                            this.s = azi.K();
                        } else if (n2 >= n13 && n2 <= n8 && n7 < 0) {
                            this.a(n2 - n13, n3 - this.b + (int)this.q - 4);
                            n12 = 0;
                        }
                        if (n2 >= n10 && n2 <= n11) {
                            this.p = -1.0f;
                            n5 = this.f();
                            if (n5 < 1) {
                                n5 = 1;
                            }
                            if ((n4 = (int)((float)((this.c - this.b) * (this.c - this.b)) / (float)this.e())) < 32) {
                                n4 = 32;
                            }
                            if (n4 > this.c - this.b - 8) {
                                n4 = this.c - this.b - 8;
                            }
                            this.p /= (float)(this.c - this.b - n4) / (float)n5;
                        } else {
                            this.p = 1.0f;
                        }
                        this.o = n12 != 0 ? (float)n3 : -2.0f;
                    } else {
                        this.o = -2.0f;
                    }
                } else if (this.o >= 0.0f) {
                    this.q -= ((float)n3 - this.o) * this.p;
                    this.o = n3;
                }
            } else {
                while (!this.k.u.z && Mouse.next()) {
                    n12 = Mouse.getEventDWheel();
                    if (n12 != 0) {
                        if (n12 > 0) {
                            n12 = -1;
                        } else if (n12 < 0) {
                            n12 = 1;
                        }
                        this.q += (float)(n12 * this.f / 2);
                    }
                    this.k.n.d();
                }
                this.o = -1.0f;
            }
        }
        this.k();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        bna bna2 = bna.a;
        this.k.P().a(bap.b);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f3 = 32.0f;
        bna2.b();
        bna2.c(0x202020);
        bna2.a(this.e, this.c, 0.0, (float)this.e / f3, (float)(this.c + (int)this.q) / f3);
        bna2.a(this.d, this.c, 0.0, (float)this.d / f3, (float)(this.c + (int)this.q) / f3);
        bna2.a(this.d, this.b, 0.0, (float)this.d / f3, (float)(this.b + (int)this.q) / f3);
        bna2.a(this.e, this.b, 0.0, (float)this.e / f3, (float)(this.b + (int)this.q) / f3);
        bna2.a();
        n8 = this.e + (this.a / 2 - this.c() / 2 + 2);
        n7 = this.b + 4 - (int)this.q;
        if (this.u) {
            this.a(n8, n7, bna2);
        }
        this.b(n8, n7, n2, n3);
        GL11.glDisable((int)2929);
        n6 = 4;
        this.c(0, this.b, 255, 255);
        this.c(this.c, this.l, 255, 255);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 0, 1);
        GL11.glDisable((int)3008);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        bna2.b();
        bna2.a(0, 0);
        bna2.a(this.e, this.b + n6, 0.0, 0.0, 1.0);
        bna2.a(this.d, this.b + n6, 0.0, 1.0, 1.0);
        bna2.a(0, 255);
        bna2.a(this.d, this.b, 0.0, 1.0, 0.0);
        bna2.a(this.e, this.b, 0.0, 0.0, 0.0);
        bna2.a();
        bna2.b();
        bna2.a(0, 255);
        bna2.a(this.e, this.c, 0.0, 0.0, 1.0);
        bna2.a(this.d, this.c, 0.0, 1.0, 1.0);
        bna2.a(0, 0);
        bna2.a(this.d, this.c - n6, 0.0, 1.0, 0.0);
        bna2.a(this.e, this.c - n6, 0.0, 0.0, 0.0);
        bna2.a();
        n5 = this.f();
        if (n5 > 0) {
            int n14;
            n4 = (this.c - this.b) * (this.c - this.b) / this.e();
            if (n4 < 32) {
                n4 = 32;
            }
            if (n4 > this.c - this.b - 8) {
                n4 = this.c - this.b - 8;
            }
            if ((n14 = (int)this.q * (this.c - this.b - n4) / n5 + this.b) < this.b) {
                n14 = this.b;
            }
            bna2.b();
            bna2.a(0, 255);
            bna2.a(n10, this.c, 0.0, 0.0, 1.0);
            bna2.a(n11, this.c, 0.0, 1.0, 1.0);
            bna2.a(n11, this.b, 0.0, 1.0, 0.0);
            bna2.a(n10, this.b, 0.0, 0.0, 0.0);
            bna2.a();
            bna2.b();
            bna2.a(0x808080, 255);
            bna2.a(n10, n14 + n4, 0.0, 0.0, 1.0);
            bna2.a(n11, n14 + n4, 0.0, 1.0, 1.0);
            bna2.a(n11, n14, 0.0, 1.0, 0.0);
            bna2.a(n10, n14, 0.0, 0.0, 0.0);
            bna2.a();
            bna2.b();
            bna2.a(0xC0C0C0, 255);
            bna2.a(n10, n14 + n4 - 1, 0.0, 0.0, 1.0);
            bna2.a(n11 - 1, n14 + n4 - 1, 0.0, 1.0, 1.0);
            bna2.a(n11 - 1, n14, 0.0, 1.0, 0.0);
            bna2.a(n10, n14, 0.0, 0.0, 0.0);
            bna2.a();
        }
        this.b(n2, n3);
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
    }

    public void b(boolean bl2) {
        this.v = bl2;
    }

    public boolean i() {
        return this.v;
    }

    public int c() {
        return 220;
    }

    protected void b(int n2, int n3, int n4, int n5) {
        int n6 = this.b();
        bna bna2 = bna.a;
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = n3 + i2 * this.f + this.j;
            int n8 = this.f - 4;
            if (n7 > this.c || n7 + n8 < this.b) continue;
            if (this.t && this.a(i2)) {
                int n9 = this.e + (this.a / 2 - this.c() / 2);
                int n10 = this.e + (this.a / 2 + this.c() / 2);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)3553);
                bna2.b();
                bna2.c(0x808080);
                bna2.a(n9, n7 + n8 + 2, 0.0, 0.0, 1.0);
                bna2.a(n10, n7 + n8 + 2, 0.0, 1.0, 1.0);
                bna2.a(n10, n7 - 2, 0.0, 1.0, 0.0);
                bna2.a(n9, n7 - 2, 0.0, 0.0, 0.0);
                bna2.c(0);
                bna2.a(n9 + 1, n7 + n8 + 1, 0.0, 0.0, 1.0);
                bna2.a(n10 - 1, n7 + n8 + 1, 0.0, 1.0, 1.0);
                bna2.a(n10 - 1, n7 - 1, 0.0, 1.0, 0.0);
                bna2.a(n9 + 1, n7 - 1, 0.0, 0.0, 0.0);
                bna2.a();
                GL11.glEnable((int)3553);
            }
            this.a(i2, n2, n7, n8, bna2, n4, n5);
        }
    }

    protected int d() {
        return this.a / 2 + 124;
    }

    private void c(int n2, int n3, int n4, int n5) {
        bna bna2 = bna.a;
        this.k.P().a(bap.b);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f2 = 32.0f;
        bna2.b();
        bna2.a(0x404040, n5);
        bna2.a(this.e, n3, 0.0, 0.0, (float)n3 / f2);
        bna2.a(this.e + this.a, n3, 0.0, (float)this.a / f2, (float)n3 / f2);
        bna2.a(0x404040, n4);
        bna2.a(this.e + this.a, n2, 0.0, (float)this.a / f2, (float)n2 / f2);
        bna2.a(this.e, n2, 0.0, 0.0, (float)n2 / f2);
        bna2.a();
    }

    public void g(int n2) {
        this.e = n2;
        this.d = n2 + this.a;
    }

    public int j() {
        return this.f;
    }
}

