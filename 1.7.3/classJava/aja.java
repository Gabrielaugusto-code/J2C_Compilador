/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class aja
extends ajb {
    protected final boolean a;

    protected aja(boolean bl2) {
        super(avk.q);
        this.a = bl2;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        if (!afs.a(afs2, n2, n3 - 1, n4)) {
            return false;
        }
        return super.c(afs2, n2, n3, n4);
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        if (!afs.a(afs2, n2, n3 - 1, n4)) {
            return false;
        }
        return super.j(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4);
        if (!this.g((agc)afs2, n2, n3, n4, n5)) {
            boolean bl2 = this.a(afs2, n2, n3, n4, n5);
            if (this.a && !bl2) {
                afs2.d(n2, n3, n4, this.i(), n5, 2);
            } else if (!this.a) {
                afs2.d(n2, n3, n4, this.e(), n5, 2);
                if (!bl2) {
                    afs2.a(n2, n3, n4, this.e(), this.k(n5), -1);
                }
            }
        }
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 0) {
            if (this.a) {
                return aie.aA.h(n2);
            }
            return aie.az.h(n2);
        }
        if (n2 == 1) {
            return this.L;
        }
        return aie.T.h(1);
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        return n5 != 0 && n5 != 1;
    }

    @Override
    public int b() {
        return 36;
    }

    protected boolean c(int n2) {
        return this.a;
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4, int n5) {
        return this.b(agc2, n2, n3, n4, n5);
    }

    @Override
    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        int n6 = agc2.e(n2, n3, n4);
        if (!this.c(n6)) {
            return 0;
        }
        int n7 = aja.l(n6);
        if (n7 == 0 && n5 == 3) {
            return this.f(agc2, n2, n3, n4, n6);
        }
        if (n7 == 1 && n5 == 4) {
            return this.f(agc2, n2, n3, n4, n6);
        }
        if (n7 == 2 && n5 == 2) {
            return this.f(agc2, n2, n3, n4, n6);
        }
        if (n7 == 3 && n5 == 5) {
            return this.f(agc2, n2, n3, n4, n6);
        }
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!this.j(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
            afs2.d(n2 + 1, n3, n4, this);
            afs2.d(n2 - 1, n3, n4, this);
            afs2.d(n2, n3, n4 + 1, this);
            afs2.d(n2, n3, n4 - 1, this);
            afs2.d(n2, n3 - 1, n4, this);
            afs2.d(n2, n3 + 1, n4, this);
            return;
        }
        this.b(afs2, n2, n3, n4, ahz2);
    }

    protected void b(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        int n5 = afs2.e(n2, n3, n4);
        if (!this.g((agc)afs2, n2, n3, n4, n5)) {
            boolean bl2 = this.a(afs2, n2, n3, n4, n5);
            if ((this.a && !bl2 || !this.a && bl2) && !afs2.a(n2, n3, n4, this)) {
                int n6 = -1;
                if (this.i(afs2, n2, n3, n4, n5)) {
                    n6 = -3;
                } else if (this.a) {
                    n6 = -2;
                }
                afs2.a(n2, n3, n4, this, this.b(n5), n6);
            }
        }
    }

    public boolean g(agc agc2, int n2, int n3, int n4, int n5) {
        return false;
    }

    protected boolean a(afs afs2, int n2, int n3, int n4, int n5) {
        return this.h(afs2, n2, n3, n4, n5) > 0;
    }

    protected int h(afs afs2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = aja.l(n5);
        int n8 = n2 + p.a[n7];
        int n9 = afs2.g(n8, n3, n6 = n4 + p.b[n7], p.d[n7]);
        if (n9 >= 15) {
            return n9;
        }
        return Math.max(n9, afs2.a(n8, n3, n6) == aie.af ? afs2.e(n8, n3, n6) : 0);
    }

    protected int h(agc agc2, int n2, int n3, int n4, int n5) {
        int n6 = aja.l(n5);
        switch (n6) {
            case 0: 
            case 2: {
                return Math.max(this.i(agc2, n2 - 1, n3, n4, 4), this.i(agc2, n2 + 1, n3, n4, 5));
            }
            case 1: 
            case 3: {
                return Math.max(this.i(agc2, n2, n3, n4 + 1, 3), this.i(agc2, n2, n3, n4 - 1, 2));
            }
        }
        return 0;
    }

    protected int i(agc agc2, int n2, int n3, int n4, int n5) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        if (this.a(ahz2)) {
            if (ahz2 == aie.af) {
                return agc2.e(n2, n3, n4);
            }
            return agc2.e(n2, n3, n4, n5);
        }
        return 0;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = ((oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        afs2.a(n2, n3, n4, n5, 3);
        boolean bl2 = this.a(afs2, n2, n3, n4, n5);
        if (bl2) {
            afs2.a(n2, n3, n4, this, 1);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        this.e(afs2, n2, n3, n4);
    }

    protected void e(afs afs2, int n2, int n3, int n4) {
        int n5 = aja.l(afs2.e(n2, n3, n4));
        if (n5 == 1) {
            afs2.e(n2 + 1, n3, n4, this);
            afs2.b(n2 + 1, n3, n4, this, 4);
        }
        if (n5 == 3) {
            afs2.e(n2 - 1, n3, n4, this);
            afs2.b(n2 - 1, n3, n4, this, 5);
        }
        if (n5 == 2) {
            afs2.e(n2, n3, n4 + 1, this);
            afs2.b(n2, n3, n4 + 1, this, 2);
        }
        if (n5 == 0) {
            afs2.e(n2, n3, n4 - 1, this);
            afs2.b(n2, n3, n4 - 1, this, 3);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, int n5) {
        if (this.a) {
            afs2.d(n2 + 1, n3, n4, this);
            afs2.d(n2 - 1, n3, n4, this);
            afs2.d(n2, n3, n4 + 1, this);
            afs2.d(n2, n3, n4 - 1, this);
            afs2.d(n2, n3 - 1, n4, this);
            afs2.d(n2, n3 + 1, n4, this);
        }
        super.b(afs2, n2, n3, n4, n5);
    }

    @Override
    public boolean c() {
        return false;
    }

    protected boolean a(ahz ahz2) {
        return ahz2.f();
    }

    protected int f(agc agc2, int n2, int n3, int n4, int n5) {
        return 15;
    }

    public static boolean d(ahz ahz2) {
        return aie.aR.e(ahz2) || aie.bU.e(ahz2);
    }

    public boolean e(ahz ahz2) {
        return ahz2 == this.e() || ahz2 == this.i();
    }

    public boolean i(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = aja.l(n5);
        if (aja.d(afs2.a(n2 - p.a[n6], n3, n4 - p.b[n6]))) {
            int n7 = afs2.e(n2 - p.a[n6], n3, n4 - p.b[n6]);
            int n8 = aja.l(n7);
            return n8 != n6;
        }
        return false;
    }

    protected int k(int n2) {
        return this.b(n2);
    }

    protected abstract int b(int var1);

    protected abstract aja e();

    protected abstract aja i();

    @Override
    public boolean c(ahz ahz2) {
        return this.e(ahz2);
    }
}

