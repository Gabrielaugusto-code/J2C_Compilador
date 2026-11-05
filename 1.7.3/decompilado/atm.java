/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atm
extends ats {
    private static final po[] b = new po[]{new po(abv.j, 0, 1, 5, 10), new po(abv.k, 0, 1, 3, 5), new po(abv.ax, 0, 4, 9, 5), new po(abv.h, 0, 3, 8, 10), new po(abv.P, 0, 1, 3, 15), new po(abv.e, 0, 1, 3, 15), new po(abv.b, 0, 1, 1, 1)};
    protected int a;

    public atm() {
    }

    public atm(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
        this.a = random.nextInt(5);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Type", this.a);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.f("Type");
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((atp)aua2, list, random, 4, 1);
        this.b((atp)aua2, list, random, 1, 4);
        this.c((atp)aua2, list, random, 1, 4);
    }

    public static atm a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -4, -1, 0, 11, 7, 11, n5);
        if (!atm.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atm(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 10, 6, 10, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 4, 1, 0);
        this.a(afs2, arm2, 4, 1, 10, 6, 3, 10, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 1, 4, 0, 3, 6, aie.a, aie.a, false);
        this.a(afs2, arm2, 10, 1, 4, 10, 3, 6, aie.a, aie.a, false);
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                this.a(afs2, aie.aV, 0, 5, 1, 5, arm2);
                this.a(afs2, aie.aV, 0, 5, 2, 5, arm2);
                this.a(afs2, aie.aV, 0, 5, 3, 5, arm2);
                this.a(afs2, aie.aa, 0, 4, 3, 5, arm2);
                this.a(afs2, aie.aa, 0, 6, 3, 5, arm2);
                this.a(afs2, aie.aa, 0, 5, 3, 4, arm2);
                this.a(afs2, aie.aa, 0, 5, 3, 6, arm2);
                this.a(afs2, aie.U, 0, 4, 1, 4, arm2);
                this.a(afs2, aie.U, 0, 4, 1, 5, arm2);
                this.a(afs2, aie.U, 0, 4, 1, 6, arm2);
                this.a(afs2, aie.U, 0, 6, 1, 4, arm2);
                this.a(afs2, aie.U, 0, 6, 1, 5, arm2);
                this.a(afs2, aie.U, 0, 6, 1, 6, arm2);
                this.a(afs2, aie.U, 0, 5, 1, 4, arm2);
                this.a(afs2, aie.U, 0, 5, 1, 6, arm2);
                break;
            }
            case 1: {
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.a(afs2, aie.aV, 0, 3, 1, 3 + i2, arm2);
                    this.a(afs2, aie.aV, 0, 7, 1, 3 + i2, arm2);
                    this.a(afs2, aie.aV, 0, 3 + i2, 1, 3, arm2);
                    this.a(afs2, aie.aV, 0, 3 + i2, 1, 7, arm2);
                }
                this.a(afs2, aie.aV, 0, 5, 1, 5, arm2);
                this.a(afs2, aie.aV, 0, 5, 2, 5, arm2);
                this.a(afs2, aie.aV, 0, 5, 3, 5, arm2);
                this.a(afs2, aie.i, 0, 5, 4, 5, arm2);
                break;
            }
            case 2: {
                int n2;
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(afs2, aie.e, 0, 1, 3, n2, arm2);
                    this.a(afs2, aie.e, 0, 9, 3, n2, arm2);
                }
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(afs2, aie.e, 0, n2, 3, 1, arm2);
                    this.a(afs2, aie.e, 0, n2, 3, 9, arm2);
                }
                this.a(afs2, aie.e, 0, 5, 1, 4, arm2);
                this.a(afs2, aie.e, 0, 5, 1, 6, arm2);
                this.a(afs2, aie.e, 0, 5, 3, 4, arm2);
                this.a(afs2, aie.e, 0, 5, 3, 6, arm2);
                this.a(afs2, aie.e, 0, 4, 1, 5, arm2);
                this.a(afs2, aie.e, 0, 6, 1, 5, arm2);
                this.a(afs2, aie.e, 0, 4, 3, 5, arm2);
                this.a(afs2, aie.e, 0, 6, 3, 5, arm2);
                for (n2 = 1; n2 <= 3; ++n2) {
                    this.a(afs2, aie.e, 0, 4, n2, 4, arm2);
                    this.a(afs2, aie.e, 0, 6, n2, 4, arm2);
                    this.a(afs2, aie.e, 0, 4, n2, 6, arm2);
                    this.a(afs2, aie.e, 0, 6, n2, 6, arm2);
                }
                this.a(afs2, aie.aa, 0, 5, 3, 5, arm2);
                for (n2 = 2; n2 <= 8; ++n2) {
                    this.a(afs2, aie.f, 0, 2, 3, n2, arm2);
                    this.a(afs2, aie.f, 0, 3, 3, n2, arm2);
                    if (n2 <= 3 || n2 >= 7) {
                        this.a(afs2, aie.f, 0, 4, 3, n2, arm2);
                        this.a(afs2, aie.f, 0, 5, 3, n2, arm2);
                        this.a(afs2, aie.f, 0, 6, 3, n2, arm2);
                    }
                    this.a(afs2, aie.f, 0, 7, 3, n2, arm2);
                    this.a(afs2, aie.f, 0, 8, 3, n2, arm2);
                }
                this.a(afs2, aie.ap, this.a(aie.ap, 4), 9, 1, 3, arm2);
                this.a(afs2, aie.ap, this.a(aie.ap, 4), 9, 2, 3, arm2);
                this.a(afs2, aie.ap, this.a(aie.ap, 4), 9, 3, 3, arm2);
                this.a(afs2, arm2, random, 3, 4, 8, po.a(b, abv.bR.b(random)), 1 + random.nextInt(4));
            }
        }
        return true;
    }
}

