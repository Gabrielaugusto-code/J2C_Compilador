/*
 * Decompiled with CFR 0.152.
 */
public class btv {
    private final brq a;
    private final boolean b;
    private double c;
    private double d;

    public btv(brq brq2, double d2, double d3, boolean bl2) {
        this.a = brq2;
        this.c = d2;
        this.d = d3;
        this.b = bl2;
    }

    public btv(btv btv2) {
        this.a = btv2.a;
        this.c = btv2.c;
        this.d = btv2.d;
        this.b = btv2.b;
    }

    public brq a() {
        return this.a;
    }

    public double b() {
        return this.c;
    }

    public void a(double d2) {
        this.c = d2;
    }

    public double c() {
        return this.d;
    }

    public void b(double d2) {
        this.d = d2;
    }

    public boolean d() {
        return this.b;
    }
}

