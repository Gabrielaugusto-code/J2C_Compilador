/*
 * Decompiled with CFR 0.152.
 */
public class wj
extends wc {
    public wj(afs afs2) {
        super(afs2);
    }

    public wj(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    public boolean c(xq xq2) {
        if (this.l != null && this.l instanceof xq && this.l != xq2) {
            return true;
        }
        if (this.l != null && this.l != xq2) {
            return false;
        }
        if (!this.o.E) {
            xq2.a(this);
        }
        return true;
    }

    @Override
    public int m() {
        return 0;
    }
}

