/*
 * Decompiled with CFR 0.152.
 */
public class act
extends zv {
    public act(ahz ahz2, ahz ahz3) {
        super(ahz2, ahz3);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        int n6;
        int n7;
        if (abu2.b == 0) {
            return false;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2 == aie.aC && (n7 = (n6 = afs2.e(n2, n3, n4)) & 7) <= 6 && afs2.b(this.a.a(afs2, n2, n3, n4)) && afs2.a(n2, n3, n4, n7 + 1 | n6 & 0xFFFFFFF8, 2)) {
            afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), this.a.H.b(), (this.a.H.c() + 1.0f) / 2.0f, this.a.H.d() * 0.8f);
            --abu2.b;
            return true;
        }
        return super.a(abu2, xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
    }
}

