/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aul
extends aut {
    public aul() {
    }

    public aul(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
    }

    public static aul a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 9, 7, 11, n5);
        if (!aul.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new aul(auq2, n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 7 - 1, 0);
        }
        this.a(afs2, arm2, 1, 1, 1, 7, 4, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 2, 1, 6, 8, 4, 10, aie.a, aie.a, false);
        this.a(afs2, arm2, 2, 0, 6, 8, 0, 10, aie.d, aie.d, false);
        this.a(afs2, aie.e, 0, 6, 0, 6, arm2);
        this.a(afs2, arm2, 2, 1, 6, 2, 1, 10, aie.aJ, aie.aJ, false);
        this.a(afs2, arm2, 8, 1, 6, 8, 1, 10, aie.aJ, aie.aJ, false);
        this.a(afs2, arm2, 3, 1, 10, 7, 1, 10, aie.aJ, aie.aJ, false);
        this.a(afs2, arm2, 1, 0, 1, 7, 0, 4, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 0, 0, 0, 3, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 8, 0, 0, 8, 3, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 0, 0, 7, 1, 0, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 0, 5, 7, 1, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 2, 0, 7, 3, 0, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 2, 5, 7, 3, 5, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 4, 1, 8, 4, 1, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 4, 4, 8, 4, 4, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 5, 2, 8, 5, 3, aie.f, aie.f, false);
        this.a(afs2, aie.f, 0, 0, 4, 2, arm2);
        this.a(afs2, aie.f, 0, 0, 4, 3, arm2);
        this.a(afs2, aie.f, 0, 8, 4, 2, arm2);
        this.a(afs2, aie.f, 0, 8, 4, 3, arm2);
        int n4 = this.a(aie.ad, 3);
        int n5 = this.a(aie.ad, 2);
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(afs2, aie.ad, n4, n2, 4 + n3, n3, arm2);
                this.a(afs2, aie.ad, n5, n2, 4 + n3, 5 - n3, arm2);
            }
        }
        this.a(afs2, aie.r, 0, 0, 2, 1, arm2);
        this.a(afs2, aie.r, 0, 0, 2, 4, arm2);
        this.a(afs2, aie.r, 0, 8, 2, 1, arm2);
        this.a(afs2, aie.r, 0, 8, 2, 4, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 3, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 3, arm2);
        this.a(afs2, aie.aZ, 0, 2, 2, 5, arm2);
        this.a(afs2, aie.aZ, 0, 3, 2, 5, arm2);
        this.a(afs2, aie.aZ, 0, 5, 2, 0, arm2);
        this.a(afs2, aie.aZ, 0, 6, 2, 5, arm2);
        this.a(afs2, aie.aJ, 0, 2, 1, 3, arm2);
        this.a(afs2, aie.aw, 0, 2, 2, 3, arm2);
        this.a(afs2, aie.f, 0, 1, 1, 4, arm2);
        this.a(afs2, aie.ad, this.a(aie.ad, 3), 2, 1, 4, arm2);
        this.a(afs2, aie.ad, this.a(aie.ad, 1), 1, 1, 3, arm2);
        this.a(afs2, arm2, 5, 0, 1, 7, 0, 3, aie.T, aie.T, false);
        this.a(afs2, aie.T, 0, 6, 1, 1, arm2);
        this.a(afs2, aie.T, 0, 6, 1, 2, arm2);
        this.a(afs2, aie.a, 0, 2, 1, 0, arm2);
        this.a(afs2, aie.a, 0, 2, 2, 0, arm2);
        this.a(afs2, aie.aa, 0, 2, 3, 1, arm2);
        this.a(afs2, arm2, random, 2, 1, 0, this.a(aie.ao, 1));
        if (this.a(afs2, 2, 0, -1, arm2).o() == avk.a && this.a(afs2, 2, -1, -1, arm2).o() != avk.a) {
            this.a(afs2, aie.ar, this.a(aie.ar, 3), 2, 0, -1, arm2);
        }
        this.a(afs2, aie.a, 0, 6, 1, 5, arm2);
        this.a(afs2, aie.a, 0, 6, 2, 5, arm2);
        this.a(afs2, aie.aa, 0, 6, 3, 4, arm2);
        this.a(afs2, arm2, random, 6, 1, 5, this.a(aie.ao, 1));
        for (n3 = 0; n3 < 5; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(afs2, n2, 7, n3, arm2);
                this.b(afs2, aie.e, 0, n2, -1, n3, arm2);
            }
        }
        this.a(afs2, arm2, 4, 1, 2, 2);
        return true;
    }

    @Override
    protected int b(int n2) {
        if (n2 == 0) {
            return 4;
        }
        return 0;
    }
}

