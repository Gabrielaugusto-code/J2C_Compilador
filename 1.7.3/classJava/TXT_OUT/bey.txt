/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import java.util.ArrayList;
import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bey
extends bgr {
    private static final Logger a = LogManager.getLogger();
    private bcl f;
    private baw g;
    private String h;
    private static int i = 0;
    private static int r = 1;
    private static int s = 2;
    private boolean t;
    private String u = "You must enter a name!";
    private bvx v;

    public bey(bcl bcl2) {
        this.n = Collections.synchronizedList(new ArrayList());
        this.f = bcl2;
    }

    @Override
    public void c() {
        this.g.a();
        this.h = this.g.b();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.n.add(new bau(i, this.l / 2 - 100, this.m / 4 + 120 + 17, 97, 20, bsc.a("mco.create.world", new Object[0])));
        this.n.add(new bau(r, this.l / 2 + 5, this.m / 4 + 120 + 17, 95, 20, bsc.a("gui.cancel", new Object[0])));
        this.g = new baw(this.q, this.l / 2 - 100, 65, 200, 20);
        this.g.b(true);
        if (this.h != null) {
            this.g.a(this.h);
        }
        if (this.v == null) {
            this.n.add(new bau(s, this.l / 2 - 100, 107, 200, 20, bsc.a("mco.template.default.name", new Object[0])));
        } else {
            this.n.add(new bau(s, this.l / 2 - 100, 107, 200, 20, bsc.a("mco.template.name", new Object[0]) + ": " + this.v.b));
        }
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
        if (bau2.k == r) {
            this.k.a(this.f);
        } else if (bau2.k == i) {
            this.h();
        } else if (bau2.k == s) {
            this.k.a(new bfk(this, this.v));
        }
    }

    private void h() {
        if (this.i()) {
            bez bez2 = new bez(this, this.g.b(), this.v);
            bfh bfh2 = new bfh(this.k, this.f, bez2);
            bfh2.g();
            this.k.a(bfh2);
        }
    }

    private boolean i() {
        this.t = this.g.b() == null || this.g.b().trim().equals("");
        return !this.t;
    }

    @Override
    protected void a(char c2, int n2) {
        this.g.a(c2, n2);
        if (n2 == 15) {
            this.g.b(!this.g.l());
        }
        if (n2 == 28 || n2 == 156) {
            this.a((bau)this.n.get(0));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.g.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("mco.selectServer.create", new Object[0]), this.l / 2, 11, 0xFFFFFF);
        this.b(this.q, bsc.a("mco.configure.world.name", new Object[0]), this.l / 2 - 100, 52, 0xA0A0A0);
        if (this.t) {
            this.a(this.q, this.u, this.l / 2, 167, 0xFF0000);
        }
        this.g.f();
        super.a(n2, n3, f2);
    }

    public void a(bvx bvx2) {
        this.v = bvx2;
    }

    static /* synthetic */ azi a(bey bey2) {
        return bey2.k;
    }

    static /* synthetic */ bcl b(bey bey2) {
        return bey2.f;
    }

    static /* synthetic */ azi c(bey bey2) {
        return bey2.k;
    }

    static /* synthetic */ Logger g() {
        return a;
    }
}

