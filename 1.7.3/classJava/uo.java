/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class uo {
    private static ayp a = ayp.a(0.0, 0.0, 0.0);

    public static ayp a(ru ru2, int n2, int n3) {
        return uo.c(ru2, n2, n3, null);
    }

    public static ayp a(ru ru2, int n2, int n3, ayp ayp2) {
        uo.a.c = ayp2.c - ru2.s;
        uo.a.d = ayp2.d - ru2.t;
        uo.a.e = ayp2.e - ru2.u;
        return uo.c(ru2, n2, n3, a);
    }

    public static ayp b(ru ru2, int n2, int n3, ayp ayp2) {
        uo.a.c = ru2.s - ayp2.c;
        uo.a.d = ru2.t - ayp2.d;
        uo.a.e = ru2.u - ayp2.e;
        return uo.c(ru2, n2, n3, a);
    }

    private static ayp c(ru ru2, int n2, int n3, ayp ayp2) {
        double d2;
        double d3;
        Random random = ru2.aH();
        boolean bl2 = false;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        float f2 = -99999.0f;
        boolean bl3 = ru2.bY() ? (d3 = (double)(ru2.bV().e(oy.c(ru2.s), oy.c(ru2.t), oy.c(ru2.u)) + 4.0f)) < (d2 = (double)(ru2.bW() + (float)n2)) * d2 : false;
        for (int i2 = 0; i2 < 10; ++i2) {
            float f3;
            int n7 = random.nextInt(2 * n2) - n2;
            int n8 = random.nextInt(2 * n3) - n3;
            int n9 = random.nextInt(2 * n2) - n2;
            if (ayp2 != null && (double)n7 * ayp2.c + (double)n9 * ayp2.e < 0.0 || bl3 && !ru2.b(n7 += oy.c(ru2.s), n8 += oy.c(ru2.t), n9 += oy.c(ru2.u)) || !((f3 = ru2.a(n7, n8, n9)) > f2)) continue;
            f2 = f3;
            n4 = n7;
            n5 = n8;
            n6 = n9;
            bl2 = true;
        }
        if (bl2) {
            return ru2.o.V().a(n4, n5, n6);
        }
        return null;
    }
}

