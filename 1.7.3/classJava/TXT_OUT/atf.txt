/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atf
extends ats {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean e;

    public atf() {
    }

    public atf(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
        this.a = random.nextBoolean();
        this.b = random.nextBoolean();
        this.c = random.nextBoolean();
        this.e = random.nextInt(3) > 0;
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("leftLow", this.a);
        dg2.a("leftHigh", this.b);
        dg2.a("rightLow", this.c);
        dg2.a("rightHigh", this.e);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.n("leftLow");
        this.b = dg2.n("leftHigh");
        this.c = dg2.n("rightLow");
        this.e = dg2.n("rightHigh");
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        int n2 = 3;
        int n3 = 5;
        if (this.g == 1 || this.g == 2) {
            n2 = 8 - n2;
            n3 = 8 - n3;
        }
        this.a((atp)aua2, list, random, 5, 1);
        if (this.a) {
            this.b((atp)aua2, list, random, n2, 1);
        }
        if (this.b) {
            this.b((atp)aua2, list, random, n3, 7);
        }
        if (this.c) {
            this.c((atp)aua2, list, random, n2, 1);
        }
        if (this.e) {
            this.c((atp)aua2, list, random, n3, 7);
        }
    }

    public static atf a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -4, -3, 0, 10, 9, 11, n5);
        if (!atf.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atf(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 9, 8, 10, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 4, 3, 0);
        if (this.a) {
            this.a(afs2, arm2, 0, 3, 1, 0, 5, 3, aie.a, aie.a, false);
        }
        if (this.c) {
            this.a(afs2, arm2, 9, 3, 1, 9, 5, 3, aie.a, aie.a, false);
        }
        if (this.b) {
            this.a(afs2, arm2, 0, 5, 7, 0, 7, 9, aie.a, aie.a, false);
        }
        if (this.e) {
            this.a(afs2, arm2, 9, 5, 7, 9, 7, 9, aie.a, aie.a, false);
        }
        this.a(afs2, arm2, 5, 1, 10, 7, 3, 10, aie.a, aie.a, false);
        this.a(afs2, arm2, 1, 2, 1, 8, 2, 6, false, random, asz.c());
        this.a(afs2, arm2, 4, 1, 5, 4, 4, 9, false, random, asz.c());
        this.a(afs2, arm2, 8, 1, 5, 8, 4, 9, false, random, asz.c());
        this.a(afs2, arm2, 1, 4, 7, 3, 4, 9, false, random, asz.c());
        this.a(afs2, arm2, 1, 3, 5, 3, 3, 6, false, random, asz.c());
        this.a(afs2, arm2, 1, 3, 4, 3, 3, 4, aie.U, aie.U, false);
        this.a(afs2, arm2, 1, 4, 6, 3, 4, 6, aie.U, aie.U, false);
        this.a(afs2, arm2, 5, 1, 7, 7, 1, 8, false, random, asz.c());
        this.a(afs2, arm2, 5, 1, 9, 7, 1, 9, aie.U, aie.U, false);
        this.a(afs2, arm2, 5, 2, 7, 7, 2, 7, aie.U, aie.U, false);
        this.a(afs2, arm2, 4, 5, 7, 4, 5, 9, aie.U, aie.U, false);
        this.a(afs2, arm2, 8, 5, 7, 8, 5, 9, aie.U, aie.U, false);
        this.a(afs2, arm2, 5, 5, 7, 7, 5, 9, aie.T, aie.T, false);
        this.a(afs2, aie.aa, 0, 6, 5, 6, arm2);
        return true;
    }
}

