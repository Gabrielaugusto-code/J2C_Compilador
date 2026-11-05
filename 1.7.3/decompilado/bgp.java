/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bgp
extends bgr {
    private static final Logger a = LogManager.getLogger();
    private bcl f;
    private bvo g;
    private baw h;
    private final int i = 1;
    private final int r = 2;
    private static int s = 3;
    private bvx t;
    private bau u;

    public bgp(bcl bcl2, bvo bvo2) {
        this.f = bcl2;
        this.g = bvo2;
    }

    @Override
    public void c() {
        this.h.a();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.u = new bau(1, this.l / 2 - 100, this.m / 4 + 120 + 12, 97, 20, bsc.a("mco.configure.world.buttons.reset", new Object[0]));
        this.n.add(this.u);
        this.n.add(new bau(2, this.l / 2 + 5, this.m / 4 + 120 + 12, 97, 20, bsc.a("gui.cancel", new Object[0])));
        this.h = new baw(this.q, this.l / 2 - 100, 99, 200, 20);
        this.h.b(true);
        this.h.f(32);
        this.h.a("");
        if (this.t == null) {
            this.n.add(new bau(s, this.l / 2 - 100, 125, 200, 20, bsc.a("mco.template.default.name", new Object[0])));
        } else {
            this.h.a("");
            this.h.c(false);
            this.h.b(false);
            this.n.add(new bau(s, this.l / 2 - 100, 125, 200, 20, bsc.a("mco.template.name", new Object[0]) + ": " + this.t.b));
        }
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void a(char c2, int n2) {
        this.h.a(c2, n2);
        if (n2 == 28 || n2 == 156) {
            this.a(this.u);
        }
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 2) {
            this.k.a(this.f);
        } else if (bau2.k == 1) {
            String string = bsc.a("mco.configure.world.reset.question.line1", new Object[0]);
            String string2 = bsc.a("mco.configure.world.reset.question.line2", new Object[0]);
            this.k.a(new bff(this, bfg.a, string, string2, 1));
        } else if (bau2.k == s) {
            this.k.a(new bfk(this, this.t));
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2 && n2 == 1) {
            this.h();
        } else {
            this.k.a(this);
        }
    }

    private void h() {
        bgq bgq2 = new bgq(this, this.g.a, this.h.b(), this.t);
        bfh bfh2 = new bfh(this.k, this.f, bgq2);
        bfh2.g();
        this.k.a(bfh2);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.h.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("mco.reset.world.title", new Object[0]), this.l / 2, 17, 0xFFFFFF);
        this.a(this.q, bsc.a("mco.reset.world.warning", new Object[0]), this.l / 2, 56, 0xFF0000);
        this.b(this.q, bsc.a("mco.reset.world.seed", new Object[0]), this.l / 2 - 100, 86, 0xA0A0A0);
        this.h.f();
        super.a(n2, n3, f2);
    }

    void a(bvx bvx2) {
        this.t = bvx2;
    }

    static /* synthetic */ azi a(bgp bgp2) {
        return bgp2.k;
    }

    static /* synthetic */ bcl b(bgp bgp2) {
        return bgp2.f;
    }

    static /* synthetic */ azi c(bgp bgp2) {
        return bgp2.k;
    }

    static /* synthetic */ Logger g() {
        return a;
    }
}

