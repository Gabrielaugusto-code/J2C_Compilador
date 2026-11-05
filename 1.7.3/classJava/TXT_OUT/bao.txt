/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bao
extends bap {
    private static final brq f = new brq("textures/misc/vignette.png");
    private static final brq g = new brq("textures/gui/widgets.png");
    private static final brq h = new brq("textures/misc/pumpkinblur.png");
    private static final bor i = new bor();
    private final Random j = new Random();
    private final azi k;
    private final bav l;
    private final bbh m;
    private int n;
    private String o = "";
    private int p;
    private boolean q;
    public float a = 1.0f;
    private int r;
    private abu s;

    public bao(azi azi2) {
        this.k = azi2;
        this.l = new bav(azi2);
        this.m = new bbh(this.k);
    }

    public void a(float f2, boolean bl2, int n2, int n3) {
        ayr ayr2;
        Object object;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        float f3;
        bat bat2 = new bat(this.k, this.k.d, this.k.e);
        int n14 = bat2.a();
        int n15 = bat2.b();
        ban ban2 = this.k.l;
        this.k.p.g();
        GL11.glEnable((int)3042);
        if (azi.x()) {
            this.a(this.k.h.d(f2), n14, n15);
        } else {
            bwg.c(770, 771, 1, 0);
        }
        abu abu2 = this.k.h.bm.d(3);
        if (this.k.u.ax == 0 && abu2 != null && abu2.b() == abs.a(aie.aK)) {
            this.b(n14, n15);
        }
        if (!this.k.h.a(qm.k) && (f3 = this.k.h.bN + (this.k.h.bM - this.k.h.bN) * f2) > 0.0f) {
            this.b(f3, n14, n15);
        }
        if (!this.k.c.a()) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.k.P().a(g);
            xo xo2 = this.k.h.bm;
            this.e = -90.0f;
            this.b(n14 / 2 - 91, n15 - 22, 0, 0, 182, 22);
            this.b(n14 / 2 - 91 - 1 + xo2.c * 20, n15 - 22 - 1, 0, 22, 24, 22);
            this.k.P().a(d);
            GL11.glEnable((int)3042);
            bwg.c(775, 769, 1, 0);
            this.b(n14 / 2 - 7, n15 / 2 - 7, 0, 0, 16, 16);
            bwg.c(770, 771, 1, 0);
            this.k.z.a("bossHealth");
            this.d();
            this.k.z.b();
            if (this.k.c.b()) {
                this.a(n14, n15);
            }
            this.k.z.a("actionBar");
            GL11.glEnable((int)32826);
            azg.c();
            for (n13 = 0; n13 < 9; ++n13) {
                n12 = n14 / 2 - 90 + n13 * 20 + 2;
                n11 = n15 - 16 - 3;
                this.a(n13, n12, n11, f2);
            }
            azg.a();
            GL11.glDisable((int)32826);
            this.k.z.b();
            GL11.glDisable((int)3042);
        }
        if (this.k.h.bL() > 0) {
            this.k.z.a("sleep");
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3008);
            int n16 = this.k.h.bL();
            float f4 = (float)n16 / 100.0f;
            if (f4 > 1.0f) {
                f4 = 1.0f - (float)(n16 - 100) / 10.0f;
            }
            n12 = (int)(220.0f * f4) << 24 | 0x101020;
            bao.a(0, 0, n14, n15, n12);
            GL11.glEnable((int)3008);
            GL11.glEnable((int)2929);
            this.k.z.b();
        }
        int n17 = 0xFFFFFF;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        n13 = n14 / 2 - 91;
        if (this.k.h.w()) {
            this.k.z.a("jumpBar");
            this.k.P().a(bap.d);
            float f5 = this.k.h.bU();
            n11 = 182;
            n10 = (int)(f5 * (float)(n11 + 1));
            int n18 = n15 - 32 + 3;
            this.b(n13, n18, 0, 84, n11, 5);
            if (n10 > 0) {
                this.b(n13, n18, 0, 89, n10, 5);
            }
            this.k.z.b();
        } else if (this.k.c.f()) {
            this.k.z.a("expBar");
            this.k.P().a(bap.d);
            n12 = this.k.h.bO();
            if (n12 > 0) {
                n11 = 182;
                n10 = (int)(this.k.h.bH * (float)(n11 + 1));
                int n19 = n15 - 32 + 3;
                this.b(n13, n19, 0, 64, n11, 5);
                if (n10 > 0) {
                    this.b(n13, n19, 0, 69, n10, 5);
                }
            }
            this.k.z.b();
            if (this.k.h.bF > 0) {
                this.k.z.a("expLevel");
                n11 = 0;
                n10 = n11 != 0 ? 0xFFFFFF : 8453920;
                String string = "" + this.k.h.bF;
                n9 = (n14 - ban2.a(string)) / 2;
                n8 = n15 - 31 - 4;
                n7 = 0;
                ban2.b(string, n9 + 1, n8, 0);
                ban2.b(string, n9 - 1, n8, 0);
                ban2.b(string, n9, n8 + 1, 0);
                ban2.b(string, n9, n8 - 1, 0);
                ban2.b(string, n9, n8, n10);
                this.k.z.b();
            }
        }
        if (this.k.u.C) {
            this.k.z.a("toolHighlight");
            if (this.r > 0 && this.s != null) {
                int n20;
                String string = this.s.s();
                n11 = (n14 - ban2.a(string)) / 2;
                n10 = n15 - 59;
                if (!this.k.c.b()) {
                    n10 += 14;
                }
                if ((n20 = (int)((float)this.r * 256.0f / 10.0f)) > 255) {
                    n20 = 255;
                }
                if (n20 > 0) {
                    GL11.glPushMatrix();
                    GL11.glEnable((int)3042);
                    bwg.c(770, 771, 1, 0);
                    ban2.a(string, n11, n10, 0xFFFFFF + (n20 << 24));
                    GL11.glDisable((int)3042);
                    GL11.glPopMatrix();
                }
            }
            this.k.z.b();
        }
        if (this.k.u()) {
            this.k.z.a("demo");
            String string = "";
            string = this.k.f.I() >= 120500L ? bsc.a("demo.demoExpired", new Object[0]) : bsc.a("demo.remainingTime", pe.a((int)(120500L - this.k.f.I())));
            n11 = ban2.a(string);
            ban2.a(string, n14 - n11 - 10, 5, 0xFFFFFF);
            this.k.z.b();
        }
        if (this.k.u.ay) {
            this.k.z.a("debug");
            GL11.glPushMatrix();
            ban2.a("Minecraft 1.7.3 (" + this.k.B + ")", 2, 2, 0xFFFFFF);
            ban2.a(this.k.q(), 2, 12, 0xFFFFFF);
            ban2.a(this.k.r(), 2, 22, 0xFFFFFF);
            ban2.a(this.k.t(), 2, 32, 0xFFFFFF);
            ban2.a(this.k.s(), 2, 42, 0xFFFFFF);
            long l2 = Runtime.getRuntime().maxMemory();
            long l3 = Runtime.getRuntime().totalMemory();
            long l4 = Runtime.getRuntime().freeMemory();
            long l5 = l3 - l4;
            String string = "Used memory: " + l5 * 100L / l2 + "% (" + l5 / 1024L / 1024L + "MB) of " + l2 / 1024L / 1024L + "MB";
            n6 = 0xE0E0E0;
            this.b(ban2, string, n14 - ban2.a(string) - 2, 2, 0xE0E0E0);
            string = "Allocated memory: " + l3 * 100L / l2 + "% (" + l3 / 1024L / 1024L + "MB)";
            this.b(ban2, string, n14 - ban2.a(string) - 2, 12, 0xE0E0E0);
            n5 = oy.c(this.k.h.s);
            n4 = oy.c(this.k.h.t);
            int n21 = oy.c(this.k.h.u);
            this.b(ban2, String.format("x: %.5f (%d) // c: %d (%d)", this.k.h.s, n5, n5 >> 4, n5 & 0xF), 2, 64, 0xE0E0E0);
            this.b(ban2, String.format("y: %.3f (feet pos, %.3f eyes pos)", this.k.h.C.b, this.k.h.t), 2, 72, 0xE0E0E0);
            this.b(ban2, String.format("z: %.5f (%d) // c: %d (%d)", this.k.h.u, n21, n21 >> 4, n21 & 0xF), 2, 80, 0xE0E0E0);
            int n22 = oy.c((double)(this.k.h.y * 4.0f / 360.0f) + 0.5) & 3;
            this.b(ban2, "f: " + n22 + " (" + p.c[n22] + ") / " + oy.g(this.k.h.y), 2, 88, 0xE0E0E0);
            if (this.k.f != null && this.k.f.d(n5, n4, n21)) {
                object = this.k.f.d(n5, n21);
                this.b(ban2, "lc: " + (((aoo)object).h() + 15) + " b: " + ((aoo)object).a((int)(n5 & 0xF), (int)(n21 & 0xF), (ags)this.k.f.v()).af + " bl: " + ((aoo)object).a(age.b, n5 & 0xF, n4, n21 & 0xF) + " sl: " + ((aoo)object).a(age.a, n5 & 0xF, n4, n21 & 0xF) + " rl: " + ((aoo)object).b(n5 & 0xF, n4, n21 & 0xF, 0), 2, 96, 0xE0E0E0);
            }
            this.b(ban2, String.format("ws: %.3f, fs: %.3f, g: %b, fl: %d", Float.valueOf(this.k.h.bE.b()), Float.valueOf(this.k.h.bE.a()), this.k.h.D, this.k.f.f(n5, n21)), 2, 104, 0xE0E0E0);
            if (this.k.p != null && this.k.p.a()) {
                this.b(ban2, String.format("shader: %s", this.k.p.e().b()), 2, 112, 0xE0E0E0);
            }
            GL11.glPopMatrix();
            this.k.z.b();
        }
        if (this.p > 0) {
            this.k.z.a("overlayMessage");
            float f6 = (float)this.p - f2;
            n11 = (int)(f6 * 255.0f / 20.0f);
            if (n11 > 255) {
                n11 = 255;
            }
            if (n11 > 8) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)(n14 / 2), (float)(n15 - 68), (float)0.0f);
                GL11.glEnable((int)3042);
                bwg.c(770, 771, 1, 0);
                int n23 = 0xFFFFFF;
                if (this.q) {
                    n23 = Color.HSBtoRGB(f6 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                }
                ban2.b(this.o, -ban2.a(this.o) / 2, -4, n23 + (n11 << 24 & 0xFF000000));
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
            }
            this.k.z.b();
        }
        if ((ayr2 = this.k.f.X().a(1)) != null) {
            this.a(ayr2, n15, n14, ban2);
        }
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        GL11.glDisable((int)3008);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)(n15 - 48), (float)0.0f);
        this.k.z.a("chat");
        this.l.a(this.n);
        this.k.z.b();
        GL11.glPopMatrix();
        ayr2 = this.k.f.X().a(0);
        if (this.k.u.ai.d() && (!this.k.F() || this.k.h.a.b.size() > 1 || ayr2 != null)) {
            int n24;
            this.k.z.a("playerList");
            bjw bjw2 = this.k.h.a;
            List list = bjw2.b;
            n9 = n24 = bjw2.c;
            n8 = 1;
            while (n9 > 20) {
                n9 = (n24 + ++n8 - 1) / n8;
            }
            n7 = 300 / n8;
            if (n7 > 150) {
                n7 = 150;
            }
            int n25 = (n14 - n8 * n7) / 2;
            int n26 = 10;
            bao.a(n25 - 1, n26 - 1, n25 + n7 * n8, n26 + 9 * n9, Integer.MIN_VALUE);
            for (n6 = 0; n6 < n24; ++n6) {
                int n27;
                int n28;
                n5 = n25 + n6 % n8 * n7;
                n4 = n26 + n6 / n8 * 9;
                bao.a(n5, n4, n5 + n7 - 1, n4 + 8, 0x20FFFFFF);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glEnable((int)3008);
                if (n6 >= list.size()) continue;
                bkg bkg2 = (bkg)list.get(n6);
                ays ays2 = this.k.f.X().i(bkg2.a);
                object = ays.a(ays2, bkg2.a);
                ban2.a((String)object, n5, n4, 0xFFFFFF);
                if (ayr2 != null && (n28 = n5 + n7 - 12 - 5) - (n27 = n5 + ban2.a((String)object) + 5) > 5) {
                    ayt ayt2 = ayr2.a().a(bkg2.a, ayr2);
                    String string = (Object)((Object)a.o) + "" + ayt2.c();
                    ban2.a(string, n28 - ban2.a(string), n4, 0xFFFFFF);
                }
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                this.k.P().a(d);
                n27 = 0;
                n28 = 0;
                n28 = bkg2.b < 0 ? 5 : (bkg2.b < 150 ? 0 : (bkg2.b < 300 ? 1 : (bkg2.b < 600 ? 2 : (bkg2.b < 1000 ? 3 : 4))));
                this.e += 100.0f;
                this.b(n5 + n7 - 12, n4, 0 + n27 * 10, 176 + n28 * 8, 10, 8);
                this.e -= 100.0f;
            }
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3008);
    }

    public void a(float f2, float f3) {
        this.m.a((int)(f2 - 10.0f), 10);
    }

    private void a(ayr ayr2, int n2, int n3, ban ban2) {
        ayw ayw2 = ayr2.a();
        Collection collection = ayw2.i(ayr2);
        if (collection.size() > 15) {
            return;
        }
        int n4 = ban2.a(ayr2.d());
        for (ayt ayt2 : collection) {
            ays ays2 = ayw2.i(ayt2.e());
            String string = ays.a(ays2, ayt2.e()) + ": " + (Object)((Object)a.m) + ayt2.c();
            n4 = Math.max(n4, ban2.a(string));
        }
        int n5 = collection.size() * ban2.a;
        int n6 = n2 / 2 + n5 / 3;
        int n7 = 3;
        int n8 = n3 - n4 - n7;
        int n9 = 0;
        for (ayt ayt3 : collection) {
            ays ays3 = ayw2.i(ayt3.e());
            String string = ays.a(ays3, ayt3.e());
            String string2 = (Object)((Object)a.m) + "" + ayt3.c();
            int n10 = n8;
            int n11 = n6 - ++n9 * ban2.a;
            int n12 = n3 - n7 + 2;
            bao.a(n10 - 2, n11, n12, n11 + ban2.a, 0x50000000);
            ban2.b(string, n10, n11, 0x20FFFFFF);
            ban2.b(string2, n12 - ban2.a(string2), n11, 0x20FFFFFF);
            if (n9 != collection.size()) continue;
            String string3 = ayr2.d();
            bao.a(n10 - 2, n11 - ban2.a - 1, n12, n11 - 1, 0x60000000);
            bao.a(n10 - 2, n11 - 1, n12, n11, 0x50000000);
            ban2.b(string3, n10 + n4 / 2 - ban2.a(string3) / 2, n11 - ban2.a, 0x20FFFFFF);
        }
    }

    private void a(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        boolean bl2;
        boolean bl3 = bl2 = this.k.h.ad / 3 % 2 == 1;
        if (this.k.h.ad < 10) {
            bl2 = false;
        }
        int n11 = oy.f(this.k.h.aR());
        int n12 = oy.f(this.k.h.aw);
        this.j.setSeed(this.n * 312871);
        boolean bl4 = false;
        yi yi2 = this.k.h.bP();
        int n13 = yi2.a();
        int n14 = yi2.b();
        rz rz2 = this.k.h.a(xa.a);
        int n15 = n2 / 2 - 91;
        int n16 = n2 / 2 + 91;
        int n17 = n3 - 39;
        float f2 = (float)rz2.e();
        float f3 = this.k.h.br();
        int n18 = oy.f((f2 + f3) / 2.0f / 10.0f);
        int n19 = Math.max(10 - (n18 - 2), 3);
        int n20 = n17 - (n18 - 1) * n19 - 10;
        float f4 = f3;
        int n21 = this.k.h.aU();
        int n22 = -1;
        if (this.k.h.a(qm.l)) {
            n22 = this.n % oy.f(f2 + 5.0f);
        }
        this.k.z.a("armor");
        for (n10 = 0; n10 < 10; ++n10) {
            if (n21 <= 0) continue;
            n9 = n15 + n10 * 8;
            if (n10 * 2 + 1 < n21) {
                this.b(n9, n20, 34, 9, 9, 9);
            }
            if (n10 * 2 + 1 == n21) {
                this.b(n9, n20, 25, 9, 9, 9);
            }
            if (n10 * 2 + 1 <= n21) continue;
            this.b(n9, n20, 16, 9, 9, 9);
        }
        this.k.z.c("health");
        for (n10 = oy.f((f2 + f3) / 2.0f) - 1; n10 >= 0; --n10) {
            n9 = 16;
            if (this.k.h.a(qm.u)) {
                n9 += 36;
            } else if (this.k.h.a(qm.v)) {
                n9 += 72;
            }
            n8 = 0;
            if (bl2) {
                n8 = 1;
            }
            n7 = oy.f((float)(n10 + 1) / 10.0f) - 1;
            n6 = n15 + n10 % 10 * 8;
            n5 = n17 - n7 * n19;
            if (n11 <= 4) {
                n5 += this.j.nextInt(2);
            }
            if (n10 == n22) {
                n5 -= 2;
            }
            n4 = 0;
            if (this.k.f.N().t()) {
                n4 = 5;
            }
            this.b(n6, n5, 16 + n8 * 9, 9 * n4, 9, 9);
            if (bl2) {
                if (n10 * 2 + 1 < n12) {
                    this.b(n6, n5, n9 + 54, 9 * n4, 9, 9);
                }
                if (n10 * 2 + 1 == n12) {
                    this.b(n6, n5, n9 + 63, 9 * n4, 9, 9);
                }
            }
            if (f4 > 0.0f) {
                if (f4 == f3 && f3 % 2.0f == 1.0f) {
                    this.b(n6, n5, n9 + 153, 9 * n4, 9, 9);
                } else {
                    this.b(n6, n5, n9 + 144, 9 * n4, 9, 9);
                }
                f4 -= 2.0f;
                continue;
            }
            if (n10 * 2 + 1 < n11) {
                this.b(n6, n5, n9 + 36, 9 * n4, 9, 9);
            }
            if (n10 * 2 + 1 != n11) continue;
            this.b(n6, n5, n9 + 45, 9 * n4, 9, 9);
        }
        qr qr2 = this.k.h.m;
        if (qr2 == null) {
            this.k.z.c("food");
            for (n9 = 0; n9 < 10; ++n9) {
                n8 = n17;
                n7 = 16;
                n6 = 0;
                if (this.k.h.a(qm.s)) {
                    n7 += 36;
                    n6 = 13;
                }
                if (this.k.h.bP().e() <= 0.0f && this.n % (n13 * 3 + 1) == 0) {
                    n8 += this.j.nextInt(3) - 1;
                }
                if (bl4) {
                    n6 = 1;
                }
                n5 = n16 - n9 * 8 - 9;
                this.b(n5, n8, 16 + n6 * 9, 27, 9, 9);
                if (bl4) {
                    if (n9 * 2 + 1 < n14) {
                        this.b(n5, n8, n7 + 54, 27, 9, 9);
                    }
                    if (n9 * 2 + 1 == n14) {
                        this.b(n5, n8, n7 + 63, 27, 9, 9);
                    }
                }
                if (n9 * 2 + 1 < n13) {
                    this.b(n5, n8, n7 + 36, 27, 9, 9);
                }
                if (n9 * 2 + 1 != n13) continue;
                this.b(n5, n8, n7 + 45, 27, 9, 9);
            }
        } else if (qr2 instanceof rm) {
            this.k.z.c("mountHealth");
            rm rm2 = (rm)qr2;
            n8 = (int)Math.ceil(rm2.aR());
            float f5 = rm2.aX();
            n6 = (int)(f5 + 0.5f) / 2;
            if (n6 > 30) {
                n6 = 30;
            }
            n5 = n17;
            n4 = 0;
            while (n6 > 0) {
                int n23 = Math.min(n6, 10);
                n6 -= n23;
                for (int i2 = 0; i2 < n23; ++i2) {
                    int n24 = 52;
                    int n25 = 0;
                    if (bl4) {
                        n25 = 1;
                    }
                    int n26 = n16 - i2 * 8 - 9;
                    this.b(n26, n5, n24 + n25 * 9, 9, 9, 9);
                    if (i2 * 2 + 1 + n4 < n8) {
                        this.b(n26, n5, n24 + 36, 9, 9, 9);
                    }
                    if (i2 * 2 + 1 + n4 != n8) continue;
                    this.b(n26, n5, n24 + 45, 9, 9, 9);
                }
                n5 -= 10;
                n4 += 20;
            }
        }
        this.k.z.c("air");
        if (this.k.h.a(avk.h)) {
            int n27 = this.k.h.aq();
            n8 = oy.f((double)(n27 - 2) * 10.0 / 300.0);
            int n28 = oy.f((double)n27 * 10.0 / 300.0) - n8;
            for (n6 = 0; n6 < n8 + n28; ++n6) {
                if (n6 < n8) {
                    this.b(n16 - n6 * 8 - 9, n20, 16, 18, 9, 9);
                    continue;
                }
                this.b(n16 - n6 * 8 - 9, n20, 25, 18, 9, 9);
            }
        }
        this.k.z.b();
    }

    private void d() {
        if (bmg.c == null || bmg.b <= 0) {
            return;
        }
        --bmg.b;
        ban ban2 = this.k.l;
        bat bat2 = new bat(this.k, this.k.d, this.k.e);
        int n2 = bat2.a();
        int n3 = 182;
        int n4 = n2 / 2 - n3 / 2;
        int n5 = (int)(bmg.a * (float)(n3 + 1));
        int n6 = 12;
        this.b(n4, n6, 0, 74, n3, 5);
        this.b(n4, n6, 0, 74, n3, 5);
        if (n5 > 0) {
            this.b(n4, n6, 0, 79, n5, 5);
        }
        String string = bmg.c;
        ban2.a(string, n2 / 2 - ban2.a(string) / 2, n6 - 10, 0xFFFFFF);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(d);
    }

    private void b(int n2, int n3) {
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        bwg.c(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3008);
        this.k.P().a(h);
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(0.0, n3, -90.0, 0.0, 1.0);
        bna2.a(n2, n3, -90.0, 1.0, 1.0);
        bna2.a(n2, 0.0, -90.0, 1.0, 0.0);
        bna2.a(0.0, 0.0, -90.0, 0.0, 0.0);
        bna2.a();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void a(float f2, int n2, int n3) {
        if ((f2 = 1.0f - f2) < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.a = (float)((double)this.a + (double)(f2 - this.a) * 0.01);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        bwg.c(0, 769, 1, 0);
        GL11.glColor4f((float)this.a, (float)this.a, (float)this.a, (float)1.0f);
        this.k.P().a(f);
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(0.0, n3, -90.0, 0.0, 1.0);
        bna2.a(n2, n3, -90.0, 1.0, 1.0);
        bna2.a(n2, 0.0, -90.0, 1.0, 0.0);
        bna2.a(0.0, 0.0, -90.0, 0.0, 0.0);
        bna2.a();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bwg.c(770, 771, 1, 0);
    }

    private void b(float f2, int n2, int n3) {
        if (f2 < 1.0f) {
            f2 *= f2;
            f2 *= f2;
            f2 = f2 * 0.8f + 0.2f;
        }
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        bwg.c(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
        pw pw2 = aie.aO.h(1);
        this.k.P().a(bqs.b);
        float f3 = pw2.c();
        float f4 = pw2.e();
        float f5 = pw2.d();
        float f6 = pw2.f();
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(0.0, n3, -90.0, f3, f6);
        bna2.a(n2, n3, -90.0, f5, f6);
        bna2.a(n2, 0.0, -90.0, f5, f4);
        bna2.a(0.0, 0.0, -90.0, f3, f4);
        bna2.a();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void a(int n2, int n3, int n4, float f2) {
        abu abu2 = this.k.h.bm.a[n2];
        if (abu2 == null) {
            return;
        }
        float f3 = (float)abu2.c - f2;
        if (f3 > 0.0f) {
            GL11.glPushMatrix();
            float f4 = 1.0f + f3 / 5.0f;
            GL11.glTranslatef((float)(n3 + 8), (float)(n4 + 12), (float)0.0f);
            GL11.glScalef((float)(1.0f / f4), (float)((f4 + 1.0f) / 2.0f), (float)1.0f);
            GL11.glTranslatef((float)(-(n3 + 8)), (float)(-(n4 + 12)), (float)0.0f);
        }
        i.b(this.k.l, this.k.P(), abu2, n3, n4);
        if (f3 > 0.0f) {
            GL11.glPopMatrix();
        }
        i.c(this.k.l, this.k.P(), abu2, n3, n4);
    }

    public void a() {
        if (this.p > 0) {
            --this.p;
        }
        ++this.n;
        this.m.a();
        if (this.k.h != null) {
            abu abu2 = this.k.h.bm.h();
            if (abu2 == null) {
                this.r = 0;
            } else if (this.s == null || abu2.b() != this.s.b() || !abu.a(abu2, this.s) || !abu2.g() && abu2.k() != this.s.k()) {
                this.r = 40;
            } else if (this.r > 0) {
                --this.r;
            }
            this.s = abu2;
        }
    }

    public void a(String string) {
        this.a(bsc.a("record.nowPlaying", string), true);
    }

    public void a(String string, boolean bl2) {
        this.o = string;
        this.p = 60;
        this.q = bl2;
    }

    public bav b() {
        return this.l;
    }

    public int c() {
        return this.n;
    }
}

