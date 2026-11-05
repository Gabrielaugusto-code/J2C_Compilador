/*
 * Decompiled with CFR 0.152.
 */
public class bnq
implements bno {
    private bnr a = bnp.a();
    private double b;
    private double c;
    private double d;

    @Override
    public void a(double d2, double d3, double d4) {
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public boolean b(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.a.b(d2 - this.b, d3 - this.c, d4 - this.d, d5 - this.b, d6 - this.c, d7 - this.d);
    }

    @Override
    public boolean a(ayk ayk2) {
        return this.b(ayk2.a, ayk2.b, ayk2.c, ayk2.d, ayk2.e, ayk2.f);
    }
}

