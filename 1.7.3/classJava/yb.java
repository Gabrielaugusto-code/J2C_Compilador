/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class yb
extends qr
implements xy {
    private int c = -1;
    private int d = -1;
    private int e = -1;
    private ahz f;
    protected boolean a;
    public int b;
    private rm g;
    private String h;
    private int i;
    private int at;

    public yb(afs afs2) {
        super(afs2);
        this.a(0.25f, 0.25f);
    }

    @Override
    protected void c() {
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.C.b() * 4.0;
        return d2 < (d3 *= 64.0) * d3;
    }

    public yb(afs afs2, rm rm2) {
        super(afs2);
        this.g = rm2;
        this.a(0.25f, 0.25f);
        this.b(rm2.s, rm2.t + (double)rm2.g(), rm2.u, rm2.y, rm2.z);
        this.s -= (double)(oy.b(this.y / 180.0f * (float)Math.PI) * 0.16f);
        this.t -= (double)0.1f;
        this.u -= (double)(oy.a(this.y / 180.0f * (float)Math.PI) * 0.16f);
        this.b(this.s, this.t, this.u);
        this.L = 0.0f;
        float f2 = 0.4f;
        this.v = -oy.a(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI) * f2;
        this.x = oy.b(this.y / 180.0f * (float)Math.PI) * oy.b(this.z / 180.0f * (float)Math.PI) * f2;
        this.w = -oy.a((this.z + this.f()) / 180.0f * (float)Math.PI) * f2;
        this.c(this.v, this.w, this.x, this.e(), 1.0f);
    }

    public yb(afs afs2, double d2, double d3, double d4) {
        super(afs2);
        this.i = 0;
        this.a(0.25f, 0.25f);
        this.b(d2, d3, d4);
        this.L = 0.0f;
    }

    protected float e() {
        return 1.5f;
    }

    protected float f() {
        return 0.0f;
    }

    @Override
    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = oy.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.Z.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.Z.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.Z.nextGaussian() * (double)0.0075f * (double)f3;
        this.v = d2 *= (double)f2;
        this.w = d3 *= (double)f2;
        this.x = d4 *= (double)f2;
        float f5 = oy.a(d2 * d2 + d4 * d4);
        this.A = this.y = (float)(Math.atan2(d2, d4) * 180.0 / 3.1415927410125732);
        this.B = this.z = (float)(Math.atan2(d3, f5) * 180.0 / 3.1415927410125732);
        this.i = 0;
    }

    @Override
    public void i(double d2, double d3, double d4) {
        this.v = d2;
        this.w = d3;
        this.x = d4;
        if (this.B == 0.0f && this.A == 0.0f) {
            float f2 = oy.a(d2 * d2 + d4 * d4);
            this.A = this.y = (float)(Math.atan2(d2, d4) * 180.0 / 3.1415927410125732);
            this.B = this.z = (float)(Math.atan2(d3, f2) * 180.0 / 3.1415927410125732);
        }
    }

    @Override
    public void h() {
        this.S = this.s;
        this.T = this.t;
        this.U = this.u;
        super.h();
        if (this.b > 0) {
            --this.b;
        }
        if (this.a) {
            if (this.o.a(this.c, this.d, this.e) == this.f) {
                ++this.i;
                if (this.i == 1200) {
                    this.A();
                }
                return;
            }
            this.a = false;
            this.v *= (double)(this.Z.nextFloat() * 0.2f);
            this.w *= (double)(this.Z.nextFloat() * 0.2f);
            this.x *= (double)(this.Z.nextFloat() * 0.2f);
            this.i = 0;
            this.at = 0;
        } else {
            ++this.at;
        }
        ayp ayp2 = this.o.V().a(this.s, this.t, this.u);
        ayp ayp3 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        ayn ayn2 = this.o.a(ayp2, ayp3);
        ayp2 = this.o.V().a(this.s, this.t, this.u);
        ayp3 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        if (ayn2 != null) {
            ayp3 = this.o.V().a(ayn2.f.c, ayn2.f.d, ayn2.f.e);
        }
        if (!this.o.E) {
            qr qr2 = null;
            List list = this.o.b((qr)this, this.C.a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
            double d2 = 0.0;
            rm rm2 = this.j();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d3;
                float f2;
                ayk ayk2;
                ayn ayn3;
                qr qr3 = (qr)list.get(i2);
                if (!qr3.Q() || qr3 == rm2 && this.at < 5 || (ayn3 = (ayk2 = qr3.C.b(f2 = 0.3f, f2, f2)).a(ayp2, ayp3)) == null || !((d3 = ayp2.d(ayn3.f)) < d2) && d2 != 0.0) continue;
                qr2 = qr3;
                d2 = d3;
            }
            if (qr2 != null) {
                ayn2 = new ayn(qr2);
            }
        }
        if (ayn2 != null) {
            if (ayn2.a == ayo.b && this.o.a(ayn2.b, ayn2.c, ayn2.d) == aie.aO) {
                this.ag();
            } else {
                this.a(ayn2);
            }
        }
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
        float f3 = oy.a(this.v * this.v + this.x * this.x);
        this.y = (float)(Math.atan2(this.v, this.x) * 180.0 / 3.1415927410125732);
        this.z = (float)(Math.atan2(this.w, f3) * 180.0 / 3.1415927410125732);
        while (this.z - this.B < -180.0f) {
            this.B -= 360.0f;
        }
        while (this.z - this.B >= 180.0f) {
            this.B += 360.0f;
        }
        while (this.y - this.A < -180.0f) {
            this.A -= 360.0f;
        }
        while (this.y - this.A >= 180.0f) {
            this.A += 360.0f;
        }
        this.z = this.B + (this.z - this.B) * 0.2f;
        this.y = this.A + (this.y - this.A) * 0.2f;
        float f4 = 0.99f;
        float f5 = this.i();
        if (this.L()) {
            for (int i3 = 0; i3 < 4; ++i3) {
                float f6 = 0.25f;
                this.o.a("bubble", this.s - this.v * (double)f6, this.t - this.w * (double)f6, this.u - this.x * (double)f6, this.v, this.w, this.x);
            }
            f4 = 0.8f;
        }
        this.v *= (double)f4;
        this.w *= (double)f4;
        this.x *= (double)f4;
        this.w -= (double)f5;
        this.b(this.s, this.t, this.u);
    }

    protected float i() {
        return 0.03f;
    }

    protected abstract void a(ayn var1);

    @Override
    public void b(dg dg2) {
        dg2.a("xTile", (short)this.c);
        dg2.a("yTile", (short)this.d);
        dg2.a("zTile", (short)this.e);
        dg2.a("inTile", (byte)ahz.b(this.f));
        dg2.a("shake", (byte)this.b);
        dg2.a("inGround", (byte)(this.a ? 1 : 0));
        if ((this.h == null || this.h.length() == 0) && this.g != null && this.g instanceof xq) {
            this.h = this.g.b_();
        }
        dg2.a("ownerName", this.h == null ? "" : this.h);
    }

    @Override
    public void a(dg dg2) {
        this.c = dg2.e("xTile");
        this.d = dg2.e("yTile");
        this.e = dg2.e("zTile");
        this.f = ahz.e(dg2.d("inTile") & 0xFF);
        this.b = dg2.d("shake") & 0xFF;
        this.a = dg2.d("inGround") == 1;
        this.h = dg2.j("ownerName");
        if (this.h != null && this.h.length() == 0) {
            this.h = null;
        }
    }

    @Override
    public float X() {
        return 0.0f;
    }

    public rm j() {
        if (this.g == null && this.h != null && this.h.length() > 0) {
            this.g = this.o.a(this.h);
        }
        return this.g;
    }
}

