/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcm
extends bcl {
    private static final Logger g = LogManager.getLogger();
    private final DateFormat h = new SimpleDateFormat();
    protected bcl a;
    protected String f = "Select world";
    private boolean i;
    private int r;
    private List s;
    private bcn t;
    private String u;
    private String v;
    private String[] w = new String[3];
    private boolean x;
    private bau y;
    private bau z;
    private bau A;
    private bau B;

    public bcm(bcl bcl2) {
        this.a = bcl2;
    }

    @Override
    public void r_() {
        this.f = bsc.a("selectWorld.title", new Object[0]);
        try {
            this.h();
        }
        catch (axu axu2) {
            g.error("Couldn't load level list", (Throwable)axu2);
            this.k.a(new bbw("Unable to load worlds", axu2.getMessage()));
            return;
        }
        this.u = bsc.a("selectWorld.world", new Object[0]);
        this.v = bsc.a("selectWorld.conversion", new Object[0]);
        this.w[agb.b.a()] = bsc.a("gameMode.survival", new Object[0]);
        this.w[agb.c.a()] = bsc.a("gameMode.creative", new Object[0]);
        this.w[agb.d.a()] = bsc.a("gameMode.adventure", new Object[0]);
        this.t = new bcn(this);
        this.t.d(4, 5);
        this.g();
    }

    private void h() {
        axv axv2 = this.k.d();
        this.s = axv2.b();
        Collections.sort(this.s);
        this.r = -1;
    }

    protected String a(int n2) {
        return ((axw)this.s.get(n2)).a();
    }

    protected String d(int n2) {
        String string = ((axw)this.s.get(n2)).b();
        if (string == null || oy.a(string)) {
            string = bsc.a("selectWorld.world", new Object[0]) + " " + (n2 + 1);
        }
        return string;
    }

    public void g() {
        this.z = new bau(1, this.l / 2 - 154, this.m - 52, 150, 20, bsc.a("selectWorld.select", new Object[0]));
        this.n.add(this.z);
        this.n.add(new bau(3, this.l / 2 + 4, this.m - 52, 150, 20, bsc.a("selectWorld.create", new Object[0])));
        this.A = new bau(6, this.l / 2 - 154, this.m - 28, 72, 20, bsc.a("selectWorld.rename", new Object[0]));
        this.n.add(this.A);
        this.y = new bau(2, this.l / 2 - 76, this.m - 28, 72, 20, bsc.a("selectWorld.delete", new Object[0]));
        this.n.add(this.y);
        this.B = new bau(7, this.l / 2 + 4, this.m - 28, 72, 20, bsc.a("selectWorld.recreate", new Object[0]));
        this.n.add(this.B);
        this.n.add(new bau(0, this.l / 2 + 82, this.m - 28, 72, 20, bsc.a("gui.cancel", new Object[0])));
        this.z.l = false;
        this.y.l = false;
        this.A.l = false;
        this.B.l = false;
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 2) {
            String string = this.d(this.r);
            if (string != null) {
                this.x = true;
                bbl bbl2 = bcm.a(this, string, this.r);
                this.k.a(bbl2);
            }
        } else if (bau2.k == 1) {
            this.e(this.r);
        } else if (bau2.k == 3) {
            this.k.a(new bbq(this));
        } else if (bau2.k == 6) {
            this.k.a(new bck(this, this.a(this.r)));
        } else if (bau2.k == 0) {
            this.k.a(this.a);
        } else if (bau2.k == 7) {
            bbq bbq2 = new bbq(this);
            axt axt2 = this.k.d().a(this.a(this.r), false);
            axj axj2 = axt2.d();
            axt2.a();
            bbq2.a(axj2);
            this.k.a(bbq2);
        } else {
            this.t.a(bau2);
        }
    }

    public void e(int n2) {
        String string;
        this.k.a((bcl)null);
        if (this.i) {
            return;
        }
        this.i = true;
        String string2 = this.a(n2);
        if (string2 == null) {
            string2 = "World" + n2;
        }
        if ((string = this.d(n2)) == null) {
            string = "World" + n2;
        }
        if (this.k.d().f(string2)) {
            this.k.a(string2, string, null);
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (this.x) {
            this.x = false;
            if (bl2) {
                axv axv2 = this.k.d();
                axv2.d();
                axv2.e(this.a(n2));
                try {
                    this.h();
                }
                catch (axu axu2) {
                    g.error("Couldn't load level list", (Throwable)axu2);
                }
            }
            this.k.a(this);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.t.a(n2, n3, f2);
        this.a(this.q, this.f, this.l / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    public static bbl a(bcl bcl2, String string, int n2) {
        String string2 = bsc.a("selectWorld.deleteQuestion", new Object[0]);
        String string3 = "'" + string + "' " + bsc.a("selectWorld.deleteWarning", new Object[0]);
        String string4 = bsc.a("selectWorld.deleteButton", new Object[0]);
        String string5 = bsc.a("gui.cancel", new Object[0]);
        bbl bbl2 = new bbl(bcl2, string2, string3, string4, string5, n2);
        return bbl2;
    }

    static /* synthetic */ List a(bcm bcm2) {
        return bcm2.s;
    }

    static /* synthetic */ int a(bcm bcm2, int n2) {
        bcm2.r = n2;
        return bcm2.r;
    }

    static /* synthetic */ int b(bcm bcm2) {
        return bcm2.r;
    }

    static /* synthetic */ bau c(bcm bcm2) {
        return bcm2.z;
    }

    static /* synthetic */ bau d(bcm bcm2) {
        return bcm2.y;
    }

    static /* synthetic */ bau e(bcm bcm2) {
        return bcm2.A;
    }

    static /* synthetic */ bau f(bcm bcm2) {
        return bcm2.B;
    }

    static /* synthetic */ String g(bcm bcm2) {
        return bcm2.u;
    }

    static /* synthetic */ DateFormat h(bcm bcm2) {
        return bcm2.h;
    }

    static /* synthetic */ String i(bcm bcm2) {
        return bcm2.v;
    }

    static /* synthetic */ String[] j(bcm bcm2) {
        return bcm2.w;
    }
}

