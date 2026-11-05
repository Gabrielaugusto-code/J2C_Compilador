/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.util.Random;
import org.lwjgl.input.Keyboard;

public class bbq
extends bcl {
    private bcl f;
    private baw g;
    private baw h;
    private String i;
    private String r = "survival";
    private boolean s = true;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private bau z;
    private bau A;
    private bau B;
    private bau C;
    private bau D;
    private bau E;
    private bau F;
    private String G;
    private String H;
    private String I;
    private String J;
    private int K;
    public String a = "";
    private static final String[] L = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    public bbq(bcl bcl2) {
        this.f = bcl2;
        this.I = "";
        this.J = bsc.a("selectWorld.newWorld", new Object[0]);
    }

    @Override
    public void c() {
        this.g.a();
        this.h.a();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 155, this.m - 28, 150, 20, bsc.a("selectWorld.create", new Object[0])));
        this.n.add(new bau(1, this.l / 2 + 5, this.m - 28, 150, 20, bsc.a("gui.cancel", new Object[0])));
        this.z = new bau(2, this.l / 2 - 75, 115, 150, 20, bsc.a("selectWorld.gameMode", new Object[0]));
        this.n.add(this.z);
        this.A = new bau(3, this.l / 2 - 75, 187, 150, 20, bsc.a("selectWorld.moreWorldOptions", new Object[0]));
        this.n.add(this.A);
        this.B = new bau(4, this.l / 2 - 155, 100, 150, 20, bsc.a("selectWorld.mapFeatures", new Object[0]));
        this.n.add(this.B);
        this.B.m = false;
        this.C = new bau(7, this.l / 2 + 5, 151, 150, 20, bsc.a("selectWorld.bonusItems", new Object[0]));
        this.n.add(this.C);
        this.C.m = false;
        this.D = new bau(5, this.l / 2 + 5, 100, 150, 20, bsc.a("selectWorld.mapType", new Object[0]));
        this.n.add(this.D);
        this.D.m = false;
        this.E = new bau(6, this.l / 2 - 155, 151, 150, 20, bsc.a("selectWorld.allowCommands", new Object[0]));
        this.n.add(this.E);
        this.E.m = false;
        this.F = new bau(8, this.l / 2 + 5, 120, 150, 20, bsc.a("selectWorld.customizeType", new Object[0]));
        this.n.add(this.F);
        this.F.m = false;
        this.g = new baw(this.q, this.l / 2 - 100, 60, 200, 20);
        this.g.b(true);
        this.g.a(this.J);
        this.h = new baw(this.q, this.l / 2 - 100, 60, 200, 20);
        this.h.a(this.I);
        this.a(this.y);
        this.g();
        this.h();
    }

    private void g() {
        this.i = this.g.b().trim();
        for (char c2 : t.a) {
            this.i = this.i.replace(c2, '_');
        }
        if (oy.a(this.i)) {
            this.i = "World";
        }
        this.i = bbq.a(this.k.d(), this.i);
    }

    private void h() {
        this.z.j = bsc.a("selectWorld.gameMode", new Object[0]) + " " + bsc.a("selectWorld.gameMode." + this.r, new Object[0]);
        this.G = bsc.a("selectWorld.gameMode." + this.r + ".line1", new Object[0]);
        this.H = bsc.a("selectWorld.gameMode." + this.r + ".line2", new Object[0]);
        this.B.j = bsc.a("selectWorld.mapFeatures", new Object[0]) + " ";
        this.B.j = this.s ? this.B.j + bsc.a("options.on", new Object[0]) : this.B.j + bsc.a("options.off", new Object[0]);
        this.C.j = bsc.a("selectWorld.bonusItems", new Object[0]) + " ";
        this.C.j = this.v && !this.w ? this.C.j + bsc.a("options.on", new Object[0]) : this.C.j + bsc.a("options.off", new Object[0]);
        this.D.j = bsc.a("selectWorld.mapType", new Object[0]) + " " + bsc.a(agd.a[this.K].b(), new Object[0]);
        this.E.j = bsc.a("selectWorld.allowCommands", new Object[0]) + " ";
        this.E.j = this.t && !this.w ? this.E.j + bsc.a("options.on", new Object[0]) : this.E.j + bsc.a("options.off", new Object[0]);
    }

    public static String a(axv axv2, String string) {
        string = string.replaceAll("[\\./\"]", "_");
        for (String string2 : L) {
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        while (axv2.c(string) != null) {
            string = string + "-";
        }
        return string;
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
            this.k.a(this.f);
        } else if (bau2.k == 0) {
            this.k.a((bcl)null);
            if (this.x) {
                return;
            }
            this.x = true;
            long l2 = new Random().nextLong();
            String string = this.h.b();
            if (!oy.a(string)) {
                try {
                    long l3 = Long.parseLong(string);
                    if (l3 != 0L) {
                        l2 = l3;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    l2 = string.hashCode();
                }
            }
            agb agb2 = agb.a(this.r);
            aga aga2 = new aga(l2, agb2, this.s, this.w, agd.a[this.K]);
            aga2.a(this.a);
            if (this.v && !this.w) {
                aga2.a();
            }
            if (this.t && !this.w) {
                aga2.b();
            }
            this.k.a(this.i, this.g.b().trim(), aga2);
        } else if (bau2.k == 3) {
            this.i();
        } else if (bau2.k == 2) {
            if (this.r.equals("survival")) {
                if (!this.u) {
                    this.t = false;
                }
                this.w = false;
                this.r = "hardcore";
                this.w = true;
                this.E.l = false;
                this.C.l = false;
                this.h();
            } else if (this.r.equals("hardcore")) {
                if (!this.u) {
                    this.t = true;
                }
                this.w = false;
                this.r = "creative";
                this.h();
                this.w = false;
                this.E.l = true;
                this.C.l = true;
            } else {
                if (!this.u) {
                    this.t = false;
                }
                this.r = "survival";
                this.h();
                this.E.l = true;
                this.C.l = true;
                this.w = false;
            }
            this.h();
        } else if (bau2.k == 4) {
            this.s = !this.s;
            this.h();
        } else if (bau2.k == 7) {
            this.v = !this.v;
            this.h();
        } else if (bau2.k == 5) {
            ++this.K;
            if (this.K >= agd.a.length) {
                this.K = 0;
            }
            while (agd.a[this.K] == null || !agd.a[this.K].e()) {
                ++this.K;
                if (this.K < agd.a.length) continue;
                this.K = 0;
            }
            this.a = "";
            this.h();
            this.a(this.y);
        } else if (bau2.k == 6) {
            this.u = true;
            this.t = !this.t;
            this.h();
        } else if (bau2.k == 8) {
            this.k.a(new bbo(this, this.a));
        }
    }

    private void i() {
        this.a(!this.y);
    }

    private void a(boolean bl2) {
        this.y = bl2;
        this.z.m = !this.y;
        this.B.m = this.y;
        this.C.m = this.y;
        this.D.m = this.y;
        this.E.m = this.y;
        this.F.m = this.y && agd.a[this.K] == agd.c;
        this.A.j = this.y ? bsc.a("gui.done", new Object[0]) : bsc.a("selectWorld.moreWorldOptions", new Object[0]);
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.g.l() && !this.y) {
            this.g.a(c2, n2);
            this.J = this.g.b();
        } else if (this.h.l() && this.y) {
            this.h.a(c2, n2);
            this.I = this.h.b();
        }
        if (n2 == 28 || n2 == 156) {
            this.a((bau)this.n.get(0));
        }
        ((bau)this.n.get((int)0)).l = this.g.b().length() > 0;
        this.g();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.y) {
            this.h.a(n2, n3, n4);
        } else {
            this.g.a(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("selectWorld.create", new Object[0]), this.l / 2, 20, -1);
        if (this.y) {
            this.b(this.q, bsc.a("selectWorld.enterSeed", new Object[0]), this.l / 2 - 100, 47, -6250336);
            this.b(this.q, bsc.a("selectWorld.seedInfo", new Object[0]), this.l / 2 - 100, 85, -6250336);
            this.b(this.q, bsc.a("selectWorld.mapFeatures.info", new Object[0]), this.l / 2 - 150, 122, -6250336);
            this.b(this.q, bsc.a("selectWorld.allowCommands.info", new Object[0]), this.l / 2 - 150, 172, -6250336);
            this.h.f();
            if (agd.a[this.K].h()) {
                this.q.a(bsc.a(agd.a[this.K].c(), new Object[0]), this.D.h + 2, this.D.i + 22, this.D.b(), 0xA0A0A0);
            }
        } else {
            this.b(this.q, bsc.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, -6250336);
            this.b(this.q, bsc.a("selectWorld.resultFolder", new Object[0]) + " " + this.i, this.l / 2 - 100, 85, -6250336);
            this.g.f();
            this.b(this.q, this.G, this.l / 2 - 100, 137, -6250336);
            this.b(this.q, this.H, this.l / 2 - 100, 149, -6250336);
        }
        super.a(n2, n3, f2);
    }

    public void a(axj axj2) {
        this.J = bsc.a("selectWorld.newWorld.copyOf", axj2.k());
        this.I = axj2.b() + "";
        this.K = axj2.u().g();
        this.a = axj2.y();
        this.s = axj2.s();
        this.t = axj2.v();
        if (axj2.t()) {
            this.r = "hardcore";
        } else if (axj2.r().e()) {
            this.r = "survival";
        } else if (axj2.r().d()) {
            this.r = "creative";
        }
    }
}

