/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahq
extends aqe {
    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < 10; ++i2) {
            int n5;
            int n6;
            int n7 = n2 + random.nextInt(8) - random.nextInt(8);
            if (!afs2.c(n7, n6 = n3 + random.nextInt(4) - random.nextInt(4), n5 = n4 + random.nextInt(8) - random.nextInt(8)) || !aie.bi.c(afs2, n7, n6, n5)) continue;
            afs2.d(n7, n6, n5, aie.bi, 0, 2);
        }
        return true;
    }
}

