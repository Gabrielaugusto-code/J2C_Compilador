/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class uw
extends qo
implements qp {
    private int bp;
    private int bq;
    private xq br;

    public uw(afs afs2) {
        super(afs2);
    }

    @Override
    protected void bo() {
        if (this.d() != 0) {
            this.bp = 0;
        }
        super.bo();
    }

    @Override
    public void e() {
        super.e();
        if (this.d() != 0) {
            this.bp = 0;
        }
        if (this.bp > 0) {
            --this.bp;
            String string = "heart";
            if (this.bp % 10 == 0) {
                double d2 = this.Z.nextGaussian() * 0.02;
                double d3 = this.Z.nextGaussian() * 0.02;
                double d4 = this.Z.nextGaussian() * 0.02;
                this.o.a(string, this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + 0.5 + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, d2, d3, d4);
            }
        } else {
            this.bq = 0;
        }
    }

    @Override
    protected void a(qr qr2, float f2) {
        if (qr2 instanceof xq) {
            xq xq2;
            if (f2 < 3.0f) {
                double d2 = qr2.s - this.s;
                double d3 = qr2.u - this.u;
                this.y = (float)(Math.atan2(d3, d2) * 180.0 / 3.1415927410125732) - 90.0f;
                this.bn = true;
            }
            if ((xq2 = (xq)qr2).bE() == null || !this.c(xq2.bE())) {
                this.bm = null;
            }
        } else if (qr2 instanceof uw) {
            uw uw2 = (uw)qr2;
            if (this.d() > 0 && uw2.d() < 0) {
                if ((double)f2 < 2.5) {
                    this.bn = true;
                }
            } else if (this.bp > 0 && uw2.bp > 0) {
                if (uw2.bm == null) {
                    uw2.bm = this;
                }
                if (uw2.bm == this && (double)f2 < 3.5) {
                    ++uw2.bp;
                    ++this.bp;
                    ++this.bq;
                    if (this.bq % 4 == 0) {
                        this.o.a("heart", this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + 0.5 + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, 0.0, 0.0, 0.0);
                    }
                    if (this.bq == 60) {
                        this.b((uw)qr2);
                    }
                } else {
                    this.bq = 0;
                }
            } else {
                this.bq = 0;
                this.bm = null;
            }
        }
    }

    private void b(uw uw2) {
        qo qo2 = this.a((qo)uw2);
        if (qo2 != null) {
            if (this.br == null && uw2.cd() != null) {
                this.br = uw2.cd();
            }
            if (this.br != null) {
                this.br.a(og.x);
                if (this instanceof uy) {
                    this.br.a(nt.H);
                }
            }
            this.c(6000);
            uw2.c(6000);
            this.bp = 0;
            this.bq = 0;
            this.bm = null;
            uw2.bm = null;
            uw2.bq = 0;
            uw2.bp = 0;
            qo2.c(-24000);
            qo2.b(this.s, this.t, this.u, this.y, this.z);
            for (int i2 = 0; i2 < 7; ++i2) {
                double d2 = this.Z.nextGaussian() * 0.02;
                double d3 = this.Z.nextGaussian() * 0.02;
                double d4 = this.Z.nextGaussian() * 0.02;
                this.o.a("heart", this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + 0.5 + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, d2, d3, d4);
            }
            this.o.d(qo2);
        }
    }

    @Override
    public boolean a(qf qf2, float f2) {
        rz rz2;
        if (this.av()) {
            return false;
        }
        this.bo = 60;
        if (!this.bj() && (rz2 = this.a(xa.d)).a(h) == null) {
            rz2.a(i);
        }
        this.bm = null;
        this.bp = 0;
        return super.a(qf2, f2);
    }

    @Override
    public float a(int n2, int n3, int n4) {
        if (this.o.a(n2, n3 - 1, n4) == aie.c) {
            return 10.0f;
        }
        return this.o.n(n2, n3, n4) - 0.5f;
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("InLove", this.bp);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.bp = dg2.f("InLove");
    }

    @Override
    protected qr bR() {
        block5: {
            float f2;
            block6: {
                block4: {
                    if (this.bo > 0) {
                        return null;
                    }
                    f2 = 8.0f;
                    if (this.bp <= 0) break block4;
                    List list = this.o.a(this.getClass(), this.C.b(f2, f2, f2));
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        uw uw2 = (uw)list.get(i2);
                        if (uw2 == this || uw2.bp <= 0) continue;
                        return uw2;
                    }
                    break block5;
                }
                if (this.d() != 0) break block6;
                List list = this.o.a(xq.class, this.C.b(f2, f2, f2));
                for (int i3 = 0; i3 < list.size(); ++i3) {
                    xq xq2 = (xq)list.get(i3);
                    if (xq2.bE() == null || !this.c(xq2.bE())) continue;
                    return xq2;
                }
                break block5;
            }
            if (this.d() <= 0) break block5;
            List list = this.o.a(this.getClass(), this.C.b(f2, f2, f2));
            for (int i4 = 0; i4 < list.size(); ++i4) {
                uw uw3 = (uw)list.get(i4);
                if (uw3 == this || uw3.d() >= 0) continue;
                return uw3;
            }
        }
        return null;
    }

    @Override
    public boolean by() {
        int n2;
        int n3;
        int n4 = oy.c(this.s);
        return this.o.a(n4, (n3 = oy.c(this.C.b)) - 1, n2 = oy.c(this.u)) == aie.c && this.o.j(n4, n3, n2) > 8 && super.by();
    }

    @Override
    public int q() {
        return 120;
    }

    @Override
    protected boolean v() {
        return false;
    }

    @Override
    protected int e(xq xq2) {
        return 1 + this.o.s.nextInt(3);
    }

    public boolean c(abu abu2) {
        return abu2.b() == abv.O;
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && this.c(abu2) && this.d() == 0 && this.bp <= 0) {
            if (!xq2.bE.d) {
                --abu2.b;
                if (abu2.b <= 0) {
                    xq2.bm.a(xq2.bm.c, null);
                }
            }
            this.f(xq2);
            return true;
        }
        return super.a(xq2);
    }

    public void f(xq xq2) {
        this.bp = 600;
        this.br = xq2;
        this.bm = null;
        this.o.a((qr)this, (byte)18);
    }

    public xq cd() {
        return this.br;
    }

    public boolean ce() {
        return this.bp > 0;
    }

    public void cf() {
        this.bp = 0;
    }

    public boolean a(uw uw2) {
        if (uw2 == this) {
            return false;
        }
        if (uw2.getClass() != this.getClass()) {
            return false;
        }
        return this.ce() && uw2.ce();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 18) {
            for (int i2 = 0; i2 < 7; ++i2) {
                double d2 = this.Z.nextGaussian() * 0.02;
                double d3 = this.Z.nextGaussian() * 0.02;
                double d4 = this.Z.nextGaussian() * 0.02;
                this.o.a("heart", this.s + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, this.t + 0.5 + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0f) - (double)this.M, d2, d3, d4);
            }
        } else {
            super.a(by2);
        }
    }
}

