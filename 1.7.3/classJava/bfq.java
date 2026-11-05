/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class bfq
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private static final brq f = new brq("textures/gui/widgets.png");
    private static final brq g = new brq("textures/gui/title/minecraft.png");
    private static bga h = new bga();
    private static bgi i = new bgi();
    private static final ThreadPoolExecutor r = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
    private bcl s;
    private bfs t;
    private long u = -1L;
    private bau v;
    private bau w;
    private bau x;
    private bau y;
    private String z;
    private boolean A;
    private List B = Lists.newArrayList();
    private volatile int C = 0;
    private volatile int D = 0;
    private int E;
    private boolean F = false;

    public bfq(bcl bcl2) {
        this.s = bcl2;
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        h.a();
        if (!this.A) {
            this.A = true;
            this.t = new bfs(this);
        } else {
            this.t.a(this.l, this.m, 32, this.m - 64);
        }
        this.g();
    }

    public void g() {
        this.y = new bau(1, this.l / 2 - 154, this.m - 52, 154, 20, bsc.a("mco.selectServer.play", new Object[0]));
        this.n.add(this.y);
        this.w = new bau(5, this.l / 2 + 6, this.m - 52, 154, 20, bsc.a("mco.selectServer.leave", new Object[0]));
        this.n.add(this.w);
        String string = this.C > 0 ? bsc.a("mco.selectServer.create", new Object[0]) : bsc.a("mco.selectServer.buy", new Object[0]);
        this.v = new bau(3, this.l / 2 - 154, this.m - 28, 102, 20, bsc.a("mco.selectServer.configure", new Object[0]));
        this.n.add(this.v);
        this.x = new bau(2, this.l / 2 - 48, this.m - 28, 102, 20, string);
        this.n.add(this.x);
        this.n.add(new bau(0, this.l / 2 + 58, this.m - 28, 102, 20, bsc.a("gui.cancel", new Object[0])));
        bvo bvo2 = this.a(this.u);
        this.y.l = bvo2 != null && bvo2.d.equals(bvp.b.name()) && !bvo2.h;
        this.v.l = bvo2 != null && !bvo2.d.equals(bvp.c.name()) && bvo2.e.equals(this.k.M().c());
        this.w.l = bvo2 != null && !bvo2.d.equals(bvp.c.name()) && !bvo2.e.equals(this.k.M().c());
    }

    @Override
    public void c() {
        super.c();
        ++this.E;
        if (h.a(bgf.a)) {
            List list = h.c();
            block0: for (bvo bvo2 : list) {
                for (bvo bvo3 : this.B) {
                    if (bvo2.a != bvo3.a) continue;
                    bvo2.a(bvo3);
                    continue block0;
                }
            }
            this.B = list;
        }
        if (h.a(bgf.c)) {
            this.C = h.e();
        }
        if (h.a(bgf.b)) {
            this.D = h.d();
        }
        h.b();
        this.x.j = this.C > 0 ? bsc.a("mco.selectServer.create", new Object[0]) : bsc.a("mco.selectServer.buy", new Object[0]);
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            this.d(this.u);
        } else if (bau2.k == 3) {
            this.u();
        } else if (bau2.k == 5) {
            this.v();
        } else if (bau2.k == 0) {
            this.s();
            this.k.a(this.s);
        } else if (bau2.k == 2) {
            this.s();
            this.k.a(this.C > 0 ? new bey(this) : new bet(this));
        } else if (bau2.k == 4) {
            this.t();
        } else {
            this.t.a(bau2);
        }
    }

    private void s() {
        h.f();
        i.b();
    }

    private void t() {
        String string = bsc.a("mco.more.info.question.line1", new Object[0]);
        String string2 = bsc.a("mco.more.info.question.line2", new Object[0]);
        this.k.a(new bff(this, bfg.b, string, string2, 4));
    }

    private void u() {
        bvo bvo2;
        bvo bvo3 = this.a(this.u);
        if (bvo3 != null && this.k.M().c().equals(bvo3.e) && (bvo2 = this.c(bvo3.a)) != null) {
            this.s();
            this.k.a(new bew(this, bvo2));
        }
    }

    private void v() {
        bvo bvo2 = this.a(this.u);
        if (bvo2 != null && !this.k.M().c().equals(bvo2.e)) {
            String string = bsc.a("mco.configure.world.leave.question.line1", new Object[0]);
            String string2 = bsc.a("mco.configure.world.leave.question.line2", new Object[0]);
            this.k.a(new bff(this, bfg.b, string, string2, 5));
        }
    }

    private bvo a(long l2) {
        for (bvo bvo2 : this.B) {
            if (bvo2.a != l2) continue;
            return bvo2;
        }
        return null;
    }

    private int b(long l2) {
        for (int i2 = 0; i2 < this.B.size(); ++i2) {
            if (((bvo)this.B.get((int)i2)).a != l2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 5 && bl2) {
            bgl.a.submit(new bfr(this));
        }
        this.k.a(this);
    }

    private void w() {
        int n2 = this.b(this.u);
        if (this.B.size() - 1 == n2) {
            --n2;
        }
        if (this.B.size() == 0) {
            n2 = -1;
        }
        if (n2 >= 0 && n2 < this.B.size()) {
            this.u = ((bvo)this.B.get((int)n2)).a;
        }
    }

    public void h() {
        this.u = -1L;
    }

    private bvo c(long l2) {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            return bvf2.a(l2);
        }
        catch (bwa bwa2) {
            a.error("Couldn't get own world");
        }
        catch (IOException iOException) {
            a.error("Couldn't parse response getting own world");
        }
        return null;
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 59) {
            this.k.u.v = !this.k.u.v;
            this.k.u.b();
        } else if (n2 == 28 || n2 == 156) {
            this.a((bau)this.n.get(0));
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.z = null;
        this.q_();
        this.t.a(n2, n3, f2);
        this.c(this.l / 2 - 50, 7);
        this.b(n2, n3);
        super.a(n2, n3, f2);
        if (this.z != null) {
            this.b(this.z, n2, n3);
        }
        this.d(n2, n3);
    }

    private void b(int n2, int n3) {
        String string = bsc.a("mco.selectServer.whatisrealms", new Object[0]);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        int n4 = 0x3366BB;
        int n5 = 7107012;
        int n6 = this.q.a(string) / 2;
        int n7 = 10;
        int n8 = 15;
        int n9 = this.l - n6 - n7;
        int n10 = n9 + n6 + 1;
        int n11 = n8;
        int n12 = n11 + this.q.a;
        GL11.glTranslatef((float)n9, (float)n11, (float)0.0f);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        if (n9 <= n2 && n2 <= n10 && n11 <= n3 && n3 <= n12) {
            this.F = true;
            this.b(this.q, string, 0, 0, n5);
        } else {
            this.F = false;
            this.b(this.q, string, 0, 0, n4);
        }
        GL11.glPopMatrix();
    }

    private void c(int n2, int n3) {
        this.k.P().a(g);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.b(n2 * 2, n3 * 2, 0, 97, 200, 50);
        GL11.glPopMatrix();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.e(n2, n3) && this.D != 0) {
            this.s();
            bfv bfv2 = new bfv(this.s);
            this.k.a(bfv2);
        }
        if (this.F) {
            this.a("https://minecraft.net/realms");
        }
    }

    private void a(String string) {
        try {
            URI uRI = new URI(string);
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            a.error("Couldn't open link");
        }
    }

    private void d(int n2, int n3) {
        int n4;
        int n5;
        int n6 = this.D;
        boolean bl2 = this.e(n2, n3);
        this.k.P().a(f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        this.b(this.l / 2 + 58, 12, bl2 ? 166 : 182, 22, 16, 16);
        GL11.glPopMatrix();
        if (n6 != 0) {
            n5 = 198 + (Math.min(n6, 6) - 1) * 8;
            n4 = (int)(Math.max(0.0f, Math.max(oy.a((float)(10 + this.E) * 0.57f), oy.b((float)this.E * 0.35f))) * -6.0f);
            this.k.P().a(f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPushMatrix();
            this.b(this.l / 2 + 58 + 4, 16 + n4, n5, 22, 8, 8);
            GL11.glPopMatrix();
        }
        if (bl2) {
            n5 = n2 + 12;
            n4 = n3 - 12;
            String string = n6 != 0 ? bsc.a("mco.invites.pending", new Object[0]) : bsc.a("mco.invites.nopending", new Object[0]);
            int n7 = this.q.a(string);
            this.a(n5 - 3, n4 - 3, n5 + n7 + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.q.a(string, n5, n4, -1);
        }
    }

    private boolean e(int n2, int n3) {
        int n4 = this.l / 2 + 56;
        int n5 = this.l / 2 + 78;
        int n6 = 13;
        int n7 = 27;
        return n4 <= n2 && n2 <= n5 && n6 <= n3 && n3 <= n7;
    }

    private void d(long l2) {
        bvo bvo2 = this.a(l2);
        if (bvo2 != null) {
            this.s();
            bfh bfh2 = new bfh(this.k, this, new bfo(this, bvo2));
            bfh2.g();
            this.k.a(bfh2);
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        this.k.P().a(f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.b(n2 * 2, n3 * 2, 191, 0, 16, 15);
        GL11.glPopMatrix();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9) {
            this.z = bsc.a("mco.selectServer.expired", new Object[0]);
        }
    }

    private void b(int n2, int n3, int n4, int n5, int n6) {
        if (this.E % 20 < 10) {
            this.k.P().a(f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPushMatrix();
            GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
            this.b(n2 * 2, n3 * 2, 207, 0, 16, 15);
            GL11.glPopMatrix();
        }
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9) {
            this.z = n6 == 0 ? bsc.a("mco.selectServer.expires.soon", new Object[0]) : (n6 == 1 ? bsc.a("mco.selectServer.expires.day", new Object[0]) : bsc.a("mco.selectServer.expires.days", n6));
        }
    }

    private void d(int n2, int n3, int n4, int n5) {
        this.k.P().a(f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.b(n2 * 2, n3 * 2, 207, 0, 16, 15);
        GL11.glPopMatrix();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9) {
            this.z = bsc.a("mco.selectServer.open", new Object[0]);
        }
    }

    private void e(int n2, int n3, int n4, int n5) {
        this.k.P().a(f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.b(n2 * 2, n3 * 2, 223, 0, 16, 15);
        GL11.glPopMatrix();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9) {
            this.z = bsc.a("mco.selectServer.closed", new Object[0]);
        }
    }

    private void f(int n2, int n3, int n4, int n5) {
        this.k.P().a(f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.b(n2 * 2, n3 * 2, 223, 0, 16, 15);
        GL11.glPopMatrix();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9) {
            this.z = bsc.a("mco.selectServer.locked", new Object[0]);
        }
    }

    protected void b(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = n2 + 12;
        int n5 = n3 - 12;
        int n6 = this.q.a(string);
        this.a(n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
        this.q.a(string, n4, n5, -1);
    }

    static /* synthetic */ long a(bfq bfq2) {
        return bfq2.u;
    }

    static /* synthetic */ bvo a(bfq bfq2, long l2) {
        return bfq2.a(l2);
    }

    static /* synthetic */ azi b(bfq bfq2) {
        return bfq2.k;
    }

    static /* synthetic */ bga i() {
        return h;
    }

    static /* synthetic */ List c(bfq bfq2) {
        return bfq2.B;
    }

    static /* synthetic */ void d(bfq bfq2) {
        bfq2.w();
    }

    static /* synthetic */ Logger p() {
        return a;
    }

    static /* synthetic */ azi e(bfq bfq2) {
        return bfq2.k;
    }

    static /* synthetic */ azi f(bfq bfq2) {
        return bfq2.k;
    }

    static /* synthetic */ long b(bfq bfq2, long l2) {
        bfq2.u = l2;
        return bfq2.u;
    }

    static /* synthetic */ bau g(bfq bfq2) {
        return bfq2.v;
    }

    static /* synthetic */ bau h(bfq bfq2) {
        return bfq2.w;
    }

    static /* synthetic */ bau i(bfq bfq2) {
        return bfq2.y;
    }

    static /* synthetic */ void c(bfq bfq2, long l2) {
        bfq2.d(l2);
    }

    static /* synthetic */ int d(bfq bfq2, long l2) {
        return bfq2.b(l2);
    }

    static /* synthetic */ azi j(bfq bfq2) {
        return bfq2.k;
    }

    static /* synthetic */ bgi q() {
        return i;
    }

    static /* synthetic */ ThreadPoolExecutor r() {
        return r;
    }

    static /* synthetic */ ban k(bfq bfq2) {
        return bfq2.q;
    }

    static /* synthetic */ void a(bfq bfq2, int n2, int n3, int n4, int n5) {
        bfq2.c(n2, n3, n4, n5);
    }

    static /* synthetic */ void b(bfq bfq2, int n2, int n3, int n4, int n5) {
        bfq2.e(n2, n3, n4, n5);
    }

    static /* synthetic */ void a(bfq bfq2, int n2, int n3, int n4, int n5, int n6) {
        bfq2.b(n2, n3, n4, n5, n6);
    }

    static /* synthetic */ void c(bfq bfq2, int n2, int n3, int n4, int n5) {
        bfq2.d(n2, n3, n4, n5);
    }

    static /* synthetic */ void d(bfq bfq2, int n2, int n3, int n4, int n5) {
        bfq2.f(n2, n3, n4, n5);
    }

    static /* synthetic */ ban l(bfq bfq2) {
        return bfq2.q;
    }

    static /* synthetic */ ban m(bfq bfq2) {
        return bfq2.q;
    }

    static /* synthetic */ ban n(bfq bfq2) {
        return bfq2.q;
    }

    static /* synthetic */ ban o(bfq bfq2) {
        return bfq2.q;
    }

    static /* synthetic */ azi p(bfq bfq2) {
        return bfq2.k;
    }

    static /* synthetic */ ban q(bfq bfq2) {
        return bfq2.q;
    }

    static /* synthetic */ ban r(bfq bfq2) {
        return bfq2.q;
    }

    static /* synthetic */ azi s(bfq bfq2) {
        return bfq2.k;
    }

    static /* synthetic */ azi t(bfq bfq2) {
        return bfq2.k;
    }
}

