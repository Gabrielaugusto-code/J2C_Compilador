/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ary
extends asj {
    private int b;

    public ary() {
    }

    public ary(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
        this.b = random.nextInt();
    }

    public static ary a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -3, 0, 5, 10, 8, n5);
        if (!ary.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new ary(n6, random, arm2, n5);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.b = dg2.f("Seed");
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Seed", this.b);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        int n4;
        Random random2 = new Random(this.b);
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 3; n3 <= 4; ++n3) {
                n2 = random2.nextInt(8);
                this.a(afs2, arm2, n4, n3, 0, n4, n3, n2, aie.bj, aie.bj, false);
            }
        }
        n4 = random2.nextInt(8);
        this.a(afs2, arm2, 0, 5, 0, 0, 5, n4, aie.bj, aie.bj, false);
        n4 = random2.nextInt(8);
        this.a(afs2, arm2, 4, 5, 0, 4, 5, n4, aie.bj, aie.bj, false);
        for (n4 = 0; n4 <= 4; ++n4) {
            n3 = random2.nextInt(5);
            this.a(afs2, arm2, n4, 2, 0, n4, 2, n3, aie.bj, aie.bj, false);
        }
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 0; n3 <= 1; ++n3) {
                n2 = random2.nextInt(3);
                this.a(afs2, arm2, n4, n3, 0, n4, n3, n2, aie.bj, aie.bj, false);
            }
        }
        return true;
    }
}

