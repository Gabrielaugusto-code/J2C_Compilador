/*
 * Decompiled with CFR 0.152.
 */
public class aec {
    private String[][] a = new String[][]{{"X", "X", "#"}};
    private Object[][] b = new Object[][]{{aie.f, aie.e, abv.j, abv.i, abv.k}, {abv.m, abv.q, abv.l, abv.u, abv.B}};

    public void a(adv adv2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                abs abs2 = (abs)this.b[i3 + 1][i2];
                adv2.a(new abu(abs2), this.a[i3], Character.valueOf('#'), abv.y, Character.valueOf('X'), object);
            }
        }
        adv2.a(new abu(abv.f, 1), " #X", "# X", " #X", Character.valueOf('X'), abv.F, Character.valueOf('#'), abv.y);
        adv2.a(new abu(abv.g, 4), "X", "#", "Y", Character.valueOf('Y'), abv.G, Character.valueOf('X'), abv.ak, Character.valueOf('#'), abv.y);
    }
}

