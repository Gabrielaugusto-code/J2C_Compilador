/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ari
extends aqe {
    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5 = n2;
        int n6 = n4;
        while (n3 < 128) {
            if (afs2.c(n2, n3, n4)) {
                for (int i2 = 2; i2 <= 5; ++i2) {
                    if (!aie.bd.d(afs2, n2, n3, n4, i2)) continue;
                    afs2.d(n2, n3, n4, aie.bd, 1 << p.e[q.a[i2]], 2);
                    break;
                }
            } else {
                n2 = n5 + random.nextInt(4) - random.nextInt(4);
                n4 = n6 + random.nextInt(4) - random.nextInt(4);
            }
            ++n3;
        }
        return true;
    }
}

