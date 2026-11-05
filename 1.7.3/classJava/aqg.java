/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqg
extends arh {
    private int a;
    private int b;

    public aqg(int n2, int n3) {
        super(false);
        this.b = n2;
        this.a = n3;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        ahz ahz2;
        while (((ahz2 = afs2.a(n2, n3, n4)).o() == avk.a || ahz2.o() == avk.j) && n3 > 0) {
            --n3;
        }
        ahz ahz3 = afs2.a(n2, n3, n4);
        if (ahz3 == aie.d || ahz3 == aie.c) {
            this.a(afs2, n2, ++n3, n4, aie.r, this.b);
            for (int i2 = n3; i2 <= n3 + 2; ++i2) {
                int n5 = i2 - n3;
                int n6 = 2 - n5;
                for (int i3 = n2 - n6; i3 <= n2 + n6; ++i3) {
                    int n7 = i3 - n2;
                    for (int i4 = n4 - n6; i4 <= n4 + n6; ++i4) {
                        int n8 = i4 - n4;
                        if (Math.abs(n7) == n6 && Math.abs(n8) == n6 && random.nextInt(2) == 0 || afs2.a(i3, i2, i4).j()) continue;
                        this.a(afs2, i3, i2, i4, aie.t, this.a);
                    }
                }
            }
        }
        return true;
    }
}

