/*
 * Decompiled with CFR 0.152.
 */
public class anw
extends ani {
    private abs a;
    private int i;

    public anw() {
    }

    public anw(abs abs2, int n2) {
        this.a = abs2;
        this.i = n2;
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Item", abs.b(this.a));
        dg2.a("Data", this.i);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.a = abs.d(dg2.f("Item"));
        this.i = dg2.f("Data");
    }

    @Override
    public fk m() {
        dg dg2 = new dg();
        this.b(dg2);
        return new fw(this.c, this.d, this.e, 5, dg2);
    }

    public void a(abs abs2, int n2) {
        this.a = abs2;
        this.i = n2;
    }

    public abs a() {
        return this.a;
    }

    public int b() {
        return this.i;
    }
}

