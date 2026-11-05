/*
 * Decompiled with CFR 0.152.
 */
class yn
extends zp {
    final /* synthetic */ afs a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ yl e;

    yn(yl yl2, ps ps2, int n2, int n3, int n4, afs afs2, int n5, int n6, int n7) {
        this.e = yl2;
        this.a = afs2;
        this.b = n5;
        this.c = n6;
        this.d = n7;
        super(ps2, n2, n3, n4);
    }

    @Override
    public boolean a(abu abu2) {
        return false;
    }

    @Override
    public boolean a(xq xq2) {
        return (xq2.bE.d || xq2.bF >= this.e.a) && this.e.a > 0 && this.e();
    }

    @Override
    public void a(xq xq2, abu abu2) {
        if (!xq2.bE.d) {
            xq2.a(-this.e.a);
        }
        yl.a(this.e).a(0, null);
        if (yl.b(this.e) > 0) {
            abu abu3 = yl.a(this.e).a(1);
            if (abu3 != null && abu3.b > yl.b(this.e)) {
                abu3.b -= yl.b(this.e);
                yl.a(this.e).a(1, abu3);
            } else {
                yl.a(this.e).a(1, null);
            }
        } else {
            yl.a(this.e).a(1, null);
        }
        this.e.a = 0;
        if (!xq2.bE.d && !this.a.E && this.a.a(this.b, this.c, this.d) == aie.bQ && xq2.aH().nextFloat() < 0.12f) {
            int n2 = this.a.e(this.b, this.c, this.d);
            int n3 = n2 & 3;
            int n4 = n2 >> 2;
            if (++n4 > 2) {
                this.a.f(this.b, this.c, this.d);
                this.a.c(1020, this.b, this.c, this.d, 0);
            } else {
                this.a.a(this.b, this.c, this.d, n3 | n4 << 2, 2);
                this.a.c(1021, this.b, this.c, this.d, 0);
            }
        } else if (!this.a.E) {
            this.a.c(1021, this.b, this.c, this.d, 0);
        }
    }
}

