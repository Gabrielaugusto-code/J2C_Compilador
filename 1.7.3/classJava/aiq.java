/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aiq
extends ajb
implements aif {
    private pw[] a;

    public aiq() {
        super(avk.k);
        this.a(true);
    }

    @Override
    public pw a(int n2, int n3) {
        return this.a[2];
    }

    public pw b(int n2) {
        if (n2 < 0 || n2 >= this.a.length) {
            n2 = this.a.length - 1;
        }
        return this.a[n2];
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        int n5;
        int n6;
        if (!this.j(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.d(n2, n3, n4, aiq.e(0), 0, 2);
        } else if (afs2.s.nextInt(5) == 0 && (n6 = aiq.c(n5 = afs2.e(n2, n3, n4))) < 2) {
            afs2.a(n2, n3, n4, ++n6 << 2 | aiq.l(n5), 2);
        }
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        int n5;
        ahz ahz2;
        return (ahz2 = afs2.a(n2 += p.a[n5 = aiq.l(afs2.e(n2, n3, n4))], n3, n4 += p.b[n5])) == aie.r && ako.c(afs2.e(n2, n3, n4)) == 3;
    }

    @Override
    public int b() {
        return 28;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        return super.a(afs2, n2, n3, n4);
    }

    @Override
    public ayk g(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        return super.g(afs2, n2, n3, n4);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        int n6 = aiq.l(n5);
        int n7 = aiq.c(n5);
        int n8 = 4 + n7 * 2;
        int n9 = 5 + n7 * 2;
        float f2 = (float)n8 / 2.0f;
        switch (n6) {
            case 0: {
                this.a((8.0f - f2) / 16.0f, (12.0f - (float)n9) / 16.0f, (15.0f - (float)n8) / 16.0f, (8.0f + f2) / 16.0f, 0.75f, 0.9375f);
                break;
            }
            case 2: {
                this.a((8.0f - f2) / 16.0f, (12.0f - (float)n9) / 16.0f, 0.0625f, (8.0f + f2) / 16.0f, 0.75f, (1.0f + (float)n8) / 16.0f);
                break;
            }
            case 1: {
                this.a(0.0625f, (12.0f - (float)n9) / 16.0f, (8.0f - f2) / 16.0f, (1.0f + (float)n8) / 16.0f, 0.75f, (8.0f + f2) / 16.0f);
                break;
            }
            case 3: {
                this.a((15.0f - (float)n8) / 16.0f, (12.0f - (float)n9) / 16.0f, (8.0f - f2) / 16.0f, 0.9375f, 0.75f, (8.0f + f2) / 16.0f);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = ((oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3) + 0) % 4;
        afs2.a(n2, n3, n4, n5, 2);
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        if (n5 == 1 || n5 == 0) {
            n5 = 2;
        }
        return p.f[p.e[n5]];
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!this.j(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.d(n2, n3, n4, aiq.e(0), 0, 2);
        }
    }

    public static int c(int n2) {
        return (n2 & 0xC) >> 2;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        int n7 = aiq.c(n5);
        int n8 = 1;
        if (n7 >= 2) {
            n8 = 3;
        }
        for (int i2 = 0; i2 < n8; ++i2) {
            this.a(afs2, n2, n3, n4, new abu(abv.aR, 1, 3));
        }
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.aR;
    }

    @Override
    public int k(afs afs2, int n2, int n3, int n4) {
        return 3;
    }

    @Override
    public void a(px px2) {
        this.a = new pw[3];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = px2.a(this.N() + "_stage_" + i2);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        int n5 = afs2.e(n2, n3, n4);
        int n6 = aiq.c(n5);
        return n6 < 2;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        int n5 = afs2.e(n2, n3, n4);
        int n6 = ajb.l(n5);
        int n7 = aiq.c(n5);
        afs2.a(n2, n3, n4, ++n7 << 2 | n6, 2);
    }
}

