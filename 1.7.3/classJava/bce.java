/*
 * Decompiled with CFR 0.152.
 */
public class bce
extends bcl {
    private int a;
    private int f;

    @Override
    public void r_() {
        this.a = 0;
        this.n.clear();
        int n2 = -16;
        int n3 = 98;
        this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 120 + n2, bsc.a("menu.returnToMenu", new Object[0])));
        if (!this.k.F()) {
            ((bau)this.n.get((int)0)).j = bsc.a("menu.disconnect", new Object[0]);
        }
        this.n.add(new bau(4, this.l / 2 - 100, this.m / 4 + 24 + n2, bsc.a("menu.returnToGame", new Object[0])));
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 96 + n2, 98, 20, bsc.a("menu.options", new Object[0])));
        bau bau2 = new bau(7, this.l / 2 + 2, this.m / 4 + 96 + n2, 98, 20, bsc.a("menu.shareToLan", new Object[0]));
        this.n.add(bau2);
        this.n.add(new bau(5, this.l / 2 - 100, this.m / 4 + 48 + n2, 98, 20, bsc.a("gui.achievements", new Object[0])));
        this.n.add(new bau(6, this.l / 2 + 2, this.m / 4 + 48 + n2, 98, 20, bsc.a("gui.stats", new Object[0])));
        bau2.l = this.k.G() && !this.k.H().a();
    }

    @Override
    protected void a(bau bau2) {
        switch (bau2.k) {
            case 0: {
                this.k.a(new bcb(this, this.k.u));
                break;
            }
            case 1: {
                bau2.l = false;
                this.k.f.F();
                this.k.a((bka)null);
                this.k.a(new bct());
                break;
            }
            case 4: {
                this.k.a((bcl)null);
                this.k.l();
                break;
            }
            case 5: {
                this.k.a(new bcy(this, this.k.h.m()));
                break;
            }
            case 6: {
                this.k.a(new bcz(this, this.k.h.m()));
                break;
            }
            case 7: {
                this.k.a(new bco(this));
            }
        }
    }

    @Override
    public void c() {
        super.c();
        ++this.f;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("menu.game", new Object[0]), this.l / 2, 40, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

