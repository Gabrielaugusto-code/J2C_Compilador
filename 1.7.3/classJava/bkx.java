/*
 * Decompiled with CFR 0.152.
 */
public class bkx
extends blg {
    private int a = 160;
    private boolean aB;
    private boolean aC;
    private final blh aD;
    private float aE;
    private float aF;
    private float aG;
    private boolean aH;

    public bkx(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7, blh blh2) {
        super(afs2, d2, d3, d4);
        this.v = d5;
        this.w = d6;
        this.x = d7;
        this.aD = blh2;
        this.h *= 0.75f;
        this.g = 48 + this.Z.nextInt(12);
        this.X = false;
    }

    public void a(boolean bl2) {
        this.aB = bl2;
    }

    public void f(boolean bl2) {
        this.aC = bl2;
    }

    public void a(int n2) {
        float f2 = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        float f3 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        float f4 = (float)((n2 & 0xFF) >> 0) / 255.0f;
        float f5 = 1.0f;
        this.b(f2 * f5, f3 * f5, f4 * f5);
    }

    public void c(int n2) {
        this.aE = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        this.aF = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        this.aG = (float)((n2 & 0xFF) >> 0) / 255.0f;
        this.aH = true;
    }

    @Override
    public ayk I() {
        return null;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!this.aC || this.f < this.g / 3 || (this.f + this.g) / 3 % 2 == 0) {
            super.a(bna2, f2, f3, f4, f5, f6, f7);
        }
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.A();
        }
        if (this.f > this.g / 2) {
            this.g(1.0f - ((float)this.f - (float)(this.g / 2)) / (float)this.g);
            if (this.aH) {
                this.at += (this.aE - this.at) * 0.2f;
                this.au += (this.aF - this.au) * 0.2f;
                this.av += (this.aG - this.av) * 0.2f;
            }
        }
        this.k(this.a + (7 - this.f * 8 / this.g));
        this.w -= 0.004;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.91f;
        this.w *= (double)0.91f;
        this.x *= (double)0.91f;
        if (this.D) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
        if (this.aB && this.f < this.g / 2 && (this.f + this.g) % 2 == 0) {
            bkx bkx2 = new bkx(this.o, this.s, this.t, this.u, 0.0, 0.0, 0.0, this.aD);
            bkx2.b(this.at, this.au, this.av);
            bkx2.f = bkx2.g / 2;
            if (this.aH) {
                bkx2.aH = true;
                bkx2.aE = this.aE;
                bkx2.aF = this.aF;
                bkx2.aG = this.aG;
            }
            bkx2.aC = this.aC;
            this.aD.a(bkx2);
        }
    }

    @Override
    public int c(float f2) {
        return 0xF000F0;
    }

    @Override
    public float d(float f2) {
        return 1.0f;
    }
}

