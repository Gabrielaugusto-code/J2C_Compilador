/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class tr
extends sz {
    private xm a;
    private rm b;
    private double c;
    private int d;

    public tr(xm xm2, double d2) {
        this.a = xm2;
        this.c = d2;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (this.a.d() >= 0) {
            return false;
        }
        if (this.a.aH().nextInt(400) != 0) {
            return false;
        }
        List list = this.a.o.a(xm.class, this.a.C.b(6.0, 3.0, 6.0));
        double d2 = Double.MAX_VALUE;
        Object object = list.iterator();
        while (object.hasNext()) {
            double d3;
            xm xm2 = (xm)object.next();
            if (xm2 == this.a || xm2.cb() || xm2.d() >= 0 || (d3 = xm2.f(this.a)) > d2) continue;
            d2 = d3;
            this.b = xm2;
        }
        return this.b != null || (object = uo.a(this.a, 16, 3)) != null;
    }

    @Override
    public boolean b() {
        return this.d > 0;
    }

    @Override
    public void c() {
        if (this.b != null) {
            this.a.j(true);
        }
        this.d = 1000;
    }

    @Override
    public void d() {
        this.a.j(false);
        this.b = null;
    }

    @Override
    public void e() {
        --this.d;
        if (this.b != null) {
            if (this.a.f(this.b) > 4.0) {
                this.a.m().a(this.b, this.c);
            }
        } else if (this.a.m().g()) {
            ayp ayp2 = uo.a(this.a, 16, 3);
            if (ayp2 == null) {
                return;
            }
            this.a.m().a(ayp2.c, ayp2.d, ayp2.e, this.c);
        }
    }
}

