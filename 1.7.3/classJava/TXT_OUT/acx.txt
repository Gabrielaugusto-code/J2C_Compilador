/*
 * Decompiled with CFR 0.152.
 */
public class acx
extends zy {
    private final boolean b;
    private final aka c;
    private final aka d;

    public acx(ahz ahz2, aka aka2, aka aka3, boolean bl2) {
        super(ahz2);
        this.c = aka2;
        this.d = aka3;
        this.b = bl2;
        this.f(0);
        this.a(true);
    }

    @Override
    public pw b_(int n2) {
        return ahz.a(this).a(2, n2);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String a(abu abu2) {
        return this.c.b(abu2.k());
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        boolean bl2;
        if (this.b) {
            return super.a(abu2, xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
        }
        if (abu2.b == 0) {
            return false;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        ahz ahz2 = afs2.a(n2, n3, n4);
        int n6 = afs2.e(n2, n3, n4);
        int n7 = n6 & 7;
        boolean bl3 = bl2 = (n6 & 8) != 0;
        if ((n5 == 1 && !bl2 || n5 == 0 && bl2) && ahz2 == this.c && n7 == abu2.k()) {
            if (afs2.b(this.d.a(afs2, n2, n3, n4)) && afs2.d(n2, n3, n4, this.d, n7, 3)) {
                afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), this.d.H.b(), (this.d.H.c() + 1.0f) / 2.0f, this.d.H.d() * 0.8f);
                --abu2.b;
            }
            return true;
        }
        if (this.a(abu2, xq2, afs2, n2, n3, n4, n5)) {
            return true;
        }
        return super.a(abu2, xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, int n5, xq xq2, abu abu2) {
        boolean bl2;
        int n6 = n2;
        int n7 = n3;
        int n8 = n4;
        ahz ahz2 = afs2.a(n2, n3, n4);
        int n9 = afs2.e(n2, n3, n4);
        int n10 = n9 & 7;
        boolean bl3 = bl2 = (n9 & 8) != 0;
        if ((n5 == 1 && !bl2 || n5 == 0 && bl2) && ahz2 == this.c && n10 == abu2.k()) {
            return true;
        }
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
        ahz ahz3 = afs2.a(n2, n3, n4);
        int n11 = afs2.e(n2, n3, n4);
        n10 = n11 & 7;
        if (ahz3 == this.c && n10 == abu2.k()) {
            return true;
        }
        return super.a(afs2, n6, n7, n8, n5, xq2, abu2);
    }

    private boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5) {
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
        ahz ahz2 = afs2.a(n2, n3, n4);
        int n6 = afs2.e(n2, n3, n4);
        int n7 = n6 & 7;
        if (ahz2 == this.c && n7 == abu2.k()) {
            if (afs2.b(this.d.a(afs2, n2, n3, n4)) && afs2.d(n2, n3, n4, this.d, n7, 3)) {
                afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), this.d.H.b(), (this.d.H.c() + 1.0f) / 2.0f, this.d.H.d() * 0.8f);
                --abu2.b;
            }
            return true;
        }
        return false;
    }
}

