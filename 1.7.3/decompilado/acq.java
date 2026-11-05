/*
 * Decompiled with CFR 0.152.
 */
public class acq
extends abs {
    public acq() {
        this.h = 16;
        this.a(aak.c);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (n5 == 0) {
            return false;
        }
        if (!afs2.a(n2, n3, n4).o().a()) {
            return false;
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
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (!aie.an.c(afs2, n2, n3, n4)) {
            return false;
        }
        if (afs2.E) {
            return true;
        }
        if (n5 == 1) {
            int n6 = oy.c((double)((xq2.y + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            afs2.d(n2, n3, n4, aie.an, n6, 3);
        } else {
            afs2.d(n2, n3, n4, aie.as, n5, 3);
        }
        --abu2.b;
        aod aod2 = (aod)afs2.o(n2, n3, n4);
        if (aod2 != null) {
            xq2.a(aod2);
        }
        return true;
    }
}

