/*
 * Decompiled with CFR 0.152.
 */
public class bre
extends bqw {
    private double i;
    private double j;

    public bre(String string) {
        super(string);
    }

    @Override
    public void j() {
        double d2;
        if (this.a.isEmpty()) {
            return;
        }
        azi azi2 = azi.B();
        double d3 = 0.0;
        if (azi2.f != null && azi2.h != null) {
            float f2 = azi2.f.c(1.0f);
            d3 = f2;
            if (!azi2.f.t.d()) {
                d3 = Math.random();
            }
        }
        for (d2 = d3 - this.i; d2 < -0.5; d2 += 1.0) {
        }
        while (d2 >= 0.5) {
            d2 -= 1.0;
        }
        if (d2 < -1.0) {
            d2 = -1.0;
        }
        if (d2 > 1.0) {
            d2 = 1.0;
        }
        this.j += d2 * 0.1;
        this.j *= 0.8;
        this.i += this.j;
        int n2 = (int)((this.i + 1.0) * (double)this.a.size()) % this.a.size();
        while (n2 < 0) {
            n2 = (n2 + this.a.size()) % this.a.size();
        }
        if (n2 != this.g) {
            this.g = n2;
            brb.a((int[][])this.a.get(this.g), this.e, this.f, this.c, this.d, false, false);
        }
    }
}

