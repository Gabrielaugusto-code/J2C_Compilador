/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class amn
extends ahz {
    public static final String[] a = new String[]{"default", "mossy", "cracked", "chiseled"};
    public static final String[] b = new String[]{null, "mossy", "cracked", "carved"};
    private pw[] M;

    public amn() {
        super(avk.e);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 < 0 || n3 >= b.length) {
            n3 = 0;
        }
        return this.M[n3];
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < 4; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public void a(px px2) {
        this.M = new pw[b.length];
        for (int i2 = 0; i2 < this.M.length; ++i2) {
            String string = this.N();
            if (b[i2] != null) {
                string = string + "_" + b[i2];
            }
            this.M[i2] = px2.a(string);
        }
    }
}

