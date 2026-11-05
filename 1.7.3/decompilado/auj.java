/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class auj
extends aut {
    public auj() {
    }

    public auj(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
    }

    public static arm a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 3, 4, 2, n5);
        if (aua.a(list, arm2) != null) {
            return null;
        }
        return arm2;
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 4 - 1, 0);
        }
        this.a(afs2, arm2, 0, 0, 0, 2, 3, 1, aie.a, aie.a, false);
        this.a(afs2, aie.aJ, 0, 1, 0, 0, arm2);
        this.a(afs2, aie.aJ, 0, 1, 1, 0, arm2);
        this.a(afs2, aie.aJ, 0, 1, 2, 0, arm2);
        this.a(afs2, aie.L, 15, 1, 3, 0, arm2);
        this.a(afs2, aie.aa, 0, 0, 3, 0, arm2);
        this.a(afs2, aie.aa, 0, 1, 3, 1, arm2);
        this.a(afs2, aie.aa, 0, 2, 3, 0, arm2);
        this.a(afs2, aie.aa, 0, 1, 3, -1, arm2);
        return true;
    }
}

