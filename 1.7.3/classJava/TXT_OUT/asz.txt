/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class asz {
    private static final ati[] b = new ati[]{new ati(atq.class, 40, 0), new ati(atk.class, 5, 5), new ati(atg.class, 20, 0), new ati(atl.class, 20, 0), new ati(atm.class, 10, 6), new ati(atr.class, 5, 5), new ati(ato.class, 5, 5), new ati(atf.class, 5, 4), new ati(atd.class, 5, 4), new ata(ath.class, 10, 2), new atb(atj.class, 20, 1)};
    private static List c;
    private static Class d;
    static int a;
    private static final atn e;

    public static void a() {
        aty.a(atd.class, "SHCC");
        aty.a(ate.class, "SHFC");
        aty.a(atf.class, "SH5C");
        aty.a(atg.class, "SHLT");
        aty.a(ath.class, "SHLi");
        aty.a(atj.class, "SHPR");
        aty.a(atk.class, "SHPH");
        aty.a(atl.class, "SHRT");
        aty.a(atm.class, "SHRC");
        aty.a(ato.class, "SHSD");
        aty.a(atp.class, "SHStart");
        aty.a(atq.class, "SHS");
        aty.a(atr.class, "SHSSD");
    }

    public static void b() {
        c = new ArrayList();
        for (ati ati2 : b) {
            ati2.c = 0;
            c.add(ati2);
        }
        d = null;
    }

    private static boolean d() {
        boolean bl2 = false;
        a = 0;
        for (ati ati2 : c) {
            if (ati2.d > 0 && ati2.c < ati2.d) {
                bl2 = true;
            }
            a += ati2.b;
        }
        return bl2;
    }

    private static ats a(Class clazz, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        ats ats2 = null;
        if (clazz == atq.class) {
            ats2 = atq.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atk.class) {
            ats2 = atk.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atg.class) {
            ats2 = atg.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atl.class) {
            ats2 = atl.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atm.class) {
            ats2 = atm.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atr.class) {
            ats2 = atr.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == ato.class) {
            ats2 = ato.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atf.class) {
            ats2 = atf.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atd.class) {
            ats2 = atd.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == ath.class) {
            ats2 = ath.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == atj.class) {
            ats2 = atj.a(list, random, n2, n3, n4, n5, n6);
        }
        return ats2;
    }

    private static ats b(atp atp2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        if (!asz.d()) {
            return null;
        }
        if (d != null) {
            ats ats2 = asz.a(d, list, random, n2, n3, n4, n5, n6);
            d = null;
            if (ats2 != null) {
                return ats2;
            }
        }
        int n7 = 0;
        block0: while (n7 < 5) {
            ++n7;
            int n8 = random.nextInt(a);
            for (ati ati2 : c) {
                if ((n8 -= ati2.b) >= 0) continue;
                if (!ati2.a(n6) || ati2 == atp2.a) continue block0;
                ats ats3 = asz.a(ati2.a, list, random, n2, n3, n4, n5, n6);
                if (ats3 == null) continue;
                ++ati2.c;
                atp2.a = ati2;
                if (!ati2.a()) {
                    c.remove(ati2);
                }
                return ats3;
            }
        }
        arm arm2 = ate.a(list, random, n2, n3, n4, n5);
        if (arm2 != null && arm2.b > 1) {
            return new ate(n6, random, arm2, n5);
        }
        return null;
    }

    private static aua c(atp atp2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        if (n6 > 50) {
            return null;
        }
        if (Math.abs(n2 - atp2.c().a) > 112 || Math.abs(n4 - atp2.c().c) > 112) {
            return null;
        }
        ats ats2 = asz.b(atp2, list, random, n2, n3, n4, n5, n6 + 1);
        if (ats2 != null) {
            list.add(ats2);
            atp2.c.add(ats2);
        }
        return ats2;
    }

    static /* synthetic */ aua a(atp atp2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        return asz.c(atp2, list, random, n2, n3, n4, n5, n6);
    }

    static /* synthetic */ Class a(Class clazz) {
        d = clazz;
        return d;
    }

    static /* synthetic */ atn c() {
        return e;
    }

    static {
        e = new atn(null);
    }
}

