/*
 * Decompiled with CFR 0.152.
 */
public class bby
extends bcl {
    protected bcl a;
    private bbz f;
    private final bac g;
    private final bse h;
    private bbc i;
    private bbc r;

    public bby(bcl bcl2, bac bac2, bse bse2) {
        this.a = bcl2;
        this.g = bac2;
        this.h = bse2;
    }

    @Override
    public void r_() {
        this.i = new bbc(100, this.l / 2 - 155, this.m - 38, baf.I, this.g.c(baf.I));
        this.n.add(this.i);
        this.r = new bbc(6, this.l / 2 - 155 + 160, this.m - 38, bsc.a("gui.done", new Object[0]));
        this.n.add(this.r);
        this.f = new bbz(this);
        this.f.d(7, 8);
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        switch (bau2.k) {
            case 100: {
                if (!(bau2 instanceof bbc)) break;
                this.g.a(((bbc)bau2).c(), 1);
                bau2.j = this.g.c(baf.I);
                bat bat2 = new bat(this.k, this.k.d, this.k.e);
                int n2 = bat2.a();
                int n3 = bat2.b();
                this.a(this.k, n2, n3);
                this.r_();
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                this.k.a(this.a);
                break;
            }
            default: {
                this.f.a(bau2);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.f.a(n2, n3, f2);
        this.a(this.q, bsc.a("options.language", new Object[0]), this.l / 2, 16, 0xFFFFFF);
        this.a(this.q, "(" + bsc.a("options.languageWarning", new Object[0]) + ")", this.l / 2, this.m - 56, 0x808080);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ bse a(bby bby2) {
        return bby2.h;
    }

    static /* synthetic */ bac b(bby bby2) {
        return bby2.g;
    }

    static /* synthetic */ bbc c(bby bby2) {
        return bby2.r;
    }

    static /* synthetic */ bbc d(bby bby2) {
        return bby2.i;
    }
}

