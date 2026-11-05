/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqn
extends aqe {
    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        while (afs2.c(n2, n3, n4) && n3 > 2) {
            --n3;
        }
        if (afs2.a(n2, n3, n4) != aie.aE) {
            return false;
        }
        n3 += random.nextInt(4);
        int n8 = random.nextInt(4) + 7;
        int n9 = n8 / 4 + random.nextInt(2);
        if (n9 > 1 && random.nextInt(60) == 0) {
            n3 += 10 + random.nextInt(30);
        }
        for (n7 = 0; n7 < n8; ++n7) {
            float f2 = (1.0f - (float)n7 / (float)n8) * (float)n9;
            n6 = oy.f(f2);
            for (n5 = -n6; n5 <= n6; ++n5) {
                float f3 = (float)oy.a(n5) - 0.25f;
                for (int i2 = -n6; i2 <= n6; ++i2) {
                    float f4 = (float)oy.a(i2) - 0.25f;
                    if ((n5 != 0 || i2 != 0) && f3 * f3 + f4 * f4 > f2 * f2 || (n5 == -n6 || n5 == n6 || i2 == -n6 || i2 == n6) && random.nextFloat() > 0.75f) continue;
                    ahz ahz2 = afs2.a(n2 + n5, n3 + n7, n4 + i2);
                    if (ahz2.o() == avk.a || ahz2 == aie.d || ahz2 == aie.aE || ahz2 == aie.aD) {
                        this.a(afs2, n2 + n5, n3 + n7, n4 + i2, aie.cj);
                    }
                    if (n7 == 0 || n6 <= 1 || (ahz2 = afs2.a(n2 + n5, n3 - n7, n4 + i2)).o() != avk.a && ahz2 != aie.d && ahz2 != aie.aE && ahz2 != aie.aD) continue;
                    this.a(afs2, n2 + n5, n3 - n7, n4 + i2, aie.cj);
                }
            }
        }
        n7 = n9 - 1;
        if (n7 < 0) {
            n7 = 0;
        } else if (n7 > 1) {
            n7 = 1;
        }
        for (int i3 = -n7; i3 <= n7; ++i3) {
            for (n6 = -n7; n6 <= n7; ++n6) {
                ahz ahz3;
                n5 = n3 - 1;
                int n10 = 50;
                if (Math.abs(i3) == 1 && Math.abs(n6) == 1) {
                    n10 = random.nextInt(5);
                }
                while (n5 > 50 && ((ahz3 = afs2.a(n2 + i3, n5, n4 + n6)).o() == avk.a || ahz3 == aie.d || ahz3 == aie.aE || ahz3 == aie.aD || ahz3 == aie.cj)) {
                    this.a(afs2, n2 + i3, n5, n4 + n6, aie.cj);
                    --n5;
                    if (--n10 > 0) continue;
                    n5 -= random.nextInt(5) + 1;
                    n10 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}

