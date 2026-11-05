/*
 * Decompiled with CFR 0.152.
 */
public class adu {
    private Object[][] a = new Object[][]{{aie.R, new abu(abv.k, 9)}, {aie.S, new abu(abv.j, 9)}, {aie.ah, new abu(abv.i, 9)}, {aie.bE, new abu(abv.bC, 9)}, {aie.y, new abu(abv.aR, 9, 4)}, {aie.bX, new abu(abv.ax, 9)}, {aie.ci, new abu(abv.h, 9, 0)}, {aie.cf, new abu(abv.O, 9)}};

    public void a(adv adv2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            ahz ahz2 = (ahz)this.a[i2][0];
            abu abu2 = (abu)this.a[i2][1];
            adv2.a(new abu(ahz2), "###", "###", "###", Character.valueOf('#'), abu2);
            adv2.a(abu2, "#", Character.valueOf('#'), ahz2);
        }
        adv2.a(new abu(abv.k), "###", "###", "###", Character.valueOf('#'), abv.bl);
        adv2.a(new abu(abv.bl, 9), "#", Character.valueOf('#'), abv.k);
    }
}

