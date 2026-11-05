/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahg
extends agl {
    protected boolean aC;

    protected ahg(int n2) {
        super(n2);
        this.a(0.8f, 0.4f);
        this.a(e);
        this.at.add(new ago(uz.class, 5, 2, 6));
        this.ar.x = -999;
        this.ar.y = 4;
        this.ar.z = 10;
    }

    @Override
    public String a(Random random, int n2, int n3, int n4) {
        double d2 = ad.a((double)n2 / 200.0, (double)n4 / 200.0);
        if (d2 < -0.8) {
            int n5 = random.nextInt(4);
            return ajt.a[4 + n5];
        }
        if (random.nextInt(3) > 0) {
            int n6 = random.nextInt(3);
            if (n6 == 0) {
                return ajt.a[0];
            }
            if (n6 == 1) {
                return ajt.a[3];
            }
            return ajt.a[8];
        }
        return ajt.b[0];
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        double d2 = ad.a((double)(n2 + 8) / 200.0, (double)(n3 + 8) / 200.0);
        if (d2 < -0.8) {
            this.ar.y = 15;
            this.ar.z = 5;
        } else {
            this.ar.y = 4;
            this.ar.z = 10;
            ae.a(2);
            for (n7 = 0; n7 < 7; ++n7) {
                n6 = n2 + random.nextInt(16) + 8;
                n5 = n3 + random.nextInt(16) + 8;
                n4 = random.nextInt(afs2.f(n6, n5) + 32);
                ae.a(afs2, random, n6, n4, n5);
            }
        }
        if (this.aC) {
            ae.a(0);
            for (n7 = 0; n7 < 10; ++n7) {
                n6 = n2 + random.nextInt(16) + 8;
                n5 = n3 + random.nextInt(16) + 8;
                n4 = random.nextInt(afs2.f(n6, n5) + 32);
                ae.a(afs2, random, n6, n4, n5);
            }
        }
        super.a(afs2, random, n2, n3);
    }

    @Override
    protected agl k() {
        ahg ahg2 = new ahg(this.ay + 128);
        ahg2.a("Sunflower Plains");
        ahg2.aC = true;
        ahg2.b(9286496);
        ahg2.ah = 14273354;
        return ahg2;
    }
}

