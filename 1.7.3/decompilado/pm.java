/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Random;

public class pm {
    public static int a(Collection collection) {
        int n2 = 0;
        for (pn pn2 : collection) {
            n2 += pn2.a;
        }
        return n2;
    }

    public static pn a(Random random, Collection collection, int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        int n3 = random.nextInt(n2);
        for (pn pn2 : collection) {
            if ((n3 -= pn2.a) >= 0) continue;
            return pn2;
        }
        return null;
    }

    public static pn a(Random random, Collection collection) {
        return pm.a(random, collection, pm.a(collection));
    }

    public static int a(pn[] pnArray) {
        int n2 = 0;
        for (pn pn2 : pnArray) {
            n2 += pn2.a;
        }
        return n2;
    }

    public static pn a(Random random, pn[] pnArray, int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        int n3 = random.nextInt(n2);
        for (pn pn2 : pnArray) {
            if ((n3 -= pn2.a) >= 0) continue;
            return pn2;
        }
        return null;
    }

    public static pn a(Random random, pn[] pnArray) {
        return pm.a(random, pnArray, pm.a(pnArray));
    }
}

