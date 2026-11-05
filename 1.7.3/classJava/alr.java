/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class alr
extends ahz {
    private boolean a = true;
    private Set b = new HashSet();
    private pw M;
    private pw N;
    private pw O;
    private pw P;

    public alr() {
        super(avk.q);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
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
    public int b() {
        return 5;
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        return 0x800000;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return afs.a(afs2, n2, n3 - 1, n4) || afs2.a(n2, n3 - 1, n4) == aie.aN;
    }

    private void e(afs afs2, int n2, int n3, int n4) {
        this.a(afs2, n2, n3, n4, n2, n3, n4);
        ArrayList arrayList = new ArrayList(this.b);
        this.b.clear();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            afk afk2 = (afk)arrayList.get(i2);
            afs2.d(afk2.a, afk2.b, afk2.c, this);
        }
    }

    private void a(afs afs2, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = afs2.e(n2, n3, n4);
        int n9 = 0;
        n9 = this.a(afs2, n5, n6, n7, n9);
        this.a = false;
        int n10 = afs2.w(n2, n3, n4);
        this.a = true;
        if (n10 > 0 && n10 > n9 - 1) {
            n9 = n10;
        }
        int n11 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n12 = n2;
            int n13 = n4;
            if (i2 == 0) {
                --n12;
            }
            if (i2 == 1) {
                ++n12;
            }
            if (i2 == 2) {
                --n13;
            }
            if (i2 == 3) {
                ++n13;
            }
            if (n12 != n5 || n13 != n7) {
                n11 = this.a(afs2, n12, n3, n13, n11);
            }
            if (afs2.a(n12, n3, n13).r() && !afs2.a(n2, n3 + 1, n4).r()) {
                if (n12 == n5 && n13 == n7 || n3 < n6) continue;
                n11 = this.a(afs2, n12, n3 + 1, n13, n11);
                continue;
            }
            if (afs2.a(n12, n3, n13).r() || n12 == n5 && n13 == n7 || n3 > n6) continue;
            n11 = this.a(afs2, n12, n3 - 1, n13, n11);
        }
        n9 = n11 > n9 ? n11 - 1 : (n9 > 0 ? --n9 : 0);
        if (n10 > n9 - 1) {
            n9 = n10;
        }
        if (n8 != n9) {
            afs2.a(n2, n3, n4, n9, 2);
            this.b.add(new afk(n2, n3, n4));
            this.b.add(new afk(n2 - 1, n3, n4));
            this.b.add(new afk(n2 + 1, n3, n4));
            this.b.add(new afk(n2, n3 - 1, n4));
            this.b.add(new afk(n2, n3 + 1, n4));
            this.b.add(new afk(n2, n3, n4 - 1));
            this.b.add(new afk(n2, n3, n4 + 1));
        }
    }

    private void m(afs afs2, int n2, int n3, int n4) {
        if (afs2.a(n2, n3, n4) != this) {
            return;
        }
        afs2.d(n2, n3, n4, this);
        afs2.d(n2 - 1, n3, n4, this);
        afs2.d(n2 + 1, n3, n4, this);
        afs2.d(n2, n3, n4 - 1, this);
        afs2.d(n2, n3, n4 + 1, this);
        afs2.d(n2, n3 - 1, n4, this);
        afs2.d(n2, n3 + 1, n4, this);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        if (afs2.E) {
            return;
        }
        this.e(afs2, n2, n3, n4);
        afs2.d(n2, n3 + 1, n4, this);
        afs2.d(n2, n3 - 1, n4, this);
        this.m(afs2, n2 - 1, n3, n4);
        this.m(afs2, n2 + 1, n3, n4);
        this.m(afs2, n2, n3, n4 - 1);
        this.m(afs2, n2, n3, n4 + 1);
        if (afs2.a(n2 - 1, n3, n4).r()) {
            this.m(afs2, n2 - 1, n3 + 1, n4);
        } else {
            this.m(afs2, n2 - 1, n3 - 1, n4);
        }
        if (afs2.a(n2 + 1, n3, n4).r()) {
            this.m(afs2, n2 + 1, n3 + 1, n4);
        } else {
            this.m(afs2, n2 + 1, n3 - 1, n4);
        }
        if (afs2.a(n2, n3, n4 - 1).r()) {
            this.m(afs2, n2, n3 + 1, n4 - 1);
        } else {
            this.m(afs2, n2, n3 - 1, n4 - 1);
        }
        if (afs2.a(n2, n3, n4 + 1).r()) {
            this.m(afs2, n2, n3 + 1, n4 + 1);
        } else {
            this.m(afs2, n2, n3 - 1, n4 + 1);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        super.a(afs2, n2, n3, n4, ahz2, n5);
        if (afs2.E) {
            return;
        }
        afs2.d(n2, n3 + 1, n4, this);
        afs2.d(n2, n3 - 1, n4, this);
        afs2.d(n2 + 1, n3, n4, this);
        afs2.d(n2 - 1, n3, n4, this);
        afs2.d(n2, n3, n4 + 1, this);
        afs2.d(n2, n3, n4 - 1, this);
        this.e(afs2, n2, n3, n4);
        this.m(afs2, n2 - 1, n3, n4);
        this.m(afs2, n2 + 1, n3, n4);
        this.m(afs2, n2, n3, n4 - 1);
        this.m(afs2, n2, n3, n4 + 1);
        if (afs2.a(n2 - 1, n3, n4).r()) {
            this.m(afs2, n2 - 1, n3 + 1, n4);
        } else {
            this.m(afs2, n2 - 1, n3 - 1, n4);
        }
        if (afs2.a(n2 + 1, n3, n4).r()) {
            this.m(afs2, n2 + 1, n3 + 1, n4);
        } else {
            this.m(afs2, n2 + 1, n3 - 1, n4);
        }
        if (afs2.a(n2, n3, n4 - 1).r()) {
            this.m(afs2, n2, n3 + 1, n4 - 1);
        } else {
            this.m(afs2, n2, n3 - 1, n4 - 1);
        }
        if (afs2.a(n2, n3, n4 + 1).r()) {
            this.m(afs2, n2, n3 + 1, n4 + 1);
        } else {
            this.m(afs2, n2, n3 - 1, n4 + 1);
        }
    }

    private int a(afs afs2, int n2, int n3, int n4, int n5) {
        if (afs2.a(n2, n3, n4) != this) {
            return n5;
        }
        int n6 = afs2.e(n2, n3, n4);
        if (n6 > n5) {
            return n6;
        }
        return n5;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (afs2.E) {
            return;
        }
        boolean bl2 = this.c(afs2, n2, n3, n4);
        if (bl2) {
            this.e(afs2, n2, n3, n4);
        } else {
            this.b(afs2, n2, n3, n4, 0, 0);
            afs2.f(n2, n3, n4);
        }
        super.a(afs2, n2, n3, n4, ahz2);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.ax;
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4, int n5) {
        if (!this.a) {
            return 0;
        }
        return this.b(agc2, n2, n3, n4, n5);
    }

    @Override
    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        boolean bl2;
        if (!this.a) {
            return 0;
        }
        int n6 = agc2.e(n2, n3, n4);
        if (n6 == 0) {
            return 0;
        }
        if (n5 == 1) {
            return n6;
        }
        boolean bl3 = alr.g(agc2, n2 - 1, n3, n4, 1) || !agc2.a(n2 - 1, n3, n4).r() && alr.g(agc2, n2 - 1, n3 - 1, n4, -1);
        boolean bl4 = alr.g(agc2, n2 + 1, n3, n4, 3) || !agc2.a(n2 + 1, n3, n4).r() && alr.g(agc2, n2 + 1, n3 - 1, n4, -1);
        boolean bl5 = alr.g(agc2, n2, n3, n4 - 1, 2) || !agc2.a(n2, n3, n4 - 1).r() && alr.g(agc2, n2, n3 - 1, n4 - 1, -1);
        boolean bl6 = bl2 = alr.g(agc2, n2, n3, n4 + 1, 0) || !agc2.a(n2, n3, n4 + 1).r() && alr.g(agc2, n2, n3 - 1, n4 + 1, -1);
        if (!agc2.a(n2, n3 + 1, n4).r()) {
            if (agc2.a(n2 - 1, n3, n4).r() && alr.g(agc2, n2 - 1, n3 + 1, n4, -1)) {
                bl3 = true;
            }
            if (agc2.a(n2 + 1, n3, n4).r() && alr.g(agc2, n2 + 1, n3 + 1, n4, -1)) {
                bl4 = true;
            }
            if (agc2.a(n2, n3, n4 - 1).r() && alr.g(agc2, n2, n3 + 1, n4 - 1, -1)) {
                bl5 = true;
            }
            if (agc2.a(n2, n3, n4 + 1).r() && alr.g(agc2, n2, n3 + 1, n4 + 1, -1)) {
                bl2 = true;
            }
        }
        if (!(bl5 || bl4 || bl3 || bl2 || n5 < 2 || n5 > 5)) {
            return n6;
        }
        if (n5 == 2 && bl5 && !bl3 && !bl4) {
            return n6;
        }
        if (n5 == 3 && bl2 && !bl3 && !bl4) {
            return n6;
        }
        if (n5 == 4 && bl3 && !bl5 && !bl2) {
            return n6;
        }
        if (n5 == 5 && bl4 && !bl5 && !bl2) {
            return n6;
        }
        return 0;
    }

    @Override
    public boolean f() {
        return this.a;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4);
        if (n5 > 0) {
            double d2 = (double)n2 + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            double d3 = (float)n3 + 0.0625f;
            double d4 = (double)n4 + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            float f2 = (float)n5 / 15.0f;
            float f3 = f2 * 0.6f + 0.4f;
            if (n5 == 0) {
                f3 = 0.0f;
            }
            float f4 = f2 * f2 * 0.7f - 0.5f;
            float f5 = f2 * f2 * 0.6f - 0.7f;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            afs2.a("reddust", d2, d3, d4, (double)f3, (double)f4, f5);
        }
    }

    public static boolean f(agc agc2, int n2, int n3, int n4, int n5) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        if (ahz2 == aie.af) {
            return true;
        }
        if (aie.aR.e(ahz2)) {
            int n6 = agc2.e(n2, n3, n4);
            return n5 == (n6 & 3) || n5 == p.f[n6 & 3];
        }
        return ahz2.f() && n5 != -1;
    }

    public static boolean g(agc agc2, int n2, int n3, int n4, int n5) {
        if (alr.f(agc2, n2, n3, n4, n5)) {
            return true;
        }
        if (agc2.a(n2, n3, n4) == aie.aS) {
            int n6 = agc2.e(n2, n3, n4);
            return n5 == (n6 & 3);
        }
        return false;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.ax;
    }

    @Override
    public void a(px px2) {
        this.M = px2.a(this.N() + "_" + "cross");
        this.N = px2.a(this.N() + "_" + "line");
        this.O = px2.a(this.N() + "_" + "cross_overlay");
        this.P = px2.a(this.N() + "_" + "line_overlay");
        this.L = this.M;
    }

    public static pw e(String string) {
        if (string.equals("cross")) {
            return aie.af.M;
        }
        if (string.equals("line")) {
            return aie.af.N;
        }
        if (string.equals("cross_overlay")) {
            return aie.af.O;
        }
        if (string.equals("line_overlay")) {
            return aie.af.P;
        }
        return null;
    }
}

