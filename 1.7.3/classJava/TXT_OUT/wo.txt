/*
 * Decompiled with CFR 0.152.
 */
public class wo
extends wx {
    private float bp = 0.5f;
    private int bq;
    private int br;

    public wo(afs afs2) {
        super(afs2);
        this.ae = true;
        this.b = 10;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.e).a(6.0);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, new Byte(0));
    }

    @Override
    protected String t() {
        return "mob.blaze.breathe";
    }

    @Override
    protected String aS() {
        return "mob.blaze.hit";
    }

    @Override
    protected String aT() {
        return "mob.blaze.death";
    }

    @Override
    public int c(float f2) {
        return 0xF000F0;
    }

    @Override
    public float d(float f2) {
        return 1.0f;
    }

    @Override
    public void e() {
        if (!this.o.E) {
            if (this.K()) {
                this.a(qf.e, 1.0f);
            }
            --this.bq;
            if (this.bq <= 0) {
                this.bq = 100;
                this.bp = 0.5f + (float)this.Z.nextGaussian() * 3.0f;
            }
            if (this.bT() != null && this.bT().t + (double)this.bT().g() > this.t + (double)this.g() + (double)this.bp) {
                this.w += ((double)0.3f - this.w) * (double)0.3f;
            }
        }
        if (this.Z.nextInt(24) == 0) {
            this.o.a(this.s + 0.5, this.t + 0.5, this.u + 0.5, "fire.fire", 1.0f + this.Z.nextFloat(), this.Z.nextFloat() * 0.7f + 0.3f);
        }
        if (!this.D && this.w < 0.0) {
            this.w *= 0.6;
        }
        for (int i2 = 0; i2 < 2; ++i2) {
            this.o.a("largesmoke", this.s + (this.Z.nextDouble() - 0.5) * (double)this.M, this.t + this.Z.nextDouble() * (double)this.N, this.u + (this.Z.nextDouble() - 0.5) * (double)this.M, 0.0, 0.0, 0.0);
        }
        super.e();
    }

    @Override
    protected void a(qr qr2, float f2) {
        if (this.aB <= 0 && f2 < 2.0f && qr2.C.e > this.C.b && qr2.C.b < this.C.e) {
            this.aB = 20;
            this.n(qr2);
        } else if (f2 < 30.0f) {
            double d2 = qr2.s - this.s;
            double d3 = qr2.C.b + (double)(qr2.N / 2.0f) - (this.t + (double)(this.N / 2.0f));
            double d4 = qr2.u - this.u;
            if (this.aB == 0) {
                ++this.br;
                if (this.br == 1) {
                    this.aB = 60;
                    this.a(true);
                } else if (this.br <= 4) {
                    this.aB = 6;
                } else {
                    this.aB = 100;
                    this.br = 0;
                    this.a(false);
                }
                if (this.br > 1) {
                    float f3 = oy.c(f2) * 0.5f;
                    this.o.a(null, 1009, (int)this.s, (int)this.t, (int)this.u, 0);
                    for (int i2 = 0; i2 < 1; ++i2) {
                        xz xz2 = new xz(this.o, this, d2 + this.Z.nextGaussian() * (double)f3, d3, d4 + this.Z.nextGaussian() * (double)f3);
                        xz2.t = this.t + (double)(this.N / 2.0f) + 0.5;
                        this.o.d(xz2);
                    }
                }
            }
            this.y = (float)(Math.atan2(d4, d2) * 180.0 / 3.1415927410125732) - 90.0f;
            this.bn = true;
        }
    }

    @Override
    protected void b(float f2) {
    }

    @Override
    protected abs u() {
        return abv.bj;
    }

    @Override
    public boolean ak() {
        return this.bZ();
    }

    @Override
    protected void b(boolean bl2, int n2) {
        if (bl2) {
            int n3 = this.Z.nextInt(2 + n2);
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(abv.bj, 1);
            }
        }
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
    protected boolean j_() {
        return true;
    }
}

