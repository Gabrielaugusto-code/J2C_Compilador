/*
 * Decompiled with CFR 0.152.
 */
public class qg
extends qf {
    protected qr p;

    public qg(String string, qr qr2) {
        super(string);
        this.p = qr2;
    }

    @Override
    public qr j() {
        return this.p;
    }

    @Override
    public fa b(rm rm2) {
        abu abu2 = this.p instanceof rm ? ((rm)this.p).bd() : null;
        String string = "death.attack." + this.o;
        String string2 = string + ".item";
        if (abu2 != null && abu2.u() && dc.c(string2)) {
            return new fi(string2, rm2.c_(), this.p.c_(), abu2.E());
        }
        return new fi(string, rm2.c_(), this.p.c_());
    }

    @Override
    public boolean r() {
        return this.p != null && this.p instanceof rm && !(this.p instanceof xq);
    }
}

