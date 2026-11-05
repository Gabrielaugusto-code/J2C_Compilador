/*
 * Decompiled with CFR 0.152.
 */
public class zz
extends abs {
    private ahz a;

    public zz(ahz ahz2) {
        this.a = ahz2;
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        int n6;
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2 == aie.aC && (afs2.e(n2, n3, n4) & 7) < 1) {
            n5 = 1;
        } else if (ahz2 != aie.bd && ahz2 != aie.H && ahz2 != aie.I) {
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
        }
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (abu2.b == 0) {
            return false;
        }
        if (afs2.a(this.a, n2, n3, n4, false, n5, null, abu2) && afs2.d(n2, n3, n4, this.a, n6 = this.a.a(afs2, n2, n3, n4, n5, f2, f3, f4, 0), 3)) {
            if (afs2.a(n2, n3, n4) == this.a) {
                this.a.a(afs2, n2, n3, n4, xq2, abu2);
                this.a.e(afs2, n2, n3, n4, n6);
            }
            afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), this.a.H.b(), (this.a.H.c() + 1.0f) / 2.0f, this.a.H.d() * 0.8f);
            --abu2.b;
        }
        return true;
    }
}

