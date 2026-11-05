/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class bbv
extends bcl {
    private bcl a;
    private baw f;
    private baw g;
    private bki h;

    public bbv(bcl bcl2, bki bki2) {
        this.a = bcl2;
        this.h = bki2;
    }

    @Override
    public void c() {
        this.g.a();
        this.f.a();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bsc.a("addServer.add", new Object[0])));
        this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bsc.a("gui.cancel", new Object[0])));
        this.g = new baw(this.q, this.l / 2 - 100, 66, 200, 20);
        this.g.b(true);
        this.g.a(this.h.a);
        this.f = new baw(this.q, this.l / 2 - 100, 106, 200, 20);
        this.f.f(128);
        this.f.a(this.h.b);
        ((bau)this.n.get((int)0)).l = this.f.b().length() > 0 && this.f.b().split(":").length > 0 && this.g.b().length() > 0;
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
            this.a.a(false, 0);
        } else if (bau2.k == 0) {
            this.h.a = this.g.b();
            this.h.b = this.f.b();
            this.a.a(true, 0);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.g.a(c2, n2);
        this.f.a(c2, n2);
        if (n2 == 15) {
            this.g.b(!this.g.l());
            this.f.b(!this.f.l());
        }
        if (n2 == 28 || n2 == 156) {
            this.a((bau)this.n.get(0));
        }
        ((bau)this.n.get((int)0)).l = this.f.b().length() > 0 && this.f.b().split(":").length > 0 && this.g.b().length() > 0;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.f.a(n2, n3, n4);
        this.g.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("addServer.title", new Object[0]), this.l / 2, 17, 0xFFFFFF);
        this.b(this.q, bsc.a("addServer.enterName", new Object[0]), this.l / 2 - 100, 53, 0xA0A0A0);
        this.b(this.q, bsc.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 94, 0xA0A0A0);
        this.g.f();
        this.f.f();
        super.a(n2, n3, f2);
    }
}

