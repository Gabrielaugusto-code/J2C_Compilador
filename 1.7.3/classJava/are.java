/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class are
extends apt {
    public are(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = random.nextInt(4) + 6;
        int n11 = 1 + random.nextInt(2);
        int n12 = n10 - n11;
        int n13 = 2 + random.nextInt(2);
        boolean bl2 = true;
        if (n3 < 1 || n3 + n10 + 1 > 256) {
            return false;
        }
        for (int i2 = n3; i2 <= n3 + 1 + n10 && bl2; ++i2) {
            n9 = 1;
            n9 = i2 - n3 < n11 ? 0 : n13;
            for (n8 = n2 - n9; n8 <= n2 + n9 && bl2; ++n8) {
                for (n7 = n4 - n9; n7 <= n4 + n9 && bl2; ++n7) {
                    if (i2 >= 0 && i2 < 256) {
                        ahz ahz2 = afs2.a(n8, i2, n7);
                        if (ahz2.o() == avk.a || ahz2.o() == avk.j) continue;
                        bl2 = false;
                        continue;
                    }
                    bl2 = false;
                }
            }
        }
        if (!bl2) {
            return false;
        }
        ahz ahz3 = afs2.a(n2, n3 - 1, n4);
        if (ahz3 != aie.c && ahz3 != aie.d && ahz3 != aie.ak || n3 >= 256 - n10 - 1) {
            return false;
        }
        this.a(afs2, n2, n3 - 1, n4, aie.d);
        n9 = random.nextInt(2);
        n8 = 1;
        n7 = 0;
        for (n6 = 0; n6 <= n12; ++n6) {
            n5 = n3 + n10 - n6;
            for (int i3 = n2 - n9; i3 <= n2 + n9; ++i3) {
                int n14 = i3 - n2;
                for (int i4 = n4 - n9; i4 <= n4 + n9; ++i4) {
                    int n15 = i4 - n4;
                    if (Math.abs(n14) == n9 && Math.abs(n15) == n9 && n9 > 0 || afs2.a(i3, n5, i4).j()) continue;
                    this.a(afs2, i3, n5, i4, aie.t, 1);
                }
            }
            if (n9 >= n8) {
                n9 = n7;
                n7 = 1;
                if (++n8 <= n13) continue;
                n8 = n13;
                continue;
            }
            ++n9;
        }
        n6 = random.nextInt(3);
        for (n5 = 0; n5 < n10 - n6; ++n5) {
            ahz ahz4 = afs2.a(n2, n3 + n5, n4);
            if (ahz4.o() != avk.a && ahz4.o() != avk.j) continue;
            this.a(afs2, n2, n3 + n5, n4, aie.r, 1);
        }
        return true;
    }
}

