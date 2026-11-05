/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class auf {
    public static void a() {
        aty.a(aug.class, "ViBH");
        aty.a(auh.class, "ViDF");
        aty.a(aui.class, "ViF");
        aty.a(auj.class, "ViL");
        aty.a(aul.class, "ViPH");
        aty.a(aum.class, "ViSH");
        aty.a(aun.class, "ViSmH");
        aty.a(auo.class, "ViST");
        aty.a(aup.class, "ViS");
        aty.a(auq.class, "ViStart");
        aty.a(aur.class, "ViSR");
        aty.a(aus.class, "ViTRH");
        aty.a(auv.class, "ViW");
    }

    public static List a(Random random, int n2) {
        ArrayList<auk> arrayList = new ArrayList<auk>();
        arrayList.add(new auk(aum.class, 4, oy.a(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new auk(auo.class, 20, oy.a(random, 0 + n2, 1 + n2)));
        arrayList.add(new auk(aug.class, 20, oy.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new auk(aun.class, 3, oy.a(random, 2 + n2, 5 + n2 * 3)));
        arrayList.add(new auk(aul.class, 15, oy.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new auk(auh.class, 3, oy.a(random, 1 + n2, 4 + n2)));
        arrayList.add(new auk(aui.class, 3, oy.a(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new auk(aup.class, 15, oy.a(random, 0, 1 + n2)));
        arrayList.add(new auk(aus.class, 8, oy.a(random, 0 + n2, 3 + n2 * 2)));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (((auk)iterator.next()).d != 0) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static int a(List list) {
        boolean bl2 = false;
        int n2 = 0;
        for (auk auk2 : list) {
            if (auk2.d > 0 && auk2.c < auk2.d) {
                bl2 = true;
            }
            n2 += auk2.b;
        }
        return bl2 ? n2 : -1;
    }

    private static aut a(auq auq2, auk auk2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        Class clazz = auk2.a;
        aut aut2 = null;
        if (clazz == aum.class) {
            aut2 = aum.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == auo.class) {
            aut2 = auo.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == aug.class) {
            aut2 = aug.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == aun.class) {
            aut2 = aun.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == aul.class) {
            aut2 = aul.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == auh.class) {
            aut2 = auh.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == aui.class) {
            aut2 = aui.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == aup.class) {
            aut2 = aup.a(auq2, list, random, n2, n3, n4, n5, n6);
        } else if (clazz == aus.class) {
            aut2 = aus.a(auq2, list, random, n2, n3, n4, n5, n6);
        }
        return aut2;
    }

    private static aut c(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        int n7 = auf.a(auq2.e);
        if (n7 <= 0) {
            return null;
        }
        int n8 = 0;
        block0: while (n8 < 5) {
            ++n8;
            int n9 = random.nextInt(n7);
            for (auk auk2 : auq2.e) {
                if ((n9 -= auk2.b) >= 0) continue;
                if (!auk2.a(n6) || auk2 == auq2.d && auq2.e.size() > 1) continue block0;
                aut aut2 = auf.a(auq2, auk2, list, random, n2, n3, n4, n5, n6);
                if (aut2 == null) continue;
                ++auk2.c;
                auq2.d = auk2;
                if (!auk2.a()) {
                    auq2.e.remove(auk2);
                }
                return aut2;
            }
        }
        arm arm2 = auj.a(auq2, list, random, n2, n3, n4, n5);
        if (arm2 != null) {
            return new auj(auq2, n6, random, arm2, n5);
        }
        return null;
    }

    private static aua d(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        if (n6 > 50) {
            return null;
        }
        if (Math.abs(n2 - auq2.c().a) > 112 || Math.abs(n4 - auq2.c().c) > 112) {
            return null;
        }
        aut aut2 = auf.c(auq2, list, random, n2, n3, n4, n5, n6 + 1);
        if (aut2 != null) {
            int n7;
            int n8 = (aut2.f.a + aut2.f.d) / 2;
            int n9 = (aut2.f.c + aut2.f.f) / 2;
            int n10 = aut2.f.d - aut2.f.a;
            int n11 = aut2.f.f - aut2.f.c;
            int n12 = n7 = n10 > n11 ? n10 : n11;
            if (auq2.e().a(n8, n9, n7 / 2 + 4, aud.e)) {
                list.add(aut2);
                auq2.i.add(aut2);
                return aut2;
            }
        }
        return null;
    }

    private static aua e(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        if (n6 > 3 + auq2.c) {
            return null;
        }
        if (Math.abs(n2 - auq2.c().a) > 112 || Math.abs(n4 - auq2.c().c) > 112) {
            return null;
        }
        arm arm2 = aur.a(auq2, list, random, n2, n3, n4, n5);
        if (arm2 != null && arm2.b > 10) {
            int n7;
            aur aur2 = new aur(auq2, n6, random, arm2, n5);
            int n8 = (aur2.f.a + aur2.f.d) / 2;
            int n9 = (aur2.f.c + aur2.f.f) / 2;
            int n10 = aur2.f.d - aur2.f.a;
            int n11 = aur2.f.f - aur2.f.c;
            int n12 = n7 = n10 > n11 ? n10 : n11;
            if (auq2.e().a(n8, n9, n7 / 2 + 4, aud.e)) {
                list.add(aur2);
                auq2.j.add(aur2);
                return aur2;
            }
        }
        return null;
    }

    static /* synthetic */ aua a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        return auf.d(auq2, list, random, n2, n3, n4, n5, n6);
    }

    static /* synthetic */ aua b(auq auq2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        return auf.e(auq2, list, random, n2, n3, n4, n5, n6);
    }
}

