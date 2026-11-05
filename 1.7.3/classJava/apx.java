/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class apx
extends aqe {
    private final po[] a;
    private final int b;

    public apx(po[] poArray, int n2) {
        this.a = poArray;
        this.b = n2;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        ahz ahz2;
        while (((ahz2 = afs2.a(n2, n3, n4)).o() == avk.a || ahz2.o() == avk.j) && n3 > 1) {
            --n3;
        }
        if (n3 < 1) {
            return false;
        }
        ++n3;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n5;
            int n6;
            int n7 = n2 + random.nextInt(4) - random.nextInt(4);
            if (!afs2.c(n7, n6 = n3 + random.nextInt(3) - random.nextInt(3), n5 = n4 + random.nextInt(4) - random.nextInt(4)) || !afs.a(afs2, n7, n6 - 1, n5)) continue;
            afs2.d(n7, n6, n5, aie.ae, 0, 2);
            ann ann2 = (ann)afs2.o(n7, n6, n5);
            if (ann2 != null && ann2 != null) {
                po.a(random, this.a, ann2, this.b);
            }
            if (afs2.c(n7 - 1, n6, n5) && afs.a(afs2, n7 - 1, n6 - 1, n5)) {
                afs2.d(n7 - 1, n6, n5, aie.aa, 0, 2);
            }
            if (afs2.c(n7 + 1, n6, n5) && afs.a(afs2, n7 - 1, n6 - 1, n5)) {
                afs2.d(n7 + 1, n6, n5, aie.aa, 0, 2);
            }
            if (afs2.c(n7, n6, n5 - 1) && afs.a(afs2, n7 - 1, n6 - 1, n5)) {
                afs2.d(n7, n6, n5 - 1, aie.aa, 0, 2);
            }
            if (afs2.c(n7, n6, n5 + 1) && afs.a(afs2, n7 - 1, n6 - 1, n5)) {
                afs2.d(n7, n6, n5 + 1, aie.aa, 0, 2);
            }
            return true;
        }
        return false;
    }
}

