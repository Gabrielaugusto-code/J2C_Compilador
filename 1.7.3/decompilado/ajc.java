/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ajc
extends ahz {
    public static final String[] a = new String[]{"default", "default", "podzol"};
    private pw b;
    private pw M;

    protected ajc() {
        super(avk.c);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 == 2) {
            if (n2 == 1) {
                return this.b;
            }
            if (n2 != 0) {
                return this.M;
            }
        }
        return this.L;
    }

    @Override
    public pw e(agc agc2, int n2, int n3, int n4, int n5) {
        int n6 = agc2.e(n2, n3, n4);
        if (n6 == 2) {
            if (n5 == 1) {
                return this.b;
            }
            if (n5 != 0) {
                avk avk2 = agc2.a(n2, n3 + 1, n4).o();
                if (avk2 == avk.y || avk2 == avk.z) {
                    return aie.c.e(agc2, n2, n3, n4, n5);
                }
                ahz ahz2 = agc2.a(n2, n3 + 1, n4);
                if (ahz2 != aie.d && ahz2 != aie.c) {
                    return this.M;
                }
            }
        }
        return this.L;
    }

    @Override
    public int a(int n2) {
        return 0;
    }

    @Override
    protected abu j(int n2) {
        if (n2 == 1) {
            n2 = 0;
        }
        return super.j(n2);
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(this, 1, 0));
        list.add(new abu(this, 1, 2));
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        this.b = px2.a(this.N() + "_" + "podzol_top");
        this.M = px2.a(this.N() + "_" + "podzol_side");
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        if (n5 == 1) {
            n5 = 0;
        }
        return n5;
    }
}

