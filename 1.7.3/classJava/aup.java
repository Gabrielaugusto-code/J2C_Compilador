/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aup
extends aut {
    private static final po[] a = new po[]{new po(abv.i, 0, 1, 3, 3), new po(abv.j, 0, 1, 5, 10), new po(abv.k, 0, 1, 3, 5), new po(abv.P, 0, 1, 3, 15), new po(abv.e, 0, 1, 3, 15), new po(abv.b, 0, 1, 1, 5), new po(abv.l, 0, 1, 1, 5), new po(abv.Z, 0, 1, 1, 5), new po(abv.Y, 0, 1, 1, 5), new po(abv.aa, 0, 1, 1, 5), new po(abv.ab, 0, 1, 1, 5), new po(abs.a(aie.Z), 0, 3, 7, 5), new po(abs.a(aie.g), 0, 3, 7, 5), new po(abv.av, 0, 1, 1, 3), new po(abv.bX, 0, 1, 1, 1), new po(abv.bY, 0, 1, 1, 1), new po(abv.bZ, 0, 1, 1, 1)};
    private boolean b;

    public aup() {
    }

    public aup(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
    }

    public static aup a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 10, 6, 7, n5);
        if (!aup.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new aup(auq2, n6, random, arm2, n5);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Chest", this.b);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.b = dg2.n("Chest");
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 6 - 1, 0);
        }
        this.a(afs2, arm2, 0, 1, 0, 9, 4, 6, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 0, 0, 9, 0, 6, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 4, 0, 9, 4, 6, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 5, 0, 9, 5, 6, aie.U, aie.U, false);
        this.a(afs2, arm2, 1, 5, 1, 8, 5, 5, aie.a, aie.a, false);
        this.a(afs2, arm2, 1, 1, 0, 2, 3, 0, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 1, 0, 0, 4, 0, aie.r, aie.r, false);
        this.a(afs2, arm2, 3, 1, 0, 3, 4, 0, aie.r, aie.r, false);
        this.a(afs2, arm2, 0, 1, 6, 0, 4, 6, aie.r, aie.r, false);
        this.a(afs2, aie.f, 0, 3, 3, 1, arm2);
        this.a(afs2, arm2, 3, 1, 2, 3, 3, 2, aie.f, aie.f, false);
        this.a(afs2, arm2, 4, 1, 3, 5, 3, 3, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 1, 1, 0, 3, 5, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 1, 6, 5, 3, 6, aie.f, aie.f, false);
        this.a(afs2, arm2, 5, 1, 0, 5, 3, 0, aie.aJ, aie.aJ, false);
        this.a(afs2, arm2, 9, 1, 0, 9, 3, 0, aie.aJ, aie.aJ, false);
        this.a(afs2, arm2, 6, 1, 4, 9, 4, 6, aie.e, aie.e, false);
        this.a(afs2, aie.k, 0, 7, 1, 5, arm2);
        this.a(afs2, aie.k, 0, 8, 1, 5, arm2);
        this.a(afs2, aie.aY, 0, 9, 2, 5, arm2);
        this.a(afs2, aie.aY, 0, 9, 2, 4, arm2);
        this.a(afs2, arm2, 7, 2, 4, 8, 2, 5, aie.a, aie.a, false);
        this.a(afs2, aie.e, 0, 6, 1, 3, arm2);
        this.a(afs2, aie.al, 0, 6, 2, 3, arm2);
        this.a(afs2, aie.al, 0, 6, 3, 3, arm2);
        this.a(afs2, aie.T, 0, 8, 1, 1, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 4, arm2);
        this.a(afs2, aie.aZ, 0, 2, 2, 6, arm2);
        this.a(afs2, aie.aZ, 0, 4, 2, 6, arm2);
        this.a(afs2, aie.aJ, 0, 2, 1, 4, arm2);
        this.a(afs2, aie.aw, 0, 2, 2, 4, arm2);
        this.a(afs2, aie.f, 0, 1, 1, 5, arm2);
        this.a(afs2, aie.ad, this.a(aie.ad, 3), 2, 1, 5, arm2);
        this.a(afs2, aie.ad, this.a(aie.ad, 1), 1, 1, 4, arm2);
        if (!this.b) {
            int n4;
            n3 = this.a(1);
            n2 = this.a(5, 5);
            if (arm2.b(n2, n3, n4 = this.b(5, 5))) {
                this.b = true;
                this.a(afs2, arm2, random, 5, 1, 5, a, 3 + random.nextInt(6));
            }
        }
        for (n3 = 6; n3 <= 8; ++n3) {
            if (this.a(afs2, n3, 0, -1, arm2).o() != avk.a || this.a(afs2, n3, -1, -1, arm2).o() == avk.a) continue;
            this.a(afs2, aie.ar, this.a(aie.ar, 3), n3, 0, -1, arm2);
        }
        for (n3 = 0; n3 < 7; ++n3) {
            for (n2 = 0; n2 < 10; ++n2) {
                this.b(afs2, n2, 6, n3, arm2);
                this.b(afs2, aie.e, 0, n2, -1, n3, arm2);
            }
        }
        this.a(afs2, arm2, 7, 1, 1, 1);
        return true;
    }

    @Override
    protected int b(int n2) {
        return 3;
    }
}

