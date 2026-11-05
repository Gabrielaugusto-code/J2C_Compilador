/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ald
extends ako {
    public static final String[] M = new String[]{"oak", "spruce", "birch", "jungle"};

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
        list.add(new abu(abs2, 1, 2));
        list.add(new abu(abs2, 1, 3));
    }

    @Override
    public void a(px px2) {
        this.a = new pw[M.length];
        this.b = new pw[M.length];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = px2.a(this.N() + "_" + M[i2]);
            this.b[i2] = px2.a(this.N() + "_" + M[i2] + "_top");
        }
    }
}

