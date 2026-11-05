/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class asw
extends asv {
    private boolean e;

    public asw() {
    }

    public asw(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 5, 9);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Witch", this.e);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.e = dg2.n("Witch");
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        int n4;
        if (!this.a(afs2, arm2, 0)) {
            return false;
        }
        this.a(afs2, arm2, 1, 1, 1, 5, 1, 7, aie.f, 1, aie.f, 1, false);
        this.a(afs2, arm2, 1, 4, 2, 5, 4, 7, aie.f, 1, aie.f, 1, false);
        this.a(afs2, arm2, 2, 1, 0, 4, 1, 0, aie.f, 1, aie.f, 1, false);
        this.a(afs2, arm2, 2, 2, 2, 3, 3, 2, aie.f, 1, aie.f, 1, false);
        this.a(afs2, arm2, 1, 2, 3, 1, 3, 6, aie.f, 1, aie.f, 1, false);
        this.a(afs2, arm2, 5, 2, 3, 5, 3, 6, aie.f, 1, aie.f, 1, false);
        this.a(afs2, arm2, 2, 2, 7, 4, 3, 7, aie.f, 1, aie.f, 1, false);
        this.a(afs2, arm2, 1, 0, 2, 1, 3, 2, aie.r, aie.r, false);
        this.a(afs2, arm2, 5, 0, 2, 5, 3, 2, aie.r, aie.r, false);
        this.a(afs2, arm2, 1, 0, 7, 1, 3, 7, aie.r, aie.r, false);
        this.a(afs2, arm2, 5, 0, 7, 5, 3, 7, aie.r, aie.r, false);
        this.a(afs2, aie.aJ, 0, 2, 3, 2, arm2);
        this.a(afs2, aie.aJ, 0, 3, 3, 7, arm2);
        this.a(afs2, aie.a, 0, 1, 3, 4, arm2);
        this.a(afs2, aie.a, 0, 5, 3, 4, arm2);
        this.a(afs2, aie.a, 0, 5, 3, 5, arm2);
        this.a(afs2, aie.bL, 7, 1, 3, 5, arm2);
        this.a(afs2, aie.ai, 0, 3, 2, 6, arm2);
        this.a(afs2, aie.bp, 0, 4, 2, 6, arm2);
        this.a(afs2, aie.aJ, 0, 1, 2, 1, arm2);
        this.a(afs2, aie.aJ, 0, 5, 2, 1, arm2);
        int n5 = this.a(aie.ad, 3);
        int n6 = this.a(aie.ad, 1);
        int n7 = this.a(aie.ad, 0);
        int n8 = this.a(aie.ad, 2);
        this.a(afs2, arm2, 0, 4, 1, 6, 4, 1, aie.bF, n5, aie.bF, n5, false);
        this.a(afs2, arm2, 0, 4, 2, 0, 4, 7, aie.bF, n7, aie.bF, n7, false);
        this.a(afs2, arm2, 6, 4, 2, 6, 4, 7, aie.bF, n6, aie.bF, n6, false);
        this.a(afs2, arm2, 0, 4, 8, 6, 4, 8, aie.bF, n8, aie.bF, n8, false);
        for (n4 = 2; n4 <= 7; n4 += 5) {
            for (n3 = 1; n3 <= 5; n3 += 4) {
                this.b(afs2, aie.r, 0, n3, -1, n4, arm2);
            }
        }
        if (!this.e && arm2.b(n4 = this.a(2, 5), n3 = this.a(2), n2 = this.b(2, 5))) {
            this.e = true;
            xg xg2 = new xg(afs2);
            xg2.b((double)n4 + 0.5, n3, (double)n2 + 0.5, 0.0f, 0.0f);
            xg2.a((rp)null);
            afs2.d(xg2);
        }
        return true;
    }
}

