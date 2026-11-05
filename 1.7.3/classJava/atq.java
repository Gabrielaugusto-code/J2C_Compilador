/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atq
extends ats {
    private boolean a;
    private boolean b;

    public atq() {
    }

    public atq(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
        this.a = random.nextInt(2) == 0;
        this.b = random.nextInt(2) == 0;
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Left", this.a);
        dg2.a("Right", this.b);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.n("Left");
        this.b = dg2.n("Right");
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((atp)aua2, list, random, 1, 1);
        if (this.a) {
            this.b((atp)aua2, list, random, 1, 2);
        }
        if (this.b) {
            this.c((atp)aua2, list, random, 1, 2);
        }
    }

    public static atq a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, n5);
        if (!atq.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atq(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 4, 4, 6, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 1, 1, 0);
        this.a(afs2, random, arm2, att.a, 1, 1, 6);
        this.a(afs2, arm2, random, 0.1f, 1, 2, 1, aie.aa, 0);
        this.a(afs2, arm2, random, 0.1f, 3, 2, 1, aie.aa, 0);
        this.a(afs2, arm2, random, 0.1f, 1, 2, 5, aie.aa, 0);
        this.a(afs2, arm2, random, 0.1f, 3, 2, 5, aie.aa, 0);
        if (this.a) {
            this.a(afs2, arm2, 0, 1, 2, 0, 3, 4, aie.a, aie.a, false);
        }
        if (this.b) {
            this.a(afs2, arm2, 4, 1, 2, 4, 3, 4, aie.a, aie.a, false);
        }
        return true;
    }
}

