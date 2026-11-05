/*
 * Decompiled with CFR 0.152.
 */
public class blu
extends blg {
    public blu(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        float f2;
        this.at = f2 = this.Z.nextFloat() * 0.1f + 0.2f;
        this.au = f2;
        this.av = f2;
        this.k(0);
        this.a(0.02f, 0.02f);
        this.h *= this.Z.nextFloat() * 0.6f + 0.5f;
        this.v *= (double)0.02f;
        this.w *= (double)0.02f;
        this.x *= (double)0.02f;
        this.g = (int)(20.0 / (Math.random() * 0.8 + 0.2));
        this.X = true;
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.d(this.v, this.w, this.x);
        this.v *= 0.99;
        this.w *= 0.99;
        this.x *= 0.99;
        if (this.g-- <= 0) {
            this.A();
        }
    }
}

