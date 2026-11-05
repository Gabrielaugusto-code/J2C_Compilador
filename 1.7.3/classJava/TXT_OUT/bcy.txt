/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class bcy
extends bcl
implements bdh {
    private static final int y = nt.a * 24 - 112;
    private static final int z = nt.b * 24 - 112;
    private static final int A = nt.c * 24 - 77;
    private static final int B = nt.d * 24 - 77;
    private static final brq C = new brq("textures/gui/achievement/achievement_background.png");
    protected bcl a;
    protected int f = 256;
    protected int g = 202;
    protected int h;
    protected int i;
    protected float r = 1.0f;
    protected double s;
    protected double t;
    protected double u;
    protected double v;
    protected double w;
    protected double x;
    private int D;
    private oh E;
    private boolean F = true;

    public bcy(bcl bcl2, oh oh2) {
        this.a = bcl2;
        this.E = oh2;
        int n2 = 141;
        int n3 = 141;
        this.u = this.w = (double)(nt.f.a * 24 - n2 / 2 - 12);
        this.s = this.w;
        this.v = this.x = (double)(nt.f.b * 24 - n3 / 2);
        this.t = this.x;
    }

    @Override
    public void r_() {
        this.k.v().a(new ij(ik.b));
        this.n.clear();
        this.n.add(new bbc(1, this.l / 2 + 24, this.m / 2 + 74, 80, 20, bsc.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(bau bau2) {
        if (this.F) {
            return;
        }
        if (bau2.k == 1) {
            this.k.a(this.a);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == this.k.u.ab.i()) {
            this.k.a((bcl)null);
            this.k.l();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.F) {
            this.q_();
            this.a(this.q, bsc.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 0xFFFFFF);
            this.a(this.q, b_[(int)(azi.K() / 150L % (long)b_.length)], this.l / 2, this.m / 2 + this.q.a * 2, 0xFFFFFF);
        } else {
            int n4;
            if (Mouse.isButtonDown((int)0)) {
                n4 = (this.l - this.f) / 2;
                int n5 = (this.m - this.g) / 2;
                int n6 = n4 + 8;
                int n7 = n5 + 17;
                if ((this.D == 0 || this.D == 1) && n2 >= n6 && n2 < n6 + 224 && n3 >= n7 && n3 < n7 + 155) {
                    if (this.D == 0) {
                        this.D = 1;
                    } else {
                        this.u -= (double)((float)(n2 - this.h) * this.r);
                        this.v -= (double)((float)(n3 - this.i) * this.r);
                        this.w = this.s = this.u;
                        this.x = this.t = this.v;
                    }
                    this.h = n2;
                    this.i = n3;
                }
            } else {
                this.D = 0;
            }
            n4 = Mouse.getDWheel();
            float f3 = this.r;
            if (n4 < 0) {
                this.r += 0.25f;
            } else if (n4 > 0) {
                this.r -= 0.25f;
            }
            this.r = oy.a(this.r, 1.0f, 2.0f);
            if (this.r != f3) {
                float f4 = f3 - this.r;
                float f5 = f3 * (float)this.f;
                float f6 = f3 * (float)this.g;
                float f7 = this.r * (float)this.f;
                float f8 = this.r * (float)this.g;
                this.u -= (double)((f7 - f5) * 0.5f);
                this.v -= (double)((f8 - f6) * 0.5f);
                this.w = this.s = this.u;
                this.x = this.t = this.v;
            }
            if (this.w < (double)y) {
                this.w = y;
            }
            if (this.x < (double)z) {
                this.x = z;
            }
            if (this.w >= (double)A) {
                this.w = A - 1;
            }
            if (this.x >= (double)B) {
                this.x = B - 1;
            }
            this.q_();
            this.b(n2, n3, f2);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2929);
            this.h();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
        }
    }

    @Override
    public void g() {
        if (this.F) {
            this.F = false;
        }
    }

    @Override
    public void c() {
        if (this.F) {
            return;
        }
        this.s = this.u;
        this.t = this.v;
        double d2 = this.w - this.u;
        double d3 = this.x - this.v;
        if (d2 * d2 + d3 * d3 < 4.0) {
            this.u += d2;
            this.v += d3;
        } else {
            this.u += d2 * 0.85;
            this.v += d3 * 0.85;
        }
    }

    protected void h() {
        int n2 = (this.l - this.f) / 2;
        int n3 = (this.m - this.g) / 2;
        this.q.b(bsc.a("gui.achievements", new Object[0]), n2 + 15, n3 + 5, 0x404040);
    }

    protected void b(int n2, int n3, float f2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = oy.c(this.s + (this.u - this.s) * (double)f2);
        int n10 = oy.c(this.t + (this.v - this.t) * (double)f2);
        if (n9 < y) {
            n9 = y;
        }
        if (n10 < z) {
            n10 = z;
        }
        if (n9 >= A) {
            n9 = A - 1;
        }
        if (n10 >= B) {
            n10 = B - 1;
        }
        int n11 = (this.l - this.f) / 2;
        int n12 = (this.m - this.g) / 2;
        int n13 = n11 + 16;
        int n14 = n12 + 17;
        this.e = 0.0f;
        GL11.glDepthFunc((int)518);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n13, (float)n14, (float)-200.0f);
        GL11.glScalef((float)(1.0f / this.r), (float)(1.0f / this.r), (float)0.0f);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)32826);
        GL11.glEnable((int)2903);
        int n15 = n9 + 288 >> 4;
        int n16 = n10 + 288 >> 4;
        int n17 = (n9 + 288) % 16;
        int n18 = (n10 + 288) % 16;
        int n19 = 4;
        int n20 = 8;
        int n21 = 10;
        int n22 = 22;
        int n23 = 37;
        Random random = new Random();
        float f3 = 16.0f / this.r;
        float f4 = 16.0f / this.r;
        int n24 = 0;
        while ((float)n24 * f3 - (float)n18 < 155.0f) {
            float f5 = 0.6f - (float)(n16 + n24) / 25.0f * 0.3f;
            GL11.glColor4f((float)f5, (float)f5, (float)f5, (float)1.0f);
            n8 = 0;
            while ((float)n8 * f4 - (float)n17 < 224.0f) {
                random.setSeed(this.k.M().b().hashCode() + (n15 + n8) + (n16 + n24) * 16);
                n7 = random.nextInt(1 + n16 + n24) + (n16 + n24) / 2;
                pw pw2 = aie.m.a(0, 0);
                if (n7 > 37 || n16 + n24 == 35) {
                    pw2 = aie.h.a(0, 0);
                } else if (n7 == 22) {
                    pw2 = random.nextInt(2) == 0 ? aie.ag.a(0, 0) : aie.ax.a(0, 0);
                } else if (n7 == 10) {
                    pw2 = aie.p.a(0, 0);
                } else if (n7 == 8) {
                    pw2 = aie.q.a(0, 0);
                } else if (n7 > 4) {
                    pw2 = aie.b.a(0, 0);
                } else if (n7 > 0) {
                    pw2 = aie.d.a(0, 0);
                }
                this.k.P().a(bqs.b);
                this.a(n8 * 16 - n17, n24 * 16 - n18, pw2, 16, 16);
                ++n8;
            }
            ++n24;
        }
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        this.k.P().a(C);
        for (n24 = 0; n24 < nt.e.size(); ++n24) {
            ns ns2 = (ns)nt.e.get(n24);
            if (ns2.c == null) continue;
            n8 = ns2.a * 24 - n9 + 11;
            n7 = ns2.b * 24 - n10 + 11;
            int n25 = ns2.c.a * 24 - n9 + 11;
            int n26 = ns2.c.b * 24 - n10 + 11;
            n6 = this.E.a(ns2) ? 1 : 0;
            n5 = this.E.b(ns2) ? 1 : 0;
            n4 = this.E.c(ns2);
            if (n4 > 4) continue;
            int n27 = -16777216;
            if (n6 != 0) {
                n27 = -6250336;
            } else if (n5 != 0) {
                n27 = -16711936;
            }
            this.a(n8, n25, n7, n27);
            this.b(n25, n7, n26, n27);
            if (n8 > n25) {
                this.b(n8 - 11 - 7, n7 - 5, 114, 234, 7, 11);
                continue;
            }
            if (n8 < n25) {
                this.b(n8 + 11, n7 - 5, 107, 234, 7, 11);
                continue;
            }
            if (n7 > n26) {
                this.b(n8 - 5, n7 - 11 - 7, 96, 234, 11, 7);
                continue;
            }
            if (n7 >= n26) continue;
            this.b(n8 - 5, n7 + 11, 96, 241, 11, 7);
        }
        ns ns3 = null;
        bor bor2 = new bor();
        float f6 = (float)(n2 - n13) * this.r;
        float f7 = (float)(n3 - n14) * this.r;
        azg.c();
        GL11.glDisable((int)2896);
        GL11.glEnable((int)32826);
        GL11.glEnable((int)2903);
        for (int i2 = 0; i2 < nt.e.size(); ++i2) {
            float f8;
            ns ns4 = (ns)nt.e.get(i2);
            n6 = ns4.a * 24 - n9;
            n5 = ns4.b * 24 - n10;
            if (n6 < -24 || n5 < -24 || !((float)n6 <= 224.0f * this.r) || !((float)n5 <= 155.0f * this.r)) continue;
            n4 = this.E.c(ns4);
            if (this.E.a(ns4)) {
                f8 = 0.75f;
                GL11.glColor4f((float)f8, (float)f8, (float)f8, (float)1.0f);
            } else if (this.E.b(ns4)) {
                f8 = 1.0f;
                GL11.glColor4f((float)f8, (float)f8, (float)f8, (float)1.0f);
            } else if (n4 < 3) {
                f8 = 0.3f;
                GL11.glColor4f((float)f8, (float)f8, (float)f8, (float)1.0f);
            } else if (n4 == 3) {
                f8 = 0.2f;
                GL11.glColor4f((float)f8, (float)f8, (float)f8, (float)1.0f);
            } else {
                if (n4 != 4) continue;
                f8 = 0.1f;
                GL11.glColor4f((float)f8, (float)f8, (float)f8, (float)1.0f);
            }
            this.k.P().a(C);
            if (ns4.g()) {
                this.b(n6 - 2, n5 - 2, 26, 202, 26, 26);
            } else {
                this.b(n6 - 2, n5 - 2, 0, 202, 26, 26);
            }
            if (!this.E.b(ns4)) {
                f8 = 0.1f;
                GL11.glColor4f((float)f8, (float)f8, (float)f8, (float)1.0f);
                bor2.a = false;
            }
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2884);
            bor2.b(this.k.l, this.k.P(), ns4.d, n6 + 3, n5 + 3);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)2896);
            if (!this.E.b(ns4)) {
                bor2.a = true;
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            if (!(f6 >= (float)n6) || !(f6 <= (float)(n6 + 22)) || !(f7 >= (float)n5) || !(f7 <= (float)(n5 + 22))) continue;
            ns3 = ns4;
        }
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(C);
        this.b(n11, n12, 0, 0, this.f, this.g);
        this.e = 0.0f;
        GL11.glDepthFunc((int)515);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3553);
        super.a(n2, n3, f2);
        if (ns3 != null) {
            String string = ns3.e().c();
            String string2 = ns3.f();
            n6 = n2 + 12;
            n5 = n3 - 4;
            n4 = this.E.c(ns3);
            if (this.E.b(ns3)) {
                int n28 = Math.max(this.q.a(string), 120);
                int n29 = this.q.b(string2, n28);
                if (this.E.a(ns3)) {
                    n29 += 12;
                }
                this.a(n6 - 3, n5 - 3, n6 + n28 + 3, n5 + n29 + 3 + 12, -1073741824, -1073741824);
                this.q.a(string2, n6, n5 + 12, n28, -6250336);
                if (this.E.a(ns3)) {
                    this.q.a(bsc.a("achievement.taken", new Object[0]), n6, n5 + n29 + 4, -7302913);
                }
            } else if (n4 == 3) {
                string = bsc.a("achievement.unknown", new Object[0]);
                int n30 = Math.max(this.q.a(string), 120);
                String string3 = new fi("achievement.requires", ns3.c.e()).c();
                int n31 = this.q.b(string3, n30);
                this.a(n6 - 3, n5 - 3, n6 + n30 + 3, n5 + n31 + 12 + 3, -1073741824, -1073741824);
                this.q.a(string3, n6, n5 + 12, n30, -9416624);
            } else if (n4 < 3) {
                int n32 = Math.max(this.q.a(string), 120);
                String string4 = new fi("achievement.requires", ns3.c.e()).c();
                int n33 = this.q.b(string4, n32);
                this.a(n6 - 3, n5 - 3, n6 + n32 + 3, n5 + n33 + 12 + 3, -1073741824, -1073741824);
                this.q.a(string4, n6, n5 + 12, n32, -9416624);
            } else {
                string = null;
            }
            if (string != null) {
                this.q.a(string, n6, n5, this.E.b(ns3) ? (ns3.g() ? -128 : -1) : (ns3.g() ? -8355776 : -8355712));
            }
        }
        GL11.glEnable((int)2929);
        GL11.glEnable((int)2896);
        azg.a();
    }

    @Override
    public boolean f() {
        return !this.F;
    }
}

