/*
 * Decompiled with CFR 0.152.
 */
public class bjd {
    public ayp a;
    public float b;
    public float c;

    public bjd(float f2, float f3, float f4, float f5, float f6) {
        this(ayp.a(f2, f3, f4), f5, f6);
    }

    public bjd a(float f2, float f3) {
        return new bjd(this, f2, f3);
    }

    public bjd(bjd bjd2, float f2, float f3) {
        this.a = bjd2.a;
        this.b = f2;
        this.c = f3;
    }

    public bjd(ayp ayp2, float f2, float f3) {
        this.a = ayp2;
        this.b = f2;
        this.c = f3;
    }
}

