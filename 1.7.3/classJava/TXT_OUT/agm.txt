/*
 * Decompiled with CFR 0.152.
 */
public class agm {
    public float a;
    public float b;

    public agm(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public agm a() {
        return new agm(this.a * 0.8f, this.b * 0.6f);
    }
}

