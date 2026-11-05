/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class alc
extends akk {
    public static final String[][] N = new String[][]{{"leaves_oak", "leaves_spruce", "leaves_birch", "leaves_jungle"}, {"leaves_oak_opaque", "leaves_spruce_opaque", "leaves_birch_opaque", "leaves_jungle_opaque"}};
    public static final String[] O = new String[]{"oak", "spruce", "birch", "jungle"};

    @Override
    public int i(int n2) {
        if ((n2 & 3) == 1) {
            return afo.a();
        }
        if ((n2 & 3) == 2) {
            return afo.b();
        }
        return super.i(n2);
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        if ((n5 & 3) == 1) {
            return afo.a();
        }
        if ((n5 & 3) == 2) {
            return afo.b();
        }
        return super.d(agc2, n2, n3, n4);
    }

    @Override
    protected void c(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        if ((n5 & 3) == 0 && afs2.s.nextInt(n6) == 0) {
            this.a(afs2, n2, n3, n4, new abu(abv.e, 1, 0));
        }
    }

    @Override
    protected int b(int n2) {
        int n3 = super.b(n2);
        if ((n2 & 3) == 3) {
            n3 = 40;
        }
        return n3;
    }

    @Override
    public pw a(int n2, int n3) {
        if ((n3 & 3) == 1) {
            return this.M[this.b][1];
        }
        if ((n3 & 3) == 3) {
            return this.M[this.b][3];
        }
        if ((n3 & 3) == 2) {
            return this.M[this.b][2];
        }
        return this.M[this.b][0];
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
        list.add(new abu(abs2, 1, 2));
        list.add(new abu(abs2, 1, 3));
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

