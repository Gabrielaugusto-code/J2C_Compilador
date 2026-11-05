/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ajt
extends aii {
    private static final String[][] M = new String[][]{{"flower_dandelion"}, {"flower_rose", "flower_blue_orchid", "flower_allium", "flower_houstonia", "flower_tulip_red", "flower_tulip_orange", "flower_tulip_white", "flower_tulip_pink", "flower_oxeye_daisy"}};
    public static final String[] a = new String[]{"poppy", "blueOrchid", "allium", "houstonia", "tulipRed", "tulipOrange", "tulipWhite", "tulipPink", "oxeyeDaisy"};
    public static final String[] b = new String[]{"dandelion"};
    private pw[] N;
    private int O;

    protected ajt(int n2) {
        super(avk.k);
        this.O = n2;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 >= this.N.length) {
            n3 = 0;
        }
        return this.N[n3];
    }

    @Override
    public void a(px px2) {
        this.N = new pw[M[this.O].length];
        for (int i2 = 0; i2 < this.N.length; ++i2) {
            this.N[i2] = px2.a(M[this.O][i2]);
        }
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < this.N.length; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    public static ajt e(String string) {
        for (String string2 : b) {
            if (!string2.equals(string)) continue;
            return aie.N;
        }
        for (String string2 : a) {
            if (!string2.equals(string)) continue;
            return aie.O;
        }
        return null;
    }

    public static int f(String string) {
        int n2;
        for (n2 = 0; n2 < b.length; ++n2) {
            if (!b[n2].equals(string)) continue;
            return n2;
        }
        for (n2 = 0; n2 < a.length; ++n2) {
            if (!a[n2].equals(string)) continue;
            return n2;
        }
        return 0;
    }
}

