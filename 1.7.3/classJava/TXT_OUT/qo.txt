/*
 * Decompiled with CFR 0.152.
 */
public abstract class qo
extends ru {
    private float bp = -1.0f;
    private float bq;

    public qo(afs afs2) {
        super(afs2);
    }

    public abstract qo a(qo var1);

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.bx) {
            qo qo2;
            Class clazz;
            if (!this.o.E && (clazz = qx.a(abu2.k())) != null && clazz.isAssignableFrom(this.getClass()) && (qo2 = this.a(this)) != null) {
                qo2.c(-24000);
                qo2.b(this.s, this.t, this.u, 0.0f, 0.0f);
                this.o.d(qo2);
                if (abu2.u()) {
                    qo2.a(abu2.s());
                }
                if (!xq2.bE.d) {
                    --abu2.b;
                    if (abu2.b <= 0) {
                        xq2.bm.a(xq2.bm.c, null);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(12, new Integer(0));
    }

    public int d() {
        return this.af.c(12);
    }

    public void a(int n2) {
        int n3 = this.d();
        if ((n3 += n2 * 20) > 0) {
            n3 = 0;
        }
        this.c(n3);
    }

    public void c(int n2) {
        this.af.b(12, n2);
        this.a(this.f());
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Age", this.d());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.c(dg2.f("Age"));
    }

    @Override
    public void e() {
        super.e();
        if (this.o.E) {
            this.a(this.f());
        } else {
            int n2 = this.d();
            if (n2 < 0) {
                this.c(++n2);
            } else if (n2 > 0) {
                this.c(--n2);
            }
        }
    }

    @Override
    public boolean f() {
        return this.d() < 0;
    }

    public void a(boolean bl2) {
        this.a(bl2 ? 0.5f : 1.0f);
    }

    @Override
    protected final void a(float f2, float f3) {
        boolean bl2 = this.bp > 0.0f;
        this.bp = f2;
        this.bq = f3;
        if (!bl2) {
            this.a(1.0f);
        }
    }

    protected final void a(float f2) {
        super.a(this.bp * f2, this.bq * f2);
    }
}

