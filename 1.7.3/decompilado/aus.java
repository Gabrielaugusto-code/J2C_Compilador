/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aus
extends aut {
    public aus() {
    }

    public aus(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
    }

    public static aus a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 9, 7, 12, n5);
        if (!aus.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new aus(auq2, n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 7 - 1, 0);
        }
        this.a(afs2, arm2, 1, 1, 1, 7, 4, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 2, 1, 6, 8, 4, 10, aie.a, aie.a, false);
        this.a(afs2, arm2, 2, 0, 5, 8, 0, 10, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 0, 1, 7, 0, 4, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 0, 0, 0, 3, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 8, 0, 0, 8, 3, 10, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 0, 0, 7, 2, 0, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 0, 5, 2, 1, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 2, 0, 6, 2, 3, 10, aie.e, aie.e, false);
        this.a(afs2, arm2, 3, 0, 10, 7, 3, 10, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 2, 0, 7, 3, 0, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 2, 5, 2, 3, 5, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 4, 1, 8, 4, 1, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 4, 4, 3, 4, 4, aie.f, aie.f, false);
        this.a(afs2, arm2, 0, 5, 2, 8, 5, 3, aie.f, aie.f, false);
        this.a(afs2, aie.f, 0, 0, 4, 2, arm2);
        this.a(afs2, aie.f, 0, 0, 4, 3, arm2);
        this.a(afs2, aie.f, 0, 8, 4, 2, arm2);
        this.a(afs2, aie.f, 0, 8, 4, 3, arm2);
        this.a(afs2, aie.f, 0, 8, 4, 4, arm2);
        int n6 = this.a(aie.ad, 3);
        int n7 = this.a(aie.ad, 2);
        for (n5 = -1; n5 <= 2; ++n5) {
            for (n4 = 0; n4 <= 8; ++n4) {
                this.a(afs2, aie.ad, n6, n4, 4 + n5, n5, arm2);
                if (n5 <= -1 && n4 > 1 || n5 <= 0 && n4 > 3 || n5 <= 1 && n4 > 4 && n4 < 6) continue;
                this.a(afs2, aie.ad, n7, n4, 4 + n5, 5 - n5, arm2);
            }
        }
        this.a(afs2, arm2, 3, 4, 5, 3, 4, 10, aie.f, aie.f, false);
        this.a(afs2, arm2, 7, 4, 2, 7, 4, 10, aie.f, aie.f, false);
        this.a(afs2, arm2, 4, 5, 4, 4, 5, 10, aie.f, aie.f, false);
        this.a(afs2, arm2, 6, 5, 4, 6, 5, 10, aie.f, aie.f, false);
        this.a(afs2, arm2, 5, 6, 3, 5, 6, 10, aie.f, aie.f, false);
        n5 = this.a(aie.ad, 0);
        for (n4 = 4; n4 >= 1; --n4) {
            this.a(afs2, aie.f, 0, n4, 2 + n4, 7 - n4, arm2);
            for (n3 = 8 - n4; n3 <= 10; ++n3) {
                this.a(afs2, aie.ad, n5, n4, 2 + n4, n3, arm2);
            }
        }
        n4 = this.a(aie.ad, 1);
        this.a(afs2, aie.f, 0, 6, 6, 3, arm2);
        this.a(afs2, aie.f, 0, 7, 5, 4, arm2);
        this.a(afs2, aie.ad, n4, 6, 6, 4, arm2);
        for (n3 = 6; n3 <= 8; ++n3) {
            for (n2 = 5; n2 <= 10; ++n2) {
                this.a(afs2, aie.ad, n4, n3, 12 - n3, n2, arm2);
            }
        }
        this.a(afs2, aie.r, 0, 0, 2, 1, arm2);
        this.a(afs2, aie.r, 0, 0, 2, 4, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 3, arm2);
        this.a(afs2, aie.r, 0, 4, 2, 0, arm2);
        this.a(afs2, aie.aZ, 0, 5, 2, 0, arm2);
        this.a(afs2, aie.r, 0, 6, 2, 0, arm2);
        this.a(afs2, aie.r, 0, 8, 2, 1, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 3, arm2);
        this.a(afs2, aie.r, 0, 8, 2, 4, arm2);
        this.a(afs2, aie.f, 0, 8, 2, 5, arm2);
        this.a(afs2, aie.r, 0, 8, 2, 6, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 7, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 8, arm2);
        this.a(afs2, aie.r, 0, 8, 2, 9, arm2);
        this.a(afs2, aie.r, 0, 2, 2, 6, arm2);
        this.a(afs2, aie.aZ, 0, 2, 2, 7, arm2);
        this.a(afs2, aie.aZ, 0, 2, 2, 8, arm2);
        this.a(afs2, aie.r, 0, 2, 2, 9, arm2);
        this.a(afs2, aie.r, 0, 4, 4, 10, arm2);
        this.a(afs2, aie.aZ, 0, 5, 4, 10, arm2);
        this.a(afs2, aie.r, 0, 6, 4, 10, arm2);
        this.a(afs2, aie.f, 0, 5, 5, 10, arm2);
        this.a(afs2, aie.a, 0, 2, 1, 0, arm2);
        this.a(afs2, aie.a, 0, 2, 2, 0, arm2);
        this.a(afs2, aie.aa, 0, 2, 3, 1, arm2);
        this.a(afs2, arm2, random, 2, 1, 0, this.a(aie.ao, 1));
        this.a(afs2, arm2, 1, 0, -1, 3, 2, -1, aie.a, aie.a, false);
        if (this.a(afs2, 2, 0, -1, arm2).o() == avk.a && this.a(afs2, 2, -1, -1, arm2).o() != avk.a) {
            this.a(afs2, aie.ar, this.a(aie.ar, 3), 2, 0, -1, arm2);
        }
        for (n3 = 0; n3 < 5; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(afs2, n2, 7, n3, arm2);
                this.b(afs2, aie.e, 0, n2, -1, n3, arm2);
            }
        }
        for (n3 = 5; n3 < 11; ++n3) {
            for (n2 = 2; n2 < 9; ++n2) {
                this.b(afs2, n2, 7, n3, arm2);
                this.b(afs2, aie.e, 0, n2, -1, n3, arm2);
            }
        }
        this.a(afs2, arm2, 4, 1, 2, 2);
        return true;
    }
}

