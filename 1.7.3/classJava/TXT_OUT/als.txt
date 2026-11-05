/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class als
extends ahz {
    private final boolean a;

    public als(boolean bl2) {
        super(avk.t);
        this.a = bl2;
        if (bl2) {
            this.a(1.0f);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        if (!afs2.E) {
            if (this.a && !afs2.v(n2, n3, n4)) {
                afs2.a(n2, n3, n4, this, 4);
            } else if (!this.a && afs2.v(n2, n3, n4)) {
                afs2.d(n2, n3, n4, aie.bv, 0, 2);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!afs2.E) {
            if (this.a && !afs2.v(n2, n3, n4)) {
                afs2.a(n2, n3, n4, this, 4);
            } else if (!this.a && afs2.v(n2, n3, n4)) {
                afs2.d(n2, n3, n4, aie.bv, 0, 2);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (!afs2.E && this.a && !afs2.v(n2, n3, n4)) {
            afs2.d(n2, n3, n4, aie.bu, 0, 2);
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(aie.bu);
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.a(aie.bu);
    }

    @Override
    protected abu j(int n2) {
        return new abu(aie.bu);
    }
}

