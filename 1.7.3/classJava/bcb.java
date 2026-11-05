/*
 * Decompiled with CFR 0.152.
 */
public class bcb
extends bcl {
    private static final baf[] f = new baf[]{baf.c, baf.l};
    private final bcl g;
    private final bac h;
    protected String a = "Options";

    public bcb(bcl bcl2, bac bac2) {
        this.g = bcl2;
        this.h = bac2;
    }

    @Override
    public void r_() {
        int n2 = 0;
        this.a = bsc.a("options.title", new Object[0]);
        for (baf baf2 : f) {
            if (baf2.a()) {
                this.n.add(new bbg(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 - 12 + 24 * (n2 >> 1), baf2));
            } else {
                bbc bbc2 = new bbc(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 - 12 + 24 * (n2 >> 1), baf2, this.h.c(baf2));
                if (baf2 == baf.l && this.k.f != null && this.k.f.N().t()) {
                    bbc2.l = false;
                    bbc2.j = bsc.a("options.difficulty", new Object[0]) + ": " + bsc.a("options.difficulty.hardcore", new Object[0]);
                }
                this.n.add(bbc2);
            }
            ++n2;
        }
        this.n.add(new bcc(this, 8675309, this.l / 2 + 5, this.m / 6 + 48 - 6, 150, 20, "Super Secret Settings..."));
        this.n.add(new bau(106, this.l / 2 - 155, this.m / 6 + 72 - 6, 150, 20, bsc.a("options.sounds", new Object[0])));
        this.n.add(new bau(107, this.l / 2 + 5, this.m / 6 + 72 - 6, 150, 20, bsc.a("options.stream", new Object[0])));
        this.n.add(new bau(101, this.l / 2 - 155, this.m / 6 + 96 - 6, 150, 20, bsc.a("options.video", new Object[0])));
        this.n.add(new bau(100, this.l / 2 + 5, this.m / 6 + 96 - 6, 150, 20, bsc.a("options.controls", new Object[0])));
        this.n.add(new bau(102, this.l / 2 - 155, this.m / 6 + 120 - 6, 150, 20, bsc.a("options.language", new Object[0])));
        this.n.add(new bau(103, this.l / 2 + 5, this.m / 6 + 120 - 6, 150, 20, bsc.a("options.multiplayer.title", new Object[0])));
        this.n.add(new bau(105, this.l / 2 - 155, this.m / 6 + 144 - 6, 150, 20, bsc.a("options.resourcepack", new Object[0])));
        this.n.add(new bau(104, this.l / 2 + 5, this.m / 6 + 144 - 6, 150, 20, bsc.a("options.snooper.view", new Object[0])));
        this.n.add(new bau(200, this.l / 2 - 100, this.m / 6 + 168, bsc.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k < 100 && bau2 instanceof bbc) {
            this.h.a(((bbc)bau2).c(), 1);
            bau2.j = this.h.c(baf.a(bau2.k));
        }
        if (bau2.k == 8675309) {
            this.k.p.c();
        }
        if (bau2.k == 101) {
            this.k.u.b();
            this.k.a(new bcv(this, this.h));
        }
        if (bau2.k == 100) {
            this.k.u.b();
            this.k.a(new bdm(this, this.h));
        }
        if (bau2.k == 102) {
            this.k.u.b();
            this.k.a(new bby(this, this.h, this.k.S()));
        }
        if (bau2.k == 103) {
            this.k.u.b();
            this.k.a(new bbi(this, this.h));
        }
        if (bau2.k == 104) {
            this.k.u.b();
            this.k.a(new bcp(this, this.h));
        }
        if (bau2.k == 200) {
            this.k.u.b();
            this.k.a(this.g);
        }
        if (bau2.k == 105) {
            this.k.u.b();
            this.k.a(new bgz(this));
        }
        if (bau2.k == 106) {
            this.k.u.b();
            this.k.a(new bcr(this, this.h));
        }
        if (bau2.k == 107) {
            this.k.u.b();
            buz buz2 = this.k.Z();
            if (buz2.l() && buz2.D()) {
                this.k.a(new bhi(this, this.h));
            } else {
                bhj.a(this);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.a, this.l / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

