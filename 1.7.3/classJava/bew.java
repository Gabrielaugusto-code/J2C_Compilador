/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bew
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final bcl f;
    private bvo g;
    private bex h;
    private int i;
    private int r;
    private int s;
    private int t = -1;
    private String u;
    private bau v;
    private bau w;
    private bau x;
    private bau y;
    private bau z;
    private bau A;
    private bau B;
    private bau C;
    private boolean D;

    public bew(bcl bcl2, bvo bvo2) {
        this.f = bcl2;
        this.g = bvo2;
    }

    @Override
    public void c() {
    }

    @Override
    public void r_() {
        this.i = this.l / 2 - 150;
        this.r = 150;
        this.s = this.l / 2 + 2;
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        if (this.g.d.equals("CLOSED")) {
            this.v = new bau(0, this.i, this.a(12), this.r - 8, 20, bsc.a("mco.configure.world.buttons.open", new Object[0]));
            this.n.add(this.v);
            this.v.l = !this.g.h;
        } else {
            this.w = new bau(1, this.i, this.a(12), this.r - 8, 20, bsc.a("mco.configure.world.buttons.close", new Object[0]));
            this.n.add(this.w);
            this.w.l = !this.g.h;
        }
        this.B = new bau(7, this.s, this.a(7), this.r, 20, bsc.a("mco.configure.world.buttons.subscription", new Object[0]));
        this.n.add(this.B);
        this.x = new bau(5, this.s, this.a(3), this.r, 20, bsc.a("mco.configure.world.buttons.edit", new Object[0]));
        this.n.add(this.x);
        this.C = new bau(8, this.s, this.a(5), this.r / 2 - 2, 20, bsc.a("mco.configure.world.buttons.backup", new Object[0]));
        this.n.add(this.C);
        this.y = new bau(6, this.s + this.r / 2 + 3, this.a(5), this.r / 2 - 2, 20, bsc.a("mco.configure.world.buttons.reset", new Object[0]));
        this.n.add(this.y);
        this.z = new bau(4, this.i, this.a(10), this.r / 2 - 5, 20, bsc.a("mco.configure.world.buttons.invite", new Object[0]));
        this.n.add(this.z);
        this.A = new bau(3, this.i + this.r / 2 - 3, this.a(10), this.r / 2 - 5, 20, bsc.a("mco.configure.world.buttons.uninvite", new Object[0]));
        this.n.add(this.A);
        this.n.add(new bau(10, this.s + this.r / 2 + 2, this.a(12), this.r / 2 - 2, 20, bsc.a("gui.back", new Object[0])));
        this.h = new bex(this);
        this.x.l = !this.g.h;
        this.y.l = !this.g.h;
        this.z.l = !this.g.h;
        this.A.l = !this.g.h && this.t >= 0;
        this.C.l = !this.g.h;
    }

    private int a(int n2) {
        return 40 + n2 * 13;
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
        if (bau2.k == 10) {
            if (this.D) {
                ((bfq)this.f).h();
            }
            this.k.a(this.f);
        } else if (bau2.k == 5) {
            this.k.a(new bfb(this, this.f, this.g));
        } else if (bau2.k == 1) {
            String string = bsc.a("mco.configure.world.close.question.line1", new Object[0]);
            String string2 = bsc.a("mco.configure.world.close.question.line2", new Object[0]);
            this.k.a(new bff(this, bfg.b, string, string2, 1));
        } else if (bau2.k == 0) {
            this.g();
        } else if (bau2.k == 4) {
            this.k.a(new bfe(this.f, this, this.g));
        } else if (bau2.k == 3) {
            this.i();
        } else if (bau2.k == 6) {
            this.k.a(new bgp(this, this.g));
        } else if (bau2.k == 7) {
            this.k.a(new bgs(this, this.g));
        } else if (bau2.k == 8) {
            this.k.a(new bep(this, this.g.a));
        }
    }

    private void g() {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            Boolean bl2 = bvf2.e(this.g.a);
            if (bl2.booleanValue()) {
                this.D = true;
                this.g.d = "OPEN";
                this.r_();
            }
        }
        catch (bwa bwa2) {
            a.error("Couldn't open world");
        }
        catch (IOException iOException) {
            a.error("Could not parse response opening world");
        }
    }

    private void h() {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            boolean bl2 = bvf2.f(this.g.a);
            if (bl2) {
                this.D = true;
                this.g.d = "CLOSED";
                this.r_();
            }
        }
        catch (bwa bwa2) {
            a.error("Couldn't close world");
        }
        catch (IOException iOException) {
            a.error("Could not parse response closing world");
        }
    }

    private void i() {
        if (this.t >= 0 && this.t < this.g.f.size()) {
            this.u = (String)this.g.f.get(this.t);
            bbl bbl2 = new bbl(this, "Question", bsc.a("mco.configure.world.uninvite.question", new Object[0]) + " '" + this.u + "'", 3);
            this.k.a(bbl2);
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 3) {
            if (bl2) {
                bal bal2 = this.k.M();
                bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
                try {
                    bvf2.a(this.g.a, this.u);
                }
                catch (bwa bwa2) {
                    a.error("Couldn't uninvite user");
                }
                this.d(this.t);
                this.A.l = false;
            }
            this.k.a(new bew(this.f, this.g));
        }
        if (n2 == 1) {
            if (bl2) {
                this.h();
            }
            this.k.a(this);
        }
    }

    private void d(int n2) {
        this.g.f.remove(n2);
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.h.a(n2, n3, f2);
        this.a(this.q, bsc.a("mco.configure.world.title", new Object[0]), this.l / 2, 17, 0xFFFFFF);
        this.a(this.q, this.g.b(), this.l / 2, 30, 0x7FFF7F);
        this.b(this.q, bsc.a("mco.configure.world.status", new Object[0]), this.s, this.a(1), 0xA0A0A0);
        this.b(this.q, this.p(), this.s, this.a(2), 0xFFFFFF);
        this.b(this.q, bsc.a("mco.configure.world.invited", new Object[0]), this.i, this.a(1), 0xA0A0A0);
        super.a(n2, n3, f2);
    }

    private String p() {
        if (this.g.h) {
            return "Expired";
        }
        String string = this.g.d.toLowerCase();
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    static /* synthetic */ azi a(bew bew2) {
        return bew2.k;
    }

    static /* synthetic */ int b(bew bew2) {
        return bew2.i;
    }

    static /* synthetic */ int a(bew bew2, int n2) {
        return bew2.a(n2);
    }

    static /* synthetic */ int c(bew bew2) {
        return bew2.r;
    }

    static /* synthetic */ bvo d(bew bew2) {
        return bew2.g;
    }

    static /* synthetic */ int b(bew bew2, int n2) {
        bew2.t = n2;
        return bew2.t;
    }

    static /* synthetic */ bau e(bew bew2) {
        return bew2.A;
    }

    static /* synthetic */ int f(bew bew2) {
        return bew2.t;
    }

    static /* synthetic */ ban g(bew bew2) {
        return bew2.q;
    }

    static /* synthetic */ azi h(bew bew2) {
        return bew2.k;
    }
}

