/*
 * Decompiled with CFR 0.152.
 */
public class abc
extends aaj {
    protected abc() {
        this.a(aak.f);
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        abu abu3 = new abu(abv.aY, 1, afs2.b("map"));
        String string = "map_" + abu3.k();
        awz awz2 = new awz(string);
        afs2.a(string, awz2);
        awz2.d = 0;
        int n2 = 128 * (1 << awz2.d);
        awz2.a = (int)(Math.round(xq2.s / (double)n2) * (long)n2);
        awz2.b = (int)(Math.round(xq2.u / (double)n2) * (long)n2);
        awz2.c = (byte)afs2.t.i;
        awz2.c();
        --abu2.b;
        if (abu2.b <= 0) {
            return abu3;
        }
        if (!xq2.bm.a(abu3.m())) {
            xq2.a(abu3, false);
        }
        return abu2;
    }
}

