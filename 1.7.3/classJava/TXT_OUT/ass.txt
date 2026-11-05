/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ass
extends asv {
    private boolean[] e = new boolean[4];
    private static final po[] i = new po[]{new po(abv.i, 0, 1, 3, 3), new po(abv.j, 0, 1, 5, 10), new po(abv.k, 0, 2, 7, 15), new po(abv.bC, 0, 1, 3, 2), new po(abv.aS, 0, 4, 6, 20), new po(abv.bh, 0, 3, 7, 16), new po(abv.av, 0, 1, 1, 3), new po(abv.bX, 0, 1, 1, 1), new po(abv.bY, 0, 1, 1, 1), new po(abv.bZ, 0, 1, 1, 1)};

    public ass() {
    }

    public ass(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 21, 15, 21);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("hasPlacedChest0", this.e[0]);
        dg2.a("hasPlacedChest1", this.e[1]);
        dg2.a("hasPlacedChest2", this.e[2]);
        dg2.a("hasPlacedChest3", this.e[3]);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.e[0] = dg2.n("hasPlacedChest0");
        this.e[1] = dg2.n("hasPlacedChest1");
        this.e[2] = dg2.n("hasPlacedChest2");
        this.e[3] = dg2.n("hasPlacedChest3");
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        int n2;
        int n3;
        int n4;
        int n5;
        this.a(afs2, arm2, 0, -4, 0, this.a - 1, 0, this.c - 1, aie.A, aie.A, false);
        for (n5 = 1; n5 <= 9; ++n5) {
            this.a(afs2, arm2, n5, n5, n5, this.a - 1 - n5, n5, this.c - 1 - n5, aie.A, aie.A, false);
            this.a(afs2, arm2, n5 + 1, n5, n5 + 1, this.a - 2 - n5, n5, this.c - 2 - n5, aie.a, aie.a, false);
        }
        for (n5 = 0; n5 < this.a; ++n5) {
            for (n4 = 0; n4 < this.c; ++n4) {
                n3 = -5;
                this.b(afs2, aie.A, 0, n5, n3, n4, arm2);
            }
        }
        n5 = this.a(aie.bz, 3);
        n4 = this.a(aie.bz, 2);
        n3 = this.a(aie.bz, 0);
        int n6 = this.a(aie.bz, 1);
        int n7 = 1;
        int n8 = 11;
        this.a(afs2, arm2, 0, 0, 0, 4, 9, 4, aie.A, aie.a, false);
        this.a(afs2, arm2, 1, 10, 1, 3, 10, 3, aie.A, aie.A, false);
        this.a(afs2, aie.bz, n5, 2, 10, 0, arm2);
        this.a(afs2, aie.bz, n4, 2, 10, 4, arm2);
        this.a(afs2, aie.bz, n3, 0, 10, 2, arm2);
        this.a(afs2, aie.bz, n6, 4, 10, 2, arm2);
        this.a(afs2, arm2, this.a - 5, 0, 0, this.a - 1, 9, 4, aie.A, aie.a, false);
        this.a(afs2, arm2, this.a - 4, 10, 1, this.a - 2, 10, 3, aie.A, aie.A, false);
        this.a(afs2, aie.bz, n5, this.a - 3, 10, 0, arm2);
        this.a(afs2, aie.bz, n4, this.a - 3, 10, 4, arm2);
        this.a(afs2, aie.bz, n3, this.a - 5, 10, 2, arm2);
        this.a(afs2, aie.bz, n6, this.a - 1, 10, 2, arm2);
        this.a(afs2, arm2, 8, 0, 0, 12, 4, 4, aie.A, aie.a, false);
        this.a(afs2, arm2, 9, 1, 0, 11, 3, 4, aie.a, aie.a, false);
        this.a(afs2, aie.A, 2, 9, 1, 1, arm2);
        this.a(afs2, aie.A, 2, 9, 2, 1, arm2);
        this.a(afs2, aie.A, 2, 9, 3, 1, arm2);
        this.a(afs2, aie.A, 2, 10, 3, 1, arm2);
        this.a(afs2, aie.A, 2, 11, 3, 1, arm2);
        this.a(afs2, aie.A, 2, 11, 2, 1, arm2);
        this.a(afs2, aie.A, 2, 11, 1, 1, arm2);
        this.a(afs2, arm2, 4, 1, 1, 8, 3, 3, aie.A, aie.a, false);
        this.a(afs2, arm2, 4, 1, 2, 8, 2, 2, aie.a, aie.a, false);
        this.a(afs2, arm2, 12, 1, 1, 16, 3, 3, aie.A, aie.a, false);
        this.a(afs2, arm2, 12, 1, 2, 16, 2, 2, aie.a, aie.a, false);
        this.a(afs2, arm2, 5, 4, 5, this.a - 6, 4, this.c - 6, aie.A, aie.A, false);
        this.a(afs2, arm2, 9, 4, 9, 11, 4, 11, aie.a, aie.a, false);
        this.a(afs2, arm2, 8, 1, 8, 8, 3, 8, aie.A, 2, aie.A, 2, false);
        this.a(afs2, arm2, 12, 1, 8, 12, 3, 8, aie.A, 2, aie.A, 2, false);
        this.a(afs2, arm2, 8, 1, 12, 8, 3, 12, aie.A, 2, aie.A, 2, false);
        this.a(afs2, arm2, 12, 1, 12, 12, 3, 12, aie.A, 2, aie.A, 2, false);
        this.a(afs2, arm2, 1, 1, 5, 4, 4, 11, aie.A, aie.A, false);
        this.a(afs2, arm2, this.a - 5, 1, 5, this.a - 2, 4, 11, aie.A, aie.A, false);
        this.a(afs2, arm2, 6, 7, 9, 6, 7, 11, aie.A, aie.A, false);
        this.a(afs2, arm2, this.a - 7, 7, 9, this.a - 7, 7, 11, aie.A, aie.A, false);
        this.a(afs2, arm2, 5, 5, 9, 5, 7, 11, aie.A, 2, aie.A, 2, false);
        this.a(afs2, arm2, this.a - 6, 5, 9, this.a - 6, 7, 11, aie.A, 2, aie.A, 2, false);
        this.a(afs2, aie.a, 0, 5, 5, 10, arm2);
        this.a(afs2, aie.a, 0, 5, 6, 10, arm2);
        this.a(afs2, aie.a, 0, 6, 6, 10, arm2);
        this.a(afs2, aie.a, 0, this.a - 6, 5, 10, arm2);
        this.a(afs2, aie.a, 0, this.a - 6, 6, 10, arm2);
        this.a(afs2, aie.a, 0, this.a - 7, 6, 10, arm2);
        this.a(afs2, arm2, 2, 4, 4, 2, 6, 4, aie.a, aie.a, false);
        this.a(afs2, arm2, this.a - 3, 4, 4, this.a - 3, 6, 4, aie.a, aie.a, false);
        this.a(afs2, aie.bz, n5, 2, 4, 5, arm2);
        this.a(afs2, aie.bz, n5, 2, 3, 4, arm2);
        this.a(afs2, aie.bz, n5, this.a - 3, 4, 5, arm2);
        this.a(afs2, aie.bz, n5, this.a - 3, 3, 4, arm2);
        this.a(afs2, arm2, 1, 1, 3, 2, 2, 3, aie.A, aie.A, false);
        this.a(afs2, arm2, this.a - 3, 1, 3, this.a - 2, 2, 3, aie.A, aie.A, false);
        this.a(afs2, aie.bz, 0, 1, 1, 2, arm2);
        this.a(afs2, aie.bz, 0, this.a - 2, 1, 2, arm2);
        this.a(afs2, aie.U, 1, 1, 2, 2, arm2);
        this.a(afs2, aie.U, 1, this.a - 2, 2, 2, arm2);
        this.a(afs2, aie.bz, n6, 2, 1, 2, arm2);
        this.a(afs2, aie.bz, n3, this.a - 3, 1, 2, arm2);
        this.a(afs2, arm2, 4, 3, 5, 4, 3, 18, aie.A, aie.A, false);
        this.a(afs2, arm2, this.a - 5, 3, 5, this.a - 5, 3, 17, aie.A, aie.A, false);
        this.a(afs2, arm2, 3, 1, 5, 4, 2, 16, aie.a, aie.a, false);
        this.a(afs2, arm2, this.a - 6, 1, 5, this.a - 5, 2, 16, aie.a, aie.a, false);
        for (n2 = 5; n2 <= 17; n2 += 2) {
            this.a(afs2, aie.A, 2, 4, 1, n2, arm2);
            this.a(afs2, aie.A, 1, 4, 2, n2, arm2);
            this.a(afs2, aie.A, 2, this.a - 5, 1, n2, arm2);
            this.a(afs2, aie.A, 1, this.a - 5, 2, n2, arm2);
        }
        this.a(afs2, aie.L, n7, 10, 0, 7, arm2);
        this.a(afs2, aie.L, n7, 10, 0, 8, arm2);
        this.a(afs2, aie.L, n7, 9, 0, 9, arm2);
        this.a(afs2, aie.L, n7, 11, 0, 9, arm2);
        this.a(afs2, aie.L, n7, 8, 0, 10, arm2);
        this.a(afs2, aie.L, n7, 12, 0, 10, arm2);
        this.a(afs2, aie.L, n7, 7, 0, 10, arm2);
        this.a(afs2, aie.L, n7, 13, 0, 10, arm2);
        this.a(afs2, aie.L, n7, 9, 0, 11, arm2);
        this.a(afs2, aie.L, n7, 11, 0, 11, arm2);
        this.a(afs2, aie.L, n7, 10, 0, 12, arm2);
        this.a(afs2, aie.L, n7, 10, 0, 13, arm2);
        this.a(afs2, aie.L, n8, 10, 0, 10, arm2);
        for (n2 = 0; n2 <= this.a - 1; n2 += this.a - 1) {
            this.a(afs2, aie.A, 2, n2, 2, 1, arm2);
            this.a(afs2, aie.L, n7, n2, 2, 2, arm2);
            this.a(afs2, aie.A, 2, n2, 2, 3, arm2);
            this.a(afs2, aie.A, 2, n2, 3, 1, arm2);
            this.a(afs2, aie.L, n7, n2, 3, 2, arm2);
            this.a(afs2, aie.A, 2, n2, 3, 3, arm2);
            this.a(afs2, aie.L, n7, n2, 4, 1, arm2);
            this.a(afs2, aie.A, 1, n2, 4, 2, arm2);
            this.a(afs2, aie.L, n7, n2, 4, 3, arm2);
            this.a(afs2, aie.A, 2, n2, 5, 1, arm2);
            this.a(afs2, aie.L, n7, n2, 5, 2, arm2);
            this.a(afs2, aie.A, 2, n2, 5, 3, arm2);
            this.a(afs2, aie.L, n7, n2, 6, 1, arm2);
            this.a(afs2, aie.A, 1, n2, 6, 2, arm2);
            this.a(afs2, aie.L, n7, n2, 6, 3, arm2);
            this.a(afs2, aie.L, n7, n2, 7, 1, arm2);
            this.a(afs2, aie.L, n7, n2, 7, 2, arm2);
            this.a(afs2, aie.L, n7, n2, 7, 3, arm2);
            this.a(afs2, aie.A, 2, n2, 8, 1, arm2);
            this.a(afs2, aie.A, 2, n2, 8, 2, arm2);
            this.a(afs2, aie.A, 2, n2, 8, 3, arm2);
        }
        for (n2 = 2; n2 <= this.a - 3; n2 += this.a - 3 - 2) {
            this.a(afs2, aie.A, 2, n2 - 1, 2, 0, arm2);
            this.a(afs2, aie.L, n7, n2, 2, 0, arm2);
            this.a(afs2, aie.A, 2, n2 + 1, 2, 0, arm2);
            this.a(afs2, aie.A, 2, n2 - 1, 3, 0, arm2);
            this.a(afs2, aie.L, n7, n2, 3, 0, arm2);
            this.a(afs2, aie.A, 2, n2 + 1, 3, 0, arm2);
            this.a(afs2, aie.L, n7, n2 - 1, 4, 0, arm2);
            this.a(afs2, aie.A, 1, n2, 4, 0, arm2);
            this.a(afs2, aie.L, n7, n2 + 1, 4, 0, arm2);
            this.a(afs2, aie.A, 2, n2 - 1, 5, 0, arm2);
            this.a(afs2, aie.L, n7, n2, 5, 0, arm2);
            this.a(afs2, aie.A, 2, n2 + 1, 5, 0, arm2);
            this.a(afs2, aie.L, n7, n2 - 1, 6, 0, arm2);
            this.a(afs2, aie.A, 1, n2, 6, 0, arm2);
            this.a(afs2, aie.L, n7, n2 + 1, 6, 0, arm2);
            this.a(afs2, aie.L, n7, n2 - 1, 7, 0, arm2);
            this.a(afs2, aie.L, n7, n2, 7, 0, arm2);
            this.a(afs2, aie.L, n7, n2 + 1, 7, 0, arm2);
            this.a(afs2, aie.A, 2, n2 - 1, 8, 0, arm2);
            this.a(afs2, aie.A, 2, n2, 8, 0, arm2);
            this.a(afs2, aie.A, 2, n2 + 1, 8, 0, arm2);
        }
        this.a(afs2, arm2, 8, 4, 0, 12, 6, 0, aie.A, 2, aie.A, 2, false);
        this.a(afs2, aie.a, 0, 8, 6, 0, arm2);
        this.a(afs2, aie.a, 0, 12, 6, 0, arm2);
        this.a(afs2, aie.L, n7, 9, 5, 0, arm2);
        this.a(afs2, aie.A, 1, 10, 5, 0, arm2);
        this.a(afs2, aie.L, n7, 11, 5, 0, arm2);
        this.a(afs2, arm2, 8, -14, 8, 12, -11, 12, aie.A, 2, aie.A, 2, false);
        this.a(afs2, arm2, 8, -10, 8, 12, -10, 12, aie.A, 1, aie.A, 1, false);
        this.a(afs2, arm2, 8, -9, 8, 12, -9, 12, aie.A, 2, aie.A, 2, false);
        this.a(afs2, arm2, 8, -8, 8, 12, -1, 12, aie.A, aie.A, false);
        this.a(afs2, arm2, 9, -11, 9, 11, -1, 11, aie.a, aie.a, false);
        this.a(afs2, aie.au, 0, 10, -11, 10, arm2);
        this.a(afs2, arm2, 9, -13, 9, 11, -13, 11, aie.W, aie.a, false);
        this.a(afs2, aie.a, 0, 8, -11, 10, arm2);
        this.a(afs2, aie.a, 0, 8, -10, 10, arm2);
        this.a(afs2, aie.A, 1, 7, -10, 10, arm2);
        this.a(afs2, aie.A, 2, 7, -11, 10, arm2);
        this.a(afs2, aie.a, 0, 12, -11, 10, arm2);
        this.a(afs2, aie.a, 0, 12, -10, 10, arm2);
        this.a(afs2, aie.A, 1, 13, -10, 10, arm2);
        this.a(afs2, aie.A, 2, 13, -11, 10, arm2);
        this.a(afs2, aie.a, 0, 10, -11, 8, arm2);
        this.a(afs2, aie.a, 0, 10, -10, 8, arm2);
        this.a(afs2, aie.A, 1, 10, -10, 7, arm2);
        this.a(afs2, aie.A, 2, 10, -11, 7, arm2);
        this.a(afs2, aie.a, 0, 10, -11, 12, arm2);
        this.a(afs2, aie.a, 0, 10, -10, 12, arm2);
        this.a(afs2, aie.A, 1, 10, -10, 13, arm2);
        this.a(afs2, aie.A, 2, 10, -11, 13, arm2);
        for (n2 = 0; n2 < 4; ++n2) {
            if (this.e[n2]) continue;
            int n9 = p.a[n2] * 2;
            int n10 = p.b[n2] * 2;
            this.e[n2] = this.a(afs2, arm2, random, 10 + n9, -11, 10 + n10, po.a(i, abv.bR.b(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}

