/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class sv
extends sz {
    private ru a;
    private double b;
    private double c;
    private double d;
    private double e;
    private afs f;

    public sv(ru ru2, double d2) {
        this.a = ru2;
        this.e = d2;
        this.f = ru2.o;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (!this.f.w()) {
            return false;
        }
        if (!this.a.ak()) {
            return false;
        }
        if (!this.f.i(oy.c(this.a.s), (int)this.a.C.b, oy.c(this.a.u))) {
            return false;
        }
        ayp ayp2 = this.f();
        if (ayp2 == null) {
            return false;
        }
        this.b = ayp2.c;
        this.c = ayp2.d;
        this.d = ayp2.e;
        return true;
    }

    @Override
    public boolean b() {
        return !this.a.m().g();
    }

    @Override
    public void c() {
        this.a.m().a(this.b, this.c, this.d, this.e);
    }

    private ayp f() {
        Random random = this.a.aH();
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2;
            int n3;
            int n4 = oy.c(this.a.s + (double)random.nextInt(20) - 10.0);
            if (this.f.i(n4, n3 = oy.c(this.a.C.b + (double)random.nextInt(6) - 3.0), n2 = oy.c(this.a.u + (double)random.nextInt(20) - 10.0)) || !(this.a.a(n4, n3, n2) < 0.0f)) continue;
            return this.f.V().a(n4, n3, n2);
        }
        return null;
    }
}

