/*
 * Decompiled with CFR 0.152.
 */
public class aay
extends abs {
    private avk a;

    public aay(avk avk2) {
        this.a = avk2;
        this.h = 1;
        this.a(aak.d);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (n5 != 1) {
            return false;
        }
        ahz ahz2 = this.a == avk.d ? aie.ao : aie.av;
        if (!xq2.a(n2, ++n3, n4, n5, abu2) || !xq2.a(n2, n3 + 1, n4, n5, abu2)) {
            return false;
        }
        if (!ahz2.c(afs2, n2, n3, n4)) {
            return false;
        }
        int n6 = oy.c((double)((xq2.y + 180.0f) * 4.0f / 360.0f) - 0.5) & 3;
        aay.a(afs2, n2, n3, n4, n6, ahz2);
        --abu2.b;
        return true;
    }

    public static void a(afs afs2, int n2, int n3, int n4, int n5, ahz ahz2) {
        int n6 = 0;
        int n7 = 0;
        if (n5 == 0) {
            n7 = 1;
        }
        if (n5 == 1) {
            n6 = -1;
        }
        if (n5 == 2) {
            n7 = -1;
        }
        if (n5 == 3) {
            n6 = 1;
        }
        int n8 = (afs2.a(n2 - n6, n3, n4 - n7).r() ? 1 : 0) + (afs2.a(n2 - n6, n3 + 1, n4 - n7).r() ? 1 : 0);
        int n9 = (afs2.a(n2 + n6, n3, n4 + n7).r() ? 1 : 0) + (afs2.a(n2 + n6, n3 + 1, n4 + n7).r() ? 1 : 0);
        boolean bl2 = afs2.a(n2 - n6, n3, n4 - n7) == ahz2 || afs2.a(n2 - n6, n3 + 1, n4 - n7) == ahz2;
        boolean bl3 = afs2.a(n2 + n6, n3, n4 + n7) == ahz2 || afs2.a(n2 + n6, n3 + 1, n4 + n7) == ahz2;
        boolean bl4 = false;
        if (bl2 && !bl3) {
            bl4 = true;
        } else if (n9 > n8) {
            bl4 = true;
        }
        afs2.d(n2, n3, n4, ahz2, n5, 2);
        afs2.d(n2, n3 + 1, n4, ahz2, 8 | (bl4 ? 1 : 0), 2);
        afs2.d(n2, n3, n4, ahz2);
        afs2.d(n2, n3 + 1, n4, ahz2);
    }
}

