/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class arg
extends aqe {
    private ahz a;
    private int b;

    public arg(ahz ahz2, int n2) {
        this.a = ahz2;
        this.b = n2;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        ahz ahz2;
        while (((ahz2 = afs2.a(n2, n3, n4)).o() == avk.a || ahz2.o() == avk.j) && n3 > 0) {
            --n3;
        }
        for (int i2 = 0; i2 < 128; ++i2) {
            int n5;
            int n6;
            int n7 = n2 + random.nextInt(8) - random.nextInt(8);
            if (!afs2.c(n7, n6 = n3 + random.nextInt(4) - random.nextInt(4), n5 = n4 + random.nextInt(8) - random.nextInt(8)) || !this.a.j(afs2, n7, n6, n5)) continue;
            afs2.d(n7, n6, n5, this.a, this.b, 2);
        }
        return true;
    }
}

