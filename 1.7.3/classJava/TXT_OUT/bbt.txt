/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class bbt
extends bcl {
    private final bcl a;
    private final bki f;
    private baw g;

    public bbt(bcl bcl2, bki bki2) {
        this.a = bcl2;
        this.f = bki2;
    }

    @Override
    public void c() {
        this.g.a();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bsc.a("selectServer.select", new Object[0])));
        this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bsc.a("gui.cancel", new Object[0])));
        this.g = new baw(this.q, this.l / 2 - 100, 116, 200, 20);
        this.g.f(128);
        this.g.b(true);
        this.g.a(this.k.u.aA);
        ((bau)this.n.get((int)0)).l = this.g.b().length() > 0 && this.g.b().split(":").length > 0;
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.k.u.aA = this.g.b();
        this.k.u.b();
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            this.a.a(false, 0);
        } else if (bau2.k == 0) {
            this.f.b = this.g.b();
            this.a.a(true, 0);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.g.a(c2, n2)) {
            ((bau)this.n.get((int)0)).l = this.g.b().length() > 0 && this.g.b().split(":").length > 0;
        } else if (n2 == 28 || n2 == 156) {
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
        this.a(this.q, bsc.a("selectServer.direct", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        this.b(this.q, bsc.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 100, 0xA0A0A0);
        this.g.f();
        super.a(n2, n3, f2);
    }
}

