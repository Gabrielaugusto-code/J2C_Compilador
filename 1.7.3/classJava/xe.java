/*
 * Decompiled with CFR 0.152.
 */
public class xe
extends wx {
    public xe(afs afs2) {
        super(afs2);
        this.a(1.4f, 0.9f);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, new Byte(0));
    }

    @Override
    public void h() {
        super.h();
        if (!this.o.E) {
            this.a(this.E);
        }
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(16.0);
        this.a(xa.d).a(0.8f);
    }

    @Override
    protected qr bR() {
        float f2 = this.d(1.0f);
        if (f2 < 0.5f) {
            double d2 = 16.0;
            return this.o.b((qr)this, d2);
        }
        return null;
    }

    @Override
    protected String t() {
        return "mob.spider.say";
    }

    @Override
    protected String aS() {
        return "mob.spider.say";
    }

    @Override
    protected String aT() {
        return "mob.spider.death";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.spider.step", 0.15f, 1.0f);
    }

    @Override
    protected void a(qr qr2, float f2) {
        float f3 = this.d(1.0f);
        if (f3 > 0.5f && this.Z.nextInt(100) == 0) {
            this.bm = null;
            return;
        }
        if (f2 > 2.0f && f2 < 6.0f && this.Z.nextInt(10) == 0) {
            if (this.D) {
                double d2 = qr2.s - this.s;
                double d3 = qr2.u - this.u;
                float f4 = oy.a(d2 * d2 + d3 * d3);
                this.v = d2 / (double)f4 * 0.5 * (double)0.8f + this.v * (double)0.2f;
                this.x = d3 / (double)f4 * 0.5 * (double)0.8f + this.x * (double)0.2f;
                this.w = 0.4f;
            }
        } else {
            super.a(qr2, f2);
        }
    }

    @Override
    protected abs u() {
        return abv.F;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        super.b(bl2, n2);
        if (bl2 && (this.Z.nextInt(3) == 0 || this.Z.nextInt(1 + n2) > 0)) {
            this.a(abv.bp, 1);
        }
    }

    @Override
    public boolean h_() {
        return this.bZ();
    }

    @Override
    public void ar() {
    }

    @Override
    public rq bc() {
        return rq.c;
    }

    @Override
    public boolean d(qn qn2) {
        if (qn2.a() == qm.u.H) {
            return false;
        }
        return super.d(qn2);
    }

    public boolean bZ() {
        return (this.af.a(16) & 1) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = this.af.a(16);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.af.b(16, by2);
    }

    @Override
    public rp a(rp rp2) {
        int n2;
        rp2 = super.a(rp2);
        if (this.o.s.nextInt(100) == 0) {
            xc xc2 = new xc(this.o);
            xc2.b(this.s, this.t, this.u, this.y, 0.0f);
            xc2.a((rp)null);
            this.o.d(xc2);
            xc2.a((qr)this);
        }
        if (rp2 == null) {
            rp2 = new xf();
            if (this.o.r == pu.d && this.o.s.nextFloat() < 0.1f * this.o.b(this.s, this.t, this.u)) {
                ((xf)rp2).a(this.o.s);
            }
        }
        if (rp2 instanceof xf && (n2 = ((xf)rp2).a) > 0 && qm.a[n2] != null) {
            this.c(new qn(n2, Integer.MAX_VALUE));
        }
        return rp2;
    }
}

