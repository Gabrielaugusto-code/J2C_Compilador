/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class bct
extends bcl {
    private static final AtomicInteger f = new AtomicInteger(0);
    private static final Logger g = LogManager.getLogger();
    private static final Random h = new Random();
    private float i;
    private String r = "missingno";
    private bau s;
    private int t;
    private bqj u;
    private boolean v = true;
    private static boolean w;
    private static boolean x;
    private final Object y = new Object();
    private String z;
    private String A = a;
    private String B;
    private static final brq C;
    private static final brq D;
    private static final brq[] E;
    public static final String a;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private brq L;
    private bau M;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bct() {
        BufferedReader bufferedReader = null;
        try {
            String string;
            ArrayList<String> arrayList = new ArrayList<String>();
            bufferedReader = new BufferedReader(new InputStreamReader(azi.B().Q().a(C).b(), Charsets.UTF_8));
            while ((string = bufferedReader.readLine()) != null) {
                if ((string = string.trim()).isEmpty()) continue;
                arrayList.add(string);
            }
            if (!arrayList.isEmpty()) {
                do {
                    this.r = (String)arrayList.get(h.nextInt(arrayList.size()));
                } while (this.r.hashCode() == 125780783);
            }
        }
        catch (IOException iOException) {
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
            }
        }
        this.i = h.nextFloat();
        this.z = "";
        if (!GLContext.getCapabilities().OpenGL20 && !bwg.b()) {
            this.z = bsc.a("title.oldgl1", new Object[0]);
            this.A = bsc.a("title.oldgl2", new Object[0]);
            this.B = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
        }
    }

    @Override
    public void c() {
        ++this.t;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void r_() {
        this.u = new bqj(256, 256);
        this.L = this.k.P().a("background", this.u);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (calendar.get(2) + 1 == 11 && calendar.get(5) == 9) {
            this.r = "Happy birthday, ez!";
        } else if (calendar.get(2) + 1 == 6 && calendar.get(5) == 1) {
            this.r = "Happy birthday, Notch!";
        } else if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
            this.r = "Merry X-mas!";
        } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
            this.r = "Happy new year!";
        } else if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31) {
            this.r = "OOoooOOOoooo! Spooky!";
        }
        int n2 = 24;
        int n3 = this.m / 4 + 48;
        if (this.k.u()) {
            this.c(n3, 24);
        } else {
            this.b(n3, 24);
        }
        this.h();
        this.n.add(new bau(0, this.l / 2 - 100, n3 + 72 + 12, 98, 20, bsc.a("menu.options", new Object[0])));
        this.n.add(new bau(4, this.l / 2 + 2, n3 + 72 + 12, 98, 20, bsc.a("menu.quit", new Object[0])));
        this.n.add(new bay(5, this.l / 2 - 124, n3 + 72 + 12));
        Object object = this.y;
        synchronized (object) {
            this.G = this.q.a(this.z);
            this.F = this.q.a(this.A);
            int n4 = Math.max(this.G, this.F);
            this.H = (this.l - n4) / 2;
            this.I = ((bau)this.n.get((int)0)).i - 24;
            this.J = this.H + n4;
            this.K = this.I + 24;
        }
    }

    private void h() {
        if (this.v) {
            if (!w) {
                w = true;
                new bcu(this, "MCO Availability Checker #" + f.incrementAndGet()).start();
            } else if (x) {
                this.i();
            }
        }
    }

    private void i() {
        this.M.m = true;
    }

    private void b(int n2, int n3) {
        this.n.add(new bau(1, this.l / 2 - 100, n2, bsc.a("menu.singleplayer", new Object[0])));
        this.n.add(new bau(2, this.l / 2 - 100, n2 + n3 * 1, bsc.a("menu.multiplayer", new Object[0])));
        this.M = new bau(14, this.l / 2 - 100, n2 + n3 * 2, bsc.a("menu.online", new Object[0]));
        this.n.add(this.M);
        this.M.m = false;
    }

    private void c(int n2, int n3) {
        this.n.add(new bau(11, this.l / 2 - 100, n2, bsc.a("menu.playdemo", new Object[0])));
        this.s = new bau(12, this.l / 2 - 100, n2 + n3 * 1, bsc.a("menu.resetdemo", new Object[0]));
        this.n.add(this.s);
        axv axv2 = this.k.d();
        axj axj2 = axv2.c("Demo_World");
        if (axj2 == null) {
            this.s.l = false;
        }
    }

    @Override
    protected void a(bau bau2) {
        axv axv2;
        axj axj2;
        if (bau2.k == 0) {
            this.k.a(new bcb(this, this.k.u));
        }
        if (bau2.k == 5) {
            this.k.a(new bby(this, this.k.u, this.k.S()));
        }
        if (bau2.k == 1) {
            this.k.a(new bcm(this));
        }
        if (bau2.k == 2) {
            this.k.a(new bgt(this));
        }
        if (bau2.k == 14 && this.M.m) {
            this.p();
        }
        if (bau2.k == 4) {
            this.k.k();
        }
        if (bau2.k == 11) {
            this.k.a("Demo_World", "Demo_World", md.a);
        }
        if (bau2.k == 12 && (axj2 = (axv2 = this.k.d()).c("Demo_World")) != null) {
            bbl bbl2 = bcm.a(this, axj2.k(), 12);
            this.k.a(bbl2);
        }
    }

    private void p() {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            if (bvf2.c().booleanValue()) {
                this.k.a(new bev(this));
            } else {
                this.k.a(new bfq(this));
            }
        }
        catch (bwa bwa2) {
            g.error("Couldn't connect to realms");
        }
        catch (IOException iOException) {
            g.error("Couldn't connect to realms");
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2 && n2 == 12) {
            axv axv2 = this.k.d();
            axv2.d();
            axv2.e("Demo_World");
            this.k.a(this);
        } else if (n2 == 13) {
            if (bl2) {
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object, new URI(this.B));
                }
                catch (Throwable throwable) {
                    g.error("Couldn't open link", throwable);
                }
            }
            this.k.a(this);
        }
    }

    private void b(int n2, int n3, float f2) {
        bna bna2 = bna.a;
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        Project.gluPerspective((float)120.0f, (float)1.0f, (float)0.05f, (float)10.0f);
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2884);
        GL11.glDepthMask((boolean)false);
        bwg.c(770, 771, 1, 0);
        int n4 = 8;
        for (int i2 = 0; i2 < n4 * n4; ++i2) {
            GL11.glPushMatrix();
            float f3 = ((float)(i2 % n4) / (float)n4 - 0.5f) / 64.0f;
            float f4 = ((float)(i2 / n4) / (float)n4 - 0.5f) / 64.0f;
            float f5 = 0.0f;
            GL11.glTranslatef((float)f3, (float)f4, (float)f5);
            GL11.glRotatef((float)(oy.a(((float)this.t + f2) / 400.0f) * 25.0f + 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(-((float)this.t + f2) * 0.1f), (float)0.0f, (float)1.0f, (float)0.0f);
            for (int i3 = 0; i3 < 6; ++i3) {
                GL11.glPushMatrix();
                if (i3 == 1) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (i3 == 2) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (i3 == 3) {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (i3 == 4) {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (i3 == 5) {
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                this.k.P().a(E[i3]);
                bna2.b();
                bna2.a(0xFFFFFF, 255 / (i2 + 1));
                float f6 = 0.0f;
                bna2.a(-1.0, -1.0, 1.0, 0.0f + f6, 0.0f + f6);
                bna2.a(1.0, -1.0, 1.0, 1.0f - f6, 0.0f + f6);
                bna2.a(1.0, 1.0, 1.0, 1.0f - f6, 1.0f - f6);
                bna2.a(-1.0, 1.0, 1.0, 0.0f + f6, 1.0f - f6);
                bna2.a();
                GL11.glPopMatrix();
            }
            GL11.glPopMatrix();
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        }
        bna2.b(0.0, 0.0, 0.0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2929);
    }

    private void a(float f2) {
        this.k.P().a(this.L);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)256, (int)256);
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        bna bna2 = bna.a;
        bna2.b();
        GL11.glDisable((int)3008);
        int n2 = 3;
        for (int i2 = 0; i2 < n2; ++i2) {
            bna2.a(1.0f, 1.0f, 1.0f, 1.0f / (float)(i2 + 1));
            int n3 = this.l;
            int n4 = this.m;
            float f3 = (float)(i2 - n2 / 2) / 256.0f;
            bna2.a(n3, n4, this.e, 0.0f + f3, 1.0);
            bna2.a(n3, 0.0, this.e, 1.0f + f3, 1.0);
            bna2.a(0.0, 0.0, this.e, 1.0f + f3, 0.0);
            bna2.a(0.0, n4, this.e, 0.0f + f3, 0.0);
        }
        bna2.a();
        GL11.glEnable((int)3008);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
    }

    private void c(int n2, int n3, float f2) {
        this.k.a().e();
        GL11.glViewport((int)0, (int)0, (int)256, (int)256);
        this.b(n2, n3, f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.k.a().a(true);
        GL11.glViewport((int)0, (int)0, (int)this.k.d, (int)this.k.e);
        bna bna2 = bna.a;
        bna2.b();
        float f3 = this.l > this.m ? 120.0f / (float)this.l : 120.0f / (float)this.m;
        float f4 = (float)this.m * f3 / 256.0f;
        float f5 = (float)this.l * f3 / 256.0f;
        bna2.a(1.0f, 1.0f, 1.0f, 1.0f);
        int n4 = this.l;
        int n5 = this.m;
        bna2.a(0.0, n5, this.e, 0.5f - f4, 0.5f + f5);
        bna2.a(n4, n5, this.e, 0.5f - f4, 0.5f - f5);
        bna2.a(n4, 0.0, this.e, 0.5f + f4, 0.5f - f5);
        bna2.a(0.0, 0.0, this.e, 0.5f + f4, 0.5f + f5);
        bna2.a();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        GL11.glDisable((int)3008);
        this.c(n2, n3, f2);
        GL11.glEnable((int)3008);
        bna bna2 = bna.a;
        int n4 = 274;
        int n5 = this.l / 2 - n4 / 2;
        int n6 = 30;
        this.a(0, 0, this.l, this.m, -2130706433, 0xFFFFFF);
        this.a(0, 0, this.l, this.m, 0, Integer.MIN_VALUE);
        this.k.P().a(D);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if ((double)this.i < 1.0E-4) {
            this.b(n5 + 0, n6 + 0, 0, 0, 99, 44);
            this.b(n5 + 99, n6 + 0, 129, 0, 27, 44);
            this.b(n5 + 99 + 26, n6 + 0, 126, 0, 3, 44);
            this.b(n5 + 99 + 26 + 3, n6 + 0, 99, 0, 26, 44);
            this.b(n5 + 155, n6 + 0, 0, 45, 155, 44);
        } else {
            this.b(n5 + 0, n6 + 0, 0, 0, 155, 44);
            this.b(n5 + 155, n6 + 0, 0, 45, 155, 44);
        }
        bna2.c(-1);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.l / 2 + 90), (float)70.0f, (float)0.0f);
        GL11.glRotatef((float)-20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        float f3 = 1.8f - oy.e(oy.a((float)(azi.K() % 1000L) / 1000.0f * (float)Math.PI * 2.0f) * 0.1f);
        f3 = f3 * 100.0f / (float)(this.q.a(this.r) + 32);
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        this.a(this.q, this.r, 0, -8, -256);
        GL11.glPopMatrix();
        String string = "Minecraft 1.7.3";
        if (this.k.u()) {
            string = string + " Demo";
        }
        this.b(this.q, string, 2, this.m - 10, -1);
        String string2 = "Copyright Mojang AB. Do not distribute!";
        this.b(this.q, string2, this.l - this.q.a(string2) - 2, this.m - 10, -1);
        if (this.z != null && this.z.length() > 0) {
            bct.a(this.H - 2, this.I - 2, this.J + 2, this.K - 1, 0x55200000);
            this.b(this.q, this.z, this.H, this.I, -1);
            this.b(this.q, this.A, (this.l - this.F) / 2, ((bau)this.n.get((int)0)).i - 12, -1);
        }
        super.a(n2, n3, f2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        Object object = this.y;
        synchronized (object) {
            if (this.z.length() > 0 && n2 >= this.H && n2 <= this.J && n3 >= this.I && n3 <= this.K) {
                bbk bbk2 = new bbk((bcl)this, this.B, 13, true);
                bbk2.g();
                this.k.a(bbk2);
            }
        }
    }

    static /* synthetic */ void a(bct bct2) {
        bct2.i();
    }

    static /* synthetic */ boolean a(boolean bl2) {
        x = bl2;
        return x;
    }

    static /* synthetic */ Logger g() {
        return g;
    }

    static {
        C = new brq("texts/splashes.txt");
        D = new brq("textures/gui/title/minecraft.png");
        E = new brq[]{new brq("textures/gui/title/background/panorama_0.png"), new brq("textures/gui/title/background/panorama_1.png"), new brq("textures/gui/title/background/panorama_2.png"), new brq("textures/gui/title/background/panorama_3.png"), new brq("textures/gui/title/background/panorama_4.png"), new brq("textures/gui/title/background/panorama_5.png")};
        a = "Please click " + (Object)((Object)a.t) + "here" + (Object)((Object)a.v) + " for more information.";
    }
}

