/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asi
extends asj {
    private boolean b;

    public asi() {
    }

    public asi(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.b = dg2.n("Mob");
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Mob", this.b);
    }

    public static asi a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -2, 0, 0, 7, 8, 9, n5);
        if (!asi.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new asi(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        this.a(afs2, arm2, 0, 2, 0, 6, 7, 7, aie.a, aie.a, false);
        this.a(afs2, arm2, 1, 0, 0, 5, 1, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 2, 1, 5, 2, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 3, 2, 5, 3, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 4, 3, 5, 4, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 2, 0, 1, 4, 2, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 5, 2, 0, 5, 4, 2, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 5, 2, 1, 5, 3, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 5, 5, 2, 5, 5, 3, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 5, 3, 0, 5, 8, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 5, 3, 6, 5, 8, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 5, 8, 5, 5, 8, aie.bj, aie.bj, false);
        this.a(afs2, aie.bk, 0, 1, 6, 3, arm2);
        this.a(afs2, aie.bk, 0, 5, 6, 3, arm2);
        this.a(afs2, arm2, 0, 6, 3, 0, 6, 8, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 6, 6, 3, 6, 6, 8, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 1, 6, 8, 5, 7, 8, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 2, 8, 8, 4, 8, 8, aie.bk, aie.bk, false);
        if (!this.b) {
            int n4;
            n3 = this.a(5);
            n2 = this.a(3, 5);
            if (arm2.b(n2, n3, n4 = this.b(3, 5))) {
                this.b = true;
                afs2.d(n2, n3, n4, aie.ac, 0, 2);
                aoa aoa2 = (aoa)afs2.o(n2, n3, n4);
                if (aoa2 != null) {
                    aoa2.a().a("Blaze");
                }
            }
        }
        for (n3 = 0; n3 <= 6; ++n3) {
            for (n2 = 0; n2 <= 6; ++n2) {
                this.b(afs2, aie.bj, 0, n3, -1, n2, arm2);
            }
        }
        return true;
    }
}

