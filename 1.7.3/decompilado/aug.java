/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aug
extends aut {
    public aug() {
    }

    public aug(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
    }

    public static aug a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 9, 9, 6, n5);
        if (!aug.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new aug(auq2, n6, random, arm2, n5);
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
            this.f.a(0, this.k - this.f.e + 9 - 1, 0);
        }
        this.a(afs2, arm2, 1, 1, 1, 7, 5, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 0, 0, 8, 0, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 5, 0, 8, 5, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 6, 1, 8, 6, 4, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 7, 2, 8, 7, 3, aie.e, aie.e, false);
        int n4 = this.a(aie.ad, 3);
        int n5 = this.a(aie.ad, 2);
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(afs2, aie.ad, n4, n2, 6 + n3, n3, arm2);
                this.a(afs2, aie.ad, n5, n2, 6 + n3, 5 - n3, arm2);
            }
        }
        this.a(afs2, arm2, 0, 1, 0, 0, 1, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 1, 5, 8, 1, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 8, 1, 0, 8, 1, 4, aie.e, aie.e, false);
        this.a(afs2, arm2, 2, 1, 0, 7, 1, 0, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 2, 0, 0, 4, 0, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 2, 5, 0, 4, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 8, 2, 5, 8, 4, 5, aie.e, aie.e, false);
        this.a(afs2, arm2, 8, 2, 0, 8, 4, 0, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 2, 1, 0, 4, 4, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 2, 5, 7, 4, 5, aie.f, aie.f, false);
        this.a(afs2, arm2, 8, 2, 1, 8, 4, 4, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 2, 0, 7, 4, 0, aie.f, aie.f, false);
        this.a(afs2, aie.aZ, 0, 4, 2, 0, arm2);
        this.a(afs2, aie.aZ, 0, 5, 2, 0, arm2);
        this.a(afs2, aie.aZ, 0, 6, 2, 0, arm2);
        this.a(afs2, aie.aZ, 0, 4, 3, 0, arm2);
        this.a(afs2, aie.aZ, 0, 5, 3, 0, arm2);
        this.a(afs2, aie.aZ, 0, 6, 3, 0, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 2, 3, arm2);
        this.a(afs2, aie.aZ, 0, 0, 3, 2, arm2);
        this.a(afs2, aie.aZ, 0, 0, 3, 3, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 8, 2, 3, arm2);
        this.a(afs2, aie.aZ, 0, 8, 3, 2, arm2);
        this.a(afs2, aie.aZ, 0, 8, 3, 3, arm2);
        this.a(afs2, aie.aZ, 0, 2, 2, 5, arm2);
        this.a(afs2, aie.aZ, 0, 3, 2, 5, arm2);
        this.a(afs2, aie.aZ, 0, 5, 2, 5, arm2);
        this.a(afs2, aie.aZ, 0, 6, 2, 5, arm2);
        this.a(afs2, arm2, 1, 4, 1, 7, 4, 1, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 4, 4, 7, 4, 4, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 3, 4, 7, 3, 4, aie.X, aie.X, false);
        this.a(afs2, aie.f, 0, 7, 1, 4, arm2);
        this.a(afs2, aie.ad, this.a(aie.ad, 0), 7, 1, 3, arm2);
        n3 = this.a(aie.ad, 3);
        this.a(afs2, aie.ad, n3, 6, 1, 4, arm2);
        this.a(afs2, aie.ad, n3, 5, 1, 4, arm2);
        this.a(afs2, aie.ad, n3, 4, 1, 4, arm2);
        this.a(afs2, aie.ad, n3, 3, 1, 4, arm2);
        this.a(afs2, aie.aJ, 0, 6, 1, 3, arm2);
        this.a(afs2, aie.aw, 0, 6, 2, 3, arm2);
        this.a(afs2, aie.aJ, 0, 4, 1, 3, arm2);
        this.a(afs2, aie.aw, 0, 4, 2, 3, arm2);
        this.a(afs2, aie.ai, 0, 7, 1, 1, arm2);
        this.a(afs2, aie.a, 0, 1, 1, 0, arm2);
        this.a(afs2, aie.a, 0, 1, 2, 0, arm2);
        this.a(afs2, arm2, random, 1, 1, 0, this.a(aie.ao, 1));
        if (this.a(afs2, 1, 0, -1, arm2).o() == avk.a && this.a(afs2, 1, -1, -1, arm2).o() != avk.a) {
            this.a(afs2, aie.ar, this.a(aie.ar, 3), 1, 0, -1, arm2);
        }
        for (n2 = 0; n2 < 6; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(afs2, i2, 9, n2, arm2);
                this.b(afs2, aie.e, 0, i2, -1, n2, arm2);
            }
        }
        this.a(afs2, arm2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int b(int n2) {
        return 1;
    }
}

