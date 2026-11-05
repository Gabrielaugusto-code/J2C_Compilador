/*
 * Decompiled with CFR 0.152.
 */
public class acj
extends abs {
    public acj() {
        this.a(aak.d);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (afs2.a(n2, n3, n4) != aie.aC) {
            if (n5 == 0) {
                --n3;
            }
            if (n5 == 1) {
                ++n3;
            }
            if (n5 == 2) {
                --n4;
            }
            if (n5 == 3) {
                ++n4;
            }
            if (n5 == 4) {
                --n2;
            }
            if (n5 == 5) {
                ++n2;
            }
            if (!afs2.c(n2, n3, n4)) {
                return false;
            }
        }
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (aie.af.c(afs2, n2, n3, n4)) {
            --abu2.b;
            afs2.b(n2, n3, n4, aie.af);
        }
        return true;
    }
}

