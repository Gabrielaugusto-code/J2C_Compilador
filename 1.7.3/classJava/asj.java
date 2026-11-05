/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

abstract class asj
extends aua {
    protected static final po[] a = new po[]{new po(abv.i, 0, 1, 3, 5), new po(abv.j, 0, 1, 5, 5), new po(abv.k, 0, 1, 3, 15), new po(abv.B, 0, 1, 1, 5), new po(abv.ah, 0, 1, 1, 5), new po(abv.d, 0, 1, 1, 5), new po(abv.bm, 0, 3, 7, 5), new po(abv.av, 0, 1, 1, 10), new po(abv.bY, 0, 1, 1, 8), new po(abv.bX, 0, 1, 1, 5), new po(abv.bZ, 0, 1, 1, 3)};

    public asj() {
    }

    protected asj(int n2) {
        super(n2);
    }

    @Override
    protected void b(dg dg2) {
    }

    @Override
    protected void a(dg dg2) {
    }

    private int a(List list) {
        boolean bl2 = false;
        int n2 = 0;
        for (ask ask2 : list) {
            if (ask2.d > 0 && ask2.c < ask2.d) {
                bl2 = true;
            }
            n2 += ask2.b;
        }
        return bl2 ? n2 : -1;
    }

    private asj a(asn asn2, List list, List list2, Random random, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.a(list);
        boolean bl2 = n7 > 0 && n6 <= 30;
        int n8 = 0;
        block0: while (n8 < 5 && bl2) {
            ++n8;
            int n9 = random.nextInt(n7);
            for (ask ask2 : list) {
                if ((n9 -= ask2.b) >= 0) continue;
                if (!ask2.a(n6) || ask2 == asn2.b && !ask2.e) continue block0;
                asj asj2 = arw.a(ask2, list2, random, n2, n3, n4, n5, n6);
                if (asj2 == null) continue;
                ++ask2.c;
                asn2.b = ask2;
                if (!ask2.a()) {
                    list.remove(ask2);
                }
                return asj2;
            }
        }
        return ary.a(list2, random, n2, n3, n4, n5, n6);
    }

    private aua a(asn asn2, List list, Random random, int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        asj asj2;
        if (Math.abs(n2 - asn2.c().a) > 112 || Math.abs(n4 - asn2.c().c) > 112) {
            return ary.a(list, random, n2, n3, n4, n5, n6);
        }
        List list2 = asn2.c;
        if (bl2) {
            list2 = asn2.d;
        }
        if ((asj2 = this.a(asn2, list2, list, random, n2, n3, n4, n5, n6 + 1)) != null) {
            list.add(asj2);
            asn2.e.add(asj2);
        }
        return asj2;
    }

    protected aua a(asn asn2, List list, Random random, int n2, int n3, boolean bl2) {
        switch (this.g) {
            case 2: {
                return this.a(asn2, list, random, this.f.a + n2, this.f.b + n3, this.f.c - 1, this.g, this.d(), bl2);
            }
            case 0: {
                return this.a(asn2, list, random, this.f.a + n2, this.f.b + n3, this.f.f + 1, this.g, this.d(), bl2);
            }
            case 1: {
                return this.a(asn2, list, random, this.f.a - 1, this.f.b + n3, this.f.c + n2, this.g, this.d(), bl2);
            }
            case 3: {
                return this.a(asn2, list, random, this.f.d + 1, this.f.b + n3, this.f.c + n2, this.g, this.d(), bl2);
            }
        }
        return null;
    }

    protected aua b(asn asn2, List list, Random random, int n2, int n3, boolean bl2) {
        switch (this.g) {
            case 2: {
                return this.a(asn2, list, random, this.f.a - 1, this.f.b + n2, this.f.c + n3, 1, this.d(), bl2);
            }
            case 0: {
                return this.a(asn2, list, random, this.f.a - 1, this.f.b + n2, this.f.c + n3, 1, this.d(), bl2);
            }
            case 1: {
                return this.a(asn2, list, random, this.f.a + n3, this.f.b + n2, this.f.c - 1, 2, this.d(), bl2);
            }
            case 3: {
                return this.a(asn2, list, random, this.f.a + n3, this.f.b + n2, this.f.c - 1, 2, this.d(), bl2);
            }
        }
        return null;
    }

    protected aua c(asn asn2, List list, Random random, int n2, int n3, boolean bl2) {
        switch (this.g) {
            case 2: {
                return this.a(asn2, list, random, this.f.d + 1, this.f.b + n2, this.f.c + n3, 3, this.d(), bl2);
            }
            case 0: {
                return this.a(asn2, list, random, this.f.d + 1, this.f.b + n2, this.f.c + n3, 3, this.d(), bl2);
            }
            case 1: {
                return this.a(asn2, list, random, this.f.a + n3, this.f.b + n2, this.f.f + 1, 0, this.d(), bl2);
            }
            case 3: {
                return this.a(asn2, list, random, this.f.a + n3, this.f.b + n2, this.f.f + 1, 0, this.d(), bl2);
            }
        }
        return null;
    }

    protected static boolean a(arm arm2) {
        return arm2 != null && arm2.b > 10;
    }
}

