/*
 * Decompiled with CFR 0.152.
 */
public class aim
extends aiw {
    private pw[] a;

    @Override
    public pw a(int n2, int n3) {
        if (n3 < 7) {
            if (n3 == 6) {
                n3 = 5;
            }
            return this.a[n3 >> 1];
        }
        return this.a[3];
    }

    @Override
    protected abs i() {
        return abv.bF;
    }

    @Override
    protected abs P() {
        return abv.bF;
    }

    @Override
    public void a(px px2) {
        this.a = new pw[4];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = px2.a(this.N() + "_stage_" + i2);
        }
    }
}

