/*
 * Decompiled with CFR 0.152.
 */
public class aev
extends aek {
    protected aev(int n2, int n3, ael ael2) {
        super(n2, n3, ael2);
        this.b("fishingSpeed");
    }

    @Override
    public int a(int n2) {
        return 15 + (n2 - 1) * 9;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int b() {
        return 3;
    }
}

