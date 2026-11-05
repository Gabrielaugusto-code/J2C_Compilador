/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class agu
extends agl {
    private aqe aC = new aqv(aie.aU, 8);
    private are aD = new are(false);
    private int aE = 0;
    private int aF = 1;
    private int aG = 2;
    private int aH = this.aE;

    protected agu(int n2, boolean bl2) {
        super(n2);
        if (bl2) {
            this.ar.x = 3;
            this.aH = this.aF;
        }
    }

    @Override
    public apt a(Random random) {
        if (random.nextInt(3) > 0) {
            return this.aD;
        }
        return super.a(random);
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        super.a(afs2, random, n2, n3);
        int n7 = 3 + random.nextInt(6);
        for (n6 = 0; n6 < n7; ++n6) {
            int n8;
            n5 = n2 + random.nextInt(16);
            if (afs2.a(n5, n4 = random.nextInt(28) + 4, n8 = n3 + random.nextInt(16)) != aie.b) continue;
            afs2.d(n5, n4, n8, aie.bA, 0, 2);
        }
        for (n7 = 0; n7 < 7; ++n7) {
            n6 = n2 + random.nextInt(16);
            n5 = random.nextInt(64);
            n4 = n3 + random.nextInt(16);
            this.aC.a(afs2, random, n6, n5, n4);
        }
    }

    @Override
    public void a(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        this.ai = aie.c;
        this.aj = 0;
        this.ak = aie.d;
        if ((d2 < -1.0 || d2 > 2.0) && this.aH == this.aG) {
            this.ai = aie.n;
            this.ak = aie.n;
        } else if (d2 > 1.0 && this.aH != this.aF) {
            this.ai = aie.b;
            this.ak = aie.b;
        }
        this.b(afs2, random, ahzArray, byArray, n2, n3, d2);
    }

    private agu b(agl agl2) {
        this.aH = this.aG;
        this.a(agl2.ag, true);
        this.a(agl2.af + " M");
        this.a(new agm(agl2.am, agl2.an));
        this.a(agl2.ao, agl2.ap);
        return this;
    }

    @Override
    protected agl k() {
        return new agu(this.ay + 128, false).b(this);
    }
}

