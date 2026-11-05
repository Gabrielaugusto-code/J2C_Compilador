/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class agf {
    private HashMap a = new HashMap();

    protected static afk a(afs afs2, int n2, int n3) {
        aoo aoo2 = afs2.e(n2, n3);
        int n4 = n2 * 16 + afs2.s.nextInt(16);
        int n5 = n3 * 16 + afs2.s.nextInt(16);
        int n6 = afs2.s.nextInt(aoo2 == null ? afs2.S() : aoo2.h() + 16 - 1);
        return new afk(n4, n6, n5);
    }

    public int a(mm mm2, boolean bl2, boolean bl3, boolean bl4) {
        Object object;
        Object object2;
        int n2;
        if (!bl2 && !bl3) {
            return 0;
        }
        this.a.clear();
        for (n2 = 0; n2 < mm2.h.size(); ++n2) {
            object2 = (xq)mm2.h.get(n2);
            int n3 = oy.c(((xq)object2).s / 16.0);
            int n4 = oy.c(((xq)object2).u / 16.0);
            int n5 = 8;
            for (int i2 = -n5; i2 <= n5; ++i2) {
                for (int i3 = -n5; i3 <= n5; ++i3) {
                    boolean bl5 = i2 == -n5 || i2 == n5 || i3 == -n5 || i3 == n5;
                    object = new afl(i2 + n3, i3 + n4);
                    if (!bl5) {
                        this.a.put(object, false);
                        continue;
                    }
                    if (this.a.containsKey(object)) continue;
                    this.a.put(object, true);
                }
            }
        }
        n2 = 0;
        object2 = mm2.K();
        for (ro ro2 : ro.values()) {
            if (ro2.d() && !bl3 || !ro2.d() && !bl2 || ro2.e() && !bl4 || mm2.a(ro2.a()) > ro2.b() * this.a.size() / 256) continue;
            block6: for (afl afl2 : this.a.keySet()) {
                if (((Boolean)this.a.get(afl2)).booleanValue()) continue;
                object = agf.a(mm2, afl2.a, afl2.b);
                int n6 = ((afk)object).a;
                int n7 = ((afk)object).b;
                int n8 = ((afk)object).c;
                if (mm2.a(n6, n7, n8).r() || mm2.a(n6, n7, n8).o() != ro2.c()) continue;
                int n9 = 0;
                block7: for (int i4 = 0; i4 < 3; ++i4) {
                    int n10 = n6;
                    int n11 = n7;
                    int n12 = n8;
                    int n13 = 6;
                    ago ago2 = null;
                    rp rp2 = null;
                    for (int i5 = 0; i5 < 4; ++i5) {
                        rn rn2;
                        float f2;
                        float f3;
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        float f8;
                        if (!agf.a(ro2, mm2, n10 += mm2.s.nextInt(n13) - mm2.s.nextInt(n13), n11 += mm2.s.nextInt(1) - mm2.s.nextInt(1), n12 += mm2.s.nextInt(n13) - mm2.s.nextInt(n13)) || mm2.a(f8 = (float)n10 + 0.5f, f7 = (float)n11, (double)(f6 = (float)n12 + 0.5f), 24.0) != null || (f5 = (f4 = f8 - (float)((r)object2).a) * f4 + (f3 = f7 - (float)((r)object2).b) * f3 + (f2 = f6 - (float)((r)object2).c) * f2) < 576.0f) continue;
                        if (ago2 == null && (ago2 = mm2.a(ro2, n10, n11, n12)) == null) continue block7;
                        try {
                            rn2 = (rn)ago2.b.getConstructor(afs.class).newInstance(mm2);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return n2;
                        }
                        rn2.b(f8, f7, f6, mm2.s.nextFloat() * 360.0f, 0.0f);
                        if (rn2.by()) {
                            mm2.d(rn2);
                            rp2 = rn2.a(rp2);
                            if (++n9 >= rn2.bB()) continue block6;
                        }
                        n2 += n9;
                    }
                }
            }
        }
        return n2;
    }

    public static boolean a(ro ro2, afs afs2, int n2, int n3, int n4) {
        if (ro2.c() == avk.h) {
            return afs2.a(n2, n3, n4).o().d() && afs2.a(n2, n3 - 1, n4).o().d() && !afs2.a(n2, n3 + 1, n4).r();
        }
        if (!afs.a(afs2, n2, n3 - 1, n4)) {
            return false;
        }
        ahz ahz2 = afs2.a(n2, n3 - 1, n4);
        return ahz2 != aie.h && !afs2.a(n2, n3, n4).r() && !afs2.a(n2, n3, n4).o().d() && !afs2.a(n2, n3 + 1, n4).r();
    }

    public static void a(afs afs2, agl agl2, int n2, int n3, int n4, int n5, Random random) {
        List list = agl2.a(ro.b);
        if (list.isEmpty()) {
            return;
        }
        while (random.nextFloat() < agl2.g()) {
            ago ago2 = (ago)pm.a(afs2.s, list);
            rp rp2 = null;
            int n6 = ago2.c + random.nextInt(1 + ago2.d - ago2.c);
            int n7 = n2 + random.nextInt(n4);
            int n8 = n3 + random.nextInt(n5);
            int n9 = n7;
            int n10 = n8;
            for (int i2 = 0; i2 < n6; ++i2) {
                boolean bl2 = false;
                for (int i3 = 0; !bl2 && i3 < 4; ++i3) {
                    int n11 = afs2.i(n7, n8);
                    if (agf.a(ro.b, afs2, n7, n11, n8)) {
                        rn rn2;
                        float f2 = (float)n7 + 0.5f;
                        float f3 = n11;
                        float f4 = (float)n8 + 0.5f;
                        try {
                            rn2 = (rn)ago2.b.getConstructor(afs.class).newInstance(afs2);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            continue;
                        }
                        rn2.b(f2, f3, f4, random.nextFloat() * 360.0f, 0.0f);
                        afs2.d(rn2);
                        rp2 = rn2.a(rp2);
                        bl2 = true;
                    }
                    n7 += random.nextInt(5) - random.nextInt(5);
                    n8 += random.nextInt(5) - random.nextInt(5);
                    while (n7 < n2 || n7 >= n2 + n4 || n8 < n3 || n8 >= n3 + n4) {
                        n7 = n9 + random.nextInt(5) - random.nextInt(5);
                        n8 = n10 + random.nextInt(5) - random.nextInt(5);
                    }
                }
            }
        }
    }
}

