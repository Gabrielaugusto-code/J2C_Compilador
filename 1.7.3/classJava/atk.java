/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atk
extends ats {
    public atk() {
    }

    public atk(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((atp)aua2, list, random, 1, 1);
    }

    public static atk a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -1, 0, 9, 5, 11, n5);
        if (!atk.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atk(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 8, 4, 10, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 1, 1, 0);
        this.a(afs2, arm2, 1, 1, 10, 3, 3, 10, aie.a, aie.a, false);
        this.a(afs2, arm2, 4, 1, 1, 4, 3, 1, false, random, asz.c());
        this.a(afs2, arm2, 4, 1, 3, 4, 3, 3, false, random, asz.c());
        this.a(afs2, arm2, 4, 1, 7, 4, 3, 7, false, random, asz.c());
        this.a(afs2, arm2, 4, 1, 9, 4, 3, 9, false, random, asz.c());
        this.a(afs2, arm2, 4, 1, 4, 4, 3, 6, aie.aY, aie.aY, false);
        this.a(afs2, arm2, 5, 1, 5, 7, 3, 5, aie.aY, aie.aY, false);
        this.a(afs2, aie.aY, 0, 4, 3, 2, arm2);
        this.a(afs2, aie.aY, 0, 4, 3, 8, arm2);
        this.a(afs2, aie.av, this.a(aie.av, 3), 4, 1, 2, arm2);
        this.a(afs2, aie.av, this.a(aie.av, 3) + 8, 4, 2, 2, arm2);
        this.a(afs2, aie.av, this.a(aie.av, 3), 4, 1, 8, arm2);
        this.a(afs2, aie.av, this.a(aie.av, 3) + 8, 4, 2, 8, arm2);
        return true;
    }
}

