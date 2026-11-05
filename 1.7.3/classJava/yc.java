/*
 * Decompiled with CFR 0.152.
 */
public class yc
extends yb {
    public yc(afs afs2) {
        super(afs2);
    }

    public yc(afs afs2, rm rm2) {
        super(afs2, rm2);
    }

    public yc(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    protected void a(ayn ayn2) {
        int n2;
        if (ayn2.g != null) {
            ayn2.g.a(qf.a(this, (qr)this.j()), 0.0f);
        }
        if (!this.o.E && this.Z.nextInt(8) == 0) {
            n2 = 1;
            if (this.Z.nextInt(32) == 0) {
                n2 = 4;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                ux ux2 = new ux(this.o);
                ux2.c(-24000);
                ux2.b(this.s, this.t, this.u, this.y, 0.0f);
                this.o.d(ux2);
            }
        }
        for (n2 = 0; n2 < 8; ++n2) {
            this.o.a("snowballpoof", this.s, this.t, this.u, 0.0, 0.0, 0.0);
        }
        if (!this.o.E) {
            this.A();
        }
    }
}

