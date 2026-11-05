/*
 * Decompiled with CFR 0.152.
 */
public class adm {
    private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Object[][] b = new Object[][]{{abv.aA, aie.ab, abv.j, abv.i, abv.k}, {abv.Q, abv.U, abv.Y, abv.ac, abv.ag}, {abv.R, abv.V, abv.Z, abv.ad, abv.ah}, {abv.S, abv.W, abv.aa, abv.ae, abv.ai}, {abv.T, abv.X, abv.ab, abv.af, abv.aj}};

    public void a(adv adv2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                abs abs2 = (abs)this.b[i3 + 1][i2];
                adv2.a(new abu(abs2), this.a[i3], Character.valueOf('X'), object);
            }
        }
    }
}

