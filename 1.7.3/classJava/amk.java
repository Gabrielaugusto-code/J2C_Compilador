/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class amk
extends akn {
    protected amk(avk avk2) {
        super(avk2);
        this.a(false);
        if (avk2 == avk.i) {
            this.a(true);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        super.a(afs2, n2, n3, n4, ahz2);
        if (afs2.a(n2, n3, n4) == this) {
            this.n(afs2, n2, n3, n4);
        }
    }

    private void n(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        afs2.d(n2, n3, n4, ahz.e(ahz.b(this) - 1), n5, 2);
        afs2.a(n2, n3, n4, ahz.e(ahz.b(this) - 1), this.a(afs2));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (this.J == avk.i) {
            int n5;
            int n6 = random.nextInt(3);
            for (n5 = 0; n5 < n6; ++n5) {
                ahz ahz2 = afs2.a(n2 += random.nextInt(3) - 1, ++n3, n4 += random.nextInt(3) - 1);
                if (ahz2.J == avk.a) {
                    if (!this.o(afs2, n2 - 1, n3, n4) && !this.o(afs2, n2 + 1, n3, n4) && !this.o(afs2, n2, n3, n4 - 1) && !this.o(afs2, n2, n3, n4 + 1) && !this.o(afs2, n2, n3 - 1, n4) && !this.o(afs2, n2, n3 + 1, n4)) continue;
                    afs2.b(n2, n3, n4, aie.ab);
                    return;
                }
                if (!ahz2.J.c()) continue;
                return;
            }
            if (n6 == 0) {
                n5 = n2;
                int n7 = n4;
                for (int i2 = 0; i2 < 3; ++i2) {
                    n2 = n5 + random.nextInt(3) - 1;
                    if (!afs2.c(n2, n3 + 1, n4 = n7 + random.nextInt(3) - 1) || !this.o(afs2, n2, n3, n4)) continue;
                    afs2.b(n2, n3 + 1, n4, aie.ab);
                }
            }
        }
    }

    private boolean o(afs afs2, int n2, int n3, int n4) {
        return afs2.a(n2, n3, n4).o().h();
    }
}

