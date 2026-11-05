/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class arh
extends apt {
    private final int a;
    private final boolean b;
    private final int c;
    private final int d;

    public arh(boolean bl2) {
        this(bl2, 4, 0, 0, false);
    }

    public arh(boolean bl2, int n2, int n3, int n4, boolean bl3) {
        super(bl2);
        this.a = n2;
        this.c = n3;
        this.d = n4;
        this.b = bl3;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = random.nextInt(3) + this.a;
        boolean bl2 = true;
        if (n3 < 1 || n3 + n11 + 1 > 256) {
            return false;
        }
        for (int i2 = n3; i2 <= n3 + 1 + n11; ++i2) {
            n10 = 1;
            if (i2 == n3) {
                n10 = 0;
            }
            if (i2 >= n3 + 1 + n11 - 2) {
                n10 = 2;
            }
            for (n9 = n2 - n10; n9 <= n2 + n10 && bl2; ++n9) {
                for (n8 = n4 - n10; n8 <= n4 + n10 && bl2; ++n8) {
                    if (i2 >= 0 && i2 < 256) {
                        ahz ahz2 = afs2.a(n9, i2, n8);
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
        if (ahz3 != aie.c && ahz3 != aie.d && ahz3 != aie.ak || n3 >= 256 - n11 - 1) {
            return false;
        }
        this.a(afs2, n2, n3 - 1, n4, aie.d);
        n10 = 3;
        n9 = 0;
        for (n8 = n3 - n10 + n11; n8 <= n3 + n11; ++n8) {
            int n12 = n8 - (n3 + n11);
            n7 = n9 + 1 - n12 / 2;
            for (n6 = n2 - n7; n6 <= n2 + n7; ++n6) {
                n5 = n6 - n2;
                for (int i3 = n4 - n7; i3 <= n4 + n7; ++i3) {
                    ahz ahz4;
                    int n13 = i3 - n4;
                    if (Math.abs(n5) == n7 && Math.abs(n13) == n7 && (random.nextInt(2) == 0 || n12 == 0) || (ahz4 = afs2.a(n6, n8, i3)).o() != avk.a && ahz4.o() != avk.j) continue;
                    this.a(afs2, n6, n8, i3, aie.t, this.d);
                }
            }
        }
        for (n8 = 0; n8 < n11; ++n8) {
            ahz ahz5 = afs2.a(n2, n3 + n8, n4);
            if (ahz5.o() != avk.a && ahz5.o() != avk.j) continue;
            this.a(afs2, n2, n3 + n8, n4, aie.r, this.c);
            if (!this.b || n8 <= 0) continue;
            if (random.nextInt(3) > 0 && afs2.c(n2 - 1, n3 + n8, n4)) {
                this.a(afs2, n2 - 1, n3 + n8, n4, aie.bd, 8);
            }
            if (random.nextInt(3) > 0 && afs2.c(n2 + 1, n3 + n8, n4)) {
                this.a(afs2, n2 + 1, n3 + n8, n4, aie.bd, 2);
            }
            if (random.nextInt(3) > 0 && afs2.c(n2, n3 + n8, n4 - 1)) {
                this.a(afs2, n2, n3 + n8, n4 - 1, aie.bd, 1);
            }
            if (random.nextInt(3) <= 0 || !afs2.c(n2, n3 + n8, n4 + 1)) continue;
            this.a(afs2, n2, n3 + n8, n4 + 1, aie.bd, 4);
        }
        if (this.b) {
            for (n8 = n3 - 3 + n11; n8 <= n3 + n11; ++n8) {
                int n14 = n8 - (n3 + n11);
                n7 = 2 - n14 / 2;
                for (n6 = n2 - n7; n6 <= n2 + n7; ++n6) {
                    for (n5 = n4 - n7; n5 <= n4 + n7; ++n5) {
                        if (afs2.a(n6, n8, n5).o() != avk.j) continue;
                        if (random.nextInt(4) == 0 && afs2.a(n6 - 1, n8, n5).o() == avk.a) {
                            this.a(afs2, n6 - 1, n8, n5, 8);
                        }
                        if (random.nextInt(4) == 0 && afs2.a(n6 + 1, n8, n5).o() == avk.a) {
                            this.a(afs2, n6 + 1, n8, n5, 2);
                        }
                        if (random.nextInt(4) == 0 && afs2.a(n6, n8, n5 - 1).o() == avk.a) {
                            this.a(afs2, n6, n8, n5 - 1, 1);
                        }
                        if (random.nextInt(4) != 0 || afs2.a(n6, n8, n5 + 1).o() != avk.a) continue;
                        this.a(afs2, n6, n8, n5 + 1, 4);
                    }
                }
            }
            if (random.nextInt(5) == 0 && n11 > 5) {
                for (n8 = 0; n8 < 2; ++n8) {
                    for (int i4 = 0; i4 < 4; ++i4) {
                        if (random.nextInt(4 - n8) != 0) continue;
                        n7 = random.nextInt(3);
                        this.a(afs2, n2 + p.a[p.f[i4]], n3 + n11 - 5 + n8, n4 + p.b[p.f[i4]], aie.by, n7 << 2 | i4);
                    }
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

