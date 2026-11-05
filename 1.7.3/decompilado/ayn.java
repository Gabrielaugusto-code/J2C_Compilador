/*
 * Decompiled with CFR 0.152.
 */
public class ayn {
    public ayo a;
    public int b;
    public int c;
    public int d;
    public int e;
    public ayp f;
    public qr g;

    public ayn(int n2, int n3, int n4, int n5, ayp ayp2) {
        this(n2, n3, n4, n5, ayp2, true);
    }

    public ayn(int n2, int n3, int n4, int n5, ayp ayp2, boolean bl2) {
        this.a = bl2 ? ayo.b : ayo.a;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = ayp2.b.a(ayp2.c, ayp2.d, ayp2.e);
    }

    public ayn(qr qr2) {
        this(qr2, qr2.o.V().a(qr2.s, qr2.t, qr2.u));
    }

    public ayn(qr qr2, ayp ayp2) {
        this.a = ayo.c;
        this.g = qr2;
        this.f = ayp2;
    }

    public String toString() {
        return "HitResult{type=" + (Object)((Object)this.a) + ", x=" + this.b + ", y=" + this.c + ", z=" + this.d + ", f=" + this.e + ", pos=" + this.f + ", entity=" + this.g + '}';
    }
}

