/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ams
extends ahz {
    private pw a;
    private pw b;

    public ams() {
        super(avk.u);
        this.a(aak.d);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 0) {
            return this.b;
        }
        if (n2 == 1) {
            return this.a;
        }
        return this.L;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        if (afs2.v(n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, 1);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (afs2.v(n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, 1);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public int a(Random random) {
        return 1;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, afn afn2) {
        if (afs2.E) {
            return;
        }
        wn wn2 = new wn(afs2, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, afn2.c());
        wn2.a = afs2.s.nextInt(wn2.a / 4) + wn2.a / 8;
        afs2.d(wn2);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, int n5) {
        this.a(afs2, n2, n3, n4, n5, (rm)null);
    }

    public void a(afs afs2, int n2, int n3, int n4, int n5, rm rm2) {
        if (afs2.E) {
            return;
        }
        if ((n5 & 1) == 1) {
            wn wn2 = new wn(afs2, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, rm2);
            afs2.d(wn2);
            afs2.a(wn2, "game.tnt.primed", 1.0f, 1.0f);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (xq2.bE() != null && xq2.bE().b() == abv.d) {
            this.a(afs2, n2, n3, n4, 1, (rm)xq2);
            afs2.f(n2, n3, n4);
            xq2.bE().a(1, (rm)xq2);
            return true;
        }
        return super.a(afs2, n2, n3, n4, xq2, n5, f2, f3, f4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        xt xt2;
        if (qr2 instanceof xt && !afs2.E && (xt2 = (xt)qr2).ak()) {
            this.a(afs2, n2, n3, n4, 1, xt2.c instanceof rm ? (rm)xt2.c : null);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public boolean a(afn afn2) {
        return false;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.a = px2.a(this.N() + "_top");
        this.b = px2.a(this.N() + "_bottom");
    }
}

