/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ait
extends aja
implements ajn {
    public ait(boolean bl2) {
        super(bl2);
        this.A = true;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.bS;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.bS;
    }

    @Override
    protected int b(int n2) {
        return 2;
    }

    @Override
    protected aja e() {
        return aie.bV;
    }

    @Override
    protected aja i() {
        return aie.bU;
    }

    @Override
    public int b() {
        return 37;
    }

    @Override
    public pw a(int n2, int n3) {
        boolean bl2;
        boolean bl3 = bl2 = this.a || (n3 & 8) != 0;
        if (n2 == 0) {
            if (bl2) {
                return aie.aA.h(n2);
            }
            return aie.az.h(n2);
        }
        if (n2 == 1) {
            if (bl2) {
                return aie.bV.L;
            }
            return this.L;
        }
        return aie.T.h(1);
    }

    @Override
    protected boolean c(int n2) {
        return this.a || (n2 & 8) != 0;
    }

    @Override
    protected int f(agc agc2, int n2, int n3, int n4, int n5) {
        return this.e(agc2, n2, n3, n4).a();
    }

    private int j(afs afs2, int n2, int n3, int n4, int n5) {
        if (!this.d(n5)) {
            return this.h(afs2, n2, n3, n4, n5);
        }
        return Math.max(this.h(afs2, n2, n3, n4, n5) - this.h((agc)afs2, n2, n3, n4, n5), 0);
    }

    public boolean d(int n2) {
        return (n2 & 4) == 4;
    }

    @Override
    protected boolean a(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = this.h(afs2, n2, n3, n4, n5);
        if (n6 >= 15) {
            return true;
        }
        if (n6 == 0) {
            return false;
        }
        int n7 = this.h((agc)afs2, n2, n3, n4, n5);
        if (n7 == 0) {
            return true;
        }
        return n6 >= n7;
    }

    @Override
    protected int h(afs afs2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = super.h(afs2, n2, n3, n4, n5);
        int n8 = ait.l(n5);
        int n9 = n2 + p.a[n8];
        ahz ahz2 = afs2.a(n9, n3, n6 = n4 + p.b[n8]);
        if (ahz2.M()) {
            n7 = ahz2.g(afs2, n9, n3, n6, p.f[n8]);
        } else if (n7 < 15 && ahz2.r() && (ahz2 = afs2.a(n9 += p.a[n8], n3, n6 += p.b[n8])).M()) {
            n7 = ahz2.g(afs2, n9, n3, n6, p.f[n8]);
        }
        return n7;
    }

    public anq e(agc agc2, int n2, int n3, int n4) {
        return (anq)agc2.o(n2, n3, n4);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        int n6 = afs2.e(n2, n3, n4);
        boolean bl2 = this.a | (n6 & 8) != 0;
        boolean bl3 = !this.d(n6);
        int n7 = bl3 ? 4 : 0;
        afs2.a((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "random.click", 0.3f, bl3 ? 0.55f : 0.5f);
        afs2.a(n2, n3, n4, (n7 |= bl2 ? 8 : 0) | n6 & 3, 2);
        this.c(afs2, n2, n3, n4, afs2.s);
        return true;
    }

    @Override
    protected void b(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        int n5;
        int n6;
        int n7;
        if (!(afs2.a(n2, n3, n4, this) || (n7 = this.j(afs2, n2, n3, n4, n6 = afs2.e(n2, n3, n4))) == (n5 = this.e((agc)afs2, n2, n3, n4).a()) && this.c(n6) == this.a(afs2, n2, n3, n4, n6))) {
            if (this.i(afs2, n2, n3, n4, n6)) {
                afs2.a(n2, n3, n4, this, this.b(0), -1);
            } else {
                afs2.a(n2, n3, n4, this, this.b(0), 0);
            }
        }
    }

    private void c(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4);
        int n6 = this.j(afs2, n2, n3, n4, n5);
        int n7 = this.e((agc)afs2, n2, n3, n4).a();
        this.e((agc)afs2, n2, n3, n4).a(n6);
        if (n7 != n6 || !this.d(n5)) {
            boolean bl2;
            boolean bl3 = this.a(afs2, n2, n3, n4, n5);
            boolean bl4 = bl2 = this.a || (n5 & 8) != 0;
            if (bl2 && !bl3) {
                afs2.a(n2, n3, n4, n5 & 0xFFFFFFF7, 2);
            } else if (!bl2 && bl3) {
                afs2.a(n2, n3, n4, n5 | 8, 2);
            }
            this.e(afs2, n2, n3, n4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (this.a) {
            int n5 = afs2.e(n2, n3, n4);
            afs2.d(n2, n3, n4, this.i(), n5 | 8, 4);
        }
        this.c(afs2, n2, n3, n4, random);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        afs2.a(n2, n3, n4, this.a(afs2, 0));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        super.a(afs2, n2, n3, n4, ahz2, n5);
        afs2.p(n2, n3, n4);
        this.e(afs2, n2, n3, n4);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        super.a(afs2, n2, n3, n4, n5, n6);
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 != null) {
            return ani2.c(n5, n6);
        }
        return false;
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anq();
    }
}

