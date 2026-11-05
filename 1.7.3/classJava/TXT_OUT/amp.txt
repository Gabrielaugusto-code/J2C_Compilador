/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class amp
extends aka {
    public static final String[] b = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"};
    private pw M;

    public amp(boolean bl2) {
        super(bl2, avk.e);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        int n4 = n3 & 7;
        if (this.a && (n3 & 8) != 0) {
            n2 = 1;
        }
        if (n4 == 0) {
            if (n2 == 1 || n2 == 0) {
                return this.L;
            }
            return this.M;
        }
        if (n4 == 1) {
            return aie.A.h(n2);
        }
        if (n4 == 2) {
            return aie.f.h(n2);
        }
        if (n4 == 3) {
            return aie.e.h(n2);
        }
        if (n4 == 4) {
            return aie.V.h(n2);
        }
        if (n4 == 5) {
            return aie.aV.a(n2, 0);
        }
        if (n4 == 6) {
            return aie.bj.h(1);
        }
        if (n4 == 7) {
            return aie.ca.h(n2);
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("stone_slab_top");
        this.M = px2.a("stone_slab_side");
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(aie.U);
    }

    @Override
    protected abu j(int n2) {
        return new abu(abs.a(aie.U), 2, n2 & 7);
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
        if (abs2 == abs.a(aie.T)) {
            return;
        }
        for (int i2 = 0; i2 <= 7; ++i2) {
            if (i2 == 2) continue;
            list.add(new abu(abs2, 1, i2));
        }
    }
}

