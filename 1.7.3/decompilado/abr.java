/*
 * Decompiled with CFR 0.152.
 */
public class abr
extends abs {
    protected abt a;

    public abr(abt abt2) {
        this.a = abt2;
        this.h = 1;
        this.f(abt2.a());
        this.a(aak.i);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (n5 != 0 && afs2.a(n2, n3 + 1, n4).o() == avk.a && (ahz2 == aie.c || ahz2 == aie.d)) {
            ahz ahz3 = aie.ak;
            afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), ahz3.H.e(), (ahz3.H.c() + 1.0f) / 2.0f, ahz3.H.d() * 0.8f);
            if (afs2.E) {
                return true;
            }
            afs2.b(n2, n3, n4, ahz3);
            abu2.a(1, (rm)xq2);
            return true;
        }
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    public String i() {
        return this.a.toString();
    }
}

