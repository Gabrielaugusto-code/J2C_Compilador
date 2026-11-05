/*
 * Decompiled with CFR 0.152.
 */
public class afb
extends aek {
    protected afb(int n2, int n3) {
        super(n2, n3, ael.h);
        this.b("untouching");
    }

    @Override
    public int a(int n2) {
        return 15;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public boolean a(aek aek2) {
        return super.a(aek2) && aek2.B != afb.u.B;
    }

    @Override
    public boolean a(abu abu2) {
        if (abu2.b() == abv.aZ) {
            return true;
        }
        return super.a(abu2);
    }
}

