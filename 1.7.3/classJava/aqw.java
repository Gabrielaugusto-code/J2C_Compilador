/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqw
extends apt {
    public aqw() {
        super(false);
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8 = random.nextInt(5) + 7;
        int n9 = n8 - random.nextInt(2) - 3;
        int n10 = n8 - n9;
        int n11 = 1 + random.nextInt(n10 + 1);
        boolean bl2 = true;
        if (n3 < 1 || n3 + n8 + 1 > 256) {
            return false;
        }
        for (int i2 = n3; i2 <= n3 + 1 + n8 && bl2; ++i2) {
            n7 = 1;
            n7 = i2 - n3 < n9 ? 0 : n11;
            for (n6 = n2 - n7; n6 <= n2 + n7 && bl2; ++n6) {
                for (n5 = n4 - n7; n5 <= n4 + n7 && bl2; ++n5) {
                    if (i2 >= 0 && i2 < 256) {
                        ahz ahz2 = afs2.a(n6, i2, n5);
                        if (this.a(ahz2)) continue;
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
        if (ahz3 != aie.c && ahz3 != aie.d || n3 >= 256 - n8 - 1) {
            return false;
        }
        this.a(afs2, n2, n3 - 1, n4, aie.d);
        n7 = 0;
        for (n6 = n3 + n8; n6 >= n3 + n9; --n6) {
            for (n5 = n2 - n7; n5 <= n2 + n7; ++n5) {
                int n12 = n5 - n2;
                for (int i3 = n4 - n7; i3 <= n4 + n7; ++i3) {
                    int n13 = i3 - n4;
                    if (Math.abs(n12) == n7 && Math.abs(n13) == n7 && n7 > 0 || afs2.a(n5, n6, i3).j()) continue;
                    this.a(afs2, n5, n6, i3, aie.t, 1);
                }
            }
            if (n7 >= 1 && n6 == n3 + n9 + 1) {
                --n7;
                continue;
            }
            if (n7 >= n11) continue;
            ++n7;
        }
        for (n6 = 0; n6 < n8 - 1; ++n6) {
            ahz ahz4 = afs2.a(n2, n3 + n6, n4);
            if (ahz4.o() != avk.a && ahz4.o() != avk.j) continue;
            this.a(afs2, n2, n3 + n6, n4, aie.r, 1);
        }
        return true;
    }
}

