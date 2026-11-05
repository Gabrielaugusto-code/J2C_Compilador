/*
 * Decompiled with CFR 0.152.
 */
public class aeb {
    private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] b = new Object[][]{{aie.f, aie.e, abv.j, abv.i, abv.k}, {abv.o, abv.s, abv.b, abv.w, abv.D}, {abv.n, abv.r, abv.a, abv.v, abv.C}, {abv.p, abv.t, abv.c, abv.x, abv.E}, {abv.I, abv.J, abv.K, abv.L, abv.M}};

    public void a(adv adv2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                abs abs2 = (abs)this.b[i3 + 1][i2];
                adv2.a(new abu(abs2), this.a[i3], Character.valueOf('#'), abv.y, Character.valueOf('X'), object);
            }
        }
        adv2.a(new abu(abv.aZ), " #", "# ", Character.valueOf('#'), abv.j);
    }
}

