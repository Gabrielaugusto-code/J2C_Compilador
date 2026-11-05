/*
 * Decompiled with CFR 0.152.
 */
public class anq
extends ani {
    private int a;

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("OutputSignal", this.a);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.a = dg2.f("OutputSignal");
    }

    public int a() {
        return this.a;
    }

    public void a(int n2) {
        this.a = n2;
    }
}

