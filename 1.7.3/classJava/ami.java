/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ami
extends amr {
    private static final pw[] a = new pw[16];
    private static final pw[] b = new pw[16];

    public ami() {
        super("glass", "glass_pane_top", avk.s, false);
        this.a(aak.c);
    }

    @Override
    public pw b(int n2, int n3) {
        return a[n3 % a.length];
    }

    public pw b(int n2) {
        return b[~n2 & 0xF];
    }

    @Override
    public pw a(int n2, int n3) {
        return this.b(n2, ~n3 & 0xF);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    public static int c(int n2) {
        return n2 & 0xF;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < a.length; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public int w() {
        return 1;
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        for (int i2 = 0; i2 < a.length; ++i2) {
            ami.a[i2] = px2.a(this.N() + "_" + aba.b[ami.c(i2)]);
            ami.b[i2] = px2.a(this.N() + "_pane_top_" + aba.b[ami.c(i2)]);
        }
    }
}

