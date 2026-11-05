/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahn
extends agl {
    private static final aqw aC = new aqw();
    private static final are aD = new are(false);
    private static final aqr aE = new aqr(false, false);
    private static final aqr aF = new aqr(false, true);
    private static final apw aG = new apw(aie.Y, 0);
    private int aH;

    public ahn(int n2, int n3) {
        super(n2);
        this.aH = n3;
        this.at.add(new ago(vm.class, 8, 4, 4));
        this.ar.x = 10;
        if (n3 == 1 || n3 == 2) {
            this.ar.z = 7;
            this.ar.A = 1;
            this.ar.B = 3;
        } else {
            this.ar.z = 1;
            this.ar.B = 1;
        }
    }

    @Override
    public apt a(Random random) {
        if ((this.aH == 1 || this.aH == 2) && random.nextInt(3) == 0) {
            if (this.aH == 2 || random.nextInt(13) == 0) {
                return aF;
            }
            return aE;
        }
        if (random.nextInt(3) == 0) {
            return aC;
        }
        return aD;
    }

    @Override
    public aqe b(Random random) {
        if (random.nextInt(5) > 0) {
            return new arg(aie.H, 2);
        }
        return new arg(aie.H, 1);
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.aH == 1 || this.aH == 2) {
            n7 = random.nextInt(3);
            for (n6 = 0; n6 < n7; ++n6) {
                n5 = n2 + random.nextInt(16) + 8;
                n4 = n3 + random.nextInt(16) + 8;
                int n8 = afs2.f(n5, n4);
                aG.a(afs2, random, n5, n8, n4);
            }
        }
        ae.a(3);
        for (n7 = 0; n7 < 7; ++n7) {
            n6 = n2 + random.nextInt(16) + 8;
            n5 = n3 + random.nextInt(16) + 8;
            n4 = random.nextInt(afs2.f(n6, n5) + 32);
            ae.a(afs2, random, n6, n4, n5);
        }
        super.a(afs2, random, n2, n3);
    }

    @Override
    public void a(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        if (this.aH == 1 || this.aH == 2) {
            this.ai = aie.c;
            this.aj = 0;
            this.ak = aie.d;
            if (d2 > 1.75) {
                this.ai = aie.d;
                this.aj = 1;
            } else if (d2 > -0.95) {
                this.ai = aie.d;
                this.aj = 2;
            }
        }
        this.b(afs2, random, ahzArray, byArray, n2, n3, d2);
    }

    @Override
    protected agl k() {
        if (this.ay == agl.U.ay) {
            return new ahn(this.ay + 128, 2).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25f, 0.8f).a(new agm(this.am, this.an));
        }
        return super.k();
    }
}

