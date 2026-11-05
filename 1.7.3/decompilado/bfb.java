/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import java.io.UnsupportedEncodingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bfb
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private bcl f;
    private bcl g;
    private baw h;
    private baw i;
    private bvo r;
    private bau s;
    private int t;
    private int u;
    private int v;
    private bfu w;

    public bfb(bcl bcl2, bcl bcl3, bvo bvo2) {
        this.f = bcl2;
        this.g = bcl3;
        this.r = bvo2;
    }

    @Override
    public void c() {
        this.i.a();
        this.h.a();
    }

    @Override
    public void r_() {
        this.t = this.l / 4;
        this.u = this.l / 4 - 2;
        this.v = this.l / 2 + 4;
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.s = new bau(0, this.t, this.m / 4 + 120 + 22, this.u, 20, bsc.a("mco.configure.world.buttons.done", new Object[0]));
        this.n.add(this.s);
        this.n.add(new bau(1, this.v, this.m / 4 + 120 + 22, this.u, 20, bsc.a("gui.cancel", new Object[0])));
        this.i = new baw(this.q, this.t, 56, 212, 20);
        this.i.b(true);
        this.i.f(32);
        this.i.a(this.r.b());
        this.h = new baw(this.q, this.t, 96, 212, 20);
        this.h.f(32);
        this.h.a(this.r.a());
        this.w = new bfu(this.l, this.m, this.t, 122, this.r.i, this.r.j);
        this.n.addAll(this.w.a);
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
            this.g();
        } else if (bau2.k == 2) {
            this.k.a(new bgp(this, this.r));
        } else {
            this.w.a(bau2);
        }
    }

    private void g() {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            String string = this.h.b() == null || this.h.b().trim().equals("") ? null : this.h.b();
            bvf2.a(this.r.a, this.i.b(), string, this.w.e, this.w.f);
            this.r.a(this.i.b());
            this.r.b(this.h.b());
            this.r.i = this.w.e;
            this.r.j = this.w.f;
            this.k.a(new bew(this.g, this.r));
        }
        catch (bwa bwa2) {
            a.error("Couldn't edit world");
            this.k.a(new bgh(bwa2, this));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            a.error("Couldn't edit world");
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.i.a(c2, n2);
        this.h.a(c2, n2);
        if (n2 == 15) {
            this.i.b(!this.i.l());
            this.h.b(!this.h.l());
        }
        if (n2 == 28 || n2 == 156) {
            this.g();
        }
        this.s.l = this.i.b() != null && !this.i.b().trim().equals("");
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.h.a(n2, n3, n4);
        this.i.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("mco.configure.world.edit.title", new Object[0]), this.l / 2, 17, 0xFFFFFF);
        this.b(this.q, bsc.a("mco.configure.world.name", new Object[0]), this.t, 43, 0xA0A0A0);
        this.b(this.q, bsc.a("mco.configure.world.description", new Object[0]), this.t, 84, 0xA0A0A0);
        this.i.f();
        this.h.f();
        this.w.a(this, this.q);
        super.a(n2, n3, f2);
    }
}

