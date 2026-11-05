/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class tj
extends sz {
    private ru a;
    private double b;
    private aww c;
    private up d;
    private boolean e;
    private List f = new ArrayList();

    public tj(ru ru2, double d2, boolean bl2) {
        this.a = ru2;
        this.b = d2;
        this.e = bl2;
        this.a(1);
    }

    @Override
    public boolean a() {
        this.f();
        if (this.e && this.a.o.w()) {
            return false;
        }
        uq uq2 = this.a.o.A.a(oy.c(this.a.s), oy.c(this.a.t), oy.c(this.a.u), 0);
        if (uq2 == null) {
            return false;
        }
        this.d = this.a(uq2);
        if (this.d == null) {
            return false;
        }
        boolean bl2 = this.a.m().c();
        this.a.m().b(false);
        this.c = this.a.m().a(this.d.a, this.d.b, this.d.c);
        this.a.m().b(bl2);
        if (this.c != null) {
            return true;
        }
        ayp ayp2 = uo.a(this.a, 10, 7, this.a.o.V().a(this.d.a, this.d.b, this.d.c));
        if (ayp2 == null) {
            return false;
        }
        this.a.m().b(false);
        this.c = this.a.m().a(ayp2.c, ayp2.d, ayp2.e);
        this.a.m().b(bl2);
        return this.c != null;
    }

    @Override
    public boolean b() {
        if (this.a.m().g()) {
            return false;
        }
        float f2 = this.a.M + 4.0f;
        return this.a.e(this.d.a, this.d.b, this.d.c) > (double)(f2 * f2);
    }

    @Override
    public void c() {
        this.a.m().a(this.c, this.b);
    }

    @Override
    public void d() {
        if (this.a.m().g() || this.a.e(this.d.a, this.d.b, this.d.c) < 16.0) {
            this.f.add(this.d);
        }
    }

    private up a(uq uq2) {
        up up2 = null;
        int n2 = Integer.MAX_VALUE;
        List list = uq2.f();
        for (up up3 : list) {
            int n3 = up3.b(oy.c(this.a.s), oy.c(this.a.t), oy.c(this.a.u));
            if (n3 >= n2 || this.a(up3)) continue;
            up2 = up3;
            n2 = n3;
        }
        return up2;
    }

    private boolean a(up up2) {
        for (up up3 : this.f) {
            if (up2.a != up3.a || up2.b != up3.b || up2.c != up3.c) continue;
            return true;
        }
        return false;
    }

    private void f() {
        if (this.f.size() > 15) {
            this.f.remove(0);
        }
    }
}

