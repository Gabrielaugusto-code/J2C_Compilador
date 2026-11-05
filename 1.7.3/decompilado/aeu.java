/*
 * Decompiled with CFR 0.152.
 */
public class aeu
extends aek {
    protected aeu(int n2, int n3) {
        super(n2, n3, ael.g);
        this.b("fire");
    }

    @Override
    public int a(int n2) {
        return 10 + 20 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int b() {
        return 2;
    }
}

