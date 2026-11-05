/*
 * Decompiled with CFR 0.152.
 */
public class ajr
extends ajb {
    public ajr() {
        super(avk.d);
        this.a(aak.d);
    }

    @Override
    public pw a(int n2, int n3) {
        return aie.f.h(n2);
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        if (!afs2.a(n2, n3 - 1, n4).o().a()) {
            return false;
        }
        return super.c(afs2, n2, n3, n4);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        if (ajr.b(n5)) {
            return null;
        }
        if (n5 == 2 || n5 == 0) {
            return ayk.a().a(n2, n3, (float)n4 + 0.375f, n2 + 1, (float)n3 + 1.5f, (float)n4 + 0.625f);
        }
        return ayk.a().a((float)n2 + 0.375f, n3, n4, (float)n2 + 0.625f, (float)n3 + 1.5f, n4 + 1);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = ajr.l(agc2.e(n2, n3, n4));
        if (n5 == 2 || n5 == 0) {
            this.a(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
        } else {
            this.a(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean b(agc agc2, int n2, int n3, int n4) {
        return ajr.b(agc2.e(n2, n3, n4));
    }

    @Override
    public int b() {
        return 21;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = (oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3) % 4;
        afs2.a(n2, n3, n4, n5, 2);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        int n6 = afs2.e(n2, n3, n4);
        if (ajr.b(n6)) {
            afs2.a(n2, n3, n4, n6 & 0xFFFFFFFB, 2);
        } else {
            int n7 = (oy.c((double)(xq2.y * 4.0f / 360.0f) + 0.5) & 3) % 4;
            int n8 = ajr.l(n6);
            if (n8 == (n7 + 2) % 4) {
                n6 = n7;
            }
            afs2.a(n2, n3, n4, n6 | 4, 2);
        }
        afs2.a(xq2, 1003, n2, n3, n4, 0);
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (afs2.E) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        boolean bl2 = afs2.v(n2, n3, n4);
        if (bl2 || ahz2.f()) {
            if (bl2 && !ajr.b(n5)) {
                afs2.a(n2, n3, n4, n5 | 4, 2);
                afs2.a(null, 1003, n2, n3, n4, 0);
            } else if (!bl2 && ajr.b(n5)) {
                afs2.a(n2, n3, n4, n5 & 0xFFFFFFFB, 2);
                afs2.a(null, 1003, n2, n3, n4, 0);
            }
        }
    }

    public static boolean b(int n2) {
        return (n2 & 4) != 0;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        return true;
    }

    @Override
    public void a(px px2) {
    }
}

