/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ahs
extends ajo {
    public static final String[] a = new String[]{"intact", "slightlyDamaged", "veryDamaged"};
    private static final String[] N = new String[]{"anvil_top_damaged_0", "anvil_top_damaged_1", "anvil_top_damaged_2"};
    public int b;
    private pw[] O;

    protected ahs() {
        super(avk.g);
        this.g(0);
        this.a(aak.c);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public pw a(int n2, int n3) {
        if (this.b == 3 && n2 == 1) {
            int n4 = (n3 >> 2) % this.O.length;
            return this.O[n4];
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("anvil_base");
        this.O = new pw[N.length];
        for (int i2 = 0; i2 < this.O.length; ++i2) {
            this.O[i2] = px2.a(N[i2]);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3;
        int n6 = afs2.e(n2, n3, n4) >> 2;
        ++n5;
        if ((n5 %= 4) == 0) {
            afs2.a(n2, n3, n4, 2 | n6 << 2, 2);
        }
        if (n5 == 1) {
            afs2.a(n2, n3, n4, 3 | n6 << 2, 2);
        }
        if (n5 == 2) {
            afs2.a(n2, n3, n4, 0 | n6 << 2, 2);
        }
        if (n5 == 3) {
            afs2.a(n2, n3, n4, 1 | n6 << 2, 2);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        xq2.c(n2, n3, n4);
        return true;
    }

    @Override
    public int b() {
        return 35;
    }

    @Override
    public int a(int n2) {
        return n2 >> 2;
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4) & 3;
        if (n5 == 3 || n5 == 1) {
            this.a(0.0f, 0.0f, 0.125f, 1.0f, 1.0f, 0.875f);
        } else {
            this.a(0.125f, 0.0f, 0.0f, 0.875f, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
        list.add(new abu(abs2, 1, 2));
    }

    @Override
    protected void a(wa wa2) {
        wa2.a(true);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5) {
        afs2.c(1022, n2, n3, n4, 0);
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        return true;
    }
}

