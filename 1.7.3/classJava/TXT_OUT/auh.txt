/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class auh
extends aut {
    private ahz a;
    private ahz b;
    private ahz c;
    private ahz d;

    public auh() {
    }

    public auh(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
        this.a = this.a(random);
        this.b = this.a(random);
        this.c = this.a(random);
        this.d = this.a(random);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("CA", ahz.c.b(this.a));
        dg2.a("CB", ahz.c.b(this.b));
        dg2.a("CC", ahz.c.b(this.c));
        dg2.a("CD", ahz.c.b(this.d));
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = ahz.e(dg2.f("CA"));
        this.b = ahz.e(dg2.f("CB"));
        this.c = ahz.e(dg2.f("CC"));
        this.d = ahz.e(dg2.f("CD"));
    }

    private ahz a(Random random) {
        switch (random.nextInt(5)) {
            default: {
                return aie.aj;
            }
            case 0: {
                return aie.bM;
            }
            case 1: 
        }
        return aie.bN;
    }

    public static auh a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 13, 4, 9, n5);
        if (!auh.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new auh(auq2, n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 4 - 1, 0);
        }
        this.a(afs2, arm2, 0, 1, 0, 12, 4, 8, aie.a, aie.a, false);
        this.a(afs2, arm2, 1, 0, 1, 2, 0, 7, aie.ak, aie.ak, false);
        this.a(afs2, arm2, 4, 0, 1, 5, 0, 7, aie.ak, aie.ak, false);
        this.a(afs2, arm2, 7, 0, 1, 8, 0, 7, aie.ak, aie.ak, false);
        this.a(afs2, arm2, 10, 0, 1, 11, 0, 7, aie.ak, aie.ak, false);
        this.a(afs2, arm2, 0, 0, 0, 0, 0, 8, aie.r, aie.r, false);
        this.a(afs2, arm2, 6, 0, 0, 6, 0, 8, aie.r, aie.r, false);
        this.a(afs2, arm2, 12, 0, 0, 12, 0, 8, aie.r, aie.r, false);
        this.a(afs2, arm2, 1, 0, 0, 11, 0, 0, aie.r, aie.r, false);
        this.a(afs2, arm2, 1, 0, 8, 11, 0, 8, aie.r, aie.r, false);
        this.a(afs2, arm2, 3, 0, 1, 3, 0, 7, aie.j, aie.j, false);
        this.a(afs2, arm2, 9, 0, 1, 9, 0, 7, aie.j, aie.j, false);
        for (n2 = 1; n2 <= 7; ++n2) {
            this.a(afs2, this.a, oy.a(random, 2, 7), 1, 1, n2, arm2);
            this.a(afs2, this.a, oy.a(random, 2, 7), 2, 1, n2, arm2);
            this.a(afs2, this.b, oy.a(random, 2, 7), 4, 1, n2, arm2);
            this.a(afs2, this.b, oy.a(random, 2, 7), 5, 1, n2, arm2);
            this.a(afs2, this.c, oy.a(random, 2, 7), 7, 1, n2, arm2);
            this.a(afs2, this.c, oy.a(random, 2, 7), 8, 1, n2, arm2);
            this.a(afs2, this.d, oy.a(random, 2, 7), 10, 1, n2, arm2);
            this.a(afs2, this.d, oy.a(random, 2, 7), 11, 1, n2, arm2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (int i2 = 0; i2 < 13; ++i2) {
                this.b(afs2, i2, 4, n2, arm2);
                this.b(afs2, aie.d, 0, i2, -1, n2, arm2);
            }
        }
        return true;
    }
}

