/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class arf
extends apt {
    public arf() {
        super(false);
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = random.nextInt(4) + 5;
        while (afs2.a(n2, n3 - 1, n4).o() == avk.h) {
            --n3;
        }
        boolean bl2 = true;
        if (n3 < 1 || n3 + n9 + 1 > 256) {
            return false;
        }
        for (int i2 = n3; i2 <= n3 + 1 + n9; ++i2) {
            n8 = 1;
            if (i2 == n3) {
                n8 = 0;
            }
            if (i2 >= n3 + 1 + n9 - 2) {
                n8 = 3;
            }
            for (n7 = n2 - n8; n7 <= n2 + n8 && bl2; ++n7) {
                for (n6 = n4 - n8; n6 <= n4 + n8 && bl2; ++n6) {
                    if (i2 >= 0 && i2 < 256) {
                        ahz ahz2 = afs2.a(n7, i2, n6);
                        if (ahz2.o() == avk.a || ahz2.o() == avk.j) continue;
                        if (ahz2 == aie.j || ahz2 == aie.i) {
                            if (i2 <= n3) continue;
                            bl2 = false;
                            continue;
                        }
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
        if (ahz3 != aie.c && ahz3 != aie.d || n3 >= 256 - n9 - 1) {
            return false;
        }
        this.a(afs2, n2, n3 - 1, n4, aie.d);
        for (n8 = n3 - 3 + n9; n8 <= n3 + n9; ++n8) {
            n7 = n8 - (n3 + n9);
            n6 = 2 - n7 / 2;
            for (int i3 = n2 - n6; i3 <= n2 + n6; ++i3) {
                n5 = i3 - n2;
                for (int i4 = n4 - n6; i4 <= n4 + n6; ++i4) {
                    int n10 = i4 - n4;
                    if (Math.abs(n5) == n6 && Math.abs(n10) == n6 && (random.nextInt(2) == 0 || n7 == 0) || afs2.a(i3, n8, i4).j()) continue;
                    this.a(afs2, i3, n8, i4, aie.t);
                }
            }
        }
        for (n8 = 0; n8 < n9; ++n8) {
            ahz ahz4 = afs2.a(n2, n3 + n8, n4);
            if (ahz4.o() != avk.a && ahz4.o() != avk.j && ahz4 != aie.i && ahz4 != aie.j) continue;
            this.a(afs2, n2, n3 + n8, n4, aie.r);
        }
        for (n8 = n3 - 3 + n9; n8 <= n3 + n9; ++n8) {
            int n11 = n8 - (n3 + n9);
            n6 = 2 - n11 / 2;
            for (int i5 = n2 - n6; i5 <= n2 + n6; ++i5) {
                for (n5 = n4 - n6; n5 <= n4 + n6; ++n5) {
                    if (afs2.a(i5, n8, n5).o() != avk.j) continue;
                    if (random.nextInt(4) == 0 && afs2.a(i5 - 1, n8, n5).o() == avk.a) {
                        this.a(afs2, i5 - 1, n8, n5, 8);
                    }
                    if (random.nextInt(4) == 0 && afs2.a(i5 + 1, n8, n5).o() == avk.a) {
                        this.a(afs2, i5 + 1, n8, n5, 2);
                    }
                    if (random.nextInt(4) == 0 && afs2.a(i5, n8, n5 - 1).o() == avk.a) {
                        this.a(afs2, i5, n8, n5 - 1, 1);
                    }
                    if (random.nextInt(4) != 0 || afs2.a(i5, n8, n5 + 1).o() != avk.a) continue;
                    this.a(afs2, i5, n8, n5 + 1, 4);
                }
            }
        }
        return true;
    }

    private void a(afs afs2, int n2, int n3, int n4, int n5) {
        this.a(afs2, n2, n3, n4, aie.bd, n5);
        for (int i2 = 4; afs2.a(n2, --n3, n4).o() == avk.a && i2 > 0; --i2) {
            this.a(afs2, n2, n3, n4, aie.bd, n5);
        }
    }
}

