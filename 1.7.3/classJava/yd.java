/*
 * Decompiled with CFR 0.152.
 */
public class yd
extends yb {
    public yd(afs afs2) {
        super(afs2);
    }

    public yd(afs afs2, rm rm2) {
        super(afs2, rm2);
    }

    public yd(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    protected void a(ayn ayn2) {
        if (ayn2.g != null) {
            ayn2.g.a(qf.a(this, (qr)this.j()), 0.0f);
        }
        for (int i2 = 0; i2 < 32; ++i2) {
            this.o.a("portal", this.s, this.t + this.Z.nextDouble() * 2.0, this.u, this.Z.nextGaussian(), 0.0, this.Z.nextGaussian());
        }
        if (!this.o.E) {
            if (this.j() != null && this.j() instanceof mp) {
                mp mp2 = (mp)this.j();
                if (mp2.a.b().d() && mp2.o == this.o) {
                    if (this.j().al()) {
                        this.j().a((qr)null);
                    }
                    this.j().a(this.s, this.t, this.u);
                    this.j().R = 0.0f;
                    this.j().a(qf.h, 5.0f);
                }
            }
            this.A();
        }
    }
}

