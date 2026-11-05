/*
 * Decompiled with CFR 0.152.
 */
public class bku
extends blg {
    public bku(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.v = d5 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.w = d6 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.x = d7 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.au = this.av = this.Z.nextFloat() * 0.3f + 0.7f;
        this.at = this.av;
        this.h = this.Z.nextFloat() * this.Z.nextFloat() * 6.0f + 1.0f;
        this.g = (int)(16.0 / ((double)this.Z.nextFloat() * 0.8 + 0.2)) + 2;
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.A();
        }
        this.k(7 - this.f * 8 / this.g);
        this.w += 0.004;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.9f;
        this.w *= (double)0.9f;
        this.x *= (double)0.9f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }
}

