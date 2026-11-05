/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class blh {
    private static final brq b = new brq("textures/particle/particles.png");
    protected afs a;
    private List[] c = new List[4];
    private bqy d;
    private Random e = new Random();

    public blh(afs afs2, bqy bqy2) {
        if (afs2 != null) {
            this.a = afs2;
        }
        this.d = bqy2;
        for (int i2 = 0; i2 < 4; ++i2) {
            this.c[i2] = new ArrayList();
        }
    }

    public void a(blg blg2) {
        int n2 = blg2.a();
        if (this.c[n2].size() >= 4000) {
            this.c[n2].remove(0);
        }
        this.c[n2].add(blg2);
    }

    public void a() {
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < this.c[i2].size(); ++i3) {
                blg blg2 = (blg)this.c[i2].get(i3);
                try {
                    blg2.h();
                }
                catch (Throwable throwable) {
                    b b2 = b.a(throwable, "Ticking Particle");
                    k k2 = b2.a("Particle being ticked");
                    int n2 = i2;
                    k2.a("Particle", new bli(this, blg2));
                    k2.a("Particle Type", new blj(this, n2));
                    throw new s(b2);
                }
                if (!blg2.K) continue;
                this.c[i2].remove(i3--);
            }
        }
    }

    public void a(qr qr2, float f2) {
        float f3 = azd.d;
        float f4 = azd.f;
        float f5 = azd.g;
        float f6 = azd.h;
        float f7 = azd.e;
        blg.ay = qr2.S + (qr2.s - qr2.S) * (double)f2;
        blg.az = qr2.T + (qr2.t - qr2.T) * (double)f2;
        blg.aA = qr2.U + (qr2.u - qr2.U) * (double)f2;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.c[i2].isEmpty()) continue;
            switch (i2) {
                default: {
                    this.d.a(b);
                    break;
                }
                case 1: {
                    this.d.a(bqs.b);
                    break;
                }
                case 2: {
                    this.d.a(bqs.c);
                }
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glAlphaFunc((int)516, (float)0.003921569f);
            bna bna2 = bna.a;
            bna2.b();
            for (int i3 = 0; i3 < this.c[i2].size(); ++i3) {
                blg blg2 = (blg)this.c[i2].get(i3);
                bna2.b(blg2.c(f2));
                try {
                    blg2.a(bna2, f2, f3, f7, f4, f5, f6);
                    continue;
                }
                catch (Throwable throwable) {
                    b b2 = b.a(throwable, "Rendering Particle");
                    k k2 = b2.a("Particle being rendered");
                    int n2 = i2;
                    k2.a("Particle", new blk(this, blg2));
                    k2.a("Particle Type", new bll(this, n2));
                    throw new s(b2);
                }
            }
            bna2.a();
            GL11.glDisable((int)3042);
            GL11.glDepthMask((boolean)true);
            GL11.glAlphaFunc((int)516, (float)0.1f);
        }
    }

    public void b(qr qr2, float f2) {
        float f3 = (float)Math.PI / 180;
        float f4 = oy.b(qr2.y * ((float)Math.PI / 180));
        float f5 = oy.a(qr2.y * ((float)Math.PI / 180));
        float f6 = -f5 * oy.a(qr2.z * ((float)Math.PI / 180));
        float f7 = f4 * oy.a(qr2.z * ((float)Math.PI / 180));
        float f8 = oy.b(qr2.z * ((float)Math.PI / 180));
        int n2 = 3;
        List list = this.c[n2];
        if (list.isEmpty()) {
            return;
        }
        bna bna2 = bna.a;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            blg blg2 = (blg)list.get(i2);
            bna2.b(blg2.c(f2));
            blg2.a(bna2, f2, f4, f8, f5, f6, f7);
        }
    }

    public void a(afs afs2) {
        this.a = afs2;
        for (int i2 = 0; i2 < 4; ++i2) {
            this.c[i2].clear();
        }
    }

    public void a(int n2, int n3, int n4, ahz ahz2, int n5) {
        if (ahz2.o() == avk.a) {
            return;
        }
        int n6 = 4;
        for (int i2 = 0; i2 < n6; ++i2) {
            for (int i3 = 0; i3 < n6; ++i3) {
                for (int i4 = 0; i4 < n6; ++i4) {
                    double d2 = (double)n2 + ((double)i2 + 0.5) / (double)n6;
                    double d3 = (double)n3 + ((double)i3 + 0.5) / (double)n6;
                    double d4 = (double)n4 + ((double)i4 + 0.5) / (double)n6;
                    this.a(new blx(this.a, d2, d3, d4, d2 - (double)n2 - 0.5, d3 - (double)n3 - 0.5, d4 - (double)n4 - 0.5, ahz2, n5).a(n2, n3, n4));
                }
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        ahz ahz2 = this.a.a(n2, n3, n4);
        if (ahz2.o() == avk.a) {
            return;
        }
        float f2 = 0.1f;
        double d2 = (double)n2 + this.e.nextDouble() * (ahz2.y() - ahz2.x() - (double)(f2 * 2.0f)) + (double)f2 + ahz2.x();
        double d3 = (double)n3 + this.e.nextDouble() * (ahz2.A() - ahz2.z() - (double)(f2 * 2.0f)) + (double)f2 + ahz2.z();
        double d4 = (double)n4 + this.e.nextDouble() * (ahz2.C() - ahz2.B() - (double)(f2 * 2.0f)) + (double)f2 + ahz2.B();
        if (n5 == 0) {
            d3 = (double)n3 + ahz2.z() - (double)f2;
        }
        if (n5 == 1) {
            d3 = (double)n3 + ahz2.A() + (double)f2;
        }
        if (n5 == 2) {
            d4 = (double)n4 + ahz2.B() - (double)f2;
        }
        if (n5 == 3) {
            d4 = (double)n4 + ahz2.C() + (double)f2;
        }
        if (n5 == 4) {
            d2 = (double)n2 + ahz2.x() - (double)f2;
        }
        if (n5 == 5) {
            d2 = (double)n2 + ahz2.y() + (double)f2;
        }
        this.a(new blx(this.a, d2, d3, d4, 0.0, 0.0, 0.0, ahz2, this.a.e(n2, n3, n4)).a(n2, n3, n4).a(0.2f).f(0.6f));
    }

    public String b() {
        return "" + (this.c[0].size() + this.c[1].size() + this.c[2].size());
    }
}

