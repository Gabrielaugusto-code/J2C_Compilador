/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class anf
extends aka {
    public static final String[] b = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "big_oak"};

    public anf(boolean bl2) {
        super(bl2, avk.d);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        return aie.f.a(n2, n3 & 7);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(aie.bx);
    }

    @Override
    protected abu j(int n2) {
        return new abu(abs.a(aie.bx), 2, n2 & 7);
    }

    @Override
    public String b(int n2) {
        if (n2 < 0 || n2 >= b.length) {
            n2 = 0;
        }
        return super.a() + "." + b[n2];
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        if (abs2 == abs.a(aie.bw)) {
            return;
        }
        for (int i2 = 0; i2 < b.length; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public void a(px px2) {
    }
}

