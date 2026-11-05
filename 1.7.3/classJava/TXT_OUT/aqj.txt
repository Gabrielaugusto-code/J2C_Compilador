/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqj
extends aqe {
    private ahz a;
    private boolean b;

    public aqj(ahz ahz2, boolean bl2) {
        this.a = ahz2;
        this.b = bl2;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        if (afs2.a(n2, n3 + 1, n4) != aie.aL) {
            return false;
        }
        if (afs2.a(n2, n3, n4).o() != avk.a && afs2.a(n2, n3, n4) != aie.aL) {
            return false;
        }
        int n5 = 0;
        if (afs2.a(n2 - 1, n3, n4) == aie.aL) {
            ++n5;
        }
        if (afs2.a(n2 + 1, n3, n4) == aie.aL) {
            ++n5;
        }
        if (afs2.a(n2, n3, n4 - 1) == aie.aL) {
            ++n5;
        }
        if (afs2.a(n2, n3, n4 + 1) == aie.aL) {
            ++n5;
        }
        if (afs2.a(n2, n3 - 1, n4) == aie.aL) {
            ++n5;
        }
        int n6 = 0;
        if (afs2.c(n2 - 1, n3, n4)) {
            ++n6;
        }
        if (afs2.c(n2 + 1, n3, n4)) {
            ++n6;
        }
        if (afs2.c(n2, n3, n4 - 1)) {
            ++n6;
        }
        if (afs2.c(n2, n3, n4 + 1)) {
            ++n6;
        }
        if (afs2.c(n2, n3 - 1, n4)) {
            ++n6;
        }
        if (!this.b && n5 == 4 && n6 == 1 || n5 == 5) {
            afs2.d(n2, n3, n4, this.a, 0, 2);
            afs2.d = true;
            this.a.a(afs2, n2, n3, n4, random);
            afs2.d = false;
        }
        return true;
    }
}

