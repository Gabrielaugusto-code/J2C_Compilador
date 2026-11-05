/*
 * Decompiled with CFR 0.152.
 */
public abstract class ri
extends rn {
    public ri(afs afs2) {
        super(afs2);
    }

    @Override
    protected void b(float f2) {
    }

    @Override
    protected void a(double d2, boolean bl2) {
    }

    @Override
    public void e(float f2, float f3) {
        if (this.L()) {
            this.a(f2, f3, 0.02f);
            this.d(this.v, this.w, this.x);
            this.v *= (double)0.8f;
            this.w *= (double)0.8f;
            this.x *= (double)0.8f;
        } else if (this.O()) {
            this.a(f2, f3, 0.02f);
            this.d(this.v, this.w, this.x);
            this.v *= 0.5;
            this.w *= 0.5;
            this.x *= 0.5;
        } else {
            float f4 = 0.91f;
            if (this.D) {
                f4 = this.o.a((int)oy.c((double)this.s), (int)(oy.c((double)this.C.b) - 1), (int)oy.c((double)this.u)).K * 0.91f;
            }
            float f5 = 0.16277136f / (f4 * f4 * f4);
            this.a(f2, f3, this.D ? 0.1f * f5 : 0.02f);
            f4 = 0.91f;
            if (this.D) {
                f4 = this.o.a((int)oy.c((double)this.s), (int)(oy.c((double)this.C.b) - 1), (int)oy.c((double)this.u)).K * 0.91f;
            }
            this.d(this.v, this.w, this.x);
            this.v *= (double)f4;
            this.w *= (double)f4;
            this.x *= (double)f4;
        }
        this.aE = this.aF;
        double d2 = this.s - this.p;
        double d3 = this.u - this.r;
        float f6 = oy.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        this.aF += (f6 - this.aF) * 0.4f;
        this.aG += this.aF;
    }

    @Override
    public boolean h_() {
        return false;
    }
}

