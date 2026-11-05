/*
 * Decompiled with CFR 0.152.
 */
public class aej
extends aek {
    protected aej(int n2, int n3) {
        super(n2, n3, ael.h);
        this.b("digging");
    }

    @Override
    public int a(int n2) {
        return 1 + 10 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int b() {
        return 5;
    }

    @Override
    public boolean a(abu abu2) {
        if (abu2.b() == abv.aZ) {
            return true;
        }
        return super.a(abu2);
    }
}

