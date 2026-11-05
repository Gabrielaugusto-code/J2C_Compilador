/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aku
extends ahz {
    private pw a;
    private pw b;

    protected aku() {
        super(avk.b);
        this.a(true);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.a;
        }
        if (n2 == 0) {
            return aie.d.h(n2);
        }
        return this.L;
    }

    @Override
    public pw e(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            return this.a;
        }
        if (n5 == 0) {
            return aie.d.h(n5);
        }
        avk avk2 = agc2.a(n2, n3 + 1, n4).o();
        if (avk2 == avk.y || avk2 == avk.z) {
            return this.b;
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.a = px2.a(this.N() + "_top");
        this.b = px2.a("grass_side_snowed");
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.E) {
            return;
        }
        if (afs2.k(n2, n3 + 1, n4) < 4 && afs2.a(n2, n3 + 1, n4).k() > 2) {
            afs2.b(n2, n3, n4, aie.d);
        } else if (afs2.k(n2, n3 + 1, n4) >= 9) {
            for (int i2 = 0; i2 < 4; ++i2) {
                int n5 = n2 + random.nextInt(3) - 1;
                int n6 = n3 + random.nextInt(5) - 3;
                int n7 = n4 + random.nextInt(3) - 1;
                ahz ahz2 = afs2.a(n5, n6 + 1, n7);
                if (afs2.a(n5, n6, n7) != aie.d || afs2.e(n5, n6, n7) != 0 || afs2.k(n5, n6 + 1, n7) < 4 || ahz2.k() > 2) continue;
                afs2.b(n5, n6, n7, this);
            }
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        super.b(afs2, n2, n3, n4, random);
        if (random.nextInt(10) == 0) {
            afs2.a("townaura", (double)((float)n2 + random.nextFloat()), (double)((float)n3 + 1.1f), (double)((float)n4 + random.nextFloat()), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return aie.d.a(0, random, n3);
    }
}

