/*
 * Decompiled with CFR 0.152.
 */
public abstract class wx
extends ru
implements ws {
    public wx(afs afs2) {
        super(afs2);
        this.b = 5;
    }

    @Override
    public void e() {
        this.ba();
        float f2 = this.d(1.0f);
        if (f2 > 0.5f) {
            this.aU += 2;
        }
        super.e();
    }

    @Override
    public void h() {
        super.h();
        if (!this.o.E && this.o.r == pu.a) {
            this.A();
        }
    }

    @Override
    protected String G() {
        return "game.hostile.swim";
    }

    @Override
    protected String N() {
        return "game.hostile.swim.splash";
    }

    @Override
    protected qr bR() {
        xq xq2 = this.o.b((qr)this, 16.0);
        if (xq2 != null && this.p(xq2)) {
            return xq2;
        }
        return null;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        if (super.a(qf2, f2)) {
            qr qr2 = qf2.j();
            if (this.l == qr2 || this.m == qr2) {
                return true;
            }
            if (qr2 != this) {
                this.bm = qr2;
            }
            return true;
        }
        return false;
    }

    @Override
    protected String aS() {
        return "game.hostile.hurt";
    }

    @Override
    protected String aT() {
        return "game.hostile.die";
    }

    @Override
    protected String o(int n2) {
        if (n2 > 4) {
            return "game.hostile.hurt.fall.big";
        }
        return "game.hostile.hurt.fall.small";
    }

    @Override
    public boolean n(qr qr2) {
        boolean bl2;
        float f2 = (float)this.a(xa.e).e();
        int n2 = 0;
        if (qr2 instanceof rm) {
            f2 += aem.a((rm)this, (rm)qr2);
            n2 += aem.b((rm)this, (rm)qr2);
        }
        if (bl2 = qr2.a(qf.a(this), f2)) {
            int n3;
            if (n2 > 0) {
                qr2.g(-oy.a(this.y * (float)Math.PI / 180.0f) * (float)n2 * 0.5f, 0.1, oy.b(this.y * (float)Math.PI / 180.0f) * (float)n2 * 0.5f);
                this.v *= 0.6;
                this.x *= 0.6;
            }
            if ((n3 = aem.a(this)) > 0) {
                qr2.e(n3 * 4);
            }
            if (qr2 instanceof rm) {
                aem.a((rm)qr2, (qr)this);
            }
            aem.b((rm)this, qr2);
        }
        return bl2;
    }

    @Override
    protected void a(qr qr2, float f2) {
        if (this.aB <= 0 && f2 < 2.0f && qr2.C.e > this.C.b && qr2.C.b < this.C.e) {
            this.aB = 20;
            this.n(qr2);
        }
    }

    @Override
    public float a(int n2, int n3, int n4) {
        return 0.5f - this.o.n(n2, n3, n4);
    }

    protected boolean j_() {
        int n2;
        int n3;
        int n4 = oy.c(this.s);
        if (this.o.b(age.a, n4, n3 = oy.c(this.C.b), n2 = oy.c(this.u)) > this.Z.nextInt(32)) {
            return false;
        }
        int n5 = this.o.k(n4, n3, n2);
        if (this.o.P()) {
            int n6 = this.o.j;
            this.o.j = 10;
            n5 = this.o.k(n4, n3, n2);
            this.o.j = n6;
        }
        return n5 <= this.Z.nextInt(8);
    }

    @Override
    public boolean by() {
        return this.o.r != pu.a && this.j_() && super.by();
    }

    @Override
    protected void aC() {
        super.aC();
        this.bb().b(xa.e);
    }

    @Override
    protected boolean aF() {
        return true;
    }
}

