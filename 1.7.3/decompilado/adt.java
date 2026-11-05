/*
 * Decompiled with CFR 0.152.
 */
public class adt
extends ady {
    public adt() {
        super(3, 3, new abu[]{new abu(abv.aF), new abu(abv.aF), new abu(abv.aF), new abu(abv.aF), new abu(abv.aY, 0, Short.MAX_VALUE), new abu(abv.aF), new abu(abv.aF), new abu(abv.aF), new abu(abv.aF)}, new abu(abv.bJ, 0, 0));
    }

    @Override
    public boolean a(yv yv2, afs afs2) {
        if (!super.a(yv2, afs2)) {
            return false;
        }
        abu abu2 = null;
        for (int i2 = 0; i2 < yv2.a() && abu2 == null; ++i2) {
            abu abu3 = yv2.a(i2);
            if (abu3 == null || abu3.b() != abv.aY) continue;
            abu2 = abu3;
        }
        if (abu2 == null) {
            return false;
        }
        awz awz2 = abv.aY.a(abu2, afs2);
        if (awz2 == null) {
            return false;
        }
        return awz2.d < 4;
    }

    @Override
    public abu a(yv yv2) {
        abu abu2 = null;
        for (int i2 = 0; i2 < yv2.a() && abu2 == null; ++i2) {
            abu abu3 = yv2.a(i2);
            if (abu3 == null || abu3.b() != abv.aY) continue;
            abu2 = abu3;
        }
        abu2 = abu2.m();
        abu2.b = 1;
        if (abu2.q() == null) {
            abu2.d(new dg());
        }
        abu2.q().a("map_is_scaling", true);
        return abu2;
    }
}

