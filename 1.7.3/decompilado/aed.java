/*
 * Decompiled with CFR 0.152.
 */
public class aed
extends aek {
    public aed(int n2, int n3) {
        super(n2, n3, ael.k);
        this.b("arrowDamage");
    }

    @Override
    public int a(int n2) {
        return 1 + (n2 - 1) * 10;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public int b() {
        return 5;
    }
}

