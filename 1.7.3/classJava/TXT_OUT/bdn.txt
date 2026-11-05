/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashSet;
import java.util.Set;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class bdn
extends bcl {
    protected static final brq a = new brq("textures/gui/container/inventory.png");
    protected int f = 176;
    protected int g = 166;
    public yj h;
    protected int i;
    protected int r;
    private zp u;
    private zp v;
    private boolean w;
    private abu x;
    private int y;
    private int z;
    private zp A;
    private long B;
    private abu C;
    private zp D;
    private long E;
    protected final Set s = new HashSet();
    protected boolean t;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private long J;
    private zp K;
    private int L;
    private boolean M;
    private abu N;

    public bdn(yj yj2) {
        this.h = yj2;
        this.H = true;
    }

    @Override
    public void r_() {
        super.r_();
        this.k.h.bo = this.h;
        this.i = (this.l - this.f) / 2;
        this.r = (this.m - this.g) / 2;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        int n5;
        Object object;
        this.q_();
        int n6 = this.i;
        int n7 = this.r;
        this.a(f2, n2, n3);
        GL11.glDisable((int)32826);
        azg.a();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2929);
        super.a(n2, n3, f2);
        azg.c();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n6, (float)n7, (float)0.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)32826);
        this.u = null;
        int n8 = 240;
        int n9 = 240;
        bwg.a(bwg.c, (float)n8 / 1.0f, (float)n9 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        for (int i2 = 0; i2 < this.h.c.size(); ++i2) {
            object = (zp)this.h.c.get(i2);
            this.a((zp)object);
            if (!this.a((zp)object, n2, n3) || !((zp)object).b()) continue;
            this.u = object;
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2929);
            n5 = ((zp)object).h;
            n4 = ((zp)object).i;
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
            this.a(n5, n4, n5 + 16, n4 + 16, -2130706433, -2130706433);
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
        }
        this.b(n2, n3);
        xo xo2 = this.k.h.bm;
        Object object2 = object = this.x == null ? xo2.o() : this.x;
        if (object != null) {
            n5 = 8;
            n4 = this.x == null ? 8 : 16;
            String string = null;
            if (this.x != null && this.w) {
                object = ((abu)object).m();
                ((abu)object).b = oy.f((float)((abu)object).b / 2.0f);
            } else if (this.t && this.s.size() > 1) {
                object = ((abu)object).m();
                ((abu)object).b = this.I;
                if (((abu)object).b == 0) {
                    string = "" + (Object)((Object)a.o) + "0";
                }
            }
            this.a((abu)object, n2 - n6 - n5, n3 - n7 - n4, string);
        }
        if (this.C != null) {
            float f3 = (float)(azi.K() - this.B) / 100.0f;
            if (f3 >= 1.0f) {
                f3 = 1.0f;
                this.C = null;
            }
            n4 = this.A.h - this.y;
            int n10 = this.A.i - this.z;
            int n11 = this.y + (int)((float)n4 * f3);
            int n12 = this.z + (int)((float)n10 * f3);
            this.a(this.C, n11, n12, null);
        }
        GL11.glPopMatrix();
        if (xo2.o() == null && this.u != null && this.u.e()) {
            abu abu2 = this.u.d();
            this.a(abu2, n2, n3);
        }
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        azg.b();
    }

    private void a(abu abu2, int n2, int n3, String string) {
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)32.0f);
        this.e = 200.0f;
        bdn.j.f = 200.0f;
        j.b(this.q, this.k.P(), abu2, n2, n3);
        j.a(this.q, this.k.P(), abu2, n2, n3 - (this.x == null ? 0 : 8), string);
        this.e = 0.0f;
        bdn.j.f = 0.0f;
    }

    protected void b(int n2, int n3) {
    }

    protected abstract void a(float var1, int var2, int var3);

    private void a(zp zp2) {
        pw pw2;
        int n2 = zp2.h;
        int n3 = zp2.i;
        abu abu2 = zp2.d();
        boolean bl2 = false;
        boolean bl3 = zp2 == this.v && this.x != null && !this.w;
        abu abu3 = this.k.h.bm.o();
        String string = null;
        if (zp2 == this.v && this.x != null && this.w && abu2 != null) {
            abu2 = abu2.m();
            abu2.b /= 2;
        } else if (this.t && this.s.contains(zp2) && abu3 != null) {
            if (this.s.size() == 1) {
                return;
            }
            if (yj.a(zp2, abu3, true) && this.h.b(zp2)) {
                abu2 = abu3.m();
                bl2 = true;
                yj.a(this.s, this.F, abu2, zp2.d() == null ? 0 : zp2.d().b);
                if (abu2.b > abu2.e()) {
                    string = (Object)((Object)a.o) + "" + abu2.e();
                    abu2.b = abu2.e();
                }
                if (abu2.b > zp2.a()) {
                    string = (Object)((Object)a.o) + "" + zp2.a();
                    abu2.b = zp2.a();
                }
            } else {
                this.s.remove(zp2);
                this.g();
            }
        }
        this.e = 100.0f;
        bdn.j.f = 100.0f;
        if (abu2 == null && (pw2 = zp2.c()) != null) {
            GL11.glDisable((int)2896);
            this.k.P().a(bqs.c);
            this.a(n2, n3, pw2, 16, 16);
            GL11.glEnable((int)2896);
            bl3 = true;
        }
        if (!bl3) {
            if (bl2) {
                bdn.a(n2, n3, n2 + 16, n3 + 16, -2130706433);
            }
            GL11.glEnable((int)2929);
            j.b(this.q, this.k.P(), abu2, n2, n3);
            j.a(this.q, this.k.P(), abu2, n2, n3, string);
        }
        bdn.j.f = 0.0f;
        this.e = 0.0f;
    }

    private void g() {
        abu abu2 = this.k.h.bm.o();
        if (abu2 == null || !this.t) {
            return;
        }
        this.I = abu2.b;
        for (zp zp2 : this.s) {
            abu abu3 = abu2.m();
            int n2 = zp2.d() == null ? 0 : zp2.d().b;
            yj.a(this.s, this.F, abu3, n2);
            if (abu3.b > abu3.e()) {
                abu3.b = abu3.e();
            }
            if (abu3.b > zp2.a()) {
                abu3.b = zp2.a();
            }
            this.I -= abu3.b - n2;
        }
    }

    private zp c(int n2, int n3) {
        for (int i2 = 0; i2 < this.h.c.size(); ++i2) {
            zp zp2 = (zp)this.h.c.get(i2);
            if (!this.a(zp2, n2, n3)) continue;
            return zp2;
        }
        return null;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        boolean bl2 = n4 == this.k.u.af.i() + 100;
        zp zp2 = this.c(n2, n3);
        long l2 = azi.K();
        this.M = this.K == zp2 && l2 - this.J < 250L && this.L == n4;
        this.H = false;
        if (n4 == 0 || n4 == 1 || bl2) {
            int n5 = this.i;
            int n6 = this.r;
            boolean bl3 = n2 < n5 || n3 < n6 || n2 >= n5 + this.f || n3 >= n6 + this.g;
            int n7 = -1;
            if (zp2 != null) {
                n7 = zp2.g;
            }
            if (bl3) {
                n7 = -999;
            }
            if (this.k.u.z && bl3 && this.k.h.bm.o() == null) {
                this.k.a((bcl)null);
                return;
            }
            if (n7 != -1) {
                if (this.k.u.z) {
                    if (zp2 != null && zp2.e()) {
                        this.v = zp2;
                        this.x = null;
                        this.w = n4 == 1;
                    } else {
                        this.v = null;
                    }
                } else if (!this.t) {
                    if (this.k.h.bm.o() == null) {
                        if (n4 == this.k.u.af.i() + 100) {
                            this.a(zp2, n7, n4, 3);
                        } else {
                            boolean bl4 = n7 != -999 && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54));
                            int n8 = 0;
                            if (bl4) {
                                this.N = zp2 != null && zp2.e() ? zp2.d() : null;
                                n8 = 1;
                            } else if (n7 == -999) {
                                n8 = 4;
                            }
                            this.a(zp2, n7, n4, n8);
                        }
                        this.H = true;
                    } else {
                        this.t = true;
                        this.G = n4;
                        this.s.clear();
                        if (n4 == 0) {
                            this.F = 0;
                        } else if (n4 == 1) {
                            this.F = 1;
                        }
                    }
                }
            }
        }
        this.K = zp2;
        this.J = l2;
        this.L = n4;
    }

    @Override
    protected void a(int n2, int n3, int n4, long l2) {
        zp zp2 = this.c(n2, n3);
        abu abu2 = this.k.h.bm.o();
        if (this.v != null && this.k.u.z) {
            if (n4 == 0 || n4 == 1) {
                if (this.x == null) {
                    if (zp2 != this.v) {
                        this.x = this.v.d().m();
                    }
                } else if (this.x.b > 1 && zp2 != null && yj.a(zp2, this.x, false)) {
                    long l3 = azi.K();
                    if (this.D == zp2) {
                        if (l3 - this.E > 500L) {
                            this.a(this.v, this.v.g, 0, 0);
                            this.a(zp2, zp2.g, 1, 0);
                            this.a(this.v, this.v.g, 0, 0);
                            this.E = l3 + 750L;
                            --this.x.b;
                        }
                    } else {
                        this.D = zp2;
                        this.E = l3;
                    }
                }
            }
        } else if (this.t && zp2 != null && abu2 != null && abu2.b > this.s.size() && yj.a(zp2, abu2, true) && zp2.a(abu2) && this.h.b(zp2)) {
            this.s.add(zp2);
            this.g();
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        zp zp2 = this.c(n2, n3);
        int n5 = this.i;
        int n6 = this.r;
        boolean bl2 = n2 < n5 || n3 < n6 || n2 >= n5 + this.f || n3 >= n6 + this.g;
        int n7 = -1;
        if (zp2 != null) {
            n7 = zp2.g;
        }
        if (bl2) {
            n7 = -999;
        }
        if (this.M && zp2 != null && n4 == 0 && this.h.a(null, zp2)) {
            if (bdn.n()) {
                if (zp2 != null && zp2.f != null && this.N != null) {
                    for (zp zp3 : this.h.c) {
                        if (zp3 == null || !zp3.a(this.k.h) || !zp3.e() || zp3.f != zp2.f || !yj.a(zp3, this.N, true)) continue;
                        this.a(zp3, zp3.g, n4, 1);
                    }
                }
            } else {
                this.a(zp2, n7, n4, 6);
            }
            this.M = false;
            this.J = 0L;
        } else {
            if (this.t && this.G != n4) {
                this.t = false;
                this.s.clear();
                this.H = true;
                return;
            }
            if (this.H) {
                this.H = false;
                return;
            }
            if (this.v != null && this.k.u.z) {
                if (n4 == 0 || n4 == 1) {
                    if (this.x == null && zp2 != this.v) {
                        this.x = this.v.d();
                    }
                    boolean bl3 = yj.a(zp2, this.x, false);
                    if (n7 != -1 && this.x != null && bl3) {
                        this.a(this.v, this.v.g, n4, 0);
                        this.a(zp2, n7, 0, 0);
                        if (this.k.h.bm.o() != null) {
                            this.a(this.v, this.v.g, n4, 0);
                            this.y = n2 - n5;
                            this.z = n3 - n6;
                            this.A = this.v;
                            this.C = this.x;
                            this.B = azi.K();
                        } else {
                            this.C = null;
                        }
                    } else if (this.x != null) {
                        this.y = n2 - n5;
                        this.z = n3 - n6;
                        this.A = this.v;
                        this.C = this.x;
                        this.B = azi.K();
                    }
                    this.x = null;
                    this.v = null;
                }
            } else if (this.t && !this.s.isEmpty()) {
                this.a(null, -999, yj.d(0, this.F), 5);
                for (zp zp4 : this.s) {
                    this.a(zp4, zp4.g, yj.d(1, this.F), 5);
                }
                this.a(null, -999, yj.d(2, this.F), 5);
            } else if (this.k.h.bm.o() != null) {
                if (n4 == this.k.u.af.i() + 100) {
                    this.a(zp2, n7, n4, 3);
                } else {
                    boolean bl4;
                    boolean bl5 = bl4 = n7 != -999 && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54));
                    if (bl4) {
                        this.N = zp2 != null && zp2.e() ? zp2.d() : null;
                    }
                    this.a(zp2, n7, n4, bl4 ? 1 : 0);
                }
            }
        }
        if (this.k.h.bm.o() == null) {
            this.J = 0L;
        }
        this.t = false;
    }

    private boolean a(zp zp2, int n2, int n3) {
        return this.c(zp2.h, zp2.i, 16, 16, n2, n3);
    }

    protected boolean c(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = this.i;
        int n9 = this.r;
        return (n6 -= n8) >= n2 - 1 && n6 < n2 + n4 + 1 && (n7 -= n9) >= n3 - 1 && n7 < n3 + n5 + 1;
    }

    protected void a(zp zp2, int n2, int n3, int n4) {
        if (zp2 != null) {
            n2 = zp2.g;
        }
        this.k.c.a(this.h.d, n2, n3, n4, this.k.h);
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1 || n2 == this.k.u.ab.i()) {
            this.k.h.k();
        }
        this.a(n2);
        if (this.u != null && this.u.e()) {
            if (n2 == this.k.u.af.i()) {
                this.a(this.u, this.u.g, 0, 3);
            } else if (n2 == this.k.u.ad.i()) {
                this.a(this.u, this.u.g, bdn.m() ? 1 : 0, 4);
            }
        }
    }

    protected boolean a(int n2) {
        if (this.k.h.bm.o() == null && this.u != null) {
            for (int i2 = 0; i2 < 9; ++i2) {
                if (n2 != this.k.u.as[i2].i()) continue;
                this.a(this.u, this.u.g, i2, 2);
                return true;
            }
        }
        return false;
    }

    @Override
    public void b() {
        if (this.k.h == null) {
            return;
        }
        this.h.b(this.k.h);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void c() {
        super.c();
        if (!this.k.h.Y() || this.k.h.K) {
            this.k.h.k();
        }
    }
}

