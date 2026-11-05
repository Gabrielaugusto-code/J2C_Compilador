/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Multimap
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.Sys
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.opengl.PixelFormat
 *  org.lwjgl.util.glu.GLU
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import io.netty.util.concurrent.GenericFutureListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.imageio.ImageIO;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class azi
implements qb {
    private static final Logger F = LogManager.getLogger();
    private static final brq G = new brq("textures/gui/title/mojang.png");
    public static final boolean a = u.a() == v.d;
    public static byte[] b = new byte[0xA00000];
    private static final List H = Lists.newArrayList((Object[])new DisplayMode[]{new DisplayMode(2560, 1600), new DisplayMode(2880, 1800)});
    private final File I;
    private final Multimap J;
    private bki K;
    private bqy L;
    private static azi M;
    public bjz c;
    private boolean N;
    private boolean O;
    private b P;
    public int d;
    public int e;
    private bak Q = new bak(20.0f);
    private pz R = new pz("client", this, MinecraftServer.ap());
    public bka f;
    public bmt g;
    public bkf h;
    public rm i;
    public qr j;
    public blh k;
    private final bal S;
    private boolean T;
    public ban l;
    public ban m;
    public bcl n;
    public bah o;
    public bmm p;
    private int U;
    private int V;
    private int W;
    private btk X;
    public bcx q;
    public bao r;
    public boolean s;
    public ayn t;
    public bac u;
    public azz v;
    public final File w;
    private final File Y;
    private final String Z;
    private final Proxy aa;
    private axv ab;
    private static int ac;
    private int ad;
    private boolean ae;
    private String af;
    private int ag;
    public boolean x;
    long y = azi.K();
    private int ah;
    private final boolean ai;
    private final boolean aj;
    private ef ak;
    private boolean al;
    public final oz z = new oz();
    private long am = -1L;
    private bro an;
    private final bsj ao = new bsj();
    private List ap = Lists.newArrayList();
    private bri aq;
    private brv ar;
    private bse as;
    private buz at;
    private bmz au;
    private bqs av;
    private buc aw;
    private btt ax;
    private brq ay;
    volatile boolean A = true;
    public String B = "";
    long C = azi.K();
    int D;
    long E = -1L;
    private String az = "root";

    public azi(bal bal2, int n2, int n3, boolean bl2, boolean bl3, File file, File file2, File file3, Proxy proxy, String string, Multimap multimap, String string2) {
        M = this;
        this.w = file;
        this.Y = file2;
        this.I = file3;
        this.Z = string;
        this.J = multimap;
        this.aq = new bri(new brh(file2, string2).a());
        this.ae();
        this.aa = proxy == null ? Proxy.NO_PROXY : proxy;
        this.ac();
        this.S = bal2;
        F.info("Setting user: " + bal2.c());
        F.info("(Session ID is " + bal2.a() + ")");
        this.aj = bl3;
        this.d = n2;
        this.e = n3;
        this.V = n2;
        this.W = n3;
        this.N = bl2;
        this.ai = azi.ab();
        ImageIO.setUseCache(false);
        ke.b();
    }

    private static boolean ab() {
        String[] stringArray;
        for (String string : stringArray = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"}) {
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return true;
        }
        return false;
    }

    public bmz a() {
        return this.au;
    }

    private void ac() {
        azj azj2 = new azj(this, "Timer hack thread");
        azj2.setDaemon(true);
        azj2.start();
    }

    public void a(b b2) {
        this.O = true;
        this.P = b2;
    }

    public void c(b b2) {
        File file = new File(azi.B().w, "crash-reports");
        File file2 = new File(file, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        System.out.println(b2.e());
        if (b2.f() != null) {
            System.out.println("#@!@# Game crashed! Crash report saved to: #@!@# " + b2.f());
            System.exit(-1);
        } else if (b2.a(file2)) {
            System.out.println("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
            System.exit(-1);
        } else {
            System.out.println("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }

    public void a(String string, int n2) {
        this.af = string;
        this.ag = n2;
    }

    private void ad() {
        this.u = new bac(this, this.w);
        if (this.u.B > 0 && this.u.A > 0) {
            this.d = this.u.A;
            this.e = this.u.B;
        }
        if (this.N) {
            Display.setFullscreen((boolean)true);
            this.d = Display.getDisplayMode().getWidth();
            this.e = Display.getDisplayMode().getHeight();
            if (this.d <= 0) {
                this.d = 1;
            }
            if (this.e <= 0) {
                this.e = 1;
            }
        } else {
            Display.setDisplayMode((DisplayMode)new DisplayMode(this.d, this.e));
        }
        Display.setResizable((boolean)true);
        Display.setTitle((String)"Minecraft 1.7.3");
        F.info("LWJGL Version: " + Sys.getVersion());
        v v2 = u.a();
        if (v2 != v.d) {
            try {
                InputStream inputStream = this.aq.c(new brq("icons/icon_16x16.png"));
                InputStream inputStream2 = this.aq.c(new brq("icons/icon_32x32.png"));
                if (inputStream != null && inputStream2 != null) {
                    Display.setIcon((ByteBuffer[])new ByteBuffer[]{this.a(inputStream), this.a(inputStream2)});
                }
            }
            catch (IOException iOException) {
                F.error("Couldn't set icon", (Throwable)iOException);
            }
        }
        try {
            Display.create((PixelFormat)new PixelFormat().withDepthBits(24));
        }
        catch (LWJGLException lWJGLException) {
            F.error("Couldn't set pixel format", (Throwable)lWJGLException);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (this.N) {
                this.af();
            }
            Display.create();
        }
        bwg.a();
        try {
            this.at = new bvb(this, (String)Iterables.getFirst((Iterable)this.J.get((Object)"twitch_access_token"), null));
        }
        catch (Throwable throwable) {
            this.at = new bve(throwable);
            F.error("Couldn't initialize twitch stream");
        }
        this.au = new bmz(this.d, this.e, true);
        this.au.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.q = new bcx(this);
        this.ao.a(new bsw(), bsv.class);
        this.ao.a(new bsq(), bsp.class);
        this.ao.a(new bso(), bsn.class);
        this.ao.a(new bsu(), bst.class);
        this.ao.a(new bss(), bsr.class);
        this.ab = new axe(new File(this.w, "saves"));
        this.ar = new brv(this.I, new File(this.w, "server-resource-packs"), this.aq, this.ao, this.u);
        this.an = new brz(this.ao);
        this.as = new bse(this.ao, this.u.aL);
        this.an.a(this.as);
        this.c();
        this.L = new bqy(this.an);
        this.an.a(this.L);
        this.ag();
        this.aw = new buc(this.an, this.u);
        this.an.a(this.aw);
        this.ax = new btt(this);
        this.l = new ban(this.u, new brq("textures/font/ascii.png"), this.L, false);
        if (this.u.aL != null) {
            this.l.a(this.b());
            this.l.b(this.as.b());
        }
        this.m = new ban(this.u, new brq("textures/font/ascii_sga.png"), this.L, false);
        this.an.a(this.l);
        this.an.a(this.m);
        this.an.a(new brn());
        this.an.a(new brm());
        bog.a.f = new bmr(this);
        this.p = new bmm(this, this.an);
        this.an.a(this.p);
        nt.f.a(new azr(this));
        this.v = new azz();
        this.b("Pre startup");
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7425);
        GL11.glClearDepth((double)1.0);
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glEnable((int)3008);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        GL11.glCullFace((int)1029);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode((int)5888);
        this.b("Startup");
        this.g = new bmt(this);
        this.av = new bqs(0, "textures/blocks");
        this.av.b(this.u.J);
        this.av.a(this.u.I);
        this.L.a(bqs.b, this.av);
        this.L.a(bqs.c, new bqs(1, "textures/items"));
        GL11.glViewport((int)0, (int)0, (int)this.d, (int)this.e);
        this.k = new blh(this.f, this.L);
        this.b("Post startup");
        this.r = new bao(this);
        if (this.af != null) {
            this.a(new bbm(new bct(), this, this.af, this.ag));
        } else {
            this.a(new bct());
        }
        this.L.c(this.ay);
        this.ay = null;
        this.o = new bah(this);
        if (this.u.t && !this.N) {
            this.o();
        }
        Display.setVSyncEnabled((boolean)this.u.u);
    }

    public boolean b() {
        return this.as.a() || this.u.aM;
    }

    public void c() {
        ArrayList arrayList = Lists.newArrayList((Iterable)this.ap);
        for (bry bry2 : this.ar.c()) {
            arrayList.add(bry2.c());
        }
        if (this.ar.e() != null) {
            arrayList.add(this.ar.e());
        }
        try {
            this.an.a(arrayList);
        }
        catch (bqr bqr2) {
            F.info("Caught error stitching, removing all assigned resourcepacks", (Throwable)bqr2);
            arrayList.clear();
            arrayList.addAll(this.ap);
            this.ar.a(Collections.emptyList());
            this.an.a(arrayList);
        }
        this.as.a(arrayList);
        if (this.g != null) {
            this.g.a();
        }
    }

    private void ae() {
        this.ap.add(this.aq);
    }

    private ByteBuffer a(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        int[] nArray = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * nArray.length);
        for (int n2 : nArray) {
            byteBuffer.putInt(n2 << 8 | n2 >> 24 & 0xFF);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    private void af() {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, Display.getAvailableDisplayModes());
        DisplayMode displayMode = Display.getDesktopDisplayMode();
        if (!hashSet.contains(displayMode) && u.a() == v.d) {
            block0: for (DisplayMode displayMode2 : H) {
                boolean bl2 = true;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.getBitsPerPixel() != 32 || displayMode3.getWidth() != displayMode2.getWidth() || displayMode3.getHeight() != displayMode2.getHeight()) continue;
                    bl2 = false;
                    break;
                }
                if (bl2) continue;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.getBitsPerPixel() != 32 || displayMode3.getWidth() != displayMode2.getWidth() / 2 || displayMode3.getHeight() != displayMode2.getHeight() / 2) continue;
                    displayMode = displayMode3;
                    continue block0;
                }
            }
        }
        Display.setDisplayMode((DisplayMode)displayMode);
        this.d = displayMode.getWidth();
        this.e = displayMode.getHeight();
    }

    private void ag() {
        bat bat2 = new bat(this, this.d, this.e);
        int n2 = bat2.e();
        bmz bmz2 = new bmz(bat2.a() * n2, bat2.b() * n2, true);
        bmz2.a(false);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)bat2.a(), (double)bat2.b(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3553);
        try {
            this.ay = this.L.a("logo", new bqj(ImageIO.read(this.aq.a(G))));
            this.L.a(this.ay);
        }
        catch (IOException iOException) {
            F.error("Unable to load logo: " + G, (Throwable)iOException);
        }
        bna bna2 = bna.a;
        bna2.b();
        bna2.c(0xFFFFFF);
        bna2.a(0.0, this.e, 0.0, 0.0, 0.0);
        bna2.a(this.d, this.e, 0.0, 0.0, 0.0);
        bna2.a(this.d, 0.0, 0.0, 0.0, 0.0);
        bna2.a(0.0, 0.0, 0.0, 0.0, 0.0);
        bna2.a();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bna2.c(0xFFFFFF);
        int n3 = 256;
        int n4 = 256;
        this.a((bat2.a() - n3) / 2, (bat2.b() - n4) / 2, 0, 0, n3, n4);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        bmz2.e();
        bmz2.c(bat2.a() * n2, bat2.b() * n2);
        GL11.glEnable((int)3008);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        GL11.glFlush();
        this.g();
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(n2 + 0, n3 + n7, 0.0, (float)(n4 + 0) * f2, (float)(n5 + n7) * f3);
        bna2.a(n2 + n6, n3 + n7, 0.0, (float)(n4 + n6) * f2, (float)(n5 + n7) * f3);
        bna2.a(n2 + n6, n3 + 0, 0.0, (float)(n4 + n6) * f2, (float)(n5 + 0) * f3);
        bna2.a(n2 + 0, n3 + 0, 0.0, (float)(n4 + 0) * f2, (float)(n5 + 0) * f3);
        bna2.a();
    }

    public axv d() {
        return this.ab;
    }

    public void a(bcl bcl2) {
        if (this.n != null) {
            this.n.b();
        }
        if (bcl2 == null && this.f == null) {
            bcl2 = new bct();
        } else if (bcl2 == null && this.h.aR() <= 0.0f) {
            bcl2 = new bbr();
        }
        if (bcl2 instanceof bct) {
            this.u.ay = false;
            this.r.b().a();
        }
        this.n = bcl2;
        if (bcl2 != null) {
            this.m();
            bat bat2 = new bat(this, this.d, this.e);
            int n2 = bat2.a();
            int n3 = bat2.b();
            bcl2.a(this, n2, n3);
            this.s = false;
        } else {
            this.aw.e();
            this.l();
        }
    }

    private void b(String string) {
        int n2 = GL11.glGetError();
        if (n2 != 0) {
            String string2 = GLU.gluErrorString((int)n2);
            F.error("########## GL ERROR ##########");
            F.error("@ " + string);
            F.error(n2 + ": " + string2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e() {
        try {
            this.at.i();
            F.info("Stopping!");
            try {
                this.a((bka)null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                azh.a();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.aw.d();
        }
        finally {
            Display.destroy();
            if (!this.O) {
                System.exit(0);
            }
        }
        System.gc();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        this.A = true;
        try {
            this.ad();
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Initializing game");
            b2.a("Initialization");
            this.c(this.b(b2));
            return;
        }
        try {
            while (this.A) {
                if (this.O && this.P != null) {
                    this.c(this.P);
                    return;
                }
                try {
                    this.ah();
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    this.j();
                    this.a(new bcd());
                    System.gc();
                }
            }
        }
        catch (baj baj2) {
        }
        catch (s s2) {
            this.b(s2.a());
            this.j();
            F.fatal("Reported exception thrown!", (Throwable)s2);
            this.c(s2.a());
        }
        catch (Throwable throwable) {
            b b3 = this.b(new b("Unexpected error", throwable));
            this.j();
            F.fatal("Unreported exception thrown!", throwable);
            this.c(b3);
        }
        finally {
            this.e();
        }
    }

    private void ah() {
        ayk.a().a();
        if (this.f != null) {
            this.f.V().a();
        }
        this.z.a("root");
        if (Display.isCreated() && Display.isCloseRequested()) {
            this.k();
        }
        if (this.T && this.f != null) {
            float f2 = this.Q.c;
            this.Q.a();
            this.Q.c = f2;
        } else {
            this.Q.a();
        }
        if ((this.f == null || this.n == null) && this.ae) {
            this.ae = false;
            this.c();
        }
        long l2 = System.nanoTime();
        this.z.a("tick");
        for (int i2 = 0; i2 < this.Q.b; ++i2) {
            this.p();
        }
        this.z.c("preRenderErrors");
        long l3 = System.nanoTime() - l2;
        this.b("Pre render");
        bmf.b = this.u.i;
        this.z.c("sound");
        this.aw.a(this.h, this.Q.c);
        this.z.b();
        this.z.a("render");
        GL11.glPushMatrix();
        GL11.glClear((int)16640);
        this.au.a(true);
        this.z.a("display");
        GL11.glEnable((int)3553);
        if (this.h != null && this.h.Z()) {
            this.u.ax = 0;
        }
        this.z.b();
        if (!this.s) {
            this.z.c("gameRenderer");
            this.p.b(this.Q.c);
            this.z.b();
        }
        GL11.glFlush();
        this.z.b();
        if (!Display.isActive() && this.N) {
            this.o();
        }
        if (this.u.ay && this.u.az) {
            if (!this.z.a) {
                this.z.a();
            }
            this.z.a = true;
            this.a(l3);
        } else {
            this.z.a = false;
            this.E = System.nanoTime();
        }
        this.q.a();
        this.au.e();
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.au.c(this.d, this.e);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.p.c(this.Q.c);
        GL11.glPopMatrix();
        this.z.a("root");
        this.g();
        Thread.yield();
        this.z.a("stream");
        this.z.a("update");
        this.at.j();
        this.z.c("submit");
        this.at.k();
        this.z.b();
        this.z.b();
        this.b("Post render");
        ++this.D;
        boolean bl2 = this.T = this.G() && this.n != null && this.n.f() && !this.X.a();
        while (azi.K() >= this.C + 1000L) {
            ac = this.D;
            this.B = ac + " fps, " + bmh.b + " chunk updates";
            bmh.b = 0;
            this.C += 1000L;
            this.D = 0;
            this.R.b();
            if (this.R.d()) continue;
            this.R.a();
        }
        this.z.b();
        if (this.i()) {
            Display.sync((int)this.h());
        }
    }

    public void g() {
        Display.update();
        if (!this.N && Display.wasResized()) {
            int n2 = this.d;
            int n3 = this.e;
            this.d = Display.getWidth();
            this.e = Display.getHeight();
            if (this.d != n2 || this.e != n3) {
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
                this.a(this.d, this.e);
            }
        }
    }

    public int h() {
        if (this.f == null && this.n != null) {
            return 30;
        }
        return this.u.h;
    }

    public boolean i() {
        return (float)this.h() < baf.j.f();
    }

    public void j() {
        try {
            b = new byte[0];
            this.g.h();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            ayk.a().b();
            this.f.V().b();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            this.a((bka)null);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    private void b(int n2) {
        List list = this.z.b(this.az);
        if (list == null || list.isEmpty()) {
            return;
        }
        pa pa2 = (pa)list.remove(0);
        if (n2 == 0) {
            int n3;
            if (pa2.c.length() > 0 && (n3 = this.az.lastIndexOf(".")) >= 0) {
                this.az = this.az.substring(0, n3);
            }
        } else if (--n2 < list.size() && !((pa)list.get((int)n2)).c.equals("unspecified")) {
            if (this.az.length() > 0) {
                this.az = this.az + ".";
            }
            this.az = this.az + ((pa)list.get((int)n2)).c;
        }
    }

    private void a(long l2) {
        int n2;
        Object object;
        if (!this.z.a) {
            return;
        }
        List list = this.z.b(this.az);
        pa pa2 = (pa)list.remove(0);
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glEnable((int)2903);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)this.d, (double)this.e, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        bna bna2 = bna.a;
        int n3 = 160;
        int n4 = this.d - n3 - 10;
        int n5 = this.e - n3 * 2;
        GL11.glEnable((int)3042);
        bna2.b();
        bna2.a(0, 200);
        bna2.a((double)((float)n4 - (float)n3 * 1.1f), (double)((float)n5 - (float)n3 * 0.6f - 16.0f), 0.0);
        bna2.a((double)((float)n4 - (float)n3 * 1.1f), (double)(n5 + n3 * 2), 0.0);
        bna2.a((double)((float)n4 + (float)n3 * 1.1f), (double)(n5 + n3 * 2), 0.0);
        bna2.a((double)((float)n4 + (float)n3 * 1.1f), (double)((float)n5 - (float)n3 * 0.6f - 16.0f), 0.0);
        bna2.a();
        GL11.glDisable((int)3042);
        double d2 = 0.0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            float f2;
            float f3;
            float f4;
            int n6;
            object = (pa)list.get(i2);
            n2 = oy.c(((pa)object).a / 4.0) + 1;
            bna2.a(6);
            bna2.c(((pa)object).a());
            bna2.a((double)n4, (double)n5, 0.0);
            for (n6 = n2; n6 >= 0; --n6) {
                f4 = (float)((d2 + ((pa)object).a * (double)n6 / (double)n2) * 3.1415927410125732 * 2.0 / 100.0);
                f3 = oy.a(f4) * (float)n3;
                f2 = oy.b(f4) * (float)n3 * 0.5f;
                bna2.a((double)((float)n4 + f3), (double)((float)n5 - f2), 0.0);
            }
            bna2.a();
            bna2.a(5);
            bna2.c((((pa)object).a() & 0xFEFEFE) >> 1);
            for (n6 = n2; n6 >= 0; --n6) {
                f4 = (float)((d2 + ((pa)object).a * (double)n6 / (double)n2) * 3.1415927410125732 * 2.0 / 100.0);
                f3 = oy.a(f4) * (float)n3;
                f2 = oy.b(f4) * (float)n3 * 0.5f;
                bna2.a((double)((float)n4 + f3), (double)((float)n5 - f2), 0.0);
                bna2.a((double)((float)n4 + f3), (double)((float)n5 - f2 + 10.0f), 0.0);
            }
            bna2.a();
            d2 += ((pa)object).a;
        }
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        GL11.glEnable((int)3553);
        object = "";
        if (!pa2.c.equals("unspecified")) {
            object = (String)object + "[0] ";
        }
        object = pa2.c.length() == 0 ? (String)object + "ROOT " : (String)object + pa2.c + " ";
        n2 = 0xFFFFFF;
        this.l.a((String)object, n4 - n3, n5 - n3 / 2 - 16, n2);
        object = decimalFormat.format(pa2.b) + "%";
        this.l.a((String)object, n4 + n3 - this.l.a((String)object), n5 - n3 / 2 - 16, n2);
        for (int i3 = 0; i3 < list.size(); ++i3) {
            pa pa3 = (pa)list.get(i3);
            String string = "";
            string = pa3.c.equals("unspecified") ? string + "[?] " : string + "[" + (i3 + 1) + "] ";
            string = string + pa3.c;
            this.l.a(string, n4 - n3, n5 + n3 / 2 + i3 * 8 + 20, pa3.a());
            string = decimalFormat.format(pa3.a) + "%";
            this.l.a(string, n4 + n3 - 50 - this.l.a(string), n5 + n3 / 2 + i3 * 8 + 20, pa3.a());
            string = decimalFormat.format(pa3.b) + "%";
            this.l.a(string, n4 + n3 - this.l.a(string), n5 + n3 / 2 + i3 * 8 + 20, pa3.a());
        }
    }

    public void k() {
        this.A = false;
    }

    public void l() {
        if (!Display.isActive()) {
            return;
        }
        if (this.x) {
            return;
        }
        this.x = true;
        this.v.a();
        this.a((bcl)null);
        this.U = 10000;
    }

    public void m() {
        if (!this.x) {
            return;
        }
        azf.a();
        this.x = false;
        this.v.b();
    }

    public void n() {
        if (this.n != null) {
            return;
        }
        this.a(new bce());
        if (this.G() && !this.X.a()) {
            this.aw.b();
        }
    }

    private void a(boolean bl2) {
        if (!bl2) {
            this.U = 0;
        }
        if (this.U > 0) {
            return;
        }
        if (bl2 && this.t != null && this.t.a == ayo.b) {
            int n2 = this.t.b;
            int n3 = this.t.c;
            int n4 = this.t.d;
            if (this.f.a(n2, n3, n4).o() != avk.a) {
                this.c.c(n2, n3, n4, this.t.e);
                if (this.h.d(n2, n3, n4)) {
                    this.k.a(n2, n3, n4, this.t.e);
                    this.h.aZ();
                }
            }
            return;
        }
        this.c.c();
    }

    private void ai() {
        if (this.U > 0) {
            return;
        }
        this.h.aZ();
        if (this.t == null) {
            F.error("Null returned as 'hitResult', this shouldn't happen!");
            if (this.c.g()) {
                this.U = 10;
            }
            return;
        }
        switch (this.t.a) {
            case c: {
                this.c.a(this.h, this.t.g);
                break;
            }
            case b: {
                int n2 = this.t.b;
                int n3 = this.t.c;
                int n4 = this.t.d;
                if (this.f.a(n2, n3, n4).o() == avk.a) {
                    if (!this.c.g()) break;
                    this.U = 10;
                    break;
                }
                this.c.b(n2, n3, n4, this.t.e);
            }
        }
    }

    private void aj() {
        abu abu2;
        this.ad = 4;
        boolean bl2 = true;
        abu abu3 = this.h.bm.h();
        if (this.t == null) {
            F.warn("Null returned as 'hitResult', this shouldn't happen!");
        } else {
            switch (this.t.a) {
                case c: {
                    if (!this.c.b(this.h, this.t.g)) break;
                    bl2 = false;
                    break;
                }
                case b: {
                    int n2;
                    int n3 = this.t.b;
                    int n4 = this.t.c;
                    int n5 = this.t.d;
                    if (this.f.a(n3, n4, n5).o() == avk.a) break;
                    int n6 = n2 = abu3 != null ? abu3.b : 0;
                    if (this.c.a(this.h, this.f, abu3, n3, n4, n5, this.t.e, this.t.f)) {
                        bl2 = false;
                        this.h.aZ();
                    }
                    if (abu3 == null) {
                        return;
                    }
                    if (abu3.b == 0) {
                        this.h.bm.a[this.h.bm.c] = null;
                        break;
                    }
                    if (abu3.b == n2 && !this.c.h()) break;
                    this.p.c.b();
                }
            }
        }
        if (bl2 && (abu2 = this.h.bm.h()) != null && this.c.a(this.h, this.f, abu2)) {
            this.p.c.c();
        }
    }

    public void o() {
        try {
            boolean bl2 = this.N = !this.N;
            if (this.N) {
                this.af();
                this.d = Display.getDisplayMode().getWidth();
                this.e = Display.getDisplayMode().getHeight();
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
            } else {
                Display.setDisplayMode((DisplayMode)new DisplayMode(this.V, this.W));
                this.d = this.V;
                this.e = this.W;
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
            }
            if (this.n != null) {
                this.a(this.d, this.e);
            } else {
                this.ak();
            }
            Display.setFullscreen((boolean)this.N);
            Display.setVSyncEnabled((boolean)this.u.u);
            this.g();
        }
        catch (Exception exception) {
            F.error("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    private void a(int n2, int n3) {
        this.d = n2 <= 0 ? 1 : n2;
        int n4 = this.e = n3 <= 0 ? 1 : n3;
        if (this.n != null) {
            bat bat2 = new bat(this, n2, n3);
            int n5 = bat2.a();
            int n6 = bat2.b();
            this.n.a(this, n5, n6);
        }
        this.o = new bah(this);
        this.ak();
    }

    private void ak() {
        this.au.a(this.d, this.e);
        if (this.p != null) {
            this.p.a(this.d, this.e);
        }
    }

    public void p() {
        if (this.ad > 0) {
            --this.ad;
        }
        this.z.a("gui");
        if (!this.T) {
            this.r.a();
        }
        this.z.c("pick");
        this.p.a(1.0f);
        this.z.c("gameMode");
        if (!this.T && this.f != null) {
            this.c.e();
        }
        this.z.c("textures");
        if (!this.T) {
            this.L.e();
        }
        if (this.n == null && this.h != null) {
            if (this.h.aR() <= 0.0f) {
                this.a((bcl)null);
            } else if (this.h.bl() && this.f != null) {
                this.a(new bbx());
            }
        } else if (this.n != null && this.n instanceof bbx && !this.h.bl()) {
            this.a((bcl)null);
        }
        if (this.n != null) {
            this.U = 10000;
        }
        if (this.n != null) {
            try {
                this.n.k();
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Updating screen events");
                k k2 = b2.a("Affected screen");
                k2.a("Screen name", new azs(this));
                throw new s(b2);
            }
            if (this.n != null) {
                try {
                    this.n.c();
                }
                catch (Throwable throwable) {
                    b b3 = b.a(throwable, "Ticking screen");
                    k k3 = b3.a("Affected screen");
                    k3.a("Screen name", new azt(this));
                    throw new s(b3);
                }
            }
        }
        if (this.n == null || this.n.p) {
            int n2;
            this.z.c("mouse");
            while (Mouse.next()) {
                long l2;
                n2 = Mouse.getEventButton();
                azf.a(n2 - 100, Mouse.getEventButtonState());
                if (Mouse.getEventButtonState()) {
                    azf.a(n2 - 100);
                }
                if ((l2 = azi.K() - this.y) > 200L) continue;
                int n3 = Mouse.getEventDWheel();
                if (n3 != 0) {
                    this.h.bm.c(n3);
                    if (this.u.aB) {
                        if (n3 > 0) {
                            n3 = 1;
                        }
                        if (n3 < 0) {
                            n3 = -1;
                        }
                        this.u.aE += (float)n3 * 0.25f;
                    }
                }
                if (this.n == null) {
                    if (this.x || !Mouse.getEventButtonState()) continue;
                    this.l();
                    continue;
                }
                if (this.n == null) continue;
                this.n.d();
            }
            if (this.U > 0) {
                --this.U;
            }
            this.z.c("keyboard");
            while (Keyboard.next()) {
                azf.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
                if (Keyboard.getEventKeyState()) {
                    azf.a(Keyboard.getEventKey());
                }
                if (this.am > 0L) {
                    if (azi.K() - this.am >= 6000L) {
                        throw new s(new b("Manually triggered debug crash", new Throwable()));
                    }
                    if (!Keyboard.isKeyDown((int)46) || !Keyboard.isKeyDown((int)61)) {
                        this.am = -1L;
                    }
                } else if (Keyboard.isKeyDown((int)46) && Keyboard.isKeyDown((int)61)) {
                    this.am = azi.K();
                }
                this.aa();
                if (!Keyboard.getEventKeyState()) continue;
                if (Keyboard.getEventKey() == 62 && this.p != null) {
                    this.p.b();
                }
                if (this.n != null) {
                    this.n.l();
                } else {
                    if (Keyboard.getEventKey() == 1) {
                        this.n();
                    }
                    if (Keyboard.getEventKey() == 31 && Keyboard.isKeyDown((int)61)) {
                        this.c();
                    }
                    if (Keyboard.getEventKey() == 20 && Keyboard.isKeyDown((int)61)) {
                        this.c();
                    }
                    if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown((int)61)) {
                        n2 = Keyboard.isKeyDown((int)42) | Keyboard.isKeyDown((int)54);
                        this.u.a(baf.f, n2 != 0 ? -1 : 1);
                    }
                    if (Keyboard.getEventKey() == 30 && Keyboard.isKeyDown((int)61)) {
                        this.g.a();
                    }
                    if (Keyboard.getEventKey() == 35 && Keyboard.isKeyDown((int)61)) {
                        this.u.w = !this.u.w;
                        this.u.b();
                    }
                    if (Keyboard.getEventKey() == 48 && Keyboard.isKeyDown((int)61)) {
                        boolean bl2 = bog.p = !bog.p;
                    }
                    if (Keyboard.getEventKey() == 25 && Keyboard.isKeyDown((int)61)) {
                        this.u.x = !this.u.x;
                        this.u.b();
                    }
                    if (Keyboard.getEventKey() == 59) {
                        boolean bl3 = this.u.aw = !this.u.aw;
                    }
                    if (Keyboard.getEventKey() == 61) {
                        this.u.ay = !this.u.ay;
                        this.u.az = bcl.n();
                    }
                    if (this.u.al.f()) {
                        ++this.u.ax;
                        if (this.u.ax > 2) {
                            this.u.ax = 0;
                        }
                    }
                    if (this.u.am.f()) {
                        boolean bl4 = this.u.aC = !this.u.aC;
                    }
                }
                if (!this.u.ay || !this.u.az) continue;
                if (Keyboard.getEventKey() == 11) {
                    this.b(0);
                }
                for (n2 = 0; n2 < 9; ++n2) {
                    if (Keyboard.getEventKey() != 2 + n2) continue;
                    this.b(n2 + 1);
                }
            }
            for (n2 = 0; n2 < 9; ++n2) {
                if (!this.u.as[n2].f()) continue;
                this.h.bm.c = n2;
            }
            int n4 = n2 = this.u.m != xs.c ? 1 : 0;
            while (this.u.ab.f()) {
                if (this.c.j()) {
                    this.h.j();
                    continue;
                }
                this.v().a(new ij(ik.c));
                this.a(new bek(this.h));
            }
            while (this.u.ad.f()) {
                this.h.a(bcl.m());
            }
            while (this.u.ah.f() && n2 != 0) {
                this.a(new bbj());
            }
            if (this.n == null && this.u.aj.f() && n2 != 0) {
                this.a(new bbj("/"));
            }
            if (this.h.bx()) {
                if (!this.u.ac.d()) {
                    this.c.c(this.h);
                }
                while (this.u.ae.f()) {
                }
                while (this.u.ac.f()) {
                }
                while (this.u.af.f()) {
                }
            } else {
                while (this.u.ae.f()) {
                    this.ai();
                }
                while (this.u.ac.f()) {
                    this.aj();
                }
                while (this.u.af.f()) {
                    this.al();
                }
            }
            if (this.u.ac.d() && this.ad == 0 && !this.h.bx()) {
                this.aj();
            }
            this.a(this.n == null && this.u.ae.d() && this.x);
        }
        if (this.f != null) {
            if (this.h != null) {
                ++this.ah;
                if (this.ah == 30) {
                    this.ah = 0;
                    this.f.h(this.h);
                }
            }
            this.z.c("gameRenderer");
            if (!this.T) {
                this.p.d();
            }
            this.z.c("levelRenderer");
            if (!this.T) {
                this.g.g();
            }
            this.z.c("level");
            if (!this.T) {
                if (this.f.q > 0) {
                    --this.f.q;
                }
                this.f.h();
            }
        }
        if (!this.T) {
            this.ax.a();
            this.aw.a();
        }
        if (this.f != null) {
            if (!this.T) {
                this.f.a(this.f.r != pu.a, true);
                try {
                    this.f.b();
                }
                catch (Throwable throwable) {
                    b b4 = b.a(throwable, "Exception in world tick");
                    if (this.f == null) {
                        k k4 = b4.a("Affected level");
                        k4.a("Problem", "Level is null!");
                    } else {
                        this.f.a(b4);
                    }
                    throw new s(b4);
                }
            }
            this.z.c("animateTick");
            if (!this.T && this.f != null) {
                this.f.C(oy.c(this.h.s), oy.c(this.h.t), oy.c(this.h.u));
            }
            this.z.c("particles");
            if (!this.T) {
                this.k.a();
            }
        } else if (this.ak != null) {
            this.z.c("pendingConnection");
            this.ak.a();
        }
        this.z.b();
        this.y = azi.K();
    }

    public void a(String string, String string2, aga aga2) {
        Object object;
        this.a((bka)null);
        System.gc();
        axt axt2 = this.ab.a(string, false);
        axj axj2 = axt2.d();
        if (axj2 == null && aga2 != null) {
            axj2 = new axj(aga2, string);
            axt2.a(axj2);
        }
        if (aga2 == null) {
            aga2 = new aga(axj2);
        }
        try {
            this.X = new btk(this, string, string2, aga2);
            this.X.w();
            this.al = true;
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Starting integrated server");
            k k2 = b2.a("Starting integrated server");
            k2.a("Level ID", string);
            k2.a("Level Name", string2);
            throw new s(b2);
        }
        this.o.a(bsc.a("menu.loadingLevel", new Object[0]));
        while (!this.X.ah()) {
            object = this.X.f();
            if (object != null) {
                this.o.c(bsc.a((String)object, new Object[0]));
            } else {
                this.o.c("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.a((bcl)null);
        object = this.X.ag().a();
        ef ef2 = ef.a((SocketAddress)object);
        ef2.a(new bju(ef2, this, null));
        ef2.a(new jg(4, object.toString(), 0, ek.d), new GenericFutureListener[0]);
        ef2.a(new jn(this.M().e()), new GenericFutureListener[0]);
        this.ak = ef2;
    }

    public void a(bka bka2) {
        this.a(bka2, "");
    }

    public void a(bka bka2, String string) {
        if (bka2 == null) {
            bjw bjw2 = this.v();
            if (bjw2 != null) {
                bjw2.c();
            }
            if (this.X != null) {
                this.X.q();
            }
            this.X = null;
            this.q.b();
            this.p.i().a();
        }
        this.i = null;
        this.ak = null;
        if (this.o != null) {
            this.o.b(string);
            this.o.c("");
        }
        if (bka2 == null && this.f != null) {
            if (this.ar.e() != null) {
                this.C();
            }
            this.ar.f();
            this.a((bki)null);
            this.al = false;
        }
        this.aw.c();
        this.f = bka2;
        if (bka2 != null) {
            if (this.g != null) {
                this.g.a(bka2);
            }
            if (this.k != null) {
                this.k.a(bka2);
            }
            if (this.h == null) {
                this.h = this.c.a(bka2, new oh());
                this.c.b(this.h);
            }
            this.h.z();
            bka2.d(this.h);
            this.h.c = new bmc(this.u);
            this.c.a(this.h);
            this.i = this.h;
        } else {
            this.ab.d();
            this.h = null;
        }
        System.gc();
        this.y = 0L;
    }

    public String q() {
        return this.g.d();
    }

    public String r() {
        return this.g.e();
    }

    public String s() {
        return this.f.A();
    }

    public String t() {
        return "P: " + this.k.b() + ". T: " + this.f.z();
    }

    public void a(int n2) {
        this.f.f();
        this.f.a();
        int n3 = 0;
        String string = null;
        if (this.h != null) {
            n3 = this.h.x();
            this.f.e(this.h);
            string = this.h.l();
        }
        this.i = null;
        this.h = this.c.a(this.f, this.h == null ? new oh() : this.h.m());
        this.h.ap = n2;
        this.i = this.h;
        this.h.z();
        this.h.b(string);
        this.f.d(this.h);
        this.c.b(this.h);
        this.h.c = new bmc(this.u);
        this.h.d(n3);
        this.c.a(this.h);
        if (this.n instanceof bbr) {
            this.a((bcl)null);
        }
    }

    public final boolean u() {
        return this.aj;
    }

    public bjw v() {
        if (this.h != null) {
            return this.h.a;
        }
        return null;
    }

    public static boolean w() {
        return M == null || !azi.M.u.aw;
    }

    public static boolean x() {
        return M != null && azi.M.u.i;
    }

    public static boolean y() {
        return M != null && azi.M.u.j != 0;
    }

    private void al() {
        abs abs2;
        int n2;
        if (this.t == null) {
            return;
        }
        boolean bl2 = this.h.bE.d;
        int n3 = 0;
        boolean bl3 = false;
        if (this.t.a == ayo.b) {
            n2 = this.t.b;
            int n4 = this.t.c;
            int n5 = this.t.d;
            ahz ahz2 = this.f.a(n2, n4, n5);
            if (ahz2.o() == avk.a) {
                return;
            }
            abs2 = ahz2.d(this.f, n2, n4, n5);
            if (abs2 == null) {
                return;
            }
            bl3 = abs2.n();
            ahz ahz3 = abs2 instanceof zy && !ahz2.K() ? ahz.a(abs2) : ahz2;
            n3 = ahz3.k(this.f, n2, n4, n5);
        } else if (this.t.a == ayo.c && this.t.g != null && bl2) {
            if (this.t.g instanceof rs) {
                abs2 = abv.an;
            } else if (this.t.g instanceof rl) {
                abs2 = abv.ca;
            } else if (this.t.g instanceof rk) {
                rk rk2 = (rk)this.t.g;
                abu abu2 = rk2.j();
                if (abu2 == null) {
                    abs2 = abv.bD;
                } else {
                    abs2 = abu2.b();
                    n3 = abu2.k();
                    bl3 = true;
                }
            } else if (this.t.g instanceof wc) {
                wc wc2 = (wc)this.t.g;
                abs2 = wc2.m() == 2 ? abv.aJ : (wc2.m() == 1 ? abv.aI : (wc2.m() == 3 ? abv.bV : (wc2.m() == 5 ? abv.bW : (wc2.m() == 6 ? abv.cc : abv.au))));
            } else if (this.t.g instanceof vz) {
                abs2 = abv.az;
            } else {
                abs2 = abv.bx;
                n3 = qx.a(this.t.g);
                bl3 = true;
                if (n3 <= 0 || !qx.a.containsKey(n3)) {
                    return;
                }
            }
        } else {
            return;
        }
        this.h.bm.a(abs2, n3, bl3, bl2);
        if (bl2) {
            n2 = this.h.bn.c.size() - 9 + this.h.bm.c;
            this.c.a(this.h.bm.a(this.h.bm.c), n2);
        }
    }

    public b b(b b2) {
        b2.g().a("Launched Version", new azu(this));
        b2.g().a("LWJGL", new azv(this));
        b2.g().a("OpenGL", new azw(this));
        b2.g().a("GL Caps", new azx(this));
        b2.g().a("Is Modded", new azy(this));
        b2.g().a("Type", new azk(this));
        b2.g().a("Resource Packs", new azl(this));
        b2.g().a("Current Language", new azm(this));
        b2.g().a("Profiler Position", new azn(this));
        b2.g().a("Vec3 Pool Size", new azo(this));
        b2.g().a("Anisotropic Filtering", new azp(this));
        if (this.f != null) {
            this.f.a(b2);
        }
        return b2;
    }

    public static azi B() {
        return M;
    }

    public void C() {
        this.ae = true;
    }

    @Override
    public void a(pz pz2) {
        pz2.a("fps", ac);
        pz2.a("vsync_enabled", this.u.u);
        pz2.a("display_frequency", Display.getDisplayMode().getFrequency());
        pz2.a("display_type", this.N ? "fullscreen" : "windowed");
        pz2.a("run_time", (MinecraftServer.ap() - pz2.g()) / 60L * 1000L);
        pz2.a("resource_packs", this.ar.c().size());
        int n2 = 0;
        for (bry bry2 : this.ar.c()) {
            pz2.a("resource_pack[" + n2++ + "]", bry2.d());
        }
        if (this.X != null && this.X.al() != null) {
            pz2.a("snooper_partner", this.X.al().f());
        }
    }

    @Override
    public void b(pz pz2) {
        pz2.b("opengl_version", GL11.glGetString((int)7938));
        pz2.b("opengl_vendor", GL11.glGetString((int)7936));
        pz2.b("client_brand", ClientBrandRetriever.getClientModName());
        pz2.b("launched_version", this.Z);
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        pz2.b("gl_caps[ARB_arrays_of_arrays]", contextCapabilities.GL_ARB_arrays_of_arrays);
        pz2.b("gl_caps[ARB_base_instance]", contextCapabilities.GL_ARB_base_instance);
        pz2.b("gl_caps[ARB_blend_func_extended]", contextCapabilities.GL_ARB_blend_func_extended);
        pz2.b("gl_caps[ARB_clear_buffer_object]", contextCapabilities.GL_ARB_clear_buffer_object);
        pz2.b("gl_caps[ARB_color_buffer_float]", contextCapabilities.GL_ARB_color_buffer_float);
        pz2.b("gl_caps[ARB_compatibility]", contextCapabilities.GL_ARB_compatibility);
        pz2.b("gl_caps[ARB_compressed_texture_pixel_storage]", contextCapabilities.GL_ARB_compressed_texture_pixel_storage);
        pz2.b("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
        pz2.b("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
        pz2.b("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
        pz2.b("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
        pz2.b("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
        pz2.b("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
        pz2.b("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
        pz2.b("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
        pz2.b("gl_caps[ARB_depth_clamp]", contextCapabilities.GL_ARB_depth_clamp);
        pz2.b("gl_caps[ARB_depth_texture]", contextCapabilities.GL_ARB_depth_texture);
        pz2.b("gl_caps[ARB_draw_buffers]", contextCapabilities.GL_ARB_draw_buffers);
        pz2.b("gl_caps[ARB_draw_buffers_blend]", contextCapabilities.GL_ARB_draw_buffers_blend);
        pz2.b("gl_caps[ARB_draw_elements_base_vertex]", contextCapabilities.GL_ARB_draw_elements_base_vertex);
        pz2.b("gl_caps[ARB_draw_indirect]", contextCapabilities.GL_ARB_draw_indirect);
        pz2.b("gl_caps[ARB_draw_instanced]", contextCapabilities.GL_ARB_draw_instanced);
        pz2.b("gl_caps[ARB_explicit_attrib_location]", contextCapabilities.GL_ARB_explicit_attrib_location);
        pz2.b("gl_caps[ARB_explicit_uniform_location]", contextCapabilities.GL_ARB_explicit_uniform_location);
        pz2.b("gl_caps[ARB_fragment_layer_viewport]", contextCapabilities.GL_ARB_fragment_layer_viewport);
        pz2.b("gl_caps[ARB_fragment_program]", contextCapabilities.GL_ARB_fragment_program);
        pz2.b("gl_caps[ARB_fragment_shader]", contextCapabilities.GL_ARB_fragment_shader);
        pz2.b("gl_caps[ARB_fragment_program_shadow]", contextCapabilities.GL_ARB_fragment_program_shadow);
        pz2.b("gl_caps[ARB_framebuffer_object]", contextCapabilities.GL_ARB_framebuffer_object);
        pz2.b("gl_caps[ARB_framebuffer_sRGB]", contextCapabilities.GL_ARB_framebuffer_sRGB);
        pz2.b("gl_caps[ARB_geometry_shader4]", contextCapabilities.GL_ARB_geometry_shader4);
        pz2.b("gl_caps[ARB_gpu_shader5]", contextCapabilities.GL_ARB_gpu_shader5);
        pz2.b("gl_caps[ARB_half_float_pixel]", contextCapabilities.GL_ARB_half_float_pixel);
        pz2.b("gl_caps[ARB_half_float_vertex]", contextCapabilities.GL_ARB_half_float_vertex);
        pz2.b("gl_caps[ARB_instanced_arrays]", contextCapabilities.GL_ARB_instanced_arrays);
        pz2.b("gl_caps[ARB_map_buffer_alignment]", contextCapabilities.GL_ARB_map_buffer_alignment);
        pz2.b("gl_caps[ARB_map_buffer_range]", contextCapabilities.GL_ARB_map_buffer_range);
        pz2.b("gl_caps[ARB_multisample]", contextCapabilities.GL_ARB_multisample);
        pz2.b("gl_caps[ARB_multitexture]", contextCapabilities.GL_ARB_multitexture);
        pz2.b("gl_caps[ARB_occlusion_query2]", contextCapabilities.GL_ARB_occlusion_query2);
        pz2.b("gl_caps[ARB_pixel_buffer_object]", contextCapabilities.GL_ARB_pixel_buffer_object);
        pz2.b("gl_caps[ARB_seamless_cube_map]", contextCapabilities.GL_ARB_seamless_cube_map);
        pz2.b("gl_caps[ARB_shader_objects]", contextCapabilities.GL_ARB_shader_objects);
        pz2.b("gl_caps[ARB_shader_stencil_export]", contextCapabilities.GL_ARB_shader_stencil_export);
        pz2.b("gl_caps[ARB_shader_texture_lod]", contextCapabilities.GL_ARB_shader_texture_lod);
        pz2.b("gl_caps[ARB_shadow]", contextCapabilities.GL_ARB_shadow);
        pz2.b("gl_caps[ARB_shadow_ambient]", contextCapabilities.GL_ARB_shadow_ambient);
        pz2.b("gl_caps[ARB_stencil_texturing]", contextCapabilities.GL_ARB_stencil_texturing);
        pz2.b("gl_caps[ARB_sync]", contextCapabilities.GL_ARB_sync);
        pz2.b("gl_caps[ARB_tessellation_shader]", contextCapabilities.GL_ARB_tessellation_shader);
        pz2.b("gl_caps[ARB_texture_border_clamp]", contextCapabilities.GL_ARB_texture_border_clamp);
        pz2.b("gl_caps[ARB_texture_buffer_object]", contextCapabilities.GL_ARB_texture_buffer_object);
        pz2.b("gl_caps[ARB_texture_cube_map]", contextCapabilities.GL_ARB_texture_cube_map);
        pz2.b("gl_caps[ARB_texture_cube_map_array]", contextCapabilities.GL_ARB_texture_cube_map_array);
        pz2.b("gl_caps[ARB_texture_non_power_of_two]", contextCapabilities.GL_ARB_texture_non_power_of_two);
        pz2.b("gl_caps[ARB_uniform_buffer_object]", contextCapabilities.GL_ARB_uniform_buffer_object);
        pz2.b("gl_caps[ARB_vertex_blend]", contextCapabilities.GL_ARB_vertex_blend);
        pz2.b("gl_caps[ARB_vertex_buffer_object]", contextCapabilities.GL_ARB_vertex_buffer_object);
        pz2.b("gl_caps[ARB_vertex_program]", contextCapabilities.GL_ARB_vertex_program);
        pz2.b("gl_caps[ARB_vertex_shader]", contextCapabilities.GL_ARB_vertex_shader);
        pz2.b("gl_caps[EXT_bindable_uniform]", contextCapabilities.GL_EXT_bindable_uniform);
        pz2.b("gl_caps[EXT_blend_equation_separate]", contextCapabilities.GL_EXT_blend_equation_separate);
        pz2.b("gl_caps[EXT_blend_func_separate]", contextCapabilities.GL_EXT_blend_func_separate);
        pz2.b("gl_caps[EXT_blend_minmax]", contextCapabilities.GL_EXT_blend_minmax);
        pz2.b("gl_caps[EXT_blend_subtract]", contextCapabilities.GL_EXT_blend_subtract);
        pz2.b("gl_caps[EXT_draw_instanced]", contextCapabilities.GL_EXT_draw_instanced);
        pz2.b("gl_caps[EXT_framebuffer_multisample]", contextCapabilities.GL_EXT_framebuffer_multisample);
        pz2.b("gl_caps[EXT_framebuffer_object]", contextCapabilities.GL_EXT_framebuffer_object);
        pz2.b("gl_caps[EXT_framebuffer_sRGB]", contextCapabilities.GL_EXT_framebuffer_sRGB);
        pz2.b("gl_caps[EXT_geometry_shader4]", contextCapabilities.GL_EXT_geometry_shader4);
        pz2.b("gl_caps[EXT_gpu_program_parameters]", contextCapabilities.GL_EXT_gpu_program_parameters);
        pz2.b("gl_caps[EXT_gpu_shader4]", contextCapabilities.GL_EXT_gpu_shader4);
        pz2.b("gl_caps[EXT_multi_draw_arrays]", contextCapabilities.GL_EXT_multi_draw_arrays);
        pz2.b("gl_caps[EXT_packed_depth_stencil]", contextCapabilities.GL_EXT_packed_depth_stencil);
        pz2.b("gl_caps[EXT_paletted_texture]", contextCapabilities.GL_EXT_paletted_texture);
        pz2.b("gl_caps[EXT_rescale_normal]", contextCapabilities.GL_EXT_rescale_normal);
        pz2.b("gl_caps[EXT_separate_shader_objects]", contextCapabilities.GL_EXT_separate_shader_objects);
        pz2.b("gl_caps[EXT_shader_image_load_store]", contextCapabilities.GL_EXT_shader_image_load_store);
        pz2.b("gl_caps[EXT_shadow_funcs]", contextCapabilities.GL_EXT_shadow_funcs);
        pz2.b("gl_caps[EXT_shared_texture_palette]", contextCapabilities.GL_EXT_shared_texture_palette);
        pz2.b("gl_caps[EXT_stencil_clear_tag]", contextCapabilities.GL_EXT_stencil_clear_tag);
        pz2.b("gl_caps[EXT_stencil_two_side]", contextCapabilities.GL_EXT_stencil_two_side);
        pz2.b("gl_caps[EXT_stencil_wrap]", contextCapabilities.GL_EXT_stencil_wrap);
        pz2.b("gl_caps[EXT_texture_3d]", contextCapabilities.GL_EXT_texture_3d);
        pz2.b("gl_caps[EXT_texture_array]", contextCapabilities.GL_EXT_texture_array);
        pz2.b("gl_caps[EXT_texture_buffer_object]", contextCapabilities.GL_EXT_texture_buffer_object);
        pz2.b("gl_caps[EXT_texture_filter_anisotropic]", contextCapabilities.GL_EXT_texture_filter_anisotropic);
        pz2.b("gl_caps[EXT_texture_integer]", contextCapabilities.GL_EXT_texture_integer);
        pz2.b("gl_caps[EXT_texture_lod_bias]", contextCapabilities.GL_EXT_texture_lod_bias);
        pz2.b("gl_caps[EXT_texture_sRGB]", contextCapabilities.GL_EXT_texture_sRGB);
        pz2.b("gl_caps[EXT_vertex_shader]", contextCapabilities.GL_EXT_vertex_shader);
        pz2.b("gl_caps[EXT_vertex_weighting]", contextCapabilities.GL_EXT_vertex_weighting);
        pz2.b("gl_caps[gl_max_vertex_uniforms]", GL11.glGetInteger((int)35658));
        GL11.glGetError();
        pz2.b("gl_caps[gl_max_fragment_uniforms]", GL11.glGetInteger((int)35657));
        GL11.glGetError();
        pz2.b("gl_caps[gl_max_vertex_attribs]", GL11.glGetInteger((int)34921));
        GL11.glGetError();
        pz2.b("gl_caps[gl_max_vertex_texture_image_units]", GL11.glGetInteger((int)35660));
        GL11.glGetError();
        pz2.b("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger((int)34930));
        GL11.glGetError();
        pz2.b("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger((int)35071));
        GL11.glGetError();
        pz2.b("gl_max_texture_size", azi.D());
    }

    public static int D() {
        for (int i2 = 16384; i2 > 0; i2 >>= 1) {
            GL11.glTexImage2D((int)32868, (int)0, (int)6408, (int)i2, (int)i2, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
            int n2 = GL11.glGetTexLevelParameteri((int)32868, (int)0, (int)4096);
            if (n2 == 0) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public boolean U() {
        return this.u.s;
    }

    public void a(bki bki2) {
        this.K = bki2;
    }

    public bki E() {
        return this.K;
    }

    public boolean F() {
        return this.al;
    }

    public boolean G() {
        return this.al && this.X != null;
    }

    public btk H() {
        return this.X;
    }

    public static void I() {
        if (M == null) {
            return;
        }
        btk btk2 = M.H();
        if (btk2 != null) {
            btk2.n();
        }
    }

    public pz J() {
        return this.R;
    }

    public static long K() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }

    public boolean L() {
        return this.N;
    }

    public bal M() {
        return this.S;
    }

    public Multimap N() {
        return this.J;
    }

    public Proxy O() {
        return this.aa;
    }

    public bqy P() {
        return this.L;
    }

    public brr Q() {
        return this.an;
    }

    public brv R() {
        return this.ar;
    }

    public bse S() {
        return this.as;
    }

    public bqs T() {
        return this.av;
    }

    public boolean V() {
        return this.ai;
    }

    public boolean W() {
        return this.T;
    }

    public buc X() {
        return this.aw;
    }

    public btu Y() {
        if (this.n instanceof bcw) {
            return btu.d;
        }
        if (this.h != null) {
            if (this.h.o.t instanceof apg) {
                return btu.e;
            }
            if (this.h.o.t instanceof api) {
                if (bmg.c != null && bmg.b > 0) {
                    return btu.f;
                }
                return btu.g;
            }
            if (this.h.bE.d && this.h.bE.c) {
                return btu.c;
            }
            return btu.b;
        }
        return btu.a;
    }

    public buz Z() {
        return this.at;
    }

    public void aa() {
        int n2 = Keyboard.getEventKey();
        if (n2 == 0 || Keyboard.isRepeatEvent()) {
            return;
        }
        if (this.n instanceof bdm && ((bdm)this.n).g > azi.K() - 20L) {
            return;
        }
        if (Keyboard.getEventKeyState()) {
            if (n2 == this.u.ao.i()) {
                if (this.Z().n()) {
                    this.Z().u();
                } else if (this.Z().m()) {
                    this.Z().t();
                } else if (!this.Z().D() || !this.Z().l()) {
                    bhj.a(this.n);
                } else if (this.f != null) {
                    this.r.b().a(new fh("Not ready to start streaming yet!"));
                }
            } else if (n2 == this.u.ap.i()) {
                if (this.Z().n()) {
                    if (this.Z().o()) {
                        this.Z().r();
                    } else {
                        this.Z().q();
                    }
                }
            } else if (n2 == this.u.aq.i()) {
                if (this.Z().n()) {
                    this.Z().p();
                }
            } else if (n2 == this.u.ar.i()) {
                this.at.a(true);
            } else if (n2 == this.u.an.i()) {
                this.o();
            } else if (n2 == this.u.ak.i()) {
                this.r.b().a(bai.a(this.w, this.d, this.e, this.au));
            }
        } else if (n2 == this.u.ar.i()) {
            this.at.a(false);
        }
    }

    static /* synthetic */ String a(azi azi2) {
        return azi2.Z;
    }

    static /* synthetic */ bse b(azi azi2) {
        return azi2.as;
    }
}

