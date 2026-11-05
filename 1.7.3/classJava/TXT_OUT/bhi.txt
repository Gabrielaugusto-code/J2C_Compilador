/*
 * Decompiled with CFR 0.152.
 */
public class bhi
extends bcl {
    private static final baf[] a = new baf[]{baf.J, baf.N, baf.M, baf.P, baf.K, baf.L, baf.S, baf.O};
    private static final baf[] f = new baf[]{baf.Q, baf.R};
    private final bcl g;
    private final bac h;
    private String i;
    private String r;
    private int s;
    private boolean t = false;

    public bhi(bcl bcl2, bac bac2) {
        this.g = bcl2;
        this.h = bac2;
    }

    @Override
    public void r_() {
        int n2 = 0;
        this.i = bsc.a("options.stream.title", new Object[0]);
        this.r = bsc.a("options.stream.chat.title", new Object[0]);
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
        this.s = this.m / 6 + 24 * (n2 >> 1) + 6;
        n2 += 2;
        for (baf baf2 : f) {
            if (baf2.a()) {
                this.n.add(new bbg(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 + 24 * (n2 >> 1), baf2));
            } else {
                this.n.add(new bbc(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 + 24 * (n2 >> 1), baf2, this.h.c(baf2)));
            }
            ++n2;
        }
        this.n.add(new bau(200, this.l / 2 - 155, this.m / 6 + 168, 150, 20, bsc.a("gui.done", new Object[0])));
        bau bau2 = new bau(201, this.l / 2 + 5, this.m / 6 + 168, 150, 20, bsc.a("options.stream.ingestSelection", new Object[0]));
        bau2.l = this.k.Z().m() && this.k.Z().v().length > 0 || this.k.Z().z();
        this.n.add(bau2);
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k < 100 && bau2 instanceof bbc) {
            baf baf2 = ((bbc)bau2).c();
            this.h.a(baf2, 1);
            bau2.j = this.h.c(baf.a(bau2.k));
            if (this.k.Z().n() && baf2 != baf.Q && baf2 != baf.R) {
                this.t = true;
            }
        } else if (bau2 instanceof bbg) {
            if (bau2.k == baf.K.c()) {
                this.k.Z().s();
            } else if (bau2.k == baf.L.c()) {
                this.k.Z().s();
            } else if (this.k.Z().n()) {
                this.t = true;
            }
        }
        if (bau2.k == 200) {
            this.k.u.b();
            this.k.a(this.g);
        } else if (bau2.k == 201) {
            this.k.u.b();
            this.k.a(new bhg(this));
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.i, this.l / 2, 20, 0xFFFFFF);
        this.a(this.q, this.r, this.l / 2, this.s, 0xFFFFFF);
        if (this.t) {
            this.a(this.q, (Object)((Object)a.m) + bsc.a("options.stream.changes", new Object[0]), this.l / 2, 20 + this.q.a, 0xFFFFFF);
        }
        super.a(n2, n3, f2);
    }
}

