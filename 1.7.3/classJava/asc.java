/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asc
extends asj {
    public asc() {
    }

    public asc(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((asn)aua2, list, random, 5, 3, true);
    }

    public static asc a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, n5);
        if (!asc.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new asc(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
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
        this.a(afs2, arm2, 5, 8, 0, 7, 8, 0, aie.bk, aie.bk, false);
        for (n3 = 1; n3 <= 11; n3 += 2) {
            this.a(afs2, arm2, n3, 10, 0, n3, 11, 0, aie.bk, aie.bk, false);
            this.a(afs2, arm2, n3, 10, 12, n3, 11, 12, aie.bk, aie.bk, false);
            this.a(afs2, arm2, 0, 10, n3, 0, 11, n3, aie.bk, aie.bk, false);
            this.a(afs2, arm2, 12, 10, n3, 12, 11, n3, aie.bk, aie.bk, false);
            this.a(afs2, aie.bj, 0, n3, 13, 0, arm2);
            this.a(afs2, aie.bj, 0, n3, 13, 12, arm2);
            this.a(afs2, aie.bj, 0, 0, 13, n3, arm2);
            this.a(afs2, aie.bj, 0, 12, 13, n3, arm2);
            this.a(afs2, aie.bk, 0, n3 + 1, 13, 0, arm2);
            this.a(afs2, aie.bk, 0, n3 + 1, 13, 12, arm2);
            this.a(afs2, aie.bk, 0, 0, 13, n3 + 1, arm2);
            this.a(afs2, aie.bk, 0, 12, 13, n3 + 1, arm2);
        }
        this.a(afs2, aie.bk, 0, 0, 13, 0, arm2);
        this.a(afs2, aie.bk, 0, 0, 13, 12, arm2);
        this.a(afs2, aie.bk, 0, 0, 13, 0, arm2);
        this.a(afs2, aie.bk, 0, 12, 13, 0, arm2);
        for (n3 = 3; n3 <= 9; n3 += 2) {
            this.a(afs2, arm2, 1, 7, n3, 1, 8, n3, aie.bk, aie.bk, false);
            this.a(afs2, arm2, 11, 7, n3, 11, 8, n3, aie.bk, aie.bk, false);
        }
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
        this.a(afs2, arm2, 5, 5, 5, 7, 5, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 1, 6, 6, 4, 6, aie.a, aie.a, false);
        this.a(afs2, aie.bj, 0, 6, 0, 6, arm2);
        this.a(afs2, aie.k, 0, 6, 5, 6, arm2);
        n3 = this.a(6, 6);
        n2 = this.a(5);
        int n4 = this.b(6, 6);
        if (arm2.b(n3, n2, n4)) {
            afs2.d = true;
            aie.k.a(afs2, n3, n2, n4, random);
            afs2.d = false;
        }
        return true;
    }
}

