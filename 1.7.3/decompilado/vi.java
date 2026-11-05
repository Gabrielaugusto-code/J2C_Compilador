/*
 * Decompiled with CFR 0.152.
 */
public class vi
extends vc
implements wz {
    public vi(afs afs2) {
        super(afs2);
        this.a(0.4f, 1.8f);
        this.m().a(true);
        this.c.a(1, new tu(this, 1.25, 20, 10.0f));
        this.c.a(2, new tt(this, 1.0));
        this.c.a(3, new te(this, xq.class, 6.0f));
        this.c.a(4, new ts(this));
        this.d.a(1, new uf(this, rn.class, 0, true, false, ws.a));
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(4.0);
        this.a(xa.d).a(0.2f);
    }

    @Override
    public void e() {
        super.e();
        int n2 = oy.c(this.s);
        int n3 = oy.c(this.t);
        int n4 = oy.c(this.u);
        if (this.K()) {
            this.a(qf.e, 1.0f);
        }
        if (this.o.a(n2, n4).a(n2, n3, n4) > 1.0f) {
            this.a(qf.b, 1.0f);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            n2 = oy.c(this.s + (double)((float)(i2 % 2 * 2 - 1) * 0.25f));
            if (this.o.a(n2, n3 = oy.c(this.t), n4 = oy.c(this.u + (double)((float)(i2 / 2 % 2 * 2 - 1) * 0.25f))).o() != avk.a || !(this.o.a(n2, n4).a(n2, n3, n4) < 0.8f) || !aie.aC.c(this.o, n2, n3, n4)) continue;
            this.o.b(n2, n3, n4, aie.aC);
        }
    }

    @Override
    protected abs u() {
        return abv.ay;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3 = this.Z.nextInt(16);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a(abv.ay, 1);
        }
    }

    @Override
    public void a(rm rm2, float f2) {
        ya ya2 = new ya(this.o, this);
        double d2 = rm2.s - this.s;
        double d3 = rm2.t + (double)rm2.g() - (double)1.1f - ya2.t;
        double d4 = rm2.u - this.u;
        float f3 = oy.a(d2 * d2 + d4 * d4) * 0.2f;
        ya2.c(d2, d3 + (double)f3, d4, 1.6f, 12.0f);
        this.a("random.bow", 1.0f, 1.0f / (this.aH().nextFloat() * 0.4f + 0.8f));
        this.o.d(ya2);
    }
}

