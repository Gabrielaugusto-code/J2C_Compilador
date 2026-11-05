/*
 * Decompiled with CFR 0.152.
 */
public class bcv
extends bcl {
    private bcl f;
    protected String a = "Video Settings";
    private bac g;
    private bba h;
    private static final baf[] i = new baf[]{baf.m, baf.f, baf.n, baf.j, baf.h, baf.g, baf.o, baf.i, baf.d, baf.p, baf.q, baf.w, baf.y, baf.z, baf.G, baf.H};

    public bcv(bcl bcl2, bac bac2) {
        this.f = bcl2;
        this.g = bac2;
    }

    @Override
    public void r_() {
        this.a = bsc.a("options.videoTitle", new Object[0]);
        this.n.clear();
        this.n.add(new bau(200, this.l / 2 - 100, this.m - 27, bsc.a("gui.done", new Object[0])));
        if (bwg.d) {
            this.h = new bbd(this.k, this.l, this.m, 32, this.m - 32, 25, i);
        } else {
            baf[] bafArray = new baf[i.length - 1];
            int n2 = 0;
            for (baf baf2 : i) {
                if (baf2 == baf.i) continue;
                bafArray[n2] = baf2;
                ++n2;
            }
            this.h = new bbd(this.k, this.l, this.m, 32, this.m - 32, 25, bafArray);
        }
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 200) {
            this.k.u.b();
            this.k.a(this.f);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        int n5 = this.g.aJ;
        super.a(n2, n3, n4);
        this.h.a(n2, n3, n4);
        if (this.g.aJ != n5) {
            bat bat2 = new bat(this.k, this.k.d, this.k.e);
            int n6 = bat2.a();
            int n7 = bat2.b();
            this.a(this.k, n6, n7);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        int n5 = this.g.aJ;
        super.b(n2, n3, n4);
        this.h.b(n2, n3, n4);
        if (this.g.aJ != n5) {
            bat bat2 = new bat(this.k, this.k.d, this.k.e);
            int n6 = bat2.a();
            int n7 = bat2.b();
            this.a(this.k, n6, n7);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.h.a(n2, n3, f2);
        this.a(this.q, this.a, this.l / 2, 5, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

