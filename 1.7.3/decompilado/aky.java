/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aky
extends akk {
    public static final String[][] N = new String[][]{{"leaves_acacia", "leaves_big_oak"}, {"leaves_acacia_opaque", "leaves_big_oak_opaque"}};
    public static final String[] O = new String[]{"acacia", "big_oak"};

    @Override
    protected void c(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        if ((n5 & 3) == 1 && afs2.s.nextInt(n6) == 0) {
            this.a(afs2, n2, n3, n4, new abu(abv.e, 1, 0));
        }
    }

    @Override
    public int a(int n2) {
        return super.a(n2) + 4;
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        return afs2.e(n2, n3, n4) & 3;
    }

    @Override
    public pw a(int n2, int n3) {
        if ((n3 & 3) == 1) {
            return this.M[this.b][1];
        }
        return this.M[this.b][0];
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
    }

    @Override
    public void a(px px2) {
        for (int i2 = 0; i2 < N.length; ++i2) {
            this.M[i2] = new pw[N[i2].length];
            for (int i3 = 0; i3 < N[i2].length; ++i3) {
                this.M[i2][i3] = px2.a(N[i2][i3]);
            }
        }
    }

    @Override
    public String[] e() {
        return O;
    }
}

