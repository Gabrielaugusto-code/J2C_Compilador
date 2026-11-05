/*
 * Decompiled with CFR 0.152.
 */
public class wp
extends xe {
    public wp(afs afs2) {
        super(afs2);
        this.a(0.7f, 0.5f);
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(12.0);
    }

    @Override
    public boolean n(qr qr2) {
        if (super.n(qr2)) {
            if (qr2 instanceof rm) {
                int n2 = 0;
                if (this.o.r == pu.c) {
                    n2 = 7;
                } else if (this.o.r == pu.d) {
                    n2 = 15;
                }
                if (n2 > 0) {
                    ((rm)qr2).c(new qn(qm.u.H, n2 * 20, 0));
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public rp a(rp rp2) {
        return rp2;
    }
}

