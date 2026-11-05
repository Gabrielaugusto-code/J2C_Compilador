/*
 * Decompiled with CFR 0.152.
 */
public class adc
extends abs {
    public adc() {
        this.e(1);
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        xq2.b(abu2);
        return abu2;
    }

    @Override
    public boolean s() {
        return true;
    }

    public static boolean a(dg dg2) {
        if (dg2 == null) {
            return false;
        }
        if (!dg2.b("pages", 9)) {
            return false;
        }
        dp dp2 = dg2.c("pages", 8);
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            String string = dp2.f(i2);
            if (string == null) {
                return false;
            }
            if (string.length() <= 256) continue;
            return false;
        }
        return true;
    }
}

