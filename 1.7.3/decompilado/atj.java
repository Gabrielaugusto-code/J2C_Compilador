/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atj
extends ats {
    private boolean a;

    public atj() {
    }

    public atj(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Mob", this.a);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.n("Mob");
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        if (aua2 != null) {
            ((atp)aua2).b = this;
        }
    }

    public static atj a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -4, -1, 0, 11, 8, 16, n5);
        if (!atj.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atj(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        this.a(afs2, arm2, 0, 0, 0, 10, 7, 15, false, random, asz.c());
        this.a(afs2, random, arm2, att.c, 4, 1, 0);
        int n4 = 6;
        this.a(afs2, arm2, 1, n4, 1, 1, n4, 14, false, random, asz.c());
        this.a(afs2, arm2, 9, n4, 1, 9, n4, 14, false, random, asz.c());
        this.a(afs2, arm2, 2, n4, 1, 8, n4, 2, false, random, asz.c());
        this.a(afs2, arm2, 2, n4, 14, 8, n4, 14, false, random, asz.c());
        this.a(afs2, arm2, 1, 1, 1, 2, 1, 4, false, random, asz.c());
        this.a(afs2, arm2, 8, 1, 1, 9, 1, 4, false, random, asz.c());
        this.a(afs2, arm2, 1, 1, 1, 1, 1, 3, aie.k, aie.k, false);
        this.a(afs2, arm2, 9, 1, 1, 9, 1, 3, aie.k, aie.k, false);
        this.a(afs2, arm2, 3, 1, 8, 7, 1, 12, false, random, asz.c());
        this.a(afs2, arm2, 4, 1, 9, 6, 1, 11, aie.k, aie.k, false);
        for (n3 = 3; n3 < 14; n3 += 2) {
            this.a(afs2, arm2, 0, 3, n3, 0, 4, n3, aie.aY, aie.aY, false);
            this.a(afs2, arm2, 10, 3, n3, 10, 4, n3, aie.aY, aie.aY, false);
        }
        for (n3 = 2; n3 < 9; n3 += 2) {
            this.a(afs2, arm2, n3, 3, 15, n3, 4, 15, aie.aY, aie.aY, false);
        }
        n3 = this.a(aie.bg, 3);
        this.a(afs2, arm2, 4, 1, 5, 6, 1, 7, false, random, asz.c());
        this.a(afs2, arm2, 4, 2, 6, 6, 2, 7, false, random, asz.c());
        this.a(afs2, arm2, 4, 3, 7, 6, 3, 7, false, random, asz.c());
        for (n2 = 4; n2 <= 6; ++n2) {
            this.a(afs2, aie.bg, n3, n2, 1, 4, arm2);
            this.a(afs2, aie.bg, n3, n2, 2, 5, arm2);
            this.a(afs2, aie.bg, n3, n2, 3, 6, arm2);
        }
        n2 = 2;
        int n5 = 0;
        int n6 = 3;
        int n7 = 1;
        switch (this.g) {
            case 0: {
                n2 = 0;
                n5 = 2;
                break;
            }
            case 3: {
                n2 = 3;
                n5 = 1;
                n6 = 0;
                n7 = 2;
                break;
            }
            case 1: {
                n2 = 1;
                n5 = 3;
                n6 = 0;
                n7 = 2;
            }
        }
        this.a(afs2, aie.br, n2 + (random.nextFloat() > 0.9f ? 4 : 0), 4, 3, 8, arm2);
        this.a(afs2, aie.br, n2 + (random.nextFloat() > 0.9f ? 4 : 0), 5, 3, 8, arm2);
        this.a(afs2, aie.br, n2 + (random.nextFloat() > 0.9f ? 4 : 0), 6, 3, 8, arm2);
        this.a(afs2, aie.br, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 4, 3, 12, arm2);
        this.a(afs2, aie.br, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 5, 3, 12, arm2);
        this.a(afs2, aie.br, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 6, 3, 12, arm2);
        this.a(afs2, aie.br, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 9, arm2);
        this.a(afs2, aie.br, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 10, arm2);
        this.a(afs2, aie.br, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 11, arm2);
        this.a(afs2, aie.br, n7 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 9, arm2);
        this.a(afs2, aie.br, n7 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 10, arm2);
        this.a(afs2, aie.br, n7 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 11, arm2);
        if (!this.a) {
            int n8;
            n4 = this.a(3);
            int n9 = this.a(5, 6);
            if (arm2.b(n9, n4, n8 = this.b(5, 6))) {
                this.a = true;
                afs2.d(n9, n4, n8, aie.ac, 0, 2);
                aoa aoa2 = (aoa)afs2.o(n9, n4, n8);
                if (aoa2 != null) {
                    aoa2.a().a("Silverfish");
                }
            }
        }
        return true;
    }
}

