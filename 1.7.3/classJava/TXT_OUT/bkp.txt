/*
 * Decompiled with CFR 0.152.
 */
public class bkp
extends blg {
    public bkp(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.at = 1.0f;
        this.au = 1.0f;
        this.av = 1.0f;
        this.k(32);
        this.a(0.02f, 0.02f);
        this.h *= this.Z.nextFloat() * 0.6f + 0.2f;
        this.v = d5 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.w = d6 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.x = d7 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w += 0.002;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.85f;
        this.w *= (double)0.85f;
        this.x *= (double)0.85f;
        if (this.o.a(oy.c(this.s), oy.c(this.t), oy.c(this.u)).o() != avk.h) {
            this.A();
        }
        if (this.g-- <= 0) {
            this.A();
        }
    }
}

