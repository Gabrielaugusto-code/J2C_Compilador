/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class btk
extends MinecraftServer {
    private static final Logger h = LogManager.getLogger();
    private final azi i;
    private final aga j;
    private boolean k;
    private boolean l;
    private btr m;

    public btk(azi azi2, String string, String string2, aga aga2) {
        super(new File(azi2.w, "saves"), azi2.O());
        this.j(azi2.M().c());
        this.k(string);
        this.l(string2);
        this.b(azi2.u());
        this.c(aga2.c());
        this.c(256);
        this.a(new btj(this));
        this.i = azi2;
        this.j = aga2;
    }

    @Override
    protected void a(String string, String string2, long l2, agd agd2, String string3) {
        this.a(string);
        this.b = new mm[3];
        this.g = new long[this.b.length][100];
        axt axt2 = this.Q().a(string, true);
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            int n2 = 0;
            if (i2 == 1) {
                n2 = -1;
            }
            if (i2 == 2) {
                n2 = 1;
            }
            this.b[i2] = i2 == 0 ? (this.P() ? new md(this, axt2, string2, n2, this.a) : new mm(this, axt2, string2, n2, this.j, this.a)) : new mf(this, axt2, string2, n2, this.j, this.b[0], this.a);
            this.b[i2].a(new mi(this, this.b[i2]));
            this.af().a(this.b);
        }
        this.a(this.j());
        this.g();
    }

    @Override
    protected boolean e() {
        h.info("Starting integrated minecraft server version 1.7.3");
        this.d(false);
        this.e(true);
        this.f(true);
        this.g(true);
        this.h(true);
        h.info("Generating keypair");
        this.a(ok.b());
        this.a(this.M(), this.N(), this.j.d(), this.j.h(), this.j.j());
        this.n(this.K() + " - " + this.b[0].N().k());
        return true;
    }

    @Override
    protected void t() {
        boolean bl2 = this.k;
        boolean bl3 = this.k = azi.B().v() != null && azi.B().W();
        if (!bl2 && this.k) {
            h.info("Saving and pausing game...");
            this.af().g();
            this.a(false);
        }
        if (!this.k) {
            super.t();
            if (this.i.u.c != this.af().o()) {
                h.info("Changing view distance to {}, from {}", new Object[]{this.i.u.c, this.af().o()});
                this.af().a(this.i.u.c);
            }
        }
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public agb i() {
        return this.j.e();
    }

    @Override
    public pu j() {
        return this.i.u.av;
    }

    @Override
    public boolean k() {
        return this.j.f();
    }

    @Override
    protected File r() {
        return this.i.w;
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    protected void a(b b2) {
        this.i.a(b2);
    }

    @Override
    public b b(b b2) {
        b2 = super.b(b2);
        b2.g().a("Type", new btl(this));
        b2.g().a("Is Modded", new btm(this));
        return b2;
    }

    @Override
    public void a(pz pz2) {
        super.a(pz2);
        pz2.a("snooper_partner", this.i.J().f());
    }

    @Override
    public boolean U() {
        return azi.B().U();
    }

    @Override
    public String a(agb agb2, boolean bl2) {
        try {
            int n2 = -1;
            try {
                n2 = om.a();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n2 <= 0) {
                n2 = 25564;
            }
            this.ag().a(null, n2);
            h.info("Started on " + n2);
            this.l = true;
            this.m = new btr(this.ac(), n2 + "");
            this.m.start();
            this.af().a(agb2);
            this.af().b(bl2);
            return n2 + "";
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void n() {
        super.n();
        if (this.m != null) {
            this.m.interrupt();
            this.m = null;
        }
    }

    @Override
    public void q() {
        super.q();
        if (this.m != null) {
            this.m.interrupt();
            this.m = null;
        }
    }

    public boolean a() {
        return this.l;
    }

    @Override
    public void a(agb agb2) {
        this.af().a(agb2);
    }

    @Override
    public boolean ab() {
        return true;
    }

    @Override
    public int l() {
        return 4;
    }
}

