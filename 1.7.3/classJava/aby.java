/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 */
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;

public class aby
extends aaj {
    protected aby() {
        this.a(true);
    }

    public static awz a(int n2, afs afs2) {
        String string = "map_" + n2;
        awz awz2 = (awz)afs2.a(awz.class, string);
        if (awz2 == null) {
            awz2 = new awz(string);
            afs2.a(string, awz2);
        }
        return awz2;
    }

    public awz a(abu abu2, afs afs2) {
        String string = "map_" + abu2.k();
        awz awz2 = (awz)afs2.a(awz.class, string);
        if (awz2 == null && !afs2.E) {
            abu2.b(afs2.b("map"));
            string = "map_" + abu2.k();
            awz2 = new awz(string);
            awz2.d = (byte)3;
            int n2 = 128 * (1 << awz2.d);
            awz2.a = Math.round((float)afs2.N().c() / (float)n2) * n2;
            awz2.b = Math.round(afs2.N().e() / n2) * n2;
            awz2.c = (byte)afs2.t.i;
            awz2.c();
            afs2.a(string, awz2);
        }
        return awz2;
    }

    public void a(afs afs2, qr qr2, awz awz2) {
        if (afs2.t.i != awz2.c || !(qr2 instanceof xq)) {
            return;
        }
        int n2 = 1 << awz2.d;
        int n3 = awz2.a;
        int n4 = awz2.b;
        int n5 = oy.c(qr2.s - (double)n3) / n2 + 64;
        int n6 = oy.c(qr2.u - (double)n4) / n2 + 64;
        int n7 = 128 / n2;
        if (afs2.t.g) {
            n7 /= 2;
        }
        axa axa2 = awz2.a((xq)qr2);
        ++axa2.d;
        for (int i2 = n5 - n7 + 1; i2 < n5 + n7; ++i2) {
            if ((i2 & 0xF) != (axa2.d & 0xF)) continue;
            int n8 = 255;
            int n9 = 0;
            double d2 = 0.0;
            for (int i3 = n6 - n7 - 1; i3 < n6 + n7; ++i3) {
                int n10;
                int n11;
                Object object;
                int n12;
                int n13;
                if (i2 < 0 || i3 < -1 || i2 >= 128 || i3 >= 128) continue;
                int n14 = i2 - n5;
                int n15 = i3 - n6;
                boolean bl2 = n14 * n14 + n15 * n15 > (n7 - 2) * (n7 - 2);
                int n16 = (n3 / n2 + i2 - 64) * n2;
                int n17 = (n4 / n2 + i3 - 64) * n2;
                HashMultiset hashMultiset = HashMultiset.create();
                aoo aoo2 = afs2.d(n16, n17);
                if (aoo2.g()) continue;
                int n18 = n16 & 0xF;
                int n19 = n17 & 0xF;
                int n20 = 0;
                double d3 = 0.0;
                if (afs2.t.g) {
                    n13 = n16 + n17 * 231871;
                    if (((n13 = n13 * n13 * 31287121 + n13 * 11) >> 20 & 1) == 0) {
                        hashMultiset.add((Object)aie.d.f(0), 10);
                    } else {
                        hashMultiset.add((Object)aie.b.f(0), 100);
                    }
                    d3 = 100.0;
                } else {
                    for (n13 = 0; n13 < n2; ++n13) {
                        for (int i4 = 0; i4 < n2; ++i4) {
                            n12 = aoo2.b(n13 + n18, i4 + n19) + 1;
                            object = aie.a;
                            n11 = 0;
                            if (n12 > 1) {
                                while (((ahz)(object = aoo2.a(n13 + n18, --n12, i4 + n19))).f(n11 = aoo2.c(n13 + n18, n12, i4 + n19)) == avm.b && n12 > 0) {
                                }
                                if (n12 > 0 && ((ahz)object).o().d()) {
                                    ahz ahz2;
                                    n10 = n12 - 1;
                                    do {
                                        ahz2 = aoo2.a(n13 + n18, n10--, i4 + n19);
                                        ++n20;
                                    } while (n10 > 0 && ahz2.o().d());
                                }
                            }
                            d3 += (double)n12 / (double)(n2 * n2);
                            hashMultiset.add((Object)((ahz)object).f(n11));
                        }
                    }
                }
                n20 /= n2 * n2;
                double d4 = (d3 - d2) * 4.0 / (double)(n2 + 4) + ((double)(i2 + i3 & 1) - 0.5) * 0.4;
                n12 = 1;
                if (d4 > 0.6) {
                    n12 = 2;
                }
                if (d4 < -0.6) {
                    n12 = 0;
                }
                if ((object = (avm)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)hashMultiset), (Object)avm.b)) == avm.n) {
                    d4 = (double)n20 * 0.1 + (double)(i2 + i3 & 1) * 0.2;
                    n12 = 1;
                    if (d4 < 0.5) {
                        n12 = 2;
                    }
                    if (d4 > 0.9) {
                        n12 = 0;
                    }
                }
                d2 = d3;
                if (i3 < 0 || n14 * n14 + n15 * n15 >= n7 * n7 || bl2 && (i2 + i3 & 1) == 0 || (n11 = awz2.e[i2 + i3 * 128]) == (n10 = (int)((byte)(((avm)object).M * 4 + n12)))) continue;
                if (n8 > i3) {
                    n8 = i3;
                }
                if (n9 < i3) {
                    n9 = i3;
                }
                awz2.e[i2 + i3 * 128] = n10;
            }
            if (n8 > n9) continue;
            awz2.a(i2, n8, n9);
        }
    }

    @Override
    public void a(abu abu2, afs afs2, qr qr2, int n2, boolean bl2) {
        if (afs2.E) {
            return;
        }
        awz awz2 = this.a(abu2, afs2);
        if (qr2 instanceof xq) {
            xq xq2 = (xq)qr2;
            awz2.a(xq2, abu2);
        }
        if (bl2) {
            this.a(afs2, qr2, awz2);
        }
    }

    @Override
    public fk c(abu abu2, afs afs2, xq xq2) {
        byte[] byArray = this.a(abu2, afs2).a(abu2, afs2, xq2);
        if (byArray == null) {
            return null;
        }
        return new gv(abu2.k(), byArray);
    }

    @Override
    public void d(abu abu2, afs afs2, xq xq2) {
        if (abu2.p() && abu2.q().n("map_is_scaling")) {
            awz awz2 = abv.aY.a(abu2, afs2);
            abu2.b(afs2.b("map"));
            awz awz3 = new awz("map_" + abu2.k());
            awz3.d = (byte)(awz2.d + 1);
            if (awz3.d > 4) {
                awz3.d = (byte)4;
            }
            awz3.a = awz2.a;
            awz3.b = awz2.b;
            awz3.c = awz2.c;
            awz3.c();
            afs2.a("map_" + abu2.k(), awz3);
        }
    }

    @Override
    public void a(abu abu2, xq xq2, List list, boolean bl2) {
        awz awz2 = this.a(abu2, xq2.o);
        if (bl2) {
            if (awz2 == null) {
                list.add("Unknown map");
            } else {
                list.add("Scaling at 1:" + (1 << awz2.d));
                list.add("(Level " + awz2.d + "/" + 4 + ")");
            }
        }
    }
}

