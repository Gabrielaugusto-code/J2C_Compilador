/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asb
extends asj {
    public asb() {
    }

    public asb(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        int n2 = 1;
        if (this.g == 1 || this.g == 2) {
            n2 = 5;
        }
        this.b((asn)aua2, list, random, 0, n2, random.nextInt(8) > 0);
        this.c((asn)aua2, list, random, 0, n2, random.nextInt(8) > 0);
    }

    public static asb a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -3, 0, 0, 9, 7, 9, n5);
        if (!asb.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new asb(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        this.a(afs2, arm2, 0, 0, 0, 8, 1, 8, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 8, 5, 8, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 6, 0, 8, 6, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 2, 5, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 2, 0, 8, 5, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 3, 0, 1, 4, 0, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 7, 3, 0, 7, 4, 0, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 2, 4, 8, 2, 8, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 1, 4, 2, 2, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 6, 1, 4, 7, 2, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 3, 8, 8, 3, 8, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 3, 6, 0, 3, 7, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 8, 3, 6, 8, 3, 7, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 3, 4, 0, 5, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 8, 3, 4, 8, 5, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 3, 5, 2, 5, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 3, 5, 7, 5, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 4, 5, 1, 5, 5, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 7, 4, 5, 7, 5, 5, aie.bk, aie.bk, false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 8; ++i3) {
                this.b(afs2, aie.bj, 0, i3, -1, i2, arm2);
            }
        }
        return true;
    }
}

