/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ash
extends asj {
    public ash() {
    }

    public ash(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((asn)aua2, list, random, 5, 3, true);
        this.a((asn)aua2, list, random, 5, 11, true);
    }

    public static ash a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, n5);
        if (!ash.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new ash(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        this.a(afs2, arm2, 0, 3, 0, 12, 4, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 5, 0, 12, 13, 12, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 5, 0, 1, 12, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 11, 5, 0, 12, 12, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 5, 11, 4, 12, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 8, 5, 11, 10, 12, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 5, 9, 11, 7, 12, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 5, 0, 4, 12, 1, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 8, 5, 0, 10, 12, 1, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 5, 9, 0, 7, 12, 1, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 11, 2, 10, 12, 10, aie.bj, aie.bj, false);
        for (n6 = 1; n6 <= 11; n6 += 2) {
            this.a(afs2, arm2, n6, 10, 0, n6, 11, 0, aie.bk, aie.bk, false);
            this.a(afs2, arm2, n6, 10, 12, n6, 11, 12, aie.bk, aie.bk, false);
            this.a(afs2, arm2, 0, 10, n6, 0, 11, n6, aie.bk, aie.bk, false);
            this.a(afs2, arm2, 12, 10, n6, 12, 11, n6, aie.bk, aie.bk, false);
            this.a(afs2, aie.bj, 0, n6, 13, 0, arm2);
            this.a(afs2, aie.bj, 0, n6, 13, 12, arm2);
            this.a(afs2, aie.bj, 0, 0, 13, n6, arm2);
            this.a(afs2, aie.bj, 0, 12, 13, n6, arm2);
            this.a(afs2, aie.bk, 0, n6 + 1, 13, 0, arm2);
            this.a(afs2, aie.bk, 0, n6 + 1, 13, 12, arm2);
            this.a(afs2, aie.bk, 0, 0, 13, n6 + 1, arm2);
            this.a(afs2, aie.bk, 0, 12, 13, n6 + 1, arm2);
        }
        this.a(afs2, aie.bk, 0, 0, 13, 0, arm2);
        this.a(afs2, aie.bk, 0, 0, 13, 12, arm2);
        this.a(afs2, aie.bk, 0, 0, 13, 0, arm2);
        this.a(afs2, aie.bk, 0, 12, 13, 0, arm2);
        for (n6 = 3; n6 <= 9; n6 += 2) {
            this.a(afs2, arm2, 1, 7, n6, 1, 8, n6, aie.bk, aie.bk, false);
            this.a(afs2, arm2, 11, 7, n6, 11, 8, n6, aie.bk, aie.bk, false);
        }
        n6 = this.a(aie.bl, 3);
        for (n5 = 0; n5 <= 6; ++n5) {
            n4 = n5 + 4;
            for (n3 = 5; n3 <= 7; ++n3) {
                this.a(afs2, aie.bl, n6, n3, 5 + n5, n4, arm2);
            }
            if (n4 >= 5 && n4 <= 8) {
                this.a(afs2, arm2, 5, 5, n4, 7, n5 + 4, n4, aie.bj, aie.bj, false);
            } else if (n4 >= 9 && n4 <= 10) {
                this.a(afs2, arm2, 5, 8, n4, 7, n5 + 4, n4, aie.bj, aie.bj, false);
            }
            if (n5 < 1) continue;
            this.a(afs2, arm2, 5, 6 + n5, n4, 7, 9 + n5, n4, aie.a, aie.a, false);
        }
        for (n5 = 5; n5 <= 7; ++n5) {
            this.a(afs2, aie.bl, n6, n5, 12, 11, arm2);
        }
        this.a(afs2, arm2, 5, 6, 7, 5, 7, 7, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 7, 6, 7, 7, 7, 7, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 5, 13, 12, 7, 13, 12, aie.a, aie.a, false);
        this.a(afs2, arm2, 2, 5, 2, 3, 5, 3, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 5, 9, 3, 5, 10, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 5, 4, 2, 5, 8, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 9, 5, 2, 10, 5, 3, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 9, 5, 9, 10, 5, 10, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 10, 5, 4, 10, 5, 8, aie.bj, aie.bj, false);
        n5 = this.a(aie.bl, 0);
        n4 = this.a(aie.bl, 1);
        this.a(afs2, aie.bl, n4, 4, 5, 2, arm2);
        this.a(afs2, aie.bl, n4, 4, 5, 3, arm2);
        this.a(afs2, aie.bl, n4, 4, 5, 9, arm2);
        this.a(afs2, aie.bl, n4, 4, 5, 10, arm2);
        this.a(afs2, aie.bl, n5, 8, 5, 2, arm2);
        this.a(afs2, aie.bl, n5, 8, 5, 3, arm2);
        this.a(afs2, aie.bl, n5, 8, 5, 9, arm2);
        this.a(afs2, aie.bl, n5, 8, 5, 10, arm2);
        this.a(afs2, arm2, 3, 4, 4, 4, 4, 8, aie.aM, aie.aM, false);
        this.a(afs2, arm2, 8, 4, 4, 9, 4, 8, aie.aM, aie.aM, false);
        this.a(afs2, arm2, 3, 5, 4, 4, 5, 8, aie.bm, aie.bm, false);
        this.a(afs2, arm2, 8, 5, 4, 9, 5, 8, aie.bm, aie.bm, false);
        this.a(afs2, arm2, 4, 2, 0, 8, 2, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 4, 12, 2, 8, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 4, 0, 0, 8, 1, 3, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 4, 0, 9, 8, 1, 12, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 0, 4, 3, 1, 8, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 9, 0, 4, 12, 1, 8, aie.bj, aie.bj, false);
        for (n3 = 4; n3 <= 8; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(afs2, aie.bj, 0, n3, -1, n2, arm2);
                this.b(afs2, aie.bj, 0, n3, -1, 12 - n2, arm2);
            }
        }
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 4; n2 <= 8; ++n2) {
                this.b(afs2, aie.bj, 0, n3, -1, n2, arm2);
                this.b(afs2, aie.bj, 0, 12 - n3, -1, n2, arm2);
            }
        }
        return true;
    }
}

