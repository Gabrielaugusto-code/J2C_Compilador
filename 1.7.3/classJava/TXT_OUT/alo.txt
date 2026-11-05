/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class alo
extends ahz {
    public static final String[] a = new String[]{"default", "chiseled", "lines"};
    private static final String[] b = new String[]{"side", "chiseled", "lines", null, null};
    private pw[] M;
    private pw N;
    private pw O;
    private pw P;
    private pw Q;

    public alo() {
        super(avk.e);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 == 2 || n3 == 3 || n3 == 4) {
            if (n3 == 2 && (n2 == 1 || n2 == 0)) {
                return this.O;
            }
            if (n3 == 3 && (n2 == 5 || n2 == 4)) {
                return this.O;
            }
            if (n3 == 4 && (n2 == 2 || n2 == 3)) {
                return this.O;
            }
            return this.M[n3];
        }
        if (n2 == 1 || n2 == 0 && n3 == 1) {
            if (n3 == 1) {
                return this.N;
            }
            return this.P;
        }
        if (n2 == 0) {
            return this.Q;
        }
        if (n3 < 0 || n3 >= this.M.length) {
            n3 = 0;
        }
        return this.M[n3];
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        if (n6 == 2) {
            switch (n5) {
                case 2: 
                case 3: {
                    n6 = 4;
                    break;
                }
                case 4: 
                case 5: {
                    n6 = 3;
                    break;
                }
                case 0: 
                case 1: {
                    n6 = 2;
                }
            }
        }
        return n6;
    }

    @Override
    public int a(int n2) {
        if (n2 == 3 || n2 == 4) {
            return 2;
        }
        return n2;
    }

    @Override
    protected abu j(int n2) {
        if (n2 == 3 || n2 == 4) {
            return new abu(abs.a(this), 1, 2);
        }
        return super.j(n2);
    }

    @Override
    public int b() {
        return 39;
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
            this.M[i2] = b[i2] == null ? this.M[i2 - 1] : px2.a(this.N() + "_" + b[i2]);
        }
        this.P = px2.a(this.N() + "_" + "top");
        this.N = px2.a(this.N() + "_" + "chiseled_top");
        this.O = px2.a(this.N() + "_" + "lines_top");
        this.Q = px2.a(this.N() + "_" + "bottom");
    }

    @Override
    public avm f(int n2) {
        return avm.p;
    }
}

