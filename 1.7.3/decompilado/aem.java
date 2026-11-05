/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aem {
    private static final Random a = new Random();
    private static final aes b = new aes(null);
    private static final aer c = new aer(null);
    private static final aep d = new aep(null);
    private static final aeo e = new aeo(null);

    public static int a(int n2, abu abu2) {
        if (abu2 == null) {
            return 0;
        }
        dp dp2 = abu2.r();
        if (dp2 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            short s2 = dp2.b(i2).e("id");
            short s3 = dp2.b(i2).e("lvl");
            if (s2 != n2) continue;
            return s3;
        }
        return 0;
    }

    public static Map a(abu abu2) {
        dp dp2;
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        dp dp3 = dp2 = abu2.b() == abv.bR ? abv.bR.g(abu2) : abu2.r();
        if (dp2 != null) {
            for (int i2 = 0; i2 < dp2.c(); ++i2) {
                short s2 = dp2.b(i2).e("id");
                short s3 = dp2.b(i2).e("lvl");
                linkedHashMap.put(Integer.valueOf(s2), Integer.valueOf(s3));
            }
        }
        return linkedHashMap;
    }

    public static void a(Map map, abu abu2) {
        dp dp2 = new dp();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            dg dg2 = new dg();
            dg2.a("id", (short)n2);
            dg2.a("lvl", (short)((Integer)map.get(n2)).intValue());
            dp2.a(dg2);
            if (abu2.b() != abv.bR) continue;
            abv.bR.a(abu2, new aet(n2, (int)((Integer)map.get(n2))));
        }
        if (dp2.c() > 0) {
            if (abu2.b() != abv.bR) {
                abu2.a("ench", dp2);
            }
        } else if (abu2.p()) {
            abu2.q().o("ench");
        }
    }

    public static int a(int n2, abu[] abuArray) {
        if (abuArray == null) {
            return 0;
        }
        int n3 = 0;
        for (abu abu2 : abuArray) {
            int n4 = aem.a(n2, abu2);
            if (n4 <= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    private static void a(aeq aeq2, abu abu2) {
        if (abu2 == null) {
            return;
        }
        dp dp2 = abu2.r();
        if (dp2 == null) {
            return;
        }
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            short s2 = dp2.b(i2).e("id");
            short s3 = dp2.b(i2).e("lvl");
            if (aek.b[s2] == null) continue;
            aeq2.a(aek.b[s2], s3);
        }
    }

    private static void a(aeq aeq2, abu[] abuArray) {
        for (abu abu2 : abuArray) {
            aem.a(aeq2, abu2);
        }
    }

    public static int a(abu[] abuArray, qf qf2) {
        aem.b.a = 0;
        aem.b.b = qf2;
        aem.a((aeq)b, abuArray);
        if (aem.b.a > 25) {
            aem.b.a = 25;
        }
        return (aem.b.a + 1 >> 1) + a.nextInt((aem.b.a >> 1) + 1);
    }

    public static float a(rm rm2, rm rm3) {
        return aem.a(rm2.bd(), rm3.bc());
    }

    public static float a(abu abu2, rq rq2) {
        aem.c.a = 0.0f;
        aem.c.b = rq2;
        aem.a((aeq)c, abu2);
        return aem.c.a;
    }

    public static void a(rm rm2, qr qr2) {
        aem.d.b = qr2;
        aem.d.a = rm2;
        aem.a((aeq)d, rm2.aj());
        if (qr2 instanceof xq) {
            aem.a((aeq)d, rm2.bd());
        }
    }

    public static void b(rm rm2, qr qr2) {
        aem.e.a = rm2;
        aem.e.b = qr2;
        aem.a((aeq)e, rm2.aj());
        if (rm2 instanceof xq) {
            aem.a((aeq)e, rm2.bd());
        }
    }

    public static int b(rm rm2, rm rm3) {
        return aem.a(aek.o.B, rm2.bd());
    }

    public static int a(rm rm2) {
        return aem.a(aek.p.B, rm2.bd());
    }

    public static int b(rm rm2) {
        return aem.a(aek.i.B, rm2.aj());
    }

    public static int c(rm rm2) {
        return aem.a(aek.r.B, rm2.bd());
    }

    public static boolean e(rm rm2) {
        return aem.a(aek.s.B, rm2.bd()) > 0;
    }

    public static int f(rm rm2) {
        return aem.a(aek.u.B, rm2.bd());
    }

    public static int g(rm rm2) {
        return aem.a(aek.z.B, rm2.bd());
    }

    public static int h(rm rm2) {
        return aem.a(aek.A.B, rm2.bd());
    }

    public static int i(rm rm2) {
        return aem.a(aek.q.B, rm2.bd());
    }

    public static boolean j(rm rm2) {
        return aem.a(aek.j.B, rm2.aj()) > 0;
    }

    public static abu a(aek aek2, rm rm2) {
        for (abu abu2 : rm2.aj()) {
            if (abu2 == null || aem.a(aek2.B, abu2) <= 0) continue;
            return abu2;
        }
        return null;
    }

    public static int a(Random random, int n2, int n3, abu abu2) {
        abs abs2 = abu2.b();
        int n4 = abs2.c();
        if (n4 <= 0) {
            return 0;
        }
        if (n3 > 15) {
            n3 = 15;
        }
        int n5 = random.nextInt(8) + 1 + (n3 >> 1) + random.nextInt(n3 + 1);
        if (n2 == 0) {
            return Math.max(n5 / 3, 1);
        }
        if (n2 == 1) {
            return n5 * 2 / 3 + 1;
        }
        return Math.max(n5, n3 * 2);
    }

    public static abu a(Random random, abu abu2, int n2) {
        boolean bl2;
        List list = aem.b(random, abu2, n2);
        boolean bl3 = bl2 = abu2.b() == abv.aG;
        if (bl2) {
            abu2.a(abv.bR);
        }
        if (list != null) {
            for (aet aet2 : list) {
                if (bl2) {
                    abv.bR.a(abu2, aet2);
                    continue;
                }
                abu2.a(aet2.b, aet2.c);
            }
        }
        return abu2;
    }

    public static List b(Random random, abu abu2, int n2) {
        aet aet2;
        float f2;
        abs abs2 = abu2.b();
        int n3 = abs2.c();
        if (n3 <= 0) {
            return null;
        }
        n3 /= 2;
        int n4 = (n3 = 1 + random.nextInt((n3 >> 1) + 1) + random.nextInt((n3 >> 1) + 1)) + n2;
        int n5 = (int)((float)n4 * (1.0f + (f2 = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f)) + 0.5f);
        if (n5 < 1) {
            n5 = 1;
        }
        ArrayList<Object> arrayList = null;
        Map map = aem.b(n5, abu2);
        if (map != null && !map.isEmpty() && (aet2 = (aet)pm.a(random, map.values())) != null) {
            arrayList = new ArrayList<Object>();
            arrayList.add(aet2);
            for (int i2 = n5; random.nextInt(50) <= i2; i2 >>= 1) {
                Object object;
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    object = (Integer)iterator.next();
                    boolean bl2 = true;
                    for (aet aet3 : arrayList) {
                        if (aet3.b.a(aek.b[(Integer)object])) continue;
                        bl2 = false;
                        break;
                    }
                    if (bl2) continue;
                    iterator.remove();
                }
                if (map.isEmpty()) continue;
                object = (aet)pm.a(random, map.values());
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    public static Map b(int n2, abu abu2) {
        abs abs2 = abu2.b();
        HashMap<Integer, aet> hashMap = null;
        boolean bl2 = abu2.b() == abv.aG;
        for (aek aek2 : aek.b) {
            if (aek2 == null || !aek2.C.a(abs2) && !bl2) continue;
            for (int i2 = aek2.d(); i2 <= aek2.b(); ++i2) {
                if (n2 < aek2.a(i2) || n2 > aek2.b(i2)) continue;
                if (hashMap == null) {
                    hashMap = new HashMap<Integer, aet>();
                }
                hashMap.put(aek2.B, new aet(aek2, i2));
            }
        }
        return hashMap;
    }
}

