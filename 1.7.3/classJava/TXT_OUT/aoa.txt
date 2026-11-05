/*
 * Decompiled with CFR 0.152.
 */
public class aoa
extends ani {
    private final afh a = new aob(this);

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.a.a(dg2);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        this.a.b(dg2);
    }

    @Override
    public void h() {
        this.a.g();
        super.h();
    }

    @Override
    public fk m() {
        dg dg2 = new dg();
        this.b(dg2);
        dg2.o("SpawnPotentials");
        return new fw(this.c, this.d, this.e, 1, dg2);
    }

    @Override
    public boolean c(int n2, int n3) {
        if (this.a.b(n2)) {
            return true;
        }
        return super.c(n2, n3);
    }

    public afh a() {
        return this.a;
    }
}

