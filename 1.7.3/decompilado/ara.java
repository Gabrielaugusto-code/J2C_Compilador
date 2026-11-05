/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ara
extends aqe {
    private ahz a;
    private int b;

    public ara(ahz ahz2, int n2) {
        this.a = ahz2;
        this.b = n2;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        if (afs2.a(n2, n3, n4).o() != avk.h) {
            return false;
        }
        int n5 = random.nextInt(this.b - 2) + 2;
        int n6 = 2;
        for (int i2 = n2 - n5; i2 <= n2 + n5; ++i2) {
            for (int i3 = n4 - n5; i3 <= n4 + n5; ++i3) {
                int n7 = i2 - n2;
                int n8 = i3 - n4;
                if (n7 * n7 + n8 * n8 > n5 * n5) continue;
                for (int i4 = n3 - n6; i4 <= n3 + n6; ++i4) {
                    ahz ahz2 = afs2.a(i2, i4, i3);
                    if (ahz2 != aie.d && ahz2 != aie.c) continue;
                    afs2.d(i2, i4, i3, this.a, 0, 2);
                }
            }
        }
        return true;
    }
}

