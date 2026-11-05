/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atg
extends ats {
    public atg() {
    }

    public atg(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        if (this.g == 2 || this.g == 3) {
            this.b((atp)aua2, list, random, 1, 1);
        } else {
            this.c((atp)aua2, list, random, 1, 1);
        }
    }

    public static atg a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -1, 0, 5, 5, 5, n5);
        if (!atg.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atg(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 4, 4, 4, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 1, 1, 0);
        if (this.g == 2 || this.g == 3) {
            this.a(afs2, arm2, 0, 1, 1, 0, 3, 3, aie.a, aie.a, false);
        } else {
            this.a(afs2, arm2, 4, 1, 1, 4, 3, 3, aie.a, aie.a, false);
        }
        return true;
    }
}

