/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asa
extends asj {
    public asa() {
    }

    public asa(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((asn)aua2, list, random, 1, 0, true);
    }

    public static asa a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -7, 0, 5, 14, 10, n5);
        if (!asa.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new asa(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2 = this.a(aie.bl, 2);
        for (int i2 = 0; i2 <= 9; ++i2) {
            int n3 = Math.max(1, 7 - i2);
            int n4 = Math.min(Math.max(n3 + 5, 14 - i2), 13);
            int n5 = i2;
            this.a(afs2, arm2, 0, 0, n5, 4, n3, n5, aie.bj, aie.bj, false);
            this.a(afs2, arm2, 1, n3 + 1, n5, 3, n4 - 1, n5, aie.a, aie.a, false);
            if (i2 <= 6) {
                this.a(afs2, aie.bl, n2, 1, n3 + 1, n5, arm2);
                this.a(afs2, aie.bl, n2, 2, n3 + 1, n5, arm2);
                this.a(afs2, aie.bl, n2, 3, n3 + 1, n5, arm2);
            }
            this.a(afs2, arm2, 0, n4, n5, 4, n4, n5, aie.bj, aie.bj, false);
            this.a(afs2, arm2, 0, n3 + 1, n5, 0, n4 - 1, n5, aie.bj, aie.bj, false);
            this.a(afs2, arm2, 4, n3 + 1, n5, 4, n4 - 1, n5, aie.bj, aie.bj, false);
            if ((i2 & 1) == 0) {
                this.a(afs2, arm2, 0, n3 + 2, n5, 0, n3 + 3, n5, aie.bk, aie.bk, false);
                this.a(afs2, arm2, 4, n3 + 2, n5, 4, n3 + 3, n5, aie.bk, aie.bk, false);
            }
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(afs2, aie.bj, 0, i3, -1, n5, arm2);
            }
        }
        return true;
    }
}

