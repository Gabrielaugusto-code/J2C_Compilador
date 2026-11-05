/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class bck
extends bcl {
    private bcl a;
    private baw f;
    private final String g;

    public bck(bcl bcl2, String string) {
        this.a = bcl2;
        this.g = string;
    }

    @Override
    public void c() {
        this.f.a();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bsc.a("selectWorld.renameButton", new Object[0])));
        this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bsc.a("gui.cancel", new Object[0])));
        axv axv2 = this.k.d();
        axj axj2 = axv2.c(this.g);
        String string = axj2.k();
        this.f = new baw(this.q, this.l / 2 - 100, 60, 200, 20);
        this.f.b(true);
        this.f.a(string);
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
            this.k.a(this.a);
        } else if (bau2.k == 0) {
            axv axv2 = this.k.d();
            axv2.a(this.g, this.f.b().trim());
            this.k.a(this.a);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.f.a(c2, n2);
        boolean bl2 = ((bau)this.n.get((int)0)).l = this.f.b().trim().length() > 0;
        if (n2 == 28 || n2 == 156) {
            this.a((bau)this.n.get(0));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.f.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("selectWorld.renameTitle", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        this.b(this.q, bsc.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, 0xA0A0A0);
        this.f.f();
        super.a(n2, n3, f2);
    }
}

