/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class auo
extends aut {
    public auo() {
    }

    public auo(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
    }

    public static auo a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 5, 12, 9, n5);
        if (!auo.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new auo(auq2, n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 12 - 1, 0);
        }
        this.a(afs2, arm2, 1, 1, 1, 3, 3, 7, aie.a, aie.a, false);
        this.a(afs2, arm2, 1, 5, 1, 3, 9, 3, aie.a, aie.a, false);
        this.a(afs2, arm2, 1, 0, 0, 3, 0, 8, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 1, 0, 3, 10, 0, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 1, 1, 0, 10, 3, aie.e, aie.e, false);
        this.a(afs2, arm2, 4, 1, 1, 4, 10, 3, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 0, 4, 0, 4, 7, aie.e, aie.e, false);
        this.a(afs2, arm2, 4, 0, 4, 4, 4, 7, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 1, 8, 3, 4, 8, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 5, 4, 3, 10, 4, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 5, 5, 3, 5, 7, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 9, 0, 4, 9, 4, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 4, 0, 4, 4, 4, aie.e, aie.e, false);
        this.a(afs2, aie.e, 0, 0, 11, 2, arm2);
        this.a(afs2, aie.e, 0, 4, 11, 2, arm2);
        this.a(afs2, aie.e, 0, 2, 11, 0, arm2);
        this.a(afs2, aie.e, 0, 2, 11, 4, arm2);
        this.a(afs2, aie.e, 0, 1, 1, 6, arm2);
        this.a(afs2, aie.e, 0, 1, 1, 7, arm2);
        this.a(afs2, aie.e, 0, 2, 1, 7, arm2);
        this.a(afs2, aie.e, 0, 3, 1, 6, arm2);
        this.a(afs2, aie.e, 0, 3, 1, 7, arm2);
        this.a(afs2, aie.ar, this.a(aie.ar, 3), 1, 1, 5, arm2);
        this.a(afs2, aie.ar, this.a(aie.ar, 3), 2, 1, 6, arm2);
        this.a(afs2, aie.ar, this.a(aie.ar, 3), 3, 1, 5, arm2);
        this.a(afs2, aie.ar, this.a(aie.ar, 1), 1, 2, 7, arm2);
        this.a(afs2, aie.ar, this.a(aie.ar, 0), 3, 2, 7, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 3, 2, arm2);
        this.a(afs2, aie.aZ, 0, 4, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 4, 3, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 6, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 7, 2, arm2);
        this.a(afs2, aie.aZ, 0, 4, 6, 2, arm2);
        this.a(afs2, aie.aZ, 0, 4, 7, 2, arm2);
        this.a(afs2, aie.aZ, 0, 2, 6, 0, arm2);
        this.a(afs2, aie.aZ, 0, 2, 7, 0, arm2);
        this.a(afs2, aie.aZ, 0, 2, 6, 4, arm2);
        this.a(afs2, aie.aZ, 0, 2, 7, 4, arm2);
        this.a(afs2, aie.aZ, 0, 0, 3, 6, arm2);
        this.a(afs2, aie.aZ, 0, 4, 3, 6, arm2);
        this.a(afs2, aie.aZ, 0, 2, 3, 8, arm2);
        this.a(afs2, aie.aa, 0, 2, 4, 7, arm2);
        this.a(afs2, aie.aa, 0, 1, 4, 6, arm2);
        this.a(afs2, aie.aa, 0, 3, 4, 6, arm2);
        this.a(afs2, aie.aa, 0, 2, 4, 5, arm2);
        int n3 = this.a(aie.ap, 4);
        for (n2 = 1; n2 <= 9; ++n2) {
            this.a(afs2, aie.ap, n3, 3, n2, 3, arm2);
        }
        this.a(afs2, aie.a, 0, 2, 1, 0, arm2);
        this.a(afs2, aie.a, 0, 2, 2, 0, arm2);
        this.a(afs2, arm2, random, 2, 1, 0, this.a(aie.ao, 1));
        if (this.a(afs2, 2, 0, -1, arm2).o() == avk.a && this.a(afs2, 2, -1, -1, arm2).o() != avk.a) {
            this.a(afs2, aie.ar, this.a(aie.ar, 3), 2, 0, -1, arm2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (int i2 = 0; i2 < 5; ++i2) {
                this.b(afs2, i2, 12, n2, arm2);
                this.b(afs2, aie.e, 0, i2, -1, n2, arm2);
            }
        }
        this.a(afs2, arm2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int b(int n2) {
        return 2;
    }
}

