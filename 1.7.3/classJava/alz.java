/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class alz
extends ahz {
    public static final String[] a = new String[]{"default", "chiseled", "smooth"};
    private static final String[] b = new String[]{"normal", "carved", "smooth"};
    private pw[] M;
    private pw N;
    private pw O;

    public alz() {
        super(avk.e);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1 || n2 == 0 && (n3 == 1 || n3 == 2)) {
            return this.N;
        }
        if (n2 == 0) {
            return this.O;
        }
        if (n3 < 0 || n3 >= this.M.length) {
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
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
        list.add(new abu(abs2, 1, 2));
    }

    @Override
    public void a(px px2) {
        this.M = new pw[b.length];
        for (int i2 = 0; i2 < this.M.length; ++i2) {
            this.M[i2] = px2.a(this.N() + "_" + b[i2]);
        }
        this.N = px2.a(this.N() + "_top");
        this.O = px2.a(this.N() + "_bottom");
    }
}

