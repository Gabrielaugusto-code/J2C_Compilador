/*
 * Decompiled with CFR 0.152.
 */
public class be
extends y {
    @Override
    public String c() {
        return "playsound";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.playsound.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new ch(this.c(ac2), new Object[0]);
        }
        int n2 = 0;
        String string = stringArray[n2++];
        mp mp2 = be.d(ac2, stringArray[n2++]);
        double d2 = mp2.f_().a;
        double d3 = mp2.f_().b;
        double d4 = mp2.f_().c;
        double d5 = 1.0;
        double d6 = 1.0;
        double d7 = 0.0;
        if (stringArray.length > n2) {
            d2 = be.a(ac2, d2, stringArray[n2++]);
        }
        if (stringArray.length > n2) {
            d3 = be.a(ac2, d3, stringArray[n2++], 0, 0);
        }
        if (stringArray.length > n2) {
            d4 = be.a(ac2, d4, stringArray[n2++]);
        }
        if (stringArray.length > n2) {
            d5 = be.a(ac2, stringArray[n2++], 0.0, 3.4028234663852886E38);
        }
        if (stringArray.length > n2) {
            d6 = be.a(ac2, stringArray[n2++], 0.0, 2.0);
        }
        if (stringArray.length > n2) {
            d7 = be.a(ac2, stringArray[n2++], 0.0, 1.0);
        }
        double d8 = d5 > 1.0 ? d5 * 16.0 : 16.0;
        double d9 = mp2.f(d2, d3, d4);
        if (d9 > d8) {
            if (!(d7 > 0.0)) throw new cc("commands.playsound.playerTooFar", mp2.b_());
            double d10 = d2 - mp2.s;
            double d11 = d3 - mp2.t;
            double d12 = d4 - mp2.u;
            double d13 = Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
            double d14 = mp2.s;
            double d15 = mp2.t;
            double d16 = mp2.u;
            if (d13 > 0.0) {
                d14 += d10 / d13 * 2.0;
                d15 += d11 / d13 * 2.0;
                d16 += d12 / d13 * 2.0;
            }
            mp2.a.a(new gt(string, d14, d15, d16, (float)d7, (float)d6));
        } else {
            mp2.a.a(new gt(string, d2, d3, d4, (float)d5, (float)d6));
        }
        be.a(ac2, "commands.playsound.success", string, mp2.b_());
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 1;
    }
}

