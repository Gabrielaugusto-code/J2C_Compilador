/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class arx
extends asj {
    public arx() {
    }

    public arx(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    protected arx(Random random, int n2, int n3) {
        super(0);
        this.g = random.nextInt(4);
        switch (this.g) {
            case 0: 
            case 2: {
                this.f = new arm(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
                break;
            }
            default: {
                this.f = new arm(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
            }
        }
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((asn)aua2, list, random, 8, 3, false);
        this.b((asn)aua2, list, random, 3, 8, false);
        this.c((asn)aua2, list, random, 3, 8, false);
    }

    public static arx a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -8, -3, 0, 19, 10, 19, n5);
        if (!arx.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new arx(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        this.a(afs2, arm2, 7, 3, 0, 11, 4, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 3, 7, 18, 4, 11, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 8, 5, 0, 10, 7, 18, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 5, 8, 18, 7, 10, aie.a, aie.a, false);
        this.a(afs2, arm2, 7, 5, 0, 7, 5, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 7, 5, 11, 7, 5, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 11, 5, 0, 11, 5, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 11, 5, 11, 11, 5, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 5, 7, 7, 5, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 11, 5, 7, 18, 5, 7, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 5, 11, 7, 5, 11, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 11, 5, 11, 18, 5, 11, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 7, 2, 0, 11, 2, 5, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 7, 2, 13, 11, 2, 18, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 7, 0, 0, 11, 1, 3, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 7, 0, 15, 11, 1, 18, aie.bj, aie.bj, false);
        for (n3 = 7; n3 <= 11; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(afs2, aie.bj, 0, n3, -1, n2, arm2);
                this.b(afs2, aie.bj, 0, n3, -1, 18 - n2, arm2);
            }
        }
        this.a(afs2, arm2, 0, 2, 7, 5, 2, 11, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 13, 2, 7, 18, 2, 11, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 0, 0, 7, 3, 1, 11, aie.bj, aie.bj, false);
        this.a(afs2, arm2, 15, 0, 7, 18, 1, 11, aie.bj, aie.bj, false);
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 7; n2 <= 11; ++n2) {
                this.b(afs2, aie.bj, 0, n3, -1, n2, arm2);
                this.b(afs2, aie.bj, 0, 18 - n3, -1, n2, arm2);
            }
        }
        return true;
    }
}

