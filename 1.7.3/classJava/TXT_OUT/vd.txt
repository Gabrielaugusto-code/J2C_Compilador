/*
 * Decompiled with CFR 0.152.
 */
public class vd
extends uy {
    public vd(afs afs2) {
        super(afs2);
        this.a(0.9f, 1.3f);
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.z && this.d() >= 0) {
            if (abu2.b == 1) {
                xq2.bm.a(xq2.bm.c, new abu(abv.A));
                return true;
            }
            if (xq2.bm.a(new abu(abv.A)) && !xq2.bE.d) {
                xq2.bm.a(xq2.bm.c, 1);
                return true;
            }
        }
        if (abu2 != null && abu2.b() == abv.aZ && this.d() >= 0) {
            this.A();
            this.o.a("largeexplode", this.s, this.t + (double)(this.N / 2.0f), this.u, 0.0, 0.0, 0.0);
            if (!this.o.E) {
                uy uy2 = new uy(this.o);
                uy2.b(this.s, this.t, this.u, this.y, this.z);
                uy2.g(this.aR());
                uy2.aM = this.aM;
                this.o.d(uy2);
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.o.d(new wb(this.o, this.s, this.t + (double)this.N, this.u, new abu(aie.Q)));
                }
                abu2.a(1, (rm)xq2);
                this.a("mob.sheep.shear", 1.0f, 1.0f);
            }
            return true;
        }
        return super.a(xq2);
    }

    public vd c(qo qo2) {
        return new vd(this.o);
    }

    @Override
    public /* synthetic */ uy b(qo qo2) {
        return this.c(qo2);
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.c(qo2);
    }
}

