/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class alt
extends amt {
    private boolean a;
    private static Map b = new HashMap();

    private boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        if (!b.containsKey(afs2)) {
            b.put(afs2, new ArrayList());
        }
        List list = (List)b.get(afs2);
        if (bl2) {
            list.add(new alu(n2, n3, n4, afs2.I()));
        }
        int n5 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            alu alu2 = (alu)list.get(i2);
            if (alu2.a != n2 || alu2.b != n3 || alu2.c != n4 || ++n5 < 8) continue;
            return true;
        }
        return false;
    }

    protected alt(boolean bl2) {
        this.a = bl2;
        this.a(true);
        this.a((aak)null);
    }

    @Override
    public int a(afs afs2) {
        return 2;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        if (afs2.e(n2, n3, n4) == 0) {
            super.b(afs2, n2, n3, n4);
        }
        if (this.a) {
            afs2.d(n2, n3 - 1, n4, this);
            afs2.d(n2, n3 + 1, n4, this);
            afs2.d(n2 - 1, n3, n4, this);
            afs2.d(n2 + 1, n3, n4, this);
            afs2.d(n2, n3, n4 - 1, this);
            afs2.d(n2, n3, n4 + 1, this);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        if (this.a) {
            afs2.d(n2, n3 - 1, n4, this);
            afs2.d(n2, n3 + 1, n4, this);
            afs2.d(n2 - 1, n3, n4, this);
            afs2.d(n2 + 1, n3, n4, this);
            afs2.d(n2, n3, n4 - 1, this);
            afs2.d(n2, n3, n4 + 1, this);
        }
    }

    @Override
    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        if (!this.a) {
            return 0;
        }
        int n6 = agc2.e(n2, n3, n4);
        if (n6 == 5 && n5 == 1) {
            return 0;
        }
        if (n6 == 3 && n5 == 3) {
            return 0;
        }
        if (n6 == 4 && n5 == 2) {
            return 0;
        }
        if (n6 == 1 && n5 == 5) {
            return 0;
        }
        if (n6 == 2 && n5 == 4) {
            return 0;
        }
        return 15;
    }

    private boolean m(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        if (n5 == 5 && afs2.f(n2, n3 - 1, n4, 0)) {
            return true;
        }
        if (n5 == 3 && afs2.f(n2, n3, n4 - 1, 2)) {
            return true;
        }
        if (n5 == 4 && afs2.f(n2, n3, n4 + 1, 3)) {
            return true;
        }
        if (n5 == 1 && afs2.f(n2 - 1, n3, n4, 4)) {
            return true;
        }
        return n5 == 2 && afs2.f(n2 + 1, n3, n4, 5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        boolean bl2 = this.m(afs2, n2, n3, n4);
        List list = (List)b.get(afs2);
        while (list != null && !list.isEmpty() && afs2.I() - ((alu)list.get((int)0)).d > 60L) {
            list.remove(0);
        }
        if (this.a) {
            if (bl2) {
                afs2.d(n2, n3, n4, aie.az, afs2.e(n2, n3, n4), 3);
                if (this.a(afs2, n2, n3, n4, true)) {
                    afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.fizz", 0.5f, 2.6f + (afs2.s.nextFloat() - afs2.s.nextFloat()) * 0.8f);
                    for (int i2 = 0; i2 < 5; ++i2) {
                        double d2 = (double)n2 + random.nextDouble() * 0.6 + 0.2;
                        double d3 = (double)n3 + random.nextDouble() * 0.6 + 0.2;
                        double d4 = (double)n4 + random.nextDouble() * 0.6 + 0.2;
                        afs2.a("smoke", d2, d3, d4, 0.0, 0.0, 0.0);
                    }
                }
            }
        } else if (!bl2 && !this.a(afs2, n2, n3, n4, false)) {
            afs2.d(n2, n3, n4, aie.aA, afs2.e(n2, n3, n4), 3);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (this.b(afs2, n2, n3, n4, ahz2)) {
            return;
        }
        boolean bl2 = this.m(afs2, n2, n3, n4);
        if (this.a && bl2 || !this.a && !bl2) {
            afs2.a(n2, n3, n4, this, this.a(afs2));
        }
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 0) {
            return this.b(agc2, n2, n3, n4, n5);
        }
        return 0;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(aie.aA);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        if (!this.a) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        double d2 = (double)((float)n2 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d3 = (double)((float)n3 + 0.7f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d4 = (double)((float)n4 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d5 = 0.22f;
        double d6 = 0.27f;
        if (n5 == 1) {
            afs2.a("reddust", d2 - d6, d3 + d5, d4, 0.0, 0.0, 0.0);
        } else if (n5 == 2) {
            afs2.a("reddust", d2 + d6, d3 + d5, d4, 0.0, 0.0, 0.0);
        } else if (n5 == 3) {
            afs2.a("reddust", d2, d3 + d5, d4 - d6, 0.0, 0.0, 0.0);
        } else if (n5 == 4) {
            afs2.a("reddust", d2, d3 + d5, d4 + d6, 0.0, 0.0, 0.0);
        } else {
            afs2.a("reddust", d2, d3, d4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.a(aie.aA);
    }

    @Override
    public boolean c(ahz ahz2) {
        return ahz2 == aie.az || ahz2 == aie.aA;
    }
}

