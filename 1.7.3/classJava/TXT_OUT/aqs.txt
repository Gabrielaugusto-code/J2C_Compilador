/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class aqs
extends apt {
    protected final int a;
    protected final int b;
    protected final int c;
    protected int d;

    public aqs(boolean bl2, int n2, int n3, int n4, int n5) {
        super(bl2);
        this.a = n2;
        this.d = n3;
        this.b = n4;
        this.c = n5;
    }

    protected int a(Random random) {
        int n2 = random.nextInt(3) + this.a;
        if (this.d > 1) {
            n2 += random.nextInt(this.d);
        }
        return n2;
    }

    private boolean b(afs afs2, Random random, int n2, int n3, int n4, int n5) {
        boolean bl2 = true;
        if (n3 < 1 || n3 + n5 + 1 > 256) {
            return false;
        }
        for (int i2 = n3; i2 <= n3 + 1 + n5; ++i2) {
            int n6 = 2;
            if (i2 == n3) {
                n6 = 1;
            }
            if (i2 >= n3 + 1 + n5 - 2) {
                n6 = 2;
            }
            for (int i3 = n2 - n6; i3 <= n2 + n6 && bl2; ++i3) {
                for (int i4 = n4 - n6; i4 <= n4 + n6 && bl2; ++i4) {
                    if (i2 >= 0 && i2 < 256) {
                        ahz ahz2 = afs2.a(i3, i2, i4);
                        if (this.a(ahz2)) continue;
                        bl2 = false;
                        continue;
                    }
                    bl2 = false;
                }
            }
        }
        return bl2;
    }

    private boolean c(afs afs2, Random random, int n2, int n3, int n4) {
        ahz ahz2 = afs2.a(n2, n3 - 1, n4);
        if (ahz2 != aie.c && ahz2 != aie.d || n3 < 2) {
            return false;
        }
        afs2.d(n2, n3 - 1, n4, aie.d, 0, 2);
        afs2.d(n2 + 1, n3 - 1, n4, aie.d, 0, 2);
        afs2.d(n2, n3 - 1, n4 + 1, aie.d, 0, 2);
        afs2.d(n2 + 1, n3 - 1, n4 + 1, aie.d, 0, 2);
        return true;
    }

    protected boolean a(afs afs2, Random random, int n2, int n3, int n4, int n5) {
        return this.b(afs2, random, n2, n3, n4, n5) && this.c(afs2, random, n2, n3, n4);
    }

    protected void a(afs afs2, int n2, int n3, int n4, int n5, Random random) {
        int n6 = n5 * n5;
        for (int i2 = n2 - n5; i2 <= n2 + n5 + 1; ++i2) {
            int n7 = i2 - n2;
            for (int i3 = n4 - n5; i3 <= n4 + n5 + 1; ++i3) {
                ahz ahz2;
                int n8 = i3 - n4;
                int n9 = n7 - 1;
                int n10 = n8 - 1;
                if (n7 * n7 + n8 * n8 > n6 && n9 * n9 + n10 * n10 > n6 && n7 * n7 + n10 * n10 > n6 && n9 * n9 + n8 * n8 > n6 || (ahz2 = afs2.a(i2, n3, i3)).o() != avk.a && ahz2.o() != avk.j) continue;
                this.a(afs2, i2, n3, i3, aie.t, this.c);
            }
        }
    }

    protected void b(afs afs2, int n2, int n3, int n4, int n5, Random random) {
        int n6 = n5 * n5;
        for (int i2 = n2 - n5; i2 <= n2 + n5; ++i2) {
            int n7 = i2 - n2;
            for (int i3 = n4 - n5; i3 <= n4 + n5; ++i3) {
                ahz ahz2;
                int n8 = i3 - n4;
                if (n7 * n7 + n8 * n8 > n6 || (ahz2 = afs2.a(i2, n3, i3)).o() != avk.a && ahz2.o() != avk.j) continue;
                this.a(afs2, i2, n3, i3, aie.t, this.c);
            }
        }
    }
}

