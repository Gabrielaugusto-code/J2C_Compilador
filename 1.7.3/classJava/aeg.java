/*
 * Decompiled with CFR 0.152.
 */
public class aeg
extends aek {
    public aeg(int n2, int n3) {
        super(n2, n3, ael.k);
        this.b("arrowKnockback");
    }

    @Override
    public int a(int n2) {
        return 12 + (n2 - 1) * 20;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 25;
    }

    @Override
    public int b() {
        return 2;
    }
}

