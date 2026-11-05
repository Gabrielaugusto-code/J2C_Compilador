/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mr {
    private static final Logger p = LogManager.getLogger();
    public qr a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public double j;
    public double k;
    public double l;
    public int m;
    private double q;
    private double r;
    private double s;
    private boolean t;
    private boolean u;
    private int v;
    private qr w;
    private boolean x;
    public boolean n;
    public Set o = new HashSet();

    public mr(qr qr2, int n2, int n3, boolean bl2) {
        this.a = qr2;
        this.b = n2;
        this.c = n3;
        this.u = bl2;
        this.d = oy.c(qr2.s * 32.0);
        this.e = oy.c(qr2.t * 32.0);
        this.f = oy.c(qr2.u * 32.0);
        this.g = oy.d(qr2.y * 256.0f / 360.0f);
        this.h = oy.d(qr2.z * 256.0f / 360.0f);
        this.i = oy.d(qr2.at() * 256.0f / 360.0f);
    }

    public boolean equals(Object object) {
        if (object instanceof mr) {
            return ((mr)object).a.x() == this.a.x();
        }
        return false;
    }

    public int hashCode() {
        return this.a.x();
    }

    public void a(List list) {
        this.n = false;
        if (!this.t || this.a.e(this.q, this.r, this.s) > 16.0) {
            this.q = this.a.s;
            this.r = this.a.t;
            this.s = this.a.u;
            this.t = true;
            this.n = true;
            this.b(list);
        }
        if (this.w != this.a.m || this.a.m != null && this.m % 60 == 0) {
            this.w = this.a.m;
            this.a(new ho(0, this.a, this.a.m));
        }
        if (this.a instanceof rk && this.m % 10 == 0) {
            rk rk2 = (rk)this.a;
            abu abu2 = rk2.j();
            if (abu2 != null && abu2.b() instanceof aby) {
                awz awz2 = abv.aY.a(abu2, this.a.o);
                for (xq xq2 : list) {
                    mp mp2 = (mp)xq2;
                    awz2.a(mp2, abu2);
                    fk fk2 = abv.aY.c(abu2, this.a.o, mp2);
                    if (fk2 == null) continue;
                    mp2.a.a(fk2);
                }
            }
            this.b();
        } else if (this.m % this.c == 0 || this.a.al || this.a.y().a()) {
            int n2;
            if (this.a.m == null) {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                boolean bl2;
                ++this.v;
                n2 = this.a.as.a(this.a.s);
                int n3 = oy.c(this.a.t * 32.0);
                int n4 = this.a.as.a(this.a.u);
                int n5 = oy.d(this.a.y * 256.0f / 360.0f);
                int n6 = oy.d(this.a.z * 256.0f / 360.0f);
                int n7 = n2 - this.d;
                int n8 = n3 - this.e;
                int n9 = n4 - this.f;
                fk fk3 = null;
                boolean bl3 = Math.abs(n7) >= 4 || Math.abs(n8) >= 4 || Math.abs(n9) >= 4 || this.m % 60 == 0;
                boolean bl4 = bl2 = Math.abs(n5 - this.g) >= 4 || Math.abs(n6 - this.h) >= 4;
                if (this.m > 0 || this.a instanceof xt) {
                    if (n7 < -128 || n7 >= 128 || n8 < -128 || n8 >= 128 || n9 < -128 || n9 >= 128 || this.v > 400 || this.x) {
                        this.v = 0;
                        fk3 = new ia(this.a.x(), n2, n3, n4, (byte)n5, (byte)n6);
                    } else if (bl3 && bl2) {
                        fk3 = new gy(this.a.x(), (byte)n7, (byte)n8, (byte)n9, (byte)n5, (byte)n6);
                    } else if (bl3) {
                        fk3 = new gx(this.a.x(), (byte)n7, (byte)n8, (byte)n9);
                    } else if (bl2) {
                        fk3 = new gz(this.a.x(), (byte)n5, (byte)n6);
                    }
                }
                if (this.u && ((d6 = (d5 = this.a.v - this.j) * d5 + (d4 = this.a.w - this.k) * d4 + (d3 = this.a.x - this.l) * d3) > (d2 = 0.02) * d2 || d6 > 0.0 && this.a.v == 0.0 && this.a.w == 0.0 && this.a.x == 0.0)) {
                    this.j = this.a.v;
                    this.k = this.a.w;
                    this.l = this.a.x;
                    this.a(new hp(this.a.x(), this.j, this.k, this.l));
                }
                if (fk3 != null) {
                    this.a(fk3);
                }
                this.b();
                if (bl3) {
                    this.d = n2;
                    this.e = n3;
                    this.f = n4;
                }
                if (bl2) {
                    this.g = n5;
                    this.h = n6;
                }
                this.x = false;
            } else {
                boolean bl5;
                n2 = oy.d(this.a.y * 256.0f / 360.0f);
                int n10 = oy.d(this.a.z * 256.0f / 360.0f);
                boolean bl6 = bl5 = Math.abs(n2 - this.g) >= 4 || Math.abs(n10 - this.h) >= 4;
                if (bl5) {
                    this.a(new gz(this.a.x(), (byte)n2, (byte)n10));
                    this.g = n2;
                    this.h = n10;
                }
                this.d = this.a.as.a(this.a.s);
                this.e = oy.c(this.a.t * 32.0);
                this.f = this.a.as.a(this.a.u);
                this.b();
                this.x = true;
            }
            n2 = oy.d(this.a.at() * 256.0f / 360.0f);
            if (Math.abs(n2 - this.i) >= 4) {
                this.a(new hk(this.a, (byte)n2));
                this.i = n2;
            }
            this.a.al = false;
        }
        ++this.m;
        if (this.a.H) {
            this.b(new hp(this.a));
            this.a.H = false;
        }
    }

    private void b() {
        rv rv2 = this.a.y();
        if (rv2.a()) {
            this.b(new hn(this.a.x(), rv2, false));
        }
        if (this.a instanceof rm) {
            sh sh2 = (sh)((rm)this.a).bb();
            Set set = sh2.b();
            if (!set.isEmpty()) {
                this.b(new ib(this.a.x(), set));
            }
            set.clear();
        }
    }

    public void a(fk fk2) {
        for (mp mp2 : this.o) {
            mp2.a.a(fk2);
        }
    }

    public void b(fk fk2) {
        this.a(fk2);
        if (this.a instanceof mp) {
            ((mp)this.a).a.a(fk2);
        }
    }

    public void a() {
        for (mp mp2 : this.o) {
            mp2.d(this.a);
        }
    }

    public void a(mp mp2) {
        if (this.o.contains(mp2)) {
            mp2.d(this.a);
            this.o.remove(mp2);
        }
    }

    public void b(mp mp2) {
        if (mp2 == this.a) {
            return;
        }
        double d2 = mp2.s - (double)(this.d / 32);
        double d3 = mp2.u - (double)(this.f / 32);
        if (d2 >= (double)(-this.b) && d2 <= (double)this.b && d3 >= (double)(-this.b) && d3 <= (double)this.b) {
            if (!this.o.contains(mp2) && (this.d(mp2) || this.a.n)) {
                Object object;
                Object object2;
                this.o.add(mp2);
                fk fk2 = this.c();
                mp2.a.a(fk2);
                if (!this.a.y().d()) {
                    mp2.a.a(new hn(this.a.x(), this.a.y(), true));
                }
                if (this.a instanceof rm && !(object2 = ((sh)(object = (sh)((rm)this.a).bb())).c()).isEmpty()) {
                    mp2.a.a(new ib(this.a.x(), (Collection)object2));
                }
                this.j = this.a.v;
                this.k = this.a.w;
                this.l = this.a.x;
                if (this.u && !(fk2 instanceof fq)) {
                    mp2.a.a(new hp(this.a.x(), this.a.v, this.a.w, this.a.x));
                }
                if (this.a.m != null) {
                    mp2.a.a(new ho(0, this.a, this.a.m));
                }
                if (this.a instanceof rn && ((rn)this.a).bO() != null) {
                    mp2.a.a(new ho(1, this.a, ((rn)this.a).bO()));
                }
                if (this.a instanceof rm) {
                    for (int i2 = 0; i2 < 5; ++i2) {
                        object2 = ((rm)this.a).q(i2);
                        if (object2 == null) continue;
                        mp2.a.a(new hq(this.a.x(), i2, (abu)object2));
                    }
                }
                if (this.a instanceof xq && ((xq)(object = (xq)this.a)).bl()) {
                    mp2.a.a(new hg((xq)object, oy.c(this.a.s), oy.c(this.a.t), oy.c(this.a.u)));
                }
                if (this.a instanceof rm) {
                    object = (rm)this.a;
                    for (qn qn2 : ((rm)object).aP()) {
                        mp2.a.a(new id(this.a.x(), qn2));
                    }
                }
            }
        } else if (this.o.contains(mp2)) {
            this.o.remove(mp2);
            mp2.d(this.a);
        }
    }

    private boolean d(mp mp2) {
        return mp2.r().t().a(mp2, this.a.ah, this.a.aj);
    }

    public void b(List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.b((mp)list.get(i2));
        }
    }

    private fk c() {
        if (this.a.K) {
            p.warn("Fetching addPacket for removed entity");
        }
        if (this.a instanceof wb) {
            return new fn(this.a, 2, 1);
        }
        if (this.a instanceof mp) {
            return new fs((xq)this.a);
        }
        if (this.a instanceof wc) {
            wc wc2 = (wc)this.a;
            return new fn(this.a, 10, wc2.m());
        }
        if (this.a instanceof vz) {
            return new fn(this.a, 1);
        }
        if (this.a instanceof qp || this.a instanceof vr) {
            this.i = oy.d(this.a.at() * 256.0f / 360.0f);
            return new fq((rm)this.a);
        }
        if (this.a instanceof vv) {
            xq xq2 = ((vv)this.a).b;
            return new fn(this.a, 90, xq2 != null ? xq2.x() : this.a.x());
        }
        if (this.a instanceof xt) {
            qr qr2 = ((xt)this.a).c;
            return new fn(this.a, 60, qr2 != null ? qr2.x() : this.a.x());
        }
        if (this.a instanceof ya) {
            return new fn(this.a, 61);
        }
        if (this.a instanceof yf) {
            return new fn(this.a, 73, ((yf)this.a).k());
        }
        if (this.a instanceof ye) {
            return new fn(this.a, 75);
        }
        if (this.a instanceof yd) {
            return new fn(this.a, 65);
        }
        if (this.a instanceof xu) {
            return new fn(this.a, 72);
        }
        if (this.a instanceof xw) {
            return new fn(this.a, 76);
        }
        if (this.a instanceof xv) {
            xv xv2 = (xv)this.a;
            fn fn2 = null;
            int n2 = 63;
            if (this.a instanceof xz) {
                n2 = 64;
            } else if (this.a instanceof yg) {
                n2 = 66;
            }
            fn2 = xv2.a != null ? new fn(this.a, n2, ((xv)this.a).a.x()) : new fn(this.a, n2, 0);
            fn2.d((int)(xv2.b * 8000.0));
            fn2.e((int)(xv2.c * 8000.0));
            fn2.f((int)(xv2.d * 8000.0));
            return fn2;
        }
        if (this.a instanceof yc) {
            return new fn(this.a, 62);
        }
        if (this.a instanceof wn) {
            return new fn(this.a, 50);
        }
        if (this.a instanceof vq) {
            return new fn(this.a, 51);
        }
        if (this.a instanceof wa) {
            wa wa2 = (wa)this.a;
            return new fn(this.a, 70, ahz.b(wa2.f()) | wa2.a << 16);
        }
        if (this.a instanceof rs) {
            return new fr((rs)this.a);
        }
        if (this.a instanceof rk) {
            rk rk2 = (rk)this.a;
            fn fn3 = new fn(this.a, 71, rk2.a);
            fn3.a(oy.d((float)(rk2.b * 32)));
            fn3.b(oy.d((float)(rk2.c * 32)));
            fn3.c(oy.d((float)(rk2.d * 32)));
            return fn3;
        }
        if (this.a instanceof rl) {
            rl rl2 = (rl)this.a;
            fn fn4 = new fn(this.a, 77);
            fn4.a(oy.d((float)(rl2.b * 32)));
            fn4.b(oy.d((float)(rl2.c * 32)));
            fn4.c(oy.d((float)(rl2.d * 32)));
            return fn4;
        }
        if (this.a instanceof rh) {
            return new fo((rh)this.a);
        }
        throw new IllegalArgumentException("Don't know how to add " + this.a.getClass() + "!");
    }

    public void c(mp mp2) {
        if (this.o.contains(mp2)) {
            this.o.remove(mp2);
            mp2.d(this.a);
        }
    }
}

