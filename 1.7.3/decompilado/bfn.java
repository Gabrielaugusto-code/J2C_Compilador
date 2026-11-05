/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class bfn {
    private final azi a;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    protected final int b;
    protected int c;
    protected int d;
    private float i = -2.0f;
    private float j;
    private float k;
    private int l = -1;
    private long m;

    public bfn(azi azi2, int n2, int n3, int n4, int n5, int n6) {
        this.a = azi2;
        this.f = n3;
        this.h = n3 + n5;
        this.b = n6;
        this.e = n2;
        this.g = n2 + n4;
    }

    protected abstract int a();

    protected abstract void a(int var1, boolean var2);

    protected abstract boolean a(int var1);

    protected int b() {
        return this.a() * this.b;
    }

    protected abstract void c();

    protected abstract void a(int var1, int var2, int var3, int var4, bna var5);

    private void f() {
        int n2 = this.d();
        if (n2 < 0) {
            n2 = 0;
        }
        if (this.k < 0.0f) {
            this.k = 0.0f;
        }
        if (this.k > (float)n2) {
            this.k = n2;
        }
    }

    public int d() {
        return this.b() - (this.h - this.f - 4);
    }

    public void a(int n2, int n3, float f2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        this.c = n2;
        this.d = n3;
        this.c();
        int n11 = this.a();
        int n12 = this.e();
        int n13 = n12 + 6;
        if (Mouse.isButtonDown((int)0)) {
            if (this.i == -1.0f) {
                n10 = 1;
                if (n3 >= this.f && n3 <= this.h) {
                    int n14 = this.e + 2;
                    n9 = this.g - 2;
                    n8 = n3 - this.f + (int)this.k - 4;
                    n7 = n8 / this.b;
                    if (n2 >= n14 && n2 <= n9 && n7 >= 0 && n8 >= 0 && n7 < n11) {
                        n6 = n7 == this.l && azi.K() - this.m < 250L ? 1 : 0;
                        this.a(n7, n6 != 0);
                        this.l = n7;
                        this.m = azi.K();
                    } else if (n2 >= n14 && n2 <= n9 && n8 < 0) {
                        n10 = 0;
                    }
                    if (n2 >= n12 && n2 <= n13) {
                        this.j = -1.0f;
                        n6 = this.d();
                        if (n6 < 1) {
                            n6 = 1;
                        }
                        if ((n5 = (int)((float)((this.h - this.f) * (this.h - this.f)) / (float)this.b())) < 32) {
                            n5 = 32;
                        }
                        if (n5 > this.h - this.f - 8) {
                            n5 = this.h - this.f - 8;
                        }
                        this.j /= (float)(this.h - this.f - n5) / (float)n6;
                    } else {
                        this.j = 1.0f;
                    }
                    this.i = n10 != 0 ? (float)n3 : -2.0f;
                } else {
                    this.i = -2.0f;
                }
            } else if (this.i >= 0.0f) {
                this.k -= ((float)n3 - this.i) * this.j;
                this.i = n3;
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
                this.k += (float)(n10 * this.b / 2);
            }
            this.i = -1.0f;
        }
        this.f();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        bna bna2 = bna.a;
        this.a.P().a(bap.b);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f3 = 32.0f;
        bna2.b();
        bna2.c(0x202020);
        bna2.a(this.e, this.h, 0.0, (float)this.e / f3, (float)(this.h + (int)this.k) / f3);
        bna2.a(this.g, this.h, 0.0, (float)this.g / f3, (float)(this.h + (int)this.k) / f3);
        bna2.a(this.g, this.f, 0.0, (float)this.g / f3, (float)(this.f + (int)this.k) / f3);
        bna2.a(this.e, this.f, 0.0, (float)this.e / f3, (float)(this.f + (int)this.k) / f3);
        bna2.a();
        n9 = this.e + 2;
        n8 = this.f + 4 - (int)this.k;
        for (n7 = 0; n7 < n11; ++n7) {
            n6 = n8 + n7 * this.b;
            n5 = this.b - 4;
            if (n6 + this.b > this.h || n6 - 4 < this.f) continue;
            if (this.a(n7)) {
                n4 = this.e + 2;
                int n15 = this.g - 2;
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
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3008);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        bna2.b();
        bna2.a(0, 0);
        bna2.a(this.e, this.f + n7, 0.0, 0.0, 1.0);
        bna2.a(this.g, this.f + n7, 0.0, 1.0, 1.0);
        bna2.a(0, 255);
        bna2.a(this.g, this.f, 0.0, 1.0, 0.0);
        bna2.a(this.e, this.f, 0.0, 0.0, 0.0);
        bna2.a();
        bna2.b();
        bna2.a(0, 255);
        bna2.a(this.e, this.h, 0.0, 0.0, 1.0);
        bna2.a(this.g, this.h, 0.0, 1.0, 1.0);
        bna2.a(0, 0);
        bna2.a(this.g, this.h - n7, 0.0, 1.0, 0.0);
        bna2.a(this.e, this.h - n7, 0.0, 0.0, 0.0);
        bna2.a();
        n6 = this.d();
        if (n6 > 0) {
            n5 = (this.h - this.f) * (this.h - this.f) / this.b();
            if (n5 < 32) {
                n5 = 32;
            }
            if (n5 > this.h - this.f - 8) {
                n5 = this.h - this.f - 8;
            }
            if ((n4 = (int)this.k * (this.h - this.f - n5) / n6 + this.f) < this.f) {
                n4 = this.f;
            }
            bna2.b();
            bna2.a(0, 255);
            bna2.a(n12, this.h, 0.0, 0.0, 1.0);
            bna2.a(n13, this.h, 0.0, 1.0, 1.0);
            bna2.a(n13, this.f, 0.0, 1.0, 0.0);
            bna2.a(n12, this.f, 0.0, 0.0, 0.0);
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
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
    }

    protected int e() {
        return this.g - 8;
    }
}

