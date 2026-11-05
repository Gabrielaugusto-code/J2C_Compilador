/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class vy
extends vx {
    private int b;
    public long a;
    private int c;

    public vy(afs afs2, double d2, double d3, double d4) {
        super(afs2);
        this.b(d2, d3, d4, 0.0f, 0.0f);
        this.b = 2;
        this.a = this.Z.nextLong();
        this.c = this.Z.nextInt(3) + 1;
        if (!afs2.E && afs2.O().b("doFireTick") && (afs2.r == pu.c || afs2.r == pu.d) && afs2.a(oy.c(d2), oy.c(d3), oy.c(d4), 10)) {
            int n2;
            int n3;
            int n4 = oy.c(d2);
            if (afs2.a(n4, n3 = oy.c(d3), n2 = oy.c(d4)).o() == avk.a && aie.ab.c(afs2, n4, n3, n2)) {
                afs2.b(n4, n3, n2, aie.ab);
            }
            for (n4 = 0; n4 < 4; ++n4) {
                int n5;
                n3 = oy.c(d2) + this.Z.nextInt(3) - 1;
                if (afs2.a(n3, n2 = oy.c(d3) + this.Z.nextInt(3) - 1, n5 = oy.c(d4) + this.Z.nextInt(3) - 1).o() != avk.a || !aie.ab.c(afs2, n3, n2, n5)) continue;
                afs2.b(n3, n2, n5, aie.ab);
            }
        }
    }

    @Override
    public void h() {
        super.h();
        if (this.b == 2) {
            this.o.a(this.s, this.t, this.u, "ambient.weather.thunder", 10000.0f, 0.8f + this.Z.nextFloat() * 0.2f);
            this.o.a(this.s, this.t, this.u, "random.explode", 2.0f, 0.5f + this.Z.nextFloat() * 0.2f);
        }
        --this.b;
        if (this.b < 0) {
            if (this.c == 0) {
                this.A();
            } else if (this.b < -this.Z.nextInt(10)) {
                int n2;
                int n3;
                int n4;
                --this.c;
                this.b = 1;
                this.a = this.Z.nextLong();
                if (!this.o.E && this.o.O().b("doFireTick") && this.o.a(oy.c(this.s), oy.c(this.t), oy.c(this.u), 10) && this.o.a(n4 = oy.c(this.s), n3 = oy.c(this.t), n2 = oy.c(this.u)).o() == avk.a && aie.ab.c(this.o, n4, n3, n2)) {
                    this.o.b(n4, n3, n2, aie.ab);
                }
            }
        }
        if (this.b >= 0) {
            if (this.o.E) {
                this.o.q = 2;
            } else {
                double d2 = 3.0;
                List list = this.o.b((qr)this, ayk.a().a(this.s - d2, this.t - d2, this.u - d2, this.s + d2, this.t + 6.0 + d2, this.u + d2));
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    qr qr2 = (qr)list.get(i2);
                    qr2.a(this);
                }
            }
        }
    }

    @Override
    protected void c() {
    }

    @Override
    protected void a(dg dg2) {
    }

    @Override
    protected void b(dg dg2) {
    }
}

