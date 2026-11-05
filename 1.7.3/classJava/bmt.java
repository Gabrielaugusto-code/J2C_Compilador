/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.ARBOcclusionQuery
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Maps;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class bmt
implements afy {
    private static final Logger m = LogManager.getLogger();
    private static final brq n = new brq("textures/environment/moon_phases.png");
    private static final brq o = new brq("textures/environment/sun.png");
    private static final brq p = new brq("textures/environment/clouds.png");
    private static final brq q = new brq("textures/environment/end_sky.png");
    public List a = new ArrayList();
    private bka r;
    private final bqy s;
    private List t = new ArrayList();
    private bmh[] u;
    private bmh[] v;
    private int w;
    private int x;
    private int y;
    private int z;
    private azi A;
    private bmf B;
    private IntBuffer C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private final Map O = new HashMap();
    private final Map P = Maps.newHashMap();
    private pw[] Q;
    private boolean R;
    private int S;
    private int T = -1;
    private int U = 2;
    private int V;
    private int W;
    private int X;
    IntBuffer b = azh.f(64);
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private List af = new ArrayList();
    private bmw[] ag = new bmw[]{new bmw(), new bmw(), new bmw(), new bmw()};
    double c = -9999.0;
    double d = -9999.0;
    double e = -9999.0;
    double f = -9999.0;
    double g = -9999.0;
    double h = -9999.0;
    int i = -999;
    int j = -999;
    int k = -999;
    int l;

    public bmt(azi azi2) {
        int n2;
        int n3;
        this.A = azi2;
        this.s = azi2.P();
        int n4 = 34;
        int n5 = 16;
        this.z = azh.a(n4 * n4 * n5 * 3);
        this.R = false;
        this.S = azh.a(1);
        this.D = baa.a();
        if (this.D) {
            this.b.clear();
            this.C = azh.f(n4 * n4 * n5);
            this.C.clear();
            this.C.position(0);
            this.C.limit(n4 * n4 * n5);
            ARBOcclusionQuery.glGenQueriesARB((IntBuffer)this.C);
        }
        this.F = azh.a(3);
        GL11.glPushMatrix();
        GL11.glNewList((int)this.F, (int)4864);
        this.i();
        GL11.glEndList();
        GL11.glPopMatrix();
        bna bna2 = bna.a;
        this.G = this.F + 1;
        GL11.glNewList((int)this.G, (int)4864);
        int n6 = 64;
        int n7 = 256 / n6 + 2;
        float f2 = 16.0f;
        for (n3 = -n6 * n7; n3 <= n6 * n7; n3 += n6) {
            for (n2 = -n6 * n7; n2 <= n6 * n7; n2 += n6) {
                bna2.b();
                bna2.a((double)(n3 + 0), (double)f2, (double)(n2 + 0));
                bna2.a((double)(n3 + n6), (double)f2, (double)(n2 + 0));
                bna2.a((double)(n3 + n6), (double)f2, (double)(n2 + n6));
                bna2.a((double)(n3 + 0), (double)f2, (double)(n2 + n6));
                bna2.a();
            }
        }
        GL11.glEndList();
        this.H = this.F + 2;
        GL11.glNewList((int)this.H, (int)4864);
        f2 = -16.0f;
        bna2.b();
        for (n3 = -n6 * n7; n3 <= n6 * n7; n3 += n6) {
            for (n2 = -n6 * n7; n2 <= n6 * n7; n2 += n6) {
                bna2.a((double)(n3 + n6), (double)f2, (double)(n2 + 0));
                bna2.a((double)(n3 + 0), (double)f2, (double)(n2 + 0));
                bna2.a((double)(n3 + 0), (double)f2, (double)(n2 + n6));
                bna2.a((double)(n3 + n6), (double)f2, (double)(n2 + n6));
            }
        }
        bna2.a();
        GL11.glEndList();
    }

    private void i() {
        Random random = new Random(10842L);
        bna bna2 = bna.a;
        bna2.b();
        for (int i2 = 0; i2 < 1500; ++i2) {
            double d2 = random.nextFloat() * 2.0f - 1.0f;
            double d3 = random.nextFloat() * 2.0f - 1.0f;
            double d4 = random.nextFloat() * 2.0f - 1.0f;
            double d5 = 0.15f + random.nextFloat() * 0.1f;
            double d6 = d2 * d2 + d3 * d3 + d4 * d4;
            if (!(d6 < 1.0) || !(d6 > 0.01)) continue;
            d6 = 1.0 / Math.sqrt(d6);
            double d7 = (d2 *= d6) * 100.0;
            double d8 = (d3 *= d6) * 100.0;
            double d9 = (d4 *= d6) * 100.0;
            double d10 = Math.atan2(d2, d4);
            double d11 = Math.sin(d10);
            double d12 = Math.cos(d10);
            double d13 = Math.atan2(Math.sqrt(d2 * d2 + d4 * d4), d3);
            double d14 = Math.sin(d13);
            double d15 = Math.cos(d13);
            double d16 = random.nextDouble() * Math.PI * 2.0;
            double d17 = Math.sin(d16);
            double d18 = Math.cos(d16);
            for (int i3 = 0; i3 < 4; ++i3) {
                double d19;
                double d20 = 0.0;
                double d21 = (double)((i3 & 2) - 1) * d5;
                double d22 = (double)((i3 + 1 & 2) - 1) * d5;
                double d23 = d20;
                double d24 = d21 * d18 - d22 * d17;
                double d25 = d19 = d22 * d18 + d21 * d17;
                double d26 = d24 * d14 + d23 * d15;
                double d27 = d23 * d14 - d24 * d15;
                double d28 = d27 * d11 - d25 * d12;
                double d29 = d26;
                double d30 = d25 * d11 + d27 * d12;
                bna2.a(d7 + d28, d8 + d29, d9 + d30);
            }
        }
        bna2.a();
    }

    public void a(bka bka2) {
        if (this.r != null) {
            this.r.b(this);
        }
        this.c = -9999.0;
        this.d = -9999.0;
        this.e = -9999.0;
        this.f = -9999.0;
        this.g = -9999.0;
        this.h = -9999.0;
        this.i = -9999;
        this.j = -9999;
        this.k = -9999;
        bog.a.a(bka2);
        this.r = bka2;
        this.B = new bmf(bka2);
        if (bka2 != null) {
            bka2.a(this);
            this.a();
        }
    }

    public void a() {
        rm rm2;
        int n2;
        int n3;
        if (this.r == null) {
            return;
        }
        aie.t.b(this.A.u.i);
        aie.u.b(this.A.u.i);
        this.T = this.A.u.c;
        if (this.v != null) {
            for (n3 = 0; n3 < this.v.length; ++n3) {
                this.v[n3].b();
            }
        }
        this.w = n3 = this.T * 2 + 1;
        this.x = 16;
        this.y = n3;
        this.v = new bmh[this.w * this.x * this.y];
        this.u = new bmh[this.w * this.x * this.y];
        int n4 = 0;
        int n5 = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = this.w;
        this.M = this.x;
        this.N = this.y;
        for (n2 = 0; n2 < this.t.size(); ++n2) {
            ((bmh)this.t.get((int)n2)).q = false;
        }
        this.t.clear();
        this.a.clear();
        this.b();
        for (n2 = 0; n2 < this.w; ++n2) {
            for (int i2 = 0; i2 < this.x; ++i2) {
                for (int i3 = 0; i3 < this.y; ++i3) {
                    this.v[(i3 * this.x + i2) * this.w + n2] = new bmh(this.r, this.a, n2 * 16, i2 * 16, i3 * 16, this.z + n4);
                    if (this.D) {
                        this.v[(i3 * this.x + i2) * this.w + n2].v = this.C.get(n5);
                    }
                    this.v[(i3 * this.x + i2) * this.w + n2].u = false;
                    this.v[(i3 * this.x + i2) * this.w + n2].t = true;
                    this.v[(i3 * this.x + i2) * this.w + n2].l = true;
                    this.v[(i3 * this.x + i2) * this.w + n2].s = n5++;
                    this.v[(i3 * this.x + i2) * this.w + n2].e();
                    this.u[(i3 * this.x + i2) * this.w + n2] = this.v[(i3 * this.x + i2) * this.w + n2];
                    this.t.add(this.v[(i3 * this.x + i2) * this.w + n2]);
                    n4 += 3;
                }
            }
        }
        if (this.r != null && (rm2 = this.A.i) != null) {
            this.c(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u));
            Arrays.sort(this.u, new bmj(rm2));
        }
        this.U = 2;
    }

    public void a(rm rm2, bno bno2, float f2) {
        qr qr2;
        int n2;
        if (this.U > 0) {
            --this.U;
            return;
        }
        double d2 = rm2.p + (rm2.s - rm2.p) * (double)f2;
        double d3 = rm2.q + (rm2.t - rm2.q) * (double)f2;
        double d4 = rm2.r + (rm2.u - rm2.r) * (double)f2;
        this.r.C.a("prepare");
        bnd.a.a(this.r, this.A.P(), this.A.l, this.A.i, f2);
        bog.a.a(this.r, this.A.P(), this.A.l, this.A.i, this.A.j, this.A.u, f2);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        rm rm3 = this.A.i;
        double d5 = rm3.S + (rm3.s - rm3.S) * (double)f2;
        double d6 = rm3.T + (rm3.t - rm3.T) * (double)f2;
        double d7 = rm3.U + (rm3.u - rm3.U) * (double)f2;
        bnd.b = d5;
        bnd.c = d6;
        bnd.d = d7;
        this.r.C.c("staticentities");
        if (this.R) {
            bog.b = 0.0;
            bog.c = 0.0;
            bog.d = 0.0;
            this.f();
        }
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glTranslated((double)(-d5), (double)(-d6), (double)(-d7));
        GL11.glCallList((int)this.S);
        GL11.glPopMatrix();
        bog.b = d5;
        bog.c = d6;
        bog.d = d7;
        this.A.p.b((double)f2);
        this.r.C.c("global");
        List list = this.r.D();
        this.V = list.size();
        for (n2 = 0; n2 < this.r.i.size(); ++n2) {
            qr2 = (qr)this.r.i.get(n2);
            ++this.W;
            if (!qr2.h(d2, d3, d4)) continue;
            bog.a.a(qr2, f2);
        }
        this.r.C.c("entities");
        for (n2 = 0; n2 < list.size(); ++n2) {
            rn rn2;
            boolean bl2;
            qr2 = (qr)list.get(n2);
            boolean bl3 = bl2 = qr2.h(d2, d3, d4) && (qr2.ak || bno2.a(qr2.C) || qr2.l == this.A.h);
            if (!bl2 && qr2 instanceof rn && (rn2 = (rn)qr2).bN() && rn2.bO() != null) {
                qr qr3 = rn2.bO();
                bl2 = bno2.a(qr3.C);
            }
            if (!bl2 || qr2 == this.A.i && this.A.u.ax == 0 && !this.A.i.bl() || !this.r.d(oy.c(qr2.s), 0, oy.c(qr2.u))) continue;
            ++this.W;
            bog.a.a(qr2, f2);
        }
        this.r.C.c("blockentities");
        azg.b();
        for (n2 = 0; n2 < this.a.size(); ++n2) {
            bnd.a.a((ani)this.a.get(n2), f2);
        }
        this.A.p.a((double)f2);
        this.r.C.b();
    }

    public String d() {
        return "C: " + this.ab + "/" + this.Y + ". F: " + this.Z + ", O: " + this.aa + ", E: " + this.ac;
    }

    public String e() {
        return "E: " + this.W + "/" + this.V + ". B: " + this.X + ", I: " + (this.V - this.X - this.W);
    }

    @Override
    public void b() {
        this.R = true;
    }

    public void f() {
        this.r.C.a("staticentityrebuild");
        GL11.glPushMatrix();
        GL11.glNewList((int)this.S, (int)4864);
        List list = this.r.D();
        this.R = false;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            qr qr2 = (qr)list.get(i2);
            if (!bog.a.a(qr2).a()) continue;
            this.R = this.R || !bog.a.a(qr2, 0.0f, true);
        }
        GL11.glEndList();
        GL11.glPopMatrix();
        this.r.C.b();
    }

    private void c(int n2, int n3, int n4) {
        n2 -= 8;
        n3 -= 8;
        n4 -= 8;
        this.I = Integer.MAX_VALUE;
        this.J = Integer.MAX_VALUE;
        this.K = Integer.MAX_VALUE;
        this.L = Integer.MIN_VALUE;
        this.M = Integer.MIN_VALUE;
        this.N = Integer.MIN_VALUE;
        int n5 = this.w * 16;
        int n6 = n5 / 2;
        for (int i2 = 0; i2 < this.w; ++i2) {
            int n7 = i2 * 16;
            int n8 = n7 + n6 - n2;
            if (n8 < 0) {
                n8 -= n5 - 1;
            }
            if ((n7 -= (n8 /= n5) * n5) < this.I) {
                this.I = n7;
            }
            if (n7 > this.L) {
                this.L = n7;
            }
            for (int i3 = 0; i3 < this.y; ++i3) {
                int n9 = i3 * 16;
                int n10 = n9 + n6 - n4;
                if (n10 < 0) {
                    n10 -= n5 - 1;
                }
                if ((n9 -= (n10 /= n5) * n5) < this.K) {
                    this.K = n9;
                }
                if (n9 > this.N) {
                    this.N = n9;
                }
                for (int i4 = 0; i4 < this.x; ++i4) {
                    int n11 = i4 * 16;
                    if (n11 < this.J) {
                        this.J = n11;
                    }
                    if (n11 > this.M) {
                        this.M = n11;
                    }
                    bmh bmh2 = this.v[(i3 * this.x + i4) * this.w + i2];
                    boolean bl2 = bmh2.q;
                    bmh2.a(n7, n11, n9);
                    if (bl2 || !bmh2.q) continue;
                    this.t.add(bmh2);
                }
            }
        }
    }

    public int a(rm rm2, int n2, double d2) {
        int n3;
        double d3;
        double d4;
        double d5;
        this.r.C.a("sortchunks");
        for (int i2 = 0; i2 < 10; ++i2) {
            this.ae = (this.ae + 1) % this.v.length;
            bmh bmh2 = this.v[this.ae];
            if (!bmh2.q || this.t.contains(bmh2)) continue;
            this.t.add(bmh2);
        }
        if (this.A.u.c != this.T) {
            this.a();
        }
        if (n2 == 0) {
            this.Y = 0;
            this.ad = 0;
            this.Z = 0;
            this.aa = 0;
            this.ab = 0;
            this.ac = 0;
        }
        double d6 = rm2.S + (rm2.s - rm2.S) * d2;
        double d7 = rm2.T + (rm2.t - rm2.T) * d2;
        double d8 = rm2.U + (rm2.u - rm2.U) * d2;
        double d9 = rm2.s - this.c;
        double d10 = rm2.t - this.d;
        double d11 = rm2.u - this.e;
        if (this.i != rm2.ah || this.j != rm2.ai || this.k != rm2.aj || d9 * d9 + d10 * d10 + d11 * d11 > 16.0) {
            this.c = rm2.s;
            this.d = rm2.t;
            this.e = rm2.u;
            this.i = rm2.ah;
            this.j = rm2.ai;
            this.k = rm2.aj;
            this.c(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u));
            Arrays.sort(this.u, new bmj(rm2));
        }
        if ((d5 = rm2.s - this.f) * d5 + (d4 = rm2.t - this.g) * d4 + (d3 = rm2.u - this.h) * d3 > 1.0) {
            this.f = rm2.s;
            this.g = rm2.t;
            this.h = rm2.u;
            for (n3 = 0; n3 < 27; ++n3) {
                this.u[n3].b(rm2);
            }
        }
        azg.a();
        n3 = 0;
        if (this.D && this.A.u.f && !this.A.u.e && n2 == 0) {
            int n4 = 0;
            int n5 = 16;
            this.a(n4, n5);
            for (int i3 = n4; i3 < n5; ++i3) {
                this.u[i3].t = true;
            }
            this.r.C.c("render");
            n3 += this.a(n4, n5, n2, d2);
            do {
                this.r.C.c("occ");
                n4 = n5;
                if ((n5 *= 2) > this.u.length) {
                    n5 = this.u.length;
                }
                GL11.glDisable((int)3553);
                GL11.glDisable((int)2896);
                GL11.glDisable((int)3008);
                GL11.glDisable((int)2912);
                GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
                GL11.glDepthMask((boolean)false);
                this.r.C.a("check");
                this.a(n4, n5);
                this.r.C.b();
                GL11.glPushMatrix();
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (int i4 = n4; i4 < n5; ++i4) {
                    float f5;
                    int n6;
                    if (this.u[i4].d()) {
                        this.u[i4].l = false;
                        continue;
                    }
                    if (!this.u[i4].l) {
                        this.u[i4].t = true;
                    }
                    if (!this.u[i4].l || this.u[i4].u || this.E % (n6 = (int)(1.0f + (f5 = oy.c(this.u[i4].a((qr)rm2))) / 128.0f)) != i4 % n6) continue;
                    bmh bmh3 = this.u[i4];
                    float f6 = (float)((double)bmh3.f - d6);
                    float f7 = (float)((double)bmh3.g - d7);
                    float f8 = (float)((double)bmh3.h - d8);
                    float f9 = f6 - f2;
                    float f10 = f7 - f3;
                    float f11 = f8 - f4;
                    if (f9 != 0.0f || f10 != 0.0f || f11 != 0.0f) {
                        GL11.glTranslatef((float)f9, (float)f10, (float)f11);
                        f2 += f9;
                        f3 += f10;
                        f4 += f11;
                    }
                    this.r.C.a("bb");
                    ARBOcclusionQuery.glBeginQueryARB((int)35092, (int)this.u[i4].v);
                    this.u[i4].c();
                    ARBOcclusionQuery.glEndQueryARB((int)35092);
                    this.r.C.b();
                    this.u[i4].u = true;
                }
                GL11.glPopMatrix();
                if (this.A.u.e) {
                    if (bmm.b == 0) {
                        GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)true);
                    } else {
                        GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)true);
                    }
                } else {
                    GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
                }
                GL11.glDepthMask((boolean)true);
                GL11.glEnable((int)3553);
                GL11.glEnable((int)3008);
                GL11.glEnable((int)2912);
                this.r.C.c("render");
                n3 += this.a(n4, n5, n2, d2);
            } while (n5 < this.u.length);
        } else {
            this.r.C.c("render");
            n3 += this.a(0, this.u.length, n2, d2);
        }
        this.r.C.b();
        return n3;
    }

    private void a(int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (!this.u[i2].u) continue;
            this.b.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB((int)this.u[i2].v, (int)34919, (IntBuffer)this.b);
            if (this.b.get(0) == 0) continue;
            this.u[i2].u = false;
            this.b.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB((int)this.u[i2].v, (int)34918, (IntBuffer)this.b);
            this.u[i2].t = this.b.get(0) != 0;
        }
    }

    private int a(int n2, int n3, int n4, double d2) {
        int n5;
        int n6;
        int n7;
        this.af.clear();
        int n8 = 0;
        int n9 = n2;
        int n10 = n3;
        int n11 = 1;
        if (n4 == 1) {
            n9 = this.u.length - 1 - n2;
            n10 = this.u.length - 1 - n3;
            n11 = -1;
        }
        for (int i2 = n9; i2 != n10; i2 += n11) {
            int n12;
            if (n4 == 0) {
                ++this.Y;
                if (this.u[i2].m[n4]) {
                    ++this.ac;
                } else if (!this.u[i2].l) {
                    ++this.Z;
                } else if (this.D && !this.u[i2].t) {
                    ++this.aa;
                } else {
                    ++this.ab;
                }
            }
            if (this.u[i2].m[n4] || !this.u[i2].l || this.D && !this.u[i2].t || (n12 = this.u[i2].a(n4)) < 0) continue;
            this.af.add(this.u[i2]);
            ++n8;
        }
        rm rm2 = this.A.i;
        double d3 = rm2.S + (rm2.s - rm2.S) * d2;
        double d4 = rm2.T + (rm2.t - rm2.T) * d2;
        double d5 = rm2.U + (rm2.u - rm2.U) * d2;
        int n13 = 0;
        for (n7 = 0; n7 < this.ag.length; ++n7) {
            this.ag[n7].b();
        }
        for (n7 = 0; n7 < this.af.size(); ++n7) {
            bmh bmh2 = (bmh)this.af.get(n7);
            n6 = -1;
            for (n5 = 0; n5 < n13; ++n5) {
                if (!this.ag[n5].a(bmh2.f, bmh2.g, bmh2.h)) continue;
                n6 = n5;
            }
            if (n6 < 0) {
                n6 = n13++;
                this.ag[n6].a(bmh2.f, bmh2.g, bmh2.h, d3, d4, d5);
            }
            this.ag[n6].a(bmh2.a(n4));
        }
        n7 = oy.c(d3);
        int n14 = oy.c(d5);
        n6 = n7 - (n7 & 0x3FF);
        n5 = n14 - (n14 & 0x3FF);
        Arrays.sort(this.ag, new bmk(n6, n5));
        this.a(n4, d2);
        return n8;
    }

    public void a(int n2, double d2) {
        this.A.p.b(d2);
        for (int i2 = 0; i2 < this.ag.length; ++i2) {
            this.ag[i2].a();
        }
        this.A.p.a(d2);
    }

    public void g() {
        ++this.E;
        if (this.E % 20 == 0) {
            Iterator iterator = this.O.values().iterator();
            while (iterator.hasNext()) {
                mc mc2 = (mc)iterator.next();
                int n2 = mc2.f();
                if (this.E - n2 <= 400) continue;
                iterator.remove();
            }
        }
    }

    public void a(float f2) {
        float f3;
        float f4;
        float f5;
        if (this.A.f.t.i == 1) {
            GL11.glDisable((int)2912);
            GL11.glDisable((int)3008);
            GL11.glEnable((int)3042);
            bwg.c(770, 771, 1, 0);
            azg.a();
            GL11.glDepthMask((boolean)false);
            this.s.a(q);
            bna bna2 = bna.a;
            for (int i2 = 0; i2 < 6; ++i2) {
                GL11.glPushMatrix();
                if (i2 == 1) {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (i2 == 2) {
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (i2 == 3) {
                    GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (i2 == 4) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
                if (i2 == 5) {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
                bna2.b();
                bna2.c(0x282828);
                bna2.a(-100.0, -100.0, -100.0, 0.0, 0.0);
                bna2.a(-100.0, -100.0, 100.0, 0.0, 16.0);
                bna2.a(100.0, -100.0, 100.0, 16.0, 16.0);
                bna2.a(100.0, -100.0, -100.0, 16.0, 0.0);
                bna2.a();
                GL11.glPopMatrix();
            }
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            return;
        }
        if (!this.A.f.t.d()) {
            return;
        }
        GL11.glDisable((int)3553);
        ayp ayp2 = this.r.a((qr)this.A.i, f2);
        float f6 = (float)ayp2.c;
        float f7 = (float)ayp2.d;
        float f8 = (float)ayp2.e;
        if (this.A.u.e) {
            float f9 = (f6 * 30.0f + f7 * 59.0f + f8 * 11.0f) / 100.0f;
            float f10 = (f6 * 30.0f + f7 * 70.0f) / 100.0f;
            f5 = (f6 * 30.0f + f8 * 70.0f) / 100.0f;
            f6 = f9;
            f7 = f10;
            f8 = f5;
        }
        GL11.glColor3f((float)f6, (float)f7, (float)f8);
        bna bna3 = bna.a;
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2912);
        GL11.glColor3f((float)f6, (float)f7, (float)f8);
        GL11.glCallList((int)this.G);
        GL11.glDisable((int)2912);
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        azg.a();
        float[] fArray = this.r.t.a(this.r.c(f2), f2);
        if (fArray != null) {
            float f11;
            GL11.glDisable((int)3553);
            GL11.glShadeModel((int)7425);
            GL11.glPushMatrix();
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(oy.a(this.r.d(f2)) < 0.0f ? 180.0f : 0.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            f5 = fArray[0];
            f4 = fArray[1];
            f3 = fArray[2];
            if (this.A.u.e) {
                float f12 = (f5 * 30.0f + f4 * 59.0f + f3 * 11.0f) / 100.0f;
                float f13 = (f5 * 30.0f + f4 * 70.0f) / 100.0f;
                f11 = (f5 * 30.0f + f3 * 70.0f) / 100.0f;
                f5 = f12;
                f4 = f13;
                f3 = f11;
            }
            bna3.a(6);
            bna3.a(f5, f4, f3, fArray[3]);
            bna3.a(0.0, 100.0, 0.0);
            int n2 = 16;
            bna3.a(fArray[0], fArray[1], fArray[2], 0.0f);
            for (int i3 = 0; i3 <= n2; ++i3) {
                f11 = (float)i3 * (float)Math.PI * 2.0f / (float)n2;
                float f14 = oy.a(f11);
                float f15 = oy.b(f11);
                bna3.a((double)(f14 * 120.0f), (double)(f15 * 120.0f), (double)(-f15 * 40.0f * fArray[3]));
            }
            bna3.a();
            GL11.glPopMatrix();
            GL11.glShadeModel((int)7424);
        }
        GL11.glEnable((int)3553);
        bwg.c(770, 1, 1, 0);
        GL11.glPushMatrix();
        f5 = 1.0f - this.r.j(f2);
        f4 = 0.0f;
        f3 = 0.0f;
        float f16 = 0.0f;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f5);
        GL11.glTranslatef((float)f4, (float)f3, (float)f16);
        GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(this.r.c(f2) * 360.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        float f17 = 30.0f;
        this.s.a(o);
        bna3.b();
        bna3.a(-f17, 100.0, -f17, 0.0, 0.0);
        bna3.a(f17, 100.0, -f17, 1.0, 0.0);
        bna3.a(f17, 100.0, f17, 1.0, 1.0);
        bna3.a(-f17, 100.0, f17, 0.0, 1.0);
        bna3.a();
        f17 = 20.0f;
        this.s.a(n);
        int n3 = this.r.x();
        int n4 = n3 % 4;
        int n5 = n3 / 4 % 2;
        float f18 = (float)(n4 + 0) / 4.0f;
        float f19 = (float)(n5 + 0) / 2.0f;
        float f20 = (float)(n4 + 1) / 4.0f;
        float f21 = (float)(n5 + 1) / 2.0f;
        bna3.b();
        bna3.a(-f17, -100.0, f17, f20, f21);
        bna3.a(f17, -100.0, f17, f18, f21);
        bna3.a(f17, -100.0, -f17, f18, f19);
        bna3.a(-f17, -100.0, -f17, f20, f19);
        bna3.a();
        GL11.glDisable((int)3553);
        float f22 = this.r.g(f2) * f5;
        if (f22 > 0.0f) {
            GL11.glColor4f((float)f22, (float)f22, (float)f22, (float)f22);
            GL11.glCallList((int)this.F);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glEnable((int)2912);
        GL11.glPopMatrix();
        GL11.glDisable((int)3553);
        GL11.glColor3f((float)0.0f, (float)0.0f, (float)0.0f);
        double d2 = this.A.h.l((float)f2).d - this.r.U();
        if (d2 < 0.0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)12.0f, (float)0.0f);
            GL11.glCallList((int)this.H);
            GL11.glPopMatrix();
            f3 = 1.0f;
            f16 = -((float)(d2 + 65.0));
            f17 = -f3;
            float f23 = f16;
            bna3.b();
            bna3.a(0, 255);
            bna3.a((double)(-f3), (double)f23, (double)f3);
            bna3.a((double)f3, (double)f23, (double)f3);
            bna3.a((double)f3, (double)f17, (double)f3);
            bna3.a((double)(-f3), (double)f17, (double)f3);
            bna3.a((double)(-f3), (double)f17, (double)(-f3));
            bna3.a((double)f3, (double)f17, (double)(-f3));
            bna3.a((double)f3, (double)f23, (double)(-f3));
            bna3.a((double)(-f3), (double)f23, (double)(-f3));
            bna3.a((double)f3, (double)f17, (double)(-f3));
            bna3.a((double)f3, (double)f17, (double)f3);
            bna3.a((double)f3, (double)f23, (double)f3);
            bna3.a((double)f3, (double)f23, (double)(-f3));
            bna3.a((double)(-f3), (double)f23, (double)(-f3));
            bna3.a((double)(-f3), (double)f23, (double)f3);
            bna3.a((double)(-f3), (double)f17, (double)f3);
            bna3.a((double)(-f3), (double)f17, (double)(-f3));
            bna3.a((double)(-f3), (double)f17, (double)(-f3));
            bna3.a((double)(-f3), (double)f17, (double)f3);
            bna3.a((double)f3, (double)f17, (double)f3);
            bna3.a((double)f3, (double)f17, (double)(-f3));
            bna3.a();
        }
        if (this.r.t.g()) {
            GL11.glColor3f((float)(f6 * 0.2f + 0.04f), (float)(f7 * 0.2f + 0.04f), (float)(f8 * 0.6f + 0.1f));
        } else {
            GL11.glColor3f((float)f6, (float)f7, (float)f8);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)(-((float)(d2 - 16.0))), (float)0.0f);
        GL11.glCallList((int)this.H);
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDepthMask((boolean)true);
    }

    public void b(float f2) {
        float f3;
        if (!this.A.f.t.d()) {
            return;
        }
        if (this.A.u.i) {
            this.c(f2);
            return;
        }
        GL11.glDisable((int)2884);
        float f4 = (float)(this.A.i.T + (this.A.i.t - this.A.i.T) * (double)f2);
        int n2 = 32;
        int n3 = 256 / n2;
        bna bna2 = bna.a;
        this.s.a(p);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        ayp ayp2 = this.r.e(f2);
        float f5 = (float)ayp2.c;
        float f6 = (float)ayp2.d;
        float f7 = (float)ayp2.e;
        if (this.A.u.e) {
            f3 = (f5 * 30.0f + f6 * 59.0f + f7 * 11.0f) / 100.0f;
            float f8 = (f5 * 30.0f + f6 * 70.0f) / 100.0f;
            float f9 = (f5 * 30.0f + f7 * 70.0f) / 100.0f;
            f5 = f3;
            f6 = f8;
            f7 = f9;
        }
        f3 = 4.8828125E-4f;
        double d2 = (float)this.E + f2;
        double d3 = this.A.i.p + (this.A.i.s - this.A.i.p) * (double)f2 + d2 * (double)0.03f;
        double d4 = this.A.i.r + (this.A.i.u - this.A.i.r) * (double)f2;
        int n4 = oy.c(d3 / 2048.0);
        int n5 = oy.c(d4 / 2048.0);
        float f10 = this.r.t.f() - f4 + 0.33f;
        float f11 = (float)((d3 -= (double)(n4 * 2048)) * (double)f3);
        float f12 = (float)((d4 -= (double)(n5 * 2048)) * (double)f3);
        bna2.b();
        bna2.a(f5, f6, f7, 0.8f);
        for (int i2 = -n2 * n3; i2 < n2 * n3; i2 += n2) {
            for (int i3 = -n2 * n3; i3 < n2 * n3; i3 += n2) {
                bna2.a(i2 + 0, f10, i3 + n2, (float)(i2 + 0) * f3 + f11, (float)(i3 + n2) * f3 + f12);
                bna2.a(i2 + n2, f10, i3 + n2, (float)(i2 + n2) * f3 + f11, (float)(i3 + n2) * f3 + f12);
                bna2.a(i2 + n2, f10, i3 + 0, (float)(i2 + n2) * f3 + f11, (float)(i3 + 0) * f3 + f12);
                bna2.a(i2 + 0, f10, i3 + 0, (float)(i2 + 0) * f3 + f11, (float)(i3 + 0) * f3 + f12);
            }
        }
        bna2.a();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2884);
    }

    public boolean a(double d2, double d3, double d4, float f2) {
        return false;
    }

    public void c(float f2) {
        float f3;
        float f4;
        float f5;
        GL11.glDisable((int)2884);
        float f6 = (float)(this.A.i.T + (this.A.i.t - this.A.i.T) * (double)f2);
        bna bna2 = bna.a;
        float f7 = 12.0f;
        float f8 = 4.0f;
        double d2 = (float)this.E + f2;
        double d3 = (this.A.i.p + (this.A.i.s - this.A.i.p) * (double)f2 + d2 * (double)0.03f) / (double)f7;
        double d4 = (this.A.i.r + (this.A.i.u - this.A.i.r) * (double)f2) / (double)f7 + (double)0.33f;
        float f9 = this.r.t.f() - f6 + 0.33f;
        int n2 = oy.c(d3 / 2048.0);
        int n3 = oy.c(d4 / 2048.0);
        d3 -= (double)(n2 * 2048);
        d4 -= (double)(n3 * 2048);
        this.s.a(p);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        ayp ayp2 = this.r.e(f2);
        float f10 = (float)ayp2.c;
        float f11 = (float)ayp2.d;
        float f12 = (float)ayp2.e;
        if (this.A.u.e) {
            f5 = (f10 * 30.0f + f11 * 59.0f + f12 * 11.0f) / 100.0f;
            f4 = (f10 * 30.0f + f11 * 70.0f) / 100.0f;
            f3 = (f10 * 30.0f + f12 * 70.0f) / 100.0f;
            f10 = f5;
            f11 = f4;
            f12 = f3;
        }
        f5 = (float)(d3 * 0.0);
        f4 = (float)(d4 * 0.0);
        f3 = 0.00390625f;
        f5 = (float)oy.c(d3) * f3;
        f4 = (float)oy.c(d4) * f3;
        float f13 = (float)(d3 - (double)oy.c(d3));
        float f14 = (float)(d4 - (double)oy.c(d4));
        int n4 = 8;
        int n5 = 4;
        float f15 = 9.765625E-4f;
        GL11.glScalef((float)f7, (float)1.0f, (float)f7);
        for (int i2 = 0; i2 < 2; ++i2) {
            if (i2 == 0) {
                GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
            } else if (this.A.u.e) {
                if (bmm.b == 0) {
                    GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)true);
                } else {
                    GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)true);
                }
            } else {
                GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            }
            for (int i3 = -n5 + 1; i3 <= n5; ++i3) {
                for (int i4 = -n5 + 1; i4 <= n5; ++i4) {
                    int n6;
                    bna2.b();
                    float f16 = i3 * n4;
                    float f17 = i4 * n4;
                    float f18 = f16 - f13;
                    float f19 = f17 - f14;
                    if (f9 > -f8 - 1.0f) {
                        bna2.a(f10 * 0.7f, f11 * 0.7f, f12 * 0.7f, 0.8f);
                        bna2.c(0.0f, -1.0f, 0.0f);
                        bna2.a(f18 + 0.0f, f9 + 0.0f, f19 + (float)n4, (f16 + 0.0f) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                        bna2.a(f18 + (float)n4, f9 + 0.0f, f19 + (float)n4, (f16 + (float)n4) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                        bna2.a(f18 + (float)n4, f9 + 0.0f, f19 + 0.0f, (f16 + (float)n4) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                        bna2.a(f18 + 0.0f, f9 + 0.0f, f19 + 0.0f, (f16 + 0.0f) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                    }
                    if (f9 <= f8 + 1.0f) {
                        bna2.a(f10, f11, f12, 0.8f);
                        bna2.c(0.0f, 1.0f, 0.0f);
                        bna2.a(f18 + 0.0f, f9 + f8 - f15, f19 + (float)n4, (f16 + 0.0f) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                        bna2.a(f18 + (float)n4, f9 + f8 - f15, f19 + (float)n4, (f16 + (float)n4) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                        bna2.a(f18 + (float)n4, f9 + f8 - f15, f19 + 0.0f, (f16 + (float)n4) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                        bna2.a(f18 + 0.0f, f9 + f8 - f15, f19 + 0.0f, (f16 + 0.0f) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                    }
                    bna2.a(f10 * 0.9f, f11 * 0.9f, f12 * 0.9f, 0.8f);
                    if (i3 > -1) {
                        bna2.c(-1.0f, 0.0f, 0.0f);
                        for (n6 = 0; n6 < n4; ++n6) {
                            bna2.a(f18 + (float)n6 + 0.0f, f9 + 0.0f, f19 + (float)n4, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                            bna2.a(f18 + (float)n6 + 0.0f, f9 + f8, f19 + (float)n4, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                            bna2.a(f18 + (float)n6 + 0.0f, f9 + f8, f19 + 0.0f, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                            bna2.a(f18 + (float)n6 + 0.0f, f9 + 0.0f, f19 + 0.0f, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                        }
                    }
                    if (i3 <= 1) {
                        bna2.c(1.0f, 0.0f, 0.0f);
                        for (n6 = 0; n6 < n4; ++n6) {
                            bna2.a(f18 + (float)n6 + 1.0f - f15, f9 + 0.0f, f19 + (float)n4, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                            bna2.a(f18 + (float)n6 + 1.0f - f15, f9 + f8, f19 + (float)n4, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + (float)n4) * f3 + f4);
                            bna2.a(f18 + (float)n6 + 1.0f - f15, f9 + f8, f19 + 0.0f, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                            bna2.a(f18 + (float)n6 + 1.0f - f15, f9 + 0.0f, f19 + 0.0f, (f16 + (float)n6 + 0.5f) * f3 + f5, (f17 + 0.0f) * f3 + f4);
                        }
                    }
                    bna2.a(f10 * 0.8f, f11 * 0.8f, f12 * 0.8f, 0.8f);
                    if (i4 > -1) {
                        bna2.c(0.0f, 0.0f, -1.0f);
                        for (n6 = 0; n6 < n4; ++n6) {
                            bna2.a(f18 + 0.0f, f9 + f8, f19 + (float)n6 + 0.0f, (f16 + 0.0f) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                            bna2.a(f18 + (float)n4, f9 + f8, f19 + (float)n6 + 0.0f, (f16 + (float)n4) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                            bna2.a(f18 + (float)n4, f9 + 0.0f, f19 + (float)n6 + 0.0f, (f16 + (float)n4) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                            bna2.a(f18 + 0.0f, f9 + 0.0f, f19 + (float)n6 + 0.0f, (f16 + 0.0f) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                        }
                    }
                    if (i4 <= 1) {
                        bna2.c(0.0f, 0.0f, 1.0f);
                        for (n6 = 0; n6 < n4; ++n6) {
                            bna2.a(f18 + 0.0f, f9 + f8, f19 + (float)n6 + 1.0f - f15, (f16 + 0.0f) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                            bna2.a(f18 + (float)n4, f9 + f8, f19 + (float)n6 + 1.0f - f15, (f16 + (float)n4) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                            bna2.a(f18 + (float)n4, f9 + 0.0f, f19 + (float)n6 + 1.0f - f15, (f16 + (float)n4) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                            bna2.a(f18 + 0.0f, f9 + 0.0f, f19 + (float)n6 + 1.0f - f15, (f16 + 0.0f) * f3 + f5, (f17 + (float)n6 + 0.5f) * f3 + f4);
                        }
                    }
                    bna2.a();
                }
            }
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2884);
    }

    public boolean a(rm rm2, boolean bl2) {
        int n2;
        int n3;
        bmh bmh2;
        int n4;
        int n5 = 2;
        bmi bmi2 = new bmi(rm2);
        bmh[] bmhArray = new bmh[n5];
        ArrayList<bmh> arrayList = null;
        int n6 = this.t.size();
        int n7 = 0;
        this.r.C.a("nearChunksSearch");
        for (n4 = 0; n4 < n6; ++n4) {
            bmh2 = (bmh)this.t.get(n4);
            if (bmh2 == null) continue;
            if (!bl2) {
                if (bmh2.a((qr)rm2) > 272.0f) {
                    int n8;
                    for (n8 = 0; n8 < n5 && (bmhArray[n8] == null || bmi2.a(bmhArray[n8], bmh2) <= 0); ++n8) {
                    }
                    if (--n8 <= 0) continue;
                    n3 = n8;
                    while (--n3 != 0) {
                        bmhArray[n3 - 1] = bmhArray[n3];
                    }
                    bmhArray[n8] = bmh2;
                    continue;
                }
            } else if (!bmh2.l) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<bmh>();
            }
            ++n7;
            arrayList.add(bmh2);
            this.t.set(n4, null);
        }
        this.r.C.b();
        this.r.C.a("sort");
        if (arrayList != null) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, bmi2);
            }
            for (n4 = arrayList.size() - 1; n4 >= 0; --n4) {
                bmh2 = (bmh)arrayList.get(n4);
                bmh2.a(rm2);
                bmh2.q = false;
            }
        }
        this.r.C.b();
        n4 = 0;
        this.r.C.a("rebuild");
        for (n2 = n5 - 1; n2 >= 0; --n2) {
            bmh bmh3 = bmhArray[n2];
            if (bmh3 == null) continue;
            if (!bmh3.l && n2 != n5 - 1) {
                bmhArray[n2] = null;
                bmhArray[0] = null;
                break;
            }
            bmhArray[n2].a(rm2);
            bmhArray[n2].q = false;
            ++n4;
        }
        this.r.C.b();
        this.r.C.a("cleanup");
        int n9 = 0;
        n3 = this.t.size();
        for (n2 = 0; n2 != n3; ++n2) {
            bmh bmh4 = (bmh)this.t.get(n2);
            if (bmh4 == null) continue;
            boolean bl3 = false;
            for (int i2 = 0; i2 < n5 && !bl3; ++i2) {
                if (bmh4 != bmhArray[i2]) continue;
                bl3 = true;
            }
            if (bl3) continue;
            if (n9 != n2) {
                this.t.set(n9, bmh4);
            }
            ++n9;
        }
        this.r.C.b();
        this.r.C.a("trim");
        while (--n2 >= n9) {
            this.t.remove(n2);
        }
        this.r.C.b();
        return n6 == n7 + n4;
    }

    public void a(bna bna2, xq xq2, float f2) {
        double d2 = xq2.S + (xq2.s - xq2.S) * (double)f2;
        double d3 = xq2.T + (xq2.t - xq2.T) * (double)f2;
        double d4 = xq2.U + (xq2.u - xq2.U) * (double)f2;
        if (!this.O.isEmpty()) {
            bwg.c(774, 768, 1, 0);
            this.s.a(bqs.b);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.5f);
            GL11.glPushMatrix();
            GL11.glPolygonOffset((float)-3.0f, (float)-3.0f);
            GL11.glEnable((int)32823);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            GL11.glEnable((int)3008);
            bna2.b();
            bna2.b(-d2, -d3, -d4);
            bna2.c();
            Iterator iterator = this.O.values().iterator();
            while (iterator.hasNext()) {
                double d5;
                double d6;
                mc mc2 = (mc)iterator.next();
                double d7 = (double)mc2.b() - d2;
                if (d7 * d7 + (d6 = (double)mc2.c() - d3) * d6 + (d5 = (double)mc2.d() - d4) * d5 > 1024.0) {
                    iterator.remove();
                    continue;
                }
                ahz ahz2 = this.r.a(mc2.b(), mc2.c(), mc2.d());
                if (ahz2.o() == avk.a) continue;
                this.B.a(ahz2, mc2.b(), mc2.c(), mc2.d(), this.Q[mc2.e()]);
            }
            bna2.a();
            bna2.b(0.0, 0.0, 0.0);
            GL11.glDisable((int)3008);
            GL11.glPolygonOffset((float)0.0f, (float)0.0f);
            GL11.glDisable((int)32823);
            GL11.glEnable((int)3008);
            GL11.glDepthMask((boolean)true);
            GL11.glPopMatrix();
        }
    }

    public void a(xq xq2, ayn ayn2, int n2, float f2) {
        if (n2 == 0 && ayn2.a == ayo.b) {
            GL11.glEnable((int)3042);
            bwg.c(770, 771, 1, 0);
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.4f);
            GL11.glLineWidth((float)2.0f);
            GL11.glDisable((int)3553);
            GL11.glDepthMask((boolean)false);
            float f3 = 0.002f;
            ahz ahz2 = this.r.a(ayn2.b, ayn2.c, ayn2.d);
            if (ahz2.o() != avk.a) {
                ahz2.a((agc)this.r, ayn2.b, ayn2.c, ayn2.d);
                double d2 = xq2.S + (xq2.s - xq2.S) * (double)f2;
                double d3 = xq2.T + (xq2.t - xq2.T) * (double)f2;
                double d4 = xq2.U + (xq2.u - xq2.U) * (double)f2;
                bmt.a(ahz2.g(this.r, ayn2.b, ayn2.c, ayn2.d).b(f3, f3, f3).c(-d2, -d3, -d4), -1);
            }
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
    }

    public static void a(ayk ayk2, int n2) {
        bna bna2 = bna.a;
        bna2.a(3);
        if (n2 != -1) {
            bna2.c(n2);
        }
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.a();
        bna2.a(3);
        if (n2 != -1) {
            bna2.c(n2);
        }
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a();
        bna2.a(1);
        if (n2 != -1) {
            bna2.c(n2);
        }
        bna2.a(ayk2.a, ayk2.b, ayk2.c);
        bna2.a(ayk2.a, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.c);
        bna2.a(ayk2.d, ayk2.e, ayk2.c);
        bna2.a(ayk2.d, ayk2.b, ayk2.f);
        bna2.a(ayk2.d, ayk2.e, ayk2.f);
        bna2.a(ayk2.a, ayk2.b, ayk2.f);
        bna2.a(ayk2.a, ayk2.e, ayk2.f);
        bna2.a();
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = oy.a(n2, 16);
        int n9 = oy.a(n3, 16);
        int n10 = oy.a(n4, 16);
        int n11 = oy.a(n5, 16);
        int n12 = oy.a(n6, 16);
        int n13 = oy.a(n7, 16);
        for (int i2 = n8; i2 <= n11; ++i2) {
            int n14 = i2 % this.w;
            if (n14 < 0) {
                n14 += this.w;
            }
            for (int i3 = n9; i3 <= n12; ++i3) {
                int n15 = i3 % this.x;
                if (n15 < 0) {
                    n15 += this.x;
                }
                for (int i4 = n10; i4 <= n13; ++i4) {
                    int n16;
                    bmh bmh2;
                    int n17 = i4 % this.y;
                    if (n17 < 0) {
                        n17 += this.y;
                    }
                    if ((bmh2 = this.v[n16 = (n17 * this.x + n15) * this.w + n14]) == null || bmh2.q) continue;
                    this.t.add(bmh2);
                    bmh2.e();
                }
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.b(n2 - 1, n3 - 1, n4 - 1, n2 + 1, n3 + 1, n4 + 1);
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.b(n2 - 1, n3 - 1, n4 - 1, n2 + 1, n3 + 1, n4 + 1);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.b(n2 - 1, n3 - 1, n4 - 1, n5 + 1, n6 + 1, n7 + 1);
    }

    public void a(bno bno2, float f2) {
        for (int i2 = 0; i2 < this.v.length; ++i2) {
            if (this.v[i2].d() || this.v[i2].l && (i2 + this.l & 0xF) != 0) continue;
            this.v[i2].a(bno2);
        }
        ++this.l;
    }

    @Override
    public void a(String string, int n2, int n3, int n4) {
        r r2 = new r(n2, n3, n4);
        btg btg2 = (btg)this.P.get(r2);
        if (btg2 != null) {
            this.A.X().b(btg2);
            this.P.remove(r2);
        }
        if (string != null) {
            aci aci2 = aci.b(string);
            if (aci2 != null) {
                this.A.r.a(aci2.i());
            }
            btg2 = btb.a(new brq(string), n2, n3, n4);
            this.P.put(r2, btg2);
            this.A.X().a(btg2);
        }
    }

    @Override
    public void a(String string, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(xq xq2, String string, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(String string, double d2, double d3, double d4, double d5, double d6, double d7) {
        try {
            this.b(string, d2, d3, d4, d5, d6, d7);
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Exception while adding particle");
            k k2 = b2.a("Particle being added");
            k2.a("Name", string);
            k2.a("Position", new bmu(this, d2, d3, d4));
            throw new s(b2);
        }
    }

    public blg b(String string, double d2, double d3, double d4, double d5, double d6, double d7) {
        if (this.A == null || this.A.i == null || this.A.k == null) {
            return null;
        }
        int n2 = this.A.u.aK;
        if (n2 == 1 && this.r.s.nextInt(3) == 0) {
            n2 = 2;
        }
        double d8 = this.A.i.s - d2;
        double d9 = this.A.i.t - d3;
        double d10 = this.A.i.u - d4;
        blg blg2 = null;
        if (string.equals("hugeexplosion")) {
            blg2 = new bld(this.r, d2, d3, d4, d5, d6, d7);
            this.A.k.a(blg2);
        } else if (string.equals("largeexplode")) {
            blg2 = new blc(this.s, this.r, d2, d3, d4, d5, d6, d7);
            this.A.k.a(blg2);
        } else if (string.equals("fireworksSpark")) {
            blg2 = new bkx(this.r, d2, d3, d4, d5, d6, d7, this.A.k);
            this.A.k.a(blg2);
        }
        if (blg2 != null) {
            return blg2;
        }
        double d11 = 16.0;
        if (d8 * d8 + d9 * d9 + d10 * d10 > d11 * d11) {
            return null;
        }
        if (n2 > 1) {
            return null;
        }
        if (string.equals("bubble")) {
            blg2 = new bkp(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("suspended")) {
            blg2 = new blt(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("depthsuspend")) {
            blg2 = new blu(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("townaura")) {
            blg2 = new blu(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("crit")) {
            blg2 = new bkr(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("magicCrit")) {
            blg2 = new bkr(this.r, d2, d3, d4, d5, d6, d7);
            blg2.b(blg2.b() * 0.3f, blg2.d() * 0.8f, blg2.e());
            blg2.i();
        } else if (string.equals("smoke")) {
            blg2 = new blp(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("mobSpell")) {
            blg2 = new blr(this.r, d2, d3, d4, 0.0, 0.0, 0.0);
            blg2.b((float)d5, (float)d6, (float)d7);
        } else if (string.equals("mobSpellAmbient")) {
            blg2 = new blr(this.r, d2, d3, d4, 0.0, 0.0, 0.0);
            blg2.g(0.15f);
            blg2.b((float)d5, (float)d6, (float)d7);
        } else if (string.equals("spell")) {
            blg2 = new blr(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("instantSpell")) {
            blg2 = new blr(this.r, d2, d3, d4, d5, d6, d7);
            ((blr)blg2).a(144);
        } else if (string.equals("witchMagic")) {
            blg2 = new blr(this.r, d2, d3, d4, d5, d6, d7);
            ((blr)blg2).a(144);
            float f2 = this.r.s.nextFloat() * 0.5f + 0.35f;
            blg2.b(1.0f * f2, 0.0f * f2, 1.0f * f2);
        } else if (string.equals("note")) {
            blg2 = new blf(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("portal")) {
            blg2 = new bln(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("enchantmenttable")) {
            blg2 = new bkt(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("explode")) {
            blg2 = new bku(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("flame")) {
            blg2 = new bkz(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("lava")) {
            blg2 = new ble(this.r, d2, d3, d4);
        } else if (string.equals("footstep")) {
            blg2 = new bla(this.s, this.r, d2, d3, d4);
        } else if (string.equals("splash")) {
            blg2 = new bls(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("wake")) {
            blg2 = new bly(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("largesmoke")) {
            blg2 = new blp(this.r, d2, d3, d4, d5, d6, d7, 2.5f);
        } else if (string.equals("cloud")) {
            blg2 = new blm(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("reddust")) {
            blg2 = new blo((afs)this.r, d2, d3, d4, (float)d5, (float)d6, (float)d7);
        } else if (string.equals("snowballpoof")) {
            blg2 = new bko(this.r, d2, d3, d4, abv.ay);
        } else if (string.equals("dripWater")) {
            blg2 = new bks(this.r, d2, d3, d4, avk.h);
        } else if (string.equals("dripLava")) {
            blg2 = new bks(this.r, d2, d3, d4, avk.i);
        } else if (string.equals("snowshovel")) {
            blg2 = new blq(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("slime")) {
            blg2 = new bko(this.r, d2, d3, d4, abv.aH);
        } else if (string.equals("heart")) {
            blg2 = new blb(this.r, d2, d3, d4, d5, d6, d7);
        } else if (string.equals("angryVillager")) {
            blg2 = new blb(this.r, d2, d3 + 0.5, d4, d5, d6, d7);
            blg2.k(81);
            blg2.b(1.0f, 1.0f, 1.0f);
        } else if (string.equals("happyVillager")) {
            blg2 = new blu(this.r, d2, d3, d4, d5, d6, d7);
            blg2.k(82);
            blg2.b(1.0f, 1.0f, 1.0f);
        } else if (string.startsWith("iconcrack_")) {
            String[] stringArray = string.split("_", 3);
            int n3 = Integer.parseInt(stringArray[1]);
            if (stringArray.length > 2) {
                int n4 = Integer.parseInt(stringArray[2]);
                blg2 = new bko(this.r, d2, d3, d4, d5, d6, d7, abs.d(n3), n4);
            } else {
                blg2 = new bko(this.r, d2, d3, d4, d5, d6, d7, abs.d(n3), 0);
            }
        } else if (string.startsWith("blockcrack_")) {
            String[] stringArray = string.split("_", 3);
            ahz ahz2 = ahz.e(Integer.parseInt(stringArray[1]));
            int n5 = Integer.parseInt(stringArray[2]);
            blg2 = new blx(this.r, d2, d3, d4, d5, d6, d7, ahz2, n5).a(n5);
        } else if (string.startsWith("blockdust_")) {
            String[] stringArray = string.split("_", 3);
            ahz ahz3 = ahz.e(Integer.parseInt(stringArray[1]));
            int n6 = Integer.parseInt(stringArray[2]);
            blg2 = new blw(this.r, d2, d3, d4, d5, d6, d7, ahz3, n6).a(n6);
        }
        if (blg2 != null) {
            this.A.k.a(blg2);
        }
        return blg2;
    }

    @Override
    public void a(qr qr2) {
    }

    @Override
    public void b(qr qr2) {
    }

    public void h() {
        azh.b(this.z);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        Random random = this.r.s;
        switch (n2) {
            case 1013: 
            case 1018: {
                if (this.A.i == null) break;
                double d2 = (double)n3 - this.A.i.s;
                double d3 = (double)n4 - this.A.i.t;
                double d4 = (double)n5 - this.A.i.u;
                double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                double d6 = this.A.i.s;
                double d7 = this.A.i.t;
                double d8 = this.A.i.u;
                if (d5 > 0.0) {
                    d6 += d2 / d5 * 2.0;
                    d7 += d3 / d5 * 2.0;
                    d8 += d4 / d5 * 2.0;
                }
                if (n2 == 1013) {
                    this.r.a(d6, d7, d8, "mob.wither.spawn", 1.0f, 1.0f, false);
                    break;
                }
                if (n2 != 1018) break;
                this.r.a(d6, d7, d8, "mob.enderdragon.end", 5.0f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(xq xq2, int n2, int n3, int n4, int n5, int n6) {
        Random random = this.r.s;
        ahz ahz2 = null;
        switch (n2) {
            case 1001: {
                this.r.a((double)n3, (double)n4, (double)n5, "random.click", 1.0f, 1.2f, false);
                break;
            }
            case 1000: {
                this.r.a((double)n3, (double)n4, (double)n5, "random.click", 1.0f, 1.0f, false);
                break;
            }
            case 1002: {
                this.r.a((double)n3, (double)n4, (double)n5, "random.bow", 1.0f, 1.2f, false);
                break;
            }
            case 2000: {
                int n7 = n6 % 3 - 1;
                int n8 = n6 / 3 % 3 - 1;
                double d2 = (double)n3 + (double)n7 * 0.6 + 0.5;
                double d3 = (double)n4 + 0.5;
                double d4 = (double)n5 + (double)n8 * 0.6 + 0.5;
                for (int i2 = 0; i2 < 10; ++i2) {
                    double d5 = random.nextDouble() * 0.2 + 0.01;
                    double d6 = d2 + (double)n7 * 0.01 + (random.nextDouble() - 0.5) * (double)n8 * 0.5;
                    double d7 = d3 + (random.nextDouble() - 0.5) * 0.5;
                    double d8 = d4 + (double)n8 * 0.01 + (random.nextDouble() - 0.5) * (double)n7 * 0.5;
                    double d9 = (double)n7 * d5 + random.nextGaussian() * 0.01;
                    double d10 = -0.03 + random.nextGaussian() * 0.01;
                    double d11 = (double)n8 * d5 + random.nextGaussian() * 0.01;
                    this.a("smoke", d6, d7, d8, d9, d10, d11);
                }
                break;
            }
            case 2003: {
                double d12 = (double)n3 + 0.5;
                double d13 = n4;
                double d14 = (double)n5 + 0.5;
                String string = "iconcrack_" + abs.b(abv.bv);
                for (int i3 = 0; i3 < 8; ++i3) {
                    this.a(string, d12, d13, d14, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15);
                }
                for (double d15 = 0.0; d15 < Math.PI * 2; d15 += 0.15707963267948966) {
                    this.a("portal", d12 + Math.cos(d15) * 5.0, d13 - 0.4, d14 + Math.sin(d15) * 5.0, Math.cos(d15) * -5.0, 0.0, Math.sin(d15) * -5.0);
                    this.a("portal", d12 + Math.cos(d15) * 5.0, d13 - 0.4, d14 + Math.sin(d15) * 5.0, Math.cos(d15) * -7.0, 0.0, Math.sin(d15) * -7.0);
                }
                break;
            }
            case 2002: {
                int n9;
                double d16 = n3;
                double d17 = n4;
                double d18 = n5;
                String string = "iconcrack_" + abs.b(abv.bn) + "_" + n6;
                for (n9 = 0; n9 < 8; ++n9) {
                    this.a(string, d16, d17, d18, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15);
                }
                n9 = abv.bn.h(n6);
                float f2 = (float)(n9 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n9 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n9 >> 0 & 0xFF) / 255.0f;
                String string2 = "spell";
                if (abv.bn.i(n6)) {
                    string2 = "instantSpell";
                }
                for (int i4 = 0; i4 < 100; ++i4) {
                    double d19 = random.nextDouble() * 4.0;
                    double d20 = random.nextDouble() * Math.PI * 2.0;
                    double d21 = Math.cos(d20) * d19;
                    double d22 = 0.01 + random.nextDouble() * 0.5;
                    double d23 = Math.sin(d20) * d19;
                    blg blg2 = this.b(string2, d16 + d21 * 0.1, d17 + 0.3, d18 + d23 * 0.1, d21, d22, d23);
                    if (blg2 == null) continue;
                    float f5 = 0.75f + random.nextFloat() * 0.25f;
                    blg2.b(f2 * f5, f3 * f5, f4 * f5);
                    blg2.a((float)d19);
                }
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "game.potion.smash", 1.0f, this.r.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2001: {
                ahz2 = ahz.e(n6 & 0xFFF);
                if (ahz2.o() != avk.a) {
                    this.A.X().a(new btb(new brq(ahz2.H.a()), (ahz2.H.c() + 1.0f) / 2.0f, ahz2.H.d() * 0.8f, (float)n3 + 0.5f, (float)n4 + 0.5f, (float)n5 + 0.5f));
                }
                this.A.k.a(n3, n4, n5, ahz2, n6 >> 12 & 0xFF);
                break;
            }
            case 2004: {
                for (int i5 = 0; i5 < 20; ++i5) {
                    double d24 = (double)n3 + 0.5 + ((double)this.r.s.nextFloat() - 0.5) * 2.0;
                    double d25 = (double)n4 + 0.5 + ((double)this.r.s.nextFloat() - 0.5) * 2.0;
                    double d26 = (double)n5 + 0.5 + ((double)this.r.s.nextFloat() - 0.5) * 2.0;
                    this.r.a("smoke", d24, d25, d26, 0.0, 0.0, 0.0);
                    this.r.a("flame", d24, d25, d26, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 2005: {
                aba.a(this.r, n3, n4, n5, n6);
                break;
            }
            case 2006: {
                ahz2 = this.r.a(n3, n4, n5);
                if (ahz2.o() == avk.a) break;
                double d27 = Math.min(0.2f + (float)n6 / 15.0f, 10.0f);
                if (d27 > 2.5) {
                    d27 = 2.5;
                }
                int n10 = (int)(150.0 * d27);
                for (int i6 = 0; i6 < n10; ++i6) {
                    float f6 = oy.a(random, 0.0f, (float)Math.PI * 2);
                    double d28 = oy.a(random, 0.75f, 1.0f);
                    double d29 = (double)0.2f + d27 / 100.0;
                    double d30 = (double)(oy.b(f6) * 0.2f) * d28 * d28 * (d27 + 0.2);
                    double d31 = (double)(oy.a(f6) * 0.2f) * d28 * d28 * (d27 + 0.2);
                    this.r.a("blockdust_" + ahz.b(ahz2) + "_" + this.r.e(n3, n4, n5), (double)((float)n3 + 0.5f), (double)((float)n4 + 1.0f), (double)((float)n5 + 0.5f), d30, d29, d31);
                }
                break;
            }
            case 1003: {
                if (Math.random() < 0.5) {
                    this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "random.door_open", 1.0f, this.r.s.nextFloat() * 0.1f + 0.9f, false);
                    break;
                }
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "random.door_close", 1.0f, this.r.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1004: {
                this.r.a((double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), (double)((float)n5 + 0.5f), "random.fizz", 0.5f, 2.6f + (random.nextFloat() - random.nextFloat()) * 0.8f, false);
                break;
            }
            case 1020: {
                this.r.a((double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), (double)((float)n5 + 0.5f), "random.anvil_break", 1.0f, this.r.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1021: {
                this.r.a((double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), (double)((float)n5 + 0.5f), "random.anvil_use", 1.0f, this.r.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1022: {
                this.r.a((double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), (double)((float)n5 + 0.5f), "random.anvil_land", 0.3f, this.r.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1005: {
                if (abs.d(n6) instanceof aci) {
                    this.r.a("records." + ((aci)abs.d((int)n6)).a, n3, n4, n5);
                    break;
                }
                this.r.a((String)null, n3, n4, n5);
                break;
            }
            case 1007: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.ghast.charge", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1008: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.ghast.fireball", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1010: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.zombie.wood", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1012: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.zombie.woodbreak", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1011: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.zombie.metal", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1009: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.ghast.fireball", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1014: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.wither.shoot", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.zombie.infect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.zombie.unfect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1015: {
                this.r.a((double)n3 + 0.5, (double)n4 + 0.5, (double)n5 + 0.5, "mob.bat.takeoff", 0.05f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
            }
        }
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6) {
        if (n6 < 0 || n6 >= 10) {
            this.O.remove(n2);
        } else {
            mc mc2 = (mc)this.O.get(n2);
            if (mc2 == null || mc2.b() != n3 || mc2.c() != n4 || mc2.d() != n5) {
                mc2 = new mc(n2, n3, n4, n5);
                this.O.put(n2, mc2);
            }
            mc2.a(n6);
            mc2.b(this.E);
        }
    }

    public void a(px px2) {
        this.Q = new pw[10];
        for (int i2 = 0; i2 < this.Q.length; ++i2) {
            this.Q[i2] = px2.a("destroy_stage_" + i2);
        }
    }
}

