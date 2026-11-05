/*
 * Decompiled with CFR 0.152.
 */
public class bkq
extends blg {
    private qr a;
    private int aB;
    private int aC;
    private String aD;

    public bkq(afs afs2, qr qr2) {
        this(afs2, qr2, "crit");
    }

    public bkq(afs afs2, qr qr2, String string) {
        super(afs2, qr2.s, qr2.C.b + (double)(qr2.N / 2.0f), qr2.u, qr2.v, qr2.w, qr2.x);
        this.a = qr2;
        this.aC = 3;
        this.aD = string;
        this.h();
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void h() {
        for (int i2 = 0; i2 < 16; ++i2) {
            double d2;
            double d3;
            double d4 = this.Z.nextFloat() * 2.0f - 1.0f;
            if (d4 * d4 + (d3 = (double)(this.Z.nextFloat() * 2.0f - 1.0f)) * d3 + (d2 = (double)(this.Z.nextFloat() * 2.0f - 1.0f)) * d2 > 1.0) continue;
            double d5 = this.a.s + d4 * (double)this.a.M / 4.0;
            double d6 = this.a.C.b + (double)(this.a.N / 2.0f) + d3 * (double)this.a.N / 4.0;
            double d7 = this.a.u + d2 * (double)this.a.M / 4.0;
            this.o.a(this.aD, d5, d6, d7, d4, d3 + 0.2, d2);
        }
        ++this.aB;
        if (this.aB >= this.aC) {
            this.A();
        }
    }

    @Override
    public int a() {
        return 3;
    }
}

