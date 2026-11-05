/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ath
extends ats {
    private static final po[] a = new po[]{new po(abv.aG, 0, 1, 3, 20), new po(abv.aF, 0, 2, 7, 20), new po(abv.bJ, 0, 1, 1, 1), new po(abv.aL, 0, 1, 1, 1)};
    private boolean b;

    public ath() {
    }

    public ath(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
        this.b = arm2.c() > 6;
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Tall", this.b);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.b = dg2.n("Tall");
    }

    public static ath a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -4, -1, 0, 14, 11, 15, n5);
        if (!(ath.a(arm2) && aua.a(list, arm2) == null || ath.a(arm2 = arm.a(n2, n3, n4, -4, -1, 0, 14, 6, 15, n5)) && aua.a(list, arm2) == null)) {
            return null;
        }
        return new ath(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        if (this.a(afs2, arm2)) {
            return false;
        }
        int n3 = 11;
        if (!this.b) {
            n3 = 6;
        }
        this.a(afs2, arm2, 0, 0, 0, 13, n3 - 1, 14, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 4, 1, 0);
        this.a(afs2, arm2, random, 0.07f, 2, 1, 1, 11, 4, 13, aie.G, aie.G, false);
        boolean bl2 = true;
        int n4 = 12;
        for (n2 = 1; n2 <= 13; ++n2) {
            if ((n2 - 1) % 4 == 0) {
                this.a(afs2, arm2, 1, 1, n2, 1, 4, n2, aie.f, aie.f, false);
                this.a(afs2, arm2, 12, 1, n2, 12, 4, n2, aie.f, aie.f, false);
                this.a(afs2, aie.aa, 0, 2, 3, n2, arm2);
                this.a(afs2, aie.aa, 0, 11, 3, n2, arm2);
                if (!this.b) continue;
                this.a(afs2, arm2, 1, 6, n2, 1, 9, n2, aie.f, aie.f, false);
                this.a(afs2, arm2, 12, 6, n2, 12, 9, n2, aie.f, aie.f, false);
                continue;
            }
            this.a(afs2, arm2, 1, 1, n2, 1, 4, n2, aie.X, aie.X, false);
            this.a(afs2, arm2, 12, 1, n2, 12, 4, n2, aie.X, aie.X, false);
            if (!this.b) continue;
            this.a(afs2, arm2, 1, 6, n2, 1, 9, n2, aie.X, aie.X, false);
            this.a(afs2, arm2, 12, 6, n2, 12, 9, n2, aie.X, aie.X, false);
        }
        for (n2 = 3; n2 < 12; n2 += 2) {
            this.a(afs2, arm2, 3, 1, n2, 4, 3, n2, aie.X, aie.X, false);
            this.a(afs2, arm2, 6, 1, n2, 7, 3, n2, aie.X, aie.X, false);
            this.a(afs2, arm2, 9, 1, n2, 10, 3, n2, aie.X, aie.X, false);
        }
        if (this.b) {
            this.a(afs2, arm2, 1, 5, 1, 3, 5, 13, aie.f, aie.f, false);
            this.a(afs2, arm2, 10, 5, 1, 12, 5, 13, aie.f, aie.f, false);
            this.a(afs2, arm2, 4, 5, 1, 9, 5, 2, aie.f, aie.f, false);
            this.a(afs2, arm2, 4, 5, 12, 9, 5, 13, aie.f, aie.f, false);
            this.a(afs2, aie.f, 0, 9, 5, 11, arm2);
            this.a(afs2, aie.f, 0, 8, 5, 11, arm2);
            this.a(afs2, aie.f, 0, 9, 5, 10, arm2);
            this.a(afs2, arm2, 3, 6, 2, 3, 6, 12, aie.aJ, aie.aJ, false);
            this.a(afs2, arm2, 10, 6, 2, 10, 6, 10, aie.aJ, aie.aJ, false);
            this.a(afs2, arm2, 4, 6, 2, 9, 6, 2, aie.aJ, aie.aJ, false);
            this.a(afs2, arm2, 4, 6, 12, 8, 6, 12, aie.aJ, aie.aJ, false);
            this.a(afs2, aie.aJ, 0, 9, 6, 11, arm2);
            this.a(afs2, aie.aJ, 0, 8, 6, 11, arm2);
            this.a(afs2, aie.aJ, 0, 9, 6, 10, arm2);
            n2 = this.a(aie.ap, 3);
            this.a(afs2, aie.ap, n2, 10, 1, 13, arm2);
            this.a(afs2, aie.ap, n2, 10, 2, 13, arm2);
            this.a(afs2, aie.ap, n2, 10, 3, 13, arm2);
            this.a(afs2, aie.ap, n2, 10, 4, 13, arm2);
            this.a(afs2, aie.ap, n2, 10, 5, 13, arm2);
            this.a(afs2, aie.ap, n2, 10, 6, 13, arm2);
            this.a(afs2, aie.ap, n2, 10, 7, 13, arm2);
            int n5 = 7;
            int n6 = 7;
            this.a(afs2, aie.aJ, 0, n5 - 1, 9, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5, 9, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5 - 1, 8, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5, 8, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5 - 1, 7, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5, 7, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5 - 2, 7, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5 + 1, 7, n6, arm2);
            this.a(afs2, aie.aJ, 0, n5 - 1, 7, n6 - 1, arm2);
            this.a(afs2, aie.aJ, 0, n5 - 1, 7, n6 + 1, arm2);
            this.a(afs2, aie.aJ, 0, n5, 7, n6 - 1, arm2);
            this.a(afs2, aie.aJ, 0, n5, 7, n6 + 1, arm2);
            this.a(afs2, aie.aa, 0, n5 - 2, 8, n6, arm2);
            this.a(afs2, aie.aa, 0, n5 + 1, 8, n6, arm2);
            this.a(afs2, aie.aa, 0, n5 - 1, 8, n6 - 1, arm2);
            this.a(afs2, aie.aa, 0, n5 - 1, 8, n6 + 1, arm2);
            this.a(afs2, aie.aa, 0, n5, 8, n6 - 1, arm2);
            this.a(afs2, aie.aa, 0, n5, 8, n6 + 1, arm2);
        }
        this.a(afs2, arm2, random, 3, 3, 5, po.a(a, abv.bR.a(random, 1, 5, 2)), 1 + random.nextInt(4));
        if (this.b) {
            this.a(afs2, aie.a, 0, 12, 9, 1, arm2);
            this.a(afs2, arm2, random, 12, 8, 1, po.a(a, abv.bR.a(random, 1, 5, 2)), 1 + random.nextInt(4));
        }
        return true;
    }
}

