/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.server;

import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.OutputStream;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MinecraftServer
implements ac,
Runnable,
qb {
    private static final Logger h = LogManager.getLogger();
    private static MinecraftServer i;
    private final axv j;
    private final pz k = new pz("server", this, MinecraftServer.ap());
    private final File l;
    private final List m = new ArrayList();
    private final ab n;
    public final oz a = new oz();
    private final mv o;
    private final js p = new js();
    private final Random q = new Random();
    private int s = -1;
    public mm[] b;
    private lg t;
    private boolean u = true;
    private boolean v;
    private int w;
    protected final Proxy c;
    public String d;
    public int e;
    private boolean x;
    private boolean y;
    private boolean z;
    private boolean A;
    private boolean B;
    private String C;
    private int D;
    private int E = 0;
    public final long[] f = new long[100];
    public long[][] g;
    private KeyPair F;
    private String G;
    private String H;
    private String I;
    private boolean J;
    private boolean K;
    private boolean L;
    private String M = "";
    private boolean N;
    private long O;
    private String P;
    private boolean Q;
    private boolean R;
    private final MinecraftSessionService S;
    private long T = 0L;

    public MinecraftServer(File file, Proxy proxy) {
        i = this;
        this.c = proxy;
        this.l = file;
        this.o = new mv(this);
        this.n = new bk();
        this.j = new axe(file);
        this.S = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString()).createMinecraftSessionService();
    }

    protected abstract boolean e();

    protected void a(String string) {
        if (this.Q().b(string)) {
            h.info("Converting map!");
            this.b("menu.convertingLevel");
            this.Q().a(string, new kz(this));
        }
    }

    protected synchronized void b(String string) {
        this.P = string;
    }

    public synchronized String f() {
        return this.P;
    }

    protected void a(String string, String string2, long l2, agd agd2, String string3) {
        aga aga2;
        this.a(string);
        this.b("menu.loadingLevel");
        this.b = new mm[3];
        this.g = new long[this.b.length][100];
        axt axt2 = this.j.a(string, true);
        axj axj2 = axt2.d();
        if (axj2 == null) {
            aga2 = new aga(l2, this.i(), this.h(), this.k(), agd2);
            aga2.a(string3);
        } else {
            aga2 = new aga(axj2);
        }
        if (this.K) {
            aga2.a();
        }
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            int n2 = 0;
            if (i2 == 1) {
                n2 = -1;
            }
            if (i2 == 2) {
                n2 = 1;
            }
            this.b[i2] = i2 == 0 ? (this.P() ? new md(this, axt2, string2, n2, this.a) : new mm(this, axt2, string2, n2, aga2, this.a)) : new mf(this, axt2, string2, n2, aga2, this.b[0], this.a);
            this.b[i2].a(new mi(this, this.b[i2]));
            if (!this.L()) {
                this.b[i2].N().a(this.i());
            }
            this.t.a(this.b);
        }
        this.a(this.j());
        this.g();
    }

    protected void g() {
        int n2 = 16;
        int n3 = 4;
        int n4 = 192;
        int n5 = 625;
        int n6 = 0;
        this.b("menu.generatingTerrain");
        int n7 = 0;
        h.info("Preparing start region for level " + n7);
        mm mm2 = this.b[n7];
        r r2 = mm2.K();
        long l2 = MinecraftServer.ap();
        for (int i2 = -192; i2 <= 192 && this.p(); i2 += 16) {
            for (int i3 = -192; i3 <= 192 && this.p(); i3 += 16) {
                long l3 = MinecraftServer.ap();
                if (l3 - l2 > 1000L) {
                    this.a_("Preparing spawn area", n6 * 100 / 625);
                    l2 = l3;
                }
                ++n6;
                mm2.b.c(r2.a + i2 >> 4, r2.c + i3 >> 4);
            }
        }
        this.m();
    }

    public abstract boolean h();

    public abstract agb i();

    public abstract pu j();

    public abstract boolean k();

    public abstract int l();

    protected void a_(String string, int n2) {
        this.d = string;
        this.e = n2;
        h.info(string + ": " + n2 + "%");
    }

    protected void m() {
        this.d = null;
        this.e = 0;
    }

    protected void a(boolean bl2) {
        if (this.L) {
            return;
        }
        for (mm mm2 : this.b) {
            if (mm2 == null) continue;
            if (!bl2) {
                h.info("Saving chunks for level '" + mm2.N().k() + "'/" + mm2.t.l());
            }
            try {
                mm2.a(true, null);
            }
            catch (afx afx2) {
                h.warn(afx2.getMessage());
            }
        }
    }

    public void n() {
        if (this.L) {
            return;
        }
        h.info("Stopping server");
        if (this.ag() != null) {
            this.ag().b();
        }
        if (this.t != null) {
            h.info("Saving players");
            this.t.g();
            this.t.r();
        }
        h.info("Saving worlds");
        this.a(false);
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            mm mm2 = this.b[i2];
            mm2.n();
        }
        if (this.k.d()) {
            this.k.e();
        }
    }

    public boolean p() {
        return this.u;
    }

    public void q() {
        this.u = false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            if (this.e()) {
                long l2 = MinecraftServer.ap();
                long l3 = 0L;
                this.p.a(new fh(this.C));
                this.p.a(new jw("1.7.3", 4));
                this.a(this.p);
                while (this.u) {
                    long l4 = MinecraftServer.ap();
                    long l5 = l4 - l2;
                    if (l5 > 2000L && l2 - this.O >= 15000L) {
                        h.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[]{l5, l5 / 50L});
                        l5 = 2000L;
                        this.O = l2;
                    }
                    if (l5 < 0L) {
                        h.warn("Time ran backwards! Did the system time change?");
                        l5 = 0L;
                    }
                    l3 += l5;
                    l2 = l4;
                    if (this.b[0].e()) {
                        this.t();
                        l3 = 0L;
                    } else {
                        while (l3 > 50L) {
                            l3 -= 50L;
                            this.t();
                        }
                    }
                    Thread.sleep(Math.max(1L, 50L - l3));
                    this.N = true;
                }
            } else {
                this.a((b)null);
            }
        }
        catch (Throwable throwable) {
            h.error("Encountered an unexpected exception", throwable);
            b b2 = null;
            b2 = throwable instanceof s ? this.b(((s)throwable).a()) : this.b(new b("Exception in server tick loop", throwable));
            File file = new File(new File(this.r(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (b2.a(file)) {
                h.error("This crash report has been saved to: " + file.getAbsolutePath());
            } else {
                h.error("We were unable to save this crash report to disk.");
            }
            this.a(b2);
        }
        finally {
            try {
                this.n();
                this.v = true;
            }
            catch (Throwable throwable) {
                h.error("Exception stopping the server", throwable);
            }
            finally {
                this.s();
            }
        }
    }

    private void a(js js2) {
        File file = this.d("server-icon.png");
        if (file.isFile()) {
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                ImageIO.write((RenderedImage)bufferedImage, "PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
                ByteBuf byteBuf2 = Base64.encode((ByteBuf)byteBuf);
                js2.a("data:image/png;base64," + byteBuf2.toString(Charsets.UTF_8));
            }
            catch (Exception exception) {
                h.error("Couldn't load server icon", (Throwable)exception);
            }
        }
    }

    protected File r() {
        return new File(".");
    }

    protected void a(b b2) {
    }

    protected void s() {
    }

    public void t() {
        long l2 = System.nanoTime();
        ayk.a().a();
        ++this.w;
        if (this.Q) {
            this.Q = false;
            this.a.a = true;
            this.a.a();
        }
        this.a.a("root");
        this.u();
        if (l2 - this.T >= 5000000000L) {
            this.T = l2;
            this.p.a(new jt(this.C(), this.B()));
            GameProfile[] gameProfileArray = new GameProfile[Math.min(this.B(), 12)];
            int n2 = oy.a(this.q, 0, this.B() - gameProfileArray.length);
            for (int i2 = 0; i2 < gameProfileArray.length; ++i2) {
                gameProfileArray[i2] = ((mp)this.t.a.get(n2 + i2)).bI();
            }
            Collections.shuffle(Arrays.asList(gameProfileArray));
            this.p.b().a(gameProfileArray);
        }
        if (this.w % 900 == 0) {
            this.a.a("save");
            this.t.g();
            this.a(true);
            this.a.b();
        }
        this.a.a("tallying");
        this.f[this.w % 100] = System.nanoTime() - l2;
        this.a.b();
        this.a.a("snooper");
        if (!this.k.d() && this.w > 100) {
            this.k.a();
        }
        if (this.w % 6000 == 0) {
            this.k.b();
        }
        this.a.b();
        this.a.b();
    }

    public void u() {
        int n2;
        this.a.a("levels");
        for (n2 = 0; n2 < this.b.length; ++n2) {
            long l2 = System.nanoTime();
            if (n2 == 0 || this.v()) {
                mm mm2 = this.b[n2];
                this.a.a(mm2.N().k());
                this.a.a("pools");
                mm2.V().a();
                this.a.b();
                if (this.w % 20 == 0) {
                    this.a.a("timeSync");
                    this.t.a(new hx(mm2.I(), mm2.J(), mm2.O().b("doDaylightCycle")), mm2.t.i);
                    this.a.b();
                }
                this.a.a("tick");
                try {
                    mm2.b();
                }
                catch (Throwable throwable) {
                    b b2 = b.a(throwable, "Exception ticking world");
                    mm2.a(b2);
                    throw new s(b2);
                }
                try {
                    mm2.h();
                }
                catch (Throwable throwable) {
                    b b3 = b.a(throwable, "Exception ticking world entities");
                    mm2.a(b3);
                    throw new s(b3);
                }
                this.a.b();
                this.a.a("tracker");
                mm2.r().a();
                this.a.b();
                this.a.b();
            }
            this.g[n2][this.w % 100] = System.nanoTime() - l2;
        }
        this.a.c("connection");
        this.ag().c();
        this.a.c("players");
        this.t.b();
        this.a.c("tickables");
        for (n2 = 0; n2 < this.m.size(); ++n2) {
            ((lk)this.m.get(n2)).a();
        }
        this.a.b();
    }

    public boolean v() {
        return true;
    }

    public void w() {
        new lb(this, "Server thread").start();
    }

    public File d(String string) {
        return new File(this.r(), string);
    }

    public void f(String string) {
        h.warn(string);
    }

    public mm a(int n2) {
        if (n2 == -1) {
            return this.b[1];
        }
        if (n2 == 1) {
            return this.b[2];
        }
        return this.b[0];
    }

    public String A() {
        return "1.7.3";
    }

    public int B() {
        return this.t.k();
    }

    public int C() {
        return this.t.l();
    }

    public String[] D() {
        return this.t.d();
    }

    public String getServerModName() {
        return "vanilla";
    }

    public b b(b b2) {
        b2.g().a("Profiler Position", new lc(this));
        if (this.b != null && this.b.length > 0 && this.b[0] != null) {
            b2.g().a("Vec3 Pool Size", new ld(this));
        }
        if (this.t != null) {
            b2.g().a("Player Count", new le(this));
        }
        return b2;
    }

    public List a(ac ac2, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (string.startsWith("/")) {
            boolean bl2 = !(string = string.substring(1)).contains(" ");
            List list = this.n.b(ac2, string);
            if (list != null) {
                for (String string2 : list) {
                    if (bl2) {
                        arrayList.add("/" + string2);
                        continue;
                    }
                    arrayList.add(string2);
                }
            }
            return arrayList;
        }
        String[] stringArray = string.split(" ", -1);
        String string3 = stringArray[stringArray.length - 1];
        for (String string4 : this.t.d()) {
            if (!y.a(string3, string4)) continue;
            arrayList.add(string4);
        }
        return arrayList;
    }

    public static MinecraftServer G() {
        return i;
    }

    @Override
    public String b_() {
        return "Server";
    }

    @Override
    public void a(fa fa2) {
        h.info(fa2.c());
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    public ab H() {
        return this.n;
    }

    public KeyPair I() {
        return this.F;
    }

    public String K() {
        return this.G;
    }

    public void j(String string) {
        this.G = string;
    }

    public boolean L() {
        return this.G != null;
    }

    public String M() {
        return this.H;
    }

    public void k(String string) {
        this.H = string;
    }

    public void l(String string) {
        this.I = string;
    }

    public String N() {
        return this.I;
    }

    public void a(KeyPair keyPair) {
        this.F = keyPair;
    }

    public void a(pu pu2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            mm mm2 = this.b[i2];
            if (mm2 == null) continue;
            if (mm2.N().t()) {
                mm2.r = pu.d;
                mm2.a(true, true);
                continue;
            }
            if (this.L()) {
                mm2.r = pu2;
                mm2.a(mm2.r != pu.a, true);
                continue;
            }
            mm2.r = pu2;
            mm2.a(this.O(), this.y);
        }
    }

    protected boolean O() {
        return true;
    }

    public boolean P() {
        return this.J;
    }

    public void b(boolean bl2) {
        this.J = bl2;
    }

    public void c(boolean bl2) {
        this.K = bl2;
    }

    public axv Q() {
        return this.j;
    }

    public void S() {
        this.L = true;
        this.Q().d();
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            mm mm2 = this.b[i2];
            if (mm2 == null) continue;
            mm2.n();
        }
        this.Q().e(this.b[0].M().g());
        this.q();
    }

    public String T() {
        return this.M;
    }

    @Override
    public void a(pz pz2) {
        pz2.a("whitelist_enabled", false);
        pz2.a("whitelist_count", 0);
        pz2.a("players_current", this.B());
        pz2.a("players_max", this.C());
        pz2.a("players_seen", this.t.m().length);
        pz2.a("uses_auth", this.x);
        pz2.a("gui_state", this.ai() ? "enabled" : "disabled");
        pz2.a("run_time", (MinecraftServer.ap() - pz2.g()) / 60L * 1000L);
        pz2.a("avg_tick_ms", (int)(oy.a(this.f) * 1.0E-6));
        int n2 = 0;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == null) continue;
            mm mm2 = this.b[i2];
            axj axj2 = mm2.N();
            pz2.a("world[" + n2 + "][dimension]", mm2.t.i);
            pz2.a("world[" + n2 + "][mode]", (Object)axj2.r());
            pz2.a("world[" + n2 + "][difficulty]", (Object)mm2.r);
            pz2.a("world[" + n2 + "][hardcore]", axj2.t());
            pz2.a("world[" + n2 + "][generator_name]", axj2.u().a());
            pz2.a("world[" + n2 + "][generator_version]", axj2.u().d());
            pz2.a("world[" + n2 + "][height]", this.D);
            pz2.a("world[" + n2 + "][chunks_loaded]", mm2.L().f());
            ++n2;
        }
        pz2.a("worlds", n2);
    }

    @Override
    public void b(pz pz2) {
        pz2.b("singleplayer", this.L());
        pz2.b("server_brand", this.getServerModName());
        pz2.b("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        pz2.b("dedicated", this.V());
    }

    @Override
    public boolean U() {
        return true;
    }

    public abstract boolean V();

    public boolean W() {
        return this.x;
    }

    public void d(boolean bl2) {
        this.x = bl2;
    }

    public boolean X() {
        return this.y;
    }

    public void e(boolean bl2) {
        this.y = bl2;
    }

    public boolean Y() {
        return this.z;
    }

    public void f(boolean bl2) {
        this.z = bl2;
    }

    public boolean Z() {
        return this.A;
    }

    public void g(boolean bl2) {
        this.A = bl2;
    }

    public boolean aa() {
        return this.B;
    }

    public void h(boolean bl2) {
        this.B = bl2;
    }

    public abstract boolean ab();

    public String ac() {
        return this.C;
    }

    public void n(String string) {
        this.C = string;
    }

    public int ad() {
        return this.D;
    }

    public void c(int n2) {
        this.D = n2;
    }

    public lg af() {
        return this.t;
    }

    public void a(lg lg2) {
        this.t = lg2;
    }

    public void a(agb agb2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            MinecraftServer.G().b[i2].N().a(agb2);
        }
    }

    public mv ag() {
        return this.o;
    }

    public boolean ah() {
        return this.N;
    }

    public boolean ai() {
        return false;
    }

    public abstract String a(agb var1, boolean var2);

    public int aj() {
        return this.w;
    }

    public void ak() {
        this.Q = true;
    }

    public pz al() {
        return this.k;
    }

    @Override
    public r f_() {
        return new r(0, 0, 0);
    }

    @Override
    public afs d() {
        return this.b[0];
    }

    public int am() {
        return 16;
    }

    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2) {
        return false;
    }

    public boolean an() {
        return this.R;
    }

    public Proxy ao() {
        return this.c;
    }

    public static long ap() {
        return System.currentTimeMillis();
    }

    public int aq() {
        return this.E;
    }

    public void d(int n2) {
        this.E = n2;
    }

    @Override
    public fa c_() {
        return new fh(this.b_());
    }

    public boolean ar() {
        return true;
    }

    public MinecraftSessionService as() {
        return this.S;
    }

    public js at() {
        return this.p;
    }

    public void au() {
        this.T = 0L;
    }

    public static /* synthetic */ Logger av() {
        return h;
    }

    public static /* synthetic */ lg a(MinecraftServer minecraftServer) {
        return minecraftServer.t;
    }
}

