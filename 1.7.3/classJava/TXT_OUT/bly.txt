/*
 * Decompiled with CFR 0.152.
 */
public class bly
extends blg {
    public bly(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.v *= (double)0.3f;
        this.w = (float)Math.random() * 0.2f + 0.1f;
        this.x *= (double)0.3f;
        this.at = 1.0f;
        this.au = 1.0f;
        this.av = 1.0f;
        this.k(19);
        this.a(0.01f, 0.01f);
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.i = 0.0f;
        this.v = d5;
        this.w = d6;
        this.x = d7;
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= (double)this.i;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.98f;
        this.w *= (double)0.98f;
        this.x *= (double)0.98f;
        int n2 = 60 - this.g;
        float f2 = (float)n2 * 0.001f;
        this.a(f2, f2);
        this.k(19 + n2 % 4);
        if (this.g-- <= 0) {
            this.A();
        }
    }
}

