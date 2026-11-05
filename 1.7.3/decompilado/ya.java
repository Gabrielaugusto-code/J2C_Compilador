/*
 * Decompiled with CFR 0.152.
 */
public class ya
extends yb {
    public ya(afs afs2) {
        super(afs2);
    }

    public ya(afs afs2, rm rm2) {
        super(afs2, rm2);
    }

    public ya(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    protected void a(ayn ayn2) {
        int n2;
        if (ayn2.g != null) {
            n2 = 0;
            if (ayn2.g instanceof wo) {
                n2 = 3;
            }
            ayn2.g.a(qf.a(this, (qr)this.j()), (float)n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            this.o.a("snowballpoof", this.s, this.t, this.u, 0.0, 0.0, 0.0);
        }
        if (!this.o.E) {
            this.A();
        }
    }
}

