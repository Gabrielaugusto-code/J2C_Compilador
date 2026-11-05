/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqu
extends aqe {
    private static final po[] a = new po[]{new po(abv.av, 0, 1, 1, 10), new po(abv.j, 0, 1, 4, 10), new po(abv.P, 0, 1, 1, 10), new po(abv.O, 0, 1, 4, 10), new po(abv.H, 0, 1, 4, 10), new po(abv.F, 0, 1, 4, 10), new po(abv.ar, 0, 1, 1, 10), new po(abv.ao, 0, 1, 1, 1), new po(abv.ax, 0, 1, 4, 10), new po(abv.cd, 0, 1, 1, 10), new po(abv.ce, 0, 1, 1, 10), new po(abv.cb, 0, 1, 1, 10), new po(abv.bY, 0, 1, 1, 2), new po(abv.bX, 0, 1, 1, 5), new po(abv.bZ, 0, 1, 1, 1)};

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8 = 3;
        int n9 = random.nextInt(2) + 2;
        int n10 = random.nextInt(2) + 2;
        int n11 = 0;
        for (n7 = n2 - n9 - 1; n7 <= n2 + n9 + 1; ++n7) {
            for (n6 = n3 - 1; n6 <= n3 + n8 + 1; ++n6) {
                for (n5 = n4 - n10 - 1; n5 <= n4 + n10 + 1; ++n5) {
                    avk avk2 = afs2.a(n7, n6, n5).o();
                    if (n6 == n3 - 1 && !avk2.a()) {
                        return false;
                    }
                    if (n6 == n3 + n8 + 1 && !avk2.a()) {
                        return false;
                    }
                    if (n7 != n2 - n9 - 1 && n7 != n2 + n9 + 1 && n5 != n4 - n10 - 1 && n5 != n4 + n10 + 1 || n6 != n3 || !afs2.c(n7, n6, n5) || !afs2.c(n7, n6 + 1, n5)) continue;
                    ++n11;
                }
            }
        }
        if (n11 < 1 || n11 > 5) {
            return false;
        }
        for (n7 = n2 - n9 - 1; n7 <= n2 + n9 + 1; ++n7) {
            for (n6 = n3 + n8; n6 >= n3 - 1; --n6) {
                for (n5 = n4 - n10 - 1; n5 <= n4 + n10 + 1; ++n5) {
                    if (n7 == n2 - n9 - 1 || n6 == n3 - 1 || n5 == n4 - n10 - 1 || n7 == n2 + n9 + 1 || n6 == n3 + n8 + 1 || n5 == n4 + n10 + 1) {
                        if (n6 >= 0 && !afs2.a(n7, n6 - 1, n5).o().a()) {
                            afs2.f(n7, n6, n5);
                            continue;
                        }
                        if (!afs2.a(n7, n6, n5).o().a()) continue;
                        if (n6 == n3 - 1 && random.nextInt(4) != 0) {
                            afs2.d(n7, n6, n5, aie.Y, 0, 2);
                            continue;
                        }
                        afs2.d(n7, n6, n5, aie.e, 0, 2);
                        continue;
                    }
                    afs2.f(n7, n6, n5);
                }
            }
        }
        block6: for (n7 = 0; n7 < 2; ++n7) {
            for (n6 = 0; n6 < 3; ++n6) {
                int n12;
                int n13;
                n5 = n2 + random.nextInt(n9 * 2 + 1) - n9;
                if (!afs2.c(n5, n13 = n3, n12 = n4 + random.nextInt(n10 * 2 + 1) - n10)) continue;
                int n14 = 0;
                if (afs2.a(n5 - 1, n13, n12).o().a()) {
                    ++n14;
                }
                if (afs2.a(n5 + 1, n13, n12).o().a()) {
                    ++n14;
                }
                if (afs2.a(n5, n13, n12 - 1).o().a()) {
                    ++n14;
                }
                if (afs2.a(n5, n13, n12 + 1).o().a()) {
                    ++n14;
                }
                if (n14 != 1) continue;
                afs2.d(n5, n13, n12, aie.ae, 0, 2);
                po[] poArray = po.a(a, abv.bR.b(random));
                ann ann2 = (ann)afs2.o(n5, n13, n12);
                if (ann2 == null) continue block6;
                po.a(random, poArray, ann2, 8);
                continue block6;
            }
        }
        afs2.d(n2, n3, n4, aie.ac, 0, 2);
        aoa aoa2 = (aoa)afs2.o(n2, n3, n4);
        if (aoa2 != null) {
            aoa2.a().a(this.a(random));
        } else {
            System.err.println("Failed to fetch mob spawner entity at (" + n2 + ", " + n3 + ", " + n4 + ")");
        }
        return true;
    }

    private String a(Random random) {
        int n2 = random.nextInt(4);
        if (n2 == 0) {
            return "Skeleton";
        }
        if (n2 == 1) {
            return "Zombie";
        }
        if (n2 == 2) {
            return "Zombie";
        }
        if (n2 == 3) {
            return "Spider";
        }
        return "";
    }
}

