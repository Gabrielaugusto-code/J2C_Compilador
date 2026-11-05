/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqi
extends aqe {
    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        if (!afs2.c(n2, n3, n4)) {
            return false;
        }
        if (afs2.a(n2, n3 + 1, n4) != aie.aL) {
            return false;
        }
        afs2.d(n2, n3, n4, aie.aN, 0, 2);
        for (int i2 = 0; i2 < 1500; ++i2) {
            int n5;
            int n6;
            int n7 = n2 + random.nextInt(8) - random.nextInt(8);
            if (afs2.a(n7, n6 = n3 - random.nextInt(12), n5 = n4 + random.nextInt(8) - random.nextInt(8)).o() != avk.a) continue;
            int n8 = 0;
            for (int i3 = 0; i3 < 6; ++i3) {
                ahz ahz2 = null;
                if (i3 == 0) {
                    ahz2 = afs2.a(n7 - 1, n6, n5);
                }
                if (i3 == 1) {
                    ahz2 = afs2.a(n7 + 1, n6, n5);
                }
                if (i3 == 2) {
                    ahz2 = afs2.a(n7, n6 - 1, n5);
                }
                if (i3 == 3) {
                    ahz2 = afs2.a(n7, n6 + 1, n5);
                }
                if (i3 == 4) {
                    ahz2 = afs2.a(n7, n6, n5 - 1);
                }
                if (i3 == 5) {
                    ahz2 = afs2.a(n7, n6, n5 + 1);
                }
                if (ahz2 != aie.aN) continue;
                ++n8;
            }
            if (n8 != true) continue;
            afs2.d(n7, n6, n5, aie.aN, 0, 2);
        }
        return true;
    }
}

