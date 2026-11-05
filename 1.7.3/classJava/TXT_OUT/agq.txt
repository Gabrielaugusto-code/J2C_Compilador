/*
 * Decompiled with CFR 0.152.
 */
public class agq {
    public float[] a = new float[256];
    public agl[] b = new agl[256];
    public int c;
    public int d;
    public long e;
    final /* synthetic */ agp f;

    public agq(agp agp2, int n2, int n3) {
        this.f = agp2;
        this.c = n2;
        this.d = n3;
        agp.a(agp2).a(this.a, n2 << 4, n3 << 4, 16, 16);
        agp.a(agp2).a(this.b, n2 << 4, n3 << 4, 16, 16, false);
    }

    public agl a(int n2, int n3) {
        return this.b[n2 & 0xF | (n3 & 0xF) << 4];
    }
}

