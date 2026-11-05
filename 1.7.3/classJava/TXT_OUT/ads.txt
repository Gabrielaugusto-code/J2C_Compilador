/*
 * Decompiled with CFR 0.152.
 */
public class ads
implements adx {
    @Override
    public boolean a(yv yv2, afs afs2) {
        int n2 = 0;
        abu abu2 = null;
        for (int i2 = 0; i2 < yv2.a(); ++i2) {
            abu abu3 = yv2.a(i2);
            if (abu3 == null) continue;
            if (abu3.b() == abv.aY) {
                if (abu2 != null) {
                    return false;
                }
                abu2 = abu3;
                continue;
            }
            if (abu3.b() == abv.bJ) {
                ++n2;
                continue;
            }
            return false;
        }
        return abu2 != null && n2 > 0;
    }

    @Override
    public abu a(yv yv2) {
        int n2 = 0;
        abu abu2 = null;
        for (int i2 = 0; i2 < yv2.a(); ++i2) {
            abu abu3 = yv2.a(i2);
            if (abu3 == null) continue;
            if (abu3.b() == abv.aY) {
                if (abu2 != null) {
                    return null;
                }
                abu2 = abu3;
                continue;
            }
            if (abu3.b() == abv.bJ) {
                ++n2;
                continue;
            }
            return null;
        }
        if (abu2 == null || n2 < 1) {
            return null;
        }
        abu abu4 = new abu(abv.aY, n2 + 1, abu2.k());
        if (abu2.u()) {
            abu4.c(abu2.s());
        }
        return abu4;
    }

    @Override
    public int a() {
        return 9;
    }

    @Override
    public abu b() {
        return null;
    }
}

