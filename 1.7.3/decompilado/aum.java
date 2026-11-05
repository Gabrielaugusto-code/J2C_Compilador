/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aum
extends aut {
    private boolean a;

    public aum() {
    }

    public aum(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
        this.a = random.nextBoolean();
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Terrace", this.a);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.n("Terrace");
    }

    public static aum a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 5, 6, 5, n5);
        if (aua.a(list, arm2) != null) {
            return null;
        }
        return new aum(auq2, n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 6 - 1, 0);
        }
        this.a(afs2, arm2, 0, 0, 0, 4, 0, 4, aie.e, aie.e, false);
        this.a(afs2, arm2, 0, 4, 0, 4, 4, 4, aie.r, aie.r, false);
        this.a(afs2, arm2, 1, 4, 1, 3, 4, 3, aie.f, aie.f, false);
        this.a(afs2, aie.e, 0, 0, 1, 0, arm2);
        this.a(afs2, aie.e, 0, 0, 2, 0, arm2);
        this.a(afs2, aie.e, 0, 0, 3, 0, arm2);
        this.a(afs2, aie.e, 0, 4, 1, 0, arm2);
        this.a(afs2, aie.e, 0, 4, 2, 0, arm2);
        this.a(afs2, aie.e, 0, 4, 3, 0, arm2);
        this.a(afs2, aie.e, 0, 0, 1, 4, arm2);
        this.a(afs2, aie.e, 0, 0, 2, 4, arm2);
        this.a(afs2, aie.e, 0, 0, 3, 4, arm2);
        this.a(afs2, aie.e, 0, 4, 1, 4, arm2);
        this.a(afs2, aie.e, 0, 4, 2, 4, arm2);
        this.a(afs2, aie.e, 0, 4, 3, 4, arm2);
        this.a(afs2, arm2, 0, 1, 1, 0, 3, 3, aie.f, aie.f, false);
        this.a(afs2, arm2, 4, 1, 1, 4, 3, 3, aie.f, aie.f, false);
        this.a(afs2, arm2, 1, 1, 4, 3, 3, 4, aie.f, aie.f, false);
        this.a(afs2, aie.aZ, 0, 0, 2, 2, arm2);
        this.a(afs2, aie.aZ, 0, 2, 2, 4, arm2);
        this.a(afs2, aie.aZ, 0, 4, 2, 2, arm2);
        this.a(afs2, aie.f, 0, 1, 1, 0, arm2);
        this.a(afs2, aie.f, 0, 1, 2, 0, arm2);
        this.a(afs2, aie.f, 0, 1, 3, 0, arm2);
        this.a(afs2, aie.f, 0, 2, 3, 0, arm2);
        this.a(afs2, aie.f, 0, 3, 3, 0, arm2);
        this.a(afs2, aie.f, 0, 3, 2, 0, arm2);
        this.a(afs2, aie.f, 0, 3, 1, 0, arm2);
        if (this.a(afs2, 2, 0, -1, arm2).o() == avk.a && this.a(afs2, 2, -1, -1, arm2).o() != avk.a) {
            this.a(afs2, aie.ar, this.a(aie.ar, 3), 2, 0, -1, arm2);
        }
        this.a(afs2, arm2, 1, 1, 1, 3, 3, 3, aie.a, aie.a, false);
        if (this.a) {
            this.a(afs2, aie.aJ, 0, 0, 5, 0, arm2);
            this.a(afs2, aie.aJ, 0, 1, 5, 0, arm2);
            this.a(afs2, aie.aJ, 0, 2, 5, 0, arm2);
            this.a(afs2, aie.aJ, 0, 3, 5, 0, arm2);
            this.a(afs2, aie.aJ, 0, 4, 5, 0, arm2);
            this.a(afs2, aie.aJ, 0, 0, 5, 4, arm2);
            this.a(afs2, aie.aJ, 0, 1, 5, 4, arm2);
            this.a(afs2, aie.aJ, 0, 2, 5, 4, arm2);
            this.a(afs2, aie.aJ, 0, 3, 5, 4, arm2);
            this.a(afs2, aie.aJ, 0, 4, 5, 4, arm2);
            this.a(afs2, aie.aJ, 0, 4, 5, 1, arm2);
            this.a(afs2, aie.aJ, 0, 4, 5, 2, arm2);
            this.a(afs2, aie.aJ, 0, 4, 5, 3, arm2);
            this.a(afs2, aie.aJ, 0, 0, 5, 1, arm2);
            this.a(afs2, aie.aJ, 0, 0, 5, 2, arm2);
            this.a(afs2, aie.aJ, 0, 0, 5, 3, arm2);
        }
        if (this.a) {
            n2 = this.a(aie.ap, 3);
            this.a(afs2, aie.ap, n2, 3, 1, 3, arm2);
            this.a(afs2, aie.ap, n2, 3, 2, 3, arm2);
            this.a(afs2, aie.ap, n2, 3, 3, 3, arm2);
            this.a(afs2, aie.ap, n2, 3, 4, 3, arm2);
        }
        this.a(afs2, aie.aa, 0, 2, 3, 1, arm2);
        for (n2 = 0; n2 < 5; ++n2) {
            for (int i2 = 0; i2 < 5; ++i2) {
                this.b(afs2, i2, 6, n2, arm2);
                this.b(afs2, aie.e, 0, i2, -1, n2, arm2);
            }
        }
        this.a(afs2, arm2, 1, 1, 2, 1);
        return true;
    }
}

