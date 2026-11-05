/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class adp
implements adx {
    private abu a;

    @Override
    public boolean a(yv yv2, afs afs2) {
        Object object;
        this.a = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = 0; i2 < yv2.a(); ++i2) {
            object = yv2.a(i2);
            if (object == null) continue;
            if (((abu)object).b() == abv.H) {
                ++n3;
                continue;
            }
            if (((abu)object).b() == abv.bQ) {
                ++n5;
                continue;
            }
            if (((abu)object).b() == abv.aR) {
                ++n4;
                continue;
            }
            if (((abu)object).b() == abv.aF) {
                ++n2;
                continue;
            }
            if (((abu)object).b() == abv.aO) {
                ++n6;
                continue;
            }
            if (((abu)object).b() == abv.i) {
                ++n6;
                continue;
            }
            if (((abu)object).b() == abv.bz) {
                ++n7;
                continue;
            }
            if (((abu)object).b() == abv.G) {
                ++n7;
                continue;
            }
            if (((abu)object).b() == abv.bl) {
                ++n7;
                continue;
            }
            if (((abu)object).b() == abv.bL) {
                ++n7;
                continue;
            }
            return false;
        }
        n6 += n4 + n7;
        if (n3 > 3 || n2 > 1) {
            return false;
        }
        if (n3 >= 1 && n2 == 1 && n6 == 0) {
            this.a = new abu(abv.bP);
            if (n5 > 0) {
                dg dg2 = new dg();
                object = new dg();
                dp dp2 = new dp();
                for (int i3 = 0; i3 < yv2.a(); ++i3) {
                    abu abu2 = yv2.a(i3);
                    if (abu2 == null || abu2.b() != abv.bQ || !abu2.p() || !abu2.q().b("Explosion", 10)) continue;
                    dp2.a(abu2.q().m("Explosion"));
                }
                ((dg)object).a("Explosions", dp2);
                ((dg)object).a("Flight", (byte)n3);
                dg2.a("Fireworks", (du)object);
                this.a.d(dg2);
            }
            return true;
        }
        if (n3 == 1 && n2 == 0 && n5 == 0 && n4 > 0 && n7 <= 1) {
            this.a = new abu(abv.bQ);
            dg dg3 = new dg();
            object = new dg();
            int n8 = 0;
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i4 = 0; i4 < yv2.a(); ++i4) {
                abu abu3 = yv2.a(i4);
                if (abu3 == null) continue;
                if (abu3.b() == abv.aR) {
                    arrayList.add(aba.c[abu3.k()]);
                    continue;
                }
                if (abu3.b() == abv.aO) {
                    ((dg)object).a("Flicker", true);
                    continue;
                }
                if (abu3.b() == abv.i) {
                    ((dg)object).a("Trail", true);
                    continue;
                }
                if (abu3.b() == abv.bz) {
                    n8 = 1;
                    continue;
                }
                if (abu3.b() == abv.G) {
                    n8 = 4;
                    continue;
                }
                if (abu3.b() == abv.bl) {
                    n8 = 2;
                    continue;
                }
                if (abu3.b() != abv.bL) continue;
                n8 = 3;
            }
            int[] nArray = new int[arrayList.size()];
            for (int i5 = 0; i5 < nArray.length; ++i5) {
                nArray[i5] = (Integer)arrayList.get(i5);
            }
            ((dg)object).a("Colors", nArray);
            ((dg)object).a("Type", (byte)n8);
            dg3.a("Explosion", (du)object);
            this.a.d(dg3);
            return true;
        }
        if (n3 == 0 && n2 == 0 && n5 == 1 && n4 > 0 && n4 == n6) {
            dg dg4;
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i6 = 0; i6 < yv2.a(); ++i6) {
                abu abu4 = yv2.a(i6);
                if (abu4 == null) continue;
                if (abu4.b() == abv.aR) {
                    arrayList.add(aba.c[abu4.k()]);
                    continue;
                }
                if (abu4.b() != abv.bQ) continue;
                this.a = abu4.m();
                this.a.b = 1;
            }
            int[] nArray = new int[arrayList.size()];
            for (int i7 = 0; i7 < nArray.length; ++i7) {
                nArray[i7] = (Integer)arrayList.get(i7);
            }
            if (this.a != null && this.a.p()) {
                dg4 = this.a.q().m("Explosion");
                if (dg4 == null) {
                    return false;
                }
            } else {
                return false;
            }
            dg4.a("FadeColors", nArray);
            return true;
        }
        return false;
    }

    @Override
    public abu a(yv yv2) {
        return this.a.m();
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public abu b() {
        return this.a;
    }
}

