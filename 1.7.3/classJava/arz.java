/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class arz
extends asj {
    public arz() {
    }

    public arz(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((asn)aua2, list, random, 1, 3, false);
    }

    public static arz a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -3, 0, 5, 10, 19, n5);
        if (!arz.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new arz(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        this.a(afs2, arm2, 0, 3, 0, 4, 4, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 5, 0, 3, 7, 18, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 5, 0, 0, 5, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 4, 5, 0, 4, 5, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 4, 2, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 13, 4, 2, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 0, 0, 4, 1, 3, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 0, 15, 4, 1, 18, aie.bj, aie.bj, false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 2; ++i3) {
                this.b(afs2, aie.bj, 0, i2, -1, i3, arm2);
                this.b(afs2, aie.bj, 0, i2, -1, 18 - i3, arm2);
            }
        }
        this.a(afs2, arm2, 0, 1, 1, 0, 4, 1, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 3, 4, 0, 4, 4, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 3, 14, 0, 4, 14, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 1, 17, 0, 4, 17, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 4, 1, 1, 4, 4, 1, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 4, 3, 4, 4, 4, 4, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 4, 3, 14, 4, 4, 14, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 4, 1, 17, 4, 4, 17, aie.bk, aie.bk, false);
        return true;
    }
}

