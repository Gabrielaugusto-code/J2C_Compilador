/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 */
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.tuple.ImmutablePair;

public class aks
extends ahz {
    public static final String[] a = new String[]{"stone", "cobble", "brick", "mossybrick", "crackedbrick", "chiseledbrick"};

    public aks() {
        super(avk.B);
        this.c(0.0f);
        this.a(aak.c);
    }

    @Override
    public pw a(int n2, int n3) {
        switch (n3) {
            case 1: {
                return aie.e.h(n2);
            }
            case 2: {
                return aie.aV.h(n2);
            }
            case 3: {
                return aie.aV.a(n2, 1);
            }
            case 4: {
                return aie.aV.a(n2, 2);
            }
            case 5: {
                return aie.aV.a(n2, 3);
            }
        }
        return aie.b.h(n2);
    }

    @Override
    public void a(px px2) {
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, int n5) {
        if (!afs2.E) {
            xb xb2 = new xb(afs2);
            xb2.b((double)n2 + 0.5, n3, (double)n4 + 0.5, 0.0f, 0.0f);
            afs2.d(xb2);
            xb2.s();
        }
        super.b(afs2, n2, n3, n4, n5);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public static boolean a(ahz ahz2) {
        return ahz2 == aie.b || ahz2 == aie.e || ahz2 == aie.aV;
    }

    public static int a(ahz ahz2, int n2) {
        if (n2 == 0) {
            if (ahz2 == aie.e) {
                return 1;
            }
            if (ahz2 == aie.aV) {
                return 2;
            }
        } else if (ahz2 == aie.aV) {
            switch (n2) {
                case 1: {
                    return 3;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
            }
        }
        return 0;
    }

    public static ImmutablePair b(int n2) {
        switch (n2) {
            case 1: {
                return new ImmutablePair((Object)aie.e, (Object)0);
            }
            case 2: {
                return new ImmutablePair((Object)aie.aV, (Object)0);
            }
            case 3: {
                return new ImmutablePair((Object)aie.aV, (Object)1);
            }
            case 4: {
                return new ImmutablePair((Object)aie.aV, (Object)2);
            }
            case 5: {
                return new ImmutablePair((Object)aie.aV, (Object)3);
            }
        }
        return new ImmutablePair((Object)aie.b, (Object)0);
    }

    @Override
    protected abu j(int n2) {
        switch (n2) {
            case 1: {
                return new abu(aie.e);
            }
            case 2: {
                return new abu(aie.aV);
            }
            case 3: {
                return new abu(aie.aV, 1, 1);
            }
            case 4: {
                return new abu(aie.aV, 1, 2);
            }
            case 5: {
                return new abu(aie.aV, 1, 3);
            }
        }
        return new abu(aie.b);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        if (!afs2.E) {
            xb xb2 = new xb(afs2);
            xb2.b((double)n2 + 0.5, n3, (double)n4 + 0.5, 0.0f, 0.0f);
            afs2.d(xb2);
            xb2.s();
        }
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        return afs2.e(n2, n3, n4);
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < a.length; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }
}

