/*
 * Decompiled with CFR 0.152.
 */
public class zx
extends abs {
    public zx() {
        this.a(aak.c);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        if (n5 != 1) {
            return false;
        }
        ++n3;
        ahy ahy2 = (ahy)aie.C;
        int n6 = oy.c((double)(xq2.y * 4.0f / 360.0f) + 0.5) & 3;
        int n7 = 0;
        int n8 = 0;
        if (n6 == 0) {
            n8 = 1;
        }
        if (n6 == 1) {
            n7 = -1;
        }
        if (n6 == 2) {
            n8 = -1;
        }
        if (n6 == 3) {
            n7 = 1;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2) || !xq2.a(n2 + n7, n3, n4 + n8, n5, abu2)) {
            return false;
        }
        if (afs2.c(n2, n3, n4) && afs2.c(n2 + n7, n3, n4 + n8) && afs.a(afs2, n2, n3 - 1, n4) && afs.a(afs2, n2 + n7, n3 - 1, n4 + n8)) {
            afs2.d(n2, n3, n4, ahy2, n6, 3);
            if (afs2.a(n2, n3, n4) == ahy2) {
                afs2.d(n2 + n7, n3, n4 + n8, ahy2, n6 + 8, 3);
            }
            --abu2.b;
            return true;
        }
        return false;
    }
}

