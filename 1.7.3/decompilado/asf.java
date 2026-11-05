/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asf
extends asj {
    public asf() {
    }

    public asf(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((asn)aua2, list, random, 1, 0, true);
    }

    public static asf a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, n5);
        if (!asf.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new asf(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        this.a(afs2, arm2, 0, 0, 0, 4, 1, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 4, 5, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 2, 0, 0, 5, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 4, 2, 0, 4, 5, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 3, 1, 0, 4, 1, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 3, 3, 0, 4, 3, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 4, 3, 1, 4, 4, 1, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 4, 3, 3, 4, 4, 3, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 6, 0, 4, 6, 4, aie.bj, aie.bj, false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(afs2, aie.bj, 0, i2, -1, i3, arm2);
            }
        }
        return true;
    }
}

