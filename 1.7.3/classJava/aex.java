/*
 * Decompiled with CFR 0.152.
 */
public class aex
extends aek {
    protected aex(int n2, int n3, ael ael2) {
        super(n2, n3, ael2);
        if (ael2 == ael.h) {
            this.b("lootBonusDigger");
        } else if (ael2 == ael.i) {
            this.b("lootBonusFishing");
        } else {
            this.b("lootBonus");
        }
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

    @Override
    public boolean a(aek aek2) {
        return super.a(aek2) && aek2.B != aex.s.B;
    }
}

