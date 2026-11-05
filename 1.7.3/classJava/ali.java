/*
 * Decompiled with CFR 0.152.
 */
public class ali
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
        return abv.bG;
    }

    @Override
    protected abs P() {
        return abv.bG;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        super.a(afs2, n2, n3, n4, n5, f2, n6);
        if (afs2.E) {
            return;
        }
        if (n5 >= 7 && afs2.s.nextInt(50) == 0) {
            this.a(afs2, n2, n3, n4, new abu(abv.bI));
        }
    }

    @Override
    public void a(px px2) {
        this.a = new pw[4];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = px2.a(this.N() + "_stage_" + i2);
        }
    }
}

