/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class amq
extends aii
implements aif {
    private static final String[] a = new String[]{"deadbush", "tallgrass", "fern"};
    private pw[] b;

    protected amq() {
        super(avk.l);
        float f2 = 0.4f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.8f, 0.5f + f2);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 >= this.b.length) {
            n3 = 0;
        }
        return this.b[n3];
    }

    @Override
    public int D() {
        double d2 = 0.5;
        double d3 = 1.0;
        return afr.a(d2, d3);
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        return this.a(afs2.a(n2, n3 - 1, n4));
    }

    @Override
    public int i(int n2) {
        if (n2 == 0) {
            return 0xFFFFFF;
        }
        return afr.a(0.5, 1.0);
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        if (n5 == 0) {
            return 0xFFFFFF;
        }
        return agc2.a(n2, n4).b(n2, n3, n4);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        if (random.nextInt(8) == 0) {
            return abv.N;
        }
        return null;
    }

    @Override
    public int a(int n2, Random random) {
        return 1 + random.nextInt(n2 * 2 + 1);
    }

    @Override
    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        if (!afs2.E && xq2.bE() != null && xq2.bE().b() == abv.aZ) {
            xq2.a(og.C[ahz.b(this)], 1);
            this.a(afs2, n2, n3, n4, new abu(aie.H, 1, n5));
        } else {
            super.a(afs2, xq2, n2, n3, n4, n5);
        }
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        return afs2.e(n2, n3, n4);
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 1; i2 < 3; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public void a(px px2) {
        this.b = new pw[a.length];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = px2.a(a[i2]);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        int n5 = afs2.e(n2, n3, n4);
        return n5 != 0;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        int n6 = 2;
        if (n5 == 2) {
            n6 = 3;
        }
        if (aie.cm.c(afs2, n2, n3, n4)) {
            aie.cm.c(afs2, n2, n3, n4, n6, 2);
        }
    }
}

