/*
 * Decompiled with CFR 0.152.
 */
public class akh
extends aht {
    private pw a;

    protected akh() {
        super(avk.d);
        this.a(aak.c);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.a;
        }
        return this.L;
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.e(n2, n3, n4) == 0) {
            return false;
        }
        this.e(afs2, n2, n3, n4);
        return true;
    }

    public void b(afs afs2, int n2, int n3, int n4, abu abu2) {
        if (afs2.E) {
            return;
        }
        aki aki2 = (aki)afs2.o(n2, n3, n4);
        if (aki2 == null) {
            return;
        }
        aki2.a(abu2.m());
        afs2.a(n2, n3, n4, 1, 2);
    }

    public void e(afs afs2, int n2, int n3, int n4) {
        if (afs2.E) {
            return;
        }
        aki aki2 = (aki)afs2.o(n2, n3, n4);
        if (aki2 == null) {
            return;
        }
        abu abu2 = aki2.a();
        if (abu2 == null) {
            return;
        }
        afs2.c(1005, n2, n3, n4, 0);
        afs2.a((String)null, n2, n3, n4);
        aki2.a((abu)null);
        afs2.a(n2, n3, n4, 0, 2);
        float f2 = 0.7f;
        double d2 = (double)(afs2.s.nextFloat() * f2) + (double)(1.0f - f2) * 0.5;
        double d3 = (double)(afs2.s.nextFloat() * f2) + (double)(1.0f - f2) * 0.2 + 0.6;
        double d4 = (double)(afs2.s.nextFloat() * f2) + (double)(1.0f - f2) * 0.5;
        abu abu3 = abu2.m();
        wb wb2 = new wb(afs2, (double)n2 + d2, (double)n3 + d3, (double)n4 + d4, abu3);
        wb2.b = 10;
        afs2.d(wb2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        this.e(afs2, n2, n3, n4);
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        if (afs2.E) {
            return;
        }
        super.a(afs2, n2, n3, n4, n5, f2, 0);
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new aki();
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.a = px2.a(this.N() + "_top");
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        abu abu2 = ((aki)afs2.o(n2, n3, n4)).a();
        return abu2 == null ? 0 : abs.b(abu2.b()) + 1 - abs.b(abv.cd);
    }
}

