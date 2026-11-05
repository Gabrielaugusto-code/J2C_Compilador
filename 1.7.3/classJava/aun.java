/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aun
extends aut {
    private boolean a;
    private int b;

    public aun() {
    }

    public aun(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
        this.a = random.nextBoolean();
        this.b = random.nextInt(3);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("T", this.b);
        dg2.a("C", this.a);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.b = dg2.f("T");
        this.a = dg2.n("C");
    }

    public static aun a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 4, 6, 5, n5);
        if (!aun.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new aun(auq2, n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 6 - 1, 0);
        }
        this.a(afs2, arm2, 1, 1, 1, 3, 5, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 0, 0, 3, 0, 4, aie.e, aie.e, false);
        this.a(afs2, arm2, 1, 0, 1, 2, 0, 3, aie.d, aie.d, false);
        if (this.a) {
            this.a(afs2, arm2, 1, 4, 1, 2, 4, 3, aie.r, aie.r, false);
        } else {
            this.a(afs2, arm2, 1, 5, 1, 2, 5, 3, aie.r, aie.r, false);
        }
        this.a(afs2, aie.r, 0, 1, 4, 0, arm2);
        this.a(afs2, aie.r, 0, 2, 4, 0, arm2);
        this.a(afs2, aie.r, 0, 1, 4, 4, arm2);
        this.a(afs2, aie.r, 0, 2, 4, 4, arm2);
        this.a(afs2, aie.r, 0, 0, 4, 1, arm2);
        this.a(afs2, aie.r, 0, 0, 4, 2, arm2);
        this.a(afs2, aie.r, 0, 0, 4, 3, arm2);
        this.a(afs2, aie.r, 0, 3, 4, 1, arm2);
        this.a(afs2, aie.r, 0, 3, 4, 2, arm2);
        this.a(afs2, aie.r, 0, 3, 4, 3, arm2);
        this.a(afs2, arm2, 0, 1, 0, 0, 3, 0, aie.r, aie.r, false);
        this.a(afs2, arm2, 3, 1, 0, 3, 3, 0, aie.r, aie.r, false);
        this.a(afs2, arm2, 0, 1, 4, 0, 3, 4, aie.r, aie.r, false);
        this.a(afs2, arm2, 3, 1, 4, 3, 3, 4, aie.r, aie.r, false);
        this.a(afs2, arm2, 0, 1, 1, 0, 3, 3, aie.f, aie.f, false);
        this.a(afs2, arm2, 3, 1, 1, 3, 3, 3, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 1, 0, 2, 3, 0, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 1, 4, 2, 3, 4, aie.f, aie.f, false);
        this.a(afs2, aie.aZ, 0, 0, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 3, 2, 2, arm2);
        if (this.b > 0) {
            this.a(afs2, aie.aJ, 0, this.b, 1, 3, arm2);
            this.a(afs2, aie.aw, 0, this.b, 2, 3, arm2);
        }
        this.a(afs2, aie.a, 0, 1, 1, 0, arm2);
        this.a(afs2, aie.a, 0, 1, 2, 0, arm2);
        this.a(afs2, arm2, random, 1, 1, 0, this.a(aie.ao, 1));
        if (this.a(afs2, 1, 0, -1, arm2).o() == avk.a && this.a(afs2, 1, -1, -1, arm2).o() != avk.a) {
            this.a(afs2, aie.ar, this.a(aie.ar, 3), 1, 0, -1, arm2);
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                this.b(afs2, i3, 6, i2, arm2);
                this.b(afs2, aie.e, 0, i3, -1, i2, arm2);
            }
        }
        this.a(afs2, arm2, 1, 1, 2, 1);
        return true;
    }
}

