/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ajq
extends ahz {
    private final String a;

    public ajq(String string, avk avk2) {
        super(avk2);
        this.a = string;
        this.a(aak.c);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        boolean bl2 = this.e(afs2, n2, n3, n4 - 1);
        boolean bl3 = this.e(afs2, n2, n3, n4 + 1);
        boolean bl4 = this.e(afs2, n2 - 1, n3, n4);
        boolean bl5 = this.e(afs2, n2 + 1, n3, n4);
        float f2 = 0.375f;
        float f3 = 0.625f;
        float f4 = 0.375f;
        float f5 = 0.625f;
        if (bl2) {
            f4 = 0.0f;
        }
        if (bl3) {
            f5 = 1.0f;
        }
        if (bl2 || bl3) {
            this.a(f2, 0.0f, f4, f3, 1.5f, f5);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        }
        f4 = 0.375f;
        f5 = 0.625f;
        if (bl4) {
            f2 = 0.0f;
        }
        if (bl5) {
            f3 = 1.0f;
        }
        if (bl4 || bl5 || !bl2 && !bl3) {
            this.a(f2, 0.0f, f4, f3, 1.5f, f5);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        }
        if (bl2) {
            f4 = 0.0f;
        }
        if (bl3) {
            f5 = 1.0f;
        }
        this.a(f2, 0.0f, f4, f3, 1.0f, f5);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        boolean bl2 = this.e(agc2, n2, n3, n4 - 1);
        boolean bl3 = this.e(agc2, n2, n3, n4 + 1);
        boolean bl4 = this.e(agc2, n2 - 1, n3, n4);
        boolean bl5 = this.e(agc2, n2 + 1, n3, n4);
        float f2 = 0.375f;
        float f3 = 0.625f;
        float f4 = 0.375f;
        float f5 = 0.625f;
        if (bl2) {
            f4 = 0.0f;
        }
        if (bl3) {
            f5 = 1.0f;
        }
        if (bl4) {
            f2 = 0.0f;
        }
        if (bl5) {
            f3 = 1.0f;
        }
        this.a(f2, 0.0f, f4, f3, 1.0f, f5);
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
        return false;
    }

    @Override
    public int b() {
        return 11;
    }

    public boolean e(agc agc2, int n2, int n3, int n4) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        if (ahz2 == this || ahz2 == aie.be) {
            return true;
        }
        if (ahz2.J.k() && ahz2.d()) {
            return ahz2.J != avk.C;
        }
        return false;
    }

    public static boolean a(ahz ahz2) {
        return ahz2 == aie.aJ || ahz2 == aie.bk;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        return true;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.a);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        return abw.a(xq2, afs2, n2, n3, n4);
    }
}

