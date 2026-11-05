/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ase
extends asj {
    private boolean b;

    public ase() {
    }

    public ase(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
        this.b = random.nextInt(3) == 0;
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.b = dg2.n("Chest");
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Chest", this.b);
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.b((asn)aua2, list, random, 0, 1, true);
    }

    public static ase a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, n5);
        if (!ase.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new ase(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        this.a(afs2, arm2, 0, 0, 0, 4, 1, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 4, 5, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 4, 2, 0, 4, 5, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 4, 3, 1, 4, 4, 1, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 4, 3, 3, 4, 4, 3, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 2, 0, 0, 5, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 4, 3, 5, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 3, 4, 1, 4, 4, aie.bk, aie.bj, false);
        this.a(afs2, arm2, 3, 3, 4, 3, 4, 4, aie.bk, aie.bj, false);
        if (this.b) {
            int n4;
            n3 = this.a(2);
            n2 = this.a(3, 3);
            if (arm2.b(n2, n3, n4 = this.b(3, 3))) {
                this.b = false;
                this.a(afs2, arm2, random, 3, 2, 3, a, 2 + random.nextInt(4));
            }
        }
        this.a(afs2, arm2, 0, 6, 0, 4, 6, 4, aie.bj, aie.bj, false);
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 0; n2 <= 4; ++n2) {
                this.b(afs2, aie.bj, 0, n3, -1, n2, arm2);
            }
        }
        return true;
    }
}

