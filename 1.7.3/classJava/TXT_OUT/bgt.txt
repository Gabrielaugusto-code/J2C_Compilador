/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bgt
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final bkk f = new bkk();
    private bcl g;
    private bgy h;
    private bkj i;
    private bau r;
    private bau s;
    private bau t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private String y;
    private bki z;
    private btq A;
    private btp B;
    private boolean C;

    public bgt(bcl bcl2) {
        this.g = bcl2;
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        if (!this.C) {
            this.C = true;
            this.i = new bkj(this.k);
            this.i.a();
            this.A = new btq();
            try {
                this.B = new btp(this.A);
                this.B.start();
            }
            catch (Exception exception) {
                a.warn("Unable to start LAN server detection: " + exception.getMessage());
            }
            this.h = new bgy(this, this.k, this.l, this.m, 32, this.m - 64, 36);
            this.h.a(this.i);
        } else {
            this.h.a(this.l, this.m, 32, this.m - 64);
        }
        this.g();
    }

    public void g() {
        this.r = new bau(7, this.l / 2 - 154, this.m - 28, 70, 20, bsc.a("selectServer.edit", new Object[0]));
        this.n.add(this.r);
        this.t = new bau(2, this.l / 2 - 74, this.m - 28, 70, 20, bsc.a("selectServer.delete", new Object[0]));
        this.n.add(this.t);
        this.s = new bau(1, this.l / 2 - 154, this.m - 52, 100, 20, bsc.a("selectServer.select", new Object[0]));
        this.n.add(this.s);
        this.n.add(new bau(4, this.l / 2 - 50, this.m - 52, 100, 20, bsc.a("selectServer.direct", new Object[0])));
        this.n.add(new bau(3, this.l / 2 + 4 + 50, this.m - 52, 100, 20, bsc.a("selectServer.add", new Object[0])));
        this.n.add(new bau(8, this.l / 2 + 4, this.m - 28, 70, 20, bsc.a("selectServer.refresh", new Object[0])));
        this.n.add(new bau(0, this.l / 2 + 4 + 76, this.m - 28, 75, 20, bsc.a("gui.cancel", new Object[0])));
        this.a(this.h.k());
    }

    @Override
    public void c() {
        super.c();
        if (this.A.a()) {
            List list = this.A.c();
            this.A.b();
            this.h.a(list);
        }
        this.f.a();
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
        if (this.B != null) {
            this.B.interrupt();
            this.B = null;
        }
        this.f.b();
    }

    @Override
    protected void a(bau bau2) {
        bbb bbb2;
        if (!bau2.l) {
            return;
        }
        bbb bbb3 = bbb2 = this.h.k() < 0 ? null : this.h.b(this.h.k());
        if (bau2.k == 2 && bbb2 instanceof bgw) {
            String string = ((bgw)bbb2).a().a;
            if (string != null) {
                this.u = true;
                String string2 = bsc.a("selectServer.deleteQuestion", new Object[0]);
                String string3 = "'" + string + "' " + bsc.a("selectServer.deleteWarning", new Object[0]);
                String string4 = bsc.a("selectServer.deleteButton", new Object[0]);
                String string5 = bsc.a("gui.cancel", new Object[0]);
                bbl bbl2 = new bbl(this, string2, string3, string4, string5, this.h.k());
                this.k.a(bbl2);
            }
        } else if (bau2.k == 1) {
            this.h();
        } else if (bau2.k == 4) {
            this.x = true;
            this.z = new bki(bsc.a("selectServer.defaultName", new Object[0]), "");
            this.k.a(new bbt(this, this.z));
        } else if (bau2.k == 3) {
            this.v = true;
            this.z = new bki(bsc.a("selectServer.defaultName", new Object[0]), "");
            this.k.a(new bbv(this, this.z));
        } else if (bau2.k == 7 && bbb2 instanceof bgw) {
            this.w = true;
            bki bki2 = ((bgw)bbb2).a();
            this.z = new bki(bki2.a, bki2.b);
            this.z.b(bki2.d());
            this.k.a(new bbv(this, this.z));
        } else if (bau2.k == 0) {
            this.k.a(this.g);
        } else if (bau2.k == 8) {
            this.q();
        }
    }

    private void q() {
        this.k.a(new bgt(this.g));
    }

    @Override
    public void a(boolean bl2, int n2) {
        bbb bbb2;
        bbb bbb3 = bbb2 = this.h.k() < 0 ? null : this.h.b(this.h.k());
        if (this.u) {
            this.u = false;
            if (bl2 && bbb2 instanceof bgw) {
                this.i.b(this.h.k());
                this.i.b();
                this.h.c(-1);
                this.h.a(this.i);
            }
            this.k.a(this);
        } else if (this.x) {
            this.x = false;
            if (bl2) {
                this.a(this.z);
            } else {
                this.k.a(this);
            }
        } else if (this.v) {
            this.v = false;
            if (bl2) {
                this.i.a(this.z);
                this.i.b();
                this.h.c(-1);
                this.h.a(this.i);
            }
            this.k.a(this);
        } else if (this.w) {
            this.w = false;
            if (bl2 && bbb2 instanceof bgw) {
                bki bki2 = ((bgw)bbb2).a();
                bki2.a = this.z.a;
                bki2.b = this.z.b;
                bki2.b(this.z.d());
                this.i.b();
                this.h.a(this.i);
            }
            this.k.a(this);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        bbb bbb2;
        int n3 = this.h.k();
        bbb bbb3 = bbb2 = n3 < 0 ? null : this.h.b(n3);
        if (n2 == 63) {
            this.q();
            return;
        }
        if (n3 >= 0) {
            if (n2 == 200) {
                if (bgt.n()) {
                    if (n3 > 0 && bbb2 instanceof bgw) {
                        this.i.a(n3, n3 - 1);
                        this.a(this.h.k() - 1);
                        this.h.f(-this.h.j());
                        this.h.a(this.i);
                    }
                } else if (n3 > 0) {
                    this.a(this.h.k() - 1);
                    this.h.f(-this.h.j());
                    if (this.h.b(this.h.k()) instanceof bgu) {
                        if (this.h.k() > 0) {
                            this.a(this.h.b() - 1);
                            this.h.f(-this.h.j());
                        } else {
                            this.a(-1);
                        }
                    }
                } else {
                    this.a(-1);
                }
            } else if (n2 == 208) {
                if (bgt.n()) {
                    if (n3 < this.i.c() - 1) {
                        this.i.a(n3, n3 + 1);
                        this.a(n3 + 1);
                        this.h.f(this.h.j());
                        this.h.a(this.i);
                    }
                } else if (n3 < this.h.b()) {
                    this.a(this.h.k() + 1);
                    this.h.f(this.h.j());
                    if (this.h.b(this.h.k()) instanceof bgu) {
                        if (this.h.k() < this.h.b() - 1) {
                            this.a(this.h.b() + 1);
                            this.h.f(this.h.j());
                        } else {
                            this.a(-1);
                        }
                    }
                } else {
                    this.a(-1);
                }
            } else if (n2 == 28 || n2 == 156) {
                this.a((bau)this.n.get(2));
            } else {
                super.a(c2, n2);
            }
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.y = null;
        this.q_();
        this.h.a(n2, n3, f2);
        this.a(this.q, bsc.a("multiplayer.title", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.y != null) {
            this.a(Lists.newArrayList((Iterable)Splitter.on((String)"\n").split((CharSequence)this.y)), n2, n3);
        }
    }

    public void h() {
        bbb bbb2;
        bbb bbb3 = bbb2 = this.h.k() < 0 ? null : this.h.b(this.h.k());
        if (bbb2 instanceof bgw) {
            this.a(((bgw)bbb2).a());
        } else if (bbb2 instanceof bgv) {
            bto bto2 = ((bgv)bbb2).a();
            this.a(new bki(bto2.a(), bto2.b()));
        }
    }

    private void a(bki bki2) {
        this.k.a(new bbm(this, this.k, bki2));
    }

    public void a(int n2) {
        this.h.c(n2);
        bbb bbb2 = n2 < 0 ? null : this.h.b(n2);
        this.s.l = false;
        this.r.l = false;
        this.t.l = false;
        if (bbb2 != null && !(bbb2 instanceof bgu)) {
            this.s.l = true;
            if (bbb2 instanceof bgw) {
                this.r.l = true;
                this.t.l = true;
            }
        }
    }

    public bkk i() {
        return this.f;
    }

    public void a(String string) {
        this.y = string;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.h.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        this.h.b(n2, n3, n4);
    }

    public bkj p() {
        return this.i;
    }
}

