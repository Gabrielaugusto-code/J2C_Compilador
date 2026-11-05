/*
 * Decompiled with CFR 0.152.
 */
public class bbi
extends bcl {
    private static final baf[] a = new baf[]{baf.r, baf.s, baf.t, baf.u, baf.v, baf.C, baf.E, baf.F, baf.D};
    private static final baf[] f = new baf[]{baf.A};
    private final bcl g;
    private final bac h;
    private String i;
    private String r;
    private int s;

    public bbi(bcl bcl2, bac bac2) {
        this.g = bcl2;
        this.h = bac2;
    }

    @Override
    public void r_() {
        int n2 = 0;
        this.i = bsc.a("options.chat.title", new Object[0]);
        this.r = bsc.a("options.multiplayer.title", new Object[0]);
        for (baf baf2 : a) {
            if (baf2.a()) {
                this.n.add(new bbg(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 + 24 * (n2 >> 1), baf2));
            } else {
                this.n.add(new bbc(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 + 24 * (n2 >> 1), baf2, this.h.c(baf2)));
            }
            ++n2;
        }
        if (n2 % 2 == 1) {
            ++n2;
        }
        this.s = this.m / 6 + 24 * (n2 >> 1);
        n2 += 2;
        for (baf baf2 : f) {
            if (baf2.a()) {
                this.n.add(new bbg(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 + 24 * (n2 >> 1), baf2));
            } else {
                this.n.add(new bbc(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 + 24 * (n2 >> 1), baf2, this.h.c(baf2)));
            }
            ++n2;
        }
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
        if (bau2.k == 200) {
            this.k.u.b();
            this.k.a(this.g);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.i, this.l / 2, 20, 0xFFFFFF);
        this.a(this.q, this.r, this.l / 2, this.s + 7, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

