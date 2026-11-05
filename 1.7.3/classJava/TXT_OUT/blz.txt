/*
 * Decompiled with CFR 0.152.
 */
public class blz
extends blg {
    public blz(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.v *= (double)0.3f;
        this.w = (float)Math.random() * 0.2f + 0.1f;
        this.x *= (double)0.3f;
        this.at = 1.0f;
        this.au = 1.0f;
        this.av = 1.0f;
        this.k(19 + this.Z.nextInt(4));
        this.a(0.01f, 0.01f);
        this.i = 0.06f;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void h() {
        double d2;
        avk avk2;
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= (double)this.i;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.98f;
        this.w *= (double)0.98f;
        this.x *= (double)0.98f;
        if (this.g-- <= 0) {
            this.A();
        }
        if (this.D) {
            if (Math.random() < 0.5) {
                this.A();
            }
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
        if (((avk2 = this.o.a(oy.c(this.s), oy.c(this.t), oy.c(this.u)).o()).d() || avk2.a()) && this.t < (d2 = (double)((float)(oy.c(this.t) + 1) - akn.b(this.o.e(oy.c(this.s), oy.c(this.t), oy.c(this.u)))))) {
            this.A();
        }
    }
}

