/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahb
extends agl {
    private boolean aC;

    public ahb(int n2, boolean bl2) {
        super(n2);
        this.aC = bl2;
        this.ar.x = bl2 ? 2 : 50;
        this.ar.z = 25;
        this.ar.y = 4;
        if (!bl2) {
            this.as.add(new ago(ve.class, 2, 1, 1));
        }
        this.at.add(new ago(ux.class, 10, 4, 4));
    }

    @Override
    public apt a(Random random) {
        if (random.nextInt(10) == 0) {
            return this.aA;
        }
        if (random.nextInt(2) == 0) {
            return new aqg(3, 0);
        }
        if (!this.aC && random.nextInt(3) == 0) {
            return new aqq(false, 10, 20, 3, 3);
        }
        return new arh(false, 4 + random.nextInt(7), 3, 3, true);
    }

    @Override
    public aqe b(Random random) {
        if (random.nextInt(4) == 0) {
            return new arg(aie.H, 2);
        }
        return new arg(aie.H, 1);
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        super.a(afs2, random, n2, n3);
        int n4 = n2 + random.nextInt(16) + 8;
        int n5 = n3 + random.nextInt(16) + 8;
        int n6 = random.nextInt(afs2.f(n4, n5) * 2);
        new aqt().a(afs2, random, n4, n6, n5);
        ari ari2 = new ari();
        for (n5 = 0; n5 < 50; ++n5) {
            n6 = n2 + random.nextInt(16) + 8;
            int n7 = 128;
            int n8 = n3 + random.nextInt(16) + 8;
            ari2.a(afs2, random, n6, n7, n8);
        }
    }
}

