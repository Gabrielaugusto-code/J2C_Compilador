/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class qe {
    private final List a = new ArrayList();
    private final rm b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;

    public qe(rm rm2) {
        this.b = rm2;
    }

    public void a() {
        this.j();
        if (this.b.h_()) {
            ahz ahz2 = this.b.o.a(oy.c(this.b.s), oy.c(this.b.C.b), oy.c(this.b.u));
            if (ahz2 == aie.ap) {
                this.h = "ladder";
            } else if (ahz2 == aie.bd) {
                this.h = "vines";
            }
        } else if (this.b.L()) {
            this.h = "water";
        }
    }

    public void a(qf qf2, float f2, float f3) {
        this.g();
        this.a();
        qd qd2 = new qd(qf2, this.b.aa, f2, f3, this.h, this.b.R);
        this.a.add(qd2);
        this.c = this.b.aa;
        this.g = true;
        if (qd2.f() && !this.f && this.b.Y()) {
            this.f = true;
            this.e = this.d = this.b.aa;
            this.b.bt();
        }
    }

    public fa b() {
        fa fa2;
        if (this.a.size() == 0) {
            return new fi("death.attack.generic", this.b.c_());
        }
        qd qd2 = this.i();
        qd qd3 = (qd)this.a.get(this.a.size() - 1);
        fa fa3 = qd3.h();
        qr qr2 = qd3.a().j();
        if (qd2 != null && qd3.a() == qf.h) {
            fa fa4 = qd2.h();
            if (qd2.a() == qf.h || qd2.a() == qf.i) {
                fa2 = new fi("death.fell.accident." + this.a(qd2), this.b.c_());
            } else if (!(fa4 == null || fa3 != null && fa4.equals(fa3))) {
                abu abu2;
                qr qr3 = qd2.a().j();
                abu abu3 = abu2 = qr3 instanceof rm ? ((rm)qr3).bd() : null;
                fa2 = abu2 != null && abu2.u() ? new fi("death.fell.assist.item", this.b.c_(), fa4, abu2.E()) : new fi("death.fell.assist", this.b.c_(), fa4);
            } else if (fa3 != null) {
                abu abu4;
                abu abu5 = abu4 = qr2 instanceof rm ? ((rm)qr2).bd() : null;
                fa2 = abu4 != null && abu4.u() ? new fi("death.fell.finish.item", this.b.c_(), fa3, abu4.E()) : new fi("death.fell.finish", this.b.c_(), fa3);
            } else {
                fa2 = new fi("death.fell.killer", this.b.c_());
            }
        } else {
            fa2 = qd3.a().b(this.b);
        }
        return fa2;
    }

    public rm c() {
        rm rm2 = null;
        xq xq2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (qd qd2 : this.a) {
            if (qd2.a().j() instanceof xq && (xq2 == null || qd2.c() > f3)) {
                f3 = qd2.c();
                xq2 = (xq)qd2.a().j();
            }
            if (!(qd2.a().j() instanceof rm) || rm2 != null && !(qd2.c() > f2)) continue;
            f2 = qd2.c();
            rm2 = (rm)qd2.a().j();
        }
        if (xq2 != null && f3 >= f2 / 3.0f) {
            return xq2;
        }
        return rm2;
    }

    private qd i() {
        qd qd2 = null;
        qd qd3 = null;
        int n2 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            qd qd4;
            qd qd5 = (qd)this.a.get(i2);
            qd qd6 = qd4 = i2 > 0 ? (qd)this.a.get(i2 - 1) : null;
            if ((qd5.a() == qf.h || qd5.a() == qf.i) && qd5.i() > 0.0f && (qd2 == null || qd5.i() > f2)) {
                qd2 = i2 > 0 ? qd4 : qd5;
                f2 = qd5.i();
            }
            if (qd5.g() == null || qd3 != null && !(qd5.c() > (float)n2)) continue;
            qd3 = qd5;
        }
        if (f2 > 5.0f && qd2 != null) {
            return qd2;
        }
        if (n2 > 5 && qd3 != null) {
            return qd3;
        }
        return null;
    }

    private String a(qd qd2) {
        return qd2.g() == null ? "generic" : qd2.g();
    }

    private void j() {
        this.h = null;
    }

    public void g() {
        int n2;
        int n3 = n2 = this.f ? 300 : 100;
        if (this.g && (!this.b.Y() || this.b.aa - this.c > n2)) {
            boolean bl2 = this.f;
            this.g = false;
            this.f = false;
            this.e = this.b.aa;
            if (bl2) {
                this.b.bu();
            }
            this.a.clear();
        }
    }
}

