/*
 * Decompiled with CFR 0.152.
 */
public abstract class vl
extends ru
implements qp {
    public vl(afs afs2) {
        super(afs2);
    }

    @Override
    public boolean aD() {
        return true;
    }

    @Override
    public boolean by() {
        return this.o.b(this.C);
    }

    @Override
    public int q() {
        return 120;
    }

    @Override
    protected boolean v() {
        return true;
    }

    @Override
    protected int e(xq xq2) {
        return 1 + this.o.s.nextInt(3);
    }

    @Override
    public void B() {
        int n2 = this.aq();
        super.B();
        if (this.Y() && !this.L()) {
            this.h(--n2);
            if (this.aq() == -20) {
                this.h(0);
                this.a(qf.e, 2.0f);
            }
        } else {
            this.h(300);
        }
    }
}

