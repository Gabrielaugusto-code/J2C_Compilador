/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atd
extends ats {
    private static final po[] a = new po[]{new po(abv.bi, 0, 1, 1, 10), new po(abv.i, 0, 1, 3, 3), new po(abv.j, 0, 1, 5, 10), new po(abv.k, 0, 1, 3, 5), new po(abv.ax, 0, 4, 9, 5), new po(abv.P, 0, 1, 3, 15), new po(abv.e, 0, 1, 3, 15), new po(abv.b, 0, 1, 1, 5), new po(abv.l, 0, 1, 1, 5), new po(abv.Z, 0, 1, 1, 5), new po(abv.Y, 0, 1, 1, 5), new po(abv.aa, 0, 1, 1, 5), new po(abv.ab, 0, 1, 1, 5), new po(abv.ao, 0, 1, 1, 1), new po(abv.av, 0, 1, 1, 1), new po(abv.bX, 0, 1, 1, 1), new po(abv.bY, 0, 1, 1, 1), new po(abv.bZ, 0, 1, 1, 1)};
    private boolean b;

    public atd() {
    }

    public atd(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
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
    public void a(aua aua2, List list, Random random) {
        this.a((atp)aua2, list, random, 1, 1);
    }

    public static atd a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, n5);
        if (!atd.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atd(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 4, 4, 6, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 1, 1, 0);
        this.a(afs2, random, arm2, att.a, 1, 1, 6);
        this.a(afs2, arm2, 3, 1, 2, 3, 1, 4, aie.aV, aie.aV, false);
        this.a(afs2, aie.U, 5, 3, 1, 1, arm2);
        this.a(afs2, aie.U, 5, 3, 1, 5, arm2);
        this.a(afs2, aie.U, 5, 3, 2, 2, arm2);
        this.a(afs2, aie.U, 5, 3, 2, 4, arm2);
        for (n2 = 2; n2 <= 4; ++n2) {
            this.a(afs2, aie.U, 5, 2, 1, n2, arm2);
        }
        if (!this.b) {
            int n3;
            n2 = this.a(2);
            int n4 = this.a(3, 3);
            if (arm2.b(n4, n2, n3 = this.b(3, 3))) {
                this.b = true;
                this.a(afs2, arm2, random, 3, 2, 3, po.a(a, abv.bR.b(random)), 2 + random.nextInt(2));
            }
        }
        return true;
    }
}

