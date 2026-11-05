/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqy
extends aqe {
    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < 20; ++i2) {
            int n5;
            int n6;
            int n7 = n2 + random.nextInt(4) - random.nextInt(4);
            if (!afs2.c(n7, n6 = n3, n5 = n4 + random.nextInt(4) - random.nextInt(4)) || afs2.a(n7 - 1, n6 - 1, n5).o() != avk.h && afs2.a(n7 + 1, n6 - 1, n5).o() != avk.h && afs2.a(n7, n6 - 1, n5 - 1).o() != avk.h && afs2.a(n7, n6 - 1, n5 + 1).o() != avk.h) continue;
            int n8 = 2 + random.nextInt(random.nextInt(3) + 1);
            for (int i3 = 0; i3 < n8; ++i3) {
                if (!aie.aH.j(afs2, n7, n6 + i3, n5)) continue;
                afs2.d(n7, n6 + i3, n5, aie.aH, 0, 2);
            }
        }
        return true;
    }
}

