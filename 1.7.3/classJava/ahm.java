/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahm
extends agl {
    protected ahm(int n2) {
        super(n2);
        this.ar.x = 2;
        this.ar.y = 1;
        this.ar.A = 1;
        this.ar.B = 8;
        this.ar.C = 10;
        this.ar.G = 1;
        this.ar.w = 4;
        this.ar.F = 0;
        this.ar.E = 0;
        this.ar.z = 5;
        this.aq = 14745518;
        this.as.add(new ago(xd.class, 1, 1, 1));
    }

    @Override
    public apt a(Random random) {
        return this.aB;
    }

    @Override
    public int b(int n2, int n3, int n4) {
        double d2 = ad.a((double)n2 * 0.0225, (double)n4 * 0.0225);
        if (d2 < -0.1) {
            return 5011004;
        }
        return 6975545;
    }

    @Override
    public int c(int n2, int n3, int n4) {
        return 6975545;
    }

    @Override
    public String a(Random random, int n2, int n3, int n4) {
        return ajt.a[1];
    }

    @Override
    public void a(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        double d3 = ad.a((double)n2 * 0.25, (double)n3 * 0.25);
        if (d3 > 0.0) {
            int n4 = n2 & 0xF;
            int n5 = n3 & 0xF;
            int n6 = ahzArray.length / 256;
            for (int i2 = 255; i2 >= 0; --i2) {
                int n7 = (n5 * 16 + n4) * n6 + i2;
                if (ahzArray[n7] != null && ahzArray[n7].o() == avk.a) continue;
                if (i2 != 62 || ahzArray[n7] == aie.j) break;
                ahzArray[n7] = aie.j;
                if (!(d3 < 0.12)) break;
                ahzArray[n7 + 1] = aie.bi;
                break;
            }
        }
        this.b(afs2, random, ahzArray, byArray, n2, n3, d2);
    }
}

