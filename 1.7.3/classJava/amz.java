/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class amz
extends ahz {
    public static final String[] a = new String[]{"normal", "mossy"};

    public amz(ahz ahz2) {
        super(ahz2.J);
        this.c(ahz2.v);
        this.b(ahz2.w / 3.0f);
        this.a(ahz2.H);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 == 1) {
            return aie.Y.h(n2);
        }
        return aie.e.h(n2);
    }

    @Override
    public int b() {
        return 32;
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
    public boolean c() {
        return false;
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        boolean bl2 = this.e(agc2, n2, n3, n4 - 1);
        boolean bl3 = this.e(agc2, n2, n3, n4 + 1);
        boolean bl4 = this.e(agc2, n2 - 1, n3, n4);
        boolean bl5 = this.e(agc2, n2 + 1, n3, n4);
        float f2 = 0.25f;
        float f3 = 0.75f;
        float f4 = 0.25f;
        float f5 = 0.75f;
        float f6 = 1.0f;
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
        if (bl2 && bl3 && !bl4 && !bl5) {
            f6 = 0.8125f;
            f2 = 0.3125f;
            f3 = 0.6875f;
        } else if (!bl2 && !bl3 && bl4 && bl5) {
            f6 = 0.8125f;
            f4 = 0.3125f;
            f5 = 0.6875f;
        }
        this.a(f2, 0.0f, f4, f3, f6, f5);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        this.F = 1.5;
        return super.a(afs2, n2, n3, n4);
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

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 0) {
            return super.a(agc2, n2, n3, n4, n5);
        }
        return true;
    }

    @Override
    public void a(px px2) {
    }
}

