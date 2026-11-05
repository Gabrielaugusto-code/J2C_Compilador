/*
 * Decompiled with CFR 0.152.
 */
public abstract class rx
extends uw
implements rr {
    protected ty bp = new ty(this);

    public rx(afs afs2) {
        super(afs2);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)0);
        this.af.a(17, "");
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        if (this.b() == null) {
            dg2.a("Owner", "");
        } else {
            dg2.a("Owner", this.b());
        }
        dg2.a("Sitting", this.ca());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        String string = dg2.j("Owner");
        if (string.length() > 0) {
            this.b(string);
            this.j(true);
        }
        this.bp.a(dg2.n("Sitting"));
        this.k(dg2.n("Sitting"));
    }

    protected void i(boolean bl2) {
        String string = "heart";
        if (!bl2) {
            string = "smoke";
        }
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.Z.nextGaussian() * 0.02;
            double d3 = this.Z.nextGaussian() * 0.02;
            double d4 = this.Z.nextGaussian() * 0.02;
            this.o.a(string, this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + 0.5 + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, d2, d3, d4);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.i(true);
        } else if (by2 == 6) {
            this.i(false);
        } else {
            super.a(by2);
        }
    }

    public boolean bZ() {
        return (this.af.a(16) & 4) != 0;
    }

    public void j(boolean bl2) {
        byte by2 = this.af.a(16);
        if (bl2) {
            this.af.b(16, (byte)(by2 | 4));
        } else {
            this.af.b(16, (byte)(by2 & 0xFFFFFFFB));
        }
    }

    public boolean ca() {
        return (this.af.a(16) & 1) != 0;
    }

    public void k(boolean bl2) {
        byte by2 = this.af.a(16);
        if (bl2) {
            this.af.b(16, (byte)(by2 | 1));
        } else {
            this.af.b(16, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public String b() {
        return this.af.e(17);
    }

    public void b(String string) {
        this.af.b(17, string);
    }

    public rm cb() {
        return this.o.a(this.b());
    }

    public ty cc() {
        return this.bp;
    }

    public boolean a(rm rm2, rm rm3) {
        return true;
    }

    @Override
    public ayy bs() {
        rm rm2;
        if (this.bZ() && (rm2 = this.cb()) != null) {
            return rm2.bs();
        }
        return super.bs();
    }

    @Override
    public boolean c(rm rm2) {
        if (this.bZ()) {
            rm rm3 = this.cb();
            if (rm2 == rm3) {
                return true;
            }
            if (rm3 != null) {
                return rm3.c(rm2);
            }
        }
        return super.c(rm2);
    }

    @Override
    public /* synthetic */ qr i_() {
        return this.cb();
    }
}

