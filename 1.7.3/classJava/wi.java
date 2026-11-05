/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class wi
extends wg
implements any {
    private boolean a = true;
    private int b = -1;

    public wi(afs afs2) {
        super(afs2);
    }

    public wi(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    public int m() {
        return 5;
    }

    @Override
    public ahz o() {
        return aie.bZ;
    }

    @Override
    public int s() {
        return 1;
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public boolean c(xq xq2) {
        if (!this.o.E) {
            xq2.a(this);
        }
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = !bl2;
        if (bl3 != this.v()) {
            this.f(bl3);
        }
    }

    public boolean v() {
        return this.a;
    }

    public void f(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public afs w() {
        return this.o;
    }

    @Override
    public double aC() {
        return this.s;
    }

    @Override
    public double aD() {
        return this.t;
    }

    @Override
    public double aE() {
        return this.u;
    }

    @Override
    public void h() {
        super.h();
        if (!this.o.E && this.Y() && this.v()) {
            --this.b;
            if (!this.aG()) {
                this.n(0);
                if (this.aF()) {
                    this.n(4);
                    this.e();
                }
            }
        }
    }

    public boolean aF() {
        if (anz.a(this)) {
            return true;
        }
        List list = this.o.a(wb.class, this.C.b(0.25, 0.0, 0.25), ra.a);
        if (list.size() > 0) {
            anz.a(this, (wb)list.get(0));
        }
        return false;
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        this.a(abs.a(aie.bZ), 1, 0.0f);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        dg2.a("TransferCooldown", this.b);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        this.b = dg2.f("TransferCooldown");
    }

    public void n(int n2) {
        this.b = n2;
    }

    public boolean aG() {
        return this.b > 0;
    }
}

