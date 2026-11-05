/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asl
extends asj {
    public asl() {
    }

    public asl(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((asn)aua2, list, random, 2, 0, false);
        this.b((asn)aua2, list, random, 0, 2, false);
        this.c((asn)aua2, list, random, 0, 2, false);
    }

    public static asl a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -2, 0, 0, 7, 9, 7, n5);
        if (!asl.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new asl(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        this.a(afs2, arm2, 0, 0, 0, 6, 1, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 6, 7, 6, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 2, 0, 1, 6, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 6, 1, 6, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 5, 2, 0, 6, 6, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 5, 2, 6, 6, 6, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 0, 6, 1, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 5, 0, 6, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 2, 0, 6, 6, 1, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 2, 5, 6, 6, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 6, 0, 4, 6, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 5, 0, 4, 5, 0, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 2, 6, 6, 4, 6, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 5, 6, 4, 5, 6, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 0, 6, 2, 0, 6, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 5, 2, 0, 5, 4, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 6, 6, 2, 6, 6, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 5, 2, 6, 5, 4, aie.bk, aie.bk, false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(afs2, aie.bj, 0, i2, -1, i3, arm2);
            }
        }
        return true;
    }
}

