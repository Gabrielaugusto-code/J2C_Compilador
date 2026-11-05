/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class xv
extends qr {
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private ahz h;
    private boolean i;
    public rm a;
    private int at;
    private int au;
    public double b;
    public double c;
    public double d;

    public xv(afs afs2) {
        super(afs2);
        this.a(1.0f, 1.0f);
    }

    @Override
    protected void c() {
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.C.b() * 4.0;
        return d2 < (d3 *= 64.0) * d3;
    }

    public xv(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2);
        this.a(1.0f, 1.0f);
        this.b(d2, d3, d4, this.y, this.z);
        this.b(d2, d3, d4);
        double d8 = oy.a(d5 * d5 + d6 * d6 + d7 * d7);
        this.b = d5 / d8 * 0.1;
        this.c = d6 / d8 * 0.1;
        this.d = d7 / d8 * 0.1;
    }

    public xv(afs afs2, rm rm2, double d2, double d3, double d4) {
        super(afs2);
        this.a = rm2;
        this.a(1.0f, 1.0f);
        this.b(rm2.s, rm2.t, rm2.u, rm2.y, rm2.z);
        this.b(this.s, this.t, this.u);
        this.L = 0.0f;
        this.x = 0.0;
        this.w = 0.0;
        this.v = 0.0;
        double d5 = oy.a((d2 += this.Z.nextGaussian() * 0.4) * d2 + (d3 += this.Z.nextGaussian() * 0.4) * d3 + (d4 += this.Z.nextGaussian() * 0.4) * d4);
        this.b = d2 / d5 * 0.1;
        this.c = d3 / d5 * 0.1;
        this.d = d4 / d5 * 0.1;
    }

    @Override
    public void h() {
        if (!this.o.E && (this.a != null && this.a.K || !this.o.d((int)this.s, (int)this.t, (int)this.u))) {
            this.A();
            return;
        }
        super.h();
        this.e(1);
        if (this.i) {
            if (this.o.a(this.e, this.f, this.g) == this.h) {
                ++this.at;
                if (this.at == 600) {
                    this.A();
                }
                return;
            }
            this.i = false;
            this.v *= (double)(this.Z.nextFloat() * 0.2f);
            this.w *= (double)(this.Z.nextFloat() * 0.2f);
            this.x *= (double)(this.Z.nextFloat() * 0.2f);
            this.at = 0;
            this.au = 0;
        } else {
            ++this.au;
        }
        ayp ayp2 = this.o.V().a(this.s, this.t, this.u);
        ayp ayp3 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        ayn ayn2 = this.o.a(ayp2, ayp3);
        ayp2 = this.o.V().a(this.s, this.t, this.u);
        ayp3 = this.o.V().a(this.s + this.v, this.t + this.w, this.u + this.x);
        if (ayn2 != null) {
            ayp3 = this.o.V().a(ayn2.f.c, ayn2.f.d, ayn2.f.e);
        }
        qr qr2 = null;
        List list = this.o.b((qr)this, this.C.a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
        double d2 = 0.0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            float f2;
            ayk ayk2;
            ayn ayn3;
            qr qr3 = (qr)list.get(i2);
            if (!qr3.Q() || qr3.i(this.a) && this.au < 25 || (ayn3 = (ayk2 = qr3.C.b(f2 = 0.3f, f2, f2)).a(ayp2, ayp3)) == null || !((d3 = ayp2.d(ayn3.f)) < d2) && d2 != 0.0) continue;
            qr2 = qr3;
            d2 = d3;
        }
        if (qr2 != null) {
            ayn2 = new ayn(qr2);
        }
        if (ayn2 != null) {
            this.a(ayn2);
        }
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
        float f3 = oy.a(this.v * this.v + this.x * this.x);
        this.y = (float)(Math.atan2(this.x, this.v) * 180.0 / 3.1415927410125732) + 90.0f;
        this.z = (float)(Math.atan2(f3, this.w) * 180.0 / 3.1415927410125732) - 90.0f;
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
        float f4 = this.e();
        if (this.L()) {
            for (int i3 = 0; i3 < 4; ++i3) {
                float f5 = 0.25f;
                this.o.a("bubble", this.s - this.v * (double)f5, this.t - this.w * (double)f5, this.u - this.x * (double)f5, this.v, this.w, this.x);
            }
            f4 = 0.8f;
        }
        this.v += this.b;
        this.w += this.c;
        this.x += this.d;
        this.v *= (double)f4;
        this.w *= (double)f4;
        this.x *= (double)f4;
        this.o.a("smoke", this.s, this.t + 0.5, this.u, 0.0, 0.0, 0.0);
        this.b(this.s, this.t, this.u);
    }

    protected float e() {
        return 0.95f;
    }

    protected abstract void a(ayn var1);

    @Override
    public void b(dg dg2) {
        dg2.a("xTile", (short)this.e);
        dg2.a("yTile", (short)this.f);
        dg2.a("zTile", (short)this.g);
        dg2.a("inTile", (byte)ahz.b(this.h));
        dg2.a("inGround", (byte)(this.i ? 1 : 0));
        dg2.a("direction", this.a(this.v, this.w, this.x));
    }

    @Override
    public void a(dg dg2) {
        this.e = dg2.e("xTile");
        this.f = dg2.e("yTile");
        this.g = dg2.e("zTile");
        this.h = ahz.e(dg2.d("inTile") & 0xFF);
        boolean bl2 = this.i = dg2.d("inGround") == 1;
        if (dg2.b("direction", 9)) {
            dp dp2 = dg2.c("direction", 6);
            this.v = dp2.d(0);
            this.w = dp2.d(1);
            this.x = dp2.d(2);
        } else {
            this.A();
        }
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public float ae() {
        return 1.0f;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        this.P();
        if (qf2.j() != null) {
            ayp ayp2 = qf2.j().af();
            if (ayp2 != null) {
                this.v = ayp2.c;
                this.w = ayp2.d;
                this.x = ayp2.e;
                this.b = this.v * 0.1;
                this.c = this.w * 0.1;
                this.d = this.x * 0.1;
            }
            if (qf2.j() instanceof rm) {
                this.a = (rm)qf2.j();
            }
            return true;
        }
        return false;
    }

    @Override
    public float X() {
        return 0.0f;
    }

    @Override
    public float d(float f2) {
        return 1.0f;
    }

    @Override
    public int c(float f2) {
        return 0xF000F0;
    }
}

