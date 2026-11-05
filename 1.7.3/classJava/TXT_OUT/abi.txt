/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class abi
extends abs {
    private pw a;

    @Override
    public pw a(int n2, int n3) {
        if (n3 > 0) {
            return this.a;
        }
        return super.a(n2, n3);
    }

    @Override
    public int a(abu abu2, int n2) {
        if (n2 == 1) {
            du du2 = abi.a(abu2, "Colors");
            if (du2 != null && du2 instanceof dm) {
                dm dm2 = (dm)du2;
                int[] nArray = dm2.c();
                if (nArray.length == 1) {
                    return nArray[0];
                }
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                for (int n6 : nArray) {
                    n3 += (n6 & 0xFF0000) >> 16;
                    n4 += (n6 & 0xFF00) >> 8;
                    n5 += (n6 & 0xFF) >> 0;
                }
                return (n3 /= nArray.length) << 16 | (n4 /= nArray.length) << 8 | (n5 /= nArray.length);
            }
            return 0x8A8A8A;
        }
        return super.a(abu2, n2);
    }

    @Override
    public boolean b() {
        return true;
    }

    public static du a(abu abu2, String string) {
        dg dg2;
        if (abu2.p() && (dg2 = abu2.q().m("Explosion")) != null) {
            return dg2.a(string);
        }
        return null;
    }

    @Override
    public void a(abu abu2, xq xq2, List list, boolean bl2) {
        dg dg2;
        if (abu2.p() && (dg2 = abu2.q().m("Explosion")) != null) {
            abi.a(dg2, list);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(dg dg2, List list) {
        boolean bl2;
        boolean bl3;
        int[] nArray;
        int n2;
        byte by2 = dg2.d("Type");
        if (by2 >= 0 && by2 <= 4) {
            list.add(dc.a("item.fireworksCharge.type." + by2).trim());
        } else {
            list.add(dc.a("item.fireworksCharge.type").trim());
        }
        int[] nArray2 = dg2.l("Colors");
        if (nArray2.length > 0) {
            boolean bl4 = true;
            String string = "";
            for (int n3 : nArray2) {
                if (!bl4) {
                    string = string + ", ";
                }
                bl4 = false;
                int n4 = 0;
                for (n2 = 0; n2 < 16; ++n2) {
                    if (n3 != aba.c[n2]) continue;
                    n4 = 1;
                    string = string + dc.a("item.fireworksCharge." + aba.a[n2]);
                    break;
                }
                if (n4 != 0) continue;
                string = string + dc.a("item.fireworksCharge.customColor");
            }
            list.add(string);
        }
        if ((nArray = dg2.l("FadeColors")).length > 0) {
            void var6_11;
            boolean bl5 = true;
            String bl22 = dc.a("item.fireworksCharge.fadeTo") + " ";
            for (int n4 : nArray) {
                if (!bl5) {
                    String string = (String)var6_11 + ", ";
                }
                bl5 = false;
                n2 = 0;
                for (int i2 = 0; i2 < 16; ++i2) {
                    if (n4 != aba.c[i2]) continue;
                    n2 = 1;
                    String string = (String)var6_11 + dc.a("item.fireworksCharge." + aba.a[i2]);
                    break;
                }
                if (n2 != 0) continue;
                String string = (String)var6_11 + dc.a("item.fireworksCharge.customColor");
            }
            list.add(var6_11);
        }
        if (bl3 = dg2.n("Trail")) {
            list.add(dc.a("item.fireworksCharge.trail"));
        }
        if (bl2 = dg2.n("Flicker")) {
            list.add(dc.a("item.fireworksCharge.flicker"));
        }
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        this.a = px2.a(this.w() + "_overlay");
    }
}

