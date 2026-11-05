/*
 * Decompiled with CFR 0.152.
 */
public class qh
extends qg {
    private qr q;

    public qh(String string, qr qr2, qr qr3) {
        super(string, qr2);
        this.q = qr3;
    }

    @Override
    public qr i() {
        return this.p;
    }

    @Override
    public qr j() {
        return this.q;
    }

    @Override
    public fa b(rm rm2) {
        fa fa2 = this.q == null ? this.p.c_() : this.q.c_();
        abu abu2 = this.q instanceof rm ? ((rm)this.q).bd() : null;
        String string = "death.attack." + this.o;
        String string2 = string + ".item";
        if (abu2 != null && abu2.u() && dc.c(string2)) {
            return new fi(string2, rm2.c_(), fa2, abu2.E());
        }
        return new fi(string, rm2.c_(), fa2);
    }
}

