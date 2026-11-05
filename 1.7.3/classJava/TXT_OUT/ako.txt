/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class ako
extends alx {
    protected pw[] a;
    protected pw[] b;

    public ako() {
        super(avk.d);
        this.a(aak.b);
        this.c(2.0f);
        this.a(f);
    }

    public static int c(int n2) {
        return n2 & 3;
    }

    @Override
    public int a(Random random) {
        return 1;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(this);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        int n6 = 4;
        int n7 = n6 + 1;
        if (afs2.b(n2 - n7, n3 - n7, n4 - n7, n2 + n7, n3 + n7, n4 + n7)) {
            for (int i2 = -n6; i2 <= n6; ++i2) {
                for (int i3 = -n6; i3 <= n6; ++i3) {
                    for (int i4 = -n6; i4 <= n6; ++i4) {
                        int n8;
                        if (afs2.a(n2 + i2, n3 + i3, n4 + i4).o() != avk.j || ((n8 = afs2.e(n2 + i2, n3 + i3, n4 + i4)) & 8) != 0) continue;
                        afs2.a(n2 + i2, n3 + i3, n4 + i4, n8 | 8, 4);
                    }
                }
            }
        }
    }

    @Override
    protected pw b(int n2) {
        return this.a[n2 % this.a.length];
    }

    @Override
    protected pw d(int n2) {
        return this.b[n2 % this.b.length];
    }
}

