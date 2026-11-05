/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class agr {
    protected afs a;
    protected Random b;
    protected int c;
    protected int d;
    protected aqe e = new aqa(4);
    protected aqe f = new ara(aie.m, 7);
    protected aqe g = new ara(aie.n, 6);
    protected aqe h = new aqv(aie.d, 32);
    protected aqe i = new aqv(aie.n, 32);
    protected aqe j = new aqv(aie.q, 16);
    protected aqe k = new aqv(aie.p, 8);
    protected aqe l = new aqv(aie.o, 8);
    protected aqe m = new aqv(aie.ax, 7);
    protected aqe n = new aqv(aie.ag, 7);
    protected aqe o = new aqv(aie.x, 6);
    protected aqf p = new aqf(aie.N);
    protected aqe q = new aqf(aie.P);
    protected aqe r = new aqf(aie.Q);
    protected aqe s = new aql();
    protected aqe t = new aqy();
    protected aqe u = new apy();
    protected aqe v = new ahq();
    protected int w;
    protected int x;
    protected int y = 2;
    protected int z = 1;
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E = 1;
    protected int F = 3;
    protected int G = 1;
    protected int H;
    public boolean I = true;

    public void a(afs afs2, Random random, agl agl2, int n2, int n3) {
        if (this.a != null) {
            throw new RuntimeException("Already decorating!!");
        }
        this.a = afs2;
        this.b = random;
        this.c = n2;
        this.d = n3;
        this.a(agl2);
        this.a = null;
        this.b = null;
    }

    protected void a(agl agl2) {
        Object object;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        this.a();
        for (n6 = 0; n6 < this.F; ++n6) {
            n5 = this.c + this.b.nextInt(16) + 8;
            n4 = this.d + this.b.nextInt(16) + 8;
            this.f.a(this.a, this.b, n5, this.a.i(n5, n4), n4);
        }
        for (n6 = 0; n6 < this.G; ++n6) {
            n5 = this.c + this.b.nextInt(16) + 8;
            n4 = this.d + this.b.nextInt(16) + 8;
            this.e.a(this.a, this.b, n5, this.a.i(n5, n4), n4);
        }
        for (n6 = 0; n6 < this.E; ++n6) {
            n5 = this.c + this.b.nextInt(16) + 8;
            n4 = this.d + this.b.nextInt(16) + 8;
            this.g.a(this.a, this.b, n5, this.a.i(n5, n4), n4);
        }
        n6 = this.x;
        if (this.b.nextInt(10) == 0) {
            ++n6;
        }
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            n2 = this.a.f(n4, n3);
            object = agl2.a(this.b);
            ((aqe)object).a(1.0, 1.0, 1.0);
            if (!((aqe)object).a(this.a, this.b, n4, n2, n3)) continue;
            ((apt)object).b(this.a, this.b, n4, n2, n3);
        }
        for (n5 = 0; n5 < this.H; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            this.s.a(this.a, this.b, n4, this.a.f(n4, n3), n3);
        }
        for (n5 = 0; n5 < this.y; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            object = agl2.a(this.b, n4, n2 = this.b.nextInt(this.a.f(n4, n3 = this.d + this.b.nextInt(16) + 8) + 32), n3);
            ajt ajt2 = ajt.e((String)object);
            if (ajt2.o() == avk.a) continue;
            this.p.a(ajt2, ajt.f((String)object));
            this.p.a(this.a, this.b, n4, n2, n3);
        }
        for (n5 = 0; n5 < this.z; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            n2 = this.b.nextInt(this.a.f(n4, n3) * 2);
            object = agl2.b(this.b);
            ((aqe)object).a(this.a, this.b, n4, n2, n3);
        }
        for (n5 = 0; n5 < this.A; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            n2 = this.b.nextInt(this.a.f(n4, n3) * 2);
            new aqb(aie.I).a(this.a, this.b, n4, n2, n3);
        }
        for (n5 = 0; n5 < this.w; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            for (n2 = this.b.nextInt(this.a.f(n4, n3) * 2); n2 > 0 && this.a.c(n4, n2 - 1, n3); --n2) {
            }
            this.v.a(this.a, this.b, n4, n2, n3);
        }
        for (n5 = 0; n5 < this.B; ++n5) {
            if (this.b.nextInt(4) == 0) {
                n4 = this.c + this.b.nextInt(16) + 8;
                n3 = this.d + this.b.nextInt(16) + 8;
                n2 = this.a.f(n4, n3);
                this.q.a(this.a, this.b, n4, n2, n3);
            }
            if (this.b.nextInt(8) != 0) continue;
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            n2 = this.b.nextInt(this.a.f(n4, n3) * 2);
            this.r.a(this.a, this.b, n4, n2, n3);
        }
        if (this.b.nextInt(4) == 0) {
            n5 = this.c + this.b.nextInt(16) + 8;
            n4 = this.d + this.b.nextInt(16) + 8;
            n3 = this.b.nextInt(this.a.f(n5, n4) * 2);
            this.q.a(this.a, this.b, n5, n3, n4);
        }
        if (this.b.nextInt(8) == 0) {
            n5 = this.c + this.b.nextInt(16) + 8;
            n4 = this.d + this.b.nextInt(16) + 8;
            n3 = this.b.nextInt(this.a.f(n5, n4) * 2);
            this.r.a(this.a, this.b, n5, n3, n4);
        }
        for (n5 = 0; n5 < this.C; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            n2 = this.b.nextInt(this.a.f(n4, n3) * 2);
            this.t.a(this.a, this.b, n4, n2, n3);
        }
        for (n5 = 0; n5 < 10; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            n2 = this.b.nextInt(this.a.f(n4, n3) * 2);
            this.t.a(this.a, this.b, n4, n2, n3);
        }
        if (this.b.nextInt(32) == 0) {
            n5 = this.c + this.b.nextInt(16) + 8;
            n4 = this.d + this.b.nextInt(16) + 8;
            n3 = this.b.nextInt(this.a.f(n5, n4) * 2);
            new aqx().a(this.a, this.b, n5, n3, n4);
        }
        for (n5 = 0; n5 < this.D; ++n5) {
            n4 = this.c + this.b.nextInt(16) + 8;
            n3 = this.d + this.b.nextInt(16) + 8;
            n2 = this.b.nextInt(this.a.f(n4, n3) * 2);
            this.u.a(this.a, this.b, n4, n2, n3);
        }
        if (this.I) {
            for (n5 = 0; n5 < 50; ++n5) {
                n4 = this.c + this.b.nextInt(16) + 8;
                n3 = this.b.nextInt(this.b.nextInt(248) + 8);
                n2 = this.d + this.b.nextInt(16) + 8;
                new ard(aie.i).a(this.a, this.b, n4, n3, n2);
            }
            for (n5 = 0; n5 < 20; ++n5) {
                n4 = this.c + this.b.nextInt(16) + 8;
                n3 = this.b.nextInt(this.b.nextInt(this.b.nextInt(240) + 8) + 8);
                n2 = this.d + this.b.nextInt(16) + 8;
                new ard(aie.k).a(this.a, this.b, n4, n3, n2);
            }
        }
    }

    protected void a(int n2, aqe aqe2, int n3, int n4) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5 = this.c + this.b.nextInt(16);
            int n6 = this.b.nextInt(n4 - n3) + n3;
            int n7 = this.d + this.b.nextInt(16);
            aqe2.a(this.a, this.b, n5, n6, n7);
        }
    }

    protected void b(int n2, aqe aqe2, int n3, int n4) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5 = this.c + this.b.nextInt(16);
            int n6 = this.b.nextInt(n4) + this.b.nextInt(n4) + (n3 - n4);
            int n7 = this.d + this.b.nextInt(16);
            aqe2.a(this.a, this.b, n5, n6, n7);
        }
    }

    protected void a() {
        this.a(20, this.h, 0, 256);
        this.a(10, this.i, 0, 256);
        this.a(20, this.j, 0, 128);
        this.a(20, this.k, 0, 64);
        this.a(2, this.l, 0, 32);
        this.a(8, this.m, 0, 16);
        this.a(1, this.n, 0, 16);
        this.b(1, this.o, 16, 16);
    }
}

