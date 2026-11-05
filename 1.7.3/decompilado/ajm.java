/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajm
extends aht {
    protected ajm() {
        super(avk.e);
        this.a(aak.c);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int b() {
        return 22;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abs.a(aie.Z);
    }

    @Override
    public int a(Random random) {
        return 8;
    }

    @Override
    protected boolean E() {
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = 0;
        int n6 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3;
        if (n6 == 0) {
            n5 = 2;
        }
        if (n6 == 1) {
            n5 = 5;
        }
        if (n6 == 2) {
            n5 = 3;
        }
        if (n6 == 3) {
            n5 = 4;
        }
        afs2.a(n2, n3, n4, n5, 2);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        zm zm2 = xq2.bR();
        anv anv2 = (anv)afs2.o(n2, n3, n4);
        if (zm2 == null || anv2 == null) {
            return true;
        }
        if (afs2.a(n2, n3 + 1, n4).r()) {
            return true;
        }
        if (afs2.E) {
            return true;
        }
        zm2.a(anv2);
        xq2.a(zm2);
        return true;
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anv();
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        for (int i2 = 0; i2 < 3; ++i2) {
            double d2 = (float)n2 + random.nextFloat();
            double d3 = (float)n3 + random.nextFloat();
            double d4 = (float)n4 + random.nextFloat();
            double d5 = 0.0;
            double d6 = 0.0;
            double d7 = 0.0;
            int n5 = random.nextInt(2) * 2 - 1;
            int n6 = random.nextInt(2) * 2 - 1;
            d5 = ((double)random.nextFloat() - 0.5) * 0.125;
            d6 = ((double)random.nextFloat() - 0.5) * 0.125;
            d7 = ((double)random.nextFloat() - 0.5) * 0.125;
            d4 = (double)n4 + 0.5 + 0.25 * (double)n6;
            d7 = random.nextFloat() * 1.0f * (float)n6;
            d2 = (double)n2 + 0.5 + 0.25 * (double)n5;
            d5 = random.nextFloat() * 1.0f * (float)n5;
            afs2.a("portal", d2, d3, d4, d5, d6, d7);
        }
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("obsidian");
    }
}

