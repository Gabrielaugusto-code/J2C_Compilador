/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class amh
extends akb {
    private static final pw[] a = new pw[16];

    public amh(avk avk2) {
        super("glass", avk2, false);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        return a[n3 % a.length];
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    public static int b(int n2) {
        return ~n2 & 0xF;
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
        for (int i2 = 0; i2 < a.length; ++i2) {
            amh.a[i2] = px2.a(this.N() + "_" + aba.b[amh.b(i2)]);
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    protected boolean E() {
        return true;
    }

    @Override
    public boolean d() {
        return false;
    }
}

