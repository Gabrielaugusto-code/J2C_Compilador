/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class arq
extends aua {
    private int a;
    private boolean b;

    public arq() {
    }

    @Override
    protected void a(dg dg2) {
        dg2.a("tf", this.b);
        dg2.a("D", this.a);
    }

    @Override
    protected void b(dg dg2) {
        this.b = dg2.n("tf");
        this.a = dg2.f("D");
    }

    public arq(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.a = n3;
        this.f = arm2;
        this.b = arm2.c() > 3;
    }

    public static arm a(List list, Random random, int n2, int n3, int n4, int n5) {
        arm arm2 = new arm(n2, n3, n4, n2, n3 + 2, n4);
        if (random.nextInt(4) == 0) {
            arm2.e += 4;
        }
        switch (n5) {
            case 2: {
                arm2.a = n2 - 1;
                arm2.d = n2 + 3;
                arm2.c = n4 - 4;
                break;
            }
            case 0: {
                arm2.a = n2 - 1;
                arm2.d = n2 + 3;
                arm2.f = n4 + 4;
                break;
            }
            case 1: {
                arm2.a = n2 - 4;
                arm2.c = n4 - 1;
                arm2.f = n4 + 3;
                break;
            }
            case 3: {
                arm2.d = n2 + 4;
                arm2.c = n4 - 1;
                arm2.f = n4 + 3;
            }
        }
        if (aua.a(list, arm2) != null) {
            return null;
        }
        return arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        int n2 = this.d();
        switch (this.a) {
            case 2: {
                aro.a(aua2, list, random, this.f.a + 1, this.f.b, this.f.c - 1, 2, n2);
                aro.a(aua2, list, random, this.f.a - 1, this.f.b, this.f.c + 1, 1, n2);
                aro.a(aua2, list, random, this.f.d + 1, this.f.b, this.f.c + 1, 3, n2);
                break;
            }
            case 0: {
                aro.a(aua2, list, random, this.f.a + 1, this.f.b, this.f.f + 1, 0, n2);
                aro.a(aua2, list, random, this.f.a - 1, this.f.b, this.f.c + 1, 1, n2);
                aro.a(aua2, list, random, this.f.d + 1, this.f.b, this.f.c + 1, 3, n2);
                break;
            }
            case 1: {
                aro.a(aua2, list, random, this.f.a + 1, this.f.b, this.f.c - 1, 2, n2);
                aro.a(aua2, list, random, this.f.a + 1, this.f.b, this.f.f + 1, 0, n2);
                aro.a(aua2, list, random, this.f.a - 1, this.f.b, this.f.c + 1, 1, n2);
                break;
            }
            case 3: {
                aro.a(aua2, list, random, this.f.a + 1, this.f.b, this.f.c - 1, 2, n2);
                aro.a(aua2, list, random, this.f.a + 1, this.f.b, this.f.f + 1, 0, n2);
                aro.a(aua2, list, random, this.f.d + 1, this.f.b, this.f.c + 1, 3, n2);
            }
        }
        if (this.b) {
            if (random.nextBoolean()) {
                aro.a(aua2, list, random, this.f.a + 1, this.f.b + 3 + 1, this.f.c - 1, 2, n2);
            }
            if (random.nextBoolean()) {
                aro.a(aua2, list, random, this.f.a - 1, this.f.b + 3 + 1, this.f.c + 1, 1, n2);
            }
            if (random.nextBoolean()) {
                aro.a(aua2, list, random, this.f.d + 1, this.f.b + 3 + 1, this.f.c + 1, 3, n2);
            }
            if (random.nextBoolean()) {
                aro.a(aua2, list, random, this.f.a + 1, this.f.b + 3 + 1, this.f.f + 1, 0, n2);
            }
        }
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        if (this.b) {
            this.a(afs2, arm2, this.f.a + 1, this.f.b, this.f.c, this.f.d - 1, this.f.b + 3 - 1, this.f.f, aie.a, aie.a, false);
            this.a(afs2, arm2, this.f.a, this.f.b, this.f.c + 1, this.f.d, this.f.b + 3 - 1, this.f.f - 1, aie.a, aie.a, false);
            this.a(afs2, arm2, this.f.a + 1, this.f.e - 2, this.f.c, this.f.d - 1, this.f.e, this.f.f, aie.a, aie.a, false);
            this.a(afs2, arm2, this.f.a, this.f.e - 2, this.f.c + 1, this.f.d, this.f.e, this.f.f - 1, aie.a, aie.a, false);
            this.a(afs2, arm2, this.f.a + 1, this.f.b + 3, this.f.c + 1, this.f.d - 1, this.f.b + 3, this.f.f - 1, aie.a, aie.a, false);
        } else {
            this.a(afs2, arm2, this.f.a + 1, this.f.b, this.f.c, this.f.d - 1, this.f.e, this.f.f, aie.a, aie.a, false);
            this.a(afs2, arm2, this.f.a, this.f.b, this.f.c + 1, this.f.d, this.f.e, this.f.f - 1, aie.a, aie.a, false);
        }
        this.a(afs2, arm2, this.f.a + 1, this.f.b, this.f.c + 1, this.f.a + 1, this.f.e, this.f.c + 1, aie.f, aie.a, false);
        this.a(afs2, arm2, this.f.a + 1, this.f.b, this.f.f - 1, this.f.a + 1, this.f.e, this.f.f - 1, aie.f, aie.a, false);
        this.a(afs2, arm2, this.f.d - 1, this.f.b, this.f.c + 1, this.f.d - 1, this.f.e, this.f.c + 1, aie.f, aie.a, false);
        this.a(afs2, arm2, this.f.d - 1, this.f.b, this.f.f - 1, this.f.d - 1, this.f.e, this.f.f - 1, aie.f, aie.a, false);
        for (int i2 = this.f.a; i2 <= this.f.d; ++i2) {
            for (int i3 = this.f.c; i3 <= this.f.f; ++i3) {
                if (this.a(afs2, i2, this.f.b - 1, i3, arm2).o() != avk.a) continue;
                this.a(afs2, aie.f, 0, i2, this.f.b - 1, i3, arm2);
            }
        }
        return true;
    }
}

