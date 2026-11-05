/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class and
extends ahz {
    public static final String[] a = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "big_oak"};
    private pw[] b;

    public and() {
        super(avk.d);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 < 0 || n3 >= this.b.length) {
            n3 = 0;
        }
        return this.b[n3];
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
        list.add(new abu(abs2, 1, 3));
        list.add(new abu(abs2, 1, 4));
        list.add(new abu(abs2, 1, 5));
    }

    @Override
    public void a(px px2) {
        this.b = new pw[a.length];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = px2.a(this.N() + "_" + a[i2]);
        }
    }
}

