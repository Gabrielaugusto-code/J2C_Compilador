/*
 * Decompiled with CFR 0.152.
 */
public class bdm
extends bcl {
    private static final baf[] h = new baf[]{baf.a, baf.b, baf.B};
    private bcl i;
    protected String a = "Controls";
    private bac r;
    public azf f = null;
    public long g;
    private bdi s;
    private bau t;

    public bdm(bcl bcl2, bac bac2) {
        this.i = bcl2;
        this.r = bac2;
    }

    @Override
    public void r_() {
        this.s = new bdi(this, this.k);
        this.n.add(new bau(200, this.l / 2 - 155, this.m - 29, 150, 20, bsc.a("gui.done", new Object[0])));
        this.t = new bau(201, this.l / 2 - 155 + 160, this.m - 29, 150, 20, bsc.a("controls.resetAll", new Object[0]));
        this.n.add(this.t);
        this.a = bsc.a("controls.title", new Object[0]);
        int n2 = 0;
        for (baf baf2 : h) {
            if (baf2.a()) {
                this.n.add(new bbg(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), baf2));
            } else {
                this.n.add(new bbc(baf2.c(), this.l / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), baf2, this.r.c(baf2)));
            }
            ++n2;
        }
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 200) {
            this.k.a(this.i);
        } else if (bau2.k == 201) {
            for (azf azf2 : this.k.u.at) {
                azf2.b(azf2.h());
            }
            azf.b();
        } else if (bau2.k < 100 && bau2 instanceof bbc) {
            this.r.a(((bbc)bau2).c(), 1);
            bau2.j = this.r.c(baf.a(bau2.k));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        if (this.f != null) {
            this.r.a(this.f, -100 + n4);
            this.f = null;
            azf.b();
        } else if (n4 != 0 || !this.s.a(n2, n3, n4)) {
            super.a(n2, n3, n4);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        if (n4 != 0 || !this.s.b(n2, n3, n4)) {
            super.b(n2, n3, n4);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.f != null) {
            if (n2 == 1) {
                this.r.a(this.f, 0);
            } else {
                this.r.a(this.f, n2);
            }
            this.f = null;
            this.g = azi.K();
            azf.b();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.s.a(n2, n3, f2);
        this.a(this.q, this.a, this.l / 2, 8, 0xFFFFFF);
        boolean bl2 = true;
        for (azf azf2 : this.r.at) {
            if (azf2.i() == azf2.h()) continue;
            bl2 = false;
            break;
        }
        this.t.l = !bl2;
        super.a(n2, n3, f2);
    }
}

