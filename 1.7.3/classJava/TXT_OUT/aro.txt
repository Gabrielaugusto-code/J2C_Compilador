/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aro {
    private static final po[] a = new po[]{new po(abv.j, 0, 1, 5, 10), new po(abv.k, 0, 1, 3, 5), new po(abv.ax, 0, 4, 9, 5), new po(abv.aR, 4, 4, 9, 5), new po(abv.i, 0, 1, 2, 3), new po(abv.h, 0, 3, 8, 10), new po(abv.P, 0, 1, 3, 15), new po(abv.b, 0, 1, 1, 1), new po(abs.a(aie.aq), 0, 4, 8, 1), new po(abv.bc, 0, 2, 4, 10), new po(abv.bb, 0, 2, 4, 10), new po(abv.av, 0, 1, 1, 3), new po(abv.bX, 0, 1, 1, 1)};

    public static void a() {
        aty.a(arp.class, "MSCorridor");
        aty.a(arq.class, "MSCrossing");
        aty.a(arr.class, "MSRoom");
        aty.a(ars.class, "MSStairs");
    }

    private static aua a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        int n7 = random.nextInt(100);
        if (n7 >= 80) {
            arm arm2 = arq.a(list, random, n2, n3, n4, n5);
            if (arm2 != null) {
                return new arq(n6, random, arm2, n5);
            }
        } else if (n7 >= 70) {
            arm arm3 = ars.a(list, random, n2, n3, n4, n5);
            if (arm3 != null) {
                return new ars(n6, random, arm3, n5);
            }
        } else {
            arm arm4 = arp.a(list, random, n2, n3, n4, n5);
            if (arm4 != null) {
                return new arp(n6, random, arm4, n5);
            }
        }
        return null;
    }

    private static aua b(aua aua2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        if (n6 > 8) {
            return null;
        }
        if (Math.abs(n2 - aua2.c().a) > 80 || Math.abs(n4 - aua2.c().c) > 80) {
            return null;
        }
        aua aua3 = aro.a(list, random, n2, n3, n4, n5, n6 + 1);
        if (aua3 != null) {
            list.add(aua3);
            aua3.a(aua2, list, random);
        }
        return aua3;
    }

    static /* synthetic */ aua a(aua aua2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        return aro.b(aua2, list, random, n2, n3, n4, n5, n6);
    }

    static /* synthetic */ po[] b() {
        return a;
    }
}

