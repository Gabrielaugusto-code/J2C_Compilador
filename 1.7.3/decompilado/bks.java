/*
 * Decompiled with CFR 0.152.
 */
public class bks
extends blg {
    private avk a;
    private int aB;

    public bks(afs afs2, double d2, double d3, double d4, avk avk2) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.x = 0.0;
        this.w = 0.0;
        this.v = 0.0;
        if (avk2 == avk.h) {
            this.at = 0.0f;
            this.au = 0.0f;
            this.av = 1.0f;
        } else {
            this.at = 1.0f;
            this.au = 0.0f;
            this.av = 0.0f;
        }
        this.k(113);
        this.a(0.01f, 0.01f);
        this.i = 0.06f;
        this.a = avk2;
        this.aB = 40;
        this.g = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        this.x = 0.0;
        this.w = 0.0;
        this.v = 0.0;
    }

    @Override
    public int c(float f2) {
        if (this.a == avk.h) {
            return super.c(f2);
        }
        return 257;
    }

    @Override
    public float d(float f2) {
        if (this.a == avk.h) {
            return super.d(f2);
        }
        return 1.0f;
    }

    @Override
    public void h() {
        double d2;
        avk avk2;
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.a == avk.h) {
            this.at = 0.2f;
            this.au = 0.3f;
            this.av = 1.0f;
        } else {
            this.at = 1.0f;
            this.au = 16.0f / (float)(40 - this.aB + 16);
            this.av = 4.0f / (float)(40 - this.aB + 8);
        }
        this.w -= (double)this.i;
        if (this.aB-- > 0) {
            this.v *= 0.02;
            this.w *= 0.02;
            this.x *= 0.02;
            this.k(113);
        } else {
            this.k(112);
        }
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.98f;
        this.w *= (double)0.98f;
        this.x *= (double)0.98f;
        if (this.g-- <= 0) {
            this.A();
        }
        if (this.D) {
            if (this.a == avk.h) {
                this.A();
                this.o.a("splash", this.s, this.t, this.u, 0.0, 0.0, 0.0);
            } else {
                this.k(114);
            }
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
        if (((avk2 = this.o.a(oy.c(this.s), oy.c(this.t), oy.c(this.u)).o()).d() || avk2.a()) && this.t < (d2 = (double)((float)(oy.c(this.t) + 1) - akn.b(this.o.e(oy.c(this.s), oy.c(this.t), oy.c(this.u)))))) {
            this.A();
        }
    }
}

