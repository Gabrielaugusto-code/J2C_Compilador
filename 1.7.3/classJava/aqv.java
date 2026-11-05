/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aqv
extends aqe {
    private ahz a;
    private int b;
    private ahz c;

    public aqv(ahz ahz2, int n2) {
        this(ahz2, n2, aie.b);
    }

    public aqv(ahz ahz2, int n2, ahz ahz3) {
        this.a = ahz2;
        this.b = n2;
        this.c = ahz3;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        float f2 = random.nextFloat() * (float)Math.PI;
        double d2 = (float)(n2 + 8) + oy.a(f2) * (float)this.b / 8.0f;
        double d3 = (float)(n2 + 8) - oy.a(f2) * (float)this.b / 8.0f;
        double d4 = (float)(n4 + 8) + oy.b(f2) * (float)this.b / 8.0f;
        double d5 = (float)(n4 + 8) - oy.b(f2) * (float)this.b / 8.0f;
        double d6 = n3 + random.nextInt(3) - 2;
        double d7 = n3 + random.nextInt(3) - 2;
        for (int i2 = 0; i2 <= this.b; ++i2) {
            double d8 = d2 + (d3 - d2) * (double)i2 / (double)this.b;
            double d9 = d6 + (d7 - d6) * (double)i2 / (double)this.b;
            double d10 = d4 + (d5 - d4) * (double)i2 / (double)this.b;
            double d11 = random.nextDouble() * (double)this.b / 16.0;
            double d12 = (double)(oy.a((float)i2 * (float)Math.PI / (float)this.b) + 1.0f) * d11 + 1.0;
            double d13 = (double)(oy.a((float)i2 * (float)Math.PI / (float)this.b) + 1.0f) * d11 + 1.0;
            int n5 = oy.c(d8 - d12 / 2.0);
            int n6 = oy.c(d9 - d13 / 2.0);
            int n7 = oy.c(d10 - d12 / 2.0);
            int n8 = oy.c(d8 + d12 / 2.0);
            int n9 = oy.c(d9 + d13 / 2.0);
            int n10 = oy.c(d10 + d12 / 2.0);
            for (int i3 = n5; i3 <= n8; ++i3) {
                double d14 = ((double)i3 + 0.5 - d8) / (d12 / 2.0);
                if (!(d14 * d14 < 1.0)) continue;
                for (int i4 = n6; i4 <= n9; ++i4) {
                    double d15 = ((double)i4 + 0.5 - d9) / (d13 / 2.0);
                    if (!(d14 * d14 + d15 * d15 < 1.0)) continue;
                    for (int i5 = n7; i5 <= n10; ++i5) {
                        double d16 = ((double)i5 + 0.5 - d10) / (d12 / 2.0);
                        if (!(d14 * d14 + d15 * d15 + d16 * d16 < 1.0) || afs2.a(i3, i4, i5) != this.c) continue;
                        afs2.d(i3, i4, i5, this.a, 0, 2);
                    }
                }
            }
        }
        return true;
    }
}

