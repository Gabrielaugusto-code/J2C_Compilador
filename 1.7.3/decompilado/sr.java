/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class sr
extends sz {
    private uw d;
    afs a;
    private uw e;
    int b;
    double c;

    public sr(uw uw2, double d2) {
        this.d = uw2;
        this.a = uw2.o;
        this.c = d2;
        this.a(3);
    }

    @Override
    public boolean a() {
        if (!this.d.ce()) {
            return false;
        }
        this.e = this.f();
        return this.e != null;
    }

    @Override
    public boolean b() {
        return this.e.Y() && this.e.ce() && this.b < 60;
    }

    @Override
    public void d() {
        this.e = null;
        this.b = 0;
    }

    @Override
    public void e() {
        this.d.j().a(this.e, 10.0f, (float)this.d.bv());
        this.d.m().a(this.e, this.c);
        ++this.b;
        if (this.b >= 60 && this.d.f(this.e) < 9.0) {
            this.g();
        }
    }

    private uw f() {
        float f2 = 8.0f;
        List list = this.a.a(this.d.getClass(), this.d.C.b(f2, f2, f2));
        double d2 = Double.MAX_VALUE;
        uw uw2 = null;
        for (uw uw3 : list) {
            if (!this.d.a(uw3) || !(this.d.f(uw3) < d2)) continue;
            uw2 = uw3;
            d2 = this.d.f(uw3);
        }
        return uw2;
    }

    private void g() {
        qo qo2 = this.d.a((qo)this.e);
        if (qo2 == null) {
            return;
        }
        xq xq2 = this.d.cd();
        if (xq2 == null && this.e.cd() != null) {
            xq2 = this.e.cd();
        }
        if (xq2 != null) {
            xq2.a(og.x);
            if (this.d instanceof uy) {
                xq2.a(nt.H);
            }
        }
        this.d.c(6000);
        this.e.c(6000);
        this.d.cf();
        this.e.cf();
        qo2.c(-24000);
        qo2.b(this.d.s, this.d.t, this.d.u, 0.0f, 0.0f);
        this.a.d(qo2);
        Random random = this.d.aH();
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = random.nextGaussian() * 0.02;
            double d3 = random.nextGaussian() * 0.02;
            double d4 = random.nextGaussian() * 0.02;
            this.a.a("heart", this.d.s + (double)(random.nextFloat() * this.d.M * 2.0f) - (double)this.d.M, this.d.t + 0.5 + (double)(random.nextFloat() * this.d.N), this.d.u + (double)(random.nextFloat() * this.d.M * 2.0f) - (double)this.d.M, d2, d3, d4);
        }
        if (this.a.O().b("doMobLoot")) {
            this.a.d(new rh(this.a, this.d.s, this.d.t, this.d.u, random.nextInt(7) + 1));
        }
    }
}

