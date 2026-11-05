/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ajy
extends ahz
implements aif {
    private static final Logger a = LogManager.getLogger();
    private pw b;
    private pw M;
    private pw N;

    protected ajy() {
        super(avk.b);
        this.a(true);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.b;
        }
        if (n2 == 0) {
            return aie.d.h(n2);
        }
        return this.L;
    }

    @Override
    public pw e(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            return this.b;
        }
        if (n5 == 0) {
            return aie.d.h(n5);
        }
        avk avk2 = agc2.a(n2, n3 + 1, n4).o();
        if (avk2 == avk.y || avk2 == avk.z) {
            return this.M;
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.b = px2.a(this.N() + "_top");
        this.M = px2.a(this.N() + "_side_snowed");
        this.N = px2.a(this.N() + "_side_overlay");
    }

    @Override
    public int D() {
        double d2 = 0.5;
        double d3 = 1.0;
        return afr.a(d2, d3);
    }

    @Override
    public int i(int n2) {
        return this.D();
    }

    @Override
    public int d(agc agc2, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                int n8 = agc2.a(n2 + i3, n4 + i2).b(n2 + i3, n3, n4 + i2);
                n5 += (n8 & 0xFF0000) >> 16;
                n6 += (n8 & 0xFF00) >> 8;
                n7 += n8 & 0xFF;
            }
        }
        return (n5 / 9 & 0xFF) << 16 | (n6 / 9 & 0xFF) << 8 | n7 / 9 & 0xFF;
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
                afs2.b(n5, n6, n7, aie.c);
            }
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return aie.d.a(0, random, n3);
    }

    public static pw e() {
        return aie.c.N;
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        block0: for (int i2 = 0; i2 < 128; ++i2) {
            int n5 = n2;
            int n6 = n3 + 1;
            int n7 = n4;
            for (int i3 = 0; i3 < i2 / 16; ++i3) {
                if (afs2.a(n5 += random.nextInt(3) - 1, (n6 += (random.nextInt(3) - 1) * random.nextInt(3) / 2) - 1, n7 += random.nextInt(3) - 1) != aie.c || afs2.a(n5, n6, n7).r()) continue block0;
            }
            if (afs2.a((int)n5, (int)n6, (int)n7).J != avk.a) continue;
            if (random.nextInt(8) != 0) {
                if (!aie.H.j(afs2, n5, n6, n7)) continue;
                afs2.d(n5, n6, n7, aie.H, 1, 3);
                continue;
            }
            String string = afs2.a(n5, n7).a(random, n5, n6, n7);
            a.debug("Flower in " + afs2.a((int)n5, (int)n7).af + ": " + string);
            ajt ajt2 = ajt.e(string);
            if (ajt2 == null || !ajt2.j(afs2, n5, n6, n7)) continue;
            int n8 = ajt.f(string);
            afs2.d(n5, n6, n7, ajt2, n8, 3);
        }
    }
}

