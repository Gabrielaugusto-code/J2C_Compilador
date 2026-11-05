/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asm
extends asj {
    public asm() {
    }

    public asm(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.c((asn)aua2, list, random, 6, 2, false);
    }

    public static asm a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -2, 0, 0, 7, 11, 7, n5);
        if (!asm.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new asm(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        this.a(afs2, arm2, 0, 0, 0, 6, 1, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 0, 6, 10, 6, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 2, 0, 1, 8, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 5, 2, 0, 6, 8, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 2, 1, 0, 8, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 2, 1, 6, 8, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 2, 6, 5, 8, 6, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 3, 2, 0, 5, 4, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 6, 3, 2, 6, 5, 2, aie.bk, aie.bk, false);
        this.a(afs2, arm2, 6, 3, 4, 6, 5, 4, aie.bk, aie.bk, false);
        this.a(afs2, aie.bj, 0, 5, 2, 5, arm2);
        this.a(afs2, arm2, 4, 2, 5, 4, 3, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 3, 2, 5, 3, 4, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 2, 5, 2, 5, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 2, 5, 1, 6, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 1, 7, 1, 5, 7, 4, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 6, 8, 2, 6, 8, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 2, 6, 0, 4, 8, 0, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 2, 5, 0, 4, 5, 0, aie.bk, aie.bk, false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(afs2, aie.bj, 0, i2, -1, i3, arm2);
            }
        }
        return true;
    }
}

