/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class po
extends pn {
    private abu b;
    private int c;
    private int d;

    public po(abs abs2, int n2, int n3, int n4, int n5) {
        super(n5);
        this.b = new abu(abs2, 1, n2);
        this.c = n3;
        this.d = n4;
    }

    public po(abu abu2, int n2, int n3, int n4) {
        super(n4);
        this.b = abu2;
        this.c = n2;
        this.d = n3;
    }

    public static void a(Random random, po[] poArray, ps ps2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            po po2 = (po)pm.a(random, poArray);
            int n3 = po2.c + random.nextInt(po2.d - po2.c + 1);
            if (po2.b.e() >= n3) {
                abu abu2 = po2.b.m();
                abu2.b = n3;
                ps2.a(random.nextInt(ps2.a()), abu2);
                continue;
            }
            for (int i3 = 0; i3 < n3; ++i3) {
                abu abu3 = po2.b.m();
                abu3.b = 1;
                ps2.a(random.nextInt(ps2.a()), abu3);
            }
        }
    }

    public static void a(Random random, po[] poArray, ans ans2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            po po2 = (po)pm.a(random, poArray);
            int n3 = po2.c + random.nextInt(po2.d - po2.c + 1);
            if (po2.b.e() >= n3) {
                abu abu2 = po2.b.m();
                abu2.b = n3;
                ans2.a(random.nextInt(ans2.a()), abu2);
                continue;
            }
            for (int i3 = 0; i3 < n3; ++i3) {
                abu abu3 = po2.b.m();
                abu3.b = 1;
                ans2.a(random.nextInt(ans2.a()), abu3);
            }
        }
    }

    public static po[] a(po[] poArray, po ... poArray2) {
        po[] poArray3 = new po[poArray.length + poArray2.length];
        int n2 = 0;
        for (int i2 = 0; i2 < poArray.length; ++i2) {
            poArray3[n2++] = poArray[i2];
        }
        for (po po2 : poArray2) {
            poArray3[n2++] = po2;
        }
        return poArray3;
    }
}

