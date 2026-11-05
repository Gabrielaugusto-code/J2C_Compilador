/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqr
extends aqs {
    private boolean e;

    public aqr(boolean bl2, boolean bl3) {
        super(bl2, 13, 15, 1, 1);
        this.e = bl3;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5 = this.a(random);
        if (!this.a(afs2, random, n2, n3, n4, n5)) {
            return false;
        }
        this.c(afs2, n2, n4, n3 + n5, 0, random);
        for (int i2 = 0; i2 < n5; ++i2) {
            ahz ahz2 = afs2.a(n2, n3 + i2, n4);
            if (ahz2.o() == avk.a || ahz2.o() == avk.j) {
                this.a(afs2, n2, n3 + i2, n4, aie.r, this.b);
            }
            if (i2 >= n5 - 1) continue;
            ahz2 = afs2.a(n2 + 1, n3 + i2, n4);
            if (ahz2.o() == avk.a || ahz2.o() == avk.j) {
                this.a(afs2, n2 + 1, n3 + i2, n4, aie.r, this.b);
            }
            if ((ahz2 = afs2.a(n2 + 1, n3 + i2, n4 + 1)).o() == avk.a || ahz2.o() == avk.j) {
                this.a(afs2, n2 + 1, n3 + i2, n4 + 1, aie.r, this.b);
            }
            if ((ahz2 = afs2.a(n2, n3 + i2, n4 + 1)).o() != avk.a && ahz2.o() != avk.j) continue;
            this.a(afs2, n2, n3 + i2, n4 + 1, aie.r, this.b);
        }
        return true;
    }

    private void c(afs afs2, int n2, int n3, int n4, int n5, Random random) {
        int n6 = random.nextInt(5);
        n6 = this.e ? (n6 += this.a) : (n6 += 3);
        int n7 = 0;
        for (int i2 = n4 - n6; i2 <= n4; ++i2) {
            int n8 = n4 - i2;
            int n9 = n5 + oy.d((float)n8 / (float)n6 * 3.5f);
            this.a(afs2, n2, i2, n3, n9 + (n8 > 0 && n9 == n7 && (i2 & 1) == 0 ? 1 : 0), random);
            n7 = n9;
        }
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        this.c(afs2, random, n2 - 1, n3, n4 - 1);
        this.c(afs2, random, n2 + 2, n3, n4 - 1);
        this.c(afs2, random, n2 - 1, n3, n4 + 2);
        this.c(afs2, random, n2 + 2, n3, n4 + 2);
        for (int i2 = 0; i2 < 5; ++i2) {
            int n5 = random.nextInt(64);
            int n6 = n5 % 8;
            int n7 = n5 / 8;
            if (n6 != 0 && n6 != 7 && n7 != 0 && n7 != 7) continue;
            this.c(afs2, random, n2 - 3 + n6, n3, n4 - 3 + n7);
        }
    }

    private void c(afs afs2, Random random, int n2, int n3, int n4) {
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                if (Math.abs(i2) == 2 && Math.abs(i3) == 2) continue;
                this.a(afs2, n2 + i2, n3, n4 + i3);
            }
        }
    }

    private void a(afs afs2, int n2, int n3, int n4) {
        for (int i2 = n3 + 2; i2 >= n3 - 3; --i2) {
            ahz ahz2 = afs2.a(n2, i2, n4);
            if (ahz2 == aie.c || ahz2 == aie.d) {
                this.a(afs2, n2, i2, n4, aie.d, 2);
                break;
            }
            if (ahz2.o() != avk.a && i2 < n3) break;
        }
    }
}

