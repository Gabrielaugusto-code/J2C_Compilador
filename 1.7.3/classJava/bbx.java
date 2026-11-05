/*
 * Decompiled with CFR 0.152.
 */
public class bbx
extends bbj {
    @Override
    public void r_() {
        super.r_();
        this.n.add(new bau(1, this.l / 2 - 100, this.m - 40, bsc.a("multiplayer.stopSleeping", new Object[0])));
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.g();
        } else if (n2 == 28 || n2 == 156) {
            String string = this.a.b().trim();
            if (!string.isEmpty()) {
                this.k.h.a(string);
            }
            this.a.a("");
            this.k.r.b().d();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 1) {
            this.g();
        } else {
            super.a(bau2);
        }
    }

    private void g() {
        bjw bjw2 = this.k.h.a;
        bjw2.a(new ja(this.k.h, 3));
    }
}

