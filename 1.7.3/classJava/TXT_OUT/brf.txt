/*
 * Decompiled with CFR 0.152.
 */
public class brf
extends bqw {
    public double i;
    public double j;

    public brf(String string) {
        super(string);
    }

    @Override
    public void j() {
        azi azi2 = azi.B();
        if (azi2.f != null && azi2.h != null) {
            this.a(azi2.f, azi2.h.s, azi2.h.u, azi2.h.y, false, false);
        } else {
            this.a(null, 0.0, 0.0, 0.0, true, false);
        }
    }

    public void a(afs afs2, double d2, double d3, double d4, boolean bl2, boolean bl3) {
        if (this.a.isEmpty()) {
            return;
        }
        double d5 = 0.0;
        if (afs2 != null && !bl2) {
            r r2 = afs2.K();
            double d6 = (double)r2.a - d2;
            double d7 = (double)r2.c - d3;
            d5 = -(((d4 %= 360.0) - 90.0) * Math.PI / 180.0 - Math.atan2(d7, d6));
            if (!afs2.t.d()) {
                d5 = Math.random() * 3.1415927410125732 * 2.0;
            }
        }
        if (bl3) {
            this.i = d5;
        } else {
            double d8;
            for (d8 = d5 - this.i; d8 < -Math.PI; d8 += Math.PI * 2) {
            }
            while (d8 >= Math.PI) {
                d8 -= Math.PI * 2;
            }
            if (d8 < -1.0) {
                d8 = -1.0;
            }
            if (d8 > 1.0) {
                d8 = 1.0;
            }
            this.j += d8 * 0.1;
            this.j *= 0.8;
            this.i += this.j;
        }
        int n2 = (int)((this.i / (Math.PI * 2) + 1.0) * (double)this.a.size()) % this.a.size();
        while (n2 < 0) {
            n2 = (n2 + this.a.size()) % this.a.size();
        }
        if (n2 != this.g) {
            this.g = n2;
            brb.a((int[][])this.a.get(this.g), this.e, this.f, this.c, this.d, false, false);
        }
    }
}

