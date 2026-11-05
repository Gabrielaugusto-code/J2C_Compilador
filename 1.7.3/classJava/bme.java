/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class bme
extends bma {
    private boolean a;
    private int c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;

    public bme(afs afs2, GameProfile gameProfile) {
        super(afs2, gameProfile);
        this.L = 0.0f;
        this.W = 0.0f;
        this.X = true;
        this.cc = 0.25f;
        this.j = 10.0;
    }

    @Override
    protected void e_() {
        this.L = 0.0f;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        return true;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2) {
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = f2;
        this.h = f3;
        this.c = n2;
    }

    @Override
    public void h() {
        this.cc = 0.0f;
        super.h();
        this.aE = this.aF;
        double d2 = this.s - this.p;
        double d3 = this.u - this.r;
        float f2 = oy.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.aF += (f2 - this.aF) * 0.4f;
        this.aG += this.aF;
        if (!this.a && this.ap() && this.bm.a[this.bm.c] != null) {
            abu abu2 = this.bm.a[this.bm.c];
            this.a(this.bm.a[this.bm.c], abu2.b().d_(abu2));
            this.a = true;
        } else if (this.a && !this.ap()) {
            this.bA();
            this.a = false;
        }
    }

    @Override
    public float X() {
        return 0.0f;
    }

    @Override
    public void e() {
        super.bp();
        if (this.c > 0) {
            double d2;
            double d3 = this.s + (this.d - this.s) / (double)this.c;
            double d4 = this.t + (this.e - this.t) / (double)this.c;
            double d5 = this.u + (this.f - this.u) / (double)this.c;
            for (d2 = this.g - (double)this.y; d2 < -180.0; d2 += 360.0) {
            }
            while (d2 >= 180.0) {
                d2 -= 360.0;
            }
            this.y = (float)((double)this.y + d2 / (double)this.c);
            this.z = (float)((double)this.z + (this.h - (double)this.z) / (double)this.c);
            --this.c;
            this.b(d3, d4, d5);
            this.b(this.y, this.z);
        }
        this.br = this.bs;
        float f2 = oy.a(this.v * this.v + this.x * this.x);
        float f3 = (float)Math.atan(-this.w * (double)0.2f) * 15.0f;
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.D || this.aR() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.D || this.aR() <= 0.0f) {
            f3 = 0.0f;
        }
        this.bs += (f2 - this.bs) * 0.4f;
        this.aJ += (f3 - this.aJ) * 0.8f;
    }

    @Override
    public void c(int n2, abu abu2) {
        if (n2 == 0) {
            this.bm.a[this.bm.c] = abu2;
        } else {
            this.bm.b[n2 - 1] = abu2;
        }
    }

    @Override
    public float g() {
        return 1.82f;
    }

    @Override
    public void a(fa fa2) {
        azi.B().r.b().a(fa2);
    }

    @Override
    public boolean a(int n2, String string) {
        return false;
    }

    @Override
    public r f_() {
        return new r(oy.c(this.s + 0.5), oy.c(this.t + 0.5), oy.c(this.u + 0.5));
    }
}

