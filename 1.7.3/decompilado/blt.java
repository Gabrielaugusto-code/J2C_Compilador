/*
 * Decompiled with CFR 0.152.
 */
public class blt
extends blg {
    public blt(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3 - 0.125, d4, d5, d6, d7);
        this.at = 0.4f;
        this.au = 0.4f;
        this.av = 0.7f;
        this.k(0);
        this.a(0.01f, 0.01f);
        this.h *= this.Z.nextFloat() * 0.6f + 0.2f;
        this.v = d5 * 0.0;
        this.w = d6 * 0.0;
        this.x = d7 * 0.0;
        this.g = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.d(this.v, this.w, this.x);
        if (this.o.a(oy.c(this.s), oy.c(this.t), oy.c(this.u)).o() != avk.h) {
            this.A();
        }
        if (this.g-- <= 0) {
            this.A();
        }
    }
}

