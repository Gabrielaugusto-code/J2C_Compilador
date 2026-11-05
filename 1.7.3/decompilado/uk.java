/*
 * Decompiled with CFR 0.152.
 */
public class uk
extends ul {
    rx a;
    rm b;
    private int e;

    public uk(rx rx2) {
        super(rx2, false);
        this.a = rx2;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (!this.a.bZ()) {
            return false;
        }
        rm rm2 = this.a.cb();
        if (rm2 == null) {
            return false;
        }
        this.b = rm2.aK();
        int n2 = rm2.aL();
        return n2 != this.e && this.a(this.b, false) && this.a.a(this.b, rm2);
    }

    @Override
    public void c() {
        this.c.d(this.b);
        rm rm2 = this.a.cb();
        if (rm2 != null) {
            this.e = rm2.aL();
        }
        super.c();
    }
}

