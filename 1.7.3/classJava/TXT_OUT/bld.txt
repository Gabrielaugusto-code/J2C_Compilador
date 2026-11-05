/*
 * Decompiled with CFR 0.152.
 */
public class bld
extends blg {
    private int a;
    private int aB = 8;

    public bld(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void h() {
        for (int i2 = 0; i2 < 6; ++i2) {
            double d2 = this.s + (this.Z.nextDouble() - this.Z.nextDouble()) * 4.0;
            double d3 = this.t + (this.Z.nextDouble() - this.Z.nextDouble()) * 4.0;
            double d4 = this.u + (this.Z.nextDouble() - this.Z.nextDouble()) * 4.0;
            this.o.a("largeexplode", d2, d3, d4, (double)((float)this.a / (float)this.aB), 0.0, 0.0);
        }
        ++this.a;
        if (this.a == this.aB) {
            this.A();
        }
    }

    @Override
    public int a() {
        return 1;
    }
}

